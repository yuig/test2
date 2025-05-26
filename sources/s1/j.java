package s1;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class j extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f110454r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f110455s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ o0 f110456t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(o0 o0Var, bl2.c cVar) {
        super(2, cVar);
        this.f110456t = o0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        j jVar = new j(this.f110456t, cVar);
        jVar.f110455s = obj;
        return jVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((n3.w) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f110454r;
        if (i13 == 0) {
            ue.c.H(obj);
            i iVar = new i((n3.w) this.f110455s, this.f110456t, null);
            this.f110454r = 1;
            if (dl2.b.O(iVar, this) == aVar) {
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
