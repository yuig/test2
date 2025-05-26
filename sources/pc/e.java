package pc;

import java.util.Collection;
import java.util.List;
import java.util.UUID;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e implements h0 {

    /* renamed from: a, reason: collision with root package name */
    public final o0 f99531a;

    /* renamed from: b, reason: collision with root package name */
    public UUID f99532b;

    /* renamed from: c, reason: collision with root package name */
    public f0 f99533c;

    /* renamed from: d, reason: collision with root package name */
    public qc.g f99534d;

    /* renamed from: e, reason: collision with root package name */
    public List f99535e;

    /* renamed from: f, reason: collision with root package name */
    public Boolean f99536f;

    /* renamed from: g, reason: collision with root package name */
    public Boolean f99537g;

    /* renamed from: h, reason: collision with root package name */
    public Boolean f99538h;

    /* renamed from: i, reason: collision with root package name */
    public Boolean f99539i;

    public e(o0 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        this.f99531a = operation;
        UUID randomUUID = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(randomUUID, "randomUUID()");
        this.f99532b = randomUUID;
        this.f99533c = y.f99612b;
    }

    @Override // pc.h0
    public final /* bridge */ /* synthetic */ Object a(c0 c0Var) {
        b(c0Var);
        return this;
    }

    public final void b(f0 executionContext) {
        Intrinsics.checkNotNullParameter(executionContext, "executionContext");
        f0 c13 = this.f99533c.c(executionContext);
        Intrinsics.checkNotNullParameter(c13, "<set-?>");
        this.f99533c = c13;
    }

    public final void c(String name, String value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        Collection collection = this.f99535e;
        if (collection == null) {
            collection = kotlin.collections.q0.f80391a;
        }
        this.f99535e = CollectionsKt.m0(new qc.f(name, value), collection);
    }

    public final f d() {
        return new f(this.f99531a, this.f99532b, this.f99533c, this.f99534d, this.f99535e, this.f99536f, this.f99537g, this.f99538h, this.f99539i);
    }
}
