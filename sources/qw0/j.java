package qw0;

import a.cb;
import a.g0;
import a7.a0;
import a7.i0;
import a7.l0;
import a7.v0;
import a7.z;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.ui.AspectRatioFrameLayout;
import androidx.recyclerview.widget.b2;
import com.google.android.material.appbar.AppBarLayout;
import com.pinterest.api.model.d30;
import com.pinterest.api.model.k01;
import com.pinterest.api.model.pu;
import com.pinterest.api.model.yb;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.ideaPinCreation.closeup.view.r0;
import com.pinterest.feature.pin.creation.view.PinPreviewView;
import com.pinterest.feature.video.view.IdeaPinVideoExportLoadingView;
import com.pinterest.framework.screens.s;
import com.pinterest.gestalt.tabs.GestaltTabLayout;
import com.pinterest.kit.view.ImageCropperLayout;
import com.pinterest.screens.p2;
import com.pinterest.video.view.SimplePlayerView;
import h32.d4;
import h32.f1;
import h32.u0;
import i32.y0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jk2.w0;
import k22.m;
import kotlin.Unit;
import kotlin.collections.f0;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;
import lh0.e2;
import m60.x0;
import oy.b0;
import pk.v2;
import pw0.c0;
import pw0.d0;
import pw0.e0;
import pw0.l;
import pw0.n;
import pw0.o;
import pw0.r;
import pw0.w;
import pw0.x;
import pw0.y;
import so.oa;
import sw0.h0;
import sw0.j0;
import sw0.m0;
import wk1.q;
import yk1.v;

/* loaded from: classes5.dex */
public final class j extends q implements d0, y, r, w, o, y92.e, pw0.i, lg1.e {

    /* renamed from: a, reason: collision with root package name */
    public final x f105279a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f105280b;

    /* renamed from: c, reason: collision with root package name */
    public final int f105281c;

    /* renamed from: d, reason: collision with root package name */
    public String f105282d;

    /* renamed from: e, reason: collision with root package name */
    public final v f105283e;

    /* renamed from: f, reason: collision with root package name */
    public final m f105284f;

    /* renamed from: g, reason: collision with root package name */
    public final pu f105285g;

    /* renamed from: h, reason: collision with root package name */
    public final sw0.y f105286h;

    /* renamed from: i, reason: collision with root package name */
    public final tb0.h f105287i;

    /* renamed from: j, reason: collision with root package name */
    public final de0.d f105288j;

    /* renamed from: k, reason: collision with root package name */
    public final e2 f105289k;

    /* renamed from: l, reason: collision with root package name */
    public final b60.b f105290l;

    /* renamed from: m, reason: collision with root package name */
    public final m60.w f105291m;

    /* renamed from: n, reason: collision with root package name */
    public int f105292n;

    /* renamed from: o, reason: collision with root package name */
    public int f105293o;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f105294p;

    /* renamed from: q, reason: collision with root package name */
    public final ArrayList f105295q;

    /* renamed from: r, reason: collision with root package name */
    public final List f105296r;

    /* renamed from: s, reason: collision with root package name */
    public n f105297s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f105298t;

    /* renamed from: u, reason: collision with root package name */
    public final lg1.h f105299u;

    /* renamed from: v, reason: collision with root package name */
    public final xk2.v f105300v;

    /* renamed from: w, reason: collision with root package name */
    public final e f105301w;

    /* renamed from: x, reason: collision with root package name */
    public final c0 f105302x;

    /* renamed from: y, reason: collision with root package name */
    public c f105303y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(x type, m0 presenterPinalytics, uj2.q networkStateStream, boolean z13, int i13, String directoryPath, Context context, yk1.a viewResources, m userService, de0.d draftDataProvider, e2 experiments, b60.b activeUserManager, m60.w eventManager) {
        super(presenterPinalytics, networkStateStream);
        yb cameraItem = new yb();
        xk2.v vVar = sw0.y.f115589f;
        sw0.y mediaUtil = vt1.a.u();
        HashSet hashSet = tb0.h.f117076w;
        tb0.h crashReporter = tb0.g.f117075a;
        Intrinsics.checkNotNullExpressionValue(crashReporter, "getInstance(...)");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(directoryPath, "directoryPath");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        Intrinsics.checkNotNullParameter(userService, "userService");
        Intrinsics.checkNotNullParameter(cameraItem, "cameraItem");
        Intrinsics.checkNotNullParameter(mediaUtil, "mediaUtil");
        Intrinsics.checkNotNullParameter(crashReporter, "crashReporter");
        Intrinsics.checkNotNullParameter(draftDataProvider, "draftDataProvider");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        this.f105279a = type;
        this.f105280b = z13;
        this.f105281c = i13;
        this.f105282d = directoryPath;
        this.f105283e = viewResources;
        this.f105284f = userService;
        this.f105285g = cameraItem;
        this.f105286h = mediaUtil;
        this.f105287i = crashReporter;
        this.f105288j = draftDataProvider;
        this.f105289k = experiments;
        this.f105290l = activeUserManager;
        this.f105291m = eventManager;
        this.f105293o = -1;
        this.f105294p = new ArrayList();
        this.f105295q = new ArrayList();
        l lVar = k.f105306c;
        int i14 = lVar.f101520a;
        n type2 = lVar.f101522c;
        Intrinsics.checkNotNullParameter(type2, "type");
        int i15 = 1;
        this.f105296r = f0.j(new l(i14, lVar.f101521b, type2, true), k.f105304a, k.f105305b);
        this.f105297s = (!F3() || type == x.IdeaPinImageSticker) ? type == x.IdeaPinImageSticker ? n.Photos : n.All : n.Videos;
        this.f105300v = xk2.m.b(new f(this, 0));
        this.f105301w = new e(this);
        this.f105302x = new c0(new WeakReference(context), getPinalytics(), mediaUtil, type, new f(this, i15), new f(this, 2), z13, z3(), new g(this, 3), new g(this, 4), new g(this, 5), this, this, this);
        if (!F3() || hf0.b.q()) {
            return;
        }
        this.f105299u = new lg1.h(getPinalytics(), crashReporter, new Handler(Looper.getMainLooper()), this);
    }

