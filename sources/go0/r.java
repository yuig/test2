package go0;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.net.Uri;
import com.pinterest.api.model.bo0;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.jq;
import com.pinterest.api.model.k01;
import com.pinterest.api.model.ln0;
import com.pinterest.api.model.lo;
import com.pinterest.api.model.lq;
import com.pinterest.api.model.mq;
import com.pinterest.api.model.mv;
import com.pinterest.api.model.nq;
import com.pinterest.api.model.pq;
import com.pinterest.api.model.rq;
import com.pinterest.api.model.so;
import com.pinterest.api.model.tp;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.vn0;
import com.pinterest.api.model.wn0;
import com.pinterest.api.model.wy0;
import com.pinterest.api.model.zq;
import com.pinterest.design.brio.widget.voice.toast.PinterestToastContainer;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.ideaPinCreation.closeup.view.a2;
import com.pinterest.feature.ideaPinCreation.closeup.view.r0;
import com.pinterest.feature.ideaPinCreation.closeup.view.s0;
import com.pinterest.feature.ideaPinCreation.closeup.view.v1;
import com.pinterest.feature.ideaPinCreation.closeup.view.x;
import com.pinterest.feature.ideaPinCreation.closeup.view.y;
import com.pinterest.feature.ideaPinCreation.closeup.view.z0;
import com.pinterest.feature.ideaPinCreation.common.view.IdeaPinEditablePageLite;
import com.pinterest.gestalt.toast.GestaltToast;
import com.pinterest.navigation.Navigation;
import dl1.t;
import j1.p0;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import jk.v;
import kh2.c3;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.collections.g0;
import kotlin.collections.q0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.k0;
import m60.x0;
import okhttp3.internal.Util;
import sw0.j0;
import tt0.c0;
import tt0.l0;
import uj2.a0;
import uj2.f0;
import xk2.w;

