package r41;

import com.pinterest.api.model.wy0;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.j3;
import dl1.s;
import java.util.Locale;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kt0.u;
import x02.x2;
import xk2.m;
import xk2.v;

/* loaded from: classes5.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final k f106176a = new k();

    /* renamed from: b, reason: collision with root package name */
    public static final v f106177b = m.b(j.f106173k);

    /* renamed from: c, reason: collision with root package name */
    public static final u f106178c = new u(3);

    /* renamed from: d, reason: collision with root package name */
    public static final u f106179d = new u(4);

    /* renamed from: e, reason: collision with root package name */
    public static final v f106180e = m.b(j.f106172j);

    /* renamed from: f, reason: collision with root package name */
    public static final v f106181f = m.b(j.f106174l);

    public static NavigationImpl a(wy0 wy0Var) {
        String j23;
        String j24;
        if (wy0Var == null) {
            return null;
        }
        Intrinsics.checkNotNullParameter(wy0Var, "<this>");
        Boolean t33 = wy0Var.t3();
        Intrinsics.checkNotNullExpressionValue(t33, "getIsAdsOnlyProfile(...)");
        if (!t33.booleanValue() || (j23 = wy0Var.j2()) == null || j23.length() == 0 || (j24 = wy0Var.j2()) == null) {
            return null;
        }
        return Navigation.z0((ScreenLocation) j3.f51013a.getValue(), j24);
    }

    public static Pair b(String str) {
        b60.b bVar = (b60.b) f106179d.get();
        x2 x2Var = (x2) f106178c.get();
        wy0 f13 = ((b60.d) bVar).f();
        s sVar = null;
        if (f13 != null) {
            if (!Intrinsics.d(str, f13.getId())) {
                f13 = null;
            }
            sVar = f13;
        }
        if (sVar == null) {
            sVar = x2Var.O(str);
        }
        wy0 wy0Var = (wy0) sVar;
        return (wy0Var == null || !Intrinsics.d(wy0Var.u4(), Boolean.TRUE)) ? (Pair) f106181f.getValue() : (Pair) f106180e.getValue();
    }

    public static NavigationImpl c(k kVar, String userId, b aopOrigin, g origin, u32.i iVar, int i13) {
        if ((i13 & 2) != 0) {
            aopOrigin = b.Unknown;
        }
        if ((i13 & 4) != 0) {
            origin = g.Other;
        }
        if ((i13 & 16) != 0) {
            iVar = null;
        }
        kVar.getClass();
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(aopOrigin, "aopOrigin");
        Intrinsics.checkNotNullParameter(origin, "origin");
        Pair b13 = b(userId);
        ScreenLocation screenLocation = (ScreenLocation) b13.f80346a;
        e eVar = (e) b13.f80347b;
        NavigationImpl z03 = Navigation.z0(screenLocation, userId);
        z03.z(aopOrigin.ordinal(), "ADS_ONLY_PROFILE_ORIGIN");
        z03.z(origin.ordinal(), "PROFILE_NAVIGATION_ORIGIN");
        z03.z(eVar.ordinal(), "PROFILE_DISPLAY");
        if (Intrinsics.d(screenLocation, (ScreenLocation) j3.f51014b.getValue()) && iVar != null) {
            String name = iVar.name();
            Locale locale = Locale.ROOT;
            z03.m0("com.pinterest.EXTRA_PROFILE_TAB", ep.b.l(locale, "ROOT", name, locale, "toLowerCase(...)"));
        }
        Intrinsics.checkNotNullExpressionValue(z03, "apply(...)");
        return z03;
    }

    public final void d(String userId, b aopOrigin) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(aopOrigin, "aopOrigin");
        m60.u.f85943a.d(c(this, userId, aopOrigin, null, null, 28));
    }
}
