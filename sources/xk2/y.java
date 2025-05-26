package xk2;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class y implements Comparable {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public static final x f135237b = new x(null);

    /* renamed from: a, reason: collision with root package name */
    public final byte f135238a;

    public /* synthetic */ y(byte b13) {
        this.f135238a = b13;
    }

    public static String a(byte b13) {
        return String.valueOf(b13 & 255);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return Intrinsics.i(this.f135238a & 255, ((y) obj).f135238a & 255);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof y) {
            return this.f135238a == ((y) obj).f135238a;
        }
        return false;
    }

    public final int hashCode() {
        return Byte.hashCode(this.f135238a);
    }

    public final String toString() {
        return a(this.f135238a);
    }
}
