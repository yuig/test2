package pn2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class i1 extends h1 {

    /* renamed from: a, reason: collision with root package name */
    public final w1 f100804a;

    /* renamed from: b, reason: collision with root package name */
    public final b0 f100805b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i1(b0 b0Var) {
        this(b0Var, w1.INVARIANT);
        if (b0Var != null) {
        } else {
            d(2);
            throw null;
        }
    }

    public static /* synthetic */ void d(int i13) {
        String str = (i13 == 4 || i13 == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i13 == 4 || i13 == 5) ? 2 : 3];
        switch (i13) {
            case 1:
            case 2:
            case 3:
                objArr[0] = "type";
                break;
            case 4:
            case 5:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
                break;
            case 6:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "projection";
                break;
        }
        if (i13 == 4) {
            objArr[1] = "getProjectionKind";
        } else if (i13 != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
        } else {
            objArr[1] = "getType";
        }
        if (i13 == 3) {
            objArr[2] = "replaceType";
        } else if (i13 != 4 && i13 != 5) {
            if (i13 != 6) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "refine";
            }
        }
        String format = String.format(str, objArr);
        if (i13 != 4 && i13 != 5) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // pn2.g1
    public final g1 a(qn2.i iVar) {
        if (iVar == null) {
            d(6);
            throw null;
        }
        b0 type = this.f100805b;
        Intrinsics.checkNotNullParameter(type, "type");
        return new i1(type, this.f100804a);
    }

    @Override // pn2.g1
    public final boolean b() {
        return false;
    }

    @Override // pn2.g1
    public final w1 c() {
        w1 w1Var = this.f100804a;
        if (w1Var != null) {
            return w1Var;
        }
        d(4);
        throw null;
    }

    @Override // pn2.g1
    public final b0 getType() {
        b0 b0Var = this.f100805b;
        if (b0Var != null) {
            return b0Var;
        }
        d(5);
        throw null;
    }

    public i1(b0 b0Var, w1 w1Var) {
        if (w1Var == null) {
            d(0);
            throw null;
        }
        if (b0Var != null) {
            this.f100804a = w1Var;
            this.f100805b = b0Var;
        } else {
            d(1);
            throw null;
        }
    }
}
