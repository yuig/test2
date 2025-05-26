package nf2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class i {

    /* renamed from: b, reason: collision with root package name */
    public static final h f90501b = new h();

    /* renamed from: c, reason: collision with root package name */
    public static final i f90502c = new i();

    /* renamed from: a, reason: collision with root package name */
    public final ol2.f f90503a;

    public i() {
        ol2.e random = ol2.f.f96454a;
        Intrinsics.checkNotNullParameter(random, "random");
        this.f90503a = random;
    }

    public final long a() {
        long g13;
        do {
            g13 = this.f90503a.g();
        } while (g13 == 0);
        return g13;
    }
}
