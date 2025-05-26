package i91;

import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class w implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public final f30 f71905a;

    /* renamed from: b, reason: collision with root package name */
    public final f30 f71906b;

    /* renamed from: c, reason: collision with root package name */
    public final fd1.m f71907c;

    /* renamed from: d, reason: collision with root package name */
    public final fd1.k0 f71908d;

    /* renamed from: e, reason: collision with root package name */
    public final int f71909e;

    public w(f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        this.f71905a = pin;
        this.f71906b = pin;
        this.f71907c = fd1.m.STATIC_PIN_LINK;
        this.f71908d = fd1.k0.LINK;
        this.f71909e = b40.O0(pin) ? a62.e.share_as_collage_link : a62.e.share_pin_link;
    }

    @Override // i91.c0
    public final int a() {
        return this.f71909e;
    }

    @Override // i91.c0
    public final fd1.k0 b() {
        return this.f71908d;
    }

    @Override // i91.c0
    public final int c() {
        return 0;
    }

    @Override // i91.c0
    public final dl1.s d() {
        return this.f71906b;
    }

    @Override // i91.c0
    public final fd1.m getContentType() {
        return this.f71907c;
    }
}
