package dm0;

import com.pinterest.api.model.v7;
import com.pinterest.feature.board.organize.f;
import com.pinterest.feature.board.organize.view.BoardAndSectionOrganizeCell;
import com.pinterest.ui.imageview.ProportionalImageView;
import df.j1;
import java.util.Iterator;
import java.util.List;
import kh2.k3;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import pk.a0;
import yk1.r;

/* loaded from: classes5.dex */
public final class a extends yk1.c {

    /* renamed from: a, reason: collision with root package name */
    public v7 f55333a;

    /* renamed from: b, reason: collision with root package name */
    public f f55334b;

    @Override // yk1.p
    /* renamed from: q3, reason: merged with bridge method [inline-methods] */
    public final void r3(com.pinterest.feature.board.organize.a view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((r) view);
        r3(this.f55333a);
        boolean z13 = this.f55334b == f.BOARD_ORGANIZE_MODE_REORDER;
        BoardAndSectionOrganizeCell boardAndSectionOrganizeCell = (BoardAndSectionOrganizeCell) view;
        boardAndSectionOrganizeCell.f45303h = z13;
        k3.R1(boardAndSectionOrganizeCell.f45299d, z13);
    }

    public final void r3(v7 v7Var) {
        v7 v7Var2;
        String thumbnailUrl;
        Unit unit;
        List I0;
        this.f55333a = v7Var;
        if (!isBound() || (v7Var2 = this.f55333a) == null) {
            return;
        }
        com.pinterest.feature.board.organize.a aVar = (com.pinterest.feature.board.organize.a) getView();
        String name = v7Var2.j1();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        BoardAndSectionOrganizeCell boardAndSectionOrganizeCell = (BoardAndSectionOrganizeCell) aVar;
        boardAndSectionOrganizeCell.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        a0.p(boardAndSectionOrganizeCell.f45297b, name);
        Boolean Y0 = v7Var2.Y0();
        Intrinsics.checkNotNullExpressionValue(Y0, "getHasCustomCover(...)");
        if (!Y0.booleanValue() || !j1.d1(kh2.d.L(v7Var2))) {
            Iterator it = kh2.d.h1(v7Var2).iterator();
            while (true) {
                if (!it.hasNext()) {
                    thumbnailUrl = null;
                    break;
                }
                String str = (String) it.next();
                if (j1.d1(str)) {
                    thumbnailUrl = str;
                    break;
                }
            }
        } else {
            thumbnailUrl = kh2.d.L(v7Var2);
        }
        if (thumbnailUrl != null) {
            BoardAndSectionOrganizeCell boardAndSectionOrganizeCell2 = (BoardAndSectionOrganizeCell) ((com.pinterest.feature.board.organize.a) getView());
            boardAndSectionOrganizeCell2.getClass();
            Intrinsics.checkNotNullParameter(thumbnailUrl, "thumbnailUrl");
            boardAndSectionOrganizeCell2.f45296a.loadUrl(thumbnailUrl);
            unit = Unit.f80348a;
        } else {
            unit = null;
        }
        if (unit == null) {
            BoardAndSectionOrganizeCell boardAndSectionOrganizeCell3 = (BoardAndSectionOrganizeCell) ((com.pinterest.feature.board.organize.a) getView());
            ProportionalImageView proportionalImageView = boardAndSectionOrganizeCell3.f45296a;
            proportionalImageView.setImageDrawable(null);
            proportionalImageView.setBackgroundColor(dl2.b.y0(boardAndSectionOrganizeCell3, eo1.a.color_gray_roboflow_400));
        }
        int i13 = kh2.d.M0(v7Var2) ? 2 : 0;
        Boolean g13 = v7Var2.g1();
        Intrinsics.checkNotNullExpressionValue(g13, "getIsCollaborative(...)");
        if (g13.booleanValue() && (I0 = v7Var2.I0()) != null && I0.size() > 1) {
            i13 |= 4;
        }
        if (kh2.d.A0(v7Var2)) {
            i13 |= 8;
        }
        BoardAndSectionOrganizeCell boardAndSectionOrganizeCell4 = (BoardAndSectionOrganizeCell) ((com.pinterest.feature.board.organize.a) getView());
        boardAndSectionOrganizeCell4.getClass();
        boardAndSectionOrganizeCell4.f45300e.g2(new em0.a(boardAndSectionOrganizeCell4, i13, 0));
        boardAndSectionOrganizeCell4.f45301f.g2(new em0.a(boardAndSectionOrganizeCell4, i13, 1));
        boardAndSectionOrganizeCell4.f45302g.g2(new em0.a(boardAndSectionOrganizeCell4, i13, 2));
        com.pinterest.feature.board.organize.a aVar2 = (com.pinterest.feature.board.organize.a) getView();
        Integer l13 = v7Var2.l1();
        Intrinsics.checkNotNullExpressionValue(l13, "getPinCount(...)");
        int intValue = l13.intValue();
        BoardAndSectionOrganizeCell boardAndSectionOrganizeCell5 = (BoardAndSectionOrganizeCell) aVar2;
        boardAndSectionOrganizeCell5.getClass();
        boardAndSectionOrganizeCell5.f45298c.i(new em0.a(boardAndSectionOrganizeCell5, intValue, 3));
    }
}
