package eb;

import android.app.Activity;
import co2.z;
import k1.v0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import l0.v;

/* loaded from: classes3.dex */
public final class n extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f58205r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f58206s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ o f58207t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Activity f58208u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, Activity activity, bl2.c cVar) {
        super(2, cVar);
        this.f58207t = oVar;
        this.f58208u = activity;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        n nVar = new n(this.f58207t, this.f58208u, cVar);
        nVar.f58206s = obj;
        return nVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((n) create((z) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f58205r;
        if (i13 == 0) {
            ue.c.H(obj);
            z zVar = (z) this.f58206s;
            v vVar = new v(zVar, 6);
            o oVar = this.f58207t;
            oVar.f58209b.a(this.f58208u, new u5.j(11), vVar);
            v0 v0Var = new v0(19, oVar, vVar);
            this.f58205r = 1;
            if (dl2.b.w(zVar, v0Var, this) == aVar) {
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
