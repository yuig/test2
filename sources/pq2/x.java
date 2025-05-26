package pq2;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final Class f101095a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f101096b;

    /* renamed from: c, reason: collision with root package name */
    public final Method f101097c;

    /* renamed from: d, reason: collision with root package name */
    public final List f101098d;

    public x(Class cls, Object obj, Method method, ArrayList arrayList) {
        this.f101095a = cls;
        this.f101096b = obj;
        this.f101097c = method;
        this.f101098d = Collections.unmodifiableList(arrayList);
    }

    public final Method a() {
        return this.f101097c;
    }

    public final Class b() {
        return this.f101095a;
    }

    public final String toString() {
        return String.format("%s.%s() %s", this.f101095a.getName(), this.f101097c.getName(), this.f101098d);
    }
}
