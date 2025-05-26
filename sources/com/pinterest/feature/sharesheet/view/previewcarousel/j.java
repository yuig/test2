package com.pinterest.feature.sharesheet.view.previewcarousel;

import ed1.g0;
import ed1.l0;
import i91.c0;
import kotlin.collections.CollectionsKt;
import m60.u;

/* loaded from: classes5.dex */
public final class j extends androidx.viewpager2.widget.k {

    /* renamed from: a, reason: collision with root package name */
    public int f48436a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f48437b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f48438c;

    public j(k kVar) {
        this.f48438c = kVar;
    }

    @Override // androidx.viewpager2.widget.k
    public final void a(int i13) {
        if (i13 == 0 && this.f48437b) {
            this.f48437b = false;
            l0 l0Var = this.f48438c.f48441b;
            if (l0Var != null) {
                int i14 = this.f48436a;
                c0 c0Var = (c0) CollectionsKt.U(i14, l0Var.f58657b);
                if (c0Var != null) {
                    u.f85943a.d(new g0(i14, c0Var));
                }
            }
        }
    }

    @Override // androidx.viewpager2.widget.k
    public final void b(int i13, float f13, int i14) {
    }

    @Override // androidx.viewpager2.widget.k
    public final void c(int i13) {
        int i14 = this.f48436a;
        this.f48436a = i13;
        k kVar = this.f48438c;
        i a13 = kVar.a(i14);
        if (a13 != null) {
            a13.r0();
        }
        i a14 = kVar.a(this.f48436a);
        if (a14 != null) {
            a14.o0();
        }
        if (i14 != this.f48436a) {
            this.f48437b = true;
        }
    }
}
