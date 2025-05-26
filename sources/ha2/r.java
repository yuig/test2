package ha2;

import android.content.Context;
import com.pinterest.ui.view.BaseRecyclerContainerView;
import h32.d4;
import kotlin.jvm.internal.Intrinsics;
import so.jb;
import so.oa;

/* loaded from: classes4.dex */
public final class r extends BaseRecyclerContainerView implements v {

    /* renamed from: b, reason: collision with root package name */
    public boolean f68468b;

    /* renamed from: c, reason: collision with root package name */
    public final xk2.v f68469c;

    /* renamed from: d, reason: collision with root package name */
    public uk1.e f68470d;

    /* renamed from: e, reason: collision with root package name */
    public uj2.q f68471e;

    /* renamed from: f, reason: collision with root package name */
    public final d4 f68472f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        inject();
        this.f68469c = xk2.m.b(p.f68465i);
        this.f68472f = d4.MODAL;
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    public final String getDebugTag() {
        return (String) this.f68469c.getValue();
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    public final int getLayoutResourceId() {
        return rt1.b.action_sheet_modal_list_view;
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    public final int getPinterestRecyclerViewId() {
        return rt1.a.action_sheet_recycler_view;
    }

    @Override // uk1.c
    /* renamed from: getViewType */
    public final d4 getF75509a1() {
        return this.f68472f;
    }

    @Override // hb2.h
    public final void inject() {
        if (this.f68468b) {
            return;
        }
        this.f68468b = true;
        jb jbVar = (jb) ((s) generatedComponent());
        this.videoViewabilityRecyclerListenerProvider = jbVar.f113494l;
        oa oaVar = jbVar.f113483a;
        this.f68470d = (uk1.e) oaVar.f113702ga.get();
        this.f68471e = (uj2.q) oaVar.f113947u9.get();
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    public final void registerViewHolderCreators(yq0.z adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        adapter.G(0, new q(this, 0));
        adapter.G(1, new q(this, 1));
    }
}
