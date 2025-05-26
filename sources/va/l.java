package va;

import kh2.k3;

/* loaded from: classes3.dex */
public abstract class l extends k {

    /* renamed from: a, reason: collision with root package name */
    public f5.h[] f125060a;

    /* renamed from: b, reason: collision with root package name */
    public String f125061b;

    /* renamed from: c, reason: collision with root package name */
    public int f125062c;

    /* renamed from: d, reason: collision with root package name */
    public final int f125063d;

    public l() {
        this.f125060a = null;
        this.f125062c = 0;
    }

    public f5.h[] getPathData() {
        return this.f125060a;
    }

    public String getPathName() {
        return this.f125061b;
    }

    public void setPathData(f5.h[] hVarArr) {
        if (!k3.D(this.f125060a, hVarArr)) {
            this.f125060a = k3.O(hVarArr);
            return;
        }
        f5.h[] hVarArr2 = this.f125060a;
        for (int i13 = 0; i13 < hVarArr.length; i13++) {
            hVarArr2[i13].f61088a = hVarArr[i13].f61088a;
            int i14 = 0;
            while (true) {
                float[] fArr = hVarArr[i13].f61089b;
                if (i14 < fArr.length) {
                    hVarArr2[i13].f61089b[i14] = fArr[i14];
                    i14++;
                }
            }
        }
    }

    public l(l lVar) {
        this.f125060a = null;
        this.f125062c = 0;
        this.f125061b = lVar.f125061b;
        this.f125063d = lVar.f125063d;
        this.f125060a = k3.O(lVar.f125060a);
    }
}
