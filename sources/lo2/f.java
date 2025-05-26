package lo2;

import ao2.x0;
import ho2.v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final Object f84174a;

    /* renamed from: b, reason: collision with root package name */
    public final kl2.l f84175b;

    /* renamed from: c, reason: collision with root package name */
    public final kl2.l f84176c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f84177d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f84178e;

    /* renamed from: f, reason: collision with root package name */
    public final kl2.l f84179f;

    /* renamed from: g, reason: collision with root package name */
    public Object f84180g;

    /* renamed from: h, reason: collision with root package name */
    public int f84181h = -1;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ h f84182i;

    public f(h hVar, Object obj, kl2.l lVar, kl2.l lVar2, fi.b bVar, dl2.j jVar, kl2.l lVar3) {
        this.f84182i = hVar;
        this.f84174a = obj;
        this.f84175b = lVar;
        this.f84176c = lVar2;
        this.f84177d = bVar;
        this.f84178e = jVar;
        this.f84179f = lVar3;
    }

    public final void a() {
        Object obj = this.f84180g;
        if (obj instanceof v) {
            ((v) obj).j(this.f84181h, this.f84182i.f84188a);
            return;
        }
        x0 x0Var = obj instanceof x0 ? (x0) obj : null;
        if (x0Var != null) {
            x0Var.dispose();
        }
    }

    public final Object b(Object obj, bl2.c cVar) {
        fi.b bVar = k.f84198e;
        Object obj2 = this.f84178e;
        if (this.f84177d == bVar) {
            Intrinsics.g(obj2, "null cannot be cast to non-null type kotlin.coroutines.SuspendFunction0<R of kotlinx.coroutines.selects.SelectImplementation>");
            return ((Function1) obj2).invoke(cVar);
        }
        Intrinsics.g(obj2, "null cannot be cast to non-null type kotlin.coroutines.SuspendFunction1<kotlin.Any?, R of kotlinx.coroutines.selects.SelectImplementation>");
        return ((Function2) obj2).invoke(obj, cVar);
    }
}
