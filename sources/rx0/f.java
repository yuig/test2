package rx0;

import android.text.SpannableString;
import com.pinterest.api.model.v7;
import com.pinterest.error.NetworkResponseError;
import com.pinterest.feature.newshub.feed.view.NewsHubFeedItemBaseView;
import com.pinterest.gestalt.button.view.GestaltButton;
import ea1.c1;
import ea1.q;
import java.util.Date;
import java.util.HashMap;
import kh2.k3;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j0;
import kotlin.jvm.internal.s;
import nx.d0;
import u50.r;
import v.f1;

/* loaded from: classes5.dex */
public final class f extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f110191i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f110192j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f110193k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f110194l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(SpannableString spannableString, NewsHubFeedItemBaseView newsHubFeedItemBaseView, Date date) {
        super(1);
        this.f110191i = 1;
        this.f110192j = spannableString;
        this.f110193k = newsHubFeedItemBaseView;
        this.f110194l = date;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0053  */
    /* JADX WARN: Type inference failed for: r9v10, types: [java.lang.CharSequence] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final rn1.a b(rn1.a r25) {
        /*
            Method dump skipped, instructions count: 806
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: rx0.f.b(rn1.a):rn1.a");
    }

    public final void e(Throwable th3) {
        f1 f1Var;
        qz.d M;
        int i13 = this.f110191i;
        Object obj = this.f110192j;
        Object obj2 = this.f110194l;
        Object obj3 = this.f110193k;
        switch (i13) {
            case 8:
                l31.d dVar = (l31.d) obj3;
                j31.b bVar = (j31.b) dVar.getViewIfBound();
                if (bVar != null) {
                    ((m31.e) bVar).setLoadState(yk1.i.LOADED);
                }
                dVar.f81511d.i(bs1.c.b2(nz1.f.unable_to_save_pins_to_board));
                if (dVar.f81518k) {
                    f60.b.Companion.getClass();
                    if (f60.a.a(dVar.f81519l).isNRT()) {
                        d0 pinalytics = dVar.getPinalytics();
                        h32.f1 f1Var2 = h32.f1.NRT_AUTO_ORG_FAILURE;
                        HashMap q33 = dVar.q3((String) obj2);
                        NetworkResponseError networkResponseError = th3 instanceof NetworkResponseError ? (NetworkResponseError) th3 : null;
                        if (networkResponseError != null && (f1Var = networkResponseError.f45043a) != null && (M = k3.M(f1Var)) != null) {
                            q33.put("error_code", String.valueOf(M.f105387g));
                        }
                        Unit unit = Unit.f80348a;
                        d0.B(pinalytics, f1Var2, null, null, q33, 22);
                    }
                }
                v7 v7Var = (v7) ((j0) obj).f80434a;
                if (v7Var != null) {
                    l31.d.p3(dVar, v7Var);
                    Unit unit2 = Unit.f80348a;
                    j31.b bVar2 = (j31.b) dVar.getViewIfBound();
                    if (bVar2 != null) {
                        GestaltButton gestaltButton = ((m31.e) bVar2).f85775q0;
                        if (gestaltButton != null) {
                            gestaltButton.d(new i31.a(true, true ? 1 : 0));
                            return;
                        } else {
                            Intrinsics.r("createButton");
                            throw null;
                        }
                    }
                    return;
                }
                return;
            default:
                if (((c1) obj3).f58041c) {
                    ((r) obj2).a(new ea1.j((v7) obj, null));
                    return;
                } else {
                    Intrinsics.f(th3);
                    ((r) obj2).a(new q(th3));
                    return;
                }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:89:0x0340, code lost:
    
        if (r3 == 0) goto L88;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:136:0x04a0  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x04ff  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x056e  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x057a  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0580 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0573  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0531 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Integer, kotlin.jvm.internal.DefaultConstructorMarker] */
    /* JADX WARN: Type inference failed for: r10v10 */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke(java.lang.Object r28) {
        /*
            Method dump skipped, instructions count: 2168
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: rx0.f.invoke(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(CharSequence charSequence, SpannableString spannableString, CharSequence charSequence2) {
        super(1);
        this.f110191i = 0;
        this.f110193k = charSequence;
        this.f110192j = spannableString;
        this.f110194l = charSequence2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Object obj, Object obj2, Object obj3, int i13) {
        super(1);
        this.f110191i = i13;
        this.f110193k = obj;
        this.f110194l = obj2;
        this.f110192j = obj3;
    }
}
