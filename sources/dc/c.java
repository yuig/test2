package dc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import o5.g;
import zb.j;
import zb.s;

/* loaded from: classes3.dex */
public final class c extends g {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f54304c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ArrayList arrayList, int i13) {
        super(arrayList, 1);
        this.f54304c = i13;
        if (i13 == 1) {
            super(arrayList, 1);
            return;
        }
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            kc.a aVar = (kc.a) arrayList.get(i14);
            ec.c cVar = (ec.c) aVar.f79104b;
            ec.c cVar2 = (ec.c) aVar.f79105c;
            if (cVar != null && cVar2 != null) {
                float[] fArr = cVar.f58286a;
                int length = fArr.length;
                float[] fArr2 = cVar2.f58286a;
                if (length != fArr2.length) {
                    int length2 = fArr.length + fArr2.length;
                    float[] fArr3 = new float[length2];
                    System.arraycopy(fArr, 0, fArr3, 0, fArr.length);
                    System.arraycopy(fArr2, 0, fArr3, fArr.length, fArr2.length);
                    Arrays.sort(fArr3);
                    float f13 = Float.NaN;
                    int i15 = 0;
                    for (int i16 = 0; i16 < length2; i16++) {
                        float f14 = fArr3[i16];
                        if (f14 != f13) {
                            fArr3[i15] = f14;
                            i15++;
                            f13 = fArr3[i16];
                        }
                    }
                    float[] copyOfRange = Arrays.copyOfRange(fArr3, 0, i15);
                    aVar = new kc.a(cVar.b(copyOfRange), cVar2.b(copyOfRange));
                }
            }
            arrayList.set(i14, aVar);
        }
    }

    @Override // dc.f
    public final zb.e a() {
        int i13 = this.f54304c;
        Object obj = this.f92902b;
        switch (i13) {
            case 0:
                return new j((List) obj);
            default:
                return new s((List) obj);
        }
    }
}
