package com.example.app.javatechie.spring.auth.example.mission;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.example.app.javatechie.spring.auth.example.mission.Mission;


@EnableJpaRepositories
@Repository
public interface MissionRepo extends JpaRepository<Mission, Integer> {
	Mission findBySalariesidId(int id);
}