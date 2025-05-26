package com.pinterest.screens;

import com.pinterest.framework.screens.ScreenLocation;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class v1 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f51461i;

    /* renamed from: j, reason: collision with root package name */
    public static final v1 f51444j = new v1(0);

    /* renamed from: k, reason: collision with root package name */
    public static final v1 f51445k = new v1(1);

    /* renamed from: l, reason: collision with root package name */
    public static final v1 f51446l = new v1(2);

    /* renamed from: m, reason: collision with root package name */
    public static final v1 f51447m = new v1(3);

    /* renamed from: n, reason: collision with root package name */
    public static final v1 f51448n = new v1(4);

    /* renamed from: o, reason: collision with root package name */
    public static final v1 f51449o = new v1(5);

    /* renamed from: p, reason: collision with root package name */
    public static final v1 f51450p = new v1(6);

    /* renamed from: q, reason: collision with root package name */
    public static final v1 f51451q = new v1(7);

    /* renamed from: r, reason: collision with root package name */
    public static final v1 f51452r = new v1(8);

    /* renamed from: s, reason: collision with root package name */
    public static final v1 f51453s = new v1(9);

    /* renamed from: t, reason: collision with root package name */
    public static final v1 f51454t = new v1(10);

    /* renamed from: u, reason: collision with root package name */
    public static final v1 f51455u = new v1(11);

    /* renamed from: v, reason: collision with root package name */
    public static final v1 f51456v = new v1(12);

    /* renamed from: w, reason: collision with root package name */
    public static final v1 f51457w = new v1(13);

    /* renamed from: x, reason: collision with root package name */
    public static final v1 f51458x = new v1(14);

    /* renamed from: y, reason: collision with root package name */
    public static final v1 f51459y = new v1(15);

    /* renamed from: z, reason: collision with root package name */
    public static final v1 f51460z = new v1(16);
    public static final v1 A = new v1(17);
    public static final v1 B = new v1(18);
    public static final v1 C = new v1(19);
    public static final v1 D = new v1(20);
    public static final v1 E = new v1(21);
    public static final v1 F = new v1(22);
    public static final v1 G = new v1(23);
    public static final v1 H = new v1(24);
    public static final v1 I = new v1(25);

    /* renamed from: J, reason: collision with root package name */
    public static final v1 f51443J = new v1(26);
    public static final v1 K = new v1(27);
    public static final v1 L = new v1(28);
    public static final v1 M = new v1(29);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v1(int i13) {
        super(0);
        this.f51461i = i13;
    }

    public final ScreenLocation b() {
        switch (this.f51461i) {
            case 0:
                return df.j1.u0("com.pinterest.feature.pin.PinFeatureModuleLocation", "USER_PIN_REACTIONS_LIST");
            case 1:
                return df.j1.u0("com.pinterest.feature.search.VisualSearchLocation", "VIRTUAL_TRY_ON");
            case 2:
                return df.j1.u0("com.pinterest.anket.screen.AnketLocation", "ANKET_EMOJI");
            case 3:
                return df.j1.u0("com.pinterest.anket.screen.AnketLocation", "ANKET_LIKE");
            case 4:
                return df.j1.u0("com.pinterest.anket.screen.AnketLocation", "ANKET_MULTIPLE");
            case 5:
                return df.j1.u0("com.pinterest.anket.screen.AnketLocation", "ANKET_SCALE");
            case 6:
                return df.j1.u0("com.pinterest.anket.screen.AnketLocation", "ANKET_SINGLE");
            case 7:
                return df.j1.u0("com.pinterest.anket.screen.AnketLocation", "ANKET_TEXT");
            case 8:
                return df.j1.u0("com.pinterest.anket.screen.AnketLocation", "ANKET_VERTICAL_SCALE");
            case 9:
                return df.j1.u0("com.pinterest.anket.screen.AnketLocation", "ANKET_VIEW");
            case 10:
                return df.j1.u0("com.pinterest.feature.board.detail.BoardDetailFeatureLocation", "BOARD");
            case 11:
                return df.j1.u0("com.pinterest.feature.board.create.BoardCreateFeatureLocation", "BOARD_CREATE_FRAGMENT");
            case 12:
                return df.j1.u0("com.pinterest.feature.board.BoardFeatureLocation", "BOARD_MORE_IDEAS_TAB");
            case 13:
                return df.j1.u0("com.pinterest.feature.unifiedcomments.CommentsFeatureLocation", "COMMENTS_MODAL");
            case 14:
                return df.j1.u0("com.pinterest.feature.conversation.screen.ConversationFeatureLocation", "CONTACT_REQUEST_INBOX");
            case 15:
                return df.j1.u0("com.pinterest.feature.conversation.screen.ConversationFeatureLocation", "CONVERSATION");
            case 16:
                return df.j1.u0("com.pinterest.feature.conversation.screen.ConversationFeatureLocation", "CONVERSATION_INBOX");
            case 17:
                return df.j1.u0("com.pinterest.feature.home.model.HomeFeedTunerLocation", "HOMEFEED_TUNER");
            case 18:
                return df.j1.u0("com.pinterest.feature.homefeed.navigation.HomeFeedLocation", "HOME_TAB");
            case 19:
                return df.j1.u0("com.pinterest.feature.shopping.ShoppingFeatureLocation", "PINTEREST_PICKS_TAB");
            case 20:
                return df.j1.u0("com.pinterest.feature.pinorspin.PinOrSpinFeatureLocation", "PIN_OR_SPIN_REWARD");
            case 21:
                return df.j1.u0("com.pinterest.feature.pinorspin.PinOrSpinFeatureLocation", "PIN_OR_SPIN_SELECTION");
            case 22:
                return df.j1.u0("com.pinterest.partnerAnalytics.PartnerAnalyticsLocation", "PIN_STATS");
            case 23:
                return df.j1.u0("com.pinterest.feature.shopping.ShoppingFeatureLocation", "RELATED_MODULE_FEED");
            case 24:
                return df.j1.u0("com.pinterest.feature.todaytab.TodayTabLocation", "TODAY_TAB");
            case 25:
                return df.j1.u0("com.pinterest.identity.authentication.AuthenticationLocation", "BUSINESS_ACCOUNT_CREATE");
            case 26:
                return df.j1.u0("com.pinterest.feature.creator.model.CreatorFeatureLocation", "BUSINESS_ONBOARDING");
            case 27:
                return df.j1.u0("com.pinterest.identity.authentication.AuthenticationLocation", "UNAUTH_CREATE_PASSWORD_SCREEN");
            case 28:
                return df.j1.u0("com.pinterest.identity.authentication.AuthenticationLocation", "UNAUTH_EMAIL_COLLECTION");
            default:
                return df.j1.u0("com.pinterest.identity.authentication.AuthenticationLocation", "UNAUTH_LANDING_SCREEN");
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f51461i) {
        }
        return b();
    }
}
