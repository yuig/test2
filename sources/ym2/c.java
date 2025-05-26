package ym2;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: c, reason: collision with root package name */
    public static final c f139466c = new c("");

    /* renamed from: a, reason: collision with root package name */
    public final e f139467a;

    /* renamed from: b, reason: collision with root package name */
    public transient c f139468b;

    public c(String str) {
        if (str != null) {
            this.f139467a = new e(str, this);
        } else {
            a(1);
            throw null;
        }
    }

    public static /* synthetic */ void a(int i13) {
        String str;
        int i14;
        switch (i13) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 8:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i13) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                i14 = 2;
                break;
            case 8:
            default:
                i14 = 3;
                break;
        }
        Object[] objArr = new Object[i14];
        switch (i13) {
            case 1:
            case 2:
            case 3:
                objArr[0] = "fqName";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/name/FqName";
                break;
            case 8:
                objArr[0] = "name";
                break;
            case 12:
                objArr[0] = "segment";
                break;
            case 13:
                objArr[0] = "other";
                break;
            case 14:
                objArr[0] = "shortName";
                break;
            default:
                objArr[0] = "names";
                break;
        }
        switch (i13) {
            case 4:
                objArr[1] = "asString";
                break;
            case 5:
                objArr[1] = "toUnsafe";
                break;
            case 6:
            case 7:
                objArr[1] = "parent";
                break;
            case 8:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/name/FqName";
                break;
            case 9:
                objArr[1] = "shortName";
                break;
            case 10:
                objArr[1] = "shortNameOrSpecial";
                break;
            case 11:
                objArr[1] = "pathSegments";
                break;
        }
        switch (i13) {
            case 1:
            case 2:
            case 3:
                objArr[2] = "<init>";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                break;
            case 8:
                objArr[2] = "child";
                break;
            case 12:
            case 13:
                objArr[2] = "startsWith";
                break;
            case 14:
                objArr[2] = "topLevel";
                break;
            default:
                objArr[2] = "fromSegments";
                break;
        }
        String format = String.format(str, objArr);
        switch (i13) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                throw new IllegalStateException(format);
            case 8:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    public static c j(g gVar) {
        if (gVar == null) {
            a(14);
            throw null;
        }
        if (gVar != null) {
            return new c(new e(gVar.b(), f139466c.i(), gVar));
        }
        e.a(17);
        throw null;
    }

    public final String b() {
        String str = this.f139467a.f139473a;
        if (str != null) {
            return str;
        }
        e.a(4);
        throw null;
    }

    public final c c(g gVar) {
        if (gVar != null) {
            return new c(this.f139467a.b(gVar), this);
        }
        a(8);
        throw null;
    }

    public final boolean d() {
        return this.f139467a.f139473a.isEmpty();
    }

    public final c e() {
        c cVar = this.f139468b;
        if (cVar != null) {
            if (cVar != null) {
                return cVar;
            }
            a(6);
            throw null;
        }
        if (d()) {
            throw new IllegalStateException("root");
        }
        e eVar = this.f139467a;
        e eVar2 = eVar.f139475c;
        if (eVar2 == null) {
            if (eVar.f139473a.isEmpty()) {
                throw new IllegalStateException("root");
            }
            eVar.c();
            eVar2 = eVar.f139475c;
            if (eVar2 == null) {
                e.a(8);
                throw null;
            }
        }
        c cVar2 = new c(eVar2);
        this.f139468b = cVar2;
        return cVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && this.f139467a.equals(((c) obj).f139467a);
    }

    public final g f() {
        g f13 = this.f139467a.f();
        if (f13 != null) {
            return f13;
        }
        a(9);
        throw null;
    }

    public final g g() {
        g f13;
        e eVar = this.f139467a;
        if (eVar.f139473a.isEmpty()) {
            f13 = e.f139470e;
            if (f13 == null) {
                e.a(12);
                throw null;
            }
        } else {
            f13 = eVar.f();
            if (f13 == null) {
                e.a(13);
                throw null;
            }
        }
        return f13;
    }

    public final boolean h(g gVar) {
        if (gVar == null) {
            a(12);
            throw null;
        }
        String str = this.f139467a.f139473a;
        if (str.isEmpty()) {
            return false;
        }
        int indexOf = str.indexOf(46);
        String b13 = gVar.b();
        if (indexOf == -1) {
            indexOf = Math.max(str.length(), b13.length());
        }
        return str.regionMatches(0, b13, 0, indexOf);
    }

    public final int hashCode() {
        return this.f139467a.f139473a.hashCode();
    }

    public final e i() {
        e eVar = this.f139467a;
        if (eVar != null) {
            return eVar;
        }
        a(5);
        throw null;
    }

    public final String toString() {
        return this.f139467a.toString();
    }

    public c(e eVar) {
        if (eVar != null) {
            this.f139467a = eVar;
        } else {
            a(2);
            throw null;
        }
    }

    public c(e eVar, c cVar) {
        this.f139467a = eVar;
        this.f139468b = cVar;
    }
}
