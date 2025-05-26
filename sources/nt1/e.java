package nt1;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final int f92295a;

    /* renamed from: b, reason: collision with root package name */
    public final int f92296b;

    public e(int i13, int i14) {
        this.f92295a = i13;
        this.f92296b = i14;
    }

    public final float a() {
        return this.f92295a / this.f92296b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f92295a == eVar.f92295a && this.f92296b == eVar.f92296b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f92296b) + (Integer.hashCode(this.f92295a) * 31);
    }

    public final String toString() {
        return this.f92295a + "/" + this.f92296b;
    }
}
