package bx0;

import android.content.Context;
import h32.a4;
import h32.d4;
import h32.g0;
import h32.i0;
import h32.u0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;
import u50.f0;

/* loaded from: classes5.dex */
public final class b extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f24024i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i f24025j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(i iVar, int i13) {
        super(1);
        this.f24024i = i13;
        this.f24025j = iVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        i0 i0Var;
        int i13 = this.f24024i;
        i iVar = this.f24025j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter((xl1.a) obj, "it");
                u50.r rVar = iVar.f24056m;
                if (rVar != null) {
                    Context context = iVar.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    d0 d0Var = iVar.f24047d;
                    Intrinsics.checkNotNullParameter(d0Var, "<this>");
                    i0 source = d0Var.p();
                    if (source != null) {
                        Intrinsics.checkNotNullParameter(source, "source");
                        d4 d4Var = source.f67081a;
                        if (d4Var == null) {
                            d4Var = d4.BOARD;
                        }
                        d4 d4Var2 = d4Var;
                        a4 a4Var = source.f67082b;
                        if (a4Var == null) {
                            a4Var = a4.BOARD_SELF;
                        }
                        i0Var = new i0(d4Var2, a4Var, source.f67083c, g0.SHOP_YOUR_SAVES_MODULE, source.f67085e, u0.SEE_MORE_BUTTON);
                    } else {
                        i0Var = new i0(d4.BOARD, a4.BOARD_SELF, null, g0.SHOP_YOUR_SAVES_MODULE, null, u0.SEE_MORE_BUTTON);
                    }
                    rVar.a(new r(context, i0Var));
                }
                return Unit.f80348a;
            default:
                rn1.a it = (rn1.a) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                String string = iVar.getResources().getString(f62.e.see_it_styled_product_title_v2);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                Intrinsics.checkNotNullParameter(string, "string");
                return rn1.a.y(it, new f0(string), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
        }
    }
}
