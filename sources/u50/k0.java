package u50;

import android.content.Context;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class k0 implements i0 {

    /* renamed from: a */
    public final int f120569a;

    /* renamed from: b */
    public final List f120570b;

    public k0(int i13, List formatArgs) {
        Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
        this.f120569a = i13;
        this.f120570b = formatArgs;
    }

    @Override // u50.a0
    public final CharSequence a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        List list = this.f120570b;
        ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((i0) it.next()).a(context));
        }
        CharSequence[] charSequenceArr = (CharSequence[]) arrayList.toArray(new CharSequence[0]);
        String string = context.getString(this.f120569a, Arrays.copyOf(charSequenceArr, charSequenceArr.length));
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return this.f120569a == k0Var.f120569a && Intrinsics.d(this.f120570b, k0Var.f120570b);
    }

    public final int hashCode() {
        return this.f120570b.hashCode() + (Integer.hashCode(this.f120569a) * 31);
    }

    public final String toString() {
        return "StringResource(resId=" + this.f120569a + ", formatArgs=" + this.f120570b + ")";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k0(int i13, i0... formatArgs) {
        this(i13, kotlin.collections.c0.b0(formatArgs));
        Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public k0(java.lang.String[] r6, int r7) {
        /*
            r5 = this;
            java.lang.String r0 = "formatArgs"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r6.length
            r0.<init>(r1)
            int r1 = r6.length
            r2 = 0
        Ld:
            if (r2 >= r1) goto L1c
            r3 = r6[r2]
            u50.f0 r4 = new u50.f0
            r4.<init>(r3)
            r0.add(r4)
            int r2 = r2 + 1
            goto Ld
        L1c:
            r5.<init>(r7, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u50.k0.<init>(java.lang.String[], int):void");
    }

    public k0(int i13) {
        this(i13, q0.f80391a);
    }
}
