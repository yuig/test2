package g8;

import androidx.media3.exoplayer.source.MergingMediaSource$IllegalMergeException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import pk.m2;
import pk.v2;

/* loaded from: classes3.dex */
public final class m0 extends j {

    /* renamed from: s, reason: collision with root package name */
    public static final a7.i0 f64338s;

    /* renamed from: k, reason: collision with root package name */
    public final a[] f64339k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f64340l;

    /* renamed from: m, reason: collision with root package name */
    public final a7.b1[] f64341m;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f64342n;

    /* renamed from: o, reason: collision with root package name */
    public final androidx.lifecycle.n1 f64343o;

    /* renamed from: p, reason: collision with root package name */
    public int f64344p;

    /* renamed from: q, reason: collision with root package name */
    public long[][] f64345q;

    /* renamed from: r, reason: collision with root package name */
    public MergingMediaSource$IllegalMergeException f64346r;

    static {
        a7.w wVar = new a7.w();
        pk.y0 y0Var = pk.c1.f100372b;
        v2 v2Var = v2.f100502e;
        Collections.emptyList();
        v2 v2Var2 = v2.f100502e;
        a7.b0 b0Var = new a7.b0();
        f64338s = new a7.i0("MergingMediaSource", new a7.y(wVar), null, new a7.c0(b0Var), a7.l0.I, a7.e0.f982d);
    }

    public m0(a... aVarArr) {
        androidx.lifecycle.n1 n1Var = new androidx.lifecycle.n1();
        this.f64339k = aVarArr;
        this.f64343o = n1Var;
        this.f64342n = new ArrayList(Arrays.asList(aVarArr));
        this.f64344p = -1;
        this.f64340l = new ArrayList(aVarArr.length);
        for (int i13 = 0; i13 < aVarArr.length; i13++) {
            this.f64340l.add(new ArrayList());
        }
        this.f64341m = new a7.b1[aVarArr.length];
        this.f64345q = new long[0][];
        new HashMap();
        pk.a0.C(8, "expectedKeys");
        new m2().j().j();
    }

    @Override // g8.j
    public final void A(Object obj, a aVar, a7.b1 b1Var) {
        Integer num = (Integer) obj;
        if (this.f64346r != null) {
            return;
        }
        if (this.f64344p == -1) {
            this.f64344p = b1Var.i();
        } else if (b1Var.i() != this.f64344p) {
            this.f64346r = new MergingMediaSource$IllegalMergeException();
            return;
        }
        int length = this.f64345q.length;
        a7.b1[] b1VarArr = this.f64341m;
        if (length == 0) {
            this.f64345q = (long[][]) Array.newInstance((Class<?>) Long.TYPE, this.f64344p, b1VarArr.length);
        }
        ArrayList arrayList = this.f64342n;
        arrayList.remove(aVar);
        b1VarArr[num.intValue()] = b1Var;
        if (arrayList.isEmpty()) {
            o(b1VarArr[0]);
        }
    }

    @Override // g8.a
    public final c0 b(e0 e0Var, l8.m mVar, long j13) {
        a[] aVarArr = this.f64339k;
        int length = aVarArr.length;
        c0[] c0VarArr = new c0[length];
        a7.b1[] b1VarArr = this.f64341m;
        int b13 = b1VarArr[0].b(e0Var.f64233a);
        for (int i13 = 0; i13 < length; i13++) {
            e0 a13 = e0Var.a(b1VarArr[i13].m(b13));
            c0VarArr[i13] = aVarArr[i13].b(a13, mVar, j13 - this.f64345q[b13][i13]);
            ((List) this.f64340l.get(i13)).add(new l0(a13, c0VarArr[i13]));
        }
        return new k0(this.f64343o, this.f64345q[b13], c0VarArr);
    }

    @Override // g8.a
    public final a7.i0 j() {
        a[] aVarArr = this.f64339k;
        return aVarArr.length > 0 ? aVarArr[0].j() : f64338s;
    }

    @Override // g8.j, g8.a
    public final void l() {
        MergingMediaSource$IllegalMergeException mergingMediaSource$IllegalMergeException = this.f64346r;
        if (mergingMediaSource$IllegalMergeException != null) {
            throw mergingMediaSource$IllegalMergeException;
        }
        super.l();
    }

    @Override // g8.a
    public final void n(g7.a0 a0Var) {
        this.f64302j = a0Var;
        this.f64301i = d7.n0.n(null);
        int i13 = 0;
        while (true) {
            a[] aVarArr = this.f64339k;
            if (i13 >= aVarArr.length) {
                return;
            }
            B(Integer.valueOf(i13), aVarArr[i13]);
            i13++;
        }
    }

    @Override // g8.a
    public final void q(c0 c0Var) {
        k0 k0Var = (k0) c0Var;
        int i13 = 0;
        while (true) {
            a[] aVarArr = this.f64339k;
            if (i13 >= aVarArr.length) {
                return;
            }
            List list = (List) this.f64340l.get(i13);
            int i14 = 0;
            while (true) {
                if (i14 >= list.size()) {
                    break;
                }
                if (((l0) list.get(i14)).f64332b.equals(c0Var)) {
                    list.remove(i14);
                    break;
                }
                i14++;
            }
            a aVar = aVarArr[i13];
            boolean z13 = k0Var.f64318b[i13];
            c0[] c0VarArr = k0Var.f64317a;
            aVar.q(z13 ? ((l1) c0VarArr[i13]).f64333a : c0VarArr[i13]);
            i13++;
        }
    }

    @Override // g8.j, g8.a
    public final void t() {
        super.t();
        Arrays.fill(this.f64341m, (Object) null);
        this.f64344p = -1;
        this.f64346r = null;
        ArrayList arrayList = this.f64342n;
        arrayList.clear();
        Collections.addAll(arrayList, this.f64339k);
    }

    @Override // g8.a
    public final void w(a7.i0 i0Var) {
        this.f64339k[0].w(i0Var);
    }

    @Override // g8.j
    public final e0 x(Object obj, e0 e0Var) {
        ArrayList arrayList = this.f64340l;
        List list = (List) arrayList.get(((Integer) obj).intValue());
        for (int i13 = 0; i13 < list.size(); i13++) {
            if (((l0) list.get(i13)).f64331a.equals(e0Var)) {
                return ((l0) ((List) arrayList.get(0)).get(i13)).f64331a;
            }
        }
        return null;
    }
}
