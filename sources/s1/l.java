package s1;

import java.util.List;
import m1.f1;
import q3.c1;

/* loaded from: classes2.dex */
public final class l implements m {

    /* renamed from: a, reason: collision with root package name */
    public final int f110458a;

    /* renamed from: b, reason: collision with root package name */
    public final int f110459b;

    /* renamed from: c, reason: collision with root package name */
    public final List f110460c;

    /* renamed from: d, reason: collision with root package name */
    public final long f110461d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f110462e;

    /* renamed from: f, reason: collision with root package name */
    public final u2.c f110463f;

    /* renamed from: g, reason: collision with root package name */
    public final u2.d f110464g;

    /* renamed from: h, reason: collision with root package name */
    public final n4.k f110465h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f110466i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f110467j;

    /* renamed from: k, reason: collision with root package name */
    public final int f110468k;

    /* renamed from: l, reason: collision with root package name */
    public final int[] f110469l;

    /* renamed from: m, reason: collision with root package name */
    public int f110470m;

    /* renamed from: n, reason: collision with root package name */
    public int f110471n;

    public l(int i13, int i14, List list, long j13, Object obj, f1 f1Var, u2.c cVar, u2.d dVar, n4.k kVar, boolean z13) {
        this.f110458a = i13;
        this.f110459b = i14;
        this.f110460c = list;
        this.f110461d = j13;
        this.f110462e = obj;
        this.f110463f = cVar;
        this.f110464g = dVar;
        this.f110465h = kVar;
        this.f110466i = z13;
        this.f110467j = f1Var == f1.Vertical;
        int size = list.size();
        int i15 = 0;
        for (int i16 = 0; i16 < size; i16++) {
            c1 c1Var = (c1) list.get(i16);
            i15 = Math.max(i15, !this.f110467j ? c1Var.f102179b : c1Var.f102178a);
        }
        this.f110468k = i15;
        this.f110469l = new int[this.f110460c.size() * 2];
        this.f110471n = Integer.MIN_VALUE;
    }

    public final void a(int i13) {
        this.f110470m += i13;
        int[] iArr = this.f110469l;
        int length = iArr.length;
        for (int i14 = 0; i14 < length; i14++) {
            boolean z13 = this.f110467j;
            if ((z13 && i14 % 2 == 1) || (!z13 && i14 % 2 == 0)) {
                iArr[i14] = iArr[i14] + i13;
            }
        }
    }

    public final void b(int i13, int i14, int i15) {
        int i16;
        this.f110470m = i13;
        boolean z13 = this.f110467j;
        this.f110471n = z13 ? i15 : i14;
        List list = this.f110460c;
        int size = list.size();
        for (int i17 = 0; i17 < size; i17++) {
            c1 c1Var = (c1) list.get(i17);
            int i18 = i17 * 2;
            int[] iArr = this.f110469l;
            if (z13) {
                u2.c cVar = this.f110463f;
                if (cVar == null) {
                    throw new IllegalArgumentException("null horizontalAlignment".toString());
                }
                iArr[i18] = ((u2.g) cVar).a(c1Var.f102178a, i14, this.f110465h);
                iArr[i18 + 1] = i13;
                i16 = c1Var.f102179b;
            } else {
                iArr[i18] = i13;
                int i19 = i18 + 1;
                u2.d dVar = this.f110464g;
                if (dVar == null) {
                    throw new IllegalArgumentException("null verticalAlignment".toString());
                }
                iArr[i19] = ((u2.h) dVar).a(c1Var.f102179b, i15);
                i16 = c1Var.f102178a;
            }
            i13 += i16;
        }
    }
}
