package c2;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class i extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f24823r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f24824s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Function0 f24825t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Function2 f24826u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Function0 function0, Function2 function2, bl2.c cVar) {
        super(2, cVar);
        this.f24825t = function0;
        this.f24826u = function2;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        i iVar = new i(this.f24825t, this.f24826u, cVar);
        iVar.f24824s = obj;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f24823r;
        if (i13 == 0) {
            ue.c.H(obj);
            ao2.j0 j0Var = (ao2.j0) this.f24824s;
            kotlin.jvm.internal.j0 j0Var2 = new kotlin.jvm.internal.j0();
            pb.k Z1 = bs1.c.Z1(this.f24825t);
            h hVar = new h(j0Var2, j0Var, this.f24826u);
            this.f24823r = 1;
            if (Z1.collect(hVar, this) == aVar) {
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
