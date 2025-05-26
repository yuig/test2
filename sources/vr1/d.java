package vr1;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f126460a;

    /* renamed from: b, reason: collision with root package name */
    public final int f126461b;

    public d(int i13, int i14) {
        this.f126460a = i13;
        this.f126461b = i14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f126460a == dVar.f126460a && this.f126461b == dVar.f126461b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f126461b) + (Integer.hashCode(this.f126460a) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ProgressIndicatorConfig(colorRes=");
        sb3.append(this.f126460a);
        sb3.append(", textRes=");
        return a.a.n(sb3, this.f126461b, ")");
    }
}
