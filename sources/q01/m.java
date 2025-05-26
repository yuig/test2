package q01;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RowLayoutParams;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlin.jvm.internal.Intrinsics;
import yn2.c0;

/* loaded from: classes5.dex */
public final /* synthetic */ class m implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f101823a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f101824b;

    public /* synthetic */ m(p pVar, int i13) {
        this.f101823a = i13;
        this.f101824b = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewPropertyAnimator animate;
        ViewPropertyAnimator alpha;
        int i13 = this.f101823a;
        p this$0 = this.f101824b;
        switch (i13) {
            case 0:
                int i14 = p.E0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                View view = this$0.B0;
                if (view != null && (animate = view.animate()) != null && (alpha = animate.alpha(1.0f)) != null) {
                    alpha.start();
                }
                ca2.e V8 = this$0.V8();
                RecyclerView g83 = this$0.g8();
                View view2 = g83 != null ? (View) c0.o(d7.b.O(g83)) : null;
                ViewGroup.LayoutParams layoutParams = view2 != null ? view2.getLayoutParams() : null;
                RowLayoutParams rowLayoutParams = layoutParams instanceof RowLayoutParams ? (RowLayoutParams) layoutParams : null;
                Integer valueOf = rowLayoutParams != null ? Integer.valueOf((rowLayoutParams.f19273e + 1) * (bs1.c.X(this$0, eo1.c.space_200) + view2.getMeasuredHeight())) : null;
                if (valueOf == null) {
                    valueOf = Integer.valueOf(hf0.b.g(this$0.requireContext()) / 3);
                }
                V8.f27245d = bs1.c.X(this$0, eo1.c.space_400) + bs1.c.X(this$0, n80.a.related_pins_filter_options_sheet_header_height) + valueOf.intValue();
                ca2.e.w(this$0.V8(), 0, null, null, null, 15);
                BottomSheetBehavior bottomSheetBehavior = this$0.V8().f27255n;
                if (bottomSheetBehavior != null) {
                    bottomSheetBehavior.K = false;
                    break;
                }
                break;
            default:
                int i15 = p.E0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                p01.i iVar = this$0.C0;
                if (iVar != null) {
                    iVar.v3();
                }
                this$0.U8("navigation");
                break;
        }
    }
}
