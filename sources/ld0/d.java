package ld0;

import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.PinterestLinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.pinterest.gestalt.avatar.GestaltAvatar;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import jd0.i;
import kotlin.jvm.internal.Intrinsics;
import xk2.m;
import xk2.v;
import yk1.n;

/* loaded from: classes5.dex */
public final class d extends ConstraintLayout implements n {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f82955g = 0;

    /* renamed from: a, reason: collision with root package name */
    public final v f82956a;

    /* renamed from: b, reason: collision with root package name */
    public final GestaltText f82957b;

    /* renamed from: c, reason: collision with root package name */
    public final GestaltAvatar f82958c;

    /* renamed from: d, reason: collision with root package name */
    public final GestaltButton f82959d;

    /* renamed from: e, reason: collision with root package name */
    public final i f82960e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f82961f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f82956a = m.b(c.f82954i);
        i iVar = new i(1);
        this.f82960e = iVar;
        View.inflate(context, rd0.c.view_creator_hub_stats_module, this);
        setLayoutParams(new ConstraintLayout.LayoutParams(-1, -2));
        setBackground(bs1.c.f0(this, eo1.d.lego_card, Integer.valueOf(eo1.b.color_themed_background_elevation_floating), null, 4));
        View findViewById = findViewById(rd0.b.creator_hub_stats_header_title);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f82957b = (GestaltText) findViewById;
        View findViewById2 = findViewById(rd0.b.creator_hub_stats_header_avatar);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f82958c = (GestaltAvatar) findViewById2;
        View findViewById3 = findViewById(rd0.b.creator_hub_stats_action);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f82959d = (GestaltButton) findViewById3;
        View findViewById4 = findViewById(rd0.b.creator_hub_stats_list);
        RecyclerView recyclerView = (RecyclerView) findViewById4;
        recyclerView.H2(iVar);
        recyclerView.R2(new PinterestLinearLayoutManager(new cp.b(this, 6)));
        Intrinsics.checkNotNullExpressionValue(findViewById4, "apply(...)");
    }
}
