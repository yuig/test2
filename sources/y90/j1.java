package y90;

import androidx.recyclerview.widget.y2;
import com.pinterest.collage.effects.components.EffectToolView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j1 extends y2 {

    /* renamed from: u, reason: collision with root package name */
    public final EffectToolView f138195u;

    /* renamed from: v, reason: collision with root package name */
    public final z90.g f138196v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(k1 k1Var, EffectToolView root) {
        super(root);
        Intrinsics.checkNotNullParameter(root, "root");
        this.f138195u = root;
        z90.g gVar = new z90.g(rm1.q.REPORT, rm1.c.SUBTLE, bs1.c.j2(new String[0], z1.collage_effect_setting_reset), false, false, 16);
        this.f138196v = gVar;
        w action = new w(k1Var, 5);
        Intrinsics.checkNotNullParameter(action, "action");
        root.f44649i = action;
        root.o(gVar);
    }
}
