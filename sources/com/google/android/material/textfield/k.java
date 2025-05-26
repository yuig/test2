package com.google.android.material.textfield;

import a.l2;
import a.m2;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.google.android.material.internal.CheckableImageButton;
import java.util.WeakHashMap;
import kh2.c3;
import lb.l0;
import q5.v0;

/* loaded from: classes3.dex */
public final class k extends o {

    /* renamed from: e */
    public final int f33234e;

    /* renamed from: f */
    public final int f33235f;

    /* renamed from: g */
    public final TimeInterpolator f33236g;

    /* renamed from: h */
    public AutoCompleteTextView f33237h;

    /* renamed from: i */
    public final l2 f33238i;

    /* renamed from: j */
    public final com.google.android.material.datepicker.h f33239j;

    /* renamed from: k */
    public final a8.v f33240k;

    /* renamed from: l */
    public boolean f33241l;

    /* renamed from: m */
    public boolean f33242m;

    /* renamed from: n */
    public boolean f33243n;

    /* renamed from: o */
    public long f33244o;

    /* renamed from: p */
    public AccessibilityManager f33245p;

    /* renamed from: q */
    public ValueAnimator f33246q;

    /* renamed from: r */
    public ValueAnimator f33247r;

    public k(n nVar) {
        super(nVar);
        this.f33238i = new l2(this, 9);
        this.f33239j = new com.google.android.material.datepicker.h(this, 1);
        this.f33240k = new a8.v(this, 17);
        this.f33244o = Long.MAX_VALUE;
        this.f33235f = tb.f.c0(nVar.getContext(), fj.c.motionDurationShort3, 67);
        this.f33234e = tb.f.c0(nVar.getContext(), fj.c.motionDurationShort3, 50);
        this.f33236g = tb.f.d0(nVar.getContext(), fj.c.motionEasingLinearInterpolator, gj.a.f65167a);
    }

    @Override // com.google.android.material.textfield.o
    public final void a() {
        if (this.f33245p.isTouchExplorationEnabled() && c3.d0(this.f33237h) && !this.f33274d.hasFocus()) {
            this.f33237h.dismissDropDown();
        }
        this.f33237h.post(new com.airbnb.lottie.k(this, 19));
    }

    @Override // com.google.android.material.textfield.o
    public final int c() {
        return fj.k.exposed_dropdown_menu_content_description;
    }

    @Override // com.google.android.material.textfield.o
    public final int d() {
        return fj.f.mtrl_dropdown_arrow;
    }

    @Override // com.google.android.material.textfield.o
    public final View.OnFocusChangeListener e() {
        return this.f33239j;
    }

    @Override // com.google.android.material.textfield.o
    public final View.OnClickListener f() {
        return this.f33238i;
    }

    @Override // com.google.android.material.textfield.o
    public final r5.b h() {
        return this.f33240k;
    }

    @Override // com.google.android.material.textfield.o
    public final boolean i(int i13) {
        return i13 != 0;
    }

    @Override // com.google.android.material.textfield.o
    public final boolean j() {
        return this.f33241l;
    }

    @Override // com.google.android.material.textfield.o
    public final boolean l() {
        return this.f33243n;
    }

    @Override // com.google.android.material.textfield.o
    public final void m(EditText editText) {
        if (!(editText instanceof AutoCompleteTextView)) {
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        this.f33237h = autoCompleteTextView;
        autoCompleteTextView.setOnTouchListener(new m2(this, 2));
        this.f33237h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: com.google.android.material.textfield.j
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                k kVar = k.this;
                kVar.f33242m = true;
                kVar.f33244o = System.currentTimeMillis();
                kVar.t(false);
            }
        });
        this.f33237h.setThreshold(0);
        TextInputLayout textInputLayout = this.f33271a;
        n nVar = textInputLayout.f33165c;
        CheckableImageButton checkableImageButton = nVar.f33253c;
        checkableImageButton.setImageDrawable(null);
        nVar.o();
        l0.v(nVar.f33251a, checkableImageButton, nVar.f33254d, nVar.f33255e);
        if (!c3.d0(editText) && this.f33245p.isTouchExplorationEnabled()) {
            WeakHashMap weakHashMap = v0.f102521a;
            this.f33274d.setImportantForAccessibility(2);
        }
        textInputLayout.f33165c.k(true);
    }

    @Override // com.google.android.material.textfield.o
    public final void n(r5.e eVar) {
        if (!c3.d0(this.f33237h)) {
            eVar.r(Spinner.class.getName());
        }
        if (eVar.f106231a.isShowingHintText()) {
            eVar.y(null);
        }
    }

    @Override // com.google.android.material.textfield.o
    public final void o(AccessibilityEvent accessibilityEvent) {
        if (!this.f33245p.isEnabled() || c3.d0(this.f33237h)) {
            return;
        }
        boolean z13 = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.f33243n && !this.f33237h.isPopupShowing();
        if (accessibilityEvent.getEventType() == 1 || z13) {
            u();
            this.f33242m = true;
            this.f33244o = System.currentTimeMillis();
        }
    }

    @Override // com.google.android.material.textfield.o
    public final void r() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f33236g;
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.setDuration(this.f33235f);
        int i13 = 6;
        ofFloat.addUpdateListener(new androidx.media3.ui.c(this, i13));
        this.f33247r = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat2.setInterpolator(timeInterpolator);
        ofFloat2.setDuration(this.f33234e);
        ofFloat2.addUpdateListener(new androidx.media3.ui.c(this, i13));
        this.f33246q = ofFloat2;
        ofFloat2.addListener(new androidx.appcompat.widget.d(this, 10));
        this.f33245p = (AccessibilityManager) this.f33273c.getSystemService("accessibility");
    }

    @Override // com.google.android.material.textfield.o
    public final void s() {
        AutoCompleteTextView autoCompleteTextView = this.f33237h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.f33237h.setOnDismissListener(null);
        }
    }

    public final void t(boolean z13) {
        if (this.f33243n != z13) {
            this.f33243n = z13;
            this.f33247r.cancel();
            this.f33246q.start();
        }
    }

    public final void u() {
        if (this.f33237h == null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.f33244o;
        if (currentTimeMillis < 0 || currentTimeMillis > 300) {
            this.f33242m = false;
        }
        if (this.f33242m) {
            this.f33242m = false;
            return;
        }
        t(!this.f33243n);
        if (!this.f33243n) {
            this.f33237h.dismissDropDown();
        } else {
            this.f33237h.requestFocus();
            this.f33237h.showDropDown();
        }
    }
}
