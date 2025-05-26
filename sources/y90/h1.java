package y90;

import android.view.View;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.y2;
import com.pinterest.gestalt.iconcomponent.GestaltIcon;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h1 extends y2 {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f138184y = 0;

    /* renamed from: u, reason: collision with root package name */
    public final CardView f138185u;

    /* renamed from: v, reason: collision with root package name */
    public final GestaltIcon f138186v;

    /* renamed from: w, reason: collision with root package name */
    public final GestaltText f138187w;

    /* renamed from: x, reason: collision with root package name */
    public m62.k f138188x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(k1 k1Var, View root) {
        super(root);
        Intrinsics.checkNotNullParameter(root, "root");
        CardView cardView = (CardView) root.findViewById(x1.card_view);
        this.f138185u = cardView;
        this.f138186v = (GestaltIcon) root.findViewById(x1.icon);
        this.f138187w = (GestaltText) root.findViewById(x1.label);
        cardView.setOnClickListener(new co.a(27, k1Var, this));
    }
}
