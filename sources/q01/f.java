package q01;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import u50.h0;
import u50.i0;
import u50.k0;

/* loaded from: classes5.dex */
public final class f extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f101781i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i f101782j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(i iVar, int i13) {
        super(1);
        this.f101781i = i13;
        this.f101782j = iVar;
    }

    public final rn1.a b(rn1.a it) {
        int i13;
        int i14;
        int i15 = this.f101781i;
        i iVar = this.f101782j;
        switch (i15) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                int i16 = e.f101780a[iVar.f101790e.ordinal()];
                if (i16 == 1) {
                    i13 = n80.f.pin_closeup_onebar_filtered_feed_error_title;
                } else if (i16 == 2) {
                    i13 = n80.f.pin_closeup_onebar_filtered_feed_empty_title;
                } else {
                    if (i16 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i13 = n80.f.related_pins_filtered_feed_footer_text;
                }
                return rn1.a.y(it, new k0(i13), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                int i17 = g.f101783a[iVar.f101790e.ordinal()];
                if (i17 == 1) {
                    i14 = n80.f.pin_closeup_onebar_filtered_feed_error_subtitle;
                } else if (i17 == 2) {
                    i14 = n80.f.pin_closeup_onebar_filtered_feed_message_subtitle;
                } else {
                    if (i17 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i14 = n80.f.pin_closeup_onebar_filtered_feed_message_subtitle;
                }
                return rn1.a.y(it, new k0(i14), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        i0 k0Var;
        switch (this.f101781i) {
            case 0:
                return b((rn1.a) obj);
            case 1:
                return b((rn1.a) obj);
            default:
                yl1.b it = (yl1.b) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                i iVar = this.f101782j;
                int i13 = h.f101784a[iVar.f101790e.ordinal()];
                if (i13 == 1) {
                    k0Var = new k0(n80.f.related_pins_filtered_feed_reload);
                } else if (i13 == 2) {
                    k0Var = new k0(n80.f.related_pins_onebar_filtered_feed_remove_all_filters_button);
                } else {
                    if (i13 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    k0Var = h0.f120562a;
                }
                return yl1.b.f(it, k0Var, false, iVar.f101790e == c.FOOTER ? fm1.c.GONE : fm1.c.VISIBLE, null, null, null, null, null, 0, null, 1018);
        }
    }
}
