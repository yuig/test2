package androidx.appcompat.widget;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.appcompat.widget.SearchView;

/* loaded from: classes2.dex */
public final class u2 extends TouchDelegate {

    /* renamed from: a, reason: collision with root package name */
    public final View f16688a;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f16689b;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f16690c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f16691d;

    /* renamed from: e, reason: collision with root package name */
    public final int f16692e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f16693f;

    public u2(SearchView.SearchAutoComplete searchAutoComplete, Rect rect, Rect rect2) {
        super(rect, searchAutoComplete);
        int scaledTouchSlop = ViewConfiguration.get(searchAutoComplete.getContext()).getScaledTouchSlop();
        this.f16692e = scaledTouchSlop;
        Rect rect3 = new Rect();
        this.f16689b = rect3;
        Rect rect4 = new Rect();
        this.f16691d = rect4;
        Rect rect5 = new Rect();
        this.f16690c = rect5;
        rect3.set(rect);
        rect4.set(rect);
        int i13 = -scaledTouchSlop;
        rect4.inset(i13, i13);
        rect5.set(rect2);
        this.f16688a = searchAutoComplete;
    }

    @Override // android.view.TouchDelegate
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z13;
        boolean z14;
        int x13 = (int) motionEvent.getX();
        int y13 = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        boolean z15 = true;
        if (action != 0) {
            if (action == 1 || action == 2) {
                z14 = this.f16693f;
                if (z14 && !this.f16691d.contains(x13, y13)) {
                    z15 = z14;
                    z13 = false;
                }
            } else {
                if (action == 3) {
                    z14 = this.f16693f;
                    this.f16693f = false;
                }
                z13 = true;
                z15 = false;
            }
            z15 = z14;
            z13 = true;
        } else {
            if (this.f16689b.contains(x13, y13)) {
                this.f16693f = true;
                z13 = true;
            }
            z13 = true;
            z15 = false;
        }
        if (!z15) {
            return false;
        }
        Rect rect = this.f16690c;
        View view = this.f16688a;
        if (!z13 || rect.contains(x13, y13)) {
            motionEvent.setLocation(x13 - rect.left, y13 - rect.top);
        } else {
            motionEvent.setLocation(view.getWidth() / 2, view.getHeight() / 2);
        }
        return view.dispatchTouchEvent(motionEvent);
    }
}
