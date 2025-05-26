package bi;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public class f extends Handler {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Looper looper, int i13) {
        super(looper);
        if (i13 != 1) {
            Looper.getMainLooper();
        } else {
            super(looper);
            Looper.getMainLooper();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Looper looper, Handler.Callback callback, int i13) {
        super(looper, callback);
        if (i13 != 1) {
            Looper.getMainLooper();
        } else {
            super(looper, callback);
            Looper.getMainLooper();
        }
    }
}
