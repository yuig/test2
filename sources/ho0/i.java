package ho0;

import android.view.View;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.m3;
import h32.u0;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;

/* loaded from: classes5.dex */
public final /* synthetic */ class i implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f69701a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f69702b;

    public /* synthetic */ i(k kVar, int i13) {
        this.f69701a = i13;
        this.f69702b = kVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i13 = this.f69701a;
        k this$0 = this.f69702b;
        switch (i13) {
            case 0:
                int i14 = k.f69704y1;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                go0.m mVar = this$0.f69705g1;
                if (mVar != null) {
                    mVar.U0();
                    return;
                } else {
                    Intrinsics.r("viewListener");
                    throw null;
                }
            default:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                go0.m mVar2 = this$0.f69705g1;
                if (mVar2 == null) {
                    Intrinsics.r("viewListener");
                    throw null;
                }
                d dVar = (d) ((fo0.b) mVar2.getView());
                ig1.b.L0(dVar.getContext(), dVar.getView(), false, false);
                d0 pinalytics = mVar2.getPinalytics();
                u0 u0Var = u0.BOARD_SECTION_ADD_BUTTON;
                HashMap hashMap = new HashMap();
                com.pinterest.feature.boardsection.a aVar = com.pinterest.feature.boardsection.a.BOARD_ADD_SECTION;
                hashMap.put("reason", aVar.getValue());
                Unit unit = Unit.f80348a;
                pinalytics.Z(u0Var, hashMap);
                fo0.b bVar = (fo0.b) mVar2.getView();
                String boardId = mVar2.f65873i;
                if (boardId == null) {
                    boardId = "";
                }
                k kVar = (k) bVar;
                kVar.getClass();
                Intrinsics.checkNotNullParameter(boardId, "boardId");
                NavigationImpl L = Navigation.L(m3.d(), "", ml1.b.MODAL_TRANSITION.getValue());
                L.m0("com.pinterest.EXTRA_BOARD_ID", boardId);
                ArrayList arrayList = kVar.f69707i1;
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                L.d("com.pinterest.EXTRA_SELECTED_PIN_IDS_LIST", arrayList);
                hk0.m mVar3 = kVar.f69706h1;
                if (mVar3 == null) {
                    Intrinsics.r("sourceLocation");
                    throw null;
                }
                int i15 = j.f69703a[mVar3.ordinal()];
                if (i15 == 1 || i15 == 2) {
                    L.m0("com.pinterest.EXTRA_BOARD_SECTION_ACTION_MODE", com.pinterest.feature.boardsection.a.BOARD_ORGANIZE_PINS.toString());
                } else if (i15 != 3) {
                    L.m0("com.pinterest.EXTRA_BOARD_SECTION_ACTION_MODE", aVar.toString());
                } else {
                    L.m0("com.pinterest.EXTRA_BOARD_SECTION_ACTION_MODE", com.pinterest.feature.boardsection.a.BOARD_SECTION_ORGANIZE_PINS.toString());
                }
                L.Y1("com.pinterest.EXTRA_IS_SELECT_ALL_MODE_ACTIVE", kVar.f69714p1);
                L.d("com.pinterest.EXTRA_SELECT_ALL_EXCLUDE_PINS", kVar.f69713o1);
                L.m0("com.pinterest.EXTRA_BULK_MOVE_ORIGIN_BOARD_ID", kVar.f69708j1);
                L.m0("com.pinterest.EXTRA_PIN_MOVE_ORIGIN_BOARD_SECTION_ID", kVar.f69709k1);
                kVar.M1(L);
                return;
        }
    }
}
