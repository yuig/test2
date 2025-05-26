package c92;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import u50.i0;

/* loaded from: classes4.dex */
public final class o implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final i0 f27019a;

    /* renamed from: b, reason: collision with root package name */
    public final i0 f27020b;

    /* renamed from: c, reason: collision with root package name */
    public final i0 f27021c;

    /* renamed from: d, reason: collision with root package name */
    public final i0 f27022d;

    /* renamed from: e, reason: collision with root package name */
    public final int f27023e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f27024f;

    public o(i0 title, i0 header, i0 acceptButtonText, i0 cancelButtonText, int i13, ArrayList action) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(acceptButtonText, "acceptButtonText");
        Intrinsics.checkNotNullParameter(cancelButtonText, "cancelButtonText");
        Intrinsics.checkNotNullParameter(action, "action");
        this.f27019a = title;
        this.f27020b = header;
        this.f27021c = acceptButtonText;
        this.f27022d = cancelButtonText;
        this.f27023e = i13;
        this.f27024f = action;
    }

    public static o e(o oVar, ArrayList action) {
        i0 title = oVar.f27019a;
        i0 header = oVar.f27020b;
        i0 acceptButtonText = oVar.f27021c;
        i0 cancelButtonText = oVar.f27022d;
        int i13 = oVar.f27023e;
        oVar.getClass();
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(acceptButtonText, "acceptButtonText");
        Intrinsics.checkNotNullParameter(cancelButtonText, "cancelButtonText");
        Intrinsics.checkNotNullParameter(action, "action");
        return new o(title, header, acceptButtonText, cancelButtonText, i13, action);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return Intrinsics.d(this.f27019a, oVar.f27019a) && Intrinsics.d(this.f27020b, oVar.f27020b) && Intrinsics.d(this.f27021c, oVar.f27021c) && Intrinsics.d(this.f27022d, oVar.f27022d) && this.f27023e == oVar.f27023e && Intrinsics.d(this.f27024f, oVar.f27024f);
    }

    public final int hashCode() {
        return this.f27024f.hashCode() + ep.b.b(this.f27023e, ep.b.d(this.f27022d, ep.b.d(this.f27021c, ep.b.d(this.f27020b, this.f27019a.hashCode() * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        return "TargetHandshakeBottomSheetDisplayState(title=" + this.f27019a + ", header=" + this.f27020b + ", acceptButtonText=" + this.f27021c + ", cancelButtonText=" + this.f27022d + ", idSecondBrand=" + this.f27023e + ", action=" + this.f27024f + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ o(u50.k0 r10, u50.k0 r11, u50.k0 r12, u50.k0 r13, java.util.ArrayList r14, int r15) {
        /*
            r9 = this;
            r0 = r15 & 1
            u50.h0 r1 = u50.h0.f120562a
            if (r0 == 0) goto L8
            r3 = r1
            goto L9
        L8:
            r3 = r10
        L9:
            r10 = r15 & 2
            if (r10 == 0) goto Lf
            r4 = r1
            goto L10
        Lf:
            r4 = r11
        L10:
            r10 = r15 & 4
            if (r10 == 0) goto L16
            r5 = r1
            goto L17
        L16:
            r5 = r12
        L17:
            r10 = r15 & 8
            if (r10 == 0) goto L1d
            r6 = r1
            goto L1e
        L1d:
            r6 = r13
        L1e:
            r10 = r15 & 32
            if (r10 == 0) goto L27
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
        L27:
            r8 = r14
            r7 = 0
            r2 = r9
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c92.o.<init>(u50.k0, u50.k0, u50.k0, u50.k0, java.util.ArrayList, int):void");
    }
}
