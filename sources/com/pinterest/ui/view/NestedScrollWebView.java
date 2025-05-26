package com.pinterest.ui.view;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import com.pinterest.feature.browser.view.InAppBrowserView;
import com.pinterest.feature.closeup.view.LegoFloatingBottomActionBar;
import e3.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.f0;
import org.jetbrains.annotations.NotNull;
import q5.r;
import to0.w;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB!\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/pinterest/ui/view/NestedScrollWebView;", "Landroid/webkit/WebView;", "Lq5/r;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "inAppBrowserLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public class NestedScrollWebView extends WebView implements r {

    /* renamed from: a, reason: collision with root package name */
    public int f52700a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f52701b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f52702c;

    /* renamed from: d, reason: collision with root package name */
    public int f52703d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f52704e;

    /* renamed from: f, reason: collision with root package name */
    public a f52705f;

    /* renamed from: g, reason: collision with root package name */
    public float f52706g;

    /* renamed from: h, reason: collision with root package name */
    public int f52707h;

    /* renamed from: i, reason: collision with root package name */
    public w f52708i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestedScrollWebView(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.f52701b = new int[2];
        this.f52702c = new int[2];
        a();
    }

    public final void a() {
        this.f52705f = new a(this);
        setNestedScrollingEnabled(true);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f13, float f14, boolean z13) {
        a aVar = this.f52705f;
        Intrinsics.f(aVar);
        return aVar.b(f13, f14, z13);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f13, float f14) {
        a aVar = this.f52705f;
        Intrinsics.f(aVar);
        return aVar.c(f13, f14);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i13, int i14, int[] iArr, int[] iArr2) {
        a aVar = this.f52705f;
        Intrinsics.f(aVar);
        return aVar.d(i13, i14, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i13, int i14, int i15, int i16, int[] iArr) {
        a aVar = this.f52705f;
        Intrinsics.f(aVar);
        return aVar.e(i13, i14, i15, i16, 0, iArr, null);
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        a aVar = this.f52705f;
        Intrinsics.f(aVar);
        return aVar.h(0);
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        a aVar = this.f52705f;
        Intrinsics.f(aVar);
        return aVar.f56995a;
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        boolean z13 = false;
        Intrinsics.checkNotNullParameter(event, "event");
        MotionEvent obtain = MotionEvent.obtain(event);
        int actionMasked = event.getActionMasked();
        if (actionMasked == 0) {
            this.f52703d = 0;
        }
        int y13 = (int) event.getY();
        float rawY = event.getRawY();
        event.offsetLocation(0.0f, this.f52703d);
        if (actionMasked == 0) {
            this.f52700a = y13;
            this.f52706g = rawY;
            startNestedScroll(2);
            boolean onTouchEvent = super.onTouchEvent(event);
            this.f52704e = false;
            return onTouchEvent;
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                if (Math.abs(rawY - this.f52706g) < this.f52707h) {
                    return super.onTouchEvent(event);
                }
                int i13 = this.f52700a;
                int i14 = i13 - y13;
                if (y13 > i13) {
                    w wVar = this.f52708i;
                    if (wVar != null) {
                        int i15 = -i14;
                        f0 f0Var = wVar.f118699a;
                        if (f0Var.f80424a && i15 > wVar.f118700b) {
                            InAppBrowserView inAppBrowserView = wVar.f118701c;
                            LegoFloatingBottomActionBar legoFloatingBottomActionBar = inAppBrowserView.f45404q;
                            if (legoFloatingBottomActionBar == null) {
                                Intrinsics.r("floatingBottomActionBar");
                                throw null;
                            }
                            float height = legoFloatingBottomActionBar.getHeight();
                            LegoFloatingBottomActionBar legoFloatingBottomActionBar2 = inAppBrowserView.f45404q;
                            if (legoFloatingBottomActionBar2 == null) {
                                Intrinsics.r("floatingBottomActionBar");
                                throw null;
                            }
                            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(legoFloatingBottomActionBar2, (Property<LegoFloatingBottomActionBar, Float>) View.TRANSLATION_Y, height, 0.0f);
                            ofFloat.setDuration(420L);
                            ofFloat.start();
                            f0Var.f80424a = false;
                        }
                    }
                } else {
                    w wVar2 = this.f52708i;
                    if (wVar2 != null) {
                        int i16 = -i14;
                        f0 f0Var2 = wVar2.f118699a;
                        if (!f0Var2.f80424a && (-i16) > wVar2.f118700b) {
                            InAppBrowserView inAppBrowserView2 = wVar2.f118701c;
                            LegoFloatingBottomActionBar legoFloatingBottomActionBar3 = inAppBrowserView2.f45404q;
                            if (legoFloatingBottomActionBar3 == null) {
                                Intrinsics.r("floatingBottomActionBar");
                                throw null;
                            }
                            float height2 = legoFloatingBottomActionBar3.getHeight();
                            LegoFloatingBottomActionBar legoFloatingBottomActionBar4 = inAppBrowserView2.f45404q;
                            if (legoFloatingBottomActionBar4 == null) {
                                Intrinsics.r("floatingBottomActionBar");
                                throw null;
                            }
                            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(legoFloatingBottomActionBar4, (Property<LegoFloatingBottomActionBar, Float>) View.TRANSLATION_Y, 0.0f, height2);
                            ofFloat2.setDuration(420L);
                            ofFloat2.start();
                            f0Var2.f80424a = true;
                        }
                    }
                }
                int[] iArr = this.f52702c;
                int[] iArr2 = this.f52701b;
                if (dispatchNestedPreScroll(0, i14, iArr, iArr2)) {
                    i14 -= iArr[1];
                    obtain.offsetLocation(0.0f, iArr2[1]);
                    this.f52703d += iArr2[1];
                }
                int scrollY = getScrollY();
                this.f52700a = y13 - iArr2[1];
                int max = Math.max(0, scrollY + i14);
                int i17 = i14 - (max - scrollY);
                if (dispatchNestedScroll(0, max - i17, 0, i17, this.f52701b)) {
                    int i18 = this.f52700a;
                    int i19 = iArr2[1];
                    this.f52700a = i18 - i19;
                    obtain.offsetLocation(0.0f, i19);
                    this.f52703d += iArr2[1];
                }
                if (iArr[1] != 0 || iArr2[1] != 0) {
                    if (this.f52704e) {
                        return false;
                    }
                    this.f52704e = true;
                    super.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                    return false;
                }
                if (this.f52704e) {
                    this.f52704e = false;
                    obtain.setAction(0);
                    super.onTouchEvent(obtain);
                } else {
                    a aVar = this.f52705f;
                    if (aVar == null || aVar.f56995a) {
                        z13 = super.onTouchEvent(obtain);
                    }
                }
                obtain.recycle();
                return z13;
            }
            if (actionMasked != 3 && actionMasked != 5) {
                return false;
            }
        }
        stopNestedScroll();
        return super.onTouchEvent(event);
    }

    @Override // android.view.View
    public final void setNestedScrollingEnabled(boolean z13) {
        a aVar = this.f52705f;
        Intrinsics.f(aVar);
        aVar.o(z13);
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i13) {
        a aVar = this.f52705f;
        Intrinsics.f(aVar);
        return aVar.q(i13, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        a aVar = this.f52705f;
        Intrinsics.f(aVar);
        aVar.s(0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestedScrollWebView(@NotNull Context context, @NotNull AttributeSet attrs, int i13) {
        super(context, attrs, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.f52701b = new int[2];
        this.f52702c = new int[2];
        a();
    }
}
