package ads_mobile_sdk;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class ai0 extends s implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ di0 f2421a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ai0(di0 di0Var) {
        super(0);
        this.f2421a = di0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ln0 ln0Var = this.f2421a.E;
        if (ln0Var != null) {
            return ln0Var.f7894a;
        }
        Intrinsics.r("gmaWebViewContainer");
        throw null;
    }
}
