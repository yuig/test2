package ads_mobile_sdk;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class jj2 {

    /* renamed from: a, reason: collision with root package name */
    public final ci2 f6843a;

    /* renamed from: b, reason: collision with root package name */
    public final jh2 f6844b;

    /* renamed from: c, reason: collision with root package name */
    public final gj2 f6845c;

    /* renamed from: d, reason: collision with root package name */
    public final long f6846d;

    /* renamed from: e, reason: collision with root package name */
    public final Function0 f6847e;

    public jj2(a.t5 source, ci2 importance, jh2 executionType, gj2 scope, long j13, Function0 function0) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(importance, "importance");
        Intrinsics.checkNotNullParameter(executionType, "executionType");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f6843a = importance;
        this.f6844b = executionType;
        this.f6845c = scope;
        this.f6846d = j13;
        this.f6847e = function0;
    }

    public final ci2 a() {
        return this.f6843a;
    }

    public abstract a.t5 b();

    public final long c() {
        return this.f6846d;
    }

    public /* synthetic */ jj2(a.t5 t5Var, ci2 ci2Var, jh2 jh2Var, gj2 gj2Var, long j13, Function0 function0, int i13) {
        this(t5Var, ci2Var, jh2Var, gj2Var, j13, function0);
    }
}
