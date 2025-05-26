package a;

import ads_mobile_sdk.vw2;
import ads_mobile_sdk.x02;

/* renamed from: a.if, reason: invalid class name */
/* loaded from: classes2.dex */
public final /* synthetic */ class Cif implements com.google.common.util.concurrent.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f62a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x02 f63b;

    public /* synthetic */ Cif(x02 x02Var, int i13) {
        this.f62a = i13;
        this.f63b = x02Var;
    }

    @Override // com.google.common.util.concurrent.m
    public final com.google.common.util.concurrent.c0 apply(Object obj) {
        int i13 = this.f62a;
        x02 x02Var = this.f63b;
        vw2 vw2Var = (vw2) obj;
        switch (i13) {
            case 0:
                return x02Var.a(vw2Var);
            default:
                return x02Var.b(vw2Var);
        }
    }
}
