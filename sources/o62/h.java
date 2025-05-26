package o62;

import android.graphics.Point;
import android.graphics.PointF;
import java.util.concurrent.CopyOnWriteArrayList;
import jg1.v;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import ql2.s;

/* loaded from: classes4.dex */
public final class h implements a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f92989a;

    @Override // o62.a
    public boolean a(v detector) {
        Intrinsics.checkNotNullParameter(detector, "detector");
        k kVar = this.f92989a;
        ke2.d dVar = kVar.f93004k;
        if (dVar == null) {
            return false;
        }
        int i13 = g.f92988a[kVar.f93009p.ordinal()];
        if (i13 != 1) {
            if (i13 == 2) {
                CopyOnWriteArrayList copyOnWriteArrayList = kVar.f92994a.getF52900a().f79314f;
                if (!copyOnWriteArrayList.isEmpty()) {
                    f fVar = kVar.f93008o;
                    float f13 = ((PointF) detector.f76067c).y;
                    IntRange zIndexRange = f0.h(copyOnWriteArrayList);
                    fVar.getClass();
                    Intrinsics.checkNotNullParameter(zIndexRange, "zIndexRange");
                    float f14 = fVar.f92986d - (f13 * fVar.f92987e);
                    fVar.f92986d = f14;
                    fVar.f92985c = fVar.f92984b;
                    fVar.f92984b = s.h(ml2.c.c(f14), zIndexRange);
                }
            }
        } else {
            if (oe.f.W0(dVar)) {
                return false;
            }
            if (!kVar.f93011r.isInProgress()) {
                boolean z13 = kVar.f92998e;
                if (!z13 && !kVar.f92999f) {
                    PointF pointF = kVar.f93005l;
                    PointF pointF2 = (PointF) detector.f76067c;
                    PointF pointF3 = new PointF(pointF.x, pointF.y);
                    pointF3.offset(pointF2.x, pointF2.y);
                    kVar.f93005l = pointF3;
                } else if (!z13) {
                    kVar.f93005l.y += ((PointF) detector.f76067c).y;
                } else if (!kVar.f92999f) {
                    kVar.f93005l.x += ((PointF) detector.f76067c).x;
                }
            }
            kVar.f92995b.b(dVar);
        }
        return true;
    }

    @Override // o62.a
    public void b(v detector) {
        Intrinsics.checkNotNullParameter(detector, "detector");
        k kVar = this.f92989a;
        ke2.d dVar = kVar.f93004k;
        if (dVar == null) {
            return;
        }
        kVar.f92995b.a(dVar);
    }

    @Override // o62.a
    public boolean c(v detector) {
        Intrinsics.checkNotNullParameter(detector, "detector");
        k kVar = this.f92989a;
        ke2.d dVar = kVar.f93004k;
        if (dVar == null) {
            PointF pointF = (PointF) detector.f76071g;
            dVar = k.a(kVar, new Point((int) pointF.x, (int) pointF.y));
            if (dVar == null || !(!oe.f.W0(dVar))) {
                dVar = null;
            }
        }
        kVar.f93004k = dVar;
        if (dVar == null) {
            return false;
        }
        if (kVar.f93009p == d.DEFAULT) {
            if (oe.f.W0(dVar)) {
                return false;
            }
            kVar.f93005l = dVar.f79320b.f79304a;
            kVar.f92995b.c(dVar);
        }
        return true;
    }

    public boolean d(b detector) {
        ke2.d dVar;
        Intrinsics.checkNotNullParameter(detector, "detector");
        k kVar = this.f92989a;
        if (kVar.f93009p != d.DEFAULT || (dVar = kVar.f93004k) == null || oe.f.W0(dVar)) {
            return false;
        }
        kVar.f93007n = dVar.f79320b.f79306c;
        return true;
    }
}
