package ads_mobile_sdk;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j0;

/* loaded from: classes2.dex */
public final class js1 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public a.e9 f6938a;

    /* renamed from: b, reason: collision with root package name */
    public int f6939b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ws1 f6940c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ym0 f6941d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f6942e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ j0 f6943f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ fr0 f6944g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ j0 f6945h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f6946i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public js1(ws1 ws1Var, ym0 ym0Var, String str, j0 j0Var, fr0 fr0Var, j0 j0Var2, boolean z13, bl2.c cVar) {
        super(2, cVar);
        this.f6940c = ws1Var;
        this.f6941d = ym0Var;
        this.f6942e = str;
        this.f6943f = j0Var;
        this.f6944g = fr0Var;
        this.f6945h = j0Var2;
        this.f6946i = z13;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new js1(this.f6940c, this.f6941d, this.f6942e, this.f6943f, this.f6944g, this.f6945h, this.f6946i, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((js1) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f6939b;
        if (i13 == 0) {
            ue.c.H(obj);
            ws1 ws1Var = this.f6940c;
            zq1 zq1Var = ws1Var.f13229e;
            ym0 ym0Var = this.f6941d;
            String str = this.f6942e;
            String str2 = ws1Var.f13228d.f10398x;
            Object obj2 = this.f6943f.f80434a;
            if (obj2 == null) {
                Intrinsics.r("creativeType");
                throw null;
            }
            ts tsVar = (ts) obj2;
            fr0 fr0Var = this.f6944g;
            lu1 lu1Var = lu1.f7984c;
            Object obj3 = this.f6945h.f80434a;
            if (obj3 == null) {
                Intrinsics.r("videoEventsOwner");
                throw null;
            }
            this.f6939b = 1;
            zq1Var.getClass();
            obj = zq1.a(zq1Var, ym0Var, str, str2, tsVar, fr0Var, lu1Var, (lu1) obj3, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                if (i13 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a.e9 e9Var = this.f6938a;
                ue.c.H(obj);
                return e9Var;
            }
            ue.c.H(obj);
        }
        a.e9 adSession = (a.e9) obj;
        if (adSession == null) {
            return null;
        }
        ws1 ws1Var2 = this.f6940c;
        ym0 ym0Var2 = this.f6941d;
        boolean z13 = this.f6946i;
        if (ws1Var2.f13236l) {
            ws1Var2.f13229e.a(adSession, ym0Var2);
        }
        if (z13) {
            zq1 zq1Var2 = ws1Var2.f13229e;
            zq1Var2.getClass();
            Intrinsics.checkNotNullParameter(adSession, "adSession");
            nm.u uVar = new nm.u();
            this.f6938a = adSession;
            this.f6939b = 2;
            if (ym0Var2.a(uVar, "onSdkLoaded", this) == aVar) {
                return aVar;
            }
        }
        return adSession;
    }
}
