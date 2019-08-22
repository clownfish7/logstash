package com.clownfish.logstash;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootApplication
@Slf4j
public class LogstashApplication {

    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(LogstashApplication.class, args);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        while (true) {
            Thread.sleep(2000);
            log.debug("this is a debug log!");
            log.info("this is a info log!");
            log.warn("this is a warn log!");
            log.error("this is a error log!");
            log.error("现在是： {}",format.format(new Date()));
            log.info("GPS原始数据: {\"Version\":\"2.0\",\"Sequence\":\"479649068\",\"CommandType\":\"REQUEST\",\"Command\":\"GPS\",\"Params\":{\"ServiceID\":\"1565827423476292285\",\"DeviceID\":\"C00001417\",\"Time\":\"2019-08-15 11:27:43\",\"DivisionEW\":\"E\",\"Longitude\":\"42987329\",\"DivisionNS\":\"N\",\"Latitude\":\"10624956\",\"Direction\":\"0\",\"Speed\":\"0\",\"Satellites\":\"15\",\"Precision\":\"10\",\"Height\":\"4820\",\"RetransFlag\":\"0\",\"NeedsResponse\":\"1\",\"TimeZone\":\"+08:00\",\"Remark\":\"test/debug\"}}");
            log.info("发至TEST: {\"cmd\":\"GPS\",\"b\":\"C00000092\",\"c\":\"20190815114556\",\"e\":\"20190815114554\",\"gps\":{\"a\":119.2869444,\"b\":29.5480556,\"c\":14.0,\"d\":0,\"e\":298,\"f\":160,\"g\":[0,1],\"h\":[],\"j\":1170027,\"k\":[],\"l\":0,\"m\":21,\"r\":{\"a\":0,\"b\":0,\"c\":0,\"d\":0,\"e\":0,\"f\":0.0,\"g\":0,\"h\":null,\"i\":null,\"j\":null}}}\n");
        }
    }

}
