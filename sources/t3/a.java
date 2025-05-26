package t3;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class a implements f {

    /* renamed from: a, reason: collision with root package name */
    public String f115827a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f115828b = new int[2];

    public final int[] c(int i13, int i14) {
        if (i13 < 0 || i14 < 0 || i13 == i14) {
            return null;
        }
        int[] iArr = this.f115828b;
        iArr[0] = i13;
        iArr[1] = i14;
        return iArr;
    }

    public final String d() {
        String str = this.f115827a;
        if (str != null) {
            return str;
        }
        Intrinsics.r("text");
        throw null;
    }

    public void e(String str) {
        this.f115827a = str;
    }
}
