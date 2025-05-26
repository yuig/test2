package com.pinterest.feature.ideaPinCreation.common.view;

import a7.b0;
import a7.c0;
import a7.e0;
import a7.i0;
import a7.l0;
import a7.p0;
import a7.v0;
import a7.y;
import a7.z;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import aq1.f;
import ck2.i;
import com.pinterest.api.model.bo0;
import com.pinterest.api.model.fo;
import com.pinterest.api.model.jq;
import com.pinterest.api.model.k01;
import com.pinterest.api.model.kq;
import com.pinterest.api.model.lq;
import com.pinterest.api.model.mq;
import com.pinterest.api.model.nq;
import com.pinterest.api.model.oq;
import com.pinterest.api.model.pq;
import com.pinterest.api.model.qq;
import com.pinterest.api.model.rq;
import com.pinterest.api.model.so;
import com.pinterest.api.model.tq;
import com.pinterest.api.model.vq;
import com.pinterest.feature.ideaPinCreation.closeup.view.IdeaPinCreationPlayerView;
import com.pinterest.feature.ideaPinCreation.closeup.view.a2;
import com.pinterest.feature.ideaPinCreation.closeup.view.c1;
import com.pinterest.feature.ideaPinCreation.closeup.view.e1;
import com.pinterest.feature.ideaPinCreation.closeup.view.g1;
import com.pinterest.feature.ideaPinCreation.closeup.view.r1;
import com.pinterest.feature.ideaPinCreation.closeup.view.u0;
import com.pinterest.feature.ideaPinCreation.closeup.view.z0;
import com.pinterest.feature.ideaPinCreation.drawing.IdeaPinHandDrawingView;
import com.pinterest.gestalt.iconcomponent.GestaltIcon;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.WebImageView;
import d7.n0;
import fu0.c;
import fu0.g;
import go0.r;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kg.t;
import kh2.g0;
import kh2.p2;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lh0.s1;
import nt0.d;
import nx.d0;
import org.jetbrains.annotations.NotNull;
import pk.v2;
import pu0.a;
import pu0.h;
import pu0.k;
import uq.w;
import uv0.p;
import x02.i2;
import x02.x0;
import x02.x2;
import xj2.b;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/pinterest/feature/ideaPinCreation/common/view/IdeaPinEditablePageLite;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ideaPinCreation_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class IdeaPinEditablePageLite extends w {
    public static final /* synthetic */ int A = 0;

    /* renamed from: d, reason: collision with root package name */
    public x2 f46440d;

    /* renamed from: e, reason: collision with root package name */
    public i2 f46441e;

    /* renamed from: f, reason: collision with root package name */
    public x0 f46442f;

    /* renamed from: g, reason: collision with root package name */
    public s1 f46443g;

    /* renamed from: h, reason: collision with root package name */
    public d f46444h;

    /* renamed from: i, reason: collision with root package name */
    public d0 f46445i;

    /* renamed from: j, reason: collision with root package name */
    public so f46446j;

    /* renamed from: k, reason: collision with root package name */
    public RectF f46447k;

    /* renamed from: l, reason: collision with root package name */
    public RectF f46448l;

    /* renamed from: m, reason: collision with root package name */
    public final FrameLayout f46449m;

    /* renamed from: n, reason: collision with root package name */
    public final IdeaPinCreationPlayerView f46450n;

    /* renamed from: o, reason: collision with root package name */
    public final WebImageView f46451o;

    /* renamed from: p, reason: collision with root package name */
    public final ImageView f46452p;

    /* renamed from: q, reason: collision with root package name */
    public final GestaltIcon f46453q;

    /* renamed from: r, reason: collision with root package name */
    public final View f46454r;

    /* renamed from: s, reason: collision with root package name */
    public int f46455s;

    /* renamed from: t, reason: collision with root package name */
    public final Matrix f46456t;

    /* renamed from: u, reason: collision with root package name */
    public List f46457u;

    /* renamed from: v, reason: collision with root package name */
    public List f46458v;

    /* renamed from: w, reason: collision with root package name */
    public final LinkedHashMap f46459w;

    /* renamed from: x, reason: collision with root package name */
    public final LinkedHashMap f46460x;

    /* renamed from: y, reason: collision with root package name */
    public final LinkedHashMap f46461y;

    /* renamed from: z, reason: collision with root package name */
    public final b f46462z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdeaPinEditablePageLite(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 10);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f46456t = new Matrix();
        this.f46459w = new LinkedHashMap();
        this.f46460x = new LinkedHashMap();
        this.f46461y = new LinkedHashMap();
        this.f46462z = new b();
        View.inflate(getContext(), f.idea_pin_editable_page_lite, this);
        View findViewById = findViewById(aq1.d.content_container);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f46449m = (FrameLayout) findViewById;
        View findViewById2 = findViewById(aq1.d.video_view);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f46450n = (IdeaPinCreationPlayerView) findViewById2;
        View findViewById3 = findViewById(aq1.d.image_view);
        WebImageView webImageView = (WebImageView) findViewById3;
        webImageView.g2(0.0f, 0.0f, 0.0f, 0.0f);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "apply(...)");
        this.f46451o = webImageView;
        View findViewById4 = findViewById(aq1.d.drawing_view);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f46452p = (ImageView) findViewById4;
        View findViewById5 = findViewById(aq1.d.play_button);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f46453q = (GestaltIcon) findViewById5;
        View findViewById6 = findViewById(aq1.d.view_missing_media);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.f46454r = findViewById6;
        View findViewById7 = findViewById(aq1.d.missing_media_icon);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(...)");
        View findViewById8 = findViewById(aq1.d.missing_media_text);
        Intrinsics.checkNotNullExpressionValue(findViewById8, "findViewById(...)");
        GestaltText gestaltText = (GestaltText) findViewById8;
        dl2.b.z((GestaltIcon) findViewById7, c.f62961m);
        gestaltText.i(c.f62962n);
        int dimensionPixelSize = gestaltText.getResources().getDimensionPixelSize(eo1.c.space_200);
        ViewGroup.LayoutParams layoutParams = gestaltText.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.leftMargin = dimensionPixelSize;
        marginLayoutParams.rightMargin = dimensionPixelSize;
        gestaltText.setLayoutParams(marginLayoutParams);
    }

    public static void a0(IdeaPinEditablePageLite ideaPinEditablePageLite) {
        IdeaPinCreationPlayerView ideaPinCreationPlayerView = ideaPinEditablePageLite.f46450n;
        if (bs1.c.j1(ideaPinCreationPlayerView)) {
            return;
        }
        ideaPinCreationPlayerView.M(false);
    }

    public static void g0(View view, Function1 function1) {
        if (function1 == null) {
            return;
        }
        view.setOnTouchListener(new g(0, function1));
    }

    public final void B0(fo foVar, List list, boolean z13, boolean z14) {
        b0 b0Var;
        a7.d0 d0Var;
        if (list == null) {
            return;
        }
        this.f46457u = list;
        boolean P0 = p2.P0(list);
        IdeaPinCreationPlayerView ideaPinCreationPlayerView = this.f46450n;
        GestaltIcon gestaltIcon = this.f46453q;
        View view = this.f46454r;
        if (P0) {
            bs1.c.X0(view);
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                bo0 bo0Var = (bo0) it.next();
                k01 videoItem = bo0Var.getVideoItem();
                if (videoItem != null) {
                    a7.w wVar = new a7.w();
                    z zVar = new z();
                    List emptyList = Collections.emptyList();
                    v2 v2Var = v2.f100502e;
                    b0 b0Var2 = new b0();
                    e0 e0Var = e0.f982d;
                    long X = n0.X(bo0Var.getStartTimeMs());
                    bf.b.i(X >= 0);
                    wVar.f1230a = X;
                    wVar.b(bo0Var.getEndTimeMs());
                    bf.b.t(zVar.f1244b == null || zVar.f1243a != null);
                    Uri uri = videoItem.f41101b;
                    if (uri != null) {
                        b0Var = b0Var2;
                        d0Var = new a7.d0(uri, null, zVar.f1243a != null ? zVar.a() : null, emptyList, null, v2Var, null, -9223372036854775807L);
                    } else {
                        b0Var = b0Var2;
                        d0Var = null;
                    }
                    i0 i0Var = new i0("", new y(wVar), d0Var, new c0(b0Var), l0.I, e0Var);
                    Intrinsics.checkNotNullExpressionValue(i0Var, "build(...)");
                    arrayList.add(i0Var);
                }
            }
            int i13 = 3;
            ideaPinCreationPlayerView.L(foVar == null ? new fo(0.0f, 0.0f, 3, null) : foVar, arrayList);
            bs1.c.U1(ideaPinCreationPlayerView);
            if (this.f46455s > 0) {
                G0(z14);
            }
            if (z13) {
                t.O(gestaltIcon);
                if (!bs1.c.j1(ideaPinCreationPlayerView)) {
                    ideaPinCreationPlayerView.M(false);
                }
                setOnClickListener(null);
            } else {
                setOnClickListener(new com.pinterest.feature.home.view.c(this, i13));
            }
        } else {
            bs1.c.X0(ideaPinCreationPlayerView);
            t.O(gestaltIcon);
            bs1.c.U1(view);
        }
        bs1.c.X0(this.f46451o);
    }

    public final void F0() {
        this.f46450n.A = false;
    }

    public final void G0(boolean z13) {
        Matrix matrix;
        float f13 = this.f46455s * 1.0f;
        RectF rectF = this.f46447k;
        if (rectF == null) {
            Intrinsics.r("canvasRect");
            throw null;
        }
        float width = f13 / rectF.width();
        ArrayList arrayList = new ArrayList();
        List<bo0> list = this.f46457u;
        if (list != null) {
            for (bo0 bo0Var : list) {
                k01 videoItem = bo0Var.getVideoItem();
                if (z13 && videoItem != null) {
                    int intValue = ((Number) videoItem.f39240c.f135234a).intValue();
                    int intValue2 = ((Number) videoItem.f39240c.f135235b).intValue();
                    float f14 = this.f46455s;
                    RectF rectF2 = this.f46447k;
                    if (rectF2 == null) {
                        Intrinsics.r("canvasRect");
                        throw null;
                    }
                    float height = rectF2.height() * width;
                    matrix = ig1.b.Q(f14, height, intValue, intValue2, ig1.b.f0(f14, height, intValue, intValue2));
                } else if (bo0Var.getDisplayMatrix() != null) {
                    Matrix displayMatrix = bo0Var.getDisplayMatrix();
                    Intrinsics.f(displayMatrix);
                    float b03 = ig1.b.b0(displayMatrix);
                    float c03 = ig1.b.c0(displayMatrix);
                    float d03 = ig1.b.d0(displayMatrix);
                    float a03 = ig1.b.a0(displayMatrix);
                    Matrix matrix2 = new Matrix();
                    matrix2.postRotate(a03);
                    matrix2.postScale(b03, b03);
                    matrix2.postTranslate(c03 * width, d03 * width);
                    matrix = matrix2;
                } else {
                    matrix = this.f46456t;
                }
                arrayList.add(matrix);
            }
        }
        this.f46458v = CollectionsKt.F0(arrayList);
    }

    public final void H0(String overlayId, long j13, long j14) {
        Intrinsics.checkNotNullParameter(overlayId, "overlayId");
        LinkedHashMap linkedHashMap = this.f46460x;
        tq tqVar = (tq) linkedHashMap.get(overlayId);
        linkedHashMap.put(overlayId, tqVar != null ? tq.b(tqVar, j13, j14, null, null, 12) : new tq(j13, j14, null, null, 12, null));
    }

    public final void I0(long j13) {
        for (Map.Entry entry : this.f46460x.entrySet()) {
            String str = (String) entry.getKey();
            tq tqVar = (tq) entry.getValue();
            View X = X(str);
            LinkedHashMap linkedHashMap = this.f46461y;
            k kVar = (k) linkedHashMap.get(str);
            if (kVar != null && (kVar.f101398c != a.Instant || kVar.f101399d != pu0.b.Instant)) {
                Object obj = linkedHashMap.get(str);
                if (obj == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                p.b(X, j13, tq.b(tqVar, 0L, tqVar != null ? tqVar.g(ig1.b.j0(this.f46457u)) : 0L, null, null, 13), (k) obj);
            } else if (X != null) {
                bs1.c.R1(X, tqVar.a(j13));
            }
            if (tqVar.a(j13) && (X instanceof com.pinterest.feature.ideaPinCreation.closeup.view.f)) {
                com.pinterest.feature.ideaPinCreation.closeup.view.f fVar = (com.pinterest.feature.ideaPinCreation.closeup.view.f) X;
                ArrayList arrayList = fVar.f46140j;
                if (!arrayList.isEmpty()) {
                    fVar.setImageBitmap(((dw0.a) arrayList.get(fVar.f46141k.q(j13, arrayList))).f56409a);
                }
            }
        }
    }

    public final void K0(k overlayTransitionConfig) {
        Intrinsics.checkNotNullParameter(overlayTransitionConfig, "overlayTransitionConfig");
        this.f46461y.put(overlayTransitionConfig.f101396a, overlayTransitionConfig);
    }

    public final void L(a2 a2Var, qq qqVar, String str, Function1 function1) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        RectF rectF = this.f46447k;
        if (rectF == null) {
            Intrinsics.r("canvasRect");
            throw null;
        }
        float width = rectF.width();
        RectF rectF2 = this.f46447k;
        if (rectF2 == null) {
            Intrinsics.r("canvasRect");
            throw null;
        }
        float height = rectF2.height();
        RectF rectF3 = this.f46448l;
        if (rectF3 == null) {
            Intrinsics.r("tagMoveRect");
            throw null;
        }
        z0 z0Var = new z0(context, a2Var, qqVar, str, width, height, rectF3);
        rq config = qqVar.getConfig();
        g0(z0Var, function1);
        this.f46459w.put(config.getId(), config.getMatrix());
        this.f46449m.addView(z0Var);
    }

    public final void L0(int i13, long j13) {
        List list;
        v0 v0Var;
        IdeaPinCreationPlayerView ideaPinCreationPlayerView = this.f46450n;
        if (bs1.c.j1(ideaPinCreationPlayerView) || (list = this.f46457u) == null || list.isEmpty() || (v0Var = ideaPinCreationPlayerView.f18946k) == null) {
            return;
        }
        v0Var.y(i13, j13);
    }

    public final void P0(long j13) {
        List list;
        IdeaPinCreationPlayerView ideaPinCreationPlayerView = this.f46450n;
        if (bs1.c.j1(ideaPinCreationPlayerView) || (list = this.f46457u) == null || list.isEmpty()) {
            return;
        }
        List list2 = this.f46457u;
        Intrinsics.f(list2);
        Pair k03 = ig1.b.k0(j13, list2);
        if (k03 != null) {
            int intValue = ((Number) k03.f80346a).intValue();
            long longValue = ((Number) k03.f80347b).longValue();
            v0 v0Var = ideaPinCreationPlayerView.f18946k;
            if (v0Var != null) {
                v0Var.y(intValue, longValue);
            }
        }
    }

    public final v0 T() {
        return this.f46450n.f18946k;
    }

    public final View X(String overlayId) {
        Object obj;
        Intrinsics.checkNotNullParameter(overlayId, "overlayId");
        Iterator it = d7.b.O(this.f46449m).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            Object tag = ((View) next).getTag(aq1.d.idea_pin_tag_id);
            if (Intrinsics.d(tag instanceof String ? (String) tag : null, overlayId)) {
                obj = next;
                break;
            }
        }
        return (View) obj;
    }

    public final void Z(so ratio) {
        Intrinsics.checkNotNullParameter(ratio, "ratio");
        so soVar = this.f46446j;
        if (soVar != null) {
            if (soVar == null) {
                Intrinsics.r("canvasAspectRatio");
                throw null;
            }
            if (Intrinsics.d(ratio, soVar)) {
                return;
            }
        }
        this.f46446j = ratio;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        RectF i03 = ig1.b.i0((float) ratio.d(), context);
        this.f46447k = i03;
        this.f46448l = p2.l0(i03);
        FrameLayout frameLayout = this.f46449m;
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        layoutParams2.G = ratio.toString();
        frameLayout.setLayoutParams(layoutParams2);
        requestLayout();
        invalidate();
    }

    public final void d0(List pathList) {
        Intrinsics.checkNotNullParameter(pathList, "pathList");
        boolean isEmpty = pathList.isEmpty();
        ImageView imageView = this.f46452p;
        if (isEmpty) {
            bs1.c.X0(imageView);
            return;
        }
        RectF rectF = this.f46447k;
        if (rectF == null) {
            Intrinsics.r("canvasRect");
            throw null;
        }
        int c13 = ml2.c.c(rectF.width());
        RectF rectF2 = this.f46447k;
        if (rectF2 == null) {
            Intrinsics.r("canvasRect");
            throw null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(c13, ml2.c.c(rectF2.height()), Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(...)");
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        IdeaPinHandDrawingView ideaPinHandDrawingView = new IdeaPinHandDrawingView(context);
        ideaPinHandDrawingView.d(pathList, null);
        ideaPinHandDrawingView.draw(new Canvas(createBitmap));
        imageView.setImageBitmap(createBitmap);
        bs1.c.U1(imageView);
    }

    public final void k0(List overlayList) {
        View r1Var;
        Intrinsics.checkNotNullParameter(overlayList, "overlayList");
        Iterator it = overlayList.iterator();
        while (it.hasNext()) {
            hv0.g gVar = (hv0.g) it.next();
            this.f46460x.put(gVar.f70457a.getConfig().getId(), gVar.f70457a.getDurationConfig());
        }
        Iterator it2 = overlayList.iterator();
        while (it2.hasNext()) {
            hv0.g gVar2 = (hv0.g) it2.next();
            boolean c13 = p.c(gVar2.f70457a);
            qq qqVar = gVar2.f70457a;
            if (c13) {
                s1 s1Var = this.f46443g;
                if (s1Var == null) {
                    Intrinsics.r("experiments");
                    throw null;
                }
                if (s1Var.c()) {
                    LinkedHashMap linkedHashMap = this.f46461y;
                    String id3 = qqVar.getConfig().getId();
                    String id4 = qqVar.getConfig().getId();
                    vq rotatedRect = qqVar.getConfig().getRotatedRect();
                    linkedHashMap.put(id3, new k(id4, rotatedRect != null ? rotatedRect.a() : null, h.a(qqVar.getDurationConfig().getEnterTransitionType()), h.b(qqVar.getDurationConfig().getExitTransitionType())));
                }
            }
            boolean z13 = qqVar instanceof oq;
            LinkedHashMap linkedHashMap2 = this.f46459w;
            FrameLayout frameLayout = this.f46449m;
            Function1 function1 = gVar2.f70458b;
            if (z13) {
                oq oqVar = (oq) qqVar;
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                RectF rectF = this.f46447k;
                if (rectF == null) {
                    Intrinsics.r("canvasRect");
                    throw null;
                }
                float width = rectF.width();
                RectF rectF2 = this.f46447k;
                if (rectF2 == null) {
                    Intrinsics.r("canvasRect");
                    throw null;
                }
                c1 c1Var = new c1(context, oqVar, width, rectF2.height());
                rq config = oqVar.getConfig();
                linkedHashMap2.put(config.getId(), config.getMatrix());
                g0(c1Var, function1);
                frameLayout.addView(c1Var);
            } else {
                boolean z14 = qqVar instanceof lq;
                x02.a2 a2Var = i.f27924d;
                ck2.c cVar = i.f27923c;
                b bVar = this.f46462z;
                if (z14) {
                    lq lqVar = (lq) qqVar;
                    x2 x2Var = this.f46440d;
                    if (x2Var == null) {
                        Intrinsics.r("userRepository");
                        throw null;
                    }
                    bVar.a(x2Var.P(lqVar.getUserId()).F(new au0.h(21, new r(this, lqVar, function1, 18)), new au0.h(22, c.f62963o), cVar, a2Var));
                } else if (qqVar instanceof mq) {
                    mq mqVar = (mq) qqVar;
                    if (mqVar.getIsInvisible()) {
                        continue;
                    } else {
                        i2 i2Var = this.f46441e;
                        if (i2Var == null) {
                            Intrinsics.r("pinRepository");
                            throw null;
                        }
                        bVar.a(i2Var.P(mqVar.getPinId()).F(new au0.h(19, new r(mqVar, this, function1, 19)), new au0.h(20, c.f62964p), cVar, a2Var));
                    }
                } else if (qqVar instanceof nq) {
                    nq nqVar = (nq) qqVar;
                    if (g0.e0(nqVar.getStickerDetails())) {
                        Context context2 = getContext();
                        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                        d dVar = this.f46444h;
                        if (dVar == null) {
                            Intrinsics.r("animatedStickerRepository");
                            throw null;
                        }
                        RectF rectF3 = this.f46447k;
                        if (rectF3 == null) {
                            Intrinsics.r("canvasRect");
                            throw null;
                        }
                        float width2 = rectF3.width();
                        RectF rectF4 = this.f46447k;
                        if (rectF4 == null) {
                            Intrinsics.r("canvasRect");
                            throw null;
                        }
                        r1Var = new com.pinterest.feature.ideaPinCreation.closeup.view.f(context2, dVar, nqVar, width2, rectF4.height(), null, null, null, null, null, 0L);
                    } else {
                        Context context3 = getContext();
                        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                        RectF rectF5 = this.f46447k;
                        if (rectF5 == null) {
                            Intrinsics.r("canvasRect");
                            throw null;
                        }
                        float width3 = rectF5.width();
                        RectF rectF6 = this.f46447k;
                        if (rectF6 == null) {
                            Intrinsics.r("canvasRect");
                            throw null;
                        }
                        r1Var = new r1(context3, nqVar, width3, rectF6.height(), null, null, null, null, null, null);
                    }
                    rq config2 = nqVar.getConfig();
                    linkedHashMap2.put(config2.getId(), config2.getMatrix());
                    g0(r1Var, function1);
                    frameLayout.addView(r1Var);
                } else if (qqVar instanceof pq) {
                    L(a2.VTO_MAKEUP_PRODUCT_TAG, (pq) qqVar, bs1.c.f2(this, m60.x0.try_on_product_tag_cta), function1);
                } else if (qqVar instanceof jq) {
                    jq jqVar = (jq) qqVar;
                    x0 x0Var = this.f46442f;
                    if (x0Var == null) {
                        Intrinsics.r("boardRepository");
                        throw null;
                    }
                    bVar.a(nl.b.s(x0Var.P(jqVar.getBoardId()), new r(this, jqVar, function1, 17), null, null, 6));
                } else if (qqVar instanceof kq) {
                    kq kqVar = (kq) qqVar;
                    Context context4 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                    RectF rectF7 = this.f46447k;
                    if (rectF7 == null) {
                        Intrinsics.r("canvasRect");
                        throw null;
                    }
                    float width4 = rectF7.width();
                    RectF rectF8 = this.f46447k;
                    if (rectF8 == null) {
                        Intrinsics.r("canvasRect");
                        throw null;
                    }
                    u0 u0Var = new u0(context4, kqVar, width4, rectF8.height(), null, null, null, null, null, null);
                    rq config3 = kqVar.getConfig();
                    linkedHashMap2.put(config3.getId(), config3.getMatrix());
                    g0(u0Var, function1);
                    frameLayout.addView(u0Var);
                } else {
                    continue;
                }
            }
        }
    }

    public final void o0(String str) {
        if (str == null) {
            str = "#1A1A1A";
        }
        this.f46449m.setBackgroundColor(Color.parseColor(str));
    }

    public final void o2() {
        IdeaPinCreationPlayerView ideaPinCreationPlayerView = this.f46450n;
        if (bs1.c.j1(ideaPinCreationPlayerView)) {
            return;
        }
        ideaPinCreationPlayerView.play();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f46462z.dispose();
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i13, int i14) {
        super.onMeasure(i13, i14);
        int size = View.MeasureSpec.getSize(i13);
        View.MeasureSpec.getSize(i14);
        if (this.f46455s == size || this.f46446j == null) {
            return;
        }
        this.f46455s = size;
        float f13 = size * 1.0f;
        RectF rectF = this.f46447k;
        if (rectF == null) {
            Intrinsics.r("canvasRect");
            throw null;
        }
        float width = f13 / rectF.width();
        if (this.f46458v == null) {
            G0(false);
        }
        Iterator it = d7.b.O(this.f46449m).iterator();
        while (it.hasNext()) {
            View view = (View) it.next();
            if (view instanceof g1) {
                Matrix matrix = (Matrix) this.f46459w.get(view.getTag(aq1.d.idea_pin_tag_id));
                if (matrix != null) {
                    float b03 = ig1.b.b0(matrix);
                    float c03 = ig1.b.c0(matrix);
                    float d03 = ig1.b.d0(matrix);
                    float a03 = ig1.b.a0(matrix);
                    Matrix matrix2 = new Matrix();
                    matrix2.postRotate(a03);
                    float f14 = b03 * width;
                    matrix2.postScale(f14, f14);
                    matrix2.postTranslate(c03 * width, d03 * width);
                    ((g1) view).t1(matrix2);
                }
            }
        }
    }

    public final void r0(boolean z13) {
        this.f46453q.g2(new rn0.d(z13, 24));
    }

    public final void setPinalytics(d0 pinalytics) {
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        this.f46445i = pinalytics;
    }

    public final void t0(e1 eventListener) {
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        this.f46450n.f45993z = eventListener;
    }

    public final void z0() {
        Matrix matrix;
        IdeaPinCreationPlayerView ideaPinCreationPlayerView = this.f46450n;
        v0 v0Var = ideaPinCreationPlayerView.f18946k;
        if (v0Var != null) {
            int N = v0Var.N();
            List list = this.f46458v;
            if (list == null || (matrix = (Matrix) CollectionsKt.U(N, list)) == null) {
                matrix = this.f46456t;
            }
            View view = ideaPinCreationPlayerView.f18939d;
            TextureView textureView = view instanceof TextureView ? (TextureView) view : null;
            if (textureView != null) {
                textureView.setTransform(matrix);
            }
            List list2 = this.f46457u;
            bo0 bo0Var = list2 != null ? (bo0) CollectionsKt.U(N, list2) : null;
            if (((s1) bq1.c.f23699a.getValue()).f()) {
                float speedMultiplier = bo0Var != null ? bo0Var.getSpeedMultiplier() : 1.0f;
                v0 v0Var2 = ideaPinCreationPlayerView.f18946k;
                if (v0Var2 != null) {
                    v0Var2.c(new p0(speedMultiplier));
                }
            }
            if (bo0Var == null || !bo0Var.getIsFromFrontFacingCamera()) {
                ideaPinCreationPlayerView.setScaleX(1.0f);
            } else {
                ideaPinCreationPlayerView.setScaleX(-1.0f);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdeaPinEditablePageLite(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13, 10, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f46456t = new Matrix();
        this.f46459w = new LinkedHashMap();
        this.f46460x = new LinkedHashMap();
        this.f46461y = new LinkedHashMap();
        this.f46462z = new b();
        View.inflate(getContext(), f.idea_pin_editable_page_lite, this);
        View findViewById = findViewById(aq1.d.content_container);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f46449m = (FrameLayout) findViewById;
        View findViewById2 = findViewById(aq1.d.video_view);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f46450n = (IdeaPinCreationPlayerView) findViewById2;
        View findViewById3 = findViewById(aq1.d.image_view);
        WebImageView webImageView = (WebImageView) findViewById3;
        webImageView.g2(0.0f, 0.0f, 0.0f, 0.0f);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "apply(...)");
        this.f46451o = webImageView;
        View findViewById4 = findViewById(aq1.d.drawing_view);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f46452p = (ImageView) findViewById4;
        View findViewById5 = findViewById(aq1.d.play_button);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f46453q = (GestaltIcon) findViewById5;
        View findViewById6 = findViewById(aq1.d.view_missing_media);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.f46454r = findViewById6;
        View findViewById7 = findViewById(aq1.d.missing_media_icon);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(...)");
        View findViewById8 = findViewById(aq1.d.missing_media_text);
        Intrinsics.checkNotNullExpressionValue(findViewById8, "findViewById(...)");
        GestaltText gestaltText = (GestaltText) findViewById8;
        dl2.b.z((GestaltIcon) findViewById7, c.f62961m);
        gestaltText.i(c.f62962n);
        int dimensionPixelSize = gestaltText.getResources().getDimensionPixelSize(eo1.c.space_200);
        ViewGroup.LayoutParams layoutParams = gestaltText.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.leftMargin = dimensionPixelSize;
            marginLayoutParams.rightMargin = dimensionPixelSize;
            gestaltText.setLayoutParams(marginLayoutParams);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }
}
