package qm;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* loaded from: classes.dex */
public final class a implements nm.j0 {
    @Override // nm.j0
    public final nm.i0 a(nm.o oVar, TypeToken typeToken) {
        Type type = typeToken.f33847b;
        if (!(type instanceof GenericArrayType) && (!(type instanceof Class) || !((Class) type).isArray())) {
            return null;
        }
        Type d2 = pm.d.d(type);
        return new b(oVar, oVar.g(new TypeToken(d2)), pm.d.f(d2));
    }
}
