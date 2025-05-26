package w1;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class p0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f127436r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ n3.w f127437s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ y1 f127438t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(n3.w wVar, y1 y1Var, bl2.c cVar) {
        super(2, cVar);
        this.f127437s = wVar;
        this.f127438t = y1Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new p0(this.f127437s, this.f127438t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((p0) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        Object obj2 = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f127436r;
        if (i13 == 0) {
            ue.c.H(obj);
            this.f127436r = 1;
            Object O = dl2.b.O(new q1(this.f127437s, this.f127438t, null), this);
            if (O != obj2) {
                O = Unit.f80348a;
            }
            if (O == obj2) {
                return obj2;
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
