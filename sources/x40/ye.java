package x40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ye implements pc.j0 {

    /* renamed from: g, reason: collision with root package name */
    public static final pc f133742g = new pc(9, 0);

    /* renamed from: a, reason: collision with root package name */
    public final String f133743a;

    /* renamed from: b, reason: collision with root package name */
    public final String f133744b;

    /* renamed from: c, reason: collision with root package name */
    public final pc.r0 f133745c;

    /* renamed from: d, reason: collision with root package name */
    public final pc.r0 f133746d;

    /* renamed from: e, reason: collision with root package name */
    public final pc.r0 f133747e;

    /* renamed from: f, reason: collision with root package name */
    public final pc.r0 f133748f;

    public ye(String deviceId, String eventType, pc.q0 pushId, pc.q0 body, pc.q0 link, pc.q0 displayMode) {
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(pushId, "pushId");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(link, "link");
        Intrinsics.checkNotNullParameter(displayMode, "displayMode");
        this.f133743a = deviceId;
        this.f133744b = eventType;
        this.f133745c = pushId;
        this.f133746d = body;
        this.f133747e = link;
        this.f133748f = displayMode;
    }

    @Override // pc.o0
    public final String a() {
        return "91ae6ef10ae9fd803f62a3620ee58f37404995d5124246cfb6996746fc22bfb0";
    }

    @Override // pc.o0
    public final pc.a b() {
        return pc.c.c(y40.ud.f137544a);
    }

    @Override // pc.o0
    public final String c() {
        return f133742g.a();
    }

    @Override // pc.o0
    public final pc.m d() {
        pc.m0 type = c50.l2.f26125a.n();
        Intrinsics.checkNotNullParameter("data", "name");
        Intrinsics.checkNotNullParameter(type, "type");
        kotlin.collections.q0 q0Var = kotlin.collections.q0.f80391a;
        List list = b50.a0.f21784a;
        List selections = b50.a0.f21786c;
        Intrinsics.checkNotNullParameter(selections, "selections");
        return new pc.m("data", type, null, q0Var, q0Var, selections);
    }

    @Override // pc.o0
    public final void e(tc.g writer, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        rl2.g0.k0(writer, customScalarAdapters, this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ye)) {
            return false;
        }
        ye yeVar = (ye) obj;
        return Intrinsics.d(this.f133743a, yeVar.f133743a) && Intrinsics.d(this.f133744b, yeVar.f133744b) && Intrinsics.d(this.f133745c, yeVar.f133745c) && Intrinsics.d(this.f133746d, yeVar.f133746d) && Intrinsics.d(this.f133747e, yeVar.f133747e) && Intrinsics.d(this.f133748f, yeVar.f133748f);
    }

    public final int hashCode() {
        return this.f133748f.hashCode() + pk2.f.a(this.f133747e, pk2.f.a(this.f133746d, pk2.f.a(this.f133745c, a.cb.d(this.f133744b, this.f133743a.hashCode() * 31, 31), 31), 31), 31);
    }

    @Override // pc.o0
    public final String name() {
        return "LogPushNotificationMutation";
    }

    public final String toString() {
        return "LogPushNotificationMutation(deviceId=" + this.f133743a + ", eventType=" + this.f133744b + ", pushId=" + this.f133745c + ", body=" + this.f133746d + ", link=" + this.f133747e + ", displayMode=" + this.f133748f + ")";
    }
}
