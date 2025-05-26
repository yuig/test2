package r2;

import i2.w3;
import java.util.Map;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final Object f106045a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f106046b = true;

    /* renamed from: c, reason: collision with root package name */
    public final m f106047c;

    public h(i iVar, Object obj) {
        this.f106045a = obj;
        Map map = (Map) iVar.f106049a.get(obj);
        g gVar = new g(iVar);
        w3 w3Var = o.f106060a;
        this.f106047c = new m(map, gVar);
    }
}
