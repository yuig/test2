package ho0;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import kotlin.jvm.internal.Intrinsics;
import mv0.y;
import pk.a0;
import yq0.b0;

/* loaded from: classes5.dex */
public final /* synthetic */ class a implements os.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f69680a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0 f69681b;

    public /* synthetic */ a(b0 b0Var, int i13) {
        this.f69680a = i13;
        this.f69681b = b0Var;
    }

    @Override // os.b
    public final View create() {
        int i13 = this.f69680a;
        b0 b0Var = this.f69681b;
        switch (i13) {
            case 0:
                d this$0 = (d) b0Var;
                int i14 = d.f69689a1;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                View view = new View(this$0.getContext());
                Resources resources = this$0.getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                view.setLayoutParams(new FrameLayout.LayoutParams(-1, a0.L(resources, 1.0f)));
                Context context = this$0.getContext();
                if (context == null || a0.q0(context)) {
                    Context requireContext = this$0.requireContext();
                    int i15 = eo1.b.color_gray_500;
                    Object obj = d5.a.f53679a;
                    view.setBackgroundColor(requireContext.getColor(i15));
                } else {
                    Context requireContext2 = this$0.requireContext();
                    int i16 = eo1.b.color_gray_100;
                    Object obj2 = d5.a.f53679a;
                    view.setBackgroundColor(requireContext2.getColor(i16));
                }
                return view;
            case 1:
                m this$02 = (m) b0Var;
                int i17 = m.N1;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                Context requireContext3 = this$02.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext3, "requireContext(...)");
                l11.m mVar = new l11.m(14, requireContext3, null);
                mVar.j3(this$02.f69736t1);
                return mVar;
            default:
                y this$03 = (y) b0Var;
                int i18 = y.U0;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                int dimensionPixelSize = this$03.getResources().getDimensionPixelSize(eo1.c.lego_image_width_default);
                View view2 = new View(this$03.getContext());
                view2.setLayoutParams(new ViewGroup.LayoutParams(-1, dimensionPixelSize));
                return view2;
        }
    }
}
