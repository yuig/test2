package ec;

import a.cb;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f58334a;

    /* renamed from: b, reason: collision with root package name */
    public PointF f58335b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f58336c;

    public q(PointF pointF, boolean z13, List list) {
        this.f58335b = pointF;
        this.f58336c = z13;
        this.f58334a = new ArrayList(list);
    }

    public final void a(float f13, float f14) {
        if (this.f58335b == null) {
            this.f58335b = new PointF();
        }
        this.f58335b.set(f13, f14);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ShapeData{numCurves=");
        sb3.append(this.f58334a.size());
        sb3.append("closed=");
        return cb.m(sb3, this.f58336c, '}');
    }

    public q() {
        this.f58334a = new ArrayList();
    }
}
