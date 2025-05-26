package qm;

import com.google.gson.reflect.TypeToken;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class j implements nm.j0 {

    /* renamed from: c, reason: collision with root package name */
    public static final i f104167c;

    /* renamed from: d, reason: collision with root package name */
    public static final i f104168d;

    /* renamed from: a, reason: collision with root package name */
    public final ae.s f104169a;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f104170b = new ConcurrentHashMap();

    static {
        int i13 = 0;
        f104167c = new i(i13);
        f104168d = new i(i13);
    }

    public j(ae.s sVar) {
        this.f104169a = sVar;
    }

    @Override // nm.j0
    public final nm.i0 a(nm.o oVar, TypeToken typeToken) {
        om.a aVar = (om.a) typeToken.f33846a.getAnnotation(om.a.class);
        if (aVar == null) {
            return null;
        }
        return b(this.f104169a, oVar, typeToken, aVar, true);
    }

    public final nm.i0 b(ae.s sVar, nm.o oVar, TypeToken typeToken, om.a aVar, boolean z13) {
        nm.i0 e0Var;
        Object u13 = sVar.f(new TypeToken(aVar.value())).u();
        boolean nullSafe = aVar.nullSafe();
        if (u13 instanceof nm.i0) {
            e0Var = (nm.i0) u13;
        } else if (u13 instanceof nm.j0) {
            nm.j0 j0Var = (nm.j0) u13;
            if (z13) {
                nm.j0 j0Var2 = (nm.j0) this.f104170b.putIfAbsent(typeToken.f33846a, j0Var);
                if (j0Var2 != null) {
                    j0Var = j0Var2;
                }
            }
            e0Var = j0Var.a(oVar, typeToken);
        } else {
            boolean z14 = u13 instanceof nm.w;
            if (!z14 && !(u13 instanceof nm.r)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + u13.getClass().getName() + " as a @JsonAdapter for " + pm.d.j(typeToken.f33847b) + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            e0Var = new e0(z14 ? (nm.w) u13 : null, u13 instanceof nm.r ? (nm.r) u13 : null, oVar, typeToken, z13 ? f104167c : f104168d, nullSafe);
            nullSafe = false;
        }
        return (e0Var == null || !nullSafe) ? e0Var : e0Var.b();
    }
}
