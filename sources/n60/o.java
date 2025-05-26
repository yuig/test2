package n60;

import android.net.Uri;
import android.os.Bundle;
import com.google.gson.reflect.TypeToken;
import com.pinterest.api.model.f30;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import pc.w;
import pq2.c1;
import so.jb;
import so.na;
import so.oa;
import so.r8;
import so.s8;
import so.w8;
import zy.b0;

/* loaded from: classes.dex */
public abstract /* synthetic */ class o {
    public static void A(x92.b bVar, String str, String str2, String str3, String str4) {
        bVar.h(str, str2);
        bVar.e(str3);
        bVar.e(str4);
    }

    public static boolean B(f30 f30Var, String str) {
        Boolean d53 = f30Var.d5();
        Intrinsics.checkNotNullExpressionValue(d53, str);
        return d53.booleanValue();
    }

    public static void C(x92.b bVar, String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(bVar, str);
        bVar.e(str2);
        bVar.e(str3);
        bVar.e(str4);
    }

    public static Bundle a(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString(str, str2);
        return bundle;
    }

    public static bf2.d c(oa oaVar, int i13) {
        return bf2.b.b(new na(oaVar, i13));
    }

    public static bf2.d d(oa oaVar, s8 s8Var, int i13) {
        return bf2.e.a(new r8(oaVar, s8Var, i13));
    }

    public static bf2.d e(oa oaVar, s8 s8Var, jb jbVar, int i13, int i14) {
        return bf2.e.a(new w8(oaVar, s8Var, jbVar, i13, i14));
    }

    public static TypeToken f(Class cls, String str) {
        TypeToken typeToken = new TypeToken(cls);
        Intrinsics.checkNotNullExpressionValue(typeToken, str);
        return typeToken;
    }

    public static NullPointerException g(Throwable th3, String str, Throwable th4) {
        bp1.h.H(th3);
        NullPointerException nullPointerException = new NullPointerException(str);
        nullPointerException.initCause(th4);
        return nullPointerException;
    }

    public static Object h(c1 c1Var, rq2.a aVar, Class cls, String str) {
        c1Var.b(aVar);
        Object b13 = c1Var.d().b(cls);
        Intrinsics.checkNotNullExpressionValue(b13, str);
        return b13;
    }

    public static StringBuilder i(String str) {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str);
        return sb3;
    }

    public static Iterator j(List list, fo.a aVar, byte b13) {
        aVar.k(b13, list.size());
        return list.iterator();
    }

    public static p00.d k(rz.e eVar, String str, String str2) {
        p00.d dVar = new p00.d();
        Intrinsics.checkNotNullParameter(eVar, str);
        Intrinsics.checkNotNullParameter(dVar, str2);
        return dVar;
    }

    public static w l(a10.e eVar, String str, String str2, String str3) {
        w y13 = eVar.y();
        Intrinsics.checkNotNullParameter(str, str2);
        Intrinsics.checkNotNullParameter(y13, str3);
        return y13;
    }

    public static w m(b0 b0Var, String str, String str2, String str3) {
        w c13 = b0Var.c();
        Intrinsics.checkNotNullParameter(str, str2);
        Intrinsics.checkNotNullParameter(c13, str3);
        return c13;
    }

    public static rq2.a n(oa oaVar, c1 c1Var, String str, p00.b bVar, String str2) {
        rq2.a J2 = oaVar.J2();
        Intrinsics.checkNotNullParameter(c1Var, str);
        Intrinsics.checkNotNullParameter(bVar, str2);
        return J2;
    }

    public static vd0.a o(vd0.c cVar, String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(cVar, str);
        vd0.a k13 = cVar.k(str2);
        Intrinsics.checkNotNullExpressionValue(k13, str3);
        return k13;
    }

    public static xk2.v p(s sVar, int i13) {
        return xk2.m.b(new q(sVar, i13));
    }

    public static void q(fo.a aVar, String str, int i13, byte b13, Integer num) {
        aVar.e(str, i13, b13);
        aVar.g(num.intValue());
    }

    public static void r(fo.a aVar, String str, int i13, byte b13, Long l13) {
        aVar.e(str, i13, b13);
        aVar.h(l13.longValue());
    }

    public static void s(fo.a aVar, String str, int i13, byte b13, Short sh3) {
        aVar.e(str, i13, b13);
        aVar.f(sh3.shortValue());
    }

    public static /* synthetic */ void t(Object obj) {
        throw new ClassCastException();
    }

    public static void u(rq2.a aVar, String str, c1 c1Var, rz.c cVar, p00.b bVar) {
        Intrinsics.checkNotNullParameter(aVar, str);
        c1Var.a(cVar);
        c1Var.b(bVar);
    }

    public static void v(x92.b bVar, String str, String str2, String str3) {
        bVar.e(str);
        bVar.e(str2);
        bVar.e(str3);
    }

    public static void w(x92.b bVar, String str, String str2, String str3, String str4) {
        bVar.e(str);
        bVar.e(str2);
        bVar.e(str3);
        bVar.e(str4);
    }

    public static boolean x(Uri uri, int i13, String str) {
        return Intrinsics.d(uri.getPathSegments().get(i13), str);
    }

    public static boolean y(f30 f30Var, String str) {
        Boolean i53 = f30Var.i5();
        Intrinsics.checkNotNullExpressionValue(i53, str);
        return i53.booleanValue();
    }

    public static bf2.d z(oa oaVar, int i13) {
        return bf2.e.a(new na(oaVar, i13));
    }
}
