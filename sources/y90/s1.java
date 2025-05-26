package y90;

import android.view.View;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.y2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class s1 extends y2 {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f138239y = 0;

    /* renamed from: u, reason: collision with root package name */
    public final CardView f138240u;

    /* renamed from: v, reason: collision with root package name */
    public final TextView f138241v;

    /* renamed from: w, reason: collision with root package name */
    public m62.h1 f138242w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ u1 f138243x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(u1 u1Var, View root) {
        super(root);
        Intrinsics.checkNotNullParameter(root, "root");
        this.f138243x = u1Var;
        CardView cardView = (CardView) root.findViewById(x1.card_view);
        this.f138240u = cardView;
        this.f138241v = (TextView) root.findViewById(x1.font_item_text_view);
        cardView.setOnClickListener(new co.a(29, u1Var, this));
    }
}
