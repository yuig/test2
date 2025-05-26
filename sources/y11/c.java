package y11;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.widget.ImageView;
import android.widget.LinearLayout;
import bm1.t;
import cn1.y;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.profile.savedtab.view.BoardRestoreItem;
import com.pinterest.feature.search.results.view.SearchGridMultiSectionFragment;
import com.pinterest.feature.search.results.view.d0;
import com.pinterest.gestalt.buttonToggle.GestaltButtonToggle;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import e21.v;
import h32.f1;
import i32.y0;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeoutException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.z0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j0;
import kotlin.jvm.internal.s;
import kotlin.text.z;
import nx.d1;
import rg0.o;
import rm1.q;
import u50.h0;
import u50.i0;
import u50.k0;
import u50.r;
import uj2.f0;
import w21.s1;
import w21.v1;
import w41.n0;
import wa2.u;

/* loaded from: classes5.dex */
public final class c extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f136639i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f136640j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f136641k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i13, Object obj, Object obj2) {
        super(1);
        this.f136639i = i13;
        this.f136640j = obj;
        this.f136641k = obj2;
    }

    public final y b(y it) {
        int i13 = this.f136639i;
        Object obj = this.f136641k;
        Object obj2 = this.f136640j;
        switch (i13) {
            case 10:
                Intrinsics.checkNotNullParameter(it, "it");
                return y.e(it, null, null, 0, null, dn1.e.END_ACTION_BUTTONS_CUSTOM, (cn1.c) obj2, (cn1.c) obj, 59135);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                f31.h hVar = (f31.h) obj;
                int i14 = n0.f128044e1;
                ((n0) obj2).getClass();
                int i15 = hVar.f61009a;
                String[] formatArgs = new String[0];
                Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
                k0 k0Var = new k0(i15, new ArrayList(0));
                dn1.e eVar = dn1.e.END_ACTION_BUTTONS_CUSTOM;
                fm1.c cVar = fm1.c.VISIBLE;
                List list = hVar.f61010b;
                f31.g gVar = (f31.g) CollectionsKt.U(0, list);
                cn1.c o93 = gVar != null ? n0.o9(gVar) : null;
                f31.g gVar2 = (f31.g) CollectionsKt.U(1, list);
                return y.e(it, k0Var, null, 0, cVar, eVar, o93, gVar2 != null ? n0.o9(gVar2) : null, 59005);
        }
    }

    public final rn1.a e(rn1.a it) {
        i0 i0Var;
        int i13 = this.f136639i;
        Object obj = this.f136641k;
        Object obj2 = this.f136640j;
        switch (i13) {
            case 7:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.h2((String) obj2), null, null, null, null, 0, null, null, (rm1.d) obj, null, false, 0, null, null, null, null, null, false, null, null, 2096894);
            case 8:
                Intrinsics.checkNotNullParameter(it, "it");
                StringBuilder sb3 = new StringBuilder();
                sb3.append(obj2);
                sb3.append(obj);
                return rn1.a.y(it, null, null, null, null, null, 0, null, null, null, null, false, 0, bs1.c.h2(sb3.toString()), null, null, null, null, false, null, null, 2093055);
            case 9:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.p2((SpannableStringBuilder) obj2), null, null, null, null, 0, null, null, null, null, true, 0, bs1.c.p2((StringBuilder) obj), null, null, null, null, false, null, null, 2092030);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                SpannableString spannableString = (SpannableString) obj2;
                if (spannableString != null) {
                    d0.a((d0) obj, spannableString);
                    i0Var = bs1.c.p2(spannableString);
                } else {
                    i0Var = h0.f120562a;
                }
                return rn1.a.y(it, i0Var, null, null, null, null, 0, d7.b.Z(true ^ (spannableString == null || z.j(spannableString))), null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
        }
    }

    public final f0 f(Boolean draftExists) {
        int i13 = this.f136639i;
        Object obj = this.f136641k;
        Object obj2 = this.f136640j;
        switch (i13) {
            case 28:
                Intrinsics.checkNotNullParameter(draftExists, "draftExists");
                if (draftExists.booleanValue()) {
                    w71.d dVar = ((y71.c) obj2).f138014a;
                    dVar.getClass();
                    return y71.c.d(new fk2.h(new w71.c(dVar, (x71.a) obj, 1), 2));
                }
                w71.d dVar2 = ((y71.c) obj2).f138014a;
                dVar2.getClass();
                return y71.c.d(new fk2.h(new w71.c(dVar2, (x71.a) obj, 0), 2));
            default:
                Intrinsics.checkNotNullParameter(draftExists, "it");
                z71.e eVar = (z71.e) obj;
                return ((y71.c) obj2).b(eVar.e(), eVar.getOverlayItems());
        }
    }

    public final void h(t it) {
        GestaltButtonToggle gestaltButtonToggle;
        int i13 = this.f136639i;
        Object obj = this.f136641k;
        Object obj2 = this.f136640j;
        switch (i13) {
            case 21:
                Intrinsics.checkNotNullParameter(it, "it");
                x61.c cVar = (x61.c) obj2;
                x61.a aVar = cVar.f133938f;
                if (aVar != null) {
                    aVar.invoke((GestaltButtonToggle) obj);
                }
                if (!cVar.f133935c && (gestaltButtonToggle = cVar.f133937e) != null) {
                    gestaltButtonToggle.s(x61.b.f133929k);
                    break;
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                g71.a aVar2 = ((g71.b) obj2).f63887c;
                if (aVar2 != null) {
                    aVar2.invoke((GestaltButtonToggle) obj);
                    break;
                }
                break;
        }
    }

    public final void i(f30 f30Var) {
        int i13 = this.f136639i;
        Object obj = this.f136641k;
        Object obj2 = this.f136640j;
        switch (i13) {
            case 1:
                d1 d1Var = ((a21.c) obj).f470c;
                Intrinsics.f(f30Var);
                ((j0) obj2).f80434a = d1Var.b(f30Var);
                break;
            case 2:
                Intrinsics.f(f30Var);
                GestaltToolbarImpl gestaltToolbarImpl = (GestaltToolbarImpl) ((fo1.a) obj2);
                gestaltToolbarImpl.b0(qb0.j.b(b40.e0(f30Var)));
                gestaltToolbarImpl.a0(((v) obj).getResources().getQuantityString(cb0.d.reactions_count, b40.e0(f30Var), Integer.valueOf(b40.e0(f30Var))));
                gestaltToolbarImpl.e0(vn1.g.BODY_300);
                gestaltToolbarImpl.m();
                LinearLayout z13 = gestaltToolbarImpl.z();
                z13.setOrientation(0);
                ImageView imageView = new ImageView(z13.getContext());
                Context context = imageView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                u uVar = new u(context);
                u.a(uVar, b40.P(f30Var), b40.O(f30Var), false, 12);
                imageView.setImageDrawable(uVar);
                z13.addView(imageView, 0);
                break;
            default:
                SearchGridMultiSectionFragment searchGridMultiSectionFragment = (SearchGridMultiSectionFragment) obj2;
                SearchGridMultiSectionFragment.j9(searchGridMultiSectionFragment, y0.ANDROID_SEARCH_RESULTS_AFTER_SAVE, z0.g(new Pair(o.CONTEXT_SEARCH_QUERY.getValue(), searchGridMultiSectionFragment.Q1), new Pair(o.CONTEXT_PIN_ID.getValue(), ((rg0.i0) obj).f108030a), new Pair(o.IS_PROMOTED.getValue(), String.valueOf(f30Var.d5().booleanValue()))));
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00d4, code lost:
    
        if (r10.f81978h == 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00de, code lost:
    
        if (r1 <= r4) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00e8, code lost:
    
        if (r1 <= r10.f81974d) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00f2, code lost:
    
        if (r1 <= r10.f81973c) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00fa, code lost:
    
        if (r1 <= r4) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0084  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke(java.lang.Object r38) {
        /*
            Method dump skipped, instructions count: 1428
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y11.c.invoke(java.lang.Object):java.lang.Object");
    }

    public final void j(Throwable th3) {
        int i13 = this.f136639i;
        Object obj = this.f136641k;
        Object obj2 = this.f136640j;
        switch (i13) {
            case 4:
                f21.e eVar = (f21.e) obj2;
                i92.a.a(eVar.f60964c, "Error getting pin cluster matching: " + th3, false, 6);
                if (th3 instanceof TimeoutException) {
                    String repinId = ((f30) obj).getUid();
                    Intrinsics.checkNotNullExpressionValue(repinId, "getUid(...)");
                    iv1.b bVar = eVar.f60972k;
                    bVar.getClass();
                    Intrinsics.checkNotNullParameter(repinId, "repinId");
                    f1 f1Var = f1.NRT_AUTO_ORG_TIMEOUT;
                    wy0 f13 = ((b60.d) bVar.f73736f).f();
                    bVar.a(f1Var, null, f13 != null ? f13.getUid() : null, repinId);
                    break;
                }
                break;
            default:
                ((r) obj2).a(new w21.o(((s1) ((v1) obj)).f127808b));
                break;
        }
    }

    public final void l(rn1.k bind) {
        int i13 = this.f136639i;
        Object obj = this.f136641k;
        Object obj2 = this.f136640j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.f108895j = new rm1.d(new rm1.f((q) obj2, (rm1.i) obj), null, null, 0, null, 30);
                break;
            default:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                Resources resources = ((BoardRestoreItem) obj2).getResources();
                int i14 = nz1.e.soft_deletion_pin_count;
                int i15 = ((j51.h) obj).f74748c;
                String quantityString = resources.getQuantityString(i14, i15, Integer.valueOf(i15));
                Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
                bind.f(quantityString);
                break;
        }
    }
}
