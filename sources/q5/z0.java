package q5;

import android.view.View;
import android.view.ViewGroup;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class z0 extends dl2.i implements Function2 {

    /* renamed from: s, reason: collision with root package name */
    public int f102546s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f102547t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ View f102548u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(View view, bl2.c cVar) {
        super(2, cVar);
        this.f102548u = view;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        z0 z0Var = new z0(this.f102548u, cVar);
        z0Var.f102547t = obj;
        return z0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((z0) create((yn2.p) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        yn2.p pVar;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f102546s;
        View view = this.f102548u;
        if (i13 == 0) {
            ue.c.H(obj);
            pVar = (yn2.p) this.f102547t;
            this.f102547t = pVar;
            this.f102546s = 1;
            if (pVar.b(view, this) == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                if (i13 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ue.c.H(obj);
                return Unit.f80348a;
            }
            pVar = (yn2.p) this.f102547t;
            ue.c.H(obj);
        }
        if (view instanceof ViewGroup) {
            y0 y0Var = new y0((ViewGroup) view, 0);
            this.f102547t = null;
            this.f102546s = 2;
            pVar.getClass();
            Object c13 = pVar.c(y0Var.iterator(), this);
            if (c13 != aVar) {
                c13 = Unit.f80348a;
            }
            if (c13 == aVar) {
                return aVar;
            }
        }
        return Unit.f80348a;
    }
}
