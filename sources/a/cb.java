package a;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.google.gson.reflect.TypeToken;
import com.pinterest.api.model.wy0;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract /* synthetic */ class cb {
    public static int A(int i13, int i14, int i15, int i16) {
        return androidx.datastore.preferences.protobuf.q.F(i13) + i14 + i15 + i16;
    }

    public static int B(int i13, int i14, int i15, int i16) {
        return ((i13 * i14) / i15) + i16;
    }

    public static int C(int i13, int i14, int i15, int i16) {
        return com.google.protobuf.u.D(i13) + i14 + i15 + i16;
    }

    public static float a(float f13, float f14, float f15, float f16) {
        return (f15 - (f13 * f14)) / f16;
    }

    public static int b(float f13, float f14, float f15) {
        return Math.round((f13 + f14) * f15);
    }

    public static int c(int i13, int i14, int i15, int i16) {
        return ((i13 / i14) * i15) + i16;
    }

    public static int d(String str, int i13, int i14) {
        return (str.hashCode() + i13) * i14;
    }

    public static Object e(Class cls) {
        return df.j1.b0(cls, m60.f0.X().getApplicationContext());
    }

    public static String f(RecyclerView recyclerView, StringBuilder sb3) {
        sb3.append(recyclerView.z0());
        return sb3.toString();
    }

    public static String g(String str) {
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, str);
        return uuid;
    }

    public static String h(String str, float f13, String str2) {
        return str + f13 + str2;
    }

    public static String i(String str, int i13) {
        return str + i13;
    }

    public static String j(String str, int i13, String str2, int i14, String str3) {
        return str + i13 + str2 + i14 + str3;
    }

    public static String k(String str, Fragment fragment, String str2) {
        return str + fragment + str2;
    }

    public static String l(StringBuilder sb3, int i13, char c13) {
        sb3.append(i13);
        sb3.append(c13);
        return sb3.toString();
    }

    public static String m(StringBuilder sb3, boolean z13, char c13) {
        sb3.append(z13);
        sb3.append(c13);
        return sb3.toString();
    }

    public static String n(kotlin.jvm.internal.l0 l0Var, Class cls, StringBuilder sb3) {
        sb3.append(l0Var.b(cls));
        return sb3.toString();
    }

    public static StringBuilder o(String str, String str2, String str3) {
        StringBuilder sb3 = new StringBuilder(str);
        sb3.append(str2);
        sb3.append(str3);
        return sb3;
    }

    public static nm.m p(Class cls, nm.o oVar) {
        return oVar.g(new TypeToken(cls)).b();
    }

    public static nm.m q(nm.o oVar, Class cls) {
        oVar.getClass();
        return oVar.g(new TypeToken(cls)).b();
    }

    public static uk2.f r(String str) {
        uk2.f fVar = new uk2.f();
        Intrinsics.checkNotNullExpressionValue(fVar, str);
        return fVar;
    }

    public static void s(int i13, int i14, int i15, int i16, int i17) {
        d7.n0.Q(i13);
        d7.n0.Q(i14);
        d7.n0.Q(i15);
        d7.n0.Q(i16);
        d7.n0.Q(i17);
    }

    public static void t(String str, int i13, String str2) {
        d7.u.g(str2, str + i13);
    }

    public static void u(String str, String str2, String str3) {
        d7.u.g(str3, str + str2);
    }

    public static void v(StringBuilder sb3, String str, long j13, String str2) {
        sb3.append(str);
        sb3.append(j13);
        sb3.append(str2);
    }

    public static /* synthetic */ void w(pc.c0 c0Var) {
        if (c0Var != null) {
            throw new ClassCastException();
        }
    }

    public static void x(yb0.n nVar, m60.w wVar) {
        wVar.d(new yb0.e(nVar));
    }

    public static boolean y(wy0 wy0Var, String str) {
        Boolean O3 = wy0Var.O3();
        Intrinsics.checkNotNullExpressionValue(O3, str);
        return O3.booleanValue();
    }

    public static boolean z(um.a aVar, String str) {
        String k03 = aVar.k0();
        k03.getClass();
        return k03.equals(str);
    }
}
