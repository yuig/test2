package ads_mobile_sdk;

import a.k2;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.gms.ads.nativead.NativeAd;

/* loaded from: classes2.dex */
public final class eg1 implements k2 {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable f4854a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f4855b;

    /* renamed from: c, reason: collision with root package name */
    public final double f4856c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4857d = -1;

    /* renamed from: e, reason: collision with root package name */
    public final int f4858e = -1;

    public eg1(NativeAd.Image image) {
        this.f4854a = image.a();
        this.f4855b = image.c();
        this.f4856c = image.b();
    }

    @Override // a.k2
    public final double a() {
        return this.f4856c;
    }

    @Override // a.k2
    public final int b() {
        return this.f4857d;
    }

    @Override // a.k2
    public final int c() {
        return this.f4858e;
    }

    @Override // a.k2
    public final Uri d() {
        return this.f4855b;
    }

    @Override // a.k2
    public final Drawable e() {
        return this.f4854a;
    }
}
