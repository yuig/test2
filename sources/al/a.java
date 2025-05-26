package al;

import el.c1;
import el.j0;
import el.l;
import el.l0;
import el.n;
import il.o5;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import mj.m;
import zk.e;
import zk.f;

/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final l0 f15467a;

    /* renamed from: b, reason: collision with root package name */
    public static final j0 f15468b;

    /* renamed from: c, reason: collision with root package name */
    public static final n f15469c;

    /* renamed from: d, reason: collision with root package name */
    public static final l f15470d;

    /* renamed from: e, reason: collision with root package name */
    public static final Map f15471e;

    /* renamed from: f, reason: collision with root package name */
    public static final Map f15472f;

    static {
        ml.a c13 = c1.c("type.googleapis.com/google.crypto.tink.AesSivKey");
        f15467a = new l0(new m(8), f.class);
        f15468b = new j0(new m(9), c13);
        f15469c = new n(new m(10), zk.a.class);
        f15470d = new l(new m(11), c13);
        HashMap hashMap = new HashMap();
        e eVar = e.f142072d;
        o5 o5Var = o5.RAW;
        hashMap.put(eVar, o5Var);
        e eVar2 = e.f142070b;
        o5 o5Var2 = o5.TINK;
        hashMap.put(eVar2, o5Var2);
        e eVar3 = e.f142071c;
        o5 o5Var3 = o5.CRUNCHY;
        hashMap.put(eVar3, o5Var3);
        f15471e = Collections.unmodifiableMap(hashMap);
        EnumMap enumMap = new EnumMap(o5.class);
        enumMap.put((EnumMap) o5Var, (o5) eVar);
        enumMap.put((EnumMap) o5Var2, (o5) eVar2);
        enumMap.put((EnumMap) o5Var3, (o5) eVar3);
        enumMap.put((EnumMap) o5.LEGACY, (o5) eVar3);
        f15472f = Collections.unmodifiableMap(enumMap);
    }

    public static o5 a(e eVar) {
        Map map = f15471e;
        if (map.containsKey(eVar)) {
            return (o5) map.get(eVar);
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + eVar);
    }

    public static e b(o5 o5Var) {
        Map map = f15472f;
        if (map.containsKey(o5Var)) {
            return (e) map.get(o5Var);
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + o5Var.getNumber());
    }
}
