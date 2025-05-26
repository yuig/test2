package ub1;

import com.pinterest.gestalt.listAction.GestaltListAction;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import u50.k0;

/* loaded from: classes5.dex */
public final class k extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f121722r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ o f121723s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(o oVar, bl2.c cVar) {
        super(2, cVar);
        this.f121723s = oVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        k kVar = new k(this.f121723s, cVar);
        kVar.f121722r = obj;
        return kVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((a) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        a aVar2 = (a) this.f121722r;
        o oVar = this.f121723s;
        GestaltText gestaltText = oVar.f121735g0;
        if (gestaltText == null) {
            Intrinsics.r("connectedCatalogNeededMessage");
            throw null;
        }
        gestaltText.i(new n(aVar2, 0));
        GestaltListAction gestaltListAction = oVar.f121734f0;
        if (gestaltListAction == null) {
            Intrinsics.r("productTaggingToggle");
            throw null;
        }
        kg.a.h(gestaltListAction, new n(aVar2, 1));
        if (aVar2.f121707b) {
            oVar.f7().d(new yb0.g(new k0(g52.c.auto_tag_disable_title), new k0(g52.c.auto_tag_disable_description), new k0(g52.c.turn_off), oVar, new k0(g52.c.auto_tag_disable_checkbox_text)));
        }
        return Unit.f80348a;
    }
}
