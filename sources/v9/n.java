package v9;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import q8.k0;

/* loaded from: classes3.dex */
public final class n implements i {

    /* renamed from: l, reason: collision with root package name */
    public static final float[] f124675l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    public final j0 f124676a;

    /* renamed from: b, reason: collision with root package name */
    public final d7.d0 f124677b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean[] f124678c = new boolean[4];

    /* renamed from: d, reason: collision with root package name */
    public final l f124679d;

    /* renamed from: e, reason: collision with root package name */
    public final w f124680e;

    /* renamed from: f, reason: collision with root package name */
    public m f124681f;

    /* renamed from: g, reason: collision with root package name */
    public long f124682g;

    /* renamed from: h, reason: collision with root package name */
    public String f124683h;

    /* renamed from: i, reason: collision with root package name */
    public k0 f124684i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f124685j;

    /* renamed from: k, reason: collision with root package name */
    public long f124686k;

    public n(j0 j0Var) {
        this.f124676a = j0Var;
        l lVar = new l();
        lVar.f124666e = new byte[RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN];
        this.f124679d = lVar;
        this.f124686k = -9223372036854775807L;
        this.f124680e = new w(RecyclerViewTypes.VIEW_TYPE_GMA_INLINE_AD);
        this.f124677b = new d7.d0();
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0138  */
    @Override // v9.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(d7.d0 r19) {
        /*
            Method dump skipped, instructions count: 622
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v9.n.e(d7.d0):void");
    }

    @Override // v9.i
    public final void f() {
        e7.q.a(this.f124678c);
        l lVar = this.f124679d;
        lVar.f124662a = false;
        lVar.f124664c = 0;
        lVar.f124663b = 0;
        m mVar = this.f124681f;
        if (mVar != null) {
            mVar.f124668b = false;
            mVar.f124669c = false;
            mVar.f124670d = false;
            mVar.f124671e = -1;
        }
        w wVar = this.f124680e;
        if (wVar != null) {
            wVar.c();
        }
        this.f124682g = 0L;
        this.f124686k = -9223372036854775807L;
    }

    @Override // v9.i
    public final void g(q8.u uVar, h0 h0Var) {
        h0Var.a();
        h0Var.b();
        this.f124683h = h0Var.f124635e;
        h0Var.b();
        k0 D = uVar.D(h0Var.f124634d, 2);
        this.f124684i = D;
        this.f124681f = new m(D);
        j0 j0Var = this.f124676a;
        if (j0Var != null) {
            j0Var.b(uVar, h0Var);
        }
    }

    @Override // v9.i
    public final void h(boolean z13) {
        bf.b.w(this.f124681f);
        if (z13) {
            this.f124681f.b(0, this.f124682g, this.f124685j);
            m mVar = this.f124681f;
            mVar.f124668b = false;
            mVar.f124669c = false;
            mVar.f124670d = false;
            mVar.f124671e = -1;
        }
    }

    @Override // v9.i
    public final void i(int i13, long j13) {
        this.f124686k = j13;
    }
}
