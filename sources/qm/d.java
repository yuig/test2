package qm;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class d implements nm.j0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f104138a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f104139b;

    public /* synthetic */ d(Object obj, int i13) {
        this.f104138a = i13;
        this.f104139b = obj;
    }

    @Override // nm.j0
    public final nm.i0 a(nm.o oVar, TypeToken typeToken) {
        Class cls;
        int i13 = this.f104138a;
        cls = Object.class;
        Object obj = this.f104139b;
        switch (i13) {
            case 0:
                Type type = typeToken.f33847b;
                Class cls2 = typeToken.f33846a;
                if (!Collection.class.isAssignableFrom(cls2)) {
                    return null;
                }
                if (type instanceof WildcardType) {
                    type = ((WildcardType) type).getUpperBounds()[0];
                }
                pk.a0.A(Collection.class.isAssignableFrom(cls2));
                Type g13 = pm.d.g(type, cls2, pm.d.e(type, cls2, Collection.class), new HashMap());
                cls = g13 instanceof ParameterizedType ? ((ParameterizedType) g13).getActualTypeArguments()[0] : Object.class;
                return new c(oVar, cls, oVar.g(new TypeToken(cls)), ((ae.s) obj).f(typeToken));
            case 1:
                if (typeToken.f33846a == Number.class) {
                    return (s) obj;
                }
                return null;
            default:
                if (typeToken.f33846a == cls) {
                    return new u(oVar, (nm.h0) obj);
                }
                return null;
        }
    }
}
