package zn1;

import br1.e0;
import com.google.android.gms.ads.AdSize;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.gestalt.textfield.view.GestaltTextField;
import i1.m0;
import i2.o;
import kl2.l;
import kotlin.Unit;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import u2.n;
import u2.q;
import u5.x;

/* loaded from: classes2.dex */
public final class d extends s implements l {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f142299i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f142300j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj, int i13) {
        super(3);
        this.f142299i = i13;
        this.f142300j = obj;
    }

    public final void b(String event, String action, String phase) {
        int i13 = this.f142299i;
        Object obj = this.f142300j;
        switch (i13) {
            case 3:
                Intrinsics.checkNotNullParameter(event, "event");
                Intrinsics.checkNotNullParameter(action, "action");
                Intrinsics.checkNotNullParameter(phase, "phase");
                or1.i iVar = ((pr1.h) obj).f101192f;
                if (iVar != null) {
                    iVar.i(event, action, phase);
                    return;
                } else {
                    Intrinsics.r("authLoggingUtils");
                    throw null;
                }
            default:
                Intrinsics.checkNotNullParameter(event, "event");
                Intrinsics.checkNotNullParameter(action, "action");
                Intrinsics.checkNotNullParameter(phase, "phase");
                ((com.pinterest.security.i) obj).f51760d.i(event, action, phase);
                return;
        }
    }

    @Override // kl2.l
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i13 = this.f142299i;
        Object obj4 = this.f142300j;
        switch (i13) {
            case 0:
                int intValue = ((Number) obj2).intValue();
                int intValue2 = ((Number) obj3).intValue();
                x xVar = (x) obj4;
                ((GestaltTextField) xVar.f120537c).T0();
                xVar.d(intValue, intValue2, String.valueOf((CharSequence) obj));
                break;
            case 1:
                androidx.compose.foundation.layout.d BoxWithConstraints = (androidx.compose.foundation.layout.d) obj;
                o oVar = (o) obj2;
                int intValue3 = ((Number) obj3).intValue();
                Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
                if ((intValue3 & 14) == 0) {
                    intValue3 |= ((i2.s) oVar).h(BoxWithConstraints) ? 4 : 2;
                }
                if ((intValue3 & 91) == 18) {
                    i2.s sVar = (i2.s) oVar;
                    if (sVar.z()) {
                        sVar.Q();
                        break;
                    }
                }
                float c13 = BoxWithConstraints.c() * 0.27f;
                float f13 = 0.2f * c13;
                float c14 = BoxWithConstraints.c() * (-0.05f);
                n nVar = n.f120041b;
                u2.f fVar = new u2.f(1.0f, 1.0f);
                androidx.compose.foundation.layout.c cVar = androidx.compose.foundation.layout.c.f17179a;
                br1.f fVar2 = (br1.f) obj4;
                e0.j(e0.p(androidx.compose.foundation.layout.b.d(androidx.compose.foundation.layout.e.e(cVar.a(nVar, fVar), c13), 1.0f), 200, 330, 1360, 0.73f, f0.j(new br1.c(BoxWithConstraints.d() * (-0.12f), c13, 0.0f), new br1.c(BoxWithConstraints.d() * (-0.07f), BoxWithConstraints.c() * 0.16f, 0.24f), new br1.c(0.6f * f13, BoxWithConstraints.c() * 0.02f, 0.7f), new br1.c(f13, c14, 1.0f)), fVar2, oVar, 28080, 0), oVar, 0, 0);
                float c15 = BoxWithConstraints.c() * 0.5f;
                e0.f("https://i.pinimg.com/originals/23/8e/ff/238effe944d46a1f8e437b0eb26e5873.webp", androidx.compose.ui.graphics.a.e(RecyclerViewTypes.VIEW_TYPE_CAROUSEL_VIDEO_CELL, RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_FOOTER, RecyclerViewTypes.VIEW_TYPE_LIVE_SINGLE_COLUMN_UPSELL), e0.p(androidx.compose.foundation.layout.b.d(androidx.compose.foundation.layout.e.e(cVar.a(nVar, new u2.f(1.0f, -1.0f)), c15), 0.72f), 70, 460, 1090, 0.65f, f0.j(new br1.c(BoxWithConstraints.d() * (-0.17f), -c15, 0.0f), new br1.c(BoxWithConstraints.d() * (-0.15f), BoxWithConstraints.c() * (-0.28f), 0.28f), new br1.c(BoxWithConstraints.d() * (-0.02f), BoxWithConstraints.c() * (-0.48f), 0.7f), new br1.c(7, -(0.93f * c15), 1.0f)), fVar2, oVar, 28080, 0), oVar, 54, 0);
                float c16 = BoxWithConstraints.c() * 0.48f;
                float f14 = 0.13f * c16;
                float f15 = c16 * 0.5f;
                q d2 = androidx.compose.foundation.layout.b.d(androidx.compose.foundation.layout.e.e(cVar.a(nVar, new u2.f(-1.0f, -1.0f)), c16), 0.85f);
                float f16 = -c16;
                float f17 = -f14;
                float f18 = -f15;
                e0.k(e0.p(d2, 30, 550, 1480, 0.65f, f0.j(new br1.c(BoxWithConstraints.d() * 0.15f, f16, 0.0f), new br1.c(BoxWithConstraints.d() * 0.1f, f16 * 0.17f, 0.43f), new br1.c(0.73f * f17, 1.05f * f18, 0.75f), new br1.c(0.97f * f17, f18 * 1.03f, 0.88f), new br1.c(f17, f18, 1.0f)), fVar2, oVar, 28080, 0), oVar, 0, 0);
                float c17 = BoxWithConstraints.c() * 0.47f;
                float f19 = c17 * 0.78f;
                q d13 = androidx.compose.foundation.layout.b.d(androidx.compose.foundation.layout.e.e(cVar.a(nVar, new u2.f(-1.0f, 1.0f)), c17), 0.78f);
                float f23 = 0;
                e0.i(e0.p(d13, RecyclerViewTypes.VIEW_TYPE_STORY_EDUCATION_BANNER, 340, 1030, 0.73f, f0.j(new br1.c(-f19, BoxWithConstraints.c() * (-0.02f), 0.0f), new br1.c(-29, f23, 1.0f)), fVar2, oVar, 28080, 0), oVar, 0, 0);
                float c18 = BoxWithConstraints.c() * 0.67f;
                float f24 = c18 * 0.78f;
                e0.f("https://i.pinimg.com/originals/77/af/c4/77afc477a0872f2d0bb429b0d7d53dda.webp", androidx.compose.ui.graphics.a.e(RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_USE_CASE_MODULE_CUSTOM_COVER, RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_USE_CASE_MODULE_STORY_PIN, RecyclerViewTypes.VIEW_TYPE_BUBBLE_IMAGE_GRID_REP), e0.p(d7.b.I0(androidx.compose.foundation.layout.b.d(androidx.compose.foundation.layout.e.e(cVar.a(nVar, new u2.f(0.0f, 0.0f)), c18), 0.78f), 1.0f), 0, AdSize.WIDE_SKYSCRAPER_HEIGHT, 710, 0.0f, f0.j(new br1.c(BoxWithConstraints.d() * (-0.12f), BoxWithConstraints.c() * 0.5f, 0.0f), new br1.c(f23, BoxWithConstraints.c() * (-0.02f), 1.0f)), fVar2, oVar, 3504, 8), oVar, 54, 0);
                float c19 = BoxWithConstraints.c() * 0.27f;
                float f25 = 2;
                float f26 = (c19 * 0.75f) / f25;
                float d14 = (f26 * 0.72f) + (BoxWithConstraints.d() / f25);
                float f27 = ((f24 / f25) + f26) - 22;
                e0.l(e0.p(androidx.compose.foundation.layout.b.d(androidx.compose.foundation.layout.e.e(cVar.a(nVar, new u2.f(0.0f, 0.0f)), c19), 0.75f), RecyclerViewTypes.VIEW_TYPE_STORY_EDUCATION_BANNER, 340, 1160, 0.72f, f0.j(new br1.c(d14, BoxWithConstraints.c() * 0.07f, 0.0f), new br1.c(ep.b.a(d14, f27, 0.3f, f27), BoxWithConstraints.c() * (-0.04f), 0.55f), new br1.c(f27, BoxWithConstraints.c() * (-0.07f), 1.0f)), fVar2, oVar, 28080, 0), oVar, 0, 0);
            case 2:
                m0 AnimatedVisibility = (m0) obj;
                ((Number) obj3).intValue();
                Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                e0.d((br1.f0) obj4, null, (o) obj2, 8, 2);
                break;
            case 3:
                b((String) obj, (String) obj2, (String) obj3);
                break;
            default:
                b((String) obj, (String) obj2, (String) obj3);
                break;
        }
        return Unit.f80348a;
    }
}
