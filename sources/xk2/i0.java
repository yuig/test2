package xk2;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class i0 implements Comparable {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public static final h0 f135212b = new h0(null);

    /* renamed from: a, reason: collision with root package name */
    public final short f135213a;

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return Intrinsics.i(this.f135213a & 65535, ((i0) obj).f135213a & 65535);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i0) {
            return this.f135213a == ((i0) obj).f135213a;
        }
        return false;
    }

    public final int hashCode() {
        return Short.hashCode(this.f135213a);
    }

    public final String toString() {
        return String.valueOf(65535 & this.f135213a);
    }
}
