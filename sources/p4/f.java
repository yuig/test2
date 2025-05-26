package p4;

import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class f extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f98780r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f98781s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ j f98782t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ long f98783u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(boolean z13, j jVar, long j13, bl2.c cVar) {
        super(2, cVar);
        this.f98781s = z13;
        this.f98782t = jVar;
        this.f98783u = j13;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new f(this.f98781s, this.f98782t, this.f98783u, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f98780r;
        if (i13 == 0) {
            ue.c.H(obj);
            boolean z13 = this.f98781s;
            j jVar = this.f98782t;
            if (z13) {
                m3.d dVar = jVar.f98794a;
                this.f98780r = 2;
                if (dVar.a(this.f98783u, 0L, this) == aVar) {
                    return aVar;
                }
            } else {
                m3.d dVar2 = jVar.f98794a;
                this.f98780r = 1;
                if (dVar2.a(0L, this.f98783u, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i13 != 1 && i13 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        return Unit.f80348a;
    }
}
