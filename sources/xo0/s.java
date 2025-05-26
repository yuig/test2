package xo0;

import android.view.View;
import androidx.recyclerview.widget.y2;
import com.pinterest.collagesCoreLibrary.components.ColorPickerCellView;
import kotlin.jvm.internal.Intrinsics;
import ra0.b0;
import ra0.c0;
import ra0.d0;
import ra0.z;
import y90.d1;
import y90.z0;

/* loaded from: classes5.dex */
public final class s extends y2 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(View view, int i13) {
        super(view);
        if (i13 != 1) {
            Intrinsics.checkNotNullParameter(view, "itemView");
        } else {
            Intrinsics.checkNotNullParameter(view, "view");
            super(view);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(d1 d1Var, ColorPickerCellView root, int i13) {
        super(root);
        if (i13 == 1) {
            Intrinsics.checkNotNullParameter(root, "root");
            super(root);
            root.o(new z(d0.f106913a));
        } else {
            if (i13 != 2) {
                Intrinsics.checkNotNullParameter(root, "root");
                z0 action = new z0(d1Var, 0);
                Intrinsics.checkNotNullParameter(action, "action");
                root.f44673j = action;
                root.o(new z(c0.f106909a));
                return;
            }
            Intrinsics.checkNotNullParameter(root, "root");
            super(root);
            z0 action2 = new z0(d1Var, 1);
            Intrinsics.checkNotNullParameter(action2, "action");
            root.f44673j = action2;
            root.o(new z(b0.f106903a));
        }
    }
}
