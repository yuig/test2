package ha0;

import ao2.j0;
import ao2.v0;
import com.pinterest.repository.pin.PinService;
import fa0.c0;
import fa0.w0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import u50.r;
import x02.i2;

/* loaded from: classes5.dex */
public final class j implements l82.g {

    /* renamed from: a, reason: collision with root package name */
    public final PinService f68387a;

    /* renamed from: b, reason: collision with root package name */
    public final i2 f68388b;

    public j(PinService pinService, i2 pinRepository) {
        Intrinsics.checkNotNullParameter(pinService, "pinService");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        this.f68387a = pinService;
        this.f68388b = pinRepository;
    }

    @Override // l82.g
    public final void e(j0 scope, l82.h hVar, r eventIntake) {
        c0 request = (c0) hVar;
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        if (request instanceof fa0.b) {
            kotlin.jvm.internal.j.z(scope, v0.f20219a, null, new h(this, request, eventIntake, null), 2);
            return;
        }
        if (request instanceof fa0.f) {
            fa0.f fVar = (fa0.f) request;
            List list = fVar.f61481b;
            eventIntake.a(new w0(!list.isEmpty()));
            String pinId = fVar.f61480a.f106906a;
            i onLoad = new i(eventIntake, list, 0);
            ca0.j0 onFail = new ca0.j0(eventIntake, 1);
            Intrinsics.checkNotNullParameter(scope, "scope");
            PinService pinService = this.f68387a;
            Intrinsics.checkNotNullParameter(pinService, "pinService");
            i2 pinRepository = this.f68388b;
            Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
            Intrinsics.checkNotNullParameter(pinId, "pinId");
            Intrinsics.checkNotNullParameter(onLoad, "onLoad");
            Intrinsics.checkNotNullParameter(onFail, "onFail");
            ko2.f fVar2 = v0.f20219a;
            kotlin.jvm.internal.j.z(scope, ko2.e.f80326c, null, new ja0.d(pinRepository, onLoad, onFail, pinService, pinId, null), 2);
        }
    }
}
