package ct0;

import android.view.View;
import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import lb.l0;

/* loaded from: classes5.dex */
public final class o extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f53161r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ s f53162s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ View f53163t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(s sVar, View view, bl2.c cVar) {
        super(2, cVar);
        this.f53162s = sVar;
        this.f53163t = view;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new o(this.f53162s, this.f53163t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((o) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f53161r;
        if (i13 == 0) {
            ue.c.H(obj);
            int i14 = s.S0;
            s sVar = this.f53162s;
            do2.i d2 = sVar.k9().f53132f.d();
            n nVar = new n(sVar, this.f53163t, null);
            this.f53161r = 1;
            if (l0.g0(d2, nVar, this) == aVar) {
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