/* loaded from: classes5.dex */
public final class r extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f65899i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f65900j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f65901k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f65902l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(Object obj, Object obj2, Object obj3, int i13) {
        super(1);
        this.f65899i = i13;
        this.f65902l = obj;
        this.f65900j = obj2;
        this.f65901k = obj3;
    }

    public final do1.d b(do1.d it) {
        int i13 = this.f65899i;
        Object obj = this.f65901k;
        Object obj2 = this.f65900j;
        Object obj3 = this.f65902l;
        switch (i13) {
            case 7:
                Intrinsics.checkNotNullParameter(it, "it");
                jq0.a aVar = (jq0.a) obj3;
                return new do1.d(bs1.c.j2(new String[0], aVar.f77457e), null, new do1.b(bs1.c.j2(new String[0], x0.undo), new k1.q((PinterestToastContainer) obj2, (GestaltToast) obj, aVar, 26)), null, 0, 0, 0, null, false, 506);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                jq0.a aVar2 = (jq0.a) obj3;
                return new do1.d(bs1.c.j2(new String[0], aVar2.f77457e), null, new do1.b(bs1.c.j2(new String[0], zu1.e.news_hub_action_toast_undo), new px0.g((PinterestToastContainer) obj2, (GestaltToast) obj, aVar2, 1)), null, 0, 0, 0, null, false, 506);
        }
    }

    public final f0 e(Pair pair) {
        int i13 = this.f65899i;
        Object obj = this.f65901k;
        Object obj2 = this.f65902l;
        Object obj3 = this.f65900j;
        switch (i13) {
            case 3:
                Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
                String str = (String) obj3;
                dq0.p pVar = (dq0.p) obj;
                return oo1.j.b(null, (List) pair.f80346a, (List) pair.f80347b, e0.b(str), null, null, null, null, null, ((y32.c) obj2).getValue(), pVar.f56130j, pVar.f56133m.c(str));
            case 4:
            default:
                Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
                return oo1.j.b(null, (List) pair.f80346a, (List) pair.f80347b, e0.b((String) obj3), null, null, null, null, null, y32.c.SEND_A_PIN.getValue(), (no1.e) obj2, (String) obj);
            case 5:
                Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
                return oo1.j.b(null, (List) pair.f80346a, (List) pair.f80347b, e0.b(((eq0.n) obj2).f59924e), null, null, null, null, null, y32.c.SEND_A_PIN.getValue(), (no1.e) obj, (String) obj3);
        }
    }

    public final void f(v7 board) {
        int i13 = this.f65899i;
        Object obj = this.f65901k;
        Object obj2 = this.f65900j;
        Object obj3 = this.f65902l;
        switch (i13) {
            case 13:
                jq jqVar = (jq) obj3;
                jqVar.l(board);
                Intrinsics.f(board);
                com.pinterest.feature.ideaPinCreation.closeup.view.f0.g((com.pinterest.feature.ideaPinCreation.closeup.view.f0) obj2, board, jqVar, (Function0) obj);
                return;
            default:
                Intrinsics.checkNotNullParameter(board, "board");
                IdeaPinEditablePageLite ideaPinEditablePageLite = (IdeaPinEditablePageLite) obj3;
                Context context = ideaPinEditablePageLite.getContext();
                RectF rectF = ideaPinEditablePageLite.f46447k;
                if (rectF == null) {
                    Intrinsics.r("canvasRect");
                    throw null;
                }
                float height = rectF.height();
                RectF rectF2 = ideaPinEditablePageLite.f46447k;
                if (rectF2 == null) {
                    Intrinsics.r("canvasRect");
                    throw null;
                }
                float width = rectF2.width();
                RectF rectF3 = ideaPinEditablePageLite.f46448l;
                if (rectF3 == null) {
                    Intrinsics.r("tagMoveRect");
                    throw null;
                }
                Intrinsics.f(context);
                jq jqVar2 = (jq) obj2;
                s0 s0Var = new s0(context, jqVar2, board, height, width, null, null, null, rectF3, null, null);
                rq config = jqVar2.getConfig();
                ideaPinEditablePageLite.f46459w.put(config.getId(), config.getMatrix());
                IdeaPinEditablePageLite.g0(s0Var, (Function1) obj);
                ideaPinEditablePageLite.f46449m.addView(s0Var);
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v5, types: [com.pinterest.feature.ideaPinCreation.closeup.view.s0] */
    public final void h(f30 f30Var) {
        z0 z0Var;
        int i13 = this.f65899i;
        Object obj = this.f65900j;
        Object obj2 = this.f65901k;
        Object obj3 = this.f65902l;
        switch (i13) {
            case 15:
                mq mqVar = (mq) obj3;
                if (mqVar.getIsInvisible()) {
                    Function0 function0 = (Function0) obj;
                    if (function0 != null) {
                        function0.invoke();
                        return;
                    }
                    return;
                }
                if (mqVar.getVariantType() != a42.o.THUMBNAIL) {
                    com.pinterest.feature.ideaPinCreation.closeup.view.f0 f0Var = (com.pinterest.feature.ideaPinCreation.closeup.view.f0) obj2;
                    a2 a2Var = a2.PRODUCT_TAG;
                    String r43 = f30Var.r4();
                    com.pinterest.feature.ideaPinCreation.closeup.view.f0.i(f0Var, a2Var, mqVar, r43 == null ? "" : r43, mqVar.getPinId(), bs1.c.p0(f30Var), f30Var, (Function0) obj);
                    return;
                }
                com.pinterest.feature.ideaPinCreation.closeup.view.f0 f0Var2 = (com.pinterest.feature.ideaPinCreation.closeup.view.f0) obj2;
                a42.o variantType = mqVar.getVariantType();
                if (variantType == null) {
                    variantType = a42.o.TITLE;
                }
                String f39332b = f30Var.getF39332b();
                Function0 function02 = (Function0) obj;
                int i14 = com.pinterest.feature.ideaPinCreation.closeup.view.f0.f46147l0;
                mq mqVar2 = (mq) f0Var2.K0(mqVar, false);
                int i15 = 1;
                if (y.f46377b[variantType.ordinal()] == 1) {
                    Context context = f0Var2.getContext();
                    RectF rectF = f0Var2.P;
                    if (rectF == null) {
                        Intrinsics.r("canvasRect");
                        throw null;
                    }
                    float height = rectF.height();
                    RectF rectF2 = f0Var2.P;
                    if (rectF2 == null) {
                        Intrinsics.r("canvasRect");
                        throw null;
                    }
                    float width = rectF2.width();
                    RectF rectF3 = f0Var2.Q;
                    if (rectF3 == null) {
                        Intrinsics.r("overlayElementMoveRect");
                        throw null;
                    }
                    v1 v1Var = f0Var2.f46150a0;
                    if (v1Var == null) {
                        Intrinsics.r("overlayViewStickyGuidelineBehavior");
                        throw null;
                    }
                    x xVar = new x(i15, function02);
                    Intrinsics.f(context);
                    z0Var = new s0(context, mqVar2, f30Var, height, width, v1Var, f0Var2, f0Var2, rectF3, f0Var2, xVar);
                } else {
                    Context context2 = f0Var2.getContext();
                    a2 a2Var2 = a2.PRODUCT_TAG;
                    String r44 = f30Var.r4();
                    String str = r44 == null ? "" : r44;
                    RectF rectF4 = f0Var2.P;
                    if (rectF4 == null) {
                        Intrinsics.r("canvasRect");
                        throw null;
                    }
                    float width2 = rectF4.width();
                    RectF rectF5 = f0Var2.P;
                    if (rectF5 == null) {
                        Intrinsics.r("canvasRect");
                        throw null;
                    }
                    float height2 = rectF5.height();
                    RectF rectF6 = f0Var2.Q;
                    if (rectF6 == null) {
                        Intrinsics.r("overlayElementMoveRect");
                        throw null;
                    }
                    v1 v1Var2 = f0Var2.f46150a0;
                    if (v1Var2 == null) {
                        Intrinsics.r("overlayViewStickyGuidelineBehavior");
                        throw null;
                    }
                    Intrinsics.f(context2);
                    z0Var = new z0(context2, a2Var2, mqVar2, str, width2, height2, rectF6, v1Var2, f0Var2, f0Var2, f0Var2);
                }
                z0Var.H1(f39332b, bs1.c.p0(f30Var), f30Var);
                f0Var2.s().addView(z0Var);
                f0Var2.f46160f0.put(mqVar.getConfig().getId(), mqVar.getDurationConfig());
                f0Var2.o0(z0Var, mqVar.getDurationConfig());
                f0Var2.k(mqVar);
                return;
            case 16:
                com.pinterest.feature.ideaPinCreation.closeup.view.f0 f0Var3 = (com.pinterest.feature.ideaPinCreation.closeup.view.f0) obj3;
                a2 a2Var3 = a2.VTO_MAKEUP_PRODUCT_TAG;
                pq pqVar = (pq) obj;
                String f23 = bs1.c.f2(f0Var3, x0.try_on_product_tag_cta);
                String pinId = pqVar.getPinId();
                Intrinsics.f(f30Var);
                com.pinterest.feature.ideaPinCreation.closeup.view.f0.i(f0Var3, a2Var3, pqVar, f23, pinId, bs1.c.p0(f30Var), f30Var, (Function0) obj2);
                return;
            default:
                mq mqVar3 = (mq) obj3;
                if (mqVar3.getVariantType() != a42.o.THUMBNAIL) {
                    IdeaPinEditablePageLite ideaPinEditablePageLite = (IdeaPinEditablePageLite) obj;
                    a2 a2Var4 = a2.PRODUCT_TAG;
                    String r45 = f30Var.r4();
                    String str2 = r45 != null ? r45 : "";
                    int i16 = IdeaPinEditablePageLite.A;
                    ideaPinEditablePageLite.L(a2Var4, mqVar3, str2, (Function1) obj2);
                    return;
                }
                IdeaPinEditablePageLite ideaPinEditablePageLite2 = (IdeaPinEditablePageLite) obj;
                Context context3 = ideaPinEditablePageLite2.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                RectF rectF7 = ideaPinEditablePageLite2.f46447k;
                if (rectF7 == null) {
                    Intrinsics.r("canvasRect");
                    throw null;
                }
                float height3 = rectF7.height();
                RectF rectF8 = ideaPinEditablePageLite2.f46447k;
                if (rectF8 == null) {
                    Intrinsics.r("canvasRect");
                    throw null;
                }
                float width3 = rectF8.width();
                RectF rectF9 = ideaPinEditablePageLite2.f46448l;
                if (rectF9 == null) {
                    Intrinsics.r("tagMoveRect");
                    throw null;
                }
                s0 s0Var = new s0(context3, mqVar3, f30Var, height3, width3, rectF9);
                rq config = mqVar3.getConfig();
                ideaPinEditablePageLite2.f46459w.put(config.getId(), config.getMatrix());
                IdeaPinEditablePageLite.g0(s0Var, (Function1) obj2);
                ideaPinEditablePageLite2.f46449m.addView(s0Var);
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i(ln0 ln0Var) {
        String boardId;
        String boardSectionId;
        so soVar;
        ln0 a13;
        Object[] objArr;
        int i13 = this.f65899i;
        Object obj = this.f65901k;
        Object obj2 = this.f65900j;
        Object obj3 = this.f65902l;
        switch (i13) {
            case 11:
                l0 l0Var = (l0) obj3;
                Intrinsics.f(ln0Var);
                List list = (List) obj2;
                int i14 = l0.Z0;
                l0Var.getClass();
                Intrinsics.checkNotNullParameter(list, "<this>");
                List<bo0> list2 = list;
                ArrayList arrayList = new ArrayList();
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    so s13 = oe.f.s((bo0) it.next());
                    if (s13 != null) {
                        arrayList.add(s13);
                    }
                }
                so tallestSelectedMediaAspectRatio = v.p(arrayList);
                Intrinsics.checkNotNullParameter(ln0Var, "<this>");
                Intrinsics.checkNotNullParameter(tallestSelectedMediaAspectRatio, "tallestSelectedMediaAspectRatio");
                if (ln0Var.G()) {
                    tallestSelectedMediaAspectRatio = ln0Var.getMetadata().getCanvasAspectRatio();
                }
                ArrayList arrayList2 = new ArrayList(g0.q(list2, 10));
                for (bo0 bo0Var : list2) {
                    if (bo0Var.getVideoItem() != null) {
                        Context requireContext = l0Var.requireContext();
                        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                        float d2 = (float) tallestSelectedMediaAspectRatio.d();
                        k01 videoItem = bo0Var.getVideoItem();
                        Intrinsics.f(videoItem);
                        int intValue = ((Number) videoItem.f39240c.f135234a).intValue();
                        k01 videoItem2 = bo0Var.getVideoItem();
                        Intrinsics.f(videoItem2);
                        w Z = ig1.b.Z(requireContext, d2, intValue, ((Number) videoItem2.f39240c.f135235b).intValue());
                        objArr = new Matrix[]{Z.f135235b, Z.f135236c};
                    } else {
                        objArr = new Matrix[]{bo0Var.getDisplayMatrix(), bo0Var.getExportMatrix()};
                    }
                    arrayList2.add(bo0.a(bo0Var, null, 0L, 0L, objArr[0], objArr[1], 0.0f, RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_ARTICLE_FEED_FOOTER));
                }
                if (c0.f119091a[((pw0.x) l0Var.S0.getValue()).ordinal()] == 1) {
                    tp y13 = ln0Var.y();
                    a13 = ln0.a(ln0Var, null, tp.e(y13, null, null, ig1.b.q(y13.getMediaList().getItems(), arrayList2), null, null, null, null, null, null, null, null, null, 4091), null, null, null, null, false, null, null, null, null, 16379);
                } else {
                    Navigation navigation = l0Var.I;
                    String v03 = navigation != null ? navigation.v0("com.pinterest.EXTRA_BOARD_ID") : null;
                    if (v03 == null || v03.length() == 0 || ln0Var.getBoardId() != null) {
                        boardId = ln0Var.getBoardId();
                    } else {
                        Navigation navigation2 = l0Var.I;
                        boardId = navigation2 != null ? navigation2.v0("com.pinterest.EXTRA_BOARD_ID") : null;
                    }
                    String str = boardId;
                    Navigation navigation3 = l0Var.I;
                    String v04 = navigation3 != null ? navigation3.v0("com.pinterest.EXTRA_BOARD_SECTION_ID") : null;
                    if (v04 == null || v04.length() == 0 || ln0Var.getBoardSectionId() != null) {
                        boardSectionId = ln0Var.getBoardSectionId();
                    } else {
                        Navigation navigation4 = l0Var.I;
                        boardSectionId = navigation4 != null ? navigation4.v0("com.pinterest.EXTRA_BOARD_SECTION_ID") : null;
                    }
                    String str2 = boardSectionId;
                    rt0.b bVar = l0Var.f119180p0;
                    List A = Util.A(bVar.f109957i);
                    long i15 = bVar.i();
                    long j13 = bVar.f109956h;
                    long j14 = ((bo0) d7.b.j0(A)).f36143i;
                    vn0 vn0Var = new vn0(A, 0, 0L, A.size() - 1, i15 > j13 ? j13 - (i15 - j14) : j14);
                    Context requireContext2 = l0Var.requireContext();
                    Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                    ag1.b bVar2 = l0Var.f119169e0;
                    if (bVar2 == null) {
                        Intrinsics.r("ideaPinComposeDataManager");
                        throw null;
                    }
                    String z13 = c3.z(requireContext2, bVar2, vn0Var);
                    String uuid = UUID.randomUUID().toString();
                    q0 q0Var = q0.f80391a;
                    Intrinsics.f(uuid);
                    tp tpVar = new tp(uuid, z13, vn0Var, null, null, q0Var, null, null, null, null, null, null, 4056, null);
                    wn0 metadata = ln0Var.getMetadata();
                    bo0 bo0Var2 = (bo0) CollectionsKt.firstOrNull(arrayList2);
                    if (bo0Var2 == null || (soVar = oe.f.s(bo0Var2)) == null) {
                        soVar = lo.f39845e;
                    }
                    a13 = ln0.a(ln0Var, wn0.a(metadata, null, null, null, null, false, soVar, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK), tpVar, null, null, str, str2, false, null, null, null, null, 16281);
                }
                t tVar = l0Var.f119172h0;
                if (tVar == null) {
                    Intrinsics.r("storyPinLocalDataRepository");
                    throw null;
                }
                ((dl1.l) tVar).W(a13);
                ((Function0) obj).invoke();
                return;
            default:
                tp pageData = ln0Var.getPageData();
                if (pageData != null) {
                    zq zqVar = (zq) obj3;
                    Function2 function2 = (Function2) obj;
                    Pair V = pageData.V(zqVar);
                    tp tpVar2 = (tp) V.f80346a;
                    nq nqVar = (nq) V.f80347b;
                    ((dl1.l) ((pv0.f) obj2).f101461a).W(ln0Var.J(tpVar2, true));
                    if (function2 != null) {
                        function2.invoke(zqVar, nqVar.getConfig().getId());
                        return;
                    }
                    return;
                }
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x01f1, code lost:
    
        if (r6 != null) goto L83;
     */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01b0  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke(java.lang.Object r26) {
        /*
            Method dump skipped, instructions count: 816
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: go0.r.invoke(java.lang.Object):java.lang.Object");
    }

    public final void j(wy0 wy0Var) {
        yt0.a emailConfirmationModalListener;
        int i13 = this.f65899i;
        Object obj = this.f65901k;
        Object obj2 = this.f65900j;
        Object obj3 = this.f65902l;
        switch (i13) {
            case 12:
                Boolean c33 = wy0Var.c3();
                Intrinsics.checkNotNullExpressionValue(c33, "getHasConfirmedEmail(...)");
                if (c33.booleanValue()) {
                    au0.d dVar = (au0.d) obj3;
                    ((b60.d) dVar.f20484j).k(wy0Var);
                    if (dVar.isBound()) {
                        ((com.pinterest.feature.ideaPinCreation.closeup.view.q) ((yt0.d) dVar.getView())).Z8((String) obj2, false);
                        return;
                    }
                    return;
                }
                au0.d dVar2 = (au0.d) obj3;
                if (!dVar2.isBound() || (emailConfirmationModalListener = (yt0.a) obj) == null) {
                    return;
                }
                com.pinterest.feature.ideaPinCreation.closeup.view.q qVar = (com.pinterest.feature.ideaPinCreation.closeup.view.q) ((yt0.d) dVar2.getView());
                qVar.getClass();
                Intrinsics.checkNotNullParameter(emailConfirmationModalListener, "emailConfirmationModalListener");
                m60.w f73 = qVar.f7();
                wk2.a aVar = qVar.B0;
                if (aVar == null) {
                    Intrinsics.r("settingsApiProvider");
                    throw null;
                }
                Object obj4 = aVar.get();
                Intrinsics.checkNotNullExpressionValue(obj4, "get(...)");
                f73.d(new jc0.v(new jv0.g(emailConfirmationModalListener, (x10.d) obj4, qVar.getActiveUserManager()), false, 0L, 30));
                return;
            case 13:
            default:
                int i14 = IdeaPinEditablePageLite.A;
                ((IdeaPinEditablePageLite) obj3).L(a2.AT_MENTION_TAG, (lq) obj2, a.a.j("@", wy0Var.z4()), (Function1) obj);
                return;
            case 14:
                lq lqVar = (lq) obj2;
                com.pinterest.feature.ideaPinCreation.closeup.view.f0.i((com.pinterest.feature.ideaPinCreation.closeup.view.f0) obj3, a2.AT_MENTION_TAG, lqVar, a.a.j("@", wy0Var.z4()), lqVar.getUserId(), wy0Var.l3(), wy0Var, (Function0) obj);
                return;
        }
    }

    public final void l(String str) {
        int i13 = this.f65899i;
        int i14 = 1;
        Object obj = this.f65901k;
        Object obj2 = this.f65900j;
        Object obj3 = this.f65902l;
        switch (i13) {
            case 20:
                Intrinsics.f(str);
                if (str.length() > 0) {
                    hu0.g gVar = (hu0.g) obj2;
                    tp e13 = tp.e(((tp) obj3).n(), null, null, null, null, null, null, null, str, gVar.f70412o, null, null, null, 3711);
                    jk2.e0 M = ((dl1.l) gVar.f70410m).M(gVar.f70408k.d());
                    a0 a0Var = tk2.e.f118017c;
                    hk2.k e14 = new hk2.h(M.h(a0Var).e(a0Var), new wr0.l(19, new r0(i14, e13, gVar)), i14).e(wj2.c.a());
                    hk2.b bVar = new hk2.b(new au0.h(23, hu0.d.f70404m), new au0.h(24, hu0.d.f70405n), ck2.i.f27923c);
                    e14.f(bVar);
                    Intrinsics.checkNotNullExpressionValue(bVar, "subscribe(...)");
                    gVar.f70409l.c(e13, gVar.f70411n.f15145a.f15146a, ((ln0) obj).q(), false, true);
                    break;
                }
                break;
            case 24:
                kv0.f fVar = (kv0.f) obj3;
                ln0 ln0Var = (ln0) obj2;
                Intrinsics.f(str);
                fVar.getClass();
                tp e15 = tp.e(ln0Var.y(), null, null, null, null, null, null, null, str, null, null, null, null, 3967);
                kv0.f.e(fVar, e15, new p0(fVar, e15, ln0Var, (Function1) obj, 27));
                jv0.j jVar = fVar.f80960l;
                if (jVar != null) {
                    String j13 = ln0Var.j();
                    ((mv0.y) jVar).Y8(j13 != null ? Uri.fromFile(new File(j13)) : null);
                    break;
                }
                break;
            default:
                new oy.p(s92.o.COMPLETE, null).i();
                j0 j0Var = (j0) obj3;
                j0Var.r9(true);
                ((dl1.l) j0Var.h9()).W(((ln0) obj2).I(new zu0.c(str, 8)));
                ((Function0) obj).invoke();
                break;
        }
    }

    public final void n(w wVar) {
        int i13 = this.f65899i;
        Object obj = this.f65901k;
        Object obj2 = this.f65902l;
        Object obj3 = this.f65900j;
        switch (i13) {
            case 2:
                dq0.p pVar = (dq0.p) obj2;
                pVar.Q3((mv) obj, (String) wVar.f135234a, (String) wVar.f135235b, false, null, (String) wVar.f135236c);
                pVar.V3(null, (String) obj3);
                break;
            default:
                eq0.c.b((String) obj3, ((dq0.p) obj2).f56121a, eq0.k.PIN_IT_REPLY, (String) wVar.f135234a);
                Function0 function0 = (Function0) obj;
                if (function0 != null) {
                    function0.invoke();
                    break;
                }
                break;
        }
    }

    public final void r(boolean z13) {
        int i13 = this.f65899i;
        Object obj = this.f65900j;
        Object obj2 = this.f65902l;
        int i14 = 0;
        int i15 = -1;
        Object obj3 = this.f65901k;
        switch (i13) {
            case 21:
                if (z13) {
                    bv0.d dVar = (bv0.d) obj2;
                    cv0.f fVar = (cv0.f) obj;
                    Iterator it = CollectionsKt.F0(dVar.f135191h).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((dl1.s) it.next()) instanceof cv0.v) {
                                i15 = i14;
                            } else {
                                i14++;
                            }
                        }
                    }
                    dVar.r(i15 + 1, fVar);
                } else if (((wy0) obj3) == null) {
                    bv0.d dVar2 = (bv0.d) obj2;
                    rl2.d b13 = k0.f80436a.b(cv0.f.class);
                    Iterator it2 = CollectionsKt.F0(dVar2.f135191h).iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (Intrinsics.d(k0.f80436a.b(((dl1.s) it2.next()).getClass()), b13)) {
                                i15 = i14;
                            } else {
                                i14++;
                            }
                        }
                    }
                    if (i15 >= 0) {
                        dVar2.removeItem(i15);
                    }
                }
                ((bv0.d) obj2).f23916q.t3((wy0) obj3, z13);
                break;
            default:
                if (z13) {
                    bv0.g gVar = (bv0.g) obj2;
                    cv0.f fVar2 = (cv0.f) obj;
                    Iterator it3 = CollectionsKt.F0(gVar.f135191h).iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            if (((dl1.s) it3.next()) instanceof cv0.v) {
                                i15 = i14;
                            } else {
                                i14++;
                            }
                        }
                    }
                    gVar.r(i15 + 1, fVar2);
                } else if (((wy0) obj3) == null) {
                    bv0.g gVar2 = (bv0.g) obj2;
                    rl2.d b14 = k0.f80436a.b(cv0.f.class);
                    Iterator it4 = CollectionsKt.F0(gVar2.f135191h).iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            if (Intrinsics.d(k0.f80436a.b(((dl1.s) it4.next()).getClass()), b14)) {
                                i15 = i14;
                            } else {
                                i14++;
                            }
                        }
                    }
                    if (i15 >= 0) {
                        gVar2.removeItem(i15);
                    }
                }
                ((bv0.g) obj2).f23925n.t3((wy0) obj3, z13);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(Object obj, Object obj2, String str, int i13) {
        super(1);
        this.f65899i = i13;
        this.f65902l = obj;
        this.f65901k = obj2;
        this.f65900j = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(String str, Object obj, Object obj2, int i13) {
        super(1);
        this.f65899i = i13;
        this.f65900j = str;
        this.f65902l = obj;
        this.f65901k = obj2;
    }
}
