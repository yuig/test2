package kq;

import com.pinterest.feature.view.ViewPagerLoadingFragment;
import com.pinterest.framework.screens.ScreenModel;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes3.dex */
public final class a extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f80625i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ c f80626j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(c cVar, int i13) {
        super(0);
        this.f80625i = i13;
        this.f80626j = cVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        c cVar = this.f80626j;
        int i13 = this.f80625i;
        switch (i13) {
            case 0:
                switch (i13) {
                    case 0:
                        cVar.getClass();
                        ScreenModel n13 = jr.a.n(new ViewPagerLoadingFragment.ViewPagerLoadingLocation());
                        Intrinsics.checkNotNullExpressionValue(n13, "createScreenDescription(...)");
                        return n13;
                    default:
                        cVar.getClass();
                        ScreenModel n14 = jr.a.n(new ViewPagerLoadingFragment.ViewPagerLoadingLocation());
                        Intrinsics.checkNotNullExpressionValue(n14, "createScreenDescription(...)");
                        return n14;
                }
            default:
                switch (i13) {
                    case 0:
                        cVar.getClass();
                        ScreenModel n15 = jr.a.n(new ViewPagerLoadingFragment.ViewPagerLoadingLocation());
                        Intrinsics.checkNotNullExpressionValue(n15, "createScreenDescription(...)");
                        return n15;
                    default:
                        cVar.getClass();
                        ScreenModel n16 = jr.a.n(new ViewPagerLoadingFragment.ViewPagerLoadingLocation());
                        Intrinsics.checkNotNullExpressionValue(n16, "createScreenDescription(...)");
                        return n16;
                }
        }
    }
}
