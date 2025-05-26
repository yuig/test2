package ja;

import android.content.Context;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f75152a;

    /* renamed from: b, reason: collision with root package name */
    public final Class f75153b;

    /* renamed from: c, reason: collision with root package name */
    public final String f75154c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f75155d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f75156e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f75157f;

    /* renamed from: g, reason: collision with root package name */
    public Executor f75158g;

    /* renamed from: h, reason: collision with root package name */
    public Executor f75159h;

    /* renamed from: i, reason: collision with root package name */
    public oa.e f75160i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f75161j;

    /* renamed from: k, reason: collision with root package name */
    public final b0 f75162k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f75163l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f75164m;

    /* renamed from: n, reason: collision with root package name */
    public final long f75165n;

    /* renamed from: o, reason: collision with root package name */
    public final c0 f75166o;

    /* renamed from: p, reason: collision with root package name */
    public final LinkedHashSet f75167p;

    /* renamed from: q, reason: collision with root package name */
    public HashSet f75168q;

    public a0(Context context, Class klass, String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(klass, "klass");
        this.f75152a = context;
        this.f75153b = klass;
        this.f75154c = str;
        this.f75155d = new ArrayList();
        this.f75156e = new ArrayList();
        this.f75157f = new ArrayList();
        this.f75162k = b0.AUTOMATIC;
        this.f75163l = true;
        this.f75165n = -1L;
        this.f75166o = new c0(0);
        this.f75167p = new LinkedHashSet();
    }

    public final void a(ka.b... migrations) {
        Intrinsics.checkNotNullParameter(migrations, "migrations");
        if (this.f75168q == null) {
            this.f75168q = new HashSet();
        }
        for (ka.b bVar : migrations) {
            HashSet hashSet = this.f75168q;
            Intrinsics.f(hashSet);
            hashSet.add(Integer.valueOf(bVar.f78892a));
            HashSet hashSet2 = this.f75168q;
            Intrinsics.f(hashSet2);
            hashSet2.add(Integer.valueOf(bVar.f78893b));
        }
        this.f75166o.a((ka.b[]) Arrays.copyOf(migrations, migrations.length));
    }

    public final d0 b() {
        Executor executor = this.f75158g;
        if (executor == null && this.f75159h == null) {
            o.a aVar = o.b.f92735d;
            this.f75159h = aVar;
            this.f75158g = aVar;
        } else if (executor != null && this.f75159h == null) {
            this.f75159h = executor;
        } else if (executor == null) {
            this.f75158g = this.f75159h;
        }
        HashSet hashSet = this.f75168q;
        LinkedHashSet linkedHashSet = this.f75167p;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                int intValue = ((Number) it.next()).intValue();
                if (!(!linkedHashSet.contains(Integer.valueOf(intValue)))) {
                    throw new IllegalArgumentException(a.a.d("Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: ", intValue).toString());
                }
            }
        }
        oa.e eVar = this.f75160i;
        if (eVar == null) {
            eVar = new m60.f0();
        }
        oa.e eVar2 = eVar;
        if (this.f75165n > 0) {
            if (this.f75154c != null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            throw new IllegalArgumentException("Cannot create auto-closing database for an in-memory database.".toString());
        }
        ArrayList arrayList = this.f75155d;
        boolean z13 = this.f75161j;
        b0 b0Var = this.f75162k;
        Context context = this.f75152a;
        b0 resolve$room_runtime_release = b0Var.resolve$room_runtime_release(context);
        Executor executor2 = this.f75158g;
        if (executor2 == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        Executor executor3 = this.f75159h;
        if (executor3 == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        g configuration = new g(context, this.f75154c, eVar2, this.f75166o, arrayList, z13, resolve$room_runtime_release, executor2, executor3, this.f75163l, this.f75164m, linkedHashSet, this.f75156e, this.f75157f);
        Class klass = this.f75153b;
        Intrinsics.checkNotNullParameter(klass, "klass");
        Intrinsics.checkNotNullParameter("_Impl", "suffix");
        Package r43 = klass.getPackage();
        Intrinsics.f(r43);
        String fullPackage = r43.getName();
        String canonicalName = klass.getCanonicalName();
        Intrinsics.f(canonicalName);
        Intrinsics.checkNotNullExpressionValue(fullPackage, "fullPackage");
        if (fullPackage.length() != 0) {
            canonicalName = canonicalName.substring(fullPackage.length() + 1);
            Intrinsics.checkNotNullExpressionValue(canonicalName, "this as java.lang.String).substring(startIndex)");
        }
        String str = kotlin.text.z.m(canonicalName, '.', '_') + "_Impl";
        try {
            Class<?> cls = Class.forName(fullPackage.length() == 0 ? str : fullPackage + '.' + str, true, klass.getClassLoader());
            Intrinsics.g(cls, "null cannot be cast to non-null type java.lang.Class<T of androidx.room.Room.getGeneratedImplementation>");
            d0 d0Var = (d0) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            d0Var.getClass();
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            d0Var.f75181d = d0Var.e(configuration);
            Set i13 = d0Var.i();
            BitSet bitSet = new BitSet();
            Iterator it2 = i13.iterator();
            while (true) {
                boolean hasNext = it2.hasNext();
                LinkedHashMap linkedHashMap = d0Var.f75185h;
                int i14 = -1;
                List list = configuration.f75229n;
                if (hasNext) {
                    Class cls2 = (Class) it2.next();
                    int size = list.size() - 1;
                    if (size >= 0) {
                        while (true) {
                            int i15 = size - 1;
                            if (cls2.isAssignableFrom(list.get(size).getClass())) {
                                bitSet.set(size);
                                i14 = size;
                                break;
                            }
                            if (i15 < 0) {
                                break;
                            }
                            size = i15;
                        }
                    }
                    if (i14 < 0) {
                        throw new IllegalArgumentException(("A required auto migration spec (" + cls2.getCanonicalName() + ") is missing in the database configuration.").toString());
                    }
                    linkedHashMap.put(cls2, list.get(i14));
                } else {
                    int size2 = list.size() - 1;
                    if (size2 >= 0) {
                        while (true) {
                            int i16 = size2 - 1;
                            if (!bitSet.get(size2)) {
                                throw new IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.".toString());
                            }
                            if (i16 < 0) {
                                break;
                            }
                            size2 = i16;
                        }
                    }
                    for (ka.b bVar : d0Var.f(linkedHashMap)) {
                        int i17 = bVar.f78892a;
                        Integer valueOf = Integer.valueOf(i17);
                        c0 c0Var = configuration.f75219d;
                        Map map = c0Var.f75176a;
                        if (map.containsKey(valueOf)) {
                            Map map2 = (Map) map.get(Integer.valueOf(i17));
                            if (map2 == null) {
                                map2 = z0.d();
                            }
                            if (!map2.containsKey(Integer.valueOf(bVar.f78893b))) {
                            }
                        }
                        c0Var.a(bVar);
                    }
                    d0Var.g().setWriteAheadLoggingEnabled(configuration.f75222g == b0.WRITE_AHEAD_LOGGING);
                    d0Var.f75184g = configuration.f75220e;
                    d0Var.f75179b = configuration.f75223h;
                    d0Var.f75180c = new androidx.appcompat.app.r(1, configuration.f75224i);
                    d0Var.f75183f = configuration.f75221f;
                    Map j13 = d0Var.j();
                    BitSet bitSet2 = new BitSet();
                    Iterator it3 = j13.entrySet().iterator();
                    while (true) {
                        boolean hasNext2 = it3.hasNext();
                        List list2 = configuration.f75228m;
                        if (!hasNext2) {
                            int size3 = list2.size() - 1;
                            if (size3 >= 0) {
                                while (true) {
                                    int i18 = size3 - 1;
                                    if (!bitSet2.get(size3)) {
                                        throw new IllegalArgumentException("Unexpected type converter " + list2.get(size3) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                                    }
                                    if (i18 < 0) {
                                        break;
                                    }
                                    size3 = i18;
                                }
                            }
                            return d0Var;
                        }
                        Map.Entry entry = (Map.Entry) it3.next();
                        Class cls3 = (Class) entry.getKey();
                        for (Class cls4 : (List) entry.getValue()) {
                            int size4 = list2.size() - 1;
                            if (size4 >= 0) {
                                while (true) {
                                    int i19 = size4 - 1;
                                    if (cls4.isAssignableFrom(list2.get(size4).getClass())) {
                                        bitSet2.set(size4);
                                        break;
                                    }
                                    if (i19 < 0) {
                                        break;
                                    }
                                    size4 = i19;
                                }
                            }
                            size4 = -1;
                            if (size4 < 0) {
                                throw new IllegalArgumentException(("A required type converter (" + cls4 + ") for " + cls3.getCanonicalName() + " is missing in the database configuration.").toString());
                            }
                            d0Var.f75189l.put(cls4, list2.get(size4));
                        }
                    }
                }
            }
        } catch (ClassNotFoundException unused) {
            throw new RuntimeException("Cannot find implementation for " + klass.getCanonicalName() + ". " + str + " does not exist");
        } catch (IllegalAccessException unused2) {
            throw new RuntimeException("Cannot access the constructor " + klass.getCanonicalName());
        } catch (InstantiationException unused3) {
            throw new RuntimeException("Failed to create an instance of " + klass.getCanonicalName());
        }
    }
}
