package com.green.smartgradever2.professor.model;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
public class ProfessorSelRes {
   private ProfessorProfileDto professor;
   private List<ProfessorLectureDto> lectures;
}
