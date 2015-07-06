package com.and.getdata;

import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.DefaultHttpClient;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

/**
 * 第一阶段：
 * 从网络下载数据
 * @author tanyi_000
 * 下午9:53:08  2015-7-6
 */
public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	/**
	 * 开始运行获取数据
	 * @param v
	 */
	public void startRun(View v) {
		//TODO
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
		}
		
	}

	
}
