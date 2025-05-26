package g31;

import com.pinterest.analytics.TrackingParamKeyBuilder;
import com.pinterest.api.model.f30;
import h32.a4;
import h32.d4;
import is1.s;
import is1.t;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import x02.i2;

/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final w f63449a;

    /* renamed from: b, reason: collision with root package name */
    public final i2 f63450b;

    /* renamed from: c, reason: collision with root package name */
    public final s f63451c;

    public g(w eventManager, i2 pinRepository, t pinSwipePreferences) {
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter("user_pins", "closeupTrafficSource");
        Intrinsics.checkNotNullParameter(pinSwipePreferences, "pinSwipePreferences");
        this.f63449a = eventManager;
        this.f63450b = pinRepository;
        this.f63451c = pinSwipePreferences;
    }

    public static void a(g gVar, f30 pin, List feed, d4 viewType, a4 a4Var, String str) {
        gVar.getClass();
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(feed, "feed");
        Intrinsics.checkNotNullParameter(viewType, "viewType");
        TrackingParamKeyBuilder trackingParamKeyBuilder = new TrackingParamKeyBuilder(a4Var, viewType, str);
        np0.e eVar = new np0.e(gVar.f63450b);
        eVar.f91749b = new f(gVar, trackingParamKeyBuilder, 0);
        eVar.a(pin, feed, null, ((t) gVar.f63451c).a(pin));
    }
}
