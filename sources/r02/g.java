package r02;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.reportFlow.feature.rvc.model.LinkedBA;
import h32.d4;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lr02/g;", "Lmm1/l;", "<init>", "()V", "gi2/b", "reportFlow_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class g extends a {

    /* renamed from: h0, reason: collision with root package name */
    public static final /* synthetic */ int f105747h0 = 0;

    /* renamed from: g0, reason: collision with root package name */
    public final d4 f105748g0 = d4.REPORTS_AND_VIOLATION_CENTER;

    @Override // mm1.l
    public final mm1.d b8() {
        return new mm1.d(h02.d.linked_bas_sheet, true, 0, 0, false, false, new yv1.i(this, 11), 764);
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getG0() {
        return this.f105748g0;
    }

    @Override // mm1.l, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        a8(f.f105729j);
        View findViewById = v13.findViewById(h02.c.container_linked_bas);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        LinearLayout linearLayout = (LinearLayout) findViewById;
        List N = com.bumptech.glide.d.N(this, "EXTRA_LINKED_BAS", new ArrayList());
        Intrinsics.g(N, "null cannot be cast to non-null type java.util.ArrayList<com.pinterest.reportFlow.feature.rvc.model.LinkedBA>{ kotlin.collections.TypeAliasesKt.ArrayList<com.pinterest.reportFlow.feature.rvc.model.LinkedBA> }");
        for (LinkedBA linkedBA : (ArrayList) N) {
            Context requireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
            GestaltText gestaltText = new GestaltText(6, requireContext, (AttributeSet) null);
            gestaltText.i(new ex1.n(linkedBA, 20));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(0, 0, 0, 24);
            gestaltText.setLayoutParams(layoutParams);
            linearLayout.addView(gestaltText);
            gestaltText.j(new ez1.b(2, this, linkedBA));
        }
    }
}
