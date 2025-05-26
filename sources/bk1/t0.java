package bk1;

import com.pinterest.api.model.f30;
import h32.d4;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class t0 implements v0 {

    /* renamed from: a, reason: collision with root package name */
    public final f30 f23328a;

    /* renamed from: b, reason: collision with root package name */
    public final h32.g0 f23329b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f23330c;

    /* renamed from: d, reason: collision with root package name */
    public final int f23331d;

    /* renamed from: e, reason: collision with root package name */
    public final h32.i0 f23332e;

    /* renamed from: f, reason: collision with root package name */
    public final h32.i0 f23333f;

    /* renamed from: g, reason: collision with root package name */
    public final String f23334g;

    /* renamed from: h, reason: collision with root package name */
    public final h32.c1 f23335h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f23336i;

    /* renamed from: j, reason: collision with root package name */
    public final d4 f23337j;

    /* renamed from: k, reason: collision with root package name */
    public final String f23338k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f23339l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f23340m;

    /* renamed from: n, reason: collision with root package name */
    public final h32.c1 f23341n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f23342o;

    public t0(f30 pin, h32.g0 componentType, HashMap auxData, int i13, h32.i0 i0Var, h32.i0 i0Var2, String str, h32.c1 eventData, boolean z13, d4 viewType, String str2, boolean z14, boolean z15, h32.c1 c1Var, boolean z16) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(componentType, "componentType");
        Intrinsics.checkNotNullParameter(auxData, "auxData");
        Intrinsics.checkNotNullParameter(eventData, "eventData");
        Intrinsics.checkNotNullParameter(viewType, "viewType");
        this.f23328a = pin;
        this.f23329b = componentType;
        this.f23330c = auxData;
        this.f23331d = i13;
        this.f23332e = i0Var;
        this.f23333f = i0Var2;
        this.f23334g = str;
        this.f23335h = eventData;
        this.f23336i = z13;
        this.f23337j = viewType;
        this.f23338k = str2;
        this.f23339l = z14;
        this.f23340m = z15;
        this.f23341n = c1Var;
        this.f23342o = z16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        return Intrinsics.d(this.f23328a, t0Var.f23328a) && this.f23329b == t0Var.f23329b && Intrinsics.d(this.f23330c, t0Var.f23330c) && this.f23331d == t0Var.f23331d && Intrinsics.d(this.f23332e, t0Var.f23332e) && Intrinsics.d(this.f23333f, t0Var.f23333f) && Intrinsics.d(this.f23334g, t0Var.f23334g) && Intrinsics.d(this.f23335h, t0Var.f23335h) && this.f23336i == t0Var.f23336i && this.f23337j == t0Var.f23337j && Intrinsics.d(this.f23338k, t0Var.f23338k) && this.f23339l == t0Var.f23339l && this.f23340m == t0Var.f23340m && Intrinsics.d(this.f23341n, t0Var.f23341n) && this.f23342o == t0Var.f23342o;
    }

    public final HashMap getAuxData() {
        return this.f23330c;
    }

    public final int hashCode() {
        int b13 = ep.b.b(this.f23331d, a.c.d(this.f23330c, (this.f23329b.hashCode() + (this.f23328a.hashCode() * 31)) * 31, 31), 31);
        h32.i0 i0Var = this.f23332e;
        int hashCode = (b13 + (i0Var == null ? 0 : i0Var.hashCode())) * 31;
        h32.i0 i0Var2 = this.f23333f;
        int hashCode2 = (hashCode + (i0Var2 == null ? 0 : i0Var2.hashCode())) * 31;
        String str = this.f23334g;
        int hashCode3 = (this.f23337j.hashCode() + ep.b.e(this.f23336i, (this.f23335h.hashCode() + ((hashCode2 + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31)) * 31;
        String str2 = this.f23338k;
        int e13 = ep.b.e(this.f23340m, ep.b.e(this.f23339l, (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31);
        h32.c1 c1Var = this.f23341n;
        return Boolean.hashCode(this.f23342o) + ((e13 + (c1Var != null ? c1Var.hashCode() : 0)) * 31);
    }

    public final h32.i0 j() {
        return this.f23332e;
    }

    public final h32.i0 k() {
        return this.f23333f;
    }

    public final h32.c1 l() {
        return this.f23341n;
    }

    public final h32.g0 m() {
        return this.f23329b;
    }

    public final h32.c1 n() {
        return this.f23335h;
    }

    public final String o() {
        return this.f23338k;
    }

    public final f30 p() {
        return this.f23328a;
    }

    public final int q() {
        return this.f23331d;
    }

    public final boolean r() {
        return this.f23336i;
    }

    public final String s() {
        return this.f23334g;
    }

    public final d4 t() {
        return this.f23337j;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("OpenOneTap(pin=");
        sb3.append(this.f23328a);
        sb3.append(", componentType=");
        sb3.append(this.f23329b);
        sb3.append(", auxData=");
        sb3.append(this.f23330c);
        sb3.append(", pinPosition=");
        sb3.append(this.f23331d);
        sb3.append(", analyticContext=");
        sb3.append(this.f23332e);
        sb3.append(", analyticContextForClickthrough=");
        sb3.append(this.f23333f);
        sb3.append(", uniqueScreenKey=");
        sb3.append(this.f23334g);
        sb3.append(", eventData=");
        sb3.append(this.f23335h);
        sb3.append(", skipToCloseup=");
        sb3.append(this.f23336i);
        sb3.append(", viewType=");
        sb3.append(this.f23337j);
        sb3.append(", insertionId=");
        sb3.append(this.f23338k);
        sb3.append(", isDLCollection=");
        sb3.append(this.f23339l);
        sb3.append(", isParentPin=");
        sb3.append(this.f23340m);
        sb3.append(", collectionItemEventData=");
        sb3.append(this.f23341n);
        sb3.append(", isAdsAndroidInternalLinkEnabled=");
        return a.a.r(sb3, this.f23342o, ")");
    }

    public final boolean u() {
        return this.f23339l;
    }

    public final boolean v() {
        return this.f23340m;
    }
}
