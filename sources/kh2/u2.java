package kh2;

import android.app.Application;
import android.app.job.JobInfo;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.media.MediaMetadataRetriever;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.net.TransportInfo;
import android.net.Uri;
import android.os.Build;
import android.util.Base64;
import android.util.Range;
import android.view.Surface;
import android.widget.FrameLayout;
import android.widget.RemoteViews;
import androidx.compose.foundation.BorderModifierNodeElement;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.FacebookException;
import com.pinterest.activity.create.RepinActivity;
import com.pinterest.api.model.c7;
import com.pinterest.api.model.deserializer.UserDeserializer;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.ft0;
import com.pinterest.api.model.ns;
import com.pinterest.api.model.rs;
import com.pinterest.api.model.sr;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.vh;
import com.pinterest.api.model.vz0;
import com.pinterest.api.model.wo0;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import com.pinterest.gestalt.buttonToggle.GestaltButtonToggle;
import com.pinterest.gestalt.radioGroup.GestaltRadioButton;
import com.pinterest.ui.components.users.LegoUserRep;
import h32.d4;
import i2.v3;
import i2.y3;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.SortedSet;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import lh0.a4;
import lh0.f4;
import lh0.z3;
import net.quikkly.android.ui.CameraPreview;
import s80.d7;
import s80.e4;
import s80.e7;
import s80.g4;
import s80.o3;
import s80.p3;
import s80.p7;
import s80.q3;
import s80.r3;
import s80.s3;
import s80.t3;
import s80.w3;
import s80.x3;
import so.r8;
import so.u7;
import so.wc;

/* loaded from: classes4.dex */
public abstract class u2 {

    /* renamed from: a */
    public static int f79715a = 2;

    /* renamed from: b */
    public static String f79716b;

    /* renamed from: c */
    public static String f79717c;

    /* renamed from: d */
    public static boolean f79718d;

