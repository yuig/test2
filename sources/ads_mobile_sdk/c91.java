package ads_mobile_sdk;

import android.graphics.drawable.Drawable;
import com.google.android.libraries.ads.mobile.sdk.internal.nativead.InternalNativeAd;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class c91 implements bj.b {

    /* renamed from: a, reason: collision with root package name */
    public final InternalNativeAd f3818a;

    /* renamed from: b, reason: collision with root package name */
    public Drawable f3819b;

    /* renamed from: c, reason: collision with root package name */
    public final float f3820c;

    /* renamed from: d, reason: collision with root package name */
    public final float f3821d;

    /* renamed from: e, reason: collision with root package name */
    public final float f3822e;

    /* renamed from: f, reason: collision with root package name */
    public final wi.d0 f3823f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f3824g;

    public c91(InternalNativeAd internalNativeAd) {
        Intrinsics.checkNotNullParameter(internalNativeAd, "internalNativeAd");
        this.f3818a = internalNativeAd;
        this.f3819b = a().f32090r.e();
        this.f3820c = a().f32090r.a();
        this.f3821d = a().f32090r.c();
        this.f3822e = a().f32090r.b();
        this.f3823f = a().f32090r.f();
        this.f3824g = a().f32090r.d();
    }

    @Override // bj.b
    public final InternalNativeAd a() {
        return this.f3818a;
    }

    @Override // bj.b
    public final float getAspectRatio() {
        return this.f3820c;
    }

    @Override // bj.b
    public final float getDuration() {
        return this.f3821d;
    }

    @Override // bj.b
    public final boolean getHasVideoContent() {
        return this.f3824g;
    }

    @Override // bj.b
    public final Drawable getMainImage() {
        return this.f3819b;
    }

    @Override // bj.b
    public final wi.d0 getVideoController() {
        return this.f3823f;
    }
}
