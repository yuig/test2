package oa0;

import ao2.j0;
import bl2.c;
import dl2.j;
import ka0.l;
import ka0.m;
import ka0.n;
import ka0.o;
import kg.t;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import nx.a0;

/* loaded from: classes5.dex */
public final class a extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ o f93841r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ b f93842s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(o oVar, b bVar, c cVar) {
        super(2, cVar);
        this.f93841r = oVar;
        this.f93842s = bVar;
    }

    @Override // dl2.a
    public final c create(Object obj, c cVar) {
        return new a(this.f93841r, this.f93842s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((j0) obj, (c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        o oVar = this.f93841r;
        boolean z13 = oVar instanceof m;
        b bVar = this.f93842s;
        if (z13) {
            bVar.f93843a.B();
        } else if (oVar instanceof l) {
            t.L0(new a0(), ((l) oVar).f78913a, null, d32.c.COLLAGES_TAB, null, 20);
        } else if (oVar instanceof n) {
            bVar.f93843a.E("DraftSelection.COLLAGE_DRAFT_SELECTION_RESULT_CODE", e0.t.j(new Pair("DraftSelection.COLLAGE_DRAFT_SELECTION_RESULT_KEY", ((n) oVar).f78915a)));
        }
        return Unit.f80348a;
    }
}
