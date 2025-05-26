package com.pinterest.feature.search.visual.lens.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import bs1.c;
import com.bumptech.glide.b;
import com.bumptech.glide.l;
import com.bumptech.glide.m;
import com.bumptech.glide.o;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import ge.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pd.r;
import rq.t0;
import s81.n;
import uc2.d;
import uc2.f;
import uc2.g;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/pinterest/feature/search/visual/lens/view/RoomRepaintInfoView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "visualSearch_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class RoomRepaintInfoView extends FrameLayout {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f48054e = 0;

    /* renamed from: a, reason: collision with root package name */
    public final GestaltText f48055a;

    /* renamed from: b, reason: collision with root package name */
    public final GestaltText f48056b;

    /* renamed from: c, reason: collision with root package name */
    public final ImageView f48057c;

    /* renamed from: d, reason: collision with root package name */
    public final GestaltButton f48058d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoomRepaintInfoView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(getContext(), f.view_room_repaint_info, this);
        View findViewById = findViewById(d.room_repaint_info_title);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f48055a = (GestaltText) findViewById;
        View findViewById2 = findViewById(d.room_repaint_info_subtitle);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f48056b = (GestaltText) findViewById2;
        View findViewById3 = findViewById(d.room_repaint_loading_animation);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f48057c = (ImageView) findViewById3;
        View findViewById4 = findViewById(d.room_repaint_retry_button);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f48058d = (GestaltButton) findViewById4;
    }

    public final void a() {
        o f13 = b.f(getContext());
        f13.getClass();
        f13.e(new m(this.f48057c));
        c.X0(this);
    }

    public final void b(n onRetry) {
        Intrinsics.checkNotNullParameter(onRetry, "onRetry");
        this.f48055a.setText("Oops! Could not generate image.");
        this.f48056b.setText("This feature is in early development. Please try again or try using a different picture for better results.");
        GestaltButton gestaltButton = this.f48058d;
        c.U1(gestaltButton);
        gestaltButton.setOnClickListener(new t0(26, onRetry));
        o f13 = b.f(getContext());
        f13.getClass();
        ImageView imageView = this.f48057c;
        f13.e(new m(imageView));
        c.X0(imageView);
    }

    public final void c() {
        this.f48055a.setText("Dreaming up your space...");
        this.f48056b.setText("This may take a few seconds");
        c.X0(this.f48058d);
        l d2 = b.f(getContext()).d();
        l K = d2.K(Integer.valueOf(g.room_repaint_loading_animation));
        Context context = d2.A;
        l lVar = (l) ((l) ((l) K.v(context.getTheme())).t(a.c(context))).h(r.f99744a);
        ImageView imageView = this.f48057c;
        lVar.G(imageView);
        c.U1(imageView);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoomRepaintInfoView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(getContext(), f.view_room_repaint_info, this);
        View findViewById = findViewById(d.room_repaint_info_title);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f48055a = (GestaltText) findViewById;
        View findViewById2 = findViewById(d.room_repaint_info_subtitle);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f48056b = (GestaltText) findViewById2;
        View findViewById3 = findViewById(d.room_repaint_loading_animation);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f48057c = (ImageView) findViewById3;
        View findViewById4 = findViewById(d.room_repaint_retry_button);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f48058d = (GestaltButton) findViewById4;
    }
}
