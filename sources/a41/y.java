package a41;

import android.content.Context;
import androidx.appcompat.widget.c2;
import com.pinterest.api.model.wy0;
import h32.f1;
import h32.u0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import x02.a2;
import x02.x2;

/* loaded from: classes5.dex */
public final class y extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f697i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d0 f698j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ wy0 f699k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(d0 d0Var, wy0 wy0Var, int i13) {
        super(0);
        this.f697i = i13;
        this.f698j = d0Var;
        this.f699k = wy0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f697i) {
            case 0:
                m3invoke();
                break;
            case 1:
                m3invoke();
                break;
            case 2:
                m3invoke();
                break;
            case 3:
                m3invoke();
                break;
            case 4:
                m3invoke();
                break;
            default:
                m3invoke();
                break;
        }
        return Unit.f80348a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m3invoke() {
        String str;
        p0 p0Var;
        a2 a2Var = ck2.i.f27924d;
        ck2.c cVar = ck2.i.f27923c;
        int i13 = 0;
        int i14 = this.f697i;
        wy0 user = this.f699k;
        d0 d0Var = this.f698j;
        switch (i14) {
            case 0:
                r rVar = (r) ((p0) d0Var.getView());
                rVar.getClass();
                Intrinsics.checkNotNullParameter(user, "user");
                r60.h hVar = (r60.h) rVar.G1.getValue();
                int i15 = r60.h.f106328e;
                d0Var.addDisposable(hVar.a(user, null, null).F(new u(7, new x(d0Var, i13)), new u(8, i.f616v), cVar, a2Var));
                return;
            case 1:
                d0Var.getPinalytics().N(f1.TAP, u0.UNFOLLOW_USER_BUTTON, h32.g0.USER_FOLLOW, d0Var.f556a, false);
                if (ai0.a.d(user, d0Var.f579x)) {
                    p0 p0Var2 = (p0) d0Var.getView();
                    String userName = dl2.b.i1(user);
                    r rVar2 = (r) p0Var2;
                    rVar2.getClass();
                    Intrinsics.checkNotNullParameter(userName, "userName");
                    Context requireContext = rVar2.requireContext();
                    Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                    l3.c.U0(rVar2, kh2.r.z(requireContext, userName, new h(rVar2, 11)));
                    return;
                }
                d0Var.addDisposable(oe.f.f1((ok1.f) d0Var.f555J.getValue(), user, null, null, 14));
                return;
            case 2:
                d0Var.z3(user);
                return;
            case 3:
                d0Var.B3(user);
                return;
            case 4:
                d0Var.getPinalytics().N(f1.TAP, u0.PROFILE_MESSAGE_BUTTON, h32.g0.CONVERSATION_MESSAGES, d0Var.f556a, false);
                oo1.j jVar = oo1.j.f96854a;
                no1.e conversationRemoteDataSource = d0Var.f581z;
                Intrinsics.checkNotNullParameter(conversationRemoteDataSource, "conversationRemoteDataSource");
                x2 userRepository = d0Var.f565j;
                Intrinsics.checkNotNullParameter(userRepository, "userRepository");
                Intrinsics.checkNotNullParameter(user, "activeUser");
                Boolean s43 = user.s4();
                Intrinsics.checkNotNullExpressionValue(s43, "getShouldShowMessaging(...)");
                if (!s43.booleanValue() || (str = d0Var.f556a) == null) {
                    return;
                }
                userRepository.P(str).F(new dl1.c(20, new oo1.h(conversationRemoteDataSource, 1)), new dl1.c(21, oo1.g.f96844m), cVar, a2Var);
                return;
            default:
                d0Var.getPinalytics().b0(u0.USER_SEND_BUTTON, h32.g0.USER_SEND, d0Var.f556a, false);
                wy0 user2 = ((b60.d) d0Var.f579x).f();
                if (user2 == null || (p0Var = (p0) d0Var.getViewIfBound()) == null) {
                    return;
                }
                Intrinsics.checkNotNullParameter(user, "userToShare");
                Intrinsics.checkNotNullParameter(user2, "user");
                c2 c2Var = ((r) p0Var).F0;
                if (c2Var != null) {
                    c2Var.q(y32.f.PROFILE.getValue(), user);
                    return;
                } else {
                    Intrinsics.r("sharesheetUtils");
                    throw null;
                }
        }
    }
}
