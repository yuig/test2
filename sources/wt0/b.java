package wt0;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import com.pinterest.api.model.bo0;
import com.pinterest.api.model.fo;
import com.pinterest.api.model.k01;
import com.pinterest.api.model.ln0;
import com.pinterest.api.model.lo;
import com.pinterest.api.model.mo;
import com.pinterest.api.model.mp;
import com.pinterest.api.model.qq;
import com.pinterest.api.model.so;
import com.pinterest.api.model.sp;
import com.pinterest.api.model.tp;
import com.pinterest.api.model.vn0;
import com.pinterest.api.model.vq;
import com.pinterest.api.model.wn0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.ideaPinCreation.canvas.view.IdeaPinCreationAspectRatioSelector;
import com.pinterest.feature.ideaPinCreation.canvas.view.IdeaPinCreationCanvasCropperContainer;
import dl1.l;
import dl1.t;
import eu0.c;
import h32.u0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.g0;
import kotlin.jvm.internal.Intrinsics;
import lh0.s1;
import nx.d0;
import rw0.f;
import tb0.h;
import uj2.q;
import uv0.k;
import vt0.d;
import vt0.e;
import xk2.w;
import xt0.g;
import yk1.v;

/* loaded from: classes5.dex */
public final class b extends c {

    /* renamed from: j, reason: collision with root package name */
    public final Context f131091j;

