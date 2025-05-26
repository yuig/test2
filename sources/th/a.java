package th;

import android.app.Activity;
import com.facebook.login.z;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.b;

/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final Feature f117629a = new Feature("is_user_verifying_platform_authenticator_available_for_credential", 1);

    /* renamed from: b, reason: collision with root package name */
    public static final Feature f117630b = new Feature("is_user_verifying_platform_authenticator_available", 1);

    public static uh.a a(Activity activity) {
        return new uh.a(activity, uh.a.f122238k, b.En, new z(1));
    }
}
