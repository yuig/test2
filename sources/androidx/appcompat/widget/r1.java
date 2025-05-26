package androidx.appcompat.widget;

import android.os.Handler;
import android.widget.AbsListView;

/* loaded from: classes2.dex */
public final class r1 implements AbsListView.OnScrollListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ListPopupWindow f16676a;

    public r1(ListPopupWindow listPopupWindow) {
        this.f16676a = listPopupWindow;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i13, int i14, int i15) {
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i13) {
        if (i13 == 1) {
            ListPopupWindow listPopupWindow = this.f16676a;
            if (listPopupWindow.f16397z.getInputMethodMode() == 2 || listPopupWindow.f16397z.getContentView() == null) {
                return;
            }
            Handler handler = listPopupWindow.f16393v;
            m1 m1Var = listPopupWindow.f16389r;
            handler.removeCallbacks(m1Var);
            m1Var.run();
        }
    }
}
