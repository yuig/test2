package a;

import ads_mobile_sdk.b21;
import ads_mobile_sdk.ds0;
import ads_mobile_sdk.ic2;
import ads_mobile_sdk.l11;
import ads_mobile_sdk.qb2;
import ads_mobile_sdk.ra2;
import ads_mobile_sdk.u91;

/* loaded from: classes2.dex */
public final /* synthetic */ class z implements fd {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f192a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ds0 f193b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w6 f194c;

    public /* synthetic */ z(ds0 ds0Var, w6 w6Var, int i13) {
        this.f192a = i13;
        this.f193b = ds0Var;
        this.f194c = w6Var;
    }

    @Override // a.fd
    public final void a() {
        int i13 = this.f192a;
        w6 w6Var = this.f194c;
        ds0 ds0Var = this.f193b;
        switch (i13) {
            case 0:
                b21.a((ic2) ds0Var, (b21) w6Var);
                break;
            case 1:
                ads_mobile_sdk.he.a((ic2) ds0Var, (ads_mobile_sdk.he) w6Var);
                break;
            case 2:
                l11.a((u91) ds0Var, (l11) w6Var);
                break;
            case 3:
                qb2.a((ic2) ds0Var, (qb2) w6Var);
                break;
            case 4:
                ra2.a((u91) ds0Var, (ra2) w6Var);
                break;
            default:
                ads_mobile_sdk.wd.a((u91) ds0Var, (ads_mobile_sdk.wd) w6Var);
                break;
        }
    }
}
