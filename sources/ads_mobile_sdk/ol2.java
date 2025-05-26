package ads_mobile_sdk;

import a.f2;
import a.gh;
import com.google.common.util.concurrent.f;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class ol2 implements gh {

    /* renamed from: a, reason: collision with root package name */
    public final i4 f9359a;

    /* renamed from: b, reason: collision with root package name */
    public final ll2 f9360b;

    /* renamed from: c, reason: collision with root package name */
    public final a.l6 f9361c;

    /* renamed from: d, reason: collision with root package name */
    public final ExecutorService f9362d;

    /* renamed from: e, reason: collision with root package name */
    public final bt2 f9363e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReference f9364f = new AtomicReference();

    public ol2(i4 i4Var, ll2 ll2Var, a.l6 l6Var, ExecutorService executorService, bt2 bt2Var) {
        this.f9359a = i4Var;
        this.f9360b = ll2Var;
        this.f9361c = l6Var;
        this.f9362d = executorService;
        this.f9363e = bt2Var;
    }

    @Override // a.gh
    public final com.google.common.util.concurrent.c0 a() {
        com.google.common.util.concurrent.t z13 = com.google.common.util.concurrent.t.z(this.f9360b.a(this.f9359a.H(), this.f9359a.r()));
        a.z3 z3Var = new a.z3(this, 1);
        com.google.common.util.concurrent.r rVar = com.google.common.util.concurrent.r.INSTANCE;
        z13.getClass();
        f A = com.google.common.util.concurrent.g.A(z13, z3Var, rVar);
        dl2.b.n(A, new nl2(this), this.f9362d);
        return A;
    }

    public final /* synthetic */ f2 a(f2 f2Var) {
        this.f9364f.set(f2Var);
        return f2Var;
    }
}
