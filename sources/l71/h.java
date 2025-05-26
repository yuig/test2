package l71;

import java.util.Set;
import kotlin.collections.g1;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import wt1.e0;

/* loaded from: classes5.dex */
public final class h extends e0 {

    /* renamed from: h, reason: collision with root package name */
    public final Function0 f81947h;

    /* renamed from: i, reason: collision with root package name */
    public final Function0 f81948i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f81949j;

    /* renamed from: k, reason: collision with root package name */
    public final int f81950k;

    public h(Function0 queryChangeSubject, Function0 trackedListItemCount, boolean z13, int i13) {
        Intrinsics.checkNotNullParameter(queryChangeSubject, "queryChangeSubject");
        Intrinsics.checkNotNullParameter(trackedListItemCount, "trackedListItemCount");
        this.f81947h = queryChangeSubject;
        this.f81948i = trackedListItemCount;
        this.f81949j = z13;
        this.f81950k = i13;
    }

    @Override // wt1.e0, vq0.f
    public final Set X1() {
        return g1.b(Integer.valueOf(this.f81950k));
    }

    @Override // sq0.e0
    public final int getItemViewType(int i13) {
        return this.f81950k;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003b, code lost:
    
        if ((r0 ? ((java.lang.Number) r2.invoke()).intValue() - a() : ((java.lang.Number) r2.invoke()).intValue()) <= 0) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void u() {
        /*
            r3 = this;
            kotlin.jvm.functions.Function0 r0 = r3.f81947h
            java.lang.Object r0 = r0.invoke()
            uk2.d r0 = (uk2.d) r0
            if (r0 == 0) goto L54
            java.lang.Object r0 = r0.S()
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L13
            goto L54
        L13:
            boolean r0 = kotlin.text.z.j(r0)
            r1 = 1
            r0 = r0 ^ r1
            if (r0 == 0) goto L3e
            boolean r0 = r3.f81949j
            kotlin.jvm.functions.Function0 r2 = r3.f81948i
            if (r0 == 0) goto L31
            java.lang.Object r0 = r2.invoke()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r2 = r3.a()
            int r0 = r0 - r2
            goto L3b
        L31:
            java.lang.Object r0 = r2.invoke()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
        L3b:
            if (r0 > 0) goto L3e
            goto L3f
        L3e:
            r1 = 0
        L3f:
            if (r1 == 0) goto L48
            int r0 = r3.a()
            if (r0 <= 0) goto L48
            return
        L48:
            kotlin.collections.q0 r0 = kotlin.collections.q0.f80391a
            r3.k(r0)
            if (r1 == 0) goto L54
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r3.j2(r0)
        L54:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l71.h.u():void");
    }
}
