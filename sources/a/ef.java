package a;

import ads_mobile_sdk.uc0;
import ads_mobile_sdk.ww2;
import ads_mobile_sdk.x12;

/* loaded from: classes2.dex */
public final /* synthetic */ class ef implements ok.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ww2 f36b;

    public /* synthetic */ ef(ww2 ww2Var, int i13) {
        this.f35a = i13;
        this.f36b = ww2Var;
    }

    @Override // ok.t
    public final Object apply(Object obj) {
        int i13 = this.f35a;
        ww2 ww2Var = this.f36b;
        switch (i13) {
            case 0:
                return Integer.valueOf(ww2Var.a((x12) obj));
            default:
                return ww2Var.a((uc0) obj);
        }
    }
}
