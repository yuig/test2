package xl2;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashMap;
import kotlin.jvm.functions.Function0;
import pn2.h0;
import rm2.i0;

/* loaded from: classes2.dex */
public final class h implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f135269a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f135270b;

    public /* synthetic */ h(Object obj, int i13) {
        this.f135269a = i13;
        this.f135270b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f135269a;
        Object obj = this.f135270b;
        switch (i13) {
            case 0:
                l lVar = (l) obj;
                return Arrays.asList(lVar.k().H(r.f135332l), lVar.k().H(r.f135334n), lVar.k().H(r.f135335o), lVar.k().H(r.f135333m));
            case 1:
                EnumMap enumMap = new EnumMap(o.class);
                HashMap hashMap = new HashMap();
                HashMap hashMap2 = new HashMap();
                for (o oVar : o.values()) {
                    l lVar2 = (l) obj;
                    String b13 = oVar.getTypeName().b();
                    if (b13 == null) {
                        lVar2.getClass();
                        l.a(47);
                        throw null;
                    }
                    h0 j13 = lVar2.j(b13).j();
                    if (j13 == null) {
                        l.a(48);
                        throw null;
                    }
                    String b14 = oVar.getArrayTypeName().b();
                    if (b14 == null) {
                        l.a(47);
                        throw null;
                    }
                    h0 j14 = lVar2.j(b14).j();
                    if (j14 == null) {
                        l.a(48);
                        throw null;
                    }
                    enumMap.put((EnumMap) oVar, (o) j14);
                    hashMap.put(j13, j14);
                    hashMap2.put(j14, j13);
                }
                return new k(enumMap, hashMap, hashMap2);
            default:
                StringBuilder sb3 = new StringBuilder("Scope for type parameter ");
                j jVar = (j) obj;
                sb3.append(((ym2.g) jVar.f135274b).b());
                return i0.d(((dm2.j) jVar.f135275c).getUpperBounds(), sb3.toString());
        }
    }
}
