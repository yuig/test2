package qf1;

import com.pinterest.api.model.f30;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f103678i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i0 f103679j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g0(i0 i0Var, int i13) {
        super(1);
        this.f103678i = i13;
        this.f103679j = i0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(com.pinterest.api.model.f30 r13) {
        /*
            r12 = this;
            int r0 = r12.f103678i
            qf1.i0 r1 = r12.f103679j
            switch(r0) {
                case 3: goto L19;
                default: goto L7;
            }
        L7:
            r1.d()
            kotlin.jvm.internal.Intrinsics.f(r13)
            y32.f r0 = y32.f.CLOSEOUP_OVERFLOW
            int r0 = r0.getValue()
            androidx.appcompat.widget.c2 r1 = r1.f103712w
            r1.q(r0, r13)
            return
        L19:
            r1.d()
            nx.d0 r0 = r1.f103690a
            h32.i0 r2 = r0.p()
            r3 = 0
            if (r2 == 0) goto L32
            h32.a4 r4 = r2.f67082b
            if (r4 == 0) goto L32
            java.lang.String r4 = r4.name()
            if (r4 != 0) goto L30
            goto L32
        L30:
            r7 = r4
            goto L3e
        L32:
            if (r2 == 0) goto L3d
            h32.d4 r2 = r2.f67081a
            if (r2 == 0) goto L3d
            java.lang.String r4 = r2.name()
            goto L30
        L3d:
            r7 = r3
        L3e:
            h32.i0 r0 = r0.p()
            kotlin.jvm.internal.Intrinsics.f(r13)
            if (r0 == 0) goto L4e
            h32.d4 r2 = r0.f67081a
            if (r2 != 0) goto L4c
            goto L4e
        L4c:
            r8 = r2
            goto L51
        L4e:
            h32.d4 r2 = h32.d4.STORY_PIN
            goto L4c
        L51:
            if (r0 == 0) goto L55
            h32.a4 r3 = r0.f67082b
        L55:
            r9 = r3
            nx.d1 r0 = r1.f103698i
            java.lang.String r10 = r0.b(r13)
            r11 = 0
            m60.w r5 = r1.f103693d
            r6 = r13
            g02.a.c(r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qf1.g0.b(com.pinterest.api.model.f30):void");
    }

    public final void e(Integer num) {
        int i13 = this.f103678i;
        i0 i0Var = this.f103679j;
        switch (i13) {
            case 1:
                i92.k kVar = i0Var.f103694e;
                Intrinsics.f(num);
                kVar.k(num.intValue());
                i0Var.d();
                break;
            default:
                i92.k kVar2 = i0Var.f103694e;
                Intrinsics.f(num);
                kVar2.k(num.intValue());
                i0Var.d();
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f103678i) {
            case 0:
                xj2.c disposable = (xj2.c) obj;
                Intrinsics.checkNotNullParameter(disposable, "disposable");
                this.f103679j.f103691b.a(disposable);
                break;
            case 1:
                e((Integer) obj);
                break;
            case 2:
                e((Integer) obj);
                break;
            case 3:
                b((f30) obj);
                break;
            default:
                b((f30) obj);
                break;
        }
        return Unit.f80348a;
    }
}
