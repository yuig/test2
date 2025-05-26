package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class at2 implements com.google.common.util.concurrent.w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bs2 f2543a;

    public at2(bs2 bs2Var) {
        this.f2543a = bs2Var;
    }

    @Override // com.google.common.util.concurrent.w
    public final void onFailure(Throwable th3) {
        this.f2543a.a(th3);
        this.f2543a.a();
    }

    @Override // com.google.common.util.concurrent.w
    public final void onSuccess(Object obj) {
        this.f2543a.a();
    }
}
