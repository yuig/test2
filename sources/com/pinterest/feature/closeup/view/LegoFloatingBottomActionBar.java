package com.pinterest.feature.closeup.view;

import af2.c;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.p;
import com.pinterest.api.model.f30;
import com.pinterest.feature.sharesheet.view.AnimatedSendShareButton;
import com.pinterest.gestalt.button.view.GestaltButton;
import jh0.d;
import jo1.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import np0.g;
import np0.i;
import np0.j;
import nx.d0;
import org.jetbrains.annotations.NotNull;
import so.jb;
import xj2.b;
import xk2.m;
import xk2.v;
import ye2.o;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB!\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/pinterest/feature/closeup/view/LegoFloatingBottomActionBar;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ads_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class LegoFloatingBottomActionBar extends ConstraintLayout implements c {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f45446n = 0;

    /* renamed from: a, reason: collision with root package name */
    public o f45447a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f45448b;

    /* renamed from: c, reason: collision with root package name */
    public w f45449c;

    /* renamed from: d, reason: collision with root package name */
    public g f45450d;

    /* renamed from: e, reason: collision with root package name */
    public final v f45451e;

    /* renamed from: f, reason: collision with root package name */
    public final b f45452f;

    /* renamed from: g, reason: collision with root package name */
    public final AnimatedSendShareButton f45453g;

    /* renamed from: h, reason: collision with root package name */
    public final float f45454h;

    /* renamed from: i, reason: collision with root package name */
    public String f45455i;

    /* renamed from: j, reason: collision with root package name */
    public GestaltButton f45456j;

    /* renamed from: k, reason: collision with root package name */
    public d0 f45457k;

    /* renamed from: l, reason: collision with root package name */
    public f30 f45458l;

    /* renamed from: m, reason: collision with root package name */
    public final i f45459m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LegoFloatingBottomActionBar(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        inject();
        a aVar = a.HOMEFEED;
        this.f45451e = m.b(new d(this, 29));
        this.f45452f = new b();
        this.f45454h = getResources().getDimension(p80.a.lego_closeup_bottom_toolbar_elevation);
        this.f45455i = "unknown";
        View.inflate(getContext(), r80.d.view_floating_action_button_bottom_toolbar, this);
        View findViewById = findViewById(r80.c.action_button_share_right);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        AnimatedSendShareButton animatedSendShareButton = (AnimatedSendShareButton) findViewById;
        this.f45453g = animatedSendShareButton;
        animatedSendShareButton.setOnClickListener(new lj0.a(this, 16));
        this.f45459m = new i(this);
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f45447a == null) {
            this.f45447a = new o(this);
        }
        return this.f45447a;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f45447a == null) {
            this.f45447a = new o(this);
        }
        return this.f45447a.generatedComponent();
    }

    public final void inject() {
        if (this.f45448b) {
            return;
        }
        this.f45448b = true;
        jb jbVar = (jb) ((j) generatedComponent());
        this.f45449c = (w) jbVar.f113483a.f113885r0.get();
        this.f45450d = jbVar.f113485c.h5();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f45458l != null) {
            View findViewById = findViewById(r80.c.lego_closeup_floating_action_bar);
            Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
            new p().j((ConstraintLayout) findViewById);
            this.f45453g.setOnClickListener(new lj0.a(this, 16));
            w wVar = this.f45449c;
            if (wVar != null) {
                wVar.h(this.f45459m);
            } else {
                Intrinsics.r("eventManager");
                throw null;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f45452f.d();
        w wVar = this.f45449c;
        if (wVar == null) {
            Intrinsics.r("eventManager");
            throw null;
        }
        wVar.j(this.f45459m);
        super.onDetachedFromWindow();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i13, int i14) {
        if (hf0.b.q()) {
            i13 = View.MeasureSpec.makeMeasureSpec(com.bumptech.glide.c.G(), 1073741824);
        }
        super.onMeasure(i13, i14);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LegoFloatingBottomActionBar(@NotNull Context context, @NotNull AttributeSet attrs, int i13) {
        super(context, attrs, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        inject();
        a aVar = a.HOMEFEED;
        this.f45451e = m.b(new d(this, 29));
        this.f45452f = new b();
        this.f45454h = getResources().getDimension(p80.a.lego_closeup_bottom_toolbar_elevation);
        this.f45455i = "unknown";
        View.inflate(getContext(), r80.d.view_floating_action_button_bottom_toolbar, this);
        View findViewById = findViewById(r80.c.action_button_share_right);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        AnimatedSendShareButton animatedSendShareButton = (AnimatedSendShareButton) findViewById;
        this.f45453g = animatedSendShareButton;
        animatedSendShareButton.setOnClickListener(new lj0.a(this, 16));
        this.f45459m = new i(this);
    }
}
