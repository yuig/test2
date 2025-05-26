package vq;

import android.view.LayoutInflater;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lvq/e;", "Lmf0/f;", "<init>", "()V", "conversation_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class e extends mf0.f {

    /* renamed from: f0, reason: collision with root package name */
    public static final /* synthetic */ int f126409f0 = 0;

    /* renamed from: d0, reason: collision with root package name */
    public lp.a f126411d0;

    /* renamed from: c0, reason: collision with root package name */
    public List f126410c0 = q0.f80391a;

    /* renamed from: e0, reason: collision with root package name */
    public final xj2.b f126412e0 = new xj2.b();

    @Override // mf0.f
    public final void Z6(LayoutInflater inflater) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        lp.a aVar = new lp.a(getContext(), false);
        this.f126411d0 = aVar;
        aVar.f84202c = this.f126410c0;
        this.V = aVar;
        this.W = null;
        j7();
        String string = getString(xc0.i.block_conversation_user_dialog_title);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        h7(string);
        int i13 = c52.e.f26504ok;
        tq.j jVar = new tq.j(this, 4);
        this.K = i13;
        this.S = jVar;
        m7();
        this.f87096J = x0.cancel;
        this.U = null;
        l7();
        super.Z6(inflater);
    }

    @Override // mf0.f, androidx.fragment.app.Fragment
    public final void onDestroy() {
        this.f126412e0.dispose();
        super.onDestroy();
    }

    public final void p7(String conversationId, String str, List filteredUsers) {
        Intrinsics.checkNotNullParameter(conversationId, "conversationId");
        Intrinsics.checkNotNullParameter("message", "blockSource");
        Intrinsics.checkNotNullParameter(filteredUsers, "filteredUsers");
        this.f126410c0 = filteredUsers;
    }
}
