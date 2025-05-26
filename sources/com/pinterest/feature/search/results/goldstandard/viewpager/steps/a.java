package com.pinterest.feature.search.results.goldstandard.viewpager.steps;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import com.pinterest.framework.screens.ScreenDescription;
import h32.d4;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nx.a0;
import q5.v0;
import so.j3;
import yk1.m;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/pinterest/feature/search/results/goldstandard/viewpager/steps/a;", "Lyk1/k;", "Ls61/a;", "<init>", "()V", "results_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class a extends e implements s61.a {

    /* renamed from: j0, reason: collision with root package name */
    public j3 f47627j0;

    /* renamed from: k0, reason: collision with root package name */
    public LinearLayout f47628k0;

    /* renamed from: l0, reason: collision with root package name */
    public d f47629l0;

    /* renamed from: m0, reason: collision with root package name */
    public final a0 f47630m0;

    /* renamed from: n0, reason: collision with root package name */
    public final d4 f47631n0;

    public a() {
        a0 a0Var = new a0();
        this.f47630m0 = a0Var;
        this.E = l42.d.view_gold_standard_steps_slide;
        setPinalytics(a0Var);
        this.f47631n0 = d4.UNKNOWN_VIEW;
    }

    @Override // yk1.k
    public final m V7() {
        j3 j3Var = this.f47627j0;
        if (j3Var == null) {
            Intrinsics.r("goldStandardStepsPresenterFactory");
            throw null;
        }
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        return j3Var.a(requireContext, this.f47630m0);
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF27566e0() {
        return this.f47631n0;
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Bundle bundle2;
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        View findViewById = v13.findViewById(l42.b.gold_standard_steps_slide_linear_layout);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f47628k0 = (LinearLayout) findViewById;
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(eo1.c.space_1400);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(eo1.c.space_400);
        LinearLayout linearLayout = this.f47628k0;
        if (linearLayout == null) {
            Intrinsics.r("linearLayout");
            throw null;
        }
        WeakHashMap weakHashMap = v0.f102521a;
        linearLayout.setPaddingRelative(dimensionPixelOffset2, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset2);
        d dVar = this.f47629l0;
        if (dVar != null) {
            ScreenDescription screenDescription = this.f76937a;
            if (screenDescription == null || (bundle2 = screenDescription.getF49207c()) == null) {
                bundle2 = new Bundle();
            }
            dVar.p3(bundle2);
        }
    }
}
