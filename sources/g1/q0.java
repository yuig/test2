package g1;

/* loaded from: classes.dex */
public abstract class q0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f63304a = new Object();

    public static final void a(p0 p0Var) {
        int i13 = p0Var.f63302d;
        int[] iArr = p0Var.f63300b;
        Object[] objArr = p0Var.f63301c;
        int i14 = 0;
        for (int i15 = 0; i15 < i13; i15++) {
            Object obj = objArr[i15];
            if (obj != f63304a) {
                if (i15 != i14) {
                    iArr[i14] = iArr[i15];
                    objArr[i14] = obj;
                    objArr[i15] = null;
                }
                i14++;
            }
        }
        p0Var.f63299a = false;
        p0Var.f63302d = i14;
    }
}
