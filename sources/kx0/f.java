package kx0;

import android.content.Context;
import androidx.recyclerview.widget.PinterestStaggeredGridLayoutManagerImpl;
import com.pinterest.component.board.view.LegoBoardRep;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ o f81064i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(o oVar) {
        super(0);
        this.f81064i = oVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        o oVar = this.f81064i;
        Context requireContext = oVar.requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        LegoBoardRep w13 = ph.a.w(requireContext, oVar.f7());
        oVar.j9();
        w13.setLayoutParams(new PinterestStaggeredGridLayoutManagerImpl.LayoutParams(-1, -2));
        return w13;
    }
}
