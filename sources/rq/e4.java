package rq;

import android.text.Editable;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class e4 extends kotlin.jvm.internal.p implements kl2.o {
    @Override // kl2.o
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        Editable editable = (Editable) obj;
        j4 j4Var = (j4) this.receiver;
        if (editable != null) {
            i01.q qVar = j4Var.f109319s;
            if (qVar != null) {
                String text = editable.toString();
                kotlin.collections.q0 textTags = kotlin.collections.q0.f80391a;
                w01.m0 m0Var = (w01.m0) qVar;
                Intrinsics.checkNotNullParameter(text, "text");
                Intrinsics.checkNotNullParameter(textTags, "textTags");
                f30 f30Var = m0Var.f127062b;
                if (f30Var != null) {
                    mf0.l lVar = new mf0.l();
                    lVar.q7(((yk1.a) m0Var.f127071k).f139224a.getString(m60.x0.notification_uploading));
                    m0Var.f127070j.d(new of0.a(lVar));
                    String g13 = b40.g(f30Var);
                    String uid = f30Var.getUid();
                    Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                    String uid2 = f30Var.getUid();
                    Intrinsics.checkNotNullExpressionValue(uid2, "getUid(...)");
                    xj2.c F = m0Var.f127068h.b0(g13, uid, text, null, m0Var.f127074n.c(uid2), textTags, true).F(new w01.h(22, new w01.i0(m0Var, 0)), new w01.h(23, w01.j0.f127047j), new cp.b0(m0Var, 27), ck2.i.f27924d);
                    Intrinsics.checkNotNullExpressionValue(F, "subscribe(...)");
                    m0Var.addDisposable(F);
                }
            }
        } else {
            j4Var.getClass();
        }
        return Unit.f80348a;
    }
}
