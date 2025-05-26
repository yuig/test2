package com.pinterest.partnerAnalytics.feature.pinstats.customviews;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.partnerAnalytics.d;
import com.pinterest.partnerAnalytics.e;
import ex1.c;
import fk1.u;
import g70.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;
import org.jetbrains.annotations.NotNull;
import wx1.g;
import yv1.i;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/pinterest/partnerAnalytics/feature/pinstats/customviews/SaveToBoardCard;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "partnerAnalytics_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class SaveToBoardCard extends LinearLayout {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f50223f = 0;

    /* renamed from: a, reason: collision with root package name */
    public d0 f50224a;

    /* renamed from: b, reason: collision with root package name */
    public h f50225b;

    /* renamed from: c, reason: collision with root package name */
    public final GestaltButton f50226c;

    /* renamed from: d, reason: collision with root package name */
    public final g f50227d;

    /* renamed from: e, reason: collision with root package name */
    public String f50228e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SaveToBoardCard(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void a(String str) {
        this.f50228e = str;
    }

    public final void b(List boardList) {
        Intrinsics.checkNotNullParameter(boardList, "boardList");
        this.f50226c.d(new u(boardList, 9));
        List value = CollectionsKt.y0(boardList, 3);
        g gVar = this.f50227d;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(value, "value");
        gVar.f131217e = value;
        gVar.h();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SaveToBoardCard(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        g gVar = new g(context, new xx1.h(1, this, SaveToBoardCard.class, "onBoardClick", "onBoardClick(Lcom/pinterest/analytics/data/remote/model/BoardMetadata;)V", 0));
        this.f50227d = gVar;
        View.inflate(context, e.save_to_board_card, this);
        View findViewById = findViewById(d.rvSavedToBoard);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        View findViewById2 = findViewById(d.lbSeeAll);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        GestaltButton gestaltButton = (GestaltButton) findViewById2;
        this.f50226c = gestaltButton;
        ((RecyclerView) findViewById).H2(gVar);
        gestaltButton.e(new c(4, new i(this, 7)));
    }
}
