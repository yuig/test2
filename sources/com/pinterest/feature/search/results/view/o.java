package com.pinterest.feature.search.results.view;

import android.view.View;
import h32.u0;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class o implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47821a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SearchGridMultiSectionFragment f47822b;

    public /* synthetic */ o(SearchGridMultiSectionFragment searchGridMultiSectionFragment, int i13) {
        this.f47821a = i13;
        this.f47822b = searchGridMultiSectionFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i13 = this.f47821a;
        SearchGridMultiSectionFragment this$0 = this.f47822b;
        switch (i13) {
            case 0:
                int i14 = SearchGridMultiSectionFragment.O2;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                nx.d0 s73 = this$0.s7();
                u0 u0Var = u0.FILTER_BUTTON;
                HashMap hashMap = new HashMap();
                hashMap.put("applied_filter_count", String.valueOf(this$0.f47710h2));
                Unit unit = Unit.f80348a;
                s73.Z(u0Var, hashMap);
                de1.d dVar = this$0.f47716k2;
                if (dVar != null) {
                    dVar.x();
                    break;
                }
                break;
            default:
                int i15 = SearchGridMultiSectionFragment.O2;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.o9("background_tapped");
                break;
        }
    }
}
