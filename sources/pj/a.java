package pj;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* loaded from: classes3.dex */
public final class a implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final Dialog f100210a;

    /* renamed from: b, reason: collision with root package name */
    public final int f100211b;

    /* renamed from: c, reason: collision with root package name */
    public final int f100212c;

    /* renamed from: d, reason: collision with root package name */
    public final int f100213d;

    public a(Dialog dialog, Rect rect) {
        this.f100210a = dialog;
        this.f100211b = rect.left;
        this.f100212c = rect.top;
        this.f100213d = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View findViewById = view.findViewById(R.id.content);
        int left = findViewById.getLeft() + this.f100211b;
        int width = findViewById.getWidth() + left;
        if (new RectF(left, findViewById.getTop() + this.f100212c, width, findViewById.getHeight() + r4).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            int i13 = this.f100213d;
            obtain.setLocation((-i13) - 1, (-i13) - 1);
        }
        view.performClick();
        return this.f100210a.onTouchEvent(obtain);
    }
}
