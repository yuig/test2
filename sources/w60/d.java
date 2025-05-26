package w60;

import al1.i;
import ao2.j0;
import ao2.v0;
import ba1.f0;
import ba1.m0;
import bo2.e;
import c61.k0;
import c61.w0;
import com.pinterest.boardAutoCollages.v;
import ho2.q;
import jx1.o;
import jx1.p;
import ko2.f;
import kotlin.jvm.internal.Intrinsics;
import l82.g;
import l82.h;
import ll.j;
import t02.l;
import t02.m;
import tx1.k;
import u50.r;
import u52.y0;

/* loaded from: classes5.dex */
public final class d implements g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f128118a;

    /* renamed from: b, reason: collision with root package name */
    public final j f128119b;

    public d(j navigator, int i13) {
        this.f128118a = i13;
        switch (i13) {
            case 1:
                Intrinsics.checkNotNullParameter(navigator, "navigator");
                this.f128119b = navigator;
                break;
            case 2:
                Intrinsics.checkNotNullParameter(navigator, "screenNavigator");
                this.f128119b = navigator;
                break;
            case 3:
                Intrinsics.checkNotNullParameter(navigator, "navigator");
                this.f128119b = navigator;
                break;
            case 4:
                Intrinsics.checkNotNullParameter(navigator, "screenNavigator");
                this.f128119b = navigator;
                break;
            case 5:
                Intrinsics.checkNotNullParameter(navigator, "screenNavigator");
                this.f128119b = navigator;
                break;
            case 6:
                Intrinsics.checkNotNullParameter(navigator, "screenNavigator");
                this.f128119b = navigator;
                break;
            case 7:
                Intrinsics.checkNotNullParameter(navigator, "screenNavigator");
                this.f128119b = navigator;
                break;
            default:
                Intrinsics.checkNotNullParameter(navigator, "screenNavigator");
                this.f128119b = navigator;
                break;
        }
    }

    @Override // l82.g
    public final void e(j0 scope, h hVar, r eventIntake) {
        switch (this.f128118a) {
            case 0:
                v request = (v) hVar;
                Intrinsics.checkNotNullParameter(scope, "scope");
                Intrinsics.checkNotNullParameter(request, "request");
                Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                f fVar = v0.f20219a;
                kotlin.jvm.internal.j.z(scope, q.f69782a, null, new c(request, this, null), 2);
                break;
            case 1:
                w0 request2 = (w0) hVar;
                Intrinsics.checkNotNullParameter(scope, "scope");
                Intrinsics.checkNotNullParameter(request2, "request");
                Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                f fVar2 = v0.f20219a;
                kotlin.jvm.internal.j.z(scope, q.f69782a, null, new k0(request2, this, null), 2);
                break;
            case 2:
                m0 request3 = (m0) hVar;
                Intrinsics.checkNotNullParameter(scope, "scope");
                Intrinsics.checkNotNullParameter(request3, "request");
                Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                f fVar3 = v0.f20219a;
                kotlin.jvm.internal.j.z(scope, q.f69782a, null, new f0(request3, this, null), 2);
                break;
            case 3:
                j(scope, (i) hVar, eventIntake);
                break;
            case 4:
                p request4 = (p) hVar;
                Intrinsics.checkNotNullParameter(scope, "scope");
                Intrinsics.checkNotNullParameter(request4, "request");
                Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                if (request4 instanceof o) {
                    f fVar4 = v0.f20219a;
                    kotlin.jvm.internal.j.z(scope, q.f69782a, null, new kx1.a(this, null), 2);
                    break;
                }
                break;
            case 5:
                k request5 = (k) hVar;
                Intrinsics.checkNotNullParameter(scope, "scope");
                Intrinsics.checkNotNullParameter(request5, "request");
                Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                if (!(request5 instanceof tx1.j)) {
                    if (request5 instanceof tx1.i) {
                        f fVar5 = v0.f20219a;
                        kotlin.jvm.internal.j.z(scope, q.f69782a, null, new ux1.b(this, null), 2);
                        break;
                    }
                } else {
                    f fVar6 = v0.f20219a;
                    kotlin.jvm.internal.j.z(scope, q.f69782a, null, new ux1.a(this, null), 2);
                    break;
                }
                break;
            case 6:
                m request6 = (m) hVar;
                Intrinsics.checkNotNullParameter(scope, "scope");
                Intrinsics.checkNotNullParameter(request6, "request");
                Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                if (request6 instanceof l) {
                    f fVar7 = v0.f20219a;
                    kotlin.jvm.internal.j.z(scope, q.f69782a, null, new u02.a(this, null), 2);
                    break;
                }
                break;
            default:
                y0 request7 = (y0) hVar;
                Intrinsics.checkNotNullParameter(scope, "scope");
                Intrinsics.checkNotNullParameter(request7, "request");
                Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                f fVar8 = v0.f20219a;
                kotlin.jvm.internal.j.z(scope, ((e) q.f69782a).f23612f, null, new v52.e(request7, this, null), 2);
                break;
        }
    }

    public final void j(j0 scope, i request, r eventIntake) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        f fVar = v0.f20219a;
        kotlin.jvm.internal.j.z(scope, ((e) q.f69782a).f23612f, null, new al1.m(request, this, null), 2);
    }
}
