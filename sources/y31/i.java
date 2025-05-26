package y31;

import com.pinterest.feature.profile.header.UserProfileHeader;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class i extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f136800i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ UserProfileHeader f136801j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(UserProfileHeader userProfileHeader, int i13) {
        super(0);
        this.f136800i = i13;
        this.f136801j = userProfileHeader;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        u uVar = u.f136857a;
        b0 b0Var = b0.f136776a;
        UserProfileHeader userProfileHeader = this.f136801j;
        int i13 = this.f136800i;
        switch (i13) {
            case 0:
                switch (i13) {
                    case 0:
                        u50.r rVar = userProfileHeader.f47531q;
                        if (rVar != null) {
                            rVar.a(uVar);
                            break;
                        }
                        break;
                    default:
                        u50.r rVar2 = userProfileHeader.f47531q;
                        if (rVar2 != null) {
                            rVar2.a(b0Var);
                            break;
                        }
                        break;
                }
                break;
            default:
                switch (i13) {
                    case 0:
                        u50.r rVar3 = userProfileHeader.f47531q;
                        if (rVar3 != null) {
                            rVar3.a(uVar);
                            break;
                        }
                        break;
                    default:
                        u50.r rVar4 = userProfileHeader.f47531q;
                        if (rVar4 != null) {
                            rVar4.a(b0Var);
                            break;
                        }
                        break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
