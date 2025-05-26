package iu;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.pinterest.ui.grid.PinterestRecyclerView;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ps.p;
import ps.q;
import ye2.o;

/* loaded from: classes3.dex */
public final class c extends LinearLayout implements af2.c {

    /* renamed from: a, reason: collision with root package name */
    public o f73682a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f73683b;

    /* renamed from: c, reason: collision with root package name */
    public final List f73684c;

    /* renamed from: d, reason: collision with root package name */
    public final Function1 f73685d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context, List dobMonthList, Function1 handleAction) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dobMonthList, "dobMonthList");
        Intrinsics.checkNotNullParameter(handleAction, "handleAction");
        if (!this.f73683b) {
            this.f73683b = true;
            ((d) generatedComponent()).getClass();
        }
        this.f73684c = dobMonthList;
        this.f73685d = handleAction;
        View.inflate(context, q.modal_dropdown_menu_select, this);
        setOrientation(1);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        PinterestRecyclerView pinterestRecyclerView = (PinterestRecyclerView) findViewById(p.recycler_view);
        pinterestRecyclerView.j(new hu.b(1, dobMonthList, handleAction));
        pinterestRecyclerView.f52531a.setVerticalScrollBarEnabled(true);
        bs1.c.U1(pinterestRecyclerView);
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f73682a == null) {
            this.f73682a = new o(this);
        }
        return this.f73682a;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f73682a == null) {
            this.f73682a = new o(this);
        }
        return this.f73682a.generatedComponent();
    }
}
