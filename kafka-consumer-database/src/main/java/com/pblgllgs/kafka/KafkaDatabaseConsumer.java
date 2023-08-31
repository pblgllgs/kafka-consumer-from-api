package com.pblgllgs.kafka;

import com.pblgllgs.kafka.entity.WikimediaData;
import com.pblgllgs.kafka.repository.WikimediaRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class KafkaDatabaseConsumer {

    private final WikimediaRepository wikimediaRepository;


    @KafkaListener(groupId = "myGroup", topics = "wikimedia_recentchange")
    public void consume(String eventMessage){
        WikimediaData wikimediaData = new WikimediaData();
        wikimediaData.setWikiEventData(eventMessage);
        wikimediaRepository.save(wikimediaData);
        log.info(String.format("Event message received -> %s",eventMessage));
    }
}
