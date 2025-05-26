package kd0;

import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import h32.d4;
import hd0.k;
import id0.e;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import ku1.l;
import lh0.r0;
import nc0.f;
import so.l7;
import xk2.m;
import xk2.v;
import yq0.a0;
import yq0.z;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0006B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lkd0/b;", "Lyq0/b0;", "Lyq0/a0;", "Lfd0/b;", "<init>", "()V", "xa0/j", "hub_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class b extends d<a0> implements fd0.b {
    public nu1.a A0;
    public l B0;
    public l7 C0;
    public e E0;

    /* renamed from: z0, reason: collision with root package name */
    public r0 f79223z0;
    public final v D0 = m.b(new a(this, 0));
    public final d4 F0 = d4.CREATOR_HUB;

    @Override // yq0.b0
    public final void Q8(z adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        adapter.G(1, new a(this, 6));
        adapter.G(2, new a(this, 7));
        adapter.G(3, new a(this, 8));
        adapter.G(4, new a(this, 9));
        adapter.G(5, new a(this, 10));
        adapter.G(8, new a(this, 11));
        adapter.G(6, new a(this, 12));
    }

    @Override // yk1.k
    public final yk1.m V7() {
        l7 l7Var = this.C0;
        if (l7Var == null) {
            Intrinsics.r("creatorHubPresenterFactory");
            throw null;
        }
        int i13 = t70.c.ic_plus_create_nonpds;
        CharSequence text = getResources().getText(rd0.d.creation_tool_label);
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        k kVar = new k(i13, text, new a(this, 1));
        int i14 = sm1.b.ic_megaphone_gestalt;
        int i15 = eo1.b.color_themed_icon_default;
        CharSequence text2 = getResources().getText(rd0.d.engagement_tool_label);
        Intrinsics.f(text2);
        k kVar2 = new k(i14, text2, new a(this, 2), Integer.valueOf(i15));
        int i16 = sm1.b.ic_chart_bar_gestalt;
        CharSequence text3 = getResources().getText(rd0.d.analytics_tool_label);
        Intrinsics.checkNotNullExpressionValue(text3, "getText(...)");
        ArrayList l13 = f0.l(kVar, kVar2, new k(i16, text3, new a(this, 3)));
        if (((Boolean) this.D0.getValue()).booleanValue()) {
            int i17 = sm1.b.ic_people_gestalt;
            CharSequence text4 = getResources().getText(rd0.d.creator_hub_tab_branded_content);
            Intrinsics.checkNotNullExpressionValue(text4, "getText(...)");
            l13.add(new k(i17, text4, new a(this, 4)));
        }
        e a13 = l7Var.a(new hd0.b(CollectionsKt.F0(l13), new a(this, 5), 1));
        this.E0 = a13;
        return a13;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF115278f0() {
        return this.F0;
    }

    @Override // yq0.t
    public final a7.e m8() {
        return new a7.e(rd0.c.fragment_creator_hub, rd0.b.creator_hub_recycler_view);
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.E = rd0.c.fragment_creator_hub;
    }

    @Override // yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        a8(new jd0.a(getResources().getDimensionPixelSize(eo1.c.space_200)));
        RecyclerView g83 = g8();
        if (g83 == null) {
            return;
        }
        g83.O2(null);
    }

    @Override // nl1.d
    public final f x7(View mainView) {
        Intrinsics.checkNotNullParameter(mainView, "mainView");
        return null;
    }
}
