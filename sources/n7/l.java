package n7;

import java.io.IOException;

/* loaded from: classes3.dex */
public final /* synthetic */ class l implements d7.r, d7.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g8.v f89472a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g8.a0 f89473b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ IOException f89474c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f89475d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f89476e;

    public /* synthetic */ l(Object obj, g8.v vVar, g8.a0 a0Var, IOException iOException, boolean z13) {
        this.f89476e = obj;
        this.f89472a = vVar;
        this.f89473b = a0Var;
        this.f89474c = iOException;
        this.f89475d = z13;
    }

    @Override // d7.i
    public final void accept(Object obj) {
        g8.h0 h0Var = (g8.h0) this.f89476e;
        ((g8.i0) obj).f(h0Var.f64276a, h0Var.f64277b, this.f89472a, this.f89473b, this.f89474c, this.f89475d);
    }

    @Override // d7.r
    /* renamed from: invoke */
    public final void mo0invoke(Object obj) {
        ((c) obj).L((b) this.f89476e, this.f89472a, this.f89473b, this.f89474c, this.f89475d);
    }
}
