package oe1;

import a.cb;
import h32.g0;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;
import uk1.d;

/* loaded from: classes5.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f94254a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f94255b;

    /* renamed from: c, reason: collision with root package name */
    public final ze1.c f94256c;

    /* renamed from: d, reason: collision with root package name */
    public final g0 f94257d;

    /* renamed from: e, reason: collision with root package name */
    public final d f94258e;

    /* renamed from: f, reason: collision with root package name */
    public final d0 f94259f;

    /* renamed from: g, reason: collision with root package name */
    public final int f94260g;

    /* renamed from: h, reason: collision with root package name */
    public final String f94261h;

    /* renamed from: i, reason: collision with root package name */
    public final String f94262i;

    /* renamed from: j, reason: collision with root package name */
    public final int f94263j;

    /* renamed from: k, reason: collision with root package name */
    public final String f94264k;

    /* renamed from: l, reason: collision with root package name */
    public final String f94265l;

    /* renamed from: m, reason: collision with root package name */
    public final d0 f94266m;

    /* renamed from: n, reason: collision with root package name */
    public final g0 f94267n;

    /* renamed from: o, reason: collision with root package name */
    public final HashMap f94268o;

    /* renamed from: p, reason: collision with root package name */
    public final ze1.c f94269p;

    /* renamed from: q, reason: collision with root package name */
    public final String f94270q;

    /* renamed from: r, reason: collision with root package name */
    public final String f94271r;

    /* renamed from: s, reason: collision with root package name */
    public final String f94272s;

    public b(HashMap storyImpressionAuxData, HashMap itemAuxData, ze1.c shoppingNavParams, g0 g0Var, d storyPresenterPinalytics, d0 storyPinalytics, int i13, String storyId, String str, int i14, String str2, String str3) {
        Intrinsics.checkNotNullParameter(storyImpressionAuxData, "storyImpressionAuxData");
        Intrinsics.checkNotNullParameter(itemAuxData, "itemAuxData");
        Intrinsics.checkNotNullParameter(shoppingNavParams, "shoppingNavParams");
        Intrinsics.checkNotNullParameter(storyPresenterPinalytics, "storyPresenterPinalytics");
        Intrinsics.checkNotNullParameter(storyPinalytics, "storyPinalytics");
        Intrinsics.checkNotNullParameter(storyId, "storyId");
        this.f94254a = storyImpressionAuxData;
        this.f94255b = itemAuxData;
        this.f94256c = shoppingNavParams;
        this.f94257d = g0Var;
        this.f94258e = storyPresenterPinalytics;
        this.f94259f = storyPinalytics;
        this.f94260g = i13;
        this.f94261h = storyId;
        this.f94262i = str;
        this.f94263j = i14;
        this.f94264k = str2;
        this.f94265l = str3;
        this.f94266m = storyPinalytics;
        this.f94267n = g0Var;
        this.f94268o = itemAuxData;
        this.f94269p = shoppingNavParams;
        this.f94270q = str2;
        this.f94271r = storyId;
        this.f94272s = str;
    }

    @Override // oe1.a
    public final d0 a() {
        return this.f94266m;
    }

    @Override // oe1.a
    public final String b() {
        return this.f94270q;
    }

    @Override // oe1.a
    public final String c() {
        return this.f94272s;
    }

    @Override // oe1.a
    public final String d() {
        return this.f94271r;
    }

    public final ze1.c e() {
        return this.f94269p;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f94254a, bVar.f94254a) && Intrinsics.d(this.f94255b, bVar.f94255b) && Intrinsics.d(this.f94256c, bVar.f94256c) && this.f94257d == bVar.f94257d && Intrinsics.d(this.f94258e, bVar.f94258e) && Intrinsics.d(this.f94259f, bVar.f94259f) && this.f94260g == bVar.f94260g && Intrinsics.d(this.f94261h, bVar.f94261h) && Intrinsics.d(this.f94262i, bVar.f94262i) && this.f94263j == bVar.f94263j && Intrinsics.d(this.f94264k, bVar.f94264k) && Intrinsics.d(this.f94265l, bVar.f94265l);
    }

    @Override // oe1.a
    public final HashMap getAuxData() {
        return this.f94268o;
    }

    @Override // oe1.a
    public final g0 getComponentType() {
        return this.f94267n;
    }

    public final int hashCode() {
        int hashCode = (this.f94256c.hashCode() + a.c.d(this.f94255b, this.f94254a.hashCode() * 31, 31)) * 31;
        g0 g0Var = this.f94257d;
        int d2 = cb.d(this.f94261h, ep.b.b(this.f94260g, (this.f94259f.hashCode() + ((this.f94258e.hashCode() + ((hashCode + (g0Var == null ? 0 : g0Var.hashCode())) * 31)) * 31)) * 31, 31), 31);
        String str = this.f94262i;
        int b13 = ep.b.b(this.f94263j, (d2 + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.f94264k;
        int hashCode2 = (b13 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f94265l;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("StoryLoggingData(storyImpressionAuxData=");
        sb3.append(this.f94254a);
        sb3.append(", itemAuxData=");
        sb3.append(this.f94255b);
        sb3.append(", shoppingNavParams=");
        sb3.append(this.f94256c);
        sb3.append(", storyComponentType=");
        sb3.append(this.f94257d);
        sb3.append(", storyPresenterPinalytics=");
        sb3.append(this.f94258e);
        sb3.append(", storyPinalytics=");
        sb3.append(this.f94259f);
        sb3.append(", storyPosition=");
        sb3.append(this.f94260g);
        sb3.append(", storyId=");
        sb3.append(this.f94261h);
        sb3.append(", storyClientTrackingParams=");
        sb3.append(this.f94262i);
        sb3.append(", itemCount=");
        sb3.append(this.f94263j);
        sb3.append(", storyShopSource=");
        sb3.append(this.f94264k);
        sb3.append(", userId=");
        return a.a.p(sb3, this.f94265l, ")");
    }
}
