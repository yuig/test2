package wr0;

import android.content.Context;
import com.pinterest.api.model.ow;
import com.pinterest.deserializers.ModelDeserializerWithSaveAndMerge;
import com.pinterest.feature.engagementtab.EngagementTabRetrofitRemoteRequest;
import com.pinterest.framework.multisection.datasource.pagedlist.h0;
import java.util.LinkedHashMap;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import m60.g0;
import qz.f0;
import so.oa;

/* loaded from: classes5.dex */
public final class y extends h0 {
    public final /* synthetic */ int E = 0;
    public final Object F;
    public final Object G;
    public final Object H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(String remoteUrl, x12.a engagementsPagedListService, pb0.d fuzzyDateFormatter, xb0.a clickAction, v segueAction) {
        super(remoteUrl, new ke0.a[]{(ke0.a) ((oa) ((so1.b) ep.b.g(so1.b.class))).Kc.get()}, null, null, null, null, engagementsPagedListService, null, 0L, 1788);
        Intrinsics.checkNotNullParameter(remoteUrl, "remoteUrl");
        Intrinsics.checkNotNullParameter(engagementsPagedListService, "engagementsPagedListService");
        Intrinsics.checkNotNullParameter(fuzzyDateFormatter, "fuzzyDateFormatter");
        Intrinsics.checkNotNullParameter(clickAction, "clickAction");
        Intrinsics.checkNotNullParameter(segueAction, "segueAction");
        Context context = kb0.a.f79058b;
        this.F = fuzzyDateFormatter;
        this.G = clickAction;
        this.H = segueAction;
        f0 f0Var = new f0();
        f0Var.e("fields", n00.b.a(n00.c.ENGAGEMENT_TAB_FIELDS));
        this.f49121k = f0Var;
        o(3283, new h90.m(this, 9));
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.h0
    public final com.pinterest.hairball.network.e M(kotlin.jvm.internal.r requestState) {
        switch (this.E) {
            case 0:
                Intrinsics.checkNotNullParameter(requestState, "requestState");
                LinkedHashMap registeredDeserializers = this.f49132v;
                Intrinsics.checkNotNullParameter(registeredDeserializers, "registeredDeserializers");
                ow modelStorage = this.f49116f;
                Intrinsics.checkNotNullParameter(modelStorage, "modelStorage");
                x12.a pagedListService = this.f49117g;
                Intrinsics.checkNotNullParameter(pagedListService, "pagedListService");
                return new EngagementTabRetrofitRemoteRequest(registeredDeserializers, modelStorage, null, null, pagedListService, null, null, null, null, 460, null);
            default:
                return super.M(requestState);
        }
    }

    @Override // sq0.e0
    public final int getItemViewType(int i13) {
        switch (this.E) {
            case 0:
                return 3283;
            default:
                return 1;
        }
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.h0, vq0.f
    public final void i2() {
        switch (this.E) {
            case 0:
                super.i2();
                a0(q0.f80391a);
                break;
            default:
                super.i2();
                break;
        }
    }

    public /* synthetic */ y(uk1.d dVar, uj2.q qVar, g0 g0Var, String str) {
        this(dVar, qVar, g0Var, str, (lk1.a) null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(uk1.d presenterPinalytics, uj2.q networkStateStream, g0 pageSizeProvider, String remoteUri, lk1.a aVar) {
        super(remoteUri, new ke0.a[]{(ModelDeserializerWithSaveAndMerge) ((oa) ((so1.b) ep.b.g(so1.b.class))).f113749j4.get()}, null, null, null, aVar, null, null, 0L, 1980);
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(pageSizeProvider, "pageSizeProvider");
        Intrinsics.checkNotNullParameter(remoteUri, "remoteUri");
        Context context = kb0.a.f79058b;
        this.F = presenterPinalytics;
        this.G = networkStateStream;
        this.H = pageSizeProvider;
        f0 f0Var = new f0();
        f0Var.e("fields", n00.b.a(n00.c.INTEREST_FOLLOWED_FEED));
        f0Var.e("page_size", pageSizeProvider.b());
        this.f49121k = f0Var;
        o(1, new yi0.a(presenterPinalytics, 0));
    }
}
