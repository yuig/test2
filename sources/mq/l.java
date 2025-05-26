package mq;

import ao2.e2;
import ao2.v0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class l extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f88001r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ StringBuilder f88002s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ u f88003t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(StringBuilder sb3, u uVar, bl2.c cVar) {
        super(2, cVar);
        this.f88002s = sb3;
        this.f88003t = uVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new l(this.f88002s, this.f88003t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f88001r;
        if (i13 == 0) {
            ue.c.H(obj);
            u uVar = this.f88003t;
            se2.a aVar2 = uVar.f88036x0;
            if (aVar2 == null) {
                Intrinsics.r("mediaGalleryUtils");
                throw null;
            }
            String g13 = ((rw0.f) ((bf2.b) aVar2).get()).g();
            StringBuilder sb3 = this.f88002s;
            sb3.append(g13);
            ko2.f fVar = v0.f20219a;
            e2 e2Var = ho2.q.f69782a;
            k kVar = new k(sb3, uVar, null);
            this.f88001r = 1;
            if (kotlin.jvm.internal.j.M(this, e2Var, kVar) == aVar) {
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
