package z01;

import android.net.Uri;
import ao2.j0;
import ao2.v0;
import com.pinterest.api.model.PinFeed;
import df.j1;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import u50.r;
import xk2.q;
import xk2.s;
import y01.x;
import y01.y;

/* loaded from: classes5.dex */
public final class m extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f140573r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f140574s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ y01.j f140575t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ mb0.a f140576u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ r f140577v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(y01.j jVar, mb0.a aVar, r rVar, bl2.c cVar) {
        super(2, cVar);
        this.f140575t = jVar;
        this.f140576u = aVar;
        this.f140577v = rVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        m mVar = new m(this.f140575t, this.f140576u, this.f140577v, cVar);
        mVar.f140574s = obj;
        return mVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((m) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        Object m13;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f140573r;
        try {
            if (i13 == 0) {
                ue.c.H(obj);
                y01.j jVar = this.f140575t;
                mb0.a aVar2 = this.f140576u;
                q qVar = s.f135225b;
                String V = j1.V("%s%s%s", jVar.f136418a, jVar.f136419b, Uri.encode(jVar.f136420c));
                ko2.f fVar = v0.f20219a;
                ko2.e eVar = ko2.e.f80326c;
                l lVar = new l(aVar2, V, null);
                this.f140573r = 1;
                obj = kotlin.jvm.internal.j.M(this, eVar, lVar);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ue.c.H(obj);
            }
            m13 = (PinFeed) obj;
            q qVar2 = s.f135225b;
        } catch (Throwable th3) {
            q qVar3 = s.f135225b;
            m13 = ue.c.m(th3);
        }
        boolean z13 = !(m13 instanceof xk2.r);
        r rVar = this.f140577v;
        if (z13) {
            PinFeed pinFeed = (PinFeed) m13;
            Intrinsics.f(pinFeed);
            rVar.a(new y(pinFeed));
        }
        Throwable a13 = s.a(m13);
        if (a13 != null) {
            rVar.a(new x(a13));
        }
        return Unit.f80348a;
    }
}
