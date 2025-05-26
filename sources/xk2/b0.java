package xk2;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class b0 implements Comparable {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a0 f135200b = new a0(null);

    /* renamed from: a, reason: collision with root package name */
    public final int f135201a;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Intrinsics.i(this.f135201a ^ Integer.MIN_VALUE, ((b0) obj).f135201a ^ Integer.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b0) {
            return this.f135201a == ((b0) obj).f135201a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f135201a);
    }

    public final String toString() {
        return String.valueOf(this.f135201a & 4294967295L);
    }
}
