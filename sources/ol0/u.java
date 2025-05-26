package ol0;

import android.content.Context;
import android.text.Html;
import android.text.Spanned;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.api.model.wy0;
import com.pinterest.component.board.view.LegoBoardRep;
import com.pinterest.gestalt.banner.GestaltBanner;
import com.pinterest.gestalt.buttongroup.GestaltButtonGroup;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import so.jb;

/* loaded from: classes5.dex */
public final class u extends ConstraintLayout implements q, af2.c {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f96431i = 0;

    /* renamed from: a, reason: collision with root package name */
    public ye2.o f96432a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f96433b;

    /* renamed from: c, reason: collision with root package name */
    public final wy0 f96434c;

    /* renamed from: d, reason: collision with root package name */
    public final pb0.d f96435d;

    /* renamed from: e, reason: collision with root package name */
    public final w f96436e;

    /* renamed from: f, reason: collision with root package name */
    public final LegoBoardRep f96437f;

    /* renamed from: g, reason: collision with root package name */
    public final GestaltBanner f96438g;

    /* renamed from: h, reason: collision with root package name */
    public Function0 f96439h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(wy0 wy0Var, pb0.d fuzzyDateFormatter, Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(fuzzyDateFormatter, "fuzzyDateFormatter");
        Intrinsics.checkNotNullParameter(context, "context");
        if (!this.f96433b) {
            this.f96433b = true;
            this.f96436e = (w) ((jb) ((v) generatedComponent())).f113483a.f113885r0.get();
        }
        this.f96434c = wy0Var;
        this.f96435d = fuzzyDateFormatter;
        this.f96439h = l.f96400l;
        View.inflate(context, a70.b.soft_deletion_alert_modal, this);
        View findViewById = findViewById(a70.a.soft_deletion_lego_board_rep);
        LegoBoardRep legoBoardRep = (LegoBoardRep) findViewById;
        legoBoardRep.a0(new qc2.d(), l.f96399k);
        bs1.c.X0(legoBoardRep.f44728l);
        Intrinsics.checkNotNullExpressionValue(findViewById, "apply(...)");
        this.f96437f = legoBoardRep;
        View findViewById2 = findViewById(a70.a.soft_deletion_button_group);
        GestaltButtonGroup gestaltButtonGroup = (GestaltButtonGroup) findViewById2;
        gestaltButtonGroup.b(new bp.j(22, gestaltButtonGroup, this));
        Intrinsics.checkNotNullExpressionValue(findViewById2, "apply(...)");
        View findViewById3 = findViewById(a70.a.soft_deletion_subtitle);
        GestaltText gestaltText = (GestaltText) findViewById3;
        String string = gestaltText.getResources().getString(a70.c.board_restoration_recently_deleted_section_title);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = gestaltText.getResources().getString(a70.c.board_restoration_modal_message, 7, string);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        Spanned fromHtml = Html.fromHtml(string2, 0);
        Intrinsics.checkNotNullExpressionValue(fromHtml, "fromHtml(...)");
        gestaltText.setText(fromHtml);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "apply(...)");
        View findViewById4 = findViewById(a70.a.test_experience_callout);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        GestaltBanner gestaltBanner = (GestaltBanner) findViewById4;
        ph.a.o(gestaltBanner, e.f96368u);
        this.f96438g = gestaltBanner;
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f96432a == null) {
            this.f96432a = new ye2.o(this);
        }
        return this.f96432a;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f96432a == null) {
            this.f96432a = new ye2.o(this);
        }
        return this.f96432a.generatedComponent();
    }
}
