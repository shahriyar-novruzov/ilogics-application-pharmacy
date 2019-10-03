package com.ilogics.application.pharmacy;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... arg0) throws Exception {

//		CourseCategory category = new CourseCategory();
//		category.setName("Programming");
//		categoryRepository.save(category);
//
//		CourseCategory category = categoryRepository.findById(1L).get();
//
//		Course course = new Course();
//		course.setName("C#");
//		course.setCategory(category);
//		courseRepository.save(course);
//
//		course = new Course();
//		course.setName("Java");
//		course.setCategory(category);
//		courseRepository.save(course);
//
//
//		Tutor tutor = new Tutor();
//		tutor.setName("Shehi");
//		tutor.setActive(true);
//		tutor.setGender(Gender.MALE);
//		tutor.setBirthDate(DateTime.now());
//
//		tutorRepository.save(tutor);
//
//		Tutor tutor = tutorRepository.findById(252L).get();
//		System.out.println(tutor.getBirthDate().toDate());

//		List<Course> courseList = new ArrayList<>();
//		courseList.add(courseRepository.findById(602L).get());
//		courseList.add(courseRepository.findById(702L).get());
//
//		Tutor tutor = tutorRepository.findById(652L).get();
//		tutor.setCourseList(courseList);

//		Subscriber subscriber = subscriberRepository.findById(752L).get();
//
//		CallHistory callHistory = new CallHistory();
//		callHistory.setCallText("TEST1");
//		callHistory.setSubscriber(subscriber);
//
//		List<CallHistory> callHistoryList = subscriber.getCallHistoryList();
//		callHistoryList.add(callHistory);
//		subscriber.setCallHistoryList(callHistoryList);

//		subscriberRepository.save(subscriber);

//		System.out.println(subscriber.getCallHistoryList().size());

//		UserEntity user = new UserEntity();
//		user.setUsername("test");
//
//		userRepository.save(user);
//
//		List<Channel> channelList = new ArrayList<>();
//		channelList.add(Channel.EMAIL);
//		channelList.add(Channel.SMS);
//
//		Message message = new Message();
//		message.setName("message");
//		message.setChannels(channelList);
//		message.setSubscriberType(SubscriberType.CORPORATE);
//		message.setUser(user);
//
//		messageRepository.save(message);
//
//		Message message = messageRepository.findById(202L).get();
//		System.out.println(message);

    }
}

