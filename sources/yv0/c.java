package yv0;

import android.content.Context;
import android.media.MediaMetadataRetriever;
import androidx.recyclerview.widget.b2;
import c2.m4;
import com.pinterest.api.model.bo0;
import com.pinterest.api.model.fo;
import com.pinterest.api.model.k01;
import com.pinterest.api.model.ln0;
import com.pinterest.api.model.tp;
import com.pinterest.api.model.vn0;
import com.pinterest.component.alert.AlertContainer;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.ideaPinCreation.camera.view.IdeaPinCreationCameraSpeedControlView;
import com.pinterest.feature.ideaPinCreation.videotrimming.view.IdeaPinVideoTrimmingDragger;
import com.pinterest.gestalt.text.GestaltText;
import dl1.l;
import dl1.t;
import h32.f1;
import h32.u0;
import i92.k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jk2.z1;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import lh0.s1;
import m60.x0;
import nx.d0;
import ql2.s;
import rw0.f;
import sq0.c0;
import tb0.h;
import vv0.d;
import vv0.e;
import wk1.q;
import yb0.n;
import yk1.v;
import zv0.g;
import zv0.i;
import zv0.j;

/* loaded from: classes5.dex */
public final class c extends q implements vf1.a, e, d, y92.e {

    /* renamed from: a, reason: collision with root package name */
    public final vv0.b f140200a;

    /* renamed from: b, reason: collision with root package name */
    public final v f140201b;

    /* renamed from: c, reason: collision with root package name */
    public final k f140202c;

    /* renamed from: d, reason: collision with root package name */
    public final ag1.b f140203d;

    /* renamed from: e, reason: collision with root package name */
    public final h f140204e;

    /* renamed from: f, reason: collision with root package name */
    public final f f140205f;

    /* renamed from: g, reason: collision with root package name */
    public final bw0.f f140206g;

    /* renamed from: h, reason: collision with root package name */
    public final s1 f140207h;

    /* renamed from: i, reason: collision with root package name */
    public final t f140208i;

    /* renamed from: j, reason: collision with root package name */
    public final ag1.h f140209j;

    /* renamed from: k, reason: collision with root package name */
    public final wv0.c f140210k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f140211l;

    /* renamed from: m, reason: collision with root package name */
    public ln0 f140212m;

    /* renamed from: n, reason: collision with root package name */
    public tp f140213n;

    /* renamed from: o, reason: collision with root package name */
    public tp f140214o;

    /* renamed from: p, reason: collision with root package name */
    public int f140215p;

