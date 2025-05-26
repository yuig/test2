package kx0;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import yq0.b0;

/* loaded from: classes5.dex */
public final /* synthetic */ class b implements os.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f81056a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0 f81057b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f81058c;

    public /* synthetic */ b(b0 b0Var, Object obj, int i13) {
        this.f81056a = i13;
        this.f81057b = b0Var;
        this.f81058c = obj;
    }

    @Override // os.b
    public final View create() {
        int i13 = this.f81056a;
        Object obj = this.f81058c;
        b0 b0Var = this.f81057b;
        switch (i13) {
            case 0:
                o this$0 = (o) b0Var;
                ux0.a exploreHomeFeedFooterViewListener = (ux0.a) obj;
                int i14 = o.f81075g1;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(exploreHomeFeedFooterViewListener, "$exploreHomeFeedFooterViewListener");
                Context requireContext = this$0.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                ux0.c cVar = new ux0.c(requireContext);
                cVar.b(exploreHomeFeedFooterViewListener);
                return cVar;
            case 1:
                l11.j this$02 = (l11.j) b0Var;
                List pinnableImages = (List) obj;
                int i15 = l11.j.W1;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                Intrinsics.checkNotNullParameter(pinnableImages, "$pinnableImages");
                Context requireContext2 = this$02.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                l11.m mVar = new l11.m(12, requireContext2, this$02.E1);
                Context requireContext3 = this$02.requireContext();
                int i16 = eo1.b.color_themed_background_elevation_floating;
                Object obj2 = d5.a.f53679a;
                mVar.setBackgroundColor(requireContext3.getColor(i16));
                mVar.j3(pinnableImages);
                return mVar;
            default:
                l11.j this$03 = (l11.j) b0Var;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) obj;
                int i17 = l11.j.W1;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                Intrinsics.checkNotNullParameter(layoutParams, "$layoutParams");
                View view = new View(this$03.requireContext());
                view.setLayoutParams(layoutParams);
                return view;
        }
    }
}
