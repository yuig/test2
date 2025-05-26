package i91;

import android.net.Uri;
import com.pinterest.api.model.y40;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class x implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f71910a;

    /* renamed from: b, reason: collision with root package name */
    public final y40 f71911b;

    /* renamed from: c, reason: collision with root package name */
    public final fd1.m f71912c;

    /* renamed from: d, reason: collision with root package name */
    public final fd1.k0 f71913d;

    /* renamed from: e, reason: collision with root package name */
    public final int f71914e;

    public x(Uri uri, y40 pinOrSpin) {
        Intrinsics.checkNotNullParameter(pinOrSpin, "pinOrSpin");
        this.f71910a = uri;
        this.f71911b = pinOrSpin;
        this.f71912c = fd1.m.PIN_OR_SPIN;
        this.f71913d = fd1.k0.LINK;
        this.f71914e = a62.e.share_your_results;
    }

    @Override // i91.c0
    public final int a() {
        return this.f71914e;
    }

    @Override // i91.c0
    public final fd1.k0 b() {
        return this.f71913d;
    }

    @Override // i91.c0
    public final int c() {
        return 0;
    }

    @Override // i91.c0
    public final dl1.s d() {
        return this.f71911b;
    }

    @Override // i91.c0
    public final fd1.m getContentType() {
        return this.f71912c;
    }
}
