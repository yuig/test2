package j9;

import a7.o0;
import androidx.media3.common.DrmInitData;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import d7.d0;
import d7.n0;
import q8.k0;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final k0 f74973a;

    /* renamed from: d, reason: collision with root package name */
    public s f74976d;

    /* renamed from: e, reason: collision with root package name */
    public f f74977e;

    /* renamed from: f, reason: collision with root package name */
    public int f74978f;

    /* renamed from: g, reason: collision with root package name */
    public int f74979g;

    /* renamed from: h, reason: collision with root package name */
    public int f74980h;

    /* renamed from: i, reason: collision with root package name */
    public int f74981i;

    /* renamed from: j, reason: collision with root package name */
    public final String f74982j;

    /* renamed from: m, reason: collision with root package name */
    public boolean f74985m;

    /* renamed from: b, reason: collision with root package name */
    public final r f74974b = new r();

    /* renamed from: c, reason: collision with root package name */
    public final d0 f74975c = new d0();

    /* renamed from: k, reason: collision with root package name */
    public final d0 f74983k = new d0(1);

    /* renamed from: l, reason: collision with root package name */
    public final d0 f74984l = new d0();

    public h(k0 k0Var, s sVar, f fVar, String str) {
        this.f74973a = k0Var;
        this.f74976d = sVar;
        this.f74977e = fVar;
        this.f74982j = str;
        e(sVar, fVar);
    }

    public final int a() {
        int i13 = !this.f74985m ? this.f74976d.f75095g[this.f74978f] : this.f74974b.f75081j[this.f74978f] ? 1 : 0;
        return b() != null ? i13 | 1073741824 : i13;
    }

    public final q b() {
        if (!this.f74985m) {
            return null;
        }
        r rVar = this.f74974b;
        f fVar = rVar.f75072a;
        int i13 = n0.f53866a;
        int i14 = fVar.f74966a;
        q qVar = rVar.f75084m;
        if (qVar == null) {
            q[] qVarArr = this.f74976d.f75089a.f75066l;
            qVar = qVarArr == null ? null : qVarArr[i14];
        }
        if (qVar == null || !qVar.f75067a) {
            return null;
        }
        return qVar;
    }

    public final boolean c() {
        this.f74978f++;
        if (!this.f74985m) {
            return false;
        }
        int i13 = this.f74979g + 1;
        this.f74979g = i13;
        int[] iArr = this.f74974b.f75078g;
        int i14 = this.f74980h;
        if (i13 != iArr[i14]) {
            return true;
        }
        this.f74980h = i14 + 1;
        this.f74979g = 0;
        return false;
    }

    public final int d(int i13, int i14) {
        d0 d0Var;
        q b13 = b();
        if (b13 == null) {
            return 0;
        }
        r rVar = this.f74974b;
        int i15 = b13.f75070d;
        if (i15 != 0) {
            d0Var = rVar.f75085n;
        } else {
            int i16 = n0.f53866a;
            byte[] bArr = b13.f75071e;
            int length = bArr.length;
            d0 d0Var2 = this.f74984l;
            d0Var2.I(length, bArr);
            i15 = bArr.length;
            d0Var = d0Var2;
        }
        boolean b14 = rVar.b(this.f74978f);
        boolean z13 = b14 || i14 != 0;
        d0 d0Var3 = this.f74983k;
        d0Var3.f53806a[0] = (byte) ((z13 ? RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN : 0) | i15);
        d0Var3.K(0);
        k0 k0Var = this.f74973a;
        k0Var.d(1, 1, d0Var3);
        k0Var.d(i15, 1, d0Var);
        if (!z13) {
            return i15 + 1;
        }
        d0 d0Var4 = this.f74975c;
        if (!b14) {
            d0Var4.H(8);
            byte[] bArr2 = d0Var4.f53806a;
            bArr2[0] = 0;
            bArr2[1] = 1;
            bArr2[2] = (byte) 0;
            bArr2[3] = (byte) (i14 & 255);
            bArr2[4] = (byte) ((i13 >> 24) & 255);
            bArr2[5] = (byte) ((i13 >> 16) & 255);
            bArr2[6] = (byte) ((i13 >> 8) & 255);
            bArr2[7] = (byte) (i13 & 255);
            k0Var.d(8, 1, d0Var4);
            return i15 + 9;
        }
        d0 d0Var5 = rVar.f75085n;
        int E = d0Var5.E();
        d0Var5.L(-2);
        int i17 = (E * 6) + 2;
        if (i14 != 0) {
            d0Var4.H(i17);
            byte[] bArr3 = d0Var4.f53806a;
            d0Var5.i(bArr3, 0, i17);
            int i18 = (((bArr3[2] & 255) << 8) | (bArr3[3] & 255)) + i14;
            bArr3[2] = (byte) ((i18 >> 8) & 255);
            bArr3[3] = (byte) (i18 & 255);
        } else {
            d0Var4 = d0Var5;
        }
        k0Var.d(i17, 1, d0Var4);
        return i15 + 1 + i17;
    }

    public final void e(s sVar, f fVar) {
        this.f74976d = sVar;
        this.f74977e = fVar;
        a7.q a13 = sVar.f75089a.f75061g.a();
        a13.f1180m = o0.r(this.f74982j);
        this.f74973a.b(new androidx.media3.common.b(a13));
        f();
    }

    public final void f() {
        r rVar = this.f74974b;
        rVar.f75075d = 0;
        rVar.f75087p = 0L;
        rVar.f75088q = false;
        rVar.f75082k = false;
        rVar.f75086o = false;
        rVar.f75084m = null;
        this.f74978f = 0;
        this.f74980h = 0;
        this.f74979g = 0;
        this.f74981i = 0;
        this.f74985m = false;
    }

    public final void g() {
        q b13 = b();
        if (b13 == null) {
            return;
        }
        r rVar = this.f74974b;
        d0 d0Var = rVar.f75085n;
        int i13 = b13.f75070d;
        if (i13 != 0) {
            d0Var.L(i13);
        }
        if (rVar.b(this.f74978f)) {
            d0Var.L(d0Var.E() * 6);
        }
    }

    public final void h(DrmInitData drmInitData) {
        p pVar = this.f74976d.f75089a;
        f fVar = this.f74974b.f75072a;
        int i13 = n0.f53866a;
        int i14 = fVar.f74966a;
        q[] qVarArr = pVar.f75066l;
        q qVar = qVarArr == null ? null : qVarArr[i14];
        DrmInitData b13 = drmInitData.b(qVar != null ? qVar.f75068b : null);
        a7.q a13 = this.f74976d.f75089a.f75061g.a();
        a13.f1180m = o0.r(this.f74982j);
        a13.f1185r = b13;
        this.f74973a.b(new androidx.media3.common.b(a13));
    }
}
