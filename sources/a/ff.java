package a;

import ads_mobile_sdk.t12;
import ads_mobile_sdk.uc0;
import ads_mobile_sdk.ww2;

/* loaded from: classes2.dex */
public final /* synthetic */ class ff implements com.google.common.util.concurrent.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f40b;

    public /* synthetic */ ff(Object obj, int i13) {
        this.f39a = i13;
        this.f40b = obj;
    }

    @Override // com.google.common.util.concurrent.m
    public final com.google.common.util.concurrent.c0 apply(Object obj) {
        int i13 = this.f39a;
        Object obj2 = this.f40b;
        switch (i13) {
            case 0:
                return ((ww2) obj2).a((Integer) obj);
            case 1:
                return ((ww2) obj2).b((uc0) obj);
            default:
                return ((t12) obj2).a((Integer) obj);
        }
    }
}
