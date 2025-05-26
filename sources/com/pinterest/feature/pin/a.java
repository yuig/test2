package com.pinterest.feature.pin;

import ads_mobile_sdk.ci1$$ExternalSyntheticThrowCCEIfNotNull0;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.View;
import com.pinterest.api.model.f30;
import h32.f1;
import h32.g0;
import java.util.HashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;

/* loaded from: classes5.dex */
public final class a extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f46914a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f46915b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f46916c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f46917d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f46918e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f46919f;

    public a(d0 d0Var, d dVar, Set set, View view, f30 f30Var) {
        this.f46916c = d0Var;
        this.f46917d = dVar;
        this.f46918e = set;
        this.f46915b = view;
        this.f46919f = f30Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        switch (this.f46914a) {
            case 1:
                Intrinsics.checkNotNullParameter(animation, "animation");
                ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(this.f46918e);
                u70.a tabType = (u70.a) this.f46919f;
                Intrinsics.checkNotNullParameter(null, "viewModel");
                Intrinsics.checkNotNullParameter(tabType, "tabType");
                Intrinsics.checkNotNullParameter(tabType, "tabType");
                throw null;
            default:
                super.onAnimationEnd(animation);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animation) {
        int i13 = this.f46914a;
        Object obj = this.f46917d;
        Object obj2 = this.f46916c;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(animation, "animation");
                ((d0) obj2).N(f1.RENDER, ((d) obj).e((Set) this.f46918e, this.f46915b), g0.REPIN_ANIMATION, ((f30) this.f46919f).getUid(), false);
                break;
            default:
                Intrinsics.checkNotNullParameter(animation, "animation");
                super.onAnimationStart(animation);
                ((HashSet) ((pd.s) obj2).f99753g).add((AnimatorSet) obj);
                break;
        }
    }
}
