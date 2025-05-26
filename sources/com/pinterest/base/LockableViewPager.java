package com.pinterest.base;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xa.a;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/pinterest/base/LockableViewPager;", "Landroidx/viewpager/widget/ViewPager;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "common_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public class LockableViewPager extends ViewPager {

    /* renamed from: a0, reason: collision with root package name */
    public boolean f44544a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LockableViewPager(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.f44544a0 = true;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public final boolean canScrollHorizontally(int i13) {
        return this.f44544a0 && super.canScrollHorizontally(i13);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i13) {
        return this.f44544a0 && super.canScrollVertically(i13);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public final boolean d(int i13, int i14, int i15, View view, boolean z13) {
        if (!(view instanceof ViewPager2) || ((ViewPager2) view).f19937q) {
            return super.d(i13, i14, i15, view, z13);
        }
        return false;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent ev2) {
        Intrinsics.checkNotNullParameter(ev2, "ev");
        a aVar = this.f19892e;
        if (aVar != null && aVar.b() == 0) {
            return false;
        }
        try {
            if (this.f44544a0) {
                return super.onInterceptTouchEvent(ev2);
            }
            return false;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i13) {
        super.onRtlPropertiesChanged(i13);
        if (i13 == 1) {
            setRotationY(180.0f);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public final boolean onTouchEvent(MotionEvent ev2) {
        Intrinsics.checkNotNullParameter(ev2, "ev");
        try {
            if (this.f44544a0) {
                return super.onTouchEvent(ev2);
            }
            return false;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        if (getLayoutDirection() == 1 && view != null) {
            view.setRotationY(180.0f);
        }
        super.onViewAdded(view);
    }
}
