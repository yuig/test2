package zb;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes3.dex */
public final class q extends e {

    /* renamed from: i, reason: collision with root package name */
    public final PointF f141525i;

    /* renamed from: j, reason: collision with root package name */
    public final PointF f141526j;

    /* renamed from: k, reason: collision with root package name */
    public final e f141527k;

    /* renamed from: l, reason: collision with root package name */
    public final e f141528l;

    /* renamed from: m, reason: collision with root package name */
    public androidx.appcompat.app.d f141529m;

    /* renamed from: n, reason: collision with root package name */
    public androidx.appcompat.app.d f141530n;

    public q(i iVar, i iVar2) {
        super(Collections.emptyList());
        this.f141525i = new PointF();
        this.f141526j = new PointF();
        this.f141527k = iVar;
        this.f141528l = iVar2;
        k(this.f141497d);
    }

    @Override // zb.e
    public final Object g() {
        return m(0.0f);
    }

    @Override // zb.e
    public final /* bridge */ /* synthetic */ Object h(kc.a aVar, float f13) {
        return m(f13);
    }

    @Override // zb.e
    public final void k(float f13) {
        e eVar = this.f141527k;
        eVar.k(f13);
        e eVar2 = this.f141528l;
        eVar2.k(f13);
        this.f141525i.set(((Float) eVar.g()).floatValue(), ((Float) eVar2.g()).floatValue());
        int i13 = 0;
        while (true) {
            ArrayList arrayList = this.f141494a;
            if (i13 >= arrayList.size()) {
                return;
            }
            ((a) arrayList.get(i13)).a();
            i13++;
        }
    }

    public final PointF m(float f13) {
        Float f14;
        e eVar;
        kc.a b13;
        e eVar2;
        kc.a b14;
        Float f15 = null;
        if (this.f141529m == null || (b14 = (eVar2 = this.f141527k).b()) == null) {
            f14 = null;
        } else {
            float d2 = eVar2.d();
            Float f16 = b14.f79110h;
            androidx.appcompat.app.d dVar = this.f141529m;
            float f17 = b14.f79109g;
            f14 = (Float) dVar.B(f17, f16 == null ? f17 : f16.floatValue(), (Float) b14.f79104b, (Float) b14.f79105c, f13, f13, d2);
        }
        if (this.f141530n != null && (b13 = (eVar = this.f141528l).b()) != null) {
            float d13 = eVar.d();
            Float f18 = b13.f79110h;
            androidx.appcompat.app.d dVar2 = this.f141530n;
            float f19 = b13.f79109g;
            f15 = (Float) dVar2.B(f19, f18 == null ? f19 : f18.floatValue(), (Float) b13.f79104b, (Float) b13.f79105c, f13, f13, d13);
        }
        PointF pointF = this.f141525i;
        PointF pointF2 = this.f141526j;
        if (f14 == null) {
            pointF2.set(pointF.x, 0.0f);
        } else {
            pointF2.set(f14.floatValue(), 0.0f);
        }
        if (f15 == null) {
            pointF2.set(pointF2.x, pointF.y);
        } else {
            pointF2.set(pointF2.x, f15.floatValue());
        }
        return pointF2;
    }
}
