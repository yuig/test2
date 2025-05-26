package com.pinterest.feature.todaytab.articlefeed;

import android.content.Context;
import androidx.lifecycle.u;
import androidx.lifecycle.z;
import com.pinterest.feature.search.results.view.d0;
import com.pinterest.feature.todaytab.articlefeed.relatedarticles.RelatedArticlesHeaderView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import m60.w;
import nx.f0;

/* loaded from: classes5.dex */
public final class h extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f48614i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ j f48615j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(j jVar, int i13) {
        super(0);
        this.f48614i = i13;
        this.f48615j = jVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f48614i;
        j jVar = this.f48615j;
        switch (i13) {
            case 0:
                Context requireContext = jVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                d dVar = new d(requireContext);
                g listener = new g(jVar);
                Intrinsics.checkNotNullParameter(listener, "listener");
                dVar.f48607a = listener;
                return dVar;
            case 1:
                Context requireContext2 = jVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                return new RelatedArticlesHeaderView(requireContext2);
            case 2:
                Context requireContext3 = jVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext3, "requireContext(...)");
                z viewLifecycleOwner = jVar.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                u S = bf.b.S(viewLifecycleOwner);
                yk1.j jVar2 = jVar.R0;
                if (jVar2 == null) {
                    Intrinsics.r("mvpBinder");
                    throw null;
                }
                String str = jVar.f48627b1;
                f0 f0Var = jVar.T0;
                if (f0Var != null) {
                    return new o(requireContext3, S, jVar2, new n70.o(f0Var, str), jVar.p7(), jVar.f7(), jVar.A7());
                }
                Intrinsics.r("pinalyticsFactory");
                throw null;
            default:
                Context requireContext4 = jVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext4, "requireContext(...)");
                w f73 = jVar.f7();
                yk1.j jVar3 = jVar.R0;
                if (jVar3 == null) {
                    Intrinsics.r("mvpBinder");
                    throw null;
                }
                f0 f0Var2 = jVar.T0;
                if (f0Var2 != null) {
                    return new d0(requireContext4, f73, jVar3, f0Var2, jVar.A7());
                }
                Intrinsics.r("pinalyticsFactory");
                throw null;
        }
    }
}
