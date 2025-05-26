package m1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class j3 extends dl2.i implements Function2 {

    /* renamed from: s, reason: collision with root package name */
    public int f85398s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f85399t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ ao2.j0 f85400u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Function1 f85401v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Function1 f85402w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.j0 f85403x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ j1 f85404y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3(ao2.j0 j0Var, Function1 function1, Function1 function12, kotlin.jvm.internal.j0 j0Var2, j1 j1Var, bl2.c cVar) {
        super(2, cVar);
        this.f85400u = j0Var;
        this.f85401v = function1;
        this.f85402w = function12;
        this.f85403x = j0Var2;
        this.f85404y = j1Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        j3 j3Var = new j3(this.f85400u, this.f85401v, this.f85402w, this.f85403x, this.f85404y, cVar);
        j3Var.f85399t = obj;
        return j3Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j3) create((n3.l0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f85398s;
        if (i13 == 0) {
            ue.c.H(obj);
            n3.l0 l0Var = (n3.l0) this.f85399t;
            this.f85398s = 1;
            v0 v0Var = n3.f85477a;
            obj = n3.e(l0Var, n3.k.Main, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        n3.q qVar = (n3.q) obj;
        ao2.j0 j0Var = this.f85400u;
        j1 j1Var = this.f85404y;
        if (qVar != null) {
            qVar.a();
            kotlin.jvm.internal.j.z(j0Var, null, null, new h3(j1Var, null), 3);
            this.f85401v.invoke(new a3.c(qVar.f89109c));
            return Unit.f80348a;
        }
        kotlin.jvm.internal.j.z(j0Var, null, null, new i3(j1Var, null), 3);
        Function1 function1 = this.f85402w;
        if (function1 == null) {
            return null;
        }
        function1.invoke(new a3.c(((n3.q) this.f85403x.f80434a).f89109c));
        return Unit.f80348a;
    }
}
