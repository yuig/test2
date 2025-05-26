package v9;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import q8.k0;

/* loaded from: classes3.dex */
public final class k implements i {

    /* renamed from: r, reason: collision with root package name */
    public static final double[] f124643r = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* renamed from: a, reason: collision with root package name */
    public String f124644a;

    /* renamed from: b, reason: collision with root package name */
    public k0 f124645b;

    /* renamed from: c, reason: collision with root package name */
    public final j0 f124646c;

    /* renamed from: d, reason: collision with root package name */
    public final String f124647d;

    /* renamed from: e, reason: collision with root package name */
    public final d7.d0 f124648e;

    /* renamed from: f, reason: collision with root package name */
    public final w f124649f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f124650g = new boolean[4];

    /* renamed from: h, reason: collision with root package name */
    public final j f124651h;

    /* renamed from: i, reason: collision with root package name */
    public long f124652i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f124653j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f124654k;

    /* renamed from: l, reason: collision with root package name */
    public long f124655l;

    /* renamed from: m, reason: collision with root package name */
    public long f124656m;

    /* renamed from: n, reason: collision with root package name */
    public long f124657n;

    /* renamed from: o, reason: collision with root package name */
    public long f124658o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f124659p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f124660q;

    public k(j0 j0Var, String str) {
        this.f124646c = j0Var;
        this.f124647d = str;
        j jVar = new j();
        jVar.f124640d = new byte[RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN];
        this.f124651h = jVar;
        if (j0Var != null) {
            this.f124649f = new w(RecyclerViewTypes.VIEW_TYPE_GMA_INLINE_AD);
            this.f124648e = new d7.d0();
        } else {
            this.f124649f = null;
            this.f124648e = null;
        }
        this.f124656m = -9223372036854775807L;
        this.f124658o = -9223372036854775807L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01e3  */
    @Override // v9.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(d7.d0 r22) {
        /*
            Method dump skipped, instructions count: 518
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v9.k.e(d7.d0):void");
    }

    @Override // v9.i
    public final void f() {
        e7.q.a(this.f124650g);
        j jVar = this.f124651h;
        jVar.f124637a = false;
        jVar.f124638b = 0;
        jVar.f124639c = 0;
        w wVar = this.f124649f;
        if (wVar != null) {
            wVar.c();
        }
        this.f124652i = 0L;
        this.f124653j = false;
        this.f124656m = -9223372036854775807L;
        this.f124658o = -9223372036854775807L;
    }

    @Override // v9.i
    public final void g(q8.u uVar, h0 h0Var) {
        h0Var.a();
        h0Var.b();
        this.f124644a = h0Var.f124635e;
        h0Var.b();
        this.f124645b = uVar.D(h0Var.f124634d, 2);
        j0 j0Var = this.f124646c;
        if (j0Var != null) {
            j0Var.b(uVar, h0Var);
        }
    }

    @Override // v9.i
    public final void h(boolean z13) {
        bf.b.w(this.f124645b);
        if (z13) {
            boolean z14 = this.f124659p;
            this.f124645b.a(this.f124658o, z14 ? 1 : 0, (int) (this.f124652i - this.f124657n), 0, null);
        }
    }

    @Override // v9.i
    public final void i(int i13, long j13) {
        this.f124656m = j13;
    }
}
