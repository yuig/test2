package com.google.android.material.internal;

import android.view.View;
import androidx.recyclerview.widget.y1;

/* loaded from: classes3.dex */
public final class k extends q5.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f32765d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f32766e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l f32767f;

    public k(l lVar, int i13, boolean z13) {
        this.f32767f = lVar;
        this.f32765d = i13;
        this.f32766e = z13;
    }

    @Override // q5.b
    public final void d(View view, r5.e eVar) {
        this.f102402a.onInitializeAccessibilityNodeInfo(view, eVar.f106231a);
        int i13 = this.f32765d;
        int i14 = 0;
        int i15 = i13;
        while (true) {
            l lVar = this.f32767f;
            if (i14 >= i13) {
                lVar.getClass();
                eVar.u(y1.j(i15, 1, 1, 1, this.f32766e, view.isSelected()));
                return;
            } else {
                t tVar = lVar.f32771g;
                if (tVar.f32781e.g(i14) == 2 || tVar.f32781e.g(i14) == 3) {
                    i15--;
                }
                i14++;
            }
        }
    }
}
