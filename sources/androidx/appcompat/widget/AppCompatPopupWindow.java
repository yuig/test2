package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import androidx.annotation.NonNull;

/* loaded from: classes2.dex */
class AppCompatPopupWindow extends PopupWindow {
    public AppCompatPopupWindow(@NonNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        a(context, attributeSet, i13, 0);
    }

    public final void a(Context context, AttributeSet attributeSet, int i13, int i14) {
        x92.b N = x92.b.N(context, attributeSet, i.j.PopupWindow, i13, i14);
        if (N.G(i.j.PopupWindow_overlapAnchor)) {
            setOverlapAnchor(N.t(i.j.PopupWindow_overlapAnchor, false));
        }
        setBackgroundDrawable(N.x(i.j.PopupWindow_android_popupBackground));
        N.O();
    }

    @Override // android.widget.PopupWindow
    public final void showAsDropDown(View view, int i13, int i14) {
        super.showAsDropDown(view, i13, i14);
    }

    @Override // android.widget.PopupWindow
    public final void update(View view, int i13, int i14, int i15, int i16) {
        super.update(view, i13, i14, i15, i16);
    }

    @Override // android.widget.PopupWindow
    public final void showAsDropDown(View view, int i13, int i14, int i15) {
        super.showAsDropDown(view, i13, i14, i15);
    }
}
