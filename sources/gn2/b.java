package gn2;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f65812a;

    public b(String str) {
        if (str != null) {
            this.f65812a = str;
        } else {
            a(5);
            throw null;
        }
    }

    public static /* synthetic */ void a(int i13) {
        String str = (i13 == 3 || i13 == 6 || i13 == 7 || i13 == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i13 == 3 || i13 == 6 || i13 == 7 || i13 == 8) ? 2 : 3];
        switch (i13) {
            case 1:
                objArr[0] = "classId";
                break;
            case 2:
            case 4:
                objArr[0] = "fqName";
                break;
            case 3:
            case 6:
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmClassName";
                break;
            case 5:
            default:
                objArr[0] = "internalName";
                break;
        }
        if (i13 == 3) {
            objArr[1] = "byFqNameWithoutInnerClasses";
        } else if (i13 == 6) {
            objArr[1] = "getFqNameForClassNameWithoutDollars";
        } else if (i13 == 7) {
            objArr[1] = "getPackageFqName";
        } else if (i13 != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmClassName";
        } else {
            objArr[1] = "getInternalName";
        }
        switch (i13) {
            case 1:
                objArr[2] = "byClassId";
                break;
            case 2:
            case 4:
                objArr[2] = "byFqNameWithoutInnerClasses";
                break;
            case 3:
            case 6:
            case 7:
            case 8:
                break;
            case 5:
                objArr[2] = "<init>";
                break;
            default:
                objArr[2] = "byInternalName";
                break;
        }
        String format = String.format(str, objArr);
        if (i13 != 3 && i13 != 6 && i13 != 7 && i13 != 8) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    public static b b(ym2.b bVar) {
        ym2.c g13 = bVar.g();
        String replace = bVar.h().b().replace('.', '$');
        if (g13.d()) {
            return new b(replace);
        }
        return new b(g13.b().replace('.', '/') + "/" + replace);
    }

    public static b c(ym2.c cVar) {
        if (cVar != null) {
            return new b(cVar.b().replace('.', '/'));
        }
        a(2);
        throw null;
    }

    public static b d(String str) {
        if (str != null) {
            return new b(str);
        }
        a(0);
        throw null;
    }

    public final ym2.c e() {
        return new ym2.c(this.f65812a.replace('/', '.'));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        return this.f65812a.equals(((b) obj).f65812a);
    }

    public final String f() {
        String str = this.f65812a;
        if (str != null) {
            return str;
        }
        a(8);
        throw null;
    }

    public final int hashCode() {
        return this.f65812a.hashCode();
    }

    public final String toString() {
        return this.f65812a;
    }
}
