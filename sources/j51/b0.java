package j51;

import android.view.View;
import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import lb.l0;

/* loaded from: classes5.dex */
public final class b0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f74711r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ d0 f74712s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ View f74713t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(d0 d0Var, View view, bl2.c cVar) {
        super(2, cVar);
        this.f74712s = d0Var;
        this.f74713t = view;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new b0(this.f74712s, this.f74713t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b0) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f74711r;
        if (i13 == 0) {
            ue.c.H(obj);
            int i14 = d0.f74720s1;
            d0 d0Var = this.f74712s;
            do2.i d2 = d0Var.m9().f71578e.d();
            a0 a0Var = new a0(d0Var, this.f74713t, null);
            this.f74711r = 1;
            if (l0.I(d2, a0Var, this) == aVar) {
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
