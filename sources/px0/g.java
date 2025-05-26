package px0;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.util.Size;
import android.view.ViewParent;
import ao2.j0;
import com.pinterest.api.model.f30;
import com.pinterest.feature.pin.closeup.view.PinCloseupFragment;
import com.pinterest.feature.search.typeahead.view.SearchTypeaheadHashtagCell;
import com.pinterest.feature.search.typeahead.view.SearchTypeaheadPeopleCell;
import com.pinterest.gestalt.avatar.GestaltAvatar;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.navigation.Navigation;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import l11.p;
import lh0.m0;
import nx.b0;
import nx.d0;
import pe1.t;
import q71.q;
import rh1.k;
import rh1.k0;
import rl1.r;
import rq.n3;
import up0.l;
import x02.i2;
import xk2.v;
import yq0.z;

/* loaded from: classes5.dex */
public final class g extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f101599i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f101600j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f101601k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f101602l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Object obj, Object obj2, Object obj3, int i13) {
        super(0);
        this.f101599i = i13;
        this.f101600j = obj;
        this.f101601k = obj2;
        this.f101602l = obj3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ViewParent viewParent;
        String str;
        rh1.i iVar;
        int i13 = this.f101599i;
        int i14 = 1;
        Object obj = this.f101602l;
        Object obj2 = this.f101601k;
        Object obj3 = this.f101600j;
        switch (i13) {
            case 0:
                m235invoke();
                return Unit.f80348a;
            case 1:
                m235invoke();
                return Unit.f80348a;
            case 2:
                m235invoke();
                return Unit.f80348a;
            case 3:
                return new pi0.f((Context) obj3, ((PinCloseupFragment) obj2).s7(), ((z) obj).f139760f, (String) null, 24);
            case 4:
                m235invoke();
                return Unit.f80348a;
            case 5:
                Integer num = (Integer) obj3;
                if (num != null && num.intValue() == 22) {
                    zp0.j jVar = (zp0.j) obj;
                    viewParent = new SearchTypeaheadHashtagCell((Context) obj2, null, 0, jVar != null ? jVar.f142624b : null, 6);
                } else {
                    zp0.j jVar2 = (zp0.j) obj;
                    SearchTypeaheadPeopleCell searchTypeaheadPeopleCell = new SearchTypeaheadPeopleCell((Context) obj2, null, 0, jVar2 != null ? jVar2.f142624b : null, 6);
                    viewParent = searchTypeaheadPeopleCell;
                    if (jVar2 != null) {
                        r size = r.LG;
                        Intrinsics.checkNotNullParameter(size, "size");
                        Object value = searchTypeaheadPeopleCell.f47865a.getValue();
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        ((GestaltAvatar) value).H2(new uq.s(size, i14));
                        boolean z13 = jVar2.f142626d;
                        v vVar = searchTypeaheadPeopleCell.f47868d;
                        if (z13) {
                            searchTypeaheadPeopleCell.setBackground(null);
                            searchTypeaheadPeopleCell.setEnabled(false);
                            Object value2 = vVar.getValue();
                            Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                            ((GestaltButton) value2).d(q.f102743o).e(new p(searchTypeaheadPeopleCell, 16));
                            viewParent = searchTypeaheadPeopleCell;
                        } else {
                            Object value3 = vVar.getValue();
                            Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
                            ((GestaltButton) value3).d(q.f102744p).e(new n3(9));
                            viewParent = searchTypeaheadPeopleCell;
                        }
                    }
                }
                return viewParent;
            case 6:
                m235invoke();
                return Unit.f80348a;
            case 7:
                m235invoke();
                return Unit.f80348a;
            case 8:
                m235invoke();
                return Unit.f80348a;
            case 9:
                m235invoke();
                return Unit.f80348a;
            case 10:
                m235invoke();
                return Unit.f80348a;
            case 11:
                m235invoke();
                return Unit.f80348a;
            case 12:
                m235invoke();
                return Unit.f80348a;
            case 13:
                t tVar = (t) obj3;
                id1.h hVar = (id1.h) obj2;
                return new pe1.r(tVar.w3(), hVar.f72169h, tVar.f99991j, tVar.f99992k, tVar.f99993l, tVar.f99994m, hVar.f72162a.f130140k, tVar.f99995n, "feed", (b0) obj);
            case 14:
                m235invoke();
                return Unit.f80348a;
            case 15:
                m235invoke();
                return Unit.f80348a;
            case 16:
                m235invoke();
                return Unit.f80348a;
            case 17:
                m235invoke();
                return Unit.f80348a;
            case 18:
                m235invoke();
                return Unit.f80348a;
            case 19:
                m235invoke();
                return Unit.f80348a;
            case 20:
                k kVar = (k) obj3;
                Context requireContext = kVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                j0 j0Var = ((z) obj2).f139760f;
                b60.b activeUserManager = kVar.getActiveUserManager();
                pb0.d dVar = kVar.f108202z0;
                if (dVar == null) {
                    Intrinsics.r("fuzzyDateFormatter");
                    throw null;
                }
                l lVar = kVar.A0;
                if (lVar == null) {
                    Intrinsics.r("typeaheadTextUtility");
                    throw null;
                }
                f30 it = (f30) obj;
                Intrinsics.checkNotNullExpressionValue(it, "$it");
                rh1.c cVar = new rh1.c(kVar, 1);
                rh1.c cVar2 = new rh1.c(kVar, 2);
                rh1.i iVar2 = new rh1.i(kVar, 0);
                rh1.i iVar3 = new rh1.i(kVar, 1);
                rh1.e eVar = new rh1.e(kVar, 1);
                rh1.i iVar4 = new rh1.i(kVar, 2);
                rh1.c cVar3 = new rh1.c(kVar, 3);
                m0 m0Var = kVar.B0;
                if (m0Var == null) {
                    Intrinsics.r("experiments");
                    throw null;
                }
                d0 s73 = kVar.s7();
                qh1.e a93 = kVar.a9();
                i2 i2Var = kVar.D0;
                if (i2Var == null) {
                    Intrinsics.r("pinRepository");
                    throw null;
                }
                Navigation navigation = kVar.I;
                String v03 = navigation != null ? navigation.v0("com.pinterest.EXTRA_COMMENT_PREVIEW_ID") : null;
                if (v03 == null) {
                    iVar = iVar3;
                    str = "";
                } else {
                    str = v03;
                    iVar = iVar3;
                }
                return new k0(requireContext, j0Var, activeUserManager, dVar, lVar, it, cVar, cVar2, iVar2, iVar, eVar, iVar4, cVar3, m0Var, s73, a93, i2Var, str);
            case 21:
                m235invoke();
                return Unit.f80348a;
            case 22:
                m235invoke();
                return Unit.f80348a;
            case 23:
                m235invoke();
                return Unit.f80348a;
            case 24:
                m235invoke();
                return Unit.f80348a;
            case 25:
                m235invoke();
                return Unit.f80348a;
            case 26:
                return Boolean.valueOf(EGL14.eglChooseConfig(xd2.b.f134641a, (int[]) obj3, 0, (EGLConfig[]) obj2, 0, 1, (int[]) obj, 0));
            case 27:
                Size size2 = (Size) obj3;
                ae2.b bVar = (ae2.b) obj2;
                ae2.g gVar = (ae2.g) obj;
                ae2.h hVar2 = new ae2.h(new ae2.a(size2, bVar), new ae2.d(size2, bVar), gVar);
                gVar.f15066b.add(hVar2);
                return hVar2;
            case 28:
                m235invoke();
                return Unit.f80348a;
            default:
                m235invoke();
                return Unit.f80348a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Object obj, Object obj2, String str, int i13) {
        super(0);
        this.f101599i = i13;
        this.f101600j = obj;
        this.f101602l = obj2;
        this.f101601k = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(String str, l71.f fVar, ArrayList arrayList) {
        super(0);
        this.f101599i = 6;
        this.f101601k = str;
        this.f101600j = fVar;
        this.f101602l = arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:177:0x0520, code lost:
    
        if (r9 >= 0) goto L167;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: invoke, reason: collision with other method in class */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m235invoke() {
        /*
            Method dump skipped, instructions count: 1682
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: px0.g.m235invoke():void");
    }
}
