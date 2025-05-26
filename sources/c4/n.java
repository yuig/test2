package c4;

import a.l9;
import android.text.Layout;
import java.text.Bidi;
import java.util.ArrayList;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final Layout f25648a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f25649b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f25650c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean[] f25651d;

    /* renamed from: e, reason: collision with root package name */
    public char[] f25652e;

    public n(Layout layout) {
        this.f25648a = layout;
        ArrayList arrayList = new ArrayList();
        int i13 = 0;
        do {
            int K = StringsKt.K(this.f25648a.getText(), '\n', i13, false, 4);
            i13 = K < 0 ? this.f25648a.getText().length() : K + 1;
            arrayList.add(Integer.valueOf(i13));
        } while (i13 < this.f25648a.getText().length());
        this.f25649b = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i14 = 0; i14 < size; i14++) {
            arrayList2.add(null);
        }
        this.f25650c = arrayList2;
        this.f25651d = new boolean[this.f25649b.size()];
        this.f25649b.size();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006c, code lost:
    
        if (r1.getRunCount() == 1) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.text.Bidi a(int r15) {
        /*
            r14 = this;
            boolean[] r0 = r14.f25651d
            boolean r1 = r0[r15]
            java.util.ArrayList r2 = r14.f25650c
            if (r1 == 0) goto Lf
            java.lang.Object r15 = r2.get(r15)
            java.text.Bidi r15 = (java.text.Bidi) r15
            return r15
        Lf:
            java.util.ArrayList r1 = r14.f25649b
            r3 = 0
            if (r15 != 0) goto L16
            r4 = r3
            goto L22
        L16:
            int r4 = r15 + (-1)
            java.lang.Object r4 = r1.get(r4)
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
        L22:
            java.lang.Object r1 = r1.get(r15)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            int r10 = r1 - r4
            char[] r5 = r14.f25652e
            if (r5 == 0) goto L38
            int r6 = r5.length
            if (r6 >= r10) goto L36
            goto L38
        L36:
            r12 = r5
            goto L3b
        L38:
            char[] r5 = new char[r10]
            goto L36
        L3b:
            android.text.Layout r5 = r14.f25648a
            java.lang.CharSequence r6 = r5.getText()
            android.text.TextUtils.getChars(r6, r4, r1, r12, r3)
            boolean r1 = java.text.Bidi.requiresBidi(r12, r3, r10)
            r4 = 1
            r13 = 0
            if (r1 == 0) goto L6e
            int r1 = r14.e(r15)
            int r1 = r5.getLineForOffset(r1)
            int r1 = r5.getParagraphDirection(r1)
            r5 = -1
            if (r1 != r5) goto L5d
            r11 = r4
            goto L5e
        L5d:
            r11 = r3
        L5e:
            java.text.Bidi r1 = new java.text.Bidi
            r9 = 0
            r7 = 0
            r8 = 0
            r5 = r1
            r6 = r12
            r5.<init>(r6, r7, r8, r9, r10, r11)
            int r3 = r1.getRunCount()
            if (r3 != r4) goto L6f
        L6e:
            r1 = r13
        L6f:
            r2.set(r15, r1)
            r0[r15] = r4
            if (r1 == 0) goto L7d
            char[] r15 = r14.f25652e
            if (r12 != r15) goto L7c
            r12 = r13
            goto L7d
        L7c:
            r12 = r15
        L7d:
            r14.f25652e = r12
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: c4.n.a(int):java.text.Bidi");
    }

    public final float b(int i13, boolean z13) {
        Layout layout = this.f25648a;
        int lineEnd = layout.getLineEnd(layout.getLineForOffset(i13));
        if (i13 > lineEnd) {
            i13 = lineEnd;
        }
        return z13 ? layout.getPrimaryHorizontal(i13) : layout.getSecondaryHorizontal(i13);
    }

    public final float c(int i13, boolean z13, boolean z14) {
        int i14;
        int i15;
        int i16 = i13;
        if (!z14) {
            return b(i13, z13);
        }
        Layout layout = this.f25648a;
        int h10 = l9.h(layout, i16, z14);
        int lineStart = layout.getLineStart(h10);
        int lineEnd = layout.getLineEnd(h10);
        if (i16 != lineStart && i16 != lineEnd) {
            return b(i13, z13);
        }
        if (i16 == 0 || i16 == layout.getText().length()) {
            return b(i13, z13);
        }
        int d2 = d(i16, z14);
        boolean z15 = layout.getParagraphDirection(layout.getLineForOffset(e(d2))) == -1;
        int f13 = f(lineEnd, lineStart);
        int e13 = e(d2);
        int i17 = lineStart - e13;
        int i18 = f13 - e13;
        Bidi a13 = a(d2);
        Bidi createLineBidi = a13 != null ? a13.createLineBidi(i17, i18) : null;
        if (createLineBidi == null || createLineBidi.getRunCount() == 1) {
            boolean z16 = (z13 || z15 == layout.isRtlCharAt(lineStart)) ? !z15 : z15;
            return (i16 != lineStart ? z16 : !z16) ? layout.getLineRight(h10) : layout.getLineLeft(h10);
        }
        int runCount = createLineBidi.getRunCount();
        m[] mVarArr = new m[runCount];
        for (int i19 = 0; i19 < runCount; i19++) {
            mVarArr[i19] = new m(createLineBidi.getRunStart(i19) + lineStart, createLineBidi.getRunLimit(i19) + lineStart, createLineBidi.getRunLevel(i19) % 2 == 1);
        }
        int runCount2 = createLineBidi.getRunCount();
        byte[] bArr = new byte[runCount2];
        for (int i23 = 0; i23 < runCount2; i23++) {
            bArr[i23] = (byte) createLineBidi.getRunLevel(i23);
        }
        Bidi.reorderVisually(bArr, 0, mVarArr, 0, runCount);
        if (i16 == lineStart) {
            int i24 = 0;
            while (true) {
                if (i24 >= runCount) {
                    i15 = -1;
                    break;
                }
                if (mVarArr[i24].f25645a == i16) {
                    i15 = i24;
                    break;
                }
                i24++;
            }
            boolean z17 = (z13 || z15 == mVarArr[i15].f25647c) ? !z15 : z15;
            if (i15 == 0 && z17) {
                return layout.getLineLeft(h10);
            }
            Intrinsics.checkNotNullParameter(mVarArr, "<this>");
            return (i15 != runCount - 1 || z17) ? z17 ? layout.getPrimaryHorizontal(mVarArr[i15 - 1].f25645a) : layout.getPrimaryHorizontal(mVarArr[i15 + 1].f25645a) : layout.getLineRight(h10);
        }
        if (i16 > f13) {
            i16 = f(i16, lineStart);
        }
        int i25 = 0;
        while (true) {
            if (i25 >= runCount) {
                i14 = -1;
                break;
            }
            if (mVarArr[i25].f25646b == i16) {
                i14 = i25;
                break;
            }
            i25++;
        }
        boolean z18 = (z13 || z15 == mVarArr[i14].f25647c) ? z15 : !z15;
        if (i14 == 0 && z18) {
            return layout.getLineLeft(h10);
        }
        Intrinsics.checkNotNullParameter(mVarArr, "<this>");
        return (i14 != runCount - 1 || z18) ? z18 ? layout.getPrimaryHorizontal(mVarArr[i14 - 1].f25646b) : layout.getPrimaryHorizontal(mVarArr[i14 + 1].f25646b) : layout.getLineRight(h10);
    }

    public final int d(int i13, boolean z13) {
        ArrayList arrayList = this.f25649b;
        int f13 = f0.f(arrayList, Integer.valueOf(i13));
        int i14 = f13 < 0 ? -(f13 + 1) : f13 + 1;
        if (z13 && i14 > 0) {
            int i15 = i14 - 1;
            if (i13 == ((Number) arrayList.get(i15)).intValue()) {
                return i15;
            }
        }
        return i14;
    }

    public final int e(int i13) {
        if (i13 == 0) {
            return 0;
        }
        return ((Number) this.f25649b.get(i13 - 1)).intValue();
    }

    public final int f(int i13, int i14) {
        while (i13 > i14) {
            char charAt = this.f25648a.getText().charAt(i13 - 1);
            if (charAt != ' ' && charAt != '\n' && charAt != 5760 && ((Intrinsics.i(charAt, 8192) < 0 || Intrinsics.i(charAt, 8202) > 0 || charAt == 8199) && charAt != 8287 && charAt != 12288)) {
                break;
            }
            i13--;
        }
        return i13;
    }
}
