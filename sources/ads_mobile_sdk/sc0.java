package ads_mobile_sdk;

import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public final class sc0 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f11031a;

    /* renamed from: b, reason: collision with root package name */
    public final a.o8 f11032b;

    /* renamed from: c, reason: collision with root package name */
    public final a.o8 f11033c;

    /* renamed from: d, reason: collision with root package name */
    public final a.o8 f11034d;

    /* renamed from: e, reason: collision with root package name */
    public final a.o8 f11035e;

    /* renamed from: f, reason: collision with root package name */
    public final a.o8 f11036f;

    /* renamed from: g, reason: collision with root package name */
    public final a.o8 f11037g;

    public sc0(xv0 xv0Var, a.o8 o8Var, a.o8 o8Var2, a.o8 o8Var3, a.o8 o8Var4, p00 p00Var, xv0 xv0Var2) {
        this.f11031a = xv0Var;
        this.f11032b = o8Var;
        this.f11033c = o8Var2;
        this.f11034d = o8Var3;
        this.f11035e = o8Var4;
        this.f11036f = p00Var;
        this.f11037g = xv0Var2;
    }

    @Override // a.v7
    public final Object get() {
        return new qc0((ExecutorService) this.f11031a.get(), u90.a(this.f11032b), u90.a(this.f11033c), (bn2) this.f11034d.get(), u90.a(this.f11035e), this.f11036f, (i4) this.f11037g.get());
    }
}
