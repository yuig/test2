package oz0;

import dx0.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nr0.j;
import pk0.b;
import tk2.e;
import uj2.q;
import xk1.c;

/* loaded from: classes5.dex */
public final class a extends c implements j {

    /* renamed from: k, reason: collision with root package name */
    public final String f98277k;

    /* renamed from: l, reason: collision with root package name */
    public final s20.a f98278l;

    /* renamed from: m, reason: collision with root package name */
    public final Function1 f98279m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String insightId, s20.a pearService, qz0.a onInsightLoaded) {
        super(null);
        Intrinsics.checkNotNullParameter(insightId, "insightId");
        Intrinsics.checkNotNullParameter(pearService, "pearService");
        Intrinsics.checkNotNullParameter(onInsightLoaded, "onInsightLoaded");
        this.f98277k = insightId;
        this.f98278l = pearService;
        this.f98279m = onInsightLoaded;
        o(0, new b(29));
    }

    @Override // nr0.g
    public final boolean f(int i13) {
        return true;
    }

    @Override // sq0.e0
    public final int getItemViewType(int i13) {
        pz0.b bVar = (pz0.b) getItem(i13);
        if (bVar != null) {
            return bVar.f101743a;
        }
        return -1;
    }

    @Override // xk1.c
    public final q k() {
        q u13 = this.f98278l.e(this.f98277k, n00.b.a(n00.c.PEAR_CLOSEUP_HEADER)).r(e.f118017c).l(wj2.c.a()).k(new wv0.a(13, new d(this, 21))).u();
        Intrinsics.checkNotNullExpressionValue(u13, "toObservable(...)");
        return u13;
    }

    @Override // nr0.g
    public final boolean n0(int i13) {
        return true;
    }
}
