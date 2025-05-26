package c2;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class g4 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f24776r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ j1.d f24777s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ boolean f24778t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ j1.n f24779u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Function0 f24780v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g4(j1.d dVar, boolean z13, j1.n nVar, Function0 function0, bl2.c cVar) {
        super(2, cVar);
        this.f24777s = dVar;
        this.f24778t = z13;
        this.f24779u = nVar;
        this.f24780v = function0;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new g4(this.f24777s, this.f24778t, this.f24779u, this.f24780v, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g4) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f24776r;
        if (i13 == 0) {
            ue.c.H(obj);
            Float f13 = new Float(this.f24778t ? 1.0f : 0.0f);
            this.f24776r = 1;
            if (j1.d.c(this.f24777s, f13, this.f24779u, this) == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        this.f24780v.invoke();
        return Unit.f80348a;
    }
}
