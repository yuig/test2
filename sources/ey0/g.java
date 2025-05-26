package ey0;

import ao2.j0;
import com.pinterest.api.model.f30;
import dy0.i;
import dy0.q;
import dy0.s;
import dy0.t;
import dy0.u;
import h32.a4;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j;
import l82.h;
import lh0.j2;
import u50.r;

/* loaded from: classes5.dex */
public final class g implements l82.g {

    /* renamed from: a, reason: collision with root package name */
    public final qy0.b f60658a;

    /* renamed from: b, reason: collision with root package name */
    public final c30.a f60659b;

    /* renamed from: c, reason: collision with root package name */
    public final py0.e f60660c;

    public g(qy0.b nuxSharedStateRepository, pb0.a clock, c30.a userStateService, py0.e nuxPinSelectionSEP, j2 experiments) {
        Intrinsics.checkNotNullParameter(nuxSharedStateRepository, "nuxSharedStateRepository");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(userStateService, "userStateService");
        Intrinsics.checkNotNullParameter(nuxPinSelectionSEP, "nuxPinSelectionSEP");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        this.f60658a = nuxSharedStateRepository;
        this.f60659b = userStateService;
        this.f60660c = nuxPinSelectionSEP;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x00d6 -> B:11:0x0042). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object j(ey0.g r18, ao2.j0 r19, java.lang.String r20, int r21, bl2.c r22) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ey0.g.j(ey0.g, ao2.j0, java.lang.String, int, bl2.c):java.lang.Object");
    }

    @Override // l82.g
    public final void e(j0 scope, h hVar, r eventIntake) {
        u request = (u) hVar;
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        if (request instanceof q) {
            j.z(scope, null, null, new a(((q) request).f56611a, eventIntake, null), 3);
            return;
        }
        boolean z13 = request instanceof dy0.r;
        qy0.b bVar = this.f60658a;
        if (z13) {
            eventIntake.a(new i(bVar.a()));
            return;
        }
        if (request instanceof t) {
            j.z(scope, null, null, new b(this, scope, null), 3);
            return;
        }
        if (request instanceof s) {
            a4 a4Var = ((s) request).f56613a;
            Iterator it = bVar.a().f105345g.iterator();
            while (it.hasNext()) {
                this.f60660c.e(scope, new py0.b((f30) it.next(), a4Var), c.f60642a);
            }
        }
    }
}
