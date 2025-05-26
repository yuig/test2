package sm0;

import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import u50.r;
import xk2.q;
import xk2.s;

/* loaded from: classes5.dex */
public final class a extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f113230r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f113231s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ r f113232t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ qm0.k f113233u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Function1 f113234v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b f113235w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(r rVar, qm0.k kVar, Function1 function1, b bVar, bl2.c cVar) {
        super(2, cVar);
        this.f113232t = rVar;
        this.f113233u = kVar;
        this.f113234v = function1;
        this.f113235w = bVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        a aVar = new a(this.f113232t, this.f113233u, this.f113234v, this.f113235w, cVar);
        aVar.f113231s = obj;
        return aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        Object m13;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f113230r;
        try {
            if (i13 == 0) {
                ue.c.H(obj);
                Function1 function1 = this.f113234v;
                b bVar = this.f113235w;
                q qVar = s.f135225b;
                uj2.f fVar = (uj2.f) function1.invoke(bVar.f113236a);
                this.f113230r = 1;
                if (kh2.j.o(fVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ue.c.H(obj);
            }
            m13 = Unit.f80348a;
            q qVar2 = s.f135225b;
        } catch (Throwable th3) {
            q qVar3 = s.f135225b;
            m13 = ue.c.m(th3);
        }
        boolean z13 = !(m13 instanceof xk2.r);
        r rVar = this.f113232t;
        if (z13) {
            rVar.a(this.f113233u);
        } else {
            Throwable a13 = s.a(m13);
            String message = a13 != null ? a13.getMessage() : null;
            if (message == null) {
                message = "";
            }
            rVar.a(new qm0.h(message));
        }
        return Unit.f80348a;
    }
}
