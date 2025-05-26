package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class c extends ViewGroup.MarginLayoutParams {

    /* renamed from: a, reason: collision with root package name */
    public CoordinatorLayout.Behavior f17900a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f17901b;

    /* renamed from: c, reason: collision with root package name */
    public int f17902c;

    /* renamed from: d, reason: collision with root package name */
    public int f17903d;

    /* renamed from: e, reason: collision with root package name */
    public final int f17904e;

    /* renamed from: f, reason: collision with root package name */
    public final int f17905f;

    /* renamed from: g, reason: collision with root package name */
    public final int f17906g;

    /* renamed from: h, reason: collision with root package name */
    public int f17907h;

    /* renamed from: i, reason: collision with root package name */
    public int f17908i;

    /* renamed from: j, reason: collision with root package name */
    public int f17909j;

    /* renamed from: k, reason: collision with root package name */
    public View f17910k;

    /* renamed from: l, reason: collision with root package name */
    public View f17911l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f17912m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f17913n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f17914o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f17915p;

    /* renamed from: q, reason: collision with root package name */
    public final Rect f17916q;

    public c(int i13, int i14) {
        super(i13, i14);
        this.f17901b = false;
        this.f17902c = 0;
        this.f17903d = 0;
        this.f17904e = -1;
        this.f17905f = -1;
        this.f17906g = 0;
        this.f17907h = 0;
        this.f17916q = new Rect();
    }

    public final boolean a() {
        return this.f17915p;
    }

    public final boolean b(int i13) {
        if (i13 == 0) {
            return this.f17913n;
        }
        if (i13 != 1) {
            return false;
        }
        return this.f17914o;
    }

    public final void c() {
        this.f17915p = false;
    }

    public final void d(CoordinatorLayout.Behavior behavior) {
        CoordinatorLayout.Behavior behavior2 = this.f17900a;
        if (behavior2 != behavior) {
            if (behavior2 != null) {
                behavior2.j();
            }
            this.f17900a = behavior;
            this.f17901b = true;
            if (behavior != null) {
                behavior.g(this);
            }
        }
    }

    public final void e(boolean z13) {
        this.f17915p = z13;
    }

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        CoordinatorLayout.Behavior behavior;
        this.f17901b = false;
        this.f17902c = 0;
        this.f17903d = 0;
        this.f17904e = -1;
        this.f17905f = -1;
        this.f17906g = 0;
        this.f17907h = 0;
        this.f17916q = new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z4.c.CoordinatorLayout_Layout);
        this.f17902c = obtainStyledAttributes.getInteger(z4.c.CoordinatorLayout_Layout_android_layout_gravity, 0);
        this.f17905f = obtainStyledAttributes.getResourceId(z4.c.CoordinatorLayout_Layout_layout_anchor, -1);
        this.f17903d = obtainStyledAttributes.getInteger(z4.c.CoordinatorLayout_Layout_layout_anchorGravity, 0);
        this.f17904e = obtainStyledAttributes.getInteger(z4.c.CoordinatorLayout_Layout_layout_keyline, -1);
        this.f17906g = obtainStyledAttributes.getInt(z4.c.CoordinatorLayout_Layout_layout_insetEdge, 0);
        this.f17907h = obtainStyledAttributes.getInt(z4.c.CoordinatorLayout_Layout_layout_dodgeInsetEdges, 0);
        boolean hasValue = obtainStyledAttributes.hasValue(z4.c.CoordinatorLayout_Layout_layout_behavior);
        this.f17901b = hasValue;
        if (hasValue) {
            String string = obtainStyledAttributes.getString(z4.c.CoordinatorLayout_Layout_layout_behavior);
            String str = CoordinatorLayout.f17876s;
            if (TextUtils.isEmpty(string)) {
                behavior = null;
            } else {
                if (string.startsWith(".")) {
                    string = context.getPackageName() + string;
                } else if (string.indexOf(46) < 0) {
                    String str2 = CoordinatorLayout.f17876s;
                    if (!TextUtils.isEmpty(str2)) {
                        string = str2 + '.' + string;
                    }
                }
                try {
                    ThreadLocal threadLocal = CoordinatorLayout.f17878u;
                    Map map = (Map) threadLocal.get();
                    if (map == null) {
                        map = new HashMap();
                        threadLocal.set(map);
                    }
                    Constructor<?> constructor = (Constructor) map.get(string);
                    if (constructor == null) {
                        constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.f17877t);
                        constructor.setAccessible(true);
                        map.put(string, constructor);
                    }
                    behavior = (CoordinatorLayout.Behavior) constructor.newInstance(context, attributeSet);
                } catch (Exception e13) {
                    throw new RuntimeException(a.a.j("Could not inflate Behavior subclass ", string), e13);
                }
            }
            this.f17900a = behavior;
        }
        obtainStyledAttributes.recycle();
        CoordinatorLayout.Behavior behavior2 = this.f17900a;
        if (behavior2 != null) {
            behavior2.g(this);
        }
    }

    public c(c cVar) {
        super((ViewGroup.MarginLayoutParams) cVar);
        this.f17901b = false;
        this.f17902c = 0;
        this.f17903d = 0;
        this.f17904e = -1;
        this.f17905f = -1;
        this.f17906g = 0;
        this.f17907h = 0;
        this.f17916q = new Rect();
    }

    public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f17901b = false;
        this.f17902c = 0;
        this.f17903d = 0;
        this.f17904e = -1;
        this.f17905f = -1;
        this.f17906g = 0;
        this.f17907h = 0;
        this.f17916q = new Rect();
    }

    public c(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f17901b = false;
        this.f17902c = 0;
        this.f17903d = 0;
        this.f17904e = -1;
        this.f17905f = -1;
        this.f17906g = 0;
        this.f17907h = 0;
        this.f17916q = new Rect();
    }
}
