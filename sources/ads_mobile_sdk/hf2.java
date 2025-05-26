package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class hf2 extends jd2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ if2 f5948b;

    public hf2(if2 if2Var) {
        this.f5948b = if2Var;
    }

    @Override // ads_mobile_sdk.jd2
    public final void a() {
        jf2 jf2Var = this.f5948b.f6390a;
        jf2Var.f6786b.a("unlinkToDeath", new Object[0]);
        jf2Var.f6798n.asBinder().unlinkToDeath(jf2Var.f6795k, 0);
        jf2 jf2Var2 = this.f5948b.f6390a;
        jf2Var2.f6798n = null;
        jf2Var2.f6791g = false;
    }
}
