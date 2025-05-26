package c2;

/* loaded from: classes2.dex */
public final class i1 implements l2 {

    /* renamed from: a, reason: collision with root package name */
    public static final i1 f24841a = new i1();

    public final long a(long j13, float f13, i2.o oVar, int i13) {
        i2.s sVar = (i2.s) oVar;
        sVar.W(-1687113661);
        s0 s0Var = (s0) sVar.m(u0.f25271a);
        if (Float.compare(f13, 0) <= 0 || s0Var.f()) {
            sVar.W(1169152471);
            sVar.r(false);
        } else {
            sVar.W(1169013963);
            i2.w3 w3Var = m2.f24958a;
            j13 = androidx.compose.ui.graphics.a.m(b3.w.b(u0.b(j13, sVar), ((((float) Math.log(f13 + 1)) * 4.5f) + 2.0f) / 100.0f), j13);
            sVar.r(false);
        }
        sVar.r(false);
        return j13;
    }
}
