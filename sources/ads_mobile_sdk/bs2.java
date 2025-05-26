package ads_mobile_sdk;

import a.zb;
import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class bs2 {

    /* renamed from: a, reason: collision with root package name */
    public final xb0 f3580a;

    /* renamed from: b, reason: collision with root package name */
    public final a.ee f3581b;

    /* renamed from: c, reason: collision with root package name */
    public final zb f3582c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f3583d = new AtomicBoolean(false);

    /* renamed from: e, reason: collision with root package name */
    public long f3584e = -1;

    /* renamed from: f, reason: collision with root package name */
    public long f3585f = -1;

    /* renamed from: g, reason: collision with root package name */
    public Throwable f3586g = null;

    public bs2(xb0 xb0Var, zb zbVar, a.ee eeVar) {
        this.f3580a = xb0Var;
        this.f3581b = eeVar;
        this.f3582c = zbVar;
    }

    public final void a() {
        if (this.f3583d.getAndSet(true)) {
            throw new IllegalStateException("Finished trace.");
        }
        this.f3582c.getClass();
        this.f3585f = SystemClock.uptimeMillis();
        ((x71) this.f3581b).a(this.f3580a.f13581a, this.f3583d.get() ? this.f3585f - this.f3584e : -1L, this.f3586g, null);
    }

    public final void b() {
        if (this.f3583d.get()) {
            throw new IllegalStateException("Finished trace.");
        }
        this.f3582c.getClass();
        this.f3584e = SystemClock.uptimeMillis();
    }

    public final void a(Throwable th3) {
        if (!this.f3583d.get()) {
            this.f3586g = th3;
            return;
        }
        throw new IllegalStateException("Finished trace.");
    }
}
