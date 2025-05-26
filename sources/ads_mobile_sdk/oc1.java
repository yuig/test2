package ads_mobile_sdk;

import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class oc1 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f9216a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sc1 f9217b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ym0 f9218c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f9219d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f9220e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f9221f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f9222g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oc1(sc1 sc1Var, ym0 ym0Var, boolean z13, boolean z14, boolean z15, boolean z16, bl2.c cVar) {
        super(2, cVar);
        this.f9217b = sc1Var;
        this.f9218c = ym0Var;
        this.f9219d = z13;
        this.f9220e = z14;
        this.f9221f = z15;
        this.f9222g = z16;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new oc1(this.f9217b, this.f9218c, this.f9219d, this.f9220e, this.f9221f, this.f9222g, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((oc1) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f9216a;
        if (i13 == 0) {
            ue.c.H(obj);
            ub1 ub1Var = this.f9217b.f11040c;
            ym0 ym0Var = this.f9218c;
            boolean z13 = this.f9219d;
            boolean z14 = this.f9220e;
            boolean z15 = this.f9221f;
            boolean z16 = this.f9222g;
            this.f9216a = 1;
            ub1Var.getClass();
            nm.u uVar = new nm.u();
            uVar.t("sms", Boolean.valueOf(z13));
            uVar.t("tel", Boolean.valueOf(z14));
            uVar.t("calendar", Boolean.valueOf(z15));
            uVar.t("storePicture", Boolean.valueOf(z16));
            uVar.t("inlineVideo", Boolean.TRUE);
            Object a13 = ym0Var.a(uVar, "onDeviceFeaturesReceived", this);
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
