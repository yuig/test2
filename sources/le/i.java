package le;

import android.content.SharedPreferences;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f83053a;

    public i() {
        SharedPreferences sharedPreferences = v.a().getSharedPreferences("com.facebook.AuthenticationTokenManager.SharedPreferences", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "FacebookSdk.getApplicationContext()\n              .getSharedPreferences(\n                  AuthenticationTokenManager.SHARED_PREFERENCES_NAME, Context.MODE_PRIVATE)");
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        this.f83053a = sharedPreferences;
    }
}
