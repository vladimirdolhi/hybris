package org.training.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.training.data.ProducerData;
import org.training.facade.ProducerFacade;


import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/producers")
public class ProducerController {

    @Resource
    private ProducerFacade producerFacade;

    @GetMapping
    public String showAllProducers(Model model){
        List<ProducerData> producers = producerFacade.getAllProducers();
        model.addAttribute("producers", producers);
        return "producerList";
    }

    @GetMapping("/{code}")
    public String showProducer(@PathVariable String code, Model model){
        ProducerData producerData = producerFacade.getProducerData(code);
        model.addAttribute("producer", producerData);
        return "producerDetails";
    }
}
