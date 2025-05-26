package com.pinterest.feature.ideaPinCreation.closeup.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g2 extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f46188a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IdeaPinTextEditor f46189b;

    public /* synthetic */ g2(IdeaPinTextEditor ideaPinTextEditor, int i13) {
        this.f46188a = i13;
        this.f46189b = ideaPinTextEditor;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i13 = this.f46188a;
        IdeaPinTextEditor ideaPinTextEditor = this.f46189b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(animator, "animator");
                ideaPinTextEditor.f46051q = false;
                bs1.c.X0(ideaPinTextEditor.f46047m);
                ideaPinTextEditor.k();
                hf0.b.s(ideaPinTextEditor.f46045k);
                break;
            default:
                Intrinsics.checkNotNullParameter(animator, "animator");
                ideaPinTextEditor.f46052r = false;
                bs1.c.X0(ideaPinTextEditor.f46048n);
                ideaPinTextEditor.k();
                hf0.b.s(ideaPinTextEditor.f46045k);
                break;
        }
    }
}
