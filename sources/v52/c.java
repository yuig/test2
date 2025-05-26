package v52;

import ao2.j0;
import dl2.j;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import u50.r;
import u52.m0;
import u52.p0;
import u52.q0;
import u52.r0;

/* loaded from: classes4.dex */
public final class c extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f124174r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ r0 f124175s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ d f124176t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ r f124177u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(r0 r0Var, d dVar, r rVar, bl2.c cVar) {
        super(2, cVar);
        this.f124175s = r0Var;
        this.f124176t = dVar;
        this.f124177u = rVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new c(this.f124175s, this.f124176t, this.f124177u, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        m0 m0Var;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f124174r;
        if (i13 == 0) {
            ue.c.H(obj);
            r0 r0Var = this.f124175s;
            boolean z13 = r0Var instanceof p0;
            d dVar = this.f124176t;
            if (z13) {
                this.f124174r = 1;
                obj = d.j(dVar, (p0) r0Var, this);
                if (obj == aVar) {
                    return aVar;
                }
                m0Var = (m0) obj;
            } else {
                if (!(r0Var instanceof q0)) {
                    throw new NoWhenBranchMatchedException();
                }
                this.f124174r = 2;
                obj = d.k(dVar, (q0) r0Var, this);
                if (obj == aVar) {
                    return aVar;
                }
                m0Var = (m0) obj;
            }
        } else if (i13 == 1) {
            ue.c.H(obj);
            m0Var = (m0) obj;
        } else {
            if (i13 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
            m0Var = (m0) obj;
        }
        this.f124177u.a(m0Var);
        return Unit.f80348a;
    }
}
