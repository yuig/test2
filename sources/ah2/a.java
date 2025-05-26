package ah2;

import a.cb;

/* loaded from: classes4.dex */
public final class a extends f {

    /* renamed from: c, reason: collision with root package name */
    public final int f15191c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public a(int r3) {
        /*
            r2 = this;
            r0 = 500(0x1f4, float:7.0E-43)
            r1 = 0
            if (r0 > r3) goto La
            r0 = 600(0x258, float:8.41E-43)
            if (r3 >= r0) goto La
            r1 = 1
        La:
            r2.<init>(r1)
            r2.f15191c = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ah2.a.<init>(int):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f15191c == ((a) obj).f15191c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f15191c);
    }

    public final String toString() {
        return cb.l(new StringBuilder("Failure(code="), this.f15191c, ')');
    }
}
