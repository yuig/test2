package pp1;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import u50.i0;

/* loaded from: classes5.dex */
public final class n implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final i0 f100936a;

    /* renamed from: b, reason: collision with root package name */
    public final i0 f100937b;

    /* renamed from: c, reason: collision with root package name */
    public final i0 f100938c;

    /* renamed from: d, reason: collision with root package name */
    public final i0 f100939d;

    /* renamed from: e, reason: collision with root package name */
    public final int f100940e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f100941f;

    public n(i0 title, i0 header, i0 acceptButtonText, i0 cancelButtonText, int i13, ArrayList action) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(acceptButtonText, "acceptButtonText");
        Intrinsics.checkNotNullParameter(cancelButtonText, "cancelButtonText");
        Intrinsics.checkNotNullParameter(action, "action");
        this.f100936a = title;
        this.f100937b = header;
        this.f100938c = acceptButtonText;
        this.f100939d = cancelButtonText;
        this.f100940e = i13;
        this.f100941f = action;
    }

    public static n e(n nVar, ArrayList action) {
        i0 title = nVar.f100936a;
        i0 header = nVar.f100937b;
        i0 acceptButtonText = nVar.f100938c;
        i0 cancelButtonText = nVar.f100939d;
        int i13 = nVar.f100940e;
        nVar.getClass();
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(acceptButtonText, "acceptButtonText");
        Intrinsics.checkNotNullParameter(cancelButtonText, "cancelButtonText");
        Intrinsics.checkNotNullParameter(action, "action");
        return new n(title, header, acceptButtonText, cancelButtonText, i13, action);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Intrinsics.d(this.f100936a, nVar.f100936a) && Intrinsics.d(this.f100937b, nVar.f100937b) && Intrinsics.d(this.f100938c, nVar.f100938c) && Intrinsics.d(this.f100939d, nVar.f100939d) && this.f100940e == nVar.f100940e && Intrinsics.d(this.f100941f, nVar.f100941f);
    }

    public final int hashCode() {
        return this.f100941f.hashCode() + ep.b.b(this.f100940e, ep.b.d(this.f100939d, ep.b.d(this.f100938c, ep.b.d(this.f100937b, this.f100936a.hashCode() * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        return "HandshakeBottomSheetDisplayState(title=" + this.f100936a + ", header=" + this.f100937b + ", acceptButtonText=" + this.f100938c + ", cancelButtonText=" + this.f100939d + ", idSecondBrand=" + this.f100940e + ", action=" + this.f100941f + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ n(u50.k0 r10, u50.k0 r11, u50.k0 r12, u50.k0 r13, java.util.ArrayList r14, int r15) {
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
        throw new UnsupportedOperationException("Method not decompiled: pp1.n.<init>(u50.k0, u50.k0, u50.k0, u50.k0, java.util.ArrayList, int):void");
    }
}
