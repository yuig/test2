package n;

import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActivityChooserView;
import androidx.appcompat.widget.l1;

/* loaded from: classes2.dex */
public final class b extends l1 {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f88559j = 0;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ View f88560k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.f88560k = actionMenuItemView;
    }

    @Override // androidx.appcompat.widget.l1
    public final e0 b() {
        androidx.appcompat.widget.h hVar;
        int i13 = this.f88559j;
        View view = this.f88560k;
        switch (i13) {
            case 0:
                androidx.appcompat.widget.i iVar = ((ActionMenuItemView) view).f16170f;
                if (iVar == null || (hVar = iVar.f16596a.f16659s) == null) {
                    return null;
                }
                return hVar.a();
            default:
                return ((ActivityChooserView) view).b();
        }
    }

    @Override // androidx.appcompat.widget.l1
    public final boolean c() {
        int i13 = this.f88559j;
        View view = this.f88560k;
        switch (i13) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) view;
                n nVar = actionMenuItemView.f16168d;
                if (nVar == null || !nVar.b(actionMenuItemView.f16165a)) {
                    return false;
                }
                e0 b13 = b();
                return b13 != null && b13.a();
            default:
                ActivityChooserView activityChooserView = (ActivityChooserView) view;
                if (activityChooserView.b().f16397z.isShowing() || !activityChooserView.f16274h) {
                    return true;
                }
                activityChooserView.f16267a.getClass();
                throw new IllegalStateException("No data model. Did you call #setDataModel?");
        }
    }

    @Override // androidx.appcompat.widget.l1
    public final boolean d() {
        switch (this.f88559j) {
            case 1:
                ((ActivityChooserView) this.f88560k).a();
                break;
            default:
                e0 b13 = b();
                if (b13 != null && b13.a()) {
                    b13.dismiss();
                    break;
                }
                break;
        }
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ActivityChooserView activityChooserView, FrameLayout frameLayout) {
        super(frameLayout);
        this.f88560k = activityChooserView;
    }
}
