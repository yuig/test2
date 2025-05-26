package vn;

import androidx.appcompat.widget.q2;
import com.linecorp.linesdk.dialog.internal.TargetListWithSearchView;
import pk2.f;

/* loaded from: classes3.dex */
public final class a implements q2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TargetListWithSearchView f126251a;

    public a(TargetListWithSearchView targetListWithSearchView) {
        this.f126251a = targetListWithSearchView;
    }

    @Override // androidx.appcompat.widget.q2
    public final boolean a(String str) {
        f.o(this.f126251a.f34137a.f19240m);
        return true;
    }

    @Override // androidx.appcompat.widget.q2
    public final boolean b(String str) {
        TargetListWithSearchView targetListWithSearchView = this.f126251a;
        f.o(targetListWithSearchView.f34137a.f19240m);
        targetListWithSearchView.f34138b.clearFocus();
        return true;
    }
}
