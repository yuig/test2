package bu0;

import a7.b0;
import a7.c0;
import a7.e0;
import a7.i0;
import a7.l0;
import a7.y;
import android.content.Context;
import android.graphics.Matrix;
import android.net.Uri;
import android.view.TextureView;
import android.view.View;
import android.widget.LinearLayout;
import b11.g;
import c71.l;
import com.pinterest.activity.newshub.view.header.NewsHubMultiUserAvatar;
import com.pinterest.api.model.bo0;
import com.pinterest.api.model.cp0;
import com.pinterest.api.model.fo;
import com.pinterest.api.model.jq;
import com.pinterest.api.model.k01;
import com.pinterest.api.model.kj;
import com.pinterest.api.model.kq;
import com.pinterest.api.model.lq;
import com.pinterest.api.model.mq;
import com.pinterest.api.model.nq;
import com.pinterest.api.model.oq;
import com.pinterest.api.model.pq;
import com.pinterest.api.model.qq;
import com.pinterest.api.model.qx;
import com.pinterest.api.model.tp;
import com.pinterest.api.model.vh;
import com.pinterest.api.model.vn0;
import com.pinterest.feature.ideaPinCreation.closeup.view.IdeaPinInteractiveVideoView;
import com.pinterest.feature.ideaPinCreation.closeup.view.IdeaPinOverlayViewColorPickerModal;
import com.pinterest.feature.ideaPinCreation.closeup.view.IdeaPinTextEditor;
import com.pinterest.feature.ideaPinCreation.closeup.view.StoryPinActionButton;
import com.pinterest.feature.ideaPinCreation.closeup.view.StoryPinBottomToolbar;
import com.pinterest.feature.ideaPinCreation.closeup.view.d1;
import com.pinterest.feature.ideaPinCreation.closeup.view.f0;
import com.pinterest.feature.ideaPinCreation.closeup.view.p;
import com.pinterest.feature.ideaPinCreation.closeup.view.p2;
import com.pinterest.feature.ideaPinCreation.closeup.view.q2;
import com.pinterest.feature.ideaPinCreation.drawing.IdeaPinHandDrawingEditor;
import com.pinterest.feature.ideaPinCreation.drawing.IdeaPinHandDrawingView;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.gestalt.iconcomponent.GestaltIcon;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.screens.s2;
import d7.n0;
import e50.v;
import i32.y0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import kg.t;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kx0.s;
import lq0.o;
import nx.d0;
import o71.z;
import pk.v2;
import re1.a0;
import re1.b;
import rq.m4;
import so.z5;
import t3.s1;
import tu0.c;
import uj2.q;
import uk1.d;
import vq0.h;
import w01.o0;
import w01.p0;
import x02.i2;
import xk2.k;
import xk2.w;
import ye1.j;
import yk1.m;
import yk1.n;
import zf0.f;

