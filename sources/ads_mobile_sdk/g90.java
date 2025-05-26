package ads_mobile_sdk;

import android.webkit.WebView;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class g90 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h90 f5478a;

    public g90(h90 h90Var) {
        this.f5478a = h90Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        float f13;
        h90 h90Var = this.f5478a;
        int streamVolume = h90Var.f5892b.getStreamVolume(3);
        int streamMaxVolume = h90Var.f5892b.getStreamMaxVolume(3);
        h90Var.f5893c.getClass();
        if (streamMaxVolume <= 0 || streamVolume <= 0) {
            f13 = 0.0f;
        } else {
            f13 = streamVolume / streamMaxVolume;
            if (f13 > 1.0f) {
                f13 = 1.0f;
            }
        }
        if (((Float) this.f5478a.f5895e.getAndSet(Float.valueOf(f13))).floatValue() != f13) {
            fs1 fs1Var = (fs1) this.f5478a.f5894d;
            fs1Var.f5269a = f13;
            if (fs1Var.f5273e == null) {
                fs1Var.f5273e = u3.f11813c;
            }
            Iterator it = Collections.unmodifiableCollection(fs1Var.f5273e.f11815b).iterator();
            while (it.hasNext()) {
                v3 v3Var = ((t3) it.next()).f11329d;
                fr1.f5252a.a((WebView) v3Var.f12300b.get(), "setDeviceVolume", Float.valueOf(f13), v3Var.f12299a);
            }
        }
    }
}
