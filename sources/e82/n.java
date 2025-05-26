package e82;

import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static final n f57884a = new n();

    /* renamed from: b, reason: collision with root package name */
    public static Date f57885b;

    /* renamed from: c, reason: collision with root package name */
    public static final uk2.d f57886c;

    static {
        uk2.d R = uk2.d.R(0);
        Intrinsics.checkNotNullExpressionValue(R, "createDefault(...)");
        f57886c = R;
    }

    public static void a(String userId, oc.c apolloClient, q12.b conversationService, fv1.b notificationCount) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(apolloClient, "apolloClient");
        Intrinsics.checkNotNullParameter(conversationService, "conversationService");
        Intrinsics.checkNotNullParameter(notificationCount, "notificationCount");
        oc.a c13 = apolloClient.c(new j30.h(userId));
        d7.b.E(c13, vc.f.NetworkOnly);
        com.bumptech.glide.d.u0(c13).r(tk2.e.f118016b).l(wj2.c.a()).o(new or1.j(28, new l(notificationCount, 0)), new or1.j(29, m.f57883i));
    }

    public static int b() {
        Integer num = (Integer) f57886c.S();
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }
}
