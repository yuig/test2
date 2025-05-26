package ai0;

import android.content.res.Resources;
import b60.b;
import b60.d;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.wy0;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import df.j1;
import h32.a4;
import h32.f1;
import h32.g0;
import h32.u0;
import h32.v0;
import java.util.HashMap;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import m60.x0;
import nx.d0;
import t10.f;

/* loaded from: classes5.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f15235a = 0;

    static {
        Intrinsics.checkNotNullExpressionValue(Pattern.compile("(?!.*[@])((https?://)?(www\\.)?)(\\w+\\.pinterest\\.[a-zA-Z]{2,3}$|pinterest\\.[a-zA-Z]{2,3}$|pin\\.it)[\\S]*"), "compile(...)");
    }

    public static final a4 a(f30 f30Var) {
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        return b40.A(f30Var) instanceof f ? a4.PIN_RECIPE : b40.Q0(f30Var) ? a4.PIN_STORY_PIN : j1.F1(f30Var) ? a4.PIN_PDPPLUS : a4.PIN_REGULAR;
    }

    public static final void b(f30 f30Var, w eventManager, int i13, d0 d0Var, HashMap hashMap, u0 u0Var, g0 g0Var, h32.d0 d0Var2, v0 v0Var, Resources resources, b bVar, String featuredCommentUid, String featuredCommentType, String previewCommentUid, String replyToCommentUid, String replyToCommentType, wy0 wy0Var, boolean z13, boolean z14, boolean z15) {
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(featuredCommentUid, "featuredCommentUid");
        Intrinsics.checkNotNullParameter(featuredCommentType, "featuredCommentType");
        Intrinsics.checkNotNullParameter(previewCommentUid, "previewCommentUid");
        Intrinsics.checkNotNullParameter(replyToCommentUid, "replyToCommentUid");
        Intrinsics.checkNotNullParameter(replyToCommentType, "replyToCommentType");
        if (z15 && d0Var != null) {
            d0Var.h0(f1.COMMUNITY_VIEW_INTENT, u0Var, g0Var, f30Var.getUid(), hashMap, d0Var2, v0Var, false);
        }
        NavigationImpl L = Navigation.L((ScreenLocation) com.pinterest.screens.u0.f51403b.getValue(), b40.g(f30Var), i13);
        L.m0("com.pinterest.EXTRA_PIN_ID", f30Var.getUid());
        wy0 n13 = b40.n(f30Var);
        L.m0("com.pinterest.EXTRA_USER_ID", n13 != null ? n13.getUid() : null);
        wy0 n14 = b40.n(f30Var);
        L.m0("com.pinterest.EXTRA_USERNAME", n14 != null ? n14.z4() : null);
        L.m0("com.pinterest.EXTRA_COMMENT_VIEW_PARAMETER", a(f30Var).name());
        L.m0("com.pinterest.EXTRA_COMMENT_ID", featuredCommentUid);
        L.m0("com.pinterest.EXTRA_COMMENT_TYPE", featuredCommentType);
        L.m0("com.pinterest.EXTRA_COMMENT_PREVIEW_ID", previewCommentUid);
        L.m0("com.pinterest.EXTRA_COMPOSE_REPLY_TO_COMMENT_ID", replyToCommentUid);
        L.m0("com.pinterest.EXTRA_COMPOSE_REPLY_TO_COMMENT_TYPE", replyToCommentType);
        L.m0("com.pinterest.EXTRA_COMPOSE_REPLY_TO_USER_ID", wy0Var != null ? wy0Var.getUid() : null);
        L.m0("com.pinterest.EXTRA_COMPOSE_REPLY_TO_USER_NAME", null);
        Boolean j43 = f30Var.j4();
        Intrinsics.checkNotNullExpressionValue(j43, "getDoneByMe(...)");
        L.Y1("com.pinterest.EXTRA_PIN_DONE_BY_ME", j43.booleanValue());
        L.Y1("com.pinterest.EXTRA_PIN_ELIGIBLE_FOR_TRIED_IT", b40.z0(f30Var));
        L.Y1("com.pinterest.EXTRA_NO_OVERLAY", true);
        if (resources != null) {
            L.m0("com.pinterest.EXTRA_COMMENT_HINT_TEXT", resources.getString(x0.comment_composer_empty_state_first_comment_hint));
        }
        if (bVar != null) {
            String H = b40.H(f30Var);
            wy0 f13 = ((d) bVar).f();
            L.Y1("com.pinterest.EXTRA_SHOW_KEYBOARD", (Intrinsics.d(H, f13 != null ? f13.getUid() : null) || b40.f0(f30Var) != 0 || z13) ? false : true);
        }
        L.Y1("com.pinterest.EXTRA_COMMENT_FEED_HALF_EXPANDED", z14);
        eventManager.d(L);
    }

    public static final boolean d(wy0 wy0Var, b activeUserManager) {
        Intrinsics.checkNotNullParameter(wy0Var, "<this>");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        if (activeUserManager.c(wy0Var)) {
            Boolean J3 = wy0Var.J3();
            Intrinsics.checkNotNullExpressionValue(J3, "getIsPrivateProfile(...)");
            if (J3.booleanValue()) {
                return true;
            }
        }
        return false;
    }
}
