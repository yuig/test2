package ads_mobile_sdk;

import a.fa;
import a.p9;

/* loaded from: classes2.dex */
public final class qn2 implements p9 {

    /* renamed from: a, reason: collision with root package name */
    public final fa f10187a;

    /* renamed from: b, reason: collision with root package name */
    public final xc0 f10188b;

    /* renamed from: c, reason: collision with root package name */
    public final a.n5 f10189c;

    /* renamed from: d, reason: collision with root package name */
    public final bt2 f10190d;

    public qn2(fa faVar, xc0 xc0Var, a.n5 n5Var, bt2 bt2Var) {
        this.f10187a = faVar;
        this.f10188b = xc0Var;
        this.f10189c = n5Var;
        this.f10190d = bt2Var;
    }

    public final com.google.common.util.concurrent.c0 a() {
        bt2 bt2Var = this.f10190d;
        xb0 xb0Var = xb0.EVENT_ID_DG_STORAGE_GET_METADATA;
        v50 v50Var = (v50) this.f10187a;
        return bt2Var.a(xb0Var, kg.o.l(v50Var.f12353c, new s50(v50Var, null)));
    }
}
