package pc;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class v implements c0 {

    /* renamed from: d */
    public static final m60.f0 f99606d = new m60.f0();

    /* renamed from: e */
    public static final v f99607e;

    /* renamed from: b */
    public final ae.s f99608b;

    /* renamed from: c */
    public final Map f99609c;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Boolean bool = Boolean.TRUE;
        f99607e = new v(linkedHashMap, new ae.s(null, 0 == true ? 1 : 0, Intrinsics.d(null, bool), 0));
        new LinkedHashMap();
        Intrinsics.d(null, bool);
    }

    public v(LinkedHashMap linkedHashMap, ae.s sVar) {
        this.f99608b = sVar;
        this.f99609c = linkedHashMap;
    }

    @Override // pc.f0
    public final c0 a(d0 d0Var) {
        return tb.f.M(this, d0Var);
    }

    @Override // pc.f0
    public final f0 b(d0 d0Var) {
        return tb.f.W(this, d0Var);
    }

    @Override // pc.f0
    public final f0 c(f0 f0Var) {
        return tb.f.Z(this, f0Var);
    }

    @Override // pc.f0
    public final Object d(Object obj) {
        return tb.f.K(this, obj);
    }

    @Override // pc.c0
    public final m60.f0 getKey() {
        return f99606d;
    }
}
