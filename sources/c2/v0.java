package c2;

/* loaded from: classes2.dex */
public final class v0 implements e2.a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final v0 f25298a = new v0();

    @Override // e2.a0
    public final long a(i2.o oVar) {
        i2.s sVar = (i2.s) oVar;
        sVar.W(-1599906584);
        long j13 = ((b3.w) sVar.m(c1.f24577a)).f21392a;
        boolean f13 = ((s0) sVar.m(u0.f25271a)).f();
        float q13 = androidx.compose.ui.graphics.a.q(j13);
        if (!f13 && q13 < 0.5d) {
            j13 = b3.w.f21382f;
        }
        sVar.r(false);
        return j13;
    }

    @Override // e2.a0
    public final e2.i b(i2.o oVar) {
        i2.s sVar = (i2.s) oVar;
        sVar.W(112776173);
        e2.i iVar = ((s0) sVar.m(u0.f25271a)).f() ? ((double) androidx.compose.ui.graphics.a.q(((b3.w) sVar.m(c1.f24577a)).f21392a)) > 0.5d ? p3.f25072e : p3.f25073f : p3.f25074g;
        sVar.r(false);
        return iVar;
    }
}
