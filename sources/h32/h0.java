package h32;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public d4 f67042a;

    /* renamed from: b, reason: collision with root package name */
    public a4 f67043b;

    /* renamed from: c, reason: collision with root package name */
    public x3 f67044c;

    /* renamed from: d, reason: collision with root package name */
    public g0 f67045d;

    /* renamed from: e, reason: collision with root package name */
    public d0 f67046e;

    /* renamed from: f, reason: collision with root package name */
    public u0 f67047f;

    public h0(i0 source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f67042a = source.f67081a;
        this.f67043b = source.f67082b;
        this.f67044c = source.f67083c;
        this.f67045d = source.f67084d;
        this.f67046e = source.f67085e;
        this.f67047f = source.f67086f;
    }

    public final i0 a() {
        return new i0(this.f67042a, this.f67043b, this.f67044c, this.f67045d, this.f67046e, this.f67047f);
    }

    public h0() {
        this.f67042a = null;
        this.f67043b = null;
        this.f67044c = null;
        this.f67045d = null;
        this.f67046e = null;
        this.f67047f = null;
    }
}
