package com.pinterest.feature.shopping.shoppingstories.structuredfeed.storyviews;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.api.model.dk0;
import com.pinterest.api.model.sr;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.WebImageView;
import eo1.b;
import eo1.c;
import h32.u;
import java.util.Iterator;
import java.util.List;
import kh2.d;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import nx.v;
import org.jetbrains.annotations.NotNull;
import pk.a0;
import r82.f;
import r82.g;
import we1.i;
import we1.j;
import we1.k;
import we1.l;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003B'\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/pinterest/feature/shopping/shoppingstories/structuredfeed/storyviews/BoardMoreIdeasUpsellCardView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lwe1/l;", "Lnx/v;", "Ltq0/d;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "structuredFeedLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class BoardMoreIdeasUpsellCardView extends ConstraintLayout implements l, v {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f48503i = 0;

    /* renamed from: a, reason: collision with root package name */
    public final WebImageView f48504a;

    /* renamed from: b, reason: collision with root package name */
    public final WebImageView f48505b;

    /* renamed from: c, reason: collision with root package name */
    public final WebImageView f48506c;

    /* renamed from: d, reason: collision with root package name */
    public final GestaltText f48507d;

    /* renamed from: e, reason: collision with root package name */
    public final GestaltText f48508e;

    /* renamed from: f, reason: collision with root package name */
    public String f48509f;

    /* renamed from: g, reason: collision with root package name */
    public j f48510g;

    /* renamed from: h, reason: collision with root package name */
    public u f48511h;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BoardMoreIdeasUpsellCardView(@NotNull Context context, AttributeSet attributeSet) {
        this(4, context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static void X(WebImageView webImageView, List list, float f13) {
        if (list == null || list.size() != 3) {
            return;
        }
        webImageView.setBackgroundColor(Color.argb((int) (f13 * 255), ((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue(), ((Number) list.get(2)).intValue()));
    }

    public final WebImageView L(int i13) {
        View findViewById = findViewById(i13);
        WebImageView webImageView = (WebImageView) findViewById;
        webImageView.U1(c.lego_corner_radius_medium);
        webImageView.setBackgroundColor(bs1.c.B(webImageView, b.color_themed_light_gray));
        webImageView.M1(d.p(1));
        webImageView.a2(true);
        webImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        webImageView.o0(bs1.c.B(webImageView, b.color_white_0));
        Intrinsics.checkNotNullExpressionValue(findViewById, "apply(...)");
        return webImageView;
    }

    public final void T(List list, List list2) {
        Iterator it = CollectionsKt.N0(list, list2).iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            WebImageView webImageView = (WebImageView) pair.f80346a;
            sr srVar = (sr) pair.f80347b;
            webImageView.loadUrl(srVar.j());
            String g13 = srVar.g();
            if (g13 != null) {
                int parseColor = Color.parseColor(g13);
                X(webImageView, f0.j(Integer.valueOf((parseColor >> 16) & 255), Integer.valueOf((parseColor >> 8) & 255), Integer.valueOf(parseColor & 255)), 1.0f);
            }
        }
    }

    @Override // we1.l
    public final void c1(String str, String boardName, String boardId, List images, List list, k onTapListener, j loggingSpec, dk0 dk0Var) {
        Intrinsics.checkNotNullParameter(boardName, "boardName");
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        Intrinsics.checkNotNullParameter(images, "images");
        Intrinsics.checkNotNullParameter(onTapListener, "onTapListener");
        Intrinsics.checkNotNullParameter(loggingSpec, "loggingSpec");
        if (str == null) {
            str = getResources().getString(g.more_ideas_card_default_header);
            Intrinsics.checkNotNullExpressionValue(str, "getString(...)");
        }
        a0.p(this.f48507d, str);
        a0.p(this.f48508e, boardName);
        WebImageView webImageView = this.f48504a;
        WebImageView webImageView2 = this.f48505b;
        WebImageView webImageView3 = this.f48506c;
        for (WebImageView webImageView4 : f0.j(webImageView, webImageView2, webImageView3)) {
            webImageView4.J1();
            webImageView4.setBackgroundColor(bs1.c.B(this, b.color_themed_light_gray));
        }
        int size = images.size();
        if (size == 0) {
            Iterator it = f0.j(webImageView, webImageView2, webImageView3).iterator();
            while (it.hasNext()) {
                bs1.c.X0((WebImageView) it.next());
            }
        } else if (size == 1) {
            T(e0.b(webImageView), images);
            X(webImageView2, list, 1.0f);
            X(webImageView3, list, 0.6f);
        } else if (size == 2) {
            T(f0.j(webImageView, webImageView2), images);
            X(webImageView3, list, 1.0f);
        } else if (size == 3) {
            T(f0.j(webImageView, webImageView2, webImageView3), images);
        }
        this.f48509f = boardId;
        this.f48510g = loggingSpec;
        setOnClickListener(new i(onTapListener, boardId, boardName, loggingSpec, dk0Var, 0));
    }

    @Override // nx.v
    public final Object markImpressionEnd() {
        u source = this.f48511h;
        if (source == null || this.f48509f == null || this.f48510g == null) {
            return null;
        }
        Intrinsics.checkNotNullParameter(source, "source");
        Long valueOf = Long.valueOf(System.currentTimeMillis() * 1000000);
        String valueOf2 = String.valueOf(this.f48509f);
        j jVar = this.f48510g;
        Short valueOf3 = jVar != null ? Short.valueOf((short) jVar.f129438f) : null;
        j jVar2 = this.f48510g;
        Short valueOf4 = jVar2 != null ? Short.valueOf((short) jVar2.f129433a) : null;
        j jVar3 = this.f48510g;
        Short valueOf5 = jVar3 != null ? Short.valueOf((short) jVar3.f129434b) : null;
        j jVar4 = this.f48510g;
        return new tq0.d(new u(source.f67260a, source.f67261b, valueOf, jVar4 != null ? jVar4.f129435c : null, valueOf3, valueOf5, valueOf2, valueOf4), jVar4 != null ? jVar4.f129437e : null);
    }

    @Override // nx.v
    public final Object markImpressionStart() {
        u uVar = new u(null, ep.b.f(1000000L), null, null, null, null, null, null);
        this.f48511h = uVar;
        return new tq0.d(uVar, null);
    }

    public /* synthetic */ BoardMoreIdeasUpsellCardView(int i13, Context context, AttributeSet attributeSet) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BoardMoreIdeasUpsellCardView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(context, f.board_more_ideas_upsell_card_view, this);
        int p13 = d.p(12);
        setPaddingRelative(p13, 0, p13, 0);
        setBackground(bs1.c.f0(this, eo1.d.lego_medium_black_rounded_rect, null, null, 6));
        setClipChildren(false);
        setClipToPadding(false);
        this.f48504a = L(r82.d.board_image_top);
        this.f48505b = L(r82.d.board_image_middle);
        this.f48506c = L(r82.d.board_image_bottom);
        View findViewById = findViewById(r82.d.header_text);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f48507d = (GestaltText) findViewById;
        View findViewById2 = findViewById(r82.d.board_name);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f48508e = (GestaltText) findViewById2;
    }
}
