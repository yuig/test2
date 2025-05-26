package go0;

import com.pinterest.api.model.ba;
import dl1.s;
import kotlin.jvm.internal.Intrinsics;
import m60.g0;
import qz.f0;

/* loaded from: classes5.dex */
public final class i extends com.pinterest.framework.multisection.datasource.pagedlist.c {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(String boardId, a listener, g0 pageSizeProvider, final String boardSectionId, x12.a pagedListService, nr0.l viewBinderDelegate) {
        super(a.a.p(new StringBuilder("board/"), boardId, "/sections/all/"), viewBinderDelegate, null, null, null, new ke0.a[]{gh0.b.L()}, new lk1.a() { // from class: com.pinterest.feature.boardsection.picker.presenter.BoardSectionPickerSectionsPagedList$1
            @Override // lk1.a
            public final boolean b(s model) {
                Intrinsics.checkNotNullParameter(model, "model");
                return Intrinsics.d(boardSectionId, model.getUid());
            }
        }, pagedListService, null, 0L, null, 7836);
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(pageSizeProvider, "pageSizeProvider");
        Intrinsics.checkNotNullParameter(boardSectionId, "boardSectionId");
        Intrinsics.checkNotNullParameter(pagedListService, "pagedListService");
        Intrinsics.checkNotNullParameter(viewBinderDelegate, "viewBinderDelegate");
        f0 f0Var = new f0();
        f0Var.e("fields", n00.b.a(n00.c.BOARD_SECTION_SUMMARY));
        f0Var.e("page_size", pageSizeProvider.d());
        this.f49121k = f0Var;
        o(465540, new h90.m(listener));
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.c, nr0.g
    public final boolean f(int i13) {
        if (i13 == 465540) {
            return true;
        }
        return this.E.f(i13);
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.c, sq0.e0
    public final int getItemViewType(int i13) {
        if (getItem(i13) instanceof ba) {
            return 465540;
        }
        return this.E.getItemViewType(i13);
    }
}
