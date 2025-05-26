package ads_mobile_sdk;

import a.k2;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.gms.ads.formats.NativeAd;

/* loaded from: classes2.dex */
public final class sv2 implements k2 {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable f11267a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f11268b;

    /* renamed from: c, reason: collision with root package name */
    public final double f11269c;

    /* renamed from: d, reason: collision with root package name */
    public final int f11270d;

    /* renamed from: e, reason: collision with root package name */
    public final int f11271e;

    public sv2(NativeAd.Image image) {
        this.f11267a = image.a();
        this.f11268b = image.d();
        this.f11269c = image.c();
        this.f11270d = image.getWidth();
        this.f11271e = image.getHeight();
    }

    @Override // a.k2
    public final double a() {
        return this.f11269c;
    }

    @Override // a.k2
    public final int b() {
        return this.f11270d;
    }

    @Override // a.k2
    public final int c() {
        return this.f11271e;
    }

    @Override // a.k2
    public final Uri d() {
        return this.f11268b;
    }

    @Override // a.k2
    public final Drawable e() {
        return this.f11267a;
    }
}
