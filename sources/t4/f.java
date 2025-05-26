package t4;

import java.util.HashMap;

/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f116354a;

    public f(int i13) {
        if (i13 != 1) {
            this.f116354a = new HashMap();
        } else {
            this.f116354a = new HashMap();
        }
    }

    public final float a(String str, Object obj) {
        HashMap hashMap;
        float[] fArr;
        if (this.f116354a.containsKey(obj) && (hashMap = (HashMap) this.f116354a.get(obj)) != null && hashMap.containsKey(str) && (fArr = (float[]) hashMap.get(str)) != null && fArr.length > 0) {
            return fArr[0];
        }
        return Float.NaN;
    }
}
