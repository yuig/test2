package z01;

import ao2.j0;
import ao2.v0;
import kotlin.jvm.internal.Intrinsics;
import u50.r;
import x02.i2;

/* loaded from: classes5.dex */
public final class e implements l82.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f140543a;

    /* renamed from: b, reason: collision with root package name */
    public final i2 f140544b;

    public e(i2 pinRepository, int i13) {
        this.f140543a = i13;
        if (i13 != 1) {
            Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
            this.f140544b = pinRepository;
        } else {
            Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
            this.f140544b = pinRepository;
        }
    }

    @Override // l82.g
    public final void e(j0 scope, l82.h hVar, r eventIntake) {
        switch (this.f140543a) {
            case 0:
                y01.d request = (y01.d) hVar;
                Intrinsics.checkNotNullParameter(scope, "scope");
                Intrinsics.checkNotNullParameter(request, "request");
                Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                if (request instanceof y01.c) {
                    kotlin.jvm.internal.j.z(scope, null, null, new d(this, eventIntake, null), 3);
                    break;
                }
                break;
            default:
                p52.a request2 = (p52.a) hVar;
                Intrinsics.checkNotNullParameter(scope, "scope");
                Intrinsics.checkNotNullParameter(request2, "request");
                Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                ko2.f fVar = v0.f20219a;
                kotlin.jvm.internal.j.z(scope, ko2.e.f80326c, null, new v52.g(this, request2, eventIntake, null), 2);
                break;
        }
    }
}
