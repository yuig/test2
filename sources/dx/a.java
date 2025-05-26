package dx;

import bs1.c;
import h32.a4;
import h32.d4;
import h32.f1;
import h32.g0;
import h32.i0;
import h32.u0;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.e0;
import nm.u;
import nx.d0;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final d0 f56412a;

    public a(d0 pinalytics) {
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        this.f56412a = pinalytics;
    }

    public static String b(Integer num, Integer num2, String str) {
        u uVar = new u();
        if (str == null) {
            str = "";
        }
        uVar.u("category_name", str);
        uVar.s(Integer.valueOf(num != null ? num.intValue() : -1), "category_total");
        uVar.s(Integer.valueOf(num2 != null ? num2.intValue() : -1), "category_index");
        String sVar = uVar.toString();
        Intrinsics.checkNotNullExpressionValue(sVar, "toString(...)");
        return sVar;
    }

    public final i0 a(g0 g0Var, u0 u0Var) {
        i0 source = this.f56412a.p();
        if (source == null) {
            return new i0(d4.PIN, a4.PIN_PRODUCT, null, g0Var, null, u0Var);
        }
        Intrinsics.checkNotNullParameter(source, "source");
        d4 d4Var = source.f67081a;
        if (d4Var == null) {
            d4Var = d4.PIN;
        }
        d4 d4Var2 = d4Var;
        a4 a4Var = source.f67082b;
        if (a4Var == null) {
            a4Var = a4.PIN_PRODUCT;
        }
        return new i0(d4Var2, a4Var, source.f67083c, g0Var, source.f67085e, u0Var);
    }

    public final void c() {
        f1 f1Var = f1.ADS_STL_ERROR;
        i0 a13 = a(null, null);
        HashMap hashMap = new HashMap();
        c.G1("fail_reason", "incorrect_category_coordinates", hashMap);
        this.f56412a.K(f1Var, null, a13, hashMap, false);
    }

    public final void d(Integer num, Integer num2, String str) {
        u0 u0Var = u0.ADS_STL_CATEGORY_ITEM;
        g0 g0Var = g0.ADS_STL_SHEET;
        HashMap hashMap = new HashMap();
        c.G1("3p_additional_data", b(num, num2, str), hashMap);
        Unit unit = Unit.f80348a;
        this.f56412a.h(g0Var, u0Var, hashMap);
    }

    public final void e(String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        f1 f1Var = f1.ADS_STL_ERROR;
        i0 a13 = a(null, null);
        HashMap hashMap = new HashMap();
        String C = e0.C(4096, msg);
        u uVar = new u();
        uVar.u("network_error", C);
        String sVar = uVar.toString();
        Intrinsics.checkNotNullExpressionValue(sVar, "toString(...)");
        c.G1("fail_reason", sVar, hashMap);
        this.f56412a.K(f1Var, null, a13, hashMap, false);
    }
}
