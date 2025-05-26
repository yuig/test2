package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.view.View;
import com.google.android.material.internal.h0;
import l8.p;
import q5.a2;

/* loaded from: classes3.dex */
public final class b implements h0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BottomAppBar f32276a;

    @Override // com.google.android.material.internal.h0
    public final a2 d(View view, a2 a2Var, p pVar) {
        boolean z13;
        BottomAppBar bottomAppBar = this.f32276a;
        if (bottomAppBar.f32257h0) {
            bottomAppBar.f32263n0 = a2Var.b();
        }
        boolean z14 = false;
        if (bottomAppBar.f32258i0) {
            z13 = bottomAppBar.f32265p0 != a2Var.c();
            bottomAppBar.f32265p0 = a2Var.c();
        } else {
            z13 = false;
        }
        if (bottomAppBar.f32259j0) {
            boolean z15 = bottomAppBar.f32264o0 != a2Var.d();
            bottomAppBar.f32264o0 = a2Var.d();
            z14 = z15;
        }
        if (z13 || z14) {
            Animator animator = bottomAppBar.W;
            if (animator != null) {
                animator.cancel();
            }
            bottomAppBar.N();
            bottomAppBar.M();
        }
        return a2Var;
    }
}
