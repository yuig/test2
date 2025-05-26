package com.pinterest.api.model;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class d7 {

    /* renamed from: a, reason: collision with root package name */
    public static final LinkedHashMap f36665a = new LinkedHashMap();

    public static final int a(f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        Integer num = (Integer) f36665a.get(pin.getId());
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }
}
