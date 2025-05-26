package le;

import android.content.Intent;
import com.facebook.Profile;
import df.j1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: d, reason: collision with root package name */
    public static final wc.b f83056d = new wc.b(22, 0);

    /* renamed from: e, reason: collision with root package name */
    public static volatile j0 f83057e;

    /* renamed from: a, reason: collision with root package name */
    public final z6.c f83058a;

    /* renamed from: b, reason: collision with root package name */
    public final i0 f83059b;

    /* renamed from: c, reason: collision with root package name */
    public Profile f83060c;

    public j0(z6.c localBroadcastManager, i0 profileCache) {
        Intrinsics.checkNotNullParameter(localBroadcastManager, "localBroadcastManager");
        Intrinsics.checkNotNullParameter(profileCache, "profileCache");
        this.f83058a = localBroadcastManager;
        this.f83059b = profileCache;
    }

    public final void a(Profile profile, boolean z13) {
        Profile profile2 = this.f83060c;
        this.f83060c = profile;
        if (z13) {
            i0 i0Var = this.f83059b;
            if (profile != null) {
                i0Var.getClass();
                Intrinsics.checkNotNullParameter(profile, "profile");
                JSONObject a13 = profile.a();
                if (a13 != null) {
                    i0Var.f83054a.edit().putString("com.facebook.ProfileManager.CachedProfile", a13.toString()).apply();
                }
            } else {
                i0Var.f83054a.edit().remove("com.facebook.ProfileManager.CachedProfile").apply();
            }
        }
        if (j1.p(profile2, profile)) {
            return;
        }
        Intent intent = new Intent("com.facebook.sdk.ACTION_CURRENT_PROFILE_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_PROFILE", profile2);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_PROFILE", profile);
        this.f83058a.c(intent);
    }
}
