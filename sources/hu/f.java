package hu;

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
public final class f extends LinearLayout implements af2.c {

    /* renamed from: a, reason: collision with root package name */
    public o f70391a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f70392b;

    /* renamed from: c, reason: collision with root package name */
    public final List f70393c;

    /* renamed from: d, reason: collision with root package name */
    public final Function1 f70394d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context, List countryList, Function1 handleAction) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(countryList, "countryList");
        Intrinsics.checkNotNullParameter(handleAction, "handleAction");
        if (!this.f70392b) {
            this.f70392b = true;
            ((g) generatedComponent()).getClass();
        }
        this.f70393c = countryList;
        this.f70394d = handleAction;
        View.inflate(context, q.modal_dropdown_menu_select, this);
        setOrientation(1);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        PinterestRecyclerView pinterestRecyclerView = (PinterestRecyclerView) findViewById(p.recycler_view);
        pinterestRecyclerView.j(new b(0, countryList, handleAction));
        pinterestRecyclerView.f52531a.setVerticalScrollBarEnabled(true);
        bs1.c.U1(pinterestRecyclerView);
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f70391a == null) {
            this.f70391a = new o(this);
        }
        return this.f70391a;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f70391a == null) {
            this.f70391a = new o(this);
        }
        return this.f70391a.generatedComponent();
    }
}
