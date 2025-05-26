package ft1;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.e0;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final List f62938a = f0.j("channel-count", "channel-mask", "sample-rate", "pcm-encoding", "track-id");

    /* renamed from: b, reason: collision with root package name */
    public static final List f62939b = e0.b("durationUs");

    /* renamed from: c, reason: collision with root package name */
    public static final List f62940c = f0.j("language", "mime");

    public static nt1.b a(nt1.c sourceMediaFormat, boolean z13, Map map, int i13) {
        AbstractMap hashMap;
        String d2;
        if ((i13 & 2) != 0) {
            z13 = true;
        }
        Intrinsics.checkNotNullParameter(sourceMediaFormat, "mediaFormatToCopy");
        HashMap target = new HashMap();
        Intrinsics.checkNotNullParameter(sourceMediaFormat, "sourceMediaFormat");
        Intrinsics.checkNotNullParameter(target, "target");
        List<String> keys = f62938a;
        Intrinsics.checkNotNullParameter(keys, "keys");
        for (String str : keys) {
            if (sourceMediaFormat.w(str)) {
                target.put(str, Integer.valueOf(sourceMediaFormat.e(str)));
            }
        }
        Intrinsics.checkNotNullParameter(sourceMediaFormat, "sourceMediaFormat");
        Intrinsics.checkNotNullParameter(target, "target");
        List<String> keys2 = f62939b;
        Intrinsics.checkNotNullParameter(keys2, "keys");
        for (String str2 : keys2) {
            if (sourceMediaFormat.w(str2)) {
                target.put(str2, Long.valueOf(sourceMediaFormat.a(str2)));
            }
        }
        Intrinsics.checkNotNullParameter(sourceMediaFormat, "sourceMediaFormat");
        Intrinsics.checkNotNullParameter(target, "target");
        List<String> keys3 = f62940c;
        Intrinsics.checkNotNullParameter(keys3, "keys");
        for (String str3 : keys3) {
            if (sourceMediaFormat.w(str3) && (d2 = sourceMediaFormat.d(str3)) != null) {
                target.put(str3, d2);
            }
        }
        if (map != null) {
            hashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                String str4 = (String) entry.getKey();
                if (!z13) {
                    Intrinsics.f(str4);
                    if (!target.containsKey(str4)) {
                    }
                }
                hashMap.put(entry.getKey(), entry.getValue());
            }
        } else {
            hashMap = new HashMap();
        }
        target.putAll(hashMap);
        target.putAll(new HashMap());
        return new nt1.b(target);
    }

    public static final a b(int i13, nt1.c audioFormat, long j13) {
        Intrinsics.checkNotNullParameter(audioFormat, "audioFormat");
        return new a(i13, audioFormat, nt1.d.a(l3.c.w(i13, audioFormat)), true, j13);
    }
}
