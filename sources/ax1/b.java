package ax1;

import com.pinterest.feature.home.view.InitialLoadSwipeRefreshLayout;
import com.pinterest.partnerAnalytics.components.toplinemetrics.ToplineMetricsCard;
import dl2.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f20641r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ e f20642s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, bl2.c cVar) {
        super(2, cVar);
        this.f20642s = eVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        b bVar = new b(this.f20642s, cVar);
        bVar.f20641r = obj;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((bx1.d) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        bx1.d dVar = (bx1.d) this.f20641r;
        boolean z13 = dVar instanceof bx1.c;
        e eVar = this.f20642s;
        if (z13) {
            InitialLoadSwipeRefreshLayout initialLoadSwipeRefreshLayout = eVar.f20651f0;
            if (initialLoadSwipeRefreshLayout == null) {
                Intrinsics.r("swipeRefresh");
                throw null;
            }
            initialLoadSwipeRefreshLayout.n(true);
        } else if (dVar instanceof bx1.b) {
            InitialLoadSwipeRefreshLayout initialLoadSwipeRefreshLayout2 = eVar.f20651f0;
            if (initialLoadSwipeRefreshLayout2 == null) {
                Intrinsics.r("swipeRefresh");
                throw null;
            }
            initialLoadSwipeRefreshLayout2.n(false);
            ToplineMetricsCard toplineMetricsCard = eVar.f20649d0;
            if (toplineMetricsCard == null) {
                Intrinsics.r("topLineMetricsView");
                throw null;
            }
            toplineMetricsCard.a(((bx1.b) dVar).f24101a);
        } else {
            boolean z14 = dVar instanceof bx1.a;
        }
        return Unit.f80348a;
    }
}
