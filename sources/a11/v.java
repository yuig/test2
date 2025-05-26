package a11;

import ao2.j0;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.my0;
import java.util.HashSet;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class v extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f360r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f361s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ y f362t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f363u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ f30 f364v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ m60.w f365w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ boolean f366x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(y yVar, String str, f30 f30Var, m60.w wVar, boolean z13, bl2.c cVar) {
        super(2, cVar);
        this.f362t = yVar;
        this.f363u = str;
        this.f364v = f30Var;
        this.f365w = wVar;
        this.f366x = z13;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        v vVar = new v(this.f362t, this.f363u, this.f364v, this.f365w, this.f366x, cVar);
        vVar.f361s = obj;
        return vVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((v) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        Object m13;
        my0 my0Var;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f360r;
        f30 f30Var = this.f364v;
        try {
            if (i13 == 0) {
                ue.c.H(obj);
                y yVar = this.f362t;
                String str = this.f363u;
                xk2.q qVar = xk2.s.f135225b;
                jk2.m a13 = yVar.a(str, f30Var.getF39332b());
                this.f360r = 1;
                obj = kh2.j.q(a13, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ue.c.H(obj);
            }
            m13 = (my0) obj;
            xk2.q qVar2 = xk2.s.f135225b;
        } catch (Throwable th3) {
            xk2.q qVar3 = xk2.s.f135225b;
            m13 = ue.c.m(th3);
        }
        if ((!(m13 instanceof xk2.r)) && (my0Var = (my0) m13) != null) {
            this.f365w.d(new x(new c82.a(my0Var), f30Var.getF39332b()));
        }
        Throwable e13 = xk2.s.a(m13);
        if (e13 != null) {
            Intrinsics.checkNotNullParameter(e13, "e");
            Intrinsics.checkNotNullParameter("Error on checkPinSpam", "message");
            if (this.f366x && !(e13 instanceof CancellationException)) {
                HashSet hashSet = tb0.h.f117076w;
                tb0.g.f117075a.q(e13, "PinSwipeFragment: Error on checkPinSpam", tb0.p.PDP);
            }
        }
        return Unit.f80348a;
    }
}
