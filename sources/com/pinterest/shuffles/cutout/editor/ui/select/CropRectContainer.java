package com.pinterest.shuffles.cutout.editor.ui.select;

import a.c;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xk2.v;
import y62.a;
import yv1.i;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0003\n\u000b\fB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lcom/pinterest/shuffles/cutout/editor/ui/select/CropRectContainer;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "org/chromium/net/y", "y62/a", "y62/l", "shuffles-cutout-editor_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class CropRectContainer extends FrameLayout {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f51963o = 0;

    /* renamed from: a, reason: collision with root package name */
    public ImageView f51964a;

    /* renamed from: b, reason: collision with root package name */
    public View f51965b;

    /* renamed from: c, reason: collision with root package name */
    public final v f51966c;

    /* renamed from: d, reason: collision with root package name */
    public a f51967d;

    /* renamed from: e, reason: collision with root package name */
    public float f51968e;

    /* renamed from: f, reason: collision with root package name */
    public float f51969f;

    /* renamed from: g, reason: collision with root package name */
    public float f51970g;

    /* renamed from: h, reason: collision with root package name */
    public float f51971h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f51972i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f51973j;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f51974k;

    /* renamed from: l, reason: collision with root package name */
    public final i f51975l;

    /* renamed from: m, reason: collision with root package name */
    public final RectF f51976m;

    /* renamed from: n, reason: collision with root package name */
    public final int f51977n;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CropRectContainer(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final float a() {
        return ((Number) this.f51966c.getValue()).floatValue();
    }

    public final int b(int i13, int i14, int i15) {
        if (getContext().getResources().getConfiguration().getLayoutDirection() != 1) {
            return i13;
        }
        int i16 = i15 - i14;
        if (i16 < 0) {
            return 0;
        }
        return i16;
    }

    public final boolean c(float f13, float f14, int i13, int i14) {
        return Math.abs(f13 - ((float) i13)) < a() && Math.abs(f14 - ((float) i14)) < a();
    }

    public final void d(RectF rectF) {
        Rect rect = (Rect) this.f51975l.invoke();
        Rect rect2 = new Rect((int) ((rectF.left * rect.width()) + rect.left), (int) ((rectF.top * rect.height()) + rect.top), (int) ((rectF.right * rect.width()) + rect.left), (int) ((rectF.bottom * rect.height()) + rect.top));
        int a13 = (int) a();
        int min = Math.min(rect.width(), rect.height());
        if (a13 > min) {
            a13 = min;
        }
        int width = rect2.width() - a13;
        if (width > 0) {
            width = 0;
        }
        int i13 = width / 2;
        int height = rect2.height() - a13;
        if (height > 0) {
            height = 0;
        }
        rect2.inset(i13, height / 2);
        int i14 = rect.left - rect2.left;
        if (i14 < 0) {
            i14 = 0;
        }
        int i15 = rect.top - rect2.top;
        if (i15 < 0) {
            i15 = 0;
        }
        rect2.offset(i14, i15);
        int i16 = rect.right - rect2.right;
        if (i16 > 0) {
            i16 = 0;
        }
        int i17 = rect.bottom - rect2.bottom;
        if (i17 > 0) {
            i17 = 0;
        }
        rect2.offset(i16, i17);
        View view = this.f51965b;
        if (view == null) {
            Intrinsics.r("cropRectView");
            throw null;
        }
        view.setVisibility(rectF.isEmpty() ^ true ? 0 : 8);
        View view2 = this.f51965b;
        if (view2 == null) {
            Intrinsics.r("cropRectView");
            throw null;
        }
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.width = rect2.width();
        marginLayoutParams.height = rect2.height();
        marginLayoutParams.setMarginStart(b(rect2.left, rect2.right, rect.right));
        marginLayoutParams.topMargin = rect2.top;
        view2.setLayoutParams(marginLayoutParams);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        View childAt = getChildAt(0);
        Intrinsics.g(childAt, "null cannot be cast to non-null type android.widget.ImageView");
        this.f51964a = (ImageView) childAt;
        View childAt2 = getChildAt(1);
        Intrinsics.checkNotNullExpressionValue(childAt2, "getChildAt(...)");
        this.f51965b = childAt2;
        RectF rect = this.f51976m;
        Intrinsics.checkNotNullParameter(rect, "rect");
        rect.set(rect);
        d(rect);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004e, code lost:
    
        if (r15 != 3) goto L180;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r15) {
        /*
            Method dump skipped, instructions count: 988
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.shuffles.cutout.editor.ui.select.CropRectContainer.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CropRectContainer(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f51966c = c.n(context, 14);
        this.f51967d = a.NONE;
        this.f51973j = new ArrayList();
        this.f51974k = new ArrayList();
        this.f51975l = new i(this, 23);
        this.f51976m = new RectF();
        int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f51977n = scaledTouchSlop * scaledTouchSlop;
    }
}
