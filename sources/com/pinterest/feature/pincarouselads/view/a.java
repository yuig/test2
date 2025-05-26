package com.pinterest.feature.pincarouselads.view;

import android.widget.LinearLayout;
import androidx.recyclerview.widget.r0;
import com.pinterest.identity.authentication.view.SuggestedDomainsView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements r0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47353a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LinearLayout f47354b;

    public /* synthetic */ a(LinearLayout linearLayout, int i13) {
        this.f47353a = i13;
        this.f47354b = linearLayout;
    }

    @Override // androidx.recyclerview.widget.r0
    public final String value() {
        int i13 = this.f47353a;
        LinearLayout linearLayout = this.f47354b;
        switch (i13) {
            case 0:
                BaseRecyclerCellView this$0 = (BaseRecyclerCellView) linearLayout;
                float f13 = BaseRecyclerCellView.MS_PER_PIXEL;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                return this$0.getDebugTag();
            default:
                SuggestedDomainsView this$02 = (SuggestedDomainsView) linearLayout;
                int i14 = SuggestedDomainsView.f49827c;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                return (String) this$02.f49828a.getValue();
        }
    }
}
