package ads_mobile_sdk;

import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class oz2 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f9503a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pz2 f9504b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l03 f9505c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ss2 f9506d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dz f9507e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oz2(pz2 pz2Var, l03 l03Var, ss2 ss2Var, dz dzVar, bl2.c cVar) {
        super(2, cVar);
        this.f9504b = pz2Var;
        this.f9505c = l03Var;
        this.f9506d = ss2Var;
        this.f9507e = dzVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new oz2(this.f9504b, this.f9505c, this.f9506d, this.f9507e, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((oz2) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f9503a;
        if (i13 == 0) {
            ue.c.H(obj);
            pz2 pz2Var = this.f9504b;
            l03 l03Var = this.f9505c;
            ss2 ss2Var = this.f9506d;
            dz dzVar = this.f9507e;
            this.f9503a = 1;
            obj = pz2Var.a(l03Var, ss2Var, dzVar, null, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        return new ln0((ym0) obj);
    }
}
