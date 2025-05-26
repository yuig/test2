package ym2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: e */
    public static final g f139470e = g.g("<root>");

    /* renamed from: f */
    public static final Pattern f139471f = Pattern.compile("\\.");

    /* renamed from: g */
    public static final d f139472g = new d(0);

    /* renamed from: a */
    public final String f139473a;

    /* renamed from: b */
    public transient c f139474b;

    /* renamed from: c */
    public transient e f139475c;

    /* renamed from: d */
    public transient g f139476d;

    public e(String str) {
        if (str != null) {
            this.f139473a = str;
        } else {
            a(2);
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
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 18:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 9:
            case 15:
            case 16:
            case 17:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i13) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 18:
                i14 = 2;
                break;
            case 9:
            case 15:
            case 16:
            case 17:
            default:
                i14 = 3;
                break;
        }
        Object[] objArr = new Object[i14];
        if (i13 != 1) {
            switch (i13) {
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 18:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/name/FqNameUnsafe";
                    break;
                case 9:
                    objArr[0] = "name";
                    break;
                case 15:
                    objArr[0] = "segment";
                    break;
                case 16:
                    objArr[0] = "other";
                    break;
                case 17:
                    objArr[0] = "shortName";
                    break;
                default:
                    objArr[0] = "fqName";
                    break;
            }
        } else {
            objArr[0] = "safe";
        }
        switch (i13) {
            case 4:
                objArr[1] = "asString";
                break;
            case 5:
            case 6:
                objArr[1] = "toSafe";
                break;
            case 7:
            case 8:
                objArr[1] = "parent";
                break;
            case 9:
            case 15:
            case 16:
            case 17:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/name/FqNameUnsafe";
                break;
            case 10:
            case 11:
                objArr[1] = "shortName";
                break;
            case 12:
            case 13:
                objArr[1] = "shortNameOrSpecial";
                break;
            case 14:
                objArr[1] = "pathSegments";
                break;
            case 18:
                objArr[1] = "toString";
                break;
        }
        switch (i13) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 18:
                break;
            case 9:
                objArr[2] = "child";
                break;
            case 15:
            case 16:
                objArr[2] = "startsWith";
                break;
            case 17:
                objArr[2] = "topLevel";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i13) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 18:
                throw new IllegalStateException(format);
            case 9:
            case 15:
            case 16:
            case 17:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    public final e b(g gVar) {
        String str;
        if (gVar == null) {
            a(9);
            throw null;
        }
        String str2 = this.f139473a;
        if (str2.isEmpty()) {
            str = gVar.b();
        } else {
            str = str2 + "." + gVar.b();
        }
        return new e(str, this, gVar);
    }

    public final void c() {
        String str = this.f139473a;
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf >= 0) {
            this.f139476d = g.d(str.substring(lastIndexOf + 1));
            this.f139475c = new e(str.substring(0, lastIndexOf));
        } else {
            this.f139476d = g.d(str);
            this.f139475c = c.f139466c.i();
        }
    }

    public final boolean d() {
        if (this.f139474b == null) {
            String str = this.f139473a;
            if (str == null) {
                a(4);
                throw null;
            }
            if (str.indexOf(60) >= 0) {
                return false;
            }
        }
        return true;
    }

    public final List e() {
        List list;
        String str = this.f139473a;
        if (str.isEmpty()) {
            list = Collections.emptyList();
        } else {
            String[] split = f139471f.split(str);
            Intrinsics.checkNotNullParameter(split, "<this>");
            d transform = f139472g;
            Intrinsics.checkNotNullParameter(transform, "transform");
            ArrayList arrayList = new ArrayList(split.length);
            for (String str2 : split) {
                arrayList.add(transform.invoke(str2));
            }
            list = arrayList;
        }
        if (list != null) {
            return list;
        }
        a(14);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && this.f139473a.equals(((e) obj).f139473a);
    }

    public final g f() {
        g gVar = this.f139476d;
        if (gVar != null) {
            if (gVar != null) {
                return gVar;
            }
            a(10);
            throw null;
        }
        if (this.f139473a.isEmpty()) {
            throw new IllegalStateException("root");
        }
        c();
        g gVar2 = this.f139476d;
        if (gVar2 != null) {
            return gVar2;
        }
        a(11);
        throw null;
    }

    public final c g() {
        c cVar = this.f139474b;
        if (cVar == null) {
            c cVar2 = new c(this);
            this.f139474b = cVar2;
            return cVar2;
        }
        if (cVar != null) {
            return cVar;
        }
        a(5);
        throw null;
    }

    public final int hashCode() {
        return this.f139473a.hashCode();
    }

    public final String toString() {
        String str = this.f139473a;
        if (str.isEmpty()) {
            str = f139470e.b();
        }
        if (str != null) {
            return str;
        }
        a(18);
        throw null;
    }

    public e(String str, c cVar) {
        if (str == null) {
            a(0);
            throw null;
        }
        if (cVar != null) {
            this.f139473a = str;
            this.f139474b = cVar;
        } else {
            a(1);
            throw null;
        }
    }

    public e(String str, e eVar, g gVar) {
        if (str != null) {
            this.f139473a = str;
            this.f139475c = eVar;
            this.f139476d = gVar;
            return;
        }
        a(3);
        throw null;
    }
}
