package i91;

import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class y implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public final f30 f71915a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f71916b;

    /* renamed from: c, reason: collision with root package name */
    public final f30 f71917c;

    /* renamed from: d, reason: collision with root package name */
    public final fd1.m f71918d;

    /* renamed from: e, reason: collision with root package name */
    public final fd1.k0 f71919e;

    /* renamed from: f, reason: collision with root package name */
    public final int f71920f;

    public y(f30 pin, boolean z13) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        this.f71915a = pin;
        this.f71916b = z13;
        this.f71917c = pin;
        this.f71918d = fd1.m.UPSELLS;
        this.f71919e = fd1.k0.LINK;
        this.f71920f = a62.e.save_or_share_pin;
    }

    @Override // i91.c0
    public final int a() {
        return this.f71920f;
    }

    @Override // i91.c0
    public final fd1.k0 b() {
        return this.f71919e;
    }

    @Override // i91.c0
    public final int c() {
        return 0;
    }

    @Override // i91.c0
    public final dl1.s d() {
        return this.f71917c;
    }

    @Override // i91.c0
    public final fd1.m getContentType() {
        return this.f71918d;
    }
}
