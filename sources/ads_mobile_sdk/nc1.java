package ads_mobile_sdk;

import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class nc1 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f8743a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sc1 f8744b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ym0 f8745c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8746d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f8747e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f8748f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f8749g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nc1(sc1 sc1Var, ym0 ym0Var, int i13, int i14, int i15, int i16, bl2.c cVar) {
        super(2, cVar);
        this.f8744b = sc1Var;
        this.f8745c = ym0Var;
        this.f8746d = i13;
        this.f8747e = i14;
        this.f8748f = i15;
        this.f8749g = i16;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new nc1(this.f8744b, this.f8745c, this.f8746d, this.f8747e, this.f8748f, this.f8749g, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((nc1) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f8743a;
        if (i13 == 0) {
            ue.c.H(obj);
            ub1 ub1Var = this.f8744b.f11040c;
            ym0 ym0Var = this.f8745c;
            int i14 = this.f8746d;
            int i15 = this.f8747e;
            int i16 = this.f8748f;
            int i17 = this.f8749g;
            this.f8743a = 1;
            ub1Var.getClass();
            nm.u uVar = new nm.u();
            uVar.s(new Integer(i14), "x");
            uVar.s(new Integer(i15), "y");
            uVar.s(new Integer(i16), "width");
            uVar.s(new Integer(i17), "height");
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
