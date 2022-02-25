package com.app.service.stock.controllers;

import com.app.service.stock.common.EndPoints;
import org.springframework.web.bind.annotation.*;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

@RestController
public class PriceController {

    @GetMapping("/test")
    public String testEndPoint() {
        return "Test EndPoint";
    }

    @RequestMapping(value = "/price/{stock}", method = RequestMethod.GET)
    public String currentMarketPrice( @PathVariable("stock") String stock) throws UnsupportedEncodingException {
        return "test " + stock;
    }

    @RequestMapping(value = "/asd", method = RequestMethod.GET)
    public String asd( ) {

//        String URL = EndPoints.BASEURL_PRICE + EndPoints.STOCK_PRICE;
        System.out.println("Bye method called..!");
        return "test " + "asdff";
    }

}
