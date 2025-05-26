package e0;

import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class m implements Enumeration {

    /* renamed from: a, reason: collision with root package name */
    public final Enumeration f56717a;

    public m(n nVar) {
        this.f56717a = Collections.enumeration(nVar.f56722a);
    }

    @Override // java.util.Enumeration
    public final boolean hasMoreElements() {
        return this.f56717a.hasMoreElements();
    }

    @Override // java.util.Enumeration
    public final Object nextElement() {
        return new HashMap((Map) this.f56717a.nextElement());
    }
}
