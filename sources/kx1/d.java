package kx1;

import ao2.j0;
import dl2.j;
import do2.i;
import do2.v1;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import lb.l0;
import u50.r;

/* loaded from: classes4.dex */
public final class d extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f81110r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ i f81111s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ i f81112t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ r f81113u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(i iVar, i iVar2, r rVar, bl2.c cVar) {
        super(2, cVar);
        this.f81111s = iVar;
        this.f81112t = iVar2;
        this.f81113u = rVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new d(this.f81111s, this.f81112t, this.f81113u, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f81110r;
        int i14 = 1;
        try {
            if (i13 == 0) {
                ue.c.H(obj);
                kotlin.jvm.internal.j0 j0Var = new kotlin.jvm.internal.j0();
                kotlin.jvm.internal.j0 j0Var2 = new kotlin.jvm.internal.j0();
                v1 v1Var = new v1(this.f81112t, this.f81111s, new b(j0Var, j0Var2, null), i14);
                c cVar = new c(this.f81113u, j0Var, j0Var2, null);
                this.f81110r = 1;
                if (l0.I(v1Var, cVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ue.c.H(obj);
            }
        } catch (Exception unused) {
        }
        return Unit.f80348a;
    }
}
