package to2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.collections.b1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class e implements f {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f118711a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f118712b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f118713c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f118714d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f118715e = new HashMap();

    public static void f(e eVar, rl2.d forClass, c provider) {
        eVar.getClass();
        Intrinsics.checkNotNullParameter(forClass, "forClass");
        Intrinsics.checkNotNullParameter(provider, "provider");
        HashMap hashMap = eVar.f118711a;
        c cVar = (c) hashMap.get(forClass);
        if (cVar == null || Intrinsics.d(cVar, provider)) {
            hashMap.put(forClass, provider);
            return;
        }
        throw new mm.d("Contextual serializer or serializer provider for " + forClass + " already registered in this module");
    }

    @Override // to2.f
    public final void a(rl2.d baseClass, Function1 defaultDeserializerProvider) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(defaultDeserializerProvider, "defaultDeserializerProvider");
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(defaultDeserializerProvider, "defaultDeserializerProvider");
        HashMap hashMap = this.f118715e;
        Function1 function1 = (Function1) hashMap.get(baseClass);
        if (function1 == null || Intrinsics.d(function1, defaultDeserializerProvider)) {
            hashMap.put(baseClass, defaultDeserializerProvider);
            return;
        }
        throw new IllegalArgumentException("Default deserializers provider for " + baseClass + " is already registered: " + function1);
    }

    @Override // to2.f
    public final void b(rl2.d baseClass, rl2.d concreteClass, no2.b concreteSerializer) {
        Object obj;
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(concreteClass, "actualClass");
        Intrinsics.checkNotNullParameter(concreteSerializer, "actualSerializer");
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(concreteClass, "concreteClass");
        Intrinsics.checkNotNullParameter(concreteSerializer, "concreteSerializer");
        String i13 = concreteSerializer.a().i();
        HashMap hashMap = this.f118712b;
        Object obj2 = hashMap.get(baseClass);
        if (obj2 == null) {
            obj2 = new HashMap();
            hashMap.put(baseClass, obj2);
        }
        Map map = (Map) obj2;
        no2.b bVar = (no2.b) map.get(concreteClass);
        HashMap hashMap2 = this.f118714d;
        Object obj3 = hashMap2.get(baseClass);
        if (obj3 == null) {
            obj3 = new HashMap();
            hashMap2.put(baseClass, obj3);
        }
        Map map2 = (Map) obj3;
        if (bVar != null) {
            if (!Intrinsics.d(bVar, concreteSerializer)) {
                Intrinsics.checkNotNullParameter(baseClass, "baseClass");
                Intrinsics.checkNotNullParameter(concreteClass, "concreteClass");
                throw new mm.d("Serializer for " + concreteClass + " already registered in the scope of " + baseClass);
            }
            map2.remove(bVar.a().i());
        }
        no2.b bVar2 = (no2.b) map2.get(i13);
        if (bVar2 == null) {
            map.put(concreteClass, concreteSerializer);
            map2.put(i13, concreteSerializer);
            return;
        }
        Object obj4 = hashMap.get(baseClass);
        Intrinsics.f(obj4);
        Iterator it = b1.s((Map) obj4).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((Map.Entry) obj).getValue() == bVar2) {
                    break;
                }
            }
        }
        throw new IllegalArgumentException("Multiple polymorphic serializers for base class '" + baseClass + "' have the same serial name '" + i13 + "': '" + concreteClass + "' and '" + ((Map.Entry) obj) + '\'');
    }

    @Override // to2.f
    public final void c(rl2.d kClass, no2.b serializer) {
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        f(this, kClass, new a(serializer));
    }

    @Override // to2.f
    public final void d(rl2.d baseClass, Function1 defaultSerializerProvider) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(defaultSerializerProvider, "defaultSerializerProvider");
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(defaultSerializerProvider, "defaultSerializerProvider");
        HashMap hashMap = this.f118713c;
        Function1 function1 = (Function1) hashMap.get(baseClass);
        if (function1 == null || Intrinsics.d(function1, defaultSerializerProvider)) {
            hashMap.put(baseClass, defaultSerializerProvider);
            return;
        }
        throw new IllegalArgumentException("Default serializers provider for " + baseClass + " is already registered: " + function1);
    }

    @Override // to2.f
    public final void e(rl2.d kClass, Function1 provider) {
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        Intrinsics.checkNotNullParameter(provider, "provider");
        f(this, kClass, new b(provider));
    }
}
