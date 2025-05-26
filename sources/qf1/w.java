package qf1;

/* loaded from: classes5.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final long f103773a;

    /* renamed from: b, reason: collision with root package name */
    public final float f103774b;

    public w(long j13, float f13) {
        this.f103773a = j13;
        this.f103774b = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.f103773a == wVar.f103773a && Float.compare(this.f103774b, wVar.f103774b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f103774b) + (Long.hashCode(this.f103773a) * 31);
    }

    public final String toString() {
        return "PageDuration(milliseconds=" + this.f103773a + ", percentage=" + this.f103774b + ")";
    }
}
