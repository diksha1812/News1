package com.example.android.newsapp.Common;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by DIKSHAA SINGHAL on 7/24/2017.
 */

    /**
     * Created by DIKSHAA SINGHAL on 7/23/2017.
     */

    @SuppressWarnings("ALL")
    public class HTTPDataHandler {

        static String stream = null;

        public HTTPDataHandler() {
        }


        public int GetHTTPData(String urlstring, Throwable e) {
            try {

                URL url = new URL(urlstring);
                HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
                if (urlConnection.getResponseCode() == HttpURLConnection.HTTP_OK) {

                    InputStream in = new BufferedInputStream(urlConnection.getInputStream());
                    BufferedReader r = new BufferedReader(new InputStreamReader(in));
                    StringBuilder sb = new StringBuilder();
                    String line;

                }
catch(MalformedURLException e);
                {
                    e.printStackTrace();
                } catch(IOException e){
                    e.printStackTrace();
                } catch(MalformedURLException e){
                    e.printStackTrace();
                } catch(IOException e){
                    e.printStackTrace();
                } catch(MalformedURLException e){
                    e.printStackTrace();
                } catch(IOException e){
                    e.printStackTrace();
                }



             catch(MalformedURLException e){
                    e.printStackTrace();
                } catch(IOException e){
                    e.printStackTrace();
                }
            }