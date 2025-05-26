package ja;

import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class f extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f75201r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f75202s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ boolean f75203t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ d0 f75204u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ String[] f75205v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Callable f75206w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(boolean z13, d0 d0Var, String[] strArr, Callable callable, bl2.c cVar) {
        super(2, cVar);
        this.f75203t = z13;
        this.f75204u = d0Var;
        this.f75205v = strArr;
        this.f75206w = callable;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        f fVar = new f(this.f75203t, this.f75204u, this.f75205v, this.f75206w, cVar);
        fVar.f75202s = obj;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((do2.j) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f75201r;
        if (i13 == 0) {
            ue.c.H(obj);
            e eVar = new e(this.f75203t, this.f75204u, (do2.j) this.f75202s, this.f75205v, this.f75206w, null);
            this.f75201r = 1;
            if (dl2.b.O(eVar, this) == aVar) {
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
