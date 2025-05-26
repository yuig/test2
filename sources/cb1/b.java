package cb1;

import ao2.j0;
import com.pinterest.feature.settings.notifications.d0;
import do2.f2;
import do2.g2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j;
import l82.g;
import l82.h;
import n91.z;
import u50.r;

/* loaded from: classes5.dex */
public final class b implements g {

    /* renamed from: a, reason: collision with root package name */
    public static final z f27265a = new z(25, 0);

    /* renamed from: b, reason: collision with root package name */
    public static final f2 f27266b = g2.b(0, 0, null, 7);

    @Override // l82.g
    public final void e(j0 scope, h hVar, r eventIntake) {
        d0 request = (d0) hVar;
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        j.z(scope, null, null, new a(request, null), 3);
    }
}
