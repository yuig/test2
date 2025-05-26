package androidx.recyclerview.widget;

import android.content.Context;
import android.content.res.TypedArray;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final int[] f19639a;

    /* renamed from: b, reason: collision with root package name */
    public int f19640b;

    public u(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f19640b = -1;
        TypedArray obtainTypedArray = context.getResources().obtainTypedArray(c80.a.pds_pastel_colors);
        Intrinsics.checkNotNullExpressionValue(obtainTypedArray, "obtainTypedArray(...)");
        int length = obtainTypedArray.length();
        int[] iArr = new int[length];
        for (int i13 = 0; i13 < length; i13++) {
            iArr[i13] = obtainTypedArray.getResourceId(i13, 0);
        }
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        ol2.e random = ol2.f.f96454a;
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        for (int i14 = length - 1; i14 > 0; i14--) {
            random.getClass();
            int i15 = ol2.f.f96455b.i(i14 + 1);
            int i16 = iArr[i14];
            iArr[i14] = iArr[i15];
            iArr[i15] = i16;
        }
        this.f19639a = iArr;
    }
}
