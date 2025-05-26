package i2;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a2 implements dc.f {

    /* renamed from: a, reason: collision with root package name */
    public final List f71073a;

    public a2(int i13) {
        switch (i13) {
            case 3:
                this.f71073a = new ArrayList();
                break;
            case 4:
                this.f71073a = new ArrayList();
                break;
            case 5:
                this.f71073a = new ArrayList();
                break;
            case 6:
                this.f71073a = new ArrayList();
                break;
            case 7:
                this.f71073a = new ArrayList();
                break;
            case 8:
                this.f71073a = new ArrayList();
                break;
            case 9:
                this.f71073a = new ArrayList();
                break;
            default:
                this.f71073a = new ArrayList();
                break;
        }
    }

    @Override // dc.f
    public zb.e a() {
        List list = this.f71073a;
        return ((kc.a) list.get(0)).c() ? new zb.o(list, 0) : new zb.n(list);
    }

    @Override // dc.f
    public List b() {
        return this.f71073a;
    }

    @Override // dc.f
    public boolean c() {
        List list = this.f71073a;
        return list.size() == 1 && ((kc.a) list.get(0)).c();
    }

    public void d(int i13) {
        List list = this.f71073a;
        if ((!list.isEmpty()) && (((Number) list.get(0)).intValue() == i13 || ((Number) ep.b.i(list, 1)).intValue() == i13)) {
            return;
        }
        int size = list.size();
        list.add(Integer.valueOf(i13));
        while (size > 0) {
            int i14 = ((size + 1) >>> 1) - 1;
            int intValue = ((Number) list.get(i14)).intValue();
            if (i13 <= intValue) {
                break;
            }
            list.set(size, Integer.valueOf(intValue));
            size = i14;
        }
        list.set(size, Integer.valueOf(i13));
    }

    public void e(Path path) {
        List list = this.f71073a;
        for (int size = list.size() - 1; size >= 0; size--) {
            yb.w wVar = (yb.w) list.get(size);
            t3.n1 n1Var = jc.g.f75394a;
            if (wVar != null && !wVar.f138465a) {
                jc.g.a(path, wVar.f138468d.m() / 100.0f, wVar.f138469e.m() / 100.0f, wVar.f138470f.m() / 360.0f);
            }
        }
    }

    public boolean f(tb.s workSpec) {
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        List list = this.f71073a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((qb.e) obj).c(workSpec)) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            kb.b0.e().a(pb.m.f99427a, "Work " + workSpec.f117016a + " constrained by " + CollectionsKt.Z(arrayList, null, null, null, 0, null, pb.j.f99420i, 31));
        }
        return arrayList.isEmpty();
    }

    public synchronized nd.o g(Class cls) {
        int size = this.f71073a.size();
        for (int i13 = 0; i13 < size; i13++) {
            ce.d dVar = (ce.d) this.f71073a.get(i13);
            if (dVar.f27582a.isAssignableFrom(cls)) {
                return dVar.f27583b;
            }
        }
        return null;
    }

    public synchronized ArrayList h(Class cls, Class cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (zd.b bVar : this.f71073a) {
            if (bVar.a(cls, cls2) && !arrayList.contains(bVar.f141657b)) {
                arrayList.add(bVar.f141657b);
            }
        }
        return arrayList;
    }

    public int i() {
        int intValue;
        List list = this.f71073a;
        if (!(list.size() > 0)) {
            u.i("Set is empty");
            throw null;
        }
        int intValue2 = ((Number) list.get(0)).intValue();
        while ((!list.isEmpty()) && ((Number) list.get(0)).intValue() == intValue2) {
            list.set(0, CollectionsKt.b0(list));
            list.remove(list.size() - 1);
            int size = list.size();
            int size2 = list.size() >>> 1;
            int i13 = 0;
            while (i13 < size2) {
                int intValue3 = ((Number) list.get(i13)).intValue();
                int i14 = (i13 + 1) * 2;
                int i15 = i14 - 1;
                int intValue4 = ((Number) list.get(i15)).intValue();
                if (i14 >= size || (intValue = ((Number) list.get(i14)).intValue()) <= intValue4) {
                    if (intValue4 > intValue3) {
                        list.set(i13, Integer.valueOf(intValue4));
                        list.set(i15, Integer.valueOf(intValue3));
                        i13 = i15;
                    }
                } else if (intValue > intValue3) {
                    list.set(i13, Integer.valueOf(intValue));
                    list.set(i14, Integer.valueOf(intValue3));
                    i13 = i14;
                }
            }
        }
        return intValue2;
    }

    public do2.i j(tb.s spec) {
        Intrinsics.checkNotNullParameter(spec, "spec");
        List list = this.f71073a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((qb.e) obj).a(spec)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(kotlin.collections.g0.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((qb.e) it.next()).b(spec.f117025j));
        }
        return lb.l0.V(new pb.k((do2.i[]) CollectionsKt.F0(arrayList2).toArray(new do2.i[0])));
    }

    public a2(List spanList, int i13) {
        if (i13 == 2) {
            this.f71073a = spanList;
            return;
        }
        if (i13 == 10) {
            Intrinsics.checkNotNullParameter(spanList, "spanList");
            this.f71073a = spanList;
        } else if (i13 != 11) {
            Intrinsics.checkNotNullParameter(spanList, "controllers");
            this.f71073a = spanList;
        } else {
            Intrinsics.checkNotNullParameter(spanList, "translators");
            this.f71073a = spanList;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public a2(rb.l r7) {
        /*
            r6 = this;
            r0 = 0
            java.lang.String r1 = "trackers"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r1)
            r1 = 8
            qb.e[] r1 = new qb.e[r1]
            qb.d r2 = new qb.d
            rb.f r3 = r7.f107073b
            r2.<init>(r3, r0)
            r1[r0] = r2
            qb.d r2 = new qb.d
            rb.a r3 = r7.f107074c
            r2.<init>(r3)
            r3 = 1
            r1[r3] = r2
            qb.d r2 = new qb.d
            rb.f r3 = r7.f107076e
            r4 = 4
            r2.<init>(r3, r4)
            r3 = 2
            r1[r3] = r2
            qb.d r2 = new qb.d
            rb.f r5 = r7.f107075d
            r2.<init>(r5, r3)
            r3 = 3
            r1[r3] = r2
            qb.d r2 = new qb.d
            r2.<init>(r5, r3)
            r1[r4] = r2
            qb.g r2 = new qb.g
            r2.<init>(r5)
            r3 = 5
            r1[r3] = r2
            qb.f r2 = new qb.f
            r2.<init>(r5)
            r3 = 6
            r1[r3] = r2
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 28
            if (r2 < r3) goto L6b
            java.lang.String r2 = pb.m.f99427a
            java.lang.String r2 = "context"
            android.content.Context r7 = r7.f107072a
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r2)
            java.lang.String r2 = "connectivity"
            java.lang.Object r7 = r7.getSystemService(r2)
            java.lang.String r2 = "null cannot be cast to non-null type android.net.ConnectivityManager"
            kotlin.jvm.internal.Intrinsics.g(r7, r2)
            android.net.ConnectivityManager r7 = (android.net.ConnectivityManager) r7
            pb.g r2 = new pb.g
            r2.<init>(r7)
            goto L6c
        L6b:
            r2 = 0
        L6c:
            r7 = 7
            r1[r7] = r2
            java.lang.String r7 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r7)
            java.util.ArrayList r7 = kotlin.collections.c0.A(r1)
            r6.<init>(r7, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.a2.<init>(rb.l):void");
    }

    public a2() {
        this.f71073a = new ArrayList();
    }
}
