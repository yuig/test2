package go0;

import com.pinterest.api.model.v7;
import dl1.s;
import kotlin.jvm.internal.Intrinsics;
import m60.g0;
import qz.f0;

/* loaded from: classes5.dex */
public final class d extends com.pinterest.framework.multisection.datasource.pagedlist.c {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(String userId, a listener, g0 pageSizeProvider, final String str, x12.a pagedListService, nr0.l viewBinderDelegate, final boolean z13) {
        super(a.a.p(new StringBuilder("users/"), userId, "/boards/feed/"), viewBinderDelegate, null, null, null, new ke0.a[]{gh0.b.K()}, new lk1.a() { // from class: com.pinterest.feature.boardsection.picker.presenter.BoardSectionPickerAllBoardsPagedList$1
            @Override // lk1.a
            public final boolean b(s model) {
                Intrinsics.checkNotNullParameter(model, "model");
                if (!z13 && (model instanceof v7)) {
                    Boolean f13 = ((v7) model).f1();
                    Intrinsics.checkNotNullExpressionValue(f13, "getIsAdsOnly(...)");
                    if (f13.booleanValue()) {
                        return true;
                    }
                }
                return Intrinsics.d(str, model.getUid());
            }
        }, pagedListService, null, 0L, null, 7836);
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(pageSizeProvider, "pageSizeProvider");
        Intrinsics.checkNotNullParameter(pagedListService, "pagedListService");
        Intrinsics.checkNotNullParameter(viewBinderDelegate, "viewBinderDelegate");
        f0 f0Var = new f0();
        f0Var.e("fields", n00.b.a(n00.c.BOARD_PICKER_FRAGMENT));
        f0Var.e("sort", "alphabetical");
        f0Var.e("page_size", pageSizeProvider.d());
        this.f49121k = f0Var;
        o(465541, new yi0.a(listener, str));
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.c, nr0.g
    public final boolean f(int i13) {
        if (i13 == 465541) {
            return true;
        }
        return this.E.f(i13);
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.c, sq0.e0
    public final int getItemViewType(int i13) {
        if (getItem(i13) instanceof v7) {
            return 465541;
        }
        return this.E.getItemViewType(i13);
    }
}
