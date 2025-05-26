package ads_mobile_sdk;

import gw.f;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import xk2.s;

/* loaded from: classes2.dex */
public final class li2 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dj.d f7855a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a.ad f7856b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public li2(a.ad adVar, dj.d dVar, bl2.c cVar) {
        super(2, cVar);
        this.f7855a = dVar;
        this.f7856b = adVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new li2(this.f7856b, this.f7855a, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        dj.d dVar = this.f7855a;
        return new li2(this.f7856b, dVar, (bl2.c) obj2).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        dj.d dVar = this.f7855a;
        dj.a signal = (dj.a) ((pk0) this.f7856b).f9719b;
        gw.d dVar2 = (gw.d) dVar;
        dVar2.getClass();
        Intrinsics.checkNotNullParameter(signal, "signal");
        f fVar = dVar2.f66190a;
        ((hw.a) fVar.f66199c).a(hw.b.SDK_GENERATE_QUERY_INFO_SUCCESS);
        String str = signal.f55115a;
        int length = str.length();
        ((pb0.g) fVar.f66197a).getClass();
        long currentTimeMillis = System.currentTimeMillis() - dVar2.f66192c;
        fw.c cVar = fVar.f66198b;
        cVar.getClass();
        String adUnitId = dVar2.f66191b;
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        h32.f1 f1Var = h32.f1.GMA_QUERY_INFO_FETCHED;
        HashMap x13 = a.a.x("ad_unit_ids", adUnitId, "is_third_party_ad", "true");
        x13.put("3p_additional_data", fw.c.a(length, currentTimeMillis, cVar.f63035c));
        Unit unit = Unit.f80348a;
        cVar.f63033a.g(f1Var, null, x13, false);
        cVar.f63035c = false;
        xk2.q qVar = s.f135225b;
        dVar2.f66193d.resumeWith(str);
        return Unit.f80348a;
    }
}
