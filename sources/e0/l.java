package e0;

import java.util.Enumeration;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class l implements Enumeration {

    /* renamed from: a, reason: collision with root package name */
    public int f56716a;

    @Override // java.util.Enumeration
    public final boolean hasMoreElements() {
        int i13 = this.f56716a;
        r[] rVarArr = p.f56724c;
        return i13 < 4;
    }

    @Override // java.util.Enumeration
    public final Object nextElement() {
        this.f56716a++;
        return new HashMap();
    }
}
