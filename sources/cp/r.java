package cp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import nx.f0;
import so.jb;
import so.oa;

/* loaded from: classes3.dex */
public final class r extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f52967i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ u f52968j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(u uVar, int i13) {
        super(0);
        this.f52967i = i13;
        this.f52968j = uVar;
    }

    public final mp.s b() {
        int i13 = this.f52967i;
        u uVar = this.f52968j;
        switch (i13) {
            case 1:
                Context requireContext = uVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                return new mp.s(requireContext, 1);
            case 4:
                Context requireContext2 = uVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                return new mp.s(requireContext2, 2);
            default:
                Context requireContext3 = uVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext3, "requireContext(...)");
                return new mp.s(requireContext3, 0);
        }
    }

    public final rb2.d e() {
        int i13 = this.f52967i;
        u uVar = this.f52968j;
        switch (i13) {
            case 6:
                Context requireContext = uVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                return new rb2.d(requireContext, false);
            default:
                Context requireContext2 = uVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                return new rb2.d(requireContext2, false);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f52967i;
        int i14 = 0;
        u uVar = this.f52968j;
        switch (i13) {
            case 0:
                rb2.q qVar = uVar.S0;
                if (qVar != null) {
                    qVar.W();
                }
                return Unit.f80348a;
            case 1:
                return b();
            case 2:
                Context requireContext = uVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                return new mp.u(requireContext);
            case 3:
                Context requireContext2 = uVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                return new mp.f(requireContext2);
            case 4:
                return b();
            case 5:
                Context requireContext3 = uVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext3, "requireContext(...)");
                return new rb2.t(requireContext3, new s(uVar, i14), false);
            case 6:
                return e();
            case 7:
                return e();
            case 8:
                Context requireContext4 = uVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext4, "requireContext(...)");
                return new rb2.i(requireContext4, false);
            case 9:
                Context context = uVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(context, "requireContext(...)");
                Intrinsics.checkNotNullParameter(context, "context");
                mp.b bVar = new mp.b(context);
                if (!bVar.f87835b) {
                    bVar.f87835b = true;
                    bVar.f87836c = (m60.w) ((jb) ((mp.c) bVar.generatedComponent())).f113483a.f113885r0.get();
                }
                LayoutInflater.from(context).inflate(xc0.f.list_cell_conversation_lego_inbox_contact_request_feed_button, (ViewGroup) bVar, true);
                View findViewById = bVar.findViewById(xc0.e.num_contact_requests_textview);
                Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
                bVar.f87837d = (GestaltButton) findViewById;
                return bVar;
            case 10:
                Context context2 = uVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(context2, "requireContext(...)");
                Intrinsics.checkNotNullParameter(context2, "context");
                mp.k kVar = new mp.k(context2);
                if (!kVar.f87868b) {
                    kVar.f87868b = true;
                    oa oaVar = ((jb) ((mp.l) kVar.generatedComponent())).f113483a;
                    kVar.f87869c = (m60.w) oaVar.f113885r0.get();
                    kVar.f87870d = (f0) oaVar.f113747j2.get();
                }
                LayoutInflater.from(context2).inflate(xc0.f.list_cell_conversation_lego_inbox_new_message, (ViewGroup) kVar, true);
                kVar.findViewById(xc0.e.compose_message_icon).setVisibility(0);
                ((GestaltText) kVar.findViewById(xc0.e.new_message_text)).i(mp.a.f87831l);
                return kVar;
            case 11:
                Context requireContext5 = uVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext5, "requireContext(...)");
                return new rb2.n(requireContext5, false);
            case 12:
                Context requireContext6 = uVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext6, "requireContext(...)");
                return new mp.i(requireContext6);
            default:
                return b();
        }
    }
}
