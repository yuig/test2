package kt0;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import h32.f1;
import h32.g0;
import h32.i0;
import h32.u0;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final nx.d0 f80857a;

    public t(nx.d0 pinalytics) {
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        this.f80857a = pinalytics;
    }

    public static u0 a(String str) {
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != 952402995) {
                if (hashCode != 1034060685) {
                    if (hashCode == 1941890539 && str.equals("board_more_ideas")) {
                        return u0.MULTI_TAB_MORE_IDEAS_TAB;
                    }
                } else if (str.equals("pinterest_picks")) {
                    return u0.MULTI_TAB_PINTEREST_PICKS_TAB;
                }
            } else if (str.equals("followed_topics")) {
                return u0.MULTI_TAB_TOPIC_TAB;
            }
        }
        return u0.MULTI_TAB_HOME_TAB;
    }

    public static /* synthetic */ void d(t tVar, f1 f1Var, u0 u0Var, g0 g0Var, HashMap hashMap, int i13) {
        if ((i13 & 16) != 0) {
            hashMap = null;
        }
        tVar.c(f1Var, u0Var, g0Var, null, hashMap);
    }

    public final void b(String str, f1 f1Var, lt0.e eVar, int i13) {
        HashMap o13 = ep.b.o("reason", str);
        o13.put("index", String.valueOf(i13));
        o13.put("referrer", String.valueOf(x22.c.HOME_FEED_SWIPE.getValue()));
        o13.put("tab_title", eVar.f84782b);
        u0 a13 = a(eVar.f84790j);
        u0 u0Var = u0.MULTI_TAB_TOPIC_TAB;
        String str2 = eVar.f84786f;
        if (a13 == u0Var) {
            o13.put("interest_id", str2);
        } else if (a13 == u0.MULTI_TAB_MORE_IDEAS_TAB) {
            o13.put("board_id", str2);
        }
        c(f1Var, a13, g0.TAB_CAROUSEL, eVar.f84786f, o13);
    }

    public final void c(f1 f1Var, u0 u0Var, g0 g0Var, String str, HashMap hashMap) {
        i0 p13 = this.f80857a.p();
        this.f80857a.h0((r18 & 1) != 0 ? f1.TAP : f1Var, (r18 & 2) != 0 ? null : u0Var == null ? p13 != null ? p13.f67086f : null : u0Var, (r18 & 4) != 0 ? null : g0Var == null ? p13 != null ? p13.f67084d : null : g0Var, (r18 & 8) != 0 ? null : str, (r18 & 32) != 0 ? null : hashMap, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
    }
}
