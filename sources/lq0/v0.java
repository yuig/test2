package lq0;

import a.cb;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import com.pinterest.navigation.Navigation;
import h32.a4;
import h32.d4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import so.f7;
import so.oa;
import x02.i2;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00040\u0003B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Llq0/v0;", "Lwk1/k;", "Ldl1/s;", "", "Lnr0/j;", "<init>", "()V", "conversation_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class v0 extends n1<dl1.s> {
    public f7 R0;
    public i2 S0;
    public no1.e T0;
    public q12.b U0;
    public String V0;
    public final d4 W0 = d4.CONVERSATION;
    public final a4 X0 = a4.CONVERSATION_SETTINGS_VIEW;

    @Override // nl1.d
    public final void I7() {
        nx.d0 s73 = s7();
        h32.f1 f1Var = h32.f1.CONVERSATION_SETTINGS_VIEWED;
        String str = this.V0;
        if (str == null) {
            Intrinsics.r("conversationId");
            throw null;
        }
        nx.d0.v(s73, f1Var, str, false, 12);
        super.I7();
    }

    @Override // sq0.e, yq0.b0
    public final void Q8(yq0.z adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        super.Q8(adapter);
        adapter.G(3, new u0(this, 0));
        adapter.G(1, new u0(this, 1));
        adapter.G(9, new u0(this, 2));
        adapter.G(7, new u0(this, 3));
        adapter.G(8, new u0(this, 4));
    }

    @Override // nl1.d
    public final void R7(Navigation navigation) {
        if (navigation != null) {
            String f49940b = navigation.getF49940b();
            Intrinsics.checkNotNullExpressionValue(f49940b, "getId(...)");
            this.V0 = f49940b;
        }
        super.R7(navigation);
    }

    @Override // sq0.e, nl1.d
    public final void S7(fo1.a toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        GestaltToolbarImpl gestaltToolbarImpl = (GestaltToolbarImpl) toolbar;
        gestaltToolbarImpl.u().setTint(getResources().getColor(eo1.b.color_themed_text_default, requireContext().getTheme()));
        gestaltToolbarImpl.Y(xc0.i.conversation_settings);
        gestaltToolbarImpl.m();
    }

    @Override // yk1.k
    public final yk1.m V7() {
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        Context context = kb0.a.f79058b;
        oa oaVar = (oa) ((wk1.a) cb.e(wk1.a.class));
        wk1.b bVar = new wk1.b(new yk1.a(requireContext.getResources(), requireContext.getTheme()), oaVar.u2(), ((uk1.a) oaVar.x2()).g(), oaVar.F2(), oaVar.m2(), oaVar.o2(), oaVar.n2(), oaVar.S2());
        bVar.d(W8());
        i2 i2Var = this.S0;
        if (i2Var == null) {
            Intrinsics.r("pinRepository");
            throw null;
        }
        bVar.f(i2Var);
        wk1.c a13 = bVar.a();
        f7 f7Var = this.R0;
        if (f7Var == null) {
            Intrinsics.r("graphQLConversationSettingsPresenterFactory");
            throw null;
        }
        String str = this.V0;
        if (str == null) {
            Intrinsics.r("conversationId");
            throw null;
        }
        no1.e eVar = this.T0;
        if (eVar == null) {
            Intrinsics.r("conversationDataSource");
            throw null;
        }
        q12.b bVar2 = this.U0;
        if (bVar2 != null) {
            return f7Var.a(a13, str, eVar, bVar2);
        }
        Intrinsics.r("conversationService");
        throw null;
    }

    @Override // sq0.e
    public final int X8() {
        return (int) TypedValue.applyDimension(1, 0.0f, getResources().getDisplayMetrics());
    }

    @Override // sq0.e
    public final int Y8() {
        return 0;
    }

    @Override // sq0.e, sq0.b0
    /* renamed from: getNumColumns */
    public final int getZ0() {
        return 1;
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType, reason: from getter */
    public final a4 getG0() {
        return this.X0;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF139798w0() {
        return this.W0;
    }

    @Override // yq0.t
    public final a7.e m8() {
        return new a7.e(xc0.f.fragment_conversation_settings, xc0.e.conversation_settings_recycler_view);
    }

    @Override // sq0.e, yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        v13.findViewById(xc0.e.conversation_settings_recycler_view).setVisibility(0);
    }
}
