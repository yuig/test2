package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.annotation.NonNull;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public class ListPopupWindow implements n.e0 {
    public static final Method A;
    public static final Method B;

    /* renamed from: a, reason: collision with root package name */
    public final Context f16372a;

    /* renamed from: b, reason: collision with root package name */
    public ListAdapter f16373b;

    /* renamed from: c, reason: collision with root package name */
    public j1 f16374c;

    /* renamed from: d, reason: collision with root package name */
    public final int f16375d;

    /* renamed from: e, reason: collision with root package name */
    public int f16376e;

    /* renamed from: f, reason: collision with root package name */
    public int f16377f;

    /* renamed from: g, reason: collision with root package name */
    public int f16378g;

    /* renamed from: h, reason: collision with root package name */
    public final int f16379h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f16380i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f16381j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f16382k;

    /* renamed from: l, reason: collision with root package name */
    public int f16383l;

    /* renamed from: m, reason: collision with root package name */
    public final int f16384m;

    /* renamed from: n, reason: collision with root package name */
    public q1 f16385n;

    /* renamed from: o, reason: collision with root package name */
    public View f16386o;

    /* renamed from: p, reason: collision with root package name */
    public AdapterView.OnItemClickListener f16387p;

    /* renamed from: q, reason: collision with root package name */
    public AdapterView.OnItemSelectedListener f16388q;

    /* renamed from: r, reason: collision with root package name */
    public final m1 f16389r;

    /* renamed from: s, reason: collision with root package name */
    public final s1 f16390s;

    /* renamed from: t, reason: collision with root package name */
    public final r1 f16391t;

    /* renamed from: u, reason: collision with root package name */
    public final m1 f16392u;

    /* renamed from: v, reason: collision with root package name */
    public final Handler f16393v;

    /* renamed from: w, reason: collision with root package name */
    public final Rect f16394w;

    /* renamed from: x, reason: collision with root package name */
    public Rect f16395x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f16396y;

    /* renamed from: z, reason: collision with root package name */
    public final PopupWindow f16397z;

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                A = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                B = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public ListPopupWindow(Context context) {
        this(context, null, i.a.listPopupWindowStyle);
    }

    @Override // n.e0
    public final boolean a() {
        return this.f16397z.isShowing();
    }

    public final int b() {
        return this.f16377f;
    }

    public final void c(int i13) {
        this.f16377f = i13;
    }

    @Override // n.e0
    public final void dismiss() {
        PopupWindow popupWindow = this.f16397z;
        popupWindow.dismiss();
        popupWindow.setContentView(null);
        this.f16374c = null;
        this.f16393v.removeCallbacks(this.f16389r);
    }

    public final void f(int i13) {
        this.f16378g = i13;
        this.f16380i = true;
    }

    public final Drawable getBackground() {
        return this.f16397z.getBackground();
    }

    public final int i() {
        if (this.f16380i) {
            return this.f16378g;
        }
        return 0;
    }

    public void j(ListAdapter listAdapter) {
        q1 q1Var = this.f16385n;
        if (q1Var == null) {
            this.f16385n = new q1(this, 0);
        } else {
            ListAdapter listAdapter2 = this.f16373b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(q1Var);
            }
        }
        this.f16373b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f16385n);
        }
        j1 j1Var = this.f16374c;
        if (j1Var != null) {
            j1Var.setAdapter(this.f16373b);
        }
    }

    @Override // n.e0
    public final void k() {
        int i13;
        int paddingBottom;
        j1 j1Var;
        j1 j1Var2 = this.f16374c;
        PopupWindow popupWindow = this.f16397z;
        Context context = this.f16372a;
        if (j1Var2 == null) {
            j1 m13 = m(context, !this.f16396y);
            this.f16374c = m13;
            m13.setAdapter(this.f16373b);
            this.f16374c.setOnItemClickListener(this.f16387p);
            this.f16374c.setFocusable(true);
            this.f16374c.setFocusableInTouchMode(true);
            this.f16374c.setOnItemSelectedListener(new n1(this, 0));
            this.f16374c.setOnScrollListener(this.f16391t);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f16388q;
            if (onItemSelectedListener != null) {
                this.f16374c.setOnItemSelectedListener(onItemSelectedListener);
            }
            popupWindow.setContentView(this.f16374c);
        }
        Drawable background = popupWindow.getBackground();
        Rect rect = this.f16394w;
        if (background != null) {
            background.getPadding(rect);
            int i14 = rect.top;
            i13 = rect.bottom + i14;
            if (!this.f16380i) {
                this.f16378g = -i14;
            }
        } else {
            rect.setEmpty();
            i13 = 0;
        }
        int a13 = o1.a(popupWindow, this.f16386o, this.f16378g, popupWindow.getInputMethodMode() == 2);
        int i15 = this.f16375d;
        if (i15 == -1) {
            paddingBottom = a13 + i13;
        } else {
            int i16 = this.f16376e;
            int a14 = this.f16374c.a(i16 != -2 ? i16 != -1 ? View.MeasureSpec.makeMeasureSpec(i16, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE), a13);
            paddingBottom = a14 + (a14 > 0 ? this.f16374c.getPaddingBottom() + this.f16374c.getPaddingTop() + i13 : 0);
        }
        boolean z13 = this.f16397z.getInputMethodMode() == 2;
        popupWindow.setWindowLayoutType(this.f16379h);
        if (popupWindow.isShowing()) {
            if (this.f16386o.isAttachedToWindow()) {
                int i17 = this.f16376e;
                if (i17 == -1) {
                    i17 = -1;
                } else if (i17 == -2) {
                    i17 = this.f16386o.getWidth();
                }
                if (i15 == -1) {
                    i15 = z13 ? paddingBottom : -1;
                    if (z13) {
                        popupWindow.setWidth(this.f16376e == -1 ? -1 : 0);
                        popupWindow.setHeight(0);
                    } else {
                        popupWindow.setWidth(this.f16376e == -1 ? -1 : 0);
                        popupWindow.setHeight(-1);
                    }
                } else if (i15 == -2) {
                    i15 = paddingBottom;
                }
                popupWindow.setOutsideTouchable(true);
                View view = this.f16386o;
                int i18 = this.f16377f;
                int i19 = this.f16378g;
                if (i17 < 0) {
                    i17 = -1;
                }
                popupWindow.update(view, i18, i19, i17, i15 < 0 ? -1 : i15);
                return;
            }
            return;
        }
        int i23 = this.f16376e;
        if (i23 == -1) {
            i23 = -1;
        } else if (i23 == -2) {
            i23 = this.f16386o.getWidth();
        }
        if (i15 == -1) {
            i15 = -1;
        } else if (i15 == -2) {
            i15 = paddingBottom;
        }
        popupWindow.setWidth(i23);
        popupWindow.setHeight(i15);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = A;
            if (method != null) {
                try {
                    method.invoke(popupWindow, Boolean.TRUE);
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            p1.b(popupWindow, true);
        }
        popupWindow.setOutsideTouchable(true);
        popupWindow.setTouchInterceptor(this.f16390s);
        if (this.f16382k) {
            popupWindow.setOverlapAnchor(this.f16381j);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = B;
            if (method2 != null) {
                try {
                    method2.invoke(popupWindow, this.f16395x);
                } catch (Exception e13) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e13);
                }
            }
        } else {
            p1.a(popupWindow, this.f16395x);
        }
        popupWindow.showAsDropDown(this.f16386o, this.f16377f, this.f16378g, this.f16383l);
        this.f16374c.setSelection(-1);
        if ((!this.f16396y || this.f16374c.isInTouchMode()) && (j1Var = this.f16374c) != null) {
            j1Var.f16611h = true;
            j1Var.requestLayout();
        }
        if (this.f16396y) {
            return;
        }
        this.f16393v.post(this.f16392u);
    }

    @Override // n.e0
    public final ListView l() {
        return this.f16374c;
    }

    public j1 m(Context context, boolean z13) {
        return new j1(context, z13);
    }

    public final void n(int i13) {
        Drawable background = this.f16397z.getBackground();
        if (background == null) {
            this.f16376e = i13;
            return;
        }
        Rect rect = this.f16394w;
        background.getPadding(rect);
        this.f16376e = rect.left + rect.right + i13;
    }

    public final void setBackgroundDrawable(Drawable drawable) {
        this.f16397z.setBackgroundDrawable(drawable);
    }

    public ListPopupWindow(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, i.a.listPopupWindowStyle);
    }

    public ListPopupWindow(@NonNull Context context, AttributeSet attributeSet, int i13) {
        this(context, attributeSet, i13, 0);
    }

    public ListPopupWindow(Context context, AttributeSet attributeSet, int i13, int i14) {
        this.f16375d = -2;
        this.f16376e = -2;
        this.f16379h = 1002;
        this.f16383l = 0;
        this.f16384m = Integer.MAX_VALUE;
        this.f16389r = new m1(this, 2);
        this.f16390s = new s1(this);
        this.f16391t = new r1(this);
        this.f16392u = new m1(this, 1);
        this.f16394w = new Rect();
        this.f16372a = context;
        this.f16393v = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.j.ListPopupWindow, i13, i14);
        this.f16377f = obtainStyledAttributes.getDimensionPixelOffset(i.j.ListPopupWindow_android_dropDownHorizontalOffset, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(i.j.ListPopupWindow_android_dropDownVerticalOffset, 0);
        this.f16378g = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f16380i = true;
        }
        obtainStyledAttributes.recycle();
        AppCompatPopupWindow appCompatPopupWindow = new AppCompatPopupWindow(context, attributeSet, i13, i14);
        appCompatPopupWindow.a(context, attributeSet, i13, i14);
        this.f16397z = appCompatPopupWindow;
        appCompatPopupWindow.setInputMethodMode(1);
    }
}
