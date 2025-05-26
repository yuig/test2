package pn2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class o extends b {

    /* renamed from: c, reason: collision with root package name */
    public final am2.g f100824c;

    /* renamed from: d, reason: collision with root package name */
    public final List f100825d;

    /* renamed from: e, reason: collision with root package name */
    public final Collection f100826e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(am2.g gVar, List list, Collection collection, on2.u uVar) {
        super(uVar);
        if (gVar == null) {
            p(0);
            throw null;
        }
        if (list == null) {
            p(1);
            throw null;
        }
        if (collection == null) {
            p(2);
            throw null;
        }
        if (uVar == null) {
            p(3);
            throw null;
        }
        this.f100824c = gVar;
        this.f100825d = Collections.unmodifiableList(new ArrayList(list));
        this.f100826e = Collections.unmodifiableCollection(collection);
    }

    public static /* synthetic */ void p(int i13) {
        String str = (i13 == 4 || i13 == 5 || i13 == 6 || i13 == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i13 == 4 || i13 == 5 || i13 == 6 || i13 == 7) ? 2 : 3];
        switch (i13) {
            case 1:
                objArr[0] = "parameters";
                break;
            case 2:
                objArr[0] = "supertypes";
                break;
            case 3:
                objArr[0] = "storageManager";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
                break;
            default:
                objArr[0] = "classDescriptor";
                break;
        }
        if (i13 == 4) {
            objArr[1] = "getParameters";
        } else if (i13 == 5) {
            objArr[1] = "getDeclarationDescriptor";
        } else if (i13 == 6) {
            objArr[1] = "computeSupertypes";
        } else if (i13 != 7) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
        } else {
            objArr[1] = "getSupertypeLoopChecker";
        }
        if (i13 != 4 && i13 != 5 && i13 != 6 && i13 != 7) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i13 != 4 && i13 != 5 && i13 != 6 && i13 != 7) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // pn2.b1
    public final boolean d() {
        return true;
    }

    @Override // pn2.l
    public final Collection e() {
        Collection collection = this.f100826e;
        if (collection != null) {
            return collection;
        }
        p(6);
        throw null;
    }

    @Override // pn2.b1
    public final List getParameters() {
        List list = this.f100825d;
        if (list != null) {
            return list;
        }
        p(4);
        throw null;
    }

    @Override // pn2.l
    public final am2.a1 j() {
        return am2.z0.f15606a;
    }

    @Override // pn2.b
    /* renamed from: q */
    public final am2.g b() {
        am2.g gVar = this.f100824c;
        if (gVar != null) {
            return gVar;
        }
        p(5);
        throw null;
    }

    public final String toString() {
        String str = bn2.e.h(this.f100824c).f139473a;
        if (str != null) {
            return str;
        }
        ym2.e.a(4);
        throw null;
    }
}
