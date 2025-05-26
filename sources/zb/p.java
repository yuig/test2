package zb;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class p extends e {

    /* renamed from: i, reason: collision with root package name */
    public final ec.q f141520i;

    /* renamed from: j, reason: collision with root package name */
    public final Path f141521j;

    /* renamed from: k, reason: collision with root package name */
    public Path f141522k;

    /* renamed from: l, reason: collision with root package name */
    public Path f141523l;

    /* renamed from: m, reason: collision with root package name */
    public List f141524m;

    public p(List list) {
        super(list);
        this.f141520i = new ec.q();
        this.f141521j = new Path();
    }

    @Override // zb.e
    public final Object h(kc.a aVar, float f13) {
        ec.q qVar;
        ec.q qVar2 = (ec.q) aVar.f79104b;
        ec.q qVar3 = (ec.q) aVar.f79105c;
        ec.q qVar4 = qVar3 == null ? qVar2 : qVar3;
        ec.q qVar5 = this.f141520i;
        if (qVar5.f58335b == null) {
            qVar5.f58335b = new PointF();
        }
        qVar5.f58336c = qVar2.f58336c || qVar4.f58336c;
        ArrayList arrayList = qVar2.f58334a;
        int size = arrayList.size();
        int size2 = qVar4.f58334a.size();
        ArrayList arrayList2 = qVar4.f58334a;
        if (size != size2) {
            jc.b.c("Curves must have the same number of control points. Shape 1: " + arrayList.size() + "\tShape 2: " + arrayList2.size());
        }
        int min = Math.min(arrayList.size(), arrayList2.size());
        ArrayList arrayList3 = qVar5.f58334a;
        if (arrayList3.size() < min) {
            for (int size3 = arrayList3.size(); size3 < min; size3++) {
                arrayList3.add(new cc.a());
            }
        } else if (arrayList3.size() > min) {
            for (int size4 = arrayList3.size() - 1; size4 >= min; size4--) {
                arrayList3.remove(arrayList3.size() - 1);
            }
        }
        PointF pointF = qVar2.f58335b;
        PointF pointF2 = qVar4.f58335b;
        qVar5.a(jc.f.e(pointF.x, pointF2.x, f13), jc.f.e(pointF.y, pointF2.y, f13));
        int size5 = arrayList3.size() - 1;
        while (size5 >= 0) {
            cc.a aVar2 = (cc.a) arrayList.get(size5);
            cc.a aVar3 = (cc.a) arrayList2.get(size5);
            PointF pointF3 = aVar2.f27408a;
            PointF pointF4 = aVar3.f27408a;
            ec.q qVar6 = qVar5;
            ((cc.a) arrayList3.get(size5)).f27408a.set(jc.f.e(pointF3.x, pointF4.x, f13), jc.f.e(pointF3.y, pointF4.y, f13));
            cc.a aVar4 = (cc.a) arrayList3.get(size5);
            PointF pointF5 = aVar2.f27409b;
            float f14 = pointF5.x;
            PointF pointF6 = aVar3.f27409b;
            aVar4.f27409b.set(jc.f.e(f14, pointF6.x, f13), jc.f.e(pointF5.y, pointF6.y, f13));
            cc.a aVar5 = (cc.a) arrayList3.get(size5);
            PointF pointF7 = aVar2.f27410c;
            float f15 = pointF7.x;
            PointF pointF8 = aVar3.f27410c;
            aVar5.f27410c.set(jc.f.e(f15, pointF8.x, f13), jc.f.e(pointF7.y, pointF8.y, f13));
            size5--;
            qVar5 = qVar6;
        }
        ec.q qVar7 = qVar5;
        List list = this.f141524m;
        if (list != null) {
            qVar = qVar7;
            for (int size6 = list.size() - 1; size6 >= 0; size6--) {
                qVar = ((yb.s) ((yb.u) this.f141524m.get(size6))).e(qVar);
            }
        } else {
            qVar = qVar7;
        }
        Path path = this.f141521j;
        jc.f.d(qVar, path);
        if (this.f141498e == null) {
            return path;
        }
        if (this.f141522k == null) {
            this.f141522k = new Path();
            this.f141523l = new Path();
        }
        jc.f.d(qVar2, this.f141522k);
        if (qVar3 != null) {
            jc.f.d(qVar3, this.f141523l);
        }
        androidx.appcompat.app.d dVar = this.f141498e;
        float floatValue = aVar.f79110h.floatValue();
        Path path2 = this.f141522k;
        return (Path) dVar.B(aVar.f79109g, floatValue, path2, qVar3 == null ? path2 : this.f141523l, f13, e(), this.f141497d);
    }
}
