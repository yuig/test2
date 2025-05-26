package com.amazonaws;

import a.a;
import java.util.EnumMap;

/* loaded from: classes3.dex */
public final class RequestClientOptions {

    /* renamed from: a, reason: collision with root package name */
    public final EnumMap f28542a = new EnumMap(Marker.class);

    public enum Marker {
        USER_AGENT
    }

    public final void a(String str) {
        EnumMap enumMap = this.f28542a;
        Marker marker = Marker.USER_AGENT;
        String str2 = (String) enumMap.get(marker);
        if (str2 == null) {
            str2 = "";
        }
        if (!str2.contains(str)) {
            str2 = a.D(str2, " ", str);
        }
        enumMap.put((EnumMap) marker, (Marker) str2);
    }
}
