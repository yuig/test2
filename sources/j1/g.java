package j1;

import i2.v3;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class g extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f74065r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f74066s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ d f74067t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ v3 f74068u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ v3 f74069v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Object obj, d dVar, v3 v3Var, v3 v3Var2, bl2.c cVar) {
        super(2, cVar);
        this.f74066s = obj;
        this.f74067t = dVar;
        this.f74068u = v3Var;
        this.f74069v = v3Var2;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new g(this.f74066s, this.f74067t, this.f74068u, this.f74069v, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f74065r;
        d dVar = this.f74067t;
        if (i13 == 0) {
            ue.c.H(obj);
            Object value = dVar.f74030e.getValue();
            Object obj2 = this.f74066s;
            if (!Intrinsics.d(obj2, value)) {
                o1 o1Var = i.f74095a;
                n nVar = (n) this.f74068u.getValue();
                this.f74065r = 1;
                if (d.c(dVar, obj2, nVar, this) == aVar) {
                    return aVar;
                }
            }
            return Unit.f80348a;
        }
        if (i13 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ue.c.H(obj);
        o1 o1Var2 = i.f74095a;
        Function1 function1 = (Function1) this.f74069v.getValue();
        if (function1 != null) {
            function1.invoke(dVar.d());
        }
        return Unit.f80348a;
    }
}
