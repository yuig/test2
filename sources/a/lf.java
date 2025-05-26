package a;

import ads_mobile_sdk.x71;

/* loaded from: classes2.dex */
public final /* synthetic */ class lf implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f108a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x71 f109b;

    public /* synthetic */ lf(x71 x71Var, int i13) {
        this.f108a = i13;
        this.f109b = x71Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i13 = this.f108a;
        x71 x71Var = this.f109b;
        switch (i13) {
            case 0:
                x71Var.c();
                break;
            default:
                x71Var.b();
                break;
        }
    }
}
