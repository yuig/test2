package com.pinterest.screens;

import com.pinterest.framework.screens.ScreenLocation;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class i2 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: j, reason: collision with root package name */
    public static final i2 f50956j = new i2(0);

    /* renamed from: k, reason: collision with root package name */
    public static final i2 f50957k = new i2(1);

    /* renamed from: l, reason: collision with root package name */
    public static final i2 f50958l = new i2(2);

    /* renamed from: m, reason: collision with root package name */
    public static final i2 f50959m = new i2(3);

    /* renamed from: n, reason: collision with root package name */
    public static final i2 f50960n = new i2(4);

    /* renamed from: o, reason: collision with root package name */
    public static final i2 f50961o = new i2(5);

    /* renamed from: p, reason: collision with root package name */
    public static final i2 f50962p = new i2(6);

    /* renamed from: q, reason: collision with root package name */
    public static final i2 f50963q = new i2(7);

    /* renamed from: r, reason: collision with root package name */
    public static final i2 f50964r = new i2(8);

    /* renamed from: s, reason: collision with root package name */
    public static final i2 f50965s = new i2(9);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f50966i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i2(int i13) {
        super(0);
        this.f50966i = i13;
    }

    public final ScreenLocation b() {
        switch (this.f50966i) {
            case 0:
                return df.j1.u0("com.pinterest.identity.authentication.AuthenticationLocation", "UNAUTH_LOADING_SCREEN");
            case 1:
                return df.j1.u0("com.pinterest.identity.authentication.AuthenticationLocation", "UNAUTH_LOGIN_WITH_EXISTING_EMAIL_SCREEN");
            case 2:
                return df.j1.u0("com.pinterest.identity.authentication.AuthenticationLocation", "UNAUTH_MFA_LOGIN_SCREEN");
            case 3:
                return df.j1.u0("com.pinterest.identity.authentication.AuthenticationLocation", "UNAUTH_PENDING_SIGNUP_SCREEN");
            case 4:
                return df.j1.u0("com.pinterest.identity.authentication.AuthenticationLocation", "UNAUTH_SIGNUP_STEP_SCREEN");
            case 5:
                return df.j1.u0("com.pinterest.feature.profile.ProfileFeatureLocation", "USER");
            case 6:
                return df.j1.u0("com.pinterest.creatorHub.feature.screen.CreatorHubHubLocation", "CREATOR_HUB_PAGER");
            case 7:
                return df.j1.u0("com.pinterest.feature.newshub.NewsHubFeatureLocation", "NOTIFICATIONS_HOST");
            case 8:
                return df.j1.u0("com.pinterest.searchLanding.framework.screens.SearchLandingFeatureLocation", "SEARCH_LANDING");
            default:
                return df.j1.u0("com.pinterest.feature.profile.ProfileFeatureLocation", "USER");
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f50966i) {
        }
        return b();
    }
}
