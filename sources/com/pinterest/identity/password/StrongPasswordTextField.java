package com.pinterest.identity.password;

import a.z0;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.gestalt.textfield.view.GestaltTextField;
import dl1.i0;
import eo1.b;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import lu.a0;
import m60.w;
import org.jetbrains.annotations.NotNull;
import rr1.g;
import vr1.d;
import vr1.e;
import vr1.f;
import vr1.h;
import yq1.u1;
import yr1.a;
import yr1.c;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0004\n\u000b\f\rB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000e"}, d2 = {"Lcom/pinterest/identity/password/StrongPasswordTextField;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "vr1/b", "vr1/c", "vr1/d", "vr1/f", "identityLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class StrongPasswordTextField extends a0 {

    /* renamed from: m, reason: collision with root package name */
    public static final f f49845m = f.ALERT;

    /* renamed from: n, reason: collision with root package name */
    public static final d f49846n = new d(b.color_green_matchacado_450, c.strong_password_suggestion_perfection);

    /* renamed from: d, reason: collision with root package name */
    public g f49847d;

    /* renamed from: e, reason: collision with root package name */
    public w f49848e;

    /* renamed from: f, reason: collision with root package name */
    public final f f49849f;

    /* renamed from: g, reason: collision with root package name */
    public vr1.c f49850g;

    /* renamed from: h, reason: collision with root package name */
    public final GestaltTextField f49851h;

    /* renamed from: i, reason: collision with root package name */
    public final LinearProgressIndicator f49852i;

    /* renamed from: j, reason: collision with root package name */
    public final GestaltText f49853j;

    /* renamed from: k, reason: collision with root package name */
    public final GestaltButton f49854k;

    /* renamed from: l, reason: collision with root package name */
    public final Map f49855l;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StrongPasswordTextField(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void g(z0 handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f49850g = handler;
    }

    public final vr1.b i() {
        String B0 = this.f49851h.B0();
        g gVar = this.f49847d;
        if (gVar == null) {
            Intrinsics.r("passwordValidationUtils");
            throw null;
        }
        boolean c13 = gVar.c(B0, true);
        g gVar2 = this.f49847d;
        if (gVar2 != null) {
            return new vr1.b(B0, c13, gVar2.e(B0));
        }
        Intrinsics.r("passwordValidationUtils");
        throw null;
    }

    public final void j(String error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f49851h.X(new i0(error, 20));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StrongPasswordTextField(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13, 11, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        int i14 = 0;
        this.f49855l = kotlin.collections.z0.g(new Pair(0, new d(b.color_orange_firetini_300, c.strong_password_suggestion_more_complicated)), new Pair(1, new d(b.color_yellow_caramellow_200, c.strong_password_suggestion_okay)), new Pair(2, new d(b.color_green_matchacado_400, c.strong_password_suggestion_looking_good)), new Pair(3, new d(b.color_green_matchacado_400, c.strong_password_suggestion_looking_good)), new Pair(4, new d(b.color_green_matchacado_450, c.strong_password_suggestion_perfection)));
        View.inflate(context, yr1.b.view_strong_password_text_field, this);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        View findViewById = findViewById(a.strong_password_text_field);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        GestaltTextField gestaltTextField = (GestaltTextField) findViewById;
        this.f49851h = gestaltTextField;
        View findViewById2 = findViewById(a.strong_password_progress_indicator);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) findViewById2;
        this.f49852i = linearProgressIndicator;
        View findViewById3 = findViewById(a.strong_password_progress_text);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f49853j = (GestaltText) findViewById3;
        View findViewById4 = findViewById(a.strong_password_tips_button);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        GestaltButton gestaltButton = (GestaltButton) findViewById4;
        this.f49854k = gestaltButton;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, yr1.d.StrongPasswordTextField);
        Intrinsics.f(obtainStyledAttributes);
        ph.a.p(gestaltTextField, new h(obtainStyledAttributes, i14));
        e eVar = f.Companion;
        int i15 = yr1.d.StrongPasswordTextField_strong_password_field_tipsDisplayType;
        f fVar = f49845m;
        int i16 = obtainStyledAttributes.getInt(i15, fVar.ordinal());
        eVar.getClass();
        f fVar2 = i16 != 0 ? i16 != 1 ? null : f.SHEET : f.ALERT;
        this.f49849f = fVar2 != null ? fVar2 : fVar;
        obtainStyledAttributes.recycle();
        gestaltTextField.L(new u1(this, 6));
        linearProgressIndicator.setMin(0);
        linearProgressIndicator.setMax(5);
        gestaltButton.e(new vr1.a(this, i14));
    }
}
