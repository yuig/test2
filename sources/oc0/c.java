package oc0;

import com.pinterest.componentBrowser.ComponentBrowserActivity;
import kh2.k3;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class c extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f94034r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ComponentBrowserActivity f94035s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ComponentBrowserActivity componentBrowserActivity, bl2.c cVar) {
        super(2, cVar);
        this.f94035s = componentBrowserActivity;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        c cVar2 = new c(this.f94035s, cVar);
        cVar2.f94034r = obj;
        return cVar2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((qc0.g) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        qc0.g gVar = (qc0.g) this.f94034r;
        ComponentBrowserActivity componentBrowserActivity = this.f94035s;
        if (componentBrowserActivity.f44774h != null) {
            if (gVar instanceof qc0.c) {
                componentBrowserActivity.t().p();
            } else if (gVar instanceof qc0.f) {
                z9.p.o(componentBrowserActivity.t(), gVar.f103517a, null, 6);
            } else {
                k3.C1(componentBrowserActivity.t(), gVar.f103517a);
            }
        }
        return Unit.f80348a;
    }
}
