package ads_mobile_sdk;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class xw0 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public hv1 f13833a;

    /* renamed from: b, reason: collision with root package name */
    public int f13834b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yw0 f13835c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xw0(yw0 yw0Var, bl2.c cVar) {
        super(2, cVar);
        this.f13835c = yw0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new xw0(this.f13835c, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new xw0(this.f13835c, (bl2.c) obj2).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        hv1 hv1Var;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f13834b;
        if (i13 == 0) {
            ue.c.H(obj);
            yw0 yw0Var = this.f13835c;
            hv1Var = yw0Var.f14433e;
            a.dc dcVar = yw0Var.f14432d;
            this.f13833a = hv1Var;
            this.f13834b = 1;
            obj = dcVar.a(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                if (i13 == 2) {
                    ue.c.H(obj);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            hv1Var = this.f13833a;
            ue.c.H(obj);
        }
        a.ad adVar = (a.ad) obj;
        if (adVar instanceof jk0) {
            return (jk0) adVar;
        }
        Intrinsics.g(adVar, "null cannot be cast to non-null type com.google.android.libraries.ads.mobile.sdk.internal.util.GmaResult.Success<T of com.google.android.libraries.ads.mobile.sdk.internal.util.GmaResult.Companion.returnIfError>");
        cf2 cf2Var = (cf2) ((pk0) adVar).f9719b;
        this.f13833a = null;
        this.f13834b = 2;
        obj = hv1Var.a(cf2Var, this);
        return obj == aVar ? aVar : obj;
    }
}
