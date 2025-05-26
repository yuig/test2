package a;

import ads_mobile_sdk.et2;
import ads_mobile_sdk.ta2;
import ads_mobile_sdk.ua2;
import ads_mobile_sdk.va2;
import ads_mobile_sdk.wb0;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class ye extends wb0 implements bg {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ye(ao2.j0 backgroundScope, Map listeners) {
        super(backgroundScope, listeners);
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(listeners, "listeners");
    }

    @Override // a.bg
    public final Unit a(cj.a aVar, bl2.c cVar) {
        for (Map.Entry entry : this.f12972b.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            ao2.j0 j0Var = this.f12971a;
            ta2 block = new ta2("onRewardGranted", str, value, null, aVar);
            kotlin.coroutines.j context = kotlin.coroutines.j.f80412a;
            Intrinsics.checkNotNullParameter(j0Var, "<this>");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(block, "block");
            kotlin.jvm.internal.j.z(j0Var, context, null, new et2(block, null), 2);
        }
        return Unit.f80348a;
    }

    @Override // a.bg
    public final Object f(bl2.c cVar) {
        for (Map.Entry entry : this.f12972b.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            ao2.j0 j0Var = this.f12971a;
            ua2 block = new ua2("onRewardedVideoComplete", str, value, null);
            kotlin.coroutines.j context = kotlin.coroutines.j.f80412a;
            Intrinsics.checkNotNullParameter(j0Var, "<this>");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(block, "block");
            kotlin.jvm.internal.j.z(j0Var, context, null, new et2(block, null), 2);
        }
        return Unit.f80348a;
    }

    @Override // a.bg
    public final Object j(bl2.c cVar) {
        for (Map.Entry entry : this.f12972b.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            ao2.j0 j0Var = this.f12971a;
            va2 block = new va2("onRewardedVideoStart", str, value, null);
            kotlin.coroutines.j context = kotlin.coroutines.j.f80412a;
            Intrinsics.checkNotNullParameter(j0Var, "<this>");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(block, "block");
            kotlin.jvm.internal.j.z(j0Var, context, null, new et2(block, null), 2);
        }
        return Unit.f80348a;
    }
}
