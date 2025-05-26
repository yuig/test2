package t3;

import android.view.View;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract /* synthetic */ class s1 {
    public static Object a(Function1 function1, String str, uj2.q qVar, String str2, uj2.q qVar2) {
        Intrinsics.checkNotNullParameter(function1, str);
        Intrinsics.checkNotNullParameter(qVar, str2);
        return function1.invoke(qVar2);
    }

    public static String b(String str, String str2, char c13) {
        return str + str2 + c13;
    }

    public static String c(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    public static String d(Object[] objArr, int i13, String str, String str2) {
        String format = String.format(str, Arrays.copyOf(objArr, i13));
        Intrinsics.checkNotNullExpressionValue(format, str2);
        return format;
    }

    public static String e(Object[] objArr, int i13, Locale locale, String str, String str2) {
        String format = String.format(locale, str, Arrays.copyOf(objArr, i13));
        Intrinsics.checkNotNullExpressionValue(format, str2);
        return format;
    }

    public static jk2.l1 f(jk2.x xVar, String str) {
        jk2.l1 A = xVar.A(wj2.c.a());
        Intrinsics.checkNotNullExpressionValue(A, str);
        return A;
    }

    public static pc.r g(zy.b0 b0Var, String str, String str2, String str3) {
        pc.r b13 = pc.o.b(b0Var.c());
        Intrinsics.checkNotNullParameter(str, str2);
        Intrinsics.checkNotNullParameter(b13, str3);
        return b13;
    }

    public static uk2.d h(String str) {
        uk2.d dVar = new uk2.d();
        Intrinsics.checkNotNullExpressionValue(dVar, str);
        return dVar;
    }

    public static xk2.k i(SbaPinRep sbaPinRep, int i13, xk2.n nVar) {
        return xk2.m.a(nVar, new ti1.v(sbaPinRep, i13));
    }

    public static yk1.m j(View view) {
        yk1.j.a().getClass();
        return yk1.j.b(view);
    }

    public static boolean k(vm2.b bVar, int i13, String str) {
        Boolean c13 = bVar.c(i13);
        Intrinsics.checkNotNullExpressionValue(c13, str);
        return c13.booleanValue();
    }
}
