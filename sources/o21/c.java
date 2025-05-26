package o21;

import com.pinterest.api.model.f30;
import h32.g0;
import h32.u0;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;
import net.quikkly.android.utils.BitmapUtils;
import qa2.d0;
import uj2.q;

/* loaded from: classes5.dex */
public final class c extends tb.f {
    public final ic0.a A;
    public final boolean B;
    public final boolean C;

    /* renamed from: h, reason: collision with root package name */
    public final f30 f92801h;

    /* renamed from: i, reason: collision with root package name */
    public final int f92802i;

    /* renamed from: j, reason: collision with root package name */
    public final int f92803j;

    /* renamed from: k, reason: collision with root package name */
    public final int f92804k;

    /* renamed from: l, reason: collision with root package name */
    public final int f92805l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f92806m;

    /* renamed from: n, reason: collision with root package name */
    public final d0 f92807n;

    /* renamed from: o, reason: collision with root package name */
    public final nx.d0 f92808o;

    /* renamed from: p, reason: collision with root package name */
    public final q f92809p;

    /* renamed from: q, reason: collision with root package name */
    public final int f92810q;

    /* renamed from: r, reason: collision with root package name */
    public final k21.b f92811r;

    /* renamed from: s, reason: collision with root package name */
    public final HashMap f92812s;

    /* renamed from: t, reason: collision with root package name */
    public final g0 f92813t;

    /* renamed from: u, reason: collision with root package name */
    public final ze1.a f92814u;

    /* renamed from: v, reason: collision with root package name */
    public final ze1.b f92815v;

    /* renamed from: w, reason: collision with root package name */
    public final u0 f92816w;

    /* renamed from: x, reason: collision with root package name */
    public final Integer f92817x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f92818y;

    /* renamed from: z, reason: collision with root package name */
    public final String f92819z;

