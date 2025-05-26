package nt;

import com.pinterest.gestalt.textfield.view.GestaltTextField;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class w1 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f92219r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f92220s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ GestaltTextField f92221t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(GestaltTextField gestaltTextField, bl2.c cVar) {
        super(2, cVar);
        this.f92221t = gestaltTextField;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        w1 w1Var = new w1(this.f92221t, cVar);
        w1Var.f92220s = obj;
        return w1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((w1) create((co2.z) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        Object w13;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f92219r;
        if (i13 == 0) {
            ue.c.H(obj);
            co2.z zVar = (co2.z) this.f92220s;
            this.f92221t.L(new tq.a0(zVar, 21));
            this.f92219r = 1;
            w13 = dl2.b.w(zVar, new ap.e(6), this);
            if (w13 == aVar) {
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
