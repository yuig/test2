package hr1;

import com.facebook.AccessToken;
import com.facebook.Profile;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class c extends s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public static final c f69985i = new c(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        AccessToken accessToken = (AccessToken) obj;
        Profile profile = (Profile) obj2;
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(profile, "profile");
        return new b(accessToken, profile);
    }
}
