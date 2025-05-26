package zb;

import java.util.List;

/* loaded from: classes3.dex */
public final class j extends l {

    /* renamed from: i, reason: collision with root package name */
    public final ec.c f141510i;

    public j(List list) {
        super(list);
        int i13 = 0;
        for (int i14 = 0; i14 < list.size(); i14++) {
            ec.c cVar = (ec.c) ((kc.a) list.get(i14)).f79104b;
            if (cVar != null) {
                i13 = Math.max(i13, cVar.f58287b.length);
            }
        }
        this.f141510i = new ec.c(new float[i13], new int[i13]);
    }

    @Override // zb.e
    public final Object h(kc.a aVar, float f13) {
        int[] iArr;
        float[] fArr;
        ec.c cVar = (ec.c) aVar.f79104b;
        ec.c cVar2 = (ec.c) aVar.f79105c;
        ec.c cVar3 = this.f141510i;
        cVar3.getClass();
        if (cVar.equals(cVar2)) {
            cVar3.a(cVar);
        } else if (f13 <= 0.0f) {
            cVar3.a(cVar);
        } else if (f13 >= 1.0f) {
            cVar3.a(cVar2);
        } else {
            int[] iArr2 = cVar.f58287b;
            int length = iArr2.length;
            int[] iArr3 = cVar2.f58287b;
            if (length != iArr3.length) {
                StringBuilder sb3 = new StringBuilder("Cannot interpolate between gradients. Lengths vary (");
                sb3.append(iArr2.length);
                sb3.append(" vs ");
                throw new IllegalArgumentException(a.a.n(sb3, iArr3.length, ")"));
            }
            int i13 = 0;
            while (true) {
                int length2 = iArr2.length;
                iArr = cVar3.f58287b;
                fArr = cVar3.f58286a;
                if (i13 >= length2) {
                    break;
                }
                fArr[i13] = jc.f.e(cVar.f58286a[i13], cVar2.f58286a[i13], f13);
                iArr[i13] = b7.c.p(iArr2[i13], f13, iArr3[i13]);
                i13++;
            }
            for (int length3 = iArr2.length; length3 < fArr.length; length3++) {
                fArr[length3] = fArr[iArr2.length - 1];
                iArr[length3] = iArr[iArr2.length - 1];
            }
        }
        return cVar3;
    }
}
