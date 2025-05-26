package ads_mobile_sdk;

import a.k2;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.gms.ads.formats.NativeAd;

/* loaded from: classes2.dex */
public final class tv2 implements k2 {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable f11708a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f11709b;

    /* renamed from: c, reason: collision with root package name */
    public final double f11710c;

    /* renamed from: d, reason: collision with root package name */
    public final int f11711d;

    /* renamed from: e, reason: collision with root package name */
    public final int f11712e;

    public tv2(NativeAd.Image image) {
        this.f11708a = image.a();
        this.f11709b = image.d();
        this.f11710c = image.c();
        this.f11711d = image.getWidth();
        this.f11712e = image.getHeight();
    }

    @Override // a.k2
    public final double a() {
        return this.f11710c;
    }

    @Override // a.k2
    public final int b() {
        return this.f11711d;
    }

    @Override // a.k2
    public final int c() {
        return this.f11712e;
    }

    @Override // a.k2
    public final Uri d() {
        return this.f11709b;
    }

    @Override // a.k2
    public final Drawable e() {
        return this.f11708a;
    }
}
