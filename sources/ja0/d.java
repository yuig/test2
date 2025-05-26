package ja0;

import ao2.j0;
import com.pinterest.api.model.f30;
import com.pinterest.repository.pin.PinService;
import dl2.j;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import uj2.h;
import x02.i2;
import xk2.q;
import xk2.r;
import xk2.s;

/* loaded from: classes5.dex */
public final class d extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ i2 f75295r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Function1 f75296s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Function0 f75297t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ PinService f75298u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ String f75299v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(i2 i2Var, Function1 function1, Function0 function0, PinService pinService, String str, bl2.c cVar) {
        super(2, cVar);
        this.f75295r = i2Var;
        this.f75296s = function1;
        this.f75297t = function0;
        this.f75298u = pinService;
        this.f75299v = str;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new d(this.f75295r, this.f75296s, this.f75297t, this.f75298u, this.f75299v, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        Object m13;
        Object b13;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        PinService pinService = this.f75298u;
        String str = this.f75299v;
        try {
            q qVar = s.f135225b;
            h s13 = pinService.getPin(str, n00.b.a(n00.c.PIN_CLOSEUP), null).s();
            nk2.c cVar = new nk2.c(1);
            s13.l(cVar);
            b13 = cVar.b();
        } catch (Throwable th3) {
            q qVar2 = s.f135225b;
            m13 = ue.c.m(th3);
        }
        if (b13 == null) {
            throw new NoSuchElementException();
        }
        m13 = (f30) b13;
        f30 f30Var = (f30) (m13 instanceof r ? null : m13);
        if (f30Var != null) {
            this.f75295r.Z(f30Var);
            this.f75296s.invoke(f30Var);
        } else {
            this.f75297t.invoke();
        }
        return Unit.f80348a;
    }
}
