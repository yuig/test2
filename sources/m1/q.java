package m1;

/* loaded from: classes.dex */
public final class q implements c1 {

    /* renamed from: a, reason: collision with root package name */
    public j1.a0 f85522a;

    /* renamed from: b, reason: collision with root package name */
    public final u2.r f85523b;

    public q(j1.a0 a0Var) {
        p1 p1Var = androidx.compose.foundation.gestures.a.f17143b;
        this.f85522a = a0Var;
        this.f85523b = p1Var;
    }

    @Override // m1.c1
    public final Object a(j2 j2Var, float f13, bl2.c cVar) {
        return kotlin.jvm.internal.j.M(cVar, this.f85523b, new p(f13, this, j2Var, null));
    }
}
