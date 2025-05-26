package androidx.appcompat.widget;

import a.jg;
import ads_mobile_sdk.ci1$$ExternalSyntheticThrowCCEIfNotNull0;
import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.camera.core.ImageCaptureException;
import androidx.constraintlayout.motion.widget.MotionLayout;
import com.pinterest.activity.sendapin.model.SendableObject;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.dl0;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.wy0;
import com.pinterest.api.model.y40;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.w3;
import lh0.z3;

/* loaded from: classes2.dex */
public final class c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16530a;

    /* renamed from: b, reason: collision with root package name */
    public Object f16531b;

    /* renamed from: c, reason: collision with root package name */
    public Object f16532c;

    /* renamed from: d, reason: collision with root package name */
    public Object f16533d;

    /* renamed from: e, reason: collision with root package name */
    public Object f16534e;

    /* renamed from: f, reason: collision with root package name */
    public Object f16535f;

    /* renamed from: g, reason: collision with root package name */
    public Object f16536g;

    public c2(x72.j sceneView, com.pinterest.shuffles.scene.composer.x0 adapter, t62.b rendererUtility, n72.m shuffleCoreLogger, y90.y onEvent) {
        this.f16530a = 13;
        Intrinsics.checkNotNullParameter(sceneView, "sceneView");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(rendererUtility, "rendererUtility");
        Intrinsics.checkNotNullParameter(shuffleCoreLogger, "shuffleCoreLogger");
        Intrinsics.checkNotNullParameter(onEvent, "onEvent");
        this.f16531b = sceneView;
        this.f16532c = adapter;
        this.f16533d = rendererUtility;
        this.f16534e = shuffleCoreLogger;
        this.f16535f = onEvent;
        m62.b0 b0Var = new m62.b0(sceneView);
        n62.l lVar = new n62.l(this);
        Intrinsics.checkNotNullParameter(lVar, "<set-?>");
        b0Var.f85958b = lVar;
        this.f16536g = b0Var;
        ((x72.j) this.f16531b).b();
        ((x72.j) this.f16531b).k().setOnTouchListener((m62.b0) this.f16536g);
        x72.j jVar = (x72.j) this.f16531b;
        t62.b bVar = (t62.b) this.f16533d;
        s12.a callback = new s12.a(this, 20);
        ((g62.d) bVar).getClass();
        Intrinsics.checkNotNullParameter(callback, "callback");
        jVar.g(new uv.d(callback, 5));
    }

    public static boolean A(fd1.z0 viewOptions, fd1.f1 upsellTypesOptions) {
        Intrinsics.checkNotNullParameter(viewOptions, "viewOptions");
        Intrinsics.checkNotNullParameter(upsellTypesOptions, "upsellTypesOptions");
        return viewOptions == fd1.z0.APP_LIST_AND_CONTACT_SUGGESTIONS_FOR_UPSELL && upsellTypesOptions.isDownloadOrScreenshot();
    }

    public static fd1.b0 h(c2 c2Var, dl1.s model, int i13, p32.c cVar, fd1.f1 f1Var, i91.b bVar, Uri uri, int i14) {
        c2 c2Var2;
        boolean z13;
        int i15;
        p32.c cVar2 = (i14 & 4) != 0 ? p32.c.MESSAGE : cVar;
        fd1.f1 upsellTypes = (i14 & 8) != 0 ? fd1.f1.NONE : f1Var;
        i91.b boardPreviewState = (i14 & 16) != 0 ? i91.b.f71797d : bVar;
        Uri uri2 = (i14 & 32) != 0 ? null : uri;
        c2Var.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(boardPreviewState, "boardPreviewState");
        Intrinsics.checkNotNullParameter(upsellTypes, "upsellTypes");
        ArrayList arrayList = new ArrayList();
        if (model instanceof v7) {
            if (upsellTypes == fd1.f1.SCREENSHOT) {
                arrayList.add(new i91.c((v7) model));
            } else {
                if (boardPreviewState.f71798a) {
                    w3 a13 = w3.f83498b.a();
                    z3 z3Var = a4.f83298b;
                    lh0.g1 g1Var = (lh0.g1) a13.f83501a;
                    if (g1Var.o("sg_android_link_preview_first_sharesheet", "enabled", z3Var) || g1Var.l("sg_android_link_preview_first_sharesheet")) {
                        v7 v7Var = (v7) model;
                        arrayList.add(new i91.a(0, v7Var));
                        arrayList.add(new i91.d(v7Var, boardPreviewState, 1));
                    }
                }
                if (boardPreviewState.f71798a) {
                    arrayList.add(new i91.d((v7) model, boardPreviewState, 0));
                    i15 = 1;
                } else {
                    i15 = 0;
                }
                arrayList.add(new i91.a(i15, (v7) model));
            }
        } else if (model instanceof f30) {
            if (upsellTypes == fd1.f1.DOWNLOAD) {
                arrayList.add(new i91.y((f30) model, w3.f83498b.a().a("enabled_mini_preview", z3.DO_NOT_ACTIVATE_EXPERIMENT)));
            } else if (upsellTypes == fd1.f1.SCREENSHOT) {
                arrayList.add(new i91.y((f30) model, w3.f83498b.a().b("enabled_mini_preview", z3.DO_NOT_ACTIVATE_EXPERIMENT)));
            } else {
                arrayList.add(new i91.w((f30) model));
            }
        } else if (model instanceof y40) {
            arrayList.add(new i91.x(uri2, (y40) model));
        } else {
            vb0.j.f125466a.F("Tried to get ShareConfig for unsupported type: ".concat(model.getClass().getName()), tb0.p.SHARING, new Object[0]);
        }
        SendableObject sendableObject = new SendableObject(model);
        if (upsellTypes == fd1.f1.SCREENSHOT || upsellTypes == fd1.f1.DOWNLOAD) {
            c2Var2 = c2Var;
            z13 = true;
        } else {
            c2Var2 = c2Var;
            z13 = false;
        }
        return new fd1.b0(arrayList, sendableObject, i13, cVar2, z13, upsellTypes, boardPreviewState, (e82.h0) c2Var2.f16535f);
    }

    public static void j(c2 c2Var, f30 pin, f30 newPin, nx.d0 pinalytics) {
        c2Var.getClass();
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(newPin, "newPin");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        v7 D3 = newPin.D3();
        if (D3 != null) {
            i92.k kVar = (i92.k) c2Var.f16532c;
            String uid = pin.getUid();
            Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
            String uid2 = D3.getUid();
            String j13 = D3.j1();
            Intrinsics.checkNotNullExpressionValue(j13, "getName(...)");
            String p03 = bs1.c.p0(pin);
            m60.w wVar = (m60.w) c2Var.f16531b;
            j11.d dVar = new j11.d(c2Var.g(pinalytics, true, j11.a.REPIN), wVar, (g70.h) c2Var.f16536g, uid, uid2, j13, p03, ((b60.d) ((b60.b) c2Var.f16534e)).g(), false, true);
            String savedPinId = newPin.getUid();
            Intrinsics.checkNotNullExpressionValue(savedPinId, "getUid(...)");
            boolean Q0 = b40.Q0(newPin);
            Intrinsics.checkNotNullParameter(savedPinId, "savedPinId");
            dVar.f74398n = savedPinId;
            dVar.f74399o = Q0;
            dVar.d(h32.f1.RENDER, null);
            kVar.c(dVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void B(m62.s model) {
        int i13;
        Unit unit = null;
        final int i14 = 1;
        switch (this.f16530a) {
            case 12:
                Intrinsics.checkNotNullParameter(model, "model");
                y90.r1 r1Var = (y90.r1) this.f16533d;
                final y90.c cVar = r1Var.f138234a;
                r72.l2 l2Var = model.f86055k;
                final int i15 = 0;
                if (l2Var != null) {
                    int visibility = cVar.f138137b.getVisibility();
                    EditText editText = cVar.f138136a;
                    if (visibility != 0) {
                        kotlin.jvm.internal.j.z((ao2.j0) this.f16531b, null, null, new n62.j(this, l2Var, cVar, null), 3);
                        String text = l2Var.f106540a;
                        Intrinsics.checkNotNullParameter(text, "text");
                        editText.setText(text);
                        editText.setSelection(text.length());
                        EditText editText2 = cVar.f138137b;
                        editText2.setVisibility(0);
                        editText2.post(new Runnable() { // from class: n62.h
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i16 = i15;
                                s62.b this_run = cVar;
                                switch (i16) {
                                    case 0:
                                        Intrinsics.checkNotNullParameter(this_run, "$this_run");
                                        y90.c cVar2 = (y90.c) this_run;
                                        cVar2.f138136a.requestFocus();
                                        EditText editText3 = cVar2.f138137b;
                                        Intrinsics.checkNotNullParameter(editText3, "<this>");
                                        Object systemService = editText3.getContext().getSystemService("input_method");
                                        Intrinsics.g(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                                        ((InputMethodManager) systemService).showSoftInput(editText3, 1);
                                        break;
                                    default:
                                        Intrinsics.checkNotNullParameter(this_run, "$this_run");
                                        y90.c cVar3 = (y90.c) this_run;
                                        EditText editText4 = cVar3.f138137b;
                                        Intrinsics.checkNotNullParameter(editText4, "<this>");
                                        Object systemService2 = editText4.getContext().getSystemService("input_method");
                                        Intrinsics.g(systemService2, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                                        ((InputMethodManager) systemService2).hideSoftInputFromWindow(editText4.getWindowToken(), 0);
                                        cVar3.f138136a.clearFocus();
                                        break;
                                }
                            }
                        });
                    }
                    editText.setTextColor(Color.parseColor(l2Var.f106541b));
                    editText.setTypeface(((n72.b) this.f16532c).a(l2Var.f106544e));
                    editText.setTextSize(l2Var.f106543d);
                    int i16 = n62.i.f89367a[l2Var.f106545f.ordinal()];
                    if (i16 != 1) {
                        i13 = 17;
                        if (i16 != 2 && i16 == 3) {
                            i13 = 8388613;
                        }
                    } else {
                        i13 = 8388611;
                    }
                    editText.setGravity(i13);
                    unit = Unit.f80348a;
                }
                if (unit == null && cVar.f138137b.getVisibility() == 0) {
                    Intrinsics.checkNotNullParameter("", "text");
                    cVar.f138136a.setText("");
                    EditText editText3 = cVar.f138137b;
                    editText3.setVisibility(8);
                    editText3.post(new Runnable() { // from class: n62.h
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i162 = i14;
                            s62.b this_run = cVar;
                            switch (i162) {
                                case 0:
                                    Intrinsics.checkNotNullParameter(this_run, "$this_run");
                                    y90.c cVar2 = (y90.c) this_run;
                                    cVar2.f138136a.requestFocus();
                                    EditText editText32 = cVar2.f138137b;
                                    Intrinsics.checkNotNullParameter(editText32, "<this>");
                                    Object systemService = editText32.getContext().getSystemService("input_method");
                                    Intrinsics.g(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                                    ((InputMethodManager) systemService).showSoftInput(editText32, 1);
                                    break;
                                default:
                                    Intrinsics.checkNotNullParameter(this_run, "$this_run");
                                    y90.c cVar3 = (y90.c) this_run;
                                    EditText editText4 = cVar3.f138137b;
                                    Intrinsics.checkNotNullParameter(editText4, "<this>");
                                    Object systemService2 = editText4.getContext().getSystemService("input_method");
                                    Intrinsics.g(systemService2, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                                    ((InputMethodManager) systemService2).hideSoftInputFromWindow(editText4.getWindowToken(), 0);
                                    cVar3.f138136a.clearFocus();
                                    break;
                            }
                        }
                    });
                }
                boolean z13 = model.f86053i;
                va0.o oVar = r1Var.f138235b;
                if (!z13) {
                    oVar.d(false);
                    break;
                } else {
                    oVar.d(true);
                    oVar.a(((Number) ql2.s.k(Float.valueOf(model.f86054j), (ql2.h) this.f16536g)).floatValue());
                    break;
                }
            default:
                Intrinsics.checkNotNullParameter(model, "model");
                com.pinterest.shuffles.scene.composer.x0 x0Var = (com.pinterest.shuffles.scene.composer.x0) this.f16532c;
                r72.z1 z1Var = model.f86045a;
                com.pinterest.shuffles.scene.composer.u0 scaleType = z1Var instanceof r72.u1 ? com.pinterest.shuffles.scene.composer.u0.CENTER_INSIDE : z1Var instanceof r72.y1 ? com.pinterest.shuffles.scene.composer.u0.CENTER : com.pinterest.shuffles.scene.composer.u0.CENTER;
                x0Var.getClass();
                Intrinsics.checkNotNullParameter(scaleType, "scaleType");
                if (x0Var.f52175g != scaleType) {
                    x0Var.f52175g = scaleType;
                    ke2.d dVar = (ke2.d) CollectionsKt.firstOrNull(x0Var.f52170b.getF52894a().f79314f);
                    if (dVar != null) {
                        x0Var.k(dVar);
                    }
                }
                ((com.pinterest.shuffles.scene.composer.x0) this.f16532c).i(model.f86045a);
                String str = model.f86046b;
                String colorString = kotlin.text.z.j(str) ^ true ? str : null;
                if (colorString != null) {
                    ke2.c f52894a = ((x72.j) this.f16531b).getF52894a();
                    id2.c.Companion.getClass();
                    Intrinsics.checkNotNullParameter(colorString, "colorString");
                    id2.c a13 = id2.b.a(Color.parseColor(colorString));
                    f52894a.getClass();
                    Intrinsics.checkNotNullParameter(a13, "<set-?>");
                    f52894a.f79315g = a13;
                    break;
                }
                break;
        }
    }

    public final void a(String str, String str2) {
        Map map = (Map) this.f16536g;
        if (map == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map.put(str, str2);
    }

    public final androidx.camera.core.impl.h b() {
        String str = ((androidx.camera.core.impl.z0) this.f16531b) == null ? " surface" : "";
        if (((List) this.f16532c) == null) {
            str = str.concat(" sharedSurfaces");
        }
        if (((Integer) this.f16534e) == null) {
            str = a.a.C(str, " mirrorMode");
        }
        if (((Integer) this.f16535f) == null) {
            str = a.a.C(str, " surfaceGroupId");
        }
        if (((c0.z) this.f16536g) == null) {
            str = a.a.C(str, " dynamicRange");
        }
        if (str.isEmpty()) {
            return new androidx.camera.core.impl.h((androidx.camera.core.impl.z0) this.f16531b, (List) this.f16532c, (String) this.f16533d, ((Integer) this.f16534e).intValue(), ((Integer) this.f16535f).intValue(), (c0.z) this.f16536g);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public final bl.f c() {
        bl.b bVar = (bl.b) this.f16531b;
        if (bVar == null) {
            throw new GeneralSecurityException("Elliptic curve type is not set");
        }
        if (((bl.c) this.f16532c) == null) {
            throw new GeneralSecurityException("Hash type is not set");
        }
        if (((uk.q) this.f16534e) == null) {
            throw new GeneralSecurityException("DEM parameters are not set");
        }
        if (((bl.e) this.f16535f) == null) {
            throw new GeneralSecurityException("Variant is not set");
        }
        bl.b bVar2 = bl.b.f23404e;
        if (bVar != bVar2 && ((bl.d) this.f16533d) == null) {
            throw new GeneralSecurityException("Point format is not set");
        }
        if (bVar != bVar2 || ((bl.d) this.f16533d) == null) {
            return new bl.f((bl.b) this.f16531b, (bl.c) this.f16532c, (bl.d) this.f16533d, (uk.q) this.f16534e, (bl.e) this.f16535f, (ml.a) this.f16536g);
        }
        throw new GeneralSecurityException("For Curve25519 point format must not be set");
    }

    public final fj2.a d() {
        kh2.p2.T("Instrument selector must contain selection criteria", (((fj2.b) this.f16531b) == null && ((String) this.f16532c) == null && ((String) this.f16533d) == null && ((String) this.f16534e) == null && ((String) this.f16535f) == null && ((String) this.f16536g) == null) ? false : true);
        return new fj2.a((fj2.b) this.f16531b, (String) this.f16532c, (String) this.f16533d, (String) this.f16534e, (String) this.f16535f, (String) this.f16536g);
    }

    public final lg.a e() {
        String str = ((String) this.f16531b) == null ? " transportName" : "";
        if (((lg.e) this.f16533d) == null) {
            str = str.concat(" encodedPayload");
        }
        if (((Long) this.f16534e) == null) {
            str = a.a.C(str, " eventMillis");
        }
        if (((Long) this.f16535f) == null) {
            str = a.a.C(str, " uptimeMillis");
        }
        if (((Map) this.f16536g) == null) {
            str = a.a.C(str, " autoMetadata");
        }
        if (str.isEmpty()) {
            return new lg.a((String) this.f16531b, (Integer) this.f16532c, (lg.e) this.f16533d, ((Long) this.f16534e).longValue(), ((Long) this.f16535f).longValue(), (Map) this.f16536g);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public final int f() {
        int s13;
        f0.h.s();
        com.bumptech.glide.d.v("The ImageReader is not initialized.", ((c0.c1) this.f16532c) != null);
        c0.c1 c1Var = (c0.c1) this.f16532c;
        synchronized (c1Var.f24208a) {
            s13 = c1Var.f24211d.s() - c1Var.f24209b;
        }
        return s13;
    }

    public final nx.d0 g(nx.d0 d0Var, boolean z13, j11.a aVar) {
        if (!z13) {
            return d0Var;
        }
        nx.d0 d0Var2 = new n70.o(aVar, (nx.f0) this.f16533d, 4).f122379a;
        Intrinsics.checkNotNullExpressionValue(d0Var2, "getPinalytics(...)");
        return d0Var2;
    }

    public final Typeface i(cc.d dVar) {
        sp2.i iVar = (sp2.i) this.f16531b;
        String str = dVar.f27424a;
        iVar.f114929c = str;
        String str2 = dVar.f27426c;
        iVar.f114928b = str2;
        Typeface typeface = (Typeface) ((Map) this.f16532c).get(iVar);
        if (typeface != null) {
            return typeface;
        }
        Typeface typeface2 = (Typeface) ((Map) this.f16533d).get(str);
        if (typeface2 == null) {
            ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(this.f16535f);
            ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(this.f16535f);
            typeface2 = dVar.f27427d;
            if (typeface2 == null) {
                typeface2 = Typeface.createFromAsset((AssetManager) this.f16534e, "fonts/" + str + ((String) this.f16536g));
                ((Map) this.f16533d).put(str, typeface2);
            }
        }
        boolean contains = str2.contains("Italic");
        boolean contains2 = str2.contains("Bold");
        int i13 = (contains && contains2) ? 3 : contains ? 2 : contains2 ? 1 : 0;
        if (typeface2.getStyle() != i13) {
            typeface2 = Typeface.create(typeface2, i13);
        }
        ((Map) this.f16532c).put((sp2.i) this.f16531b, typeface2);
        return typeface2;
    }

    public final void k(f30 shownPin, f30 repinnedPin, nx.d0 pinalytics) {
        String string;
        Intrinsics.checkNotNullParameter(shownPin, "shownPin");
        Intrinsics.checkNotNullParameter(repinnedPin, "repinnedPin");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Boolean H5 = shownPin.H5();
        Intrinsics.checkNotNullExpressionValue(H5, "getPinnedToProfile(...)");
        v7 G5 = H5.booleanValue() ? null : shownPin.G5() != null ? shownPin.G5() : repinnedPin.D3();
        i92.k kVar = (i92.k) this.f16532c;
        String uid = shownPin.getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
        String uid2 = repinnedPin.getUid();
        Intrinsics.checkNotNullExpressionValue(uid2, "getUid(...)");
        String uid3 = G5 != null ? G5.getUid() : null;
        if (G5 == null || (string = G5.j1()) == null) {
            string = ((yk1.a) ((yk1.v) this.f16535f)).f139224a.getString(m60.x0.profile);
        }
        String str = string;
        Intrinsics.f(str);
        j11.e eVar = new j11.e(uid, uid2, uid3, str, bs1.c.p0(repinnedPin), (m60.w) this.f16531b, g(pinalytics, true, j11.a.UNPIN), ((b60.d) ((b60.b) this.f16534e)).g(), (g70.h) this.f16536g);
        eVar.d(h32.f1.RENDER);
        kVar.c(eVar);
    }

    public final void l(c0.n0 n0Var) {
        f0.h.s();
        if (((d0.s) this.f16531b) == null) {
            kh2.m0.X0("CaptureNode", "Discarding ImageProxy which was inadvertently acquired: " + n0Var);
            n0Var.close();
            return;
        }
        if (((Integer) n0Var.H1().f().f16977a.get(((d0.s) this.f16531b).f53561h)) == null) {
            kh2.m0.X0("CaptureNode", "Discarding ImageProxy which was acquired for aborted request");
            n0Var.close();
            return;
        }
        f0.h.s();
        d0.e eVar = (d0.e) this.f16534e;
        Objects.requireNonNull(eVar);
        eVar.f53506a.accept(new d0.f((d0.s) this.f16531b, n0Var));
        d0.s sVar = (d0.s) this.f16531b;
        this.f16531b = null;
        int i13 = sVar.f53564k;
        d0.y yVar = sVar.f53560g;
        if (i13 != -1) {
            int i14 = 100;
            if (i13 != 100) {
                sVar.f53564k = 100;
                d0.u uVar = (d0.u) yVar;
                uVar.getClass();
                f0.h.s();
                if (!uVar.f53573g) {
                    d0.h hVar = uVar.f53567a;
                    hVar.getClass();
                    hVar.f53515b.execute(new v.k(hVar, i14, 2));
                }
            }
        }
        d0.u uVar2 = (d0.u) yVar;
        uVar2.getClass();
        f0.h.s();
        if (uVar2.f53573g) {
            return;
        }
        if (!uVar2.f53574h) {
            f0.h.s();
            if (!uVar2.f53573g && !uVar2.f53574h) {
                uVar2.f53574h = true;
                uVar2.f53567a.getClass();
            }
        }
        uVar2.f53571e.b(null);
    }

    public final void m(d0.s sVar) {
        f0.h.s();
        int i13 = 1;
        com.bumptech.glide.d.v("only one capture stage is supported.", sVar.f53562i.size() == 1);
        com.bumptech.glide.d.v("Too many acquire images. Close image to be able to process next.", f() > 0);
        this.f16531b = sVar;
        g0.m.a(sVar.f53563j, new c0.m1(i13, this, sVar), l3.c.s());
    }

    public final void n(v7 model, int i13, m60.w eventManager, boolean z13, int i14) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        SendableObject sendableObject = new SendableObject(model);
        sendableObject.f35129c = i14;
        eventManager.d(new jc0.v(new fd1.o0(sendableObject, i13, p32.c.GROUP_BOARD, false, false, null, false, null, z13, null, false, null, (e82.h0) this.f16535f, 7864), false, 500L, 14));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r14v0 jc0.v, still in use, count: 2, list:
          (r14v0 jc0.v) from 0x005a: MOVE (r6v0 jc0.v) = (r14v0 jc0.v)
          (r14v0 jc0.v) from 0x0035: MOVE (r6v3 jc0.v) = (r14v0 jc0.v)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:447)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    public final void o(java.lang.String r25, int r26, i91.b r27, com.pinterest.api.model.v7 r28) {
        /*
            r24 = this;
            r8 = r24
            r0 = r25
            r1 = r28
            java.lang.String r2 = "boardId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)
            java.lang.String r2 = "boardPreviewState"
            r5 = r27
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r2)
            e0.t.f56747e = r26
            java.lang.Object r2 = r8.f16532c
            r15 = r2
            m60.w r15 = (m60.w) r15
            jc0.v r14 = new jc0.v
            if (r1 == 0) goto L38
            boolean r2 = r8.z(r1)
            if (r2 == 0) goto L38
            r4 = 0
            r6 = 0
            r3 = 0
            r7 = 44
            r0 = r24
            r1 = r28
            r2 = r26
            r5 = r27
            fd1.b0 r0 = h(r0, r1, r2, r3, r4, r5, r6, r7)
            r1 = r0
            r6 = r14
            r7 = r15
            goto L63
        L38:
            fd1.o0 r1 = new fd1.o0
            com.pinterest.activity.sendapin.model.SendableObject r10 = new com.pinterest.activity.sendapin.model.SendableObject
            r2 = 1
            r10.<init>(r0, r2)
            p32.c r12 = p32.c.MESSAGE
            java.lang.Object r0 = r8.f16535f
            r22 = r0
            e82.h0 r22 = (e82.h0) r22
            r19 = 0
            r20 = 0
            r13 = 0
            r0 = 0
            r2 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r23 = 3824(0xef0, float:5.359E-42)
            r9 = r1
            r11 = r26
            r6 = r14
            r14 = r0
            r7 = r15
            r15 = r2
            r21 = r27
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
        L63:
            r2 = 0
            r3 = 0
            r5 = 30
            r0 = r6
            r0.<init>(r1, r2, r3, r5)
            r7.d(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.c2.o(java.lang.String, int, i91.b, com.pinterest.api.model.v7):void");
    }

    public final void p(int i13, dl1.s model) {
        Intrinsics.checkNotNullParameter(model, "model");
        ((m60.w) this.f16532c).d(new jc0.v(new fd1.o(new SendableObject(model), model, i13, p32.c.MESSAGE), false, 0L, 30));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r14v0 jc0.v, still in use, count: 2, list:
          (r14v0 jc0.v) from 0x007b: MOVE (r6v0 jc0.v) = (r14v0 jc0.v)
          (r14v0 jc0.v) from 0x0042: MOVE (r6v3 jc0.v) = (r14v0 jc0.v)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:447)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    public final void q(int r25, dl1.s r26) {
        /*
            r24 = this;
            r8 = r24
            r1 = r26
            java.lang.String r0 = "model"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            com.pinterest.activity.sendapin.model.SendableObject r10 = new com.pinterest.activity.sendapin.model.SendableObject
            r10.<init>(r1)
            p32.c r12 = p32.c.MESSAGE
            java.lang.Object r0 = r8.f16532c
            r15 = r0
            m60.w r15 = (m60.w) r15
            jc0.v r14 = new jc0.v
            y32.d r0 = y32.f.Companion
            r0.getClass()
            y32.f r0 = y32.d.a(r25)
            y32.f r2 = y32.f.PROFILE
            if (r0 != r2) goto L45
            boolean r0 = r1 instanceof com.pinterest.api.model.wy0
            if (r0 == 0) goto L45
            r0 = r1
            com.pinterest.api.model.wy0 r0 = (com.pinterest.api.model.wy0) r0
            java.lang.Boolean r0 = r0.J3()
            java.lang.String r2 = "getIsPrivateProfile(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L45
            fd1.o r0 = new fd1.o
            r2 = r25
            r0.<init>(r10, r1, r2, r12)
        L41:
            r1 = r0
            r6 = r14
            r7 = r15
            goto L83
        L45:
            r2 = r25
            boolean r0 = r8.z(r1)
            if (r0 == 0) goto L5f
            fd1.f1 r4 = fd1.f1.SHARE
            r5 = 0
            r6 = 0
            r7 = 48
            r0 = r24
            r1 = r26
            r2 = r25
            r3 = r12
            fd1.b0 r0 = h(r0, r1, r2, r3, r4, r5, r6, r7)
            goto L41
        L5f:
            fd1.o0 r0 = new fd1.o0
            fd1.f1 r17 = fd1.f1.SHARE
            java.lang.Object r1 = r8.f16535f
            r22 = r1
            e82.h0 r22 = (e82.h0) r22
            r20 = 0
            r21 = 0
            r13 = 0
            r1 = 0
            r3 = 0
            r16 = 0
            r18 = 0
            r19 = 0
            r23 = 7792(0x1e70, float:1.0919E-41)
            r9 = r0
            r11 = r25
            r6 = r14
            r14 = r1
            r7 = r15
            r15 = r3
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r1 = r0
        L83:
            r2 = 0
            r3 = 0
            r5 = 30
            r0 = r6
            r0.<init>(r1, r2, r3, r5)
            r7.d(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.c2.q(int, dl1.s):void");
    }

    public final void r(wy0 model, dl1.s viewedUser, int i13, boolean z13) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(viewedUser, "viewedUser");
        SendableObject sendableObject = new SendableObject(model);
        ((m60.w) this.f16532c).d(new jc0.v(z13 ? new fd1.g0(sendableObject, i13, viewedUser) : new fd1.o(sendableObject, i13, p32.c.MESSAGE, model, viewedUser), false, 0L, 30));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r14v0 jc0.v, still in use, count: 2, list:
          (r14v0 jc0.v) from 0x0050: MOVE (r6v0 jc0.v) = (r14v0 jc0.v)
          (r14v0 jc0.v) from 0x002f: MOVE (r6v3 jc0.v) = (r14v0 jc0.v)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:447)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    public final void s(java.lang.String r25, int r26, int r27, dl1.s r28) {
        /*
            r24 = this;
            r8 = r24
            r1 = r28
            e0.t.f56747e = r27
            com.pinterest.activity.sendapin.model.SendableObject r10 = new com.pinterest.activity.sendapin.model.SendableObject
            r0 = r25
            r2 = r26
            r10.<init>(r0, r2)
            java.lang.Object r0 = r8.f16532c
            r15 = r0
            m60.w r15 = (m60.w) r15
            jc0.v r14 = new jc0.v
            if (r1 == 0) goto L32
            boolean r0 = r8.z(r1)
            if (r0 == 0) goto L32
            r5 = 0
            r6 = 0
            r3 = 0
            r4 = 0
            r7 = 60
            r0 = r24
            r1 = r28
            r2 = r27
            fd1.b0 r0 = h(r0, r1, r2, r3, r4, r5, r6, r7)
            r1 = r0
            r6 = r14
            r7 = r15
            goto L58
        L32:
            fd1.o0 r0 = new fd1.o0
            p32.c r12 = p32.c.MESSAGE
            java.lang.Object r1 = r8.f16535f
            r22 = r1
            e82.h0 r22 = (e82.h0) r22
            r20 = 0
            r21 = 0
            r13 = 0
            r1 = 0
            r2 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r23 = 7920(0x1ef0, float:1.1098E-41)
            r9 = r0
            r11 = r27
            r6 = r14
            r14 = r1
            r7 = r15
            r15 = r2
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r1 = r0
        L58:
            r2 = 0
            r3 = 0
            r5 = 30
            r0 = r6
            r0.<init>(r1, r2, r3, r5)
            r7.d(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.c2.s(java.lang.String, int, int, dl1.s):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008d A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void t(dl1.s r25, int r26, fd1.f1 r27, boolean r28, m60.w r29) {
        /*
            Method dump skipped, instructions count: 237
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.c2.t(dl1.s, int, fd1.f1, boolean, m60.w):void");
    }

    public final void u(c0.n0 n0Var) {
        if (((d0.s) this.f16531b) == null) {
            kh2.m0.X0("CaptureNode", "Postview image is closed due to request completed or aborted");
            n0Var.close();
        } else {
            d0.e eVar = (d0.e) this.f16534e;
            Objects.requireNonNull(eVar);
            eVar.f53507b.accept(new d0.f((d0.s) this.f16531b, n0Var));
        }
    }

    public final void v(d0.g gVar) {
        boolean z13;
        f0.h.s();
        d0.s sVar = (d0.s) this.f16531b;
        if (sVar == null || sVar.f53554a != gVar.f53512a) {
            return;
        }
        d0.u uVar = (d0.u) sVar.f53560g;
        uVar.getClass();
        f0.h.s();
        if (uVar.f53573g) {
            return;
        }
        d0.h hVar = uVar.f53567a;
        hVar.getClass();
        f0.h.s();
        int i13 = hVar.f53514a;
        if (i13 > 0) {
            z13 = true;
            hVar.f53514a = i13 - 1;
        } else {
            z13 = false;
        }
        ImageCaptureException imageCaptureException = gVar.f53513b;
        if (!z13) {
            f0.h.s();
            hVar.getClass();
            hVar.f53515b.execute(new jg(21, hVar, imageCaptureException));
        }
        uVar.a();
        uVar.f53571e.d(imageCaptureException);
        if (z13) {
            d0.a0 a0Var = uVar.f53568b;
            a0Var.getClass();
            f0.h.s();
            kh2.m0.p("TakePictureManager", "Add a new request for retrying.");
            a0Var.f53485a.addFirst(hVar);
            a0Var.c();
        }
    }

    public final void w(String str) {
        this.f16536g = str;
    }

    public final void x(uk.q qVar) {
        if (bl.f.f23420g.contains(qVar)) {
            this.f16534e = qVar;
            return;
        }
        throw new GeneralSecurityException("Invalid DEM parameters " + qVar + "; only AES128_GCM_RAW, AES256_GCM_RAW, AES128_CTR_HMAC_SHA256_RAW, AES256_CTR_HMAC_SHA256_RAW XCHACHA20_POLY1305_RAW and AES256_SIV_RAW are currently supported.");
    }

    public final void y(ql2.g range) {
        Intrinsics.checkNotNullParameter(range, "range");
        this.f16536g = range;
        va0.o oVar = ((y90.r1) this.f16533d).f138235b;
        oVar.b(Float.valueOf(range.f104105a).floatValue());
        oVar.c(Float.valueOf(range.f104106b).floatValue());
        oVar.a(30.0f);
    }

    public final boolean z(dl1.s sVar) {
        String v13;
        boolean z13 = true;
        if (sVar instanceof v7) {
            w3 w3Var = (w3) this.f16533d;
            w3Var.getClass();
            z3 z3Var = a4.f83298b;
            lh0.g1 g1Var = (lh0.g1) w3Var.f83501a;
            if (!g1Var.o("android_preview_sharesheet", "enabled", z3Var) && !g1Var.l("android_preview_sharesheet")) {
                z13 = false;
            }
            return z13;
        }
        if (!(sVar instanceof f30)) {
            return false;
        }
        f30 f30Var = (f30) sVar;
        if (!b40.Q0(f30Var) && !b40.O0(f30Var) && f30Var.M6() == null) {
            Boolean m53 = f30Var.m5();
            Intrinsics.checkNotNullExpressionValue(m53, "getIsVideo(...)");
            if (!m53.booleanValue()) {
                dl0 v63 = f30Var.v6();
                if (((v63 == null || (v13 = v63.v()) == null) ? 0.0f : Float.parseFloat(v13)) <= 0.0f) {
                    dl0 v64 = f30Var.v6();
                    if ((v64 != null ? v64.u() : 0).intValue() <= 1) {
                        w3 w3Var2 = (w3) this.f16533d;
                        w3Var2.getClass();
                        z3 z3Var2 = a4.f83298b;
                        lh0.g1 g1Var2 = (lh0.g1) w3Var2.f83501a;
                        return g1Var2.o("sg_android_pin_preview_sharesheet", "enabled", z3Var2) || g1Var2.l("sg_android_pin_preview_sharesheet");
                    }
                }
            }
        }
        if (((i91.n) this.f16536g).b(f30Var)) {
            return false;
        }
        w3 w3Var3 = (w3) this.f16533d;
        w3Var3.getClass();
        z3 z3Var3 = a4.f83298b;
        lh0.g1 g1Var3 = (lh0.g1) w3Var3.f83501a;
        return g1Var3.o("sg_android_all_pins_preview_sharesheet", "enabled", z3Var3) || g1Var3.l("sg_android_all_pins_preview_sharesheet");
    }

    public c2(m60.w eventManager, i92.k toastUtils, nx.f0 pinalyticsFactory, b60.b activeUserManager, yk1.v viewResources, g70.h boardNavigator) {
        this.f16530a = 10;
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(toastUtils, "toastUtils");
        Intrinsics.checkNotNullParameter(pinalyticsFactory, "pinalyticsFactory");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        Intrinsics.checkNotNullParameter(boardNavigator, "boardNavigator");
        this.f16531b = eventManager;
        this.f16532c = toastUtils;
        this.f16533d = pinalyticsFactory;
        this.f16534e = activeUserManager;
        this.f16535f = viewResources;
        this.f16536g = boardNavigator;
    }

    public c2(androidx.lifecycle.u coroutineScope, n72.b fontManager, y90.r1 textEditor, x72.j sceneView, y90.y onEffectsViewEvent) {
        this.f16530a = 12;
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(fontManager, "fontManager");
        Intrinsics.checkNotNullParameter(textEditor, "textEditor");
        Intrinsics.checkNotNullParameter(sceneView, "sceneView");
        Intrinsics.checkNotNullParameter(onEffectsViewEvent, "onEffectsViewEvent");
        this.f16531b = coroutineScope;
        this.f16532c = fontManager;
        this.f16533d = textEditor;
        this.f16534e = sceneView;
        this.f16535f = onEffectsViewEvent;
        this.f16536g = new ql2.g(-1.0f, 0.0f);
        s12.a afterTextChanged = new s12.a(this, 19);
        y90.c cVar = textEditor.f138234a;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(afterTextChanged, "afterTextChanged");
        cVar.f138136a.addTextChangedListener(new y90.b(0, afterTextChanged));
        l3.c.R0(((y90.r1) this.f16533d).f138235b, new jq1.b(this, 9), null, 5);
    }

    public c2(Drawable.Callback callback) {
        this.f16530a = 5;
        this.f16531b = new sp2.i(22, (Object) null);
        this.f16532c = new HashMap();
        this.f16533d = new HashMap();
        this.f16536g = ".ttf";
        this.f16535f = null;
        if (!(callback instanceof View)) {
            jc.b.c("LottieDrawable must be inside of a view for images to work.");
            this.f16534e = null;
        } else {
            this.f16534e = ((View) callback).getContext().getAssets();
        }
    }

    public c2(MotionLayout motionLayout) {
        this.f16530a = 4;
        this.f16532c = new ArrayList();
        this.f16534e = "ViewTransitionController";
        this.f16536g = new ArrayList();
        this.f16531b = motionLayout;
    }

    public c2(i92.k toastUtils, m60.w eventManager, w3 sharesheetLibraryExperiments, lz1.c sendShareUpsellPreferences, e82.h0 socialUtils, i91.n ideaPinDownloadManager) {
        this.f16530a = 11;
        Intrinsics.checkNotNullParameter(toastUtils, "toastUtils");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(sharesheetLibraryExperiments, "sharesheetLibraryExperiments");
        Intrinsics.checkNotNullParameter(sendShareUpsellPreferences, "sendShareUpsellPreferences");
        Intrinsics.checkNotNullParameter(socialUtils, "socialUtils");
        Intrinsics.checkNotNullParameter(ideaPinDownloadManager, "ideaPinDownloadManager");
        this.f16531b = toastUtils;
        this.f16532c = eventManager;
        this.f16533d = sharesheetLibraryExperiments;
        this.f16534e = sendShareUpsellPreferences;
        this.f16535f = socialUtils;
        this.f16536g = ideaPinDownloadManager;
    }

    public c2(int i13) {
        this.f16530a = i13;
        if (i13 != 3 && i13 != 14 && i13 != 7) {
            if (i13 != 8) {
                this.f16531b = null;
                this.f16536g = null;
                return;
            }
            this.f16531b = null;
            this.f16532c = null;
            this.f16533d = null;
            this.f16534e = null;
            this.f16535f = bl.e.f23418d;
            this.f16536g = null;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c2(Context context, View view) {
        this(context, view, (Object) null);
        this.f16530a = 0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c2(Context context, View view, Object obj) {
        this(context, view, i.a.popupMenuStyle);
        this.f16530a = 0;
    }

    public c2(Context context, View view, int i13) {
        this.f16530a = 0;
        this.f16531b = context;
        this.f16533d = view;
        n.o oVar = new n.o(context);
        this.f16532c = oVar;
        oVar.f88652e = new q(this, 2);
        n.y yVar = new n.y(i13, 0, context, view, oVar, false);
        this.f16534e = yVar;
        yVar.f88719g = 0;
        yVar.f88723k = new a2(this);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c2() {
        this(8);
        this.f16530a = 8;
    }
}
