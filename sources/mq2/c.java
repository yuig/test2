package mq2;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.internal.r;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int[] f88070a;

    public c(int[] iArr) {
        int[] iArr2 = new int[iArr.length];
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        this.f88070a = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            return r.j(this.f88070a, ((c) obj).f88070a);
        }
        return false;
    }

    public final int hashCode() {
        int[] iArr = this.f88070a;
        if (iArr == null) {
            return 0;
        }
        int length = iArr.length;
        int i13 = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i13;
            }
            i13 = (i13 * RecyclerViewTypes.VIEW_TYPE_COMMENT_STICKER) ^ iArr[length];
        }
    }
}
