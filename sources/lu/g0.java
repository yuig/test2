package lu;

import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import com.pinterest.gestalt.text.GestaltText;

/* loaded from: classes3.dex */
public final class g0 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e0 f84895a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f84896b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i0 f84897c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f84898d;

    public g0(int i13, int i14, e0 e0Var, i0 i0Var) {
        this.f84895a = e0Var;
        this.f84896b = i13;
        this.f84897c = i0Var;
        this.f84898d = i14;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i13;
        e0 e0Var = this.f84895a;
        e0Var.f84881u.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        GestaltText gestaltText = e0Var.f84882v;
        int lineCount = gestaltText.getLineCount();
        LinearLayout linearLayout = e0Var.f84881u;
        int i14 = this.f84898d;
        i0 i0Var = this.f84897c;
        if (lineCount <= 3 || (i13 = this.f84896b) <= 12) {
            i0Var.getClass();
            linearLayout.getViewTreeObserver().addOnGlobalLayoutListener(new h0(i14, e0Var, i0Var));
            linearLayout.requestLayout();
        } else {
            gestaltText.setTextSize(2, i13);
            i0Var.getClass();
            linearLayout.getViewTreeObserver().addOnGlobalLayoutListener(new g0(i13 - 2, i14, e0Var, i0Var));
            linearLayout.requestLayout();
        }
    }
}
