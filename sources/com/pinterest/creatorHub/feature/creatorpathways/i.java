package com.pinterest.creatorHub.feature.creatorpathways;

import android.content.Context;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import kg.t;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import ku1.l;
import nx.d0;

/* loaded from: classes5.dex */
public final class i extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final i f44793j = new i(0);

    /* renamed from: k, reason: collision with root package name */
    public static final i f44794k = new i(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f44795i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(int i13) {
        super(1);
        this.f44795i = i13;
    }

    public final void b(c dismissModalAfterAction) {
        switch (this.f44795i) {
            case 0:
                Intrinsics.checkNotNullParameter(dismissModalAfterAction, "$this$dismissModalAfterAction");
                f fVar = (f) dismissModalAfterAction;
                d0 s73 = fVar.s7();
                Context requireContext = fVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                t.M0(s73, requireContext, ou1.e.CREATOR_PATHWAYS_CREATE_BUTTON, null, null, 0, 56);
                return;
            default:
                Intrinsics.checkNotNullParameter(dismissModalAfterAction, "$this$dismissModalAfterAction");
                f fVar2 = (f) dismissModalAfterAction;
                fVar2.getClass();
                Intrinsics.checkNotNullParameter("https://help.pinterest.com/en/business/article/pin-stats", "url");
                l lVar = fVar2.f44786k0;
                if (lVar == null) {
                    Intrinsics.r("uriNavigator");
                    throw null;
                }
                Context requireContext2 = fVar2.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                l.b(lVar, requireContext2, "https://help.pinterest.com/en/business/article/pin-stats", false, false, null, null, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_GRID_CELL);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f44795i) {
            case 0:
                b((c) obj);
                break;
            default:
                b((c) obj);
                break;
        }
        return Unit.f80348a;
    }
}
