package ads_mobile_sdk;

import android.os.Bundle;
import android.view.View;
import ao2.p0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class if1 {

    /* renamed from: a, reason: collision with root package name */
    public int f6368a;

    /* renamed from: b, reason: collision with root package name */
    public gf1 f6369b;

    /* renamed from: c, reason: collision with root package name */
    public String f6370c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f6371d;

    /* renamed from: e, reason: collision with root package name */
    public Double f6372e;

    /* renamed from: f, reason: collision with root package name */
    public rz0 f6373f;

    /* renamed from: g, reason: collision with root package name */
    public rz0 f6374g;

    /* renamed from: h, reason: collision with root package name */
    public qx0 f6375h;

    /* renamed from: i, reason: collision with root package name */
    public final Map f6376i;

    /* renamed from: j, reason: collision with root package name */
    public ym0 f6377j;

    /* renamed from: k, reason: collision with root package name */
    public View f6378k;

    /* renamed from: l, reason: collision with root package name */
    public sn0 f6379l;

    /* renamed from: m, reason: collision with root package name */
    public wi.d0 f6380m;

    /* renamed from: n, reason: collision with root package name */
    public dt1 f6381n;

    /* renamed from: o, reason: collision with root package name */
    public p0 f6382o;

    /* renamed from: p, reason: collision with root package name */
    public final List f6383p;

    /* renamed from: q, reason: collision with root package name */
    public qz0 f6384q;

    /* renamed from: r, reason: collision with root package name */
    public Bundle f6385r;

    /* renamed from: s, reason: collision with root package name */
    public float f6386s;

    /* renamed from: t, reason: collision with root package name */
    public View f6387t;

    /* renamed from: u, reason: collision with root package name */
    public wi.d f6388u;

    /* renamed from: v, reason: collision with root package name */
    public String f6389v;

    public if1(int i13, gf1 gf1Var, String str, Map stringAssets, Double d2, rz0 rz0Var, rz0 rz0Var2, qx0 qx0Var, Map customImageAssets, ym0 ym0Var, View view, sn0 sn0Var, wi.d0 d0Var, dt1 dt1Var, p0 p0Var, List muteThisAdReasons, qz0 qz0Var, Bundle extras, float f13, View view2, wi.d dVar, String str2) {
        Intrinsics.checkNotNullParameter(stringAssets, "stringAssets");
        Intrinsics.checkNotNullParameter(customImageAssets, "customImageAssets");
        Intrinsics.checkNotNullParameter(muteThisAdReasons, "muteThisAdReasons");
        Intrinsics.checkNotNullParameter(extras, "extras");
        this.f6368a = i13;
        this.f6369b = gf1Var;
        this.f6370c = str;
        this.f6371d = stringAssets;
        this.f6372e = d2;
        this.f6373f = rz0Var;
        this.f6374g = rz0Var2;
        this.f6375h = qx0Var;
        this.f6376i = customImageAssets;
        this.f6377j = ym0Var;
        this.f6378k = view;
        this.f6379l = sn0Var;
        this.f6380m = d0Var;
        this.f6381n = dt1Var;
        this.f6382o = p0Var;
        this.f6383p = muteThisAdReasons;
        this.f6384q = qz0Var;
        this.f6385r = extras;
        this.f6386s = f13;
        this.f6387t = view2;
        this.f6388u = dVar;
        this.f6389v = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof if1)) {
            return false;
        }
        if1 if1Var = (if1) obj;
        return this.f6368a == if1Var.f6368a && this.f6369b == if1Var.f6369b && Intrinsics.d(this.f6370c, if1Var.f6370c) && Intrinsics.d(this.f6371d, if1Var.f6371d) && Intrinsics.d(this.f6372e, if1Var.f6372e) && Intrinsics.d(this.f6373f, if1Var.f6373f) && Intrinsics.d(this.f6374g, if1Var.f6374g) && Intrinsics.d(this.f6375h, if1Var.f6375h) && Intrinsics.d(this.f6376i, if1Var.f6376i) && Intrinsics.d(this.f6377j, if1Var.f6377j) && Intrinsics.d(this.f6378k, if1Var.f6378k) && Intrinsics.d(this.f6379l, if1Var.f6379l) && Intrinsics.d(this.f6380m, if1Var.f6380m) && Intrinsics.d(this.f6381n, if1Var.f6381n) && Intrinsics.d(this.f6382o, if1Var.f6382o) && Intrinsics.d(this.f6383p, if1Var.f6383p) && Intrinsics.d(this.f6384q, if1Var.f6384q) && Intrinsics.d(this.f6385r, if1Var.f6385r) && Float.compare(this.f6386s, if1Var.f6386s) == 0 && Intrinsics.d(this.f6387t, if1Var.f6387t) && this.f6388u == if1Var.f6388u && Intrinsics.d(this.f6389v, if1Var.f6389v);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.f6368a) * 31;
        gf1 gf1Var = this.f6369b;
        int hashCode2 = (hashCode + (gf1Var == null ? 0 : gf1Var.hashCode())) * 31;
        String str = this.f6370c;
        int e13 = a.c.e(this.f6371d, (hashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31);
        Double d2 = this.f6372e;
        int hashCode3 = (e13 + (d2 == null ? 0 : d2.hashCode())) * 31;
        rz0 rz0Var = this.f6373f;
        int hashCode4 = (hashCode3 + (rz0Var == null ? 0 : rz0Var.hashCode())) * 31;
        rz0 rz0Var2 = this.f6374g;
        int hashCode5 = (hashCode4 + (rz0Var2 == null ? 0 : rz0Var2.hashCode())) * 31;
        qx0 qx0Var = this.f6375h;
        int e14 = a.c.e(this.f6376i, (hashCode5 + (qx0Var == null ? 0 : qx0Var.hashCode())) * 31, 31);
        ym0 ym0Var = this.f6377j;
        int hashCode6 = (e14 + (ym0Var == null ? 0 : ym0Var.hashCode())) * 31;
        View view = this.f6378k;
        int hashCode7 = (hashCode6 + (view == null ? 0 : view.hashCode())) * 31;
        sn0 sn0Var = this.f6379l;
        int hashCode8 = (hashCode7 + (sn0Var == null ? 0 : sn0Var.hashCode())) * 31;
        wi.d0 d0Var = this.f6380m;
        int hashCode9 = (hashCode8 + (d0Var == null ? 0 : d0Var.hashCode())) * 31;
        dt1 dt1Var = this.f6381n;
        int hashCode10 = (hashCode9 + (dt1Var == null ? 0 : dt1Var.hashCode())) * 31;
        p0 p0Var = this.f6382o;
        int p13 = gh0.b.p((hashCode10 + (p0Var == null ? 0 : p0Var.hashCode())) * 31, this.f6383p);
        qz0 qz0Var = this.f6384q;
        int a13 = a.a.a(this.f6386s, (this.f6385r.hashCode() + ((p13 + (qz0Var == null ? 0 : qz0Var.hashCode())) * 31)) * 31, 31);
        View view2 = this.f6387t;
        int hashCode11 = (a13 + (view2 == null ? 0 : view2.hashCode())) * 31;
        wi.d dVar = this.f6388u;
        int hashCode12 = (hashCode11 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        String str2 = this.f6389v;
        return hashCode12 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "NativeAdAssets(templateId=" + this.f6368a + ", nativeAdType=" + this.f6369b + ", customTemplateId=" + this.f6370c + ", stringAssets=" + this.f6371d + ", starRating=" + this.f6372e + ", image=" + this.f6373f + ", icon=" + this.f6374g + ", attributionInfo=" + this.f6375h + ", customImageAssets=" + this.f6376i + ", mediaWebView=" + this.f6377j + ", mediaView=" + this.f6378k + ", gmaWebViewVideoController=" + this.f6379l + ", videoController=" + this.f6380m + ", omidSettings=" + this.f6381n + ", omidDisplayWebView=" + this.f6382o + ", muteThisAdReasons=" + this.f6383p + ", defaultMuteThisAdReason=" + this.f6384q + ", extras=" + this.f6385r + ", mediaContentAspectRatio=" + this.f6386s + ", adChoicesContent=" + this.f6387t + ", pubProvidedAttributionInfoPlacement=" + this.f6388u + ", watermark=" + this.f6389v + ")";
    }

    public /* synthetic */ if1() {
        this(-1, null, null, new LinkedHashMap(), null, null, null, null, new LinkedHashMap(), null, null, null, null, null, null, new ArrayList(), null, new Bundle(), 0.0f, null, null, null);
    }
}
