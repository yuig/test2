package ads_mobile_sdk;

import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class zc0 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ad0 f14713a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f14714b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f14715c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zc0(ad0 ad0Var, String str, boolean z13, bl2.c cVar) {
        super(2, cVar);
        this.f14713a = ad0Var;
        this.f14714b = str;
        this.f14715c = z13;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new zc0(this.f14713a, this.f14714b, this.f14715c, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((zc0) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        fd0 fd0Var = this.f14713a.f2360b;
        String adUnitId = this.f14714b;
        boolean z13 = this.f14715c;
        fd0Var.getClass();
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        try {
            if (fd0Var.f5109e.getValue() != null) {
                Class.forName(fd0Var.f5108d.F()).getMethod(z13 ? "beginAdUnitExposure" : "endAdUnitExposure", String.class).invoke(fd0Var.f5109e.getValue(), adUnitId);
            }
        } catch (Exception e13) {
            ((ks2) fd0Var.f5106b).a("FirebaseAnalyticsAdapter.invokeMethod AdUnitExposure", e13);
        }
        return Unit.f80348a;
    }
}
