package ln2;

import java.util.List;
import java.util.Set;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import lb.p0;

/* loaded from: classes2.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final on2.u f84108a;

    /* renamed from: b, reason: collision with root package name */
    public final am2.d0 f84109b;

    /* renamed from: c, reason: collision with root package name */
    public final q f84110c;

    /* renamed from: d, reason: collision with root package name */
    public final i f84111d;

    /* renamed from: e, reason: collision with root package name */
    public final c f84112e;

    /* renamed from: f, reason: collision with root package name */
    public final am2.j0 f84113f;

    /* renamed from: g, reason: collision with root package name */
    public final u f84114g;

    /* renamed from: h, reason: collision with root package name */
    public final hm2.d f84115h;

    /* renamed from: i, reason: collision with root package name */
    public final v f84116i;

    /* renamed from: j, reason: collision with root package name */
    public final Iterable f84117j;

    /* renamed from: k, reason: collision with root package name */
    public final com.google.firebase.messaging.q f84118k;

    /* renamed from: l, reason: collision with root package name */
    public final n f84119l;

    /* renamed from: m, reason: collision with root package name */
    public final cm2.b f84120m;

    /* renamed from: n, reason: collision with root package name */
    public final cm2.e f84121n;

    /* renamed from: o, reason: collision with root package name */
    public final zm2.k f84122o;

    /* renamed from: p, reason: collision with root package name */
    public final qn2.n f84123p;

    /* renamed from: q, reason: collision with root package name */
    public final List f84124q;

    /* renamed from: r, reason: collision with root package name */
    public final t f84125r;

    /* renamed from: s, reason: collision with root package name */
    public final l f84126s;

    public o(on2.u storageManager, am2.d0 moduleDescriptor, i classDataFinder, c annotationAndConstantLoader, am2.j0 packageFragmentProvider, u errorReporter, v flexibleTypeDeserializer, Iterable fictitiousClassDescriptorFactories, com.google.firebase.messaging.q notFoundClasses, cm2.b additionalClassPartsProvider, cm2.e platformDependentDeclarationFilter, zm2.k extensionRegistryLite, qn2.n kotlinTypeChecker, hn2.a samConversionResolver, List typeAttributeTranslators, t enumEntriesDeserializationSupport) {
        p configuration = p.f84127b;
        p localClassifierTypeSettings = p.f84130e;
        hm2.c lookupTracker = hm2.c.f69586a;
        p contractDeserializer = m.f84106a;
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(moduleDescriptor, "moduleDescriptor");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(classDataFinder, "classDataFinder");
        Intrinsics.checkNotNullParameter(annotationAndConstantLoader, "annotationAndConstantLoader");
        Intrinsics.checkNotNullParameter(packageFragmentProvider, "packageFragmentProvider");
        Intrinsics.checkNotNullParameter(localClassifierTypeSettings, "localClassifierTypeSettings");
        Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
        Intrinsics.checkNotNullParameter(lookupTracker, "lookupTracker");
        Intrinsics.checkNotNullParameter(flexibleTypeDeserializer, "flexibleTypeDeserializer");
        Intrinsics.checkNotNullParameter(fictitiousClassDescriptorFactories, "fictitiousClassDescriptorFactories");
        Intrinsics.checkNotNullParameter(notFoundClasses, "notFoundClasses");
        Intrinsics.checkNotNullParameter(contractDeserializer, "contractDeserializer");
        Intrinsics.checkNotNullParameter(additionalClassPartsProvider, "additionalClassPartsProvider");
        Intrinsics.checkNotNullParameter(platformDependentDeclarationFilter, "platformDependentDeclarationFilter");
        Intrinsics.checkNotNullParameter(extensionRegistryLite, "extensionRegistryLite");
        Intrinsics.checkNotNullParameter(kotlinTypeChecker, "kotlinTypeChecker");
        Intrinsics.checkNotNullParameter(samConversionResolver, "samConversionResolver");
        Intrinsics.checkNotNullParameter(typeAttributeTranslators, "typeAttributeTranslators");
        Intrinsics.checkNotNullParameter(enumEntriesDeserializationSupport, "enumEntriesDeserializationSupport");
        this.f84108a = storageManager;
        this.f84109b = moduleDescriptor;
        this.f84110c = configuration;
        this.f84111d = classDataFinder;
        this.f84112e = annotationAndConstantLoader;
        this.f84113f = packageFragmentProvider;
        this.f84114g = errorReporter;
        this.f84115h = lookupTracker;
        this.f84116i = flexibleTypeDeserializer;
        this.f84117j = fictitiousClassDescriptorFactories;
        this.f84118k = notFoundClasses;
        this.f84119l = contractDeserializer;
        this.f84120m = additionalClassPartsProvider;
        this.f84121n = platformDependentDeclarationFilter;
        this.f84122o = extensionRegistryLite;
        this.f84123p = kotlinTypeChecker;
        this.f84124q = typeAttributeTranslators;
        this.f84125r = enumEntriesDeserializationSupport;
        this.f84126s = new l(this);
    }

    public final p0 a(am2.i0 descriptor, vm2.f nameResolver, vm2.i typeTable, vm2.j versionRequirementTable, vm2.a metadataVersion, nn2.l lVar) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        Intrinsics.checkNotNullParameter(versionRequirementTable, "versionRequirementTable");
        Intrinsics.checkNotNullParameter(metadataVersion, "metadataVersion");
        return new p0(this, nameResolver, descriptor, typeTable, versionRequirementTable, metadataVersion, lVar, null, q0.f80391a);
    }

    public final am2.g b(ym2.b classId) {
        Intrinsics.checkNotNullParameter(classId, "classId");
        Set set = l.f84096c;
        return this.f84126s.a(classId, null);
    }

    public final v c() {
        return this.f84116i;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public o(on2.u r18, am2.d0 r19, ln2.r r20, ln2.e r21, am2.n0 r22, java.lang.Iterable r23, com.google.firebase.messaging.q r24, cm2.b r25, cm2.e r26, zm2.k r27, qn2.o r28, hn2.a r29, ln2.x r30, int r31) {
        /*
            r17 = this;
            ln2.p r6 = ln2.u.f84139a
            ln2.p r7 = ln2.p.f84129d
            r0 = 65536(0x10000, float:9.1835E-41)
            r0 = r31 & r0
            if (r0 == 0) goto L13
            qn2.m r0 = qn2.n.f104513b
            r0.getClass()
            qn2.o r0 = qn2.m.f104512b
            r13 = r0
            goto L15
        L13:
            r13 = r28
        L15:
            pn2.q r0 = pn2.q.f100831a
            java.util.List r15 = kotlin.collections.e0.b(r0)
            r0 = 524288(0x80000, float:7.34684E-40)
            r0 = r31 & r0
            if (r0 == 0) goto L26
            ln2.p r0 = ln2.p.f84128c
            r16 = r0
            goto L28
        L26:
            r16 = r30
        L28:
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            r4 = r21
            r5 = r22
            r8 = r23
            r9 = r24
            r10 = r25
            r11 = r26
            r12 = r27
            r14 = r29
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ln2.o.<init>(on2.u, am2.d0, ln2.r, ln2.e, am2.n0, java.lang.Iterable, com.google.firebase.messaging.q, cm2.b, cm2.e, zm2.k, qn2.o, hn2.a, ln2.x, int):void");
    }
}
