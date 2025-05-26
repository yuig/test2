package com.pinterest.feature.pincarouselads.view;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.pinterest.ui.menu.ContextMenuItemView;
import com.pinterest.ui.menu.ContextMenuView;
import h32.f1;
import h32.g0;
import h32.u0;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;

/* loaded from: classes2.dex */
public final /* synthetic */ class x implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47430a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f47431b;

    public /* synthetic */ x(ViewGroup viewGroup, int i13) {
        this.f47430a = i13;
        this.f47431b = viewGroup;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i13 = this.f47430a;
        ViewGroup viewGroup = this.f47431b;
        switch (i13) {
            case 0:
                SingleColumnCarouselPinView this$0 = (SingleColumnCarouselPinView) viewGroup;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                return this$0.getInternalCell().asView().dispatchTouchEvent(motionEvent);
            default:
                ContextMenuView this$02 = (ContextMenuView) viewGroup;
                int i14 = ContextMenuView.f52599w;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 0) {
                    this$02.f52614l = motionEvent.getX();
                    this$02.f52615m = motionEvent.getY();
                    if (this$02.f52616n) {
                        this$02.g();
                    }
                } else if (actionMasked != 1) {
                    if (actionMasked == 2 && this$02.f52624v) {
                        this$02.k((int) motionEvent.getX(), (int) motionEvent.getY());
                    }
                } else if (this$02.f52616n) {
                    ContextMenuItemView k13 = this$02.k((int) motionEvent.getX(), (int) motionEvent.getY());
                    if (k13 != null) {
                        d0 e13 = this$02.e();
                        if (e13 != null) {
                            e13.h0(f1.DRAG, u0.PIN_SOURCE_IMAGE, g0.CONTEXTUAL_MENU, this$02.f52618p, this$02.f52621s, null, null, false);
                        }
                        k13.performClick();
                    }
                    this$02.g();
                    return true;
                }
                return false;
        }
    }
}