    public static void N3(int i13, int i14, ArrayList arrayList) {
        if (i13 < 0 || i13 >= arrayList.size() || i14 < 0 || i14 >= arrayList.size()) {
            return;
        }
        Object obj = arrayList.get(i13);
        arrayList.set(i13, arrayList.get(i14));
        arrayList.set(i14, obj);
    }

    public final void B3() {
        ArrayList mediaItems = this.f105294p;
        ArrayList arrayList = new ArrayList();
        Iterator it = mediaItems.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (true ^ ((pu) next).a()) {
                arrayList.add(next);
            }
        }
        if (!arrayList.isEmpty()) {
            if (F3()) {
                new b0(d4.STORY_PIN_MULTI_PHOTO_PICKER, null, s92.o.ERROR, "Media Missing", 2).i();
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                w3((pu) it2.next());
            }
            ((j0) ((e0) getView())).a9(ct1.e.media_gallery_validation_error_missing_media);
            return;
        }
        int i13 = 22;
        int i14 = 5;
        int i15 = 4;
        if (F3()) {
            e0 e0Var = (e0) getView();
            lg1.h hVar = this.f105299u;
            Map exportedVideos = hVar != null ? hVar.f83267e : null;
            if (exportedVideos == null) {
                exportedVideos = z0.d();
            }
            j0 j0Var = (j0) e0Var;
            j0Var.getClass();
            Intrinsics.checkNotNullParameter(mediaItems, "selectedMediaItems");
            Intrinsics.checkNotNullParameter(exportedVideos, "exportedVideos");
            int i16 = sw0.d0.f115425a[j0Var.j9().ordinal()];
            ck2.c cVar = ck2.i.f27923c;
            if (i16 == 4) {
                jk2.e0 M = ((dl1.l) j0Var.h9()).M(((ag1.b) j0Var.d9().get()).d());
                hk2.b bVar = new hk2.b(new gw0.a(20, new h0(mediaItems, j0Var, exportedVideos)), new gw0.a(21, new sw0.e0(j0Var, 6)), cVar);
                M.f(bVar);
                Intrinsics.checkNotNullExpressionValue(bVar, "subscribe(...)");
                j0Var.A1 = bVar;
                return;
            }
            if (i16 != 5) {
                throw new IllegalArgumentException("onStoryPinNextButtonPress called for non Story Pin media type");
            }
            jk2.e0 M2 = ((dl1.l) j0Var.h9()).M(((ag1.b) j0Var.d9().get()).d());
            hk2.b bVar2 = new hk2.b(new gw0.a(22, new h0(j0Var, mediaItems, exportedVideos)), new gw0.a(23, new sw0.e0(j0Var, 7)), cVar);
            M2.f(bVar2);
            Intrinsics.checkNotNullExpressionValue(bVar2, "subscribe(...)");
            j0Var.A1 = bVar2;
            s sVar = j0Var.f91293r;
            if (sVar == null || sVar.G() != 1) {
                j0Var.D5();
            } else {
                j0Var.M1(j0Var.U8(p2.d(), ml1.b.VERTICAL_TRANSITION.getValue(), false));
            }
            j0Var.D5();
            return;
        }
        j0 j0Var2 = (j0) ((e0) getView());
        j0Var2.getClass();
        Intrinsics.checkNotNullParameter(mediaItems, "mediaItems");
        int i17 = sw0.d0.f115425a[j0Var2.j9().ordinal()];
        int i18 = 3;
        if (i17 == 1) {
            pu puVar = (pu) mediaItems.get(0);
            if (!(puVar instanceof k01)) {
                new w0(new g0(12, j0Var2, puVar)).H(tk2.e.f118017c).A(wj2.c.a()).F(new gw0.a(24, new sw0.e0(j0Var2, i18)), new gw0.a(25, new sw0.e0(j0Var2, i15)), new cp.b0(j0Var2, i13), new gw0.a(26, new sw0.e0(j0Var2, i14)));
                return;
            }
            k01 k01Var = (k01) puVar;
            if (k01Var.f39242e > 20000) {
                Context context = kb0.a.f79058b;
                ((oa) ((j92.a) ep.b.g(j92.a.class))).E2().i(j0Var2.getString(ct1.e.creator_profile_cover_video_too_long));
                return;
            }
            if (((Number) k01Var.f39240c.f135234a).intValue() < ((Number) k01Var.f39240c.f135235b).intValue() || ((int) ((((Number) k01Var.f39240c.f135234a).floatValue() / 16.0f) * 9.0f)) != ((Number) k01Var.f39240c.f135235b).intValue()) {
                Context context2 = kb0.a.f79058b;
                ((oa) ((j92.a) ep.b.g(j92.a.class))).E2().i(j0Var2.getString(ct1.e.creator_profile_cover_video_wrong_orientation_or_aspect_ratio));
                return;
            }
            FragmentActivity requireActivity = j0Var2.requireActivity();
            Intent intent = new Intent();
            intent.putExtra("com.pinterest.EXTRA_VIDEO_PATH", puVar.e());
            Unit unit = Unit.f80348a;
            requireActivity.setResult(911, intent);
            requireActivity.finish();
            return;
        }
        if (i17 == 2) {
            pu puVar2 = (pu) mediaItems.get(0);
            FragmentActivity requireActivity2 = j0Var2.requireActivity();
            if (puVar2 instanceof d30) {
                Intent intent2 = new Intent();
                intent2.putExtra("com.pinterest.EXTRA_PHOTO_PATH", puVar2.e());
                Unit unit2 = Unit.f80348a;
                requireActivity2.setResult(975, intent2);
            }
            requireActivity2.finish();
            return;
        }
        if (i17 != 3) {
            return;
        }
        pu puVar3 = (pu) mediaItems.get(0);
        FragmentActivity requireActivity3 = j0Var2.requireActivity();
        if (puVar3 instanceof d30) {
            Intent intent3 = new Intent();
            intent3.putExtra("com.pinterest.EXTRA_PHOTO_PATH", puVar3.e());
            String i93 = j0Var2.i9("com.pinterest.EXTRA_AGGREGATED_UID");
            if (i93 == null) {
                i93 = "";
            }
            intent3.putExtra("com.pinterest.EXTRA_AGGREGATED_UID", i93);
            Unit unit3 = Unit.f80348a;
            requireActivity3.setResult(971, intent3);
        }
        requireActivity3.finish();
    }

    @Override // lg1.e
    public final void D0(boolean z13) {
    }

    @Override // y92.e
    public final void D1(int i13) {
    }

    public final boolean D3(pu item) {
        if (!item.g() || !item.a()) {
            if (item instanceof d30) {
                ((j0) ((e0) getView())).Y8(ct1.e.image_create_invalid_media);
            } else if (item instanceof k01) {
                ((j0) ((e0) getView())).Y8(ct1.e.video_create_invalid_media);
            }
            return true;
        }
        if (F3()) {
            yk1.n view = getView();
            Intrinsics.checkNotNullExpressionValue(view, "<get-view>(...)");
            j0 j0Var = (j0) ((e0) view);
            j0Var.getClass();
            Intrinsics.checkNotNullParameter(item, "item");
            int i13 = j0.H1;
            boolean o93 = j0Var.o9();
            Resources resources = j0Var.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            if (!vt1.a.v(item, o93, j0Var.f115491v1, resources, j0Var.s7())) {
                return true;
            }
        }
        return (isBound() && this.f105302x.d().contains(item)) ? false : true;
    }

    public final boolean F3() {
        x type = this.f105279a;
        Intrinsics.checkNotNullParameter(type, "type");
        return type == x.IdeaPinPageAdd || type == x.IdeaPinAddMediaClip || type == x.IdeaPinImageSticker;
    }

    public final boolean G3() {
        return this.f105280b;
    }

    @Override // wk1.q, yk1.p
    /* renamed from: H3, reason: merged with bridge method [inline-methods] */
    public final void r3(e0 view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((sq0.c0) view);
        this.f105291m.h(this.f105301w);
        String directoryPath = this.f105282d;
        j0 j0Var = (j0) view;
        Intrinsics.checkNotNullParameter(directoryPath, "directoryPath");
        if (j0Var.n9()) {
            lb0.r rVar = j0Var.N0;
            if (rVar == null) {
                Intrinsics.r("prefsManagerUser");
                throw null;
            }
            rVar.b("PREF_STORY_PIN_MEDIA_GALLERY_DIR", directoryPath);
        }
        Intrinsics.checkNotNullParameter(this, "listener");
        j0Var.f115493x1 = this;
        Intrinsics.checkNotNullParameter(this, "listener");
        j0Var.f115492w1 = this;
        Intrinsics.checkNotNullParameter(this, "listener");
        j0Var.f115494y1.f20370b = this;
        int length = this.f105282d.length();
        v vVar = this.f105283e;
        j0Var.s9(length == 0 ? ((yk1.a) vVar).f139224a.getString(dt1.d.all_photos) : this.f105286h.b(vVar, this.f105282d));
        boolean z13 = F3() && this.f105279a != x.IdeaPinImageSticker;
        View view2 = j0Var.f115473d1;
        if (view2 == null) {
            Intrinsics.r("thumbnailTrayContainer");
            throw null;
        }
        bs1.c.R1(view2, z13);
        j0Var.x9(this.f105295q);
        List<l> tabs = this.f105296r;
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        for (l lVar : tabs) {
            GestaltTabLayout gestaltTabLayout = j0Var.f115476g1;
            if (gestaltTabLayout == null) {
                Intrinsics.r("tabLayout");
                throw null;
            }
            String string = gestaltTabLayout.getResources().getString(lVar.f101521b);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            gestaltTabLayout.e(kh2.b0.U(gestaltTabLayout, string, lVar.f101520a, 8), false);
        }
        GestaltTabLayout gestaltTabLayout2 = j0Var.f115476g1;
        if (gestaltTabLayout2 == null) {
            Intrinsics.r("tabLayout");
            throw null;
        }
        lb0.r rVar2 = j0Var.N0;
        if (rVar2 == null) {
            Intrinsics.r("prefsManagerUser");
            throw null;
        }
        ek.e n13 = gestaltTabLayout2.n(rVar2.g("PREF_STORY_PIN_MEDIA_GALLERY_TAB", 0));
        if (n13 != null) {
            GestaltTabLayout gestaltTabLayout3 = j0Var.f115476g1;
            if (gestaltTabLayout3 == null) {
                Intrinsics.r("tabLayout");
                throw null;
            }
            gestaltTabLayout3.u(n13, true);
        }
        v3();
        if (F3()) {
            j0Var.W8();
            Intrinsics.checkNotNullParameter(this, "listener");
            IdeaPinVideoExportLoadingView ideaPinVideoExportLoadingView = j0Var.f115471b1;
            if (ideaPinVideoExportLoadingView == null) {
                Intrinsics.r("videoExportLoadingView");
                throw null;
            }
            ideaPinVideoExportLoadingView.L(this);
        }
    }

    public final void I3(pu mediaItem) {
        Intrinsics.checkNotNullParameter(mediaItem, "mediaItem");
        if (D3(mediaItem)) {
            return;
        }
        pu M3 = M3(mediaItem);
        Unit unit = null;
        if (M3 != null) {
            d30 media = (d30) M3;
            j0 j0Var = (j0) ((e0) getView());
            j0Var.getClass();
            Intrinsics.checkNotNullParameter(media, "media");
            AppBarLayout appBarLayout = j0Var.Z0;
            if (appBarLayout == null) {
                Intrinsics.r("previewBarLayout");
                throw null;
            }
            appBarLayout.m(true, true);
            j0Var.w9();
            j0Var.r9(true);
            SimplePlayerView simplePlayerView = j0Var.f115477h1;
            if (simplePlayerView == null) {
                Intrinsics.r("videoPreview");
                throw null;
            }
            bs1.c.b1(simplePlayerView);
            SimplePlayerView simplePlayerView2 = j0Var.f115477h1;
            if (simplePlayerView2 == null) {
                Intrinsics.r("videoPreview");
                throw null;
            }
            v0 v0Var = simplePlayerView2.f18946k;
            if (v0Var != null) {
                v0Var.stop();
            }
            ImageCropperLayout imageCropperLayout = j0Var.X0;
            if (imageCropperLayout == null) {
                Intrinsics.r("previewViewCropper");
                throw null;
            }
            bs1.c.U1(imageCropperLayout);
            PinPreviewView pinPreviewView = j0Var.W0;
            if (pinPreviewView == null) {
                Intrinsics.r("previewView");
                throw null;
            }
            pinPreviewView.j(media);
            ImageCropperLayout imageCropperLayout2 = j0Var.X0;
            if (imageCropperLayout2 == null) {
                Intrinsics.r("previewViewCropper");
                throw null;
            }
            imageCropperLayout2.l(j0Var.j9() == x.ProfileCover);
            unit = Unit.f80348a;
        }
        if (unit == null && u3()) {
            return;
        }
        int indexOf = this.f105302x.d().indexOf(mediaItem);
        Q3(indexOf, mediaItem);
        this.f105292n = indexOf;
        nx.d0 pinalytics = getPinalytics();
        u0 u0Var = u0.SELECT_PHOTO_CELL;
        HashMap o13 = ep.b.o("is_video", "false");
        Unit unit2 = Unit.f80348a;
        pinalytics.Z(u0Var, o13);
        x xVar = x.IdeaPinImageSticker;
        if (this.f105279a == xVar) {
            j0 j0Var2 = (j0) ((e0) getView());
            j0Var2.getClass();
            Intrinsics.checkNotNullParameter(mediaItem, "mediaItem");
            if (j0Var2.j9() != xVar) {
                throw new IllegalArgumentException("onIdeaPinImageStickerPhotoSelected called for wrong media type");
            }
            if (mediaItem instanceof d30) {
                jk2.e0 M = ((dl1.l) j0Var2.h9()).M(((ag1.b) j0Var2.d9().get()).d());
                hk2.b bVar = new hk2.b(new gw0.a(16, new r0(26, j0Var2, mediaItem)), new gw0.a(17, new sw0.e0(j0Var2, 2)), ck2.i.f27923c);
                M.f(bVar);
                Intrinsics.checkNotNullExpressionValue(bVar, "subscribe(...)");
                j0Var2.A1 = bVar;
                FragmentActivity requireActivity = j0Var2.requireActivity();
                requireActivity.setResult(983);
                requireActivity.finish();
            }
        }
    }

    public final void J3() {
        this.f105298t = true;
        loadData();
    }

    public final void K3() {
        yb0.n a13;
        if (isBound()) {
            j0 j0Var = (j0) ((e0) getView());
            j0Var.getClass();
            int i13 = yb0.n.f138503p;
            Context requireContext = j0Var.requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
            String string = j0Var.getString(ct1.e.remove_cover_alert_title);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            String string2 = j0Var.getString(ct1.e.remove_cover_alert_subtitle);
            String string3 = j0Var.getString(x0.delete_confirm);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            String string4 = j0Var.getString(x0.cancel);
            Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
            a13 = xa0.j.a(requireContext, string, string2, string3, (r20 & 16) != 0 ? "" : string4, (r20 & 32) != 0 ? yb0.k.f138491j : new sw0.f0(j0Var, 5), (r20 & 64) != 0 ? yb0.k.f138492k : sw0.k.f115509v, (r20 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? yb0.k.f138493l : null, (r20 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? yb0.l.f138495j : null);
            cb.x(a13, j0Var.f7());
        }
    }

    public final void L3(pu mediaItem) {
        a7.b0 b0Var;
        a7.d0 d0Var;
        Intrinsics.checkNotNullParameter(mediaItem, "mediaItem");
        if (D3(mediaItem)) {
            return;
        }
        pu M3 = M3(mediaItem);
        Unit unit = null;
        if (M3 != null) {
            k01 media = (k01) M3;
            j0 j0Var = (j0) ((e0) getView());
            j0Var.getClass();
            Intrinsics.checkNotNullParameter(media, "media");
            AppBarLayout appBarLayout = j0Var.Z0;
            if (appBarLayout == null) {
                Intrinsics.r("previewBarLayout");
                throw null;
            }
            boolean z13 = true;
            appBarLayout.m(true, true);
            j0Var.w9();
            j0Var.r9(true);
            if (!j0Var.o9()) {
                ImageCropperLayout imageCropperLayout = j0Var.X0;
                if (imageCropperLayout == null) {
                    Intrinsics.r("previewViewCropper");
                    throw null;
                }
                bs1.c.X0(imageCropperLayout);
                SimplePlayerView simplePlayerView = j0Var.f115477h1;
                if (simplePlayerView == null) {
                    Intrinsics.r("videoPreview");
                    throw null;
                }
                float intValue = ((Number) media.f39240c.f135234a).intValue() / ((Number) media.f39240c.f135235b).floatValue();
                AspectRatioFrameLayout aspectRatioFrameLayout = simplePlayerView.E;
                if (aspectRatioFrameLayout.f18871b != intValue) {
                    aspectRatioFrameLayout.f18871b = intValue;
                    aspectRatioFrameLayout.requestLayout();
                }
                SimplePlayerView simplePlayerView2 = j0Var.f115477h1;
                if (simplePlayerView2 == null) {
                    Intrinsics.r("videoPreview");
                    throw null;
                }
                v0 v0Var = simplePlayerView2.f18946k;
                if (v0Var != null) {
                    i0[] i0VarArr = new i0[1];
                    int i13 = i0.f1071g;
                    a7.w wVar = new a7.w();
                    z zVar = new z();
                    List emptyList = Collections.emptyList();
                    v2 v2Var = v2.f100502e;
                    a7.b0 b0Var2 = new a7.b0();
                    a7.e0 e0Var = a7.e0.f982d;
                    if (zVar.f1244b != null && zVar.f1243a == null) {
                        z13 = false;
                    }
                    bf.b.t(z13);
                    Uri uri = media.f41101b;
                    if (uri != null) {
                        a0 a0Var = zVar.f1243a != null ? new a0(zVar) : null;
                        b0Var = b0Var2;
                        d0Var = new a7.d0(uri, null, a0Var, emptyList, null, v2Var, null, -9223372036854775807L);
                    } else {
                        b0Var = b0Var2;
                        d0Var = null;
                    }
                    i0 i0Var = new i0("", new a7.y(wVar), d0Var, new a7.c0(b0Var), l0.I, e0Var);
                    Intrinsics.checkNotNullExpressionValue(i0Var, "fromUri(...)");
                    i0VarArr[0] = i0Var;
                    ac2.m0.a(v0Var, i0VarArr);
                }
                SimplePlayerView simplePlayerView3 = j0Var.f115477h1;
                if (simplePlayerView3 == null) {
                    Intrinsics.r("videoPreview");
                    throw null;
                }
                bs1.c.U1(simplePlayerView3);
                SimplePlayerView simplePlayerView4 = j0Var.f115477h1;
                if (simplePlayerView4 == null) {
                    Intrinsics.r("videoPreview");
                    throw null;
                }
                j0Var.p9(simplePlayerView4);
            }
            unit = Unit.f80348a;
        }
        if (unit == null && u3()) {
            return;
        }
        int indexOf = this.f105302x.d().indexOf(mediaItem);
        Q3(indexOf, mediaItem);
        this.f105292n = indexOf;
        nx.d0 pinalytics = getPinalytics();
        u0 u0Var = u0.SELECT_PHOTO_CELL;
        HashMap o13 = ep.b.o("is_video", "true");
        Unit unit2 = Unit.f80348a;
        pinalytics.Z(u0Var, o13);
    }

    public final pu M3(pu mediaItem) {
        boolean z13 = F3() && this.f105279a != x.IdeaPinImageSticker;
        ArrayList arrayList = this.f105294p;
        if (!z13 || hf0.b.q()) {
            arrayList.clear();
            arrayList.add(mediaItem);
            return mediaItem;
        }
        if (arrayList.contains(mediaItem)) {
            w3(mediaItem);
        } else {
            if (!u3()) {
                arrayList.add(mediaItem);
                c0 c0Var = this.f105302x;
                int indexOf = c0Var.d().indexOf(mediaItem);
                if (F3()) {
                    ArrayList arrayList2 = this.f105295q;
                    arrayList2.add(new pw0.f0(indexOf, (pu) c0Var.d().get(indexOf), new h(1, this, j.class, "deselectItem", "deselectItem(Lcom/pinterest/api/model/MediaItem;)V", 0)));
                    ((j0) ((e0) getView())).x9(arrayList2);
                    if (arrayList2.size() == 2) {
                        j0 j0Var = (j0) ((e0) getView());
                        rg0.s sVar = j0Var.H0;
                        if (sVar == null) {
                            Intrinsics.r("experiences");
                            throw null;
                        }
                        rg0.n b13 = ((dh0.d) sVar).b(y0.ANDROID_IDEA_PIN_CREATION_ASSET_PICKER);
                        if (b13 != null) {
                            if (b13.f108060b == i32.l.ANDROID_IDEA_PIN_MULTIPAGE_DEPRECATION_EDU.getValue()) {
                                y0 y0Var = b13.f108067i;
                                j0Var.B1 = y0Var != null ? ur0.g.g(y0Var, j0Var, null) : null;
                            }
                        }
                    }
                }
                lg1.h hVar = this.f105299u;
                if (hVar == null) {
                    return mediaItem;
                }
                Intrinsics.checkNotNullParameter(mediaItem, "mediaItem");
                if (!(mediaItem instanceof d30)) {
                    return mediaItem;
                }
                hVar.f83272j.add(mediaItem);
                hVar.c();
                return mediaItem;
            }
            ((j0) ((e0) getView())).a9(dt1.d.pin_assets_max);
        }
        return null;
    }

    public final void Q3(int i13, pu puVar) {
        int i14;
        c0 c0Var = this.f105302x;
        c0Var.u1(i13, puVar);
        if (F3()) {
            ArrayList arrayList = this.f105294p;
            if (!arrayList.contains(puVar) && (i14 = this.f105293o) != -1) {
                List subList = arrayList.subList(i14, arrayList.size());
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : subList) {
                    if (c0Var.d().contains((pu) obj)) {
                        arrayList2.add(obj);
                    }
                }
                ArrayList arrayList3 = new ArrayList(kotlin.collections.g0.q(arrayList2, 10));
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList3.add(Integer.valueOf(c0Var.d().indexOf((pu) it.next())));
                }
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    int intValue = ((Number) it2.next()).intValue();
                    c0Var.u1(intValue, c0Var.d().get(intValue));
                }
                return;
            }
        }
        int i15 = this.f105292n;
        if (i15 == i13 || i15 < z3().size() || i15 >= c0Var.d().size()) {
            return;
        }
        c0Var.u1(this.f105292n, c0Var.d().get(this.f105292n));
    }

    @Override // wk1.q
    public final void addDataSources(vq0.a dataSources) {
        Intrinsics.checkNotNullParameter(dataSources, "dataSources");
        ((wk1.i) dataSources).b(this.f105302x);
    }

    @Override // y92.e
    public final void c0(int i13, int i14) {
        ArrayList items = this.f105295q;
        N3(i13, i14, items);
        ArrayList arrayList = this.f105294p;
        N3(i13, i14, arrayList);
        j0 j0Var = (j0) ((e0) getView());
        j0Var.getClass();
        Intrinsics.checkNotNullParameter(items, "thumbnails");
        pw0.c cVar = (pw0.c) j0Var.f115490u1.getValue();
        cVar.getClass();
        Intrinsics.checkNotNullParameter(items, "items");
        cVar.f101498d = items;
        cVar.f101499e = Integer.valueOf(i14);
        cVar.k(i13, i14);
        cVar.i(i14);
        pu puVar = (pu) arrayList.get(i13);
        pu puVar2 = (pu) arrayList.get(i14);
        c0 c0Var = this.f105302x;
        int indexOf = c0Var.d().indexOf(puVar);
        int indexOf2 = c0Var.d().indexOf(puVar2);
        if (indexOf != -1) {
            c0Var.u1(indexOf, c0Var.d().get(indexOf));
        }
        if (indexOf2 != -1) {
            c0Var.u1(indexOf2, c0Var.d().get(indexOf2));
        }
    }

    @Override // pw0.i
    public final void i0() {
        if (isBound()) {
            IdeaPinVideoExportLoadingView ideaPinVideoExportLoadingView = ((j0) ((e0) getView())).f115471b1;
            if (ideaPinVideoExportLoadingView == null) {
                Intrinsics.r("videoExportLoadingView");
                throw null;
            }
            bs1.c.R1(ideaPinVideoExportLoadingView, false);
        }
        c cVar = this.f105303y;
        if (cVar != null) {
            new b0(d4.STORY_PIN_MULTI_PHOTO_PICKER, null, s92.o.ABORTED, null, 10).i();
            cVar.f105270e = false;
        }
        this.f105303y = null;
    }

    @Override // wk1.q
    public final void loadData() {
        if (isBound() && ((j0) ((e0) getView())).D1 != null) {
            sw0.r0.d();
        }
        if (this.f105298t) {
            super.loadData();
        }
    }

    @Override // lg1.e
    public final boolean m1() {
        return true;
    }

    @Override // y92.e
    public final void o3(int i13, int i14) {
        nx.d0 pinalytics = getPinalytics();
        f1 f1Var = f1.STORY_PIN_REORDER;
        h32.i0 i0Var = new h32.i0(d4.STORY_PIN_MULTI_PHOTO_PICKER, null, null, null, null, null);
        HashMap hashMap = new HashMap();
        hashMap.put("from_value", String.valueOf(i13));
        hashMap.put("to_value", String.valueOf(i14));
        pinalytics.U(i0Var, f1Var, null, null, hashMap, false);
    }

    @Override // wk1.q, yk1.b
    public final void onActivate() {
        p3();
        if (F3()) {
            de0.d dVar = this.f105288j;
            dVar.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            xd0.f fVar = dVar.f54556a;
            fVar.getClass();
            int i13 = 1;
            int i14 = 2;
            fk2.h hVar = new fk2.h(new xd0.b(fVar, currentTimeMillis, i13), 2);
            kotlin.jvm.internal.i0 i0Var = new kotlin.jvm.internal.i0();
            kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
            int i15 = 0;
            int i16 = 4;
            kk2.g gVar = new kk2.g(new kk2.g(new kk2.g(new kk2.m(new kk2.m(ja.j0.b(new xd0.c(fVar, ja.f0.d(0, "SELECT count(*) FROM idea_pin_drafts"), i14)), new lb0.c(8, new gd0.c(i16, h0Var, dVar)), 0), new lb0.c(9, new de0.a(dVar, i15)), 0).k(new lb0.c(10, new ra0.l0(h0Var, 25))), new k90.i(18, new ra0.l0(i0Var, 26)), 2), new k90.i(19, new de0.b(dVar, i0Var, i15)), 3), new k90.i(20, new de0.b(dVar, i0Var, i13)), 1);
            Intrinsics.checkNotNullExpressionValue(gVar, "doOnError(...)");
            xj2.c o13 = new kk2.m(hVar.c(gVar), new wv0.a(i16, new g(this, i15)), 0).r(tk2.e.f118017c).l(wj2.c.a()).o(new gw0.a(12, new g(this, i13)), new gw0.a(13, new g(this, i14)));
            Intrinsics.checkNotNullExpressionValue(o13, "subscribe(...)");
            addDisposable(o13);
        }
    }

    @Override // wk1.q, yk1.p, yk1.b
    public final void onUnbind() {
        super.onUnbind();
        this.f105291m.j(this.f105301w);
    }

    public final boolean t3() {
        lg1.h hVar = this.f105299u;
        if (hVar == null) {
            return true;
        }
        ArrayList itemList = this.f105294p;
        Intrinsics.checkNotNullParameter(itemList, "itemList");
        ArrayList arrayList = new ArrayList();
        Iterator it = itemList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof d30) {
                arrayList.add(next);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            if (!hVar.f83267e.containsKey(((d30) it2.next()).e())) {
                return false;
            }
        }
        return true;
    }

    public final boolean u3() {
        int i13 = d.f105272a[this.f105279a.ordinal()];
        int i14 = i13 != 3 ? i13 != 4 ? -1 : this.f105281c : 20;
        return i14 != -1 && this.f105294p.size() >= i14;
    }

    public final void v3() {
        if (!F3()) {
            this.f105294p.clear();
        }
        this.f105302x.clear();
        Object adapter = getAdapter();
        if (adapter != null) {
            ((b2) adapter).h();
        }
    }

    @Override // lg1.e
    public final void w(boolean z13, String error, d30 mediaItem) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(mediaItem, "mediaItem");
        if (this.f105294p.contains(mediaItem)) {
            d4 d4Var = d4.STORY_PIN_MULTI_PHOTO_PICKER;
            new b0(d4Var, null, s92.o.ERROR, error, 2).i();
            if (isBound()) {
                w3(mediaItem);
                if (isBound()) {
                    IdeaPinVideoExportLoadingView ideaPinVideoExportLoadingView = ((j0) ((e0) getView())).f115471b1;
                    if (ideaPinVideoExportLoadingView == null) {
                        Intrinsics.r("videoExportLoadingView");
                        throw null;
                    }
                    bs1.c.R1(ideaPinVideoExportLoadingView, false);
                }
                c cVar = this.f105303y;
                if (cVar != null) {
                    new b0(d4Var, null, s92.o.ABORTED, null, 10).i();
                    cVar.f105270e = false;
                }
                this.f105303y = null;
                ((j0) ((e0) getView())).Y8(z13 ? dq1.f.story_pin_creation_error_no_space_left : dq1.f.image_to_video_conversion_error);
                ((j0) ((e0) getView())).v9(true);
            }
        }
    }

    public final void w3(pu mediaItem) {
        ArrayList arrayList = this.f105294p;
        int indexOf = arrayList.indexOf(mediaItem);
        this.f105293o = indexOf;
        arrayList.remove(indexOf);
        if (F3()) {
            ArrayList arrayList2 = this.f105295q;
            arrayList2.remove(indexOf);
            ((j0) ((e0) getView())).x9(arrayList2);
        }
        if (arrayList.size() == 0) {
            ((j0) ((e0) getView())).r9(false);
        }
        c0 c0Var = this.f105302x;
        int indexOf2 = c0Var.d().indexOf(mediaItem);
        if (indexOf2 == -1) {
            ArrayList arrayList3 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (c0Var.d().contains((pu) next)) {
                    arrayList3.add(next);
                }
            }
            ArrayList arrayList4 = new ArrayList(kotlin.collections.g0.q(arrayList3, 10));
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                arrayList4.add(Integer.valueOf(c0Var.d().indexOf((pu) it2.next())));
            }
            Iterator it3 = arrayList4.iterator();
            while (it3.hasNext()) {
                int intValue = ((Number) it3.next()).intValue();
                c0Var.u1(intValue, c0Var.d().get(intValue));
            }
        } else {
            Q3(indexOf2, mediaItem);
            this.f105292n = indexOf2;
        }
        if (F3()) {
            nx.d0 pinalytics = getPinalytics();
            h32.i0 i0Var = new h32.i0(d4.STORY_PIN_MULTI_PHOTO_PICKER, null, null, null, null, null);
            f1 f1Var = f1.STORY_PIN_DELETE;
            HashMap hashMap = new HashMap();
            hashMap.put("index", String.valueOf(indexOf));
            Unit unit = Unit.f80348a;
            pinalytics.U(i0Var, f1Var, null, null, hashMap, false);
            lg1.h hVar = this.f105299u;
            if (hVar != null) {
                Intrinsics.checkNotNullParameter(mediaItem, "mediaItem");
                if (mediaItem instanceof d30) {
                    hVar.f83267e.remove(mediaItem.e());
                    LinkedHashMap linkedHashMap = hVar.f83268f;
                    lg1.b bVar = (lg1.b) linkedHashMap.get(mediaItem.e());
                    if (bVar != null) {
                        bVar.a();
                    }
                    linkedHashMap.remove(mediaItem.e());
                }
                ArrayList arrayList5 = hVar.f83272j;
                if (arrayList5.contains(mediaItem)) {
                    if (((Number) hVar.f83269g.getOrDefault(mediaItem, 0)).intValue() >= 1) {
                        hVar.b(f1.STORY_PIN_IMAGE_TO_VIDEO_CONVERSION_CANCELLED, mediaItem.e(), null);
                    }
                    arrayList5.remove(mediaItem);
                }
            }
        }
    }

    public final void x3(String path) {
        String b13;
        Intrinsics.checkNotNullParameter(path, "path");
        this.f105282d = path;
        if (isBound()) {
            e0 e0Var = (e0) getView();
            int length = this.f105282d.length();
            v vVar = this.f105283e;
            if (length == 0) {
                b13 = ((yk1.a) vVar).f139224a.getString(dt1.d.all_photos);
            } else {
                b13 = this.f105286h.b(vVar, this.f105282d);
            }
            ((j0) e0Var).s9(b13);
            e0 e0Var2 = (e0) getView();
            String directoryPath = this.f105282d;
            j0 j0Var = (j0) e0Var2;
            j0Var.getClass();
            Intrinsics.checkNotNullParameter(directoryPath, "directoryPath");
            if (j0Var.n9()) {
                lb0.r rVar = j0Var.N0;
                if (rVar == null) {
                    Intrinsics.r("prefsManagerUser");
                    throw null;
                }
                rVar.b("PREF_STORY_PIN_MEDIA_GALLERY_DIR", directoryPath);
            }
            v3();
            loadData();
        }
    }

    public final ArrayList z3() {
        int i13 = d.f105272a[this.f105279a.ordinal()];
        return (i13 == 1 || i13 == 2) ? f0.d(this.f105285g) : new ArrayList();
    }
}
