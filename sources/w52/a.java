package w52;

import an0.g;
import an0.o;
import androidx.recyclerview.widget.y2;
import com.pinterest.feature.boardpreview.view.BaseBoardPreviewContainer;
import kotlin.jvm.internal.Intrinsics;
import yk1.i;

/* loaded from: classes4.dex */
public final class a extends y2 implements o {

    /* renamed from: u, reason: collision with root package name */
    public final BaseBoardPreviewContainer f128105u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(BaseBoardPreviewContainer view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        this.f128105u = view;
        Intrinsics.checkNotNullParameter(this, "listener");
        view.f45338l = this;
    }

    @Override // an0.o
    public final void C() {
        this.f128105u.setLoadState(i.ERROR);
    }

    @Override // an0.o
    public final void X(g previewConfig) {
        Intrinsics.checkNotNullParameter(previewConfig, "previewConfig");
        this.f128105u.setLoadState(i.LOADED);
    }
}
