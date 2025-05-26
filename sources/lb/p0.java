package lb;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import i2.a2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class p0 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f82652a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f82653b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f82654c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f82655d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f82656e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f82657f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f82658g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f82659h;

    /* renamed from: i, reason: collision with root package name */
    public Object f82660i;

    public p0(Context context, kb.d configuration, vb.b workTaskExecutor, sb.a foregroundProcessor, WorkDatabase workDatabase, tb.s workSpec, ArrayList tags) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(workTaskExecutor, "workTaskExecutor");
        Intrinsics.checkNotNullParameter(foregroundProcessor, "foregroundProcessor");
        Intrinsics.checkNotNullParameter(workDatabase, "workDatabase");
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        Intrinsics.checkNotNullParameter(tags, "tags");
        this.f82653b = configuration;
        this.f82654c = workTaskExecutor;
        this.f82655d = foregroundProcessor;
        this.f82656e = workDatabase;
        this.f82657f = workSpec;
        this.f82652a = tags;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
        this.f82658g = applicationContext;
        this.f82660i = new x92.b(8);
    }

    public static void c(List list, String str, String str2, a2 a2Var) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            pc.s sVar = (pc.s) it.next();
            if (sVar instanceof pc.m) {
                a2Var.f71073a.add(sVar);
            } else if (sVar instanceof pc.n) {
                pc.n nVar = (pc.n) sVar;
                if (CollectionsKt.L(nVar.f99592b, str2) || Intrinsics.d(nVar.f99591a, str)) {
                    c(nVar.f99594d, str, str2, a2Var);
                }
            }
        }
    }

    public final p0 a(am2.m descriptor, List typeParameterProtos, vm2.f nameResolver, vm2.i typeTable, vm2.j versionRequirementTable, vm2.a version) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(typeParameterProtos, "typeParameterProtos");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        Intrinsics.checkNotNullParameter(versionRequirementTable, "versionRequirementTable");
        Intrinsics.checkNotNullParameter(version, "metadataVersion");
        ln2.o oVar = (ln2.o) this.f82653b;
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(version, "version");
        int i13 = version.f126211b;
        return new p0(oVar, nameResolver, descriptor, typeTable, ((i13 != 1 || version.f126212c < 4) && i13 <= 1) ? (vm2.j) this.f82657f : versionRequirementTable, version, (nn2.l) this.f82658g, (ln2.l0) this.f82659h, typeParameterProtos);
    }

    public final on2.u d() {
        return ((ln2.o) this.f82653b).f84108a;
    }

    public final void e(Object obj, ArrayList arrayList, List list, String str) {
        if (obj instanceof wc.c) {
            ((List) this.f82660i).add(new xc.a(((wc.c) obj).f129079a, arrayList, list, str));
            return;
        }
        if (obj instanceof List) {
            int i13 = 0;
            for (Object obj2 : (Iterable) obj) {
                int i14 = i13 + 1;
                if (i13 < 0) {
                    kotlin.collections.f0.p();
                    throw null;
                }
                e(obj2, CollectionsKt.m0(Integer.valueOf(i13), arrayList), list, str);
                i13 = i14;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.LinkedHashMap, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList] */
    public final Object f(Object obj, List list) {
        Object linkedHashMap;
        if (obj instanceof wc.c) {
            return f(((Map) this.f82659h).get(list), list);
        }
        if (obj instanceof List) {
            Iterable iterable = (Iterable) obj;
            linkedHashMap = new ArrayList(kotlin.collections.g0.q(iterable, 10));
            int i13 = 0;
            for (Object obj2 : iterable) {
                int i14 = i13 + 1;
                if (i13 < 0) {
                    kotlin.collections.f0.p();
                    throw null;
                }
                linkedHashMap.add(f(obj2, CollectionsKt.m0(Integer.valueOf(i13), list)));
                i13 = i14;
            }
        } else {
            if (!(obj instanceof Map)) {
                return obj;
            }
            Map map = (Map) obj;
            linkedHashMap = new LinkedHashMap(kotlin.collections.y0.a(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                Object key2 = entry.getKey();
                Intrinsics.g(key2, "null cannot be cast to non-null type kotlin.String");
                linkedHashMap.put(key, f(value, CollectionsKt.m0((String) key2, list)));
            }
        }
        return linkedHashMap;
    }

    public p0(ln2.o components, vm2.f nameResolver, am2.m containingDeclaration, vm2.i typeTable, vm2.j versionRequirementTable, vm2.a metadataVersion, nn2.l lVar, ln2.l0 l0Var, List typeParameters) {
        String a13;
        Intrinsics.checkNotNullParameter(components, "components");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(containingDeclaration, "containingDeclaration");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        Intrinsics.checkNotNullParameter(versionRequirementTable, "versionRequirementTable");
        Intrinsics.checkNotNullParameter(metadataVersion, "metadataVersion");
        Intrinsics.checkNotNullParameter(typeParameters, "typeParameters");
        this.f82653b = components;
        this.f82654c = nameResolver;
        this.f82655d = containingDeclaration;
        this.f82656e = typeTable;
        this.f82657f = versionRequirementTable;
        this.f82652a = metadataVersion;
        this.f82658g = lVar;
        nn2.l lVar2 = lVar;
        this.f82659h = new ln2.l0(this, l0Var, typeParameters, "Deserializer for \"" + containingDeclaration.getName() + '\"', (lVar2 == null || (a13 = lVar2.a()) == null) ? "[container not found]" : a13);
        this.f82660i = new ln2.a0(this);
    }

    public p0(wc.l cache, String rootKey, ja.c0 variables, wc.e cacheResolver, wc.a cacheHeaders, List rootSelections, String rootTypename) {
        Intrinsics.checkNotNullParameter(cache, "cache");
        Intrinsics.checkNotNullParameter(rootKey, "rootKey");
        Intrinsics.checkNotNullParameter(variables, "variables");
        Intrinsics.checkNotNullParameter(cacheResolver, "cacheResolver");
        Intrinsics.checkNotNullParameter(cacheHeaders, "cacheHeaders");
        Intrinsics.checkNotNullParameter(rootSelections, "rootSelections");
        Intrinsics.checkNotNullParameter(rootTypename, "rootTypename");
        this.f82653b = cache;
        this.f82654c = rootKey;
        this.f82655d = variables;
        this.f82656e = cacheResolver;
        this.f82657f = cacheHeaders;
        this.f82652a = rootSelections;
        this.f82658g = rootTypename;
        this.f82659h = new LinkedHashMap();
        this.f82660i = new ArrayList();
    }
}
