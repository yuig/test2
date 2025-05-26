package androidx.viewpager.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.TextView;
import androidx.annotation.NonNull;
import xa.b;

/* loaded from: classes3.dex */
public class PagerTabStrip extends PagerTitleStrip {
    public float A;
    public float B;
    public final int C;

    /* renamed from: p, reason: collision with root package name */
    public final int f19861p;

    /* renamed from: q, reason: collision with root package name */
    public final int f19862q;

    /* renamed from: r, reason: collision with root package name */
    public final int f19863r;

    /* renamed from: s, reason: collision with root package name */
    public final int f19864s;

    /* renamed from: t, reason: collision with root package name */
    public final int f19865t;

    /* renamed from: u, reason: collision with root package name */
    public final Paint f19866u;

    /* renamed from: v, reason: collision with root package name */
    public final Rect f19867v;

    /* renamed from: w, reason: collision with root package name */
    public int f19868w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f19869x;

    /* renamed from: y, reason: collision with root package name */
    public final int f19870y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f19871z;

    public PagerTabStrip(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint();
        this.f19866u = paint;
        this.f19867v = new Rect();
        this.f19868w = 255;
        this.f19869x = false;
        int i13 = this.f19886m;
        this.f19861p = i13;
        paint.setColor(i13);
        float f13 = context.getResources().getDisplayMetrics().density;
        this.f19862q = (int) ((3.0f * f13) + 0.5f);
        this.f19863r = (int) ((6.0f * f13) + 0.5f);
        int i14 = (int) (64.0f * f13);
        this.f19865t = (int) ((16.0f * f13) + 0.5f);
        this.f19870y = (int) ((1.0f * f13) + 0.5f);
        this.f19864s = (int) ((f13 * 32.0f) + 0.5f);
        this.C = ViewConfiguration.get(context).getScaledTouchSlop();
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        int i15 = this.f19880g;
        this.f19880g = i15 >= i14 ? i15 : i14;
        requestLayout();
        setWillNotDraw(false);
        this.f19875b.setFocusable(true);
        this.f19875b.setOnClickListener(new b(this, 0));
        this.f19877d.setFocusable(true);
        this.f19877d.setOnClickListener(new b(this, 1));
        if (getBackground() == null) {
            this.f19869x = true;
        }
    }

    @Override // androidx.viewpager.widget.PagerTitleStrip
    public final int a() {
        return Math.max(super.a(), this.f19864s);
    }

    @Override // androidx.viewpager.widget.PagerTitleStrip
    public final void e(float f13, int i13, boolean z13) {
        int height = getHeight();
        TextView textView = this.f19876c;
        int left = textView.getLeft();
        int i14 = this.f19865t;
        int right = textView.getRight() + i14;
        int i15 = height - this.f19862q;
        Rect rect = this.f19867v;
        rect.set(left - i14, i15, right, height);
        super.e(f13, i13, z13);
        this.f19868w = (int) (Math.abs(f13 - 0.5f) * 2.0f * 255.0f);
        rect.union(textView.getLeft() - i14, i15, textView.getRight() + i14, height);
        invalidate(rect);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight();
        TextView textView = this.f19876c;
        int left = textView.getLeft();
        int i13 = this.f19865t;
        int i14 = left - i13;
        int right = textView.getRight() + i13;
        int i15 = height - this.f19862q;
        Paint paint = this.f19866u;
        int i16 = this.f19868w << 24;
        int i17 = this.f19861p;
        paint.setColor(i16 | (i17 & 16777215));
        float f13 = right;
        float f14 = height;
        canvas.drawRect(i14, i15, f13, f14, paint);
        if (this.f19869x) {
            paint.setColor((-16777216) | (i17 & 16777215));
            canvas.drawRect(getPaddingLeft(), height - this.f19870y, getWidth() - getPaddingRight(), f14, paint);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0 && this.f19871z) {
            return false;
        }
        float x13 = motionEvent.getX();
        float y13 = motionEvent.getY();
        if (action == 0) {
            this.A = x13;
            this.B = y13;
            this.f19871z = false;
        } else if (action == 1) {
            int left = this.f19876c.getLeft();
            int i13 = this.f19865t;
            if (x13 < left - i13) {
                ViewPager viewPager = this.f19874a;
                viewPager.A(viewPager.f19893f - 1);
            } else if (x13 > r5.getRight() + i13) {
                ViewPager viewPager2 = this.f19874a;
                viewPager2.A(viewPager2.f19893f + 1);
            }
        } else if (action == 2) {
            float abs = Math.abs(x13 - this.A);
            int i14 = this.C;
            if (abs > i14 || Math.abs(y13 - this.B) > i14) {
                this.f19871z = true;
            }
        }
        return true;
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i13) {
        super.setBackgroundColor(i13);
        this.f19869x = (i13 & (-16777216)) == 0;
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        this.f19869x = drawable == null;
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i13) {
        super.setBackgroundResource(i13);
        this.f19869x = i13 == 0;
    }

    @Override // android.view.View
    public final void setPadding(int i13, int i14, int i15, int i16) {
        int i17 = this.f19863r;
        if (i16 < i17) {
            i16 = i17;
        }
        super.setPadding(i13, i14, i15, i16);
    }
}
