package w91;

import ao2.j0;
import dl2.j;
import e82.w;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import v91.q;
import v91.r;

/* loaded from: classes5.dex */
public final class b extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f128587r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ f f128588s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ r f128589t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ u50.r f128590u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(f fVar, r rVar, u50.r rVar2, bl2.c cVar) {
        super(2, cVar);
        this.f128588s = fVar;
        this.f128589t = rVar;
        this.f128590u = rVar2;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new b(this.f128588s, this.f128589t, this.f128590u, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f128587r;
        if (i13 == 0) {
            ue.c.H(obj);
            r rVar = this.f128589t;
            boolean z13 = ((q) rVar).f125007a;
            w wVar = ((q) rVar).f125008b;
            this.f128587r = 1;
            if (f.k(this.f128588s, z13, wVar, this.f128590u, this) == aVar) {
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
