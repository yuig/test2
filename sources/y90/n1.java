package y90;

import android.view.View;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.y2;
import com.pinterest.gestalt.iconcomponent.GestaltIcon;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n1 extends y2 {
    public static final /* synthetic */ int D = 0;
    public final com.pinterest.shuffles.scene.composer.x0 A;
    public m62.i B;
    public final /* synthetic */ p1 C;

    /* renamed from: u, reason: collision with root package name */
    public final int f138207u;

    /* renamed from: v, reason: collision with root package name */
    public final int f138208v;

    /* renamed from: w, reason: collision with root package name */
    public final CardView f138209w;

    /* renamed from: x, reason: collision with root package name */
    public final GestaltText f138210x;

    /* renamed from: y, reason: collision with root package name */
    public final View f138211y;

    /* renamed from: z, reason: collision with root package name */
    public final GestaltIcon f138212z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(p1 p1Var, View root) {
        super(root);
        Intrinsics.checkNotNullParameter(root, "root");
        this.C = p1Var;
        int i13 = eo1.b.color_background_secondary_base;
        this.f138207u = i13;
        this.f138208v = eo1.b.color_background_default;
        CardView cardView = (CardView) root.findViewById(x1.card_view);
        this.f138209w = cardView;
        xk2.v b13 = xk2.m.b(new w(root, 6));
        this.f138210x = (GestaltText) root.findViewById(x1.label);
        View findViewById = root.findViewById(x1.settings_overlay_background);
        findViewById.setBackgroundColor(bs1.c.B(root, i13));
        this.f138211y = findViewById;
        this.f138212z = (GestaltIcon) root.findViewById(x1.settings_overlay_icon);
        this.A = (com.pinterest.shuffles.scene.composer.x0) p1Var.f138216e.invoke((x72.j) b13.getValue());
        cardView.setOnClickListener(new co.a(28, p1Var, this));
        x72.j jVar = (x72.j) b13.getValue();
        jVar.k().setOpaque(false);
        ke2.c f52894a = jVar.getF52894a();
        id2.c.Companion.getClass();
        id2.c a13 = id2.b.a(0);
        f52894a.getClass();
        Intrinsics.checkNotNullParameter(a13, "<set-?>");
        f52894a.f79315g = a13;
        jVar.g(new uv.d(p1Var, 2));
    }
}
