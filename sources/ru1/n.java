package ru1;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class n extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f110075i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ o f110076j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(o oVar, int i13) {
        super(0);
        this.f110075i = i13;
        this.f110076j = oVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        g6.e eVar = g6.h.f63660p;
        g6.e eVar2 = g6.h.f63661q;
        o oVar = this.f110076j;
        int i13 = this.f110075i;
        switch (i13) {
            case 0:
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(o.n(oVar), (Property<View, Float>) View.SCALE_X, oVar.k() ? 0.85f : 1.3f);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(o.n(oVar), (Property<View, Float>) View.SCALE_Y, oVar.k() ? 0.85f : 1.3f);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setDuration(100L);
                animatorSet.playTogether(ofFloat, ofFloat2);
                break;
            case 1:
                switch (i13) {
                }
            default:
                switch (i13) {
                }
        }
        return new g6.h(o.n(oVar), eVar);
    }
}
