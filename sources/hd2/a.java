package hd2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final double f68913a;

    public a(double d2) {
        this.f68913a = d2;
    }

    public final double a() {
        return this.f68913a * 2 * 3.141592653589793d;
    }

    public final a b(a other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return new a(this.f68913a + other.f68913a);
    }
}
