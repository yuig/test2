package cb2;

import com.pinterest.ui.menu.ContextMenuItemView;
import com.pinterest.ui.menu.ContextMenuView;

/* loaded from: classes4.dex */
public final class l implements b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ContextMenuView f27337a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ContextMenuItemView f27338b;

    public l(ContextMenuView contextMenuView, ContextMenuItemView contextMenuItemView) {
        this.f27337a = contextMenuView;
        this.f27338b = contextMenuItemView;
    }

    @Override // cb2.b0
    public final void a() {
        this.f27337a.removeView(this.f27338b);
    }
}
