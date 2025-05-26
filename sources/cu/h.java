package cu;

import kotlin.jvm.internal.v;

/* loaded from: classes3.dex */
public final /* synthetic */ class h extends v {
    @Override // rl2.r
    public final Object get() {
        return Integer.valueOf(((i) this.receiver).j());
    }

    @Override // rl2.j
    public final void set(Object obj) {
        ((i) this.receiver).C(((Number) obj).intValue());
    }
}
