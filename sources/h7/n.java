package h7;

import a.cb;
import java.util.ArrayList;
import java.util.TreeSet;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final int f67910a;

    /* renamed from: b, reason: collision with root package name */
    public final String f67911b;

    /* renamed from: c, reason: collision with root package name */
    public final TreeSet f67912c = new TreeSet();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f67913d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public s f67914e;

    public n(int i13, String str, s sVar) {
        this.f67910a = i13;
        this.f67911b = str;
        this.f67914e = sVar;
    }

    public final long a(long j13, long j14) {
        bf.b.i(j13 >= 0);
        bf.b.i(j14 >= 0);
        x b13 = b(j13, j14);
        boolean z13 = true ^ b13.f67895d;
        long j15 = b13.f67894c;
        if (z13) {
            return -Math.min(j15 != -1 ? j15 : Long.MAX_VALUE, j14);
        }
        long j16 = j13 + j14;
        long j17 = j16 >= 0 ? j16 : Long.MAX_VALUE;
        long j18 = b13.f67893b + j15;
        if (j18 < j17) {
            for (x xVar : this.f67912c.tailSet(b13, false)) {
                long j19 = xVar.f67893b;
                if (j19 > j18) {
                    break;
                }
                j18 = Math.max(j18, j19 + xVar.f67894c);
                if (j18 >= j17) {
                    break;
                }
            }
        }
        return Math.min(j18 - j13, j14);
    }

    public final x b(long j13, long j14) {
        x xVar = new x(this.f67911b, j13, -1L, -9223372036854775807L, null);
        TreeSet treeSet = this.f67912c;
        x xVar2 = (x) treeSet.floor(xVar);
        if (xVar2 != null && xVar2.f67893b + xVar2.f67894c > j13) {
            return xVar2;
        }
        x xVar3 = (x) treeSet.ceiling(xVar);
        if (xVar3 != null) {
            long j15 = xVar3.f67893b - j13;
            j14 = j14 == -1 ? j15 : Math.min(j15, j14);
        }
        return new x(this.f67911b, j13, j14, -9223372036854775807L, null);
    }

    public final boolean c(long j13, long j14) {
        int i13 = 0;
        while (true) {
            ArrayList arrayList = this.f67913d;
            if (i13 >= arrayList.size()) {
                return false;
            }
            m mVar = (m) arrayList.get(i13);
            long j15 = mVar.f67909b;
            long j16 = mVar.f67908a;
            if (j15 == -1) {
                if (j13 >= j16) {
                    return true;
                }
            } else if (j14 != -1 && j16 <= j13 && j13 + j14 <= j16 + j15) {
                return true;
            }
            i13++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n.class != obj.getClass()) {
            return false;
        }
        n nVar = (n) obj;
        return this.f67910a == nVar.f67910a && this.f67911b.equals(nVar.f67911b) && this.f67912c.equals(nVar.f67912c) && this.f67914e.equals(nVar.f67914e);
    }

    public final int hashCode() {
        return this.f67914e.hashCode() + cb.d(this.f67911b, this.f67910a * 31, 31);
    }
}
