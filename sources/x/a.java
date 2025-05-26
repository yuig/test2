package x;

import android.hardware.camera2.params.DynamicRangeProfiles;
import c0.z;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f131241a;

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f131242b;

    static {
        z zVar;
        HashMap hashMap = new HashMap();
        f131241a = hashMap;
        HashMap hashMap2 = new HashMap();
        f131242b = hashMap2;
        z zVar2 = z.f24401d;
        hashMap.put(1L, zVar2);
        hashMap2.put(zVar2, Collections.singletonList(1L));
        hashMap.put(2L, z.f24402e);
        hashMap2.put((z) hashMap.get(2L), Collections.singletonList(2L));
        z zVar3 = z.f24403f;
        hashMap.put(4L, zVar3);
        hashMap2.put(zVar3, Collections.singletonList(4L));
        z zVar4 = z.f24404g;
        hashMap.put(8L, zVar4);
        hashMap2.put(zVar4, Collections.singletonList(8L));
        List asList = Arrays.asList(64L, 128L, 16L, 32L);
        Iterator it = asList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            zVar = z.f24405h;
            if (!hasNext) {
                break;
            }
            f131241a.put((Long) it.next(), zVar);
        }
        f131242b.put(zVar, asList);
        List asList2 = Arrays.asList(1024L, 2048L, 256L, 512L);
        Iterator it2 = asList2.iterator();
        while (true) {
            boolean hasNext2 = it2.hasNext();
            z zVar5 = z.f24406i;
            if (!hasNext2) {
                f131242b.put(zVar5, asList2);
                return;
            } else {
                f131241a.put((Long) it2.next(), zVar5);
            }
        }
    }

    public static Long a(z zVar, DynamicRangeProfiles dynamicRangeProfiles) {
        Set supportedProfiles;
        List<Long> list = (List) f131242b.get(zVar);
        if (list == null) {
            return null;
        }
        supportedProfiles = dynamicRangeProfiles.getSupportedProfiles();
        for (Long l13 : list) {
            if (supportedProfiles.contains(l13)) {
                return l13;
            }
        }
        return null;
    }
}
