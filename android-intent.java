    //Intent intent=new Intent(MainActivity.this,Main2Activity.class);
               // Intent intent=new Intent(Intent.ACTION_VIEW);
                //intent = intent.setData(Uri.parse("http://baidu.com"))；跳转指定地址
               // Intent intent=new Intent(Intent.ACTION_DIAL);
               // intent.setData(Uri.parse("tel:10086"));//拨打指定号码
                String data ="Hello Android!";
                Intent intent=new Intent(MainActivity.this,Main2Activity.class);//向第二Activity传递数据
                intent.putExtra("keyword",data);
                startActivity(intent);

                ////////////////two activity get data function

                package com.example.just.applicationlks;

				import android.content.Intent;
				import android.support.v7.app.AppCompatActivity;
				import android.os.Bundle;
				import android.widget.Toast;

				public class Main2Activity extends AppCompatActivity {

				    @Override
				    protected void onCreate(Bundle savedInstanceState) {
				        super.onCreate(savedInstanceState);
				        setContentView(R.layout.activity_main2);
				        Intent intent=getIntent();
				        String data= intent.getStringExtra("keyword");
				        Toast.makeText(this,data,Toast.LENGTH_SHORT).show();
				    }
				}
