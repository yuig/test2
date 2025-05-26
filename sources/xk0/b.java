package xk0;

import com.pinterest.feature.board.detail.header.view.lego.LegoBoardDetailHeader;
import df.j1;
import java.util.Locale;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import m60.x0;

/* loaded from: classes5.dex */
public final class b extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f135175i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ LegoBoardDetailHeader f135176j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(LegoBoardDetailHeader legoBoardDetailHeader, int i13) {
        super(1);
        this.f135175i = i13;
        this.f135176j = legoBoardDetailHeader;
    }

    public final un1.c b(un1.c it) {
        int i13 = this.f135175i;
        LegoBoardDetailHeader legoBoardDetailHeader = this.f135176j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                String lowerCase = bs1.c.f2(legoBoardDetailHeader, x0.more_no_dot).toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                return un1.c.y(it, null, null, 0, null, false, null, null, 0, bs1.c.h2(lowerCase), false, 458751);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                String str = legoBoardDetailHeader.L;
                if (str == null) {
                    str = "";
                }
                return un1.c.y(it, bs1.c.h2(str), null, 0, d7.b.Z(j1.U0(legoBoardDetailHeader.L)), false, null, null, 0, null, false, 524222);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f135175i) {
        }
        return b((un1.c) obj);
    }
}
