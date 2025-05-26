package d7;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public final class g0 implements e {
    public final i0 a(Looper looper, Handler.Callback callback) {
        return new i0(new Handler(looper, callback));
    }

    public final long b() {
        return System.currentTimeMillis();
    }
}
