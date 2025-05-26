package com.bugsnag.android;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class e2 {

    /* renamed from: b */
    public static final Set f29211b = kotlin.collections.g1.b(Pattern.compile(".*password.*", 2));

    /* renamed from: a */
    public Set f29212a = f29211b;

    public final void a(Object obj, o1 o1Var, boolean z13) {
        if (obj == null) {
            o1Var.h();
            return;
        }
        if (obj instanceof String) {
            o1Var.z((String) obj);
            return;
        }
        if (obj instanceof Number) {
            o1Var.w((Number) obj);
            return;
        }
        if (obj instanceof Boolean) {
            o1Var.A(((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof n1) {
            ((n1) obj).toStream(o1Var);
            return;
        }
        if (obj instanceof Date) {
            o1Var.z(hd.e.b((Date) obj));
            return;
        }
        if (!(obj instanceof Map)) {
            if (obj instanceof Collection) {
                o1Var.c();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    a(it.next(), o1Var, false);
                }
                o1Var.f();
                return;
            }
            if (!obj.getClass().isArray()) {
                o1Var.z("[OBJECT]");
                return;
            }
            o1Var.c();
            int length = Array.getLength(obj);
            for (int i13 = 0; i13 < length; i13++) {
                a(Array.get(obj, i13), o1Var, false);
            }
            o1Var.f();
            return;
        }
        o1Var.d();
        for (Map.Entry entry : ((Map) obj).entrySet()) {
            Object key = entry.getKey();
            if (key instanceof String) {
                String str = (String) key;
                o1Var.K(str);
                if (z13) {
                    Set set = this.f29212a;
                    if (!(set instanceof Collection) || !set.isEmpty()) {
                        Iterator it2 = set.iterator();
                        while (it2.hasNext()) {
                            if (((Pattern) it2.next()).matcher(str).matches()) {
                                o1Var.z("[REDACTED]");
                                break;
                            }
                        }
                    }
                }
                a(entry.getValue(), o1Var, z13);
            }
        }
        o1Var.g();
    }
}
