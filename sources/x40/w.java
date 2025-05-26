package x40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class w implements pc.j0 {

    /* renamed from: e, reason: collision with root package name */
    public static final g40.a f133563e = new g40.a(27, 0);

    /* renamed from: a, reason: collision with root package name */
    public final String f133564a;

    /* renamed from: b, reason: collision with root package name */
    public final String f133565b;

    /* renamed from: c, reason: collision with root package name */
    public final String f133566c;

    /* renamed from: d, reason: collision with root package name */
    public final pc.r0 f133567d;

    public w(String conversationId, String message, String source, pc.r0 clientTrackingParams) {
        Intrinsics.checkNotNullParameter(conversationId, "conversationId");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(clientTrackingParams, "clientTrackingParams");
        this.f133564a = conversationId;
        this.f133565b = message;
        this.f133566c = source;
        this.f133567d = clientTrackingParams;
    }

    @Override // pc.o0
    public final String a() {
        return "cd6492f2baf45eede725c1e7a3f86d9eefe8ae491d647b5c775b977768390cc7";
    }

    @Override // pc.o0
    public final pc.a b() {
        return pc.c.c(y40.t.f137488a);
    }

    @Override // pc.o0
    public final String c() {
        return f133563e.a();
    }

    @Override // pc.o0
    public final pc.m d() {
        pc.m0 type = c50.l2.f26125a.n();
        Intrinsics.checkNotNullParameter("data", "name");
        Intrinsics.checkNotNullParameter(type, "type");
        kotlin.collections.q0 q0Var = kotlin.collections.q0.f80391a;
        List list = b50.c.f21795a;
        List selections = b50.c.f21799e;
        Intrinsics.checkNotNullParameter(selections, "selections");
        return new pc.m("data", type, null, q0Var, q0Var, selections);
    }

    @Override // pc.o0
    public final void e(tc.g writer, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        lf.a.m(writer, customScalarAdapters, this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return Intrinsics.d(this.f133564a, wVar.f133564a) && Intrinsics.d(this.f133565b, wVar.f133565b) && Intrinsics.d(this.f133566c, wVar.f133566c) && Intrinsics.d(this.f133567d, wVar.f133567d);
    }

    public final int hashCode() {
        return this.f133567d.hashCode() + a.cb.d(this.f133566c, a.cb.d(this.f133565b, this.f133564a.hashCode() * 31, 31), 31);
    }

    @Override // pc.o0
    public final String name() {
        return "AddConversationMessageMutation";
    }

    public final String toString() {
        return "AddConversationMessageMutation(conversationId=" + this.f133564a + ", message=" + this.f133565b + ", source=" + this.f133566c + ", clientTrackingParams=" + this.f133567d + ")";
    }
}
