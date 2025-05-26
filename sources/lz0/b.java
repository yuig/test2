package lz0;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.internal.Intrinsics;
import nr0.j;
import tk2.e;
import uj2.q;

/* loaded from: classes5.dex */
public final class b extends xk1.c implements j {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f85175k = 0;

    /* renamed from: l, reason: collision with root package name */
    public final s20.a f85176l;

    /* renamed from: m, reason: collision with root package name */
    public final String f85177m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String insightId, s20.a pearService) {
        super(null);
        Intrinsics.checkNotNullParameter(insightId, "insightId");
        Intrinsics.checkNotNullParameter(pearService, "pearService");
        this.f85177m = insightId;
        this.f85176l = pearService;
        o(RecyclerViewTypes.VIEW_TYPE_PEAR_INSIGHT_HEADER, new pk0.b(28));
    }

    @Override // nr0.g
    public final boolean c3(int i13) {
        return true;
    }

    @Override // nr0.g
    public final boolean f(int i13) {
        return true;
    }

    @Override // sq0.e0
    public final int getItemViewType(int i13) {
        switch (this.f85175k) {
            case 0:
                return RecyclerViewTypes.VIEW_TYPE_PEAR_INSIGHT_HEADER;
            default:
                return RecyclerViewTypes.VIEW_TYPE_PEAR_EXPLORER_HEADER;
        }
    }

    @Override // xk1.c
    public final q k() {
        int i13 = this.f85175k;
        String str = this.f85177m;
        s20.a aVar = this.f85176l;
        switch (i13) {
            case 0:
                q u13 = aVar.e(str, n00.b.a(n00.c.PEAR_CLOSEUP_HEADER)).r(e.f118017c).l(wj2.c.a()).k(new wv0.a(12, a.f85174i)).u();
                Intrinsics.checkNotNullExpressionValue(u13, "toObservable(...)");
                return u13;
            default:
                q u14 = aVar.f(str, n00.b.a(n00.c.PEAR_STYLE_HEADER)).r(e.f118017c).l(wj2.c.a()).k(new wv0.a(14, tz0.a.f119710i)).u();
                Intrinsics.checkNotNullExpressionValue(u14, "toObservable(...)");
                return u14;
        }
    }

    @Override // nr0.g
    public final boolean n0(int i13) {
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(s20.a pearService, String styleId) {
        super(null);
        Intrinsics.checkNotNullParameter(pearService, "pearService");
        Intrinsics.checkNotNullParameter(styleId, "styleId");
        this.f85176l = pearService;
        this.f85177m = styleId;
        o(RecyclerViewTypes.VIEW_TYPE_PEAR_EXPLORER_HEADER, new sz0.a(0));
    }
}
