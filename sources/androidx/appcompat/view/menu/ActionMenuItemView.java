package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.i;
import androidx.appcompat.widget.i3;
import androidx.appcompat.widget.o;
import i.j;
import n.b;
import n.b0;
import n.n;
import n.q;

/* loaded from: classes2.dex */
public class ActionMenuItemView extends AppCompatTextView implements b0, View.OnClickListener, o {

    /* renamed from: a, reason: collision with root package name */
    public q f16165a;

    /* renamed from: b, reason: collision with root package name */
    public CharSequence f16166b;

    /* renamed from: c, reason: collision with root package name */
    public Drawable f16167c;

    /* renamed from: d, reason: collision with root package name */
    public n f16168d;

    /* renamed from: e, reason: collision with root package name */
    public b f16169e;

    /* renamed from: f, reason: collision with root package name */
    public i f16170f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f16171g;

    /* renamed from: h, reason: collision with root package name */
    public final int f16172h;

    /* renamed from: i, reason: collision with root package name */
    public int f16173i;

    /* renamed from: j, reason: collision with root package name */
    public final int f16174j;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // n.b0
    public final void e(q qVar) {
        this.f16165a = qVar;
        Drawable icon = qVar.getIcon();
        this.f16167c = icon;
        if (icon != null) {
            int intrinsicWidth = icon.getIntrinsicWidth();
            int intrinsicHeight = icon.getIntrinsicHeight();
            int i13 = this.f16174j;
            if (intrinsicWidth > i13) {
                intrinsicHeight = (int) (intrinsicHeight * (i13 / intrinsicWidth));
                intrinsicWidth = i13;
            }
            if (intrinsicHeight > i13) {
                intrinsicWidth = (int) (intrinsicWidth * (i13 / intrinsicHeight));
            } else {
                i13 = intrinsicHeight;
            }
            icon.setBounds(0, 0, intrinsicWidth, i13);
        }
        setCompoundDrawables(icon, null, null, null);
        j();
        this.f16166b = qVar.getTitleCondensed();
        j();
        setId(qVar.f88675a);
        setVisibility(qVar.isVisible() ? 0 : 8);
        setEnabled(qVar.isEnabled());
        if (qVar.hasSubMenu() && this.f16169e == null) {
            this.f16169e = new b(this);
        }
    }

    @Override // n.b0
    public final q g() {
        return this.f16165a;
    }

    @Override // androidx.appcompat.widget.o
    public final boolean g0() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // android.widget.TextView, android.view.View
    public final CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    public final boolean i() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i13 = configuration.screenWidthDp;
        return i13 >= 480 || (i13 >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    public final void j() {
        boolean z13 = true;
        boolean z14 = !TextUtils.isEmpty(this.f16166b);
        if (this.f16167c != null && ((this.f16165a.f88699y & 4) != 4 || !this.f16171g)) {
            z13 = false;
        }
        boolean z15 = z14 & z13;
        setText(z15 ? this.f16166b : null);
        CharSequence charSequence = this.f16165a.f88691q;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z15 ? null : this.f16165a.f88679e);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.f16165a.f88692r;
        if (TextUtils.isEmpty(charSequence2)) {
            i3.a(this, z15 ? null : this.f16165a.f88679e);
        } else {
            i3.a(this, charSequence2);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        kg.n.a(view);
        n nVar = this.f16168d;
        if (nVar != null) {
            nVar.b(this.f16165a);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f16171g = i();
        j();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i13, int i14) {
        int i15;
        boolean z13 = !TextUtils.isEmpty(getText());
        if (z13 && (i15 = this.f16173i) >= 0) {
            super.setPadding(i15, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i13, i14);
        int mode = View.MeasureSpec.getMode(i13);
        int size = View.MeasureSpec.getSize(i13);
        int measuredWidth = getMeasuredWidth();
        int i16 = this.f16172h;
        int min = mode == Integer.MIN_VALUE ? Math.min(size, i16) : i16;
        if (mode != 1073741824 && i16 > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i14);
        }
        if (z13 || this.f16167c == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f16167c.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        b bVar;
        if (this.f16165a.hasSubMenu() && (bVar = this.f16169e) != null && bVar.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i13, int i14, int i15, int i16) {
        this.f16173i = i13;
        super.setPadding(i13, i14, i15, i16);
    }

    @Override // androidx.appcompat.widget.o
    public final boolean t0() {
        return (TextUtils.isEmpty(getText()) ^ true) && this.f16165a.getIcon() == null;
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Resources resources = context.getResources();
        this.f16171g = i();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.ActionMenuItemView, i13, 0);
        this.f16172h = obtainStyledAttributes.getDimensionPixelSize(j.ActionMenuItemView_android_minWidth, 0);
        obtainStyledAttributes.recycle();
        this.f16174j = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f16173i = -1;
        setSaveEnabled(false);
    }
}
