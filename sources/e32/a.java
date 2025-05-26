package e32;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Boolean f57120a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f57121b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f57122c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f57123d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f57124e;

    /* renamed from: f, reason: collision with root package name */
    public final Integer f57125f;

    /* renamed from: g, reason: collision with root package name */
    public Integer f57126g;

    /* renamed from: h, reason: collision with root package name */
    public String f57127h;

    public a(b source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f57120a = source.f57129a;
        this.f57121b = source.f57130b;
        this.f57122c = source.f57131c;
        this.f57123d = source.f57132d;
        this.f57124e = source.f57133e;
        this.f57125f = source.f57134f;
        this.f57126g = source.f57135g;
        this.f57127h = source.f57136h;
    }

    public final b a() {
        return new b(this.f57120a, this.f57121b, this.f57122c, this.f57123d, this.f57124e, this.f57125f, this.f57126g, this.f57127h);
    }
}