    /* renamed from: q, reason: collision with root package name */
    public final LinkedHashMap f140216q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(vv0.b navigator, yk1.a viewResources, uk1.d presenterPinalytics, k toastUtils, uj2.q networkStateStream, ag1.b dataManager, h crashReporting, f mediaUtils, bw0.f storyPinWorkUtils, s1 experiments, t storyPinLocalDataRepository, ag1.h ideaPinSessionDataManager) {
        super(presenterPinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(toastUtils, "toastUtils");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(dataManager, "dataManager");
        Intrinsics.checkNotNullParameter(crashReporting, "crashReporting");
        Intrinsics.checkNotNullParameter(mediaUtils, "mediaUtils");
        Intrinsics.checkNotNullParameter(storyPinWorkUtils, "storyPinWorkUtils");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(storyPinLocalDataRepository, "storyPinLocalDataRepository");
        Intrinsics.checkNotNullParameter(ideaPinSessionDataManager, "ideaPinSessionDataManager");
        this.f140200a = navigator;
        this.f140201b = viewResources;
        this.f140202c = toastUtils;
        this.f140203d = dataManager;
        this.f140204e = crashReporting;
        this.f140205f = mediaUtils;
        this.f140206g = storyPinWorkUtils;
        this.f140207h = experiments;
        this.f140208i = storyPinLocalDataRepository;
        this.f140209j = ideaPinSessionDataManager;
        this.f140210k = new wv0.c(dataManager.d(), this, storyPinLocalDataRepository);
        this.f140215p = -1;
        this.f140216q = new LinkedHashMap();
    }

    public final void B3() {
        tp tpVar;
        int i13 = this.f140215p;
        if (i13 == -1 || (tpVar = this.f140213n) == null) {
            return;
        }
        vn0 mediaList = tpVar.getMediaList();
        Intrinsics.checkNotNullParameter(mediaList, "mediaList");
        List items = mediaList.getItems();
        if (i13 >= 0 && i13 < items.size()) {
            ArrayList H0 = CollectionsKt.H0(items);
            H0.remove(i13);
            if (H0.size() == 1) {
                Intrinsics.checkNotNullParameter(H0, "<this>");
                bo0 bo0Var = (bo0) CollectionsKt.S(H0);
                if (bo0Var.x() && bo0Var.getEndTimeMs() == 3000) {
                    H0.set(0, bo0.a(bo0Var, null, 0L, 5000L, null, null, 0.0f, RecyclerViewTypes.VIEW_TYPE_PEAR_INSIGHT_HEADER));
                }
            }
            mediaList = pp2.a.K0(H0);
        }
        tp e13 = tp.e(tpVar, null, null, mediaList, null, null, null, null, null, null, null, null, null, 4091);
        this.f140213n = e13;
        this.f140215p = -1;
        d0 pinalytics = getPinalytics();
        f1 f1Var = f1.STORY_PIN_DELETE;
        HashMap hashMap = new HashMap();
        hashMap.put("index", String.valueOf(i13));
        pinalytics.g(f1Var, null, hashMap, false);
        this.f140209j.d(new mu0.c(e13, 2), false);
        G3();
    }

    @Override // y92.e
    public final void D1(int i13) {
    }

    public final void D3() {
        List items;
        getPinalytics().X(u0.STORY_PIN_TRIMMER_DELETE_CLIP_BUTTON);
        vn0 u33 = u3();
        if (u33 == null || (items = u33.getItems()) == null) {
            return;
        }
        int size = items.size();
        int i13 = this.f140215p;
        if (i13 < 0 || i13 >= size) {
            return;
        }
        if (items.size() == 1) {
            this.f140202c.i(((yk1.a) this.f140201b).f139224a.getString(aq1.h.idea_pin_delete_last_clip_error));
            return;
        }
        j jVar = (j) ((vv0.c) getView());
        AlertContainer alertContainer = (AlertContainer) jVar.requireActivity().findViewById(dq1.c.alert_container);
        Context requireContext = jVar.requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        n nVar = new n(requireContext);
        String string = nVar.getResources().getString(aq1.h.idea_pin_delete_clip_alert_title);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        nVar.w(string);
        nVar.u(nVar.getResources().getString(aq1.h.idea_pin_delete_clip_alert_subtitle));
        String string2 = nVar.getResources().getString(aq1.h.idea_pin_delete_clip_alert_confirmation);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        nVar.q(string2);
        String string3 = nVar.getContext().getResources().getString(x0.cancel);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        nVar.m(string3);
        nVar.f138513j = new g(jVar, 1);
        nVar.f138514k = new com.pinterest.feature.home.view.c(alertContainer, 9);
        if (alertContainer != null) {
            alertContainer.c(nVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x006b, code lost:
    
        if (r7 != false) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void F3() {
        /*
            r17 = this;
            r0 = r17
            com.pinterest.api.model.tp r1 = r0.f140214o
            if (r1 == 0) goto Le4
            com.pinterest.api.model.vn0 r1 = r1.getMediaList()
            if (r1 != 0) goto Le
            goto Le4
        Le:
            com.pinterest.api.model.vn0 r2 = r17.u3()
            if (r2 != 0) goto L15
            return
        L15:
            boolean r1 = kotlin.jvm.internal.Intrinsics.d(r1, r2)
            if (r1 != 0) goto Ld9
            com.pinterest.api.model.tp r1 = r0.f140213n
            r15 = 0
            if (r1 == 0) goto Lc7
            com.pinterest.api.model.to r2 = r1.getCoverImageData()
            if (r2 != 0) goto L27
            goto L6d
        L27:
            com.pinterest.api.model.to r2 = r1.getCoverImageData()
            kotlin.jvm.internal.Intrinsics.f(r2)
            int r3 = r2.c()
            long r4 = r2.d()
            com.pinterest.api.model.vn0 r2 = r1.getMediaList()
            int r6 = r2.getStartMediaIndex()
            r7 = 1
            if (r3 > r6) goto L52
            int r6 = r2.getStartMediaIndex()
            if (r3 != r6) goto L50
            long r8 = r2.getStartTimeMs()
            int r6 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r6 < 0) goto L50
            goto L52
        L50:
            r6 = r15
            goto L53
        L52:
            r6 = r7
        L53:
            int r8 = r2.getEndMediaIndex()
            if (r3 < r8) goto L69
            int r8 = r2.getEndMediaIndex()
            if (r3 != r8) goto L68
            long r2 = r2.getEndTimeMs()
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 > 0) goto L68
            goto L69
        L68:
            r7 = r15
        L69:
            if (r6 == 0) goto L6d
            if (r7 != 0) goto L98
        L6d:
            com.pinterest.api.model.to r11 = new com.pinterest.api.model.to
            com.pinterest.api.model.vn0 r2 = r1.getMediaList()
            int r2 = r2.getStartMediaIndex()
            com.pinterest.api.model.vn0 r3 = r1.getMediaList()
            long r3 = r3.getStartTimeMs()
            r11.<init>(r2, r3, r15)
            r13 = 0
            r14 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r12 = 0
            r16 = 3839(0xeff, float:5.38E-42)
            r2 = r1
            r15 = r16
            com.pinterest.api.model.tp r2 = com.pinterest.api.model.tp.e(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r0.f140213n = r2
        L98:
            java.lang.String r1 = r1.getId()
            bw0.f r2 = r0.f140206g
            r2.getClass()
            java.lang.String r3 = "pageId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Idea Pin Publish: Cancel work for page "
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            tb0.h r4 = r2.f23981h
            r4.h(r3)
            xk2.v r2 = r2.f23983j
            java.lang.Object r2 = r2.getValue()
            kb.w0 r2 = (kb.w0) r2
            r2.b(r1)
            kotlin.Unit r1 = kotlin.Unit.f80348a
            goto Lc8
        Lc7:
            r1 = 0
        Lc8:
            if (r1 != 0) goto Ld6
            tb0.p r1 = tb0.p.IDEA_PINS_CREATION
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = "Failed to get story pin page data"
            m60.f0 r4 = vb0.j.f125466a
            r4.F(r3, r1, r2)
        Ld6:
            r17.G3()
        Ld9:
            yk1.n r1 = r17.getView()
            vv0.c r1 = (vv0.c) r1
            zv0.j r1 = (zv0.j) r1
            r1.P7()
        Le4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yv0.c.F3():void");
    }

    public final void G3() {
        tp tpVar;
        ln0 ln0Var = this.f140212m;
        if (ln0Var == null || (tpVar = this.f140213n) == null) {
            return;
        }
        ((l) this.f140208i).W(ln0.a(ln0Var, null, tpVar.q(false, true).W(), null, null, null, null, false, null, null, null, null, 16379));
    }

    public final void H3(vn0 vn0Var) {
        List items = vn0Var.getItems();
        int startMediaIndex = vn0Var.getStartMediaIndex();
        long startTimeMs = vn0Var.getStartTimeMs();
        int endMediaIndex = vn0Var.getEndMediaIndex();
        long endTimeMs = vn0Var.getEndTimeMs();
        float j03 = ig1.b.j0(items);
        float R = ((ig1.b.R(startMediaIndex, items) + startTimeMs) * 1.0f) / j03;
        Float valueOf = Float.valueOf(R);
        Float valueOf2 = Float.valueOf(((ig1.b.R(endMediaIndex, items) + endTimeMs) * 1.0f) / j03);
        yk1.n view = getView();
        Intrinsics.checkNotNullExpressionValue(view, "<get-view>(...)");
        vv0.c cVar = (vv0.c) view;
        List items2 = vn0Var.getItems();
        tp tpVar = this.f140213n;
        fo audioMix = tpVar != null ? tpVar.getAudioMix() : null;
        tp tpVar2 = this.f140213n;
        vv0.c.U(cVar, items2, audioMix, tpVar2 != null ? tpVar2.a() : false, false, 8);
        ((j) ((vv0.c) getView())).c9(false);
        int i13 = 1;
        ((j) ((vv0.c) getView())).Z8(vn0Var.v() >= pp2.a.u() ? vn0Var.getItems().size() : vn0Var.getItems().size() + 1);
        yk1.n view2 = getView();
        Intrinsics.checkNotNullExpressionValue(view2, "<get-view>(...)");
        int startMediaIndex2 = vn0Var.getStartMediaIndex();
        long startTimeMs2 = vn0Var.getStartTimeMs();
        int endMediaIndex2 = vn0Var.getEndMediaIndex();
        long endTimeMs2 = vn0Var.getEndTimeMs();
        j jVar = (j) ((vv0.c) view2);
        jVar.Y0 = startMediaIndex2;
        jVar.Z0 = startTimeMs2;
        jVar.f142879a1 = endMediaIndex2;
        jVar.f142880b1 = endTimeMs2;
        jVar.f142882d1 = false;
        jVar.W8(startMediaIndex2, startTimeMs2);
        ((j) ((vv0.c) getView())).a9(valueOf.floatValue(), valueOf2.floatValue());
        ((j) ((vv0.c) getView())).d9(ig1.b.j0(vn0Var.getItems()), true);
        long j13 = 0;
        if (this.f140211l || vn0Var.x()) {
            vv0.c cVar2 = (vv0.c) getView();
            vn0 u33 = u3();
            ((j) cVar2).b9(u33 != null ? u33.v() : 0L);
        } else {
            j jVar2 = (j) ((vv0.c) getView());
            GestaltText gestaltText = jVar2.K0;
            if (gestaltText == null) {
                Intrinsics.r("durationTv");
                throw null;
            }
            gestaltText.i(new i(jVar2, i13));
        }
        List items3 = vn0Var.getItems();
        Iterator it = items3.iterator();
        while (it.hasNext()) {
            j13 += ((bo0) it.next()).f36143i;
        }
        float f13 = (j13 * 1.0f) / 8;
        ql2.k it2 = s.q(0, 8).iterator();
        while (it2.f104109c) {
            int b13 = it2.b();
            Pair k03 = ig1.b.k0(ml2.c.d((f13 / 2) + (b13 * f13)), items3);
            if (k03 != null) {
                int intValue = ((Number) k03.f80346a).intValue();
                long longValue = ((Number) k03.f80347b).longValue();
                bo0 bo0Var = (bo0) items3.get(intValue);
                k01 videoItem = bo0Var.getVideoItem();
                if (videoItem != null) {
                    if (videoItem.g()) {
                        w3(b13, longValue, videoItem.e(), bo0Var.getIsFromFrontFacingCamera());
                    } else {
                        ((j) ((vv0.c) getView())).Y8(b13, null);
                    }
                }
            }
        }
    }

    public final void I3(bo0 bo0Var) {
        List items;
        ((j) ((vv0.c) getView())).c9(true);
        if (this.f140207h.f()) {
            vv0.c cVar = (vv0.c) getView();
            float speedMultiplier = bo0Var.getSpeedMultiplier();
            IdeaPinCreationCameraSpeedControlView ideaPinCreationCameraSpeedControlView = ((j) cVar).I0;
            if (ideaPinCreationCameraSpeedControlView == null) {
                Intrinsics.r("speedControls");
                throw null;
            }
            ideaPinCreationCameraSpeedControlView.k0(speedMultiplier);
        }
        vn0 u33 = u3();
        if (u33 != null && (items = u33.getItems()) != null) {
            ((j) ((vv0.c) getView())).Z8(items.size());
        }
        k01 videoItem = bo0Var.getVideoItem();
        if (videoItem != null) {
            if (videoItem.g()) {
                vv0.c cVar2 = (vv0.c) getView();
                long startTimeMs = bo0Var.getStartTimeMs();
                long endTimeMs = bo0Var.getEndTimeMs();
                j jVar = (j) cVar2;
                jVar.Y0 = 0;
                jVar.Z0 = startTimeMs;
                jVar.f142879a1 = 0;
                jVar.f142880b1 = endTimeMs;
                jVar.f142882d1 = true;
                jVar.W8(0, startTimeMs);
                ((j) ((vv0.c) getView())).b9(bo0Var.f36143i);
                long j13 = videoItem.f39242e;
                float f13 = j13;
                float startTimeMs2 = (bo0Var.getStartTimeMs() * 1.0f) / f13;
                float endTimeMs2 = (bo0Var.getEndTimeMs() * 1.0f) / f13;
                yk1.n view = getView();
                Intrinsics.checkNotNullExpressionValue(view, "<get-view>(...)");
                vv0.c cVar3 = (vv0.c) view;
                List b13 = e0.b(bo0.a(bo0Var, null, 0L, j13, null, null, 0.0f, RecyclerViewTypes.VIEW_TYPE_BRAND_MULTI_IMAGE_REP_ITEM));
                tp tpVar = this.f140213n;
                vv0.c.U(cVar3, b13, null, tpVar != null ? tpVar.a() : false, true, 2);
                ((j) ((vv0.c) getView())).a9(startTimeMs2, endTimeMs2);
                ((j) ((vv0.c) getView())).d9(j13, false);
            } else {
                j jVar2 = (j) ((vv0.c) getView());
                jVar2.Y0 = 0;
                jVar2.Z0 = 0L;
                jVar2.f142879a1 = 0;
                jVar2.f142880b1 = 0L;
                jVar2.f142882d1 = true;
                jVar2.W8(0, 0L);
                ((j) ((vv0.c) getView())).b9(0L);
                yk1.n view2 = getView();
                Intrinsics.checkNotNullExpressionValue(view2, "<get-view>(...)");
                vv0.c cVar4 = (vv0.c) view2;
                q0 q0Var = q0.f80391a;
                tp tpVar2 = this.f140213n;
                vv0.c.U(cVar4, q0Var, null, tpVar2 != null ? tpVar2.a() : false, false, 10);
                ((j) ((vv0.c) getView())).a9(0.0f, 1.0f);
                ((j) ((vv0.c) getView())).d9(0L, false);
            }
        }
        k01 videoItem2 = bo0Var.getVideoItem();
        if (videoItem2 == null) {
            return;
        }
        float f14 = (videoItem2.f39242e * 1.0f) / 8;
        ql2.k it = s.q(0, 8).iterator();
        while (it.f104109c) {
            int b14 = it.b();
            if (videoItem2.g()) {
                w3(b14, ml2.c.d((f14 / 2) + (b14 * f14)), videoItem2.e(), bo0Var.getIsFromFrontFacingCamera());
            } else {
                ((j) ((vv0.c) getView())).Y8(b14, null);
            }
        }
    }

    @Override // vf1.a
    public final void T2(float f13) {
        List items;
        vn0 u33 = u3();
        if (u33 == null || (items = u33.getItems()) == null) {
            return;
        }
        int i13 = this.f140215p;
        if (i13 != -1) {
            if (i13 < 0 || i13 >= items.size()) {
                throw new IllegalStateException("Invalid video clip index");
            }
            long j13 = (long) (f13 * (((bo0) items.get(this.f140215p)).getVideoItem() != null ? r1.f39242e : 0L));
            long endTimeMs = ((bo0) items.get(this.f140215p)).getEndTimeMs() - j13;
            j jVar = (j) ((vv0.c) getView());
            jVar.Y0 = 0;
            jVar.Z0 = j13;
            jVar.W8(0, j13);
            ((j) ((vv0.c) getView())).b9(endTimeMs);
            return;
        }
        this.f140211l = true;
        Pair v33 = v3(f13);
        if (v33 != null) {
            int intValue = ((Number) v33.f80346a).intValue();
            long longValue = ((Number) v33.f80347b).longValue();
            j jVar2 = (j) ((vv0.c) getView());
            jVar2.Y0 = intValue;
            jVar2.Z0 = longValue;
            jVar2.W8(intValue, longValue);
            vv0.c cVar = (vv0.c) getView();
            vn0 u34 = u3();
            ((j) cVar).b9(u34 != null ? u34.v() : 0L);
        }
    }

    @Override // vf1.a
    public final void a1(float f13) {
        List items;
        vn0 u33 = u3();
        if (u33 == null || (items = u33.getItems()) == null) {
            return;
        }
        int i13 = this.f140215p;
        if (i13 != -1) {
            if (i13 < 0 || i13 >= items.size()) {
                throw new IllegalStateException("Invalid video clip index");
            }
            long j13 = (long) (f13 * (((bo0) items.get(this.f140215p)).getVideoItem() != null ? r1.f39242e : 0L));
            long startTimeMs = j13 - ((bo0) items.get(this.f140215p)).getStartTimeMs();
            j jVar = (j) ((vv0.c) getView());
            jVar.f142879a1 = 0;
            jVar.f142880b1 = j13;
            jVar.W8(0, j13);
            ((j) ((vv0.c) getView())).b9(startTimeMs);
            return;
        }
        this.f140211l = true;
        Pair t33 = t3(f13);
        if (t33 != null) {
            int intValue = ((Number) t33.f80346a).intValue();
            long longValue = ((Number) t33.f80347b).longValue();
            j jVar2 = (j) ((vv0.c) getView());
            jVar2.f142879a1 = intValue;
            jVar2.f142880b1 = longValue;
            jVar2.W8(intValue, longValue);
            vv0.c cVar = (vv0.c) getView();
            vn0 u34 = u3();
            ((j) cVar).b9(u34 != null ? u34.v() : 0L);
        }
    }

    @Override // wk1.q
    public final void addDataSources(vq0.a dataSources) {
        Intrinsics.checkNotNullParameter(dataSources, "dataSources");
        ((wk1.i) dataSources).b(this.f140210k);
    }

    @Override // y92.e
    public final void c0(int i13, int i14) {
        if (i14 == CollectionsKt.F0(this.f140210k.f135191h).indexOf(new xv0.a())) {
            return;
        }
        tp tpVar = this.f140213n;
        if (tpVar != null) {
            vn0 mediaList = tpVar.getMediaList();
            Intrinsics.checkNotNullParameter(mediaList, "mediaList");
            List items = mediaList.getItems();
            if (i13 >= 0 && i13 < items.size() && i14 >= 0 && i14 < items.size()) {
                ArrayList H0 = CollectionsKt.H0(items);
                if (i13 >= 0 && i13 < H0.size() && i14 >= 0 && i14 < H0.size()) {
                    bo0 bo0Var = (bo0) H0.get(i13);
                    H0.set(i13, (bo0) H0.get(i14));
                    H0.set(i14, bo0Var);
                    mediaList = pp2.a.K0(H0);
                }
            }
            this.f140213n = tp.e(tpVar, null, null, mediaList, null, null, null, null, null, null, null, null, null, 4091);
        }
        Object adapter = getAdapter();
        if (adapter != null) {
            ((b2) adapter).k(i13, i14);
        }
        int i15 = this.f140215p;
        if (i13 == i15) {
            this.f140215p = i14;
        } else if (i14 == i15) {
            this.f140215p = i13;
        }
    }

    @Override // y92.e
    public final void o3(int i13, int i14) {
        d0 pinalytics = getPinalytics();
        f1 f1Var = f1.STORY_PIN_REORDER;
        HashMap hashMap = new HashMap();
        hashMap.put("from_value", String.valueOf(i13));
        hashMap.put("to_value", String.valueOf(i14));
        pinalytics.g(f1Var, null, hashMap, false);
        G3();
    }

    @Override // wk1.q, yk1.p, yk1.b
    public final void onUnbind() {
        Iterator it = this.f140216q.entrySet().iterator();
        while (it.hasNext()) {
            ((MediaMetadataRetriever) ((Map.Entry) it.next()).getValue()).release();
            it.remove();
        }
        super.onUnbind();
    }

    @Override // vf1.a
    public final void p2(float f13) {
        vn0 u33 = u3();
        if (u33 == null) {
            return;
        }
        int i13 = this.f140215p;
        if (i13 == -1) {
            Pair t33 = t3(f13);
            if (t33 != null) {
                int intValue = ((Number) t33.f80346a).intValue();
                long longValue = ((Number) t33.f80347b).longValue();
                tp tpVar = this.f140213n;
                if (tpVar != null) {
                    this.f140213n = tp.e(tpVar, null, null, vn0.a(tpVar.getMediaList(), null, 0, 0L, intValue, longValue, 7), null, null, null, null, null, null, null, null, null, 4091);
                    G3();
                    return;
                }
                return;
            }
            return;
        }
        if (i13 < 0 || i13 >= u33.getItems().size()) {
            throw new IllegalStateException("Invalid video clip index");
        }
        tp tpVar2 = this.f140213n;
        if (tpVar2 != null) {
            vn0 mediaList = tpVar2.getMediaList();
            int i14 = this.f140215p;
            Intrinsics.checkNotNullParameter(mediaList, "mediaList");
            List items = mediaList.getItems();
            if (i14 >= 0 && i14 < items.size()) {
                ArrayList H0 = CollectionsKt.H0(items);
                bo0 bo0Var = (bo0) H0.get(i14);
                H0.set(i14, bo0.a(bo0Var, null, 0L, (long) ((bo0Var.getVideoItem() != null ? r4.f39242e : 0L) * f13), null, null, 0.0f, RecyclerViewTypes.VIEW_TYPE_PEAR_INSIGHT_HEADER));
                mediaList = pp2.a.K0(H0);
            }
            this.f140213n = tp.e(tpVar2, null, null, mediaList, null, null, null, null, null, null, null, null, null, 4091);
        }
        G3();
    }

    public final Pair t3(float f13) {
        vn0 u33 = u3();
        if (u33 == null) {
            return null;
        }
        List items = u33.getItems();
        long j03 = (long) (f13 * ig1.b.j0(items));
        int i13 = 0;
        while (i13 < items.size() && j03 > ((bo0) items.get(i13)).f36143i) {
            j03 -= ((bo0) items.get(i13)).f36143i;
            i13++;
        }
        return new Pair(Integer.valueOf(i13), Long.valueOf(j03));
    }

    public final vn0 u3() {
        tp tpVar = this.f140213n;
        if (tpVar != null) {
            return tpVar.getMediaList();
        }
        return null;
    }

    public final Pair v3(float f13) {
        vn0 u33 = u3();
        if (u33 == null) {
            return null;
        }
        List items = u33.getItems();
        long j03 = (long) (f13 * ig1.b.j0(items));
        int i13 = 0;
        while (i13 < items.size() && j03 >= ((bo0) items.get(i13)).f36143i) {
            j03 -= ((bo0) items.get(i13)).f36143i;
            i13++;
        }
        return new Pair(Integer.valueOf(i13), Long.valueOf(j03));
    }

    public final void w3(int i13, long j13, String str, boolean z13) {
        ol1.d dVar = new ol1.d(new g0.e(this, str, j13 * 1000, 4), 2);
        Intrinsics.checkNotNullExpressionValue(dVar, "create(...)");
        xj2.c F = new z1(dVar.H(tk2.e.f118016b).A(wj2.c.a())).F(new pv0.e(14, new b(z13, this, i13)), new pv0.e(15, new m4(this, i13, 10)), ck2.i.f27923c, ck2.i.f27924d);
        Intrinsics.checkNotNullExpressionValue(F, "subscribe(...)");
        addDisposable(F);
    }

    @Override // wk1.q, yk1.p
    /* renamed from: x3, reason: merged with bridge method [inline-methods] */
    public final void r3(vv0.c view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((c0) view);
        j jVar = (j) view;
        Intrinsics.checkNotNullParameter(this, "listener");
        IdeaPinVideoTrimmingDragger ideaPinVideoTrimmingDragger = jVar.P0;
        if (ideaPinVideoTrimmingDragger == null) {
            Intrinsics.r("scrubberDragger");
            throw null;
        }
        Intrinsics.checkNotNullParameter(this, "listener");
        ideaPinVideoTrimmingDragger.f46439q = this;
        Intrinsics.checkNotNullParameter(this, "listener");
        jVar.f142884f1 = this;
        Intrinsics.checkNotNullParameter(this, "listener");
        jVar.f142885g1.f20370b = this;
        xj2.c F = ((l) this.f140208i).S(this.f140203d.d()).F(new pv0.e(16, new a(this, 0)), new pv0.e(17, new a(this, 1)), ck2.i.f27923c, ck2.i.f27924d);
        Intrinsics.checkNotNullExpressionValue(F, "subscribe(...)");
        addDisposable(F);
    }

    @Override // vf1.a
    public final void z2(float f13) {
        List items;
        vn0 u33 = u3();
        if (u33 == null || (items = u33.getItems()) == null) {
            return;
        }
        int i13 = this.f140215p;
        if (i13 == -1) {
            Pair v33 = v3(f13);
            if (v33 != null) {
                int intValue = ((Number) v33.f80346a).intValue();
                long longValue = ((Number) v33.f80347b).longValue();
                tp tpVar = this.f140213n;
                if (tpVar != null) {
                    this.f140213n = tp.e(tpVar, null, null, vn0.a(tpVar.getMediaList(), null, intValue, longValue, 0, 0L, 25), null, null, null, null, null, null, null, null, null, 4091);
                    G3();
                    return;
                }
                return;
            }
            return;
        }
        if (i13 < 0 || i13 >= items.size()) {
            throw new IllegalStateException("Invalid video clip index");
        }
        tp tpVar2 = this.f140213n;
        if (tpVar2 != null) {
            vn0 mediaList = tpVar2.getMediaList();
            int i14 = this.f140215p;
            Intrinsics.checkNotNullParameter(mediaList, "mediaList");
            List items2 = mediaList.getItems();
            if (i14 >= 0 && i14 < items2.size()) {
                ArrayList H0 = CollectionsKt.H0(items2);
                bo0 bo0Var = (bo0) H0.get(i14);
                H0.set(i14, bo0.a(bo0Var, null, (long) ((bo0Var.getVideoItem() != null ? r4.f39242e : 0L) * f13), 0L, null, null, 0.0f, RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_NON_CREATOR_ANALYTICS_MODULE));
                mediaList = pp2.a.K0(H0);
            }
            this.f140213n = tp.e(tpVar2, null, null, mediaList, null, null, null, null, null, null, null, null, null, 4091);
        }
        G3();
    }

    public final void z3() {
        tp tpVar = this.f140214o;
        if (tpVar == null) {
            return;
        }
        ln0 ln0Var = this.f140212m;
        if (ln0Var != null) {
            ((l) this.f140208i).W(ln0.a(ln0Var, null, tpVar, null, null, null, null, false, null, null, null, null, 16379));
        }
        ((j) ((vv0.c) getView())).P7();
    }
}
