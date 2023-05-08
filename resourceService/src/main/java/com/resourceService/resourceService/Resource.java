package com.resourceService.resourceService;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.util.logging.Logger;

public class Resource {

    public Resource(){
    }

    public void createHttpRequest() throws IOException {
        final Logger logger = Logger.getLogger(Resource.class.getName());
        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url("https://world-geo-data.p.rapidapi.com/countries/JP")
                .get()
                .addHeader("X-RapidAPI-Key", "bd0a8b273fmshb62209000685430p1b6c26jsn87d4ca758b24")
                .addHeader("X-RapidAPI-Host", "world-geo-data.p.rapidapi.com")
                .build();

        Response response = client.newCall(request).execute();

        logger.info(String.valueOf(response));
    }


    // Create methods based on how to look up japan stuff

}
