package io.agora.chat.uikit.manager;

import android.content.Context;
import android.content.res.Resources;

import io.agora.chat.uikit.R;


public class EaseConfigsManager {
    private Context context;

    public EaseConfigsManager(Context context) {
        this.context = context;
    }

    /**
     * 是否使用发送channel_ack消息功能，此功能启动旨在减少发送read_ack消息，默认为开启
     * @return
     */
    public boolean enableSendChannelAck() {
        boolean enable = false;
        try {
            enable = context.getResources().getBoolean(R.bool.ease_enable_send_channel_ack);
        } catch (Resources.NotFoundException e) {
            e.printStackTrace();
        }
        return enable;
    }
}
