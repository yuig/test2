package rm2;

import i2.a2;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final ln2.o f108779a;

    public p(on2.q storageManager, dm2.i0 moduleDescriptor, s classDataFinder, o annotationAndConstantLoader, lm2.e packageFragmentProvider, com.google.firebase.messaging.q notFoundClasses, qn2.o kotlinTypeChecker, a2 typeAttributeTranslators) {
        cm2.e L;
        cm2.b L2;
        ln2.p configuration = ln2.p.f84127b;
        fm2.f errorReporter = fm2.f.f62581b;
        hm2.c lookupTracker = hm2.c.f69586a;
        ln2.p contractDeserializer = ln2.m.f84106a;
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(moduleDescriptor, "moduleDescriptor");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(classDataFinder, "classDataFinder");
        Intrinsics.checkNotNullParameter(annotationAndConstantLoader, "annotationAndConstantLoader");
        Intrinsics.checkNotNullParameter(packageFragmentProvider, "packageFragmentProvider");
        Intrinsics.checkNotNullParameter(notFoundClasses, "notFoundClasses");
        Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
        Intrinsics.checkNotNullParameter(lookupTracker, "lookupTracker");
        Intrinsics.checkNotNullParameter(contractDeserializer, "contractDeserializer");
        Intrinsics.checkNotNullParameter(kotlinTypeChecker, "kotlinTypeChecker");
        Intrinsics.checkNotNullParameter(typeAttributeTranslators, "typeAttributeTranslators");
        xl2.l lVar = moduleDescriptor.f55432d;
        zl2.k kVar = lVar instanceof zl2.k ? (zl2.k) lVar : null;
        t tVar = t.f108788b;
        q0 q0Var = q0.f80391a;
        this.f108779a = new ln2.o(storageManager, moduleDescriptor, classDataFinder, annotationAndConstantLoader, packageFragmentProvider, errorReporter, tVar, q0Var, notFoundClasses, (kVar == null || (L2 = kVar.L()) == null) ? cm2.a.f28031a : L2, (kVar == null || (L = kVar.L()) == null) ? cm2.d.f28033a : L, xm2.j.f135411a, kotlinTypeChecker, new hn2.a(storageManager, q0Var), typeAttributeTranslators.f71073a, ln2.x.f84146b);
    }
}
