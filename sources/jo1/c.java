package jo1;

import androidx.fragment.app.Fragment;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.screens.s1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.g0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class c {
    public static a a(Fragment fragment) {
        Class<?> cls = fragment != null ? fragment.getClass() : null;
        if (Intrinsics.d(cls, s1.p().getF48114a()) || Intrinsics.d(cls, s1.q().getF48114a())) {
            return a.HOMEFEED;
        }
        Class<?> cls2 = fragment != null ? fragment.getClass() : null;
        if (Intrinsics.d(cls2, s1.y().getF48114a()) || Intrinsics.d(cls2, s1.x().getF48114a())) {
            return a.SEARCH;
        }
        Class<?> cls3 = fragment != null ? fragment.getClass() : null;
        if (Intrinsics.d(cls3, s1.v().getF48114a()) || Intrinsics.d(cls3, s1.t().getF48114a())) {
            return a.RELATED_PINS;
        }
        Class<?> cls4 = fragment != null ? fragment.getClass() : null;
        if (Intrinsics.d(cls4, s1.u().getF48114a()) || Intrinsics.d(cls4, s1.n().getF48114a())) {
            return a.VISUAL_SEARCH;
        }
        el2.a entries = g70.b.getEntries();
        ArrayList arrayList = new ArrayList(g0.q(entries, 10));
        Iterator<E> it = entries.iterator();
        while (it.hasNext()) {
            arrayList.add(((g70.b) it.next()).getScreenLocation());
        }
        Set J0 = CollectionsKt.J0(arrayList);
        ArrayList arrayList2 = new ArrayList(g0.q(J0, 10));
        Iterator it2 = J0.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((ScreenLocation) it2.next()).getF48114a());
        }
        if (!arrayList2.isEmpty()) {
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                if (Intrinsics.d((Class) it3.next(), fragment != null ? fragment.getClass() : null)) {
                    return a.BOARD;
                }
            }
        }
        if (Intrinsics.d(fragment != null ? fragment.getClass() : null, s1.l().getF48114a())) {
            return a.BOARD_SECTION;
        }
        if (Intrinsics.d(fragment != null ? fragment.getClass() : null, s1.A().getF48114a())) {
            return a.USER_PINS;
        }
        Class<?> cls5 = fragment != null ? fragment.getClass() : null;
        if (Intrinsics.d(cls5, s1.c().getF48114a()) || Intrinsics.d(cls5, s1.j().getF48114a()) || Intrinsics.d(cls5, s1.h().getF48114a()) || Intrinsics.d(cls5, s1.a().getF48114a()) || Intrinsics.d(cls5, s1.d().getF48114a()) || Intrinsics.d(cls5, s1.e().getF48114a()) || Intrinsics.d(cls5, s1.b().getF48114a()) || Intrinsics.d(cls5, s1.f().getF48114a())) {
            return a.PROMOTED_PIN_CLOSEUP;
        }
        if (Intrinsics.d(fragment != null ? fragment.getClass() : null, s1.r().getF48114a())) {
            return a.INTEREST_PINS_FEED;
        }
        if (Intrinsics.d(fragment != null ? fragment.getClass() : null, s1.z().getF48114a())) {
            return a.SHOPPING_SURFACE;
        }
        if (Intrinsics.d(fragment != null ? fragment.getClass() : null, s1.s().getF48114a())) {
            return a.NEWS_HUB;
        }
        if (Intrinsics.d(fragment != null ? fragment.getClass() : null, s1.g().getF48114a())) {
            return a.QUIZ_PIN_RESULT_CLOSEUP;
        }
        if (Intrinsics.d(fragment != null ? fragment.getClass() : null, s1.i().getF48114a())) {
            return a.SHOWCASE_PIN_CLOSEUP;
        }
        if (Intrinsics.d(fragment != null ? fragment.getClass() : null, s1.k().getF48114a())) {
            return a.MORE_IDEAS;
        }
        if (Intrinsics.d(fragment != null ? fragment.getClass() : null, s1.o().getF48114a())) {
            return a.COLLAGE_RETRIEVAL;
        }
        if (Intrinsics.d(fragment != null ? fragment.getClass() : null, s1.w().getF48114a())) {
            return a.REPORT_PIN;
        }
        return Intrinsics.d(fragment != null ? fragment.getClass() : null, s1.m().getF48114a()) ? a.BOARD_SHOP_TOOLS : a.OTHER;
    }
}
