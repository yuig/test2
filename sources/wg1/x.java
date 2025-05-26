package wg1;

import android.content.Context;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;

/* loaded from: classes5.dex */
public final class x extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f129856i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ z f129857j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(z zVar, int i13) {
        super(1);
        this.f129856i = i13;
        this.f129857j = zVar;
    }

    public final rn1.a b(rn1.a it) {
        int i13 = this.f129856i;
        z zVar = this.f129857j;
        switch (i13) {
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                CharSequence text = zVar.f129885s.getText();
                return rn1.a.y(it, null, null, null, null, null, 0, d7.b.Z(!(text == null || text.length() == 0)), null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097087);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                Context context = zVar.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                boolean T1 = dl2.b.T1(context);
                GestaltText gestaltText = zVar.f129885s;
                if (T1) {
                    return rn1.a.y(it, null, vn1.c.LIGHT, null, null, gestaltText.getLineCount() == 2 ? vn1.g.HEADING_200 : vn1.g.HEADING_400, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097133);
                }
                return rn1.a.y(it, null, vn1.c.LIGHT, null, null, gestaltText.getLineCount() == 2 ? vn1.g.BODY_300 : vn1.g.UI_400, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097133);
        }
    }

    public final yl1.b e(yl1.b it) {
        String b23;
        String b24;
        int i13 = this.f129856i;
        z zVar = this.f129857j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                if (zVar.D(zVar.f129892z)) {
                    b23 = bs1.c.b2(x0.pin_action_default);
                    Intrinsics.f(b23);
                } else {
                    b23 = bs1.c.b2(x0.direct_to_offsite_visit_site);
                    Intrinsics.f(b23);
                }
                return yl1.b.f(it, bs1.c.h2(b23), false, null, null, null, null, null, null, 0, null, 1022);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                if (zVar.D(zVar.f129892z)) {
                    b24 = bs1.c.b2(x0.pin_action_default);
                    Intrinsics.f(b24);
                } else {
                    b24 = bs1.c.b2(x0.direct_to_offsite_visit_site);
                    Intrinsics.f(b24);
                }
                return yl1.b.f(it, bs1.c.h2(b24), false, fm1.c.VISIBLE, null, null, null, null, null, 0, null, 1018);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f129856i) {
            case 0:
                return e((yl1.b) obj);
            case 1:
                return b((rn1.a) obj);
            case 2:
                return e((yl1.b) obj);
            default:
                return b((rn1.a) obj);
        }
    }
}
