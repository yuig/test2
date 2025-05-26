package so2;

import androidx.lifecycle.k0;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.json.internal.JsonException;

/* loaded from: classes4.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static final rm2.i0 f114804a = new rm2.i0(16);

    public static final void a(LinkedHashMap linkedHashMap, oo2.g gVar, String str, int i13) {
        String str2 = Intrinsics.d(gVar.c(), oo2.m.f96902a) ? "enum value" : "property";
        if (!linkedHashMap.containsKey(str)) {
            linkedHashMap.put(str, Integer.valueOf(i13));
            return;
        }
        throw new JsonException("The suggested name '" + str + "' for " + str2 + ' ' + gVar.f(i13) + " is already one of the names for " + str2 + ' ' + gVar.f(((Number) z0.e(str, linkedHashMap)).intValue()) + " in " + gVar);
    }

    public static final int b(oo2.g descriptor, ro2.c json, String name) {
        Object value;
        Intrinsics.checkNotNullParameter(descriptor, "<this>");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(name, "name");
        boolean z13 = json.f108976a.f109024m;
        int i13 = 10;
        rm2.i0 key = f114804a;
        k0 k0Var = json.f108978c;
        if (z13 && Intrinsics.d(descriptor.c(), oo2.m.f96902a)) {
            String lowerCase = name.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            Intrinsics.checkNotNullParameter(json, "<this>");
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            Intrinsics.checkNotNullParameter(json, "<this>");
            xh2.a defaultValue = new xh2.a(i13, descriptor, json);
            k0Var.getClass();
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            Intrinsics.checkNotNullParameter(key, "key");
            Map map = (Map) k0Var.f18655a.get(descriptor);
            Object obj = map != null ? map.get(key) : null;
            value = obj != null ? obj : null;
            if (value == null) {
                value = defaultValue.invoke();
                Intrinsics.checkNotNullParameter(descriptor, "descriptor");
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(value, "value");
                Map map2 = k0Var.f18655a;
                Object obj2 = map2.get(descriptor);
                if (obj2 == null) {
                    obj2 = new ConcurrentHashMap(2);
                    map2.put(descriptor, obj2);
                }
                ((Map) obj2).put(key, value);
            }
            Integer num = (Integer) ((Map) value).get(lowerCase);
            if (num != null) {
                return num.intValue();
            }
            return -3;
        }
        d(descriptor, json);
        int d2 = descriptor.d(name);
        if (d2 != -3 || !json.f108976a.f109023l) {
            return d2;
        }
        Intrinsics.checkNotNullParameter(json, "<this>");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(json, "<this>");
        xh2.a defaultValue2 = new xh2.a(i13, descriptor, json);
        k0Var.getClass();
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(defaultValue2, "defaultValue");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(key, "key");
        Map map3 = (Map) k0Var.f18655a.get(descriptor);
        Object obj3 = map3 != null ? map3.get(key) : null;
        value = obj3 != null ? obj3 : null;
        if (value == null) {
            value = defaultValue2.invoke();
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            Map map4 = k0Var.f18655a;
            Object obj4 = map4.get(descriptor);
            if (obj4 == null) {
                obj4 = new ConcurrentHashMap(2);
                map4.put(descriptor, obj4);
            }
            ((Map) obj4).put(key, value);
        }
        Integer num2 = (Integer) ((Map) value).get(name);
        if (num2 != null) {
            return num2.intValue();
        }
        return -3;
    }

    public static final int c(oo2.g gVar, ro2.c json, String name, String suffix) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        int b13 = b(gVar, json, name);
        if (b13 != -3) {
            return b13;
        }
        throw new SerializationException(gVar.i() + " does not contain element with name '" + name + '\'' + suffix);
    }

    public static final void d(oo2.g gVar, ro2.c json) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        Intrinsics.checkNotNullParameter(json, "json");
        if (Intrinsics.d(gVar.c(), oo2.o.f96903a)) {
            json.f108976a.getClass();
        }
    }
}
