package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\nB%\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Landroidx/fragment/app/FragmentContainerView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ig1/b", "fragment_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class FragmentContainerView extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f18234a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f18235b;

    /* renamed from: c, reason: collision with root package name */
    public View.OnApplyWindowInsetsListener f18236c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f18237d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f18234a = new ArrayList();
        this.f18235b = new ArrayList();
        this.f18237d = true;
    }

    public final void a(View view) {
        if (this.f18235b.contains(view)) {
            this.f18234a.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View child, int i13, ViewGroup.LayoutParams layoutParams) {
        Intrinsics.checkNotNullParameter(child, "child");
        Object tag = child.getTag(l6.b.fragment_container_view_tag);
        if ((tag instanceof Fragment ? (Fragment) tag : null) != null) {
            super.addView(child, i13, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + child + " is not associated with a Fragment.").toString());
    }

    public final void b(boolean z13) {
        this.f18237d = z13;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        q5.a2 i13 = q5.a2.i(null, insets);
        Intrinsics.checkNotNullExpressionValue(i13, "toWindowInsetsCompat(insets)");
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f18236c;
        q5.a2 i14 = onApplyWindowInsetsListener != null ? q5.a2.i(null, ig1.b.Q0(onApplyWindowInsetsListener, this, insets)) : q5.v0.j(this, i13);
        Intrinsics.checkNotNullExpressionValue(i14, "if (applyWindowInsetsLis…, insetsCompat)\n        }");
        if (!i14.f102400a.m()) {
            int childCount = getChildCount();
            for (int i15 = 0; i15 < childCount; i15++) {
                q5.v0.c(getChildAt(i15), i14);
            }
        }
        return insets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (this.f18237d) {
            Iterator it = this.f18234a.iterator();
            while (it.hasNext()) {
                super.drawChild(canvas, (View) it.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View child, long j13) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(child, "child");
        if (this.f18237d) {
            ArrayList arrayList = this.f18234a;
            if ((!arrayList.isEmpty()) && arrayList.contains(child)) {
                return false;
            }
        }
        return super.drawChild(canvas, child, j13);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f18235b.remove(view);
        if (this.f18234a.remove(view)) {
            this.f18237d = true;
        }
        super.endViewTransition(view);
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        return insets;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                super.removeAllViewsInLayout();
                return;
            } else {
                View view = getChildAt(childCount);
                Intrinsics.checkNotNullExpressionValue(view, "view");
                a(view);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i13) {
        View view = getChildAt(i13);
        Intrinsics.checkNotNullExpressionValue(view, "view");
        a(view);
        super.removeViewAt(i13);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i13, int i14) {
        int i15 = i13 + i14;
        for (int i16 = i13; i16 < i15; i16++) {
            View view = getChildAt(i16);
            Intrinsics.checkNotNullExpressionValue(view, "view");
            a(view);
        }
        super.removeViews(i13, i14);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i13, int i14) {
        int i15 = i13 + i14;
        for (int i16 = i13; i16 < i15; i16++) {
            View view = getChildAt(i16);
            Intrinsics.checkNotNullExpressionValue(view, "view");
            a(view);
        }
        super.removeViewsInLayout(i13, i14);
    }

    @Override // android.view.ViewGroup
    public final void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public final void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f18236c = listener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (view.getParent() == this) {
            this.f18235b.add(view);
        }
        super.startViewTransition(view);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        String str;
        Intrinsics.checkNotNullParameter(context, "context");
        this.f18234a = new ArrayList();
        this.f18235b = new ArrayList();
        this.f18237d = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            int[] FragmentContainerView = l6.c.FragmentContainerView;
            Intrinsics.checkNotNullExpressionValue(FragmentContainerView, "FragmentContainerView");
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, FragmentContainerView, 0, 0);
            if (classAttribute == null) {
                classAttribute = obtainStyledAttributes.getString(l6.c.FragmentContainerView_android_name);
                str = "android:name";
            } else {
                str = "class";
            }
            obtainStyledAttributes.recycle();
            if (classAttribute == null || isInEditMode()) {
                return;
            }
            throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + '\"');
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attrs, w0 fm3) {
        super(context, attrs);
        View view;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        Intrinsics.checkNotNullParameter(fm3, "fm");
        this.f18234a = new ArrayList();
        this.f18235b = new ArrayList();
        this.f18237d = true;
        String classAttribute = attrs.getClassAttribute();
        int[] FragmentContainerView = l6.c.FragmentContainerView;
        Intrinsics.checkNotNullExpressionValue(FragmentContainerView, "FragmentContainerView");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, FragmentContainerView, 0, 0);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(l6.c.FragmentContainerView_android_name) : classAttribute;
        String string = obtainStyledAttributes.getString(l6.c.FragmentContainerView_android_tag);
        obtainStyledAttributes.recycle();
        int id3 = getId();
        Fragment E = fm3.E(id3);
        if (classAttribute != null && E == null) {
            if (id3 == -1) {
                throw new IllegalStateException(a.a.k("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : ""));
            }
            Fragment a13 = fm3.J().a(context.getClassLoader(), classAttribute);
            Intrinsics.checkNotNullExpressionValue(a13, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            a13.mFragmentId = id3;
            a13.mContainerId = id3;
            a13.mTag = string;
            a13.mFragmentManager = fm3;
            a13.mHost = fm3.f18470v;
            a13.onInflate(context, attrs, (Bundle) null);
            a aVar = new a(fm3);
            aVar.f18281p = true;
            a13.mContainer = this;
            aVar.g(getId(), a13, string, 1);
            if (!aVar.f18272g) {
                aVar.f18273h = false;
                aVar.f18282q.B(aVar, true);
            } else {
                throw new IllegalStateException("This transaction is already being added to the back stack");
            }
        }
        Iterator it = fm3.f18451c.d().iterator();
        while (it.hasNext()) {
            d1 d1Var = (d1) it.next();
            Fragment fragment = d1Var.f18305c;
            if (fragment.mContainerId == getId() && (view = fragment.mView) != null && view.getParent() == null) {
                fragment.mContainer = this;
                d1Var.b();
            }
        }
    }
}
