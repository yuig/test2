package pn2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class m extends r0 {

    /* renamed from: a, reason: collision with root package name */
    public final bm2.i f100817a;

    public m(bm2.i annotations) {
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        this.f100817a = annotations;
    }

    public final bm2.i a() {
        return this.f100817a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m) {
            return Intrinsics.d(((m) obj).f100817a, this.f100817a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f100817a.hashCode();
    }
}
