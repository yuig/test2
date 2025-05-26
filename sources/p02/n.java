package p02;

import ao2.j0;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.reportFlow.feature.ReportFlowScreenLocation;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class n extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ nu.b f98437r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ t f98438s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(nu.b bVar, t tVar, bl2.c cVar) {
        super(2, cVar);
        this.f98437r = bVar;
        this.f98438s = tVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new n(this.f98437r, this.f98438s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((n) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        ll.j jVar = (ll.j) this.f98437r.f92308c;
        NavigationImpl w13 = Navigation.w1(ReportFlowScreenLocation.SETTINGS_RVC_MORE_ACTIONS_SHEET);
        r rVar = (r) this.f98438s;
        w13.Y1("EXTRA_SHOW_APPEAL_BUTTON", rVar.f98451b);
        w13.Y1("EXTRA_SHOW_SELF_HARM_ITEM", rVar.f98452c);
        w13.m0("EXTRA_PARAM_ACTION_ID", rVar.f98453d);
        w13.m0("EXTRA_PARAM_OBJECT_ID", rVar.f98456g);
        w13.m0("EXTRA_PARAM_LEGAL_REQUEST_ID", rVar.f98459j);
        w13.m0("EXTRA_PARAM_USER_ID", rVar.f98454e);
        w13.Y1("EXTRA_PARAM_ATTACHMENT_ENABLED", rVar.f98455f);
        w13.Y1("EXTRA_PARAM_IS_YOUR_ACCOUNT_TAB", rVar.f98450a);
        w13.Y1("EXTRA_SHOW_COUNTER_FORM", rVar.f98458i);
        Intrinsics.checkNotNullExpressionValue(w13, "apply(...)");
        jVar.f(w13);
        return Unit.f80348a;
    }
}
