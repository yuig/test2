package l81;

import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import rm1.q;
import u50.k0;

/* loaded from: classes5.dex */
public final class g extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f82133i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ l f82134j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(l lVar, int i13) {
        super(1);
        this.f82133i = i13;
        this.f82134j = lVar;
    }

    public final om1.c b(om1.c it) {
        fm1.c cVar;
        int i13 = this.f82133i;
        l lVar = this.f82134j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                k0 k0Var = new k0(le0.h.action_sheet_close);
                int i14 = l.Q2;
                if (lVar.v9()) {
                    GestaltIconButton gestaltIconButton = lVar.Q1;
                    if (gestaltIconButton != null) {
                        gestaltIconButton.setAlpha(0.0f);
                    }
                    cVar = fm1.c.VISIBLE;
                } else {
                    cVar = fm1.c.GONE;
                }
                return om1.c.e(it, null, null, null, cVar, k0Var, false, 0, 999);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return om1.c.e(it, q.ARROW_DOWN, null, lVar.f82188u2 ? om1.f.TRANSPARENT_ALWAYS_LIGHT : om1.f.TRANSPARENT_DARK_GRAY, null, null, false, 0, 1018);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f82133i) {
        }
        return b((om1.c) obj);
    }
}
