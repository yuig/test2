package androidx.recyclerview.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;

/* loaded from: classes3.dex */
public class b0 extends h2 {

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f19327d = {R.attr.listDivider};

    /* renamed from: a, reason: collision with root package name */
    public Drawable f19328a;

    /* renamed from: b, reason: collision with root package name */
    public final int f19329b;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f19330c = new Rect();

    public b0(Context context, int i13) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f19327d);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        this.f19328a = drawable;
        if (drawable == null) {
            Log.w("DividerItem", "@android:attr/listDivider was not set in the theme used for this DividerItemDecoration. Please set that attribute all call setDrawable()");
        }
        obtainStyledAttributes.recycle();
        if (i13 != 0 && i13 != 1) {
            throw new IllegalArgumentException("Invalid orientation. It should be either HORIZONTAL or VERTICAL");
        }
        this.f19329b = i13;
    }

    @Override // androidx.recyclerview.widget.h2
    public final void f(Rect rect, View view, RecyclerView recyclerView, w2 w2Var) {
        Drawable drawable = this.f19328a;
        if (drawable == null) {
            rect.set(0, 0, 0, 0);
        } else if (this.f19329b == 1) {
            rect.set(0, 0, 0, drawable.getIntrinsicHeight());
        } else {
            rect.set(0, 0, drawable.getIntrinsicWidth(), 0);
        }
    }

    @Override // androidx.recyclerview.widget.h2
    public void g(Canvas canvas, RecyclerView recyclerView, w2 w2Var) {
        int height;
        int i13;
        int width;
        int i14;
        if (recyclerView.f19242n == null || this.f19328a == null) {
            return;
        }
        int i15 = this.f19329b;
        Rect rect = this.f19330c;
        int i16 = 0;
        if (i15 == 1) {
            canvas.save();
            if (recyclerView.f19230h) {
                i14 = recyclerView.getPaddingLeft();
                width = recyclerView.getWidth() - recyclerView.getPaddingRight();
                canvas.clipRect(i14, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
            } else {
                width = recyclerView.getWidth();
                i14 = 0;
            }
            int childCount = recyclerView.getChildCount();
            while (i16 < childCount) {
                View childAt = recyclerView.getChildAt(i16);
                RecyclerView.y1(rect, childAt);
                int round = Math.round(childAt.getTranslationY()) + rect.bottom;
                this.f19328a.setBounds(i14, round - this.f19328a.getIntrinsicHeight(), width, round);
                this.f19328a.draw(canvas);
                i16++;
            }
            canvas.restore();
            return;
        }
        canvas.save();
        if (recyclerView.f19230h) {
            i13 = recyclerView.getPaddingTop();
            height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
            canvas.clipRect(recyclerView.getPaddingLeft(), i13, recyclerView.getWidth() - recyclerView.getPaddingRight(), height);
        } else {
            height = recyclerView.getHeight();
            i13 = 0;
        }
        int childCount2 = recyclerView.getChildCount();
        while (i16 < childCount2) {
            View childAt2 = recyclerView.getChildAt(i16);
            recyclerView.f19242n.J(rect, childAt2);
            int round2 = Math.round(childAt2.getTranslationX()) + rect.right;
            this.f19328a.setBounds(round2 - this.f19328a.getIntrinsicWidth(), i13, round2, height);
            this.f19328a.draw(canvas);
            i16++;
        }
        canvas.restore();
    }

    public final void i(Drawable drawable) {
        if (drawable == null) {
            throw new IllegalArgumentException("Drawable cannot be null.");
        }
        this.f19328a = drawable;
    }
}
