package com.pinterest.feature.todaytab.tab.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.following.view.lego.CreatorFollowButton;
import com.pinterest.gestalt.avatar.GestaltAvatar;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.WebImageView;
import h32.g0;
import h32.i0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kh2.m0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m60.r0;
import nx.d0;
import nx.v;
import org.jetbrains.annotations.NotNull;
import pk.a0;
import q5.v0;
import qf1.z;
import we1.a2;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nB#\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\t\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/pinterest/feature/todaytab/tab/view/TodayTabSingleCreatorModule;", "Landroid/widget/FrameLayout;", "Lch1/b;", "Lnx/v;", "Lh32/c3;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "todayTabLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class TodayTabSingleCreatorModule extends FrameLayout implements ch1.b, v {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f48659l = 0;

    /* renamed from: a, reason: collision with root package name */
    public final GestaltAvatar f48660a;

    /* renamed from: b, reason: collision with root package name */
    public final WebImageView f48661b;

    /* renamed from: c, reason: collision with root package name */
    public final WebImageView f48662c;

    /* renamed from: d, reason: collision with root package name */
    public final WebImageView f48663d;

    /* renamed from: e, reason: collision with root package name */
    public final GestaltText f48664e;

    /* renamed from: f, reason: collision with root package name */
    public final GestaltText f48665f;

    /* renamed from: g, reason: collision with root package name */
    public final ViewGroup f48666g;

    /* renamed from: h, reason: collision with root package name */
    public CreatorFollowButton f48667h;

    /* renamed from: i, reason: collision with root package name */
    public dh1.e f48668i;

    /* renamed from: j, reason: collision with root package name */
    public d0 f48669j;

    /* renamed from: k, reason: collision with root package name */
    public HashMap f48670k;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TodayTabSingleCreatorModule(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // ch1.b
    public final void A6(List imageUrls) {
        Intrinsics.checkNotNullParameter(imageUrls, "imageUrls");
        WebImageView[] webImageViewArr = {this.f48661b, this.f48662c, this.f48663d};
        ArrayList arrayList = new ArrayList();
        Iterator it = imageUrls.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            String str = (String) next;
            if (!(str == null || str.length() == 0)) {
                arrayList.add(next);
            }
        }
        int min = Math.min(arrayList.size(), 3);
        for (int i13 = 0; i13 < min; i13++) {
            webImageViewArr[i13].loadUrl((String) arrayList.get(i13));
            webImageViewArr[i13].setVisibility(0);
        }
    }

    @Override // ch1.b
    public final void D3(dh1.e eVar) {
        this.f48668i = eVar;
    }

    @Override // ch1.b
    public final void S5(wy0 creator) {
        Intrinsics.checkNotNullParameter(creator, "creator");
        String l33 = creator.l3();
        if (l33 == null) {
            l33 = creator.m3();
        }
        if (l33 != null) {
            GestaltAvatar gestaltAvatar = this.f48660a;
            m0.V0(gestaltAvatar, creator);
            gestaltAvatar.H2(b.f48704u);
        }
        CreatorFollowButton creatorFollowButton = this.f48667h;
        if (creatorFollowButton != null) {
            CreatorFollowButton.f(creatorFollowButton, creator);
            return;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        CreatorFollowButton creatorFollowButton2 = new CreatorFollowButton(context, rk1.f.Large, creator, new nk1.g(this.f48669j, new i0(null, null, null, g0.TODAY_ARTICLE, null, null), null, this.f48670k, null, RecyclerViewTypes.VIEW_TYPE_PROFILE_CREATED_TAB_SCHEDULED_PINS_PREVIEW), new ee1.d(this, 14));
        ViewGroup viewGroup = this.f48666g;
        viewGroup.addView(creatorFollowButton2);
        viewGroup.setVisibility(0);
        this.f48667h = creatorFollowButton2;
    }

    @Override // ch1.b
    public final void c(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f48664e.i(new z(text, 18));
    }

    @Override // ch1.b
    public final void d() {
        a0.p(this.f48665f, "");
        this.f48664e.i(b.f48703t);
        pe.i.K(this.f48660a);
    }

    @Override // nx.v
    public final Object markImpressionEnd() {
        dh1.e eVar = this.f48668i;
        if (eVar != null) {
            return eVar.u3();
        }
        return null;
    }

    @Override // nx.v
    public final Object markImpressionStart() {
        dh1.e eVar = this.f48668i;
        if (eVar != null) {
            return eVar.v3();
        }
        return null;
    }

    @Override // ch1.b
    public final void p(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        a0.p(this.f48665f, text);
    }

    @Override // ch1.b
    public final void p2(HashMap auxData) {
        Intrinsics.checkNotNullParameter(auxData, "auxData");
        this.f48670k = auxData;
    }

    @Override // yk1.d, yk1.r
    public final void setPinalytics(d0 pinalytics) {
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        this.f48669j = pinalytics;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TodayTabSingleCreatorModule(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(getContext(), o92.c.single_creator_today_article_module, this);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        setClipToPadding(false);
        View findViewById = findViewById(o92.b.usecase_module_single_creator_avatar_image);
        GestaltAvatar gestaltAvatar = (GestaltAvatar) findViewById;
        float dimension = getResources().getDimension(r0.usecase_module_elevation);
        WeakHashMap weakHashMap = v0.f102521a;
        q5.m0.l(gestaltAvatar, dimension);
        Intrinsics.checkNotNullExpressionValue(findViewById, "also(...)");
        this.f48660a = gestaltAvatar;
        View findViewById2 = findViewById(o92.b.usecase_module_single_creator_image_1);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f48661b = (WebImageView) findViewById2;
        View findViewById3 = findViewById(o92.b.usecase_module_single_creator_image_2);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f48662c = (WebImageView) findViewById3;
        View findViewById4 = findViewById(o92.b.usecase_module_single_creator_image_3);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f48663d = (WebImageView) findViewById4;
        View findViewById5 = findViewById(o92.b.usecase_module_single_creator_follow_btn_container);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f48666g = (ViewGroup) findViewById5;
        View findViewById6 = findViewById(o92.b.usecase_module_single_creator_text_container);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        View findViewById7 = findViewById(o92.b.usecase_module_single_creator_subtitle);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(...)");
        this.f48664e = (GestaltText) findViewById7;
        View findViewById8 = findViewById(o92.b.usecase_module_single_creator_title);
        Intrinsics.checkNotNullExpressionValue(findViewById8, "findViewById(...)");
        this.f48665f = (GestaltText) findViewById8;
        setOnClickListener(new a2(this, 13));
    }
}
