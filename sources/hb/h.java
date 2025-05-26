package hb;

import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import eb.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final db.l f68493a;

    public h() {
        db.l verificationMode = db.l.QUIET;
        Intrinsics.checkNotNullParameter(verificationMode, "verificationMode");
        this.f68493a = verificationMode;
    }

    public static boolean a(SidecarDeviceState sidecarDeviceState, SidecarDeviceState sidecarDeviceState2) {
        if (Intrinsics.d(sidecarDeviceState, sidecarDeviceState2)) {
            return true;
        }
        return (sidecarDeviceState == null || sidecarDeviceState2 == null || c.b(sidecarDeviceState) != c.b(sidecarDeviceState2)) ? false : true;
    }

    public static boolean b(SidecarDisplayFeature sidecarDisplayFeature, SidecarDisplayFeature sidecarDisplayFeature2) {
        if (Intrinsics.d(sidecarDisplayFeature, sidecarDisplayFeature2)) {
            return true;
        }
        if (sidecarDisplayFeature == null || sidecarDisplayFeature2 == null || sidecarDisplayFeature.getType() != sidecarDisplayFeature2.getType()) {
            return false;
        }
        return Intrinsics.d(sidecarDisplayFeature.getRect(), sidecarDisplayFeature2.getRect());
    }

    public static boolean c(List list, List list2) {
        if (list == list2) {
            return true;
        }
        if (list == null || list2 == null || list.size() != list2.size()) {
            return false;
        }
        int size = list.size();
        for (int i13 = 0; i13 < size; i13++) {
            if (!b((SidecarDisplayFeature) list.get(i13), (SidecarDisplayFeature) list2.get(i13))) {
                return false;
            }
        }
        return true;
    }

    public static boolean d(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarWindowLayoutInfo sidecarWindowLayoutInfo2) {
        if (Intrinsics.d(sidecarWindowLayoutInfo, sidecarWindowLayoutInfo2)) {
            return true;
        }
        if (sidecarWindowLayoutInfo == null || sidecarWindowLayoutInfo2 == null) {
            return false;
        }
        return c(c.c(sidecarWindowLayoutInfo), c.c(sidecarWindowLayoutInfo2));
    }

    public final p e(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarDeviceState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (sidecarWindowLayoutInfo == null) {
            return new p(f0.g());
        }
        SidecarDeviceState sidecarDeviceState = new SidecarDeviceState();
        c.d(sidecarDeviceState, c.b(state));
        return new p(f(c.c(sidecarWindowLayoutInfo), sidecarDeviceState));
    }

    public final ArrayList f(List sidecarDisplayFeatures, SidecarDeviceState deviceState) {
        Intrinsics.checkNotNullParameter(sidecarDisplayFeatures, "sidecarDisplayFeatures");
        Intrinsics.checkNotNullParameter(deviceState, "deviceState");
        ArrayList arrayList = new ArrayList();
        Iterator it = sidecarDisplayFeatures.iterator();
        while (it.hasNext()) {
            eb.h g13 = g((SidecarDisplayFeature) it.next(), deviceState);
            if (g13 != null) {
                arrayList.add(g13);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0061, code lost:
    
        if (r6 == 4) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final eb.h g(androidx.window.sidecar.SidecarDisplayFeature r5, androidx.window.sidecar.SidecarDeviceState r6) {
        /*
            r4 = this;
            java.lang.String r0 = "feature"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "deviceState"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "TAG"
            java.lang.String r1 = "h"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            db.l r0 = r4.f68493a
            db.k r0 = g4.u.A0(r5, r0)
            hb.d r1 = hb.d.f68489i
            java.lang.String r2 = "Type must be either TYPE_FOLD or TYPE_HINGE"
            db.j r0 = r0.c(r2, r1)
            hb.e r1 = hb.e.f68490i
            java.lang.String r2 = "Feature bounds must not be 0"
            db.j r0 = r0.c(r2, r1)
            hb.f r1 = hb.f.f68491i
            java.lang.String r2 = "TYPE_FOLD must have 0 area"
            db.j r0 = r0.c(r2, r1)
            hb.g r1 = hb.g.f68492i
            java.lang.String r2 = "Feature be pinned to either left or top"
            db.j r0 = r0.c(r2, r1)
            java.lang.Object r0 = r0.a()
            androidx.window.sidecar.SidecarDisplayFeature r0 = (androidx.window.sidecar.SidecarDisplayFeature) r0
            r1 = 0
            if (r0 != 0) goto L41
            return r1
        L41:
            int r0 = r0.getType()
            r2 = 2
            r3 = 1
            if (r0 == r3) goto L4f
            if (r0 == r2) goto L4c
            return r1
        L4c:
            eb.g r0 = eb.g.f58190c
            goto L51
        L4f:
            eb.g r0 = eb.g.f58189b
        L51:
            int r6 = hb.c.b(r6)
            if (r6 == 0) goto L7a
            if (r6 == r3) goto L7a
            if (r6 == r2) goto L64
            eb.e r2 = eb.e.f58186b
            r3 = 3
            if (r6 == r3) goto L66
            r3 = 4
            if (r6 == r3) goto L7a
            goto L66
        L64:
            eb.e r2 = eb.e.f58187c
        L66:
            eb.h r6 = new eb.h
            db.b r1 = new db.b
            android.graphics.Rect r5 = r5.getRect()
            java.lang.String r3 = "feature.rect"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r3)
            r1.<init>(r5)
            r6.<init>(r1, r0, r2)
            return r6
        L7a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: hb.h.g(androidx.window.sidecar.SidecarDisplayFeature, androidx.window.sidecar.SidecarDeviceState):eb.h");
    }
}
