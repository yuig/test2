package pn2;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class p0 {

    /* renamed from: a, reason: collision with root package name */
    public final p0 f100827a;

    /* renamed from: b, reason: collision with root package name */
    public final am2.b1 f100828b;

    /* renamed from: c, reason: collision with root package name */
    public final List f100829c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f100830d;

    public p0(p0 p0Var, am2.b1 b1Var, List list, Map map) {
        this.f100827a = p0Var;
        this.f100828b = b1Var;
        this.f100829c = list;
        this.f100830d = map;
    }

    public final boolean a(am2.b1 descriptor) {
        p0 p0Var;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return Intrinsics.d(this.f100828b, descriptor) || ((p0Var = this.f100827a) != null && p0Var.a(descriptor));
    }
}
