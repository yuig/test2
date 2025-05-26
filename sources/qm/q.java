package qm;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* loaded from: classes.dex */
public final class q implements nm.j0 {

    /* renamed from: a, reason: collision with root package name */
    public final ae.s f104214a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f104215b;

    public q(ae.s sVar, boolean z13) {
        this.f104214a = sVar;
        this.f104215b = z13;
    }

    @Override // nm.j0
    public final nm.i0 a(nm.o oVar, TypeToken typeToken) {
        Type[] actualTypeArguments;
        Type type = typeToken.f33847b;
        Class cls = typeToken.f33846a;
        if (!Map.class.isAssignableFrom(cls)) {
            return null;
        }
        if (type == Properties.class) {
            actualTypeArguments = new Type[]{String.class, String.class};
        } else {
            if (type instanceof WildcardType) {
                type = ((WildcardType) type).getUpperBounds()[0];
            }
            pk.a0.A(Map.class.isAssignableFrom(cls));
            Type g13 = pm.d.g(type, cls, pm.d.e(type, cls, Map.class), new HashMap());
            actualTypeArguments = g13 instanceof ParameterizedType ? ((ParameterizedType) g13).getActualTypeArguments() : new Type[]{Object.class, Object.class};
        }
        Type type2 = actualTypeArguments[0];
        return new p(this, oVar, actualTypeArguments[0], (type2 == Boolean.TYPE || type2 == Boolean.class) ? n1.f104181c : oVar.g(new TypeToken(type2)), actualTypeArguments[1], oVar.g(new TypeToken(actualTypeArguments[1])), this.f104214a.f(typeToken));
    }
}
