package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes2.dex */
public class j1 extends ListView {

    /* renamed from: a, reason: collision with root package name */
    public final Rect f16604a;

    /* renamed from: b, reason: collision with root package name */
    public int f16605b;

    /* renamed from: c, reason: collision with root package name */
    public int f16606c;

    /* renamed from: d, reason: collision with root package name */
    public int f16607d;

    /* renamed from: e, reason: collision with root package name */
    public int f16608e;

    /* renamed from: f, reason: collision with root package name */
    public int f16609f;

    /* renamed from: g, reason: collision with root package name */
    public g1 f16610g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f16611h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f16612i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f16613j;

    /* renamed from: k, reason: collision with root package name */
    public androidx.core.widget.f f16614k;

    /* renamed from: l, reason: collision with root package name */
    public i1 f16615l;

    public j1(Context context, boolean z13) {
        super(context, null, i.a.dropDownListViewStyle);
        this.f16604a = new Rect();
        this.f16605b = 0;
        this.f16606c = 0;
        this.f16607d = 0;
        this.f16608e = 0;
        this.f16612i = z13;
        setCacheColorHint(0);
    }

    public final int a(int i13, int i14) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i15 = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i16 = 0;
        View view = null;
        for (int i17 = 0; i17 < count; i17++) {
            int itemViewType = adapter.getItemViewType(i17);
            if (itemViewType != i16) {
                view = null;
                i16 = itemViewType;
            }
            view = adapter.getView(i17, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i18 = layoutParams.height;
            view.measure(i13, i18 > 0 ? View.MeasureSpec.makeMeasureSpec(i18, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i17 > 0) {
                i15 += dividerHeight;
            }
            i15 += view.getMeasuredHeight();
            if (i15 >= i14) {
                return i14;
            }
        }
        return i15;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0148 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(android.view.MotionEvent r17, int r18) {
        /*
            Method dump skipped, instructions count: 393
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.j1.b(android.view.MotionEvent, int):boolean");
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f16604a;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.f16615l != null) {
            return;
        }
        super.drawableStateChanged();
        g1 g1Var = this.f16610g;
        if (g1Var != null) {
            g1Var.f16568b = true;
        }
        Drawable selector = getSelector();
        if (selector != null && this.f16613j && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.f16612i || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.f16612i || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.f16612i || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.f16612i && this.f16611h) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f16615l = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i13 = Build.VERSION.SDK_INT;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f16615l == null) {
            i1 i1Var = new i1(this, 0);
            this.f16615l = i1Var;
            post(i1Var);
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (pointToPosition != -1 && pointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    requestFocus();
                    if (i13 < 30 || !e1.f16550d) {
                        setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                    } else {
                        try {
                            e1.f16547a.invoke(this, Integer.valueOf(pointToPosition), childAt, Boolean.FALSE, -1, -1);
                            e1.f16548b.invoke(this, Integer.valueOf(pointToPosition));
                            e1.f16549c.invoke(this, Integer.valueOf(pointToPosition));
                        } catch (IllegalAccessException e13) {
                            e13.printStackTrace();
                        } catch (InvocationTargetException e14) {
                            e14.printStackTrace();
                        }
                    }
                }
                Drawable selector = getSelector();
                if (selector != null && this.f16613j && isPressed()) {
                    selector.setState(getDrawableState());
                }
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f16609f = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        i1 i1Var = this.f16615l;
        if (i1Var != null) {
            j1 j1Var = (j1) i1Var.f16598b;
            j1Var.f16615l = null;
            j1Var.removeCallbacks(i1Var);
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.AbsListView
    public final void setSelector(Drawable drawable) {
        g1 g1Var;
        if (drawable != null) {
            g1Var = new g1(drawable);
            g1Var.f16568b = true;
        } else {
            g1Var = null;
        }
        this.f16610g = g1Var;
        super.setSelector(g1Var);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f16605b = rect.left;
        this.f16606c = rect.top;
        this.f16607d = rect.right;
        this.f16608e = rect.bottom;
    }
}
