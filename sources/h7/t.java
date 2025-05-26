package h7;

import java.util.TreeSet;

/* loaded from: classes.dex */
public final class t implements f {

    /* renamed from: a, reason: collision with root package name */
    public final TreeSet f67930a = new TreeSet(new i2.t(3));

    /* renamed from: b, reason: collision with root package name */
    public long f67931b;

    public final void a(a aVar, long j13) {
        while (this.f67931b + j13 > 134217728) {
            TreeSet treeSet = this.f67930a;
            if (treeSet.isEmpty()) {
                return;
            }
            ((w) aVar).p((j) treeSet.first());
        }
    }

    public final void b(a aVar, j jVar) {
        this.f67930a.add(jVar);
        this.f67931b += jVar.f67894c;
        a(aVar, 0L);
    }
}
