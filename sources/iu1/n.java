package iu1;

import ao2.j0;
import com.pinterest.navdemo.two.NavDemoTwoFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import lb.l0;

/* loaded from: classes4.dex */
public final class n extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f73712r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ NavDemoTwoFragment f73713s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(NavDemoTwoFragment navDemoTwoFragment, bl2.c cVar) {
        super(2, cVar);
        this.f73713s = navDemoTwoFragment;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new n(this.f73713s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((n) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f73712r;
        if (i13 == 0) {
            ue.c.H(obj);
            int i14 = NavDemoTwoFragment.f49929s0;
            NavDemoTwoFragment navDemoTwoFragment = this.f73713s;
            do2.i d2 = ((u) navDemoTwoFragment.f49930j0.getValue()).f73721e.d();
            m mVar = new m(navDemoTwoFragment, null);
            this.f73712r = 1;
            if (l0.I(d2, mVar, this) == aVar) {
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
