package xz0;

import kk2.g;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lb0.o;
import nr0.j;
import uj2.q;
import zz0.e;

/* loaded from: classes5.dex */
public final class b extends xk1.c implements j {

    /* renamed from: k, reason: collision with root package name */
    public final String f136239k;

    /* renamed from: l, reason: collision with root package name */
    public final s20.a f136240l;

    /* renamed from: m, reason: collision with root package name */
    public final o f136241m;

    /* renamed from: n, reason: collision with root package name */
    public final Function1 f136242n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String insightId, s20.a pearService, o preferencesManager, a01.a onInsightLoaded) {
        super(null);
        Intrinsics.checkNotNullParameter(insightId, "insightId");
        Intrinsics.checkNotNullParameter(pearService, "pearService");
        Intrinsics.checkNotNullParameter(preferencesManager, "preferencesManager");
        Intrinsics.checkNotNullParameter(onInsightLoaded, "onInsightLoaded");
        this.f136239k = insightId;
        this.f136240l = pearService;
        this.f136241m = preferencesManager;
        this.f136242n = onInsightLoaded;
        o(0, new sz0.a(3));
        o(1, new sz0.a(2));
        o(9, new wz0.a());
        o(8, new sz0.a(1));
    }

    @Override // nr0.g
    public final boolean f(int i13) {
        return true;
    }

    @Override // sq0.e0
    public final int getItemViewType(int i13) {
        e eVar = (e) getItem(i13);
        if (eVar != null) {
            return eVar.f143153a;
        }
        return -1;
    }

    @Override // xk1.c
    public final q k() {
        q u13 = new g(this.f136240l.e(this.f136239k, n00.b.a(n00.c.PEAR_CLOSEUP_HEADER)).r(tk2.e.f118017c).l(wj2.c.a()), new hx0.a(27, new a(this, 0)), 3).k(new wv0.a(15, new a(this, 1))).u();
        Intrinsics.checkNotNullExpressionValue(u13, "toObservable(...)");
        return u13;
    }

    @Override // nr0.g
    public final boolean n0(int i13) {
        return true;
    }
}
