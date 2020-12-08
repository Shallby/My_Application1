package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }
    public void sendMessage(View view){//View 是一个类
        //响应按钮的事件
        EditText msg=findViewById(R.id.message);//这是将输入框中的文本拿出来
        String s=msg.getText().toString();
        //System.out.println(s);///打印出来
        //Log.i("message",s);
        /*
        方法一 实现界面的跳动 class跳转
         */
        Intent intent=new Intent(this,ThirdActivity.class);
        this.startActivity(intent);
        /*
        方法二 实现界面的跳动 包名 类名
         */
//        Intent intent=new Intent();
//        intent.setClassName(this,"com.example.myapplication.SecondActivity");
//        this.startActivity(intent);
        /*
        方法二 实现界面的跳动 componentName
        */
//        Intent intent =new Intent();
//        ComponentName componentName=new ComponentName(this,SecondActivity.class);
//        intent.setComponent(componentName);
//        this.startActivity(intent);
        //以上三种方法实现了界面的跳动
    }
}