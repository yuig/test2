package com.google.android.material.textfield;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import com.pinterest.feature.core.view.RecyclerViewTypes;

/* loaded from: classes.dex */
public final class e extends o {

    /* renamed from: e, reason: collision with root package name */
    public final int f33222e;

    /* renamed from: f, reason: collision with root package name */
    public final int f33223f;

    /* renamed from: g, reason: collision with root package name */
    public final TimeInterpolator f33224g;

    /* renamed from: h, reason: collision with root package name */
    public final TimeInterpolator f33225h;

    /* renamed from: i, reason: collision with root package name */
    public EditText f33226i;

    /* renamed from: j, reason: collision with root package name */
    public final a f33227j;

    /* renamed from: k, reason: collision with root package name */
    public final b f33228k;

    /* renamed from: l, reason: collision with root package name */
    public AnimatorSet f33229l;

    /* renamed from: m, reason: collision with root package name */
    public ValueAnimator f33230m;

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.material.textfield.b] */
    public e(n nVar) {
        super(nVar);
        this.f33227j = new a(this, 0);
        this.f33228k = new View.OnFocusChangeListener() { // from class: com.google.android.material.textfield.b
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z13) {
                e eVar = e.this;
                eVar.t(eVar.u());
            }
        };
        this.f33222e = tb.f.c0(nVar.getContext(), fj.c.motionDurationShort3, 100);
        this.f33223f = tb.f.c0(nVar.getContext(), fj.c.motionDurationShort3, RecyclerViewTypes.VIEW_TYPE_SHOPPING_CATEGORY);
        this.f33224g = tb.f.d0(nVar.getContext(), fj.c.motionEasingLinearInterpolator, gj.a.f65167a);
        this.f33225h = tb.f.d0(nVar.getContext(), fj.c.motionEasingEmphasizedInterpolator, gj.a.f65170d);
    }

    @Override // com.google.android.material.textfield.o
    public final void a() {
        if (this.f33272b.f33264n != null) {
            return;
        }
        t(u());
    }

    @Override // com.google.android.material.textfield.o
    public final int c() {
        return fj.k.clear_text_end_icon_content_description;
    }

    @Override // com.google.android.material.textfield.o
    public final int d() {
        return fj.f.mtrl_ic_cancel;
    }

    @Override // com.google.android.material.textfield.o
    public final View.OnFocusChangeListener e() {
        return this.f33228k;
    }

    @Override // com.google.android.material.textfield.o
    public final View.OnClickListener f() {
        return this.f33227j;
    }

    @Override // com.google.android.material.textfield.o
    public final View.OnFocusChangeListener g() {
        return this.f33228k;
    }

    @Override // com.google.android.material.textfield.o
    public final void m(EditText editText) {
        this.f33226i = editText;
        this.f33271a.f33165c.k(u());
    }

    @Override // com.google.android.material.textfield.o
    public final void p(boolean z13) {
        if (this.f33272b.f33264n == null) {
            return;
        }
        t(z13);
    }

    @Override // com.google.android.material.textfield.o
    public final void r() {
        final int i13 = 0;
        final int i14 = 1;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(this.f33225h);
        ofFloat.setDuration(this.f33223f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: com.google.android.material.textfield.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f33219b;

            {
                this.f33219b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i15 = i14;
                e eVar = this.f33219b;
                eVar.getClass();
                switch (i15) {
                    case 0:
                        eVar.f33274d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = eVar.f33274d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        break;
                }
            }
        });
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f33224g;
        ofFloat2.setInterpolator(timeInterpolator);
        int i15 = this.f33222e;
        ofFloat2.setDuration(i15);
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: com.google.android.material.textfield.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f33219b;

            {
                this.f33219b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i152 = i13;
                e eVar = this.f33219b;
                eVar.getClass();
                switch (i152) {
                    case 0:
                        eVar.f33274d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = eVar.f33274d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        break;
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.f33229l = animatorSet;
        animatorSet.playTogether(ofFloat, ofFloat2);
        this.f33229l.addListener(new d(this, i13));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat3.setInterpolator(timeInterpolator);
        ofFloat3.setDuration(i15);
        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: com.google.android.material.textfield.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f33219b;

            {
                this.f33219b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i152 = i13;
                e eVar = this.f33219b;
                eVar.getClass();
                switch (i152) {
                    case 0:
                        eVar.f33274d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = eVar.f33274d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        break;
                }
            }
        });
        this.f33230m = ofFloat3;
        ofFloat3.addListener(new d(this, i14));
    }

    @Override // com.google.android.material.textfield.o
    public final void s() {
        EditText editText = this.f33226i;
        if (editText != null) {
            editText.post(new com.airbnb.lottie.k(this, 18));
        }
    }

    public final void t(boolean z13) {
        boolean z14 = this.f33272b.f() == z13;
        if (z13 && !this.f33229l.isRunning()) {
            this.f33230m.cancel();
            this.f33229l.start();
            if (z14) {
                this.f33229l.end();
                return;
            }
            return;
        }
        if (z13) {
            return;
        }
        this.f33229l.cancel();
        this.f33230m.start();
        if (z14) {
            this.f33230m.end();
        }
    }

    public final boolean u() {
        EditText editText = this.f33226i;
        return editText != null && (editText.hasFocus() || this.f33274d.hasFocus()) && this.f33226i.getText().length() > 0;
    }
}
