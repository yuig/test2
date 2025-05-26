package y90;

import androidx.recyclerview.widget.y2;
import com.pinterest.collage.effects.components.EffectToolView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l1 extends y2 {

    /* renamed from: u, reason: collision with root package name */
    public final EffectToolView f138200u;

    /* renamed from: v, reason: collision with root package name */
    public m62.i f138201v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(p1 p1Var, EffectToolView root) {
        super(root);
        Intrinsics.checkNotNullParameter(root, "root");
        this.f138200u = root;
        a1 action = new a1(3, p1Var, this);
        Intrinsics.checkNotNullParameter(action, "action");
        root.f44649i = action;
    }
}
