package no2;

import java.lang.annotation.Annotation;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.c0;
import kotlin.collections.q0;
import kotlin.collections.y0;
import kotlin.collections.z;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.k0;
import xk2.k;
import xk2.m;
import xk2.n;

/* loaded from: classes4.dex */
public final class f extends qo2.b {

    /* renamed from: a, reason: collision with root package name */
    public final rl2.d f91673a;

    /* renamed from: b, reason: collision with root package name */
    public final List f91674b;

    /* renamed from: c, reason: collision with root package name */
    public final k f91675c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f91676d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f91677e;

    public f(String serialName, rl2.d baseClass, rl2.d[] subclasses, b[] subclassSerializers, Annotation[] classAnnotations) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(subclasses, "subclasses");
        Intrinsics.checkNotNullParameter(subclassSerializers, "subclassSerializers");
        Intrinsics.checkNotNullParameter(classAnnotations, "classAnnotations");
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(subclasses, "subclasses");
        Intrinsics.checkNotNullParameter(subclassSerializers, "subclassSerializers");
        this.f91673a = baseClass;
        this.f91674b = q0.f80391a;
        this.f91675c = m.a(n.PUBLICATION, new xh2.a(7, serialName, this));
        if (subclasses.length != subclassSerializers.length) {
            throw new IllegalArgumentException("All subclasses of sealed class " + baseClass.f() + " should be marked @Serializable");
        }
        Map m13 = z0.m(c0.h0(subclasses, subclassSerializers));
        this.f91676d = m13;
        Set<Map.Entry> entrySet = m13.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : entrySet) {
            String i13 = ((b) entry.getValue()).a().i();
            Object obj = linkedHashMap.get(i13);
            if (obj == null) {
                linkedHashMap.containsKey(i13);
            }
            Map.Entry entry2 = (Map.Entry) obj;
            if (entry2 != null) {
                throw new IllegalStateException(("Multiple sealed subclasses of '" + this.f91673a + "' have the same serial name '" + i13 + "': '" + entry2.getKey() + "', '" + entry.getKey() + '\'').toString());
            }
            linkedHashMap.put(i13, entry);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(y0.a(linkedHashMap.size()));
        for (Map.Entry entry3 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry3.getKey(), (b) ((Map.Entry) entry3.getValue()).getValue());
        }
        this.f91677e = linkedHashMap2;
        this.f91674b = z.d(classAnnotations);
    }

    @Override // no2.h, no2.a
    public final oo2.g a() {
        return (oo2.g) this.f91675c.getValue();
    }

    @Override // qo2.b
    public final a f(po2.a decoder, String str) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        b bVar = (b) this.f91677e.get(str);
        return bVar != null ? bVar : super.f(decoder, str);
    }

    @Override // qo2.b
    public final h g(po2.d encoder, Object value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        h hVar = (b) this.f91676d.get(k0.f80436a.b(value.getClass()));
        if (hVar == null) {
            hVar = super.g(encoder, value);
        }
        if (hVar != null) {
            return hVar;
        }
        return null;
    }

    @Override // qo2.b
    public final rl2.d h() {
        return this.f91673a;
    }
}
