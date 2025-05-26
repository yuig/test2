package n7;

import android.media.metrics.LogSessionId;
import java.util.Objects;

/* loaded from: classes.dex */
public final class q0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f89565a;

    /* renamed from: b, reason: collision with root package name */
    public final p0 f89566b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f89567c;

    static {
        new q0("");
    }

    public q0(String str) {
        p0 p0Var;
        LogSessionId logSessionId;
        this.f89565a = str;
        if (d7.n0.f53866a >= 31) {
            p0Var = new p0();
            logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
            p0Var.f89560a = logSessionId;
        } else {
            p0Var = null;
        }
        this.f89566b = p0Var;
        this.f89567c = new Object();
    }

    public final synchronized LogSessionId a() {
        p0 p0Var;
        p0Var = this.f89566b;
        p0Var.getClass();
        return p0Var.f89560a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return Objects.equals(this.f89565a, q0Var.f89565a) && Objects.equals(this.f89566b, q0Var.f89566b) && Objects.equals(this.f89567c, q0Var.f89567c);
    }

    public final int hashCode() {
        return Objects.hash(this.f89565a, this.f89566b, this.f89567c);
    }
}
