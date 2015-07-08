package com.and.getdata;

import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

/**
 * 第一阶段：
 * 从网络下载数据
 * @author tanyi_000
 * 下午9:53:08  2015-7-6
 */
public class MainActivity extends Activity {

	private EditText etUrl;
	private String url;
	
	private Thread task;
	GetDataFromNet runnable;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		initView();
	}

	private void initView() {
		etUrl = (EditText) findViewById(R.id.et_url);
	}

	/**
	 * 开始运行获取数据
	 * @param v
	 */
	public void startRun(View v) {
		//TODO
		url = etUrl.getText().toString().trim();
		if(TextUtils.isEmpty(url)) {
			Toast.makeText(this, "url null", 0).show();
			return;
		}
		runnable = new GetDataFromNet();
		task = new Thread(runnable);
		task.start();
	}
	
	/**
	 * 子线程获取数据
	 * @author tanyi_000
	 * 下午9:52:49  2015-7-6
	 */
	class GetDataFromNet implements Runnable {

		@Override
		public void run() {
			// TODO
			HttpClient httpClient = new DefaultHttpClient();
			HttpParams params = httpClient.getParams();
			HttpConnectionParams.setConnectionTimeout(params, 7000); //连接超时7s
			HttpConnectionParams.setSoTimeout(params, 7000); //Socket 超时7s
			
			HttpGet httpGet = new HttpGet(url);
		}
		
	}

	
}
