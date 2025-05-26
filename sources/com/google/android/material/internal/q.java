package com.google.android.material.internal;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.a3;

/* loaded from: classes3.dex */
public final class q extends a3 {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ t f32776g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(t tVar, NavigationMenuView navigationMenuView) {
        super(navigationMenuView);
        this.f32776g = tVar;
    }

    @Override // androidx.recyclerview.widget.a3, q5.b
    public final void d(View view, r5.e eVar) {
        super.d(view, eVar);
        l lVar = this.f32776g.f32781e;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            t tVar = lVar.f32771g;
            if (i13 >= tVar.f32781e.f32768d.size()) {
                eVar.f106231a.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(i14, 1, false));
                return;
            } else {
                int g13 = tVar.f32781e.g(i13);
                if (g13 == 0 || g13 == 1) {
                    i14++;
                }
                i13++;
            }
        }
    }
}
