package gm2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class z extends y implements pm2.q {

    /* renamed from: a, reason: collision with root package name */
    public final Method f65794a;

    public z(Method member) {
        Intrinsics.checkNotNullParameter(member, "member");
        this.f65794a = member;
    }

    @Override // gm2.y
    public final Member b() {
        return this.f65794a;
    }

    public final List f() {
        Method method = this.f65794a;
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        Intrinsics.checkNotNullExpressionValue(genericParameterTypes, "getGenericParameterTypes(...)");
        Annotation[][] parameterAnnotations = method.getParameterAnnotations();
        Intrinsics.checkNotNullExpressionValue(parameterAnnotations, "getParameterAnnotations(...)");
        return d(genericParameterTypes, parameterAnnotations, method.isVarArgs());
    }

    @Override // pm2.q
    public final ArrayList getTypeParameters() {
        TypeVariable<Method>[] typeParameters = this.f65794a.getTypeParameters();
        Intrinsics.checkNotNullExpressionValue(typeParameters, "getTypeParameters(...)");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable<Method> typeVariable : typeParameters) {
            arrayList.add(new e0(typeVariable));
        }
        return arrayList;
    }
}
