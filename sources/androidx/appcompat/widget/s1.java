package androidx.appcompat.widget;

import android.view.MotionEvent;
import android.view.View;
import android.widget.PopupWindow;

/* loaded from: classes2.dex */
public final class s1 implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ListPopupWindow f16683a;

    public s1(ListPopupWindow listPopupWindow) {
        this.f16683a = listPopupWindow;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        PopupWindow popupWindow;
        int action = motionEvent.getAction();
        int x13 = (int) motionEvent.getX();
        int y13 = (int) motionEvent.getY();
        ListPopupWindow listPopupWindow = this.f16683a;
        if (action == 0 && (popupWindow = listPopupWindow.f16397z) != null && popupWindow.isShowing() && x13 >= 0 && x13 < listPopupWindow.f16397z.getWidth() && y13 >= 0 && y13 < listPopupWindow.f16397z.getHeight()) {
            listPopupWindow.f16393v.postDelayed(listPopupWindow.f16389r, 250L);
            return false;
        }
        if (action != 1) {
            return false;
        }
        listPopupWindow.f16393v.removeCallbacks(listPopupWindow.f16389r);
        return false;
    }
}
