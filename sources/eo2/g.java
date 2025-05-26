package eo2;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class g extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f59765r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ do2.i f59766s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ o0 f59767t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ mo2.e f59768u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(do2.i iVar, o0 o0Var, mo2.e eVar, bl2.c cVar) {
        super(2, cVar);
        this.f59766s = iVar;
        this.f59767t = o0Var;
        this.f59768u = eVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new g(this.f59766s, this.f59767t, this.f59768u, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [mo2.e] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v3, types: [mo2.h] */
    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f59765r;
        ?? r23 = this.f59768u;
        try {
            if (i13 == 0) {
                ue.c.H(obj);
                do2.i iVar = this.f59766s;
                o0 o0Var = this.f59767t;
                this.f59765r = 1;
                if (iVar.collect(o0Var, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ue.c.H(obj);
            }
            r23 = (mo2.h) r23;
            r23.c();
            return Unit.f80348a;
        } catch (Throwable th3) {
            ((mo2.h) r23).c();
            throw th3;
        }
    }
}
