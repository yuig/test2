package r72;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class q0 extends w0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f106620a;

    /* renamed from: b, reason: collision with root package name */
    public final int f106621b;

    /* renamed from: c, reason: collision with root package name */
    public final int f106622c;

    /* renamed from: d, reason: collision with root package name */
    public final List f106623d;

    /* renamed from: e, reason: collision with root package name */
    public final int f106624e;

    public q0(String key, int i13, int i14, List options) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(options, "options");
        this.f106620a = key;
        this.f106621b = i13;
        this.f106622c = i14;
        this.f106623d = options;
        this.f106624e = options.indexOf(Integer.valueOf(i13));
    }

    public static q0 d(q0 q0Var, int i13) {
        String key = q0Var.f106620a;
        int i14 = q0Var.f106622c;
        List options = q0Var.f106623d;
        q0Var.getClass();
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(options, "options");
        return new q0(key, i13, i14, options);
    }

    @Override // r72.w0
    public final Object a() {
        return Integer.valueOf(this.f106622c);
    }

    @Override // r72.w0
    public final String b() {
        return this.f106620a;
    }

    @Override // r72.w0
    public final Object c() {
        return Integer.valueOf(this.f106621b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return Intrinsics.d(this.f106620a, q0Var.f106620a) && this.f106621b == q0Var.f106621b && this.f106622c == q0Var.f106622c && Intrinsics.d(this.f106623d, q0Var.f106623d);
    }

    public final int hashCode() {
        return this.f106623d.hashCode() + ep.b.b(this.f106622c, ep.b.b(this.f106621b, this.f106620a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("IntOptionsSetting(key=");
        sb3.append(this.f106620a);
        sb3.append(", value=");
        sb3.append(this.f106621b);
        sb3.append(", defaultValue=");
        sb3.append(this.f106622c);
        sb3.append(", options=");
        return a.c.j(sb3, this.f106623d, ")");
    }
}
