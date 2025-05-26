package ec0;

import android.content.Context;
import android.util.AttributeSet;
import com.pinterest.component.board.view.LegoBoardRep;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class h extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f58385i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ LegoBoardRep f58386j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(LegoBoardRep legoBoardRep, int i13) {
        super(0);
        this.f58385i = i13;
        this.f58386j = legoBoardRep;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f58385i;
        LegoBoardRep legoBoardRep = this.f58386j;
        switch (i13) {
            case 0:
                int i14 = LegoBoardRep.E;
                legoBoardRep.g0();
                return Unit.f80348a;
            default:
                Context context = legoBoardRep.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                GestaltText gestaltText = new GestaltText(6, context, (AttributeSet) null);
                pp2.a.k(gestaltText, c.f58376o);
                return gestaltText;
        }
    }
}