/* loaded from: classes5.dex */
public class a extends h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23896a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f23897b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f23898c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f23899d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f23900e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f23901f;

    public a(q networkStateStream, d presenterPinalytics) {
        l extractData = l.f26778n;
        l extractContentDescription = l.f26779o;
        l toViewState = l.f26780p;
        this.f23896a = 4;
        Intrinsics.checkNotNullParameter(extractData, "extractData");
        Intrinsics.checkNotNullParameter(extractContentDescription, "extractContentDescription");
        Intrinsics.checkNotNullParameter(toViewState, "toViewState");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        this.f23898c = extractData;
        this.f23899d = extractContentDescription;
        this.f23900e = toViewState;
        this.f23901f = networkStateStream;
        this.f23897b = presenterPinalytics;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.lang.Object, k71.k] */
    /* JADX WARN: Type inference failed for: r2v21, types: [yk1.m] */
    /* JADX WARN: Type inference failed for: r2v24, types: [java.lang.Object, re1.a0] */
    /* JADX WARN: Type inference failed for: r2v28, types: [yk1.m] */
    /* JADX WARN: Type inference failed for: r2v31, types: [java.lang.Object, ye1.d] */
    /* JADX WARN: Type inference failed for: r2v35, types: [yk1.m] */
    @Override // vq0.h
    public final void c(n nVar, Object obj, int i13) {
        f0 f0Var;
        tp tpVar;
        String str;
        Matrix matrix;
        f0 f0Var2;
        fo foVar;
        k kVar;
        boolean z13;
        HashMap hashMap;
        String str2;
        vn0 vn0Var;
        int i14;
        int i15 = 0;
        int i16 = this.f23896a;
        Object obj2 = this.f23898c;
        z zVar = null;
        j jVar = null;
        b bVar = null;
        switch (i16) {
            case 0:
                f0 modalListener = (f0) nVar;
                hv0.d model = (hv0.d) obj;
                Intrinsics.checkNotNullParameter(modalListener, "view");
                Intrinsics.checkNotNullParameter(model, "model");
                tp tpVar2 = model.f70453a;
                int i17 = f0.f46147l0;
                modalListener.r0(model.f70454b, null);
                d0 pinalytics = ((d) this.f23897b).f122379a;
                Intrinsics.checkNotNullExpressionValue(pinalytics, "getPinalytics(...)");
                Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
                modalListener.f46170k0 = pinalytics;
                IdeaPinInteractiveVideoView d03 = modalListener.d0();
                d03.getClass();
                Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
                d03.I = pinalytics;
                au0.d editListener = (au0.d) obj2;
                au0.d navigationListener = (au0.d) this.f23899d;
                ou0.k listener = (ou0.k) this.f23901f;
                Intrinsics.checkNotNullParameter(editListener, "editListener");
                Intrinsics.checkNotNullParameter(navigationListener, "navigationListener");
                Intrinsics.checkNotNullParameter(listener, "saveChangeListener");
                modalListener.f46164h0 = editListener;
                modalListener.f46166i0 = navigationListener;
                IdeaPinTextEditor Y = modalListener.Y();
                Y.getClass();
                Intrinsics.checkNotNullParameter(editListener, "editListener");
                Intrinsics.checkNotNullParameter(modalListener, "eyeDropperListener");
                Intrinsics.checkNotNullParameter(modalListener, "modalListener");
                Intrinsics.checkNotNullParameter(modalListener, "saveChangeListener");
                Y.A = modalListener;
                Y.B = modalListener;
                Y.C = modalListener;
                Intrinsics.checkNotNullParameter(modalListener, "loggingHandler");
                Y.D = modalListener;
                IdeaPinHandDrawingEditor z14 = modalListener.z();
                z14.getClass();
                Intrinsics.checkNotNullParameter(modalListener, "listener");
                z14.f46503u = modalListener;
                Intrinsics.checkNotNullParameter(listener, "listener");
                z14.f46504v = listener;
                Intrinsics.checkNotNullParameter(modalListener, "listener");
                z14.f46505w = modalListener;
                IdeaPinOverlayViewColorPickerModal L = modalListener.L();
                L.getClass();
                Intrinsics.checkNotNullParameter(modalListener, "eyeDropperListener");
                Intrinsics.checkNotNullParameter(modalListener, "modalListener");
                Intrinsics.checkNotNullParameter(navigationListener, "navigationListener");
                L.f46025p = editListener;
                L.f46026q = modalListener;
                L.f46027r = modalListener;
                L.f46028s = navigationListener;
                au0.d provider = (au0.d) this.f23900e;
                Intrinsics.checkNotNullParameter(provider, "provider");
                modalListener.f46168j0 = provider;
                modalListener.D().N = true;
                ArrayList buttonConfig = new ArrayList();
                buttonConfig.add(p2.CANVAS);
                buttonConfig.add(p2.MEDIA);
                buttonConfig.add(p2.TEXT);
                buttonConfig.add(p2.STICKER);
                buttonConfig.add(p2.DRAWING);
                buttonConfig.add(p2.BACKGROUND);
                StoryPinBottomToolbar q13 = modalListener.q();
                q13.getClass();
                Intrinsics.checkNotNullParameter(buttonConfig, "buttonConfig");
                LinearLayout linearLayout = (LinearLayout) q13.f46076f.getValue();
                linearLayout.removeAllViews();
                Iterator it = buttonConfig.iterator();
                while (it.hasNext()) {
                    switch (q2.f46288a[((p2) it.next()).ordinal()]) {
                        case 1:
                            linearLayout.addView((StoryPinActionButton) q13.f46077g.getValue());
                            break;
                        case 2:
                            linearLayout.addView((StoryPinActionButton) q13.f46078h.getValue());
                            break;
                        case 3:
                            linearLayout.addView((StoryPinActionButton) q13.f46079i.getValue());
                            break;
                        case 4:
                            linearLayout.addView((StoryPinActionButton) q13.f46080j.getValue());
                            break;
                        case 5:
                            linearLayout.addView((StoryPinActionButton) q13.f46081k.getValue());
                            break;
                        case 6:
                            linearLayout.addView((StoryPinActionButton) q13.f46082l.getValue());
                            break;
                    }
                }
                q13.f46083m.getClass();
                y0 y0Var = y0.ANDROID_IDEA_PIN_CREATION_PAGE_EDITOR;
                i32.l lVar = i32.l.ANDROID_SCE_TEXT_FEATURE_UPSELL;
                i32.l lVar2 = i32.l.ANDROID_SCE_TEXT_FEATURE_UPSELL_FOR_IMAGE;
                i32.l lVar3 = i32.l.ANDROID_SCE_STICKERS_FEATURE_UPSELL;
                if (f.f(y0Var, new i32.l[]{lVar, lVar2, lVar3, i32.l.ANDROID_SCE_DRAW_FEATURE_UPSELL}) || f.f(y0.ANDROID_IDEA_PIN_CREATION_VIDEO_EDITOR, new i32.l[]{lVar, i32.l.ANDROID_SCE_TEXT_FEATURE_UPSELL_FOR_VIDEO, i32.l.ANDROID_SCE_MUSIC_FEATURE_UPSELL, lVar3})) {
                    q13.f46084n.d(new c());
                }
                cp0.FULL_BLEED.getType();
                vn0 mediaList = tpVar2.getMediaList();
                boolean O0 = kh2.p2.O0(mediaList);
                String str3 = "getValue(...)";
                k kVar2 = modalListener.f46174o;
                if (O0) {
                    fo volumeMix = tpVar2.getAudioMix();
                    boolean a13 = tpVar2.a();
                    Intrinsics.checkNotNullParameter(volumeMix, "volumeMix");
                    Intrinsics.checkNotNullParameter(mediaList, "mediaList");
                    modalListener.f46154c0 = a13;
                    bs1.c.X0(modalListener.D());
                    IdeaPinInteractiveVideoView d04 = modalListener.d0();
                    d04.getClass();
                    Intrinsics.checkNotNullParameter(volumeMix, "volumeMix");
                    Intrinsics.checkNotNullParameter(mediaList, "mediaList");
                    d04.O = mediaList;
                    ArrayList arrayList = new ArrayList();
                    LinkedHashMap linkedHashMap = d04.R;
                    HashMap hashMap2 = new HashMap(linkedHashMap);
                    LinkedHashMap linkedHashMap2 = d04.Q;
                    linkedHashMap2.clear();
                    linkedHashMap.clear();
                    ArrayList arrayList2 = d04.P;
                    arrayList2.clear();
                    int startMediaIndex = mediaList.getStartMediaIndex();
                    int endMediaIndex = mediaList.getEndMediaIndex();
                    tpVar = tpVar2;
                    ql2.k it2 = new IntRange(startMediaIndex, endMediaIndex, 1).iterator();
                    long j13 = 0;
                    while (it2.f104109c) {
                        int b13 = it2.b();
                        ql2.k kVar3 = it2;
                        bo0 bo0Var = (bo0) CollectionsKt.U(b13, mediaList.getItems());
                        if (bo0Var != null) {
                            kVar = kVar2;
                            k01 videoItem = bo0Var.getVideoItem();
                            if (videoItem != null) {
                                str2 = str3;
                                int intValue = ((Number) videoItem.f39240c.f135234a).intValue();
                                z13 = a13;
                                int intValue2 = ((Number) videoItem.f39240c.f135235b).intValue();
                                f0Var2 = modalListener;
                                Context context = d04.getContext();
                                hashMap = hashMap2;
                                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                                foVar = volumeMix;
                                w Z = ig1.b.Z(context, d04.M.width() / d04.M.height(), intValue, intValue2);
                                Matrix matrix2 = (Matrix) Z.f135234a;
                                Matrix matrix3 = (Matrix) Z.f135235b;
                                Matrix matrix4 = (Matrix) Z.f135236c;
                                linkedHashMap2.put(Integer.valueOf(b13), matrix2);
                                Matrix displayMatrix = bo0Var.getDisplayMatrix();
                                if (displayMatrix != null) {
                                    linkedHashMap.put(Integer.valueOf(b13), displayMatrix);
                                } else {
                                    linkedHashMap.put(Integer.valueOf(b13), matrix3);
                                    d1 d1Var = d04.K;
                                    if (d1Var != null) {
                                        ((f0) d1Var).P0(b13, matrix3, matrix4);
                                    }
                                }
                                long startTimeMs = b13 == startMediaIndex ? mediaList.getStartTimeMs() + bo0Var.getStartTimeMs() : bo0Var.getStartTimeMs();
                                long endTimeMs = b13 == endMediaIndex ? mediaList.getEndTimeMs() + bo0Var.getStartTimeMs() : bo0Var.getEndTimeMs();
                                a7.w wVar = new a7.w();
                                a7.z zVar2 = new a7.z();
                                List emptyList = Collections.emptyList();
                                v2 v2Var = v2.f100502e;
                                b0 b0Var = new b0();
                                e0 e0Var = e0.f982d;
                                vn0Var = mediaList;
                                i14 = startMediaIndex;
                                long X = n0.X(startTimeMs);
                                bf.b.i(X >= 0);
                                wVar.f1230a = X;
                                wVar.b(endTimeMs);
                                bf.b.t(zVar2.f1244b == null || zVar2.f1243a != null);
                                Uri uri = videoItem.f41101b;
                                i0 i0Var = new i0("", new y(wVar), uri != null ? new a7.d0(uri, null, zVar2.f1243a != null ? zVar2.a() : null, emptyList, null, v2Var, null, -9223372036854775807L) : null, new c0(b0Var), l0.I, e0Var);
                                Intrinsics.checkNotNullExpressionValue(i0Var, "build(...)");
                                arrayList.add(i0Var);
                                arrayList2.add(Long.valueOf(j13));
                                j13 = (endTimeMs - startTimeMs) + j13;
                                it2 = kVar3;
                                mediaList = vn0Var;
                                startMediaIndex = i14;
                                kVar2 = kVar;
                                str3 = str2;
                                a13 = z13;
                                modalListener = f0Var2;
                                hashMap2 = hashMap;
                                volumeMix = foVar;
                            } else {
                                f0Var2 = modalListener;
                                foVar = volumeMix;
                            }
                        } else {
                            f0Var2 = modalListener;
                            foVar = volumeMix;
                            kVar = kVar2;
                        }
                        z13 = a13;
                        hashMap = hashMap2;
                        str2 = str3;
                        vn0Var = mediaList;
                        i14 = startMediaIndex;
                        it2 = kVar3;
                        mediaList = vn0Var;
                        startMediaIndex = i14;
                        kVar2 = kVar;
                        str3 = str2;
                        a13 = z13;
                        modalListener = f0Var2;
                        hashMap2 = hashMap;
                        volumeMix = foVar;
                    }
                    f0 f0Var3 = modalListener;
                    k kVar4 = kVar2;
                    boolean z15 = a13;
                    HashMap hashMap3 = hashMap2;
                    String str4 = str3;
                    vn0 vn0Var2 = mediaList;
                    d04.L(volumeMix, arrayList);
                    Integer Q = d04.Q();
                    if (Q != null) {
                        int intValue3 = Q.intValue();
                        Matrix matrix5 = (Matrix) hashMap3.get(Integer.valueOf(intValue3));
                        if (matrix5 != null && (matrix = (Matrix) linkedHashMap.get(Integer.valueOf(intValue3))) != null && !Intrinsics.d(matrix5, matrix)) {
                            View view = d04.f18939d;
                            TextureView textureView = view instanceof TextureView ? (TextureView) view : null;
                            if (textureView != null) {
                                textureView.setTransform(matrix);
                                textureView.invalidate();
                            }
                            d04.R.put(Integer.valueOf(intValue3), matrix);
                        }
                    }
                    bs1.c.U1(f0Var3.d0());
                    if (z15) {
                        f0Var3.d0().A = false;
                        f0Var3.d0().M(false);
                        bs1.c.X0(f0Var3.a0());
                        f0Var = f0Var3;
                        Object value = f0Var.f46177r.getValue();
                        str = str4;
                        Intrinsics.checkNotNullExpressionValue(value, str);
                        t.O((GestaltIcon) value);
                    } else {
                        str = str4;
                        f0Var = f0Var3;
                        f0Var.d0().A = true;
                        f0Var.a0().f46068a.setMax((int) vn0Var2.v());
                        bs1.c.U1(f0Var.a0());
                        IdeaPinInteractiveVideoView d05 = f0Var.d0();
                        if (!d05.N) {
                            d05.play();
                        }
                    }
                    Object value2 = kVar4.getValue();
                    Intrinsics.checkNotNullExpressionValue(value2, str);
                    bs1.c.X0((View) value2);
                    f0Var.b1(tpVar.getPageBackgroundColor());
                    List t13 = yn2.c0.t(yn2.c0.j(d7.b.O(f0Var.s()), p.f46278k));
                    for (int size = t13.size() - 1; -1 < size; size--) {
                        f0Var.s().removeView((View) t13.get(size));
                    }
                    for (qq qqVar : tpVar.getOverlayBlocks()) {
                        if (qqVar instanceof oq) {
                            f0Var.r1((oq) qqVar);
                        } else if (qqVar instanceof lq) {
                            f0Var.Y0((lq) qqVar, null, null);
                        } else if (qqVar instanceof mq) {
                            f0Var.n1((mq) qqVar, null, null);
                        } else if (qqVar instanceof pq) {
                            f0Var.s1((pq) qqVar, null, null);
                        } else if (qqVar instanceof nq) {
                            f0Var.p1((nq) qqVar, null, null, 0L);
                        } else if (qqVar instanceof jq) {
                            f0Var.S0((jq) qqVar, null, null);
                        } else if (qqVar instanceof kq) {
                            f0Var.T0((kq) qqVar, null, null);
                        }
                    }
                } else {
                    f0Var = modalListener;
                    tpVar = tpVar2;
                    str = "getValue(...)";
                    Object value3 = kVar2.getValue();
                    Intrinsics.checkNotNullExpressionValue(value3, str);
                    bs1.c.U1((View) value3);
                }
                List drawingPaths = tpVar.getDrawingPathList();
                Intrinsics.checkNotNullParameter(drawingPaths, "drawingPaths");
                k kVar5 = f0Var.B;
                Object value4 = kVar5.getValue();
                Intrinsics.checkNotNullExpressionValue(value4, str);
                ((IdeaPinHandDrawingView) value4).d(drawingPaths, f0Var.R);
                Object value5 = kVar5.getValue();
                Intrinsics.checkNotNullExpressionValue(value5, str);
                ((IdeaPinHandDrawingView) value5).invalidate();
                break;
            case 1:
                s view2 = (s) nVar;
                qx model2 = (qx) obj;
                Intrinsics.checkNotNullParameter(view2, "view");
                Intrinsics.checkNotNullParameter(model2, "model");
                NewsHubMultiUserAvatar newsHubMultiUserAvatar = view2.f81083b;
                newsHubMultiUserAvatar.b(model2);
                newsHubMultiUserAvatar.setOnClickListener(new qv0.d0(5, model2, this));
                o oVar = new o(9, model2, this);
                GestaltText gestaltText = view2.f81084c;
                gestaltText.j(oVar);
                String q14 = model2.q();
                Map map = model2.f41417x;
                Pattern pattern = eq.b.f59905a;
                gestaltText.i(new eq.a(gestaltText, q14, map, i15));
                break;
            case 2:
                Intrinsics.checkNotNullParameter((m4) nVar, "view");
                Intrinsics.checkNotNullParameter((vh) obj, "model");
                break;
            case 3:
                ?? view3 = (k71.k) nVar;
                vh model3 = (vh) obj;
                Intrinsics.checkNotNullParameter(view3, "view");
                Intrinsics.checkNotNullParameter(model3, "model");
                View view4 = view3 instanceof View ? (View) view3 : null;
                if (view4 != null) {
                    ?? j14 = s1.j(view4);
                    zVar = j14 instanceof z ? j14 : null;
                }
                if (zVar != null) {
                    zVar.f93417d = model3;
                    zVar.r3();
                    break;
                }
                break;
            case 4:
                ?? view5 = (a0) nVar;
                Intrinsics.checkNotNullParameter(view5, "view");
                v vVar = (v) ((Function1) obj2).invoke(obj);
                if (vVar != null) {
                    View view6 = view5 instanceof View ? (View) view5 : null;
                    if (view6 != null) {
                        ?? j15 = s1.j(view6);
                        bVar = j15 instanceof b ? j15 : null;
                    }
                    if (bVar != null) {
                        bVar.q3(vVar, Integer.valueOf(i13));
                        break;
                    }
                }
                break;
            default:
                ?? view7 = (ye1.d) nVar;
                vh model4 = (vh) obj;
                Intrinsics.checkNotNullParameter(view7, "view");
                Intrinsics.checkNotNullParameter(model4, "model");
                View view8 = view7 instanceof View ? (View) view7 : null;
                if (view8 != null) {
                    ?? j16 = s1.j(view8);
                    jVar = j16 instanceof j ? j16 : null;
                }
                if (jVar != null) {
                    jVar.q3(model4, Integer.valueOf(i13));
                    break;
                }
                break;
        }
    }

    @Override // vq0.h
    public final m f() {
        int i13 = this.f23896a;
        Object obj = this.f23899d;
        Object obj2 = this.f23898c;
        Object obj3 = this.f23901f;
        Object obj4 = this.f23900e;
        Object obj5 = this.f23897b;
        switch (i13) {
            case 2:
                ((z5) ((p0) obj3)).getClass();
                return new o0((String) obj5, (i2) obj2, (g) obj, (d0) obj4);
            case 3:
                return new z((m60.w) obj2, (d) obj5, (yk1.v) obj4, (i2) obj3, (q) obj);
            case 4:
                return new b((Function1) obj4, (d) obj5, (q) obj3);
            case 5:
                return new j((d) obj5, (q) obj2, (ze1.c) obj, (Function0) obj4, (nx.f0) obj3);
            default:
                return null;
        }
    }

    @Override // vq0.h
    public final String g(int i13, Object obj) {
        int i14 = this.f23896a;
        Object obj2 = this.f23899d;
        switch (i14) {
            case 0:
                Intrinsics.checkNotNullParameter((hv0.d) obj, "model");
                return null;
            case 1:
                qx model = (qx) obj;
                Intrinsics.checkNotNullParameter(model, "model");
                if (model.q() != null) {
                    return eq.b.a((Context) obj2, model.q(), model.f41417x).toString();
                }
                return null;
            case 2:
                return h((vh) obj);
            case 3:
                return h((vh) obj);
            case 4:
                return (String) ((Function1) obj2).invoke(obj);
            default:
                return h((vh) obj);
        }
    }

    public final String h(vh model) {
        switch (this.f23896a) {
            case 2:
                Intrinsics.checkNotNullParameter(model, "model");
                return null;
            case 3:
                Intrinsics.checkNotNullParameter(model, "model");
                return null;
            default:
                Intrinsics.checkNotNullParameter(model, "model");
                kj kjVar = model.f42855m;
                if (kjVar != null) {
                    return kjVar.a();
                }
                return null;
        }
    }

    public a(du0.b presenterPinalytics, au0.d spEditListener, au0.d navigationListener, au0.d recentStylesProvider, ou0.k saveChangeListener) {
        this.f23896a = 0;
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(spEditListener, "spEditListener");
        Intrinsics.checkNotNullParameter(navigationListener, "navigationListener");
        Intrinsics.checkNotNullParameter(recentStylesProvider, "recentStylesProvider");
        Intrinsics.checkNotNullParameter(saveChangeListener, "saveChangeListener");
        this.f23897b = presenterPinalytics;
        this.f23898c = spEditListener;
        this.f23899d = navigationListener;
        this.f23900e = recentStylesProvider;
        this.f23901f = saveChangeListener;
    }

    public a(String pinUid, i2 pinRepository, g monolithHeaderConfig, d0 pinalytics, p0 presenterFactory) {
        this.f23896a = 2;
        Intrinsics.checkNotNullParameter(pinUid, "pinUid");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(monolithHeaderConfig, "monolithHeaderConfig");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(presenterFactory, "presenterFactory");
        this.f23897b = pinUid;
        this.f23898c = pinRepository;
        this.f23899d = monolithHeaderConfig;
        this.f23900e = pinalytics;
        this.f23901f = presenterFactory;
    }

    public a(m60.w eventManager, d presenterPinalytics, yk1.v viewResources, i2 pinRepository, q networkStateStream) {
        this.f23896a = 3;
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        this.f23898c = eventManager;
        this.f23897b = presenterPinalytics;
        this.f23899d = networkStateStream;
        this.f23900e = viewResources;
        this.f23901f = pinRepository;
    }

    public a(d0 pinalytics, m60.w eventManager, Context context, g70.h boardNavigator) {
        this.f23896a = 1;
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(boardNavigator, "boardNavigator");
        this.f23897b = pinalytics;
        this.f23898c = eventManager;
        this.f23899d = context;
        this.f23900e = boardNavigator;
        this.f23901f = (ScreenLocation) s2.f51348g.getValue();
    }

    public a(d pinalytics, q networkStateStream, ze1.c apiParams, Function0 commerceAuxData, nx.f0 pinalyticsFactory) {
        this.f23896a = 5;
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(apiParams, "apiParams");
        Intrinsics.checkNotNullParameter(commerceAuxData, "commerceAuxData");
        Intrinsics.checkNotNullParameter(pinalyticsFactory, "pinalyticsFactory");
        this.f23897b = pinalytics;
        this.f23898c = networkStateStream;
        this.f23899d = apiParams;
        this.f23900e = commerceAuxData;
        this.f23901f = pinalyticsFactory;
    }
}
