package x61;

import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import rm1.q;

/* loaded from: classes5.dex */
public final class i extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f133943i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ GestaltIconButton f133944j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(GestaltIconButton gestaltIconButton, int i13) {
        super(1);
        this.f133943i = i13;
        this.f133944j = gestaltIconButton;
    }

    public final om1.c b(om1.c it) {
        int i13 = this.f133943i;
        GestaltIconButton gestaltIconButton = this.f133944j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return om1.c.e(it, q.INFO_CIRCLE, om1.e.LG, om1.f.TRANSPARENT_DARK_GRAY, null, d7.g.q(gestaltIconButton.getResources(), m42.e.search_results_hair_info_button, "getString(...)"), false, m42.c.hair_pattern_selector_info, 744);
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                q qVar = q.EYE;
                om1.e eVar = om1.e.MD;
                om1.f fVar = om1.f.DEFAULT_ALWAYS_LIGHT;
                String string = gestaltIconButton.getResources().getString(uc2.h.try_on_switch_to_makeup_category, f42.c.EYESHADOW.toString());
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                return om1.c.e(it, qVar, eVar, fVar, null, bs1.c.h2(string), false, 0, 1000);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                q qVar2 = q.LIPS;
                om1.e eVar2 = om1.e.MD;
                om1.f fVar2 = om1.f.DEFAULT_ALWAYS_LIGHT;
                String string2 = gestaltIconButton.getResources().getString(uc2.h.try_on_switch_to_makeup_category, f42.c.LIPCOLOR.toString());
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                return om1.c.e(it, qVar2, eVar2, fVar2, null, bs1.c.h2(string2), false, 0, 1000);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f133943i) {
        }
        return b((om1.c) obj);
    }
}
