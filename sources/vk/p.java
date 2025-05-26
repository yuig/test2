package vk;

import java.util.Objects;

/* loaded from: classes.dex */
public final class p extends c {

    /* renamed from: a, reason: collision with root package name */
    public final int f126013a;

    /* renamed from: b, reason: collision with root package name */
    public final int f126014b;

    /* renamed from: c, reason: collision with root package name */
    public final int f126015c;

    /* renamed from: d, reason: collision with root package name */
    public final o f126016d;

    public p(int i13, int i14, int i15, o oVar) {
        this.f126013a = i13;
        this.f126014b = i14;
        this.f126015c = i15;
        this.f126016d = oVar;
    }

    public static com.google.firebase.messaging.q b() {
        return new com.google.firebase.messaging.q(12);
    }

    @Override // uk.q
    public final boolean a() {
        return this.f126016d != o.f126007d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return pVar.f126013a == this.f126013a && pVar.f126014b == this.f126014b && pVar.f126015c == this.f126015c && pVar.f126016d == this.f126016d;
    }

    public final int hashCode() {
        return Objects.hash(p.class, Integer.valueOf(this.f126013a), Integer.valueOf(this.f126014b), Integer.valueOf(this.f126015c), this.f126016d);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("AesEax Parameters (variant: ");
        sb3.append(this.f126016d);
        sb3.append(", ");
        sb3.append(this.f126014b);
        sb3.append("-byte IV, ");
        sb3.append(this.f126015c);
        sb3.append("-byte tag, and ");
        return a.a.n(sb3, this.f126013a, "-byte key)");
    }
}
