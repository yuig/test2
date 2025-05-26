package g30;

import c50.l2;
import java.util.List;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import pc.j0;
import pc.m0;
import pc.v;
import zy.b0;

/* loaded from: classes.dex */
public final class g implements j0 {

    /* renamed from: d, reason: collision with root package name */
    public static final b0 f63420d = new b0(10, 0);

    /* renamed from: a, reason: collision with root package name */
    public final String f63421a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f63422b;

    /* renamed from: c, reason: collision with root package name */
    public final String f63423c;

    public g(String token, String osVersion, boolean z13) {
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(osVersion, "osVersion");
        this.f63421a = token;
        this.f63422b = z13;
        this.f63423c = osVersion;
    }

    @Override // pc.o0
    public final String a() {
        return "74941ee50071718b477b77d5464dd9fa6a6fb0a7325fc728631330713a143f62";
    }

    @Override // pc.o0
    public final pc.a b() {
        return pc.c.c(h30.f.f66782a);
    }

    @Override // pc.o0
    public final String c() {
        return f63420d.b();
    }

    @Override // pc.o0
    public final pc.m d() {
        m0 type = l2.f26125a.n();
        Intrinsics.checkNotNullParameter("data", "name");
        Intrinsics.checkNotNullParameter(type, "type");
        q0 q0Var = q0.f80391a;
        List selections = i30.a.a();
        Intrinsics.checkNotNullParameter(selections, "selections");
        return new pc.m("data", type, null, q0Var, q0Var, selections);
    }

    @Override // pc.o0
    public final void e(tc.g writer, v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(this, "value");
        writer.M0("token");
        a10.e eVar = pc.c.f99520a;
        eVar.d(writer, customScalarAdapters, this.f63421a);
        writer.M0("allowNotifications");
        pc.c.f99522c.d(writer, customScalarAdapters, Boolean.valueOf(this.f63422b));
        writer.M0("osVersion");
        eVar.d(writer, customScalarAdapters, this.f63423c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.d(this.f63421a, gVar.f63421a) && this.f63422b == gVar.f63422b && Intrinsics.d(this.f63423c, gVar.f63423c);
    }

    public final int hashCode() {
        return this.f63423c.hashCode() + ep.b.e(this.f63422b, this.f63421a.hashCode() * 31, 31);
    }

    @Override // pc.o0
    public final String name() {
        return "AddDeviceTokenMutation";
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("AddDeviceTokenMutation(token=");
        sb3.append(this.f63421a);
        sb3.append(", allowNotifications=");
        sb3.append(this.f63422b);
        sb3.append(", osVersion=");
        return a.a.p(sb3, this.f63423c, ")");
    }
}
