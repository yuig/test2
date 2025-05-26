package vq;

import kotlin.jvm.internal.Intrinsics;
import m60.u;

/* loaded from: classes3.dex */
public final class b implements no1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f126397a;

    public b(c cVar) {
        this.f126397a = cVar;
    }

    @Override // no1.a
    public final void a() {
        int i13 = c.f126398p0;
        c cVar = this.f126397a;
        if (cVar.E4() != null && cVar.isAdded()) {
            i92.k kVar = cVar.f126408o0;
            if (kVar == null) {
                Intrinsics.r("toastUtils");
                throw null;
            }
            kVar.i(cVar.getString(xc0.i.report_conversation_fail));
        }
        cVar.N6(false, false);
    }

    @Override // no1.a
    public final void onSuccess() {
        c cVar = this.f126397a;
        i92.k kVar = cVar.f126408o0;
        if (kVar == null) {
            Intrinsics.r("toastUtils");
            throw null;
        }
        kVar.m(cVar.getString(w02.b.report_confirmation_toast_message));
        u.f85943a.d(new kp.h());
        cVar.N6(false, false);
    }
}
