package a;

import ads_mobile_sdk.et2;
import ads_mobile_sdk.wb0;
import android.os.Bundle;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class rg extends wb0 implements a0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rg(ao2.j0 backgroundScope, Map listeners) {
        super(backgroundScope, listeners);
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(listeners, "listeners");
    }

    @Override // a.a0
    public final Object a(Bundle bundle, bl2.c cVar) {
        for (Map.Entry entry : this.f12972b.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            ao2.j0 j0Var = this.f12971a;
            ads_mobile_sdk.y1 block = new ads_mobile_sdk.y1("onAdMetadataChanged", str, value, null, bundle);
            kotlin.coroutines.j context = kotlin.coroutines.j.f80412a;
            Intrinsics.checkNotNullParameter(j0Var, "<this>");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(block, "block");
            kotlin.jvm.internal.j.z(j0Var, context, null, new et2(block, null), 2);
        }
        return Unit.f80348a;
    }
}
