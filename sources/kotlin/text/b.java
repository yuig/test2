package kotlin.text;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* loaded from: classes4.dex */
public final class b implements Iterator, ll2.a {

    /* renamed from: a, reason: collision with root package name */
    public int f80471a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f80472b;

    /* renamed from: c, reason: collision with root package name */
    public int f80473c;

    /* renamed from: d, reason: collision with root package name */
    public IntRange f80474d;

    /* renamed from: e, reason: collision with root package name */
    public int f80475e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c f80476f;

    public b(c cVar) {
        this.f80476f = cVar;
        int g13 = ql2.s.g(cVar.f80480b, 0, cVar.f80479a.length());
        this.f80472b = g13;
        this.f80473c = g13;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0018, code lost:
    
        if (r6 < r3) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b() {
        /*
            r7 = this;
            int r0 = r7.f80473c
            r1 = 0
            if (r0 >= 0) goto Lb
            r7.f80471a = r1
            r0 = 0
            r7.f80474d = r0
            goto L7b
        Lb:
            kotlin.text.c r2 = r7.f80476f
            int r3 = r2.f80481c
            r4 = -1
            r5 = 1
            if (r3 <= 0) goto L1a
            int r6 = r7.f80475e
            int r6 = r6 + r5
            r7.f80475e = r6
            if (r6 >= r3) goto L22
        L1a:
            java.lang.CharSequence r3 = r2.f80479a
            int r3 = r3.length()
            if (r0 <= r3) goto L34
        L22:
            kotlin.ranges.IntRange r0 = new kotlin.ranges.IntRange
            int r1 = r7.f80472b
            java.lang.CharSequence r2 = r2.f80479a
            int r2 = kotlin.text.StringsKt.I(r2)
            r0.<init>(r1, r2, r5)
            r7.f80474d = r0
            r7.f80473c = r4
            goto L79
        L34:
            kotlin.jvm.functions.Function2 r0 = r2.f80482d
            java.lang.CharSequence r3 = r2.f80479a
            int r6 = r7.f80473c
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object r0 = r0.invoke(r3, r6)
            kotlin.Pair r0 = (kotlin.Pair) r0
            if (r0 != 0) goto L58
            kotlin.ranges.IntRange r0 = new kotlin.ranges.IntRange
            int r1 = r7.f80472b
            java.lang.CharSequence r2 = r2.f80479a
            int r2 = kotlin.text.StringsKt.I(r2)
            r0.<init>(r1, r2, r5)
            r7.f80474d = r0
            r7.f80473c = r4
            goto L79
        L58:
            java.lang.Object r2 = r0.f80346a
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            java.lang.Object r0 = r0.f80347b
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r3 = r7.f80472b
            kotlin.ranges.IntRange r3 = ql2.s.q(r3, r2)
            r7.f80474d = r3
            int r2 = r2 + r0
            r7.f80472b = r2
            if (r0 != 0) goto L76
            r1 = r5
        L76:
            int r2 = r2 + r1
            r7.f80473c = r2
        L79:
            r7.f80471a = r5
        L7b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.b.b():void");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f80471a == -1) {
            b();
        }
        return this.f80471a == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f80471a == -1) {
            b();
        }
        if (this.f80471a == 0) {
            throw new NoSuchElementException();
        }
        IntRange intRange = this.f80474d;
        Intrinsics.g(intRange, "null cannot be cast to non-null type kotlin.ranges.IntRange");
        this.f80474d = null;
        this.f80471a = -1;
        return intRange;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
