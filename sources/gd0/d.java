package gd0;

import com.pinterest.api.model.ow;
import com.pinterest.creatorHub.feature.hub.data.CreatorHubRecentPinsRemoteRequest;
import com.pinterest.framework.multisection.datasource.pagedlist.h0;
import dl1.s;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kl2.l;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.r;

/* loaded from: classes5.dex */
public final class d extends h0 {
    public static final int I = rd0.d.stats_range_month;

    /* renamed from: J, reason: collision with root package name */
    public static final int f64811J = rd0.d.stats_range_alltime;
    public final boolean E;
    public final Function1 F;
    public final Function0 G;
    public final l H;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public d(boolean r22, java.lang.String r23, x12.a r24, m60.g0 r25, id0.b r26, id0.a r27, id0.b r28, id0.c r29) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: gd0.d.<init>(boolean, java.lang.String, x12.a, m60.g0, id0.b, id0.a, id0.b, id0.c):void");
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.h0
    public final com.pinterest.hairball.network.e M(r requestState) {
        Intrinsics.checkNotNullParameter(requestState, "requestState");
        LinkedHashMap registeredDeserializers = this.f49132v;
        Intrinsics.checkNotNullParameter(registeredDeserializers, "registeredDeserializers");
        ow modelStorage = this.f49116f;
        Intrinsics.checkNotNullParameter(modelStorage, "modelStorage");
        x12.a pagedListService = this.f49117g;
        Intrinsics.checkNotNullParameter(pagedListService, "pagedListService");
        return new CreatorHubRecentPinsRemoteRequest(registeredDeserializers, modelStorage, null, null, pagedListService, null, null, null, null, 492, null);
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.h0
    public final void b0(List itemsToSet, boolean z13) {
        Intrinsics.checkNotNullParameter(itemsToSet, "itemsToSet");
        boolean isEmpty = itemsToSet.isEmpty();
        boolean z14 = this.E;
        boolean z15 = true;
        boolean z16 = isEmpty && z14;
        List list = itemsToSet;
        if (!(!list.isEmpty()) && !z14) {
            z15 = false;
        }
        ArrayList H0 = CollectionsKt.H0(list);
        Function1 function1 = this.F;
        if (z15) {
            H0.add(0, new fd0.g(z14, !z16, function1));
        }
        if (z16) {
            H0.add(new fd0.f(this.G, function1));
        }
        super.b0(H0, z13);
    }

    @Override // sq0.e0
    public final int getItemViewType(int i13) {
        s sVar = (s) d().get(i13);
        if (sVar instanceof fd0.g) {
            return 5;
        }
        return sVar instanceof fd0.f ? 8 : 4;
    }

    @Override // wt1.b
    public final boolean i() {
        return d().size() < 6;
    }
}
