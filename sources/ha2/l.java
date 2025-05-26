package ha2;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.pinterest.gestalt.badge.GestaltBadge;
import com.pinterest.gestalt.iconcomponent.GestaltIcon;
import com.pinterest.gestalt.switchComponent.GestaltSwitch;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.navigation.Navigation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import so.jb;

/* loaded from: classes4.dex */
public final class l extends LinearLayout implements af2.c {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f68450n = 0;

    /* renamed from: a, reason: collision with root package name */
    public ye2.o f68451a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f68452b;

    /* renamed from: c, reason: collision with root package name */
    public final Function1 f68453c;

    /* renamed from: d, reason: collision with root package name */
    public final o5.c f68454d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f68455e;

    /* renamed from: f, reason: collision with root package name */
    public final m60.w f68456f;

    /* renamed from: g, reason: collision with root package name */
    public final GestaltText f68457g;

    /* renamed from: h, reason: collision with root package name */
    public final GestaltText f68458h;

    /* renamed from: i, reason: collision with root package name */
    public final GestaltText f68459i;

    /* renamed from: j, reason: collision with root package name */
    public final GestaltIcon f68460j;

    /* renamed from: k, reason: collision with root package name */
    public final GestaltSwitch f68461k;

    /* renamed from: l, reason: collision with root package name */
    public final GestaltBadge f68462l;

    /* renamed from: m, reason: collision with root package name */
    public final GestaltIcon f68463m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Context context, Function1 actionHandler, o5.c bidiFormatter, boolean z13) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(bidiFormatter, "bidiFormatter");
        if (!this.f68452b) {
            this.f68452b = true;
            this.f68456f = (m60.w) ((jb) ((m) generatedComponent())).f113483a.f113885r0.get();
        }
        this.f68453c = actionHandler;
        this.f68454d = bidiFormatter;
        this.f68455e = z13;
        View.inflate(context, rt1.b.view_lego_actionsheet_row, this);
        View findViewById = findViewById(rt1.a.option_title);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f68457g = (GestaltText) findViewById;
        View findViewById2 = findViewById(rt1.a.option_subtitle);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f68458h = (GestaltText) findViewById2;
        View findViewById3 = findViewById(rt1.a.option_subtitle_link);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        GestaltText gestaltText = (GestaltText) findViewById3;
        this.f68459i = gestaltText;
        gestaltText.i(h.f68434j);
        View findViewById4 = findViewById(rt1.a.option_selected_icon);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f68460j = (GestaltIcon) findViewById4;
        View findViewById5 = findViewById(rt1.a.switch_toggle);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        GestaltSwitch gestaltSwitch = (GestaltSwitch) findViewById5;
        this.f68461k = gestaltSwitch;
        View findViewById6 = findViewById(rt1.a.option_extra_label);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.f68462l = (GestaltBadge) findViewById6;
        View findViewById7 = findViewById(rt1.a.drawable);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(...)");
        this.f68463m = (GestaltIcon) findViewById7;
        if (z13) {
            Intrinsics.checkNotNullParameter(gestaltSwitch, "<this>");
            gestaltSwitch.i(on1.e.f96722p);
        }
    }

    public final void a(int i13, vn1.c cVar, Integer num, Navigation navigation) {
        this.f68458h.i(new k(i13, cVar));
        if (num == null || navigation == null) {
            return;
        }
        this.f68459i.i(new i(1, this, num)).j(new ez1.b(6, this, navigation));
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f68451a == null) {
            this.f68451a = new ye2.o(this);
        }
        return this.f68451a;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f68451a == null) {
            this.f68451a = new ye2.o(this);
        }
        return this.f68451a.generatedComponent();
    }

    @Override // android.view.View
    public final void setSelected(boolean z13) {
        super.setSelected(z13);
        if (this.f68455e) {
            this.f68461k.i(new fx1.d(z13, 17));
            return;
        }
        GestaltIcon gestaltIcon = this.f68460j;
        if (z13) {
            kg.t.e1(gestaltIcon);
        } else {
            kg.t.O(gestaltIcon);
        }
    }
}
