package qn1;

import kotlin.jvm.internal.Intrinsics;
import u50.i0;

/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public i0 f104486a;

    /* renamed from: b, reason: collision with root package name */
    public final i0 f104487b;

    /* renamed from: c, reason: collision with root package name */
    public d f104488c;

    /* renamed from: d, reason: collision with root package name */
    public c f104489d;

    /* renamed from: e, reason: collision with root package name */
    public final fm1.c f104490e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f104491f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f104492g;

    /* renamed from: h, reason: collision with root package name */
    public final int f104493h;

    public g(b displayState) {
        Intrinsics.checkNotNullParameter(displayState, "displayState");
        this.f104486a = displayState.f104467a;
        this.f104487b = displayState.f104468b;
        this.f104488c = displayState.f104469c;
        this.f104489d = displayState.f104470d;
        this.f104490e = displayState.f104471e;
        this.f104491f = displayState.f104472f;
        this.f104492g = displayState.f104473g;
        this.f104493h = displayState.f104474h;
    }

    public final void a(c size) {
        Intrinsics.checkNotNullParameter(size, "size");
        this.f104489d = size;
    }

    public final void b() {
        this.f104486a = ep.b.x("Tag", "text", "Tag");
    }

    public final void c(d variant) {
        Intrinsics.checkNotNullParameter(variant, "variant");
        this.f104488c = variant;
    }
}
