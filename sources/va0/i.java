package va0;

import ao2.j0;
import do2.f2;
import fd.q;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import s2.t;

/* loaded from: classes5.dex */
public final class i extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f125118r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ o1.l f125119s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ t f125120t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Function0 f125121u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Function0 f125122v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(o1.l lVar, t tVar, Function0 function0, Function0 function02, bl2.c cVar) {
        super(2, cVar);
        this.f125119s = lVar;
        this.f125120t = tVar;
        this.f125121u = function0;
        this.f125122v = function02;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new i(this.f125119s, this.f125120t, this.f125121u, this.f125122v, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f125118r;
        if (i13 == 0) {
            ue.c.H(obj);
            f2 f2Var = this.f125119s.f92764a;
            q qVar = new q(this.f125120t, this.f125121u, this.f125122v, 3);
            this.f125118r = 1;
            f2Var.getClass();
            if (f2.j(f2Var, qVar, this) == aVar) {
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
