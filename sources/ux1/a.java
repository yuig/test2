package ux1;

import ao2.j0;
import bl2.c;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.partnerAnalytics.PartnerAnalyticsLocation;
import dl2.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import w60.d;

/* loaded from: classes4.dex */
public final class a extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ d f123245r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar, c cVar) {
        super(2, cVar);
        this.f123245r = dVar;
    }

    @Override // dl2.a
    public final c create(Object obj, c cVar) {
        return new a(this.f123245r, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((j0) obj, (c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        ll.j jVar = this.f123245r.f128119b;
        NavigationImpl w13 = Navigation.w1(PartnerAnalyticsLocation.ANALYTICS_FILTER);
        Intrinsics.checkNotNullExpressionValue(w13, "create(...)");
        jVar.f(w13);
        return Unit.f80348a;
    }
}
