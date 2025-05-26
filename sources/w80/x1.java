package w80;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class x1 implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final w1 f128420a;

    /* renamed from: b, reason: collision with root package name */
    public final w1 f128421b;

    /* renamed from: c, reason: collision with root package name */
    public final w1 f128422c;

    /* renamed from: d, reason: collision with root package name */
    public final w1 f128423d;

    /* renamed from: e, reason: collision with root package name */
    public final w1 f128424e;

    /* renamed from: f, reason: collision with root package name */
    public final u50.i0 f128425f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f128426g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f128427h;

    static {
        w1 w1Var = w1.f128400c;
        new x1(w1Var, w1Var, w1Var, w1Var, w1Var, RecyclerViewTypes.VIEW_TYPE_FIXED_HEIGHT_PIN_GRID_CELL);
        w1 w1Var2 = w1.f128401d;
        new x1(w1Var2, w1Var2, w1Var2, w1Var2, w1Var2, RecyclerViewTypes.VIEW_TYPE_FIXED_HEIGHT_PIN_GRID_CELL);
        w1 w1Var3 = w1.f128402e;
        new x1(w1Var3, w1Var3, w1Var3, w1Var3, w1Var3, RecyclerViewTypes.VIEW_TYPE_FIXED_HEIGHT_PIN_GRID_CELL);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ x1(w80.w1 r12, w80.w1 r13, w80.w1 r14, w80.w1 r15, w80.w1 r16, int r17) {
        /*
            r11 = this;
            r0 = r17 & 1
            w80.w1 r1 = w80.w1.f128400c
            if (r0 == 0) goto L8
            r3 = r1
            goto L9
        L8:
            r3 = r12
        L9:
            r0 = r17 & 2
            w80.w1 r2 = w80.w1.f128402e
            if (r0 == 0) goto L11
            r4 = r2
            goto L12
        L11:
            r4 = r13
        L12:
            r0 = r17 & 4
            if (r0 == 0) goto L18
            r5 = r2
            goto L19
        L18:
            r5 = r14
        L19:
            r0 = r17 & 8
            if (r0 == 0) goto L1f
            r6 = r1
            goto L20
        L1f:
            r6 = r15
        L20:
            r0 = r17 & 16
            if (r0 == 0) goto L26
            r7 = r1
            goto L28
        L26:
            r7 = r16
        L28:
            u50.h0 r8 = u50.h0.f120562a
            r10 = 0
            r9 = 1
            r2 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w80.x1.<init>(w80.w1, w80.w1, w80.w1, w80.w1, w80.w1, int):void");
    }

    public static x1 e(x1 x1Var, w1 w1Var, w1 w1Var2, w1 w1Var3, w1 w1Var4, w1 w1Var5, u50.i0 i0Var, boolean z13, boolean z14, int i13) {
        w1 exitAction = (i13 & 1) != 0 ? x1Var.f128420a : w1Var;
        w1 undoAction = (i13 & 2) != 0 ? x1Var.f128421b : w1Var2;
        w1 redoAction = (i13 & 4) != 0 ? x1Var.f128422c : w1Var3;
        w1 moreAction = (i13 & 8) != 0 ? x1Var.f128423d : w1Var4;
        w1 nextAction = (i13 & 16) != 0 ? x1Var.f128424e : w1Var5;
        u50.i0 nextActionLabel = (i13 & 32) != 0 ? x1Var.f128425f : i0Var;
        boolean z15 = (i13 & 64) != 0 ? x1Var.f128426g : z13;
        boolean z16 = (i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? x1Var.f128427h : z14;
        x1Var.getClass();
        Intrinsics.checkNotNullParameter(exitAction, "exitAction");
        Intrinsics.checkNotNullParameter(undoAction, "undoAction");
        Intrinsics.checkNotNullParameter(redoAction, "redoAction");
        Intrinsics.checkNotNullParameter(moreAction, "moreAction");
        Intrinsics.checkNotNullParameter(nextAction, "nextAction");
        Intrinsics.checkNotNullParameter(nextActionLabel, "nextActionLabel");
        return new x1(exitAction, undoAction, redoAction, moreAction, nextAction, nextActionLabel, z15, z16);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x1)) {
            return false;
        }
        x1 x1Var = (x1) obj;
        return Intrinsics.d(this.f128420a, x1Var.f128420a) && Intrinsics.d(this.f128421b, x1Var.f128421b) && Intrinsics.d(this.f128422c, x1Var.f128422c) && Intrinsics.d(this.f128423d, x1Var.f128423d) && Intrinsics.d(this.f128424e, x1Var.f128424e) && Intrinsics.d(this.f128425f, x1Var.f128425f) && this.f128426g == x1Var.f128426g && this.f128427h == x1Var.f128427h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f128427h) + ep.b.e(this.f128426g, ep.b.d(this.f128425f, (this.f128424e.hashCode() + ((this.f128423d.hashCode() + ((this.f128422c.hashCode() + ((this.f128421b.hashCode() + (this.f128420a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("TopBarDisplayState(exitAction=");
        sb3.append(this.f128420a);
        sb3.append(", undoAction=");
        sb3.append(this.f128421b);
        sb3.append(", redoAction=");
        sb3.append(this.f128422c);
        sb3.append(", moreAction=");
        sb3.append(this.f128423d);
        sb3.append(", nextAction=");
        sb3.append(this.f128424e);
        sb3.append(", nextActionLabel=");
        sb3.append(this.f128425f);
        sb3.append(", visible=");
        sb3.append(this.f128426g);
        sb3.append(", usePlaceholderIfEmpty=");
        return a.a.r(sb3, this.f128427h, ")");
    }

    public x1(w1 exitAction, w1 undoAction, w1 redoAction, w1 moreAction, w1 nextAction, u50.i0 nextActionLabel, boolean z13, boolean z14) {
        Intrinsics.checkNotNullParameter(exitAction, "exitAction");
        Intrinsics.checkNotNullParameter(undoAction, "undoAction");
        Intrinsics.checkNotNullParameter(redoAction, "redoAction");
        Intrinsics.checkNotNullParameter(moreAction, "moreAction");
        Intrinsics.checkNotNullParameter(nextAction, "nextAction");
        Intrinsics.checkNotNullParameter(nextActionLabel, "nextActionLabel");
        this.f128420a = exitAction;
        this.f128421b = undoAction;
        this.f128422c = redoAction;
        this.f128423d = moreAction;
        this.f128424e = nextAction;
        this.f128425f = nextActionLabel;
        this.f128426g = z13;
        this.f128427h = z14;
    }
}
