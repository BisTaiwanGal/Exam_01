package com.missingbismarcktons.exam_01;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Message extends BaseActivity {
    private TextView tv;
    private Button btnAction1, btnAction2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Message");
        tv = (TextView) findViewById(R.id.tv);
        btnAction1 = (Button) findViewById(R.id.btnAction1);
        btnAction1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Message.class);
                PendingIntent pendingIntent = PendingIntent.getActivity(getApplicationContext(), (int) System.currentTimeMillis(), i, 0);
                Notification noti = null;
                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.JELLY_BEAN) {
                    noti = new Notification.Builder(getApplicationContext())
                            .setContentTitle("哈囉哈囉")
                            .setContentText("我好想吃Mozzarella cheese")
                            .setSmallIcon(R.mipmap.ic_launcher) //why R.drawable doesn't work
                            .setContentIntent(pendingIntent)
                            //.setTicker()
                            .setAutoCancel(true) // notification will be deleted from the noti drawer when the user presses it.
                            .build();
                }
                NotificationManager notiManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                //0 is an identifier for the notification. (should be unique across this application or ll be replaced)
                notiManager.notify(0, noti);
            }
        });
    }

    public int getLayoutResource(){
        return R.layout.activity_message;
    }
}
