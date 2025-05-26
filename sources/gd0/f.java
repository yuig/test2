package gd0;

import i32.y0;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.collections.q0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ra0.l0;
import ug0.i;
import uj2.q;

/* loaded from: classes5.dex */
public final class f extends xk1.c {

    /* renamed from: k, reason: collision with root package name */
    public final i f64812k;

    /* renamed from: l, reason: collision with root package name */
    public final Function1 f64813l;

    /* renamed from: m, reason: collision with root package name */
    public final Function1 f64814m;

    /* renamed from: n, reason: collision with root package name */
    public final String f64815n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(i experiencesApi, id0.b newsEventLogAction, id0.b newsCardActions) {
        super(null);
        Intrinsics.checkNotNullParameter(experiencesApi, "experiencesApi");
        Intrinsics.checkNotNullParameter(newsEventLogAction, "newsEventLogAction");
        Intrinsics.checkNotNullParameter(newsCardActions, "newsCardActions");
        this.f64812k = experiencesApi;
        this.f64813l = newsEventLogAction;
        this.f64814m = newsCardActions;
        this.f64815n = String.valueOf(y0.CREATOR_HUB_NEWS_MODULE.value());
        o(3, new ep.c(23));
    }

    @Override // sq0.e0
    public final int getItemViewType(int i13) {
        return 3;
    }

    @Override // xk1.c
    public final q k() {
        vd0.c placementOverride = new vd0.c();
        i iVar = this.f64812k;
        iVar.getClass();
        String placementId = this.f64815n;
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        Intrinsics.checkNotNullParameter(placementOverride, "placementOverride");
        String valueOf = String.valueOf(5);
        String sVar = placementOverride.f125623a.toString();
        Intrinsics.checkNotNullExpressionValue(sVar, "toString(...)");
        q u13 = iVar.f122136a.b(placementId, valueOf, sVar).r(tk2.e.f118017c).l(wj2.c.a()).k(new lb0.c(4, new l0(this, 20))).k(new lb0.c(5, new e(1, this, f.class, "mapToCreatorHubNewsModuleState", "mapToCreatorHubNewsModuleState(Ljava/util/List;)Ljava/util/List;", 0))).u();
        Intrinsics.checkNotNullExpressionValue(u13, "toObservable(...)");
        return u13;
    }

    public final void v(hd0.g card) {
        Intrinsics.checkNotNullParameter(card, "card");
        ArrayList arrayList = this.f135191h;
        if (CollectionsKt.F0(arrayList).isEmpty()) {
            return;
        }
        hd0.a aVar = (hd0.a) CollectionsKt.F0(arrayList).get(0);
        ArrayList newsCardStates = CollectionsKt.H0(aVar.f68845a);
        newsCardStates.remove(card);
        CollectionsKt.F0(newsCardStates);
        Intrinsics.checkNotNullParameter(newsCardStates, "newsCardStates");
        Function1 logAction = aVar.f68846b;
        Intrinsics.checkNotNullParameter(logAction, "logAction");
        hd0.a aVar2 = new hd0.a(newsCardStates, logAction);
        if (aVar2.f68845a.isEmpty()) {
            u(q0.f80391a);
        } else {
            u1(0, aVar2);
        }
    }
}
