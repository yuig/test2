package pd;

import android.os.Handler;
import android.os.Message;

/* loaded from: classes.dex */
public final class j0 implements Handler.Callback {
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            return false;
        }
        ((g0) message.obj).c();
        return true;
    }
}
