package com.kunminx.puremusic.domain.message;

import com.kunminx.architecture.domain.dispatch.MviDispatcher;
import com.kunminx.puremusic.domain.event.Messages;

public class PageMessenger extends MviDispatcher<Messages> {
    @Override
    protected void onHandle(Messages event) {


        sendResult(event);
    }
}
