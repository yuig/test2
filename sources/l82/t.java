package l82;

import ao2.j0;
import do2.f2;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class t extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f82258r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ y f82259s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Function1 f82260t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ g f82261u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ String f82262v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Function1 f82263w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(y yVar, Function1 function1, g gVar, String str, Function1 function12, bl2.c cVar) {
        super(2, cVar);
        this.f82259s = yVar;
        this.f82260t = function1;
        this.f82261u = gVar;
        this.f82262v = str;
        this.f82263w = function12;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new t(this.f82259s, this.f82260t, this.f82261u, this.f82262v, this.f82263w, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((t) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f82258r;
        if (i13 == 0) {
            ue.c.H(obj);
            y yVar = this.f82259s;
            f2 f2Var = yVar.f82290h;
            s sVar = new s(this.f82260t, this.f82261u, yVar, this.f82262v, this.f82263w);
            this.f82258r = 1;
            f2Var.getClass();
            if (f2.j(f2Var, sVar, this) == aVar) {
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
