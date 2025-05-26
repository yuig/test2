package cx1;

import ao2.j0;
import bl2.c;
import bx1.n;
import bx1.o;
import c0.d;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.partnerAnalytics.PartnerAnalyticsLocation;
import dl2.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ o f53380r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ sw1.b f53381s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(o oVar, sw1.b bVar, c cVar) {
        super(2, cVar);
        this.f53380r = oVar;
        this.f53381s = bVar;
    }

    @Override // dl2.a
    public final c create(Object obj, c cVar) {
        return new a(this.f53380r, this.f53381s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((j0) obj, (c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        n nVar = n.f24111a;
        o oVar = this.f53380r;
        boolean d2 = Intrinsics.d(oVar, nVar);
        sw1.b bVar = this.f53381s;
        if (d2) {
            bVar.f115600b.B();
        } else if (Intrinsics.d(oVar, n.f24113c)) {
            ll.j jVar = bVar.f115600b;
            NavigationImpl w13 = Navigation.w1(PartnerAnalyticsLocation.GRAPH_DETAIL);
            w13.d("SPLIT_TYPES_EXTRA_KEY", d.f0(bVar.f115601c));
            w13.d("METRIC_TYPES_EXTRA_KEY", d.V());
            Intrinsics.checkNotNullExpressionValue(w13, "apply(...)");
            jVar.f(w13);
        } else if (Intrinsics.d(oVar, n.f24112b)) {
            ll.j jVar2 = bVar.f115600b;
            NavigationImpl w14 = Navigation.w1(PartnerAnalyticsLocation.ANALYTICS_FILTER);
            Intrinsics.checkNotNullExpressionValue(w14, "create(...)");
            jVar2.f(w14);
        }
        return Unit.f80348a;
    }
}
