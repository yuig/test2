package com.pinterest.feature.settings.account.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import b52.a;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.gestalt.textfield.view.GestaltTextField;
import d91.l;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import l11.p;
import lb2.d;
import lq0.o;
import lu.a0;
import org.jetbrains.annotations.NotNull;
import q91.b;
import q91.f1;
import rq.l4;
import u81.h;
import yk1.n;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/pinterest/feature/settings/account/view/PasswordEditView;", "Landroid/widget/FrameLayout;", "Lyk1/n;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "account_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class PasswordEditView extends a0 implements n {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f48130i = 0;

    /* renamed from: d, reason: collision with root package name */
    public final GestaltTextField f48131d;

    /* renamed from: e, reason: collision with root package name */
    public final GestaltText f48132e;

    /* renamed from: f, reason: collision with root package name */
    public d f48133f;

    /* renamed from: g, reason: collision with root package name */
    public Function0 f48134g;

    /* renamed from: h, reason: collision with root package name */
    public Function1 f48135h;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PasswordEditView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final String g() {
        GestaltTextField gestaltTextField = this.f48131d;
        if (gestaltTextField != null) {
            return StringsKt.i0(gestaltTextField.B0()).toString();
        }
        Intrinsics.r("inputText");
        throw null;
    }

    public final void i() {
        GestaltTextField gestaltTextField = this.f48131d;
        if (gestaltTextField != null) {
            gestaltTextField.X(b.f103068o);
        } else {
            Intrinsics.r("inputText");
            throw null;
        }
    }

    public final void j(h81.b doneInputHandler) {
        Intrinsics.checkNotNullParameter(doneInputHandler, "doneInputHandler");
        this.f48134g = doneInputHandler;
    }

    public final void k(f1 action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.f48135h = action;
    }

    public final void l(Integer num) {
        if (num != null) {
            GestaltTextField gestaltTextField = this.f48131d;
            if (gestaltTextField == null) {
                Intrinsics.r("inputText");
                throw null;
            }
            if (gestaltTextField.X(new l4(num, 6)) != null) {
                return;
            }
        }
        GestaltTextField gestaltTextField2 = this.f48131d;
        if (gestaltTextField2 != null) {
            gestaltTextField2.X(b.f103069p);
        } else {
            Intrinsics.r("inputText");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasswordEditView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13, 9, 0);
        String str;
        Intrinsics.checkNotNullParameter(context, "context");
        setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
        View.inflate(context, b52.b.view_password_edit, this);
        View findViewById = findViewById(a.password_edit_text);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f48131d = (GestaltTextField) findViewById;
        View findViewById2 = findViewById(a.password_forgot_text);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f48132e = (GestaltText) findViewById2;
        boolean z13 = false;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, b52.d.PasswordEditView, 0, 0);
            Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
            str = obtainStyledAttributes.getString(b52.d.PasswordEditView_titleText);
            z13 = obtainStyledAttributes.getBoolean(b52.d.PasswordEditView_forgotActionEnabled, false);
            obtainStyledAttributes.recycle();
        } else {
            str = null;
        }
        GestaltTextField gestaltTextField = this.f48131d;
        if (gestaltTextField == null) {
            Intrinsics.r("inputText");
            throw null;
        }
        gestaltTextField.X(new l(str, 2));
        GestaltTextField gestaltTextField2 = this.f48131d;
        if (gestaltTextField2 == null) {
            Intrinsics.r("inputText");
            throw null;
        }
        gestaltTextField2.Z(new p(this, 25));
        GestaltText gestaltText = this.f48132e;
        if (gestaltText == null) {
            Intrinsics.r("forgotText");
            throw null;
        }
        gestaltText.i(new h(z13, 7));
        if (z13) {
            gestaltText.j(new o(29, this, gestaltText));
        }
    }
}
