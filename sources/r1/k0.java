package r1;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public final l f105923a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f105924b;

    /* renamed from: c, reason: collision with root package name */
    public int f105925c;

    /* renamed from: d, reason: collision with root package name */
    public int f105926d;

    /* renamed from: e, reason: collision with root package name */
    public int f105927e;

    /* renamed from: f, reason: collision with root package name */
    public int f105928f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f105929g;

    /* renamed from: h, reason: collision with root package name */
    public List f105930h;

    /* renamed from: i, reason: collision with root package name */
    public int f105931i;

    public k0(l lVar) {
        this.f105923a = lVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new h0(0, 0));
        this.f105924b = arrayList;
        this.f105928f = -1;
        this.f105929g = new ArrayList();
        this.f105930h = kotlin.collections.q0.f80391a;
    }

    public final int a() {
        return ((int) Math.sqrt((d() * 1.0d) / this.f105931i)) + 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x009d, code lost:
    
        if (r9 < r7) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final ho.i b(int r13) {
        /*
            Method dump skipped, instructions count: 341
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: r1.k0.b(int):ho.i");
    }

    public final int c(int i13) {
        int i14 = 0;
        if (d() <= 0) {
            return 0;
        }
        if (i13 >= d()) {
            throw new IllegalArgumentException("ItemIndex > total count".toString());
        }
        if (!this.f105923a.f105934c) {
            return i13 / this.f105931i;
        }
        ArrayList arrayList = this.f105924b;
        int e13 = kotlin.collections.f0.e(0, arrayList.size(), arrayList, new j0(i13, i14));
        if (e13 < 0) {
            e13 = (-e13) - 2;
        }
        int a13 = a() * e13;
        int i15 = ((h0) arrayList.get(e13)).f105909a;
        if (i15 > i13) {
            throw new IllegalArgumentException("currentItemIndex > itemIndex".toString());
        }
        int i16 = 0;
        while (i15 < i13) {
            int i17 = i15 + 1;
            int e14 = e(i15);
            i16 += e14;
            int i18 = this.f105931i;
            if (i16 >= i18) {
                if (i16 == i18) {
                    a13++;
                    i16 = 0;
                } else {
                    a13++;
                    i16 = e14;
                }
            }
            if (a13 % a() == 0 && a13 / a() >= arrayList.size()) {
                arrayList.add(new h0(i17 - (i16 > 0 ? 1 : 0), 0));
            }
            i15 = i17;
        }
        return e(i13) + i16 > this.f105931i ? a13 + 1 : a13;
    }

    public final int d() {
        return this.f105923a.f105933b.f17319b;
    }

    public final int e(int i13) {
        i0 i0Var = i0.f105915a;
        androidx.compose.foundation.lazy.layout.f c13 = this.f105923a.f105933b.c(i13);
        return (int) ((d) ((i) c13.f17238c).f105912b.invoke(i0Var, Integer.valueOf(i13 - c13.f17236a))).f105872a;
    }
}
