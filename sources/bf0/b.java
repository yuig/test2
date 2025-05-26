package bf0;

import android.graphics.Rect;
import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;
import xk2.m;
import xk2.v;

/* loaded from: classes5.dex */
public final class b extends LinkMovementMethod {

    /* renamed from: a, reason: collision with root package name */
    public static final v f22742a = m.b(a.f22741i);

    @Override // android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public final boolean onTouchEvent(TextView widget, Spannable buffer, MotionEvent event) {
        ViewGroup viewGroup;
        Intrinsics.checkNotNullParameter(widget, "widget");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(event, "event");
        int action = event.getAction();
        if (action == 0 || action == 1) {
            int x13 = (int) event.getX();
            int y13 = (int) event.getY();
            int totalPaddingLeft = x13 - widget.getTotalPaddingLeft();
            int totalPaddingTop = y13 - widget.getTotalPaddingTop();
            int scrollX = widget.getScrollX() + totalPaddingLeft;
            int scrollY = widget.getScrollY() + totalPaddingTop;
            Layout layout = widget.getLayout();
            int lineForVertical = layout.getLineForVertical(scrollY);
            int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, scrollX);
            Rect rect = new Rect();
            layout.getLineBounds(lineForVertical, rect);
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) buffer.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
            Intrinsics.f(clickableSpanArr);
            if ((!(clickableSpanArr.length == 0)) && rect.contains(scrollX, scrollY)) {
                if (action == 0) {
                    Selection.setSelection(buffer, buffer.getSpanStart(clickableSpanArr[0]), buffer.getSpanEnd(clickableSpanArr[0]));
                } else if (action == 1) {
                    clickableSpanArr[0].onClick(widget);
                }
                return true;
            }
            Selection.removeSelection(buffer);
        }
        ViewParent parent = widget.getParent();
        Intrinsics.g(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        while (true) {
            viewGroup = (ViewGroup) parent;
            if (!(viewGroup.getParent() instanceof ViewGroup) || (viewGroup.getTag() != null && Intrinsics.d(viewGroup.getTag(), "ROOT_TAG"))) {
                break;
            }
            parent = viewGroup.getParent();
            Intrinsics.g(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        }
        return viewGroup.onTouchEvent(event);
    }
}
