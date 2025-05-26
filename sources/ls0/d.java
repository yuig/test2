package ls0;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.screens.y1;
import k1.q;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import m60.w;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final w f84623a;

    /* renamed from: b, reason: collision with root package name */
    public final j80.b f84624b;

    /* renamed from: c, reason: collision with root package name */
    public final g70.h f84625c;

    public d(w _eventManager, j80.b _carouselUtil, g70.h _boardNavigator) {
        Intrinsics.checkNotNullParameter(_eventManager, "_eventManager");
        Intrinsics.checkNotNullParameter(_carouselUtil, "_carouselUtil");
        Intrinsics.checkNotNullParameter(_boardNavigator, "_boardNavigator");
        this.f84623a = _eventManager;
        this.f84624b = _carouselUtil;
        this.f84625c = _boardNavigator;
    }

    public static SpannableStringBuilder b(Context context, int i13, String unformattedString, String varValue, Function0 clickAction) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(unformattedString, "unformattedString");
        Intrinsics.checkNotNullParameter(varValue, "varValue");
        Intrinsics.checkNotNullParameter(clickAction, "clickAction");
        return f0.h.B(context, unformattedString, "%1$s", varValue, i13, new nk0.b(1, clickAction));
    }

    public final SpannableStringBuilder a(Context context, int i13, String unformattedString, String varValue, ScreenLocation clickLocation, String locationUid) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(unformattedString, "unformattedString");
        Intrinsics.checkNotNullParameter(varValue, "varValue");
        Intrinsics.checkNotNullParameter(clickLocation, "clickLocation");
        Intrinsics.checkNotNullParameter(locationUid, "locationUid");
        return b(context, i13, unformattedString, varValue, new q(this, clickLocation, locationUid, 27));
    }

    public final SpannableStringBuilder c(Context context, int i13, String unformattedString, String user, String userUid) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(unformattedString, "unformattedString");
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(userUid, "userUid");
        return f0.h.B(context, unformattedString, "%1$s", user, i13, new b(this, userUid, 0));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final SpannableStringBuilder d(f viewParams, yk1.a viewResources, Context context, int i13) {
        String str;
        Intrinsics.checkNotNullParameter(viewParams, "viewParams");
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        Intrinsics.checkNotNullParameter(context, "context");
        String str2 = viewParams.f84633h;
        String str3 = ((str2 == null || str2.length() == 0) && viewParams.C) ? viewParams.D : viewParams.f84633h;
        int i14 = a.f84616a[viewParams.f84626a.ordinal()];
        Resources resources = viewResources.f139224a;
        String str4 = viewParams.f84629d;
        String str5 = viewParams.f84630e;
        String str6 = viewParams.f84627b;
        String str7 = viewParams.f84628c;
        String str8 = viewParams.f84631f;
        String str9 = viewParams.f84632g;
        switch (i14) {
            case 1:
            case 2:
                return new SpannableStringBuilder(resources.getString(vp1.c.grid_actions_report_reason_2));
            case 3:
                return new SpannableStringBuilder(resources.getString(vp1.c.grid_actions_third_party_gma_waista_reason));
            case 4:
                if (str3 != null && (str = viewParams.f84634i) != null) {
                    String str10 = viewParams.f84648w;
                    if (str10 == null || str10.length() == 0) {
                        String str11 = viewParams.f84641p;
                        return (str11 == null || str11.length() == 0) ? a(context, i13, resources.getString(vp1.c.grid_actions_promoted), str3, (ScreenLocation) y1.f51583d.getValue(), str) : a(context, i13, resources.getString(vp1.c.grid_actions_promoted), str3, (ScreenLocation) y1.f51580a.getValue(), str11);
                    }
                    b bVar = new b(this, str, 3);
                    return f0.h.C(context, resources.getString(vp1.c.grid_actions_3rd_party_promoted), new String[]{"%1$s", "%2$s"}, new String[]{str3, str10}, new cf0.b[]{bVar, bVar}, i13);
                }
                return null;
            case 5:
                if (str4 != null && str5 != null) {
                    return b(context, i13, resources.getString(vp1.c.homefeed_control_board), str4, new c(this, str5, 0));
                }
                return null;
            case 6:
                if (str8 != null && str9 != null) {
                    return a(context, i13, resources.getString(vp1.c.homefeed_control_topic), str8, (ScreenLocation) y1.f51582c.getValue(), str9);
                }
                return null;
            case 7:
                if (str8 != null && str9 != null) {
                    return a(context, i13, resources.getString(vp1.c.grid_actions_unfollow_topic_prompt), str8, (ScreenLocation) y1.f51582c.getValue(), str9);
                }
                return null;
            case 8:
            case 9:
                if (str6 != null && str7 != null) {
                    return c(context, i13, resources.getString(vp1.c.homefeed_control_user), str6, str7);
                }
                return null;
            case 10:
                if (str4 != null && str5 != null) {
                    return b(context, i13, resources.getString(vp1.c.grid_actions_board_or_topic_unfollow), str4, new c(this, str5, 1));
                }
                return null;
            case 11:
                if (str4 != null && str5 != null && str6 != null && str7 != null) {
                    return f0.h.C(context, resources.getString(vp1.c.grid_actions_user_unfollow), new String[]{"%1$s", "%2$s"}, new String[]{str6, str4}, new cf0.b[]{new b(this, str7, 1), new b(this, str5, 2)}, i13);
                }
                return null;
            case 12:
                if (str8 != null && str9 != null) {
                    return a(context, i13, resources.getString(vp1.c.grid_actions_board_or_topic_unfollow), str8, (ScreenLocation) y1.f51582c.getValue(), str9);
                }
                return null;
            case 13:
                if (str6 != null && str7 != null) {
                    return a(context, i13, resources.getString(vp1.c.grid_actions_unfollow_user), str6, (ScreenLocation) y1.f51583d.getValue(), str7);
                }
                return null;
            case 14:
                if (str4 != null && str5 != null) {
                    return b(context, i13, resources.getString(vp1.c.grid_actions_pfy_board), str4, new c(this, str5, 2));
                }
                return null;
            case 15:
                return new SpannableStringBuilder(resources.getString(vp1.c.grid_actions_pfy));
            case 16:
                return new SpannableStringBuilder(resources.getString(vp1.c.grid_actions_demographic_pfy));
            case 17:
                return new SpannableStringBuilder(resources.getString(vp1.c.pin_hide_show_relevant_message));
            case 18:
                return new SpannableStringBuilder(resources.getString(vp1.c.grid_actions_default_reason));
            case 19:
            case 20:
            case 21:
            case 22:
                return new SpannableStringBuilder(resources.getString(vp1.c.grid_actions_feedback_not_for_me));
            default:
                return null;
        }
    }
}
