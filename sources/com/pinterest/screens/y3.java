package com.pinterest.screens;

import com.pinterest.framework.screens.ScreenLocation;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class y3 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f51621i;

    /* renamed from: j, reason: collision with root package name */
    public static final y3 f51604j = new y3(0);

    /* renamed from: k, reason: collision with root package name */
    public static final y3 f51605k = new y3(1);

    /* renamed from: l, reason: collision with root package name */
    public static final y3 f51606l = new y3(2);

    /* renamed from: m, reason: collision with root package name */
    public static final y3 f51607m = new y3(3);

    /* renamed from: n, reason: collision with root package name */
    public static final y3 f51608n = new y3(4);

    /* renamed from: o, reason: collision with root package name */
    public static final y3 f51609o = new y3(5);

    /* renamed from: p, reason: collision with root package name */
    public static final y3 f51610p = new y3(6);

    /* renamed from: q, reason: collision with root package name */
    public static final y3 f51611q = new y3(7);

    /* renamed from: r, reason: collision with root package name */
    public static final y3 f51612r = new y3(8);

    /* renamed from: s, reason: collision with root package name */
    public static final y3 f51613s = new y3(9);

    /* renamed from: t, reason: collision with root package name */
    public static final y3 f51614t = new y3(10);

    /* renamed from: u, reason: collision with root package name */
    public static final y3 f51615u = new y3(11);

    /* renamed from: v, reason: collision with root package name */
    public static final y3 f51616v = new y3(12);

    /* renamed from: w, reason: collision with root package name */
    public static final y3 f51617w = new y3(13);

    /* renamed from: x, reason: collision with root package name */
    public static final y3 f51618x = new y3(14);

    /* renamed from: y, reason: collision with root package name */
    public static final y3 f51619y = new y3(15);

    /* renamed from: z, reason: collision with root package name */
    public static final y3 f51620z = new y3(16);
    public static final y3 A = new y3(17);
    public static final y3 B = new y3(18);
    public static final y3 C = new y3(19);
    public static final y3 D = new y3(20);
    public static final y3 E = new y3(21);
    public static final y3 F = new y3(22);
    public static final y3 G = new y3(23);
    public static final y3 H = new y3(24);
    public static final y3 I = new y3(25);

    /* renamed from: J, reason: collision with root package name */
    public static final y3 f51603J = new y3(26);
    public static final y3 K = new y3(27);
    public static final y3 L = new y3(28);
    public static final y3 M = new y3(29);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y3(int i13) {
        super(0);
        this.f51621i = i13;
    }

    public final ScreenLocation b() {
        switch (this.f51621i) {
            case 0:
                return df.j1.u0("com.pinterest.settingsAccount.framework.screens.SettingsAccountFeatureLocation", "EMAIL_OTP_CONFIRMATION");
            case 1:
                return df.j1.u0("com.pinterest.feature.homefeed.navigation.HomeFeedLocation", "HOME");
            case 2:
                return df.j1.u0("com.pinterest.feature.settings.passcode.PasscodeLocation", "PASSCODE_REQUIRED");
            case 3:
                return df.j1.u0("com.pinterest.feature.settings.passcode.PasscodeLocation", "PASSCODE_REQUIRED_SBA");
            case 4:
                return df.j1.u0("com.pinterest.feature.settings.passcode.PasscodeLocation", "PASSCODE_SETTINGS");
            case 5:
                return df.j1.u0("com.pinterest.feature.settings.passcode.PasscodeLocation", "PASSCODE_SETUP_INSTRUCTIONS");
            case 6:
                return df.j1.u0("com.pinterest.feature.settings.passcode.PasscodeLocation", "PASSCODE_SUMMARY");
            case 7:
                return df.j1.u0("com.pinterest.feature.settings.passcode.PasscodeLocation", "PASSCODE_SUMMARY_SBA");
            case 8:
                return df.j1.u0("com.pinterest.feature.profile.ProfileFeatureLocation", "PROFILE_FOLLOWERS");
            case 9:
                return df.j1.u0("com.pinterest.settingsAccount.framework.screens.SettingsAccountFeatureLocation", "SETTINGS_ACCOUNT_MANAGEMENT");
            case 10:
                return df.j1.u0("com.pinterest.settingsAccount.framework.screens.SettingsAccountFeatureLocation", "SETTINGS_ADD_ACCOUNT");
            case 11:
                return df.j1.u0("com.pinterest.settingsAccount.framework.screens.SettingsAccountFeatureLocation", "SETTINGS_CREATE_BUSINESS_LANDING");
            case 12:
                return df.j1.u0("com.pinterest.settingsAccount.framework.screens.SettingsAccountFeatureLocation", "SETTINGS_PROFILE_VISIBILITY");
            case 13:
                return df.j1.u0("com.pinterest.identity.authentication.AuthenticationLocation", "UNAUTH_SIGNUP_STEP_SCREEN");
            case 14:
                return df.j1.u0("com.pinterest.partnerAnalytics.PartnerAnalyticsLocation", "AUDIENCE_INSIGHTS");
            case 15:
                return df.j1.u0("com.pinterest.feature.settings.permissions.SettingsPermissionsFeatureLocation", "BLOCKED_ACCOUNTS_SETTINGS");
            case 16:
                return df.j1.u0("com.pinterest.creatorHub.feature.brandedContent.BrandedContentLocation", "BRANDED_CONTENT_AGREEMENT");
            case 17:
                return df.j1.u0("com.pinterest.creatorHub.feature.brandedContent.BrandedContentLocation", "BRANDED_CONTENT_ENROLLED");
            case 18:
                return df.j1.u0("com.pinterest.creatorHub.feature.screen.CreatorHubHubLocation", "CREATOR_HUB_PAGER");
            case 19:
                return df.j1.u0("com.pinterest.feature.home.model.HomeFeedTunerLocation", "HOMEFEED_TUNER");
            case 20:
                return df.j1.u0("com.pinterest.partnerAnalytics.PartnerAnalyticsLocation", "HOME_ANALYTICS");
            case 21:
                return df.j1.u0("com.pinterest.feature.settings.permissions.SettingsPermissionsFeatureLocation", "MENTIONS_CONTROL_SETTINGS");
            case 22:
                return df.j1.u0("com.pinterest.feature.settings.permissions.SettingsPermissionsFeatureLocation", "MESSAGE_LEVEL_SETTINGS_PERMISSIONS");
            case 23:
                return df.j1.u0("com.pinterest.feature.settings.permissions.SettingsPermissionsFeatureLocation", "MESSAGE_SETTINGS_PERMISSIONS");
            case 24:
                return df.j1.u0("com.pinterest.settingsAccount.framework.screens.SettingsAccountFeatureLocation", "SETTINGS_ACCOUNT_MANAGEMENT");
            case 25:
                return df.j1.u0("com.pinterest.settingsAccount.framework.screens.SettingsAccountFeatureLocation", "SETTINGS_ACCOUNT_SWITCHER");
            case 26:
                return df.j1.u0("com.pinterest.settingsAccount.framework.screens.SettingsAccountFeatureLocation", "SETTINGS_ADD_ACCOUNT");
            case 27:
                return df.j1.u0("com.pinterest.feature.settings.menu.SettingsMenuFeatureLocation", "SETTINGS_APP_ABOUT");
            case 28:
                return df.j1.u0("com.pinterest.settingsAccount.framework.screens.SettingsAccountFeatureLocation", "SETTINGS_CLAIMED_AMAZON_ACCOUNT");
            default:
                return df.j1.u0("com.pinterest.settingsAccount.framework.screens.SettingsAccountFeatureLocation", "SETTINGS_CLAIMED_TARGET_ACCOUNT");
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f51621i) {
        }
        return b();
    }
}
