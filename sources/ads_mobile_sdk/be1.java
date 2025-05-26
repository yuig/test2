package ads_mobile_sdk;

import android.graphics.Rect;
import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class be1 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f2861a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ce1 f2862b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ym0 f2863c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Rect f2864d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public be1(ce1 ce1Var, ym0 ym0Var, Rect rect, bl2.c cVar) {
        super(2, cVar);
        this.f2862b = ce1Var;
        this.f2863c = ym0Var;
        this.f2864d = rect;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new be1(this.f2862b, this.f2863c, this.f2864d, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((be1) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f2861a;
        if (i13 == 0) {
            ue.c.H(obj);
            ub1 ub1Var = this.f2862b.f3879a;
            ym0 ym0Var = this.f2863c;
            Rect rect = this.f2864d;
            int i14 = rect.left;
            int i15 = rect.top;
            int width = rect.width();
            int height = this.f2864d.height();
            this.f2861a = 1;
            ub1Var.getClass();
            nm.u uVar = new nm.u();
            uVar.s(new Integer(i14), "x");
            uVar.s(new Integer(i15), "y");
            uVar.s(new Integer(width), "width");
            uVar.s(new Integer(height), "height");
            Object a13 = ym0Var.a(uVar, "onDefaultPositionReceived", this);
            if (a13 != aVar) {
                a13 = Unit.f80348a;
            }
            if (a13 == aVar) {
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
