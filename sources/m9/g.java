package m9;

/* loaded from: classes3.dex */
public final class g extends l9.h implements Comparable {

    /* renamed from: l, reason: collision with root package name */
    public long f86606l;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        g gVar = (g) obj;
        if (i(4) == gVar.i(4)) {
            long j13 = this.f78456g - gVar.f78456g;
            if (j13 == 0) {
                j13 = this.f86606l - gVar.f86606l;
                if (j13 == 0) {
                    return 0;
                }
            }
            if (j13 <= 0) {
                return -1;
            }
        } else if (!i(4)) {
            return -1;
        }
        return 1;
    }
}
