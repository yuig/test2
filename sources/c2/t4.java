package c2;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class t4 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ boolean f25252r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ i2.v3 f25253s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ i2.v3 f25254t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ i2.q1 f25255u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t4(i2.v3 v3Var, i2.v3 v3Var2, i2.q1 q1Var, bl2.c cVar) {
        super(2, cVar);
        this.f25253s = v3Var;
        this.f25254t = v3Var2;
        this.f25255u = q1Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        t4 t4Var = new t4(this.f25253s, this.f25254t, this.f25255u, cVar);
        t4Var.f25252r = ((Boolean) obj).booleanValue();
        return t4Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((t4) create(bool, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        boolean z13 = this.f25252r;
        float f13 = z4.f25465a;
        if (((Boolean) this.f25253s.getValue()).booleanValue() != z13) {
            Function1 function1 = (Function1) this.f25254t.getValue();
            if (function1 != null) {
                function1.invoke(Boolean.valueOf(z13));
            }
            this.f25255u.setValue(Boolean.valueOf(!((Boolean) r2.getValue()).booleanValue()));
        }
        return Unit.f80348a;
    }
}
