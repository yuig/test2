package com.google.android.material.textfield;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;

/* loaded from: classes.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public final TextInputLayout f33271a;

    /* renamed from: b, reason: collision with root package name */
    public final n f33272b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f33273c;

    /* renamed from: d, reason: collision with root package name */
    public final CheckableImageButton f33274d;

    public o(n nVar) {
        this.f33271a = nVar.f33251a;
        this.f33272b = nVar;
        this.f33273c = nVar.getContext();
        this.f33274d = nVar.f33256f;
    }

    public void a() {
    }

    public void b() {
    }

    public int c() {
        return 0;
    }

    public int d() {
        return 0;
    }

    public View.OnFocusChangeListener e() {
        return null;
    }

    public View.OnClickListener f() {
        return null;
    }

    public View.OnFocusChangeListener g() {
        return null;
    }

    public r5.b h() {
        return null;
    }

    public boolean i(int i13) {
        return true;
    }

    public boolean j() {
        return false;
    }

    public boolean k() {
        return this instanceof k;
    }

    public boolean l() {
        return false;
    }

    public void m(EditText editText) {
    }

    public void n(r5.e eVar) {
    }

    public void o(AccessibilityEvent accessibilityEvent) {
    }

    public void p(boolean z13) {
    }

    public final void q() {
        this.f33272b.h(false);
    }

    public void r() {
    }

    public void s() {
    }
}
