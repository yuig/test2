package fl;

import java.util.Objects;

/* loaded from: classes.dex */
public final class l extends n {

    /* renamed from: a, reason: collision with root package name */
    public final int f62534a;

    /* renamed from: b, reason: collision with root package name */
    public final int f62535b;

    /* renamed from: c, reason: collision with root package name */
    public final k f62536c;

    /* renamed from: d, reason: collision with root package name */
    public final j f62537d;

    public l(int i13, int i14, k kVar, j jVar) {
        this.f62534a = i13;
        this.f62535b = i14;
        this.f62536c = kVar;
        this.f62537d = jVar;
    }

    public static com.google.firebase.messaging.q b() {
        return new com.google.firebase.messaging.q(15);
    }

    @Override // uk.q
    public final boolean a() {
        return this.f62536c != k.f62532e;
    }

    public final int c() {
        k kVar = k.f62532e;
        int i13 = this.f62535b;
        k kVar2 = this.f62536c;
        if (kVar2 == kVar) {
            return i13;
        }
        if (kVar2 != k.f62529b && kVar2 != k.f62530c && kVar2 != k.f62531d) {
            throw new IllegalStateException("Unknown variant");
        }
        return i13 + 5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return lVar.f62534a == this.f62534a && lVar.c() == c() && lVar.f62536c == this.f62536c && lVar.f62537d == this.f62537d;
    }

    public final int hashCode() {
        return Objects.hash(l.class, Integer.valueOf(this.f62534a), Integer.valueOf(this.f62535b), this.f62536c, this.f62537d);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("HMAC Parameters (variant: ");
        sb3.append(this.f62536c);
        sb3.append(", hashType: ");
        sb3.append(this.f62537d);
        sb3.append(", ");
        sb3.append(this.f62535b);
        sb3.append("-byte tags, and ");
        return a.a.n(sb3, this.f62534a, "-byte key)");
    }
}
