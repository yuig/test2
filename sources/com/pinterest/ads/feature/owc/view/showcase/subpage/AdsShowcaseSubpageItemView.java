package com.pinterest.ads.feature.owc.view.showcase.subpage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.card.MaterialCardView;
import com.pinterest.api.model.f30;
import com.pinterest.ui.imageview.WebImageView;
import h32.q2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nx.v;
import org.jetbrains.annotations.NotNull;
import ps.p;
import ps.q;
import xt.f;
import yk1.n;
import zt.a;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003B'\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/pinterest/ads/feature/owc/view/showcase/subpage/AdsShowcaseSubpageItemView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lyk1/n;", "Lnx/v;", "Lh32/q2;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ads_release"}, k = 1, mv = {1, 9, 0})
@SuppressLint({"ViewConstructor"})
/* loaded from: classes3.dex */
public final class AdsShowcaseSubpageItemView extends ConstraintLayout implements n, v {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f35399i = 0;

    /* renamed from: a, reason: collision with root package name */
    public f30 f35400a;

    /* renamed from: b, reason: collision with root package name */
    public f f35401b;

    /* renamed from: c, reason: collision with root package name */
    public final MaterialCardView f35402c;

    /* renamed from: d, reason: collision with root package name */
    public final MaterialCardView f35403d;

    /* renamed from: e, reason: collision with root package name */
    public final WebImageView f35404e;

    /* renamed from: f, reason: collision with root package name */
    public int f35405f;

    /* renamed from: g, reason: collision with root package name */
    public a f35406g;

    /* renamed from: h, reason: collision with root package name */
    public q2 f35407h;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AdsShowcaseSubpageItemView(@NotNull Context context, AttributeSet attributeSet) {
        this(4, context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // nx.v
    public final Object markImpressionEnd() {
        q2 source;
        if (this.f35405f == 0 || (source = this.f35407h) == null) {
            return null;
        }
        Intrinsics.checkNotNullParameter(source, "source");
        return new q2(source.f67189a, source.f67190b, source.f67191c, source.f67192d, Long.valueOf(System.currentTimeMillis() * 1000000), source.f67194f, source.f67195g, source.f67196h);
    }

    @Override // nx.v
    public final Object markImpressionStart() {
        f30 subpage;
        Long l13;
        Long l14;
        String id3;
        if (this.f35405f == 0) {
            return null;
        }
        q2 q2Var = this.f35407h;
        if (q2Var != null) {
            return q2Var;
        }
        f fVar = this.f35401b;
        if (fVar != null && (subpage = this.f35400a) != null) {
            long currentTimeMillis = System.currentTimeMillis() * 1000000;
            Intrinsics.checkNotNullParameter(subpage, "subpage");
            f30 f30Var = fVar.f135861d;
            if (f30Var == null || (id3 = f30Var.getId()) == null || !TextUtils.isDigitsOnly(id3)) {
                l13 = null;
            } else {
                String id4 = f30Var.getId();
                Intrinsics.checkNotNullExpressionValue(id4, "getUid(...)");
                l13 = Long.valueOf(Long.parseLong(id4));
            }
            String id5 = subpage.getId();
            if (id5 == null || !TextUtils.isDigitsOnly(id5)) {
                l14 = null;
            } else {
                String id6 = subpage.getId();
                Intrinsics.checkNotNullExpressionValue(id6, "getUid(...)");
                l14 = Long.valueOf(Long.parseLong(id6));
            }
            this.f35407h = new q2(f30Var != null ? f30Var.getId() : null, l13, f30Var != null ? f30Var.B4() : null, Long.valueOf(currentTimeMillis), null, l14, null, subpage.z4());
        }
        return this.f35407h;
    }

    public /* synthetic */ AdsShowcaseSubpageItemView(int i13, Context context, AttributeSet attributeSet) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdsShowcaseSubpageItemView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        View inflate = LayoutInflater.from(context).inflate(q.ads_showcase_subpage_item, this);
        View findViewById = inflate.findViewById(p.subpage_container);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f35402c = (MaterialCardView) findViewById;
        View findViewById2 = inflate.findViewById(p.subpage_thumbnail_container);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f35403d = (MaterialCardView) findViewById2;
        View findViewById3 = inflate.findViewById(p.subpage_thumbnail);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f35404e = (WebImageView) findViewById3;
    }
}
