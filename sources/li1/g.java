package li1;

import android.content.Context;
import android.os.Bundle;
import ao2.j0;
import com.pinterest.component.modal.BaseModalViewWrapper;
import com.pinterest.component.modal.ModalViewWrapper;
import h32.a4;
import h32.d4;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import so.j5;
import so.oa;
import so.r8;
import so.s8;
import zy.q0;

/* loaded from: classes5.dex */
public final class g extends jc0.b {

    /* renamed from: a, reason: collision with root package name */
    public final String f83546a;

    /* renamed from: b, reason: collision with root package name */
    public final d4 f83547b;

    /* renamed from: c, reason: collision with root package name */
    public final a4 f83548c;

    /* renamed from: d, reason: collision with root package name */
    public final j0 f83549d;

    /* renamed from: e, reason: collision with root package name */
    public j f83550e;

    public g(a4 a4Var, d4 d4Var, String pinUid, ho2.c scope) {
        Intrinsics.checkNotNullParameter(pinUid, "pinUid");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f83546a = pinUid;
        this.f83547b = d4Var;
        this.f83548c = a4Var;
        this.f83549d = scope;
    }

    @Override // jc0.b
    public final BaseModalViewWrapper createModalView(Context context, Bundle bundle) {
        Intrinsics.checkNotNullParameter(context, "context");
        j jVar = new j(context);
        Intrinsics.checkNotNullParameter(jVar, "<set-?>");
        this.f83550e = jVar;
        ModalViewWrapper modalViewWrapper = new ModalViewWrapper(context);
        modalViewWrapper.setBackgroundColor(dl2.b.x0(context, eo1.a.sema_color_background_transparent));
        j jVar2 = this.f83550e;
        if (jVar2 != null) {
            modalViewWrapper.t(jVar2);
            return modalViewWrapper;
        }
        Intrinsics.r("weightLossOptOutModalView");
        throw null;
    }

    @Override // jc0.a0
    public final void onAboutToDismiss() {
        dl2.b.E(this.f83549d, null);
    }

    @Override // jc0.a0
    public final void onModalContentContainerCreated() {
        j jVar = this.f83550e;
        if (jVar == null) {
            Intrinsics.r("weightLossOptOutModalView");
            throw null;
        }
        r8 r8Var = ((j5) ((s8) ((d) me.o.a(bs1.c.m0(jVar), d.class))).Ed.get()).f113477a;
        b60.b bVar = (b60.b) r8Var.f114090a.f113850p0.get();
        oa oaVar = r8Var.f114090a;
        m C4 = a02.e.C4(oaVar.f113620c, (x10.d) oaVar.f113997x5.get(), (w) oaVar.f113885r0.get(), (i92.k) oaVar.f113921t1.get(), (q0) oaVar.Nb.get(), (j0) oaVar.G0.get());
        r rVar = new r(this.f83546a, this.f83549d, this.f83547b, this.f83548c, bVar, C4);
        j jVar2 = this.f83550e;
        if (jVar2 == null) {
            Intrinsics.r("weightLossOptOutModalView");
            throw null;
        }
        l82.c eventIntake = rVar.f83581a.e();
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        jVar2.f83557a = eventIntake;
        kotlin.jvm.internal.j.z(this.f83549d, null, null, new f(rVar, this, null), 3);
    }
}
