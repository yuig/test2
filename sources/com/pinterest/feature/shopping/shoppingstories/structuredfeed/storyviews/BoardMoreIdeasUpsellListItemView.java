package com.pinterest.feature.shopping.shoppingstories.structuredfeed.storyviews;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import bs1.c;
import com.pinterest.api.model.dk0;
import com.pinterest.api.model.sr;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.WebImageView;
import ep.b;
import h32.u;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nx.v;
import org.jetbrains.annotations.NotNull;
import pk.a0;
import r82.f;
import tq0.d;
import we1.i;
import we1.j;
import we1.k;
import we1.l;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003B'\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/pinterest/feature/shopping/shoppingstories/structuredfeed/storyviews/BoardMoreIdeasUpsellListItemView;", "Landroid/widget/LinearLayout;", "Lwe1/l;", "Lnx/v;", "Ltq0/d;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "structuredFeedLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class BoardMoreIdeasUpsellListItemView extends LinearLayout implements l, v {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f48512f = 0;

    /* renamed from: a, reason: collision with root package name */
    public final WebImageView f48513a;

    /* renamed from: b, reason: collision with root package name */
    public final GestaltText f48514b;

    /* renamed from: c, reason: collision with root package name */
    public String f48515c;

    /* renamed from: d, reason: collision with root package name */
    public j f48516d;

    /* renamed from: e, reason: collision with root package name */
    public u f48517e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BoardMoreIdeasUpsellListItemView(@NotNull Context context, AttributeSet attributeSet) {
        this(4, context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // we1.l
    public final void c1(String str, String boardName, String boardId, List images, List list, k onTapListener, j loggingSpec, dk0 dk0Var) {
        Intrinsics.checkNotNullParameter(boardName, "boardName");
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        Intrinsics.checkNotNullParameter(images, "images");
        Intrinsics.checkNotNullParameter(onTapListener, "onTapListener");
        Intrinsics.checkNotNullParameter(loggingSpec, "loggingSpec");
        a0.p(this.f48514b, boardName);
        WebImageView webImageView = this.f48513a;
        webImageView.J1();
        if (!images.isEmpty()) {
            if (list != null && list.size() == 3) {
                webImageView.setBackgroundColor(Color.rgb(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue(), ((Number) list.get(2)).intValue()));
            }
            webImageView.loadUrl(((sr) images.get(0)).j());
        }
        this.f48515c = boardId;
        this.f48516d = loggingSpec;
        setOnClickListener(new i(onTapListener, boardId, boardName, loggingSpec, dk0Var, 1));
    }

    @Override // nx.v
    public final Object markImpressionEnd() {
        u source = this.f48517e;
        if (source == null || this.f48515c == null || this.f48516d == null) {
            return null;
        }
        Intrinsics.checkNotNullParameter(source, "source");
        Long valueOf = Long.valueOf(System.currentTimeMillis() * 1000000);
        String valueOf2 = String.valueOf(this.f48515c);
        j jVar = this.f48516d;
        Short valueOf3 = jVar != null ? Short.valueOf((short) jVar.f129433a) : null;
        j jVar2 = this.f48516d;
        Short valueOf4 = jVar2 != null ? Short.valueOf((short) jVar2.f129434b) : null;
        j jVar3 = this.f48516d;
        return new d(new u(source.f67260a, source.f67261b, valueOf, jVar3 != null ? jVar3.f129435c : null, valueOf3, valueOf4, valueOf2, source.f67267h), jVar3 != null ? jVar3.f129437e : null);
    }

    @Override // nx.v
    public final Object markImpressionStart() {
        u uVar = new u(null, b.f(1000000L), null, null, null, null, null, null);
        this.f48517e = uVar;
        return new d(uVar, null);
    }

    public /* synthetic */ BoardMoreIdeasUpsellListItemView(int i13, Context context, AttributeSet attributeSet) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BoardMoreIdeasUpsellListItemView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        oq.i iVar = new oq.i(this, 13);
        View.inflate(context, f.board_more_ideas_upsell_list_item_view, this);
        Drawable f03 = c.f0(this, eo1.d.lego_medium_black_rounded_rect, null, null, 6);
        if (f03 instanceof GradientDrawable) {
            f03.mutate();
            ((GradientDrawable) f03).setCornerRadius(c.W(this, eo1.c.lego_corner_radius_small));
        }
        setBackground(f03);
        setClipChildren(false);
        setClipToPadding(false);
        View findViewById = findViewById(r82.d.board_image);
        WebImageView webImageView = (WebImageView) findViewById;
        Intrinsics.f(webImageView);
        float W = c.W(webImageView, eo1.c.lego_corner_radius_small);
        webImageView.g2(com.bumptech.glide.c.w0(this) ? 0.0f : W, com.bumptech.glide.c.w0(this) ? W : 0.0f, com.bumptech.glide.c.w0(this) ? W : 0.0f, com.bumptech.glide.c.w0(this) ? 0.0f : W);
        webImageView.setBackgroundColor(c.B(webImageView, eo1.b.color_themed_light_gray));
        webImageView.a2(true);
        webImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        webImageView.Y(iVar);
        Intrinsics.checkNotNullExpressionValue(findViewById, "apply(...)");
        this.f48513a = webImageView;
        View findViewById2 = findViewById(r82.d.board_name);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f48514b = (GestaltText) findViewById2;
    }
}
