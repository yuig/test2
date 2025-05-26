package pk1;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.Pair;
import kotlin.collections.y0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m60.g0;
import nk1.k;
import oa2.p;
import oa2.r;
import xk2.m;
import xk2.v;

/* loaded from: classes5.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final v f100545a = m.b(g.f100544i);

    public static c a(String sourceUserId, g0 pageSizeProvider, uk1.d pinalytics, p legoUserRepPresenterFactory, boolean z13, e41.b bVar, us0.a aVar, int i13) {
        boolean z14 = (i13 & 32) != 0 ? false : z13;
        boolean z15 = (i13 & 64) != 0;
        Function2 unfollowConfirmationAction = (i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? e.f100541j : bVar;
        Function1 userNavigatorLogAction = (i13 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? b.f100539k : aVar;
        Intrinsics.checkNotNullParameter(sourceUserId, "sourceUserId");
        Intrinsics.checkNotNullParameter(pageSizeProvider, "pageSizeProvider");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(legoUserRepPresenterFactory, "legoUserRepPresenterFactory");
        Intrinsics.checkNotNullParameter(unfollowConfirmationAction, "unfollowConfirmationAction");
        Intrinsics.checkNotNullParameter(userNavigatorLogAction, "userNavigatorLogAction");
        return new c(a.a.k("users/", sourceUserId, "/following/"), pageSizeProvider, new a(new rk1.g(pinalytics, z14 ? new k(e.f100542k, 5) : r.f93952a, legoUserRepPresenterFactory, unfollowConfirmationAction, userNavigatorLogAction)), z14, y0.b(new Pair("explicit_following", String.valueOf(z15))), z14 ? new f() : null);
    }
}
