package vk;

import java.util.Objects;

/* loaded from: classes.dex */
public final class t extends c {

    /* renamed from: a, reason: collision with root package name */
    public final int f126043a;

    /* renamed from: b, reason: collision with root package name */
    public final int f126044b;

    /* renamed from: c, reason: collision with root package name */
    public final int f126045c;

    /* renamed from: d, reason: collision with root package name */
    public final s f126046d;

    public t(int i13, int i14, int i15, s sVar) {
        this.f126043a = i13;
        this.f126044b = i14;
        this.f126045c = i15;
        this.f126046d = sVar;
    }

    public static com.google.firebase.messaging.q b() {
        return new com.google.firebase.messaging.q(13);
    }

    @Override // uk.q
    public final boolean a() {
        return this.f126046d != s.f126037d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return tVar.f126043a == this.f126043a && tVar.f126044b == this.f126044b && tVar.f126045c == this.f126045c && tVar.f126046d == this.f126046d;
    }

    public final int hashCode() {
        return Objects.hash(t.class, Integer.valueOf(this.f126043a), Integer.valueOf(this.f126044b), Integer.valueOf(this.f126045c), this.f126046d);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("AesGcm Parameters (variant: ");
        sb3.append(this.f126046d);
        sb3.append(", ");
        sb3.append(this.f126044b);
        sb3.append("-byte IV, ");
        sb3.append(this.f126045c);
        sb3.append("-byte tag, and ");
        return a.a.n(sb3, this.f126043a, "-byte key)");
    }
}
