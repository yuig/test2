package com.pinterest.feature.search.results.view;

import h32.d4;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f47767i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ GraphQLSearchGridFragment f47768j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(GraphQLSearchGridFragment graphQLSearchGridFragment, int i13) {
        super(1);
        this.f47767i = i13;
        this.f47768j = graphQLSearchGridFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f47767i;
        GraphQLSearchGridFragment graphQLSearchGridFragment = this.f47768j;
        switch (i13) {
            case 0:
                h32.i0 source = (h32.i0) obj;
                Intrinsics.checkNotNullParameter(source, "it");
                Intrinsics.checkNotNullParameter(source, "source");
                d4 d4Var = source.f67081a;
                return new h32.i0(graphQLSearchGridFragment.f47681z1, graphQLSearchGridFragment.A1, source.f67083c, source.f67084d, source.f67085e, source.f67086f);
            default:
                h32.i0 i0Var = (h32.i0) obj;
                bz.i w73 = graphQLSearchGridFragment.w7();
                Intrinsics.f(i0Var);
                int i14 = bz.i.f24182g;
                w73.f(i0Var, null);
                return Unit.f80348a;
        }
    }
}
