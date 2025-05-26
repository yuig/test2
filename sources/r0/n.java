package r0;

import android.util.Size;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes2.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f105611a = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final TreeMap f105612b = new TreeMap(new e0.f(false));

    /* renamed from: c, reason: collision with root package name */
    public final t0.a f105613c;

    /* renamed from: d, reason: collision with root package name */
    public final t0.a f105614d;

    public n(androidx.appcompat.app.d dVar) {
        h hVar = r.f105629a;
        Iterator it = new ArrayList(r.f105637i).iterator();
        while (true) {
            t0.a aVar = null;
            if (!it.hasNext()) {
                break;
            }
            r rVar = (r) it.next();
            com.bumptech.glide.d.v("Currently only support ConstantQuality", rVar instanceof r);
            androidx.camera.core.impl.d1 k13 = dVar.k(((h) rVar).f105518j);
            if (k13 != null) {
                kh2.m0.p("CapabilitiesByQuality", "profiles = " + k13);
                if (!k13.b().isEmpty()) {
                    int a13 = k13.a();
                    int c13 = k13.c();
                    List d2 = k13.d();
                    List b13 = k13.b();
                    com.bumptech.glide.d.g("Should contain at least one VideoProfile.", !b13.isEmpty());
                    aVar = new t0.a(a13, c13, Collections.unmodifiableList(new ArrayList(d2)), Collections.unmodifiableList(new ArrayList(b13)), d2.isEmpty() ? null : (androidx.camera.core.impl.d) d2.get(0), (androidx.camera.core.impl.f) b13.get(0));
                }
                if (aVar == null) {
                    kh2.m0.X0("CapabilitiesByQuality", "EncoderProfiles of quality " + rVar + " has no video validated profiles.");
                } else {
                    androidx.camera.core.impl.f fVar = aVar.f115661f;
                    this.f105612b.put(new Size(fVar.f16832e, fVar.f16833f), rVar);
                    this.f105611a.put(rVar, aVar);
                }
            }
        }
        if (this.f105611a.isEmpty()) {
            kh2.m0.s("CapabilitiesByQuality", "No supported EncoderProfiles");
            this.f105614d = null;
            this.f105613c = null;
        } else {
            ArrayDeque arrayDeque = new ArrayDeque(this.f105611a.values());
            this.f105613c = (t0.a) arrayDeque.peekFirst();
            this.f105614d = (t0.a) arrayDeque.peekLast();
        }
    }

    public final t0.a a(Size size) {
        Object value;
        TreeMap treeMap = this.f105612b;
        Size size2 = k0.c.f77781a;
        Map.Entry ceilingEntry = treeMap.ceilingEntry(size);
        t0.a aVar = null;
        if (ceilingEntry != null) {
            value = ceilingEntry.getValue();
        } else {
            Map.Entry floorEntry = treeMap.floorEntry(size);
            value = floorEntry != null ? floorEntry.getValue() : null;
        }
        r rVar = (r) value;
        if (rVar == null) {
            rVar = r.f105635g;
        }
        kh2.m0.p("CapabilitiesByQuality", "Using supported quality of " + rVar + " for size " + size);
        if (rVar == r.f105635g || (aVar = b(rVar)) != null) {
            return aVar;
        }
        throw new AssertionError("Camera advertised available quality but did not produce EncoderProfiles for advertised quality.");
    }

    public final t0.a b(r rVar) {
        com.bumptech.glide.d.g("Unknown quality: " + rVar, r.f105636h.contains(rVar));
        return rVar == r.f105634f ? this.f105613c : rVar == r.f105633e ? this.f105614d : (t0.a) this.f105611a.get(rVar);
    }
}
