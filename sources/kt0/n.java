package kt0;

import com.pinterest.feature.home.viewpager.ViewPagerLoadingFragment;
import com.pinterest.framework.screens.ScreenModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f80838i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f80839j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(Object obj, int i13) {
        super(0);
        this.f80838i = i13;
        this.f80839j = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f80838i;
        Object obj = this.f80839j;
        switch (i13) {
            case 0:
                e0 e0Var = ((q) obj).H0;
                if (e0Var != null) {
                    pg0.t tVar = new pg0.t();
                    m60.w wVar = e0Var.f80808b;
                    wVar.f(tVar);
                    e0Var.f80824r = true;
                    r70.m mVar = e0Var.f80825s;
                    if (mVar != null) {
                        wVar.f(mVar);
                        e0Var.f80825s = null;
                    }
                }
                return Unit.f80348a;
            default:
                ((com.pinterest.feature.home.viewpager.a) obj).getClass();
                ScreenModel n13 = jr.a.n(new ViewPagerLoadingFragment.ViewPagerLoadingLocation());
                Intrinsics.checkNotNullExpressionValue(n13, "createScreenDescription(...)");
                return n13;
        }
    }
}
