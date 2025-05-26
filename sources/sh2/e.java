package sh2;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ui2.p;
import ui2.q;

/* loaded from: classes4.dex */
public final class e implements q {

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f112946a;

    /* renamed from: b, reason: collision with root package name */
    public final m f112947b;

    public e(String instrumentationScopeName, f tracerSupplier) {
        Intrinsics.checkNotNullParameter(instrumentationScopeName, "instrumentationScopeName");
        Intrinsics.checkNotNullParameter(tracerSupplier, "tracerSupplier");
        this.f112946a = tracerSupplier;
        this.f112947b = new m(instrumentationScopeName);
    }

    @Override // ui2.q
    public final q a(String instrumentationScopeVersion) {
        Intrinsics.checkNotNullParameter(instrumentationScopeVersion, "instrumentationScopeVersion");
        this.f112947b.f112993b = instrumentationScopeVersion;
        return this;
    }

    @Override // ui2.q
    public final q b(String schemaUrl) {
        Intrinsics.checkNotNullParameter(schemaUrl, "schemaUrl");
        this.f112947b.f112994c = schemaUrl;
        return this;
    }

    @Override // ui2.q
    public final p build() {
        return (p) this.f112946a.invoke(this.f112947b);
    }
}
