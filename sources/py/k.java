package py;

import ey.k3;
import ey.l2;
import ey.v1;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class k extends v1 {

    /* renamed from: h, reason: collision with root package name */
    public static final HashSet f101730h;

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f101731f;

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f101732g;

    static {
        HashSet hashSet = new HashSet();
        f101730h = hashSet;
        hashSet.add(b.class);
        hashSet.add(e.class);
        hashSet.add(i.class);
        hashSet.add(f.class);
        hashSet.add(g.class);
        hashSet.add(h.class);
        hashSet.add(c.class);
        hashSet.add(l2.class);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(k3 perfLogger) {
        super(perfLogger);
        Intrinsics.checkNotNullParameter(perfLogger, "perfLogger");
        this.f101731f = new HashMap();
        this.f101732g = new HashMap();
    }

    @Override // ey.v1
    public final Set b() {
        return f101730h;
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x013c, code lost:
    
        if (r1.f101716a == 1) goto L55;
     */
    @Override // ey.v1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean o(ey.u1 r22) {
        /*
            Method dump skipped, instructions count: 873
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: py.k.o(ey.u1):boolean");
    }

    public final void v(String str, s92.c cVar, a aVar) {
        if (str != null) {
            j("pinUid", str);
        }
        h(aVar.b(), "slotindex");
        if (cVar != null) {
            k("data.source", (short) cVar.getValue());
        }
        h(bt1.a.UNKNOWN.getValue(), "net.quality");
        q92.c cVar2 = aVar.f101719d;
        if (cVar2 == null) {
            Intrinsics.r("imageType");
            throw null;
        }
        h(cVar2.getValue(), "image.type");
        j("states", aVar.toString());
    }
}
