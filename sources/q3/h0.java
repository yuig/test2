package q3;

import java.util.Map;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class h0 implements q0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q0 f102212a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l0 f102213b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f102214c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q0 f102215d;

    public h0(q0 q0Var, l0 l0Var, int i13, q0 q0Var2) {
        this.f102213b = l0Var;
        this.f102214c = i13;
        this.f102215d = q0Var2;
        this.f102212a = q0Var;
    }

    @Override // q3.q0
    public final Map c() {
        return this.f102212a.c();
    }

    @Override // q3.q0
    public final void d() {
        l0 l0Var = this.f102213b;
        l0Var.f102233d = this.f102214c;
        this.f102215d.d();
        l0Var.f(l0Var.f102233d);
    }

    @Override // q3.q0
    public final Function1 e() {
        return this.f102212a.e();
    }

    @Override // q3.q0
    public final int i() {
        return this.f102212a.i();
    }

    @Override // q3.q0
    public final int j() {
        return this.f102212a.j();
    }
}
