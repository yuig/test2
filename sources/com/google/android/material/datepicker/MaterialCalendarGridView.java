package com.google.android.material.datepicker;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import java.util.Calendar;
import java.util.Iterator;
import q5.v0;

/* loaded from: classes3.dex */
final class MaterialCalendarGridView extends GridView {

    /* renamed from: a, reason: collision with root package name */
    public final Calendar f32484a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f32485b;

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final z a() {
        return (z) super.getAdapter();
    }

    public final View b(int i13) {
        return getChildAt(i13 - getFirstVisiblePosition());
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final ListAdapter getAdapter() {
        return (z) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((z) super.getAdapter()).notifyDataSetChanged();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int a13;
        int width;
        int a14;
        int width2;
        int i13;
        int i14;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        z zVar = (z) super.getAdapter();
        DateSelector dateSelector = zVar.f32597b;
        android.support.v4.media.a aVar = zVar.f32599d;
        int max = Math.max(zVar.a(), getFirstVisiblePosition());
        int min = Math.min(zVar.c(), getLastVisiblePosition());
        Long item = zVar.getItem(max);
        Long item2 = zVar.getItem(min);
        Iterator it = dateSelector.h1().iterator();
        while (it.hasNext()) {
            p5.b bVar = (p5.b) it.next();
            Object obj = bVar.f98855a;
            if (obj != null) {
                Object obj2 = bVar.f98856b;
                if (obj2 != null) {
                    Long l13 = (Long) obj;
                    long longValue = l13.longValue();
                    Long l14 = (Long) obj2;
                    long longValue2 = l14.longValue();
                    if (item == null || item2 == null || l13.longValue() > item2.longValue() || l14.longValue() < item.longValue()) {
                        materialCalendarGridView = this;
                        max = max;
                        zVar = zVar;
                        it = it;
                    } else {
                        boolean H0 = lb.l0.H0(this);
                        long longValue3 = item.longValue();
                        Calendar calendar = materialCalendarGridView.f32484a;
                        Month month = zVar.f32596a;
                        if (longValue < longValue3) {
                            width = max % month.f32489d == 0 ? 0 : !H0 ? materialCalendarGridView.b(max - 1).getRight() : materialCalendarGridView.b(max - 1).getLeft();
                            a13 = max;
                        } else {
                            calendar.setTimeInMillis(longValue);
                            a13 = zVar.a() + (calendar.get(5) - 1);
                            View b13 = materialCalendarGridView.b(a13);
                            width = (b13.getWidth() / 2) + b13.getLeft();
                        }
                        if (longValue2 > item2.longValue()) {
                            width2 = (min + 1) % month.f32489d == 0 ? getWidth() : !H0 ? materialCalendarGridView.b(min).getRight() : materialCalendarGridView.b(min).getLeft();
                            a14 = min;
                        } else {
                            calendar.setTimeInMillis(longValue2);
                            a14 = zVar.a() + (calendar.get(5) - 1);
                            View b14 = materialCalendarGridView.b(a14);
                            width2 = (b14.getWidth() / 2) + b14.getLeft();
                        }
                        int itemId = (int) zVar.getItemId(a13);
                        int itemId2 = (int) zVar.getItemId(a14);
                        while (itemId <= itemId2) {
                            int numColumns = getNumColumns() * itemId;
                            z zVar2 = zVar;
                            int numColumns2 = (getNumColumns() + numColumns) - 1;
                            View b15 = materialCalendarGridView.b(numColumns);
                            int top = ((Rect) ((a0.a) aVar.f15837a).f203b).top + b15.getTop();
                            Iterator it2 = it;
                            int bottom = b15.getBottom() - ((Rect) ((a0.a) aVar.f15837a).f203b).bottom;
                            if (H0) {
                                int i15 = a14 > numColumns2 ? 0 : width2;
                                int width3 = numColumns > a13 ? getWidth() : width;
                                i13 = i15;
                                i14 = width3;
                            } else {
                                i13 = numColumns > a13 ? 0 : width;
                                i14 = a14 > numColumns2 ? getWidth() : width2;
                            }
                            canvas.drawRect(i13, top, i14, bottom, (Paint) aVar.f15844h);
                            itemId++;
                            materialCalendarGridView = this;
                            max = max;
                            zVar = zVar2;
                            it = it2;
                        }
                    }
                }
            }
            materialCalendarGridView = this;
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onFocusChanged(boolean z13, int i13, Rect rect) {
        if (!z13) {
            super.onFocusChanged(false, i13, rect);
            return;
        }
        if (i13 == 33) {
            setSelection(((z) super.getAdapter()).c());
        } else if (i13 == 130) {
            setSelection(((z) super.getAdapter()).a());
        } else {
            super.onFocusChanged(true, i13, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i13, KeyEvent keyEvent) {
        if (!super.onKeyDown(i13, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= ((z) super.getAdapter()).a()) {
            return true;
        }
        if (19 != i13) {
            return false;
        }
        setSelection(((z) super.getAdapter()).a());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i13, int i14) {
        if (!this.f32485b) {
            super.onMeasure(i13, i14);
            return;
        }
        super.onMeasure(i13, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
        getLayoutParams().height = getMeasuredHeight();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final void setSelection(int i13) {
        if (i13 < ((z) super.getAdapter()).a()) {
            super.setSelection(((z) super.getAdapter()).a());
        } else {
            super.setSelection(i13);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        this.f32484a = i0.g(null);
        if (w.W6(getContext(), R.attr.windowFullscreen)) {
            setNextFocusLeftId(fj.g.cancel_button);
            setNextFocusRightId(fj.g.confirm_button);
        }
        this.f32485b = w.W6(getContext(), fj.c.nestedScrollable);
        v0.o(this, new l(this, 3));
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    /* renamed from: getAdapter, reason: avoid collision after fix types in other method */
    public final ListAdapter getAdapter2() {
        return (z) super.getAdapter();
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof z)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), z.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }
}
