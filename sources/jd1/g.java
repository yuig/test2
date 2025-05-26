package jd1;

import ads_mobile_sdk.ci1$$ExternalSyntheticThrowCCEIfNotNull0;
import com.pinterest.api.model.wy0;
import h32.g0;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import nx.d0;

/* loaded from: classes5.dex */
public final class g extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f75529i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ aj0.d f75530j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(aj0.d dVar, int i13) {
        super(1);
        this.f75529i = i13;
        this.f75530j = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f75529i;
        aj0.d dVar = this.f75530j;
        switch (i13) {
            case 0:
                ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(obj);
                d0 d0Var = dVar.f15423b.f122379a;
                Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
                g0 g0Var = g0.USER_REP;
                HashMap hashMap = new HashMap();
                Unit unit = Unit.f80348a;
                d0.B(d0Var, null, g0Var, null, hashMap, 21);
                return Unit.f80348a;
            default:
                wy0 user = (wy0) obj;
                Intrinsics.checkNotNullParameter(user, "user");
                Boolean O3 = user.O3();
                Intrinsics.checkNotNullExpressionValue(O3, "getIsVerifiedMerchant(...)");
                return (O3.booleanValue() && ((h) dVar.f15425d).f75531a) ? new Pair(Integer.valueOf(sm1.b.ic_check_circle_gestalt), Integer.valueOf(eo1.b.color_blue_500)) : new Pair(0, null);
        }
    }
}
