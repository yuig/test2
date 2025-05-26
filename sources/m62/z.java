package m62;

import android.graphics.PointF;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class z implements o62.a {

    /* renamed from: a, reason: collision with root package name */
    public x f86066a = x.UNDEFINED;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0 f86067b;

    public z(b0 b0Var) {
        this.f86067b = b0Var;
    }

    @Override // o62.a
    public final boolean a(jg1.v detector) {
        Intrinsics.checkNotNullParameter(detector, "detector");
        b0 b0Var = this.f86067b;
        float width = 1.5707964f / b0Var.f85957a.a().getWidth();
        int i13 = y.f86064a[this.f86066a.ordinal()];
        if (i13 == 1) {
            ke2.a aVar = b0Var.f85960d;
            aVar.f79302a = (((PointF) detector.f76067c).x * width) + aVar.f79302a;
        } else if (i13 == 2) {
            ke2.a aVar2 = b0Var.f85960d;
            aVar2.f79303b = (((PointF) detector.f76067c).y * width) + aVar2.f79303b;
        }
        return true;
    }

    @Override // o62.a
    public final void b(jg1.v detector) {
        Intrinsics.checkNotNullParameter(detector, "detector");
        this.f86066a = x.UNDEFINED;
        b0 b0Var = this.f86067b;
        b0Var.f85958b.T(b0Var.f85960d);
    }

    @Override // o62.a
    public final boolean c(jg1.v detector) {
        Intrinsics.checkNotNullParameter(detector, "detector");
        this.f86066a = Math.abs(((PointF) detector.f76067c).x) > Math.abs(((PointF) detector.f76067c).y) ? x.HORIZONTAL : x.VERTICAL;
        b0 b0Var = this.f86067b;
        ke2.d dVar = (ke2.d) CollectionsKt.firstOrNull(b0Var.f85957a.getF52892h().f79314f);
        if (dVar == null) {
            return true;
        }
        ke2.a aVar = dVar.f79320b.f79307d;
        b0Var.f85960d = aVar;
        float f13 = aVar.f79302a;
        return true;
    }
}
