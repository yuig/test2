package com.pinterest.video.view;

import a.z0;
import a7.v0;
import ac2.a1;
import ac2.c1;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.media3.ui.LegacyPlayerControlView;
import androidx.media3.ui.h0;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.iconcomponent.GestaltIcon;
import com.pinterest.gestalt.text.GestaltText;
import ha2.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import oc2.b;
import oc2.k;
import om1.c;
import org.jetbrains.annotations.NotNull;
import pc2.a;
import rm1.q;
import xk2.d;

@d
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0017\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004:\u0002\u000e\u000fB\u001d\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nB%\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\t\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/pinterest/video/view/SimplePlayerControlView;", "Lpc2/a;", "Listener", "Landroidx/media3/ui/LegacyPlayerControlView;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "org/chromium/net/y", "a/z0", "video_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public class SimplePlayerControlView<Listener extends a> extends LegacyPlayerControlView {

    /* renamed from: q0, reason: collision with root package name */
    public static final /* synthetic */ int f52779q0 = 0;

    /* renamed from: c0, reason: collision with root package name */
    public final FrameLayout f52780c0;

    /* renamed from: d0, reason: collision with root package name */
    public final GestaltIcon f52781d0;

    /* renamed from: e0, reason: collision with root package name */
    public final FrameLayout f52782e0;

    /* renamed from: f0, reason: collision with root package name */
    public final GestaltIcon f52783f0;

    /* renamed from: g0, reason: collision with root package name */
    public final GestaltIconButton f52784g0;

    /* renamed from: h0, reason: collision with root package name */
    public final PinterestDefaultTimeBar f52785h0;

    /* renamed from: i0, reason: collision with root package name */
    public final GestaltText f52786i0;

    /* renamed from: j0, reason: collision with root package name */
    public final GestaltText f52787j0;

    /* renamed from: k0, reason: collision with root package name */
    public final LinearLayout f52788k0;

    /* renamed from: l0, reason: collision with root package name */
    public final int[] f52789l0;

    /* renamed from: m0, reason: collision with root package name */
    public a f52790m0;

    /* renamed from: n0, reason: collision with root package name */
    public b f52791n0;

    /* renamed from: o0, reason: collision with root package name */
    public z0 f52792o0;

    /* renamed from: p0, reason: collision with root package name */
    public Boolean f52793p0;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SimplePlayerControlView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // androidx.media3.ui.LegacyPlayerControlView
    public final void g(v0 v0Var) {
        this.f52791n0 = null;
        if (v0Var != null) {
            this.f52791n0 = new b(v0Var, this);
        }
        b bVar = this.f52791n0;
        if (bVar != null) {
            v0Var = bVar;
        }
        super.g(v0Var);
    }

    public final void p(boolean z13) {
        FrameLayout frameLayout = this.f52782e0;
        if (frameLayout != null) {
            frameLayout.setEnabled(z13);
        }
        GestaltIcon gestaltIcon = this.f52783f0;
        if (gestaltIcon != null) {
            gestaltIcon.setEnabled(z13);
        }
        if (frameLayout == null) {
            return;
        }
        frameLayout.setAlpha(z13 ? 1.0f : 0.5f);
    }

    public final boolean q() {
        c w13;
        GestaltIconButton gestaltIconButton = this.f52784g0;
        return ((gestaltIconButton == null || (w13 = gestaltIconButton.w()) == null) ? null : w13.f96639a) == q.CAPTIONS;
    }

    public final void r(boolean z13) {
        GestaltIcon gestaltIcon = this.f52783f0;
        if (gestaltIcon != null) {
            dl2.b.z(gestaltIcon, new fx1.d(z13, 24));
        }
        FrameLayout frameLayout = this.f52782e0;
        if (frameLayout == null) {
            return;
        }
        frameLayout.setContentDescription(getContext().getString(z13 ? c1.video_button_unmute_a11y : c1.video_button_mute_a11y));
    }

    public final void s(boolean z13) {
        FrameLayout frameLayout = this.f52780c0;
        if (frameLayout == null) {
            return;
        }
        frameLayout.setVisibility(z13 ? 0 : 8);
    }

    @Override // android.view.View
    public final void setVisibility(int i13) {
        k.a(this, i13, new j(this, 22));
    }

    public final void t(boolean z13) {
        FrameLayout frameLayout = this.f52782e0;
        if (frameLayout == null) {
            return;
        }
        frameLayout.setVisibility(z13 ? 0 : 8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimplePlayerControlView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f52789l0 = new int[2];
        int i14 = 1;
        rb2.k kVar = new rb2.k(this, i14);
        FrameLayout frameLayout = (FrameLayout) findViewById(a1.mute_toggle_button);
        this.f52782e0 = frameLayout;
        GestaltIcon gestaltIcon = (GestaltIcon) findViewById(a1.player_mute);
        this.f52783f0 = gestaltIcon;
        FrameLayout frameLayout2 = (FrameLayout) findViewById(a1.full_screen_toggle_button);
        this.f52780c0 = frameLayout2;
        GestaltIcon gestaltIcon2 = (GestaltIcon) findViewById(a1.player_expand);
        this.f52781d0 = gestaltIcon2;
        if (frameLayout != null) {
            frameLayout.setOnClickListener(kVar);
        }
        if (frameLayout2 != null) {
            frameLayout2.setOnClickListener(kVar);
        }
        GestaltIconButton gestaltIconButton = (GestaltIconButton) findViewById(a1.cc_toggle_button);
        this.f52784g0 = gestaltIconButton;
        if (gestaltIconButton != null) {
            gestaltIconButton.u(new di1.d(this, i14));
        }
        this.f52788k0 = (LinearLayout) findViewById(a1.exo_video_controls_container);
        this.f52785h0 = (PinterestDefaultTimeBar) findViewById(h0.exo_progress);
        this.f52786i0 = (GestaltText) findViewById(h0.exo_position);
        this.f52787j0 = (GestaltText) findViewById(h0.exo_duration);
        if (frameLayout != null) {
            frameLayout.setContentDescription(context.getString(c1.video_button_mute_a11y));
        }
        if (gestaltIcon != null) {
            gestaltIcon.g2(oc2.a.f94059j);
        }
        if (gestaltIcon2 != null) {
            gestaltIcon2.g2(oc2.a.f94060k);
        }
    }
}
