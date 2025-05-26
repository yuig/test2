package y1;

import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import t3.f3;

/* loaded from: classes2.dex */
public final class f extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f136550r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f136551s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Function1 f136552t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ g f136553u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ b0 f136554v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Function1 function1, g gVar, b0 b0Var, bl2.c cVar) {
        super(2, cVar);
        this.f136552t = function1;
        this.f136553u = gVar;
        this.f136554v = b0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        f fVar = new f(this.f136552t, this.f136553u, this.f136554v, cVar);
        fVar.f136551s = obj;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((f3) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f136550r;
        if (i13 == 0) {
            ue.c.H(obj);
            e eVar = new e((f3) this.f136551s, this.f136552t, this.f136553u, this.f136554v, null);
            this.f136550r = 1;
            if (dl2.b.O(eVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        throw new KotlinNothingValueException();
    }
}
