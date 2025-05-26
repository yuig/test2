package cb2;

import com.pinterest.api.model.f30;

/* loaded from: classes4.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final f30 f27371a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f27372b;

    public u(x xVar, f30 f30Var) {
        this.f27372b = xVar;
        this.f27371a = f30Var;
    }

    public final void a() {
        f30 f30Var = this.f27371a;
        String uid = f30Var != null ? f30Var.getUid() : null;
        if (uid != null) {
            this.f27372b.f27379b.d(new m10.a(uid));
        }
    }
}
