package kotlin.collections;

import java.util.RandomAccess;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class y extends h implements RandomAccess {

    /* renamed from: b */
    public final /* synthetic */ int[] f80403b;

    public y(int[] iArr) {
        this.f80403b = iArr;
    }

    @Override // kotlin.collections.b
    public final int b() {
        return this.f80403b.length;
    }

    @Override // kotlin.collections.b, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Integer)) {
            return false;
        }
        return c0.w(this.f80403b, ((Number) obj).intValue());
    }

    @Override // java.util.List
    public final Object get(int i13) {
        return Integer.valueOf(this.f80403b[i13]);
    }

    @Override // kotlin.collections.h, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Number) obj).intValue();
        int[] iArr = this.f80403b;
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int length = iArr.length;
        for (int i13 = 0; i13 < length; i13++) {
            if (intValue == iArr[i13]) {
                return i13;
            }
        }
        return -1;
    }

    @Override // kotlin.collections.b, java.util.Collection
    public final boolean isEmpty() {
        return this.f80403b.length == 0;
    }

    @Override // kotlin.collections.h, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Number) obj).intValue();
        int[] iArr = this.f80403b;
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int length = iArr.length - 1;
        if (length < 0) {
            return -1;
        }
        while (true) {
            int i13 = length - 1;
            if (intValue == iArr[length]) {
                return length;
            }
            if (i13 < 0) {
                return -1;
            }
            length = i13;
        }
    }
}
