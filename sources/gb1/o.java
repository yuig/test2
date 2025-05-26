package gb1;

import android.content.Context;
import android.view.View;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.jvm.internal.Intrinsics;
import pk.a0;
import w1.l0;

/* loaded from: classes5.dex */
public final class o extends d implements yk1.n {

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f64714r = 0;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f64715c;

    /* renamed from: d, reason: collision with root package name */
    public final com.pinterest.feature.settings.notifications.d f64716d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f64717e;

    /* renamed from: f, reason: collision with root package name */
    public final int f64718f;

    /* renamed from: g, reason: collision with root package name */
    public final int f64719g;

    /* renamed from: h, reason: collision with root package name */
    public final GestaltText f64720h;

    /* renamed from: i, reason: collision with root package name */
    public final GestaltText f64721i;

    /* renamed from: j, reason: collision with root package name */
    public final GestaltButton f64722j;

    /* renamed from: k, reason: collision with root package name */
    public final GestaltButton f64723k;

    /* renamed from: l, reason: collision with root package name */
    public final GestaltButton f64724l;

    /* renamed from: m, reason: collision with root package name */
    public final GestaltButton f64725m;

    /* renamed from: n, reason: collision with root package name */
    public kotlin.jvm.internal.s f64726n;

    /* renamed from: o, reason: collision with root package name */
    public kotlin.jvm.internal.s f64727o;

    /* renamed from: p, reason: collision with root package name */
    public kotlin.jvm.internal.s f64728p;

