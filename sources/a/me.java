package a;

import ads_mobile_sdk.wt2;
import android.os.Handler;

/* loaded from: classes2.dex */
public final class me implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        Handler handler = wt2.f13251i;
        if (handler != null) {
            handler.post(wt2.f13252j);
            wt2.f13251i.postDelayed(wt2.f13253k, 200L);
        }
    }
}
