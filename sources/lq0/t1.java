package lq0;

import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class t1 extends LinkMovementMethod {

    /* renamed from: c, reason: collision with root package name */
    public static final xk2.v f84437c = xk2.m.b(j1.f84342k);

    /* renamed from: a, reason: collision with root package name */
    public final int f84438a = ViewConfiguration.getLongPressTimeout();

    /* renamed from: b, reason: collision with root package name */
    public long f84439b;

    @Override // android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public final boolean onTouchEvent(TextView widget, Spannable buffer, MotionEvent event) {
        Intrinsics.checkNotNullParameter(widget, "widget");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(event, "event");
        int action = event.getAction();
        if (action == 0) {
            this.f84439b = System.currentTimeMillis();
        }
        if (action != 1 || System.currentTimeMillis() - this.f84439b < this.f84438a) {
            return super.onTouchEvent(widget, buffer, event);
        }
        return true;
    }
}
