package com.bugsnag.android.repackaged.dslplatform.json;

import ads_mobile_sdk.ci1$$ExternalSyntheticThrowCCEIfNotNull0;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.math.BigDecimal;
import java.net.InetAddress;
import java.net.URI;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public final class k {

    /* renamed from: t, reason: collision with root package name */
    public static final byte[] f29526t;

    /* renamed from: a, reason: collision with root package name */
    public final hd.f f29527a;

    /* renamed from: b, reason: collision with root package name */
    public final l0.k f29528b;

    /* renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList f29529c;

    /* renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArrayList f29530d;

    /* renamed from: e, reason: collision with root package name */
    public final q f29531e;

    /* renamed from: f, reason: collision with root package name */
    public final o f29532f;

    /* renamed from: g, reason: collision with root package name */
    public final s f29533g;

    /* renamed from: h, reason: collision with root package name */
    public final int f29534h;

    /* renamed from: i, reason: collision with root package name */
    public final int f29535i;

    /* renamed from: j, reason: collision with root package name */
    public final f f29536j;

    /* renamed from: k, reason: collision with root package name */
    public final f f29537k;

    /* renamed from: l, reason: collision with root package name */
    public final sp2.i f29538l;

    /* renamed from: m, reason: collision with root package name */
    public final ConcurrentHashMap f29539m;

    /* renamed from: n, reason: collision with root package name */
    public final ConcurrentHashMap f29540n;

    /* renamed from: o, reason: collision with root package name */
    public final ConcurrentHashMap f29541o;

    /* renamed from: p, reason: collision with root package name */
    public final ConcurrentHashMap f29542p;

    /* renamed from: q, reason: collision with root package name */
    public final ConcurrentHashMap f29543q;

    /* renamed from: r, reason: collision with root package name */
    public final g f29544r;

    /* renamed from: s, reason: collision with root package name */
    public final g f29545s;

    static {
        Charset.forName("UTF-8");
        f29526t = new byte[]{110, 117, 108, 108};
    }

    public k(j jVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.f29529c = copyOnWriteArrayList;
        CopyOnWriteArrayList copyOnWriteArrayList2 = new CopyOnWriteArrayList();
        this.f29530d = copyOnWriteArrayList2;
        CopyOnWriteArrayList copyOnWriteArrayList3 = new CopyOnWriteArrayList();
        this.f29539m = new ConcurrentHashMap();
        this.f29540n = new ConcurrentHashMap();
        this.f29541o = new ConcurrentHashMap();
        new ConcurrentHashMap();
        this.f29542p = new ConcurrentHashMap();
        this.f29543q = new ConcurrentHashMap();
        this.f29544r = new g(this, 1);
        this.f29545s = new g(this, 3);
        this.f29536j = new f(this, 0);
        this.f29537k = new f(this, 1);
        this.f29527a = jVar.f29513a;
        this.f29528b = jVar.f29514b;
        this.f29533g = jVar.f29517e;
        this.f29531e = jVar.f29515c;
        this.f29532f = jVar.f29516d;
        this.f29534h = jVar.f29518f;
        this.f29535i = jVar.f29519g;
        ArrayList arrayList = jVar.f29521i;
        copyOnWriteArrayList.addAll(arrayList);
        arrayList.size();
        ArrayList arrayList2 = jVar.f29522j;
        copyOnWriteArrayList2.addAll(arrayList2);
        arrayList2.size();
        ArrayList arrayList3 = jVar.f29523k;
        copyOnWriteArrayList3.addAll(arrayList3);
        arrayList3.size();
        HashSet hashSet = jVar.f29524l;
        this.f29538l = new sp2.i(hashSet);
        new HashMap(jVar.f29525m);
        j(byte[].class, d.f29485a);
        k(byte[].class, d.f29486b);
        Class cls = Boolean.TYPE;
        j(cls, d.f29488d);
        c cVar = d.f29490f;
        k(cls, cVar);
        i(cls, Boolean.FALSE);
        j(boolean[].class, d.f29491g);
        k(boolean[].class, d.f29492h);
        j(Boolean.class, d.f29489e);
        k(Boolean.class, cVar);
        b bVar = d.f29498n;
        j(LinkedHashMap.class, bVar);
        j(HashMap.class, bVar);
        j(Map.class, bVar);
        k(Map.class, new g(this, 0));
        j(URI.class, d.f29494j);
        k(URI.class, d.f29495k);
        j(InetAddress.class, d.f29496l);
        k(InetAddress.class, d.f29497m);
        Class cls2 = Double.TYPE;
        j(cls2, w.f29608k);
        c cVar2 = w.f29610m;
        k(cls2, cVar2);
        i(cls2, Double.valueOf(0.0d));
        j(double[].class, w.f29611n);
        k(double[].class, w.f29612o);
        j(Double.class, w.f29609l);
        k(Double.class, cVar2);
        Class cls3 = Float.TYPE;
        j(cls3, w.f29613p);
        c cVar3 = w.f29615r;
        k(cls3, cVar3);
        i(cls3, Float.valueOf(0.0f));
        j(float[].class, w.f29616s);
        k(float[].class, w.f29617t);
        j(Float.class, w.f29614q);
        k(Float.class, cVar3);
        Class cls4 = Integer.TYPE;
        j(cls4, w.f29618u);
        c cVar4 = w.f29620w;
        k(cls4, cVar4);
        i(cls4, 0);
        j(int[].class, w.f29621x);
        k(int[].class, w.f29622y);
        j(Integer.class, w.f29619v);
        k(Integer.class, cVar4);
        Class cls5 = Short.TYPE;
        j(cls5, w.f29623z);
        c cVar5 = w.B;
        k(cls5, cVar5);
        i(cls5, (short) 0);
        j(short[].class, w.C);
        k(short[].class, w.D);
        j(Short.class, w.A);
        k(Short.class, cVar5);
        Class cls6 = Long.TYPE;
        j(cls6, w.E);
        c cVar6 = w.G;
        k(cls6, cVar6);
        i(cls6, 0L);
        j(long[].class, w.H);
        k(long[].class, w.I);
        j(Long.class, w.F);
        k(Long.class, cVar6);
        j(BigDecimal.class, w.f29597J);
        k(BigDecimal.class, w.K);
        j(String.class, d.f29499o);
        k(String.class, d.f29500p);
        j(UUID.class, y.f29624a);
        k(UUID.class, y.f29625b);
        j(Number.class, w.L);
        k(CharSequence.class, d.f29501q);
        j(StringBuilder.class, d.f29502r);
        j(StringBuffer.class, d.f29503s);
        Iterator it = jVar.f29520h.iterator();
        if (it.hasNext()) {
            ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(it.next());
            throw null;
        }
        if (hashSet.isEmpty()) {
            return;
        }
        f(hashSet, "dsl_json_Annotation_Processor_External_Serialization");
        f(hashSet, "dsl_json.json.ExternalSerialization");
        f(hashSet, "dsl_json_ExternalSerialization");
    }

    public static Type c(Type type) {
        if (!(type instanceof WildcardType)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        return (wildcardType.getUpperBounds().length == 1 && wildcardType.getLowerBounds().length == 0) ? wildcardType.getUpperBounds()[0] : type;
    }

    public static void d(Class cls, ArrayList arrayList) {
        if (arrayList.contains(cls)) {
            return;
        }
        arrayList.add(cls);
        Class superclass = cls.getSuperclass();
        if (superclass != null && superclass != Object.class) {
            d(superclass, arrayList);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            d(cls2, arrayList);
        }
    }

    public static void f(HashSet hashSet, String str) {
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            try {
                ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(((ClassLoader) it.next()).loadClass(str).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                throw null;
            } catch (Exception | NoClassDefFoundError unused) {
            }
        }
    }

    public static void h(Class cls, Object obj) {
        try {
            cls.getField("JSON_READER").get(obj);
        } catch (Exception unused) {
            try {
                try {
                    cls.getMethod("JSON_READER", new Class[0]).invoke(obj, new Object[0]);
                } catch (Exception unused2) {
                }
            } catch (Exception unused3) {
                cls.getMethod("getJSON_READER", new Class[0]).invoke(obj, new Object[0]);
            }
        }
    }

    public final void a(Type type, ConcurrentHashMap concurrentHashMap) {
        Type c13;
        boolean z13 = type instanceof Class;
        sp2.i iVar = this.f29538l;
        if (z13) {
            iVar.a0((Class) type);
            return;
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            iVar.a0((Class) parameterizedType.getRawType());
            for (Type type2 : parameterizedType.getActualTypeArguments()) {
                if (!concurrentHashMap.containsKey(type2) && (c13 = c(type2)) != type2 && !concurrentHashMap.containsKey(c13)) {
                    a(c13, concurrentHashMap);
                }
            }
        }
    }

    public final Object b(t tVar, InputStream inputStream) {
        tVar.c();
        r o13 = o(Map.class);
        if (o13 != null) {
            return o13.a(tVar);
        }
        if (Map.class.isArray()) {
            if (tVar.u()) {
                return null;
            }
            if (tVar.f29571d != 91) {
                throw tVar.f("Expecting '[' for array start");
            }
            Class<?> componentType = Map.class.getComponentType();
            int i13 = 0;
            if (tVar.c() == 93) {
                return Array.newInstance(componentType, 0);
            }
            if (n.class.isAssignableFrom(componentType)) {
                e(componentType);
            }
            r o14 = o(componentType);
            if (o14 != null) {
                ArrayList arrayList = new ArrayList(4);
                if (tVar.u()) {
                    arrayList.add(null);
                } else {
                    arrayList.add(o14.a(tVar));
                }
                while (tVar.c() == 44) {
                    tVar.c();
                    if (tVar.u()) {
                        arrayList.add(null);
                    } else {
                        arrayList.add(o14.a(tVar));
                    }
                }
                tVar.b();
                if (componentType.isPrimitive()) {
                    if (Boolean.TYPE.equals(componentType)) {
                        boolean[] zArr = new boolean[arrayList.size()];
                        while (i13 < arrayList.size()) {
                            zArr[i13] = ((Boolean) arrayList.get(i13)).booleanValue();
                            i13++;
                        }
                        return zArr;
                    }
                    if (Integer.TYPE.equals(componentType)) {
                        int[] iArr = new int[arrayList.size()];
                        while (i13 < arrayList.size()) {
                            iArr[i13] = ((Integer) arrayList.get(i13)).intValue();
                            i13++;
                        }
                        return iArr;
                    }
                    if (Long.TYPE.equals(componentType)) {
                        long[] jArr = new long[arrayList.size()];
                        while (i13 < arrayList.size()) {
                            jArr[i13] = ((Long) arrayList.get(i13)).longValue();
                            i13++;
                        }
                        return jArr;
                    }
                    if (Short.TYPE.equals(componentType)) {
                        short[] sArr = new short[arrayList.size()];
                        while (i13 < arrayList.size()) {
                            sArr[i13] = ((Short) arrayList.get(i13)).shortValue();
                            i13++;
                        }
                        return sArr;
                    }
                    if (Byte.TYPE.equals(componentType)) {
                        byte[] bArr = new byte[arrayList.size()];
                        while (i13 < arrayList.size()) {
                            bArr[i13] = ((Byte) arrayList.get(i13)).byteValue();
                            i13++;
                        }
                        return bArr;
                    }
                    if (Float.TYPE.equals(componentType)) {
                        float[] fArr = new float[arrayList.size()];
                        while (i13 < arrayList.size()) {
                            fArr[i13] = ((Float) arrayList.get(i13)).floatValue();
                            i13++;
                        }
                        return fArr;
                    }
                    if (Double.TYPE.equals(componentType)) {
                        double[] dArr = new double[arrayList.size()];
                        while (i13 < arrayList.size()) {
                            dArr[i13] = ((Double) arrayList.get(i13)).doubleValue();
                            i13++;
                        }
                        return dArr;
                    }
                    if (Character.TYPE.equals(componentType)) {
                        char[] cArr = new char[arrayList.size()];
                        while (i13 < arrayList.size()) {
                            cArr[i13] = ((Character) arrayList.get(i13)).charValue();
                            i13++;
                        }
                        return cArr;
                    }
                }
                return arrayList.toArray((Object[]) Array.newInstance(componentType, 0));
            }
        }
        if (this.f29527a != null) {
            new i(inputStream, tVar.f29575h);
            throw new UnsupportedOperationException();
        }
        ArrayList arrayList2 = new ArrayList();
        d(Map.class, arrayList2);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            Class cls = (Class) it.next();
            if (this.f29541o.containsKey(cls)) {
                if (cls.equals(Map.class)) {
                    throw new IOException("Reader for provided type: " + Map.class + " is disabled and fallback serialization is not registered (converter is registered as null).\nTry initializing system with custom fallback or don't register null for " + Map.class);
                }
                throw new IOException("Unable to find reader for provided type: " + Map.class + " and fallback serialization is not registered.\nFound reader for: " + cls + " so try deserializing into that instead?\nAlternatively, try initializing system with custom fallback or register specified type using registerReader into " + k.class);
            }
        }
        throw new IOException("Unable to find reader for provided type: " + Map.class + " and fallback serialization is not registered.\nTry initializing DslJson with custom fallback in case of unsupported objects or register specified type using registerReader into " + k.class);
    }

    public final void e(Class cls) {
        try {
            ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(this.f29540n.get(cls));
            h(cls, null);
            Object obj = cls.getField("Companion").get(null);
            h(obj.getClass(), obj);
        } catch (Exception unused) {
        }
    }

    public final Object g(Type type, CopyOnWriteArrayList copyOnWriteArrayList, ConcurrentHashMap concurrentHashMap) {
        if (type instanceof Class) {
            this.f29538l.a0((Class) type);
            Object obj = concurrentHashMap.get(type);
            if (obj != null) {
                return obj;
            }
        } else if (type instanceof ParameterizedType) {
            a(type, concurrentHashMap);
        }
        Iterator it = copyOnWriteArrayList.iterator();
        if (!it.hasNext()) {
            return null;
        }
        ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(it.next());
        throw null;
    }

    public final void i(Class cls, Object obj) {
        this.f29539m.put(cls, obj);
    }

    public final void j(Class cls, b bVar) {
        ConcurrentHashMap concurrentHashMap = this.f29541o;
        if (bVar == null) {
            concurrentHashMap.remove(cls);
        } else {
            concurrentHashMap.put(cls, bVar);
        }
    }

    public final void k(Class cls, u uVar) {
        ConcurrentHashMap concurrentHashMap = this.f29542p;
        ConcurrentHashMap concurrentHashMap2 = this.f29543q;
        if (uVar == null) {
            concurrentHashMap2.remove(cls);
            concurrentHashMap.remove(cls);
        } else {
            concurrentHashMap2.put(cls, cls);
            concurrentHashMap.put(cls, uVar);
        }
    }

    public final void l(v vVar, Object obj) {
        if (obj == null) {
            vVar.e();
            return;
        }
        Class<?> cls = obj.getClass();
        if (m(vVar, cls, obj)) {
            return;
        }
        hd.f fVar = this.f29527a;
        if (fVar == null) {
            throw new ConfigurationException(a.a.h("Unable to serialize provided object. Failed to find serializer for: ", cls));
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(fVar.f68796a);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        int length = byteArray.length;
        int i13 = vVar.f29593a;
        if (i13 + length >= vVar.f29595c.length) {
            vVar.a(i13, length);
        }
        int i14 = vVar.f29593a;
        byte[] bArr = vVar.f29595c;
        for (int i15 = 0; i15 < byteArray.length; i15++) {
            bArr[i14 + i15] = byteArray[i15];
        }
        vVar.f29593a += length;
    }

    public final boolean m(v vVar, Class cls, Object obj) {
        try {
            if (obj == null) {
                vVar.e();
                return true;
            }
            if (obj instanceof n[]) {
                n[] nVarArr = (n[]) obj;
                vVar.d((byte) 91);
                if (nVarArr.length != 0) {
                    n nVar = nVarArr[0];
                    vVar.e();
                    for (int i13 = 1; i13 < nVarArr.length; i13++) {
                        vVar.d((byte) 44);
                        n nVar2 = nVarArr[i13];
                        vVar.e();
                    }
                }
                vVar.d((byte) 93);
                return true;
            }
            u p13 = p(cls);
            if (p13 != null) {
                p13.a(vVar, obj);
                return true;
            }
            if (cls.isArray()) {
                if (Array.getLength(obj) == 0) {
                    vVar.c("[]");
                    return true;
                }
                Class<?> componentType = cls.getComponentType();
                if (Character.TYPE == componentType) {
                    vVar.g(new String((char[]) obj));
                    return true;
                }
                u p14 = p(componentType);
                if (p14 != null) {
                    Object[] objArr = (Object[]) obj;
                    vVar.d((byte) 91);
                    if (objArr.length != 0) {
                        Object obj2 = objArr[0];
                        if (obj2 != null) {
                            p14.a(vVar, obj2);
                        } else {
                            vVar.e();
                        }
                        for (int i14 = 1; i14 < objArr.length; i14++) {
                            vVar.d((byte) 44);
                            Object obj3 = objArr[i14];
                            if (obj3 != null) {
                                p14.a(vVar, obj3);
                            } else {
                                vVar.e();
                            }
                        }
                    }
                    vVar.d((byte) 93);
                    return true;
                }
            }
            if (!(obj instanceof Collection)) {
                return false;
            }
            Collection collection = (Collection) obj;
            if (collection.isEmpty()) {
                vVar.c("[]");
                return true;
            }
            Iterator it = collection.iterator();
            boolean z13 = collection instanceof List;
            List arrayList = z13 ? (List) collection : new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Class<?> cls2 = null;
            boolean z14 = false;
            Class<?> cls3 = null;
            u uVar = null;
            do {
                try {
                    Object next = it.next();
                    if (!z13) {
                        arrayList.add(next);
                    }
                    if (next != null) {
                        Class<?> cls4 = next.getClass();
                        if (cls4 != cls2 && (cls2 == null || cls4.isAssignableFrom(cls2))) {
                            cls2 = cls4;
                        }
                        if (cls3 != cls4) {
                            uVar = p(cls4);
                            cls3 = cls4;
                        }
                        arrayList2.add(uVar);
                        if (!z14 && uVar != null) {
                            z14 = false;
                        }
                        z14 = true;
                    } else {
                        arrayList2.add(this.f29545s);
                    }
                } catch (ClassCastException unused) {
                    return false;
                }
            } while (it.hasNext());
            if (cls2 != null && n.class.isAssignableFrom(cls2)) {
                vVar.d((byte) 91);
                Iterator it2 = arrayList.iterator();
                ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(it2.next());
                vVar.e();
                while (it2.hasNext()) {
                    vVar.d((byte) 44);
                    ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(it2.next());
                    vVar.e();
                }
                vVar.d((byte) 93);
                return true;
            }
            if (!z14) {
                vVar.d((byte) 91);
                Iterator it3 = arrayList.iterator();
                ((u) arrayList2.get(0)).a(vVar, it3.next());
                int i15 = 1;
                while (it3.hasNext()) {
                    vVar.d((byte) 44);
                    ((u) arrayList2.get(i15)).a(vVar, it3.next());
                    i15++;
                }
                vVar.d((byte) 93);
                return true;
            }
            u p15 = p(cls2);
            if (p15 == null) {
                return false;
            }
            vVar.d((byte) 91);
            if (!collection.isEmpty()) {
                Iterator it4 = collection.iterator();
                Object next2 = it4.next();
                if (next2 != null) {
                    p15.a(vVar, next2);
                } else {
                    vVar.e();
                }
                while (it4.hasNext()) {
                    vVar.d((byte) 44);
                    Object next3 = it4.next();
                    if (next3 != null) {
                        p15.a(vVar, next3);
                    } else {
                        vVar.e();
                    }
                }
            }
            vVar.d((byte) 93);
            return true;
        } catch (ClassCastException unused2) {
            return false;
        }
    }

    public final void n(v vVar, Map map) {
        vVar.d((byte) 123);
        int size = map.size();
        if (size > 0) {
            Iterator it = map.entrySet().iterator();
            Map.Entry entry = (Map.Entry) it.next();
            vVar.g((String) entry.getKey());
            vVar.d((byte) 58);
            l(vVar, entry.getValue());
            for (int i13 = 1; i13 < size; i13++) {
                vVar.d((byte) 44);
                Map.Entry entry2 = (Map.Entry) it.next();
                vVar.g((String) entry2.getKey());
                vVar.d((byte) 58);
                l(vVar, entry2.getValue());
            }
        }
        vVar.d((byte) 125);
    }

    public final r o(Class cls) {
        r rVar;
        ConcurrentHashMap concurrentHashMap = this.f29541o;
        r rVar2 = (r) concurrentHashMap.get(cls);
        if (rVar2 != null) {
            return rVar2;
        }
        Type c13 = c(cls);
        if (c13 != cls && (rVar = (r) concurrentHashMap.get(c13)) != null) {
            concurrentHashMap.putIfAbsent(cls, rVar);
            return rVar;
        }
        if (c13 instanceof Class) {
            Class cls2 = (Class) c13;
            if (n.class.isAssignableFrom(cls2)) {
                e(cls2);
            }
        }
        return (r) g(c13, this.f29530d, concurrentHashMap);
    }

    public final u p(Class cls) {
        u uVar;
        ConcurrentHashMap concurrentHashMap = this.f29542p;
        u uVar2 = (u) concurrentHashMap.get(cls);
        if (uVar2 != null) {
            return uVar2;
        }
        Type c13 = c(cls);
        if (c13 != cls && (uVar = (u) concurrentHashMap.get(c13)) != null) {
            concurrentHashMap.putIfAbsent(cls, uVar);
            return uVar;
        }
        boolean z13 = c13 instanceof Class;
        if (z13 && n.class.isAssignableFrom((Class) c13)) {
            g gVar = this.f29544r;
            concurrentHashMap.putIfAbsent(cls, gVar);
            return gVar;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.f29529c;
        u uVar3 = (u) g(c13, copyOnWriteArrayList, concurrentHashMap);
        if (uVar3 != null) {
            return uVar3;
        }
        if (!z13) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap2 = this.f29543q;
        Object obj = (Class) concurrentHashMap2.get(c13);
        if (obj != null) {
            return (u) concurrentHashMap.get(obj);
        }
        Class cls2 = (Class) c13;
        ArrayList arrayList = new ArrayList();
        d(cls2, arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Class cls3 = (Class) it.next();
            u uVar4 = (u) concurrentHashMap.get(cls3);
            if (uVar4 == null) {
                uVar4 = (u) g(cls3, copyOnWriteArrayList, concurrentHashMap);
            }
            if (uVar4 != null) {
                concurrentHashMap2.putIfAbsent(cls2, cls3);
                return uVar4;
            }
        }
        return null;
    }
}
