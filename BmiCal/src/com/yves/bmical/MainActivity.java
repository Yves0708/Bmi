package com.yves.bmical;

import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	EditText et_height;
	EditText et_weight;
	Button btn01;
	TextView tv_result;
	TextView tv_suggest;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		et_height = (EditText)findViewById(R.id.et_height);
		et_weight = (EditText)findViewById(R.id.et_weight);
		tv_result = (TextView)findViewById(R.id.tv_result);
		tv_result.setText(Html.fromHtml("歡迎大家使用<big><font color=\"#FF0000\"><b>BMI 計算器</b></font></big>"));//改變某段文字格式
		tv_suggest = (TextView)findViewById(R.id.tv_suggest);
		btn01 =(Button)findViewById(R.id.btn01);
	}
}
