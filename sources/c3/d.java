package c3;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f25488a;

    /* renamed from: b, reason: collision with root package name */
    public final long f25489b;

    /* renamed from: c, reason: collision with root package name */
    public final int f25490c;

    public d(int i13, long j13, String str) {
        this.f25488a = str;
        this.f25489b = j13;
        this.f25490c = i13;
        if (str.length() == 0) {
            throw new IllegalArgumentException("The name of a color space cannot be null and must contain at least 1 character");
        }
        if (i13 < -1 || i13 > 63) {
            throw new IllegalArgumentException("The id must be between -1 and 63");
        }
    }

    public abstract float a(int i13);

    public abstract float b(int i13);

    public boolean c() {
        return false;
    }

    public abstract long d(float f13, float f14, float f15);

    public abstract float e(float f13, float f14, float f15);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f25490c == dVar.f25490c && Intrinsics.d(this.f25488a, dVar.f25488a)) {
            return c.a(this.f25489b, dVar.f25489b);
        }
        return false;
    }

    public abstract long f(float f13, float f14, float f15, float f16, d dVar);

    public int hashCode() {
        int hashCode = this.f25488a.hashCode() * 31;
        int i13 = c.f25487e;
        return a.a.c(this.f25489b, hashCode, 31) + this.f25490c;
    }

    public final String toString() {
        return this.f25488a + " (id=" + this.f25490c + ", model=" + ((Object) c.b(this.f25489b)) + ')';
    }
}
