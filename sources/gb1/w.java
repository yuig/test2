package gb1;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.LinearLayout;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.jvm.internal.Intrinsics;
import m60.r0;
import pk.a0;
import qv0.d0;
import so.jb;

/* loaded from: classes5.dex */
public final class w extends LinearLayout implements af2.c {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f64736f = 0;

    /* renamed from: a, reason: collision with root package name */
    public ye2.o f64737a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f64738b;

    /* renamed from: c, reason: collision with root package name */
    public final m60.w f64739c;

    /* renamed from: d, reason: collision with root package name */
    public final GestaltButton f64740d;

    /* renamed from: e, reason: collision with root package name */
    public final GestaltButton f64741e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(Context context, int i13, com.pinterest.feature.settings.notifications.f turnOffAllNotifsListener) {
        super(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(turnOffAllNotifsListener, "turnOffAllNotifsListener");
        if (!this.f64738b) {
            this.f64738b = true;
            this.f64739c = (m60.w) ((jb) ((y) generatedComponent())).f113483a.f113885r0.get();
        }
        setOrientation(1);
        View.inflate(context, c52.d.modal_view_turn_off_all_notifs, this);
        Resources resources = context.getResources();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        Intrinsics.f(resources);
        int K = a0.K(16, resources);
        com.bumptech.glide.c.a1(layoutParams, K, context.getResources().getDimensionPixelOffset(r0.margin_one_and_a_half), K, 0);
        setLayoutParams(layoutParams);
        View findViewById = findViewById(c52.c.turn_off_notifs_description);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        a0.o((GestaltText) findViewById, i13, new Object[0]);
        View findViewById2 = findViewById(c52.c.turn_off_notifs_cancel_button);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f64740d = (GestaltButton) findViewById2;
        View findViewById3 = findViewById(c52.c.turn_off_notifs_confirm_button);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f64741e = (GestaltButton) findViewById3;
        GestaltButton gestaltButton = this.f64740d;
        if (gestaltButton == null) {
            Intrinsics.r("cancelBtn");
            throw null;
        }
        gestaltButton.d(v.f64733j).g(new x91.k(this, 10));
        GestaltButton gestaltButton2 = this.f64741e;
        if (gestaltButton2 != null) {
            gestaltButton2.d(v.f64734k).g(new d0(27, turnOffAllNotifsListener, this));
        } else {
            Intrinsics.r("confirmBtn");
            throw null;
        }
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f64737a == null) {
            this.f64737a = new ye2.o(this);
        }
        return this.f64737a;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f64737a == null) {
            this.f64737a = new ye2.o(this);
        }
        return this.f64737a.generatedComponent();
    }
}
