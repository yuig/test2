package com.pinterest.education.view;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.d;
import hf0.b;
import i32.c;
import m60.r0;
import qa2.h0;
import vb0.e;
import xk2.v;
import zf0.f;

/* loaded from: classes5.dex */
public class EducationPulsarView extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public final ImageView f45017a;

    /* renamed from: b, reason: collision with root package name */
    public final int f45018b;

    /* renamed from: c, reason: collision with root package name */
    public AnimatorSet f45019c;

    /* renamed from: d, reason: collision with root package name */
    public String f45020d;

    /* renamed from: e, reason: collision with root package name */
    public final d f45021e;

    public EducationPulsarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void a() {
        ImageView imageView = this.f45017a;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView, "scaleX", 1.0f, 0.8f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView, "scaleY", 1.0f, 0.8f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofFloat, ofFloat2);
        animatorSet.setDuration(1000L);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(imageView, "scaleX", 0.8f, 1.0f);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(imageView, "scaleY", 0.8f, 1.0f);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(ofFloat3, ofFloat4);
        animatorSet2.setDuration(1000L);
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(imageView, "alpha", 0.0f, 1.0f);
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.playTogether(animatorSet2, ofFloat5);
        animatorSet3.setDuration(1000L);
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(imageView, "alpha", 1.0f, 0.0f);
        AnimatorSet animatorSet4 = new AnimatorSet();
        animatorSet4.playTogether(animatorSet, ofFloat6);
        animatorSet4.setDuration(1000L);
        AnimatorSet animatorSet5 = new AnimatorSet();
        animatorSet5.play(animatorSet2);
        AnimatorSet animatorSet6 = new AnimatorSet();
        animatorSet6.play(animatorSet2);
        AnimatorSet animatorSet7 = new AnimatorSet();
        animatorSet7.playSequentially(animatorSet3, animatorSet, animatorSet5, animatorSet4, animatorSet6);
        this.f45019c = animatorSet7;
        animatorSet7.addListener(this.f45021e);
        this.f45019c.start();
    }

    public final void b(c cVar, View view) {
        if (view == null) {
            v vVar = f.f141903e;
            view = e.e().d(getContext(), cVar);
        }
        if (view != null) {
            v vVar2 = f.f141903e;
            e.e().getClass();
            int[] c13 = f.c(view);
            if (!f.k((View) getParent(), view, cVar)) {
                c();
                return;
            }
            if (view instanceof h0) {
                this.f45020d = ((h0) view).getPinUid();
            }
            d(view.getWidth(), view.getHeight(), c13);
        }
    }

    public final void c() {
        AnimatorSet animatorSet = this.f45019c;
        if (animatorSet != null) {
            animatorSet.removeListener(this.f45021e);
        }
        setVisibility(8);
    }

    public final void d(int i13, int i14, int[] iArr) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) getLayoutParams();
        boolean z13 = layoutParams.getLayoutDirection() == 1;
        int f13 = b.f();
        int i15 = iArr[0];
        int i16 = iArr[1];
        int i17 = this.f45018b;
        int i18 = (i13 - i17) / 2;
        int i19 = (i14 - i17) / 2;
        int i23 = z13 ? ((r5 - i15) - i13) + i18 : i15 + i18;
        int i24 = i19 + i16;
        int i25 = i23 + i17;
        int i26 = i25 > r5 ? r5 - i25 : 0;
        int i27 = i16 + i17;
        layoutParams.setMargins(0, i24, 0, ((float) i27) > ((float) b.f69003c) - ((float) f13) ? (r4 - f13) - i27 : 0);
        layoutParams.setMarginStart(i23);
        layoutParams.setMarginEnd(i26);
        setLayoutParams(layoutParams);
        if (getVisibility() != 0) {
            setVisibility(0);
            a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        AnimatorSet animatorSet = this.f45019c;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
        }
        super.onDetachedFromWindow();
    }

    public EducationPulsarView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        this.f45021e = new d(this, 13);
        this.f45018b = getResources().getDimensionPixelSize(r0.pulsar_outer_size);
        LayoutInflater.from(context).inflate(jg0.d.view_education_pulsar, (ViewGroup) this, true);
        this.f45017a = (ImageView) findViewById(jg0.c.education_pulsar);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        setVisibility(4);
    }
}
