package em0;

import android.content.res.Resources;
import com.pinterest.feature.board.organize.view.BoardAndSectionOrganizeCell;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import le0.g;

/* loaded from: classes5.dex */
public final class a extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f59581i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ BoardAndSectionOrganizeCell f59582j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f59583k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(BoardAndSectionOrganizeCell boardAndSectionOrganizeCell, int i13, int i14) {
        super(1);
        this.f59581i = i14;
        this.f59582j = boardAndSectionOrganizeCell;
        this.f59583k = i13;
    }

    public final rm1.d b(rm1.d it) {
        int i13 = this.f59581i;
        int i14 = this.f59583k;
        BoardAndSectionOrganizeCell boardAndSectionOrganizeCell = this.f59582j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                int i15 = BoardAndSectionOrganizeCell.f45295i;
                boardAndSectionOrganizeCell.getClass();
                return rm1.d.e(it, null, null, d7.b.Z((i14 & 2) == 2), 0, null, 27);
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                int i16 = BoardAndSectionOrganizeCell.f45295i;
                boardAndSectionOrganizeCell.getClass();
                return rm1.d.e(it, null, null, d7.b.Z((i14 & 4) == 4), 0, null, 27);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                int i17 = BoardAndSectionOrganizeCell.f45295i;
                boardAndSectionOrganizeCell.getClass();
                return rm1.d.e(it, null, null, d7.b.Z((i14 & 8) == 8), 0, null, 27);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f59581i) {
            case 0:
                return b((rm1.d) obj);
            case 1:
                return b((rm1.d) obj);
            case 2:
                return b((rm1.d) obj);
            default:
                rn1.a it = (rn1.a) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                Resources resources = this.f59582j.getResources();
                int i13 = g.plural_pins;
                int i14 = this.f59583k;
                String quantityString = resources.getQuantityString(i13, i14, Integer.valueOf(i14));
                Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
                return rn1.a.y(it, bs1.c.h2(quantityString), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
        }
    }
}
