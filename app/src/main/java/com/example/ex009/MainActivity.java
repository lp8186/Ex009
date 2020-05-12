package com.example.ex009;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

import java.util.Scanner;
public class MainActivity extends AppCompatActivity {
    Button btn;
    EditText et1,et2,et3;
    WebView wv;
    String check1,check2,check3;
    Boolean bo1=true;
    String str;
    float num;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn= (Button) findViewById(R.id.btn);
        et1= (EditText) findViewById(R.id.et1);
        et2= (EditText) findViewById(R.id.et2);
        et3= (EditText) findViewById(R.id.et3);
        wv= (WebView) findViewById(R.id.wv);
        wv.getSettings().setJavaScriptEnabled(true);
        wv.setWebViewClient(new MyWebViewClient());
    }

    public void start(View view) {
        check1=et1.getText().toString();
        check2=et2.getText().toString();
        check3=et3.getText().toString();
        if (!(check1.equals("")||check2.equals("")||check3.equals(""))){
                if(!(check1.equals("-")||check2.equals("-")||check3.equals("-")||check1.equals("+")||check2.equals("+")||check3.equals("+"))){
                    if(!(check1.equals(".")||check2.equals(".")||check3.equals("."))){
                        if (!(check1.startsWith(".")||check2.startsWith(".")||check3.startsWith("."))){
                            if(!(check1.endsWith(".")||check2.endsWith(".")||check3.endsWith("."))) {
                                if(!(check1.startsWith("-.")||check2.startsWith("-.")||check3.startsWith("-.")||check1.startsWith("+.")||check2.startsWith("+.")||check3.startsWith("+."))){
                                    num= Float.parseFloat(check1);
                                    if (!(num==0)) { //אם a=0 אז זאת לא פרבולה
                                        str = "https://www.google.com/search?q=" + check1 + "x%5E2%2B" + check2 + "x%2B" + check3 + "&oq=" + check1 + "x%5E2%2B" + check2 + "x%2B" + check3 + "&aqs=chrome.0.69i59j0l7.11676j0j7&sourceid=chrome&ie=UTF-8";
                                        wv.loadUrl(str);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    class MyWebViewClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String str) {
            view.loadUrl(str);
            return true;
        }
    }



