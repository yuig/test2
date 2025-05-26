package xm1;

import kotlin.jvm.internal.Intrinsics;
import u50.i0;

/* loaded from: classes5.dex */
public final class e implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final i0 f135363a;

    /* renamed from: b, reason: collision with root package name */
    public final i0 f135364b;

    /* renamed from: c, reason: collision with root package name */
    public final i0 f135365c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f135366d;

    /* renamed from: e, reason: collision with root package name */
    public final d f135367e;

    /* renamed from: f, reason: collision with root package name */
    public final g f135368f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f135369g;

    /* renamed from: h, reason: collision with root package name */
    public final i0 f135370h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f135371i;

    /* renamed from: j, reason: collision with root package name */
    public final int f135372j;

    public e(i0 title, i0 text, i0 actionButtonText, boolean z13, d buttonOrientation, g gVar, boolean z14, i0 i0Var, boolean z15, int i13) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(actionButtonText, "actionButtonText");
        Intrinsics.checkNotNullParameter(buttonOrientation, "buttonOrientation");
        this.f135363a = title;
        this.f135364b = text;
        this.f135365c = actionButtonText;
        this.f135366d = z13;
        this.f135367e = buttonOrientation;
        this.f135368f = gVar;
        this.f135369g = z14;
        this.f135370h = i0Var;
        this.f135371i = z15;
        this.f135372j = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.d(this.f135363a, eVar.f135363a) && Intrinsics.d(this.f135364b, eVar.f135364b) && Intrinsics.d(this.f135365c, eVar.f135365c) && this.f135366d == eVar.f135366d && this.f135367e == eVar.f135367e && this.f135368f == eVar.f135368f && this.f135369g == eVar.f135369g && Intrinsics.d(this.f135370h, eVar.f135370h) && this.f135371i == eVar.f135371i && this.f135372j == eVar.f135372j;
    }

    public final int hashCode() {
        int hashCode = (this.f135367e.hashCode() + ep.b.e(this.f135366d, ep.b.d(this.f135365c, ep.b.d(this.f135364b, this.f135363a.hashCode() * 31, 31), 31), 31)) * 31;
        g gVar = this.f135368f;
        int e13 = ep.b.e(this.f135369g, (hashCode + (gVar == null ? 0 : gVar.hashCode())) * 31, 31);
        i0 i0Var = this.f135370h;
        return Integer.hashCode(this.f135372j) + ep.b.e(this.f135371i, (e13 + (i0Var != null ? i0Var.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("DisplayState(title=");
        sb3.append(this.f135363a);
        sb3.append(", text=");
        sb3.append(this.f135364b);
        sb3.append(", actionButtonText=");
        sb3.append(this.f135365c);
        sb3.append(", withCancelButton=");
        sb3.append(this.f135366d);
        sb3.append(", buttonOrientation=");
        sb3.append(this.f135367e);
        sb3.append(", titleIcon=");
        sb3.append(this.f135368f);
        sb3.append(", withDismissIcon=");
        sb3.append(this.f135369g);
        sb3.append(", checkBoxLabel=");
        sb3.append(this.f135370h);
        sb3.append(", textAllowsLinks=");
        sb3.append(this.f135371i);
        sb3.append(", maxCheckboxLines=");
        return a.a.n(sb3, this.f135372j, ")");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public e(u50.i0 r14, u50.i0 r15, u50.i0 r16, boolean r17, xm1.d r18, xm1.g r19, boolean r20, u50.i0 r21, boolean r22, int r23, int r24) {
        /*
            r13 = this;
            r0 = r23
            r1 = r0 & 8
            if (r1 == 0) goto L9
            r1 = 1
            r6 = r1
            goto Lb
        L9:
            r6 = r17
        Lb:
            r1 = r0 & 16
            if (r1 == 0) goto L13
            xm1.d r1 = com.pinterest.gestalt.modalAlert.GestaltModalAlert.f49441o
            r7 = r1
            goto L15
        L13:
            r7 = r18
        L15:
            r1 = r0 & 32
            r2 = 0
            if (r1 == 0) goto L1e
            u50.f0 r1 = com.pinterest.gestalt.modalAlert.GestaltModalAlert.f49438l
            r8 = r2
            goto L20
        L1e:
            r8 = r19
        L20:
            r1 = r0 & 64
            r3 = 0
            if (r1 == 0) goto L27
            r9 = r3
            goto L29
        L27:
            r9 = r20
        L29:
            r1 = r0 & 128(0x80, float:1.8E-43)
            if (r1 == 0) goto L31
            u50.f0 r1 = com.pinterest.gestalt.modalAlert.GestaltModalAlert.f49438l
            r10 = r2
            goto L33
        L31:
            r10 = r21
        L33:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L39
            r11 = r3
            goto L3b
        L39:
            r11 = r22
        L3b:
            r12 = 1
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xm1.e.<init>(u50.i0, u50.i0, u50.i0, boolean, xm1.d, xm1.g, boolean, u50.i0, boolean, int, int):void");
    }
}
