package ym1;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class r implements View.OnLayoutChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f139450a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PopupWindow f139451b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function0 f139452c;

    public /* synthetic */ r(ViewGroup viewGroup, PopupWindow popupWindow, Function0 function0) {
        this.f139450a = viewGroup;
        this.f139451b = popupWindow;
        this.f139452c = function0;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i23) {
        View rootView;
        PopupWindow popupWindow = this.f139451b;
        Intrinsics.checkNotNullParameter(popupWindow, "$popupWindow");
        Function0 onBoundsHit = this.f139452c;
        Intrinsics.checkNotNullParameter(onBoundsHit, "$onBoundsHit");
        int[] iArr = new int[2];
        ViewGroup viewGroup = this.f139450a;
        if (viewGroup != null) {
            viewGroup.getLocationOnScreen(iArr);
        }
        int i24 = iArr[1];
        int[] iArr2 = new int[2];
        if (view != null && (rootView = view.getRootView()) != null) {
            rootView.getLocationOnScreen(iArr2);
        }
        boolean z13 = iArr2[1] - i24 <= 0;
        Rect rect = new Rect();
        if (viewGroup != null) {
            viewGroup.getGlobalVisibleRect(rect);
        }
        boolean z14 = rect.bottom - (popupWindow.getContentView().getHeight() + iArr2[1]) <= 0;
        if (z13 || z14) {
            onBoundsHit.invoke();
        }
    }
}
