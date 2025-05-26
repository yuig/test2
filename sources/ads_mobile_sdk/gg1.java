package ads_mobile_sdk;

import a.k2;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.gms.ads.nativead.NativeAd;

/* loaded from: classes2.dex */
public final class gg1 implements k2 {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable f5560a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f5561b;

    /* renamed from: c, reason: collision with root package name */
    public final double f5562c;

    /* renamed from: d, reason: collision with root package name */
    public final int f5563d = -1;

    /* renamed from: e, reason: collision with root package name */
    public final int f5564e = -1;

    public gg1(NativeAd.Image image) {
        this.f5560a = image.a();
        this.f5561b = image.c();
        this.f5562c = image.b();
    }

    @Override // a.k2
    public final double a() {
        return this.f5562c;
    }

    @Override // a.k2
    public final int b() {
        return this.f5563d;
    }

    @Override // a.k2
    public final int c() {
        return this.f5564e;
    }

    @Override // a.k2
    public final Uri d() {
        return this.f5561b;
    }

    @Override // a.k2
    public final Drawable e() {
        return this.f5560a;
    }
}
