package z7;

import d7.n0;

/* loaded from: classes3.dex */
public final class s implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final long f140971a;

    /* renamed from: b, reason: collision with root package name */
    public final g7.i f140972b;

    public s(long j13, g7.i iVar) {
        this.f140971a = j13;
        this.f140972b = iVar;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j13 = ((s) obj).f140971a;
        int i13 = n0.f53866a;
        long j14 = this.f140971a;
        if (j14 < j13) {
            return -1;
        }
        return j14 == j13 ? 0 : 1;
    }
}
