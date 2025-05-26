package u9;

import d7.n0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import v.j2;

/* loaded from: classes3.dex */
public final class k implements l9.d {

    /* renamed from: a, reason: collision with root package name */
    public final List f121167a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f121168b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f121169c;

    public k(ArrayList arrayList) {
        this.f121167a = Collections.unmodifiableList(new ArrayList(arrayList));
        this.f121168b = new long[arrayList.size() * 2];
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            d dVar = (d) arrayList.get(i13);
            int i14 = i13 * 2;
            long[] jArr = this.f121168b;
            jArr[i14] = dVar.f121140b;
            jArr[i14 + 1] = dVar.f121141c;
        }
        long[] jArr2 = this.f121168b;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f121169c = copyOf;
        Arrays.sort(copyOf);
    }

    @Override // l9.d
    public final int a(long j13) {
        long[] jArr = this.f121169c;
        int a13 = n0.a(jArr, j13, false);
        if (a13 < jArr.length) {
            return a13;
        }
        return -1;
    }

    @Override // l9.d
    public final List b(long j13) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i13 = 0;
        while (true) {
            List list = this.f121167a;
            if (i13 >= list.size()) {
                break;
            }
            int i14 = i13 * 2;
            long[] jArr = this.f121168b;
            if (jArr[i14] <= j13 && j13 < jArr[i14 + 1]) {
                d dVar = (d) list.get(i13);
                c7.b bVar = dVar.f121139a;
                if (bVar.f26688e == -3.4028235E38f) {
                    arrayList2.add(dVar);
                } else {
                    arrayList.add(bVar);
                }
            }
            i13++;
        }
        Collections.sort(arrayList2, new j2(17));
        for (int i15 = 0; i15 < arrayList2.size(); i15++) {
            c7.a a13 = ((d) arrayList2.get(i15)).f121139a.a();
            a13.f26661e = (-1) - i15;
            a13.f26662f = 1;
            arrayList.add(a13.a());
        }
        return arrayList;
    }

    @Override // l9.d
    public final long c(int i13) {
        bf.b.i(i13 >= 0);
        long[] jArr = this.f121169c;
        bf.b.i(i13 < jArr.length);
        return jArr[i13];
    }

    @Override // l9.d
    public final int d() {
        return this.f121169c.length;
    }
}
