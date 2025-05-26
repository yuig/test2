package com.pinterest.feature.sharesheet.view;

import a62.e;
import af2.c;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import b62.b;
import ca1.h;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.text.GestaltText;
import fd1.y;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import org.jetbrains.annotations.NotNull;
import pk.a0;
import so.jb;
import ye2.o;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/pinterest/feature/sharesheet/view/PostIdeaPinCreateShareUpsellHeader;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "sharesheetLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class PostIdeaPinCreateShareUpsellHeader extends ConstraintLayout implements c {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f48403d = 0;

    /* renamed from: a, reason: collision with root package name */
    public o f48404a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f48405b;

    /* renamed from: c, reason: collision with root package name */
    public w f48406c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostIdeaPinCreateShareUpsellHeader(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        inject();
        View.inflate(getContext(), b62.c.post_create_upsell_header, this);
        setClipChildren(false);
        View findViewById = findViewById(b.post_pub_upsell_header_title_tv);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        View findViewById2 = findViewById(b.post_pub_upsell_header_subtitle_tv);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        View findViewById3 = findViewById(b.modal_header_dismiss_bt);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        a0.o((GestaltText) findViewById, e.pin_create_success_title, new Object[0]);
        a0.o((GestaltText) findViewById2, e.idea_pin_create_success_subtitle, new Object[0]);
        ((GestaltIconButton) findViewById3).u(new h(this, 14));
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f48404a == null) {
            this.f48404a = new o(this);
        }
        return this.f48404a;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f48404a == null) {
            this.f48404a = new o(this);
        }
        return this.f48404a.generatedComponent();
    }

    public final void inject() {
        if (this.f48405b) {
            return;
        }
        this.f48405b = true;
        this.f48406c = (w) ((jb) ((y) generatedComponent())).f113483a.f113885r0.get();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostIdeaPinCreateShareUpsellHeader(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        inject();
        View.inflate(getContext(), b62.c.post_create_upsell_header, this);
        setClipChildren(false);
        View findViewById = findViewById(b.post_pub_upsell_header_title_tv);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        View findViewById2 = findViewById(b.post_pub_upsell_header_subtitle_tv);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        View findViewById3 = findViewById(b.modal_header_dismiss_bt);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        a0.o((GestaltText) findViewById, e.pin_create_success_title, new Object[0]);
        a0.o((GestaltText) findViewById2, e.idea_pin_create_success_subtitle, new Object[0]);
        ((GestaltIconButton) findViewById3).u(new h(this, 14));
    }
}
