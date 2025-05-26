package l61;

import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.PinterestLinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.v0;
import com.pinterest.api.model.yy;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.searchResults.framework.screens.SearchResultsFeatureLocation;
import h32.d4;
import java.util.WeakHashMap;
import kg.p;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import so.b3;
import yq0.a0;
import yq0.b0;
import yq0.z;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ll61/d;", "Lyq0/b0;", "Lyq0/a0;", "Ll61/h;", "<init>", "()V", "results_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class d extends b0<a0> implements h {
    public static final /* synthetic */ int C0 = 0;
    public long A0;
    public final d4 B0;

    /* renamed from: u0, reason: collision with root package name */
    public b3 f81594u0;

    /* renamed from: v0, reason: collision with root package name */
    public r61.b f81595v0;

    /* renamed from: w0, reason: collision with root package name */
    public final nx.a0 f81596w0;

    /* renamed from: x0, reason: collision with root package name */
    public f f81597x0;

    /* renamed from: y0, reason: collision with root package name */
    public yy f81598y0;

    /* renamed from: z0, reason: collision with root package name */
    public boolean f81599z0;

    public d() {
        nx.a0 a0Var = new nx.a0();
        this.f81596w0 = a0Var;
        setPinalytics(a0Var);
        p.W();
        this.B0 = d4.UNKNOWN_VIEW;
    }

    @Override // yq0.b0
    public final void Q8(z adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        adapter.G(1, new a(this, 0));
        adapter.G(2, new a(this, 1));
        adapter.G(3, new a(this, 2));
        adapter.G(4, new a(this, 3));
    }

    public final void R8() {
        yy yyVar = this.f81598y0;
        Unit unit = null;
        if (yyVar != null && this.f81599z0) {
            boolean[] zArr = yyVar.f44158g;
            if (zArr.length > 3 && zArr[3]) {
                w f73 = f7();
                NavigationImpl w13 = Navigation.w1(SearchResultsFeatureLocation.GOLD_STANDARD_BOTTOM_SHEET);
                w13.y0(yyVar.l(), "extra_safety_root_outro");
                f73.d(w13);
                unit = Unit.f80348a;
            }
        }
        if (unit == null) {
            D5();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004c  */
    @Override // yk1.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final yk1.m V7() {
        /*
            r5 = this;
            com.pinterest.navigation.Navigation r0 = r5.I
            r1 = 0
            if (r0 == 0) goto Lc
            java.lang.String r2 = "com.pinterest.EXTRA_GOLD_STANDARD_CONTENT"
            java.lang.Object r0 = r0.i0(r2)
            goto Ld
        Lc:
            r0 = r1
        Ld:
            boolean r2 = r0 instanceof com.pinterest.api.model.yy
            if (r2 == 0) goto L14
            com.pinterest.api.model.yy r0 = (com.pinterest.api.model.yy) r0
            goto L15
        L14:
            r0 = r1
        L15:
            r5.f81598y0 = r0
            if (r0 != 0) goto L2c
            com.pinterest.navigation.Navigation r0 = r5.I
            if (r0 == 0) goto L24
            java.lang.String r2 = "com.pinterest.EXTRA_GOLD_STANDARD_URL"
            java.lang.Object r0 = r0.i0(r2)
            goto L25
        L24:
            r0 = r1
        L25:
            boolean r2 = r0 instanceof java.lang.String
            if (r2 == 0) goto L2c
            java.lang.String r0 = (java.lang.String) r0
            goto L2d
        L2c:
            r0 = r1
        L2d:
            com.pinterest.api.model.yy r2 = r5.f81598y0
            if (r2 != 0) goto L36
            if (r0 != 0) goto L36
            r5.D5()
        L36:
            so.b3 r2 = r5.f81594u0
            if (r2 == 0) goto L4c
            android.content.Context r1 = r5.requireContext()
            java.lang.String r3 = "requireContext(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r3)
            com.pinterest.api.model.yy r3 = r5.f81598y0
            nx.a0 r4 = r5.f81596w0
            l61.f r0 = r2.a(r1, r3, r0, r4)
            return r0
        L4c:
            java.lang.String r0 = "presenterFactory"
            kotlin.jvm.internal.Intrinsics.r(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l61.d.V7():yk1.m");
    }

    @Override // nl1.d, com.pinterest.framework.screens.b
    /* renamed from: g */
    public final boolean getF103154e0() {
        R8();
        return true;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getB0() {
        return this.B0;
    }

    @Override // yq0.t
    public final a7.e m8() {
        a7.e eVar = new a7.e(l42.d.fragment_gold_standard, l42.b.gold_standard_recycler_view);
        eVar.b(l42.b.gold_standard_loading_container);
        eVar.f979c = l42.b.gold_standard_empty_state_container;
        return eVar;
    }

    @Override // yq0.t
    public final v0 n8() {
        g41.a aVar = new g41.a(this, 2);
        getContext();
        return new v0(new PinterestLinearLayoutManager(aVar, 1, false));
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        this.A0 = System.currentTimeMillis();
        r61.b bVar = this.f81595v0;
        if (bVar != null) {
            bVar.a(0L, "VIEW_START_MICROTREATMENTS");
        } else {
            Intrinsics.r("mixpanelManager");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        long currentTimeMillis = System.currentTimeMillis();
        r61.b bVar = this.f81595v0;
        if (bVar != null) {
            bVar.a(currentTimeMillis - this.A0, "VIEW_END_MICROTREATMENTS");
        } else {
            Intrinsics.r("mixpanelManager");
            throw null;
        }
    }

    @Override // yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        RecyclerView g83 = g8();
        if (g83 != null) {
            int dimensionPixelOffset = g83.getResources().getDimensionPixelOffset(eo1.c.margin);
            WeakHashMap weakHashMap = q5.v0.f102521a;
            g83.setPaddingRelative(dimensionPixelOffset, 0, dimensionPixelOffset, dimensionPixelOffset);
            g83.m(new eb2.d(null, new gv0.b(g83, 19), null, null, 13));
        }
        ((GestaltIconButton) v13.findViewById(l42.b.gold_standard_close_button)).u(new l11.p(this, 11));
    }
}
