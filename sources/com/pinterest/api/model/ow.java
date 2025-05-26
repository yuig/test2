package com.pinterest.api.model;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ow {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f40825a = new LinkedHashMap();

    public final void a(dl1.s model) {
        Intrinsics.checkNotNullParameter(model, "model");
        synchronized (this) {
            try {
                Class<?> cls = model.getClass();
                if (!this.f40825a.containsKey(cls)) {
                    this.f40825a.put(cls, new ArrayList());
                }
                Object obj = this.f40825a.get(cls);
                Intrinsics.f(obj);
                ((List) obj).add(model);
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
