package kh2;

import a.i7;
import a.qf;
import ads_mobile_sdk.j51;
import ads_mobile_sdk.jc0;
import ads_mobile_sdk.k51;
import ads_mobile_sdk.kb1;
import ads_mobile_sdk.o51;
import ads_mobile_sdk.p51;
import ads_mobile_sdk.sj;
import ads_mobile_sdk.x41;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.hardware.camera2.CameraDevice;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Log;
import android.view.inputmethod.EditorInfo;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import c50.ma;
import com.pinterest.activity.web.WebViewActivity;
import com.pinterest.analytics.ContextLogRequestMetrics$Log$Payload;
import com.pinterest.analytics.kibana.KibanaMetrics;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.bg;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.iw;
import com.pinterest.api.model.m70;
import com.pinterest.api.model.mw0;
import com.pinterest.api.model.nw0;
import com.pinterest.api.model.oq;
import com.pinterest.api.model.ow0;
import com.pinterest.api.model.pw0;
import com.pinterest.api.model.qq;
import com.pinterest.api.model.qw0;
import com.pinterest.api.model.rw0;
import com.pinterest.api.model.tl;
import com.pinterest.api.model.vq;
import com.pinterest.api.model.wy0;
import com.pinterest.api.model.zk0;
import com.pinterest.component.alert.AlertContainer;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.ideaPinCreation.camera.view.IdeaPinCreationCameraView;
import com.pinterest.feature.mediagallery.MediaGalleryActivity;
import com.pinterest.feature.newshub.feed.view.NewsHubEmptyStateView;
import com.pinterest.feature.search.typeahead.view.TypeaheadSearchBarContainer;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.textcomposer.GestaltTextComposer;
import h32.a4;
import java.io.File;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedSet;
import java.util.UUID;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.CharsKt;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import okhttp3.internal.Util;
import s80.b7;
import s80.l7;
import s80.y6;
import so.d4;
import so.f8;
import so.h9;
import so.k5;
import so.l8;
import so.n5;
import so.p8;
import so.r8;
import so.s6;
import so.w7;
import so.z4;

/* loaded from: classes4.dex */
public abstract class g3 {
    public static final SpannableStringBuilder A(Context context, List list, int i13, Function0 function0) {
        Resources resources = context.getResources();
        String string = resources.getString(d70.g.revamp_board_first_collaborators_placeholder);
        Intrinsics.f(string);
        if (list.size() == 1 && list.size() == i13) {
            nk0.a aVar = (nk0.a) list.get(0);
            return f0.h.B(context, string, "%1$s", aVar.f91091a, eo1.b.color_themed_text_default, new nk0.b(aVar.f91092b));
        }
        if (list.size() == 2 && list.size() == i13) {
            nk0.a aVar2 = (nk0.a) list.get(0);
            nk0.a aVar3 = (nk0.a) list.get(1);
            String[] strArr = {aVar2.f91091a, aVar3.f91091a};
            cf0.b[] bVarArr = {new nk0.b(aVar2.f91092b), new nk0.b(aVar3.f91092b)};
            String string2 = resources.getString(d70.g.revamp_board_two_collaborators_placeholder);
            Intrinsics.f(string2);
            return f0.h.C(context, string2, new String[]{"%1$s", "%2$s"}, strArr, bVarArr, eo1.b.color_themed_text_default);
        }
        if (list.size() < 2 || list.size() >= i13) {
            return new SpannableStringBuilder();
        }
        nk0.a aVar4 = (nk0.a) list.get(0);
        int i14 = i13 - 1;
        String string3 = resources.getString(d70.g.revamp_board_owner_and_collaborators_placeholder);
        Intrinsics.f(string3);
        SpannableStringBuilder B = f0.h.B(context, string3, "%1$s", aVar4.f91091a, eo1.b.color_themed_text_default, new nk0.b(aVar4.f91092b));
        String quantityString = resources.getQuantityString(d70.f.lego_board_other_collaborators_placeholder, i14, Integer.valueOf(i14));
        Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
        SpannableStringBuilder append = B.append((CharSequence) " ").append((CharSequence) f0.h.B(context, quantityString, "%1$s", String.valueOf(i14), eo1.b.color_themed_text_default, new nk0.b(function0)));
        Intrinsics.f(append);
        return append;
    }

    public static void A0(eu.e eVar, lh0.d dVar) {
        eVar.V0 = dVar;
    }

    public static void A1(mv0.r rVar, p8 p8Var) {
        rVar.f88396h1 = p8Var;
    }

