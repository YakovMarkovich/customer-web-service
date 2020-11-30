package main.java.m2m.service;

import m2m.Model;
import main.java.m2m.entity.AvgQuantityObject;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.stereotype.Service;
import java.util.concurrent.ConcurrentHashMap;

@Service
@EnableBinding(Sink.class)
public class ServiceConsumer {
   ConcurrentHashMap<Long, AvgQuantityObject> map = new ConcurrentHashMap<>();

    @StreamListener(Sink.INPUT)
    public void handle(Model.Customer customer) {
        AvgQuantityObject obj = map.getOrDefault(customer.getId(),new AvgQuantityObject());
        obj.setAvgValue((obj.getAvgValue()*obj.getQuantity()+customer.getScore())/(obj.getQuantity()+1));
        obj.setQuantity(obj.getQuantity()+1);
        map.put(customer.getId(), obj);
    }
    public double getAvgValue(String consumerId) {
        return map.get(Long.parseLong(consumerId)).getAvgValue();
    }

}
