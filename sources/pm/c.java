package pm;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Objects;
import pk.a0;

/* loaded from: classes3.dex */
public final class c implements WildcardType, Serializable {

    /* renamed from: a */
    public final Type f100578a;

    /* renamed from: b */
    public final Type f100579b;

    public c(Type[] typeArr, Type[] typeArr2) {
        a0.A(typeArr2.length <= 1);
        a0.A(typeArr.length == 1);
        if (typeArr2.length != 1) {
            Objects.requireNonNull(typeArr[0]);
            d.b(typeArr[0]);
            this.f100579b = null;
            this.f100578a = d.a(typeArr[0]);
            return;
        }
        Objects.requireNonNull(typeArr2[0]);
        d.b(typeArr2[0]);
        a0.A(typeArr[0] == Object.class);
        this.f100579b = d.a(typeArr2[0]);
        this.f100578a = Object.class;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WildcardType) && d.c(this, (WildcardType) obj);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.f100579b;
        return type != null ? new Type[]{type} : d.f100580a;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return new Type[]{this.f100578a};
    }

    public final int hashCode() {
        Type type = this.f100579b;
        return (type != null ? type.hashCode() + 31 : 1) ^ (this.f100578a.hashCode() + 31);
    }

    public final String toString() {
        Type type = this.f100579b;
        if (type != null) {
            return "? super " + d.j(type);
        }
        Type type2 = this.f100578a;
        if (type2 == Object.class) {
            return "?";
        }
        return "? extends " + d.j(type2);
    }
}
