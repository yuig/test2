package lu;

import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class f0 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e0 f84891a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f84892b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i0 f84893c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f84894d;

    public f0(e0 e0Var, kotlin.jvm.internal.h0 h0Var, i0 i0Var, int i13) {
        this.f84891a = e0Var;
        this.f84892b = h0Var;
        this.f84893c = i0Var;
        this.f84894d = i13;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        e0 e0Var = this.f84891a;
        e0Var.f84881u.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        ArrayList arrayList = e0Var.f84883w;
        int size = arrayList.size();
        int i13 = 0;
        while (true) {
            LinearLayout linearLayout = e0Var.f84881u;
            int i14 = this.f84894d;
            i0 i0Var = this.f84893c;
            kotlin.jvm.internal.h0 h0Var = this.f84892b;
            if (i13 >= size) {
                int size2 = arrayList.size();
                for (int i15 = 0; i15 < size2; i15++) {
                    ((d0) arrayList.get(i15)).f84874b.setTextSize(h0Var.f80426a);
                }
                i0Var.getClass();
                linearLayout.getViewTreeObserver().addOnGlobalLayoutListener(new g0(20, i14, e0Var, i0Var));
                linearLayout.requestLayout();
                return;
            }
            int W0 = kh2.d.W0((int) ((d0) arrayList.get(i13)).f84874b.getTextSize());
            if (((d0) arrayList.get(i13)).f84874b.getLineCount() > 2 && W0 > 12) {
                int i16 = W0 - 1;
                ((d0) arrayList.get(i13)).f84874b.setTextSize(2, i16);
                h0Var.f80426a = i16;
                i0Var.getClass();
                kotlin.jvm.internal.h0 h0Var2 = new kotlin.jvm.internal.h0();
                h0Var2.f80426a = W0;
                linearLayout.getViewTreeObserver().addOnGlobalLayoutListener(new f0(e0Var, h0Var2, i0Var, i14));
                return;
            }
            i13++;
        }
    }
}
