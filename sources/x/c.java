package x;

import android.hardware.camera2.params.DynamicRangeProfiles;
import c0.z;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes2.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    public final DynamicRangeProfiles f131243a;

    public c(Object obj) {
        this.f131243a = (DynamicRangeProfiles) obj;
    }

    public static Set d(Set set) {
        if (set.isEmpty()) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Long l13 = (Long) it.next();
            long longValue = l13.longValue();
            z zVar = (z) a.f131241a.get(l13);
            com.bumptech.glide.d.s(zVar, "Dynamic range profile cannot be converted to a DynamicRange object: " + longValue);
            hashSet.add(zVar);
        }
        return Collections.unmodifiableSet(hashSet);
    }

    @Override // x.b
    public final Set a() {
        return d(this.f131243a.getSupportedProfiles());
    }

    @Override // x.b
    public final DynamicRangeProfiles b() {
        return this.f131243a;
    }

    @Override // x.b
    public final Set c(z zVar) {
        DynamicRangeProfiles dynamicRangeProfiles = this.f131243a;
        Long a13 = a.a(zVar, dynamicRangeProfiles);
        com.bumptech.glide.d.g("DynamicRange is not supported: " + zVar, a13 != null);
        return d(dynamicRangeProfiles.getProfileCaptureRequestConstraints(a13.longValue()));
    }
}
