package ads_mobile_sdk;

import android.os.Bundle;
import bj.f;
import com.google.android.libraries.ads.mobile.sdk.internal.nativead.InternalNativeAd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.g0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class zf1 implements f {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ rl2.u[] f14736o = {kotlin.jvm.internal.k0.f80436a.e(new kotlin.jvm.internal.x(zf1.class, "adEventCallback", "getAdEventCallback()Lcom/google/android/libraries/ads/mobile/sdk/nativead/NativeAdEventCallback;", 0))};

    /* renamed from: a, reason: collision with root package name */
    public final InternalNativeAd f14737a;

    /* renamed from: b, reason: collision with root package name */
    public final co2 f14738b;

    /* renamed from: c, reason: collision with root package name */
    public final String f14739c;

    /* renamed from: d, reason: collision with root package name */
    public final wi.p f14740d;

    /* renamed from: e, reason: collision with root package name */
    public final String f14741e;

    /* renamed from: f, reason: collision with root package name */
    public final String f14742f;

    /* renamed from: g, reason: collision with root package name */
    public final String f14743g;

    /* renamed from: h, reason: collision with root package name */
    public final Double f14744h;

    /* renamed from: i, reason: collision with root package name */
    public final String f14745i;

    /* renamed from: j, reason: collision with root package name */
    public final String f14746j;

    /* renamed from: k, reason: collision with root package name */
    public final wi.p f14747k;

    /* renamed from: l, reason: collision with root package name */
    public final Bundle f14748l;

    /* renamed from: m, reason: collision with root package name */
    public final wi.c f14749m;

    /* renamed from: n, reason: collision with root package name */
    public final c91 f14750n;

    public zf1(InternalNativeAd internalNativeAd) {
        Intrinsics.checkNotNullParameter(internalNativeAd, "internalNativeAd");
        this.f14737a = internalNativeAd;
        wi.c cVar = null;
        this.f14738b = new co2(null, new yf1(this));
        this.f14739c = (String) internalNativeAd.f32086n.f6371d.get("headline");
        if1 if1Var = internalNativeAd.f32086n;
        rz0 rz0Var = if1Var.f6373f;
        this.f14740d = rz0Var != null ? rz0Var.a() : null;
        this.f14741e = (String) if1Var.f6371d.get("body");
        this.f14742f = (String) if1Var.f6371d.get("call_to_action");
        this.f14743g = (String) if1Var.f6371d.get("advertiser");
        this.f14744h = if1Var.f6372e;
        this.f14745i = (String) if1Var.f6371d.get("store");
        this.f14746j = (String) if1Var.f6371d.get("price");
        rz0 rz0Var2 = if1Var.f6374g;
        this.f14747k = rz0Var2 != null ? rz0Var2.a() : null;
        this.f14748l = if1Var.f6385r;
        qx0 qx0Var = if1Var.f6375h;
        if (qx0Var != null) {
            Intrinsics.checkNotNullParameter(qx0Var, "<this>");
            String str = qx0Var.f10301a;
            List list = qx0Var.f10302b;
            ArrayList arrayList = new ArrayList(g0.q(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((rz0) it.next()).a());
            }
            cVar = new wi.c(str, arrayList);
        }
        this.f14749m = cVar;
        this.f14750n = new c91(internalNativeAd);
        internalNativeAd.f32087o.i();
    }

    @Override // wi.a
    public final void destroy() {
        this.f14737a.destroy();
    }

    @Override // bj.f
    public final String getAdvertiser() {
        return this.f14743g;
    }

    @Override // bj.f
    public final String getCallToAction() {
        return this.f14742f;
    }

    @Override // bj.f
    public final String getHeadline() {
        return this.f14739c;
    }

    @Override // bj.f
    public final wi.p getIcon() {
        return this.f14747k;
    }

    @Override // bj.f
    public final wi.p getImage() {
        return this.f14740d;
    }

    @Override // bj.f
    public final bj.b getMediaContent() {
        return this.f14750n;
    }

    @Override // bj.f
    public final void setAdEventCallback(bj.g gVar) {
        this.f14738b.setValue(this, f14736o[0], gVar);
    }
}
