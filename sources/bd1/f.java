package bd1;

import android.text.Layout;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.view.MotionEvent;
import android.widget.TextView;
import kotlin.collections.c0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f extends LinkMovementMethod {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function1 f22723a;

    public f(Function1 function1) {
        this.f22723a = function1;
    }

    @Override // android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final boolean onTouchEvent(TextView widget, Spannable buffer, MotionEvent event) {
        URLSpan uRLSpan;
        Intrinsics.checkNotNullParameter(widget, "widget");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getAction() == 1) {
            float x13 = event.getX();
            float y13 = (event.getY() - widget.getTotalPaddingTop()) + widget.getScrollY();
            Layout layout = widget.getLayout();
            Intrinsics.checkNotNullExpressionValue(layout, "getLayout(...)");
            int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical((int) y13), (x13 - widget.getTotalPaddingLeft()) + widget.getScrollX());
            Object[] spans = buffer.getSpans(offsetForHorizontal, offsetForHorizontal, URLSpan.class);
            if (!(true ^ (((URLSpan[]) spans).length == 0))) {
                spans = null;
            }
            URLSpan[] uRLSpanArr = (URLSpan[]) spans;
            if (uRLSpanArr != null && (uRLSpan = (URLSpan) c0.B(uRLSpanArr)) != null) {
                String url = uRLSpan.getURL();
                Intrinsics.checkNotNullExpressionValue(url, "getURL(...)");
                Intrinsics.checkNotNullParameter(url, "url");
                Function1 function1 = this.f22723a;
                if (function1 != null) {
                    function1.invoke(url);
                }
            }
        }
        return super.onTouchEvent(widget, buffer, event);
    }
}
