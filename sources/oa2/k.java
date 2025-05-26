package oa2;

import com.pinterest.ui.components.users.LegoUserRep;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import m60.v0;

/* loaded from: classes4.dex */
public final class k extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f93917i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ LegoUserRep f93918j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(LegoUserRep legoUserRep, int i13) {
        super(0);
        this.f93917i = i13;
        this.f93918j = legoUserRep;
    }

    public final androidx.constraintlayout.widget.p b() {
        int i13 = this.f93917i;
        LegoUserRep legoUserRep = this.f93918j;
        switch (i13) {
            case 0:
                return LegoUserRep.T(legoUserRep, v0.lego_user_rep_compact_constraints);
            case 1:
                return LegoUserRep.T(legoUserRep, v0.lego_user_rep_content_list_card_constraints);
            case 2:
                return LegoUserRep.T(legoUserRep, v0.lego_user_rep_content_list_constraints);
            case 3:
                return LegoUserRep.T(legoUserRep, v0.lego_user_rep_content_list_wide_constraints);
            case 4:
                return LegoUserRep.T(legoUserRep, v0.lego_user_rep_default_constraints);
            case 5:
                return LegoUserRep.T(legoUserRep, v0.lego_user_rep_list_constraints);
            case 6:
                return LegoUserRep.T(legoUserRep, v0.lego_user_rep_no_preview_constraints);
            default:
                return LegoUserRep.T(legoUserRep, v0.lego_user_rep_wide_constraints);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f93917i) {
            case 0:
                return b();
            case 1:
                return b();
            case 2:
                return b();
            case 3:
                return b();
            case 4:
                return b();
            case 5:
                return b();
            case 6:
                return b();
            case 7:
                m196invoke();
                return Unit.f80348a;
            case 8:
                m196invoke();
                return Unit.f80348a;
            case 9:
                m196invoke();
                return Unit.f80348a;
            case 10:
                m196invoke();
                return Unit.f80348a;
            default:
                return b();
        }
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m196invoke() {
        int i13 = this.f93917i;
        LegoUserRep legoUserRep = this.f93918j;
        switch (i13) {
            case 7:
                s sVar = legoUserRep.f52353m;
                if (sVar != null) {
                    sVar.a0();
                    break;
                }
                break;
            case 8:
                s sVar2 = legoUserRep.f52353m;
                if (sVar2 != null) {
                    sVar2.G1();
                    break;
                }
                break;
            case 9:
                s sVar3 = legoUserRep.f52353m;
                if (sVar3 != null) {
                    sVar3.l1();
                    break;
                }
                break;
            default:
                s sVar4 = legoUserRep.f52353m;
                if (sVar4 != null) {
                    sVar4.k();
                    break;
                }
                break;
        }
    }
}
