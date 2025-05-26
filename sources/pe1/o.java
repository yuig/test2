package pe1;

import android.content.Context;
import androidx.lifecycle.z;
import com.pinterest.feature.shopping.shoppingstories.feed.emptystate.StructuredFeedEmptyStateView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import we1.y1;

/* loaded from: classes5.dex */
public final class o extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f99968i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ p f99969j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(p pVar, int i13) {
        super(0);
        this.f99968i = i13;
        this.f99969j = pVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f99968i;
        p listener = this.f99969j;
        switch (i13) {
            case 0:
                Context requireContext = listener.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                z viewLifecycleOwner = listener.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                d61.e eVar = new d61.e(requireContext, listener.s7(), bf.b.S(viewLifecycleOwner));
                eVar.f45876c.setPaddingRelative(0, 0, 0, 0);
                return eVar;
            case 1:
                Context requireContext2 = listener.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                y1 y1Var = new y1(requireContext2);
                Intrinsics.checkNotNullParameter(listener, "listener");
                y1Var.f129708f = listener;
                y1Var.setVisibility(8);
                return y1Var;
            default:
                Context requireContext3 = listener.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext3, "requireContext(...)");
                StructuredFeedEmptyStateView structuredFeedEmptyStateView = new StructuredFeedEmptyStateView(requireContext3);
                structuredFeedEmptyStateView.a(listener);
                return structuredFeedEmptyStateView;
        }
    }
}
