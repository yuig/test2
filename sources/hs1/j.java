package hs1;

import ao2.e2;
import ao2.j0;
import ao2.v0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class j extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f70048r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ m f70049s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(m mVar, bl2.c cVar) {
        super(2, cVar);
        this.f70049s = mVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new j(this.f70049s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f70048r;
        if (i13 == 0) {
            ue.c.H(obj);
            ko2.f fVar = v0.f20219a;
            e2 e2Var = ho2.q.f69782a;
            i iVar = new i(this.f70049s, null);
            this.f70048r = 1;
            if (kotlin.jvm.internal.j.M(this, e2Var, iVar) == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        return Unit.f80348a;
    }
}
