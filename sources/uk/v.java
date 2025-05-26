package uk;

import il.a5;
import il.l4;
import il.o5;
import il.u4;
import il.v4;
import il.x4;
import il.y4;
import il.z4;
import java.nio.charset.Charset;

/* loaded from: classes3.dex */
public abstract class v {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f122377a = 0;

    static {
        Charset.forName("UTF-8");
    }

    public static a5 a(v4 v4Var) {
        x4 C = a5.C();
        int F = v4Var.F();
        C.g();
        a5.A((a5) C.f33596b, F);
        for (u4 u4Var : v4Var.E()) {
            y4 E = z4.E();
            String F2 = u4Var.E().F();
            E.g();
            z4.A((z4) E.f33596b, F2);
            l4 H = u4Var.H();
            E.g();
            z4.C((z4) E.f33596b, H);
            o5 G = u4Var.G();
            E.g();
            z4.B((z4) E.f33596b, G);
            int F3 = u4Var.F();
            E.g();
            z4.D((z4) E.f33596b, F3);
            z4 z4Var = (z4) E.a();
            C.g();
            a5.B((a5) C.f33596b, z4Var);
        }
        return (a5) C.a();
    }
}
