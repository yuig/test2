package y90;

import android.view.View;
import androidx.recyclerview.widget.y2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c1 extends y2 {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f138140u = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(d1 d1Var, View root) {
        super(root);
        Intrinsics.checkNotNullParameter(root, "root");
        root.findViewById(x1.eye_dropper_selector_view);
        root.setOnClickListener(new tq.j(d1Var, 19));
    }
}
