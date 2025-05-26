package ln2;

import kotlin.jvm.internal.Intrinsics;
import tm2.n0;

/* loaded from: classes2.dex */
public abstract class s extends dm2.k0 {

    /* renamed from: g, reason: collision with root package name */
    public final vm2.a f84133g;

    /* renamed from: h, reason: collision with root package name */
    public final nn2.l f84134h;

    /* renamed from: i, reason: collision with root package name */
    public final vm2.h f84135i;

    /* renamed from: j, reason: collision with root package name */
    public final b0 f84136j;

    /* renamed from: k, reason: collision with root package name */
    public tm2.g0 f84137k;

    /* renamed from: l, reason: collision with root package name */
    public nn2.r f84138l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(ym2.c fqName, on2.u storageManager, am2.d0 module, tm2.g0 proto, um2.a metadataVersion) {
        super(module, fqName);
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(metadataVersion, "metadataVersion");
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(module, "module");
        this.f84133g = metadataVersion;
        this.f84134h = null;
        n0 n0Var = proto.f118270d;
        Intrinsics.checkNotNullExpressionValue(n0Var, "getStrings(...)");
        tm2.m0 m0Var = proto.f118271e;
        Intrinsics.checkNotNullExpressionValue(m0Var, "getQualifiedNames(...)");
        vm2.h hVar = new vm2.h(n0Var, m0Var);
        this.f84135i = hVar;
        this.f84136j = new b0(proto, hVar, metadataVersion, new e82.l(this, 26));
        this.f84137k = proto;
    }

    public final void u0(o components) {
        Intrinsics.checkNotNullParameter(components, "components");
        tm2.g0 g0Var = this.f84137k;
        if (g0Var == null) {
            throw new IllegalStateException("Repeated call to DeserializedPackageFragmentImpl::initialize".toString());
        }
        this.f84137k = null;
        tm2.e0 e0Var = g0Var.f118272f;
        Intrinsics.checkNotNullExpressionValue(e0Var, "getPackage(...)");
        this.f84138l = new nn2.r(this, e0Var, this.f84135i, this.f84133g, this.f84134h, components, "scope of " + this, new tu1.u(this, 26));
    }

    @Override // am2.i0
    public final in2.n w() {
        nn2.r rVar = this.f84138l;
        if (rVar != null) {
            return rVar;
        }
        Intrinsics.r("_memberScope");
        throw null;
    }
}
