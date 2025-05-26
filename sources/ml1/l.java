package ml1;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import com.pinterest.framework.screens.ScreenDescription;
import java.util.ArrayList;
import kh2.c3;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class l extends m {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f87530a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f87531b;

    /* renamed from: c, reason: collision with root package name */
    public final LinearInterpolator f87532c;

    public /* synthetic */ l() {
        this(true, false);
    }

    @Override // ml1.m
    public final Animator b(com.pinterest.framework.screens.l screenFactory, ViewGroup transitionContainer, r action, d screenInfo, ScreenDescription transitionScreenDescription, ScreenDescription screenDescription) {
        Intrinsics.checkNotNullParameter(screenFactory, "screenFactory");
        Intrinsics.checkNotNullParameter(transitionContainer, "transitionContainer");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(screenInfo, "screenInfo");
        Intrinsics.checkNotNullParameter(transitionScreenDescription, "transitionScreenDescription");
        View j13 = ((il1.b) screenFactory).j(transitionScreenDescription);
        if (j13 == null) {
            return new AnimatorSet();
        }
        int i13 = j.f87526a[action.ordinal()];
        LinearInterpolator linearInterpolator = this.f87532c;
        boolean z13 = this.f87530a;
        if (i13 == 1) {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(270L);
            animatorSet.setInterpolator(linearInterpolator);
            Animator[] animatorArr = new Animator[1];
            Property property = View.X;
            float[] fArr = new float[2];
            boolean Q1 = dl2.b.Q1();
            float C = screenInfo.C();
            if (Q1) {
                C = -C;
            }
            fArr[0] = C;
            fArr[1] = 0.0f;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(j13, (Property<View, Float>) property, fArr);
            Intrinsics.checkNotNullExpressionValue(ofFloat, "ofFloat(...)");
            animatorArr[0] = ofFloat;
            ArrayList l13 = f0.l(animatorArr);
            if (z13) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(j13, (Property<View, Float>) View.ALPHA, 0.9f, 1.0f);
                Intrinsics.checkNotNullExpressionValue(ofFloat2, "ofFloat(...)");
                l13.add(ofFloat2);
            }
            animatorSet.playTogether(l13);
            return animatorSet;
        }
        if (i13 == 2) {
            float C2 = dl2.b.Q1() ? screenInfo.C() : -screenInfo.C();
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.setDuration(270L);
            animatorSet2.setInterpolator(linearInterpolator);
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(j13, (Property<View, Float>) View.X, 0.0f, C2);
            Intrinsics.checkNotNullExpressionValue(ofFloat3, "ofFloat(...)");
            ArrayList l14 = f0.l(ofFloat3);
            if (z13) {
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(j13, (Property<View, Float>) View.ALPHA, 1.0f, 0.9f);
                Intrinsics.checkNotNullExpressionValue(ofFloat4, "ofFloat(...)");
                l14.add(ofFloat4);
            }
            animatorSet2.playTogether(l14);
            c3.i(animatorSet2, new k(j13, this.f87531b ? C2 : 0.0f, 0));
            return animatorSet2;
        }
        if (i13 == 3) {
            AnimatorSet animatorSet3 = new AnimatorSet();
            animatorSet3.setDuration(270L);
            animatorSet3.setInterpolator(linearInterpolator);
            Animator[] animatorArr2 = new Animator[1];
            Property property2 = View.X;
            float[] fArr2 = new float[2];
            boolean Q12 = dl2.b.Q1();
            float C3 = screenInfo.C();
            if (!Q12) {
                C3 = -C3;
            }
            fArr2[0] = C3;
            fArr2[1] = 0.0f;
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(j13, (Property<View, Float>) property2, fArr2);
            Intrinsics.checkNotNullExpressionValue(ofFloat5, "ofFloat(...)");
            animatorArr2[0] = ofFloat5;
            ArrayList l15 = f0.l(animatorArr2);
            if (z13) {
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(j13, (Property<View, Float>) View.ALPHA, 0.9f, 1.0f);
                Intrinsics.checkNotNullExpressionValue(ofFloat6, "ofFloat(...)");
                l15.add(ofFloat6);
            }
            animatorSet3.playTogether(l15);
            return animatorSet3;
        }
        if (i13 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        AnimatorSet animatorSet4 = new AnimatorSet();
        animatorSet4.setDuration(270L);
        animatorSet4.setInterpolator(linearInterpolator);
        Animator[] animatorArr3 = new Animator[1];
        Property property3 = View.X;
        float[] fArr3 = new float[2];
        fArr3[0] = 0.0f;
        boolean Q13 = dl2.b.Q1();
        float C4 = screenInfo.C();
        if (Q13) {
            C4 = -C4;
        }
        fArr3[1] = C4;
        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(j13, (Property<View, Float>) property3, fArr3);
        Intrinsics.checkNotNullExpressionValue(ofFloat7, "ofFloat(...)");
        animatorArr3[0] = ofFloat7;
        ArrayList l16 = f0.l(animatorArr3);
        if (z13) {
            ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(j13, (Property<View, Float>) View.ALPHA, 1.0f, 0.9f);
            Intrinsics.checkNotNullExpressionValue(ofFloat8, "ofFloat(...)");
            l16.add(ofFloat8);
        }
        animatorSet4.playTogether(l16);
        c3.i(animatorSet4, new yj1.d(j13, 5));
        return animatorSet4;
    }

    public l(boolean z13, boolean z14) {
        this.f87530a = z13;
        this.f87531b = z14;
        this.f87532c = new LinearInterpolator();
    }
}
