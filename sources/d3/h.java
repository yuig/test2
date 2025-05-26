package d3;

import b3.f0;
import b3.o0;
import b3.p;
import b3.p0;
import b3.s;
import net.quikkly.android.utils.BitmapUtils;

/* loaded from: classes.dex */
public interface h extends n4.b {
    public static final g Qn = g.f53657a;

    static void C(h hVar, f0 f0Var, p pVar) {
        k kVar = k.f53660a;
        Qn.getClass();
        hVar.r0(f0Var, 0L, 1.0f, kVar, pVar, g.f53658b);
    }

    static void O(h hVar, long j13, float f13, long j14, float f14, i iVar, int i13) {
        float c13 = (i13 & 2) != 0 ? a3.f.c(hVar.g()) / 2.0f : f13;
        long t03 = (i13 & 4) != 0 ? hVar.t0() : j14;
        float f15 = (i13 & 8) != 0 ? 1.0f : f14;
        i iVar2 = (i13 & 16) != 0 ? k.f53660a : iVar;
        Qn.getClass();
        hVar.H(j13, c13, t03, f15, iVar2, null, g.f53658b);
    }

    static void a0(h hVar, long j13, long j14, float f13, int i13) {
        int i14;
        long h03 = (i13 & 4) != 0 ? h0(hVar.g(), 0L) : j14;
        float f14 = (i13 & 8) != 0 ? 1.0f : f13;
        k kVar = k.f53660a;
        if ((i13 & 64) != 0) {
            Qn.getClass();
            i14 = g.f53658b;
        } else {
            i14 = 0;
        }
        hVar.M(j13, 0L, h03, f14, kVar, null, i14);
    }

    static long h0(long j13, long j14) {
        return bs1.c.c(a3.f.d(j13) - a3.c.d(j14), a3.f.b(j13) - a3.c.e(j14));
    }

    static void k(h hVar, f0 f0Var, long j13, long j14, long j15, float f13, p pVar, int i13, int i14) {
        int i15;
        long j16 = (i14 & 2) != 0 ? 0L : j13;
        long j17 = (i14 & 16) != 0 ? j14 : j15;
        float f14 = (i14 & 32) != 0 ? 1.0f : f13;
        k kVar = k.f53660a;
        g gVar = Qn;
        gVar.getClass();
        int i16 = g.f53658b;
        if ((i14 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0) {
            gVar.getClass();
            i15 = g.f53659c;
        } else {
            i15 = i13;
        }
        hVar.G(f0Var, j16, j14, 0L, j17, f14, kVar, pVar, i16, i15);
    }

    static void k0(h hVar, o0 o0Var, s sVar, float f13, l lVar, int i13) {
        int i14;
        if ((i13 & 4) != 0) {
            f13 = 1.0f;
        }
        float f14 = f13;
        i iVar = lVar;
        if ((i13 & 8) != 0) {
            iVar = k.f53660a;
        }
        i iVar2 = iVar;
        if ((i13 & 32) != 0) {
            Qn.getClass();
            i14 = g.f53658b;
        } else {
            i14 = 0;
        }
        hVar.y(o0Var, sVar, f14, iVar2, null, i14);
    }

    static void o0(h hVar, b3.k kVar, long j13) {
        k kVar2 = k.f53660a;
        Qn.getClass();
        hVar.s(kVar, j13, 1.0f, kVar2, null, g.f53658b);
    }

    static void q(h hVar, s sVar, long j13, long j14, float f13, i iVar, int i13) {
        long j15 = (i13 & 2) != 0 ? 0L : j13;
        long h03 = (i13 & 4) != 0 ? h0(hVar.g(), j15) : j14;
        float f14 = (i13 & 8) != 0 ? 1.0f : f13;
        i iVar2 = (i13 & 16) != 0 ? k.f53660a : iVar;
        Qn.getClass();
        hVar.n0(sVar, j15, h03, f14, iVar2, null, g.f53658b);
    }

    static void q0(h hVar, s sVar, long j13, long j14, float f13, float f14, int i13) {
        float f15 = (i13 & 64) != 0 ? 1.0f : f14;
        Qn.getClass();
        hVar.U(sVar, j13, j14, f13, 0, null, f15, null, g.f53658b);
    }

    static void v(h hVar, long j13, long j14, long j15, long j16, l lVar) {
        Qn.getClass();
        hVar.r(j13, j14, j15, j16, lVar, 1.0f, null, g.f53658b);
    }

    static void w(h hVar, s sVar, long j13, long j14, long j15, l lVar, int i13) {
        long j16 = (i13 & 2) != 0 ? 0L : j13;
        long h03 = (i13 & 4) != 0 ? h0(hVar.g(), j16) : j14;
        i iVar = (i13 & 32) != 0 ? k.f53660a : lVar;
        Qn.getClass();
        hVar.S(sVar, j16, h03, j15, 1.0f, iVar, null, g.f53658b);
    }

    void G(f0 f0Var, long j13, long j14, long j15, long j16, float f13, i iVar, p pVar, int i13, int i14);

    void H(long j13, float f13, long j14, float f14, i iVar, p pVar, int i13);

    void I(long j13, long j14, long j15, float f13, int i13, p0 p0Var, float f14, p pVar, int i14);

    void M(long j13, long j14, long j15, float f13, i iVar, p pVar, int i13);

    void S(s sVar, long j13, long j14, long j15, float f13, i iVar, p pVar, int i13);

    void U(s sVar, long j13, long j14, float f13, int i13, p0 p0Var, float f14, p pVar, int i14);

    default long g() {
        return p0().e();
    }

    n4.k getLayoutDirection();

    void n0(s sVar, long j13, long j14, float f13, i iVar, p pVar, int i13);

    b p0();

    void r(long j13, long j14, long j15, long j16, i iVar, float f13, p pVar, int i13);

    void r0(f0 f0Var, long j13, float f13, i iVar, p pVar, int i13);

    void s(o0 o0Var, long j13, float f13, i iVar, p pVar, int i13);

    default long t0() {
        return bs1.c.r0(p0().e());
    }

    void y(o0 o0Var, s sVar, float f13, i iVar, p pVar, int i13);
}
