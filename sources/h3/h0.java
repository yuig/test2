package h3;

import b3.s0;
import kotlin.collections.q0;

/* loaded from: classes.dex */
public abstract class h0 {

    /* renamed from: a, reason: collision with root package name */
    public static final q0 f66696a = q0.f80391a;

    static {
        int i13 = b3.w.f21391o;
    }

    public static final boolean a(long j13, long j14) {
        return b3.w.h(j13) == b3.w.h(j14) && b3.w.g(j13) == b3.w.g(j14) && b3.w.e(j13) == b3.w.e(j14);
    }

    public static final boolean b(b3.p pVar) {
        if (pVar instanceof b3.p) {
            if (s0.a(pVar.f21346c, 5) || s0.a(pVar.f21346c, 3)) {
                return true;
            }
        } else if (pVar == null) {
            return true;
        }
        return false;
    }
}
