package zf0;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.screens.w1;
import cp1.p;
import df.j1;
import i32.i;
import i32.l;
import i32.y0;
import java.util.Map;
import kh2.k3;
import kotlin.Pair;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;
import m60.s0;
import m60.t0;
import m60.u;
import mq.h0;
import rg0.g0;
import rg0.n;
import rg0.s;
import xk2.m;
import xk2.v;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: e, reason: collision with root package name */
    public static final v f141903e = m.b(d.f141901i);

    /* renamed from: a, reason: collision with root package name */
    public final s f141904a;

    /* renamed from: b, reason: collision with root package name */
    public int f141905b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f141906c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f141907d;

    public f(s _experiences) {
        Intrinsics.checkNotNullParameter(_experiences, "_experiences");
        this.f141904a = _experiences;
        i32.c cVar = i32.c.HOMEFEED_BUILDER_BUTTON;
        this.f141906c = z0.g(new Pair(cVar, Integer.valueOf(t0.image)), new Pair(cVar, Integer.valueOf(t0.image)), new Pair(i32.c.CLICKTHROUGH_BUTTON, Integer.valueOf(t0.clickthrough_button)), new Pair(i32.c.CLOSEUP_OVERFLOW_MENU, Integer.valueOf(t0.overflow_button)), new Pair(i32.c.PROFILE_TAB, Integer.valueOf(t70.d.profile_menu_view)), new Pair(i32.c.LIBRARY_ALL_PINS, Integer.valueOf(t0.pin_iv_2)), new Pair(i32.c.LIBRARY_TOPIC, Integer.valueOf(t0.topic_id_first)), new Pair(i32.c.FLASHLIGHT_BUTTON, Integer.valueOf(t0.flashlight_search_button)), new Pair(i32.c.CLOSEUP_ATTRIBUTION_NAME, Integer.valueOf(t0.verified_domain)), new Pair(i32.c.EXPLORE_TAB_SEARCH_BAR, Integer.valueOf(t0.search_tv)), new Pair(i32.c.SEARCH_BAR, Integer.valueOf(t0.search_tv)), new Pair(i32.c.GUIDED_SEARCH_FIRST_TOKEN, Integer.valueOf(t0.guided_search_first_suggested_token)), new Pair(i32.c.PIN_IT_BUTTON, Integer.valueOf(ud0.a.save_pinit_bt)), new Pair(i32.c.IAB_PINIT_BUTTON, Integer.valueOf(ud0.a.save_pinit_bt)), new Pair(i32.c.CLOSEUP_DID_IT_BUTTON, Integer.valueOf(t0.did_it_cta_button)), new Pair(i32.c.FOOD_FILTER_BUTTON, Integer.valueOf(t0.floating_filter_button)), new Pair(i32.c.BACK_BUTTON, Integer.valueOf(le0.d.bar_home)), new Pair(i32.c.CAMERA_SEARCH_ICON, Integer.valueOf(t0.lens_icon)), new Pair(i32.c.PIN_TAG, Integer.valueOf(t0.education_visual_links_dot)), new Pair(i32.c.PARTNER_PIN_TAG, Integer.valueOf(t0.education_visual_links_dot_partner)), new Pair(i32.c.FOLLOWING_TUNER_ENTRY_BUTTON, Integer.valueOf(t0.following_feed_action_icon)), new Pair(i32.c.BOARD_MORE_IDEAS_TAB, Integer.valueOf(t0.board_host_tab_new_idea)), new Pair(i32.c.HOME_TAB, Integer.valueOf(t70.d.bottom_nav_home_icon)), new Pair(i32.c.CREATE_PIN_BUTTON, Integer.valueOf(t70.d.menu_creation)), new Pair(i32.c.IAB_FEEDBACK_BUTTONS, Integer.valueOf(t0.browser_feedback_icons)), new Pair(i32.c.CLOSEUP_SEND_BUTTON, Integer.valueOf(t0.send_btn)), new Pair(i32.c.HOMEFEED_BOARD_MORE_IDEAS_TAB, Integer.valueOf(t0.multi_tab_homefeed_first_more_ideas_tab)), new Pair(i32.c.PROFILE_FOLLOW_BUTTON, Integer.valueOf(t0.profile_follow_btn)), new Pair(i32.c.CLOSEUP_SOURCE_FOLLOW_BUTTON, Integer.valueOf(t0.closeup_source_follow_button)), new Pair(i32.c.PIN_REACTION_BUTTON, Integer.valueOf(t0.pin_action_reaction)), new Pair(i32.c.HOMEFEED_TODAY_TAB, Integer.valueOf(t0.multi_tab_today_tab_id)), new Pair(i32.c.BOARD_INVITE_BUTTON, Integer.valueOf(t0.board_invite_button)), new Pair(i32.c.BOARD_PLUS_BUTTON, Integer.valueOf(t0.board_action_toolbar_create_icon)), new Pair(i32.c.BOARD_ORGANIZE_BUTTON, Integer.valueOf(t0.board_action_toolbar_select_button)), new Pair(i32.c.PIN_CLOSEUP_PIN_NOTE, Integer.valueOf(t0.pin_note_closeup_module_container)), new Pair(i32.c.BOARD_FILTER_ICON, Integer.valueOf(t0.board_pins_filter_icon)), new Pair(i32.c.USER_PROFILE_NAVIGATION_ICON, Integer.valueOf(t0.user_profile_actions_left_icon)), new Pair(i32.c.CONTACT_REQUEST_REPORT_BUTTON, Integer.valueOf(le0.d.bar_overflow)), new Pair(i32.c.FLOATING_BOTTOM_NAV_SEARCH_BUTTON, Integer.valueOf(t70.d.menu_search)), new Pair(i32.c.PROFILE_AVATAR, Integer.valueOf(t0.user_avatar)), new Pair(i32.c.BOARD_AVATAR, Integer.valueOf(t0.board_collaborator_facepile)), new Pair(i32.c.CREATOR_HUB_BUTTON, Integer.valueOf(t0.profile_creator_hub_button)), new Pair(i32.c.CREATE_LINKED_BUSINESS_ACCOUNT_BUTTON, Integer.valueOf(t0.add_business_account_multi_btn)), new Pair(i32.c.FIRST_CREATOR_BUBBLE, Integer.valueOf(t0.first_creator_bubble)), new Pair(i32.c.FIND_CREATORS_BUBBLE, Integer.valueOf(t0.find_creators_bubble)), new Pair(i32.c.ADD_STORY_PIN_BUBBLE, Integer.valueOf(t0.add_story_pin_bubble)), new Pair(i32.c.BUSINESS_HUB_CONTENT_STORY_PINS, Integer.valueOf(t0.bizhub_pin_format)), new Pair(i32.c.CURATED_CONTENT_REMOVAL, Integer.valueOf(t0.bizhub_curated_content_removal)), new Pair(i32.c.PROFILE_OPTION_BUTTON, Integer.valueOf(t0.board_host_options_icon)), new Pair(i32.c.PROFILE_PLUS_BUTTON, Integer.valueOf(t0.profile_boards_tab_create_icon)), new Pair(i32.c.FLOATING_BOTTOM_NAV_PROFILE_BUTTON, Integer.valueOf(t70.d.profile_menu_view)), new Pair(i32.c.PROFILE_HIGHLIGHT_CREATE_BUTTON, Integer.valueOf(t0.create_profile_highlight)), new Pair(i32.c.PROFILE_CREATED_TAB, Integer.valueOf(t0.profile_created_tab)), new Pair(i32.c.STORY_PIN_FEED_HEADER, Integer.valueOf(t0.story_pin_feed_title)), new Pair(i32.c.PROFILE_MONTHLY_VIEWS, Integer.valueOf(t0.profile_monthly_metadata)), new Pair(i32.c.PROFILE_SETTINGS_ICON, Integer.valueOf(t0.user_profile_actions_right_icon)), new Pair(i32.c.IDEA_PIN_CLOSEUP_COMMENT_ENTRY_POINT, Integer.valueOf(t0.idea_pin_vertical_action_bar_comment_icon)), new Pair(i32.c.PROFILE_FILTER_BUTTON, Integer.valueOf(t0.profile_boards_tab_filter_icon)), new Pair(i32.c.PERSONAL_BOUTIQUE_TUNER, Integer.valueOf(t0.merchant_tuner_button)), new Pair(i32.c.HOME_TV_ICON, Integer.valueOf(t0.home_tv_container)), new Pair(i32.c.IDEA_PIN_SCHEDULE_VIEW, Integer.valueOf(t0.idea_pin_scheduling_container)), new Pair(i32.c.ONEBAR_FILTER_BUTTON, Integer.valueOf(t0.one_bar_module_filter_button_id)), new Pair(i32.c.IDEA_PIN_ASSET_PICKER_VIDEO_TAB, Integer.valueOf(t0.media_gallery_tab_videos)), new Pair(i32.c.IDEA_PIN_CREATION_DRAFTS_SUBTEXT, Integer.valueOf(t0.idea_pin_drafts_subtitle)), new Pair(i32.c.IDEA_PIN_CREATION_CANVAS_BUTTON, Integer.valueOf(t0.idea_pin_action_button_canvas)), new Pair(i32.c.SETTINGS_PRIVACY_AND_DATA, Integer.valueOf(t0.settings_privacy_and_data)), new Pair(i32.c.ANALYTICS_FILTER_CONTENT_TYPE, Integer.valueOf(t0.analytics_filter_content_type)), new Pair(i32.c.PIN_CREATION_PINS_BUTTON, Integer.valueOf(t0.action_button_pin_creation)), new Pair(i32.c.SEARCH_RESULTS_HAIR_PATTERN_FILTER, Integer.valueOf(t0.hair_pattern_selector)), new Pair(i32.c.QUESTION_STICKER_REPLY_BUTTON, Integer.valueOf(t0.sticker_reply_button)), new Pair(i32.c.STICKER_COMMENT_BUTTON, Integer.valueOf(t0.comment_composer_sticker_button)), new Pair(i32.c.UAB_UNIFIED_SOCIAL_ENTRY_POINT, Integer.valueOf(t0.action_module_comments_icon)), new Pair(i32.c.SEARCH_ONE_BAR_MODULE_BODY_TYPE_FILTER, Integer.valueOf(t0.one_bar_module_body_type_range)), new Pair(i32.c.PIN_CREATION_EDIT_CONTENT_BUTTON, Integer.valueOf(t0.unified_pin_editor_button)), new Pair(i32.c.BOARD_BOARDLESS_PIN_AUTO_ORGANIZE_BUTTON, Integer.valueOf(g0.organize_boardless_pins_cta)), new Pair(i32.c.PROFILE_PINS_TAB, Integer.valueOf(g0.profile_pins_tab)), new Pair(i32.c.ANDROID_OWN_PROFILE_AVATAR, Integer.valueOf(g0.profile_user_avatar)), new Pair(i32.c.SEARCH_RESULTS_SKIN_TONE_FILTER, Integer.valueOf(t0.skin_tone_selector)), new Pair(i32.c.ANDROID_PIN_CLOSEUP_PIN_STATS_TAKEOVER, Integer.valueOf(t0.closeup_title_module_forward_icon)), new Pair(i32.c.BOARD_SHARE_BUTTON, Integer.valueOf(t0.board_host_share_icon)), new Pair(i32.c.PROFILE_COLLAGES_TAB, Integer.valueOf(g0.profile_collages_tab)));
        this.f141907d = z0.g(new Pair(i.DOWN_ARROW, Integer.valueOf(s0.pinterest_voice_down_arrow)), new Pair(i.FORWARD_ARROW, Integer.valueOf(le0.c.ic_pinterest_voice_forward_arrow_nonpds)));
    }

    public static void a(Runnable runnable) {
        if (runnable != null) {
            n(runnable);
        }
        u.f85943a.d(new dg0.c(dg0.b.DISMISS_UI));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static nl1.d b(p activity) {
        nl1.d V7;
        Intrinsics.checkNotNullParameter(activity, "activity");
        nl1.d f34938d = activity.getF34938d();
        if (f34938d == 0 || !Intrinsics.d(f34938d.getClass(), ((ScreenLocation) w1.G.getValue()).getF51724a())) {
            return f34938d;
        }
        kr.a aVar = f34938d instanceof kr.a ? (kr.a) f34938d : null;
        return (aVar == null || (V7 = aVar.V7()) == null) ? ((h0) ((h42.e) f34938d)).b8() : V7;
    }

    public static int[] c(View anchorView) {
        Intrinsics.checkNotNullParameter(anchorView, "anchorView");
        int[] iArr = new int[2];
        anchorView.getLocationOnScreen(iArr);
        iArr[1] = iArr[1] - k3.G(anchorView.getContext());
        return iArr;
    }

    public static boolean f(y0 placement, l[] experiences) {
        Intrinsics.checkNotNullParameter(placement, "placement");
        Intrinsics.checkNotNullParameter(experiences, "experiences");
        String placement2 = String.valueOf(placement.value());
        Intrinsics.checkNotNullParameter(placement2, "placement");
        Intrinsics.checkNotNullParameter(experiences, "experiences");
        for (l lVar : experiences) {
            if (j1.E0(placement2, lVar)) {
                return true;
            }
        }
        return false;
    }

    public static boolean g() {
        return j1.D0(y0.ANDROID_PIN_CLOSEUP_TAKEOVER, l.ANDROID_FOLLOW_EDUCATION) || j1.D0(y0.ANDROID_IDEA_STREAM_TAKEOVER, l.ANDROID_IDEA_PIN_FOLLOW_EDUCATION);
    }

    public static boolean h() {
        return j1.D0(y0.ANDROID_PIN_GRID_ATTRIBUTION, l.ANDROID_IMAGE_ONLY_PIN_GRID);
    }

    public static boolean i() {
        return j1.D0(y0.ANDROID_PIN_CLOSEUP_TAKEOVER, l.ANDROID_SAVE_EDUCATION) || j1.D0(y0.ANDROID_IDEA_STREAM_TAKEOVER, l.ANDROID_IDEA_PIN_SAVE_EDUCATION);
    }

    public static boolean j() {
        y0 y0Var = y0.ANDROID_HOME_FEED_TAKEOVER;
        return j1.D0(y0Var, l.ANDROID_USER_BIRTHDAY_COLLECTION) || j1.D0(y0Var, l.ANDROID_USER_BIRTHDAY_COLLECTION_EU);
    }

    public static boolean k(View eduContainerView, View anchorView, i32.c cVar) {
        Intrinsics.checkNotNullParameter(eduContainerView, "eduContainerView");
        Intrinsics.checkNotNullParameter(anchorView, "anchorView");
        if (!anchorView.isShown()) {
            return false;
        }
        Rect rect = new Rect();
        eduContainerView.getHitRect(rect);
        int dimensionPixelSize = anchorView.getContext().getResources().getDimensionPixelSize(eo1.c.toolbar_height);
        if (cVar == null) {
            rect.top = dimensionPixelSize;
        }
        if (cVar == i32.c.CLICKTHROUGH_BUTTON) {
            rect.set(rect.left, rect.top + dimensionPixelSize, rect.right, rect.bottom - ((int) r70.b.f106349i.k0().b()));
        }
        int width = anchorView.getWidth();
        int height = anchorView.getHeight();
        Rect rect2 = new Rect();
        int[] c13 = c(anchorView);
        int i13 = c13[0];
        int i14 = c13[1];
        int width2 = anchorView.getWidth();
        int height2 = anchorView.getHeight();
        rect2.left = i13;
        rect2.top = i14;
        rect2.right = i13 + width2;
        rect2.bottom = i14 + height2;
        return width > 0 && height > 0 && rect.contains(rect2);
    }

    public static void n(Runnable r13) {
        Intrinsics.checkNotNullParameter(r13, "r");
        new Handler(Looper.getMainLooper()).removeCallbacks(r13);
    }

    public final View d(Context context, i32.c cVar) {
        View view;
        Intrinsics.checkNotNullParameter(context, "context");
        Activity k03 = bs1.c.k0(context);
        Intrinsics.g(k03, "null cannot be cast to non-null type com.pinterest.hairball.kit.activity.BaseActivity");
        nl1.d b13 = b((p) k03);
        if (b13 != null && (view = b13.getView()) != null) {
            Map map = this.f141906c;
            if (map.containsKey(cVar)) {
                Integer num = (Integer) map.get(cVar);
                View findViewById = num != null ? view.findViewById(num.intValue()) : null;
                if (findViewById == null) {
                    return num != null ? k03.findViewById(num.intValue()) : null;
                }
                return findViewById;
            }
        }
        return null;
    }

    public final n e() {
        y0 y0Var = y0.ANDROID_PIN_CLOSEUP_TAKEOVER;
        if (j1.D0(y0Var, l.ANDROID_CLOSEUP_REACTION_TOOLTIP) || j1.D0(y0Var, l.ANDROID_CLOSEUP_REACTION_TOOLTIP_2) || j1.D0(y0Var, l.ANDROID_CLOSEUP_REACTION_TOOLTIP_3)) {
            return ((dh0.d) this.f141904a).b(y0Var);
        }
        return null;
    }

    public final void l(y0 placement, l experience) {
        Intrinsics.checkNotNullParameter(placement, "placement");
        Intrinsics.checkNotNullParameter(experience, "experience");
        n b13 = ((dh0.d) this.f141904a).b(placement);
        if (b13 == null || b13.f108060b != experience.value()) {
            return;
        }
        b13.a(null, null);
        u.f85943a.d(new dg0.c(dg0.b.DISMISS_UI));
    }

    public final void m(y0 placement, l experience) {
        Intrinsics.checkNotNullParameter(placement, "placement");
        Intrinsics.checkNotNullParameter(experience, "experience");
        n b13 = ((dh0.d) this.f141904a).b(placement);
        if (b13 == null || b13.f108060b != experience.value()) {
            return;
        }
        b13.c(null, null);
        u.f85943a.d(new dg0.c(dg0.b.DISMISS_UI));
    }
}
