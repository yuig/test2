package zt1;

import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.PinterestLinearLayoutManager;
import com.pinterest.ui.grid.PinterestRecyclerView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import xk2.m;
import xk2.v;

/* loaded from: classes4.dex */
public final class g extends ConstraintLayout implements yt1.a {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f142778e = 0;

    /* renamed from: a, reason: collision with root package name */
    public final d f142779a;

    /* renamed from: b, reason: collision with root package name */
    public final v f142780b;

    /* renamed from: c, reason: collision with root package name */
    public Function1 f142781c;

    /* renamed from: d, reason: collision with root package name */
    public final b f142782d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context, d modal) {
        super(context, null, 0, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(modal, "modal");
        this.f142779a = modal;
        this.f142780b = m.b(f.f142777i);
        b bVar = new b();
        this.f142782d = bVar;
        cc1.c cVar = new cc1.c(this, 6);
        View.inflate(context, yt1.c.view_music_sheet, this);
        PinterestRecyclerView pinterestRecyclerView = (PinterestRecyclerView) findViewById(yt1.b.recycler_view);
        pinterestRecyclerView.l(new PinterestLinearLayoutManager(new g41.a(this, 11), 1, false));
        pinterestRecyclerView.a(new e(0));
        pinterestRecyclerView.j(bVar);
        pinterestRecyclerView.b(cVar);
    }
}
