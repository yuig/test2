package yb0;

import android.content.Context;
import android.view.View;
import com.pinterest.component.alert.AlertContainer;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m60.t;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import u50.h0;
import u50.i0;

/* loaded from: classes.dex */
public final class j implements t {

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f138489a;

    /* renamed from: b, reason: collision with root package name */
    public final Function0 f138490b;

    public j(Function0 alertContainerProvider, Function1 removeStickyEvent) {
        Intrinsics.checkNotNullParameter(removeStickyEvent, "removeStickyEvent");
        Intrinsics.checkNotNullParameter(alertContainerProvider, "alertContainerProvider");
        this.f138489a = removeStickyEvent;
        this.f138490b = alertContainerProvider;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull c e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        ((AlertContainer) this.f138490b.invoke()).b(e13.f138475a);
    }

    @sp2.k(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull e e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        this.f138489a.invoke(e13);
        ((AlertContainer) this.f138490b.invoke()).c(e13.f138476a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x005f  */
    @sp2.k(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onEventMainThread(@org.jetbrains.annotations.NotNull final yb0.f r10) {
        /*
            r9 = this;
            java.lang.String r0 = "e"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            kotlin.jvm.functions.Function0 r1 = r9.f138490b
            java.lang.Object r1 = r1.invoke()
            com.pinterest.component.alert.AlertContainer r1 = (com.pinterest.component.alert.AlertContainer) r1
            r1.getClass()
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            yb0.n r0 = new yb0.n
            android.content.Context r2 = r1.getContext()
            java.lang.String r3 = "getContext(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            r0.<init>(r2)
            u50.i0 r2 = r10.f138477a
            android.content.Context r4 = r1.getContext()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r3)
            java.lang.CharSequence r2 = r2.a(r4)
            java.lang.String r2 = r2.toString()
            r4 = 0
            u50.i0 r5 = r10.f138478b
            if (r5 == 0) goto L49
            android.content.Context r6 = r1.getContext()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r3)
            java.lang.CharSequence r5 = r5.a(r6)
            if (r5 == 0) goto L49
            java.lang.String r5 = r5.toString()
            goto L4a
        L49:
            r5 = r4
        L4a:
            android.content.Context r6 = r1.getContext()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r3)
            u50.i0 r7 = r10.f138479c
            java.lang.CharSequence r6 = r7.a(r6)
            java.lang.String r6 = r6.toString()
            u50.i0 r7 = r10.f138480d
            if (r7 == 0) goto L70
            android.content.Context r8 = r1.getContext()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r3)
            java.lang.CharSequence r3 = r7.a(r8)
            if (r3 == 0) goto L70
            java.lang.String r4 = r3.toString()
        L70:
            int r3 = r2.length()
            if (r3 <= 0) goto L79
            r0.w(r2)
        L79:
            if (r5 == 0) goto L85
            int r2 = r5.length()
            if (r2 != 0) goto L82
            goto L85
        L82:
            r0.u(r5)
        L85:
            int r2 = r6.length()
            yb0.h r3 = r10.f138481e
            if (r2 <= 0) goto L9b
            r0.q(r6)
            if (r3 == 0) goto L9b
            yb0.a r2 = new yb0.a
            r5 = 0
            r2.<init>()
            r0.p(r2)
        L9b:
            if (r4 == 0) goto Lb3
            int r2 = r4.length()
            if (r2 != 0) goto La4
            goto Lb3
        La4:
            r0.m(r4)
            if (r3 == 0) goto Lbc
            yb0.a r2 = new yb0.a
            r3 = 1
            r2.<init>()
            r0.l(r2)
            goto Lbc
        Lb3:
            com.pinterest.gestalt.buttongroup.GestaltButtonGroup r2 = r0.h()
            fm1.c r3 = fm1.c.GONE
            kh2.r.t(r2, r3)
        Lbc:
            boolean r10 = r10.f138482f
            r0.k(r10)
            r1.c(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yb0.j.onEventMainThread(yb0.f):void");
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull g e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        AlertContainer alertContainer = (AlertContainer) this.f138490b.invoke();
        alertContainer.getClass();
        Intrinsics.checkNotNullParameter(e13, "e");
        i0 i0Var = e13.f138483a;
        i0 i0Var2 = e13.f138484b;
        if (i0Var2 == null) {
            i0Var2 = h0.f120562a;
        }
        o oVar = new o(i0Var, i0Var2, e13.f138485c, true, false, e13.f138487e, 3, 304);
        Context context = alertContainer.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        p pVar = new p(context, oVar);
        pVar.f(new b(e13, 0));
        alertContainer.c(pVar);
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull final zb0.o alert) {
        Intrinsics.checkNotNullParameter(alert, "e");
        AlertContainer alertContainer = (AlertContainer) this.f138490b.invoke();
        alertContainer.getClass();
        Intrinsics.checkNotNullParameter(alert, "alert");
        Context context = alertContainer.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        alert.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        n a13 = alert.a(context);
        final int i13 = 0;
        a13.p(new View.OnClickListener() { // from class: zb0.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i14 = i13;
                o this$0 = alert;
                switch (i14) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.f141575a.invoke();
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.f141576b.invoke();
                        break;
                }
            }
        });
        final int i14 = 1;
        a13.l(new View.OnClickListener() { // from class: zb0.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i142 = i14;
                o this$0 = alert;
                switch (i142) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.f141575a.invoke();
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.f141576b.invoke();
                        break;
                }
            }
        });
        a13.t(alert.f141577c);
        a13.s(alert.f141578d);
        alertContainer.c(a13);
    }
}
