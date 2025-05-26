package fd1;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class t0 extends tq.a {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f61995i = 0;

    /* renamed from: d, reason: collision with root package name */
    public final xk2.v f61996d;

    /* renamed from: e, reason: collision with root package name */
    public float f61997e;

    /* renamed from: f, reason: collision with root package name */
    public float f61998f;

    /* renamed from: g, reason: collision with root package name */
    public float f61999g;

    /* renamed from: h, reason: collision with root package name */
    public ed1.z f62000h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(Context context, boolean z13, f1 upsellTypes, z0 viewOptions) {
        super(context, 5);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(upsellTypes, "upsellTypes");
        Intrinsics.checkNotNullParameter(viewOptions, "viewOptions");
        this.f61996d = xk2.m.b(g.f61914m);
        this.f61997e = -1.0f;
        this.f61998f = -1.0f;
        this.f61999g = -1.0f;
        u0.f62001a = z13;
        getLinearLayoutManager().C1(1);
        if (u0.f62001a) {
            View findViewById = findViewById(b62.b.send_on_pinterest_title);
            Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
            pk.a0.o((GestaltText) findViewById, a62.e.save_or_send, new Object[0]);
        }
        ((GestaltText) findViewById(b62.b.send_on_pinterest_title)).i(i.C);
        View findViewById2 = findViewById(b62.b.modal_header_dismiss_bt);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        com.bumptech.glide.c.d0((GestaltIconButton) findViewById2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ed1.z zVar;
        Integer valueOf = motionEvent != null ? Integer.valueOf(motionEvent.getAction()) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            this.f61997e = motionEvent.getY();
            this.f61998f = motionEvent.getX();
        } else if ((valueOf != null && valueOf.intValue() == 1) || (valueOf != null && valueOf.intValue() == 3)) {
            this.f61997e = -1.0f;
            this.f61999g = -1.0f;
            this.f61998f = -1.0f;
        } else if (valueOf != null && valueOf.intValue() == 2) {
            float y13 = this.f61997e - motionEvent.getY();
            if (Math.abs(y13) > Math.abs(this.f61998f - motionEvent.getX()) && (zVar = this.f62000h) != null) {
                zVar.f58747f.d(new ed1.a(y13 - this.f61999g));
            }
            this.f61999g = y13;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    public final String getDebugTag() {
        return (String) this.f61996d.getValue();
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    public final int getLayoutResourceId() {
        return b62.c.view_sharesheet_contacts_list;
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    public final int getPinterestRecyclerViewId() {
        return b62.b.sharesheet_contacts_list_p_recycler_view;
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    public final void registerViewHolderCreators(yq0.z adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        adapter.G(RecyclerViewTypes.VIEW_TYPE_SHARESHEET_CONTACT, new h81.b(this, 24));
    }
}
