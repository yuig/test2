package uz0;

import kotlin.jvm.internal.Intrinsics;
import lz0.b;
import m60.g0;
import nr0.l;
import nr0.m;
import qz.f0;
import so.n6;
import uk1.d;
import wk1.c;
import wk1.i;
import wk1.n;

/* loaded from: classes5.dex */
public final class a extends n {

    /* renamed from: a, reason: collision with root package name */
    public final b f123272a;

    /* renamed from: b, reason: collision with root package name */
    public final d31.a f123273b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String styleId, String sourcePinId, c params, g0 pageSizeProvider, m dynamicGridViewBinderDelegateFactory, s20.a pearService) {
        super(params);
        Intrinsics.checkNotNullParameter(styleId, "styleId");
        Intrinsics.checkNotNullParameter(sourcePinId, "sourcePinId");
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(pageSizeProvider, "pageSizeProvider");
        Intrinsics.checkNotNullParameter(dynamicGridViewBinderDelegateFactory, "dynamicGridViewBinderDelegateFactory");
        Intrinsics.checkNotNullParameter(pearService, "pearService");
        this.f123272a = new b(pearService, styleId);
        d presenterPinalytics = getPresenterPinalytics();
        qa2.n nVar = params.f130131b;
        l viewBinderDelegate = ((n6) dynamicGridViewBinderDelegateFactory).a(presenterPinalytics, nVar.f103320a, nVar, params.f130137h);
        Intrinsics.checkNotNullParameter(styleId, "styleId");
        Intrinsics.checkNotNullParameter(sourcePinId, "sourcePinId");
        Intrinsics.checkNotNullParameter(viewBinderDelegate, "viewBinderDelegate");
        Intrinsics.checkNotNullParameter(pageSizeProvider, "pageSizeProvider");
        d31.a aVar = new d31.a(a.a.p(new StringBuilder("pear/styles/"), styleId, "/feed"), viewBinderDelegate, null, null, null, null, null, null, null, 0L, null, 8188);
        f0 f0Var = new f0();
        f0Var.e("fields", n00.b.a(n00.c.DEFAULT_PIN_FEED));
        f0Var.e("page_size", pageSizeProvider.d());
        f0Var.e("source_pin", sourcePinId);
        aVar.f49121k = f0Var;
        this.f123273b = aVar;
    }

    @Override // wk1.q
    public final void addDataSources(vq0.a dataSources) {
        Intrinsics.checkNotNullParameter(dataSources, "dataSources");
        i iVar = (i) dataSources;
        iVar.b(this.f123272a);
        iVar.b(this.f123273b);
    }
}
