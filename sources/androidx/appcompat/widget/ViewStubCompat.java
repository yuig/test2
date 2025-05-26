package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class ViewStubCompat extends View {

    /* renamed from: a, reason: collision with root package name */
    public final int f16498a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16499b;

    /* renamed from: c, reason: collision with root package name */
    public WeakReference f16500c;

    /* renamed from: d, reason: collision with root package name */
    public LayoutInflater f16501d;

    public ViewStubCompat(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final View a() {
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        }
        int i13 = this.f16498a;
        if (i13 == 0) {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        LayoutInflater layoutInflater = this.f16501d;
        if (layoutInflater == null) {
            layoutInflater = LayoutInflater.from(getContext());
        }
        View inflate = layoutInflater.inflate(i13, viewGroup, false);
        int i14 = this.f16499b;
        if (i14 != -1) {
            inflate.setId(i14);
        }
        int indexOfChild = viewGroup.indexOfChild(this);
        viewGroup.removeViewInLayout(this);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(inflate, indexOfChild, layoutParams);
        } else {
            viewGroup.addView(inflate, indexOfChild);
        }
        this.f16500c = new WeakReference(inflate);
        return inflate;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void onMeasure(int i13, int i14) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public final void setVisibility(int i13) {
        WeakReference weakReference = this.f16500c;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (view == null) {
                throw new IllegalStateException("setVisibility called on un-referenced view");
            }
            view.setVisibility(i13);
            return;
        }
        super.setVisibility(i13);
        if (i13 == 0 || i13 == 4) {
            a();
        }
    }

    public ViewStubCompat(@NonNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        this.f16498a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.j.ViewStubCompat, i13, 0);
        this.f16499b = obtainStyledAttributes.getResourceId(i.j.ViewStubCompat_android_inflatedId, -1);
        this.f16498a = obtainStyledAttributes.getResourceId(i.j.ViewStubCompat_android_layout, 0);
        setId(obtainStyledAttributes.getResourceId(i.j.ViewStubCompat_android_id, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }
}
