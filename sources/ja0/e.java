package ja0;

import ao2.j0;
import ao2.v0;
import com.pinterest.repository.pin.PinService;
import ea0.c0;
import ea0.q0;
import ha0.i;
import java.util.List;
import ko2.f;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j;
import l82.g;
import l82.h;
import u50.r;
import x02.i2;

/* loaded from: classes5.dex */
public final class e implements g {

    /* renamed from: a, reason: collision with root package name */
    public final PinService f75300a;

    /* renamed from: b, reason: collision with root package name */
    public final i2 f75301b;

    public e(PinService pinService, i2 pinRepository) {
        Intrinsics.checkNotNullParameter(pinService, "pinService");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        this.f75300a = pinService;
        this.f75301b = pinRepository;
    }

    @Override // l82.g
    public final void e(j0 scope, h hVar, r eventIntake) {
        c0 request = (c0) hVar;
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        if (request instanceof ea0.e) {
            ea0.e eVar = (ea0.e) request;
            List list = eVar.f57951b;
            eventIntake.a(new q0(!list.isEmpty()));
            String pinId = eVar.f57950a.f106906a;
            i onLoad = new i(eventIntake, list, 1);
            ca0.j0 onFail = new ca0.j0(eventIntake, 2);
            Intrinsics.checkNotNullParameter(scope, "scope");
            PinService pinService = this.f75300a;
            Intrinsics.checkNotNullParameter(pinService, "pinService");
            i2 pinRepository = this.f75301b;
            Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
            Intrinsics.checkNotNullParameter(pinId, "pinId");
            Intrinsics.checkNotNullParameter(onLoad, "onLoad");
            Intrinsics.checkNotNullParameter(onFail, "onFail");
            f fVar = v0.f20219a;
            j.z(scope, ko2.e.f80326c, null, new d(pinRepository, onLoad, onFail, pinService, pinId, null), 2);
        }
    }
}
