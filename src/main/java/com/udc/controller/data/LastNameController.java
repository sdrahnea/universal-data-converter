package com.udc.controller.data;

import com.udc.controller.AbstractController;
import com.udc.model.data.LastName;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sdrahnea
 */
@RestController
@RequestMapping(value = "/last-name")
public class LastNameController extends AbstractController<LastName> {
}