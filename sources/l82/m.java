package l82;

import ao2.j0;
import do2.f2;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class m extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f82237r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ n f82238s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ f f82239t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ g f82240u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ String f82241v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, f fVar, g gVar, String str, bl2.c cVar) {
        super(2, cVar);
        this.f82238s = nVar;
        this.f82239t = fVar;
        this.f82240u = gVar;
        this.f82241v = str;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new m(this.f82238s, this.f82239t, this.f82240u, this.f82241v, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((m) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f82237r;
        if (i13 == 0) {
            ue.c.H(obj);
            n nVar = this.f82238s;
            f2 f2Var = nVar.f82242a.f82290h;
            k1.j0 j0Var = new k1.j0(this.f82239t, this.f82240u, nVar, this.f82241v, 7);
            this.f82237r = 1;
            f2Var.getClass();
            if (f2.j(f2Var, j0Var, this) == aVar) {
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
