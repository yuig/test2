package le;

import a.l2;
import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import com.facebook.FacebookException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class p extends Button {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f83090h = 0;

    /* renamed from: a, reason: collision with root package name */
    public final String f83091a;

    /* renamed from: b, reason: collision with root package name */
    public final String f83092b;

    /* renamed from: c, reason: collision with root package name */
    public View.OnClickListener f83093c;

    /* renamed from: d, reason: collision with root package name */
    public View.OnClickListener f83094d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f83095e;

    /* renamed from: f, reason: collision with root package name */
    public int f83096f;

    /* renamed from: g, reason: collision with root package name */
    public int f83097g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter("fb_login_button_create", "analyticsButtonCreatedEventName");
        Intrinsics.checkNotNullParameter("fb_login_button_did_tap", "analyticsButtonTappedEventName");
        int i14 = com.facebook.login.i0.com_facebook_loginview_default_style;
        a(context, attributeSet, i13, i14 == 0 ? af.f.com_facebook_button : i14);
        this.f83091a = "fb_login_button_create";
        this.f83092b = "fb_login_button_did_tap";
        setClickable(true);
        setFocusable(true);
    }

    public void a(Context context, AttributeSet attributeSet, int i13, int i14) {
        if (p001if.a.b(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(context, "context");
            d(context, attributeSet, i13, i14);
            e(context, attributeSet, i13, i14);
            if (!p001if.a.b(this)) {
                try {
                    TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{R.attr.paddingLeft, R.attr.paddingTop, R.attr.paddingRight, R.attr.paddingBottom}, i13, i14);
                    try {
                        setPadding(obtainStyledAttributes.getDimensionPixelSize(0, 0), obtainStyledAttributes.getDimensionPixelSize(1, 0), obtainStyledAttributes.getDimensionPixelSize(2, 0), obtainStyledAttributes.getDimensionPixelSize(3, 0));
                        obtainStyledAttributes.recycle();
                    } catch (Throwable th3) {
                        obtainStyledAttributes.recycle();
                        throw th3;
                    }
                } catch (Throwable th4) {
                    p001if.a.a(this, th4);
                }
            }
            f(context, attributeSet, i13, i14);
            if (p001if.a.b(this)) {
                return;
            }
            try {
                super.setOnClickListener(new l2(this, 5));
            } catch (Throwable th5) {
                p001if.a.a(this, th5);
            }
        } catch (Throwable th6) {
            p001if.a.a(this, th6);
        }
    }

    public final Activity b() {
        if (p001if.a.b(this)) {
            return null;
        }
        try {
            Context context = getContext();
            while (!(context instanceof Activity) && (context instanceof ContextWrapper)) {
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (context instanceof Activity) {
                return (Activity) context;
            }
            throw new FacebookException("Unable to get Activity.");
        } catch (Throwable th3) {
            p001if.a.a(this, th3);
            return null;
        }
    }

    public final int c(String str) {
        if (p001if.a.b(this)) {
            return 0;
        }
        try {
            return (int) Math.ceil(getPaint().measureText(str));
        } catch (Throwable th3) {
            p001if.a.a(this, th3);
            return 0;
        }
    }

    public final void d(Context context, AttributeSet attributeSet, int i13, int i14) {
        if (p001if.a.b(this)) {
            return;
        }
        try {
            if (isInEditMode()) {
                return;
            }
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{R.attr.background}, i13, i14);
            try {
                if (obtainStyledAttributes.hasValue(0)) {
                    int resourceId = obtainStyledAttributes.getResourceId(0, 0);
                    if (resourceId != 0) {
                        setBackgroundResource(resourceId);
                    } else {
                        setBackgroundColor(obtainStyledAttributes.getColor(0, 0));
                    }
                } else {
                    int i15 = af.a.com_facebook_blue;
                    Object obj = d5.a.f53679a;
                    setBackgroundColor(context.getColor(i15));
                }
                obtainStyledAttributes.recycle();
            } catch (Throwable th3) {
                obtainStyledAttributes.recycle();
                throw th3;
            }
        } catch (Throwable th4) {
            p001if.a.a(this, th4);
        }
    }

    public final void e(Context context, AttributeSet attributeSet, int i13, int i14) {
        if (p001if.a.b(this)) {
            return;
        }
        try {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{R.attr.drawableLeft, R.attr.drawableTop, R.attr.drawableRight, R.attr.drawableBottom, R.attr.drawablePadding}, i13, i14);
            try {
                setCompoundDrawablesWithIntrinsicBounds(obtainStyledAttributes.getResourceId(0, 0), obtainStyledAttributes.getResourceId(1, 0), obtainStyledAttributes.getResourceId(2, 0), obtainStyledAttributes.getResourceId(3, 0));
                int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(4, 0);
                obtainStyledAttributes.recycle();
                setCompoundDrawablePadding(dimensionPixelSize);
            } catch (Throwable th3) {
                obtainStyledAttributes.recycle();
                throw th3;
            }
        } catch (Throwable th4) {
            p001if.a.a(this, th4);
        }
    }

    public final void f(Context context, AttributeSet attributeSet, int i13, int i14) {
        if (p001if.a.b(this)) {
            return;
        }
        try {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{R.attr.textColor}, i13, i14);
            try {
                setTextColor(obtainStyledAttributes.getColorStateList(0));
                obtainStyledAttributes.recycle();
                obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{R.attr.gravity}, i13, i14);
                try {
                    int i15 = obtainStyledAttributes.getInt(0, 17);
                    obtainStyledAttributes.recycle();
                    setGravity(i15);
                    obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{R.attr.textSize, R.attr.textStyle, R.attr.text}, i13, i14);
                    try {
                        setTextSize(0, obtainStyledAttributes.getDimensionPixelSize(0, 0));
                        setTypeface(Typeface.create(getTypeface(), 1));
                        String string = obtainStyledAttributes.getString(2);
                        obtainStyledAttributes.recycle();
                        setText(string);
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } catch (Throwable th3) {
            p001if.a.a(this, th3);
        }
    }

    @Override // android.widget.TextView
    public final int getCompoundPaddingLeft() {
        if (p001if.a.b(this)) {
            return 0;
        }
        try {
            return this.f83095e ? this.f83096f : super.getCompoundPaddingLeft();
        } catch (Throwable th3) {
            p001if.a.a(this, th3);
            return 0;
        }
    }

    @Override // android.widget.TextView
    public final int getCompoundPaddingRight() {
        if (p001if.a.b(this)) {
            return 0;
        }
        try {
            return this.f83095e ? this.f83097g : super.getCompoundPaddingRight();
        } catch (Throwable th3) {
            p001if.a.a(this, th3);
            return 0;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        if (p001if.a.b(this)) {
            return;
        }
        try {
            super.onAttachedToWindow();
            if (isInEditMode()) {
                return;
            }
            Context context = getContext();
            if (p001if.a.b(this)) {
                return;
            }
            try {
                me.r rVar = new me.r(context, null);
                String str = this.f83091a;
                v vVar = v.f83104a;
                if (o0.b()) {
                    rVar.f87020a.f(str, null);
                }
            } catch (Throwable th3) {
                p001if.a.a(this, th3);
            }
        } catch (Throwable th4) {
            p001if.a.a(this, th4);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        if (p001if.a.b(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(canvas, "canvas");
            if ((getGravity() & 1) != 0) {
                int compoundPaddingLeft = getCompoundPaddingLeft();
                int compoundPaddingRight = getCompoundPaddingRight();
                int min = Math.min((((getWidth() - (getCompoundDrawablePadding() + compoundPaddingLeft)) - compoundPaddingRight) - c(getText().toString())) / 2, (compoundPaddingLeft - getPaddingLeft()) / 2);
                this.f83096f = compoundPaddingLeft - min;
                this.f83097g = compoundPaddingRight + min;
                this.f83095e = true;
            }
            super.onDraw(canvas);
            this.f83095e = false;
        } catch (Throwable th3) {
            p001if.a.a(this, th3);
        }
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        if (p001if.a.b(this)) {
            return;
        }
        try {
            this.f83093c = onClickListener;
        } catch (Throwable th3) {
            p001if.a.a(this, th3);
        }
    }
}
