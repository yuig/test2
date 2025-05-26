package com.google.android.material.datepicker;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m1;
import androidx.recyclerview.widget.w2;

/* loaded from: classes3.dex */
public final class m extends LinearLayoutManager {
    public final /* synthetic */ int E;
    public final /* synthetic */ s F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(s sVar, int i13, int i14) {
        super(i13, false);
        this.F = sVar;
        this.E = i14;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.l2
    public final void W0(RecyclerView recyclerView, w2 w2Var, int i13) {
        m1 m1Var = new m1(4, recyclerView.getContext(), this);
        m1Var.f19651a = i13;
        X0(m1Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void Z0(w2 w2Var, int[] iArr) {
        int i13 = this.E;
        s sVar = this.F;
        if (i13 == 0) {
            iArr[0] = sVar.f32565j.getWidth();
            iArr[1] = sVar.f32565j.getWidth();
        } else {
            iArr[0] = sVar.f32565j.getHeight();
            iArr[1] = sVar.f32565j.getHeight();
        }
    }
}
