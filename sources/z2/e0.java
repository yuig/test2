package z2;

import java.util.Arrays;
import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;
import s3.k0;

/* loaded from: classes2.dex */
public final class e0 implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public static final e0 f140614a = new e0();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        z zVar = (z) obj;
        z zVar2 = (z) obj2;
        int i13 = 0;
        if (!androidx.compose.ui.focus.a.v(zVar) || !androidx.compose.ui.focus.a.v(zVar2)) {
            if (androidx.compose.ui.focus.a.v(zVar)) {
                return -1;
            }
            return androidx.compose.ui.focus.a.v(zVar2) ? 1 : 0;
        }
        k0 U0 = com.bumptech.glide.c.U0(zVar);
        k0 U02 = com.bumptech.glide.c.U0(zVar2);
        if (Intrinsics.d(U0, U02)) {
            return 0;
        }
        Object[] objArr = new k0[16];
        int i14 = 0;
        while (U0 != null) {
            int i15 = i14 + 1;
            if (objArr.length < i15) {
                objArr = Arrays.copyOf(objArr, Math.max(i15, objArr.length * 2));
                Intrinsics.checkNotNullExpressionValue(objArr, "copyOf(this, newSize)");
            }
            if (i14 != 0) {
                kotlin.collections.z.h(0 + 1, 0, i14, objArr, objArr);
            }
            objArr[0] = U0;
            i14++;
            U0 = U0.v();
        }
        Object[] objArr2 = new k0[16];
        int i16 = 0;
        while (U02 != null) {
            int i17 = i16 + 1;
            if (objArr2.length < i17) {
                objArr2 = Arrays.copyOf(objArr2, Math.max(i17, objArr2.length * 2));
                Intrinsics.checkNotNullExpressionValue(objArr2, "copyOf(this, newSize)");
            }
            if (i16 != 0) {
                kotlin.collections.z.h(0 + 1, 0, i16, objArr2, objArr2);
            }
            objArr2[0] = U02;
            i16++;
            U02 = U02.v();
        }
        int min = Math.min(i14 - 1, i16 - 1);
        if (min >= 0) {
            while (Intrinsics.d(objArr[i13], objArr2[i13])) {
                if (i13 != min) {
                    i13++;
                }
            }
            return Intrinsics.i(((k0) objArr[i13]).w(), ((k0) objArr2[i13]).w());
        }
        throw new IllegalStateException("Could not find a common ancestor between the two FocusModifiers.".toString());
    }
}