    public static final ex0.c A2(xu1.i networkType) {
        Intrinsics.checkNotNullParameter(networkType, "networkType");
        int i13 = uv0.l.f123177a[networkType.ordinal()];
        if (i13 == 1) {
            return ex0.c.NONE;
        }
        if (i13 == 2) {
            return ex0.c.WIFI;
        }
        if (i13 == 3) {
            return ex0.c.MOBILE;
        }
        if (i13 == 4) {
            return ex0.c.BOTH;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final h32.c1 B(String str, String str2, String str3) {
        Boolean bool = Boolean.FALSE;
        return new h32.c1(null, bool, null, Boolean.TRUE, bool, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new t22.a(str3 != null ? StringsKt.h0(str3) : null, str, str2 != null ? StringsKt.h0(str2) : null), null, null, null);
    }

    public static void B0(ht0.m mVar, r8 r8Var) {
        mVar.f70122r0 = r8Var;
    }

    public static void B1(rz0.c cVar, so.m1 m1Var) {
        cVar.A0 = m1Var;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final Map B2(y80.a aVar, Context context) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (y80.c cVar : aVar.getSections()) {
            String id3 = cVar.getId();
            if (id3 != null) {
                switch (id3.hashCode()) {
                    case -1914290424:
                        if (id3.equals("welcome_section")) {
                            for (y80.d dVar : cVar.getSteps()) {
                                if (Intrinsics.d(dVar.getId(), "welcome_step_1")) {
                                    linkedHashMap.put(b7.InitialWelcome, ma.c(cVar, dVar));
                                }
                            }
                            break;
                        } else {
                            break;
                        }
                    case -1137889108:
                        if (id3.equals("reorder_layers_section")) {
                            for (y80.d dVar2 : cVar.getSteps()) {
                                String id4 = dVar2.getId();
                                if (id4 != null) {
                                    int hashCode = id4.hashCode();
                                    if (hashCode != 47637122) {
                                        switch (hashCode) {
                                            case 1916864727:
                                                if (id4.equals("reorder_layers_step_1")) {
                                                    linkedHashMap.put(b7.ReorderCutoutWelcome, ma.c(cVar, dVar2));
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            case 1916864728:
                                                if (id4.equals("reorder_layers_step_2")) {
                                                    linkedHashMap.put(b7.ReorderCutoutInstruct, ma.c(cVar, dVar2));
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            case 1916864729:
                                                if (id4.equals("reorder_layers_step_3")) {
                                                    linkedHashMap.put(b7.ReorderCutoutInstructWhilePressing, ma.c(cVar, dVar2));
                                                    break;
                                                } else {
                                                    break;
                                                }
                                        }
                                    } else if (id4.equals("reorder_layers_step_try_again")) {
                                        linkedHashMap.put(b7.ReorderCutoutInstructTryAgain, ma.c(cVar, dVar2));
                                    }
                                }
                            }
                            break;
                        } else {
                            break;
                        }
                        break;
                    case -344181031:
                        if (id3.equals("add_layer_section")) {
                            for (y80.d dVar3 : cVar.getSteps()) {
                                String id5 = dVar3.getId();
                                if (Intrinsics.d(id5, "add_layer_step_0")) {
                                    linkedHashMap.put(b7.RevisitWelcome, ma.c(cVar, dVar3));
                                } else if (Intrinsics.d(id5, "add_layer_step_1")) {
                                    linkedHashMap.put(b7.AddCutoutInstruct, ma.c(cVar, dVar3));
                                }
                            }
                            break;
                        } else {
                            break;
                        }
                    case -283590472:
                        if (id3.equals("background_color_section")) {
                            for (y80.d dVar4 : cVar.getSteps()) {
                                String id6 = dVar4.getId();
                                if (id6 != null) {
                                    switch (id6.hashCode()) {
                                        case 1390233419:
                                            if (id6.equals("background_color_step_1")) {
                                                linkedHashMap.put(b7.ChangeBackgroundColorWelcome, ma.c(cVar, dVar4));
                                                break;
                                            } else {
                                                break;
                                            }
                                        case 1390233420:
                                            if (id6.equals("background_color_step_2")) {
                                                linkedHashMap.put(b7.ChangeBackgroundColorInstruct, ma.c(cVar, dVar4));
                                                break;
                                            } else {
                                                break;
                                            }
                                        case 1390233421:
                                            if (id6.equals("background_color_step_3")) {
                                                linkedHashMap.put(b7.ChangeBackgroundColorComplete, ma.c(cVar, dVar4));
                                                break;
                                            } else {
                                                break;
                                            }
                                    }
                                }
                            }
                            break;
                        } else {
                            break;
                        }
                    case 2119488670:
                        if (id3.equals("revisit_section")) {
                            for (y80.d dVar5 : cVar.getSteps()) {
                                if (Intrinsics.d(dVar5.getId(), "revisit_step_1")) {
                                    linkedHashMap.put(b7.Tips, ma.c(cVar, dVar5));
                                    b7 b7Var = b7.TipsGoBack;
                                    String title = cVar.getTitle();
                                    String str = title == null ? "" : title;
                                    String title2 = dVar5.getTitle();
                                    String str2 = title2 == null ? "" : title2;
                                    String subTitle = dVar5.getSubTitle();
                                    String str3 = subTitle == null ? "" : subTitle;
                                    String continueButtonText = dVar5.getContinueButtonText();
                                    String str4 = continueButtonText == null ? "" : continueButtonText;
                                    String dismissButtonText = dVar5.getDismissButtonText();
                                    if (dismissButtonText == null || dismissButtonText.length() == 0) {
                                        dismissButtonText = null;
                                    }
                                    if (dismissButtonText == null) {
                                        dismissButtonText = context.getString(l7.onboarding_revisit_step_secondary_button);
                                        Intrinsics.checkNotNullExpressionValue(dismissButtonText, "getString(...)");
                                    }
                                    linkedHashMap.put(b7Var, new y6(str, str2, str3, str4, dismissButtonText, 480));
                                }
                            }
                            break;
                        } else {
                            break;
                        }
                        break;
                }
            }
        }
        return Util.B(linkedHashMap);
    }

    public static final String C(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return !kotlin.text.z.p(str, "https://", false) ? "https://".concat(str) : str;
    }

    public static void C0(eu.e eVar, f8 f8Var) {
        eVar.R0 = f8Var;
    }

    public static void C1(u31.f fVar, so.u1 u1Var) {
        fVar.R0 = u1Var;
    }

    public static boolean C2(int i13, Context context, String str) {
        h6.q a13 = ph.b.a(context);
        a13.getClass();
        try {
            AppOpsManager appOpsManager = (AppOpsManager) a13.f67746a.getSystemService("appops");
            if (appOpsManager == null) {
                throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
            }
            appOpsManager.checkPackage(i13, str);
            return true;
        } catch (SecurityException unused) {
            return false;
        }
    }

    public static byte[] D(ArrayDeque arrayDeque, int i13) {
        if (arrayDeque.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) arrayDeque.remove();
        if (bArr.length == i13) {
            return bArr;
        }
        int length = i13 - bArr.length;
        byte[] copyOf = Arrays.copyOf(bArr, i13);
        while (length > 0) {
            byte[] bArr2 = (byte[]) arrayDeque.remove();
            int min = Math.min(length, bArr2.length);
            System.arraycopy(bArr2, 0, copyOf, i13 - length, min);
            length -= min;
        }
        return copyOf;
    }

    public static void D0(eu.e eVar, es.h hVar) {
        eVar.Y0 = hVar;
    }

    public static void D1(hp0.t tVar, uk1.e eVar) {
        tVar.f69865g0 = eVar;
    }

    public static final void D2(zd1.c0 c0Var, ArrayList filterList, boolean z13, boolean z14) {
        Integer num;
        int i13;
        zd1.g gVar;
        String str;
        zd1.w F;
        Intrinsics.checkNotNullParameter(c0Var, "<this>");
        Intrinsics.checkNotNullParameter(filterList, "filterList");
        Iterator it = filterList.iterator();
        while (it.hasNext()) {
            zd1.h hVar = (zd1.h) it.next();
            t32.f c13 = hVar.c();
            Object obj = null;
            if (c13 != null) {
                num = Integer.valueOf(c13.getValue());
            } else {
                if (z14) {
                    zd1.q b13 = hVar.b();
                    Intrinsics.checkNotNullParameter(b13, "<this>");
                    int i14 = de1.q0.f54636b[b13.ordinal()];
                    t32.f fVar = i14 != 1 ? i14 != 2 ? null : t32.f.PRODUCT_MERCHANT : t32.f.PRODUCT_PRICE;
                    if (fVar != null) {
                        num = Integer.valueOf(fVar.getValue());
                    }
                }
                num = null;
            }
            boolean z15 = z14 && num != null;
            if (hVar instanceof zd1.r) {
                zd1.r rVar = (zd1.r) hVar;
                String str2 = rVar.f141754i;
                if (str2 != null) {
                    if (rVar.f141748c != rVar.f141751f || ((rVar.f141749d != (i13 = rVar.f141752g) && rVar.f141750e != i13) || !z14)) {
                        zd1.w G = G(rVar, z15, z14);
                        if (G != null) {
                            Iterator it2 = c0Var.getFilterSpecs().iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                Object next = it2.next();
                                if (Intrinsics.d(((zd1.w) next).getFilterId(), str2)) {
                                    obj = next;
                                    break;
                                }
                            }
                            zd1.w wVar = (zd1.w) obj;
                            if (wVar != null) {
                                wVar.getFilterOptionList().clear();
                                wVar.getFilterOptionList().addAll(G.getFilterOptionList());
                            } else {
                                c0Var.getFilterSpecs().add(G);
                            }
                        }
                    }
                }
            } else if ((hVar instanceof zd1.g) && (str = (gVar = (zd1.g) hVar).f141714e) != null && (F = F(gVar, z15, z14)) != null && ((gVar.f141719j && gVar.f141721l) || z13)) {
                Iterator it3 = c0Var.getFilterSpecs().iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    Object next2 = it3.next();
                    if (Intrinsics.d(((zd1.w) next2).getFilterId(), str)) {
                        obj = next2;
                        break;
                    }
                }
                zd1.w wVar2 = (zd1.w) obj;
                if (wVar2 == null) {
                    c0Var.getFilterSpecs().add(F);
                } else if (z13 && gVar.f141719j) {
                    List filterOptionList = F.getFilterOptionList();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : filterOptionList) {
                        zd1.a0 a0Var = (zd1.a0) obj2;
                        List filterOptionList2 = wVar2.getFilterOptionList();
                        if (!(filterOptionList2 instanceof Collection) || !filterOptionList2.isEmpty()) {
                            Iterator it4 = filterOptionList2.iterator();
                            while (it4.hasNext()) {
                                if (Intrinsics.d(a0Var.getFilterOptionId(), ((zd1.a0) it4.next()).getFilterOptionId())) {
                                    break;
                                }
                            }
                        }
                        arrayList.add(obj2);
                    }
                    wVar2.getFilterOptionList().addAll(arrayList);
                } else if (z13) {
                    wVar2.getFilterOptionList().removeAll(F.getFilterOptionList());
                } else {
                    wVar2.getFilterOptionList().clear();
                    wVar2.getFilterOptionList().addAll(F.getFilterOptionList());
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0048 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0049 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String E(android.content.Context r6, java.lang.String r7, java.lang.String r8) {
        /*
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            if (r7 != 0) goto L8
            return r8
        L8:
            java.lang.String r0 = "assets"
            r1 = 0
            boolean r0 = kotlin.text.StringsKt.E(r7, r0, r1)
            r2 = 0
            if (r0 == 0) goto L37
            xk2.q r0 = xk2.s.f135225b     // Catch: java.lang.Throwable -> L2f
            android.content.res.AssetManager r6 = r6.getAssets()     // Catch: java.lang.Throwable -> L2f
            java.lang.String r0 = "://"
            r3 = 6
            int r0 = kotlin.text.StringsKt.L(r7, r0, r1, r1, r3)     // Catch: java.lang.Throwable -> L2f
            int r0 = r0 + 3
            java.lang.String r7 = r7.substring(r0)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r0 = "substring(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r0)     // Catch: java.lang.Throwable -> L2f
            java.io.InputStream r6 = r6.open(r7)     // Catch: java.lang.Throwable -> L2f
            goto L46
        L2f:
            r6 = move-exception
            xk2.q r7 = xk2.s.f135225b
            ue.c.m(r6)
        L35:
            r6 = r2
            goto L46
        L37:
            xk2.q r6 = xk2.s.f135225b     // Catch: java.lang.Throwable -> L3f
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L3f
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L3f
            goto L46
        L3f:
            r6 = move-exception
            xk2.q r7 = xk2.s.f135225b
            ue.c.m(r6)
            goto L35
        L46:
            if (r6 != 0) goto L49
            return r8
        L49:
            java.io.ByteArrayOutputStream r7 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L75
            r7.<init>()     // Catch: java.lang.Throwable -> L75
            r0 = 16
            byte[] r3 = new byte[r0]     // Catch: java.lang.Throwable -> L5d
        L52:
            int r4 = r6.read(r3, r1, r0)     // Catch: java.lang.Throwable -> L5d
            r5 = -1
            if (r4 == r5) goto L5f
            r7.write(r3, r1, r4)     // Catch: java.lang.Throwable -> L5d
            goto L52
        L5d:
            r0 = move-exception
            goto L77
        L5f:
            byte[] r0 = r7.toByteArray()     // Catch: java.lang.Throwable -> L5d
            java.lang.String r1 = "buffer.toByteArray()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r0 = s0(r0)     // Catch: java.lang.Throwable -> L5d
            dl2.b.J(r7, r2)     // Catch: java.lang.Throwable -> L75
            dl2.b.J(r6, r2)     // Catch: java.lang.Throwable -> L73
            return r0
        L73:
            r6 = move-exception
            goto L83
        L75:
            r7 = move-exception
            goto L7d
        L77:
            throw r0     // Catch: java.lang.Throwable -> L78
        L78:
            r1 = move-exception
            dl2.b.J(r7, r0)     // Catch: java.lang.Throwable -> L75
            throw r1     // Catch: java.lang.Throwable -> L75
        L7d:
            throw r7     // Catch: java.lang.Throwable -> L7e
        L7e:
            r0 = move-exception
            dl2.b.J(r6, r7)     // Catch: java.lang.Throwable -> L73
            throw r0     // Catch: java.lang.Throwable -> L73
        L83:
            xk2.q r7 = xk2.s.f135225b
            ue.c.m(r6)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kh2.g3.E(android.content.Context, java.lang.String, java.lang.String):java.lang.String");
    }

    public static void E0(eu.e eVar, lh0.g gVar) {
        eVar.U0 = gVar;
    }

    public static void E1(bb1.p pVar, uk1.e eVar) {
        pVar.f22537j0 = eVar;
    }

    public static boolean E2(u4.g gVar, u4.g gVar2, u4.g gVar3, u4.g gVar4) {
        u4.g gVar5;
        u4.g gVar6;
        u4.g gVar7 = u4.g.FIXED;
        return (gVar3 == gVar7 || gVar3 == (gVar6 = u4.g.WRAP_CONTENT) || (gVar3 == u4.g.MATCH_PARENT && gVar != gVar6)) || (gVar4 == gVar7 || gVar4 == (gVar5 = u4.g.WRAP_CONTENT) || (gVar4 == u4.g.MATCH_PARENT && gVar2 != gVar5));
    }

    public static final zd1.w F(zd1.g gVar, boolean z13, boolean z14) {
        zd1.a0 yVar;
        Integer e03 = e0(gVar, z14);
        String[] strArr = {gVar.f141714e, gVar.f141713d};
        for (int i13 = 0; i13 < 2; i13++) {
            if (strArr[i13] == null) {
                return null;
            }
        }
        ArrayList A = kotlin.collections.c0.A(strArr);
        String str = (String) A.get(0);
        String str2 = (String) A.get(1);
        t32.i iVar = gVar.f141718i;
        if (iVar != null) {
            yVar = new zd1.b0(str2, iVar);
        } else {
            Integer num = gVar.f141725p;
            if (num != null) {
                if (num.intValue() <= 0) {
                    num = null;
                }
                if (num != null) {
                    yVar = new zd1.z(str2, num.intValue(), null);
                }
            }
            String str3 = gVar.f141724o;
            yVar = str3 != null ? new zd1.y(str2, str3) : null;
            if (yVar == null) {
                yVar = new zd1.x(str2);
            }
        }
        ArrayList l13 = kotlin.collections.f0.l(yVar);
        if (!z13) {
            e03 = null;
        }
        return new zd1.w(str, l13, e03);
    }

    public static void F0(eu.e eVar, jv.a aVar) {
        eVar.W0 = aVar;
    }

    public static void F1(kl0.z zVar, uk1.e eVar) {
        zVar.Z0 = eVar;
    }

    public static final zd1.w G(zd1.r rVar, boolean z13, boolean z14) {
        Integer e03 = e0(rVar, z14);
        String[] strArr = {rVar.f141754i, rVar.f141755j, rVar.f141756k};
        for (int i13 = 0; i13 < 3; i13++) {
            if (strArr[i13] == null) {
                return null;
            }
        }
        ArrayList A = kotlin.collections.c0.A(strArr);
        String str = (String) A.get(0);
        String str2 = (String) A.get(1);
        String str3 = (String) A.get(2);
        zd1.a0[] a0VarArr = new zd1.a0[2];
        int i14 = rVar.f141751f;
        String str4 = rVar.f141753h;
        a0VarArr[0] = new zd1.z(str2, i14, z13 ? str4 : null);
        int i15 = rVar.f141752g;
        if (!z13) {
            str4 = null;
        }
        a0VarArr[1] = new zd1.z(str3, i15, str4);
        ArrayList l13 = kotlin.collections.f0.l(a0VarArr);
        if (!z13) {
            e03 = null;
        }
        return new zd1.w(str, l13, e03);
    }

    public static void G0(lu.k kVar, so.l lVar) {
        kVar.R0 = lVar;
    }

    public static void G1(kx0.o oVar, uk1.e eVar) {
        oVar.S0 = eVar;
    }

    public static final int H(ArrayList arrayList, t32.i iVar) {
        ArrayList arrayList2;
        zd1.u uVar;
        ArrayList arrayList3;
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        if (arrayList.isEmpty()) {
            return 0;
        }
        ArrayList<zd1.r> arrayList4 = new ArrayList();
        for (Object obj : arrayList) {
            if (obj instanceof zd1.r) {
                arrayList4.add(obj);
            }
        }
        int i13 = 0;
        for (zd1.r rVar : arrayList4) {
            if (rVar.f141750e <= rVar.f141752g) {
                if (rVar.f141748c != rVar.f141751f) {
                }
            }
            i13++;
        }
        ArrayList arrayList5 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (obj2 instanceof zd1.v) {
                arrayList5.add(obj2);
            }
        }
        ArrayList arrayList6 = new ArrayList();
        for (Object obj3 : arrayList5) {
            if (((zd1.v) obj3).f141771f) {
                arrayList6.add(obj3);
            }
        }
        int size = arrayList6.size() + i13;
        ArrayList arrayList7 = new ArrayList();
        for (Object obj4 : arrayList) {
            if (obj4 instanceof zd1.g) {
                arrayList7.add(obj4);
            }
        }
        ArrayList arrayList8 = new ArrayList();
        for (Object obj5 : arrayList7) {
            zd1.g gVar = (zd1.g) obj5;
            if (iVar != null) {
                if (gVar.f141719j && gVar.f141718i != iVar) {
                    arrayList8.add(obj5);
                }
            } else if (gVar.f141719j) {
                arrayList8.add(obj5);
            }
        }
        int size2 = arrayList8.size() + size;
        ArrayList arrayList9 = new ArrayList();
        for (Object obj6 : arrayList) {
            if (obj6 instanceof zd1.a) {
                arrayList9.add(obj6);
            }
        }
        ArrayList arrayList10 = new ArrayList();
        for (Object obj7 : arrayList9) {
            if (((zd1.a) obj7).f141681d) {
                arrayList10.add(obj7);
            }
        }
        int size3 = arrayList10.size() + size2;
        ArrayList arrayList11 = new ArrayList();
        for (Object obj8 : arrayList) {
            if (obj8 instanceof zd1.d) {
                arrayList11.add(obj8);
            }
        }
        zd1.d dVar = (zd1.d) CollectionsKt.firstOrNull(arrayList11);
        if (dVar == null || (arrayList3 = dVar.f141703c) == null) {
            arrayList2 = null;
        } else {
            arrayList2 = new ArrayList();
            for (Object obj9 : arrayList3) {
                if (((zd1.b) obj9).f141686e) {
                    arrayList2.add(obj9);
                }
            }
        }
        int size4 = size3 + (arrayList2 != null ? arrayList2.size() : 0);
        ArrayList arrayList12 = new ArrayList();
        for (Object obj10 : arrayList) {
            if (obj10 instanceof zd1.c) {
                arrayList12.add(obj10);
            }
        }
        ArrayList arrayList13 = new ArrayList();
        for (Object obj11 : arrayList12) {
            if (((zd1.c) obj11).f141696g) {
                arrayList13.add(obj11);
            }
        }
        int size5 = arrayList13.size() + size4;
        ArrayList arrayList14 = new ArrayList();
        for (Object obj12 : arrayList) {
            if (obj12 instanceof zd1.s) {
                arrayList14.add(obj12);
            }
        }
        zd1.s sVar = (zd1.s) CollectionsKt.firstOrNull(arrayList14);
        return (sVar == null || (uVar = sVar.f141763d) == null || uVar == zd1.u.MOST_RELEVANT) ? size5 : size5 + 1;
    }

    public static void H0(yq1.u0 u0Var, vy.m mVar) {
        u0Var.f140033c0 = mVar;
    }

    public static void H1(rz0.c cVar, uk1.e eVar) {
        cVar.f110238z0 = eVar;
    }

    public static r72.e1 I(an0.g gVar) {
        Object obj;
        ql2.k kVar;
        Object obj2;
        int i13;
        List list;
        an0.c cVar;
        ArrayList arrayList;
        List list2;
        int i14;
        boolean z13;
        double d2;
        r72.l1 c13;
        float f13;
        List list3;
        List list4;
        Object obj3;
        Iterable iterable;
        Object obj4;
        Object obj5;
        r72.l1 c14;
        an0.g gVar2 = gVar;
        Intrinsics.checkNotNullParameter(gVar2, "<this>");
        String str = gVar2.f15653a;
        boolean d13 = Intrinsics.d(str, "2001001");
        int i15 = 10;
        List list5 = gVar2.f15664l;
        List list6 = gVar2.f15663k;
        if (d13) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj6 : list5) {
                Integer valueOf = Integer.valueOf(((an0.d) obj6).f15641e);
                Object obj7 = linkedHashMap.get(valueOf);
                if (obj7 == null) {
                    obj7 = new ArrayList();
                    linkedHashMap.put(valueOf, obj7);
                }
                ((List) obj7).add(obj6);
            }
            ArrayList arrayList2 = new ArrayList(linkedHashMap.size());
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                int intValue = ((Number) entry.getKey()).intValue();
                List list7 = (List) entry.getValue();
                String value = String.valueOf(intValue);
                Intrinsics.checkNotNullParameter(value, "value");
                ArrayList arrayList3 = new ArrayList();
                for (Object obj8 : list6) {
                    if (!kg.a.S((r72.z1) obj8)) {
                        arrayList3.add(obj8);
                    }
                }
                ArrayList arrayList4 = new ArrayList(kotlin.collections.g0.q(arrayList3, i15));
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    r72.z1 z1Var = (r72.z1) it.next();
                    Iterator it2 = list7.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj3 = null;
                            break;
                        }
                        obj3 = it2.next();
                        if (Intrinsics.d(((an0.d) obj3).f15637a, z1Var.b())) {
                            break;
                        }
                    }
                    an0.d dVar = (an0.d) obj3;
                    if (dVar == null || (iterable = dVar.f15648l) == null) {
                        iterable = kotlin.collections.q0.f80391a;
                    }
                    Iterable iterable2 = iterable;
                    Iterator it3 = iterable2.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            obj4 = null;
                            break;
                        }
                        obj4 = it3.next();
                        if (((an0.c) obj4) instanceof an0.a) {
                            break;
                        }
                    }
                    an0.a aVar = (an0.a) obj4;
                    Iterator it4 = iterable2.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            obj5 = null;
                            break;
                        }
                        obj5 = it4.next();
                        if (((an0.c) obj5) instanceof an0.b) {
                            break;
                        }
                    }
                    an0.b bVar = (an0.b) obj5;
                    String value2 = z1Var.b();
                    Intrinsics.checkNotNullParameter(value2, "value");
                    if (bVar == null || (c14 = bVar.f15634b) == null) {
                        c14 = z1Var.c();
                    }
                    arrayList4.add(f2(value2, 0.0f, dVar == null || dVar.f15641e != intValue, c14, (aVar != null ? aVar.f15629b : z1Var.e()) * 1.0d, RecyclerViewTypes.VIEW_TYPE_SCHEDULED_PIN_SECTION_HEADER));
                }
                zn2.a aVar2 = zn2.b.f142311b;
                an0.d dVar2 = (an0.d) CollectionsKt.firstOrNull(list7);
                arrayList2.add(new r72.d1(value, dl2.b.P2(dVar2 != null ? dVar2.f15650n : 0, zn2.d.MILLISECONDS), arrayList4, r72.h1.LINEAR));
                i15 = 10;
            }
            return new r72.e1(arrayList2, r72.f1.NORMAL);
        }
        if (!Intrinsics.d(str, "2003003")) {
            return null;
        }
        List list8 = list5;
        Iterator it5 = list8.iterator();
        if (!it5.hasNext()) {
            throw new NoSuchElementException();
        }
        int size = ((an0.d) it5.next()).f15648l.size();
        while (it5.hasNext()) {
            int size2 = ((an0.d) it5.next()).f15648l.size();
            if (size < size2) {
                size = size2;
            }
        }
        List list9 = list6;
        ArrayList arrayList5 = new ArrayList();
        for (Object obj9 : list9) {
            if (!kg.a.S((r72.z1) obj9)) {
                arrayList5.add(obj9);
            }
        }
        ArrayList arrayList6 = new ArrayList(kotlin.collections.g0.q(arrayList5, 10));
        Iterator it6 = arrayList5.iterator();
        while (it6.hasNext()) {
            r72.z1 z1Var2 = (r72.z1) it6.next();
            double e13 = z1Var2.e() * 1.0d;
            String value3 = z1Var2.b();
            Intrinsics.checkNotNullParameter(value3, "value");
            arrayList6.add(f2(value3, 0.0f, false, new r72.l1(z1Var2.c().f106535a, z1Var2.c().f106536b), e13, RecyclerViewTypes.VIEW_TYPE_SCHEDULED_PIN_SECTION_HEADER));
        }
        IntRange q13 = ql2.s.q(0, size);
        int i16 = 10;
        ArrayList arrayList7 = new ArrayList(kotlin.collections.g0.q(q13, 10));
        ql2.k it7 = q13.iterator();
        while (it7.f104109c) {
            int b13 = it7.b();
            ArrayList arrayList8 = new ArrayList(kotlin.collections.g0.q(arrayList6, i16));
            Iterator it8 = arrayList6.iterator();
            int i17 = 0;
            while (it8.hasNext()) {
                r72.g1 g1Var = (r72.g1) it8.next();
                Iterator it9 = list9.iterator();
                while (true) {
                    if (!it9.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it9.next();
                    if (Intrinsics.d(((r72.z1) obj).b(), g1Var.f106479a)) {
                        break;
                    }
                }
                r72.z1 z1Var3 = (r72.z1) obj;
                Iterator it10 = list8.iterator();
                while (true) {
                    if (!it10.hasNext()) {
                        kVar = it7;
                        obj2 = null;
                        break;
                    }
                    obj2 = it10.next();
                    kVar = it7;
                    if (Intrinsics.d(((an0.d) obj2).f15637a, g1Var.f106479a)) {
                        break;
                    }
                    it7 = kVar;
                }
                an0.d dVar3 = (an0.d) obj2;
                if (dVar3 == null || (list4 = dVar3.f15648l) == null || (cVar = (an0.c) CollectionsKt.U(b13, list4)) == null) {
                    i13 = i17;
                    list = list8;
                    cVar = null;
                } else {
                    int[] other = new int[0];
                    Intrinsics.checkNotNullParameter(other, "other");
                    i13 = (int) (((cVar.b() - cVar.a()) / gVar2.f15661i) * 1000);
                    list = list8;
                }
                double d14 = g1Var.f106486h;
                boolean z14 = cVar instanceof an0.a;
                Iterator it11 = it8;
                r72.l1 l1Var = g1Var.f106482d;
                if (z14) {
                    an0.a aVar3 = (an0.a) cVar;
                    double d15 = aVar3.f15629b;
                    if (z1Var3 == null || (c13 = z1Var3.c()) == null) {
                        arrayList = arrayList7;
                        list2 = list;
                        d2 = d15;
                        i14 = i13;
                    } else {
                        if (dVar3 == null || (list3 = dVar3.f15648l) == null) {
                            list2 = list;
                            d2 = d15;
                        } else {
                            list2 = list;
                            ArrayList arrayList9 = new ArrayList();
                            for (Object obj10 : list3) {
                                double d16 = d15;
                                if (obj10 instanceof an0.a) {
                                    arrayList9.add(obj10);
                                }
                                d15 = d16;
                            }
                            d2 = d15;
                            an0.a aVar4 = (an0.a) CollectionsKt.firstOrNull(arrayList9);
                            if (aVar4 != null) {
                                f13 = aVar4.f15628a;
                                double d17 = aVar3.f15629b / f13;
                                arrayList = arrayList7;
                                i14 = i13;
                                l1Var = new r72.l1(c13.f106535a * d17, c13.f106536b * d17);
                            }
                        }
                        f13 = 1.0f;
                        double d172 = aVar3.f15629b / f13;
                        arrayList = arrayList7;
                        i14 = i13;
                        l1Var = new r72.l1(c13.f106535a * d172, c13.f106536b * d172);
                    }
                    d14 = d2;
                } else {
                    arrayList = arrayList7;
                    list2 = list;
                    i14 = i13;
                }
                if (cVar instanceof an0.b) {
                    r72.l1 l1Var2 = ((an0.b) cVar).f15634b;
                    double d18 = l1Var2.f106535a;
                    d14 = g1Var.f106486h;
                    l1Var = new r72.l1(d18 * d14, l1Var2.f106536b * d14);
                }
                r72.l1 l1Var3 = l1Var;
                double d19 = d14;
                if (dVar3 != null && dVar3.f15649m) {
                    z13 = b13 == size + (-1);
                    arrayList8.add(r72.g1.a(g1Var, z13, l1Var3, d19, RecyclerViewTypes.VIEW_TYPE_ANNOUNCEMENT_MODAL_TYPE_ONE));
                    arrayList7 = arrayList;
                    it8 = it11;
                    i17 = i14;
                    it7 = kVar;
                    list8 = list2;
                    gVar2 = gVar;
                }
                z13 = g1Var.f106481c;
                arrayList8.add(r72.g1.a(g1Var, z13, l1Var3, d19, RecyclerViewTypes.VIEW_TYPE_ANNOUNCEMENT_MODAL_TYPE_ONE));
                arrayList7 = arrayList;
                it8 = it11;
                i17 = i14;
                it7 = kVar;
                list8 = list2;
                gVar2 = gVar;
            }
            ql2.k kVar2 = it7;
            ArrayList arrayList10 = arrayList7;
            String value4 = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(value4, "toString(...)");
            Intrinsics.checkNotNullParameter(value4, "value");
            zn2.a aVar5 = zn2.b.f142311b;
            arrayList10.add(new r72.d1(value4, dl2.b.P2(i17, zn2.d.MILLISECONDS), arrayList8, r72.h1.SMOOTH));
            arrayList7 = arrayList10;
            arrayList6 = arrayList8;
            it7 = kVar2;
            list8 = list8;
            i16 = 10;
            gVar2 = gVar;
        }
        return new r72.e1(arrayList7, r72.f1.NORMAL);
    }

    public static void I0(yq1.u0 u0Var, lb2.q qVar) {
        u0Var.f140034d0 = qVar;
    }

    public static void I1(sc1.b bVar, uk1.e eVar) {
        bVar.f112295k0 = eVar;
    }

    public static r72.e1 J(an0.g gVar) {
        float f13;
        int i13;
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        String str = gVar.f15653a;
        boolean d2 = Intrinsics.d(str, "2001001");
        String str2 = "value";
        List list = gVar.f15663k;
        if (!d2) {
            if (!Intrinsics.d(str, "2003003")) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            String value = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(value, "toString(...)");
            Intrinsics.checkNotNullParameter(value, "value");
            List list2 = list;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list2) {
                if (kg.a.S((r72.z1) obj)) {
                    arrayList2.add(obj);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof r72.y1) {
                    arrayList3.add(next);
                }
            }
            ArrayList arrayList4 = new ArrayList(kotlin.collections.g0.q(arrayList3, 10));
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                r72.y1 y1Var = (r72.y1) it2.next();
                String value2 = y1Var.f106721a;
                Intrinsics.checkNotNullParameter(value2, "value");
                arrayList4.add(f2(value2, 0.0f, false, y1Var.f106722b, y1Var.f106723c * 1.0d, RecyclerViewTypes.VIEW_TYPE_SIMPLE_IMAGE_CELL));
            }
            zn2.a aVar = zn2.b.f142311b;
            arrayList.add(new r72.d1(value, dl2.b.P2(2380, zn2.d.MILLISECONDS), arrayList4, r72.h1.LINEAR));
            String value3 = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(value3, "toString(...)");
            Intrinsics.checkNotNullParameter(value3, "value");
            ArrayList arrayList5 = new ArrayList();
            for (Object obj2 : list2) {
                if (kg.a.S((r72.z1) obj2)) {
                    arrayList5.add(obj2);
                }
            }
            ArrayList arrayList6 = new ArrayList();
            Iterator it3 = arrayList5.iterator();
            while (it3.hasNext()) {
                Object next2 = it3.next();
                if (next2 instanceof r72.y1) {
                    arrayList6.add(next2);
                }
            }
            ArrayList arrayList7 = new ArrayList(kotlin.collections.g0.q(arrayList6, 10));
            Iterator it4 = arrayList6.iterator();
            int i14 = 0;
            while (it4.hasNext()) {
                Object next3 = it4.next();
                int i15 = i14 + 1;
                if (i14 < 0) {
                    kotlin.collections.f0.p();
                    throw null;
                }
                r72.y1 y1Var2 = (r72.y1) next3;
                boolean z13 = i14 == 0;
                String value4 = y1Var2.f106721a;
                Intrinsics.checkNotNullParameter(value4, "value");
                r72.l1 l1Var = y1Var2.f106722b;
                Iterator it5 = it4;
                arrayList7.add(f2(value4, 0.0f, false, r72.l1.a(l1Var, l1Var.f106536b + (z13 ? -20.0f : 0.0f)), y1Var2.f106723c * 1.0d, RecyclerViewTypes.VIEW_TYPE_SIMPLE_IMAGE_CELL));
                i14 = i15;
                it4 = it5;
            }
            zn2.a aVar2 = zn2.b.f142311b;
            arrayList.add(new r72.d1(value3, dl2.b.P2(RecyclerViewTypes.VIEW_TYPE_BUBBLE_CATEGORY_REP, zn2.d.MILLISECONDS), arrayList7, r72.h1.LINEAR));
            String value5 = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(value5, "toString(...)");
            Intrinsics.checkNotNullParameter(value5, "value");
            ArrayList arrayList8 = new ArrayList();
            for (Object obj3 : list2) {
                if (kg.a.S((r72.z1) obj3)) {
                    arrayList8.add(obj3);
                }
            }
            ArrayList arrayList9 = new ArrayList();
            Iterator it6 = arrayList8.iterator();
            while (it6.hasNext()) {
                Object next4 = it6.next();
                if (next4 instanceof r72.y1) {
                    arrayList9.add(next4);
                }
            }
            ArrayList arrayList10 = new ArrayList(kotlin.collections.g0.q(arrayList9, 10));
            Iterator it7 = arrayList9.iterator();
            int i16 = 0;
            while (it7.hasNext()) {
                Object next5 = it7.next();
                int i17 = i16 + 1;
                if (i16 < 0) {
                    kotlin.collections.f0.p();
                    throw null;
                }
                r72.y1 y1Var3 = (r72.y1) next5;
                boolean z14 = i16 == 0;
                String value6 = y1Var3.f106721a;
                Intrinsics.checkNotNullParameter(value6, "value");
                r72.l1 l1Var2 = y1Var3.f106722b;
                double d13 = l1Var2.f106536b;
                if (z14) {
                    i13 = i17;
                    f13 = -20.0f;
                } else {
                    f13 = i16 * (-7.0f);
                    i13 = i17;
                }
                arrayList10.add(f2(value6, 0.0f, z14, r72.l1.a(l1Var2, d13 + f13), y1Var3.f106723c * 1.0d, RecyclerViewTypes.VIEW_TYPE_SCHEDULED_PIN_SECTION_HEADER));
                i16 = i13;
            }
            zn2.a aVar3 = zn2.b.f142311b;
            arrayList.add(new r72.d1(value5, dl2.b.P2(RecyclerViewTypes.VIEW_TYPE_STORY_EDUCATION_BANNER, zn2.d.MILLISECONDS), arrayList10, r72.h1.LINEAR));
            String value7 = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(value7, "toString(...)");
            Intrinsics.checkNotNullParameter(value7, "value");
            ArrayList arrayList11 = new ArrayList();
            for (Object obj4 : list2) {
                if (kg.a.S((r72.z1) obj4)) {
                    arrayList11.add(obj4);
                }
            }
            ArrayList arrayList12 = new ArrayList();
            Iterator it8 = arrayList11.iterator();
            while (it8.hasNext()) {
                Object next6 = it8.next();
                if (next6 instanceof r72.y1) {
                    arrayList12.add(next6);
                }
            }
            ArrayList arrayList13 = new ArrayList(kotlin.collections.g0.q(arrayList12, 10));
            Iterator it9 = arrayList12.iterator();
            while (it9.hasNext()) {
                r72.y1 y1Var4 = (r72.y1) it9.next();
                String value8 = y1Var4.f106721a;
                Intrinsics.checkNotNullParameter(value8, "value");
                r72.l1 l1Var3 = y1Var4.f106722b;
                arrayList13.add(f2(value8, 0.0f, true, r72.l1.a(l1Var3, l1Var3.f106536b), y1Var4.f106723c * 1.0d, RecyclerViewTypes.VIEW_TYPE_SCHEDULED_PIN_SECTION_HEADER));
            }
            zn2.a aVar4 = zn2.b.f142311b;
            arrayList.add(new r72.d1(value7, dl2.b.P2(5000, zn2.d.MILLISECONDS), arrayList13, r72.h1.LINEAR));
            return new r72.e1(arrayList, r72.f1.NORMAL);
        }
        Iterator it10 = gVar.f15664l.iterator();
        if (!it10.hasNext()) {
            throw new NoSuchElementException();
        }
        int i18 = ((an0.d) it10.next()).f15651o;
        while (it10.hasNext()) {
            int i19 = ((an0.d) it10.next()).f15651o;
            if (i18 < i19) {
                i18 = i19;
            }
        }
        ArrayList arrayList14 = new ArrayList();
        String value9 = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(value9, "toString(...)");
        Intrinsics.checkNotNullParameter(value9, "value");
        List list3 = list;
        ArrayList arrayList15 = new ArrayList();
        for (Object obj5 : list3) {
            if (kg.a.S((r72.z1) obj5)) {
                arrayList15.add(obj5);
            }
        }
        ArrayList arrayList16 = new ArrayList(kotlin.collections.g0.q(arrayList15, 10));
        Iterator it11 = arrayList15.iterator();
        while (it11.hasNext()) {
            r72.z1 z1Var = (r72.z1) it11.next();
            String value10 = z1Var.b();
            Intrinsics.checkNotNullParameter(value10, "value");
            arrayList16.add(f2(value10, 0.0f, true, z1Var.c(), z1Var.e() * 1.0d, RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER));
        }
        zn2.a aVar5 = zn2.b.f142311b;
        zn2.d dVar = zn2.d.MILLISECONDS;
        arrayList14.add(new r72.d1(value9, zn2.b.k(dl2.b.P2(i18, dVar), dl2.b.P2(2380, dVar)), arrayList16, r72.h1.LINEAR));
        String value11 = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(value11, "toString(...)");
        Intrinsics.checkNotNullParameter(value11, "value");
        ArrayList arrayList17 = new ArrayList();
        for (Object obj6 : list3) {
            if (kg.a.S((r72.z1) obj6)) {
                arrayList17.add(obj6);
            }
        }
        ArrayList arrayList18 = new ArrayList();
        Iterator it12 = arrayList17.iterator();
        while (it12.hasNext()) {
            Object next7 = it12.next();
            if (next7 instanceof r72.y1) {
                arrayList18.add(next7);
            }
        }
        ArrayList arrayList19 = new ArrayList(kotlin.collections.g0.q(arrayList18, 10));
        Iterator it13 = arrayList18.iterator();
        int i23 = 0;
        while (it13.hasNext()) {
            Object next8 = it13.next();
            int i24 = i23 + 1;
            if (i23 < 0) {
                kotlin.collections.f0.p();
                throw null;
            }
            r72.y1 y1Var5 = (r72.y1) next8;
            boolean z15 = i23 == 0;
            String value12 = y1Var5.f106721a;
            Intrinsics.checkNotNullParameter(value12, "value");
            r72.l1 l1Var4 = y1Var5.f106722b;
            Iterator it14 = it13;
            arrayList19.add(f2(value12, 1.0f, z15, r72.l1.a(l1Var4, l1Var4.f106536b + (!z15 ? 15.0f : 0.0f)), y1Var5.f106723c * 1.0d, RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER));
            i23 = i24;
            it13 = it14;
        }
        zn2.a aVar6 = zn2.b.f142311b;
        arrayList14.add(new r72.d1(value11, dl2.b.P2(RecyclerViewTypes.VIEW_TYPE_STORY_EDUCATION_BANNER, zn2.d.MILLISECONDS), arrayList19, r72.h1.LINEAR));
        String value13 = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(value13, "toString(...)");
        Intrinsics.checkNotNullParameter(value13, "value");
        ArrayList arrayList20 = new ArrayList();
        for (Object obj7 : list3) {
            if (kg.a.S((r72.z1) obj7)) {
                arrayList20.add(obj7);
            }
        }
        ArrayList arrayList21 = new ArrayList();
        Iterator it15 = arrayList20.iterator();
        while (it15.hasNext()) {
            Object next9 = it15.next();
            if (next9 instanceof r72.y1) {
                arrayList21.add(next9);
            }
        }
        ArrayList arrayList22 = new ArrayList(kotlin.collections.g0.q(arrayList21, 10));
        Iterator it16 = arrayList21.iterator();
        int i25 = 0;
        while (it16.hasNext()) {
            Object next10 = it16.next();
            int i26 = i25 + 1;
            if (i25 < 0) {
                kotlin.collections.f0.p();
                throw null;
            }
            r72.y1 y1Var6 = (r72.y1) next10;
            String str3 = y1Var6.f106721a;
            Intrinsics.checkNotNullParameter(str3, str2);
            r72.l1 l1Var5 = y1Var6.f106722b;
            arrayList22.add(f2(str3, 1.0f, false, r72.l1.a(l1Var5, l1Var5.f106536b + 15.0f), y1Var6.f106723c * 1.0d, RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER));
            i25 = i26;
            str2 = str2;
        }
        String str4 = str2;
        zn2.a aVar7 = zn2.b.f142311b;
        arrayList14.add(new r72.d1(value13, dl2.b.P2(RecyclerViewTypes.VIEW_TYPE_STORY_EDUCATION_BANNER, zn2.d.MILLISECONDS), arrayList22, r72.h1.LINEAR));
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
        Intrinsics.checkNotNullParameter(uuid, str4);
        ArrayList arrayList23 = new ArrayList();
        for (Object obj8 : list3) {
            if (kg.a.S((r72.z1) obj8)) {
                arrayList23.add(obj8);
            }
        }
        ArrayList arrayList24 = new ArrayList();
        Iterator it17 = arrayList23.iterator();
        while (it17.hasNext()) {
            Object next11 = it17.next();
            if (next11 instanceof r72.y1) {
                arrayList24.add(next11);
            }
        }
        ArrayList arrayList25 = new ArrayList(kotlin.collections.g0.q(arrayList24, 10));
        Iterator it18 = arrayList24.iterator();
        int i27 = 0;
        while (it18.hasNext()) {
            Object next12 = it18.next();
            int i28 = i27 + 1;
            if (i27 < 0) {
                kotlin.collections.f0.p();
                throw null;
            }
            r72.y1 y1Var7 = (r72.y1) next12;
            String str5 = y1Var7.f106721a;
            Intrinsics.checkNotNullParameter(str5, str4);
            r72.l1 l1Var6 = y1Var7.f106722b;
            arrayList25.add(f2(str5, 1.0f, false, r72.l1.a(l1Var6, l1Var6.f106536b + 15.0f), y1Var7.f106723c * 1.0d, RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER));
            i27 = i28;
        }
        zn2.a aVar8 = zn2.b.f142311b;
        arrayList14.add(new r72.d1(uuid, dl2.b.P2(2200, zn2.d.MILLISECONDS), arrayList25, r72.h1.LINEAR));
        return new r72.e1(arrayList14, r72.f1.NORMAL);
    }

    public static void J0(yq1.u0 u0Var, com.pinterest.identity.authentication.a aVar) {
        u0Var.f140035e0 = aVar;
    }

    public static void J1(u31.f fVar, uk1.e eVar) {
        fVar.U0 = eVar;
    }

    public static CameraDevice.StateCallback K(ArrayList arrayList) {
        return arrayList.isEmpty() ? new v.l1() : arrayList.size() == 1 ? (CameraDevice.StateCallback) arrayList.get(0) : new v.v1(arrayList);
    }

    public static void K0(WebViewActivity webViewActivity, lu1.b bVar) {
        webViewActivity.f35240d = bVar;
    }

    public static void K1(kl0.z zVar) {
        zVar.f80141j1 = r41.k.f106176a;
    }

    public static final ThreadPoolExecutor L(String str, hd.n nVar, boolean z13) {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN);
        hd.d dVar = new hd.d(0, str, nVar);
        return new ThreadPoolExecutor(z13 ? 1 : 0, 1, 30L, TimeUnit.SECONDS, linkedBlockingQueue, dVar);
    }

    public static void L0(kl0.z zVar) {
        zVar.getClass();
    }

    public static void L1(hp0.t tVar, so.o1 o1Var) {
        tVar.f69866h0 = o1Var;
    }

    public static final String M(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        StringBuilder sb3 = new StringBuilder();
        sb3.append(key);
        return a.a.p(sb3, ":", value);
    }

    public static void M0(kl0.z zVar, z4 z4Var) {
        zVar.f80133c1 = z4Var;
    }

    public static void M1(v02.j jVar, so.u2 u2Var) {
        jVar.f123795j0 = u2Var;
    }

    public static final ArrayList N(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((zd1.h) it.next()).a());
        }
        return arrayList2;
    }

    public static void N0(kl0.z zVar, g70.h hVar) {
        zVar.f80142k1 = hVar;
    }

    public static void N1(TypeaheadSearchBarContainer typeaheadSearchBarContainer, lh0.f3 f3Var) {
        typeaheadSearchBarContainer.f47922c = f3Var;
    }

    public static boolean O(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return false;
        }
        boolean z13 = true;
        for (File file2 : listFiles) {
            z13 = O(file2) && z13;
        }
        return z13;
    }

    public static void O0(kl0.z zVar, gi2.b bVar) {
        zVar.f80138g1 = bVar;
    }

    public static void O1(rz0.c cVar, e01.a aVar) {
        cVar.B0 = aVar;
    }

    public static String P(double d2) {
        return d2 < 1.0d ? "less than a second" : d2 < 60.0d ? X("%s second", d2) : d2 < 3600.0d ? X("%s minute", Q(d2, 60.0d)) : d2 < 86400.0d ? X("%s hour", Q(d2, 3600.0d)) : d2 < 2678400.0d ? X("%s day", Q(d2, 86400.0d)) : d2 < 3.21408E7d ? X("%s month", Q(d2, 2678400.0d)) : d2 < 3.21408E9d ? X("%s year", Q(d2, 3.21408E7d)) : "centuries";
    }

    public static void P0(kl0.z zVar, d4 d4Var) {
        zVar.W0 = d4Var;
    }

    public static void P1(kl0.z zVar, androidx.appcompat.widget.c2 c2Var) {
        zVar.f80140i1 = c2Var;
    }

    public static double Q(double d2, double d13) {
        return BigDecimal.valueOf(d2).divide(BigDecimal.valueOf(d13), RoundingMode.HALF_DOWN).doubleValue();
    }

    public static void Q0(kl0.z zVar, x02.x0 x0Var) {
        zVar.R0 = x0Var;
    }

    public static void Q1(eu.e eVar, c82.d dVar) {
        eVar.S0 = dVar;
    }

    public static final Object R(vd0.c experienceJsonObject, int i13) {
        Intrinsics.checkNotNullParameter(experienceJsonObject, "experienceJsonObject");
        hh0.c displayDataDeserializer = hh0.c.f69135j;
        Intrinsics.checkNotNullParameter(experienceJsonObject, "experienceJsonObject");
        Intrinsics.checkNotNullParameter(displayDataDeserializer, "displayDataDeserializer");
        try {
            xk2.q qVar = xk2.s.f135225b;
            String i03 = kotlin.jvm.internal.r.i0(experienceJsonObject, "id");
            String i04 = kotlin.jvm.internal.r.i0(experienceJsonObject, "experience_id");
            String i05 = kotlin.jvm.internal.r.i0(experienceJsonObject, "placement_id");
            vd0.c m13 = experienceJsonObject.m("display_data");
            if (m13 == null) {
                m13 = new vd0.c("{}");
            }
            Object obj = ((xk2.s) displayDataDeserializer.invoke(new hh0.f(i04, i05, i13, m13))).f135226a;
            Throwable a13 = xk2.s.a(obj);
            return a13 == null ? new hh0.e(i03, i04, i05, i13, (hh0.b) obj) : ue.c.m(a13);
        } catch (Throwable th3) {
            xk2.q qVar2 = xk2.s.f135225b;
            return ue.c.m(th3);
        }
    }

    public static void R0(kl0.z zVar, x02.z0 z0Var) {
        zVar.T0 = z0Var;
    }

    public static void R1(kl0.z zVar, k5 k5Var) {
        zVar.f80144m1 = k5Var;
    }

    public static final ArrayList S(lm0.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        ArrayList l23 = l2(aVar);
        ArrayList arrayList = new ArrayList();
        Iterator it = l23.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            Boolean o43 = ((f30) next).o4();
            Intrinsics.checkNotNullExpressionValue(o43, "getFavoritedByMe(...)");
            if (o43.booleanValue()) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public static void S0(kl0.z zVar) {
        zVar.f80131b1 = jl0.a.f76935a;
    }

    public static void S1(ev0.l lVar, h22.f fVar) {
        lVar.B0 = fVar;
    }

    public static final ArrayList T(List list, RectF canvasRect) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(canvasRect, "canvasRect");
        RectF rectF = new RectF(0.0f, 0.0f, canvasRect.width(), canvasRect.height());
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            vq rotatedRect = ((qq) obj).getConfig().getRotatedRect();
            if (rotatedRect != null) {
                PointF topLeft = rotatedRect.getTopLeft();
                if (!rectF.contains(topLeft.x, topLeft.y)) {
                    PointF topRight = rotatedRect.getTopRight();
                    if (!rectF.contains(topRight.x, topRight.y)) {
                        PointF bottomLeft = rotatedRect.getBottomLeft();
                        if (!rectF.contains(bottomLeft.x, bottomLeft.y)) {
                            PointF bottomRight = rotatedRect.getBottomRight();
                            if (rectF.contains(bottomRight.x, bottomRight.y)) {
                            }
                        }
                    }
                }
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    public static void T0(kx0.o oVar, pb0.a aVar) {
        oVar.U0 = aVar;
    }

    public static void T1(ht0.m mVar, g92.f fVar) {
        mVar.f70125u0 = fVar;
    }

    public static final od2.d U(ke2.i iVar, r72.j0 j0Var) {
        Object obj;
        String e13 = y72.b.e(j0Var);
        Object obj2 = null;
        if (e13 == null) {
            return null;
        }
        od2.c cVar = iVar.f79343k;
        if (cVar != null) {
            if (!Intrinsics.d(cVar.f94185a, e13)) {
                cVar = null;
            }
            if (cVar != null) {
                return cVar;
            }
        }
        Iterator it = iVar.f79341i.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.d(((od2.b) obj).f94185a, e13)) {
                break;
            }
        }
        od2.b bVar = (od2.b) obj;
        if (bVar != null) {
            return bVar;
        }
        Iterator it2 = iVar.f79342j.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (Intrinsics.d(((od2.a) next).f94185a, e13)) {
                obj2 = next;
                break;
            }
        }
        return (od2.d) obj2;
    }

    public static void U0(kl0.z zVar, se2.a aVar) {
        zVar.f80143l1 = aVar;
    }

    public static void U1(WebViewActivity webViewActivity, vo.u uVar) {
        webViewActivity.f35239c = uVar;
    }

    public static final nd2.b V(ke2.i iVar, r72.j0 j0Var) {
        String e13 = y72.b.e(j0Var);
        Object obj = null;
        if (e13 == null) {
            return null;
        }
        Iterator it = iVar.f79340h.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (Intrinsics.d(((nd2.b) next).f90426a, e13)) {
                obj = next;
                break;
            }
        }
        return (nd2.b) obj;
    }

    public static void V0(q91.m mVar, so.o0 o0Var) {
        mVar.f103143z0 = o0Var;
    }

    public static void V1(MediaGalleryActivity mediaGalleryActivity, vo.u uVar) {
        mediaGalleryActivity.f46719l = uVar;
    }

    public static v4.r W(u4.h hVar, int i13, ArrayList arrayList, v4.r rVar) {
        int i14;
        int i15 = i13 == 0 ? hVar.f120235t0 : hVar.f120237u0;
        if (i15 != -1 && (rVar == null || i15 != rVar.f124013b)) {
            int i16 = 0;
            while (true) {
                if (i16 >= arrayList.size()) {
                    break;
                }
                v4.r rVar2 = (v4.r) arrayList.get(i16);
                if (rVar2.f124013b == i15) {
                    if (rVar != null) {
                        rVar.c(i13, rVar2);
                        arrayList.remove(rVar);
                    }
                    rVar = rVar2;
                } else {
                    i16++;
                }
            }
        } else if (i15 != -1) {
            return rVar;
        }
        if (rVar == null) {
            if (hVar instanceof u4.o) {
                u4.o oVar = (u4.o) hVar;
                int i17 = 0;
                while (true) {
                    if (i17 >= oVar.f120279w0) {
                        i14 = -1;
                        break;
                    }
                    u4.h hVar2 = oVar.f120278v0[i17];
                    if ((i13 == 0 && (i14 = hVar2.f120235t0) != -1) || (i13 == 1 && (i14 = hVar2.f120237u0) != -1)) {
                        break;
                    }
                    i17++;
                }
                if (i14 != -1) {
                    int i18 = 0;
                    while (true) {
                        if (i18 >= arrayList.size()) {
                            break;
                        }
                        v4.r rVar3 = (v4.r) arrayList.get(i18);
                        if (rVar3.f124013b == i14) {
                            rVar = rVar3;
                            break;
                        }
                        i18++;
                    }
                }
            }
            if (rVar == null) {
                rVar = new v4.r();
                rVar.f124012a = new ArrayList();
                rVar.f124015d = null;
                rVar.f124016e = -1;
                int i19 = v4.r.f124011f;
                v4.r.f124011f = i19 + 1;
                rVar.f124013b = i19;
                rVar.f124014c = i13;
            }
            arrayList.add(rVar);
        }
        ArrayList arrayList2 = rVar.f124012a;
        if (!arrayList2.contains(hVar)) {
            arrayList2.add(hVar);
            if (hVar instanceof u4.m) {
                u4.m mVar = (u4.m) hVar;
                mVar.f120276y0.c(mVar.f120277z0 == 0 ? 1 : 0, rVar, arrayList);
            }
            int i23 = rVar.f124013b;
            if (i13 == 0) {
                hVar.f120235t0 = i23;
                hVar.f120195J.c(i13, rVar, arrayList);
                hVar.L.c(i13, rVar, arrayList);
            } else {
                hVar.f120237u0 = i23;
                hVar.K.c(i13, rVar, arrayList);
                hVar.N.c(i13, rVar, arrayList);
                hVar.M.c(i13, rVar, arrayList);
            }
            hVar.Q.c(i13, rVar, arrayList);
        }
        return rVar;
    }

    public static void W0(p90.w wVar, s6 s6Var) {
        wVar.M0 = s6Var;
    }

    public static void W1(bb1.p pVar, i92.k kVar) {
        pVar.f22538k0 = kVar;
    }

    public static String X(String str, double d2) {
        return String.format(str, Long.valueOf(Math.round(d2))).concat(d2 != 1.0d ? "s" : "");
    }

    public static void X0(kl0.z zVar, zf0.f fVar) {
        zVar.U0 = fVar;
    }

    public static void X1(ev0.l lVar, i92.k kVar) {
        lVar.A0 = kVar;
    }

    public static final Bitmap Y(String path, boolean z13) {
        Intrinsics.checkNotNullParameter(path, "path");
        Bitmap decodeFile = BitmapFactory.decodeFile(path);
        int f13 = new k6.g(path).f(1, "Orientation");
        float f14 = f13 != 3 ? f13 != 6 ? f13 != 8 ? 0.0f : 270.0f : 90.0f : 180.0f;
        Matrix matrix = new Matrix();
        matrix.postRotate(f14);
        if (z13) {
            matrix.postScale(-1.0f, 1.0f);
        }
        return Bitmap.createBitmap(decodeFile, 0, 0, decodeFile.getWidth(), decodeFile.getHeight(), matrix, true);
    }

    public static void Y0(kx0.o oVar, zf0.f fVar) {
        oVar.W0 = fVar;
    }

    public static void Y1(h80.l lVar, i92.k kVar) {
        lVar.f68098c0 = kVar;
    }

    public static final vd0.c Z(zk0 zk0Var) {
        nm.s o13 = new nm.p().a().o(zk0Var);
        nm.u i13 = o13 != null ? o13.i() : null;
        if (i13 != null) {
            i13.y("_bits");
        }
        return new vd0.c(i13);
    }

    public static void Z0(kl0.z zVar, lh0.r rVar) {
        zVar.f80137f1 = rVar;
    }

    public static void Z1(kl0.z zVar, i92.k kVar) {
        zVar.f80135d1 = kVar;
    }

    public static final void a(boolean z13, Function0 function0, i2.o oVar, int i13) {
        int i14;
        i2.s sVar = (i2.s) oVar;
        sVar.Y(-1840428098);
        if ((i13 & 14) == 0) {
            i14 = (sVar.i(z13) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER) == 0) {
            i14 |= sVar.j(function0) ? 32 : 16;
        }
        if ((i14 & 91) == 18 && sVar.z()) {
            sVar.Q();
        } else if (z13) {
            c2.r2.a(function0, null, false, null, tc0.o.f117293a, sVar, ((i14 >> 3) & 14) | 24576, 14);
        }
        i2.f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new w1.n0(z13, function0, i13);
        }
    }

    public static final int[] a0(NetworkRequest request) {
        boolean hasCapability;
        int[] capabilities;
        Intrinsics.checkNotNullParameter(request, "<this>");
        if (Build.VERSION.SDK_INT >= 31) {
            Intrinsics.checkNotNullParameter(request, "request");
            capabilities = request.getCapabilities();
            Intrinsics.checkNotNullExpressionValue(capabilities, "request.capabilities");
            return capabilities;
        }
        int[] iArr = {17, 5, 2, 10, 29, 19, 3, 32, 7, 4, 12, 23, 0, 33, 20, 11, 13, 18, 21, 15, 35, 34, 8, 1, 25, 14, 16, 6, 9};
        ArrayList arrayList = new ArrayList();
        for (int i13 = 0; i13 < 29; i13++) {
            int i14 = iArr[i13];
            Intrinsics.checkNotNullParameter(request, "request");
            hasCapability = request.hasCapability(i14);
            if (hasCapability) {
                arrayList.add(Integer.valueOf(i14));
            }
        }
        return CollectionsKt.E0(arrayList);
    }

    public static void a1(kl0.z zVar, no1.d dVar) {
        zVar.S0 = dVar;
    }

    public static void a2(sc1.b bVar, i92.k kVar) {
        bVar.f112294j0 = kVar;
    }

    public static final void b(i2.o oVar, int i13) {
        i2.s sVar = (i2.s) oVar;
        sVar.Y(1251812713);
        if (i13 == 0 && sVar.z()) {
            sVar.Q();
        } else {
            c2.u2.a(com.bumptech.glide.c.M0(sm1.b.ic_magnifying_glass_gestalt, sVar), a1.D0(oc0.q.search, sVar), androidx.compose.foundation.layout.b.r(u2.n.f120041b, com.bumptech.glide.d.A(eo1.c.space_400, sVar), 0.0f, 0.0f, 0.0f, 14), g0.h(eo1.b.color_gray_500, sVar), sVar, 8, 0);
        }
        i2.f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new ex.d(i13, 8);
        }
    }

    public static final bg b0(f30 f30Var) {
        bg bgVar;
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        Map V3 = f30Var.V3();
        if (V3 != null && (bgVar = (bg) V3.get("all_time_realtime")) != null) {
            return bgVar;
        }
        Map V32 = f30Var.V3();
        if (V32 != null) {
            return (bg) V32.get("30d_realtime");
        }
        return null;
    }

    public static void b1(kl0.z zVar, m60.d0 d0Var) {
        zVar.f80129a1 = d0Var;
    }

    public static void b2(kl0.z zVar) {
        zVar.getClass();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x012c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x015d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0197 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(p1.f1 r30, int r31, boolean r32, kotlin.jvm.functions.Function1 r33, kotlin.jvm.functions.Function0 r34, kotlin.jvm.functions.Function1 r35, i2.o r36, int r37, int r38) {
        /*
            Method dump skipped, instructions count: 501
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kh2.g3.c(p1.f1, int, boolean, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, i2.o, int, int):void");
    }

    public static final String c0(zd1.h hVar) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        if (hVar instanceof zd1.r) {
            return ((zd1.r) hVar).f141754i;
        }
        if (hVar instanceof zd1.g) {
            return ((zd1.g) hVar).f141713d;
        }
        return null;
    }

    public static void c1(p90.w wVar, n5 n5Var) {
        wVar.L0 = n5Var;
    }

    public static void c2(eu.e eVar, is1.k0 k0Var) {
        eVar.T0 = k0Var;
    }

    public static final void d(z9.e0 navController, List items, u2.q qVar, uc0.g0 g0Var, i2.o oVar, int i13, int i14) {
        uc0.g0 g0Var2;
        int i15;
        Intrinsics.checkNotNullParameter(navController, "navController");
        Intrinsics.checkNotNullParameter(items, "items");
        i2.s sVar = (i2.s) oVar;
        sVar.Y(87522780);
        u2.q qVar2 = (i14 & 4) != 0 ? u2.n.f120041b : qVar;
        if ((i14 & 8) != 0) {
            sVar.X(1890788296);
            androidx.lifecycle.u1 a13 = v6.b.a(sVar);
            if (a13 == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            xe2.g V = p2.V(a13, sVar);
            sVar.X(1729797275);
            androidx.lifecycle.l1 v03 = c3.v0(uc0.g0.class, a13, V, a13 instanceof androidx.lifecycle.k ? ((androidx.lifecycle.k) a13).getDefaultViewModelCreationExtras() : u6.a.f120754b, sVar);
            sVar.r(false);
            sVar.r(false);
            i15 = i13 & (-7169);
            g0Var2 = (uc0.g0) v03;
        } else {
            g0Var2 = g0Var;
            i15 = i13;
        }
        do2.f2 f2Var = ((oc0.j) g0Var2.f121781c).f94042a;
        fc0.g gVar = (fc0.g) ((fc0.f) sVar.m(fc0.h.f61707g));
        int i16 = gVar.f61695a;
        c2.o0.a(qVar2, gVar.f61696b, 0L, 0.0f, q2.i.c(1234712580, new c2.c0(navController, items, f2Var, 6), sVar), sVar, ((i15 >> 6) & 14) | 24576, 12);
        i2.f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new l1.r(navController, items, qVar2, g0Var2, i13, i14, 16);
        }
    }

    public static final RectF d0(float f13, float f14, Matrix matrix) {
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        RectF rectF = new RectF(0.0f, 0.0f, f13, f14);
        matrix.mapRect(rectF);
        return rectF;
    }

    public static void d1(ev0.l lVar, l8 l8Var) {
        lVar.f60268z0 = l8Var;
    }

    public static final boolean d2(zd1.g gVar, zd1.h filter) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        Intrinsics.checkNotNullParameter(filter, "filter");
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        Intrinsics.checkNotNullParameter(filter, "filter");
        boolean z13 = filter instanceof zd1.g;
        if (z13) {
            zd1.g gVar2 = (zd1.g) filter;
            if (Intrinsics.d(gVar.f141714e, gVar2.f141714e) && !Intrinsics.d(gVar.f141713d, gVar2.f141713d)) {
                zd1.g gVar3 = z13 ? (zd1.g) filter : null;
                if (gVar3 != null && gVar3.f141719j) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0204  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void e(int r22, kotlin.jvm.functions.Function1 r23, u2.q r24, float r25, float r26, float r27, float r28, kotlin.jvm.functions.Function0 r29, i2.o r30, int r31, int r32) {
        /*
            Method dump skipped, instructions count: 791
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kh2.g3.e(int, kotlin.jvm.functions.Function1, u2.q, float, float, float, float, kotlin.jvm.functions.Function0, i2.o, int, int):void");
    }

    public static final Integer e0(zd1.h hVar, boolean z13) {
        t32.f c13 = hVar.c();
        if (c13 != null) {
            return Integer.valueOf(c13.getValue());
        }
        if (z13) {
            zd1.q b13 = hVar.b();
            Intrinsics.checkNotNullParameter(b13, "<this>");
            int i13 = de1.q0.f54636b[b13.ordinal()];
            t32.f fVar = i13 != 1 ? i13 != 2 ? null : t32.f.PRODUCT_MERCHANT : t32.f.PRODUCT_PRICE;
            if (fVar != null) {
                return Integer.valueOf(fVar.getValue());
            }
        }
        return null;
    }

    public static void e1(ev0.l lVar, ag1.h hVar) {
        lVar.C0 = hVar;
    }

    public static boolean e2(Context context, int i13) {
        if (C2(i13, context, "com.google.android.gms")) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.android.gms", 64);
                ih.g b13 = ih.g.b(context);
                b13.getClass();
                if (packageInfo == null) {
                    return false;
                }
                if (!ih.g.e(packageInfo, false)) {
                    if (!ih.g.e(packageInfo, true)) {
                        return false;
                    }
                    if (!ih.f.a((Context) b13.f72266a)) {
                        Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
                        return false;
                    }
                }
                return true;
            } catch (PackageManager.NameNotFoundException unused) {
                if (Log.isLoggable("UidVerifier", 3)) {
                    Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
                }
            }
        }
        return false;
    }

    public static final void f(rm1.d iconDisplayState, u2.q qVar, i2.o oVar, int i13, int i14) {
        int drawableRes;
        Intrinsics.checkNotNullParameter(iconDisplayState, "iconDisplayState");
        i2.s sVar = (i2.s) oVar;
        sVar.Y(-537222619);
        if ((i14 & 2) != 0) {
            qVar = u2.n.f120041b;
        }
        Context context = (Context) sVar.m(AndroidCompositionLocals_androidKt.f17455b);
        rm1.g gVar = iconDisplayState.f108695a;
        gVar.getClass();
        if (gVar instanceof rm1.f) {
            drawableRes = ((rm1.f) gVar).f108702a.getDrawableRes();
        } else {
            if (!(gVar instanceof rm1.e)) {
                throw new NoWhenBranchMatchedException();
            }
            drawableRes = ((rm1.e) gVar).f108700a.getDrawableRes();
        }
        c2.u2.a(com.bumptech.glide.c.M0(drawableRes, sVar), String.valueOf(iconDisplayState.f108699e), androidx.compose.foundation.layout.e.j(qVar, com.bumptech.glide.d.A(dl2.b.a1(context, iconDisplayState.f108695a.a()), sVar)), androidx.compose.ui.graphics.a.c(dl2.b.x0(context, iconDisplayState.f108696b.getColorAttrRes())), sVar, 8, 0);
        i2.f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new q1.l(i13, i14, 10, iconDisplayState, qVar);
        }
    }

    public static final ze1.b f0(f30 pin, ze1.a spec) {
        String str;
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(spec, "spec");
        if (spec.f141804c) {
            Intrinsics.checkNotNullParameter(pin, "<this>");
            wy0 n13 = b40.n(pin);
            str = n13 != null ? dl2.b.i1(n13) : null;
            if (str == null || str.length() == 0) {
                str = bs1.c.P0(pin);
            }
        } else {
            str = null;
        }
        return new ze1.b(spec.f141802a ? po1.c.b(pin) : null, spec.f141803b ? df.j1.s0(pin) : null, str);
    }

    public static void f1(kx0.o oVar, androidx.recyclerview.widget.v1 v1Var) {
        oVar.X0 = v1Var;
    }

    public static r72.g1 f2(String str, float f13, boolean z13, r72.l1 l1Var, double d2, int i13) {
        return new r72.g1(str, (i13 & 2) != 0 ? 1.0f : f13, (i13 & 4) != 0 ? false : z13, l1Var, 0.0d, 0.0d, 0.0d, d2);
    }

    public static final void g(uc0.b2 b2Var, i2.o oVar, int i13, int i14) {
        int i15;
        i2.s sVar = (i2.s) oVar;
        sVar.Y(389417355);
        if ((i13 & 14) == 0) {
            i15 = (((i14 & 1) == 0 && sVar.h(b2Var)) ? 4 : 2) | i13;
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
                androidx.lifecycle.l1 v03 = c3.v0(uc0.b2.class, a13, V, a13 instanceof androidx.lifecycle.k ? ((androidx.lifecycle.k) a13).getDefaultViewModelCreationExtras() : u6.a.f120754b, sVar);
                sVar.r(false);
                sVar.r(false);
                b2Var = (uc0.b2) v03;
            }
            sVar.s();
            i2.q1 z13 = bs1.c.z(b2Var.f121825e, sVar);
            b2Var.i(new uc0.i(new oc0.a(q2.i.c(-138408877, new xb0.a(b2Var, 12), sVar))));
            gh0.b.d(((uc0.a2) z13.getValue()).f121759a, null, sVar, 8, 2);
        }
        i2.f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new yu.c(b2Var, i13, i14, 22);
        }
    }

    public static final int g0(q42.c cVar) {
        int i13 = cVar == null ? -1 : h61.a.f67815a[cVar.ordinal()];
        if (i13 == 1) {
            return sm1.b.ic_shopping_bag_gestalt;
        }
        if (i13 == 2) {
            return sm1.b.ic_person_gestalt;
        }
        if (i13 == 3) {
            return sm1.b.ic_filter_gestalt;
        }
        if (i13 == 4) {
            return sm1.b.ic_arrow_down_gestalt;
        }
        if (i13 != 5) {
            return 0;
        }
        return sm1.b.ic_pin_angled_gestalt;
    }

    public static void g1(MediaGalleryActivity mediaGalleryActivity, r8 r8Var) {
        mediaGalleryActivity.f46717j = r8Var;
    }

    public static final void g2(Fragment fragment, cj0.l collection) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(collection, "collection");
        androidx.lifecycle.z viewLifecycleOwner = fragment.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        kotlin.jvm.internal.j.z(bf.b.S(viewLifecycleOwner), null, null, new cj0.r(fragment, collection, null), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0085, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r0.J(), java.lang.Integer.valueOf(r8)) == false) goto L123;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void h(ga0.i r30, u2.q r31, float r32, kotlin.jvm.functions.Function0 r33, kotlin.jvm.functions.Function0 r34, i2.o r35, int r36, int r37) {
        /*
            Method dump skipped, instructions count: 645
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kh2.g3.h(ga0.i, u2.q, float, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, i2.o, int, int):void");
    }

    public static final b4.g h0(h4.f0 f0Var) {
        b4.g gVar = f0Var.f67559a;
        gVar.getClass();
        long j13 = f0Var.f67560b;
        return gVar.subSequence(b4.p0.e(j13), b4.p0.d(j13));
    }

    public static void h1(kl0.z zVar, rw0.f fVar) {
        zVar.f80136e1 = fVar;
    }

    public static final void h2(ox.b analyticsApi, String userId, int i13, int i14, String isForceFlush, int i15, Long l13, h32.f1 f1Var, Long l14, h32.f1 f1Var2) {
        Intrinsics.checkNotNullParameter(analyticsApi, "analyticsApi");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(isForceFlush, "isForceFlush");
        ContextLogRequestMetrics$Log$Payload payload = new ContextLogRequestMetrics$Log$Payload(i13, i14, isForceFlush, i15, l13, f1Var, l14, f1Var2);
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(userId, "userId");
        nx.l lVar = new nx.l("context_log_request_metrics", new KibanaMetrics.Log.Metadata(userId, null, 2, null), payload, null, null, 0L, 56, null);
        ms0.b bVar = new ms0.b();
        bVar.b(lVar);
        ((vy.m) analyticsApi).i(bVar, ox.a.f97979i);
    }

    public static final void i(ia0.b bVar, u2.q qVar, i2.o oVar, int i13, int i14) {
        i2.s sVar = (i2.s) oVar;
        sVar.Y(-68861900);
        u2.q qVar2 = (i14 & 2) != 0 ? u2.n.f120041b : qVar;
        p1.g gVar = p1.l.f98543a;
        p1.e1 a13 = p1.c1.a(p1.l.g(com.bumptech.glide.d.A(eo1.c.space_100, sVar)), u2.b.f120023k, sVar, 48);
        int i15 = sVar.P;
        i2.z1 o13 = sVar.o();
        u2.q X = ao2.m0.X(sVar, qVar2);
        s3.k.Qo.getClass();
        s3.i iVar = s3.j.f110798b;
        if (!(sVar.f71265a instanceof i2.f)) {
            com.bumptech.glide.c.j0();
            throw null;
        }
        sVar.a0();
        if (sVar.O) {
            sVar.n(iVar);
        } else {
            sVar.j0();
        }
        tb.f.f0(sVar, a13, s3.j.f110801e);
        tb.f.f0(sVar, o13, s3.j.f110800d);
        s3.h hVar = s3.j.f110802f;
        if (sVar.O || !Intrinsics.d(sVar.J(), Integer.valueOf(i15))) {
            ep.b.y(i15, sVar, i15, hVar);
        }
        tb.f.f0(sVar, X, s3.j.f110799c);
        kg.p.a(rl1.q.e(bVar.f71943a, null, null, false, rl1.r.XS, null, false, false, null, 0, null, null, 2039), null, null, sVar, 8, 6);
        CharSequence a03 = df.j1.a0(a1.E0(ea0.k.template_by, new Object[]{bVar.f71944b.a((Context) sVar.m(AndroidCompositionLocals_androidKt.f17455b))}, sVar));
        Intrinsics.checkNotNullExpressionValue(a03, "fromHtml(...)");
        dl2.b.c(new rn1.a(bs1.c.p2(a03), null, null, null, vn1.g.BODY_100, 1, null, rn1.b.END, null, null, false, 0, null, null, null, false, null, null, 2096974), null, null, null, sVar, 8, 14);
        sVar.r(true);
        i2.f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new ga0.c(bVar, qVar2, i13, i14, 1);
        }
    }

    public static final ex0.e i0(long j13, long j14, long j15) {
        int i13 = (int) (((j15 * 8) / ((j14 - j13) / 1000.0f)) / 1000000);
        return i13 < 0 ? ex0.e.UNKNOWN : i13 < 1 ? ex0.e.BUCKET_0_1 : i13 < 5 ? ex0.e.BUCKET_1_5 : i13 < 10 ? ex0.e.BUCKET_5_10 : i13 < 20 ? ex0.e.BUCKET_10_20 : i13 < 40 ? ex0.e.BUCKET_20_40 : i13 < 80 ? ex0.e.BUCKET_40_80 : ex0.e.BUCKET_80_OR_ABOVE;
    }

    public static void i1(hp0.t tVar, hs.d dVar) {
        tVar.f69868j0 = dVar;
    }

    public static km0.a i2(lm0.x0 x0Var, wa2.m mVar, lm0.c1 c1Var, int i13, boolean z13, int i14) {
        if ((i14 & 8) != 0) {
            mVar = x0Var.f83911e;
        }
        wa2.m featureConfig = mVar;
        if ((i14 & 16) != 0) {
            c1Var = x0Var.f83912f.f83922a;
        }
        lm0.c1 filter = c1Var;
        if ((i14 & 32) != 0) {
            i13 = 1001;
        }
        int i15 = i13;
        if ((i14 & 64) != 0) {
            z13 = false;
        }
        Intrinsics.checkNotNullParameter(x0Var, "<this>");
        String id3 = x0Var.f83907a;
        Intrinsics.checkNotNullParameter(id3, "id");
        String sessionId = x0Var.f83909c;
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        String storyRequestParams = x0Var.f83910d;
        Intrinsics.checkNotNullParameter(storyRequestParams, "storyRequestParams");
        Intrinsics.checkNotNullParameter(featureConfig, "featureConfig");
        Intrinsics.checkNotNullParameter(filter, "filter");
        return new km0.a(id3, sessionId, storyRequestParams, featureConfig, filter, i15, z13);
    }

    public static p51 j(sj sjVar) {
        x41 x41Var;
        try {
            k51 a13 = k51.a(sjVar.f11117a, jc0.a());
            if (a13 == null || a13.r() <= 0) {
                throw new GeneralSecurityException("empty keyset");
            }
            ArrayList arrayList = new ArrayList(a13.r());
            for (j51 j51Var : a13.s()) {
                int s13 = j51Var.s();
                try {
                    i7 a14 = p51.a(j51Var);
                    int ordinal = j51Var.u().ordinal();
                    boolean z13 = true;
                    if (ordinal == 1) {
                        x41Var = x41.f13478b;
                    } else if (ordinal == 2) {
                        x41Var = x41.f13479c;
                    } else {
                        if (ordinal != 3) {
                            throw new GeneralSecurityException("Unknown key status");
                        }
                        x41Var = x41.f13480d;
                    }
                    if (s13 != a13.t()) {
                        z13 = false;
                    }
                    arrayList.add(new o51(a14, x41Var, s13, z13));
                } catch (GeneralSecurityException e13) {
                    if (qf.f151a.f13094a.get()) {
                        throw new GeneralSecurityException("Parsing of a single key failed (maybe wrong status?) and Tink is configured via validateKeysetsOnParsing to reject such keysets.", e13);
                    }
                    arrayList.add(null);
                }
            }
            return new p51(a13, Collections.unmodifiableList(arrayList), kb1.f7207b);
        } finally {
            sjVar.f11117a.close();
        }
    }

    public static BitmapDrawable j0(Context context, z32.n1 n1Var) {
        Drawable drawable;
        Intrinsics.checkNotNullParameter(context, "context");
        int i13 = n1Var == null ? -1 : xq.a.f135653a[n1Var.ordinal()];
        if (i13 == 1) {
            int i14 = sm1.b.ic_tag_gestalt;
            Object obj = d5.a.f53679a;
            drawable = context.getDrawable(i14);
        } else if (i13 != 2) {
            drawable = null;
        } else {
            int i15 = m60.s0.ic_bag_12_nonpds;
            Object obj2 = d5.a.f53679a;
            drawable = context.getDrawable(i15);
        }
        if (drawable == null) {
            return null;
        }
        Resources resources = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        return d7.b.p0(drawable, resources, (int) context.getResources().getDimension(m60.r0.story_icon_size), (int) context.getResources().getDimension(m60.r0.story_icon_size));
    }

    public static void j1(kx0.o oVar, so.n0 n0Var) {
        oVar.R0 = n0Var;
    }

    public static final int j2(Context context, List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        return Color.parseColor((list.size() <= 1 || !pk.a0.q0(context)) ? (String) list.get(0) : (String) list.get(1));
    }

    public static final l82.c0 k(l82.d dVar, u50.s[] sVarArr, u50.o oVar, l82.i0 i0Var) {
        l82.c0 c0Var = new l82.c0(oVar, i0Var);
        int length = sVarArr.length;
        int i13 = 0;
        while (i13 < length) {
            l82.c0 e13 = dVar.e(sVarArr[i13], c0Var.f82212a, c0Var.f82213b);
            ArrayList sideEffectRequests = CollectionsKt.l0(e13.f82214c, c0Var.f82214c);
            u50.o displayState = e13.f82212a;
            Intrinsics.checkNotNullParameter(displayState, "displayState");
            l82.i0 vmState = e13.f82213b;
            Intrinsics.checkNotNullParameter(vmState, "vmState");
            Intrinsics.checkNotNullParameter(sideEffectRequests, "sideEffectRequests");
            i13++;
            c0Var = new l82.c0(displayState, vmState, sideEffectRequests);
        }
        return c0Var;
    }

    public static final b4.g k0(h4.f0 f0Var, int i13) {
        b4.g gVar = f0Var.f67559a;
        long j13 = f0Var.f67560b;
        return gVar.subSequence(b4.p0.d(j13), Math.min(b4.p0.d(j13) + i13, f0Var.f67559a.f21571a.length()));
    }

    public static void k1(hp0.t tVar, yk1.j jVar) {
        tVar.f69867i0 = jVar;
    }

    public static final List k2(lm0.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        o82.y0 y0Var = (o82.y0) CollectionsKt.U(lm0.e0.BoardPins.getIndex(), aVar.f83840j.f93524a);
        if (y0Var == null) {
            return kotlin.collections.q0.f80391a;
        }
        List list = y0Var.f93756a;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            l82.i0 i0Var = ((o82.u0) it.next()).f93721a;
            lm0.c0 c0Var = i0Var instanceof lm0.c0 ? (lm0.c0) i0Var : null;
            if (c0Var != null) {
                arrayList.add(c0Var);
            }
        }
        return arrayList;
    }

    public static final void l(co2.z zVar, bn0.h hVar) {
        Object m13;
        try {
            xk2.q qVar = xk2.s.f135225b;
            m13 = Boolean.valueOf(!(((co2.y) zVar).f28359d.g(hVar) instanceof co2.s));
        } catch (Throwable th3) {
            xk2.q qVar2 = xk2.s.f135225b;
            m13 = ue.c.m(th3);
        }
        Object obj = Boolean.FALSE;
        if (m13 instanceof xk2.r) {
            m13 = obj;
        }
    }

    public static final b4.g l0(h4.f0 f0Var, int i13) {
        b4.g gVar = f0Var.f67559a;
        long j13 = f0Var.f67560b;
        return gVar.subSequence(Math.max(0, b4.p0.e(j13) - i13), b4.p0.e(j13));
    }

    public static void l1(kl0.z zVar, yk1.j jVar) {
        zVar.X0 = jVar;
    }

    public static final ArrayList l2(lm0.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        List k23 = k2(aVar);
        ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(k23, 10));
        Iterator it = k23.iterator();
        while (it.hasNext()) {
            arrayList.add(((lm0.c0) it.next()).f83849a);
        }
        return arrayList;
    }

    public static final void m(x92.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        p2.K(bVar);
        bVar.e("aggregatedcomment.comment_response_pin()");
    }

    public static final String m0(GestaltTextComposer gestaltTextComposer) {
        Intrinsics.checkNotNullParameter(gestaltTextComposer, "<this>");
        Editable t03 = gestaltTextComposer.t0();
        String obj = t03 != null ? t03.toString() : null;
        return obj == null ? "" : obj;
    }

    public static void m1(kl0.z zVar, tj0.b0 b0Var) {
        zVar.f80139h1 = b0Var;
    }

    public static final ArrayList m2(lm0.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        ArrayList l23 = l2(aVar);
        ArrayList arrayList = new ArrayList();
        Iterator it = l23.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((f30) next).E5() != null) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public static void n(x92.b bVar) {
        n60.o.v(bVar, "collaboratorinvite.invited_user()", "collaboratorinvite.status", "collaboratorinvite.access");
    }

    public static final int[] n0(NetworkRequest request) {
        boolean hasTransport;
        int[] transportTypes;
        Intrinsics.checkNotNullParameter(request, "<this>");
        if (Build.VERSION.SDK_INT >= 31) {
            Intrinsics.checkNotNullParameter(request, "request");
            transportTypes = request.getTransportTypes();
            Intrinsics.checkNotNullExpressionValue(transportTypes, "request.transportTypes");
            return transportTypes;
        }
        int[] iArr = {2, 0, 3, 6, 9, 8, 4, 1, 5};
        ArrayList arrayList = new ArrayList();
        for (int i13 = 0; i13 < 9; i13++) {
            int i14 = iArr[i13];
            Intrinsics.checkNotNullParameter(request, "request");
            hasTransport = request.hasTransport(i14);
            if (hasTransport) {
                arrayList.add(Integer.valueOf(i14));
            }
        }
        return CollectionsKt.E0(arrayList);
    }

    public static void n1(tj0.d dVar, tj0.b0 b0Var) {
        dVar.R0 = b0Var;
    }

    public static final vd0.c n2(Context context, vq rect, float f13, float f14) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(rect, "rect");
        Matrix matrix = new Matrix();
        matrix.postRotate((-1) * f14, rect.a().x, rect.a().y);
        float[] fArr = {rect.getTopLeft().x, rect.getTopLeft().y};
        matrix.mapPoints(fArr);
        float f15 = fArr[0];
        float f16 = fArr[1];
        float o13 = rect.o();
        float i13 = rect.i();
        vd0.c cVar = new vd0.c();
        Intrinsics.checkNotNullParameter(context, "context");
        float width = ig1.b.i0(f13, context).width();
        cVar.r(Float.valueOf(width == 0.0f ? 0.0f : (f15 / width) * 100), "x_coord");
        Intrinsics.checkNotNullParameter(context, "context");
        float height = ig1.b.i0(f13, context).height();
        cVar.r(Float.valueOf(height == 0.0f ? 0.0f : (f16 / height) * 100), "y_coord");
        Intrinsics.checkNotNullParameter(context, "context");
        float width2 = ig1.b.i0(f13, context).width();
        cVar.r(Float.valueOf(width2 == 0.0f ? 0.0f : (o13 / width2) * 100), "width");
        Intrinsics.checkNotNullParameter(context, "context");
        float height2 = ig1.b.i0(f13, context).height();
        cVar.r(Float.valueOf(height2 == 0.0f ? 0.0f : (i13 / height2) * 100), "height");
        cVar.r(Float.valueOf(0.0f), "corner_radius");
        cVar.r(Float.valueOf(f14), "rotation");
        return cVar;
    }

    public static void o(x92.b bVar) {
        n60.o.w(bVar, "explorearticle.curator()", "explorearticle.show_cover", "exploretabcoverimage.image_medium_url", "exploretabcoverimage.image_large_url");
        bVar.h("explorearticle.cover_images", "236x");
        bVar.h("explorearticle.cover_images", "474x");
        bVar.h("exploresearch.cover_images", "474x");
    }

    public static final zy.f0 o0(zy.l0 l0Var, h32.g0 g0Var, h32.u0 u0Var, h32.f1 eventType, a4 a4Var, h32.d4 d4Var, String str, HashMap auxData) {
        Intrinsics.checkNotNullParameter(l0Var, "<this>");
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(auxData, "auxData");
        return new zy.f0(new zy.a(com.bumptech.glide.d.z0(l0Var.f143086a, new r60.d(d4Var, a4Var, u0Var, g0Var, str, l0Var, 2)), eventType, null, auxData, null, null, false, false, RecyclerViewTypes.VIEW_TYPE_HOME_FEED_TUNER_SETTINGS_NOTIFICATION));
    }

    public static void o1(eu.e eVar, nx.b0 b0Var) {
        eVar.X0 = b0Var;
    }

    public static final rw0 o2(long j13, long j14, long j15, long j16) {
        long j17 = j15 - j16;
        return j13 < j14 ? nw0.f40522a : (j14 > j13 || j13 > j14 + j16) ? j13 < j17 ? ow0.f40826a : (j17 > j13 || j13 > j15) ? mw0.f40247a : new qw0(ql2.s.i(j13 - j17, 0L, j16) / j16) : new pw0(ql2.s.i(j13 - j14, 0L, j16) / j16);
    }

    public static final void p(x92.b apiFieldsMap) {
        Intrinsics.checkNotNullParameter(apiFieldsMap, "apiFieldsMap");
        df.j1.h(apiFieldsMap);
        if (sh.f.f112910e == null) {
            Intrinsics.r("conditionalApiFieldChecker");
            throw null;
        }
        if (bk.f.W()) {
            n60.o.v(apiFieldsMap, "pin.video_status", "pin.video_status_message", "aggregatedpindata.creator_analytics");
        }
        apiFieldsMap.e("pin.creator_analytics");
        apiFieldsMap.e("pin.public_creator_analytics");
    }

    public static /* synthetic */ zy.f0 p0(zy.l0 l0Var, a4 a4Var, h32.u0 u0Var, h32.g0 g0Var, String str, h32.f1 f1Var, HashMap hashMap, int i13) {
        a4 a4Var2 = (i13 & 2) != 0 ? null : a4Var;
        return o0(l0Var, (i13 & 8) != 0 ? null : g0Var, u0Var, (i13 & 32) != 0 ? h32.f1.TAP : f1Var, a4Var2, null, (i13 & 16) != 0 ? null : str, (i13 & 64) != 0 ? new HashMap() : hashMap);
    }

    public static void p1(kl0.z zVar, x02.i2 i2Var) {
        zVar.V0 = i2Var;
    }

    public static final void p2(ke2.i iVar, Set set) {
        od2.c cVar = iVar.f79343k;
        if (cVar != null) {
            if (!set.contains(cVar.f94185a)) {
                cVar = null;
            }
            if (cVar != null) {
                iVar.f79343k = null;
                iVar.f79336d = true;
            }
        }
        iVar.f79342j.removeIf(new iw(12, new y01.h1(4, set)));
        iVar.f79341i.removeIf(new iw(13, new y01.h1(5, set)));
        iVar.f79340h.removeIf(new iw(14, new y01.h1(6, set)));
    }

    public static void q(x92.b bVar) {
        n60.o.w(bVar, "shopsection.id", "shopsection.description", "shopsection.collections()", "shopsection.title");
        n60.o.w(bVar, "shopsection.layout", "shopsection.total_count", "shopsection.display_count", "shopsection.id");
        j1.F(bVar);
    }

    public static final boolean q0(GestaltTextComposer gestaltTextComposer) {
        Intrinsics.checkNotNullParameter(gestaltTextComposer, "<this>");
        return df.j1.U0(gestaltTextComposer.k0().f130522i) || df.j1.U0(gestaltTextComposer.k0().f130523j);
    }

    public static void q1(kx0.o oVar, x02.i2 i2Var) {
        oVar.T0 = i2Var;
    }

    public static final u50.i0 q2(om0.o oVar, Context context) {
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        CharSequence a13 = oVar.f96551a.a(context);
        CharSequence a14 = oVar.f96552b.a(context);
        CharSequence a15 = oVar.f96553c.a(context);
        if (kotlin.text.z.j(a14)) {
            return oVar.f96551a;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append((Object) a13);
        sb3.append((Object) a15);
        sb3.append((Object) a14);
        String string = sb3.toString();
        Intrinsics.checkNotNullParameter(string, "string");
        return new u50.f0(string);
    }

    public static void r(x92.b bVar) {
        n60.o.w(bVar, "explorearticle.id", "explorearticle.type", "explorearticle.content_type", "explorearticle.object_id");
        n60.o.w(bVar, "explorearticle.title", "explorearticle.subtitle", "explorearticle.curator()", "explorearticle.dominant_colors");
        n60.o.w(bVar, "explorearticle.aux_fields", "explorearticle.is_promoted", "explorearticle.author_name", "explorearticle.badge_type");
        bVar.e("explorearticle.flex_grid_style");
        bVar.e("explorearticle.story_category");
        bVar.e("explorearticle.action");
        o(bVar);
    }

    public static boolean r0(Iterable iterable, Comparator comparator) {
        Object obj;
        comparator.getClass();
        iterable.getClass();
        if (iterable instanceof SortedSet) {
            obj = ((SortedSet) iterable).comparator();
            if (obj == null) {
                obj = pk.s2.f100480a;
            }
        } else {
            if (!(iterable instanceof pk.k3)) {
                return false;
            }
            obj = ((pk.t1) ((pk.k3) iterable)).f100485d;
        }
        return comparator.equals(obj);
    }

    public static void r1(u31.f fVar, x02.i2 i2Var) {
        fVar.S0 = i2Var;
    }

    public static final int r2(zo.c viewType, boolean z13) {
        Intrinsics.checkNotNullParameter(viewType, "viewType");
        if (z13) {
            Intrinsics.checkNotNullParameter(viewType, "viewType");
            int i13 = nm0.a.f91368a[viewType.ordinal()];
            if (i13 == 1) {
                return 86753091;
            }
            if (i13 == 2) {
                return 86753092;
            }
            if (i13 == 3) {
                return 86753093;
            }
            throw new NoWhenBranchMatchedException();
        }
        Intrinsics.checkNotNullParameter(viewType, "viewType");
        int i14 = nm0.a.f91368a[viewType.ordinal()];
        if (i14 == 1) {
            return 70;
        }
        if (i14 == 2) {
            return 71;
        }
        if (i14 == 3) {
            return 72;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final void s(ke2.i iVar, od2.d dVar) {
        if (dVar instanceof od2.a) {
            iVar.f79342j.add(dVar);
            return;
        }
        if (dVar instanceof od2.b) {
            iVar.f79341i.add(dVar);
        } else if (dVar instanceof od2.c) {
            iVar.f79343k = (od2.c) dVar;
            iVar.f79336d = true;
        }
    }

    public static String s0(byte[] bArr) {
        byte[] bundleHashed = MessageDigest.getInstance("MD5").digest(bArr);
        StringBuilder sb3 = new StringBuilder();
        Intrinsics.checkNotNullExpressionValue(bundleHashed, "bundleHashed");
        for (byte b13 : bundleHashed) {
            sb3.append(t3.s1.e(new Object[]{Integer.valueOf(b13 & 255)}, 1, Locale.ENGLISH, "%02x", "format(...)"));
        }
        String sb4 = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "sb.toString()");
        Locale ENGLISH = Locale.ENGLISH;
        Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
        String upperCase = sb4.toUpperCase(ENGLISH);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        return upperCase;
    }

    public static void s1(NewsHubEmptyStateView newsHubEmptyStateView, nx.f0 f0Var) {
        newsHubEmptyStateView.f46795c = f0Var;
    }

    public static void s2(EditorInfo editorInfo, String[] strArr) {
        editorInfo.contentMimeTypes = strArr;
    }

    public static final void t(ArrayList arrayList, tl standardListItem, int i13, boolean z13, m70 productFilterItem) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        Intrinsics.checkNotNullParameter(standardListItem, "standardListItem");
        Intrinsics.checkNotNullParameter(productFilterItem, "productFilterItem");
        zd1.q qVar = zd1.q.STANDARD_LIST;
        String f13 = standardListItem.f();
        String str = f13 == null ? "" : f13;
        String e13 = standardListItem.e();
        String h10 = productFilterItem.h();
        arrayList.add(new zd1.v(null, qVar, str, i13, e13, z13, h10 == null ? "" : h10));
    }

    public static final String t0(f30 f30Var) {
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        String y03 = bs1.c.y0(f30Var);
        if (y03 != null) {
            return y03;
        }
        String p03 = bs1.c.p0(f30Var);
        if (p03 != null) {
            return p03;
        }
        String y43 = f30Var.y4();
        return y43 == null ? "" : y43;
    }

    public static void t1(ht0.m mVar, uk1.e eVar) {
        mVar.f70123s0 = eVar;
    }

    public static void t2(EditorInfo editorInfo, CharSequence charSequence) {
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 30) {
            e0.g.e(editorInfo, charSequence);
            return;
        }
        charSequence.getClass();
        if (i13 >= 30) {
            e0.g.e(editorInfo, charSequence);
            return;
        }
        int i14 = editorInfo.initialSelStart;
        int i15 = editorInfo.initialSelEnd;
        int i16 = i14 > i15 ? i15 : i14;
        if (i14 <= i15) {
            i14 = i15;
        }
        int length = charSequence.length();
        if (i16 < 0 || i14 > length) {
            u2(editorInfo, null, 0, 0);
            return;
        }
        int i17 = editorInfo.inputType & 4095;
        if (i17 == 129 || i17 == 225 || i17 == 18) {
            u2(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            u2(editorInfo, charSequence, i16, i14);
            return;
        }
        int i18 = i14 - i16;
        int i19 = i18 > 1024 ? 0 : i18;
        int i23 = 2048 - i19;
        int min = Math.min(charSequence.length() - i14, i23 - Math.min(i16, (int) (i23 * 0.8d)));
        int min2 = Math.min(i16, i23 - min);
        int i24 = i16 - min2;
        if (Character.isLowSurrogate(charSequence.charAt(i24))) {
            i24++;
            min2--;
        }
        if (Character.isHighSurrogate(charSequence.charAt((i14 + min) - 1))) {
            min--;
        }
        int i25 = min2 + i19;
        u2(editorInfo, i19 != i18 ? TextUtils.concat(charSequence.subSequence(i24, i24 + min2), charSequence.subSequence(i14, min + i14)) : charSequence.subSequence(i24, i25 + min + i24), min2, i25);
    }

    public static final String[] u(String key, String value, String[] strArr) {
        Intrinsics.checkNotNullParameter(strArr, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        ArrayList e03 = kotlin.collections.c0.e0(strArr);
        e03.add(M(key, value));
        return (String[]) e03.toArray(new String[0]);
    }

    public static void u0(yq1.u0 u0Var, lb2.d dVar) {
        u0Var.f140037g0 = dVar;
    }

    public static void u1(kl0.z zVar, nx.f0 f0Var) {
        zVar.Y0 = f0Var;
    }

    public static void u2(EditorInfo editorInfo, CharSequence charSequence, int i13, int i14) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i13);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i14);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void v(ke2.i r4, r72.k0 r5) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "effectData"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            boolean r0 = r5.f106515c
            if (r0 == 0) goto L14
            r5 = 0
            r4.e(r5)
            goto Laf
        L14:
            float r0 = r5.f106517e
            r4.e(r0)
            r72.g r0 = r5.f106518f
            od2.d r1 = U(r4, r0)
            r2 = 0
            if (r1 != 0) goto L32
            od2.d r1 = y72.b.a(r0)
            if (r1 == 0) goto L31
            java.util.Set r3 = y72.b.f138018a
            p2(r4, r3)
            s(r4, r1)
            goto L32
        L31:
            r1 = r2
        L32:
            if (r1 == 0) goto L3c
            java.util.Set r3 = y72.b.f138018a
            pd2.r0 r1 = r1.f94189e
            y72.b.f(r1, r0)
            goto L41
        L3c:
            java.util.Set r0 = y72.b.f138018a
            p2(r4, r0)
        L41:
            r72.i0 r0 = r5.f106519g
            od2.d r1 = U(r4, r0)
            if (r1 != 0) goto L59
            od2.d r1 = y72.b.d(r0)
            if (r1 == 0) goto L58
            java.util.Set r3 = y72.b.f138019b
            p2(r4, r3)
            s(r4, r1)
            goto L59
        L58:
            r1 = r2
        L59:
            if (r1 == 0) goto L61
            pd2.r0 r1 = r1.f94189e
            y72.b.i(r1, r0)
            goto L66
        L61:
            java.util.Set r0 = y72.b.f138019b
            p2(r4, r0)
        L66:
            r72.s r0 = r5.f106521i
            nd2.b r1 = V(r4, r0)
            gd2.c r3 = r4.f79340h
            if (r1 != 0) goto L7e
            nd2.b r1 = y72.b.c(r0)
            if (r1 == 0) goto L7f
            java.util.Set r2 = y72.b.f138021d
            p2(r4, r2)
            r3.add(r1)
        L7e:
            r2 = r1
        L7f:
            if (r2 == 0) goto L87
            pd2.r0 r1 = r2.f90431f
            y72.b.h(r1, r0)
            goto L8c
        L87:
            java.util.Set r0 = y72.b.f138021d
            p2(r4, r0)
        L8c:
            r72.n r5 = r5.f106520h
            nd2.b r0 = V(r4, r5)
            if (r0 != 0) goto L98
            nd2.b r0 = y72.b.b(r5)
        L98:
            if (r0 == 0) goto La2
            java.util.Set r1 = y72.b.f138020c
            p2(r4, r1)
            r3.add(r0)
        La2:
            if (r0 == 0) goto Laa
            pd2.r0 r4 = r0.f90431f
            y72.b.g(r4, r5)
            goto Laf
        Laa:
            java.util.Set r5 = y72.b.f138020c
            p2(r4, r5)
        Laf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kh2.g3.v(ke2.i, r72.k0):void");
    }

    public static void v0(sc1.b bVar, cr1.a aVar) {
        bVar.f112296l0 = aVar;
    }

    public static void v1(u31.f fVar, nx.f0 f0Var) {
        fVar.T0 = f0Var;
    }

    public static final void v2(FragmentActivity activity, Context context) {
        yb0.n a13;
        sw0.k onDismissCallback = sw0.k.f115508u;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(onDismissCallback, "onDismissCallback");
        int i13 = yb0.n.f138503p;
        String string = activity.getString(dq1.f.disable_idea_pin_alert_modal_title);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = activity.getString(dq1.f.disable_idea_pin_alert_modal_subtitle);
        String string3 = activity.getString(dq1.f.disable_idea_pin_alert_modal_cancel_button_text);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        a13 = xa0.j.a(context, string, string2, string3, (r20 & 16) != 0 ? "" : null, (r20 & 32) != 0 ? yb0.k.f138491j : new uv0.f(7, onDismissCallback), (r20 & 64) != 0 ? yb0.k.f138492k : null, (r20 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? yb0.k.f138493l : null, (r20 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? yb0.l.f138495j : null);
        ((AlertContainer) activity.findViewById(dq1.c.alert_container)).c(a13);
    }

    public static final km0.a w(lm0.x0 x0Var) {
        Object obj;
        List list = x0Var.f83915i.f93634a;
        ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((o82.i2) it.next()).f93619a);
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            if (obj instanceof km0.a) {
                break;
            }
        }
        return (km0.a) (obj instanceof km0.a ? obj : null);
    }

    public static void w0(yq1.u0 u0Var, mr1.a aVar) {
        u0Var.f140036f0 = aVar;
    }

    public static void w1(kx0.o oVar, nx.o0 o0Var) {
        oVar.V0 = o0Var;
    }

    public static final String w2(oq oqVar) {
        Intrinsics.checkNotNullParameter(oqVar, "<this>");
        return k3.T1(oqVar.getHighlightType(), oqVar.getConfig().getColorHex());
    }

    public static int x(String input) {
        Intrinsics.checkNotNullParameter(input, "id");
        Intrinsics.checkNotNullParameter(input, "input");
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        byte[] bytes = a.a.C(input, "pin1309:59:15PDT2024").getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        String bigInteger = new BigInteger(1, messageDigest.digest(bytes)).toString(16);
        Intrinsics.checkNotNullExpressionValue(bigInteger, "toString(...)");
        return new BigInteger(StringsKt.Q(bigInteger, 32), CharsKt.checkRadix(16)).mod(BigInteger.valueOf(10L)).intValue();
    }

    public static void x0(MediaGalleryActivity mediaGalleryActivity, lu1.d dVar) {
        mediaGalleryActivity.f46718k = dVar;
    }

    public static void x1(yq1.u0 u0Var, h9 h9Var) {
        u0Var.f140038h0 = h9Var;
    }

    public static final v31.b x2(lm0.b bVar, Context context) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        return new v31.b(bVar.f83845c, 0, bVar.f83843a.a(context).toString(), bVar.f83844b.a(context).toString(), "", null, null, 98);
    }

    public static final void y(GestaltIconButton gestaltIconButton, Function1 init) {
        Intrinsics.checkNotNullParameter(gestaltIconButton, "<this>");
        Intrinsics.checkNotNullParameter(init, "init");
        om1.q qVar = new om1.q(gestaltIconButton.w());
        init.invoke(qVar);
        gestaltIconButton.t(new ql1.k(qVar, 21));
    }

    public static void y0(eu.e eVar, es.a aVar) {
        eVar.Z0 = aVar;
    }

    public static void y1(IdeaPinCreationCameraView ideaPinCreationCameraView, lb0.r rVar) {
        ideaPinCreationCameraView.f45936e = rVar;
    }

    public static byte[] y2(com.google.firebase.messaging.d dVar) {
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int min = Math.min(8192, Math.max(RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN, Integer.highestOneBit(0) * 2));
        int i13 = 0;
        while (i13 < 2147483639) {
            int min2 = Math.min(min, 2147483639 - i13);
            byte[] bArr = new byte[min2];
            arrayDeque.add(bArr);
            int i14 = 0;
            while (i14 < min2) {
                int read = dVar.read(bArr, i14, min2 - i14);
                if (read == -1) {
                    return D(arrayDeque, i13);
                }
                i14 += read;
                i13 += read;
            }
            long j13 = min * (min < 4096 ? 4 : 2);
            min = j13 > 2147483647L ? Integer.MAX_VALUE : j13 < -2147483648L ? Integer.MIN_VALUE : (int) j13;
        }
        if (dVar.read() == -1) {
            return D(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    public static final CharSequence z(Context context, List collaboratorsToShow, int i13, Function0 onOthersClicked) {
        SpannableStringBuilder spannableStringBuilder;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(collaboratorsToShow, "collaboratorsToShow");
        Intrinsics.checkNotNullParameter("", "description");
        Intrinsics.checkNotNullParameter(onOthersClicked, "onOthersClicked");
        boolean z13 = !collaboratorsToShow.isEmpty();
        boolean z14 = !kotlin.text.z.j("");
        if (!z13 || !z14) {
            return z13 ? A(context, collaboratorsToShow, i13, onOthersClicked) : "";
        }
        SpannableStringBuilder A = A(context, collaboratorsToShow, i13, onOthersClicked);
        if ((!kotlin.text.z.j(A)) && (!kotlin.text.z.j(""))) {
            spannableStringBuilder = A.append((CharSequence) " · ").append((CharSequence) "");
            Intrinsics.f(spannableStringBuilder);
        } else {
            spannableStringBuilder = kotlin.text.z.j("") ^ true ? new SpannableStringBuilder("") : new SpannableStringBuilder();
        }
        return spannableStringBuilder;
    }

    public static void z0(lu.k kVar, es.a aVar) {
        kVar.S0 = aVar;
    }

    public static void z1(ht0.m mVar, w7 w7Var) {
        mVar.f70124t0 = w7Var;
    }

    public static LinkedHashMap z2(String[] strArr) {
        List split$default;
        Intrinsics.checkNotNullParameter(strArr, "<this>");
        Intrinsics.checkNotNullParameter(":", "delimiter");
        int a13 = kotlin.collections.y0.a(strArr.length);
        if (a13 < 16) {
            a13 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(a13);
        for (String str : strArr) {
            split$default = StringsKt__StringsKt.split$default(str, new String[]{":"}, false, 0, 6, null);
            linkedHashMap.put(split$default.get(0), split$default.get(1));
        }
        return linkedHashMap;
    }
}
