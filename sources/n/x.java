package n;

import android.widget.PopupWindow;

/* loaded from: classes2.dex */
public final class x implements PopupWindow.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y f88712a;

    public x(y yVar) {
        this.f88712a = yVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f88712a.c();
    }
}
