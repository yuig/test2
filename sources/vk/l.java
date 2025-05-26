package vk;

import java.util.Objects;

/* loaded from: classes.dex */
public final class l extends c {

    /* renamed from: a, reason: collision with root package name */
    public final int f125984a;

    /* renamed from: b, reason: collision with root package name */
    public final int f125985b;

    /* renamed from: c, reason: collision with root package name */
    public final int f125986c;

    /* renamed from: d, reason: collision with root package name */
    public final int f125987d;

    /* renamed from: e, reason: collision with root package name */
    public final k f125988e;

    /* renamed from: f, reason: collision with root package name */
    public final j f125989f;

    public l(int i13, int i14, int i15, int i16, k kVar, j jVar) {
        this.f125984a = i13;
        this.f125985b = i14;
        this.f125986c = i15;
        this.f125987d = i16;
        this.f125988e = kVar;
        this.f125989f = jVar;
    }

    public static androidx.appcompat.widget.x b() {
        return new androidx.appcompat.widget.x(3);
    }

    @Override // uk.q
    public final boolean a() {
        return this.f125988e != k.f125975d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return lVar.f125984a == this.f125984a && lVar.f125985b == this.f125985b && lVar.f125986c == this.f125986c && lVar.f125987d == this.f125987d && lVar.f125988e == this.f125988e && lVar.f125989f == this.f125989f;
    }

    public final int hashCode() {
        return Objects.hash(l.class, Integer.valueOf(this.f125984a), Integer.valueOf(this.f125985b), Integer.valueOf(this.f125986c), Integer.valueOf(this.f125987d), this.f125988e, this.f125989f);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("AesCtrHmacAead Parameters (variant: ");
        sb3.append(this.f125988e);
        sb3.append(", hashType: ");
        sb3.append(this.f125989f);
        sb3.append(", ");
        sb3.append(this.f125986c);
        sb3.append("-byte IV, and ");
        sb3.append(this.f125987d);
        sb3.append("-byte tags, and ");
        sb3.append(this.f125984a);
        sb3.append("-byte AES key, and ");
        return a.a.n(sb3, this.f125985b, "-byte HMAC key)");
    }
}
