package com.spring.integration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.integration.Message;
import org.springframework.integration.MessageChannel;
import org.springframework.integration.support.MessageBuilder;

public class MainApp
{
 public static void main(String[] args)
 {
	 String config="spring-integration-context.xml";
  ApplicationContext ctx=new ClassPathXmlApplicationContext(config);
  MessageChannel channel=(MessageChannel)ctx.getBean("requestchannel",MessageChannel.class);
  //channel.send(new GenericMessage<String>("Good Mornin"));
  Message<String> msg=MessageBuilder.withPayload("Good Morning").build();
  channel.send(msg);
  int time=10;
  Message<Integer> mess=MessageBuilder.withPayload(time).build();
  channel.send(mess);
  Message<Integer> age=MessageBuilder.withPayload(59).build();
  channel.send(age);
 }
}