    /* renamed from: k, reason: collision with root package name */
    public final t f131092k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context, du0.b presenterPinalytics, f mediaUtils, h crashReporting, v viewResources, q networkStateStream, ag1.b ideaPinComposeDataManager, t storyPinLocalDataRepository, s1 experiments) {
        super(mediaUtils, crashReporting, viewResources, presenterPinalytics, networkStateStream, ideaPinComposeDataManager, storyPinLocalDataRepository, experiments);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(mediaUtils, "mediaUtils");
        Intrinsics.checkNotNullParameter(crashReporting, "crashReporting");
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(ideaPinComposeDataManager, "ideaPinComposeDataManager");
        Intrinsics.checkNotNullParameter(storyPinLocalDataRepository, "storyPinLocalDataRepository");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        this.f131091j = context;
        this.f131092k = storyPinLocalDataRepository;
    }

    public static float D3(tp tpVar, so soVar) {
        Float canvasYOffsetPercentage = tpVar.getCanvasYOffsetPercentage();
        if (canvasYOffsetPercentage != null) {
            return canvasYOffsetPercentage.floatValue();
        }
        float f13 = 1;
        float d2 = f13 / ((float) lo.f39845e.d());
        return ((d2 - (f13 / ((float) soVar.d()))) / 2) / d2;
    }

    public static ArrayList F3(List list, float f13, float f14) {
        Matrix matrix;
        List<qq> list2 = list;
        ArrayList arrayList = new ArrayList(g0.q(list2, 10));
        for (qq qqVar : list2) {
            Matrix matrix2 = qqVar.getConfig().getMatrix();
            vq vqVar = null;
            if (matrix2 != null) {
                matrix = new Matrix(matrix2);
                float f15 = f13 - 1;
                matrix.postTranslate(ig1.b.c0(matrix) * f15, (f15 * ig1.b.d0(matrix)) + f14);
            } else {
                matrix = null;
            }
            vq rotatedRect = qqVar.getConfig().getRotatedRect();
            if (rotatedRect != null) {
                vqVar = new vq(rotatedRect);
                vqVar.m(f13);
                vqVar.l(0.0f, f14);
            }
            arrayList.add(qqVar.e(new a(matrix, vqVar, 0)));
        }
        return arrayList;
    }

    public static ArrayList z3(List list, float f13, float f14) {
        List<mp> list2 = list;
        ArrayList arrayList = new ArrayList(g0.q(list2, 10));
        for (mp mpVar : list2) {
            float brushWidth = mpVar.getBrushWidth() * f13;
            List<PointF> pointList = mpVar.getPointList();
            ArrayList arrayList2 = new ArrayList(g0.q(pointList, 10));
            for (PointF pointF : pointList) {
                PointF pointF2 = new PointF(pointF.x, pointF.y);
                float f15 = f13 - 1;
                pointF2.offset(pointF2.x * f15, (f15 * pointF2.y) + f14);
                arrayList2.add(pointF2);
            }
            arrayList.add(mp.a(mpVar, arrayList2, brushWidth));
        }
        return arrayList;
    }

    public final ArrayList B3(float f13, RectF rectF, float f14, float f15, tp tpVar, float f16) {
        Matrix matrix;
        List<bo0> items = tpVar.getMediaList().getItems();
        ArrayList arrayList = new ArrayList(g0.q(items, 10));
        for (bo0 bo0Var : items) {
            k01 videoItem = bo0Var.getVideoItem();
            Context context = this.f131091j;
            if (videoItem != null) {
                Matrix displayMatrix = bo0Var.getDisplayMatrix();
                int intValue = ((Number) videoItem.f39240c.f135234a).intValue();
                int intValue2 = ((Number) videoItem.f39240c.f135235b).intValue();
                vq vqVar = new vq(ig1.b.q0(context, f15, videoItem, displayMatrix));
                vqVar.m(f13);
                vqVar.l(0.0f, f16);
                Matrix f03 = ig1.b.f0(rectF.width(), rectF.height(), intValue, intValue2);
                float f17 = -1;
                vqVar.l(ig1.b.c0(f03) * f17, ig1.b.d0(f03) * f17);
                float b03 = ig1.b.b0(f03);
                RectF rectF2 = new RectF(0.0f, 0.0f, intValue * b03, intValue2 * b03);
                float f18 = rectF2.left;
                float f19 = rectF2.top;
                float f23 = rectF2.right;
                float f24 = rectF2.bottom;
                float[] f25 = vqVar.f();
                matrix = new Matrix();
                matrix.setPolyToPoly(new float[]{f18, f19, f23, f19, f18, f24, f23, f24}, 0, f25, 0, 4);
            } else {
                matrix = new Matrix(bo0Var.getDisplayMatrix());
            }
            Matrix matrix2 = matrix;
            k01 videoItem2 = bo0Var.getVideoItem();
            arrayList.add(bo0.a(bo0Var, null, 0L, 0L, matrix2, videoItem2 != null ? ig1.b.m0(context, f14, videoItem2, matrix2, null) : new Matrix(bo0Var.getExportMatrix()), 0.0f, RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_ARTICLE_FEED_FOOTER));
        }
        return arrayList;
    }

    @Override // eu0.c
    public final hv0.c q3(tp pageData, so canvasAspectRatio) {
        w wVar;
        Intrinsics.checkNotNullParameter(pageData, "pageData");
        Intrinsics.checkNotNullParameter(canvasAspectRatio, "canvasAspectRatio");
        double d2 = canvasAspectRatio.d();
        lo loVar = lo.f39845e;
        if (d2 == loVar.d()) {
            wVar = new w(pageData.getMediaList(), pageData.getOverlayBlocks(), pageData.getDrawingPathList());
        } else {
            vt0.c x33 = x3(loVar, 0.0f, canvasAspectRatio, D3(pageData, canvasAspectRatio));
            float d13 = (float) loVar.d();
            float d14 = (float) canvasAspectRatio.d();
            float f13 = x33.f126634b;
            RectF rectF = x33.f126633a;
            float f14 = x33.f126635c;
            wVar = new w(vn0.a(pageData.getMediaList(), B3(f13, rectF, d13, d14, pageData, f14), 0, 0L, 0, 0L, 30), F3(pageData.getOverlayBlocks(), f13, f14), z3(pageData.getDrawingPathList(), f13, f14));
        }
        vn0 vn0Var = (vn0) wVar.f135234a;
        List list = (List) wVar.f135235b;
        List list2 = (List) wVar.f135236c;
        fo audioMix = pageData.getAudioMix();
        sp audioList = pageData.getAudioList();
        boolean a13 = pageData.a();
        List list3 = list;
        ArrayList arrayList = new ArrayList(g0.q(list3, 10));
        Iterator it = list3.iterator();
        while (it.hasNext()) {
            arrayList.add(p3((qq) it.next()));
        }
        return new hv0.c(vn0Var, a13, audioMix, audioList, loVar, list2, arrayList, pageData.getPageBackgroundColor());
    }

    @Override // eu0.c
    public final void s3() {
        getPinalytics().X(u0.CANCEL_BUTTON);
        ((g) ((d) getView())).D5();
    }

    @Override // eu0.c
    public final void t3() {
        IdeaPinCreationAspectRatioSelector ideaPinCreationAspectRatioSelector = ((g) ((d) getView())).D0;
        if (ideaPinCreationAspectRatioSelector == null) {
            Intrinsics.r("aspectRatioSelector");
            throw null;
        }
        so d2 = ideaPinCreationAspectRatioSelector.d();
        if (d2 == null) {
            return;
        }
        IdeaPinCreationAspectRatioSelector ideaPinCreationAspectRatioSelector2 = ((g) ((d) getView())).D0;
        if (ideaPinCreationAspectRatioSelector2 == null) {
            Intrinsics.r("aspectRatioSelector");
            throw null;
        }
        e eVar = ideaPinCreationAspectRatioSelector2.f45962a.f45960a;
        d0 pinalytics = getPinalytics();
        u0 u0Var = u0.DONE_BUTTON;
        HashMap hashMap = new HashMap();
        hashMap.put("aspect_ratio", d2 instanceof mo ? "original" : d2.toString());
        hashMap.put("orientation", eVar.getText());
        Unit unit = Unit.f80348a;
        pinalytics.Z(u0Var, hashMap);
        IdeaPinCreationCanvasCropperContainer ideaPinCreationCanvasCropperContainer = ((g) ((d) getView())).E0;
        if (ideaPinCreationCanvasCropperContainer == null) {
            Intrinsics.r("canvasCropperContainer");
            throw null;
        }
        float a13 = ideaPinCreationCanvasCropperContainer.a();
        ln0 ln0Var = this.f60170f;
        if (ln0Var == null) {
            return;
        }
        so canvasAspectRatio = ln0Var.getMetadata().getCanvasAspectRatio();
        tp pageData = ln0Var.getPageData();
        if (pageData != null) {
            vt0.c x33 = x3(d2, a13, canvasAspectRatio, D3(pageData, canvasAspectRatio));
            float d13 = (float) d2.d();
            float d14 = (float) canvasAspectRatio.d();
            float f13 = x33.f126634b;
            RectF rectF = x33.f126633a;
            float f14 = x33.f126635c;
            tp e13 = tp.e(pageData, null, null, vn0.a(pageData.getMediaList(), B3(f13, rectF, d13, d14, pageData, f14), 0, 0L, 0, 0L, 30), null, null, F3(pageData.getOverlayBlocks(), f13, f14), null, null, null, z3(pageData.getDrawingPathList(), f13, f14), Float.valueOf(a13), null, 2523);
            ln0 ln0Var2 = this.f60170f;
            if (ln0Var2 != null) {
                ((l) this.f131092k).W(ln0.a(ln0Var2, wn0.a(ln0Var2.getMetadata(), null, null, null, null, false, d2, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK), e13.q(false, true), null, null, null, null, false, null, null, null, null, 16377));
                k.b(getPinalytics(), this.f131091j, ln0Var2.q(), null, 24);
            }
        }
        ((g) ((d) getView())).D5();
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0055, code lost:
    
        if (r4.compareTo(r5) > 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0057, code lost:
    
        r4 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0089, code lost:
    
        if (r4.compareTo(r5) > 0) goto L24;
     */
    @Override // eu0.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void u3() {
        /*
            r7 = this;
            com.pinterest.api.model.ln0 r0 = r7.f60170f
            if (r0 == 0) goto Ldf
            com.pinterest.api.model.tp r1 = r0.y()
            com.pinterest.api.model.vn0 r2 = r1.getMediaList()
            java.util.List r2 = r2.getItems()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
            r3 = 0
            r4 = r3
        L18:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L34
            java.lang.Object r5 = r2.next()
            com.pinterest.api.model.bo0 r5 = (com.pinterest.api.model.bo0) r5
            com.pinterest.api.model.so r5 = oe.f.s(r5)
            if (r4 == 0) goto L32
            if (r5 == 0) goto L18
            int r6 = r5.compareTo(r4)
            if (r6 >= 0) goto L18
        L32:
            r4 = r5
            goto L18
        L34:
            if (r4 == 0) goto L8c
            com.pinterest.api.model.lo r2 = com.pinterest.api.model.lo.f39845e
            com.pinterest.api.model.no r5 = com.pinterest.api.model.no.f40447e
            java.lang.String r6 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r6)
            if (r2 == 0) goto L7a
            if (r5 == 0) goto L7a
            int r6 = r2.compareTo(r5)
            if (r6 > 0) goto L59
            int r6 = r4.compareTo(r2)
            if (r6 >= 0) goto L51
        L4f:
            r4 = r2
            goto L8d
        L51:
            int r2 = r4.compareTo(r5)
            if (r2 <= 0) goto L8d
        L57:
            r4 = r5
            goto L8d
        L59:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Cannot coerce value to an empty range: maximum "
            r1.<init>(r3)
            r1.append(r5)
            java.lang.String r3 = " is less than minimum "
            r1.append(r3)
            r1.append(r2)
            r2 = 46
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L7a:
            if (r2 == 0) goto L83
            int r6 = r4.compareTo(r2)
            if (r6 >= 0) goto L83
            goto L4f
        L83:
            if (r5 == 0) goto L8d
            int r2 = r4.compareTo(r5)
            if (r2 <= 0) goto L8d
            goto L57
        L8c:
            r4 = r3
        L8d:
            yk1.n r2 = r7.getView()
            vt0.d r2 = (vt0.d) r2
            com.pinterest.api.model.wn0 r5 = r0.getMetadata()
            com.pinterest.api.model.so r5 = r5.getCanvasAspectRatio()
            xt0.g r2 = (xt0.g) r2
            r2.getClass()
            java.lang.String r6 = "selectedAspectRatio"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r6)
            com.pinterest.feature.ideaPinCreation.canvas.view.IdeaPinCreationAspectRatioSelector r2 = r2.D0
            if (r2 == 0) goto Ld9
            r2.g(r4)
            r2.f(r5)
            com.pinterest.api.model.wn0 r0 = r0.getMetadata()
            com.pinterest.api.model.so r0 = r0.getCanvasAspectRatio()
            yk1.n r2 = r7.getView()
            vt0.d r2 = (vt0.d) r2
            float r1 = D3(r1, r0)
            xt0.g r2 = (xt0.g) r2
            r2.getClass()
            java.lang.String r4 = "canvasAspectRatio"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r4)
            com.pinterest.feature.ideaPinCreation.canvas.view.IdeaPinCreationCanvasCropperContainer r2 = r2.E0
            if (r2 == 0) goto Ld3
            r2.b(r0, r1)
            goto Ldf
        Ld3:
            java.lang.String r0 = "canvasCropperContainer"
            kotlin.jvm.internal.Intrinsics.r(r0)
            throw r3
        Ld9:
            java.lang.String r0 = "aspectRatioSelector"
            kotlin.jvm.internal.Intrinsics.r(r0)
            throw r3
        Ldf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wt0.b.u3():void");
    }

    public final vt0.c x3(so soVar, float f13, so soVar2, float f14) {
        float d2 = (float) soVar2.d();
        Context context = this.f131091j;
        RectF i03 = ig1.b.i0(d2, context);
        RectF i04 = ig1.b.i0((float) soVar.d(), context);
        float width = i04.width() / i03.width();
        RectF rectF = new RectF(i03);
        rectF.top *= width;
        rectF.left *= width;
        rectF.right *= width;
        rectF.bottom *= width;
        float width2 = i04.width() / 0.5625f;
        return new vt0.c(i04, width, (-1) * ((f13 * width2) - (f14 * width2)), (i04.height() - rectF.height()) / 2.0f, ((width2 - i04.height()) / 2.0f) / width2);
    }
}
