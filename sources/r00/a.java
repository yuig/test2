package r00;

import kh2.s0;
import l32.c;
import l32.f;

/* loaded from: classes3.dex */
public final class a extends s0 {
    @Override // pq2.p
    public final Object a(Object obj) {
        return obj instanceof c ? String.valueOf(((c) obj).getValue()) : obj instanceof f ? String.valueOf(((f) obj).getValue()) : super.z(obj);
    }
}
