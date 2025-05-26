package br1;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a extends kotlin.jvm.internal.s implements kl2.l {

    /* renamed from: i, reason: collision with root package name */
    public static final a f23758i = new a(3);

    @Override // kl2.l
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        androidx.compose.foundation.layout.d BoxWithConstraints = (androidx.compose.foundation.layout.d) obj;
        i2.o oVar = (i2.o) obj2;
        int intValue = ((Number) obj3).intValue();
        Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
        if ((intValue & 14) == 0) {
            intValue |= ((i2.s) oVar).h(BoxWithConstraints) ? 4 : 2;
        }
        if ((intValue & 91) == 18) {
            i2.s sVar = (i2.s) oVar;
            if (sVar.z()) {
                sVar.Q();
                return Unit.f80348a;
            }
        }
        u2.n nVar = u2.n.f120041b;
        u2.f fVar = new u2.f(1.0f, 0.88f);
        BoxWithConstraints.getClass();
        androidx.compose.foundation.layout.c cVar = androidx.compose.foundation.layout.c.f17179a;
        e0.j(androidx.compose.foundation.layout.b.d(androidx.compose.foundation.layout.e.e(androidx.compose.foundation.layout.b.l(cVar.a(nVar, fVar), 23, 0.0f, 2), BoxWithConstraints.c() * 0.27f), 1.0f), oVar, 0, 0);
        float c13 = BoxWithConstraints.c() * 0.5f;
        e0.f("https://i.pinimg.com/originals/23/8e/ff/238effe944d46a1f8e437b0eb26e5873.webp", androidx.compose.ui.graphics.a.e(RecyclerViewTypes.VIEW_TYPE_CAROUSEL_VIDEO_CELL, RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_FOOTER, RecyclerViewTypes.VIEW_TYPE_LIVE_SINGLE_COLUMN_UPSELL), androidx.compose.foundation.layout.b.d(androidx.compose.foundation.layout.e.e(androidx.compose.foundation.layout.b.k(cVar.a(nVar, new u2.f(1.0f, -1.0f)), 7, -(0.93f * c13)), c13), 0.72f), oVar, 54, 0);
        e0.k(androidx.compose.foundation.layout.b.d(androidx.compose.foundation.layout.e.e(androidx.compose.foundation.layout.b.k(cVar.a(nVar, new u2.f(-1.0f, -1.0f)), -24, -90), BoxWithConstraints.c() * 0.48f), 0.85f), oVar, 0, 0);
        e0.i(androidx.compose.foundation.layout.b.d(androidx.compose.foundation.layout.e.e(androidx.compose.foundation.layout.b.l(cVar.a(nVar, new u2.f(-1.0f, 1.0f)), -29, 0.0f, 2), BoxWithConstraints.c() * 0.47f), 0.78f), oVar, 0, 0);
        float c14 = BoxWithConstraints.c() * 0.67f;
        e0.f("https://i.pinimg.com/originals/77/af/c4/77afc477a0872f2d0bb429b0d7d53dda.webp", androidx.compose.ui.graphics.a.e(RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_USE_CASE_MODULE_CUSTOM_COVER, RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_USE_CASE_MODULE_STORY_PIN, RecyclerViewTypes.VIEW_TYPE_BUBBLE_IMAGE_GRID_REP), d7.b.I0(androidx.compose.foundation.layout.b.d(androidx.compose.foundation.layout.e.e(cVar.a(nVar, new u2.f(0.0f, -0.18f)), c14), 0.78f), 1.0f), oVar, 54, 0);
        float c15 = BoxWithConstraints.c() * 0.27f;
        float f13 = 2;
        e0.l(androidx.compose.foundation.layout.b.d(androidx.compose.foundation.layout.e.e(androidx.compose.foundation.layout.b.l(cVar.a(nVar, new u2.f(0.0f, -0.14f)), (((c15 * 0.75f) / f13) + ((c14 * 0.78f) / f13)) - 22, 0.0f, 2), c15), 0.75f), oVar, 0, 0);
        return Unit.f80348a;
    }
}
