package mq;

import ao2.v0;
import com.pinterest.api.model.f30;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class p extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f88010r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ u f88011s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(u uVar, bl2.c cVar) {
        super(2, cVar);
        this.f88011s = uVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new p(this.f88011s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((p) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f88010r;
        u uVar = this.f88011s;
        try {
            if (i13 == 0) {
                ue.c.H(obj);
                ko2.f fVar = v0.f20219a;
                ko2.e eVar = ko2.e.f80326c;
                o oVar = new o(uVar, null);
                this.f88010r = 1;
                obj = kotlin.jvm.internal.j.M(this, eVar, oVar);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ue.c.H(obj);
            }
            f30 f30Var = (f30) obj;
            if (f30Var != null) {
                u.c8(uVar, f30Var);
            }
        } catch (Exception e13) {
            int i14 = u.P0;
            uVar.j8("Error in screenShotPinCoroutine", e13);
        }
        return Unit.f80348a;
    }
}
