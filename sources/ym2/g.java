package ym2;

/* loaded from: classes2.dex */
public final class g implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final String f139478a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f139479b;

    public g(String str, boolean z13) {
        if (str == null) {
            a(0);
            throw null;
        }
        this.f139478a = str;
        this.f139479b = z13;
    }

    public static /* synthetic */ void a(int i13) {
        String str = (i13 == 1 || i13 == 2 || i13 == 3 || i13 == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i13 == 1 || i13 == 2 || i13 == 3 || i13 == 4) ? 2 : 3];
        if (i13 == 1 || i13 == 2 || i13 == 3 || i13 == 4) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/name/Name";
        } else {
            objArr[0] = "name";
        }
        if (i13 == 1) {
            objArr[1] = "asString";
        } else if (i13 == 2) {
            objArr[1] = "getIdentifier";
        } else if (i13 == 3 || i13 == 4) {
            objArr[1] = "asStringStripSpecialMarkers";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/name/Name";
        }
        switch (i13) {
            case 1:
            case 2:
            case 3:
            case 4:
                break;
            case 5:
                objArr[2] = "identifier";
                break;
            case 6:
                objArr[2] = "isValidIdentifier";
                break;
            case 7:
                objArr[2] = "identifierIfValid";
                break;
            case 8:
                objArr[2] = "special";
                break;
            case 9:
                objArr[2] = "guessByFirstCharacter";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i13 != 1 && i13 != 2 && i13 != 3 && i13 != 4) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    public static g d(String str) {
        if (str != null) {
            return str.startsWith("<") ? g(str) : e(str);
        }
        a(9);
        throw null;
    }

    public static g e(String str) {
        if (str != null) {
            return new g(str, false);
        }
        a(5);
        throw null;
    }

    public static boolean f(String str) {
        if (str == null) {
            a(6);
            throw null;
        }
        if (str.isEmpty() || str.startsWith("<")) {
            return false;
        }
        for (int i13 = 0; i13 < str.length(); i13++) {
            char charAt = str.charAt(i13);
            if (charAt == '.' || charAt == '/' || charAt == '\\') {
                return false;
            }
        }
        return true;
    }

    public static g g(String str) {
        if (str == null) {
            a(8);
            throw null;
        }
        if (str.startsWith("<")) {
            return new g(str, true);
        }
        throw new IllegalArgumentException("special name must start with '<': ".concat(str));
    }

    public final String b() {
        String str = this.f139478a;
        if (str != null) {
            return str;
        }
        a(1);
        throw null;
    }

    public final String c() {
        if (this.f139479b) {
            throw new IllegalStateException("not identifier: " + this);
        }
        String b13 = b();
        if (b13 != null) {
            return b13;
        }
        a(2);
        throw null;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f139478a.compareTo(((g) obj).f139478a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f139479b == gVar.f139479b && this.f139478a.equals(gVar.f139478a);
    }

    public final int hashCode() {
        return (this.f139478a.hashCode() * 31) + (this.f139479b ? 1 : 0);
    }

    public final String toString() {
        return this.f139478a;
    }
}
