package com.example.android.newsreka.Common;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import static android.R.id.input;
import static java.lang.System.in;

/**
 * Created by DIKSHAA SINGHAL on 7/23/2017.
 */

@SuppressWarnings("ALL")
public class HTTPDataHandler {

    static String stream = null;

    public HTTPDataHandler() {
    }


    public int GetHTTPData(String urlstring) {
        try {

            URL url = null;
            try {
                url = new URL(urlstring);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
            HttpURLConnection urlConnection = null;
            try {
                urlConnection = (HttpURLConnection) url.openConnection();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (urlConnection.getResponseCode() == HttpURLConnection.HTTP_OK) {

                    InputStream in = new BufferedInputStream(urlConnection.getInputStream());
                    BufferedReader r = new BufferedReader(new InputStreamReader(in));
                    StringBuilder sb = new StringBuilder();
                    String line;
                    while ((line = r.readLine())!= null)
                    {
                        sb.append(line);
                        stream = sb.toString();
                        urlConnection.disconnect();
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            //catch(MalformedURLException Throwable e)
            /**{
                e.printStackTrace();
            } catch(IOException e){
                e.printStackTrace();
            }

 catch(MalformedURLException e){
                e.printStackTrace();
            } catch(IOException e){
                e.printStackTrace();
            }


         catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e){
                e.printStackTrace();
            }} catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }}**/
    }

    }
}