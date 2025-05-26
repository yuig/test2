package oc0;

import ao2.j0;
import com.pinterest.componentBrowser.ComponentBrowserActivity;
import do2.z1;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import lb.l0;

/* loaded from: classes5.dex */
public final class d extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f94036r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ComponentBrowserActivity f94037s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ComponentBrowserActivity componentBrowserActivity, bl2.c cVar) {
        super(2, cVar);
        this.f94037s = componentBrowserActivity;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new d(this.f94037s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f94036r;
        if (i13 == 0) {
            ue.c.H(obj);
            ComponentBrowserActivity componentBrowserActivity = this.f94037s;
            i iVar = componentBrowserActivity.f44772f;
            if (iVar == null) {
                Intrinsics.r("componentBrowserEventManager");
                throw null;
            }
            z1 z1Var = new z1(((j) iVar).f94042a);
            c cVar = new c(componentBrowserActivity, null);
            this.f94036r = 1;
            if (l0.I(z1Var, cVar, this) == aVar) {
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
