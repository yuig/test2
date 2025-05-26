package ads_mobile_sdk;

import a.z2;

/* loaded from: classes2.dex */
public abstract class qj0 extends z2 {

    /* renamed from: a, reason: collision with root package name */
    public final sj0 f10109a;

    /* renamed from: b, reason: collision with root package name */
    public sj0 f10110b;

    public qj0(sj0 sj0Var) {
        this.f10109a = sj0Var;
        if (sj0Var.m()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f10110b = c();
    }

    public final sj0 a() {
        sj0 sj0Var;
        if (this.f10110b.m()) {
            this.f10110b.n();
            sj0Var = this.f10110b;
        } else {
            sj0Var = this.f10110b;
        }
        sj0Var.getClass();
        if (sj0.a(sj0Var, true)) {
            return sj0Var;
        }
        throw new wv2();
    }

    public final void b() {
        if (this.f10110b.m()) {
            return;
        }
        sj0 sj0Var = (sj0) this.f10109a.a(4, (sj0) null);
        a(sj0Var, this.f10110b);
        this.f10110b = sj0Var;
    }

    public final sj0 c() {
        return this.f10109a.p();
    }

    public final Object clone() {
        sj0 sj0Var;
        qj0 qj0Var = (qj0) this.f10109a.a(5, (sj0) null);
        if (this.f10110b.m()) {
            this.f10110b.n();
            sj0Var = this.f10110b;
        } else {
            sj0Var = this.f10110b;
        }
        qj0Var.f10110b = sj0Var;
        return qj0Var;
    }

    public static void a(sj0 sj0Var, Object obj) {
        k22 k22Var = k22.f7066c;
        k22Var.getClass();
        k22Var.a(sj0Var.getClass()).a(sj0Var, obj);
    }
}
