package com.pinterest.feature.board.detail.invite.view.lego;

import af2.c;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.pinterest.ui.components.banners.LegoBannerView;
import kl0.u;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import m60.r0;
import m60.x0;
import org.jetbrains.annotations.NotNull;
import vn1.g;
import ye2.o;
import yk0.a;
import yk0.b;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\fB\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/pinterest/feature/board/detail/invite/view/lego/LegoBoardDetailInviteView;", "Landroid/widget/FrameLayout;", "Lyk0/b;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "kl0/u", "boardLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class LegoBoardDetailInviteView extends FrameLayout implements b, c {

    /* renamed from: a, reason: collision with root package name */
    public o f45227a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f45228b;

    /* renamed from: c, reason: collision with root package name */
    public a f45229c;

    /* renamed from: d, reason: collision with root package name */
    public final AttributeSet f45230d;

    /* renamed from: e, reason: collision with root package name */
    public final int f45231e;

    /* renamed from: f, reason: collision with root package name */
    public final LegoBannerView f45232f;

    /* renamed from: g, reason: collision with root package name */
    public u f45233g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LegoBoardDetailInviteView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        if (!this.f45228b) {
            this.f45228b = true;
            ((al0.b) generatedComponent()).getClass();
        }
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        setClipChildren(false);
        setClipToPadding(false);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.f45232f = a(context2, this.f45230d, this.f45231e);
        this.f45230d = attributeSet;
    }

    public final LegoBannerView a(Context context, AttributeSet attributeSet, int i13) {
        LegoBannerView legoBannerView = new LegoBannerView(context, attributeSet, i13);
        legoBannerView.D();
        String string = legoBannerView.getResources().getString(x0.accept);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        legoBannerView.d0(string);
        String string2 = legoBannerView.getResources().getString(x0.decline);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        legoBannerView.g0(string2);
        legoBannerView.t(legoBannerView.getResources().getDimension(r0.group_board_banner_corner_radius));
        legoBannerView.l(legoBannerView.getResources().getDimension(r0.group_board_banner_elevation));
        bs1.c.X0(legoBannerView);
        addView(legoBannerView, new FrameLayout.LayoutParams(-1, -2));
        return legoBannerView;
    }

    public final void b(String title, String str, String str2) {
        Intrinsics.checkNotNullParameter(title, "title");
        if ((!z.j(title)) && str != null && !z.j(str)) {
            title = a.a.D(title, "\n", str);
        } else if (!(!z.j(title)) || (str != null && !z.j(str))) {
            title = (str == null || !(z.j(str) ^ true)) ? "" : str;
        }
        LegoBannerView legoBannerView = this.f45232f;
        if (str2 == null || z.j(str2)) {
            legoBannerView.Z(title);
        } else {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(title);
            Context context = getContext();
            int i13 = eo1.b.color_gray_500;
            Object obj = d5.a.f53679a;
            spannableStringBuilder.setSpan(new ForegroundColorSpan(context.getColor(i13)), spannableStringBuilder.length(), spannableStringBuilder.length(), 18);
            spannableStringBuilder.append((CharSequence) (" " + str2));
            legoBannerView.Z(spannableStringBuilder);
        }
        legoBannerView.a0(g.BODY_400);
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f45227a == null) {
            this.f45227a = new o(this);
        }
        return this.f45227a;
    }

    public final void e(u listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f45233g = listener;
    }

    public final void g() {
        bs1.c.U1(this.f45232f);
        u uVar = this.f45233g;
        if (uVar != null) {
            LegoBoardDetailInviteView this_apply = uVar.f80117b;
            Intrinsics.checkNotNullExpressionValue(this_apply, "$this_apply");
            kl0.z.k9(uVar.f80116a, this_apply, true);
        }
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f45227a == null) {
            this.f45227a = new o(this);
        }
        return this.f45227a.generatedComponent();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LegoBoardDetailInviteView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        if (!this.f45228b) {
            this.f45228b = true;
            ((al0.b) generatedComponent()).getClass();
        }
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        setClipChildren(false);
        setClipToPadding(false);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.f45232f = a(context2, this.f45230d, this.f45231e);
        this.f45230d = attributeSet;
        this.f45231e = i13;
    }
}
