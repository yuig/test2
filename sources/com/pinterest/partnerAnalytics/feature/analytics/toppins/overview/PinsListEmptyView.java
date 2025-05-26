package com.pinterest.partnerAnalytics.feature.analytics.toppins.overview;

import af2.b;
import af2.c;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.partnerAnalytics.e;
import et1.r0;
import ex1.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;
import org.jetbrains.annotations.NotNull;
import ye2.o;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/pinterest/partnerAnalytics/feature/analytics/toppins/overview/PinsListEmptyView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "partnerAnalytics_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class PinsListEmptyView extends LinearLayout implements c {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f50120d = 0;

    /* renamed from: a, reason: collision with root package name */
    public o f50121a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f50122b;

    /* renamed from: c, reason: collision with root package name */
    public d0 f50123c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PinsListEmptyView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // af2.c
    public final b componentManager() {
        if (this.f50121a == null) {
            this.f50121a = new o(this);
        }
        return this.f50121a;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f50121a == null) {
            this.f50121a = new o(this);
        }
        return this.f50121a.generatedComponent();
    }

    public final void setPinalytics(d0 d0Var) {
        this.f50123c = d0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinsListEmptyView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        if (!this.f50122b) {
            this.f50122b = true;
            ((d) generatedComponent()).getClass();
        }
        View inflate = LayoutInflater.from(context).inflate(e.pins_list_empty_view, (ViewGroup) null);
        ((GestaltButton) inflate.findViewById(com.pinterest.partnerAnalytics.d.createPin)).e(new ex1.c(0, new r0(5, this, context)));
        addView(inflate);
    }
}
