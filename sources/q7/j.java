package q7;

import android.net.Uri;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final long f102649a;

    /* renamed from: b, reason: collision with root package name */
    public final long f102650b;

    /* renamed from: c, reason: collision with root package name */
    public final String f102651c;

    /* renamed from: d, reason: collision with root package name */
    public int f102652d;

    public j(String str, long j13, long j14) {
        this.f102651c = str == null ? "" : str;
        this.f102649a = j13;
        this.f102650b = j14;
    }

    public final j a(j jVar, String str) {
        String N = b7.c.N(str, this.f102651c);
        if (jVar == null || !N.equals(b7.c.N(str, jVar.f102651c))) {
            return null;
        }
        long j13 = this.f102650b;
        long j14 = jVar.f102650b;
        if (j13 != -1) {
            long j15 = this.f102649a;
            if (j15 + j13 == jVar.f102649a) {
                return new j(N, j15, j14 != -1 ? j13 + j14 : -1L);
            }
        }
        if (j14 != -1) {
            long j16 = jVar.f102649a;
            if (j16 + j14 == this.f102649a) {
                return new j(N, j16, j13 != -1 ? j14 + j13 : -1L);
            }
        }
        return null;
    }

    public final Uri b(String str) {
        return b7.c.O(str, this.f102651c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        return this.f102649a == jVar.f102649a && this.f102650b == jVar.f102650b && this.f102651c.equals(jVar.f102651c);
    }

    public final int hashCode() {
        if (this.f102652d == 0) {
            this.f102652d = this.f102651c.hashCode() + ((((527 + ((int) this.f102649a)) * 31) + ((int) this.f102650b)) * 31);
        }
        return this.f102652d;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("RangedUri(referenceUri=");
        sb3.append(this.f102651c);
        sb3.append(", start=");
        sb3.append(this.f102649a);
        sb3.append(", length=");
        return a.a.o(sb3, this.f102650b, ")");
    }
}
