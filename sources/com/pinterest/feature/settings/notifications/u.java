package com.pinterest.feature.settings.notifications;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.Space;
import com.pinterest.feature.settings.notifications.expandablesection.ExpandableSectionView;
import com.pinterest.gestalt.divider.GestaltDivider;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class u extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f48269i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ v f48270j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(v vVar, int i13) {
        super(0);
        this.f48269i = i13;
        this.f48270j = vVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f48269i;
        v vVar = this.f48270j;
        switch (i13) {
            case 0:
                Context requireContext = vVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                return new GestaltDivider(6, requireContext, (AttributeSet) null).a(t.f48264j);
            case 1:
                Space space = new Space(vVar.getContext());
                Resources resources = space.getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                space.setLayoutParams(new LinearLayout.LayoutParams(0, bs1.c.U(eo1.c.space_400, resources)));
                return space;
            case 2:
                Context requireContext2 = vVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                return new ExpandableSectionView(requireContext2);
            default:
                int dimensionPixelSize = vVar.getResources().getDimensionPixelSize(eo1.c.space_400);
                Context requireContext3 = vVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext3, "requireContext(...)");
                GestaltText gestaltText = new GestaltText(6, requireContext3, (AttributeSet) null);
                gestaltText.i(t.f48265k);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2, 1.0f);
                layoutParams.setMargins(dimensionPixelSize, 0, dimensionPixelSize, 0);
                gestaltText.setLayoutParams(layoutParams);
                return gestaltText;
        }
    }
}
