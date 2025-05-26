package by1;

import ao2.j0;
import ay1.s;
import ay1.t;
import ay1.u;
import ay1.v;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.partnerAnalytics.PartnerAnalyticsLocation;
import com.pinterest.screens.u2;
import dl2.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ v f24127r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ sw1.b f24128s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(v vVar, sw1.b bVar, bl2.c cVar) {
        super(2, cVar);
        this.f24127r = vVar;
        this.f24128s = bVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new a(this.f24127r, this.f24128s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        s sVar = s.f20685a;
        v vVar = this.f24127r;
        boolean d2 = Intrinsics.d(vVar, sVar);
        sw1.b bVar = this.f24128s;
        if (d2) {
            bVar.f115600b.B();
        } else if (Intrinsics.d(vVar, u.f20687a)) {
            ll.j jVar = bVar.f115600b;
            NavigationImpl w13 = Navigation.w1(PartnerAnalyticsLocation.GRAPH_DETAIL);
            w13.d("SPLIT_TYPES_EXTRA_KEY", c0.d.f0(bVar.f115601c));
            w13.d("METRIC_TYPES_EXTRA_KEY", c0.d.V());
            Intrinsics.checkNotNullExpressionValue(w13, "apply(...)");
            jVar.f(w13);
        } else if (Intrinsics.d(vVar, t.f20686a)) {
            ll.j jVar2 = bVar.f115600b;
            NavigationImpl w14 = Navigation.w1((ScreenLocation) u2.f51428e.getValue());
            Intrinsics.checkNotNullExpressionValue(w14, "create(...)");
            jVar2.f(w14);
        }
        return Unit.f80348a;
    }
}
