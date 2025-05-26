package e0;

import java.util.Enumeration;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class k implements Enumeration {

    /* renamed from: a, reason: collision with root package name */
    public int f56715a;

    @Override // java.util.Enumeration
    public final boolean hasMoreElements() {
        int i13 = this.f56715a;
        r[] rVarArr = p.f56724c;
        return i13 < 4;
    }

    @Override // java.util.Enumeration
    public final Object nextElement() {
        HashMap hashMap = new HashMap();
        for (r rVar : p.f56725d[this.f56715a]) {
            hashMap.put(rVar.f56737b, rVar);
        }
        this.f56715a++;
        return hashMap;
    }
}
