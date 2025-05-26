package ads_mobile_sdk;

import a.k2;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.gms.ads.formats.NativeAd;

/* loaded from: classes2.dex */
public final class uv2 implements k2 {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable f12230a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f12231b;

    /* renamed from: c, reason: collision with root package name */
    public final double f12232c;

    /* renamed from: d, reason: collision with root package name */
    public final int f12233d;

    /* renamed from: e, reason: collision with root package name */
    public final int f12234e;

    public uv2(NativeAd.Image image) {
        this.f12230a = image.a();
        this.f12231b = image.d();
        this.f12232c = image.c();
        this.f12233d = image.getWidth();
        this.f12234e = image.getHeight();
    }

    @Override // a.k2
    public final double a() {
        return this.f12232c;
    }

    @Override // a.k2
    public final int b() {
        return this.f12233d;
    }

    @Override // a.k2
    public final int c() {
        return this.f12234e;
    }

    @Override // a.k2
    public final Uri d() {
        return this.f12231b;
    }

    @Override // a.k2
    public final Drawable e() {
        return this.f12230a;
    }
}
