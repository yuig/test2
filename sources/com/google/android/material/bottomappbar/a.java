package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import androidx.appcompat.widget.ActionMenuView;
import com.google.android.gms.ads.AdSize;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.WeakHashMap;
import q5.v0;

/* loaded from: classes3.dex */
public final class a extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32274a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BottomAppBar f32275b;

    public /* synthetic */ a(BottomAppBar bottomAppBar, int i13) {
        this.f32274a = i13;
        this.f32275b = bottomAppBar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32274a) {
            case 1:
                BottomAppBar bottomAppBar = this.f32275b;
                bottomAppBar.getClass();
                bottomAppBar.f32260k0 = false;
                bottomAppBar.W = null;
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i13 = 1;
        ActionMenuView actionMenuView = null;
        int i14 = this.f32274a;
        BottomAppBar bottomAppBar = this.f32275b;
        switch (i14) {
            case 0:
                if (!bottomAppBar.f32260k0) {
                    int i15 = bottomAppBar.f32250a0;
                    boolean z13 = bottomAppBar.f32261l0;
                    WeakHashMap weakHashMap = v0.f102521a;
                    if (!bottomAppBar.isLaidOut()) {
                        bottomAppBar.f32260k0 = false;
                        break;
                    } else {
                        Animator animator2 = bottomAppBar.W;
                        if (animator2 != null) {
                            animator2.cancel();
                        }
                        ArrayList arrayList = new ArrayList();
                        if (!bottomAppBar.L()) {
                            i15 = 0;
                            z13 = false;
                        }
                        int i16 = 0;
                        while (true) {
                            if (i16 < bottomAppBar.getChildCount()) {
                                View childAt = bottomAppBar.getChildAt(i16);
                                if (childAt instanceof ActionMenuView) {
                                    actionMenuView = (ActionMenuView) childAt;
                                } else {
                                    i16++;
                                }
                            }
                        }
                        if (actionMenuView != null) {
                            float c03 = tb.f.c0(bottomAppBar.getContext(), BottomAppBar.f32249t0, AdSize.MEDIUM_RECTANGLE_WIDTH);
                            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", 1.0f);
                            ofFloat.setDuration((long) (0.8f * c03));
                            if (Math.abs(actionMenuView.getTranslationX() - bottomAppBar.I(actionMenuView, i15, z13)) > 1.0f) {
                                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(actionMenuView, "alpha", 0.0f);
                                ofFloat2.setDuration((long) (c03 * 0.2f));
                                ofFloat2.addListener(new c(bottomAppBar, actionMenuView, i15, z13));
                                AnimatorSet animatorSet = new AnimatorSet();
                                animatorSet.playSequentially(ofFloat2, ofFloat);
                                arrayList.add(animatorSet);
                            } else if (actionMenuView.getAlpha() < 1.0f) {
                                arrayList.add(ofFloat);
                            }
                        }
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        animatorSet2.playTogether(arrayList);
                        bottomAppBar.W = animatorSet2;
                        animatorSet2.addListener(new a(bottomAppBar, i13));
                        bottomAppBar.W.start();
                        break;
                    }
                }
                break;
            case 1:
                bottomAppBar.getClass();
                break;
            default:
                bottomAppBar.f32266q0.onAnimationStart(animator);
                View H = bottomAppBar.H();
                FloatingActionButton floatingActionButton = H instanceof FloatingActionButton ? (FloatingActionButton) H : null;
                if (floatingActionButton != null) {
                    floatingActionButton.setTranslationX(bottomAppBar.J());
                    break;
                }
                break;
        }
    }
}
