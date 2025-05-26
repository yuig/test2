package com.pinterest.feature.todaytab.articlefeed;

import android.view.View;
import com.pinterest.navigation.Navigation;
import kotlin.collections.c0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import m60.r0;
import sq0.f0;

/* loaded from: classes5.dex */
public final class f extends s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f48610i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ f0 f48611j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ j f48612k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(wk1.i iVar, j jVar, int i13) {
        super(2);
        this.f48610i = i13;
        this.f48611j = iVar;
        this.f48612k = jVar;
    }

    public final Integer b(View view, int i13) {
        int[] iArr = com.pinterest.feature.todaytab.tab.view.n.f48737a;
        int i14 = this.f48610i;
        j jVar = this.f48612k;
        int i15 = 0;
        f0 f0Var = this.f48611j;
        switch (i14) {
            case 0:
                Intrinsics.checkNotNullParameter(view, "<anonymous parameter 0>");
                sq0.o r13 = f0Var.r(i13);
                if (r13 != null) {
                    int itemViewType = ((nr0.j) r13.f115027a).getItemViewType(r13.f115028b);
                    if (itemViewType == 208) {
                        i15 = jVar.getResources().getDimensionPixelOffset(eo1.c.margin_one_and_a_half);
                    } else if (c0.w(iArr, itemViewType)) {
                        i15 = jVar.getResources().getDimensionPixelOffset(eo1.c.margin_three_quarter);
                    } else {
                        Navigation navigation = jVar.I;
                        if (navigation != null && navigation.S("com.pinterest.EXTRA_TODAY_ARTICLE_IS_FEED_SINGLE_COLUMN", false)) {
                            i15 = jVar.getResources().getDimensionPixelOffset(eo1.c.margin_one_and_a_half);
                        }
                    }
                }
                return Integer.valueOf(i15);
            case 1:
                Intrinsics.checkNotNullParameter(view, "<anonymous parameter 0>");
                sq0.o r14 = f0Var.r(i13);
                if (r14 != null && c0.w(iArr, ((nr0.j) r14.f115027a).getItemViewType(r14.f115028b))) {
                    i15 = jVar.getResources().getDimensionPixelOffset(eo1.c.margin_one_and_a_half);
                }
                return Integer.valueOf(i15);
            default:
                Intrinsics.checkNotNullParameter(view, "<anonymous parameter 0>");
                sq0.o r15 = f0Var.r(i13);
                if (r15 != null) {
                    int itemViewType2 = ((nr0.j) r15.f115027a).getItemViewType(r15.f115028b);
                    if (itemViewType2 == 210) {
                        i15 = jVar.getResources().getDimensionPixelOffset(r0.margin_quadruple);
                    } else if (c0.w(iArr, itemViewType2)) {
                        i15 = jVar.getResources().getDimensionPixelOffset(eo1.c.margin_three_quarter);
                    }
                }
                return Integer.valueOf(i15);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f48610i) {
        }
        return b((View) obj, ((Number) obj2).intValue());
    }
}
