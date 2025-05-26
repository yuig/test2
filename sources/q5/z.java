package q5;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.google.android.material.bottomappbar.BottomAppBar;
import com.pinterest.feature.home.mainfeed.HomeFeedFragment;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class z implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f102544a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f102545b;

    public /* synthetic */ z(View view, int i13) {
        this.f102544a = i13;
        this.f102545b = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i13 = this.f102544a;
        boolean z13 = false;
        View this_showKeyboard = this.f102545b;
        switch (i13) {
            case 0:
                kg.n.a(this_showKeyboard);
                ((InputMethodManager) this_showKeyboard.getContext().getSystemService("input_method")).showSoftInput(this_showKeyboard, 0);
                break;
            case 1:
                int i14 = BottomAppBar.f32248s0;
                kg.n.a(this_showKeyboard);
                this_showKeyboard.requestLayout();
                break;
            case 2:
                kg.n.a(this_showKeyboard);
                this_showKeyboard.requestFocus();
                this_showKeyboard.post(new v.s(this_showKeyboard, z13, 4));
                break;
            case 3:
                Intrinsics.checkNotNullParameter(this_showKeyboard, "$this_showKeyboard");
                Object systemService = this_showKeyboard.getContext().getSystemService("input_method");
                Intrinsics.g(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                ((InputMethodManager) systemService).showSoftInput(this_showKeyboard, 1);
                break;
            case 4:
                Intrinsics.checkNotNullParameter(this_showKeyboard, "$view");
                this_showKeyboard.requestLayout();
                break;
            case 5:
                int i15 = HomeFeedFragment.U1;
                Intrinsics.checkNotNullParameter(this_showKeyboard, "$this_apply");
                bs1.c.X0(this_showKeyboard);
                break;
            default:
                Intrinsics.checkNotNullParameter(this_showKeyboard, "$view");
                this_showKeyboard.setElevation(0.0f);
                break;
        }
    }
}
