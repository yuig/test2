package xk2;

import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public final class j implements Comparable {

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    public static final i f135214e = new i(null);

    /* renamed from: f, reason: collision with root package name */
    public static final j f135215f = new j(1, 9, 23);

    /* renamed from: a, reason: collision with root package name */
    public final int f135216a;

    /* renamed from: b, reason: collision with root package name */
    public final int f135217b;

    /* renamed from: c, reason: collision with root package name */
    public final int f135218c;

    /* renamed from: d, reason: collision with root package name */
    public final int f135219d;

    public j(int i13, int i14, int i15) {
        this.f135216a = i13;
        this.f135217b = i14;
        this.f135218c = i15;
        if (new IntRange(0, 255, 1).f(i13) && new IntRange(0, 255, 1).f(i14) && new IntRange(0, 255, 1).f(i15)) {
            this.f135219d = (i13 << 16) + (i14 << 8) + i15;
            return;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i13 + '.' + i14 + '.' + i15).toString());
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        j other = (j) obj;
        Intrinsics.checkNotNullParameter(other, "other");
        return this.f135219d - other.f135219d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        j jVar = obj instanceof j ? (j) obj : null;
        return jVar != null && this.f135219d == jVar.f135219d;
    }

    public final int hashCode() {
        return this.f135219d;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.f135216a);
        sb3.append('.');
        sb3.append(this.f135217b);
        sb3.append('.');
        sb3.append(this.f135218c);
        return sb3.toString();
    }
}
