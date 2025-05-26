package vi2;

import java.util.Arrays;

/* loaded from: classes4.dex */
public final class a implements b {

    /* renamed from: b, reason: collision with root package name */
    public static final a f125874b = new a(new Object[0]);

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f125875a;

    public a(Object[] objArr) {
        this.f125875a = objArr;
    }

    public final Object a(z.a aVar) {
        int i13 = 0;
        while (true) {
            Object[] objArr = this.f125875a;
            if (i13 >= objArr.length) {
                return null;
            }
            if (objArr[i13] == aVar) {
                return objArr[i13 + 1];
            }
            i13 += 2;
        }
    }

    public final a b(z.a aVar, Object obj) {
        int i13 = 0;
        while (true) {
            Object[] objArr = this.f125875a;
            if (i13 >= objArr.length) {
                Object[] copyOf = Arrays.copyOf(objArr, objArr.length + 2);
                copyOf[copyOf.length - 2] = aVar;
                copyOf[copyOf.length - 1] = obj;
                return new a(copyOf);
            }
            if (objArr[i13] == aVar) {
                int i14 = i13 + 1;
                if (objArr[i14] == obj) {
                    return this;
                }
                Object[] objArr2 = (Object[]) objArr.clone();
                objArr2[i14] = obj;
                return new a(objArr2);
            }
            i13 += 2;
        }
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("{");
        int i13 = 0;
        while (true) {
            Object[] objArr = this.f125875a;
            if (i13 >= objArr.length) {
                break;
            }
            sb3.append(objArr[i13]);
            sb3.append('=');
            sb3.append(objArr[i13 + 1]);
            sb3.append(", ");
            i13 += 2;
        }
        if (sb3.length() > 1) {
            sb3.setLength(sb3.length() - 2);
        }
        sb3.append('}');
        return sb3.toString();
    }
}
