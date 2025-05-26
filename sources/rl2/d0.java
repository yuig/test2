package rl2;

import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import ul2.s1;

/* loaded from: classes4.dex */
public final class d0 implements TypeVariable, Type {

    /* renamed from: a, reason: collision with root package name */
    public final w f108672a;

    public d0(w typeParameter) {
        Intrinsics.checkNotNullParameter(typeParameter, "typeParameter");
        this.f108672a = typeParameter;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TypeVariable) || !Intrinsics.d(getName(), ((TypeVariable) obj).getName())) {
            return false;
        }
        getGenericDeclaration();
        throw null;
    }

    @Override // java.lang.reflect.TypeVariable
    public final Type[] getBounds() {
        s1 s1Var = (s1) this.f108672a;
        s1Var.getClass();
        u uVar = s1.f122598d[0];
        Object invoke = s1Var.f122600b.invoke();
        Intrinsics.checkNotNullExpressionValue(invoke, "getValue(...)");
        List list = (List) invoke;
        ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(g0.n((v) it.next(), true));
        }
        return (Type[]) arrayList.toArray(new Type[0]);
    }

    @Override // java.lang.reflect.TypeVariable
    public final GenericDeclaration getGenericDeclaration() {
        throw new xk2.o(a.a.j("An operation is not implemented: ", "getGenericDeclaration() is not yet supported for type variables created from KType: " + this.f108672a));
    }

    @Override // java.lang.reflect.TypeVariable
    public final String getName() {
        return ((s1) this.f108672a).c();
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        return getName();
    }

    public final int hashCode() {
        getName().hashCode();
        getGenericDeclaration();
        throw null;
    }

    public final String toString() {
        return getName();
    }
}
