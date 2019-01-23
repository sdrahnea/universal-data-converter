package com.udc.controller.data;

import com.udc.controller.AbstractController;
import com.udc.model.data.FirstName;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sdrahnea
 */
@RestController
@RequestMapping(value = "/first-name")
public class FirstNameController extends AbstractController<FirstName> {
}