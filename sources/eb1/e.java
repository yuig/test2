package eb1;

import ao2.j0;
import com.pinterest.feature.settings.notifications.f0;
import do2.f2;
import do2.g2;
import kotlin.jvm.internal.Intrinsics;
import ll.j;
import n91.z;
import u50.r;

/* loaded from: classes5.dex */
public final class e implements l82.g {

    /* renamed from: b, reason: collision with root package name */
    public static final z f58233b = new z(26, 0);

    /* renamed from: c, reason: collision with root package name */
    public static final f2 f58234c = g2.b(0, 0, null, 7);

    /* renamed from: a, reason: collision with root package name */
    public final j f58235a;

    public e(j notificationsSettingsDataSource) {
        Intrinsics.checkNotNullParameter(notificationsSettingsDataSource, "notificationsSettingsDataSource");
        this.f58235a = notificationsSettingsDataSource;
    }

    @Override // l82.g
    public final void e(j0 scope, l82.h hVar, r eventIntake) {
        f0 request = (f0) hVar;
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        kotlin.jvm.internal.j.z(scope, null, null, new d(this, request, scope, null), 3);
    }
}
