package f4;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public int[] f61045a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f61046b;

    /* renamed from: c, reason: collision with root package name */
    public int f61047c;

    public final int a(int i13, Object obj) {
        int i14 = this.f61047c;
        if (i14 == 0) {
            return -1;
        }
        int a13 = a.a(i14, i13, this.f61045a);
        if (a13 < 0 || Intrinsics.d(obj, this.f61046b[a13 << 1])) {
            return a13;
        }
        int i15 = a13 + 1;
        while (i15 < i14 && this.f61045a[i15] == i13) {
            if (Intrinsics.d(obj, this.f61046b[i15 << 1])) {
                return i15;
            }
            i15++;
        }
        for (int i16 = a13 - 1; i16 >= 0 && this.f61045a[i16] == i13; i16--) {
            if (Intrinsics.d(obj, this.f61046b[i16 << 1])) {
                return i16;
            }
        }
        return ~i15;
    }

    public final int b() {
        int i13 = this.f61047c;
        if (i13 == 0) {
            return -1;
        }
        int a13 = a.a(i13, 0, this.f61045a);
        if (a13 < 0 || this.f61046b[a13 << 1] == null) {
            return a13;
        }
        int i14 = a13 + 1;
        while (i14 < i13 && this.f61045a[i14] == 0) {
            if (this.f61046b[i14 << 1] == null) {
                return i14;
            }
            i14++;
        }
        for (int i15 = a13 - 1; i15 >= 0 && this.f61045a[i15] == 0; i15--) {
            if (this.f61046b[i15 << 1] == null) {
                return i15;
            }
        }
        return ~i14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (!(obj instanceof c)) {
                if (!(obj instanceof Map) || this.f61047c != ((Map) obj).size()) {
                    return false;
                }
                int i13 = this.f61047c;
                for (int i14 = 0; i14 < i13; i14++) {
                    Object[] objArr = this.f61046b;
                    int i15 = i14 << 1;
                    Object obj2 = objArr[i15];
                    Object obj3 = objArr[i15 + 1];
                    Object obj4 = ((Map) obj).get(obj2);
                    if (obj3 == null) {
                        if (obj4 != null || !((Map) obj).containsKey(obj2)) {
                            return false;
                        }
                    } else if (!Intrinsics.d(obj3, obj4)) {
                        return false;
                    }
                }
                return true;
            }
            c cVar = (c) obj;
            int i16 = this.f61047c;
            if (i16 != cVar.f61047c) {
                return false;
            }
            for (int i17 = 0; i17 < i16; i17++) {
                Object[] objArr2 = this.f61046b;
                int i18 = i17 << 1;
                Object obj5 = objArr2[i18];
                Object obj6 = objArr2[i18 + 1];
                int b13 = obj5 == null ? cVar.b() : cVar.a(obj5.hashCode(), obj5);
                Object obj7 = b13 >= 0 ? cVar.f61046b[(b13 << 1) + 1] : null;
                if (obj6 == null) {
                    if (obj7 == null) {
                        if ((obj5 == null ? cVar.b() : cVar.a(obj5.hashCode(), obj5)) >= 0) {
                        }
                    }
                    return false;
                }
                if (!Intrinsics.d(obj6, obj7)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final int hashCode() {
        int[] iArr = this.f61045a;
        Object[] objArr = this.f61046b;
        int i13 = this.f61047c;
        int i14 = 1;
        int i15 = 0;
        int i16 = 0;
        while (i15 < i13) {
            Object obj = objArr[i14];
            i16 += (obj != null ? obj.hashCode() : 0) ^ iArr[i15];
            i15++;
            i14 += 2;
        }
        return i16;
    }

    public final String toString() {
        int i13 = this.f61047c;
        if (i13 <= 0) {
            return "{}";
        }
        StringBuilder sb3 = new StringBuilder(i13 * 28);
        sb3.append('{');
        int i14 = this.f61047c;
        for (int i15 = 0; i15 < i14; i15++) {
            if (i15 > 0) {
                sb3.append(", ");
            }
            int i16 = i15 << 1;
            Object obj = this.f61046b[i16];
            if (obj != this) {
                sb3.append(obj);
            } else {
                sb3.append("(this Map)");
            }
            sb3.append('=');
            Object obj2 = this.f61046b[i16 + 1];
            if (obj2 != this) {
                sb3.append(obj2);
            } else {
                sb3.append("(this Map)");
            }
        }
        sb3.append('}');
        return sb3.toString();
    }
}
