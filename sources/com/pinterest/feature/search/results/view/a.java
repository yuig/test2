package com.pinterest.feature.search.results.view;

import android.util.AttributeSet;
import com.pinterest.ui.view.NoticesView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import m60.u0;

/* loaded from: classes5.dex */
public final class a extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f47759i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ GraphQLSearchGridFragment f47760j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(GraphQLSearchGridFragment graphQLSearchGridFragment, int i13) {
        super(0);
        this.f47759i = i13;
        this.f47760j = graphQLSearchGridFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f47759i;
        GraphQLSearchGridFragment graphQLSearchGridFragment = this.f47760j;
        switch (i13) {
            case 0:
                return graphQLSearchGridFragment.generateLoggingContext();
            case 1:
                ca2.e eVar = new ca2.e(true, null, u0.anim_speed_superfast, graphQLSearchGridFragment.f47668m1, null, 0, null, new bh.b(graphQLSearchGridFragment.s7(), new a(graphQLSearchGridFragment, 0)), false, false, 882);
                eVar.f27256o = true;
                return eVar;
            case 2:
                l11.f fVar = graphQLSearchGridFragment.f47675t1;
                ky.d dVar = new ky.d(graphQLSearchGridFragment.f7());
                m60.w f73 = graphQLSearchGridFragment.f7();
                c71.b0 b0Var = graphQLSearchGridFragment.f47670o1;
                if (b0Var != null) {
                    return new pr0.g(fVar, dVar, graphQLSearchGridFragment.C1, f73, null, ey.x.class, b0Var.f26728a, null, null, 400);
                }
                Intrinsics.r("searchParameters");
                throw null;
            case 3:
                switch (i13) {
                    case 3:
                        return Boolean.valueOf(graphQLSearchGridFragment.j9().h());
                    default:
                        return Boolean.valueOf(ph.a.w0(graphQLSearchGridFragment.getActiveUserManager()));
                }
            case 4:
                switch (i13) {
                    case 3:
                        return Boolean.valueOf(graphQLSearchGridFragment.j9().h());
                    default:
                        return Boolean.valueOf(ph.a.w0(graphQLSearchGridFragment.getActiveUserManager()));
                }
            case 5:
                return new ky.a(graphQLSearchGridFragment.f47681z1, graphQLSearchGridFragment.A1);
            case 6:
                NoticesView noticesView = new NoticesView(6, graphQLSearchGridFragment.getContext(), (AttributeSet) null);
                noticesView.setId(k42.d.search_err_notice_view);
                return noticesView;
            default:
                c71.b0 b0Var2 = graphQLSearchGridFragment.f47670o1;
                if (b0Var2 == null) {
                    Intrinsics.r("searchParameters");
                    throw null;
                }
                String str = graphQLSearchGridFragment.G1;
                nx.f0 f0Var = graphQLSearchGridFragment.S0;
                if (f0Var != null) {
                    return new i61.a(b0Var2.f26737i, b0Var2, str, f0Var);
                }
                Intrinsics.r("pinalyticsFactory");
                throw null;
        }
    }
}
