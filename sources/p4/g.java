package p4;

import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class g extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f98784r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ j f98785s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ long f98786t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(j jVar, long j13, bl2.c cVar) {
        super(2, cVar);
        this.f98785s = jVar;
        this.f98786t = j13;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new g(this.f98785s, this.f98786t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f98784r;
        if (i13 == 0) {
            ue.c.H(obj);
            m3.d dVar = this.f98785s.f98794a;
            this.f98784r = 1;
            if (dVar.b(this.f98786t, this) == aVar) {
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
