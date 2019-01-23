package com.udc.controller;

import com.udc.model.UnitIndustry;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sdrahnea
 */
@RestController
@RequestMapping(value = "/unit-industry")
public class UnitIndustryController extends AbstractController<UnitIndustry> {
}