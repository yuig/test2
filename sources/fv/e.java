package fv;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public boolean f63009a = false;

    /* renamed from: b, reason: collision with root package name */
    public long f63010b = 0;

    /* renamed from: c, reason: collision with root package name */
    public long f63011c = 0;

    public final long a() {
        return this.f63011c;
    }

    public final long b() {
        return this.f63010b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f63009a == eVar.f63009a && this.f63010b == eVar.f63010b && this.f63011c == eVar.f63011c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f63011c) + a.a.c(this.f63010b, Boolean.hashCode(this.f63009a) * 31, 31);
    }

    public final String toString() {
        return "IdeaPinStaticPlaytimeState(paused=" + this.f63009a + ", startTime=" + this.f63010b + ", elapsedTime=" + this.f63011c + ")";
    }
}
