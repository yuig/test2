package ul2;

import ey.v4;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class v1 {

    /* renamed from: a, reason: collision with root package name */
    public static final ConcurrentHashMap f122620a = new ConcurrentHashMap();

    public static final fm2.g a(Class cls) {
        Intrinsics.checkNotNullParameter(cls, "<this>");
        ClassLoader classLoader = gm2.d.d(cls);
        d2 d2Var = new d2(classLoader);
        ConcurrentHashMap concurrentHashMap = f122620a;
        WeakReference weakReference = (WeakReference) concurrentHashMap.get(d2Var);
        if (weakReference != null) {
            fm2.g gVar = (fm2.g) weakReference.get();
            if (gVar != null) {
                return gVar;
            }
            concurrentHashMap.remove(d2Var, weakReference);
        }
        Intrinsics.checkNotNullParameter(classLoader, "classLoader");
        fm2.d kotlinClassFinder = new fm2.d(classLoader);
        ClassLoader classLoader2 = Unit.class.getClassLoader();
        Intrinsics.checkNotNullExpressionValue(classLoader2, "getClassLoader(...)");
        fm2.d finder = new fm2.d(classLoader2);
        fm2.b javaClassFinder = new fm2.b(classLoader);
        String moduleName = "runtime module for " + classLoader;
        fm2.f errorReporter = fm2.f.f62581b;
        fm2.f javaSourceElementFactory = fm2.f.f62582c;
        Intrinsics.checkNotNullParameter(kotlinClassFinder, "kotlinClassFinder");
        Intrinsics.checkNotNullParameter(finder, "jvmBuiltInsKotlinClassFinder");
        Intrinsics.checkNotNullParameter(javaClassFinder, "javaClassFinder");
        Intrinsics.checkNotNullParameter(moduleName, "moduleName");
        Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
        Intrinsics.checkNotNullParameter(javaSourceElementFactory, "javaSourceElementFactory");
        on2.q storageManager = new on2.q("DeserializationComponentsForJava.ModuleData");
        zl2.k kVar = new zl2.k(storageManager, zl2.h.FROM_DEPENDENCIES);
        ym2.g g13 = ym2.g.g("<" + moduleName + '>');
        Intrinsics.checkNotNullExpressionValue(g13, "special(...)");
        dm2.i0 moduleDescriptor = new dm2.i0(g13, storageManager, kVar, 56);
        xl2.j jVar = new xl2.j(0, kVar, moduleDescriptor);
        on2.t tVar = storageManager.f96786a;
        tVar.lock();
        try {
            jVar.invoke();
            tVar.unlock();
            Intrinsics.checkNotNullParameter(moduleDescriptor, "moduleDescriptor");
            v4 computation = new v4((Object) moduleDescriptor, true, 3);
            Intrinsics.checkNotNullParameter(computation, "computation");
            kVar.f142134f = computation;
            rm2.r deserializedDescriptorResolver = new rm2.r();
            lm2.g singleModuleClassResolver = new lm2.g();
            com.google.firebase.messaging.q notFoundClasses = new com.google.firebase.messaging.q(storageManager, moduleDescriptor);
            d2 d2Var2 = d2Var;
            rm2.t packagePartProvider = rm2.t.f108790d;
            Intrinsics.checkNotNullParameter(javaClassFinder, "javaClassFinder");
            Intrinsics.checkNotNullParameter(moduleDescriptor, "module");
            ConcurrentHashMap concurrentHashMap2 = concurrentHashMap;
            Intrinsics.checkNotNullParameter(storageManager, "storageManager");
            Intrinsics.checkNotNullParameter(notFoundClasses, "notFoundClasses");
            Intrinsics.checkNotNullParameter(kotlinClassFinder, "reflectKotlinClassFinder");
            Intrinsics.checkNotNullParameter(deserializedDescriptorResolver, "deserializedDescriptorResolver");
            Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
            Intrinsics.checkNotNullParameter(javaSourceElementFactory, "javaSourceElementFactory");
            Intrinsics.checkNotNullParameter(singleModuleClassResolver, "singleModuleClassResolver");
            Intrinsics.checkNotNullParameter(packagePartProvider, "packagePartProvider");
            re2.h DO_NOTHING = jm2.m.Eo;
            Intrinsics.checkNotNullExpressionValue(DO_NOTHING, "DO_NOTHING");
            re2.f javaResolverCache = jm2.j.Do;
            Intrinsics.checkNotNullExpressionValue(javaResolverCache, "EMPTY");
            jm2.h hVar = jm2.h.f77060a;
            kotlin.collections.q0 q0Var = kotlin.collections.q0.f80391a;
            hn2.a aVar = new hn2.a(storageManager, q0Var);
            am2.z0 z0Var = am2.z0.f15606a;
            hm2.c cVar = hm2.c.f69586a;
            xl2.p pVar = new xl2.p(moduleDescriptor, notFoundClasses);
            im2.z javaTypeEnhancementState = im2.z.f72793c;
            Intrinsics.checkNotNullParameter(javaTypeEnhancementState, "javaTypeEnhancementState");
            im2.d dVar = new im2.d(javaTypeEnhancementState);
            lm2.b bVar = lm2.b.f83955a;
            b20.c cVar2 = new b20.c(new b20.c());
            im2.r rVar = im2.r.f72764a;
            qn2.n.f104513b.getClass();
            qn2.o kotlinTypeChecker = qn2.m.f104512b;
            lm2.e packageFragmentProvider = new lm2.e(new lm2.a(storageManager, javaClassFinder, kotlinClassFinder, deserializedDescriptorResolver, DO_NOTHING, errorReporter, hVar, aVar, javaSourceElementFactory, singleModuleClassResolver, packagePartProvider, z0Var, cVar, moduleDescriptor, pVar, dVar, cVar2, rVar, bVar, kotlinTypeChecker, javaTypeEnhancementState, new rm2.t()));
            xm2.g jvmMetadataVersion = xm2.g.f135403g;
            Intrinsics.checkNotNullParameter(moduleDescriptor, "module");
            Intrinsics.checkNotNullParameter(storageManager, "storageManager");
            Intrinsics.checkNotNullParameter(notFoundClasses, "notFoundClasses");
            Intrinsics.checkNotNullParameter(packageFragmentProvider, "lazyJavaPackageFragmentProvider");
            Intrinsics.checkNotNullParameter(kotlinClassFinder, "reflectKotlinClassFinder");
            Intrinsics.checkNotNullParameter(deserializedDescriptorResolver, "deserializedDescriptorResolver");
            Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
            Intrinsics.checkNotNullParameter(jvmMetadataVersion, "jvmMetadataVersion");
            rm2.s sVar = new rm2.s(kotlinClassFinder, deserializedDescriptorResolver);
            Intrinsics.checkNotNullParameter(moduleDescriptor, "module");
            Intrinsics.checkNotNullParameter(notFoundClasses, "notFoundClasses");
            Intrinsics.checkNotNullParameter(storageManager, "storageManager");
            Intrinsics.checkNotNullParameter(kotlinClassFinder, "kotlinClassFinder");
            Intrinsics.checkNotNullParameter(jvmMetadataVersion, "jvmMetadataVersion");
            rm2.o oVar = new rm2.o(moduleDescriptor, notFoundClasses, storageManager, kotlinClassFinder);
            Intrinsics.checkNotNullParameter(jvmMetadataVersion, "<set-?>");
            oVar.f108767f = jvmMetadataVersion;
            ln2.p deserializationConfiguration = ln2.p.f84127b;
            rm2.p deserializationComponentsForJava = new rm2.p(storageManager, moduleDescriptor, sVar, oVar, packageFragmentProvider, notFoundClasses, kotlinTypeChecker, new i2.a2(kotlin.collections.e0.b(pn2.q.f100831a), 11));
            Intrinsics.checkNotNullParameter(deserializationComponentsForJava, "components");
            ln2.o oVar2 = deserializationComponentsForJava.f108779a;
            Intrinsics.checkNotNullParameter(oVar2, "<set-?>");
            deserializedDescriptorResolver.f108785a = oVar2;
            Intrinsics.checkNotNullExpressionValue(javaResolverCache, "EMPTY");
            Intrinsics.checkNotNullParameter(packageFragmentProvider, "packageFragmentProvider");
            Intrinsics.checkNotNullParameter(javaResolverCache, "javaResolverCache");
            tb.e eVar = new tb.e();
            eVar.f116963a = packageFragmentProvider;
            eVar.f116964b = javaResolverCache;
            Intrinsics.checkNotNullParameter(eVar, "<set-?>");
            singleModuleClassResolver.f83968a = eVar;
            zl2.r additionalClassPartsProvider = kVar.L();
            zl2.r platformDependentDeclarationFilter = kVar.L();
            hn2.a samConversionResolver = new hn2.a(storageManager, q0Var);
            Intrinsics.checkNotNullParameter(storageManager, "storageManager");
            Intrinsics.checkNotNullParameter(finder, "finder");
            Intrinsics.checkNotNullParameter(moduleDescriptor, "moduleDescriptor");
            Intrinsics.checkNotNullParameter(notFoundClasses, "notFoundClasses");
            Intrinsics.checkNotNullParameter(additionalClassPartsProvider, "additionalClassPartsProvider");
            Intrinsics.checkNotNullParameter(platformDependentDeclarationFilter, "platformDependentDeclarationFilter");
            Intrinsics.checkNotNullParameter(deserializationConfiguration, "deserializationConfiguration");
            Intrinsics.checkNotNullParameter(kotlinTypeChecker, "kotlinTypeChecker");
            Intrinsics.checkNotNullParameter(samConversionResolver, "samConversionResolver");
            zl2.t tVar2 = new zl2.t(storageManager, finder, moduleDescriptor);
            ln2.r rVar2 = new ln2.r(tVar2);
            mn2.a aVar2 = mn2.a.f87796q;
            ln2.e eVar2 = new ln2.e(moduleDescriptor, notFoundClasses, aVar2);
            Intrinsics.checkNotNullExpressionValue(ln2.u.f84139a, "DO_NOTHING");
            ln2.o oVar3 = new ln2.o(storageManager, moduleDescriptor, rVar2, eVar2, tVar2, kotlin.collections.f0.j(new yl2.a(storageManager, moduleDescriptor), new zl2.g(storageManager, moduleDescriptor)), notFoundClasses, additionalClassPartsProvider, platformDependentDeclarationFilter, aVar2.f80276a, kotlinTypeChecker, samConversionResolver, ln2.x.f84146b, 262144);
            Intrinsics.checkNotNullParameter(oVar3, "<set-?>");
            tVar2.f84057d = oVar3;
            moduleDescriptor.o0(moduleDescriptor);
            dm2.n providerForModuleContent = new dm2.n(kotlin.collections.f0.j((lm2.e) eVar.f116963a, tVar2), "CompositeProvider@RuntimeModuleData for " + moduleDescriptor);
            Intrinsics.checkNotNullParameter(providerForModuleContent, "providerForModuleContent");
            moduleDescriptor.f55436h = providerForModuleContent;
            Intrinsics.checkNotNullParameter(deserializationComponentsForJava, "deserializationComponentsForJava");
            Intrinsics.checkNotNullParameter(deserializedDescriptorResolver, "deserializedDescriptorResolver");
            fm2.g gVar2 = new fm2.g(oVar2, new x92.b(deserializedDescriptorResolver, kotlinClassFinder));
            while (true) {
                d2 d2Var3 = d2Var2;
                ConcurrentHashMap concurrentHashMap3 = concurrentHashMap2;
                WeakReference weakReference2 = (WeakReference) concurrentHashMap3.putIfAbsent(d2Var3, new WeakReference(gVar2));
                if (weakReference2 == null) {
                    return gVar2;
                }
                fm2.g gVar3 = (fm2.g) weakReference2.get();
                if (gVar3 != null) {
                    return gVar3;
                }
                concurrentHashMap3.remove(d2Var3, weakReference2);
                d2Var2 = d2Var3;
                concurrentHashMap2 = concurrentHashMap3;
            }
        } finally {
        }
    }
}
