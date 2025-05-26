package yz0;

import b01.f;
import h32.a4;
import h32.d4;
import java.util.HashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import nx.f0;
import uk1.d;

/* loaded from: classes5.dex */
public final class a extends d {

    /* renamed from: g, reason: collision with root package name */
    public final d4 f140492g;

    /* renamed from: h, reason: collision with root package name */
    public final a4 f140493h;

    /* renamed from: i, reason: collision with root package name */
    public final String f140494i;

    /* renamed from: j, reason: collision with root package name */
    public final String f140495j;

    /* renamed from: k, reason: collision with root package name */
    public final Function0 f140496k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(f0 pinalyticsFactory, d4 viewType, a4 viewParameterType, String insightId, String referrer, f boardIdProvider) {
        super(pinalyticsFactory);
        Intrinsics.checkNotNullParameter(pinalyticsFactory, "pinalyticsFactory");
        Intrinsics.checkNotNullParameter(viewType, "viewType");
        Intrinsics.checkNotNullParameter(viewParameterType, "viewParameterType");
        Intrinsics.checkNotNullParameter(insightId, "insightId");
        Intrinsics.checkNotNullParameter(referrer, "referrer");
        Intrinsics.checkNotNullParameter(boardIdProvider, "boardIdProvider");
        this.f140492g = viewType;
        this.f140493h = viewParameterType;
        this.f140494i = insightId;
        this.f140495j = referrer;
        this.f140496k = boardIdProvider;
    }

    @Override // uk1.d
    public final String g() {
        return this.f140494i;
    }

    @Override // uk1.d
    public final a4 i() {
        return this.f140493h;
    }

    @Override // uk1.d
    public final d4 j() {
        return this.f140492g;
    }

    @Override // uk1.d, nx.i1
    /* renamed from: t5 */
    public final HashMap getF63135d0() {
        HashMap f63135d0 = super.getF63135d0();
        if (f63135d0 == null) {
            f63135d0 = new HashMap();
        }
        f63135d0.put("referrer", this.f140495j);
        f63135d0.put("board_id", this.f140496k.invoke());
        return f63135d0;
    }
}