    public static CaptureRequest A(androidx.camera.core.impl.s0 s0Var, CameraDevice cameraDevice, HashMap hashMap, boolean z13, n3.b bVar) {
        CaptureRequest.Builder createCaptureRequest;
        androidx.camera.core.impl.z zVar;
        if (cameraDevice == null) {
            return null;
        }
        List unmodifiableList = Collections.unmodifiableList(s0Var.f16967a);
        ArrayList arrayList = new ArrayList();
        Iterator it = unmodifiableList.iterator();
        while (it.hasNext()) {
            Surface surface = (Surface) hashMap.get((androidx.camera.core.impl.z0) it.next());
            if (surface == null) {
                throw new IllegalArgumentException("DeferrableSurface not in configuredSurfaceMap");
            }
            arrayList.add(surface);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        int i13 = s0Var.f16969c;
        if (i13 == 5 && (zVar = s0Var.f16974h) != null && (zVar.r() instanceof TotalCaptureResult)) {
            m0.p("Camera2CaptureRequestBuilder", "createReprocessCaptureRequest");
            createCaptureRequest = cameraDevice.createReprocessCaptureRequest((TotalCaptureResult) zVar.r());
        } else {
            m0.p("Camera2CaptureRequestBuilder", "createCaptureRequest");
            if (i13 == 5) {
                createCaptureRequest = cameraDevice.createCaptureRequest(z13 ? 1 : 2);
            } else {
                createCaptureRequest = cameraDevice.createCaptureRequest(i13);
            }
        }
        u(createCaptureRequest, i13, bVar);
        androidx.camera.core.impl.c cVar = androidx.camera.core.impl.s0.f16966k;
        Range range = androidx.camera.core.impl.k.f16892f;
        androidx.camera.core.impl.v0 v0Var = s0Var.f16968b;
        Range range2 = (Range) v0Var.j(cVar, range);
        Objects.requireNonNull(range2);
        if (!range2.equals(range)) {
            CaptureRequest.Key key = CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE;
            Range range3 = (Range) v0Var.j(cVar, range);
            Objects.requireNonNull(range3);
            createCaptureRequest.set(key, range3);
        }
        if (s0Var.b() == 1 || s0Var.c() == 1) {
            createCaptureRequest.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 0);
        } else if (s0Var.b() == 2) {
            createCaptureRequest.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 2);
        } else if (s0Var.c() == 2) {
            createCaptureRequest.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 1);
        }
        androidx.camera.core.impl.c cVar2 = androidx.camera.core.impl.s0.f16964i;
        if (v0Var.d(cVar2)) {
            createCaptureRequest.set(CaptureRequest.JPEG_ORIENTATION, (Integer) v0Var.f(cVar2));
        }
        androidx.camera.core.impl.c cVar3 = androidx.camera.core.impl.s0.f16965j;
        if (v0Var.d(cVar3)) {
            createCaptureRequest.set(CaptureRequest.JPEG_QUALITY, Byte.valueOf(((Integer) v0Var.f(cVar3)).byteValue()));
        }
        t(createCaptureRequest, v0Var);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            createCaptureRequest.addTarget((Surface) it2.next());
        }
        createCaptureRequest.setTag(s0Var.f16973g);
        return createCaptureRequest.build();
    }

    public static void A0(u91.h hVar, x10.d dVar) {
        hVar.E0 = dVar;
    }

    public static LinkedHashMap B(String... strArr) {
        if (strArr.length % 2 != 0) {
            throw new IllegalArgumentException("Odd number of key and Value");
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i13 = 0; i13 < strArr.length; i13 += 2) {
            linkedHashMap.put(strArr[i13], strArr[i13 + 1]);
        }
        return linkedHashMap;
    }

    public static void B0(fu.h hVar, nx.d0 d0Var) {
        hVar.A0 = d0Var;
    }

    public static final void C(RemoteViews richNotifInterestExpandedView, ArrayList imageBitmaps, List interestNames) {
        Intrinsics.checkNotNullParameter(richNotifInterestExpandedView, "richNotifInterestExpandedView");
        Intrinsics.checkNotNullParameter(imageBitmaps, "imageBitmaps");
        Intrinsics.checkNotNullParameter(interestNames, "interestNames");
        HashSet hashSet = tb0.h.f117076w;
        tb0.g.f117075a.h("Building Interest expanded view");
        if (Build.VERSION.SDK_INT >= 31) {
            richNotifInterestExpandedView.setBoolean(pz1.c.richNotifPinGridBackground, "setClipToOutline", true);
        }
        if (imageBitmaps.size() != 3) {
            richNotifInterestExpandedView.setViewVisibility(pz1.c.richNotifInterestGrid, 8);
            return;
        }
        boolean z13 = interestNames.size() == imageBitmaps.size();
        richNotifInterestExpandedView.setImageViewBitmap(pz1.c.richNotifImageLeft, (Bitmap) imageBitmaps.get(0));
        richNotifInterestExpandedView.setImageViewBitmap(pz1.c.richNotifImageMid, (Bitmap) imageBitmaps.get(1));
        richNotifInterestExpandedView.setImageViewBitmap(pz1.c.richNotifImageRight, (Bitmap) imageBitmaps.get(2));
        if (z13) {
            richNotifInterestExpandedView.setTextViewText(pz1.c.richNotifInterestNameLeft, (CharSequence) interestNames.get(0));
            richNotifInterestExpandedView.setTextViewText(pz1.c.richNotifInterestNameMid, (CharSequence) interestNames.get(1));
            richNotifInterestExpandedView.setTextViewText(pz1.c.richNotifInterestNameRight, (CharSequence) interestNames.get(2));
        }
    }

    public static void C0(u91.h hVar, UserDeserializer userDeserializer) {
        hVar.F0 = userDeserializer;
    }

    public static final void D(RemoteViews richNotifBoardsExpandedView, ArrayList imageBitmaps, ArrayList pinCountPerBoard) {
        Intrinsics.checkNotNullParameter(richNotifBoardsExpandedView, "richNotifBoardsExpandedView");
        Intrinsics.checkNotNullParameter(imageBitmaps, "imageBitmaps");
        Intrinsics.checkNotNullParameter(pinCountPerBoard, "pinCountPerBoard");
        HashSet hashSet = tb0.h.f117076w;
        tb0.g.f117075a.h("Building Boards expanded view");
        if (Build.VERSION.SDK_INT >= 31) {
            richNotifBoardsExpandedView.setBoolean(pz1.c.richNotifLeftBoardGrid, "setClipToOutline", true);
            richNotifBoardsExpandedView.setBoolean(pz1.c.richNotifRightBoardGrid, "setClipToOutline", true);
        }
        int size = imageBitmaps.size();
        for (int i13 = 0; i13 < size; i13++) {
            if (i13 == 0) {
                richNotifBoardsExpandedView.setImageViewBitmap(pz1.c.richNotifLeftBoardCover, (Bitmap) imageBitmaps.get(i13));
            } else if (i13 == 1) {
                richNotifBoardsExpandedView.setImageViewBitmap(pz1.c.richNotifRightBoardCover, (Bitmap) imageBitmaps.get(i13));
            } else if (i13 == 2) {
                richNotifBoardsExpandedView.setImageViewBitmap(pz1.c.richNotifLeftBoardPinUpper, (Bitmap) imageBitmaps.get(i13));
            } else if (i13 == 3) {
                richNotifBoardsExpandedView.setImageViewBitmap(pz1.c.richNotifBoardLeftPinLower, (Bitmap) imageBitmaps.get(i13));
                if (pinCountPerBoard.size() >= 2) {
                    richNotifBoardsExpandedView.setTextViewText(pz1.c.richNotifBoardLeftPinCount, (CharSequence) pinCountPerBoard.get(0));
                }
            } else if (i13 == 4) {
                richNotifBoardsExpandedView.setImageViewBitmap(pz1.c.richNotifRightBoard1PinUpper, (Bitmap) imageBitmaps.get(i13));
            } else if (i13 == 5) {
                richNotifBoardsExpandedView.setImageViewBitmap(pz1.c.richNotifRightBoardPinLower, (Bitmap) imageBitmaps.get(i13));
                if (pinCountPerBoard.size() >= 2) {
                    richNotifBoardsExpandedView.setTextViewText(pz1.c.richNotifRightBoardPinCount, (CharSequence) pinCountPerBoard.get(1));
                }
            }
        }
    }

    public static void D0(xc2.c cVar, xc2.w wVar) {
        cVar.f134553c = wVar;
    }

    public static final void E(RemoteViews richNotifBoardExpandedView, ArrayList imageBitmaps, String pinCountForBoard) {
        Intrinsics.checkNotNullParameter(richNotifBoardExpandedView, "richNotifBoardExpandedView");
        Intrinsics.checkNotNullParameter(imageBitmaps, "imageBitmaps");
        Intrinsics.checkNotNullParameter(pinCountForBoard, "pinCountForBoard");
        HashSet hashSet = tb0.h.f117076w;
        tb0.g.f117075a.h("Building One Board expanded view");
        if (Build.VERSION.SDK_INT >= 31) {
            richNotifBoardExpandedView.setBoolean(pz1.c.richNotifOneBoard, "setClipToOutline", true);
        }
        int size = imageBitmaps.size();
        for (int i13 = 0; i13 < size; i13++) {
            if (i13 == 0) {
                richNotifBoardExpandedView.setImageViewBitmap(pz1.c.richNotifBoardCover, (Bitmap) imageBitmaps.get(i13));
            } else if (i13 == 1) {
                richNotifBoardExpandedView.setImageViewBitmap(pz1.c.richNotifLeftUpperPin, (Bitmap) imageBitmaps.get(i13));
            } else if (i13 == 2) {
                richNotifBoardExpandedView.setImageViewBitmap(pz1.c.richNotifLeftLowerPin, (Bitmap) imageBitmaps.get(i13));
            } else if (i13 == 3) {
                richNotifBoardExpandedView.setImageViewBitmap(pz1.c.richNotifRightUpperPin, (Bitmap) imageBitmaps.get(i13));
            } else if (i13 == 4) {
                richNotifBoardExpandedView.setImageViewBitmap(pz1.c.richNotifRightLowerPin, (Bitmap) imageBitmaps.get(i13));
                if (pinCountForBoard.length() != 0 && Integer.parseInt(pinCountForBoard) > 4) {
                    richNotifBoardExpandedView.setTextViewText(pz1.c.richNotifBoardPinCount, pinCountForBoard);
                }
            }
        }
    }

    public static void E0(RepinActivity repinActivity, r8 r8Var) {
        repinActivity.f34933d = r8Var;
    }

    public static final void F(RemoteViews richNotifPinsExpandedView, Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(richNotifPinsExpandedView, "richNotifPinsExpandedView");
        HashSet hashSet = tb0.h.f117076w;
        tb0.g.f117075a.h("Building Single Image expanded view");
        if (bitmap == null) {
            richNotifPinsExpandedView.setViewVisibility(pz1.c.richNotifSingleImage, 8);
            return;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            richNotifPinsExpandedView.setBoolean(pz1.c.richNotifPinGrid, "setClipToOutline", true);
        }
        richNotifPinsExpandedView.setImageViewBitmap(pz1.c.richNotifSingleImage, bitmap);
        richNotifPinsExpandedView.setViewVisibility(pz1.c.richNotifSingleImage, 0);
    }

    public static void F0(RepinActivity repinActivity, vo.u uVar) {
        repinActivity.f34934e = uVar;
    }

    public static final void G(RemoteViews richNotifPinsExpandedView, ArrayList imageBitmaps) {
        Intrinsics.checkNotNullParameter(richNotifPinsExpandedView, "richNotifPinsExpandedView");
        Intrinsics.checkNotNullParameter(imageBitmaps, "imageBitmaps");
        HashSet hashSet = tb0.h.f117076w;
        tb0.g.f117075a.h("Building Pins expanded view");
        if (imageBitmaps.size() != 4) {
            richNotifPinsExpandedView.setViewVisibility(pz1.c.richNotifPinGrid, 8);
            return;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            richNotifPinsExpandedView.setBoolean(pz1.c.richNotifPinGridBackground, "setClipToOutline", true);
        }
        richNotifPinsExpandedView.setImageViewBitmap(pz1.c.richNotifPin0, (Bitmap) imageBitmaps.get(0));
        richNotifPinsExpandedView.setViewVisibility(pz1.c.richNotifPin0, 0);
        richNotifPinsExpandedView.setImageViewBitmap(pz1.c.richNotifPin1, (Bitmap) imageBitmaps.get(1));
        richNotifPinsExpandedView.setViewVisibility(pz1.c.richNotifPin1, 0);
        richNotifPinsExpandedView.setImageViewBitmap(pz1.c.richNotifPin2, (Bitmap) imageBitmaps.get(2));
        richNotifPinsExpandedView.setViewVisibility(pz1.c.richNotifPin2, 0);
        richNotifPinsExpandedView.setImageViewBitmap(pz1.c.richNotifPin3, (Bitmap) imageBitmaps.get(3));
        richNotifPinsExpandedView.setViewVisibility(pz1.c.richNotifPin3, 0);
    }

    public static final Integer G0(com.pinterest.api.model.r rVar) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        Map m13 = rVar.m();
        String str = (String) (m13 != null ? m13.get(String.valueOf(h92.c.INTERNAL_CREATIVE_TYPE.getValue())) : null);
        if (str != null) {
            return StringsKt.toIntOrNull(str);
        }
        return null;
    }

    public static final void H(RemoteViews richNotifPinsExpandedView, ArrayList imageBitmaps) {
        Intrinsics.checkNotNullParameter(richNotifPinsExpandedView, "richNotifPinsExpandedView");
        Intrinsics.checkNotNullParameter(imageBitmaps, "imageBitmaps");
        HashSet hashSet = tb0.h.f117076w;
        tb0.g.f117075a.h("Building Pins grid expanded view");
        if (imageBitmaps.size() != 6) {
            richNotifPinsExpandedView.setViewVisibility(pz1.c.richNotifPinGrid, 8);
            return;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            richNotifPinsExpandedView.setBoolean(pz1.c.richNotifPinGridBackground, "setClipToOutline", true);
        }
        richNotifPinsExpandedView.setImageViewBitmap(pz1.c.richNotifPin0, (Bitmap) imageBitmaps.get(0));
        richNotifPinsExpandedView.setViewVisibility(pz1.c.richNotifPin0, 0);
        richNotifPinsExpandedView.setImageViewBitmap(pz1.c.richNotifPin1, (Bitmap) imageBitmaps.get(1));
        richNotifPinsExpandedView.setViewVisibility(pz1.c.richNotifPin1, 0);
        richNotifPinsExpandedView.setImageViewBitmap(pz1.c.richNotifPin2, (Bitmap) imageBitmaps.get(2));
        richNotifPinsExpandedView.setViewVisibility(pz1.c.richNotifPin2, 0);
        richNotifPinsExpandedView.setImageViewBitmap(pz1.c.richNotifPin3, (Bitmap) imageBitmaps.get(3));
        richNotifPinsExpandedView.setViewVisibility(pz1.c.richNotifPin3, 0);
        richNotifPinsExpandedView.setImageViewBitmap(pz1.c.richNotifPin4, (Bitmap) imageBitmaps.get(4));
        richNotifPinsExpandedView.setViewVisibility(pz1.c.richNotifPin4, 0);
        richNotifPinsExpandedView.setImageViewBitmap(pz1.c.richNotifPin5, (Bitmap) imageBitmaps.get(5));
        richNotifPinsExpandedView.setViewVisibility(pz1.c.richNotifPin5, 0);
    }

    public static final boolean H0(dl1.s sVar) {
        z32.m0 m0Var;
        Intrinsics.checkNotNullParameter(sVar, "<this>");
        return (sVar instanceof vh) && ((m0Var = ((vh) sVar).f42868z) == z32.m0.CAROUSEL || m0Var == z32.m0.STRUCTURED_FEED_CAROUSEL || m0Var == z32.m0.SHOP_YOUR_SAVES_MODULE || m0Var == z32.m0.VISUAL_SHOPPING_CAROUSEL);
    }

    public static Uri I(Uri uri, String... strArr) {
        Uri.Builder buildUpon = uri.buildUpon();
        for (String str : strArr) {
            buildUpon.appendEncodedPath(str);
        }
        return buildUpon.build();
    }

    public static final boolean I0(String str, List list) {
        List list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            if (Intrinsics.d(((wy0) it.next()).getUid(), str)) {
                return true;
            }
        }
        return false;
    }

    public static final zp.b0 J(vz0 vz0Var, lu1.b baseActivityHelper) {
        rs j13;
        ns j14;
        Intrinsics.checkNotNullParameter(baseActivityHelper, "baseActivityHelper");
        String str = null;
        List P = vz0Var != null ? r.P(vz0Var) : null;
        if (P == null) {
            P = kotlin.collections.q0.f80391a;
        }
        if (vz0Var != null && (j13 = vz0Var.j()) != null && (j14 = j13.j()) != null) {
            str = j14.c();
        }
        return new zp.b0(P, str, baseActivityHelper);
    }

    public static boolean J0(String str, List list) {
        List list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            if (Intrinsics.d(((wy0) it.next()).getUid(), str)) {
                return true;
            }
        }
        return false;
    }

    public static CaptureRequest K(androidx.camera.core.impl.s0 s0Var, CameraDevice cameraDevice, n3.b bVar) {
        if (cameraDevice == null) {
            return null;
        }
        StringBuilder sb3 = new StringBuilder("template type = ");
        int i13 = s0Var.f16969c;
        sb3.append(i13);
        m0.p("Camera2CaptureRequestBuilder", sb3.toString());
        CaptureRequest.Builder createCaptureRequest = cameraDevice.createCaptureRequest(i13);
        u(createCaptureRequest, i13, bVar);
        t(createCaptureRequest, s0Var.f16968b);
        return createCaptureRequest.build();
    }

    public static final boolean K0(f4 f4Var) {
        Intrinsics.checkNotNullParameter(f4Var, "<this>");
        z3 z3Var = a4.f83298b;
        lh0.g1 g1Var = (lh0.g1) f4Var.f83347a;
        return g1Var.o("hfp_gulp_empty_state_android", "enabled", z3Var) || g1Var.l("hfp_gulp_empty_state_android");
    }

    public static final u2.q L(u2.q qVar, Function0 function0, i2.o oVar) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        i2.s sVar = (i2.s) oVar;
        sVar.W(-1473783161);
        sVar.W(1630932281);
        Object J2 = sVar.J();
        if (J2 == i2.n.f71185a) {
            J2 = d7.g.o(sVar);
        }
        sVar.r(false);
        u2.q d2 = androidx.compose.foundation.a.d(qVar, (o1.l) J2, null, false, null, function0, 28);
        sVar.r(false);
        return d2;
    }

    public static boolean L0(byte b13) {
        return b13 > -65;
    }

    public static void M(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static boolean M0(byte b13) {
        return b13 >= 0;
    }

    public static s71.l N(Context context, rm1.q qVar, rm1.i iVar, int i13, int i14, boolean z13, boolean z14) {
        Resources resources = context.getResources();
        Intrinsics.f(resources);
        int i15 = vc2.a.visual_search_button_margin;
        Intrinsics.checkNotNullParameter(resources, "<this>");
        int dimensionPixelOffset = resources.getDimensionPixelOffset(i15);
        int i16 = vc2.a.visual_search_button_padding;
        Intrinsics.checkNotNullParameter(resources, "<this>");
        int dimensionPixelOffset2 = resources.getDimensionPixelOffset(i16);
        s71.l lVar = new s71.l(context, null, z14, null, dimensionPixelOffset2, dimensionPixelOffset2, false, CameraPreview.AUTOFOCUS_INTERVAL_MILLIS, 0, qVar, iVar, null, null, z13, false, false, false, null, false, null, 16621210);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        com.bumptech.glide.c.a1(layoutParams, 0, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
        layoutParams.gravity = 16;
        lVar.setLayoutParams(layoutParams);
        lVar.setId(i13);
        String f23 = bs1.c.f2(lVar, i14);
        lVar.setContentDescription(f23);
        if (z14) {
            lVar.g(f23, true);
            s71.l.a(lVar, s71.a.COLLAPSE, 0L, 14);
        }
        return lVar;
    }

    public static final boolean N0(String str) {
        if (str == null || str.length() == 0 || str.length() < 43 || str.length() > 128) {
            return false;
        }
        return new Regex("^[-._~A-Za-z0-9]+$").e(str);
    }

    public static final h32.c1 O(String productTagId, String str) {
        Object m13;
        Object m14;
        Intrinsics.checkNotNullParameter(productTagId, "productTagId");
        if (str == null) {
            return null;
        }
        Boolean bool = Boolean.FALSE;
        Boolean bool2 = Boolean.TRUE;
        try {
            xk2.q qVar = xk2.s.f135225b;
            m13 = Long.valueOf(Long.parseLong(str));
        } catch (Throwable th3) {
            xk2.q qVar2 = xk2.s.f135225b;
            m13 = ue.c.m(th3);
        }
        if (m13 instanceof xk2.r) {
            m13 = null;
        }
        Long l13 = (Long) m13;
        try {
            m14 = Long.valueOf(Long.parseLong(productTagId));
        } catch (Throwable th4) {
            xk2.q qVar3 = xk2.s.f135225b;
            m14 = ue.c.m(th4);
        }
        if (m14 instanceof xk2.r) {
            m14 = null;
        }
        return new h32.c1(null, bool, null, bool2, bool, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new h32.x2((Long) m14, str, l13, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public static final yl1.b P(nk1.h followState, yk1.v resources, boolean z13) {
        qk1.c cVar;
        Intrinsics.checkNotNullParameter(followState, "followState");
        Intrinsics.checkNotNullParameter(resources, "resources");
        int i13 = oa2.u.f93962a[followState.ordinal()];
        if (i13 == 1) {
            cVar = qk1.d.f104061a;
        } else if (i13 == 2) {
            cVar = qk1.d.f104063c;
        } else {
            if (i13 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            cVar = qk1.d.f104062b;
        }
        String[] strArr = new String[0];
        return new yl1.b(bs1.c.j2(strArr, cVar.f104059a), false, d7.b.Z(z13), null, cVar.f104060b, null, null, null, 0, null, 1002);
    }

    public static final ha2.z P0(int i13, List organizeProfileOptions, Function1 selectionHandler) {
        Intrinsics.checkNotNullParameter(organizeProfileOptions, "organizeProfileOptions");
        Intrinsics.checkNotNullParameter(selectionHandler, "selectionHandler");
        HashMap hashMap = new HashMap();
        List list = organizeProfileOptions;
        int i14 = 0;
        for (Object obj : list) {
            int i15 = i14 + 1;
            if (i14 < 0) {
                kotlin.collections.f0.p();
                throw null;
            }
            hashMap.put(Integer.valueOf(i14), (a41.q0) obj);
            i14 = i15;
        }
        ha2.x xVar = new ha2.x(i13, Integer.valueOf(i13), null, null, null, 28);
        ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(list, 10));
        int i16 = 0;
        for (Object obj2 : list) {
            int i17 = i16 + 1;
            if (i16 < 0) {
                kotlin.collections.f0.p();
                throw null;
            }
            a41.q0 q0Var = (a41.q0) obj2;
            arrayList.add(new ha2.a0(q0Var.getTitleResId(), i16, null, null, null, q0Var.getSubtitleResId(), null, null, q0Var == a41.q0.LayoutBoards ? rm1.q.ARROW_FORWARD : null, 476));
            i16 = i17;
        }
        return new ha2.z(xVar, arrayList, new cl0.b(hashMap, selectionHandler, 1));
    }

    public static String Q(wy0 user, yk1.v resources) {
        oa2.e formatter = oa2.e.I;
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(formatter, "formatter");
        Integer V2 = user.V2();
        Intrinsics.checkNotNullExpressionValue(V2, "getFollowerCount(...)");
        int intValue = V2.intValue();
        return ((yk1.a) resources).f139224a.getQuantityString(m60.w0.plural_followers_string, intValue, formatter.invoke(Integer.valueOf(intValue)));
    }

    public static void Q0(l9.d dVar, int i13, d7.i iVar) {
        long c13 = dVar.c(i13);
        List b13 = dVar.b(c13);
        if (b13.isEmpty()) {
            return;
        }
        if (i13 == dVar.d() - 1) {
            throw new IllegalStateException();
        }
        long c14 = dVar.c(i13 + 1) - dVar.c(i13);
        if (c14 > 0) {
            iVar.accept(new l9.a(c13, c14, b13));
        }
    }

    public static final String R(String codeVerifier, com.facebook.login.a codeChallengeMethod) {
        Intrinsics.checkNotNullParameter(codeVerifier, "codeVerifier");
        Intrinsics.checkNotNullParameter(codeChallengeMethod, "codeChallengeMethod");
        if (!N0(codeVerifier)) {
            throw new FacebookException("Invalid Code Verifier.");
        }
        if (codeChallengeMethod == com.facebook.login.a.PLAIN) {
            return codeVerifier;
        }
        try {
            byte[] bytes = codeVerifier.getBytes(Charsets.f80462b);
            Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(bytes, 0, bytes.length);
            String encodeToString = Base64.encodeToString(messageDigest.digest(), 11);
            Intrinsics.checkNotNullExpressionValue(encodeToString, "{\n      // try to generate challenge with S256\n      val bytes: ByteArray = codeVerifier.toByteArray(Charsets.US_ASCII)\n      val messageDigest = MessageDigest.getInstance(\"SHA-256\")\n      messageDigest.update(bytes, 0, bytes.size)\n      val digest = messageDigest.digest()\n\n      Base64.encodeToString(digest, Base64.URL_SAFE or Base64.NO_PADDING or Base64.NO_WRAP)\n    }");
            return encodeToString;
        } catch (Exception e13) {
            throw new FacebookException(e13);
        }
    }

    public static final kk2.t R0(Application application, Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        kk2.t r13 = new kk2.k(new a.g0(13, application, bitmap), 1).r(tk2.e.f118017c);
        Intrinsics.checkNotNullExpressionValue(r13, "subscribeOn(...)");
        return r13;
    }

    public static final HashMap S(v7 v7Var) {
        Boolean f13;
        Intrinsics.checkNotNullParameter(v7Var, "<this>");
        HashMap hashMap = new HashMap();
        hashMap.put("board_id", v7Var.getUid());
        if (v7Var.m1()) {
            hashMap.put("board_pin_count", String.valueOf(v7Var.l1().intValue()));
        }
        if (v7Var.r1()) {
            hashMap.put("board_section_count", String.valueOf(v7Var.q1().intValue()));
        }
        c7 B0 = v7Var.B0();
        if (B0 != null && (f13 = B0.f()) != null) {
            hashMap.put("is_board_update_status", !f13.booleanValue() ? SbaPinRep.AUXDATA_IS_LEAD_AD_TRUE : "0");
        }
        return hashMap;
    }

    public static final Bitmap S0(Bitmap bitmap, Pair pair) {
        if (pair == null) {
            return bitmap;
        }
        if (bitmap == null) {
            return null;
        }
        Matrix matrix = new Matrix();
        matrix.preScale(((Number) pair.f80346a).floatValue(), ((Number) pair.f80347b).floatValue());
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String T(zx.l r9, yk1.v r10) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "viewResources"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            zx.g r0 = r9.f142973a
            zx.f r0 = r0.f142969a
            zx.f r2 = zx.f.CUSTOM
            if (r0 == r2) goto L1e
            java.lang.String r0 = r9.g()
            r1.add(r0)
        L1e:
            zx.d r0 = r9.f142974b
            int r2 = r0.ordinal()
            if (r2 == 0) goto L5c
            zx.e r2 = r9.f142975c
            int r3 = r2.ordinal()
            zx.c r4 = r9.f142976d
            if (r3 != 0) goto L36
            int r3 = r4.ordinal()
            if (r3 == 0) goto L5c
        L36:
            zx.d r3 = zx.d.ORGANIC
            if (r0 != r3) goto L4b
            int r0 = r2.getDescription()
            r2 = r10
            yk1.a r2 = (yk1.a) r2
            android.content.res.Resources r2 = r2.f139224a
            java.lang.String r0 = r2.getString(r0)
            r1.add(r0)
            goto L72
        L4b:
            int r0 = r4.getDescription()
            r2 = r10
            yk1.a r2 = (yk1.a) r2
            android.content.res.Resources r2 = r2.f139224a
            java.lang.String r0 = r2.getString(r0)
            r1.add(r0)
            goto L72
        L5c:
            int r2 = r0.ordinal()
            if (r2 == 0) goto L72
            int r0 = r0.getDescription()
            r2 = r10
            yk1.a r2 = (yk1.a) r2
            android.content.res.Resources r2 = r2.f139224a
            java.lang.String r0 = r2.getString(r0)
            r1.add(r0)
        L72:
            zx.b r0 = r9.f142977e
            int r2 = r0.f142968b
            if (r2 == 0) goto L7d
            java.lang.String r0 = r0.f142967a
            r1.add(r0)
        L7d:
            zx.h r0 = r9.f142979g
            int r2 = r0.ordinal()
            if (r2 == 0) goto L95
            int r0 = r0.getDescription()
            r2 = r10
            yk1.a r2 = (yk1.a) r2
            android.content.res.Resources r2 = r2.f139224a
            java.lang.String r0 = r2.getString(r0)
            r1.add(r0)
        L95:
            zx.k r0 = r9.f142980h
            int r2 = r0.ordinal()
            if (r2 == 0) goto Lad
            int r0 = r0.getDescription()
            r2 = r10
            yk1.a r2 = (yk1.a) r2
            android.content.res.Resources r2 = r2.f139224a
            java.lang.String r0 = r2.getString(r0)
            r1.add(r0)
        Lad:
            zx.i r0 = r9.f142981i
            int r2 = r0.ordinal()
            if (r2 == 0) goto Lc5
            int r0 = r0.getDescription()
            r2 = r10
            yk1.a r2 = (yk1.a) r2
            android.content.res.Resources r2 = r2.f139224a
            java.lang.String r0 = r2.getString(r0)
            r1.add(r0)
        Lc5:
            boolean r9 = r9.f142982j
            if (r9 == 0) goto Ld6
            int r9 = com.pinterest.partnerAnalytics.g.include_saved_pins_filter_title
            yk1.a r10 = (yk1.a) r10
            android.content.res.Resources r10 = r10.f139224a
            java.lang.String r9 = r10.getString(r9)
            r1.add(r9)
        Ld6:
            r6 = 0
            r7 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r8 = 63
            java.lang.String r9 = kotlin.collections.CollectionsKt.Z(r1, r2, r3, r4, r5, r6, r7, r8)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kh2.u2.T(zx.l, yk1.v):java.lang.String");
    }

    public static final void T0(LegoUserRep legoUserRep, oa2.l actionListener) {
        Intrinsics.checkNotNullParameter(legoUserRep, "<this>");
        Intrinsics.checkNotNullParameter(actionListener, "actionListener");
        legoUserRep.I0(new oa2.v(actionListener, 0));
        legoUserRep.J1(new oa2.v(actionListener, 1));
        legoUserRep.S0(new oa2.v(actionListener, 2));
        legoUserRep.w1(new ha2.j(actionListener, 4));
        legoUserRep.F0(new oa2.v(actionListener, 3));
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0066, code lost:
    
        if (kh2.j1.T(r5, "0.16.0") <= 0) goto L77;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.util.List U(com.pinterest.api.model.dl0 r20, boolean r21, java.lang.String r22) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kh2.u2.U(com.pinterest.api.model.dl0, boolean, java.lang.String):java.util.List");
    }

    public static final void U0(JobInfo.Builder builder, NetworkRequest networkRequest) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.setRequiredNetwork(networkRequest);
    }

    public static final RemoteViews V(Context context, boolean z13) {
        RemoteViews remoteViews;
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            if (z13) {
                HashSet hashSet = tb0.h.f117076w;
                tb0.g.f117075a.h("Inflating notif_expanded_pins_two_row");
                remoteViews = new RemoteViews(context.getPackageName(), pz1.d.notif_expanded_six_pin_grid);
            } else {
                HashSet hashSet2 = tb0.h.f117076w;
                tb0.g.f117075a.h("Inflating notif_rich_pins_expanded_bold");
                remoteViews = new RemoteViews(context.getPackageName(), pz1.d.notif_rich_pins_expanded_bold);
            }
            return remoteViews;
        } catch (Exception e13) {
            String message = e13.getMessage();
            if (message == null) {
                return null;
            }
            d.O0("NotificationRemoteViewException", message);
            return null;
        }
    }

    public static final boolean V0(f30 f30Var, l82.e eVar) {
        bk1.d2 d2Var = ((bk1.a2) eVar.f82219b).f23167m;
        bk1.b2 b2Var = d2Var instanceof bk1.b2 ? (bk1.b2) d2Var : null;
        ro1.b bVar = b2Var != null ? b2Var.f23185a : null;
        if (f30Var.u3() == null || bVar != ro1.b.WEB) {
            return false;
        }
        eVar.a(new bk1.l1(wc.f114696a));
        return ((bk1.a2) eVar.f82219b).f23158d.f90858i;
    }

    public static final RemoteViews W(Context context, List pinImageUrls, String expandedTitleText, String expandedBodyText, Intent expandedIntent, hs1.q imageCache, lh0.v2 experiments) {
        RemoteViews remoteViews;
        RemoteViews remoteViews2;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pinImageUrls, "pinImageUrls");
        Intrinsics.checkNotNullParameter(expandedTitleText, "expandedTitleText");
        Intrinsics.checkNotNullParameter(expandedBodyText, "expandedBodyText");
        Intrinsics.checkNotNullParameter(expandedIntent, "expandedIntent");
        Intrinsics.checkNotNullParameter(imageCache, "imageCache");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        ArrayList X0 = X0(pinImageUrls, 6, imageCache, context.getResources().getDimensionPixelSize(pz1.a.push_notification_expanded_image_width_103), context.getResources().getDimensionPixelSize(pz1.a.push_notification_expanded_image_height_100));
        if (X0.size() >= 6) {
            remoteViews2 = new RemoteViews(context.getPackageName(), pz1.d.notif_expanded_six_pin_grid);
            if (Build.VERSION.SDK_INT >= 31) {
                remoteViews2.setBoolean(pz1.c.richNotifPinGridBackground, "setClipToOutline", true);
            }
            remoteViews2.setImageViewBitmap(pz1.c.richNotifPin0, (Bitmap) X0.get(0));
            remoteViews2.setViewVisibility(pz1.c.richNotifPin0, 0);
            remoteViews2.setImageViewBitmap(pz1.c.richNotifPin1, (Bitmap) X0.get(1));
            remoteViews2.setViewVisibility(pz1.c.richNotifPin1, 0);
            remoteViews2.setImageViewBitmap(pz1.c.richNotifPin2, (Bitmap) X0.get(2));
            remoteViews2.setViewVisibility(pz1.c.richNotifPin2, 0);
            remoteViews2.setImageViewBitmap(pz1.c.richNotifPin3, (Bitmap) X0.get(3));
            remoteViews2.setViewVisibility(pz1.c.richNotifPin3, 0);
            remoteViews2.setImageViewBitmap(pz1.c.richNotifPin4, (Bitmap) X0.get(4));
            remoteViews2.setViewVisibility(pz1.c.richNotifPin4, 0);
            remoteViews2.setImageViewBitmap(pz1.c.richNotifPin5, (Bitmap) X0.get(5));
            remoteViews2.setViewVisibility(pz1.c.richNotifPin5, 0);
        } else {
            if (X0.size() >= 4) {
                ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(X0, 10));
                Iterator it = X0.iterator();
                while (it.hasNext()) {
                    arrayList.add(Bitmap.createScaledBitmap((Bitmap) it.next(), context.getResources().getDimensionPixelSize(pz1.a.notification_rich_large_icon_width), context.getResources().getDimensionPixelSize(pz1.a.push_notification_expanded_image_height_148), false));
                }
                remoteViews = new RemoteViews(context.getPackageName(), pz1.d.notif_rich_pins_expanded_bold);
                if (arrayList.size() < 4) {
                    remoteViews.setViewVisibility(pz1.c.richNotifPinGrid, 8);
                }
                if (Build.VERSION.SDK_INT >= 31) {
                    remoteViews.setBoolean(pz1.c.richNotifPinGridBackground, "setClipToOutline", true);
                }
                remoteViews.setImageViewBitmap(pz1.c.richNotifPin0, (Bitmap) arrayList.get(0));
                remoteViews.setViewVisibility(pz1.c.richNotifPin0, 0);
                remoteViews.setImageViewBitmap(pz1.c.richNotifPin1, (Bitmap) arrayList.get(1));
                remoteViews.setViewVisibility(pz1.c.richNotifPin1, 0);
                remoteViews.setImageViewBitmap(pz1.c.richNotifPin2, (Bitmap) arrayList.get(2));
                remoteViews.setViewVisibility(pz1.c.richNotifPin2, 0);
                remoteViews.setImageViewBitmap(pz1.c.richNotifPin3, (Bitmap) arrayList.get(3));
                remoteViews.setViewVisibility(pz1.c.richNotifPin3, 0);
            } else {
                ArrayList arrayList2 = new ArrayList(kotlin.collections.g0.q(X0, 10));
                Iterator it2 = X0.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(Bitmap.createScaledBitmap((Bitmap) it2.next(), context.getResources().getDimensionPixelSize(pz1.a.notification_rich_one_icon_width), context.getResources().getDimensionPixelSize(pz1.a.push_notification_expanded_image_height_148), false));
                }
                remoteViews = new RemoteViews(context.getPackageName(), pz1.d.notif_rich_single_image_expanded_bold);
                if (arrayList2.isEmpty()) {
                    remoteViews.setViewVisibility(pz1.c.richNotifPinGrid, 8);
                } else {
                    if (Build.VERSION.SDK_INT >= 31) {
                        remoteViews.setBoolean(pz1.c.richNotifPinGrid, "setClipToOutline", true);
                    }
                    remoteViews.setImageViewBitmap(pz1.c.richNotifSingleImage, (Bitmap) arrayList2.get(0));
                    remoteViews.setViewVisibility(pz1.c.richNotifSingleImage, 0);
                }
            }
            remoteViews2 = remoteViews;
        }
        com.pinterest.pushnotification.g.j(context, remoteViews2, expandedTitleText, expandedBodyText);
        remoteViews2.setOnClickPendingIntent(pz1.c.expanded_view_root, com.pinterest.pushnotification.g.c(context, expandedIntent));
        return remoteViews2;
    }

    public static void W0(g71.f sourceView, nx.d0 pinalytics, m60.w eventManager, lb0.q prefsManagerPersisted, h61.h searchType, String query, String skinToneTerm) {
        Intrinsics.checkNotNullParameter(prefsManagerPersisted, "prefsManagerPersisted");
        Intrinsics.checkNotNullParameter(sourceView, "sourceView");
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(searchType, "searchType");
        Intrinsics.checkNotNullParameter(skinToneTerm, "skinToneTerm");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        if (f79718d) {
            return;
        }
        String str = f79716b;
        if (str == null && f79717c == null) {
            f79716b = query;
            f79717c = skinToneTerm;
            return;
        }
        String str2 = f79717c;
        f79717c = skinToneTerm;
        f79716b = query;
        if (kotlin.text.z.i(query, str, true) || !Intrinsics.d(str2, skinToneTerm)) {
            return;
        }
        Context context = sourceView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        yb0.n nVar = new yb0.n(context);
        String string = nVar.getContext().getString(nv1.f.search_results_skin_tone_remember);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        nVar.w(string);
        nVar.u(nVar.getContext().getString(nv1.f.search_results_skin_tone_remember_description));
        String string2 = nVar.getContext().getString(m60.x0.okay);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        nVar.q(string2);
        String string3 = nVar.getContext().getString(m60.x0.not_now_sentence_case);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        nVar.m(string3);
        HashMap hashMap = new HashMap();
        hashMap.put("story_type", "skin_tone_filters");
        h32.g0 g0Var = h32.g0.SKIN_TONE_FILTERS_REMEBER_DIALOG;
        nVar.f138513j = new sv1.d(pinalytics, g0Var, hashMap, prefsManagerPersisted, skinToneTerm, eventManager, searchType, query, nVar, 1);
        nVar.f138514k = new sv1.c(pinalytics, g0Var, hashMap, prefsManagerPersisted, nVar, 2);
        pinalytics.U(new h32.i0(d4.SEARCH, null, null, g0Var, null, h32.u0.SKIN_TONE_FILTER_REMEMBER_DIALOG), h32.f1.VIEW, null, null, hashMap, false);
        eventManager.f(new yb0.e(nVar));
    }

    public static final i51.s X(h32.u0 u0Var, zy.l0 l0Var, HashMap hashMap) {
        return new i51.s(new zy.e0(new zy.a(com.bumptech.glide.d.z0(l0Var.f143086a, new la0.l1(u0Var, 5)), h32.f1.TAP, null, hashMap, null, null, false, false, RecyclerViewTypes.VIEW_TYPE_HOME_FEED_TUNER_SETTINGS_NOTIFICATION)));
    }

    public static final ArrayList X0(List list, int i13, hs1.q imageCache, int i14, int i15) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(imageCache, "imageCache");
        ArrayList arrayList = new ArrayList();
        for (int i16 = 0; arrayList.size() < i13 && i16 < list.size(); i16++) {
            Bitmap f13 = com.pinterest.pushnotification.g.f(imageCache, (String) list.get(i16), i14, i15);
            if (f13 != null) {
                arrayList.add(f13);
            }
        }
        return arrayList;
    }

    public static TransportInfo Y(NetworkCapabilities networkCapabilities) {
        TransportInfo transportInfo;
        transportInfo = networkCapabilities.getTransportInfo();
        return transportInfo;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005a A[LOOP:0: B:14:0x0054->B:16:0x005a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void Y0(l9.d r13, l9.k r14, d7.i r15) {
        /*
            long r0 = r14.f82319a
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r5 = 0
            if (r4 != 0) goto Le
            r4 = r5
            goto L27
        Le:
            int r4 = r13.a(r0)
            r6 = -1
            if (r4 != r6) goto L19
            int r4 = r13.d()
        L19:
            if (r4 <= 0) goto L27
            int r6 = r4 + (-1)
            long r6 = r13.c(r6)
            int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r6 != 0) goto L27
            int r4 = r4 + (-1)
        L27:
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L52
            int r2 = r13.d()
            if (r4 >= r2) goto L52
            java.util.List r11 = r13.b(r0)
            long r2 = r13.c(r4)
            boolean r6 = r11.isEmpty()
            if (r6 != 0) goto L52
            long r7 = r14.f82319a
            int r6 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r6 >= 0) goto L52
            l9.a r12 = new l9.a
            long r9 = r2 - r7
            r6 = r12
            r6.<init>(r7, r9, r11)
            r15.accept(r12)
            r2 = 1
            goto L53
        L52:
            r2 = r5
        L53:
            r3 = r4
        L54:
            int r6 = r13.d()
            if (r3 >= r6) goto L60
            Q0(r13, r3, r15)
            int r3 = r3 + 1
            goto L54
        L60:
            boolean r14 = r14.f82320b
            if (r14 == 0) goto L89
            if (r2 == 0) goto L68
            int r4 = r4 + (-1)
        L68:
            if (r5 >= r4) goto L70
            Q0(r13, r5, r15)
            int r5 = r5 + 1
            goto L68
        L70:
            if (r2 == 0) goto L89
            l9.a r14 = new l9.a
            java.util.List r11 = r13.b(r0)
            long r7 = r13.c(r4)
            long r2 = r13.c(r4)
            long r9 = r0 - r2
            r6 = r14
            r6.<init>(r7, r9, r11)
            r15.accept(r14)
        L89:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kh2.u2.Y0(l9.d, l9.k, d7.i):void");
    }

    public static final Bitmap Z(ag1.b cache, String path, long j13, int i13, int i14, Pair pair) {
        Bitmap bitmap;
        Intrinsics.checkNotNullParameter(cache, "cache");
        Intrinsics.checkNotNullParameter(path, "path");
        long j14 = j13 * 1000;
        String D = ig1.b.D(j14, path, i13, i14);
        Bitmap e13 = cache.e(D);
        if (e13 != null) {
            S0(e13, pair);
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        mediaMetadataRetriever.setDataSource(path);
        HashMap hashMap = rw0.f.f110112b;
        rw0.f fVar = rw0.e.f110110a;
        int max = Math.max(i13, i14);
        fVar.getClass();
        try {
            bitmap = mediaMetadataRetriever.getFrameAtTime(j14);
        } catch (RuntimeException unused) {
            bitmap = null;
        }
        Bitmap i15 = bitmap != null ? rw0.f.i(max, bitmap) : null;
        mediaMetadataRetriever.release();
        if (i15 != null) {
            cache.g(i15, D);
        }
        return S0(i15, pair);
    }

    public static final df.b0 Z0(r72.e2 e2Var) {
        Intrinsics.checkNotNullParameter(e2Var, "<this>");
        if (!(e2Var instanceof r72.b2) && !(e2Var instanceof r72.c2)) {
            if (!(e2Var instanceof r72.d2)) {
                throw new NoWhenBranchMatchedException();
            }
            String name = ((r72.d2) e2Var).name();
            Intrinsics.checkNotNullParameter(name, "name");
            String a13 = je2.a.a(name);
            StringBuilder sb3 = new StringBuilder();
            kd2.i iVar = kd2.i.f79272h;
            if (iVar == null) {
                throw new IllegalStateException("XRendererApp must be initialized first.".toString());
            }
            String str = iVar.f79278f;
            if (str == null) {
                throw new IllegalStateException("Overlay directory path not available, please init XRenderer first. See XRenderer::init".toString());
            }
            sb3.append(str);
            return new df.b0(a13, a.a.p(sb3, File.separator, a13));
        }
        return new df.b0("", "");
    }

    public static final void a(uc0.b bVar, i2.o oVar, int i13, int i14) {
        int i15;
        i2.s sVar = (i2.s) oVar;
        sVar.Y(1130140209);
        int i16 = 2;
        if ((i13 & 14) == 0) {
            i15 = (((i14 & 1) == 0 && sVar.h(bVar)) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i15 & 11) == 2 && sVar.z()) {
            sVar.Q();
        } else {
            sVar.S();
            if ((i13 & 1) != 0 && !sVar.y()) {
                sVar.Q();
                int i17 = i14 & 1;
            } else if ((i14 & 1) != 0) {
                sVar.X(1890788296);
                androidx.lifecycle.u1 a13 = v6.b.a(sVar);
                if (a13 == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                }
                xe2.g V = p2.V(a13, sVar);
                sVar.X(1729797275);
                androidx.lifecycle.l1 v03 = c3.v0(uc0.b.class, a13, V, a13 instanceof androidx.lifecycle.k ? ((androidx.lifecycle.k) a13).getDefaultViewModelCreationExtras() : u6.a.f120754b, sVar);
                sVar.r(false);
                sVar.r(false);
                bVar = (uc0.b) v03;
            }
            sVar.s();
            i2.q1 z13 = bs1.c.z(bVar.f121825e, sVar);
            bVar.i(new uc0.i(new oc0.a(q2.i.c(22063353, new xb0.a(bVar, 3), sVar))));
            gh0.b.d(((uc0.a) z13.getValue()).f121752a, null, sVar, 8, 2);
        }
        i2.f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new yu.c(bVar, i13, i14, i16);
        }
    }

    public static void a0(byte b13, byte b14, byte b15, byte b16, char[] cArr, int i13) {
        if (!L0(b14)) {
            if ((((b14 + 112) + (b13 << 28)) >> 30) == 0 && !L0(b15) && !L0(b16)) {
                int i14 = ((b13 & 7) << 18) | ((b14 & 63) << 12) | ((b15 & 63) << 6) | (b16 & 63);
                cArr[i13] = (char) ((i14 >>> 10) + 55232);
                cArr[i13 + 1] = (char) ((i14 & 1023) + 56320);
                return;
            }
        }
        throw new IllegalArgumentException("Invalid UTF-8");
    }

    public static void a1(h32.u0 u0Var, String str, h32.b3 toastType) {
        Intrinsics.checkNotNullParameter(toastType, "toastType");
        h32.d0 d0Var = new h32.d0(toastType);
        nx.d0 a13 = sh.f.a();
        Intrinsics.checkNotNullExpressionValue(a13, "get(...)");
        a13.h0((r18 & 1) != 0 ? h32.f1.TAP : h32.f1.TAP, (r18 & 2) != 0 ? null : u0Var, (r18 & 4) != 0 ? null : h32.g0.TOAST, (r18 & 8) != 0 ? null : str, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : d0Var, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(u2.q r18, kotlin.jvm.functions.Function0 r19, i2.o r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 209
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kh2.u2.b(u2.q, kotlin.jvm.functions.Function0, i2.o, int, int):void");
    }

    public static void b0(byte b13, byte b14, byte b15, char[] cArr, int i13) {
        if (L0(b14) || ((b13 == -32 && b14 < -96) || ((b13 == -19 && b14 >= -96) || L0(b15)))) {
            throw new IllegalArgumentException("Invalid UTF-8");
        }
        cArr[i13] = (char) (((b13 & 15) << 12) | ((b14 & 63) << 6) | (b15 & 63));
    }

    public static final g4 b1(s80.c7 c7Var, i2.o oVar, int i13) {
        i2.s sVar = (i2.s) oVar;
        sVar.W(-762107368);
        e7 e7Var = c7Var;
        if ((i13 & 1) != 0) {
            e7Var = new d7();
        }
        g4 g4Var = new g4(e7Var, RecyclerViewTypes.VIEW_TYPE_STORY_EDUCATION_BANNER, 90, 90);
        sVar.r(false);
        return g4Var;
    }

    public static final CancellationException c(String str, Throwable th3) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th3);
        return cancellationException;
    }

    public static void c0(byte b13, byte b14, char[] cArr, int i13) {
        if (b13 < -62) {
            throw new IllegalArgumentException("Invalid UTF-8: Illegal leading byte in 2 bytes utf");
        }
        if (L0(b14)) {
            throw new IllegalArgumentException("Invalid UTF-8: Illegal trailing byte in 2 bytes utf");
        }
        cArr[i13] = (char) (((b13 & 31) << 6) | (b14 & 63));
    }

    public static final String c1(xh2.d dVar, StackTraceElement[] elements) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        List U = kotlin.collections.c0.U(200, elements);
        ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(U, 10));
        Iterator it = U.iterator();
        while (it.hasNext()) {
            arrayList.add(((StackTraceElement) it.next()).toString());
        }
        return dVar.c(List.class, CollectionsKt.F0(arrayList));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void d(p90.a r18, u2.q r19, kotlin.jvm.functions.Function0 r20, kotlin.jvm.functions.Function0 r21, kotlin.jvm.functions.Function0 r22, i2.o r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 440
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kh2.u2.d(p90.a, u2.q, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, i2.o, int, int):void");
    }

    public static final wa0.c d0(List resolutionsToCheck, Map map) {
        sr srVar;
        Intrinsics.checkNotNullParameter(resolutionsToCheck, "resolutionsToCheck");
        Intrinsics.checkNotNullParameter(resolutionsToCheck, "resolutionsToCheck");
        if (map != null) {
            Iterator it = resolutionsToCheck.iterator();
            while (it.hasNext()) {
                srVar = (sr) map.get((String) it.next());
                if (srVar != null) {
                    break;
                }
            }
        }
        srVar = null;
        if (srVar == null) {
            return null;
        }
        Intrinsics.checkNotNullParameter(srVar, "<this>");
        String D0 = bs1.c.D0(srVar);
        if (D0 != null) {
            return new wa0.c(D0, bs1.c.E0(srVar), bs1.c.w0(srVar));
        }
        return null;
    }

    public static final void d1(com.pinterest.framework.multisection.datasource.pagedlist.c cVar, oj0.f oneTapSaveListener, String boardId) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(oneTapSaveListener, "saveController");
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        LinkedHashMap linkedHashMap = jj0.a.f76305a;
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        Intrinsics.checkNotNullParameter(oneTapSaveListener, "oneTapSaveListener");
        jj0.a.f76305a.put(boardId, oneTapSaveListener);
    }

    public static final void e(s80.j state, n72.b fontManager, n72.m logger, t62.b rendererUtility, u2.q qVar, Function1 function1, i2.o oVar, int i13, int i14) {
        FillElement fillElement;
        boolean z13;
        Function1 function12;
        i2.q1 q1Var;
        w80.h1 h1Var;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(fontManager, "fontManager");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(rendererUtility, "rendererUtility");
        i2.s sVar = (i2.s) oVar;
        sVar.Y(-1917455829);
        int i15 = i14 & 16;
        u2.n nVar = u2.n.f120041b;
        u2.q qVar2 = i15 != 0 ? nVar : qVar;
        Function1 function13 = (i14 & 32) != 0 ? q3.f111772i : function1;
        FillElement fillElement2 = androidx.compose.foundation.layout.e.f17184c;
        u2.q b13 = androidx.compose.foundation.a.b(qVar2.j(fillElement2), g0.h(eo1.b.color_themed_background_default, sVar), b3.s0.f21349a);
        q3.p0 e13 = p1.q.e(u2.b.f120013a, false);
        int i16 = sVar.P;
        i2.z1 o13 = sVar.o();
        u2.q X = ao2.m0.X(sVar, b13);
        s3.k.Qo.getClass();
        s3.i iVar = s3.j.f110798b;
        boolean z14 = sVar.f71265a instanceof i2.f;
        if (!z14) {
            com.bumptech.glide.c.j0();
            throw null;
        }
        sVar.a0();
        if (sVar.O) {
            sVar.n(iVar);
        } else {
            sVar.j0();
        }
        s3.h hVar = s3.j.f110801e;
        tb.f.f0(sVar, e13, hVar);
        s3.h hVar2 = s3.j.f110800d;
        tb.f.f0(sVar, o13, hVar2);
        s3.h hVar3 = s3.j.f110802f;
        u2.q qVar3 = qVar2;
        if (sVar.O || !Intrinsics.d(sVar.J(), Integer.valueOf(i16))) {
            ep.b.y(i16, sVar, i16, hVar3);
        }
        s3.h hVar4 = s3.j.f110799c;
        tb.f.f0(sVar, X, hVar4);
        sVar.W(-972902463);
        Object J2 = sVar.J();
        am.d dVar = i2.n.f71185a;
        if (J2 == dVar) {
            J2 = new w80.h1();
            sVar.g0(J2);
        }
        w80.h1 h1Var2 = (w80.h1) J2;
        Object d2 = jq.b.d(sVar, false, -972900542);
        y3 y3Var = y3.f71400a;
        if (d2 == dVar) {
            d2 = bs1.c.u1(Boolean.FALSE, y3Var);
            sVar.g0(d2);
        }
        i2.q1 q1Var2 = (i2.q1) d2;
        Object d13 = jq.b.d(sVar, false, -972898091);
        if (d13 == dVar) {
            fillElement = fillElement2;
            z13 = false;
            d13 = do2.g2.b(0, 1, co2.a.DROP_OLDEST, 1);
            sVar.g0(d13);
        } else {
            fillElement = fillElement2;
            z13 = false;
        }
        do2.x1 x1Var = (do2.x1) d13;
        Object d14 = jq.b.d(sVar, z13, -972885208);
        if (d14 == dVar) {
            d14 = bs1.c.u1(new a3.c(0L), y3Var);
            sVar.g0(d14);
        }
        i2.q1 q1Var3 = (i2.q1) d14;
        Object d15 = jq.b.d(sVar, false, -972883063);
        if (d15 == dVar) {
            function12 = function13;
            d15 = bs1.c.u1(new n4.j(0L), y3Var);
            sVar.g0(d15);
        } else {
            function12 = function13;
        }
        i2.q1 q1Var4 = (i2.q1) d15;
        sVar.r(false);
        FillElement fillElement3 = androidx.compose.foundation.layout.e.f17183b;
        p1.y a13 = p1.x.a(p1.l.f98545c, u2.b.f120026n, sVar, 48);
        int i17 = sVar.P;
        i2.z1 o14 = sVar.o();
        u2.q X2 = ao2.m0.X(sVar, fillElement3);
        if (!z14) {
            com.bumptech.glide.c.j0();
            throw null;
        }
        sVar.a0();
        if (sVar.O) {
            sVar.n(iVar);
        } else {
            sVar.j0();
        }
        tb.f.f0(sVar, a13, hVar);
        tb.f.f0(sVar, o14, hVar2);
        if (sVar.O || !Intrinsics.d(sVar.J(), Integer.valueOf(i17))) {
            ep.b.y(i17, sVar, i17, hVar3);
        }
        tb.f.f0(sVar, X2, hVar4);
        p1.a0 a0Var = p1.a0.f98480a;
        float A = com.bumptech.glide.d.A(eo1.c.space_200, sVar);
        u2.q r13 = androidx.compose.foundation.layout.b.r(androidx.compose.foundation.layout.e.b(nVar, 1.0f), 0.0f, A, 0.0f, 0.0f, 13);
        sVar.W(1183698500);
        Object J3 = sVar.J();
        if (J3 == dVar) {
            J3 = new s80.t2(h1Var2, 4);
            sVar.g0(J3);
        }
        sVar.r(false);
        g(state, r13, function12, (Function1) J3, sVar, ((i13 >> 9) & 896) | 3080, 0);
        androidx.compose.foundation.layout.a.a(androidx.compose.foundation.layout.e.c(nVar, A), sVar);
        sVar.W(-1081440665);
        s80.h hVar5 = state.f111595d;
        boolean z15 = hVar5.f111564b && androidx.compose.foundation.a.h(sVar);
        sVar.r(false);
        v3 a14 = j1.i.a(z15 ? 2 : 0, null, "Canvas border width animation", sVar, 384, 10);
        sVar.W(1183717359);
        long h10 = z15 ? g0.h(eo1.b.sema_color_border_decorative, sVar) : b3.w.f21389m;
        sVar.r(false);
        v3 a15 = i1.u1.a(h10, null, "Canvas border color animation", sVar, 384, 10);
        float S = b0.S(sVar);
        v1.h a16 = v1.i.a(S);
        FillElement fillElement4 = fillElement;
        u2.q b14 = androidx.compose.ui.draw.a.b(p1.z.a(a0Var, androidx.compose.foundation.layout.b.d(nVar, 0.5625f), 1.0f).j(fillElement4).j(new BorderModifierNodeElement(((n4.e) a14.getValue()).f89175a, new b3.z0(((b3.w) a15.getValue()).f21392a), a16)), a16);
        sVar.W(1183746352);
        Object J4 = sVar.J();
        int i18 = 6;
        if (J4 == dVar) {
            J4 = new sv.y(h1Var2, q1Var3, q1Var4, i18);
            sVar.g0(J4);
        }
        sVar.r(false);
        u2.q g13 = androidx.compose.ui.layout.b.g(b14, (Function1) J4);
        sVar.W(1183758144);
        int i19 = i13 & 458752;
        int i23 = i19 ^ 196608;
        Function1 function14 = function12;
        boolean z16 = (i23 > 131072 && sVar.h(function14)) || (i13 & 196608) == 131072;
        Object J5 = sVar.J();
        if (z16 || J5 == dVar) {
            q1Var = q1Var2;
            J5 = new s80.r2(function14, q1Var, 1);
            sVar.g0(J5);
        } else {
            q1Var = q1Var2;
        }
        Function1 function15 = (Function1) J5;
        sVar.r(false);
        sVar.W(1183766894);
        boolean z17 = (i23 > 131072 && sVar.h(function14)) || (i13 & 196608) == 131072;
        Object J6 = sVar.J();
        if (z17 || J6 == dVar) {
            J6 = new i1.f1(22, function14);
            sVar.g0(J6);
        }
        sVar.r(false);
        b0.a(state, fontManager, logger, rendererUtility, g13, S, 0L, hVar5.f111563a, function15, function14, (Function1) J6, new s80.s2(x1Var, q1Var, 1), sVar, ((i13 << 12) & 1879048192) | 4680, 0, 64);
        androidx.compose.foundation.layout.a.a(androidx.compose.foundation.layout.e.c(nVar, A), sVar);
        u2.q r14 = androidx.compose.foundation.layout.b.r(androidx.compose.foundation.layout.e.b(nVar, 1.0f), 0.0f, 0.0f, 0.0f, com.bumptech.glide.d.A(eo1.c.space_400, sVar), 7);
        sVar.W(1183799587);
        Object J7 = sVar.J();
        int i24 = 5;
        if (J7 == dVar) {
            h1Var = h1Var2;
            J7 = new s80.t2(h1Var, i24);
            sVar.g0(J7);
        } else {
            h1Var = h1Var2;
        }
        Function1 function16 = (Function1) J7;
        Object d16 = jq.b.d(sVar, false, 1183804131);
        if (d16 == dVar) {
            d16 = new s80.t2(h1Var, 6);
            sVar.g0(d16);
        }
        sVar.r(false);
        f(state, x1Var, r14, function16, (Function1) d16, function14, sVar, i19 | 27720, 0);
        sVar.r(true);
        n4.b bVar = (n4.b) sVar.m(t3.f2.f115983f);
        u2.q k13 = androidx.compose.foundation.layout.e.k(nVar, bVar.f0((int) (((n4.j) q1Var4.getValue()).f89186a >> 32)), bVar.f0((int) (((n4.j) q1Var4.getValue()).f89186a & 4294967295L)));
        sVar.W(-972744347);
        Object J8 = sVar.J();
        if (J8 == dVar) {
            J8 = new w1.o(i24, q1Var3);
            sVar.g0(J8);
        }
        sVar.r(false);
        el.a.f(state, null, androidx.compose.foundation.layout.b.j(k13, (Function1) J8), 1.0f, function14, sVar, ((i13 >> 3) & 57344) | 3080, 2);
        b0.p(state, h1Var, fillElement4, function14, false, sVar, ((i13 >> 6) & 7168) | 25016, 0);
        b0.r(state.f111599h, fillElement4, sVar, 56, 0);
        sVar.r(true);
        i2.f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new s80.p2(state, fontManager, logger, rendererUtility, qVar3, function14, i13, i14, 2);
        }
    }

    public static void e0(u91.h hVar, lb2.d dVar) {
        hVar.G0 = dVar;
    }

    public static final ArrayList e1(f30 pin, List pages) {
        Intrinsics.checkNotNullParameter(pages, "pages");
        Intrinsics.checkNotNullParameter(pin, "pin");
        List<dl1.s> list = pages;
        ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(list, 10));
        for (dl1.s sVar : list) {
            wo0 wo0Var = sVar instanceof wo0 ? (wo0) sVar : null;
            if (wo0Var != null) {
                wo0Var.f43312c = pin;
            }
            arrayList.add(sVar);
        }
        return arrayList;
    }

    public static final void f(s80.j jVar, do2.b2 b2Var, u2.q qVar, Function1 function1, Function1 function12, Function1 function13, i2.o oVar, int i13, int i14) {
        i2.s sVar = (i2.s) oVar;
        sVar.Y(1222173973);
        u2.q qVar2 = (i14 & 4) != 0 ? u2.n.f120041b : qVar;
        Function1 function14 = (i14 & 8) != 0 ? r3.f111782i : function1;
        Function1 function15 = (i14 & 16) != 0 ? s3.f111793i : function12;
        Function1 function16 = (i14 & 32) != 0 ? t3.f111802i : function13;
        r.b(jVar.f111611t ? s80.g.DefaultActionBar : jVar.f111596e.f111806b ? s80.g.ColorPicker : jVar.f111600i.f111833c ? s80.g.DrawingTool : jVar.f111597f.f128273a != null ? s80.g.DragBar : s80.g.Empty, qVar2, b1(null, sVar, 15), null, "Bottom panel animation", null, q2.i.c(2142268300, new s80.v3(function14, jVar, function16, function15, b2Var), sVar), sVar, ((i13 >> 3) & RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER) | 1597440, 40);
        i2.f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new i1.n(jVar, b2Var, qVar2, function14, function15, function16, i13, i14);
        }
    }

    public static void f0(yq1.h2 h2Var, cr1.a aVar) {
        h2Var.D0 = aVar;
    }

    public static final u6.e f1(u6.c cVar, Function1 callback) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(callback, "callback");
        u6.e eVar = new u6.e(cVar);
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(callback, "callback");
        vt1.a CREATION_CALLBACK_KEY = xe2.g.f134836d;
        Intrinsics.checkNotNullExpressionValue(CREATION_CALLBACK_KEY, "CREATION_CALLBACK_KEY");
        eVar.b(CREATION_CALLBACK_KEY, new al1.j(15, callback));
        return eVar;
    }

    public static final void g(s80.j jVar, u2.q qVar, Function1 function1, Function1 function12, i2.o oVar, int i13, int i14) {
        i2.s sVar = (i2.s) oVar;
        sVar.Y(-210443509);
        u2.q qVar2 = (i14 & 2) != 0 ? u2.n.f120041b : qVar;
        Function1 function13 = (i14 & 4) != 0 ? w3.f111837i : function1;
        Function1 function14 = (i14 & 8) != 0 ? x3.f111846i : function12;
        r.b(jVar.f111610s ? p7.DefaultActionBar : jVar.f111613v ? p7.ColorPickerActionBar : jVar.f111612u ? p7.DrawingToolActionBar : p7.Empty, qVar2, b1(s80.c7.f111489a, sVar, 14), null, "Top panel animation", null, q2.i.c(-460151786, new s80.z3(jVar, function13, function14, 0), sVar), sVar, (i13 & RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER) | 1597440, 40);
        i2.f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new s80.d3(jVar, qVar2, function13, function14, i13, i14, 1);
        }
    }

    public static void g0(fu.h hVar, u7 u7Var) {
        hVar.f62948v0 = u7Var;
    }

    public static boolean g1(Iterable iterable, Comparator comparator) {
        Object obj;
        comparator.getClass();
        iterable.getClass();
        if (iterable instanceof SortedSet) {
            obj = ((SortedSet) iterable).comparator();
            if (obj == null) {
                obj = gi.i0.f65074a;
            }
        } else {
            if (!(iterable instanceof gi.q0)) {
                return false;
            }
            obj = ((gi.f0) ((gi.q0) iterable)).f65065d;
        }
        return comparator.equals(obj);
    }

    public static final void h(uc0.l2 l2Var, i2.o oVar, int i13, int i14) {
        int i15;
        i2.s sVar = (i2.s) oVar;
        sVar.Y(666108415);
        if ((i13 & 14) == 0) {
            i15 = (((i14 & 1) == 0 && sVar.h(l2Var)) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i15 & 11) == 2 && sVar.z()) {
            sVar.Q();
        } else {
            sVar.S();
            if ((i13 & 1) != 0 && !sVar.y()) {
                sVar.Q();
                int i16 = i14 & 1;
            } else if ((i14 & 1) != 0) {
                sVar.X(1890788296);
                androidx.lifecycle.u1 a13 = v6.b.a(sVar);
                if (a13 == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                }
                xe2.g V = p2.V(a13, sVar);
                sVar.X(1729797275);
                androidx.lifecycle.l1 v03 = c3.v0(uc0.l2.class, a13, V, a13 instanceof androidx.lifecycle.k ? ((androidx.lifecycle.k) a13).getDefaultViewModelCreationExtras() : u6.a.f120754b, sVar);
                sVar.r(false);
                sVar.r(false);
                l2Var = (uc0.l2) v03;
            }
            sVar.s();
            i2.q1 z13 = bs1.c.z(l2Var.f121825e, sVar);
            l2Var.i(new uc0.i(new oc0.a(q2.i.c(-1057079753, new androidx.compose.foundation.lazy.layout.v(24, z13, l2Var), sVar))));
            gh0.b.d(((uc0.k2) z13.getValue()).f121810b, null, sVar, 8, 2);
        }
        i2.f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new yu.c(l2Var, i13, i14, 26);
        }
    }

    public static void h0(xc2.c cVar, vy.m mVar) {
        cVar.f134552b = mVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void i(java.lang.String r25, kotlin.jvm.functions.Function0 r26, u2.q r27, boolean r28, yl1.d r29, i2.o r30, int r31, int r32) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kh2.u2.i(java.lang.String, kotlin.jvm.functions.Function0, u2.q, boolean, yl1.d, i2.o, int, int):void");
    }

    public static void i0(yq1.h2 h2Var) {
        h2Var.getClass();
    }

    public static final void j(s80.j jVar, u2.q qVar, w80.c cVar, Function1 function1, Function1 function12, i2.o oVar, int i13, int i14) {
        w80.c cVar2;
        int i15;
        i2.s sVar = (i2.s) oVar;
        sVar.Y(660402732);
        u2.q qVar2 = (i14 & 2) != 0 ? u2.n.f120041b : qVar;
        if ((i14 & 4) != 0) {
            i15 = i13 & (-897);
            cVar2 = new w80.c();
        } else {
            cVar2 = cVar;
            i15 = i13;
        }
        Function1 function13 = (i14 & 8) != 0 ? o3.f111737i : function1;
        Function1 function14 = (i14 & 16) != 0 ? p3.f111753i : function12;
        h.e eVar = new h.e();
        sVar.W(1367383111);
        int i16 = (i13 & 7168) ^ 3072;
        boolean z13 = (i16 > 2048 && sVar.h(function13)) || (i13 & 3072) == 2048;
        Object J2 = sVar.J();
        am.d dVar = i2.n.f71185a;
        if (z13 || J2 == dVar) {
            J2 = new i1.f1(21, function13);
            sVar.g0(J2);
        }
        sVar.r(false);
        e.l o03 = gh0.b.o0(eVar, (Function1) J2, sVar);
        w80.b bVar = jVar.f111594c;
        u2.q j13 = androidx.compose.foundation.layout.e.b(qVar2, 1.0f).j(b0.y1(sVar));
        sVar.W(1367393851);
        boolean z14 = (i16 > 2048 && sVar.h(function13)) || (i13 & 3072) == 2048;
        Object J3 = sVar.J();
        if (z14 || J3 == dVar) {
            J3 = jq.b.o(15, function13, sVar);
        }
        Function0 function0 = (Function0) J3;
        sVar.r(false);
        sVar.W(1367395387);
        boolean z15 = (i16 > 2048 && sVar.h(function13)) || (i13 & 3072) == 2048;
        Object J4 = sVar.J();
        if (z15 || J4 == dVar) {
            J4 = jq.b.o(16, function13, sVar);
        }
        Function0 function02 = (Function0) J4;
        sVar.r(false);
        sVar.W(1367396890);
        boolean z16 = (i16 > 2048 && sVar.h(function13)) || (i13 & 3072) == 2048;
        Object J5 = sVar.J();
        if (z16 || J5 == dVar) {
            J5 = jq.b.o(17, function13, sVar);
        }
        Function0 function03 = (Function0) J5;
        sVar.r(false);
        int i17 = 1;
        s80.z2 z2Var = new s80.z2(function13, o03, i17);
        sVar.W(1367403453);
        if ((i16 <= 2048 || !sVar.h(function13)) && (i13 & 3072) != 2048) {
            i17 = 0;
        }
        Object J6 = sVar.J();
        if (i17 != 0 || J6 == dVar) {
            J6 = jq.b.o(18, function13, sVar);
        }
        sVar.r(false);
        w80.z.e(bVar, false, j13, cVar2, function0, function02, function03, z2Var, (Function0) J6, function14, true, sVar, ((i15 << 3) & 7168) | 48 | ((i15 << 15) & 1879048192), 6, 0);
        i2.f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new i1.s0(jVar, qVar2, cVar2, function13, function14, i13, i14, 4);
        }
    }

    public static void j0(u91.h hVar, lu1.b bVar) {
        hVar.H0 = bVar;
    }

    public static final void k(float f13, u2.q qVar, i2.o oVar, int i13, int i14) {
        int i15;
        i2.s sVar = (i2.s) oVar;
        sVar.Y(37223810);
        if ((i14 & 1) != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 14) == 0) {
            i15 = (sVar.e(f13) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 != 0) {
            i15 |= 48;
        } else if ((i13 & RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER) == 0) {
            i15 |= sVar.h(qVar) ? 32 : 16;
        }
        if ((i15 & 91) == 18 && sVar.z()) {
            sVar.Q();
        } else {
            if (i16 != 0) {
                qVar = u2.n.f120041b;
            }
            androidx.compose.foundation.layout.a.a(androidx.compose.foundation.layout.e.c(androidx.compose.foundation.layout.e.b(qVar, 1.0f), f13), sVar);
        }
        i2.f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new s80.a4(f13, qVar, i13, i14);
        }
    }

    public static void k0(xc2.c cVar, lu1.b bVar) {
        cVar.f134551a = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void l(int r28, int r29, i2.o r30, u2.q r31, kotlin.jvm.functions.Function1 r32) {
        /*
            Method dump skipped, instructions count: 395
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kh2.u2.l(int, int, i2.o, u2.q, kotlin.jvm.functions.Function1):void");
    }

    public static void l0(fu.h hVar, z70.m mVar) {
        hVar.f62949w0 = mVar;
    }

    public static final void m(w80.x1 x1Var, u2.q qVar, float f13, Function1 function1, Function1 function12, i2.o oVar, int i13, int i14) {
        i2.s sVar = (i2.s) oVar;
        sVar.Y(1466398864);
        u2.q qVar2 = (i14 & 2) != 0 ? u2.n.f120041b : qVar;
        float f14 = (i14 & 4) != 0 ? 0 : f13;
        Function1 function13 = (i14 & 8) != 0 ? s80.d4.f111502i : function1;
        Function1 function14 = (i14 & 16) != 0 ? e4.f111519i : function12;
        om1.f fVar = om1.f.TRANSPARENT_DARK_GRAY;
        u2.q j13 = qVar2.j(b0.y1(sVar));
        sVar.W(1145654550);
        int i15 = (i13 & 7168) ^ 3072;
        boolean z13 = (i15 > 2048 && sVar.h(function13)) || (i13 & 3072) == 2048;
        Object J2 = sVar.J();
        am.d dVar = i2.n.f71185a;
        if (z13 || J2 == dVar) {
            J2 = jq.b.o(21, function13, sVar);
        }
        Function0 function0 = (Function0) J2;
        sVar.r(false);
        sVar.W(1145656117);
        boolean z14 = (i15 > 2048 && sVar.h(function13)) || (i13 & 3072) == 2048;
        Object J3 = sVar.J();
        if (z14 || J3 == dVar) {
            J3 = jq.b.o(22, function13, sVar);
        }
        Function0 function02 = (Function0) J3;
        sVar.r(false);
        sVar.W(1145657653);
        boolean z15 = (i15 > 2048 && sVar.h(function13)) || (i13 & 3072) == 2048;
        Object J4 = sVar.J();
        if (z15 || J4 == dVar) {
            J4 = jq.b.o(23, function13, sVar);
        }
        Function0 function03 = (Function0) J4;
        sVar.r(false);
        sVar.W(1145659189);
        boolean z16 = (i15 > 2048 && sVar.h(function13)) || (i13 & 3072) == 2048;
        Object J5 = sVar.J();
        if (z16 || J5 == dVar) {
            J5 = jq.b.o(24, function13, sVar);
        }
        Function0 function04 = (Function0) J5;
        sVar.r(false);
        sVar.W(1145660725);
        boolean z17 = (i15 > 2048 && sVar.h(function13)) || (i13 & 3072) == 2048;
        Object J6 = sVar.J();
        if (z17 || J6 == dVar) {
            J6 = jq.b.o(25, function13, sVar);
        }
        sVar.r(false);
        w80.a1.c(x1Var, j13, fVar, f14, function0, function02, function03, function04, (Function0) J6, function14, sVar, ((i13 << 3) & 7168) | 392 | ((i13 << 15) & 1879048192), 0);
        i2.f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new s80.f4(x1Var, qVar2, f14, function13, function14, i13, i14, 0);
        }
    }

    public static void m0(fu.h hVar, a11.d dVar) {
        hVar.f62950x0 = dVar;
    }

    public static final float n(om1.e eVar, i2.o oVar) {
        i2.s sVar = (i2.s) oVar;
        sVar.W(1094893857);
        float f03 = ((n4.b) sVar.m(t3.f2.f115983f)).f0(dl2.b.F0((Context) sVar.m(AndroidCompositionLocals_androidKt.f17455b), eVar.getBackgroundSize()));
        sVar.r(false);
        return f03;
    }

    public static void n0(u91.h hVar, fr1.c cVar) {
        hVar.J0 = cVar;
    }

    public static final int o(ft0 ft0Var) {
        Intrinsics.checkNotNullParameter(ft0Var, "<this>");
        int intValue = ft0Var.k().intValue();
        return (intValue == 0 || intValue != 1) ? 4 : 0;
    }

    public static void o0(fu.h hVar, ni1.d dVar) {
        hVar.f62951y0 = dVar;
    }

    public static final String p(com.pinterest.api.model.r rVar) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        Map m13 = rVar.m();
        return (String) (m13 != null ? m13.get(String.valueOf(h92.c.GAM_AD_UNIT_ID.getValue())) : null);
    }

    public static void p0(fu.h hVar, lh0.g gVar) {
        hVar.f62952z0 = gVar;
    }

    public static void q(x92.b bVar) {
        gh0.b.A(bVar);
        bVar.h("board.images", "236x");
        bVar.e("board.description");
        bVar.e("board.archived_by_me_at");
        bVar.e("board.collaborator_requests_enabled");
        bVar.e("board.allow_homefeed_recommendations");
        lh0.g2 d2 = lh0.g2.f83370b.d();
        z3 z3Var = a4.f83298b;
        lh0.g1 g1Var = (lh0.g1) d2.f83373a;
        if (g1Var.o("android_secret_board_advertiser_education", "enabled", z3Var) || g1Var.l("android_secret_board_advertiser_education")) {
            bVar.e("board.has_active_ads");
            bVar.e("board.board_owner_has_active_ads");
        }
        bVar.e("board.is_ads_only");
    }

    public static void q0(u91.h hVar, lh0.m3 m3Var) {
        hVar.C0 = m3Var;
    }

    public static final void r(x92.b apiFieldsMap) {
        Intrinsics.checkNotNullParameter(apiFieldsMap, "apiFieldsMap");
        lh0.g2 d2 = lh0.g2.f83370b.d();
        df.j1.h(apiFieldsMap);
        apiFieldsMap.e("user.verified_identity");
        apiFieldsMap.e("user.is_verified_merchant");
        com.bumptech.glide.d.d(apiFieldsMap);
        apiFieldsMap.e("pin.is_full_width");
        z3 activate = a4.f83297a;
        if (d2.b("enabled_pinner_at_6", activate) || d2.b("enabled_pinner_at_6_2", activate)) {
            apiFieldsMap.e("user.profile_reach");
        }
        if (d2.b("enabled_pinner_at_6_follower_count_2", activate)) {
            apiFieldsMap.e("user.follower_count");
        }
        apiFieldsMap.e("explorearticle.aux_fields");
        apiFieldsMap.h("user.contextual_pin_image_urls", "345x");
        apiFieldsMap.h("user.recent_pin_images", "345x");
        Intrinsics.checkNotNullParameter("enabled", "group");
        Intrinsics.checkNotNullParameter(activate, "activate");
        lh0.z0 z0Var = d2.f83373a;
        if (!((lh0.g1) z0Var).o("srp_featured_boards_module_experiment", "enabled", activate)) {
            Intrinsics.checkNotNullParameter("employees", "group");
            Intrinsics.checkNotNullParameter(activate, "activate");
            if (!((lh0.g1) z0Var).o("srp_featured_boards_module_experiment", "employees", activate)) {
                return;
            }
        }
        pk.a0.b(apiFieldsMap);
        apiFieldsMap.e("board.board_order_modified_at");
        apiFieldsMap.e("board.collaborator_count");
        apiFieldsMap.e("board.pin_count");
        apiFieldsMap.e("board.section_count");
        n60.o.w(apiFieldsMap, "board.collaborated_by_me", "board.collaborating_users()", "board.followed_by_me", "board.image_cover_hd_url");
        n60.o.A(apiFieldsMap, "board.images", "236x", "board.has_custom_cover", "board.is_collaborative");
        apiFieldsMap.e("board.owner()");
    }

    public static void r0(s61.e eVar, so.i3 i3Var) {
        eVar.f111234s0 = i3Var;
    }

    public static Uri s(Uri uri, Map map) {
        Uri.Builder buildUpon = uri.buildUpon();
        for (Map.Entry entry : map.entrySet()) {
            buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        return buildUpon.build();
    }

    public static void s0(s61.e eVar, so.f3 f3Var) {
        eVar.f111233r0 = f3Var;
    }

    public static void t(CaptureRequest.Builder builder, androidx.camera.core.impl.v0 v0Var) {
        gc.c b13 = u.a.d(v0Var).b();
        for (androidx.camera.core.impl.c cVar : b13.a()) {
            CaptureRequest.Key key = (CaptureRequest.Key) cVar.f16811c;
            try {
                builder.set(key, b13.f(cVar));
            } catch (IllegalArgumentException unused) {
                m0.s("Camera2CaptureRequestBuilder", "CaptureRequest.Key is not supported: " + key);
            }
        }
    }

    public static void t0(s61.e eVar, r61.b bVar) {
        eVar.f111235t0 = bVar;
    }

    public static void u(CaptureRequest.Builder builder, int i13, n3.b bVar) {
        Map emptyMap;
        if (i13 == 3 && bVar.f89033a) {
            HashMap hashMap = new HashMap();
            hashMap.put(CaptureRequest.CONTROL_CAPTURE_INTENT, 1);
            emptyMap = Collections.unmodifiableMap(hashMap);
        } else {
            if (i13 != 4) {
                bVar.getClass();
            } else if (bVar.f89034b) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put(CaptureRequest.CONTROL_CAPTURE_INTENT, 2);
                emptyMap = Collections.unmodifiableMap(hashMap2);
            }
            emptyMap = Collections.emptyMap();
        }
        for (Map.Entry entry : emptyMap.entrySet()) {
            builder.set((CaptureRequest.Key) entry.getKey(), entry.getValue());
        }
    }

    public static void u0(e21.v vVar, m60.g0 g0Var) {
        vVar.A0 = g0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0053, code lost:
    
        if ((!r8) == false) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x005f -> B:10:0x0062). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object v(n3.l0 r7, bl2.c r8) {
        /*
            boolean r0 = r8 instanceof m1.d1
            if (r0 == 0) goto L13
            r0 = r8
            m1.d1 r0 = (m1.d1) r0
            int r1 = r0.f85316t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f85316t = r1
            goto L18
        L13:
            m1.d1 r0 = new m1.d1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f85315s
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f85316t
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            n3.l0 r7 = r0.f85314r
            ue.c.H(r8)
            goto L62
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            ue.c.H(r8)
            n3.o0 r8 = r7.f89088f
            n3.j r8 = r8.f89101s
            java.util.List r8 = r8.f89070a
            int r2 = r8.size()
            r5 = r4
        L40:
            if (r5 >= r2) goto L51
            java.lang.Object r6 = r8.get(r5)
            n3.q r6 = (n3.q) r6
            boolean r6 = r6.f89110d
            if (r6 == 0) goto L4e
            r8 = r3
            goto L52
        L4e:
            int r5 = r5 + 1
            goto L40
        L51:
            r8 = r4
        L52:
            r8 = r8 ^ r3
            if (r8 != 0) goto L7b
        L55:
            n3.k r8 = n3.k.Final
            r0.f85314r = r7
            r0.f85316t = r3
            java.lang.Object r8 = r7.a(r8, r0)
            if (r8 != r1) goto L62
            return r1
        L62:
            n3.j r8 = (n3.j) r8
            java.util.List r8 = r8.f89070a
            int r2 = r8.size()
            r5 = r4
        L6b:
            if (r5 >= r2) goto L7b
            java.lang.Object r6 = r8.get(r5)
            n3.q r6 = (n3.q) r6
            boolean r6 = r6.f89110d
            if (r6 == 0) goto L78
            goto L55
        L78:
            int r5 = r5 + 1
            goto L6b
        L7b:
            kotlin.Unit r7 = kotlin.Unit.f80348a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kh2.u2.v(n3.l0, bl2.c):java.lang.Object");
    }

    public static void v0(yq1.h2 h2Var, rr1.g gVar) {
        h2Var.C0 = gVar;
    }

    public static final Object w(n3.w wVar, Function2 function2, bl2.c cVar) {
        Object M0 = ((n3.o0) wVar).M0(new m1.e1(null, cVar.getContext(), function2), cVar);
        return M0 == cl2.a.COROUTINE_SUSPENDED ? M0 : Unit.f80348a;
    }

    public static void w0(e21.v vVar, x02.i2 i2Var) {
        vVar.f56991z0 = i2Var;
    }

    public static final void x(GestaltButtonToggle gestaltButtonToggle, Function1 init) {
        Intrinsics.checkNotNullParameter(gestaltButtonToggle, "<this>");
        Intrinsics.checkNotNullParameter(init, "init");
        bm1.v vVar = new bm1.v(gestaltButtonToggle.u());
        init.invoke(vVar);
        gestaltButtonToggle.s(new ql1.k(vVar, 10));
    }

    public static void x0(u91.h hVar, lb0.q qVar) {
        hVar.I0 = qVar;
    }

    public static final void y(GestaltRadioButton gestaltRadioButton, gg0.a init) {
        Intrinsics.checkNotNullParameter(gestaltRadioButton, "<this>");
        Intrinsics.checkNotNullParameter(init, "init");
        an1.h hVar = new an1.h((an1.e) ((u50.o) gestaltRadioButton.f49487f.f33803a));
        init.invoke(hVar);
        an1.i nextState = new an1.i(hVar, 0);
        Intrinsics.checkNotNullParameter(nextState, "nextState");
        com.google.firebase.messaging.q qVar = gestaltRadioButton.f49487f;
    }

    public static void y0(e21.v vVar, uk1.e eVar) {
        vVar.B0 = eVar;
    }

    public static final void z(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "<this>");
        c3.w(recyclerView, true, yf0.a.f138951j);
    }

    public static void z0(u91.h hVar, uk1.e eVar) {
        hVar.D0 = eVar;
    }
}
