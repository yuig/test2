package com.pinterest.feature.search.results.view;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class p implements d71.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SearchGridMultiSectionFragment f47823a;

    public p(SearchGridMultiSectionFragment searchGridMultiSectionFragment) {
        this.f47823a = searchGridMultiSectionFragment;
    }

    @Override // d71.f
    public final void n() {
        SearchGridMultiSectionFragment searchGridMultiSectionFragment = this.f47823a;
        h61.j jVar = searchGridMultiSectionFragment.U1;
        if (jVar != null) {
            jVar.n();
        }
        searchGridMultiSectionFragment.V1 = null;
        searchGridMultiSectionFragment.R1 = null;
        if (searchGridMultiSectionFragment.l9().l()) {
            return;
        }
        c71.b0 b0Var = searchGridMultiSectionFragment.P1;
        if (b0Var != null) {
            searchGridMultiSectionFragment.P1 = c71.b0.a(b0Var, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -262145, 2097151);
        } else {
            Intrinsics.r("searchParameters");
            throw null;
        }
    }

    @Override // d71.f
    public final void o(e71.a skinTone, int i13) {
        Intrinsics.checkNotNullParameter(skinTone, "skinTone");
        SearchGridMultiSectionFragment searchGridMultiSectionFragment = this.f47823a;
        Integer num = searchGridMultiSectionFragment.V1;
        if (num != null && num.intValue() == i13) {
            n();
            return;
        }
        searchGridMultiSectionFragment.V1 = Integer.valueOf(i13);
        searchGridMultiSectionFragment.R1 = null;
        if (!searchGridMultiSectionFragment.l9().l()) {
            c71.b0 b0Var = searchGridMultiSectionFragment.P1;
            if (b0Var == null) {
                Intrinsics.r("searchParameters");
                throw null;
            }
            searchGridMultiSectionFragment.P1 = c71.b0.a(b0Var, null, null, null, null, null, null, false, skinTone.getTerm(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, -262145, 2097151);
        }
        h61.j jVar = searchGridMultiSectionFragment.U1;
        if (jVar != null) {
            jVar.V1(skinTone);
        }
    }
}
