package dq0;

import com.pinterest.feature.conversation.view.ConversationSharedBoardsHeaderView;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import lh0.a4;
import lh0.g1;
import lh0.p0;
import lh0.z3;
import lq0.o0;

/* loaded from: classes5.dex */
public final class n extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f56116i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ p f56117j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(p pVar, int i13) {
        super(1);
        this.f56116i = i13;
        this.f56117j = pVar;
    }

    public final void b(Throwable th3) {
        int i13 = this.f56116i;
        p pVar = this.f56117j;
        switch (i13) {
            case 1:
                String str = "Error in addClientAndGetSubjectForEndpoint: " + th3.getMessage();
                pVar.getClass();
                p.J3(str);
                break;
            default:
                String str2 = "Error in getSubjectForTopic: " + th3.getMessage();
                pVar.getClass();
                p.J3(str2);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        p pVar = this.f56117j;
        int i13 = this.f56116i;
        switch (i13) {
            case 0:
                kq0.e message = (kq0.e) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(message, "message");
                        p.t3(pVar, message);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(message, "message");
                        p.t3(pVar, message);
                        break;
                }
                return Unit.f80348a;
            case 1:
                b((Throwable) obj);
                return Unit.f80348a;
            case 2:
                kq0.e message2 = (kq0.e) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(message2, "message");
                        p.t3(pVar, message2);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(message2, "message");
                        p.t3(pVar, message2);
                        break;
                }
                return Unit.f80348a;
            case 3:
                b((Throwable) obj);
                return Unit.f80348a;
            default:
                List boards = (List) obj;
                Intrinsics.f(boards);
                pVar.getClass();
                if (!boards.isEmpty()) {
                    p0 p0Var = pVar.f56129i;
                    p0Var.getClass();
                    z3 z3Var = a4.f83298b;
                    g1 g1Var = (g1) p0Var.f83455a;
                    if (g1Var.o("sg_android_conversation_link_back_to_boards", "enabled", z3Var) || g1Var.l("sg_android_conversation_link_back_to_boards")) {
                        o0 o0Var = (o0) ((aq0.i) pVar.getView());
                        o0Var.getClass();
                        Intrinsics.checkNotNullParameter(boards, "boards");
                        if (!o0Var.Z0) {
                            ConversationSharedBoardsHeaderView conversationSharedBoardsHeaderView = o0Var.f84400w1;
                            if (conversationSharedBoardsHeaderView == null) {
                                Intrinsics.r("conversationSharedBoardsHeaderView");
                                throw null;
                            }
                            g70.h hVar = o0Var.K0;
                            if (hVar == null) {
                                Intrinsics.r("boardNavigator");
                                throw null;
                            }
                            conversationSharedBoardsHeaderView.a(boards, hVar);
                            ConversationSharedBoardsHeaderView conversationSharedBoardsHeaderView2 = o0Var.f84400w1;
                            if (conversationSharedBoardsHeaderView2 == null) {
                                Intrinsics.r("conversationSharedBoardsHeaderView");
                                throw null;
                            }
                            bs1.c.R1(conversationSharedBoardsHeaderView2, true);
                        }
                    }
                }
                return Unit.f80348a;
        }
    }
}
