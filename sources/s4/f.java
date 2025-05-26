package s4;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class f implements p5.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f111091a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f111092b;

    /* renamed from: c, reason: collision with root package name */
    public int f111093c;

    public f(int i13, int i14) {
        this.f111091a = i14;
        if (i14 != 1) {
            if (i13 <= 0) {
                throw new IllegalArgumentException("The max pool size must be > 0");
            }
            this.f111092b = new Object[i13];
        } else {
            if (i13 <= 0) {
                throw new IllegalArgumentException("The max pool size must be > 0".toString());
            }
            this.f111092b = new Object[i13];
        }
    }

    @Override // p5.d
    public boolean a(Object instance) {
        boolean z13;
        int i13 = this.f111091a;
        Object[] objArr = this.f111092b;
        switch (i13) {
            case 0:
                int i14 = this.f111093c;
                if (i14 >= objArr.length) {
                    return false;
                }
                objArr[i14] = instance;
                this.f111093c = i14 + 1;
                return true;
            default:
                Intrinsics.checkNotNullParameter(instance, "instance");
                int i15 = this.f111093c;
                int i16 = 0;
                while (true) {
                    if (i16 >= i15) {
                        z13 = false;
                    } else if (objArr[i16] == instance) {
                        z13 = true;
                    } else {
                        i16++;
                    }
                }
                if (!(!z13)) {
                    throw new IllegalStateException("Already in the pool!".toString());
                }
                int i17 = this.f111093c;
                if (i17 >= objArr.length) {
                    return false;
                }
                objArr[i17] = instance;
                this.f111093c = i17 + 1;
                return true;
        }
    }

    @Override // p5.d
    public Object b() {
        int i13 = this.f111091a;
        Object[] objArr = this.f111092b;
        switch (i13) {
            case 0:
                int i14 = this.f111093c;
                if (i14 <= 0) {
                    return null;
                }
                int i15 = i14 - 1;
                Object obj = objArr[i15];
                objArr[i15] = null;
                this.f111093c = i15;
                return obj;
            default:
                int i16 = this.f111093c;
                if (i16 <= 0) {
                    return null;
                }
                int i17 = i16 - 1;
                Object obj2 = objArr[i17];
                Intrinsics.g(obj2, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
                objArr[i17] = null;
                this.f111093c--;
                return obj2;
        }
    }
}
