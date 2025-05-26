package com.pinterest.feature.unauth.sba;

import android.app.Application;
import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import o82.j3;
import w41.q1;
import we1.n1;

/* loaded from: classes5.dex */
public final class s0 extends l82.b implements l82.i {

    /* renamed from: c, reason: collision with root package name */
    public final lh1.d f48867c;

    /* renamed from: d, reason: collision with root package name */
    public final g01.a f48868d;

    /* renamed from: e, reason: collision with root package name */
    public final l82.y f48869e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(oc.c apolloClient, lh1.d navigationSEP, Application application, ao2.j0 scope) {
        super(scope);
        Intrinsics.checkNotNullParameter(apolloClient, "apolloClient");
        Intrinsics.checkNotNullParameter(navigationSEP, "navigationSEP");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f48867c = navigationSEP;
        kv0.p pVar = new kv0.p(4);
        kv0.p.b(pVar, new q1(10), new bt0.u(28), new j3(kotlin.collections.e0.b(new a0())), false, null, null, null, null, null, null, 1016);
        kv0.p.b(pVar, new q1(11), new bt0.u(29), new j3(kotlin.collections.f0.j(new b0(kotlin.collections.f0.j("Home decor", "Food and drink"), kotlin.collections.f0.j("https://i.pinimg.com/originals/37/2e/21/372e21f5ff799eb314ba5cf84f6b64f8.png", "https://i.pinimg.com/originals/0c/f0/b8/0cf0b88f3377c8f5a47a73c9cd947e89.png")), new b0(kotlin.collections.f0.j("Beauty", "Women's fashion"), kotlin.collections.f0.j("https://i.pinimg.com/originals/b0/19/a9/b019a9a80e2af476e922f4029285a7aa.png", "https://i.pinimg.com/originals/8b/0a/ad/8b0aad1ca7838d1a9e15273791aad0b5.png")), new b0(kotlin.collections.f0.j("Weddings", "DIY and crafts"), kotlin.collections.f0.j("https://i.pinimg.com/originals/9d/82/e1/9d82e1edf1304c5a00eb743fd52b776c.png", "https://i.pinimg.com/originals/b3/19/45/b319456e3f215c9ce23a24da99339fca.png")))), false, null, null, null, null, null, null, 1016);
        q1 q1Var = new q1(12);
        q0 q0Var = new q0(0);
        y yVar = y.f48879a;
        kv0.p.b(pVar, q1Var, q0Var, new j3(kotlin.collections.e0.b(yVar)), false, null, null, null, null, null, null, 1016);
        q1 q1Var2 = new q1(13);
        q0 q0Var2 = new q0(1);
        Intrinsics.checkNotNullParameter(apolloClient, "apolloClient");
        kv0.p.b(pVar, q1Var2, q0Var2, new o82.h(new androidx.appcompat.widget.q(apolloClient, 6)), false, null, null, null, null, null, null, 1016);
        kv0.p.b(pVar, new q1(14), new q0(2), new j3(kotlin.collections.e0.b(yVar)), false, null, null, null, null, null, null, 1016);
        g01.a d2 = pVar.d();
        this.f48868d = d2;
        l82.a0 a0Var = new l82.a0(scope);
        o0 stateTransformer = new o0((o82.i0) d2.f63224a);
        Intrinsics.checkNotNullParameter(stateTransformer, "stateTransformer");
        a0Var.f82204b = stateTransformer;
        a0Var.c(this, application);
        this.f48869e = a0Var.a();
    }

    @Override // l82.i
    public final do2.i a() {
        return this.f48869e.d();
    }

    @Override // l82.i
    public final u50.r c() {
        return this.f48869e.e();
    }

    public final r0 h(Context context, androidx.lifecycle.u scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(context, "context");
        return new r0(this);
    }

    public final void i(il1.a fragmentFactory) {
        Intrinsics.checkNotNullParameter(fragmentFactory, "fragmentFactory");
        l82.y.i(this.f48869e, new p0("", "", "", "", "", "", "", "", new o82.j0()), false, new n1(this, 21), 2);
    }
}
