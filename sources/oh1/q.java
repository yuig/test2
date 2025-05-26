package oh1;

import android.content.Context;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.internal.Intrinsics;
import lh0.l0;
import so.n6;
import so.oa;

/* loaded from: classes5.dex */
public final class q extends wk1.n implements com.pinterest.feature.unifiedcomments.a {

    /* renamed from: a, reason: collision with root package name */
    public final com.pinterest.framework.screens.s f94561a;

    /* renamed from: b, reason: collision with root package name */
    public final l0 f94562b;

    /* renamed from: c, reason: collision with root package name */
    public final m60.w f94563c;

    /* renamed from: d, reason: collision with root package name */
    public final qh1.e f94564d;

    /* renamed from: e, reason: collision with root package name */
    public final String f94565e;

    /* renamed from: f, reason: collision with root package name */
    public final String f94566f;

    /* renamed from: g, reason: collision with root package name */
    public final d31.a f94567g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.pinterest.framework.screens.s sVar, nr0.m dynamicGridViewBinderDelegateFactory, wk1.c params, l0 experiments, m60.w eventManager, qh1.e commentUtils, String pinUid, String apdId) {
        super(params);
        Intrinsics.checkNotNullParameter(dynamicGridViewBinderDelegateFactory, "dynamicGridViewBinderDelegateFactory");
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(commentUtils, "commentUtils");
        Intrinsics.checkNotNullParameter(pinUid, "pinUid");
        Intrinsics.checkNotNullParameter(apdId, "apdId");
        this.f94561a = sVar;
        this.f94562b = experiments;
        this.f94563c = eventManager;
        this.f94564d = commentUtils;
        this.f94565e = pinUid;
        this.f94566f = apdId;
        uk1.d presenterPinalytics = getPresenterPinalytics();
        qa2.n nVar = params.f130131b;
        nr0.l viewBinderDelegate = ((n6) dynamicGridViewBinderDelegateFactory).a(presenterPinalytics, nVar.f103320a, nVar, params.f130137h);
        Intrinsics.checkNotNullParameter(viewBinderDelegate, "viewBinderDelegate");
        Intrinsics.checkNotNullParameter(this, "listener");
        Context context = kb0.a.f79058b;
        d31.a aVar = new d31.a("/v3/comments/stickers/", viewBinderDelegate, null, null, null, new ke0.a[]{(ke0.a) ((oa) ((so1.b) ep.b.g(so1.b.class))).Nc.get()}, null, null, null, 0L, null, 8156);
        aVar.o(RecyclerViewTypes.VIEW_TYPE_COMMENT_STICKER, new h90.m(this, 29));
        this.f94567g = aVar;
    }

    @Override // wk1.q
    public final void addDataSources(vq0.a dataSources) {
        Intrinsics.checkNotNullParameter(dataSources, "dataSources");
        ((wk1.i) dataSources).b(this.f94567g);
    }
}
