package x40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class se implements pc.j0 {

    /* renamed from: d, reason: collision with root package name */
    public static final pc f133269d = new pc(8, 0);

    /* renamed from: a, reason: collision with root package name */
    public final String f133270a;

    /* renamed from: b, reason: collision with root package name */
    public final String f133271b;

    /* renamed from: c, reason: collision with root package name */
    public final String f133272c;

    public se(String screenState, String deviceId, String osVersion) {
        Intrinsics.checkNotNullParameter(screenState, "screenState");
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(osVersion, "osVersion");
        this.f133270a = screenState;
        this.f133271b = deviceId;
        this.f133272c = osVersion;
    }

    @Override // pc.o0
    public final String a() {
        return "b066152a4e0ed7ac9905e23a6b69571c6f6a38eeabe1ff6dd7481513ab3e1bd5";
    }

    @Override // pc.o0
    public final pc.a b() {
        return pc.c.c(y40.pd.f137388a);
    }

    @Override // pc.o0
    public final String c() {
        return f133269d.a();
    }

    @Override // pc.o0
    public final pc.m d() {
        pc.m0 type = c50.l2.f26125a.n();
        Intrinsics.checkNotNullParameter("data", "name");
        Intrinsics.checkNotNullParameter(type, "type");
        kotlin.collections.q0 q0Var = kotlin.collections.q0.f80391a;
        List list = b50.z.f21985a;
        List selections = b50.z.f21987c;
        Intrinsics.checkNotNullParameter(selections, "selections");
        return new pc.m("data", type, null, q0Var, q0Var, selections);
    }

    @Override // pc.o0
    public final void e(tc.g writer, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(this, "value");
        writer.M0("screenState");
        a10.e eVar = pc.c.f99520a;
        eVar.d(writer, customScalarAdapters, this.f133270a);
        writer.M0("deviceId");
        eVar.d(writer, customScalarAdapters, this.f133271b);
        writer.M0("osVersion");
        eVar.d(writer, customScalarAdapters, this.f133272c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof se)) {
            return false;
        }
        se seVar = (se) obj;
        return Intrinsics.d(this.f133270a, seVar.f133270a) && Intrinsics.d(this.f133271b, seVar.f133271b) && Intrinsics.d(this.f133272c, seVar.f133272c);
    }

    public final int hashCode() {
        return this.f133272c.hashCode() + a.cb.d(this.f133271b, this.f133270a.hashCode() * 31, 31);
    }

    @Override // pc.o0
    public final String name() {
        return "LogDeviceScreenStateMutation";
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("LogDeviceScreenStateMutation(screenState=");
        sb3.append(this.f133270a);
        sb3.append(", deviceId=");
        sb3.append(this.f133271b);
        sb3.append(", osVersion=");
        return a.a.p(sb3, this.f133272c, ")");
    }
}
