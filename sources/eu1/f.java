package eu1;

import ao2.j0;
import com.pinterest.navdemo.one.NavDemoOneFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import lb.l0;

/* loaded from: classes4.dex */
public final class f extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f60185r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ NavDemoOneFragment f60186s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(NavDemoOneFragment navDemoOneFragment, bl2.c cVar) {
        super(2, cVar);
        this.f60186s = navDemoOneFragment;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new f(this.f60186s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f60185r;
        if (i13 == 0) {
            ue.c.H(obj);
            int i14 = NavDemoOneFragment.f49913o0;
            NavDemoOneFragment navDemoOneFragment = this.f60186s;
            do2.i d2 = ((l) navDemoOneFragment.f49914j0.getValue()).f60191c.d();
            e eVar = new e(navDemoOneFragment, null);
            this.f60185r = 1;
            if (l0.I(d2, eVar, this) == aVar) {
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
