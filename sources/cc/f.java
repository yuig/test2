package cc;

import a.cb;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class f {

    /* renamed from: c */
    public static final f f27433c = new f("COMPOSITION");

    /* renamed from: a */
    public final List f27434a;

    /* renamed from: b */
    public g f27435b;

    public f(String... strArr) {
        this.f27434a = Arrays.asList(strArr);
    }

    public final f a(String str) {
        f fVar = new f(this);
        fVar.f27434a.add(str);
        return fVar;
    }

    public final boolean b(int i13, String str) {
        List list = this.f27434a;
        if (i13 >= list.size()) {
            return false;
        }
        boolean z13 = i13 == list.size() - 1;
        String str2 = (String) list.get(i13);
        if (!str2.equals("**")) {
            return (z13 || (i13 == list.size() + (-2) && ((String) ep.b.i(list, 1)).equals("**"))) && (str2.equals(str) || str2.equals("*"));
        }
        if (!z13 && ((String) list.get(i13 + 1)).equals(str)) {
            return i13 == list.size() + (-2) || (i13 == list.size() + (-3) && ((String) ep.b.i(list, 1)).equals("**"));
        }
        if (z13) {
            return true;
        }
        int i14 = i13 + 1;
        if (i14 < list.size() - 1) {
            return false;
        }
        return ((String) list.get(i14)).equals(str);
    }

    public final int c(int i13, String str) {
        if ("__container".equals(str)) {
            return 0;
        }
        List list = this.f27434a;
        if (((String) list.get(i13)).equals("**")) {
            return (i13 != list.size() - 1 && ((String) list.get(i13 + 1)).equals(str)) ? 2 : 0;
        }
        return 1;
    }

    public final boolean d(int i13, String str) {
        if ("__container".equals(str)) {
            return true;
        }
        List list = this.f27434a;
        if (i13 >= list.size()) {
            return false;
        }
        return ((String) list.get(i13)).equals(str) || ((String) list.get(i13)).equals("**") || ((String) list.get(i13)).equals("*");
    }

    public final boolean e(int i13, String str) {
        if ("__container".equals(str)) {
            return true;
        }
        List list = this.f27434a;
        return i13 < list.size() - 1 || ((String) list.get(i13)).equals("**");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        if (!this.f27434a.equals(fVar.f27434a)) {
            return false;
        }
        g gVar = this.f27435b;
        g gVar2 = fVar.f27435b;
        return gVar != null ? gVar.equals(gVar2) : gVar2 == null;
    }

    public final f f(g gVar) {
        f fVar = new f(this);
        fVar.f27435b = gVar;
        return fVar;
    }

    public final int hashCode() {
        int hashCode = this.f27434a.hashCode() * 31;
        g gVar = this.f27435b;
        return hashCode + (gVar != null ? gVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("KeyPath{keys=");
        sb3.append(this.f27434a);
        sb3.append(",resolved=");
        return cb.m(sb3, this.f27435b != null, '}');
    }

    public f(f fVar) {
        this.f27434a = new ArrayList(fVar.f27434a);
        this.f27435b = fVar.f27435b;
    }
}
