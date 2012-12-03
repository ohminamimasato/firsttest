package com.example.intentsample1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

public class IntentFirst extends Activity {
//onCreateメソッド(画面初期表示イベントハンドラ）
    @Override
    public void onCreate(Bundle savedInstanceState) {
    	//スーパークラスのonCreateメソッドの呼び出し
        super.onCreate(savedInstanceState);
        //レイアウト設定ファイルの指定
        setContentView(R.layout.activity_intent_first);

        //ListViewの紐つけ
        ListView listview =(ListView)findViewById(R.id.fruitlist);
        listview.setOnItemClickListener(new ListItemClickListener());

    }

    class ListItemClickListener implements OnItemClickListener {

     public void onItemClick(AdapterView<?> parent,
		   View view,
		   int position,
		   long id) {

    	 ListView listview =(ListView) parent;

    	 String item =(String)listview.getItemAtPosition(position);

    	 Intent intent = new Intent(IntentFirst.this,SecondActivity.class);

    	 intent.putExtra("SELECTED_PICT", item);

    	 startActivity(intent);


    }

   }
}
