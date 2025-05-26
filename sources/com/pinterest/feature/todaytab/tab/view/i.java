package com.pinterest.feature.todaytab.tab.view;

import android.view.View;
import kotlin.collections.c0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m60.r0;
import sq0.f0;

/* loaded from: classes5.dex */
public final class i extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f48730i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ f0 f48731j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ k f48732k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(wk1.i iVar, k kVar, int i13) {
        super(2);
        this.f48730i = i13;
        this.f48731j = iVar;
        this.f48732k = kVar;
    }

    public final Integer b(View view, int i13) {
        int itemViewType;
        int[] iArr = n.f48737a;
        int i14 = this.f48730i;
        k kVar = this.f48732k;
        f0 f0Var = this.f48731j;
        switch (i14) {
            case 0:
                Intrinsics.checkNotNullParameter(view, "<anonymous parameter 0>");
                sq0.o r13 = f0Var.r(i13);
                if (r13 != null) {
                    int itemViewType2 = ((nr0.j) r13.f115027a).getItemViewType(r13.f115028b);
                    if (itemViewType2 == 205) {
                        r4 = kVar.getResources().getDimensionPixelOffset(n92.a.margin_quarter);
                    } else if (c0.w(iArr, itemViewType2)) {
                        r4 = kVar.getResources().getDimensionPixelOffset(n92.a.margin_three_quarter);
                    }
                }
                return Integer.valueOf(r4);
            case 1:
                Intrinsics.checkNotNullParameter(view, "<anonymous parameter 0>");
                sq0.o r14 = f0Var.r(i13);
                if (r14 != null && ((itemViewType = ((nr0.j) r14.f115027a).getItemViewType(r14.f115028b)) == 205 || c0.w(iArr, itemViewType))) {
                    r4 = kVar.getResources().getDimensionPixelOffset(n92.a.margin);
                }
                return Integer.valueOf(r4);
            default:
                Intrinsics.checkNotNullParameter(view, "<anonymous parameter 0>");
                sq0.o r15 = f0Var.r(i13);
                if (r15 != null) {
                    nr0.j jVar = (nr0.j) r15.f115027a;
                    int i15 = r15.f115028b;
                    int itemViewType3 = jVar.getItemViewType(i15);
                    if (itemViewType3 == 205) {
                        r4 = (i15 > 0 ? kVar.getResources().getDimensionPixelOffset(r0.margin_one_and_a_half) : 0) + kVar.getResources().getDimensionPixelOffset(r0.margin_quarter);
                    } else if (c0.w(iArr, itemViewType3)) {
                        r4 = kVar.getResources().getDimensionPixelOffset(n92.a.margin_three_quarter);
                    }
                }
                return Integer.valueOf(r4);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f48730i) {
        }
        return b((View) obj, ((Number) obj2).intValue());
    }
}
