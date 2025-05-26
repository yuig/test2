package nx;

import h32.d4;
import h32.v2;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public interface d0 {
    static /* synthetic */ h32.w0 B(d0 d0Var, h32.f1 f1Var, h32.g0 g0Var, String str, HashMap hashMap, int i13) {
        if ((i13 & 1) != 0) {
            f1Var = h32.f1.TAP;
        }
        return d0Var.k(f1Var, (i13 & 2) != 0 ? null : g0Var, (i13 & 4) != 0 ? null : str, (i13 & 8) != 0 ? null : hashMap, null);
    }

    static /* synthetic */ void v(d0 d0Var, h32.f1 f1Var, String str, boolean z13, int i13) {
        if ((i13 & 4) != 0) {
            z13 = false;
        }
        d0Var.a(f1Var, str, z13, true);
    }

    h32.w0 A(h32.f1 f1Var, ArrayList arrayList);

    void C(h32.f1 f1Var, String str, ArrayList arrayList, HashMap hashMap, h32.c1 c1Var, h32.v0 v0Var, h32.g0 g0Var);

    h32.w0 E(h32.f1 f1Var, ArrayList arrayList, h32.g0 g0Var);

    h32.w0 F(h32.g0 g0Var, h32.u0 u0Var);

    h32.w0 G(h32.g0 g0Var, h32.f1 f1Var, ArrayList arrayList);

    h32.w0 H(h32.f1 f1Var, String str, h32.c1 c1Var, HashMap hashMap, h32.v0 v0Var, boolean z13);

    void I();

    h32.w0 J(h32.u0 u0Var, h32.g0 g0Var, String str, HashMap hashMap, h32.v0 v0Var, boolean z13);

    h32.w0 K(h32.f1 f1Var, String str, h32.i0 i0Var, HashMap hashMap, boolean z13);

    void L(h32.i0 i0Var, String str, HashMap hashMap, String str2, h32.g0 g0Var, h32.c1 c1Var, h32.u0 u0Var);

    h32.w0 M(h32.g0 g0Var, HashMap hashMap, h32.v0 v0Var, ArrayList arrayList);

    h32.w0 N(h32.f1 f1Var, h32.u0 u0Var, h32.g0 g0Var, String str, boolean z13);

    h32.w0 P(h32.f1 f1Var, u0 u0Var);

    h32.w0 Q(h32.f1 f1Var, ArrayList arrayList);

    void R();

    h32.w0 S(v2 v2Var);

    void T(d4 d4Var, HashMap hashMap);

    h32.w0 U(h32.i0 i0Var, h32.f1 f1Var, String str, h32.c1 c1Var, HashMap hashMap, boolean z13);

    void V(String str, String str2);

    h32.w0 W(h32.f1 f1Var, String str, h32.i0 i0Var, HashMap hashMap, h32.v0 v0Var, boolean z13);

    h32.w0 X(h32.u0 u0Var);

    h32.w0 Y(h32.f1 f1Var, ArrayList arrayList);

    h32.w0 Z(h32.u0 u0Var, HashMap hashMap);

    h32.w0 a(h32.f1 f1Var, String str, boolean z13, boolean z14);

    h32.w0 b0(h32.u0 u0Var, h32.g0 g0Var, String str, boolean z13);

    h32.w0 c0(h32.i0 i0Var, h32.u0 u0Var, h32.g0 g0Var, String str);

    h32.w0 d0(h32.f1 f1Var, String str, ArrayList arrayList);

    h32.w0 e();

    h32.w0 e0(h32.g0 g0Var, h32.f1 f1Var, HashMap hashMap, ArrayList arrayList);

    HashMap f();

    h32.w0 f0(h32.u0 u0Var, h32.g0 g0Var, String str, HashMap hashMap, boolean z13);

    h32.w0 g(h32.f1 f1Var, String str, HashMap hashMap, boolean z13);

    h32.w0 g0(String str, ArrayList arrayList);

    String getUniqueScreenKey();

    h32.w0 h(h32.g0 g0Var, h32.u0 u0Var, HashMap hashMap);

    h32.w0 h0(h32.f1 f1Var, h32.u0 u0Var, h32.g0 g0Var, String str, HashMap hashMap, h32.d0 d0Var, h32.v0 v0Var, boolean z13);

    void i(String str, String str2, HashMap hashMap);

    h32.w0 i0(String str, HashMap hashMap, String str2, h32.g0 g0Var);

    h32.w0 j(h32.i0 i0Var, h32.u0 u0Var, h32.g0 g0Var, String str, HashMap hashMap);

    h32.w0 j0(h32.f1 f1Var, String str, ArrayList arrayList, HashMap hashMap, h32.c1 c1Var);

    h32.w0 k(h32.f1 f1Var, h32.g0 g0Var, String str, HashMap hashMap, String str2);

    h32.w0 k0(h32.f1 f1Var, HashMap hashMap, String str, h32.u uVar);

    h32.w0 l(h32.f1 f1Var, h32.g0 g0Var, String str, h32.v0 v0Var, ArrayList arrayList);

    void m(String str, HashMap hashMap, String str2, h32.g0 g0Var, h32.u0 u0Var);

    void n(String str, HashMap hashMap, String str2, h32.g0 g0Var, h32.c1 c1Var, h32.u0 u0Var);

    h32.w0 o(h32.f1 f1Var, h32.u0 u0Var, h32.g0 g0Var, String str, HashMap hashMap, h32.d0 d0Var, h32.c1 c1Var, h32.v0 v0Var, boolean z13);

    void onDestroy();

    h32.i0 p();

    h32.w0 q(h32.g0 g0Var, h32.f1 f1Var, HashMap hashMap, ArrayList arrayList);

    h32.w0 r(h32.g0 g0Var, h32.f1 f1Var, HashMap hashMap, ArrayList arrayList);

    h32.w0 s(y0 y0Var);

    h32.w0 t(h32.i0 i0Var, h32.v0 v0Var, h32.c1 c1Var, h32.f1 f1Var, String str, HashMap hashMap, boolean z13);

    h32.w0 u(h32.f1 f1Var, String str, h32.c1 c1Var, HashMap hashMap, boolean z13);

    h32.w0 x(String str, ArrayList arrayList);

    h32.w0 y(h32.g0 g0Var, h32.f1 f1Var, HashMap hashMap, ArrayList arrayList);

    void z(HashMap hashMap);
}
