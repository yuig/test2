package androidx.compose.ui.platform;

import android.content.Context;
import android.os.IBinder;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import i2.o;
import i2.w;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p1.p1;
import q2.h;
import q2.i;
import s3.n1;
import t3.d5;
import t3.f5;
import t3.g0;
import t3.y3;
import x5.b;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/ui/platform/AbstractComposeView;", "Landroid/view/ViewGroup;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public abstract class AbstractComposeView extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public WeakReference f17447a;

    /* renamed from: b, reason: collision with root package name */
    public IBinder f17448b;

    /* renamed from: c, reason: collision with root package name */
    public d5 f17449c;

    /* renamed from: d, reason: collision with root package name */
    public w f17450d;

    /* renamed from: e, reason: collision with root package name */
    public Function0 f17451e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f17452f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f17453g;

    public AbstractComposeView(@NotNull Context context, AttributeSet attributeSet) {
        this(4, context, attributeSet);
    }

    public void a(w wVar) {
        n(wVar);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        e();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i13, ViewGroup.LayoutParams layoutParams) {
        e();
        return super.addViewInLayout(view, i13, layoutParams);
    }

    public abstract void b(o oVar, int i13);

    public final void e() {
        if (this.f17452f) {
            return;
        }
        throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
    }

    public final void g() {
        d5 d5Var = this.f17449c;
        if (d5Var != null) {
            d5Var.dispose();
        }
        this.f17449c = null;
        requestLayout();
    }

    public final void i() {
        if (this.f17449c == null) {
            try {
                this.f17452f = true;
                w m13 = m();
                p1 p1Var = new p1(this, 8);
                Object obj = i.f102113a;
                this.f17449c = f5.a(this, m13, new h(p1Var, true, -656146368));
            } finally {
                this.f17452f = false;
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean isTransitionGroup() {
        return !this.f17453g || super.isTransitionGroup();
    }

    /* renamed from: j */
    public boolean getF17461i() {
        return true;
    }

    public void k(boolean z13, int i13, int i14, int i15, int i16) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i15 - i13) - getPaddingRight(), (i16 - i14) - getPaddingBottom());
        }
    }

    public void l(int i13, int i14) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i13, i14);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i13) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i13)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i14) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i14)));
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + childAt.getMeasuredWidth(), getPaddingBottom() + getPaddingTop() + childAt.getMeasuredHeight());
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x006d, code lost:
    
        if (r2 > 0) goto L35;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0073  */
    /* JADX WARN: Type inference failed for: r0v0, types: [i2.w] */
    /* JADX WARN: Type inference failed for: r0v1, types: [i2.w] */
    /* JADX WARN: Type inference failed for: r0v17, types: [i2.o2] */
    /* JADX WARN: Type inference failed for: r0v2, types: [i2.w] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v48 */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v50 */
    /* JADX WARN: Type inference failed for: r0v51 */
    /* JADX WARN: Type inference failed for: r0v52 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [i2.x1] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final i2.w m() {
        /*
            Method dump skipped, instructions count: 469
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AbstractComposeView.m():i2.w");
    }

    public final void n(w wVar) {
        if (this.f17450d != wVar) {
            this.f17450d = wVar;
            if (wVar != null) {
                this.f17447a = null;
            }
            d5 d5Var = this.f17449c;
            if (d5Var != null) {
                d5Var.dispose();
                this.f17449c = null;
                if (isAttachedToWindow()) {
                    i();
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        IBinder windowToken = getWindowToken();
        if (this.f17448b != windowToken) {
            this.f17448b = windowToken;
            this.f17447a = null;
        }
        if (getF17461i()) {
            i();
        }
    }

    public void onDestroy() {
        g();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z13, int i13, int i14, int i15, int i16) {
        k(z13, i13, i14, i15, i16);
    }

    @Override // android.view.View
    public final void onMeasure(int i13, int i14) {
        i();
        l(i13, i14);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i13) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        childAt.setLayoutDirection(i13);
    }

    @Override // android.view.ViewGroup
    public final void setTransitionGroup(boolean z13) {
        super.setTransitionGroup(z13);
        this.f17453g = true;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public /* synthetic */ AbstractComposeView(int i13, Context context, AttributeSet attributeSet) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, 0);
    }

    public AbstractComposeView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        setClipChildren(false);
        setClipToPadding(false);
        int i14 = 1;
        g0 g0Var = new g0(this, i14);
        addOnAttachStateChangeListener(g0Var);
        y3 listener = new y3(this);
        int i15 = x5.a.f133834a;
        Intrinsics.checkNotNullParameter(this, "<this>");
        Intrinsics.checkNotNullParameter(listener, "listener");
        b b13 = x5.a.b(this);
        Intrinsics.checkNotNullParameter(listener, "listener");
        b13.f133836a.add(listener);
        this.f17451e = new n1(this, g0Var, listener, i14);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i13) {
        e();
        super.addView(view, i13);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i13, ViewGroup.LayoutParams layoutParams, boolean z13) {
        e();
        return super.addViewInLayout(view, i13, layoutParams, z13);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i13, int i14) {
        e();
        super.addView(view, i13, i14);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        e();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i13, ViewGroup.LayoutParams layoutParams) {
        e();
        super.addView(view, i13, layoutParams);
    }
}
