package ads_mobile_sdk;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class cc2 extends s implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ic2 f3863a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cc2(ic2 ic2Var) {
        super(1);
        this.f3863a = ic2Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View adView = (View) obj;
        Intrinsics.checkNotNullParameter(adView, "adView");
        ic2 ic2Var = this.f3863a;
        ic2Var.getClass();
        Intrinsics.checkNotNullParameter(adView, "<set-?>");
        ic2Var.f6317c = adView;
        return Unit.f80348a;
    }
}
