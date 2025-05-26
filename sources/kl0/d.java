package kl0;

import android.view.View;
import h32.u0;
import java.util.HashMap;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class d implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f80071a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f80072b;

    public /* synthetic */ d(z zVar, int i13) {
        this.f80071a = i13;
        this.f80072b = zVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i13 = this.f80071a;
        z this$0 = this.f80072b;
        switch (i13) {
            case 0:
                int i14 = z.f80128e2;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                com.pinterest.feature.board.detail.b bVar = this$0.f80145n1;
                if (bVar != null) {
                    ((hl0.v) bVar).N3();
                }
                com.pinterest.feature.board.detail.b bVar2 = this$0.f80145n1;
                if (bVar2 != null) {
                    ((hl0.v) bVar2).Z = false;
                }
                bs1.c.X0(view);
                break;
            case 1:
                int i15 = z.f80128e2;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.P7();
                lb0.o a13 = lb0.n.f82725d.a();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                lb0.m c13 = ((lb0.b) a13).c();
                c13.putStringSet("PREF_INVITES_SENT_USER_IDS", linkedHashSet);
                c13.apply();
                break;
            case 2:
                int i16 = z.f80128e2;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                com.pinterest.feature.board.detail.b bVar3 = this$0.f80145n1;
                if (bVar3 != null) {
                    ((hl0.v) bVar3).k4();
                    break;
                }
                break;
            case 3:
                int i17 = z.f80128e2;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                com.pinterest.feature.board.detail.b bVar4 = this$0.f80145n1;
                if (bVar4 != null) {
                    ((hl0.v) bVar4).f4();
                    break;
                }
                break;
            case 4:
                int i18 = z.f80128e2;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                com.pinterest.feature.board.detail.b bVar5 = this$0.f80145n1;
                if (bVar5 != null) {
                    ((hl0.v) bVar5).Z3();
                    break;
                }
                break;
            case 5:
                int i19 = z.f80128e2;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                com.pinterest.feature.board.detail.b bVar6 = this$0.f80145n1;
                if (bVar6 != null) {
                    ((hl0.v) bVar6).j4();
                    break;
                }
                break;
            case 6:
                int i23 = z.f80128e2;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                com.pinterest.feature.board.detail.b bVar7 = this$0.f80145n1;
                if (bVar7 != null) {
                    ((hl0.v) bVar7).d4();
                    break;
                }
                break;
            case 7:
                int i24 = z.f80128e2;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                nx.d0 s73 = this$0.s7();
                u0 u0Var = u0.BOARD_HEADER_IMAGE;
                HashMap hashMap = new HashMap();
                hashMap.put("board_id", this$0.n9());
                com.pinterest.feature.board.detail.b bVar8 = this$0.f80145n1;
                bs1.c.G1("board_session_id", bVar8 != null ? ((hl0.v) bVar8).f69511b : null, hashMap);
                com.pinterest.feature.board.detail.b bVar9 = this$0.f80145n1;
                hashMap.put("board_pin_count", String.valueOf(bVar9 != null ? Integer.valueOf(((hl0.v) bVar9).F3()) : null));
                Unit unit = Unit.f80348a;
                s73.Z(u0Var, hashMap);
                break;
            case 8:
                int i25 = z.f80128e2;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.f7().d(new yb0.c(yb0.d.CONFIRM_BUTTON_CLICK));
                com.pinterest.feature.board.detail.b bVar10 = this$0.f80145n1;
                if (bVar10 != null) {
                    ((hl0.v) bVar10).X3();
                    break;
                }
                break;
            default:
                int i26 = z.f80128e2;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.f7().d(new yb0.c(yb0.d.CONFIRM_BUTTON_CLICK));
                com.pinterest.feature.board.detail.b bVar11 = this$0.f80145n1;
                if (bVar11 != null) {
                    ((hl0.v) bVar11).Y3();
                    break;
                }
                break;
        }
    }
}
