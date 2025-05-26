package com.pinterest.screens;

import com.pinterest.framework.screens.ScreenLocation;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class g2 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f50855i;

    /* renamed from: j, reason: collision with root package name */
    public static final g2 f50838j = new g2(0);

    /* renamed from: k, reason: collision with root package name */
    public static final g2 f50839k = new g2(1);

    /* renamed from: l, reason: collision with root package name */
    public static final g2 f50840l = new g2(2);

    /* renamed from: m, reason: collision with root package name */
    public static final g2 f50841m = new g2(3);

    /* renamed from: n, reason: collision with root package name */
    public static final g2 f50842n = new g2(4);

    /* renamed from: o, reason: collision with root package name */
    public static final g2 f50843o = new g2(5);

    /* renamed from: p, reason: collision with root package name */
    public static final g2 f50844p = new g2(6);

    /* renamed from: q, reason: collision with root package name */
    public static final g2 f50845q = new g2(7);

    /* renamed from: r, reason: collision with root package name */
    public static final g2 f50846r = new g2(8);

    /* renamed from: s, reason: collision with root package name */
    public static final g2 f50847s = new g2(9);

    /* renamed from: t, reason: collision with root package name */
    public static final g2 f50848t = new g2(10);

    /* renamed from: u, reason: collision with root package name */
    public static final g2 f50849u = new g2(11);

    /* renamed from: v, reason: collision with root package name */
    public static final g2 f50850v = new g2(12);

    /* renamed from: w, reason: collision with root package name */
    public static final g2 f50851w = new g2(13);

    /* renamed from: x, reason: collision with root package name */
    public static final g2 f50852x = new g2(14);

    /* renamed from: y, reason: collision with root package name */
    public static final g2 f50853y = new g2(15);

    /* renamed from: z, reason: collision with root package name */
    public static final g2 f50854z = new g2(16);
    public static final g2 A = new g2(17);
    public static final g2 B = new g2(18);
    public static final g2 C = new g2(19);
    public static final g2 D = new g2(20);
    public static final g2 E = new g2(21);
    public static final g2 F = new g2(22);
    public static final g2 G = new g2(23);
    public static final g2 H = new g2(24);
    public static final g2 I = new g2(25);

    /* renamed from: J, reason: collision with root package name */
    public static final g2 f50837J = new g2(26);
    public static final g2 K = new g2(27);
    public static final g2 L = new g2(28);
    public static final g2 M = new g2(29);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g2(int i13) {
        super(0);
        this.f50855i = i13;
    }

    public final ScreenLocation b() {
        switch (this.f50855i) {
            case 0:
                return df.j1.u0("com.pinterest.closeup.screens.PinFeatureLocation", "PIN");
            case 1:
                return df.j1.u0("com.pinterest.feature.pinorspin.PinOrSpinFeatureLocation", "PIN_OR_SPIN_REWARD");
            case 2:
                return df.j1.u0("com.pinterest.feature.browser.model.BrowserFeatureLocation", "BROWSER");
            case 3:
                return df.j1.u0("com.pinterest.feature.browser.model.BrowserFeatureLocation", "BROWSER");
            case 4:
                return df.j1.u0("com.pinterest.feature.browser.model.BrowserFeatureLocation", "BROWSER_MODAL");
            case 5:
                return df.j1.u0("com.pinterest.reportFlow.feature.ReportFlowScreenLocation", "REPORT_FLOW_PRIMARY_REASONS");
            case 6:
                return df.j1.u0("com.pinterest.identity.authentication.AuthenticationLocation", "UNAUTH_LANDING_SCREEN");
            case 7:
                return df.j1.u0("com.pinterest.searchTypeahead.framework.screens.SearchTypeaheadFeatureLocation", "SEARCH_TYPEAHEAD_TOP");
            case 8:
                return df.j1.u0("com.pinterest.feature.location.LocationRequestLocation", "FULL_SCREEN");
            case 9:
                return df.j1.u0("com.pinterest.feature.board.detail.BoardDetailFeatureLocation", "BOARD");
            case 10:
                return df.j1.u0("com.pinterest.feature.browser.model.BrowserFeatureLocation", "BROWSER");
            case 11:
                return df.j1.u0("com.pinterest.feature.announcementmodal.location.AnnouncementModalFeatureLocation", "CREATOR_ANNOUNCEMENT_MODAL");
            case 12:
                return df.j1.u0("com.pinterest.creatorHub.feature.screen.CreatorHubHubLocation", "CREATOR_HUB_PAGER");
            case 13:
                return df.j1.u0("com.pinterest.feature.ideaPinCreation.screen.IdeaPinCreationLocation", "IDEA_PIN_DRAFTS");
            case 14:
                return df.j1.u0("com.pinterest.feature.ideaPinCreation.screen.IdeaPinCreationLocation", "IDEA_PIN_EDUCATION");
            case 15:
                return df.j1.u0("com.pinterest.feature.mediagallery.screen.MediaGalleryLocation", "MEDIA_GALLERY_DIRECTORY");
            case 16:
                return df.j1.u0("com.pinterest.feature.ideaPinCreation.screen.IdeaPinCreationLocation", "STORY_PIN_CREATION_CAMERA");
            case 17:
                return df.j1.u0("com.pinterest.feature.ideaPinCreation.screen.IdeaPinCreationLocation", "STORY_PIN_CREATION_CLOSEUP");
            case 18:
                return df.j1.u0("com.pinterest.feature.ideaPinCreation.screen.IdeaPinCreationLocation", "STORY_PIN_CREATION_METADATA_LIST");
            case 19:
                return df.j1.u0("com.pinterest.feature.ideaPinCreation.screen.IdeaPinCreationLocation", "STORY_PIN_VIDEO_TRIMMING");
            case 20:
                return df.j1.u0("com.pinterest.feature.browser.model.BrowserFeatureLocation", "BROWSER");
            case 21:
                return df.j1.u0("com.pinterest.closeup.screens.PinFeatureLocation", "PIN_PAGER");
            case 22:
                return df.j1.u0("com.pinterest.feature.board.detail.BoardDetailFeatureLocation", "BOARD");
            case 23:
                return df.j1.u0("com.pinterest.feature.conversation.screen.ConversationFeatureLocation", "CONVERSATION_CREATE");
            case 24:
                return df.j1.u0("com.pinterest.feature.conversation.screen.ConversationFeatureLocation", "CONVERSATION_INBOX");
            case 25:
                return df.j1.u0("com.pinterest.activity.interest.model.InterestFeatureLocation", "INTEREST");
            case 26:
                return df.j1.u0("com.pinterest.feature.settings.permissions.SettingsPermissionsFeatureLocation", "MESSAGE_SETTINGS_PERMISSIONS");
            case 27:
                return df.j1.u0("com.pinterest.feature.newshub.NewsHubFeatureLocation", "NEWS_HUB");
            case 28:
                return df.j1.u0("com.pinterest.feature.newshub.NewsHubFeatureLocation", "NOTIFICATIONS");
            default:
                return df.j1.u0("com.pinterest.closeup.screens.PinFeatureLocation", "PIN");
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f50855i) {
        }
        return b();
    }
}
