package ao2;

/* loaded from: classes2.dex */
public abstract class o0 {

    /* renamed from: a, reason: collision with root package name */
    public static final r0 f20186a;

    static {
        String str;
        r0 r0Var;
        int i13 = ho2.x.f69791a;
        try {
            str = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null || !Boolean.parseBoolean(str)) {
            r0Var = n0.f20177j;
        } else {
            ko2.f fVar = v0.f20219a;
            kotlin.coroutines.f fVar2 = ho2.q.f69782a;
            bo2.e eVar = ((bo2.e) fVar2).f23612f;
            r0Var = !(fVar2 instanceof r0) ? n0.f20177j : (r0) fVar2;
        }
        f20186a = r0Var;
    }
}
