package va1;

import com.pinterest.api.model.wy0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class v extends kotlin.jvm.internal.s implements kl2.l {

    /* renamed from: i, reason: collision with root package name */
    public static final v f125250i = new v(3);

    @Override // kl2.l
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        wy0 userRepository = (wy0) obj;
        wy0 userSettings = (wy0) obj2;
        Boolean shouldShowClaimedAccountsBanner = (Boolean) obj3;
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(userSettings, "userSettings");
        Intrinsics.checkNotNullParameter(shouldShowClaimedAccountsBanner, "shouldShowClaimedAccountsBanner");
        return new xk2.w(userRepository, userSettings.y2(), shouldShowClaimedAccountsBanner);
    }
}
