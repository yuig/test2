package oy;

import ey.k3;
import h32.a4;
import h32.d4;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class k0 extends ey.v1 {

    /* renamed from: r, reason: collision with root package name */
    public static final Set f98115r = kotlin.collections.h1.f(i0.class, f0.class, g0.class, n0.class, m0.class, p0.class, o0.class, q0.class);

    /* renamed from: f, reason: collision with root package name */
    public final m60.w f98116f;

    /* renamed from: g, reason: collision with root package name */
    public String f98117g;

    /* renamed from: h, reason: collision with root package name */
    public s92.l f98118h;

    /* renamed from: i, reason: collision with root package name */
    public i0 f98119i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f98120j;

    /* renamed from: k, reason: collision with root package name */
    public final LinkedHashSet f98121k;

    /* renamed from: l, reason: collision with root package name */
    public final LinkedHashSet f98122l;

    /* renamed from: m, reason: collision with root package name */
    public final LinkedHashSet f98123m;

    /* renamed from: n, reason: collision with root package name */
    public final LinkedHashSet f98124n;

    /* renamed from: o, reason: collision with root package name */
    public d4 f98125o;

    /* renamed from: p, reason: collision with root package name */
    public a4 f98126p;

    /* renamed from: q, reason: collision with root package name */
    public final LinkedHashMap f98127q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(k3 perfLogger, m60.w eventManager) {
        super(perfLogger);
        Intrinsics.checkNotNullParameter(perfLogger, "perfLogger");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        this.f98116f = eventManager;
        this.f98118h = s92.l.USER_NAVIGATION;
        this.f98121k = new LinkedHashSet();
        this.f98122l = new LinkedHashSet();
        this.f98123m = new LinkedHashSet();
        this.f98124n = new LinkedHashSet();
        this.f98127q = new LinkedHashMap();
    }

    @Override // ey.v1
    public final Set b() {
        return f98115r;
    }

    @Override // ey.v1
    public final boolean o(ey.u1 e13) {
        String str;
        long j13;
        LinkedHashSet linkedHashSet;
        i0 i0Var;
        Intrinsics.checkNotNullParameter(e13, "e");
        boolean z13 = e13 instanceof n0;
        LinkedHashSet linkedHashSet2 = this.f98121k;
        if (z13) {
            String str2 = ((n0) e13).f60634c;
            if (str2 == null) {
                return true;
            }
            linkedHashSet2.add(str2);
            return true;
        }
        boolean z14 = e13 instanceof m0;
        LinkedHashSet linkedHashSet3 = this.f98123m;
        if (z14) {
            String str3 = ((m0) e13).f60634c;
            if (str3 == null) {
                return true;
            }
            linkedHashSet3.add(str3);
            return true;
        }
        boolean z15 = e13 instanceof p0;
        LinkedHashMap linkedHashMap = this.f98127q;
        LinkedHashSet linkedHashSet4 = this.f98122l;
        if (z15) {
            p0 p0Var = (p0) e13;
            String str4 = p0Var.f60634c;
            if (str4 == null) {
                return true;
            }
            linkedHashSet4.add(str4);
            linkedHashMap.put(str4, Long.valueOf(p0Var.f98166f));
            return true;
        }
        boolean z16 = e13 instanceof o0;
        LinkedHashSet linkedHashSet5 = this.f98124n;
        if (z16) {
            o0 o0Var = (o0) e13;
            String str5 = o0Var.f60634c;
            if (str5 == null) {
                return true;
            }
            linkedHashSet5.add(str5);
            linkedHashMap.put(str5, Long.valueOf(o0Var.f98158f));
            return true;
        }
        if (e13 instanceof q0) {
            String str6 = ((q0) e13).f60634c;
            if (str6 == null) {
                return true;
            }
            linkedHashSet2.remove(str6);
            linkedHashSet4.remove(str6);
            linkedHashSet3.remove(str6);
            linkedHashSet5.remove(str6);
            return true;
        }
        if (!super.o(e13)) {
            return false;
        }
        long c13 = e13.c();
        if (!(e13 instanceof i0)) {
            if (!(e13 instanceof f0)) {
                if (!(e13 instanceof g0)) {
                    return false;
                }
                if (!Intrinsics.d(this.f98117g, ((g0) e13).f60634c) || !d()) {
                    return true;
                }
                this.f98117g = null;
                w(s92.o.ABORTED, c13);
                return true;
            }
            String str7 = this.f98117g;
            f0 f0Var = (f0) e13;
            String str8 = f0Var.f60634c;
            if (!Intrinsics.d(str7, str8) || !d()) {
                return true;
            }
            this.f98117g = null;
            if (this.f98120j) {
                v(str8, c13, (j0) e13);
                if (!f0Var.f98043e) {
                    f("video.startup.end");
                }
            }
            Boolean bool = f0Var.f98044f;
            if (bool != null) {
                l("static_image_idea_pin", bool.booleanValue());
            }
            String str9 = f0Var.f98045g;
            if (str9 != null) {
                String lowerCase = str9.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                j("static_image_loaded_from", lowerCase);
            }
            w(s92.o.COMPLETE, c13);
            return true;
        }
        i0 i0Var2 = (i0) e13;
        String str10 = i0Var2.f60634c;
        if (str10 == null || str10.length() == 0) {
            return true;
        }
        if (Intrinsics.d(this.f98117g, str10)) {
            return true;
        }
        if (d()) {
            this.f98117g = null;
            str = str10;
            linkedHashSet = linkedHashSet5;
            i0Var = i0Var2;
            j13 = c13;
            a(s92.o.ABORTED, this.f98118h, i0Var2.f98075i, i0Var2.f98076j, c13, false);
        } else {
            str = str10;
            j13 = c13;
            linkedHashSet = linkedHashSet5;
            i0Var = i0Var2;
        }
        this.f98117g = str;
        this.f98118h = i0Var.f98071e;
        this.f98125o = i0Var.f98075i;
        this.f98126p = i0Var.f98076j;
        long j14 = j13;
        q(j14);
        this.f98119i = i0Var;
        boolean z17 = i0Var.f98073g;
        this.f98120j = z17;
        j("pin.id", str);
        l("autoplaying", i0Var.f98072f);
        l("video", z17);
        l("promoted", i0Var.f98074h);
        j0 j0Var = (j0) e13;
        if (!Intrinsics.d(this.f98117g, str) || !d()) {
            return true;
        }
        String concat = str.concat("-0");
        if (linkedHashSet2.contains(concat)) {
            w(s92.o.COMPLETE, j14);
        } else if (linkedHashSet4.contains(concat)) {
            Long l13 = (Long) linkedHashMap.get(concat);
            if (l13 != null) {
                i(l13.longValue(), "video.startup.latency");
            }
            v(str, j14, j0Var);
            w(s92.o.COMPLETE, j14);
        } else if (linkedHashSet3.contains(concat)) {
            w(s92.o.ERROR, j14);
        } else {
            if (!linkedHashSet.contains(concat)) {
                return true;
            }
            Long l14 = (Long) linkedHashMap.get(concat);
            if (l14 != null) {
                i(l14.longValue(), "video.startup.latency");
            }
            w(s92.o.ERROR, j14);
        }
        this.f98117g = null;
        return true;
    }

    public final void v(String str, long j13, j0 j0Var) {
        if (str == null || this.f98119i == null) {
            return;
        }
        h0 h0Var = new h0(str);
        t("perceived_video_load", h0Var.f60635d, h0Var.g(), h0Var);
        i0 i0Var = this.f98119i;
        Intrinsics.f(i0Var);
        q(i0Var.c());
        r(j13);
        t(j0Var.e(), str, j0Var.g(), j0Var);
        this.f98119i = null;
    }

    public final void w(s92.o oVar, long j13) {
        s92.l lVar = this.f98118h;
        if (this.f98125o == null) {
            this.f98125o = d4.STORY_PIN;
        }
        d4 d4Var = this.f98125o;
        if (this.f98126p == null) {
            this.f98126p = a4.PIN_CLOSEUP;
        }
        a(oVar, lVar, d4Var, this.f98126p, j13, false);
        this.f98116f.d(jy.d.f77704a);
    }
}
