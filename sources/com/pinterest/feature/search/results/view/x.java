package com.pinterest.feature.search.results.view;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l2;
import com.pinterest.ui.view.AnimatedContainer;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class x extends ar0.s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47832a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SearchGridMultiSectionFragment f47833b;

    /* renamed from: c, reason: collision with root package name */
    public int f47834c;

    public x(SearchGridMultiSectionFragment searchGridMultiSectionFragment) {
        this.f47833b = searchGridMultiSectionFragment;
    }

    @Override // ar0.s, ar0.y
    public final void c(RecyclerView recyclerView, int i13, int i14) {
        h61.j jVar;
        int i15 = this.f47832a;
        SearchGridMultiSectionFragment searchGridMultiSectionFragment = this.f47833b;
        switch (i15) {
            case 0:
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                if (!searchGridMultiSectionFragment.f47732s2 && i14 >= 1) {
                    searchGridMultiSectionFragment.f47732s2 = true;
                    HashMap hashMap = new HashMap();
                    hashMap.put(rg0.o.CONTEXT_SEARCH_QUERY.getValue(), searchGridMultiSectionFragment.Q1);
                    hashMap.put(rg0.o.CONTEXT_SEARCHED_AND_SCROLLED.getValue(), "true");
                    searchGridMultiSectionFragment.p9(hashMap);
                }
                if (ml2.c.a(this.f47834c) != ml2.c.a(i14)) {
                    this.f47834c = 0;
                }
                int i16 = this.f47834c + i14;
                this.f47834c = i16;
                if (Math.abs(i16) > 200) {
                    int i17 = this.f47834c;
                    if (i17 >= 0) {
                        if (i17 <= 0) {
                            int i18 = SearchGridMultiSectionFragment.O2;
                            break;
                        } else {
                            AnimatedContainer animatedContainer = searchGridMultiSectionFragment.H1;
                            if (animatedContainer != null) {
                                animatedContainer.a();
                                break;
                            }
                        }
                    } else {
                        AnimatedContainer animatedContainer2 = searchGridMultiSectionFragment.H1;
                        if (animatedContainer2 != null) {
                            animatedContainer2.d();
                            break;
                        }
                    }
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                int i19 = SearchGridMultiSectionFragment.O2;
                RecyclerView g83 = searchGridMultiSectionFragment.g8();
                Intrinsics.f(g83);
                l2 l2Var = g83.f19242n;
                Intrinsics.f(l2Var);
                boolean z13 = eb2.j.b(l2Var, null) >= this.f47834c;
                if (z13) {
                    AnimatedContainer animatedContainer3 = searchGridMultiSectionFragment.G1;
                    if (animatedContainer3 != null) {
                        animatedContainer3.d();
                    }
                } else {
                    AnimatedContainer animatedContainer4 = searchGridMultiSectionFragment.G1;
                    if (animatedContainer4 != null) {
                        animatedContainer4.a();
                    }
                }
                if (Intrinsics.d(searchGridMultiSectionFragment.f47697a2, Boolean.TRUE) && (jVar = searchGridMultiSectionFragment.U1) != null) {
                    jVar.d1(z13);
                    break;
                }
                break;
        }
    }

    public x(SearchGridMultiSectionFragment searchGridMultiSectionFragment, int i13) {
        this.f47833b = searchGridMultiSectionFragment;
        this.f47834c = i13;
    }
}
