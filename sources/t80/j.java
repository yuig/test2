package t80;

import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f116695r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ s f116696s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ z f116697t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ u50.r f116698u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(s sVar, z zVar, u50.r rVar, bl2.c cVar) {
        super(2, cVar);
        this.f116696s = sVar;
        this.f116697t = zVar;
        this.f116698u = rVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new j(this.f116696s, this.f116697t, this.f116698u, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f116695r;
        if (i13 == 0) {
            ue.c.H(obj);
            s sVar = this.f116696s;
            Object obj2 = sVar.f116732b.get();
            Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
            z zVar = this.f116697t;
            ((u) zVar).getClass();
            ((u) zVar).getClass();
            this.f116695r = 1;
            if (s.j(sVar, (a82.b) obj2, true, true, this.f116698u, this) == aVar) {
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
