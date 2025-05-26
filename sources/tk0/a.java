package tk0;

import kotlin.jvm.internal.Intrinsics;
import u50.j0;

/* loaded from: classes5.dex */
public final class a implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f117939a;

    /* renamed from: b, reason: collision with root package name */
    public final int f117940b;

    /* renamed from: c, reason: collision with root package name */
    public final u50.i0 f117941c;

    /* renamed from: d, reason: collision with root package name */
    public final u50.i0 f117942d;

    /* renamed from: e, reason: collision with root package name */
    public final u50.i0 f117943e;

    /* renamed from: f, reason: collision with root package name */
    public final u50.i0 f117944f;

    public a(boolean z13, int i13, u50.i0 title, u50.i0 subtitle, u50.i0 confirmText, u50.i0 cancelText) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(confirmText, "confirmText");
        Intrinsics.checkNotNullParameter(cancelText, "cancelText");
        this.f117939a = z13;
        this.f117940b = i13;
        this.f117941c = title;
        this.f117942d = subtitle;
        this.f117943e = confirmText;
        this.f117944f = cancelText;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [u50.i0] */
    public static a e(a aVar, boolean z13, int i13, j0 j0Var, int i14) {
        if ((i14 & 2) != 0) {
            i13 = aVar.f117940b;
        }
        int i15 = i13;
        u50.i0 title = aVar.f117941c;
        j0 j0Var2 = j0Var;
        if ((i14 & 8) != 0) {
            j0Var2 = aVar.f117942d;
        }
        j0 subtitle = j0Var2;
        u50.i0 confirmText = aVar.f117943e;
        u50.i0 cancelText = aVar.f117944f;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(confirmText, "confirmText");
        Intrinsics.checkNotNullParameter(cancelText, "cancelText");
        return new a(z13, i15, title, subtitle, confirmText, cancelText);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f117939a == aVar.f117939a && this.f117940b == aVar.f117940b && Intrinsics.d(this.f117941c, aVar.f117941c) && Intrinsics.d(this.f117942d, aVar.f117942d) && Intrinsics.d(this.f117943e, aVar.f117943e) && Intrinsics.d(this.f117944f, aVar.f117944f);
    }

    public final int hashCode() {
        return this.f117944f.hashCode() + ep.b.d(this.f117943e, ep.b.d(this.f117942d, ep.b.d(this.f117941c, ep.b.b(this.f117940b, Boolean.hashCode(this.f117939a) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        return "DeletePinsAlertDisplayState(show=" + this.f117939a + ", selectedPinCount=" + this.f117940b + ", title=" + this.f117941c + ", subtitle=" + this.f117942d + ", confirmText=" + this.f117943e + ", cancelText=" + this.f117944f + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public a(int r11) {
        /*
            r10 = this;
            int r11 = m60.x0.are_you_sure_text
            r0 = 0
            java.lang.String[] r1 = new java.lang.String[r0]
            java.lang.String r2 = "formatArgs"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            u50.k0 r6 = new u50.k0
            r6.<init>(r11, r1)
            int r11 = d70.f.delete_pins_warning_message
            java.lang.String[] r1 = new java.lang.String[r0]
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            u50.j0 r7 = new u50.j0
            java.util.List r1 = kotlin.collections.c0.b0(r1)
            r7.<init>(r11, r0, r1)
            int r11 = m60.x0.delete_confirm
            java.lang.String[] r1 = new java.lang.String[r0]
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            u50.k0 r8 = new u50.k0
            r8.<init>(r11, r1)
            int r11 = m60.x0.cancel
            java.lang.String[] r1 = new java.lang.String[r0]
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            u50.k0 r9 = new u50.k0
            r9.<init>(r11, r1)
            r4 = 0
            r5 = 0
            r3 = r10
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tk0.a.<init>(int):void");
    }
}
