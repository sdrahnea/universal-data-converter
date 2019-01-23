package com.udc.controller;

import com.udc.model.Country;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sdrahnea
 */
@RestController
@RequestMapping(value = "/country")
public class CountryController extends AbstractController<Country> {
}