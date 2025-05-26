package ra0;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h0 {

    /* renamed from: d, reason: collision with root package name */
    public static final int f106932d = 2;

    /* renamed from: g, reason: collision with root package name */
    public static final long f106935g;

    /* renamed from: h, reason: collision with root package name */
    public static final long f106936h;

    /* renamed from: i, reason: collision with root package name */
    public static final long f106937i;

    /* renamed from: j, reason: collision with root package name */
    public static final long f106938j;

    /* renamed from: k, reason: collision with root package name */
    public static final long f106939k;

    /* renamed from: l, reason: collision with root package name */
    public static final List f106940l;

    /* renamed from: m, reason: collision with root package name */
    public static final List f106941m;

    /* renamed from: n, reason: collision with root package name */
    public static final HashMap f106942n;

    /* renamed from: o, reason: collision with root package name */
    public static final ArrayList f106943o;

    /* renamed from: p, reason: collision with root package name */
    public static final u f106944p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f106945q;

    /* renamed from: a, reason: collision with root package name */
    public static final float f106929a = 44;

    /* renamed from: b, reason: collision with root package name */
    public static final float f106930b = 3;

    /* renamed from: c, reason: collision with root package name */
    public static final float f106931c = 7;

    /* renamed from: e, reason: collision with root package name */
    public static final float f106933e = -4;

    /* renamed from: f, reason: collision with root package name */
    public static final float f106934f = 0;

    static {
        long d2 = androidx.compose.ui.graphics.a.d(4293801834L);
        long d13 = androidx.compose.ui.graphics.a.d(4293608002L);
        long d14 = androidx.compose.ui.graphics.a.d(4294408760L);
        long d15 = androidx.compose.ui.graphics.a.d(4294822144L);
        long d16 = androidx.compose.ui.graphics.a.d(4280135013L);
        long d17 = androidx.compose.ui.graphics.a.d(4280729780L);
        long d18 = androidx.compose.ui.graphics.a.d(4278200678L);
        long d19 = androidx.compose.ui.graphics.a.d(4278222079L);
        long d23 = androidx.compose.ui.graphics.a.d(4288571647L);
        long d24 = androidx.compose.ui.graphics.a.d(4294872753L);
        long d25 = androidx.compose.ui.graphics.a.d(4294753211L);
        long d26 = androidx.compose.ui.graphics.a.d(4294952335L);
        long d27 = androidx.compose.ui.graphics.a.d(4294966674L);
        long d28 = androidx.compose.ui.graphics.a.d(4289001900L);
        long d29 = androidx.compose.ui.graphics.a.d(4291622638L);
        long d33 = androidx.compose.ui.graphics.a.d(4289453055L);
        long d34 = androidx.compose.ui.graphics.a.d(4292200447L);
        long d35 = androidx.compose.ui.graphics.a.d(4294959081L);
        long d36 = androidx.compose.ui.graphics.a.d(4279308561L);
        f106935g = d36;
        long d37 = androidx.compose.ui.graphics.a.d(4284440415L);
        long d38 = androidx.compose.ui.graphics.a.d(4289045925L);
        long d39 = androidx.compose.ui.graphics.a.d(4293519849L);
        long d43 = androidx.compose.ui.graphics.a.d(4294967295L);
        f106936h = d43;
        long d44 = androidx.compose.ui.graphics.a.d(4283512096L);
        long d45 = androidx.compose.ui.graphics.a.d(4285876005L);
        long d46 = androidx.compose.ui.graphics.a.d(4289890408L);
        long d47 = androidx.compose.ui.graphics.a.d(4293117852L);
        long d48 = androidx.compose.ui.graphics.a.d(4293910471L);
        long d49 = androidx.compose.ui.graphics.a.d(4290398265L);
        long d53 = androidx.compose.ui.graphics.a.d(4290605097L);
        long d54 = androidx.compose.ui.graphics.a.d(4290618665L);
        long d55 = androidx.compose.ui.graphics.a.d(4285168172L);
        long d56 = androidx.compose.ui.graphics.a.d(4281620527L);
        long d57 = androidx.compose.ui.graphics.a.d(4281687395L);
        long d58 = androidx.compose.ui.graphics.a.d(4283519608L);
        long d59 = androidx.compose.ui.graphics.a.d(4285481058L);
        long d63 = androidx.compose.ui.graphics.a.d(4287977310L);
        f106937i = androidx.compose.ui.graphics.a.d(4294046193L);
        f106938j = b3.w.f21389m;
        f106939k = d36;
        List j13 = kotlin.collections.f0.j(new b3.w(d2), new b3.w(d13), new b3.w(d14), new b3.w(d15), new b3.w(d16), new b3.w(d17), new b3.w(d18), new b3.w(d19), new b3.w(d23), new b3.w(d24), new b3.w(d25), new b3.w(d26), new b3.w(d27), new b3.w(d28), new b3.w(d29), new b3.w(d33), new b3.w(d34), new b3.w(d35));
        f106940l = j13;
        List j14 = kotlin.collections.f0.j(new b3.w(d36), new b3.w(d37), new b3.w(d38), new b3.w(d39), new b3.w(d43), new b3.w(d44), new b3.w(d45), new b3.w(d46), new b3.w(d47), new b3.w(d48), new b3.w(d49), new b3.w(d53), new b3.w(d54), new b3.w(d55), new b3.w(d56), new b3.w(d57), new b3.w(d58), new b3.w(d59), new b3.w(d63));
        f106941m = j14;
        f106942n = kotlin.collections.z0.f(new Pair(new b3.w(d2), "Pink Flaminglow"), new Pair(new b3.w(d13), "Red Pushpin"), new Pair(new b3.w(d14), "Orange Firetini"), new Pair(new b3.w(d15), "Yellow Carmellow"), new Pair(new b3.w(d16), "Green Matchacado"), new Pair(new b3.w(d17), "Teal Spabattical"), new Pair(new b3.w(d18), "Blue Skycicle"), new Pair(new b3.w(d19), "Blue Skycicle"), new Pair(new b3.w(d23), "Purple Mysticool"), new Pair(new b3.w(d24), "Pink Flaminglow"), new Pair(new b3.w(d25), "Red Pushpin"), new Pair(new b3.w(d26), "Orange Firetini"), new Pair(new b3.w(d27), "Yellow Carmellow"), new Pair(new b3.w(d28), "Green Matchacado"), new Pair(new b3.w(d29), "Teal Spabattical"), new Pair(new b3.w(d33), "Blue Skycicle"), new Pair(new b3.w(d34), "Purple Mysticool"), new Pair(new b3.w(d35), "Pink Flaminglow"), new Pair(new b3.w(d36), "Black Cosmicore"), new Pair(new b3.w(d37), "Gray Roboflow"), new Pair(new b3.w(d38), "Gray Roboflow"), new Pair(new b3.w(d39), "Gray Roboflow"), new Pair(new b3.w(d43), "White Mochimalist"), new Pair(new b3.w(d44), "Brown Darkest"), new Pair(new b3.w(d45), "Brown Dark"), new Pair(new b3.w(d46), "Brown Lighter"), new Pair(new b3.w(d47), "Brown Light"), new Pair(new b3.w(d48), "Brown Lightest"), new Pair(new b3.w(d49), "Red Dark"), new Pair(new b3.w(d53), "Orange Dark"), new Pair(new b3.w(d54), "Yellow Dark"), new Pair(new b3.w(d55), "Green Dark"), new Pair(new b3.w(d56), "Green Darker"), new Pair(new b3.w(d57), "Teal Dark"), new Pair(new b3.w(d58), "Blue Dark"), new Pair(new b3.w(d59), "Purple Dark"), new Pair(new b3.w(d63), "Pink Dark"));
        ArrayList N0 = CollectionsKt.N0(j13, j14);
        ArrayList selectableColors = new ArrayList();
        Iterator it = N0.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            kotlin.collections.k0.u(kotlin.collections.f0.j(new b3.w(((b3.w) pair.f80346a).f21392a), new b3.w(((b3.w) pair.f80347b).f21392a)), selectableColors);
        }
        f106943o = selectableColors;
        Intrinsics.checkNotNullParameter(selectableColors, "selectableColors");
        yk2.b bVar = new yk2.b();
        ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(selectableColors, 10));
        Iterator it2 = selectableColors.iterator();
        while (it2.hasNext()) {
            long j15 = ((b3.w) it2.next()).f21392a;
            arrayList.add(new z(new e0(j15, (String) f106942n.get(new b3.w(j15)))));
        }
        bVar.addAll(arrayList);
        yk2.b cells = kotlin.collections.e0.a(bVar);
        Intrinsics.checkNotNullParameter(cells, "cells");
        f106944p = new u(cells, w.f107019a);
        f106945q = 8;
    }

    public static m a(float f13, i0 i0Var, i0 i0Var2, i2.o oVar, int i13) {
        i2.s sVar = (i2.s) oVar;
        sVar.W(1183405296);
        sVar.W(179691236);
        boolean z13 = true;
        boolean z14 = ((((i13 & 14) ^ 6) > 4 && sVar.e(f13)) || (i13 & 6) == 4) | ((((i13 & RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER) ^ 48) > 32 && sVar.h(i0Var)) || (i13 & 48) == 32);
        if ((((i13 & 896) ^ 384) <= 256 || !sVar.h(i0Var2)) && (i13 & 384) != 256) {
            z13 = false;
        }
        boolean z15 = z14 | z13;
        Object J2 = sVar.J();
        if (z15 || J2 == i2.n.f71185a) {
            J2 = new m(f13, i0Var, i0Var2);
            sVar.g0(J2);
        }
        m mVar = (m) J2;
        sVar.r(false);
        sVar.r(false);
        return mVar;
    }

    public static v b(p1.y0 y0Var, i2.o oVar, int i13, int i14) {
        i2.s sVar = (i2.s) oVar;
        sVar.W(-1258836460);
        a0 c13 = c(sVar);
        if ((i14 & 16) != 0) {
            y0Var = androidx.compose.foundation.layout.b.b(0.0f, 3);
        }
        p1.y0 y0Var2 = y0Var;
        sVar.W(635757851);
        boolean z13 = true;
        boolean z14 = (((i13 & 14) ^ 6) > 4 && sVar.h(c13)) || (i13 & 6) == 4;
        int i15 = (i13 & RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER) ^ 48;
        int i16 = f106932d;
        boolean z15 = z14 | ((i15 > 32 && sVar.f(i16)) || (i13 & 48) == 32);
        int i17 = (i13 & 896) ^ 384;
        float f13 = f106933e;
        boolean z16 = z15 | ((i17 > 256 && sVar.e(f13)) || (i13 & 384) == 256);
        int i18 = (i13 & 7168) ^ 3072;
        float f14 = f106934f;
        boolean z17 = z16 | ((i18 > 2048 && sVar.e(f14)) || (i13 & 3072) == 2048);
        if ((((57344 & i13) ^ 24576) <= 16384 || !sVar.h(y0Var2)) && (i13 & 24576) != 16384) {
            z13 = false;
        }
        boolean z18 = z17 | z13;
        Object J2 = sVar.J();
        if (z18 || J2 == i2.n.f71185a) {
            J2 = new v(c13, i16, f13, f14, y0Var2);
            sVar.g0(J2);
        }
        v vVar = (v) J2;
        sVar.r(false);
        sVar.r(false);
        return vVar;
    }

    public static a0 c(i2.o oVar) {
        i2.s sVar = (i2.s) oVar;
        sVar.W(1932132636);
        sVar.W(-1326784886);
        sVar.W(838518203);
        i0 i0Var = new i0(kh2.g0.h(eo1.b.color_themed_background_default, sVar), kh2.g0.h(eo1.b.color_themed_background_default, sVar));
        sVar.r(false);
        sVar.W(273425369);
        i0 i0Var2 = new i0(kh2.g0.h(eo1.b.color_themed_background_secondary_base, sVar), kh2.g0.h(eo1.b.color_themed_background_tertiary_strong, sVar));
        sVar.r(false);
        m a13 = a(f106930b, i0Var, i0Var2, sVar, 4096);
        sVar.r(false);
        sVar.W(468995183);
        sVar.W(-1578057610);
        i0 i0Var3 = new i0(kh2.g0.h(eo1.b.color_themed_background_secondary_base, sVar), kh2.g0.h(eo1.b.color_themed_background_secondary_base, sVar));
        sVar.r(false);
        sVar.W(-576375916);
        sVar.W(-1578057610);
        i0 i0Var4 = new i0(kh2.g0.h(eo1.b.color_themed_background_secondary_base, sVar), kh2.g0.h(eo1.b.color_themed_background_secondary_base, sVar));
        sVar.r(false);
        sVar.r(false);
        m a14 = a(f106931c, i0Var3, i0Var4, sVar, 4096);
        sVar.r(false);
        sVar.W(1475005660);
        float f13 = f106929a;
        boolean e13 = sVar.e(f13) | sVar.h(a13) | sVar.h(a14);
        Object J2 = sVar.J();
        if (e13 || J2 == i2.n.f71185a) {
            J2 = new a0(f13, a13, a14);
            sVar.g0(J2);
        }
        a0 a0Var = (a0) J2;
        sVar.r(false);
        sVar.r(false);
        return a0Var;
    }

    public static float d(a0 totalSize, i2.o oVar, int i13) {
        Intrinsics.checkNotNullParameter(totalSize, "$this$totalSize");
        i2.s sVar = (i2.s) oVar;
        sVar.W(-1062917024);
        sVar.W(-490672558);
        boolean z13 = (((i13 & 14) ^ 6) > 4 && sVar.h(totalSize)) || (i13 & 6) == 4;
        Object J2 = sVar.J();
        if (z13 || J2 == i2.n.f71185a) {
            n4.e eVar = new n4.e(((totalSize.f106892b.f106959a + totalSize.f106893c.f106959a) * 2) + totalSize.f106891a);
            sVar.g0(eVar);
            J2 = eVar;
        }
        float f13 = ((n4.e) J2).f89175a;
        sVar.r(false);
        sVar.r(false);
        return f13;
    }
}
