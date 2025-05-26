package ads_mobile_sdk;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class uy1 extends s implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h02 f12252a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uy1(h02 h02Var) {
        super(1);
        this.f12252a = h02Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        h92 it = (h92) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.valueOf(it == h92.f5899e && this.f12252a.f5793r);
    }
}
