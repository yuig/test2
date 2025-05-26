package i2;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class t implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f71298a;

    public /* synthetic */ t(int i13) {
        this.f71298a = i13;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f71298a) {
            case 0:
                return Intrinsics.i(((a1) obj).f71071b, ((a1) obj2).f71071b);
            case 1:
                s3.k0 k0Var = (s3.k0) obj;
                s3.k0 k0Var2 = (s3.k0) obj2;
                float f13 = k0Var.f110838z.f110984r.f110955z;
                float f14 = k0Var2.f110838z.f110984r.f110955z;
                return f13 == f14 ? Intrinsics.i(k0Var.w(), k0Var2.w()) : Float.compare(f13, f14);
            case 2:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                g1.r rVar = m5.b.f85836a;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i13 = 0; i13 < bArr.length; i13++) {
                    byte b13 = bArr[i13];
                    byte b14 = bArr2[i13];
                    if (b13 != b14) {
                        return b13 - b14;
                    }
                }
                return 0;
            case 3:
                h7.j jVar = (h7.j) obj;
                h7.j jVar2 = (h7.j) obj2;
                long j13 = jVar.f67897f;
                long j14 = jVar2.f67897f;
                if (j13 - j14 == 0) {
                    return jVar.compareTo(jVar2);
                }
                return j13 >= j14 ? 1 : -1;
            case 4:
                q7.b bVar = (q7.b) obj;
                q7.b bVar2 = (q7.b) obj2;
                int compare = Integer.compare(bVar.f102602c, bVar2.f102602c);
                return compare != 0 ? compare : bVar.f102601b.compareTo(bVar2.f102601b);
            case 5:
                return ((androidx.media3.common.b) obj2).f18760j - ((androidx.media3.common.b) obj).f18760j;
            case 6:
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj2;
                pk.t2 t2Var = k8.q.f78564j;
                if (num.intValue() == -1) {
                    return num2.intValue() == -1 ? 0 : -1;
                }
                if (num2.intValue() == -1) {
                    return 1;
                }
                return num.intValue() - num2.intValue();
            case 7:
                List list = (List) obj;
                List list2 = (List) obj2;
                return pk.h0.f(new v.j2(10).compare((k8.p) Collections.max(list, new v.j2(8)), (k8.p) Collections.max(list2, new v.j2(9)))).a(list.size(), list2.size()).b((k8.p) Collections.max(list, new v.j2(11)), (k8.p) Collections.max(list2, new v.j2(12)), new v.j2(13)).e();
            case 8:
                return ((k8.f) Collections.max((List) obj)).compareTo((k8.f) Collections.max((List) obj2));
            case 9:
                return ((k8.m) ((List) obj).get(0)).compareTo((k8.m) ((List) obj2).get(0));
            case 10:
                return ((l8.a0) obj).f81987a - ((l8.a0) obj2).f81987a;
            default:
                return Float.compare(((l8.a0) obj).f81989c, ((l8.a0) obj2).f81989c);
        }
    }
}
