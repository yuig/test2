package a;

import ads_mobile_sdk.cj2;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final /* synthetic */ class a1 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ cj2 f6b;

    public /* synthetic */ a1(cj2 cj2Var, int i13) {
        this.f5a = i13;
        this.f6b = cj2Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i13 = this.f5a;
        cj2 cj2Var = this.f6b;
        switch (i13) {
            case 0:
                return cj2Var.d();
            case 1:
                return cj2Var.a();
            default:
                return cj2Var.c();
        }
    }
}
