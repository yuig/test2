package qr0;

import com.pinterest.api.model.b40;
import com.pinterest.api.model.d40;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.oc0;
import com.pinterest.api.model.v7;
import dl1.s;
import gb2.f;
import gb2.i;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import pk.a0;
import wa2.o;
import wa2.p;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: c, reason: collision with root package name */
    public static final List f104961c = Arrays.asList(p.STATE_UNDO_UNFOLLOWED_BOARD, p.STATE_UNDO_UNFOLLOWED_USER, p.STATE_UNDO_UNFOLLOWED_INTEREST, p.STATE_UNDO_FILTER_BOARD_PINS);

    /* renamed from: a, reason: collision with root package name */
    public final vq0.e f104962a;

    /* renamed from: b, reason: collision with root package name */
    public final b f104963b;

    public c(vq0.e eVar, b bVar) {
        this.f104962a = eVar;
        this.f104963b = bVar;
    }

    public final void a(String str, p pVar) {
        oc0 d63;
        v7 g13;
        p pVar2;
        vq0.e eVar = this.f104962a;
        int a13 = eVar.a();
        if (a0.x0(str) || a13 == 0) {
            return;
        }
        for (int i13 = 0; i13 < a13; i13++) {
            s sVar = (s) eVar.getItem(i13);
            if (sVar instanceof f30) {
                f30 f30Var = (f30) sVar;
                String str2 = "";
                switch (a.f104960a[pVar.ordinal()]) {
                    case 1:
                    case 2:
                        Set set = b40.f35967a;
                        String uid = (f30Var == null || (d63 = f30Var.d6()) == null || (g13 = d63.g()) == null) ? null : g13.getUid();
                        if (uid != null) {
                            str2 = uid;
                            break;
                        }
                        break;
                    case 3:
                    case 4:
                    case 5:
                        str2 = b40.i(f30Var);
                        break;
                    case 6:
                    case 7:
                    case 8:
                        str2 = b40.H(f30Var);
                        break;
                    case 9:
                    case 10:
                    case 11:
                        if (f30Var.t6() != null) {
                            str2 = f30Var.t6().getUid();
                            break;
                        }
                        break;
                    default:
                        str2 = f30Var.getUid();
                        break;
                }
                if (str.equals(str2)) {
                    if (f104961c.contains(pVar) || pVar == p.STATE_NO_FEEDBACK) {
                        b40.Z0(f30Var, d40.NOT_HIDDEN);
                        pVar2 = p.STATE_NO_FEEDBACK;
                    } else {
                        b40.Z0(f30Var, d40.COMPLETE_HIDDEN);
                        pVar2 = pVar;
                    }
                    String uid2 = f30Var.getUid();
                    f fVar = f.f64747a;
                    f.c(new i(uid2, pVar2, o.UI_ONLY));
                    this.f104963b.A1(i13, sVar);
                }
            }
        }
    }
}
