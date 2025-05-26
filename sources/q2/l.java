package q2;

import i2.b0;
import i2.z1;
import i2.z3;
import n2.r;

/* loaded from: classes.dex */
public final class l extends n2.d implements z1 {

    /* renamed from: g */
    public static final l f102116g = new l(r.f88954e, 0);

    @Override // n2.d, kotlin.collections.m, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof b0) {
            return super.containsKey((b0) obj);
        }
        return false;
    }

    @Override // kotlin.collections.m, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof z3) {
            return super.containsValue((z3) obj);
        }
        return false;
    }

    @Override // n2.d, kotlin.collections.m, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof b0) {
            return (z3) super.get((b0) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof b0) ? obj2 : (z3) super.getOrDefault((b0) obj, (z3) obj2);
    }
}
