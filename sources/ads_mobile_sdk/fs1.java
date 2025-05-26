package ads_mobile_sdk;

import a.b2;
import a.q5;
import a.v2;
import a.w3;
import android.os.Handler;
import android.os.Looper;

/* loaded from: classes2.dex */
public final class fs1 implements w3, v2 {

    /* renamed from: f, reason: collision with root package name */
    public static fs1 f5268f;

    /* renamed from: a, reason: collision with root package name */
    public float f5269a = 0.0f;

    /* renamed from: b, reason: collision with root package name */
    public final q5 f5270b;

    /* renamed from: c, reason: collision with root package name */
    public final b2 f5271c;

    /* renamed from: d, reason: collision with root package name */
    public h90 f5272d;

    /* renamed from: e, reason: collision with root package name */
    public u3 f5273e;

    public fs1(q5 q5Var, b2 b2Var) {
        this.f5270b = q5Var;
        this.f5271c = b2Var;
    }

    @Override // a.w3
    public final void a(boolean z13) {
        if (!z13) {
            wt2.f13249g.getClass();
            Handler handler = wt2.f13251i;
            if (handler != null) {
                handler.removeCallbacks(wt2.f13253k);
                wt2.f13251i = null;
                return;
            }
            return;
        }
        wt2.f13249g.getClass();
        if (wt2.f13251i == null) {
            Handler handler2 = new Handler(Looper.getMainLooper());
            wt2.f13251i = handler2;
            handler2.post(wt2.f13252j);
            wt2.f13251i.postDelayed(wt2.f13253k, 200L);
        }
    }

    public static fs1 a() {
        if (f5268f == null) {
            f5268f = new fs1(new q5(), new b2());
        }
        return f5268f;
    }
}
