package v41;

import ao2.j0;
import h32.d4;
import h32.i0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import w41.g1;
import w41.h1;
import w41.i1;

/* loaded from: classes5.dex */
public final class f extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ i1 f124120r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ g f124121s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(i1 i1Var, g gVar, bl2.c cVar) {
        super(2, cVar);
        this.f124120r = i1Var;
        this.f124121s = gVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new f(this.f124120r, this.f124121s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        i1 i1Var = this.f124120r;
        boolean z13 = i1Var instanceof h1;
        g gVar = this.f124121s;
        if (z13) {
            h1 h1Var = (h1) i1Var;
            i0 i0Var = h1Var.f128014c;
            d4 d4Var = i0Var.f67081a;
            if (d4Var != null) {
                g31.g.a(gVar.f124122a, h1Var.f128012a, h1Var.f128013b, d4Var, i0Var.f67082b, h1Var.f128015d);
            }
        } else if (i1Var instanceof g1) {
            gVar.f124123b.d(new r70.j(u70.a.HOME, 0));
        }
        return Unit.f80348a;
    }
}
