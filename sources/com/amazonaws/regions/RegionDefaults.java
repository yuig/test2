package com.amazonaws.regions;

import java.util.HashMap;

/* loaded from: classes3.dex */
abstract class RegionDefaults {
    public static void a(Region region, String str, String str2) {
        HashMap hashMap = region.f28757c;
        HashMap hashMap2 = region.f28758d;
        HashMap hashMap3 = region.f28759e;
        hashMap.put(str, str2);
        hashMap2.put(str, Boolean.FALSE);
        hashMap3.put(str, Boolean.TRUE);
    }
}
