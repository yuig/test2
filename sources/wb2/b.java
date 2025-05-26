package wb2;

import ao2.j0;
import c72.o;
import dl2.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import lb.l0;
import m1.h2;
import pb.k;

/* loaded from: classes4.dex */
public final class b extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f129072r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ h2 f129073s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Function1 f129074t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(h2 h2Var, Function1 function1, bl2.c cVar) {
        super(2, cVar);
        this.f129073s = h2Var;
        this.f129074t = function1;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new b(this.f129073s, this.f129074t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f129072r;
        if (i13 == 0) {
            ue.c.H(obj);
            k Z1 = bs1.c.Z1(new o(this.f129073s, 25));
            a aVar2 = new a(this.f129074t, null);
            this.f129072r = 1;
            if (l0.I(Z1, aVar2, this) == aVar) {
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
