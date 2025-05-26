package z01;

import a11.w;
import a11.x;
import a11.y;
import android.webkit.URLUtil;
import ao2.j0;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.my0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import so.oa;
import xk2.q;
import xk2.r;
import xk2.s;

/* loaded from: classes5.dex */
public final class b extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f140533r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f140534s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ f30 f140535t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ nu.b f140536u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(f30 f30Var, nu.b bVar, bl2.c cVar) {
        super(2, cVar);
        this.f140535t = f30Var;
        this.f140536u = bVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        b bVar = new b(this.f140535t, this.f140536u, cVar);
        bVar.f140534s = obj;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        Object m13;
        my0 my0Var;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f140533r;
        nu.b bVar = this.f140536u;
        f30 f30Var = this.f140535t;
        try {
        } catch (Throwable th3) {
            q qVar = s.f135225b;
            m13 = ue.c.m(th3);
        }
        if (i13 == 0) {
            ue.c.H(obj);
            q qVar2 = s.f135225b;
            String d2 = w.d(f30Var, (ws1.a) bVar.f92310e, ((oa) z70.i.a()).r2());
            if (d2 != null) {
                ((ws1.b) ((ws1.a) bVar.f92310e)).getClass();
                if (URLUtil.isValidUrl(d2)) {
                    jk2.m a13 = ((y) bVar.f92309d).a(d2, f30Var.getId());
                    this.f140533r = 1;
                    obj = kh2.j.q(a13, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
            }
            m13 = null;
            q qVar3 = s.f135225b;
            if ((!(m13 instanceof r)) && (my0Var = (my0) m13) != null) {
                ((m60.w) bVar.f92308c).d(new x(new c82.a(my0Var), f30Var.getId()));
            }
            s.a(m13);
            return Unit.f80348a;
        }
        if (i13 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ue.c.H(obj);
        m13 = (my0) obj;
        q qVar32 = s.f135225b;
        if (!(m13 instanceof r)) {
            ((m60.w) bVar.f92308c).d(new x(new c82.a(my0Var), f30Var.getId()));
        }
        s.a(m13);
        return Unit.f80348a;
    }
}
