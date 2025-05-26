package com.pinterest.shuffles.composer.ui.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import b7.c;
import bk.i;
import bk.o;
import eu.m;
import h62.n;
import java.util.Iterator;
import java.util.List;
import kg.a;
import kg.t;
import kotlin.Metadata;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.x;
import org.chromium.net.y;
import org.jetbrains.annotations.NotNull;
import p62.b;
import rl2.u;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0003\b\t\nB\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/pinterest/shuffles/composer/ui/widget/ActionMenu;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "p62/a", "org/chromium/net/y", "p62/b", "shuffles-composer_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class ActionMenu extends LinearLayout {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ u[] f51881l = {k0.f80436a.e(new x(ActionMenu.class, "currentItem", "getCurrentItem()Landroid/view/View;", 0))};

    /* renamed from: a, reason: collision with root package name */
    public b f51882a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f51883b;

    /* renamed from: c, reason: collision with root package name */
    public int f51884c;

    /* renamed from: d, reason: collision with root package name */
    public int f51885d;

    /* renamed from: e, reason: collision with root package name */
    public int f51886e;

    /* renamed from: f, reason: collision with root package name */
    public final int f51887f;

    /* renamed from: g, reason: collision with root package name */
    public PopupWindow f51888g;

    /* renamed from: h, reason: collision with root package name */
    public final m f51889h;

    /* renamed from: i, reason: collision with root package name */
    public o f51890i;

    /* renamed from: j, reason: collision with root package name */
    public final i f51891j;

    /* renamed from: k, reason: collision with root package name */
    public List f51892k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActionMenu(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f51882a = new y();
        this.f51883b = true;
        this.f51887f = -1;
        this.f51889h = new m(2, null, this);
        o a13 = o.b(0, 0, context, attributeSet).a();
        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
        this.f51890i = a13;
        i iVar = new i(this.f51890i);
        this.f51891j = iVar;
        this.f51892k = q0.f80391a;
        setOrientation(1);
        setBackground(iVar);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        setPadding(a.g0(4, context2), getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    public final void a(int i13) {
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View findViewById = getChildAt(i14).findViewById(n.icon);
            if (findViewById != null) {
                ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                int i15 = i13 == 0 ? -2 : i13;
                layoutParams.width = i15;
                layoutParams.height = i15;
                findViewById.setLayoutParams(layoutParams);
            }
        }
    }

    public final void b(int i13) {
        ColorStateList colorStateList = new ColorStateList(new int[][]{new int[]{R.attr.state_selected}, new int[]{-16842913}}, new int[]{c.u(this, fj.c.colorPrimary), i13});
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            ImageView imageView = (ImageView) getChildAt(i14).findViewById(n.icon);
            if (imageView != null) {
                imageView.setImageTintList(colorStateList);
            }
        }
    }

    public final void c(int i13) {
        int childCount = getChildCount();
        int i14 = 0;
        while (i14 < childCount) {
            View childAt = getChildAt(i14);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = i14 == 0 ? 0 : i13;
            childAt.setLayoutParams(marginLayoutParams);
            i14++;
        }
    }

    public final View d() {
        return (View) this.f51889h.c(this, f51881l[0]);
    }

    public final void e(int i13, boolean z13) {
        Integer num;
        Object obj;
        ViewGroup viewGroup;
        Iterator it = this.f51892k.iterator();
        while (true) {
            num = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((p62.a) obj).f98924a == i13) {
                    break;
                }
            }
        }
        p62.a aVar = (p62.a) obj;
        if (aVar == null || (viewGroup = (ViewGroup) findViewById(i13)) == null) {
            return;
        }
        viewGroup.setSelected(z13);
        Integer valueOf = Integer.valueOf(aVar.f98927d);
        int intValue = valueOf.intValue();
        if (!z13 || intValue == 0) {
            valueOf = null;
        }
        viewGroup.setContentDescription(getContext().getString(valueOf != null ? valueOf.intValue() : aVar.f98925b));
        ImageView imageView = (ImageView) viewGroup.findViewById(n.icon);
        if (imageView != null) {
            Integer valueOf2 = Integer.valueOf(aVar.f98928e);
            int intValue2 = valueOf2.intValue();
            if (z13 && intValue2 != 0) {
                num = valueOf2;
            }
            imageView.setImageResource(num != null ? num.intValue() : aVar.f98926c);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        Object obj;
        Intrinsics.checkNotNullParameter(event, "event");
        int actionMasked = event.getActionMasked();
        m mVar = this.f51889h;
        u[] uVarArr = f51881l;
        if (actionMasked == 1) {
            View d2 = d();
            if (d2 != null) {
                this.f51882a.i(d2.getId());
            }
            mVar.d(this, uVarArr[0], null);
            int childCount = getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt = getChildAt(i13);
                childAt.setEnabled(true);
                childAt.setSelected(false);
            }
        } else if (actionMasked == 2) {
            PointF K = t.K(event);
            Point point = new Point((int) K.x, (int) K.y);
            Iterator it = d7.b.O(this).iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                View view = (View) obj;
                Intrinsics.checkNotNullParameter(view, "<this>");
                Intrinsics.checkNotNullParameter(point, "point");
                Rect rect = new Rect();
                view.getHitRect(rect);
                if (rect.contains(point.x, point.y)) {
                    break;
                }
            }
            View view2 = (View) obj;
            if (!Intrinsics.d(view2, d())) {
                mVar.d(this, uVarArr[0], view2);
                this.f51882a.d(view2 != null ? Integer.valueOf(view2.getId()) : null);
                int childCount2 = getChildCount();
                for (int i14 = 0; i14 < childCount2; i14++) {
                    View childAt2 = getChildAt(i14);
                    childAt2.setEnabled(Intrinsics.d(childAt2, d()) || d() == null);
                }
            }
        } else if (actionMasked == 3) {
            mVar.d(this, uVarArr[0], null);
            int childCount3 = getChildCount();
            for (int i15 = 0; i15 < childCount3; i15++) {
                View childAt3 = getChildAt(i15);
                childAt3.setEnabled(true);
                childAt3.setSelected(false);
            }
        }
        return super.onTouchEvent(event);
    }
}
