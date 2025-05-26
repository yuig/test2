package t3;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class d1 {

    /* renamed from: a, reason: collision with root package name */
    public static final Class[] f115934a = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f115935b = 0;

    public static final boolean a(Object obj) {
        if (obj instanceof s2.q) {
            s2.q qVar = (s2.q) obj;
            if (qVar.a() != i2.r1.f71258a && qVar.a() != i2.y3.f71400a && qVar.a() != i2.p2.f71234a) {
                return false;
            }
            Object value = qVar.getValue();
            if (value == null) {
                return true;
            }
            return a(value);
        }
        if ((obj instanceof xk2.g) && (obj instanceof Serializable)) {
            return false;
        }
        Class[] clsArr = f115934a;
        for (int i13 = 0; i13 < 7; i13++) {
            if (clsArr[i13].isInstance(obj)) {
                return true;
            }
        }
        return false;
    }

    public static final float b(int i13, int i14, float[] fArr, float[] fArr2) {
        int i15 = i13 * 4;
        return (fArr[i15 + 3] * fArr2[12 + i14]) + (fArr[i15 + 2] * fArr2[8 + i14]) + (fArr[i15 + 1] * fArr2[4 + i14]) + (fArr[i15] * fArr2[i14]);
    }

    public static final void c(float[] fArr, float[] fArr2) {
        float b13 = b(0, 0, fArr2, fArr);
        float b14 = b(0, 1, fArr2, fArr);
        float b15 = b(0, 2, fArr2, fArr);
        float b16 = b(0, 3, fArr2, fArr);
        float b17 = b(1, 0, fArr2, fArr);
        float b18 = b(1, 1, fArr2, fArr);
        float b19 = b(1, 2, fArr2, fArr);
        float b23 = b(1, 3, fArr2, fArr);
        float b24 = b(2, 0, fArr2, fArr);
        float b25 = b(2, 1, fArr2, fArr);
        float b26 = b(2, 2, fArr2, fArr);
        float b27 = b(2, 3, fArr2, fArr);
        float b28 = b(3, 0, fArr2, fArr);
        float b29 = b(3, 1, fArr2, fArr);
        float b33 = b(3, 2, fArr2, fArr);
        float b34 = b(3, 3, fArr2, fArr);
        fArr[0] = b13;
        fArr[1] = b14;
        fArr[2] = b15;
        fArr[3] = b16;
        fArr[4] = b17;
        fArr[5] = b18;
        fArr[6] = b19;
        fArr[7] = b23;
        fArr[8] = b24;
        fArr[9] = b25;
        fArr[10] = b26;
        fArr[11] = b27;
        fArr[12] = b28;
        fArr[13] = b29;
        fArr[14] = b33;
        fArr[15] = b34;
    }

    public static final LinkedHashMap d(Bundle bundle) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : bundle.keySet()) {
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(str);
            Intrinsics.g(parcelableArrayList, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Any?>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.Any?> }");
            linkedHashMap.put(str, parcelableArrayList);
        }
        return linkedHashMap;
    }
}
