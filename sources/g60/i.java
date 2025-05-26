package g60;

import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.component.board.view.LegoBoardRep;
import kotlin.jvm.internal.Intrinsics;
import we1.n2;
import yk1.n;

/* loaded from: classes5.dex */
public final class i extends ConstraintLayout implements n {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f63713c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final h f63714a;

    /* renamed from: b, reason: collision with root package name */
    public final LegoBoardRep f63715b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Context context, n2 itemListener) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(itemListener, "itemListener");
        this.f63714a = itemListener;
        LegoBoardRep legoBoardRep = new LegoBoardRep(context);
        legoBoardRep.setId(f60.d.pin_cluster_board_rep);
        this.f63715b = legoBoardRep;
        addView(legoBoardRep);
        legoBoardRep.a0(new qc2.d(), e.f63705k);
        int W = bs1.c.W(this, eo1.c.space_100);
        setPadding(W, W, W, W);
    }
}
