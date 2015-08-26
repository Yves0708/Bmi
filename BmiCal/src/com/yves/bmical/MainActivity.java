package com.yves.bmical;

import android.app.Activity;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.view.View.OnClickListener;
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
		et_height = (EditText) findViewById(R.id.et_height);
		et_weight = (EditText) findViewById(R.id.et_weight);
		tv_result = (TextView) findViewById(R.id.tv_result);
		tv_result
				.setText(Html
						.fromHtml("歡迎大家使用<big><font color=\"#FF0000\"><b>BMI 計算器</b></font></big>"));// 改變某段文字格式
		tv_suggest = (TextView) findViewById(R.id.tv_suggest);
		btn01 = (Button) findViewById(R.id.btn01);
		btn01.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				float height = Float.parseFloat(et_height.getText().toString()) / 100;
				float weight = Float.parseFloat(et_weight.getText().toString());
				float BMI = weight / (height * height);
				tv_result.setText("你的BMI值: " + BMI);

				if (BMI < 18.5) {
					tv_result.setBackgroundColor(Color.YELLOW);
					tv_result.setTextColor(Color.BLACK);
					tv_suggest.setText("太輕囉!消夜加倍!");
				} else if (BMI >= 18.5 && BMI < 24) {
					tv_result.setBackgroundColor(Color.GREEN);
					tv_result.setTextColor(Color.BLACK);
					tv_suggest.setText("嘟嘟好!啾咪,標準喔,繼續保持下去!");
				} else if (BMI >= 24 && BMI < 27) {
					tv_result.setBackgroundColor(Color.YELLOW);
					tv_result.setTextColor(Color.BLACK);
					tv_suggest.setText("有點腫!別再吃消夜了!");
				} else if (BMI >= 27 && BMI < 30) {
					tv_result.setBackgroundColor(0xffff7777);
					tv_result.setTextColor(Color.BLACK);
					tv_suggest.setText("肥起來!晚上八點後,嚴禁餵食!");
				} else if (BMI >= 30 && BMI < 35) {
					tv_result.setBackgroundColor(Color.RED);
					tv_result.setTextColor(Color.BLACK);
					tv_suggest
							.setText("過胖了!該減肥了!\n\n"
									+ "請電訪官網:http://www.weightoff-sh.com.tw\n\n"
									+ "請來電:0222490088\n\n"
									+ "請電郵:service@weightoff-sh.com.tw\n\n"
									+ "請開地圖:http://maps.google.com/?q=25.044636,121.517018\n\n"
									+ "看街景:http://maps.google.com/?cbll=25.044636,121.517018");

				} else if (BMI >= 35) {
					tv_result.setBackgroundColor(Color.BLACK);
					tv_result.setTextColor(Color.RED);
					tv_suggest
							.setText("超胖了!該看醫生了!\n\n"
									+ "請電訪官網:http://www.weightoff-sh.com.tw\n\n"
									+ "請來電:0222490088\n\n"
									+ "請電郵:service@weightoff-sh.com.tw\n\n"
									+ "請開地圖:http://maps.google.com/?q=25.044636,121.517018\n\n"
									+ "看街景:http://maps.google.com/?cbll=25.044636,121.517018");
				}
			}

		});
	}
}
