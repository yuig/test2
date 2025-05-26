package a;

import ads_mobile_sdk.cf2;
import ads_mobile_sdk.et2;
import ads_mobile_sdk.jk0;
import ads_mobile_sdk.nw0;
import ads_mobile_sdk.ow0;
import ads_mobile_sdk.wb0;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class ja extends wb0 implements hb {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ja(ao2.j0 backgroundScope, Map listeners) {
        super(backgroundScope, listeners);
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(listeners, "listeners");
    }

    @Override // a.hb
    public final Object a(jk0 jk0Var, wi.b0 b0Var, bl2.c cVar) {
        for (Map.Entry entry : this.f12972b.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            ao2.j0 j0Var = this.f12971a;
            nw0 block = new nw0("onAdFailedToLoad", str, value, null, jk0Var, b0Var);
            kotlin.coroutines.j context = kotlin.coroutines.j.f80412a;
            Intrinsics.checkNotNullParameter(j0Var, "<this>");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(block, "block");
            kotlin.jvm.internal.j.z(j0Var, context, null, new et2(block, null), 2);
        }
        return Unit.f80348a;
    }

    @Override // a.hb
    public final Object a(cf2 cf2Var, ads_mobile_sdk.r0 r0Var, wi.b0 b0Var, bl2.c cVar) {
        for (Map.Entry entry : this.f12972b.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            ao2.j0 j0Var = this.f12971a;
            ow0 block = new ow0("onAdLoaded", str, value, null, cf2Var, r0Var, b0Var);
            kotlin.coroutines.j context = kotlin.coroutines.j.f80412a;
            Intrinsics.checkNotNullParameter(j0Var, "<this>");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(block, "block");
            kotlin.jvm.internal.j.z(j0Var, context, null, new et2(block, null), 2);
        }
        return Unit.f80348a;
    }
}
