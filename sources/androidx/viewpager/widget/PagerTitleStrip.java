package androidx.viewpager.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import xa.c;
import xa.d;
import xa.e;
import xa.i;

@e
/* loaded from: classes3.dex */
public class PagerTitleStrip extends ViewGroup {

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f19872n = {R.attr.textAppearance, R.attr.textSize, R.attr.textColor, R.attr.gravity};

    /* renamed from: o, reason: collision with root package name */
    public static final int[] f19873o = {R.attr.textAllCaps};

    /* renamed from: a, reason: collision with root package name */
    public ViewPager f19874a;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f19875b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f19876c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f19877d;

    /* renamed from: e, reason: collision with root package name */
    public int f19878e;

    /* renamed from: f, reason: collision with root package name */
    public float f19879f;

    /* renamed from: g, reason: collision with root package name */
    public int f19880g;

    /* renamed from: h, reason: collision with root package name */
    public final int f19881h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f19882i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f19883j;

    /* renamed from: k, reason: collision with root package name */
    public final c f19884k;

    /* renamed from: l, reason: collision with root package name */
    public WeakReference f19885l;

    /* renamed from: m, reason: collision with root package name */
    public final int f19886m;

    public PagerTitleStrip(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f19878e = -1;
        this.f19879f = -1.0f;
        this.f19884k = new c(this);
        TextView textView = new TextView(context);
        this.f19875b = textView;
        addView(textView);
        TextView textView2 = new TextView(context);
        this.f19876c = textView2;
        addView(textView2);
        TextView textView3 = new TextView(context);
        this.f19877d = textView3;
        addView(textView3);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f19872n);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            textView.setTextAppearance(resourceId);
            textView2.setTextAppearance(resourceId);
            textView3.setTextAppearance(resourceId);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        if (dimensionPixelSize != 0) {
            float f13 = dimensionPixelSize;
            textView.setTextSize(0, f13);
            textView2.setTextSize(0, f13);
            textView3.setTextSize(0, f13);
        }
        if (obtainStyledAttributes.hasValue(2)) {
            int color = obtainStyledAttributes.getColor(2, 0);
            textView.setTextColor(color);
            textView2.setTextColor(color);
            textView3.setTextColor(color);
        }
        this.f19881h = obtainStyledAttributes.getInteger(3, 80);
        obtainStyledAttributes.recycle();
        int defaultColor = textView2.getTextColors().getDefaultColor();
        this.f19886m = defaultColor;
        int i13 = (defaultColor & 16777215) | ((((int) 153.0f) & 255) << 24);
        textView.setTextColor(i13);
        textView3.setTextColor(i13);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView2.setEllipsize(truncateAt);
        textView3.setEllipsize(truncateAt);
        if (resourceId != 0) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, f19873o);
            boolean z13 = obtainStyledAttributes2.getBoolean(0, false);
            obtainStyledAttributes2.recycle();
            if (z13) {
                b(textView);
                b(textView2);
                b(textView3);
                this.f19880g = (int) (context.getResources().getDisplayMetrics().density * 16.0f);
            }
        }
        textView.setSingleLine();
        textView2.setSingleLine();
        textView3.setSingleLine();
        this.f19880g = (int) (context.getResources().getDisplayMetrics().density * 16.0f);
    }

    public static void b(TextView textView) {
        Context context = textView.getContext();
        d dVar = new d();
        dVar.f134379a = context.getResources().getConfiguration().locale;
        textView.setTransformationMethod(dVar);
    }

    public int a() {
        Drawable background = getBackground();
        if (background != null) {
            return background.getIntrinsicHeight();
        }
        return 0;
    }

    public final void c(xa.a aVar, xa.a aVar2) {
        c cVar = this.f19884k;
        if (aVar != null) {
            aVar.f134373a.unregisterObserver(cVar);
            this.f19885l = null;
        }
        if (aVar2 != null) {
            aVar2.f134373a.registerObserver(cVar);
            this.f19885l = new WeakReference(aVar2);
        }
        ViewPager viewPager = this.f19874a;
        if (viewPager != null) {
            this.f19878e = -1;
            this.f19879f = -1.0f;
            d(viewPager.f19893f, aVar2);
            requestLayout();
        }
    }

    public final void d(int i13, xa.a aVar) {
        int b13 = aVar != null ? aVar.b() : 0;
        this.f19882i = true;
        CharSequence charSequence = null;
        CharSequence d2 = (i13 < 1 || aVar == null) ? null : aVar.d(i13 - 1);
        TextView textView = this.f19875b;
        textView.setText(d2);
        TextView textView2 = this.f19876c;
        textView2.setText((aVar == null || i13 >= b13) ? null : aVar.d(i13));
        int i14 = i13 + 1;
        if (i14 < b13 && aVar != null) {
            charSequence = aVar.d(i14);
        }
        TextView textView3 = this.f19877d;
        textView3.setText(charSequence);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, (int) (((getWidth() - getPaddingLeft()) - getPaddingRight()) * 0.8f)), Integer.MIN_VALUE);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.max(0, (getHeight() - getPaddingTop()) - getPaddingBottom()), Integer.MIN_VALUE);
        textView.measure(makeMeasureSpec, makeMeasureSpec2);
        textView2.measure(makeMeasureSpec, makeMeasureSpec2);
        textView3.measure(makeMeasureSpec, makeMeasureSpec2);
        this.f19878e = i13;
        if (!this.f19883j) {
            e(this.f19879f, i13, false);
        }
        this.f19882i = false;
    }

    public void e(float f13, int i13, boolean z13) {
        int i14;
        int i15;
        int i16;
        int i17;
        if (i13 != this.f19878e) {
            d(i13, this.f19874a.f19892e);
        } else if (!z13 && f13 == this.f19879f) {
            return;
        }
        this.f19883j = true;
        TextView textView = this.f19875b;
        int measuredWidth = textView.getMeasuredWidth();
        TextView textView2 = this.f19876c;
        int measuredWidth2 = textView2.getMeasuredWidth();
        TextView textView3 = this.f19877d;
        int measuredWidth3 = textView3.getMeasuredWidth();
        int i18 = measuredWidth2 / 2;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i19 = paddingRight + i18;
        int i23 = (width - (paddingLeft + i18)) - i19;
        float f14 = f13 + 0.5f;
        if (f14 > 1.0f) {
            f14 -= 1.0f;
        }
        int i24 = ((width - i19) - ((int) (i23 * f14))) - i18;
        int i25 = measuredWidth2 + i24;
        int baseline = textView.getBaseline();
        int baseline2 = textView2.getBaseline();
        int baseline3 = textView3.getBaseline();
        int max = Math.max(Math.max(baseline, baseline2), baseline3);
        int i26 = max - baseline;
        int i27 = max - baseline2;
        int i28 = max - baseline3;
        int max2 = Math.max(Math.max(textView.getMeasuredHeight() + i26, textView2.getMeasuredHeight() + i27), textView3.getMeasuredHeight() + i28);
        int i29 = this.f19881h & RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER;
        if (i29 == 16) {
            i14 = (((height - paddingTop) - paddingBottom) - max2) / 2;
        } else {
            if (i29 != 80) {
                i15 = i26 + paddingTop;
                i16 = i27 + paddingTop;
                i17 = paddingTop + i28;
                textView2.layout(i24, i16, i25, textView2.getMeasuredHeight() + i16);
                int min = Math.min(paddingLeft, (i24 - this.f19880g) - measuredWidth);
                textView.layout(min, i15, measuredWidth + min, textView.getMeasuredHeight() + i15);
                int max3 = Math.max((width - paddingRight) - measuredWidth3, i25 + this.f19880g);
                textView3.layout(max3, i17, max3 + measuredWidth3, textView3.getMeasuredHeight() + i17);
                this.f19879f = f13;
                this.f19883j = false;
            }
            i14 = (height - paddingBottom) - max2;
        }
        i15 = i26 + i14;
        i16 = i27 + i14;
        i17 = i14 + i28;
        textView2.layout(i24, i16, i25, textView2.getMeasuredHeight() + i16);
        int min2 = Math.min(paddingLeft, (i24 - this.f19880g) - measuredWidth);
        textView.layout(min2, i15, measuredWidth + min2, textView.getMeasuredHeight() + i15);
        int max32 = Math.max((width - paddingRight) - measuredWidth3, i25 + this.f19880g);
        textView3.layout(max32, i17, max32 + measuredWidth3, textView3.getMeasuredHeight() + i17);
        this.f19879f = f13;
        this.f19883j = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (!(parent instanceof ViewPager)) {
            throw new IllegalStateException("PagerTitleStrip must be a direct child of a ViewPager.");
        }
        ViewPager viewPager = (ViewPager) parent;
        xa.a aVar = viewPager.f19892e;
        c cVar = this.f19884k;
        viewPager.Q = cVar;
        if (viewPager.R == null) {
            viewPager.R = new ArrayList();
        }
        viewPager.R.add(cVar);
        this.f19874a = viewPager;
        WeakReference weakReference = this.f19885l;
        c(weakReference != null ? (xa.a) weakReference.get() : null, aVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ViewPager viewPager = this.f19874a;
        if (viewPager != null) {
            c(viewPager.f19892e, null);
            ViewPager viewPager2 = this.f19874a;
            i iVar = viewPager2.Q;
            viewPager2.Q = null;
            ArrayList arrayList = viewPager2.R;
            if (arrayList != null) {
                arrayList.remove(this.f19884k);
            }
            this.f19874a = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z13, int i13, int i14, int i15, int i16) {
        if (this.f19874a != null) {
            float f13 = this.f19879f;
            if (f13 < 0.0f) {
                f13 = 0.0f;
            }
            e(f13, this.f19878e, true);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i13, int i14) {
        int max;
        if (View.MeasureSpec.getMode(i13) != 1073741824) {
            throw new IllegalStateException("Must measure with an exact width");
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i14, paddingBottom, -2);
        int size = View.MeasureSpec.getSize(i13);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i13, (int) (size * 0.2f), -2);
        this.f19875b.measure(childMeasureSpec2, childMeasureSpec);
        TextView textView = this.f19876c;
        textView.measure(childMeasureSpec2, childMeasureSpec);
        this.f19877d.measure(childMeasureSpec2, childMeasureSpec);
        if (View.MeasureSpec.getMode(i14) == 1073741824) {
            max = View.MeasureSpec.getSize(i14);
        } else {
            max = Math.max(a(), textView.getMeasuredHeight() + paddingBottom);
        }
        setMeasuredDimension(size, View.resolveSizeAndState(max, i14, textView.getMeasuredState() << 16));
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f19882i) {
            return;
        }
        super.requestLayout();
    }
}
