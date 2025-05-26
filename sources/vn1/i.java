package vn1;

import android.text.Layout;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import kotlin.collections.c0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class i extends LinkMovementMethod {

    /* renamed from: a, reason: collision with root package name */
    public gm1.a f126284a;

    /* renamed from: b, reason: collision with root package name */
    public final int f126285b;

    /* renamed from: c, reason: collision with root package name */
    public View.OnClickListener f126286c = null;

    public i(gm1.a aVar, int i13) {
        this.f126284a = aVar;
        this.f126285b = i13;
    }

    @Override // android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public final boolean onTouchEvent(TextView widget, Spannable buffer, MotionEvent event) {
        String str;
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
            if (uRLSpanArr == null || (uRLSpan = (URLSpan) c0.B(uRLSpanArr)) == null) {
                str = "";
            } else {
                str = uRLSpan.getURL();
                Intrinsics.checkNotNullExpressionValue(str, "getURL(...)");
            }
            gm1.a aVar = this.f126284a;
            if (aVar != null) {
                aVar.h3(new rn1.g(this.f126285b, str));
            }
            View.OnClickListener onClickListener = this.f126286c;
            if (onClickListener != null) {
                onClickListener.onClick(widget);
            }
        }
        return super.onTouchEvent(widget, buffer, event);
    }
}
