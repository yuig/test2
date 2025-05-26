package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.y2;

/* loaded from: classes3.dex */
public final class p extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33275a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f33276b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f33277c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f33278d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f33279e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f33280f;

    public p(c02.u uVar, y2 y2Var, Animator animator, int i13, int i14) {
        this.f33280f = uVar;
        this.f33278d = y2Var;
        this.f33279e = animator;
        this.f33276b = i13;
        this.f33277c = i14;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        AppCompatTextView appCompatTextView;
        int i13 = this.f33275a;
        int i14 = this.f33276b;
        int i15 = this.f33277c;
        Object obj = this.f33278d;
        Object obj2 = this.f33280f;
        Object obj3 = this.f33279e;
        switch (i13) {
            case 0:
                q qVar = (q) obj2;
                qVar.f33294n = i14;
                qVar.f33292l = null;
                TextView textView = (TextView) obj;
                if (textView != null) {
                    textView.setVisibility(4);
                    if (i15 == 1 && (appCompatTextView = qVar.f33298r) != null) {
                        appCompatTextView.setText((CharSequence) null);
                    }
                }
                TextView textView2 = (TextView) obj3;
                if (textView2 != null) {
                    textView2.setTranslationY(0.0f);
                    textView2.setAlpha(1.0f);
                    break;
                }
                break;
            default:
                ((Animator) obj3).removeListener(this);
                c02.u uVar = (c02.u) obj2;
                y2 y2Var = (y2) obj;
                uVar.f24464k.m(y2Var, i14, i15, false);
                uVar.h(y2Var);
                uVar.f24472s.remove(y2Var);
                uVar.q();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f33275a) {
            case 0:
                TextView textView = (TextView) this.f33279e;
                if (textView != null) {
                    textView.setVisibility(0);
                    textView.setAlpha(0.0f);
                    break;
                }
                break;
            default:
                ((c02.u) this.f33280f).getClass();
                break;
        }
    }

    public p(q qVar, int i13, TextView textView, int i14, TextView textView2) {
        this.f33280f = qVar;
        this.f33276b = i13;
        this.f33278d = textView;
        this.f33277c = i14;
        this.f33279e = textView2;
    }
}
