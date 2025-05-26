package rn2;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import org.chromium.net.y;
import pn2.b1;
import t3.s1;
import xk2.v;

/* loaded from: classes2.dex */
public final class k implements b1 {

    /* renamed from: a, reason: collision with root package name */
    public final l f108924a;

    /* renamed from: b, reason: collision with root package name */
    public final String[] f108925b;

    /* renamed from: c, reason: collision with root package name */
    public final String f108926c;

    public k(l kind, String... formatParams) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(formatParams, "formatParams");
        this.f108924a = kind;
        this.f108925b = formatParams;
        String debugText = b.ERROR_TYPE.getDebugText();
        String debugMessage = kind.getDebugMessage();
        Object[] copyOf = Arrays.copyOf(formatParams, formatParams.length);
        this.f108926c = s1.d(new Object[]{s1.d(copyOf, copyOf.length, debugMessage, "format(...)")}, 1, debugText, "format(...)");
    }

    @Override // pn2.b1
    public final am2.j b() {
        m.f108927a.getClass();
        return m.f108929c;
    }

    @Override // pn2.b1
    public final Collection c() {
        return q0.f80391a;
    }

    @Override // pn2.b1
    public final boolean d() {
        return false;
    }

    @Override // pn2.b1
    public final xl2.l f() {
        v vVar = xl2.g.f135268f;
        return y.Q();
    }

    @Override // pn2.b1
    public final List getParameters() {
        return q0.f80391a;
    }

    public final String toString() {
        return this.f108926c;
    }
}
