package y90;

import androidx.recyclerview.widget.y2;
import com.pinterest.collagesCoreLibrary.components.ColorPickerCellView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b1 extends y2 {

    /* renamed from: u, reason: collision with root package name */
    public final ColorPickerCellView f138132u;

    /* renamed from: v, reason: collision with root package name */
    public m62.a f138133v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(d1 d1Var, ColorPickerCellView root) {
        super(root);
        Intrinsics.checkNotNullParameter(root, "root");
        this.f138132u = root;
        a1 action = new a1(0, d1Var, this);
        Intrinsics.checkNotNullParameter(action, "action");
        root.f44673j = action;
    }
}
