package com.pinterest.feature.search.results.view;

import android.view.View;
import com.pinterest.design.brio.widget.progress.PinterestLoadingLayout;
import com.pinterest.gestalt.spinner.GestaltSpinner;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b implements pr0.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47763a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wk1.k f47764b;

    public /* synthetic */ b(wk1.k kVar, int i13) {
        this.f47763a = i13;
        this.f47764b = kVar;
    }

    @Override // pr0.c
    public final void a(View view) {
        int i13 = this.f47763a;
        wk1.k kVar = this.f47764b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(view, "view");
                GraphQLSearchGridFragment graphQLSearchGridFragment = (GraphQLSearchGridFragment) kVar;
                int i14 = GraphQLSearchGridFragment.H1;
                graphQLSearchGridFragment.getClass();
                if (view.getId() == nl1.e.loading_cell || (view instanceof PinterestLoadingLayout) || (view instanceof GestaltSpinner) || graphQLSearchGridFragment.u8()) {
                    ((ky.e) graphQLSearchGridFragment.B1.getValue()).d();
                    break;
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(view, "view");
                SearchGridMultiSectionFragment searchGridMultiSectionFragment = (SearchGridMultiSectionFragment) kVar;
                int i15 = SearchGridMultiSectionFragment.O2;
                searchGridMultiSectionFragment.getClass();
                if (view.getId() == nl1.e.loading_cell || (view instanceof PinterestLoadingLayout) || (view instanceof GestaltSpinner) || searchGridMultiSectionFragment.u8()) {
                    ((ky.e) searchGridMultiSectionFragment.f47738v2.getValue()).d();
                    break;
                }
                break;
        }
    }
}