    /* renamed from: q, reason: collision with root package name */
    public kotlin.jvm.internal.s f64729q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Context context, boolean z13, com.pinterest.feature.settings.notifications.d dVar, boolean z14) {
        super(context, null, 0, z14 ? c52.d.notif_settings_item_button_push : c52.d.notif_settings_item_button_email);
        Intrinsics.checkNotNullParameter(context, "context");
        final int i13 = 0;
        this.f64715c = z13;
        this.f64716d = dVar;
        this.f64717e = z14;
        this.f64718f = z14 ? c52.e.enable_push_options : c52.e.enable_email_email_options;
        this.f64719g = c52.e.turn_off_all_email_options;
        this.f64720h = (GestaltText) findViewById(c52.c.notif_settings_section_header);
        this.f64721i = (GestaltText) findViewById(c52.c.notif_settings_warning);
        View findViewById = findViewById(c52.c.settings_button_wide_select_all);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        GestaltButton gestaltButton = (GestaltButton) findViewById;
        this.f64722j = gestaltButton;
        View findViewById2 = findViewById(c52.c.settings_button_wide_turn_off);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        GestaltButton gestaltButton2 = (GestaltButton) findViewById2;
        this.f64723k = gestaltButton2;
        View findViewById3 = findViewById(c52.c.settings_button_small_select_all);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        GestaltButton gestaltButton3 = (GestaltButton) findViewById3;
        this.f64724l = gestaltButton3;
        View findViewById4 = findViewById(c52.c.settings_button_small_turn_off);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        GestaltButton gestaltButton4 = (GestaltButton) findViewById4;
        this.f64725m = gestaltButton4;
        this.f64726n = n.f64711l;
        this.f64727o = n.f64712m;
        this.f64728p = n.f64709j;
        this.f64729q = n.f64710k;
        gestaltButton.d(new k(this, i13)).g(new View.OnClickListener(this) { // from class: gb1.j

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f64699b;

            {
                this.f64699b = this;
            }

            /* JADX WARN: Type inference failed for: r3v2, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.s] */
            /* JADX WARN: Type inference failed for: r3v3, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.s] */
            /* JADX WARN: Type inference failed for: r3v4, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.s] */
            /* JADX WARN: Type inference failed for: r3v5, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.s] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i14 = i13;
                o this$0 = this.f64699b;
                switch (i14) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.f64726n.invoke();
                        break;
                    case 1:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.f64727o.invoke();
                        break;
                    case 2:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.f64728p.invoke();
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.f64729q.invoke();
                        break;
                }
            }
        });
        final int i14 = 1;
        gestaltButton2.d(new k(this, i14)).g(new View.OnClickListener(this) { // from class: gb1.j

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f64699b;

            {
                this.f64699b = this;
            }

            /* JADX WARN: Type inference failed for: r3v2, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.s] */
            /* JADX WARN: Type inference failed for: r3v3, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.s] */
            /* JADX WARN: Type inference failed for: r3v4, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.s] */
            /* JADX WARN: Type inference failed for: r3v5, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.s] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i142 = i14;
                o this$0 = this.f64699b;
                switch (i142) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.f64726n.invoke();
                        break;
                    case 1:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.f64727o.invoke();
                        break;
                    case 2:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.f64728p.invoke();
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.f64729q.invoke();
                        break;
                }
            }
        });
        final int i15 = 2;
        gestaltButton3.d(new k(this, i15)).g(new View.OnClickListener(this) { // from class: gb1.j

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f64699b;

            {
                this.f64699b = this;
            }

            /* JADX WARN: Type inference failed for: r3v2, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.s] */
            /* JADX WARN: Type inference failed for: r3v3, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.s] */
            /* JADX WARN: Type inference failed for: r3v4, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.s] */
            /* JADX WARN: Type inference failed for: r3v5, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.s] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i142 = i15;
                o this$0 = this.f64699b;
                switch (i142) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.f64726n.invoke();
                        break;
                    case 1:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.f64727o.invoke();
                        break;
                    case 2:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.f64728p.invoke();
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.f64729q.invoke();
                        break;
                }
            }
        });
        final int i16 = 3;
        gestaltButton4.d(new k(this, i16)).g(new View.OnClickListener(this) { // from class: gb1.j

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f64699b;

            {
                this.f64699b = this;
            }

            /* JADX WARN: Type inference failed for: r3v2, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.s] */
            /* JADX WARN: Type inference failed for: r3v3, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.s] */
            /* JADX WARN: Type inference failed for: r3v4, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.s] */
            /* JADX WARN: Type inference failed for: r3v5, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.s] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i142 = i16;
                o this$0 = this.f64699b;
                switch (i142) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.f64726n.invoke();
                        break;
                    case 1:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.f64727o.invoke();
                        break;
                    case 2:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.f64728p.invoke();
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.f64729q.invoke();
                        break;
                }
            }
        });
    }

    public static final void a(o oVar, String str, String str2, boolean z13, GestaltButton gestaltButton, GestaltButton gestaltButton2) {
        com.pinterest.feature.settings.notifications.d dVar = oVar.f64716d;
        if (dVar != null) {
            ((fb1.c) dVar).u3(str, str2, z13);
        }
        oVar.f64721i.i(new u81.h(z13, 20));
        b(gestaltButton, false);
        b(gestaltButton2, true);
    }

    public static void b(GestaltButton gestaltButton, boolean z13) {
        if (gestaltButton != null) {
            gestaltButton.d(new u81.h(z13, 21));
        }
    }

    @Override // com.pinterest.feature.settings.notifications.c
    public final void D0(String sectionKey, String optionKey, String optionLabel, boolean z13, boolean z14, boolean z15) {
        Intrinsics.checkNotNullParameter(sectionKey, "sectionKey");
        Intrinsics.checkNotNullParameter(optionKey, "optionKey");
        Intrinsics.checkNotNullParameter(optionLabel, "optionLabel");
        m mVar = new m(this, sectionKey, optionKey);
        boolean z16 = this.f64715c;
        int i13 = 0;
        boolean z17 = this.f64717e;
        GestaltText warning = this.f64721i;
        if (z16) {
            b(this.f64724l, z13);
            b(this.f64725m, !z13);
            warning.i(new u81.h(z13, 18));
            boolean d2 = z17 ? Intrinsics.d("settings_push_everything_biz", sectionKey) : Intrinsics.d("settings_email_everything_biz", sectionKey);
            this.f64728p = new l(this, sectionKey, optionKey, i13);
            this.f64729q = new l0(this, d2, mVar);
            Intrinsics.checkNotNullExpressionValue(warning, "warning");
            a0.o(warning, d2 ? z17 ? c52.e.tap_enable_push_notifications_to_control_business : c52.e.tap_enable_email_to_control_business : z17 ? c52.e.tap_enable_push_notifications_to_control_personal : c52.e.tap_enable_email_to_control_personal, new Object[0]);
            return;
        }
        GestaltText sectionHeader = this.f64720h;
        Intrinsics.checkNotNullExpressionValue(sectionHeader, "sectionHeader");
        a0.k0(sectionHeader);
        warning.i(new u81.h(z13, 19));
        b(this.f64722j, z13);
        b(this.f64723k, !z13);
        this.f64726n = new l(this, sectionKey, optionKey, 1);
        this.f64727o = new p91.v(9, this, mVar);
        if (z17) {
            return;
        }
        Intrinsics.checkNotNullExpressionValue(warning, "warning");
        a0.o(warning, c52.e.tap_enable_email_to_control, new Object[0]);
    }

    @Override // com.pinterest.feature.settings.notifications.c
    public final void u0() {
    }
}
