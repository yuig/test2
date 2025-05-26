package ads_mobile_sdk;

import java.util.ArrayDeque;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class dr1 implements a.u {

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque f4416b = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    public cr1 f4417c = null;

    /* renamed from: a, reason: collision with root package name */
    public final ThreadPoolExecutor f4415a = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, new LinkedBlockingQueue());

    public final void a() {
        cr1 cr1Var = (cr1) this.f4416b.poll();
        this.f4417c = cr1Var;
        if (cr1Var != null) {
            cr1Var.a(this.f4415a);
        }
    }

    public final void a(cr1 cr1Var) {
        cr1Var.f4008a = this;
        this.f4416b.add(cr1Var);
        if (this.f4417c == null) {
            a();
        }
    }
}
