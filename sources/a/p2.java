package a;

import ads_mobile_sdk.ax0;
import ads_mobile_sdk.bx0;
import ads_mobile_sdk.cf2;
import ads_mobile_sdk.cx0;
import ads_mobile_sdk.dx0;
import ads_mobile_sdk.et2;
import ads_mobile_sdk.wb0;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class p2 extends wb0 implements j4 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(ao2.j0 backgroundScope, Map listeners) {
        super(backgroundScope, listeners);
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(listeners, "listeners");
    }

    @Override // a.j4
    public final Object a(cf2 cf2Var, bl2.c cVar) {
        for (Map.Entry entry : this.f12972b.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            ao2.j0 j0Var = this.f12971a;
            ax0 block = new ax0("onAdResponse", str, value, null, cf2Var);
            kotlin.coroutines.j context = kotlin.coroutines.j.f80412a;
            Intrinsics.checkNotNullParameter(j0Var, "<this>");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(block, "block");
            kotlin.jvm.internal.j.z(j0Var, context, null, new et2(block, null), 2);
        }
        return Unit.f80348a;
    }

    @Override // a.j4
    public final Object b(bl2.c cVar) {
        for (Map.Entry entry : this.f12972b.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            ao2.j0 j0Var = this.f12971a;
            bx0 block = new bx0("onRequestStarted", str, value, null);
            kotlin.coroutines.j context = kotlin.coroutines.j.f80412a;
            Intrinsics.checkNotNullParameter(j0Var, "<this>");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(block, "block");
            kotlin.jvm.internal.j.z(j0Var, context, null, new et2(block, null), 2);
        }
        return Unit.f80348a;
    }

    @Override // a.j4
    public final Object a(wi.k kVar, bl2.c cVar) {
        for (Map.Entry entry : this.f12972b.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            ao2.j0 j0Var = this.f12971a;
            cx0 block = new cx0("onSignalCollectionStarted", str, value, null, kVar);
            kotlin.coroutines.j context = kotlin.coroutines.j.f80412a;
            Intrinsics.checkNotNullParameter(j0Var, "<this>");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(block, "block");
            kotlin.jvm.internal.j.z(j0Var, context, null, new et2(block, null), 2);
        }
        return Unit.f80348a;
    }

    @Override // a.j4
    public final Unit b() {
        for (Map.Entry entry : this.f12972b.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            ao2.j0 j0Var = this.f12971a;
            dx0 block = new dx0("onSignalCollectionSucceeded", str, value, null);
            kotlin.coroutines.j context = kotlin.coroutines.j.f80412a;
            Intrinsics.checkNotNullParameter(j0Var, "<this>");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(block, "block");
            kotlin.jvm.internal.j.z(j0Var, context, null, new et2(block, null), 2);
        }
        return Unit.f80348a;
    }
}
