package m1;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class s extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f85556r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ u f85557s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ k1.v1 f85558t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Function2 f85559u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(u uVar, k1.v1 v1Var, Function2 function2, bl2.c cVar) {
        super(2, cVar);
        this.f85557s = uVar;
        this.f85558t = v1Var;
        this.f85559u = function2;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new s(this.f85557s, this.f85558t, this.f85559u, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((s) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f85556r;
        if (i13 == 0) {
            ue.c.H(obj);
            u uVar = this.f85557s;
            k1.z1 z1Var = uVar.f85595c;
            r rVar = new r(uVar, this.f85559u, null);
            this.f85556r = 1;
            z1Var.getClass();
            if (dl2.b.O(new k1.y1(this.f85558t, z1Var, rVar, uVar.f85594b, null), this) == aVar) {
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
