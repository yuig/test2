package t3;

import android.os.Build;
import android.view.View;
import android.view.contentcapture.ContentCaptureSession;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class r extends kotlin.jvm.internal.p implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f116176a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Object obj, int i13) {
        super(0, obj, d1.class, "getContentCaptureSessionCompat", "getContentCaptureSessionCompat(Landroid/view/View;)Landroidx/compose/ui/platform/coreshims/ContentCaptureSessionCompat;", 1);
        this.f116176a = i13;
        if (i13 == 1) {
            super(0, obj, c0.class, "onClearFocusForOwner", "onClearFocusForOwner()V", 0);
        } else if (i13 != 2) {
        } else {
            super(0, obj, c0.class, "onFetchFocusRect", "onFetchFocusRect()Landroidx/compose/ui/geometry/Rect;", 0);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ContentCaptureSession a13;
        switch (this.f116176a) {
            case 0:
                View view = (View) this.receiver;
                int i13 = Build.VERSION.SDK_INT;
                if (i13 >= 30) {
                    w3.h.a(view, 1);
                }
                if (i13 < 29 || (a13 = w3.g.a(view)) == null) {
                    return null;
                }
                return new w3.e(a13, view);
            case 1:
                c0 c0Var = (c0) this.receiver;
                if (c0Var.isFocused() || c0Var.hasFocus()) {
                    c0Var.clearFocus();
                }
                return Unit.f80348a;
            default:
                return ((c0) this.receiver).y();
        }
    }
}
