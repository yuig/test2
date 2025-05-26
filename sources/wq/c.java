package wq;

import android.content.Context;
import android.widget.Switch;
import com.pinterest.api.model.wy0;
import java.util.HashSet;
import jc0.s;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import pg0.q;
import rq.a4;
import so.oa;
import x02.x2;

/* loaded from: classes3.dex */
public final class c implements no1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f130773a;

    public c(d dVar) {
        this.f130773a = dVar;
    }

    @Override // no1.a
    public final void onSuccess() {
        d dVar = this.f130773a;
        Switch r13 = dVar.f130786l;
        if (r13 != null && r13.isChecked()) {
            wy0 wy0Var = dVar.f130775a;
            if (wy0Var == null) {
                Intrinsics.r("userToReport");
                throw null;
            }
            if (!wy0Var.s2().booleanValue()) {
                x2 x2Var = (x2) q60.c.f102589a.getValue();
                wy0 wy0Var2 = dVar.f130775a;
                if (wy0Var2 == null) {
                    Intrinsics.r("userToReport");
                    throw null;
                }
                String str = dVar.f130777c;
                if (str == null) {
                    Intrinsics.r("conversationId");
                    throw null;
                }
                dVar.f130789o.a(x2Var.a0(wy0Var2, "message_report", str).o(new a4(21, b.f130770k), new a4(22, b.f130771l)));
            }
        }
        fp.b bVar = fp.b.f62753b;
        String contactRequestId = dVar.f130776b;
        if (contactRequestId == null) {
            Intrinsics.r("contactRequestId");
            throw null;
        }
        bVar.getClass();
        Intrinsics.checkNotNullParameter(contactRequestId, "contactRequestId");
        HashSet hashSet = bVar.f62754a;
        if (hashSet.contains(contactRequestId)) {
            String contactRequestId2 = dVar.f130776b;
            if (contactRequestId2 == null) {
                Intrinsics.r("contactRequestId");
                throw null;
            }
            Intrinsics.checkNotNullParameter(contactRequestId2, "contactRequestId");
            hashSet.remove(contactRequestId2);
        }
        Context context = kb0.a.f79058b;
        ((oa) ((j92.a) ep.b.g(j92.a.class))).E2().m(dVar.getResources().getString(p60.d.report_contact_request_toast));
        q qVar = new q();
        w wVar = dVar.f130780f;
        wVar.f(qVar);
        wVar.d(new s());
    }
}
