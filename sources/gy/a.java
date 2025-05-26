package gy;

import ey.u1;
import h32.a4;
import h32.d4;
import kotlin.jvm.internal.Intrinsics;
import s92.o;

/* loaded from: classes.dex */
public final class a extends u1 {

    /* renamed from: c, reason: collision with root package name */
    public final o f66309c;

    /* renamed from: d, reason: collision with root package name */
    public final String f66310d;

    /* renamed from: e, reason: collision with root package name */
    public final d4 f66311e;

    /* renamed from: f, reason: collision with root package name */
    public final a4 f66312f;

    public a(a4 a4Var, d4 viewType, o pwtResult, String method) {
        Intrinsics.checkNotNullParameter(pwtResult, "pwtResult");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(viewType, "viewType");
        this.f66309c = pwtResult;
        this.f66310d = method;
        this.f66311e = viewType;
        this.f66312f = a4Var;
    }

    @Override // ey.u1
    public final String e() {
        String str;
        str = b.f66313a;
        return str;
    }
}
