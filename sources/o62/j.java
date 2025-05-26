package o62;

import android.graphics.Point;
import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import kg.t;
import kotlin.Unit;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import ql2.s;

/* loaded from: classes4.dex */
public final class j extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f92993a;

    public j(k kVar) {
        this.f92993a = kVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        k kVar = this.f92993a;
        ke2.d dVar = kVar.f93004k;
        if (dVar == null) {
            PointF K = t.K(e13);
            dVar = k.a(kVar, new Point((int) K.x, (int) K.y));
        }
        kVar.f93004k = dVar;
        if (dVar != null) {
            x72.j jVar = kVar.f92994a;
            int indexOf = jVar.getF52894a().f79314f.indexOf(dVar);
            f fVar = new f(indexOf);
            float f13 = t.K(e13).y;
            IntRange zIndexRange = f0.h(jVar.getF52894a().f79314f);
            int height = jVar.a().getHeight();
            Intrinsics.checkNotNullParameter(zIndexRange, "zIndexRange");
            IntRange intRange = new IntRange(indexOf, zIndexRange.f80454b, 1);
            IntRange intRange2 = new IntRange(0, indexOf, 1);
            float f14 = intRange.f80454b - indexOf;
            float f15 = kVar.f93003j;
            fVar.f92987e = Math.max(f14 / s.a(f13 - f15, f15), intRange2.f80454b / s.a((height - f13) - f15, f15));
            kVar.f93008o = fVar;
            if (!Intrinsics.d(fVar, f.f92982f) && kVar.f92996c) {
                kVar.f93009p = d.Z_ORDER;
                kVar.f92995b.P(kVar);
            }
        }
        if (kVar.f93004k == null) {
            kVar.f92997d = t.K(e13);
            kVar.f92995b.q(kVar);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent e13) {
        Unit unit;
        Intrinsics.checkNotNullParameter(e13, "e");
        PointF K = t.K(e13);
        Point point = new Point((int) K.x, (int) K.y);
        k kVar = this.f92993a;
        ke2.d a13 = k.a(kVar, point);
        if (a13 != null) {
            kVar.f92995b.G(kVar, a13);
            unit = Unit.f80348a;
        } else {
            unit = null;
        }
        if (unit != null) {
            return true;
        }
        kVar.f92995b.Q(kVar);
        return true;
    }
}
