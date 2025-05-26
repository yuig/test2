package ads_mobile_sdk;

import a.k2;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.gms.ads.nativead.NativeAd;

/* loaded from: classes2.dex */
public final class fg1 implements k2 {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable f5150a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f5151b;

    /* renamed from: c, reason: collision with root package name */
    public final double f5152c;

    /* renamed from: d, reason: collision with root package name */
    public final int f5153d = -1;

    /* renamed from: e, reason: collision with root package name */
    public final int f5154e = -1;

    public fg1(NativeAd.Image image) {
        this.f5150a = image.a();
        this.f5151b = image.c();
        this.f5152c = image.b();
    }

    @Override // a.k2
    public final double a() {
        return this.f5152c;
    }

    @Override // a.k2
    public final int b() {
        return this.f5153d;
    }

    @Override // a.k2
    public final int c() {
        return this.f5154e;
    }

    @Override // a.k2
    public final Uri d() {
        return this.f5151b;
    }

    @Override // a.k2
    public final Drawable e() {
        return this.f5150a;
    }
}
