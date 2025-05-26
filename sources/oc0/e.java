package oc0;

import ao2.j0;
import ao2.m0;
import com.pinterest.componentBrowser.ComponentBrowserActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class e extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f94038r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ComponentBrowserActivity f94039s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ComponentBrowserActivity componentBrowserActivity, bl2.c cVar) {
        super(2, cVar);
        this.f94039s = componentBrowserActivity;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new e(this.f94039s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f94038r;
        if (i13 == 0) {
            ue.c.H(obj);
            androidx.lifecycle.r rVar = androidx.lifecycle.r.STARTED;
            ComponentBrowserActivity componentBrowserActivity = this.f94039s;
            d dVar = new d(componentBrowserActivity, null);
            this.f94038r = 1;
            if (m0.f0(componentBrowserActivity, rVar, dVar, this) == aVar) {
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
