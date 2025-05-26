package z01;

import ao2.j0;
import ao2.v0;
import com.pinterest.api.model.f30;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import u50.r;
import xk2.q;
import xk2.s;
import y01.p0;
import y01.r0;

/* loaded from: classes5.dex */
public final class h extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f140550r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f140551s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ k f140552t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f140553u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ r f140554v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(k kVar, String str, r rVar, bl2.c cVar) {
        super(2, cVar);
        this.f140552t = kVar;
        this.f140553u = str;
        this.f140554v = rVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        h hVar = new h(this.f140552t, this.f140553u, this.f140554v, cVar);
        hVar.f140551s = obj;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        Object m13;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f140550r;
        try {
            if (i13 == 0) {
                ue.c.H(obj);
                k kVar = this.f140552t;
                String str = this.f140553u;
                q qVar = s.f135225b;
                ko2.f fVar = v0.f20219a;
                ko2.e eVar = ko2.e.f80326c;
                g gVar = new g(kVar, str, null);
                this.f140550r = 1;
                obj = kotlin.jvm.internal.j.M(this, eVar, gVar);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ue.c.H(obj);
            }
            m13 = (f30) obj;
            q qVar2 = s.f135225b;
        } catch (Throwable th3) {
            q qVar3 = s.f135225b;
            m13 = ue.c.m(th3);
        }
        boolean z13 = !(m13 instanceof xk2.r);
        r rVar = this.f140554v;
        if (z13) {
            rVar.a(new r0((f30) m13));
        }
        Throwable a13 = s.a(m13);
        if (a13 != null) {
            rVar.a(new p0(a13));
        }
        return Unit.f80348a;
    }
}
