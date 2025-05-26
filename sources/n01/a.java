package n01;

import android.os.Bundle;
import android.view.View;
import com.pinterest.api.model.xc0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import i01.y0;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import p01.i;
import q01.m;
import q01.p;

/* loaded from: classes5.dex */
public final class a implements y0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f88799a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ xc0 f88800b;

    public a(b bVar, xc0 xc0Var) {
        this.f88799a = bVar;
        this.f88800b = xc0Var;
    }

    @Override // i01.y0
    public final void R0(String filterTabOptionId) {
        Intrinsics.checkNotNullParameter(filterTabOptionId, "filterTabOptionId");
        b bVar = this.f88799a;
        i iVar = bVar.f88803j;
        iVar.getClass();
        xc0 option = this.f88800b;
        Intrinsics.checkNotNullParameter(option, "option");
        boolean d2 = Intrinsics.d(option, iVar.f98377b);
        int i13 = 1;
        i iVar2 = bVar.f88803j;
        if (d2) {
            iVar2.getClass();
            Intrinsics.checkNotNullParameter(option, "option");
            iVar2.f98379d = true;
            iVar2.f98377b = null;
            iVar2.w3(option);
            iVar2.t3(false, option);
            if (iVar2.isBound()) {
                m01.b bVar2 = (m01.b) iVar2.getView();
                String relatedFilterTabId = iVar2.f98376a.f85272c.getUid();
                Intrinsics.checkNotNullExpressionValue(relatedFilterTabId, "getUid(...)");
                p pVar = (p) bVar2;
                pVar.getClass();
                Intrinsics.checkNotNullParameter(relatedFilterTabId, "relatedFilterTabId");
                Bundle result = new Bundle();
                result.putString("filter_tab_id", relatedFilterTabId);
                result.putString("query_pin_id", ((m01.a) pVar.D0.getValue()).f85270a);
                Unit unit = Unit.f80348a;
                Intrinsics.checkNotNullParameter(result, "result");
                pVar.P6(String.valueOf(RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_HAIR_PATTERN_QUERIES_MODULE), result);
                View view = pVar.getView();
                if (view != null) {
                    view.postDelayed(new m(pVar, i13), 300L);
                    return;
                }
                return;
            }
            return;
        }
        iVar2.getClass();
        Intrinsics.checkNotNullParameter(option, "option");
        iVar2.f98379d = true;
        xc0 xc0Var = iVar2.f98377b;
        iVar2.f98377b = option;
        if (xc0Var != null) {
            iVar2.w3(xc0Var);
        }
        iVar2.w3(option);
        iVar2.t3(true, option);
        if (iVar2.isBound()) {
            m01.b bVar3 = (m01.b) iVar2.getView();
            String selectedOptionId = option.getUid();
            Intrinsics.checkNotNullExpressionValue(selectedOptionId, "getUid(...)");
            String relatedFilterTabId2 = iVar2.f98376a.f85272c.getUid();
            Intrinsics.checkNotNullExpressionValue(relatedFilterTabId2, "getUid(...)");
            p pVar2 = (p) bVar3;
            pVar2.getClass();
            Intrinsics.checkNotNullParameter(selectedOptionId, "selectedOptionId");
            Intrinsics.checkNotNullParameter(relatedFilterTabId2, "relatedFilterTabId");
            Bundle result2 = new Bundle();
            result2.putString("filter_tab_id", relatedFilterTabId2);
            result2.putString("selected_option_id", selectedOptionId);
            result2.putString("query_pin_id", ((m01.a) pVar2.D0.getValue()).f85270a);
            Unit unit2 = Unit.f80348a;
            Intrinsics.checkNotNullParameter(result2, "result");
            pVar2.P6(String.valueOf(100), result2);
            View view2 = pVar2.getView();
            if (view2 != null) {
                view2.postDelayed(new m(pVar2, i13), 300L);
            }
        }
    }
}
