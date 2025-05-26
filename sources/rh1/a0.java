package rh1;

import android.content.Context;
import com.pinterest.feature.unifiedcomments.CommentsFeatureLocation;
import com.pinterest.navigation.Navigation;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a0 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f108105i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ b0 f108106j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(b0 b0Var, int i13) {
        super(0);
        this.f108105i = i13;
        this.f108106j = b0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f108105i;
        b0 b0Var = this.f108106j;
        switch (i13) {
            case 0:
                d7.g.s(Navigation.w1(CommentsFeatureLocation.COMMENT_STICKERS), b0Var.f7());
                return Unit.f80348a;
            default:
                Context requireContext = b0Var.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                return new e0(requireContext);
        }
    }
}
