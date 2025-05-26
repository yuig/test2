package r72;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class k0 {

    /* renamed from: o, reason: collision with root package name */
    public static final k0 f106512o = new k0(false, false, false, false, 1.0f, e.f106461b, z.f106727b, i.f106496b, r.f106630b, null, 0.0d, 0.0d, null, null);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f106513a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f106514b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f106515c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f106516d;

    /* renamed from: e, reason: collision with root package name */
    public final float f106517e;

    /* renamed from: f, reason: collision with root package name */
    public final g f106518f;

    /* renamed from: g, reason: collision with root package name */
    public final i0 f106519g;

    /* renamed from: h, reason: collision with root package name */
    public final n f106520h;

    /* renamed from: i, reason: collision with root package name */
    public final s f106521i;

    /* renamed from: j, reason: collision with root package name */
    public final String f106522j;

    /* renamed from: k, reason: collision with root package name */
    public final double f106523k;

    /* renamed from: l, reason: collision with root package name */
    public final double f106524l;

    /* renamed from: m, reason: collision with root package name */
    public final e1 f106525m;

    /* renamed from: n, reason: collision with root package name */
    public final String f106526n;

    public k0(boolean z13, boolean z14, boolean z15, boolean z16, float f13, g alphaEffect, i0 motionEffect, n borderEffect, s filterEffect, String str, double d2, double d13, e1 e1Var, String str2) {
        Intrinsics.checkNotNullParameter(alphaEffect, "alphaEffect");
        Intrinsics.checkNotNullParameter(motionEffect, "motionEffect");
        Intrinsics.checkNotNullParameter(borderEffect, "borderEffect");
        Intrinsics.checkNotNullParameter(filterEffect, "filterEffect");
        this.f106513a = z13;
        this.f106514b = z14;
        this.f106515c = z15;
        this.f106516d = z16;
        this.f106517e = f13;
        this.f106518f = alphaEffect;
        this.f106519g = motionEffect;
        this.f106520h = borderEffect;
        this.f106521i = filterEffect;
        this.f106522j = str;
        this.f106523k = d2;
        this.f106524l = d13;
        this.f106525m = e1Var;
        this.f106526n = str2;
    }

    public static k0 a(k0 k0Var, boolean z13, boolean z14, boolean z15, boolean z16, float f13, g gVar, i0 i0Var, n nVar, s sVar, double d2, double d13, String str, int i13) {
        boolean z17 = (i13 & 1) != 0 ? k0Var.f106513a : z13;
        boolean z18 = (i13 & 2) != 0 ? k0Var.f106514b : z14;
        boolean z19 = (i13 & 4) != 0 ? k0Var.f106515c : z15;
        boolean z23 = (i13 & 8) != 0 ? k0Var.f106516d : z16;
        float f14 = (i13 & 16) != 0 ? k0Var.f106517e : f13;
        g alphaEffect = (i13 & 32) != 0 ? k0Var.f106518f : gVar;
        i0 motionEffect = (i13 & 64) != 0 ? k0Var.f106519g : i0Var;
        n borderEffect = (i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? k0Var.f106520h : nVar;
        s filterEffect = (i13 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? k0Var.f106521i : sVar;
        String str2 = k0Var.f106522j;
        double d14 = (i13 & 1024) != 0 ? k0Var.f106523k : d2;
        double d15 = (i13 & 2048) != 0 ? k0Var.f106524l : d13;
        e1 e1Var = k0Var.f106525m;
        String str3 = (i13 & 8192) != 0 ? k0Var.f106526n : str;
        k0Var.getClass();
        Intrinsics.checkNotNullParameter(alphaEffect, "alphaEffect");
        Intrinsics.checkNotNullParameter(motionEffect, "motionEffect");
        Intrinsics.checkNotNullParameter(borderEffect, "borderEffect");
        Intrinsics.checkNotNullParameter(filterEffect, "filterEffect");
        return new k0(z17, z18, z19, z23, f14, alphaEffect, motionEffect, borderEffect, filterEffect, str2, d14, d15, e1Var, str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        if (this.f106513a != k0Var.f106513a || this.f106514b != k0Var.f106514b || this.f106515c != k0Var.f106515c || this.f106516d != k0Var.f106516d || Float.compare(this.f106517e, k0Var.f106517e) != 0 || !Intrinsics.d(this.f106518f, k0Var.f106518f) || !Intrinsics.d(this.f106519g, k0Var.f106519g) || !Intrinsics.d(this.f106520h, k0Var.f106520h) || !Intrinsics.d(this.f106521i, k0Var.f106521i) || !Intrinsics.d(this.f106522j, k0Var.f106522j) || Double.compare(this.f106523k, k0Var.f106523k) != 0 || Double.compare(this.f106524l, k0Var.f106524l) != 0 || !Intrinsics.d(this.f106525m, k0Var.f106525m)) {
            return false;
        }
        String str = this.f106526n;
        String str2 = k0Var.f106526n;
        return str != null ? str2 != null && Intrinsics.d(str, str2) : str2 == null;
    }

    public final int hashCode() {
        int hashCode = (this.f106521i.hashCode() + ((this.f106520h.hashCode() + ((this.f106519g.hashCode() + ((this.f106518f.hashCode() + a.a.a(this.f106517e, ep.b.e(this.f106516d, ep.b.e(this.f106515c, ep.b.e(this.f106514b, Boolean.hashCode(this.f106513a) * 31, 31), 31), 31), 31)) * 31)) * 31)) * 31)) * 31;
        String str = this.f106522j;
        int a13 = a.c.a(this.f106524l, a.c.a(this.f106523k, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31);
        e1 e1Var = this.f106525m;
        int hashCode2 = (a13 + (e1Var == null ? 0 : e1Var.hashCode())) * 31;
        String str2 = this.f106526n;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("EffectData(isHidden=");
        sb3.append(this.f106515c);
        sb3.append(", isLocked=");
        sb3.append(this.f106516d);
        sb3.append(", alpha=");
        sb3.append(this.f106517e);
        sb3.append(", alphaEffect=");
        sb3.append(this.f106518f);
        sb3.append(", motionEffect=");
        sb3.append(this.f106519g);
        sb3.append(", borderEffect=");
        sb3.append(this.f106520h);
        sb3.append(", filterEffect=");
        sb3.append(this.f106521i);
        sb3.append(", backgroundColor=");
        return a.a.p(sb3, this.f106522j, ")");
    }
}
