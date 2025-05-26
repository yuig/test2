package ads_mobile_sdk;

import android.os.SystemClock;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class qm0 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public ym0 f10172a;

    /* renamed from: b, reason: collision with root package name */
    public int f10173b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ym0 f10174c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qm0(ym0 ym0Var, bl2.c cVar) {
        super(2, cVar);
        this.f10174c = ym0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new qm0(this.f10174c, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new qm0(this.f10174c, (bl2.c) obj2).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        ym0 ym0Var;
        cr2 cr2Var;
        ym0 ym0Var2;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f10173b;
        if (i13 == 0) {
            ue.c.H(obj);
            ym0 ym0Var3 = this.f10174c;
            cr2 cr2Var2 = ym0Var3.f14333s;
            if (cr2Var2 != null) {
                dz dzVar = ym0Var3.f14318d;
                this.f10173b = 1;
                dzVar.getClass();
                String str = cr2Var2.f4010a;
                zn2.a aVar2 = zn2.b.f142311b;
                dzVar.f4519c.getClass();
                Object a13 = dzVar.a("awfllc", str, dl2.b.Q2(SystemClock.elapsedRealtime(), zn2.d.MILLISECONDS), this);
                if (a13 != aVar) {
                    a13 = Unit.f80348a;
                }
                if (a13 == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i13 != 1) {
                if (i13 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ym0Var2 = this.f10172a;
                ue.c.H(obj);
                cr2Var = (cr2) obj;
                ym0Var = ym0Var2;
                ym0Var.f14334t = cr2Var;
                return Unit.f80348a;
            }
            ue.c.H(obj);
        }
        ym0Var = this.f10174c;
        cr2Var = ym0Var.f14334t;
        if (cr2Var == null) {
            dz dzVar2 = ym0Var.f14318d;
            this.f10172a = ym0Var;
            this.f10173b = 2;
            Object a14 = dzVar2.a("native:view_load", this);
            if (a14 == aVar) {
                return aVar;
            }
            ym0Var2 = ym0Var;
            obj = a14;
            cr2Var = (cr2) obj;
            ym0Var = ym0Var2;
        }
        ym0Var.f14334t = cr2Var;
        return Unit.f80348a;
    }
}
