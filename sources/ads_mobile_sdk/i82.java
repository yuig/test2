package ads_mobile_sdk;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class i82 extends s implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n82 f6279a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i82(n82 n82Var) {
        super(0);
        this.f6279a = n82Var;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String invoke() {
        nm.u uVar;
        uVar = this.f6279a.f8718r;
        if (uVar == null) {
            Intrinsics.r("signalJson");
            throw null;
        }
        return "Ad Request Signals: " + uVar;
    }
}
