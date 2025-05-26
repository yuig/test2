package jq1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import m60.x0;
import rm1.q;

/* loaded from: classes5.dex */
public final class k extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final k f77490j = new k(0);

    /* renamed from: k, reason: collision with root package name */
    public static final k f77491k = new k(1);

    /* renamed from: l, reason: collision with root package name */
    public static final k f77492l = new k(2);

    /* renamed from: m, reason: collision with root package name */
    public static final k f77493m = new k(3);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f77494i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(int i13) {
        super(1);
        this.f77494i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f77494i) {
            case 0:
                om1.c state = (om1.c) obj;
                Intrinsics.checkNotNullParameter(state, "state");
                return om1.c.e(state, q.CANCEL, om1.e.MD, om1.f.TRANSPARENT_DARK_GRAY, null, bs1.c.j2(new String[0], x0.cancel), false, 0, 1000);
            case 1:
                yl1.b it = (yl1.b) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, null, false, fm1.c.GONE, null, null, null, null, null, 0, null, 1019);
            case 2:
                rl1.q it2 = (rl1.q) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                return rl1.q.e(it2, null, null, false, null, null, false, false, null, 0, null, null, 2043);
            default:
                rn1.a it3 = (rn1.a) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                return rn1.a.y(it3, bs1.c.j2(new String[0], fq1.d.idea_pin_list_affiliate_link_indicator_text), null, null, null, null, 0, fm1.c.VISIBLE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
        }
    }
}
