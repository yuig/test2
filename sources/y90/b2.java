package y90;

import androidx.recyclerview.widget.y2;
import com.pinterest.collage.effects.components.EffectToolView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b2 extends y2 {

    /* renamed from: u, reason: collision with root package name */
    public final EffectToolView f138134u;

    /* renamed from: v, reason: collision with root package name */
    public m62.k1 f138135v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(c2 c2Var, EffectToolView root) {
        super(root);
        Intrinsics.checkNotNullParameter(root, "root");
        this.f138134u = root;
        a1 action = new a1(4, c2Var, this);
        Intrinsics.checkNotNullParameter(action, "action");
        root.f44649i = action;
    }
}