    public c(f30 pin, int i13, int i14, int i15, int i16, boolean z13, d0 pinActionHandler, nx.d0 pinalytics, q networkStateStream, int i17, k21.b bVar, HashMap hashMap, g0 g0Var, ze1.a aVar, ze1.b bVar2, u0 u0Var, Integer num, boolean z14, String str, ic0.a aVar2, boolean z15, boolean z16, int i18) {
        int i19 = (i18 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? x0.fixed_size_pin_overlay_text_see_all : i17;
        k21.b bVar3 = (i18 & 1024) != 0 ? null : bVar;
        HashMap hashMap2 = (i18 & 4096) != 0 ? null : hashMap;
        g0 g0Var2 = (i18 & 8192) != 0 ? null : g0Var;
        ze1.b bVar4 = (32768 & i18) != 0 ? null : bVar2;
        u0 u0Var2 = (65536 & i18) != 0 ? null : u0Var;
        Integer num2 = (131072 & i18) != 0 ? null : num;
        boolean z17 = (262144 & i18) != 0 ? false : z14;
        String str2 = (i18 & 524288) != 0 ? null : str;
        ic0.a aVar3 = (i18 & 1048576) != 0 ? null : aVar2;
        boolean z18 = (i18 & 2097152) != 0 ? false : z15;
        boolean z19 = (i18 & 4194304) != 0 ? true : z16;
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(pinActionHandler, "pinActionHandler");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        this.f92801h = pin;
        this.f92802i = i13;
        this.f92803j = i14;
        this.f92804k = i15;
        this.f92805l = i16;
        this.f92806m = z13;
        this.f92807n = pinActionHandler;
        this.f92808o = pinalytics;
        this.f92809p = networkStateStream;
        this.f92810q = i19;
        this.f92811r = bVar3;
        this.f92812s = hashMap2;
        this.f92813t = g0Var2;
        this.f92814u = aVar;
        this.f92815v = bVar4;
        this.f92816w = u0Var2;
        this.f92817x = num2;
        this.f92818y = z17;
        this.f92819z = str2;
        this.A = aVar3;
        this.B = z18;
        this.C = z19;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.d(this.f92801h, cVar.f92801h) && this.f92802i == cVar.f92802i && this.f92803j == cVar.f92803j && this.f92804k == cVar.f92804k && this.f92805l == cVar.f92805l && this.f92806m == cVar.f92806m && Intrinsics.d(this.f92807n, cVar.f92807n) && Intrinsics.d(this.f92808o, cVar.f92808o) && Intrinsics.d(this.f92809p, cVar.f92809p) && this.f92810q == cVar.f92810q && Intrinsics.d(this.f92811r, cVar.f92811r) && Intrinsics.d(null, null) && Intrinsics.d(this.f92812s, cVar.f92812s) && this.f92813t == cVar.f92813t && Intrinsics.d(this.f92814u, cVar.f92814u) && Intrinsics.d(this.f92815v, cVar.f92815v) && this.f92816w == cVar.f92816w && Intrinsics.d(this.f92817x, cVar.f92817x) && this.f92818y == cVar.f92818y && Intrinsics.d(this.f92819z, cVar.f92819z) && Intrinsics.d(this.A, cVar.A) && this.B == cVar.B && this.C == cVar.C;
    }

    public final int hashCode() {
        int b13 = ep.b.b(this.f92810q, (this.f92809p.hashCode() + ((this.f92808o.hashCode() + ((this.f92807n.hashCode() + ep.b.e(this.f92806m, ep.b.b(this.f92805l, ep.b.b(this.f92804k, ep.b.b(this.f92803j, ep.b.b(this.f92802i, this.f92801h.hashCode() * 31, 31), 31), 31), 31), 31)) * 31)) * 31)) * 31, 31);
        k21.b bVar = this.f92811r;
        int hashCode = (b13 + (bVar == null ? 0 : bVar.hashCode())) * 961;
        HashMap hashMap = this.f92812s;
        int hashCode2 = (hashCode + (hashMap == null ? 0 : hashMap.hashCode())) * 31;
        g0 g0Var = this.f92813t;
        int hashCode3 = (hashCode2 + (g0Var == null ? 0 : g0Var.hashCode())) * 31;
        ze1.a aVar = this.f92814u;
        int hashCode4 = (hashCode3 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        ze1.b bVar2 = this.f92815v;
        int hashCode5 = (hashCode4 + (bVar2 == null ? 0 : bVar2.hashCode())) * 31;
        u0 u0Var = this.f92816w;
        int hashCode6 = (hashCode5 + (u0Var == null ? 0 : u0Var.hashCode())) * 31;
        Integer num = this.f92817x;
        int e13 = ep.b.e(this.f92818y, (hashCode6 + (num == null ? 0 : num.hashCode())) * 31, 31);
        String str = this.f92819z;
        int hashCode7 = (e13 + (str == null ? 0 : str.hashCode())) * 31;
        ic0.a aVar2 = this.A;
        return Boolean.hashCode(this.C) + ep.b.e(this.B, (hashCode7 + (aVar2 != null ? aVar2.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("FixedSizePinViewModel(pin=");
        sb3.append(this.f92801h);
        sb3.append(", width=");
        sb3.append(this.f92802i);
        sb3.append(", height=");
        sb3.append(this.f92803j);
        sb3.append(", gridPosition=");
        sb3.append(this.f92804k);
        sb3.append(", marginEnd=");
        sb3.append(this.f92805l);
        sb3.append(", shouldShowPricePill=");
        sb3.append(this.f92806m);
        sb3.append(", pinActionHandler=");
        sb3.append(this.f92807n);
        sb3.append(", pinalytics=");
        sb3.append(this.f92808o);
        sb3.append(", networkStateStream=");
        sb3.append(this.f92809p);
        sb3.append(", overlayActionTextStringRes=");
        sb3.append(this.f92810q);
        sb3.append(", overlayActionListener=");
        sb3.append(this.f92811r);
        sb3.append(", contextMenuListener=null, auxData=");
        sb3.append(this.f92812s);
        sb3.append(", componentType=");
        sb3.append(this.f92813t);
        sb3.append(", productPinMetadataViewSpec=");
        sb3.append(this.f92814u);
        sb3.append(", productPinMetadata=");
        sb3.append(this.f92815v);
        sb3.append(", elementType=");
        sb3.append(this.f92816w);
        sb3.append(", attributionDrawableId=");
        sb3.append(this.f92817x);
        sb3.append(", isProductTag=");
        sb3.append(this.f92818y);
        sb3.append(", parentPinId=");
        sb3.append(this.f92819z);
        sb3.append(", pinImageIndicatorModel=");
        sb3.append(this.A);
        sb3.append(", useHorizontalProductMetadata=");
        sb3.append(this.B);
        sb3.append(", shouldShowHide=");
        return a.a.r(sb3, this.C, ")");
    }
}
