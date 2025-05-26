package h32;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final r0 f66938a;

    /* renamed from: b, reason: collision with root package name */
    public final s f66939b;

    /* renamed from: c, reason: collision with root package name */
    public final g f66940c;

    /* renamed from: d, reason: collision with root package name */
    public e32.b f66941d;

    public d(e source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f66938a = source.f66958a;
        this.f66939b = source.f66959b;
        this.f66940c = source.f66960c;
        this.f66941d = source.f66961d;
    }

    public final e a() {
        return new e(this.f66938a, this.f66939b, this.f66940c, this.f66941d);
    }

    public final void b(e32.b bVar) {
        this.f66941d = bVar;
    }

    public d() {
        this.f66938a = null;
        this.f66939b = null;
        this.f66940c = null;
        this.f66941d = null;
    }
}
