package co2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class t {

    /* renamed from: b, reason: collision with root package name */
    public static final s f28347b = new s();

    /* renamed from: a, reason: collision with root package name */
    public final Object f28348a;

    public static final Throwable a(Object obj) {
        r rVar = obj instanceof r ? (r) obj : null;
        if (rVar != null) {
            return rVar.f28346a;
        }
        return null;
    }

    public static final Object b(Object obj) {
        if (obj instanceof s) {
            return null;
        }
        return obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof t) {
            return Intrinsics.d(this.f28348a, ((t) obj).f28348a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f28348a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f28348a;
        if (obj instanceof r) {
            return ((r) obj).toString();
        }
        return "Value(" + obj + ')';
    }
}
