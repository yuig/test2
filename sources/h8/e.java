package h8;

import android.util.SparseArray;
import q8.c0;
import q8.e0;
import q8.k0;
import q8.s;
import q8.u;

/* loaded from: classes.dex */
public final class e implements u, i {

    /* renamed from: j, reason: collision with root package name */
    public static final c0 f68013j;

    /* renamed from: a, reason: collision with root package name */
    public final s f68014a;

    /* renamed from: b, reason: collision with root package name */
    public final int f68015b;

    /* renamed from: c, reason: collision with root package name */
    public final androidx.media3.common.b f68016c;

    /* renamed from: d, reason: collision with root package name */
    public final SparseArray f68017d = new SparseArray();

    /* renamed from: e, reason: collision with root package name */
    public boolean f68018e;

    /* renamed from: f, reason: collision with root package name */
    public h f68019f;

    /* renamed from: g, reason: collision with root package name */
    public long f68020g;

    /* renamed from: h, reason: collision with root package name */
    public e0 f68021h;

    /* renamed from: i, reason: collision with root package name */
    public androidx.media3.common.b[] f68022i;

    static {
        new o5.a(1);
        f68013j = new c0(0);
    }

    public e(s sVar, int i13, androidx.media3.common.b bVar) {
        this.f68014a = sVar;
        this.f68015b = i13;
        this.f68016c = bVar;
    }

    @Override // q8.u
    public final void A() {
        SparseArray sparseArray = this.f68017d;
        androidx.media3.common.b[] bVarArr = new androidx.media3.common.b[sparseArray.size()];
        for (int i13 = 0; i13 < sparseArray.size(); i13++) {
            androidx.media3.common.b bVar = ((d) sparseArray.valueAt(i13)).f68010d;
            bf.b.w(bVar);
            bVarArr[i13] = bVar;
        }
        this.f68022i = bVarArr;
    }

    @Override // q8.u
    public final k0 D(int i13, int i14) {
        SparseArray sparseArray = this.f68017d;
        d dVar = (d) sparseArray.get(i13);
        if (dVar == null) {
            bf.b.t(this.f68022i == null);
            dVar = new d(i13, i14, i14 == this.f68015b ? this.f68016c : null);
            h hVar = this.f68019f;
            long j13 = this.f68020g;
            if (hVar == null) {
                dVar.f68011e = dVar.f68009c;
            } else {
                dVar.f68012f = j13;
                k0 a13 = ((c) hVar).a(i14);
                dVar.f68011e = a13;
                androidx.media3.common.b bVar = dVar.f68010d;
                if (bVar != null) {
                    a13.b(bVar);
                }
            }
            sparseArray.put(i13, dVar);
        }
        return dVar;
    }

    public final q8.m a() {
        e0 e0Var = this.f68021h;
        if (e0Var instanceof q8.m) {
            return (q8.m) e0Var;
        }
        return null;
    }

    public final void b(h hVar, long j13, long j14) {
        this.f68019f = hVar;
        this.f68020g = j14;
        boolean z13 = this.f68018e;
        s sVar = this.f68014a;
        if (!z13) {
            sVar.f(this);
            if (j13 != -9223372036854775807L) {
                sVar.b(0L, j13);
            }
            this.f68018e = true;
            return;
        }
        if (j13 == -9223372036854775807L) {
            j13 = 0;
        }
        sVar.b(0L, j13);
        int i13 = 0;
        while (true) {
            SparseArray sparseArray = this.f68017d;
            if (i13 >= sparseArray.size()) {
                return;
            }
            d dVar = (d) sparseArray.valueAt(i13);
            if (hVar == null) {
                dVar.f68011e = dVar.f68009c;
            } else {
                dVar.f68012f = j14;
                k0 a13 = ((c) hVar).a(dVar.f68007a);
                dVar.f68011e = a13;
                androidx.media3.common.b bVar = dVar.f68010d;
                if (bVar != null) {
                    a13.b(bVar);
                }
            }
            i13++;
        }
    }

    public final boolean c(q8.o oVar) {
        int d2 = this.f68014a.d(oVar, f68013j);
        bf.b.t(d2 != 1);
        return d2 == 0;
    }

    public final void d() {
        this.f68014a.a();
    }

    @Override // q8.u
    public final void j(e0 e0Var) {
        this.f68021h = e0Var;
    }
}
