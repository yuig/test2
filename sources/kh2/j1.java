package kh2;

import a.cb;
import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import android.webkit.WebView;
import android.widget.TextView;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import c2.d6;
import com.bugsnag.android.ErrorType;
import com.pinterest.activity.create.ScrapedImagesResultsActivity;
import com.pinterest.activity.user.UserSetImageActivity;
import com.pinterest.ads.onetap.view.SwipeAwareScrollView;
import com.pinterest.api.model.aa0;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.es0;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.fi0;
import com.pinterest.api.model.jo0;
import com.pinterest.api.model.ur0;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import io.embrace.android.embracesdk.internal.payload.Attribute;
import io.embrace.android.embracesdk.internal.payload.Log;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.json.internal.JsonDecodingException;
import kotlinx.serialization.json.internal.JsonEncodingException;
import so.o8;
import so.oa;
import so.p7;
import so.r8;
import so.s8;
import so.x8;
import t3.z4;

/* loaded from: classes4.dex */
public abstract class j1 implements pc.a {
    public static final z9.e0 A(Context context) {
        z9.e0 e0Var = new z9.e0(context);
        z9.s0 s0Var = e0Var.f141275v;
        s0Var.a(new ba.g(s0Var));
        e0Var.f141275v.a(new ba.i());
        e0Var.f141275v.a(new ba.n());
        return e0Var;
    }

    public static void A0(tt0.l0 l0Var, lh0.s1 s1Var) {
        l0Var.f119167c0 = s1Var;
    }

    public static int A1(int i13, int i14, int[] iArr, int[] iArr2) {
        long j13 = 0;
        for (int i15 = 0; i15 < i13; i15++) {
            long j14 = ((iArr2[r3] & 4294967295L) - (4294967295L & iArr[i15])) + j13;
            iArr2[i14 + i15] = (int) j14;
            j13 = j14 >> 32;
        }
        return (int) j13;
    }

    public static int B(int i13, int[] iArr, int[] iArr2, int[] iArr3) {
        long j13 = 0;
        for (int i14 = 0; i14 < i13; i14++) {
            long j14 = (iArr[i14] & 4294967295L) + (4294967295L & iArr2[i14]) + j13;
            iArr3[i14] = (int) j14;
            j13 = j14 >>> 32;
        }
        return (int) j13;
    }

    public static void B0(zv0.j jVar, lh0.s1 s1Var) {
        jVar.A0 = s1Var;
    }

    public static int B1(int i13, int[] iArr, int[] iArr2) {
        long j13 = 0;
        for (int i14 = 0; i14 < i13; i14++) {
            long j14 = ((iArr2[i14] & 4294967295L) - (4294967295L & iArr[i14])) + j13;
            iArr2[i14] = (int) j14;
            j13 = j14 >> 32;
        }
        return (int) j13;
    }

    public static void C(int i13, int i14, int[] iArr) {
        long j13 = (iArr[0] & 4294967295L) + (i14 & 4294967295L);
        iArr[0] = (int) j13;
        long j14 = (4294967295L & iArr[1]) + 1 + (j13 >>> 32);
        iArr[1] = (int) j14;
        if ((j14 >>> 32) == 0) {
            return;
        }
        p0(i13, 2, iArr);
    }

    public static void C0(mx.h hVar, np1.j jVar) {
        hVar.f88458c0 = jVar;
    }

    public static final void C1(so2.g0 g0Var, Number result) {
        Intrinsics.checkNotNullParameter(g0Var, "<this>");
        Intrinsics.checkNotNullParameter(result, "result");
        so2.g0.n(g0Var, "Unexpected special floating-point value " + result + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2);
        throw null;
    }

    public static void D(x92.b bVar) {
        n60.o.A(bVar, "userdiditdata.images", "200x", "userdiditdata.id", "userdiditdata.user()");
        n60.o.w(bVar, "userdiditdata.done_at", "userdiditdata.pin()", "userdiditdata.details", "userdiditdata.image_signatures");
        n60.o.w(bVar, "userdiditdata.reaction_by_me", "userdiditdata.reaction_counts", "userdiditdata.marked_helpful_by_me", "userdiditdata.helpful_count");
        bVar.e("userdiditdata.comment_count");
    }

    public static void D0(tt0.l0 l0Var, ag1.b bVar) {
        l0Var.f119169e0 = bVar;
    }

    public static BigInteger D1(int[] iArr, int i13) {
        byte[] bArr = new byte[i13 << 2];
        for (int i14 = 0; i14 < i13; i14++) {
            int i15 = iArr[i14];
            if (i15 != 0) {
                e0.t.K0(bArr, i15, ((i13 - 1) - i14) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static void E(x92.b bVar) {
        bVar.e("pin.id");
        bVar.h("pin.images", "736x");
    }

    public static void E0(tt0.l0 l0Var, ag1.h hVar) {
        l0Var.f119175k0 = hVar;
    }

    public static final jz.a E1(ur0 ur0Var) {
        es0 es0Var;
        Intrinsics.checkNotNullParameter(ur0Var, "<this>");
        List list = ur0Var.f42632f;
        return new jz.a(ur0Var.f42627a, ur0Var.f42629c, (list == null || (es0Var = (es0) CollectionsKt.firstOrNull(list)) == null) ? null : J1(es0Var));
    }

    public static void F(x92.b bVar) {
        n60.o.w(bVar, "shopcollection.cover_image_url", "shopcollection.cover_square_image_url", "shopcollection.description", "shopcollection.layout");
        n60.o.w(bVar, "shopcollection.layout_has_border", "shopcollection.domain", "shopcollection.type", "shopcollection.object_id");
        n60.o.w(bVar, "shopcollection.label_text", "shopcollection.title", "shopcollection.action_text", "shopcollection.layout_params");
        bVar.e("shopcollection.merchant_id");
    }

    public static void F0(zv0.j jVar, ag1.h hVar) {
        jVar.B0 = hVar;
    }

    public static void F1(tc.g writer, pc.v customScalarAdapters, b40.v0 value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value.f21757a instanceof pc.q0) {
            writer.M0("objectIdsToUnsubscribe");
            pc.c.d(pc.c.b(pc.c.a(pc.c.f99524e))).a(writer, customScalarAdapters, (pc.q0) value.f21757a);
        }
        pc.r0 r0Var = value.f21758b;
        if (r0Var instanceof pc.q0) {
            writer.M0("objectIdsToResubscribe");
            pc.c.d(pc.c.b(pc.c.a(pc.c.f99524e))).a(writer, customScalarAdapters, (pc.q0) r0Var);
        }
    }

    public static void G(x92.b bVar) {
        bVar.h("interest.images", "75x75");
        n60.o.A(bVar, "interest.images", "236x", "interest.type", "interest.id");
        n60.o.w(bVar, "interest.name", "interest.creation_time", "interest.key", "interest.background_color");
        n60.o.v(bVar, "interest.url_name", "interest.follower_count", "interest.feed_update_time");
    }

    public static void G0(UserSetImageActivity userSetImageActivity, e12.e eVar) {
        userSetImageActivity.f35230e = eVar;
    }

    public static final Log G1(bj2.h hVar) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        boolean z13 = ((ri2.b) ((bj2.b) hVar).f22976e).f108398f;
        String str = z13 ? ((ri2.b) ((bj2.b) hVar).f22976e).f108393a : null;
        String str2 = z13 ? ((ri2.b) ((bj2.b) hVar).f22976e).f108394b : null;
        bj2.b bVar = (bj2.b) hVar;
        int severityNumber = bVar.f22977f.getSeverityNumber();
        qi2.e eVar = bVar.f22981j;
        String asString = (eVar == null ? cj2.d.INSTANCE : new cj2.a(eVar.f104007a)).asString();
        qi2.d attributes = bVar.f22979h;
        Intrinsics.checkNotNullExpressionValue(attributes, "attributes");
        Intrinsics.checkNotNullParameter(attributes, "<this>");
        Set<Map.Entry> entrySet = attributes.a().entrySet();
        ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(entrySet, 10));
        for (Map.Entry entry : entrySet) {
            arrayList.add(new Attribute(((ri2.e) entry.getKey()).f108404b, entry.getValue().toString()));
        }
        return new Log(Long.valueOf(bVar.f22974c), Integer.valueOf(severityNumber), bVar.f22978g, asString, arrayList, str, str2);
    }

    public static int H(int i13, int[] iArr, int[] iArr2, int[] iArr3) {
        long j13 = 0;
        for (int i14 = 0; i14 < i13; i14++) {
            long j14 = (iArr[i14] & 4294967295L) + (iArr2[i14] & 4294967295L) + (4294967295L & iArr3[i14]) + j13;
            iArr3[i14] = (int) j14;
            j13 = j14 >>> 32;
        }
        return (int) j13;
    }

    public static void H0(zx0.f fVar, lh0.h2 h2Var) {
        fVar.f143017t0 = h2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v6, types: [kotlin.collections.q0] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.util.ArrayList] */
    public static final jz.b H1(ur0 ur0Var) {
        ?? r53;
        Intrinsics.checkNotNullParameter(ur0Var, "<this>");
        yk2.b bVar = new yk2.b();
        aa0 aa0Var = ur0Var.f42633g;
        if (aa0Var != null) {
            u50.i0 I1 = I1(aa0Var.f35683b);
            if (I1 == null) {
                int i13 = nz.e.anket_take_survey;
                String[] formatArgs = new String[0];
                Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
                I1 = new u50.k0(i13, new ArrayList(0));
            }
            bVar.add(new jz.e(aa0Var.f35682a, I1, I1(aa0Var.f35684c)));
        }
        List list = ur0Var.f42632f;
        if (list != null) {
            List list2 = list;
            r53 = new ArrayList(kotlin.collections.g0.q(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                r53.add(J1((es0) it.next()));
            }
        } else {
            r53 = 0;
        }
        if (r53 == 0) {
            r53 = kotlin.collections.q0.f80391a;
        }
        bVar.addAll((Collection) r53);
        aa0 aa0Var2 = ur0Var.f42634h;
        u50.i0 I12 = I1(aa0Var2 != null ? aa0Var2.f35682a : null);
        if (I12 == null) {
            int i14 = nz.e.anket_default_final_message;
            String[] formatArgs2 = new String[0];
            Intrinsics.checkNotNullParameter(formatArgs2, "formatArgs");
            I12 = new u50.k0(i14, new ArrayList(0));
        }
        u50.i0 I13 = I1(aa0Var2 != null ? aa0Var2.f35683b : null);
        if (I13 == null) {
            int i15 = nz.e.anket_close;
            String[] formatArgs3 = new String[0];
            Intrinsics.checkNotNullParameter(formatArgs3, "formatArgs");
            I13 = new u50.k0(i15, new ArrayList(0));
        }
        bVar.add(new jz.c(I12, I13));
        return new jz.b(ur0Var.f42627a, kotlin.collections.e0.a(bVar));
    }

    public static int I(int[] iArr, int[] iArr2, int[] iArr3) {
        long j13 = (iArr[0] & 4294967295L) + (iArr2[0] & 4294967295L) + (iArr3[0] & 4294967295L);
        iArr3[0] = (int) j13;
        long j14 = (iArr[1] & 4294967295L) + (iArr2[1] & 4294967295L) + (iArr3[1] & 4294967295L) + (j13 >>> 32);
        iArr3[1] = (int) j14;
        long j15 = (iArr[2] & 4294967295L) + (iArr2[2] & 4294967295L) + (iArr3[2] & 4294967295L) + (j14 >>> 32);
        iArr3[2] = (int) j15;
        long j16 = (iArr[3] & 4294967295L) + (iArr2[3] & 4294967295L) + (iArr3[3] & 4294967295L) + (j15 >>> 32);
        iArr3[3] = (int) j16;
        return (int) (j16 >>> 32);
    }

    public static void I0(tt0.l0 l0Var, ny1.w wVar) {
        l0Var.f119174j0 = wVar;
    }

    public static final u50.f0 I1(String str) {
        if (str != null) {
            return ep.b.x(str, "string", str);
        }
        return null;
    }

    public static int J(int i13, int i14, int[] iArr, int[] iArr2) {
        long j13 = 0;
        for (int i15 = 0; i15 < i13; i15++) {
            long j14 = (iArr[i15] & 4294967295L) + (4294967295L & iArr2[r7]) + j13;
            iArr2[i14 + i15] = (int) j14;
            j13 = j14 >>> 32;
        }
        return (int) j13;
    }

    public static void J0(tt0.l0 l0Var, nx.f0 f0Var) {
        l0Var.f119168d0 = f0Var;
    }

    public static final jz.d J1(es0 es0Var) {
        Intrinsics.checkNotNullParameter(es0Var, "<this>");
        return new jz.d(es0Var.f37337d, es0Var.f37334a, es0Var.f37338e, es0Var.f37344k, es0Var.f37345l);
    }

    public static int K(int i13, int[] iArr, int[] iArr2) {
        long j13 = 0;
        for (int i14 = 0; i14 < i13; i14++) {
            long j14 = (iArr[i14] & 4294967295L) + (4294967295L & iArr2[i14]) + j13;
            iArr2[i14] = (int) j14;
            j13 = j14 >>> 32;
        }
        return (int) j13;
    }

    public static void K0(tt0.l0 l0Var, lb0.r rVar) {
        l0Var.f119176l0 = rVar;
    }

    public static final void K1(q1.x xVar, String str, List list) {
        jc0.l lVar = new jc0.l(str, 5);
        tc0.d dVar = tc0.d.f117234s;
        int size = list.size();
        u80.s sVar = new u80.s(8, list, lVar);
        u80.s sVar2 = new u80.s(9, list, dVar);
        tc0.e eVar = new tc0.e(list, 3);
        Object obj = q2.i.f102113a;
        ((q1.i) xVar).s(size, sVar, sVar2, new q2.h(eVar, true, -632812321));
    }

    public static void L(int i13, int i14, int i15, int[] iArr) {
        long j13 = (i14 & 4294967295L) + (4294967295L & iArr[i15]);
        iArr[i15] = (int) j13;
        if ((j13 >>> 32) == 0) {
            return;
        }
        p0(i13, i15 + 1, iArr);
    }

    public static void L0(ct0.s sVar, uk1.e eVar) {
        sVar.L0 = eVar;
    }

    public static final String L1(Number number, String str, String str2) {
        return "Unexpected special floating-point value " + number + " with key " + str + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) j1(-1, str2));
    }

    public static int M(int i13, int i14, int[] iArr) {
        long j13 = (i14 & 4294967295L) + (4294967295L & iArr[0]);
        iArr[0] = (int) j13;
        if ((j13 >>> 32) == 0) {
            return 0;
        }
        return p0(i13, 1, iArr);
    }

    public static void M0(mv0.k kVar, uk1.e eVar) {
        kVar.f88377o0 = eVar;
    }

    public static final wy0 M1(f30 f30Var) {
        wy0 S;
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        fi0 r63 = f30Var.r6();
        if (r63 != null && (S = r63.S()) != null) {
            return S;
        }
        wy0 I5 = f30Var.I5();
        return I5 == null ? b40.n(f30Var) : I5;
    }

    public static HashMap N(String str) {
        HashMap hashMap = new HashMap();
        bs1.c.F1(hashMap, new Pair("collage_item_id", str), new Pair("collage_template_id", null));
        return hashMap;
    }

    public static void N0(zx0.f fVar, r8 r8Var) {
        fVar.f143015r0 = r8Var;
    }

    public static /* synthetic */ boolean N1(String str, Object obj) {
        if (str != obj) {
            return str != null && str.equals(obj);
        }
        return true;
    }

    public static final Object O(com.google.common.util.concurrent.c0 c0Var, bl2.c frame) {
        try {
            if (c0Var.isDone()) {
                return r4.h.g(c0Var);
            }
            ao2.o oVar = new ao2.o(1, cl2.h.b(frame));
            oVar.v();
            c0Var.d(new androidx.appcompat.widget.j(c0Var, oVar, 4), r4.m.INSTANCE);
            oVar.e(new z3.m(c0Var, 2));
            Object u13 = oVar.u();
            if (u13 == cl2.a.COROUTINE_SUSPENDED) {
                Intrinsics.checkNotNullParameter(frame, "frame");
            }
            return u13;
        } catch (ExecutionException e13) {
            Throwable cause = e13.getCause();
            Intrinsics.f(cause);
            throw cause;
        }
    }

    public static void O0(ScrapedImagesResultsActivity scrapedImagesResultsActivity, r8 r8Var) {
        scrapedImagesResultsActivity.f34944j = r8Var;
    }

    public static int P(Context context, int i13) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return ml2.c.c(i13 / w(context).density);
    }

    public static void P0(tt0.l0 l0Var, dl1.t tVar) {
        l0Var.f119172h0 = tVar;
    }

    public static Pair Q(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Window window = activity.getWindow();
        View findViewById = window != null ? window.findViewById(R.id.content) : null;
        View view = findViewById instanceof View ? findViewById : null;
        Pair pair = view != null ? new Pair(Integer.valueOf(view.getWidth()), Integer.valueOf(view.getHeight())) : new Pair(0, 0);
        int intValue = ((Number) pair.f80346a).intValue();
        int intValue2 = ((Number) pair.f80347b).intValue();
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(activity, "<this>");
        DisplayMetrics displayMetrics = activity.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "getDisplayMetrics(...)");
        Integer valueOf = Integer.valueOf(ml2.c.c(intValue / displayMetrics.density));
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(activity, "<this>");
        DisplayMetrics displayMetrics2 = activity.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics2, "getDisplayMetrics(...)");
        return new Pair(valueOf, Integer.valueOf(ml2.c.c(intValue2 / displayMetrics2.density)));
    }

    public static void Q0(mv0.k kVar, o8 o8Var) {
        kVar.f88378p0 = o8Var;
    }

    public static final NavigationImpl R(String boardId, String sectionId) {
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        Intrinsics.checkNotNullParameter(sectionId, "sectionId");
        NavigationImpl z03 = Navigation.z0((ScreenLocation) com.pinterest.screens.q.f51216f.getValue(), sectionId);
        z03.m0("com.pinterest.EXTRA_BOARD_ID", boardId);
        Intrinsics.checkNotNullExpressionValue(z03, "apply(...)");
        return z03;
    }

    public static void R0(zv0.j jVar, so.n nVar) {
        jVar.f142889z0 = nVar;
    }

    public static e2.u S() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        bh.b[] bVarArr = ho.h.f69673a;
        for (int i13 = 0; i13 < 6; i13++) {
            bh.b bVar = bVarArr[i13];
            bVar.getClass();
            ArrayList arrayList2 = new ArrayList();
            try {
                InputStream i14 = ((z.a) bVar.f22798b).i();
                try {
                    InputStreamReader inputStreamReader = new InputStreamReader(i14, "UTF-8");
                    try {
                        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                        while (true) {
                            try {
                                String readLine = bufferedReader.readLine();
                                if (readLine == null) {
                                    break;
                                }
                                arrayList2.add(readLine);
                            } finally {
                            }
                        }
                        bufferedReader.close();
                        inputStreamReader.close();
                        i14.close();
                        arrayList.add(new jo.f((String) bVar.f22799c, arrayList2));
                    } finally {
                    }
                } finally {
                }
            } catch (IOException e13) {
                throw new wd.x("Error while reading " + ((String) bVar.f22799c), e13);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            jo.f fVar = (jo.f) it.next();
            linkedHashMap.put(fVar.f77136a, fVar);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        ArrayList arrayList3 = new ArrayList();
        androidx.appcompat.app.j0[] j0VarArr = ho.h.f69674b;
        for (int i15 = 0; i15 < 5; i15++) {
            androidx.appcompat.app.j0 j0Var = j0VarArr[i15];
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(((z.a) j0Var.f16057b).i(), "UTF-8"));
                try {
                    StringBuilder sb3 = new StringBuilder(4096);
                    while (true) {
                        String readLine2 = bufferedReader2.readLine();
                        if (readLine2 == null) {
                            break;
                        }
                        sb3.append(readLine2);
                        sb3.append('\n');
                    }
                    String sb4 = sb3.toString();
                    bufferedReader2.close();
                    arrayList3.add(new jo.j((String) j0Var.f16056a, j0Var.k(sb4)));
                } finally {
                }
            } catch (IOException e14) {
                throw new IllegalArgumentException(e14);
            }
        }
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            jo.j jVar = (jo.j) it2.next();
            linkedHashMap2.put(jVar.f77145a, jVar);
        }
        return new e2.u(linkedHashMap, linkedHashMap2);
    }

    public static void S0(ScrapedImagesResultsActivity scrapedImagesResultsActivity, vo.u uVar) {
        scrapedImagesResultsActivity.f34945k = uVar;
    }

    public static final int T(jo0 jo0Var, String version) {
        List split$default;
        List split$default2;
        Intrinsics.checkNotNullParameter(jo0Var, "<this>");
        Intrinsics.checkNotNullParameter(version, "version");
        String m13 = jo0Var.m();
        Intrinsics.checkNotNullExpressionValue(m13, "getCompatibleVersion(...)");
        split$default = StringsKt__StringsKt.split$default(m13, new String[]{"."}, false, 0, 6, null);
        List list = split$default;
        ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(Integer.parseInt((String) it.next())));
        }
        split$default2 = StringsKt__StringsKt.split$default(version, new String[]{"."}, false, 0, 6, null);
        List list2 = split$default2;
        ArrayList arrayList2 = new ArrayList(kotlin.collections.g0.q(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Integer.valueOf(Integer.parseInt((String) it2.next())));
        }
        int max = Math.max(arrayList.size(), arrayList2.size());
        int i13 = 0;
        while (i13 < max) {
            int intValue = i13 > arrayList.size() - 1 ? 0 : ((Number) arrayList.get(i13)).intValue();
            int intValue2 = i13 > arrayList2.size() - 1 ? 0 : ((Number) arrayList2.get(i13)).intValue();
            if (intValue < intValue2) {
                return -1;
            }
            if (intValue > intValue2) {
                return 1;
            }
            i13++;
        }
        return 0;
    }

    public static void T0(UserSetImageActivity userSetImageActivity, nr.p pVar) {
        userSetImageActivity.f35232g = pVar;
    }

    public static final sn2.f U(sn2.f fVar, HashSet hashSet) {
        sn2.f U;
        qn2.p pVar = qn2.p.f104516a;
        pn2.b1 W = pVar.W(fVar);
        if (!hashSet.add(W)) {
            return null;
        }
        am2.c1 e03 = pk.a0.e0(W);
        if (e03 != null) {
            sn2.f c03 = pk.a0.c0(e03);
            U = U(c03, hashSet);
            if (U == null) {
                return null;
            }
            boolean z13 = pk.a0.z0(pVar.W(c03)) || ((c03 instanceof sn2.g) && pk.a0.H0((sn2.g) c03));
            if ((U instanceof sn2.g) && pk.a0.H0((sn2.g) U) && pk.a0.F0(fVar) && z13) {
                return pVar.p0(c03);
            }
            if (!pk.a0.F0(U) && pVar.o0(fVar)) {
                return pVar.p0(U);
            }
        } else {
            if (!pk.a0.z0(W)) {
                return fVar;
            }
            pn2.h0 f03 = pk.a0.f0(fVar);
            if (f03 == null || (U = U(f03, hashSet)) == null) {
                return null;
            }
            if (pk.a0.F0(fVar)) {
                return pk.a0.F0(U) ? fVar : ((U instanceof sn2.g) && pk.a0.H0((sn2.g) U)) ? fVar : pVar.p0(U);
            }
        }
        return U;
    }

    public static void U0(UserSetImageActivity userSetImageActivity, i92.k kVar) {
        userSetImageActivity.f35229d = kVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final wa0.c V(com.pinterest.api.model.f30 r5) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            com.pinterest.api.model.hi0 r1 = r5.s6()
            r2 = 0
            if (r1 == 0) goto L26
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r3 = "key"
            java.lang.String r4 = "originals"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r3)
            java.util.Map r1 = r1.q()
            if (r1 == 0) goto L26
            java.lang.Object r1 = r1.get(r4)
            com.pinterest.api.model.sr r1 = (com.pinterest.api.model.sr) r1
            goto L27
        L26:
            r1 = r2
        L27:
            if (r1 == 0) goto L41
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = bs1.c.D0(r1)
            if (r0 == 0) goto L3f
            wa0.c r2 = new wa0.c
            int r3 = bs1.c.E0(r1)
            int r1 = bs1.c.w0(r1)
            r2.<init>(r0, r3, r1)
        L3f:
            if (r2 != 0) goto L46
        L41:
            r0 = 1
            wa0.c r2 = W(r5, r0)
        L46:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kh2.j1.V(com.pinterest.api.model.f30):wa0.c");
    }

    public static void V0(tt0.l0 l0Var, i92.k kVar) {
        l0Var.f119171g0 = kVar;
    }

    public static final wa0.c W(f30 f30Var, boolean z13) {
        String B0;
        wa0.c cVar = null;
        if (z13 && (B0 = bs1.c.B0(f30Var)) != null) {
            cVar = new wa0.c(B0, bs1.c.C0(f30Var), bs1.c.A0(f30Var));
        }
        if (cVar == null) {
            return u2.d0(z13 ? wa0.d.f128627a : wa0.d.f128628b, f30Var.A4());
        }
        return cVar;
    }

    public static void W0(wr0.s sVar, i92.k kVar) {
        sVar.A0 = kVar;
    }

    public static int X(int i13, int i14, int[] iArr) {
        while (i14 < i13) {
            int i15 = iArr[i14] - 1;
            iArr[i14] = i15;
            if (i15 != -1) {
                return 0;
            }
            i14++;
        }
        return -1;
    }

    public static void X0(UserSetImageActivity userSetImageActivity, x02.x2 x2Var) {
        userSetImageActivity.f35231f = x2Var;
    }

    public static boolean Y(int i13, int[] iArr, int[] iArr2) {
        for (int i14 = i13 - 1; i14 >= 0; i14--) {
            if (iArr[i14] != iArr2[i14]) {
                return false;
            }
        }
        return true;
    }

    public static void Y0(SwipeAwareScrollView swipeAwareScrollView, ac2.m mVar) {
        swipeAwareScrollView.R = mVar;
    }

    public static InvocationHandler Z() {
        return (InvocationHandler) Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, i0()).getDeclaredMethod("createWebViewProviderFactory", new Class[0]).invoke(null, new Object[0]);
    }

    public static final void Z0(so2.g0 g0Var, String entity) {
        Intrinsics.checkNotNullParameter(g0Var, "<this>");
        Intrinsics.checkNotNullParameter(entity, "entity");
        g0Var.m(g0Var.f114789a - 1, "Trailing comma before the end of JSON " + entity, "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingCommas = true' in 'Json {}' builder to support them.");
        throw null;
    }

    public static final void a(uc0.f fVar, i2.o oVar, int i13, int i14) {
        int i15;
        i2.s sVar = (i2.s) oVar;
        sVar.Y(370387158);
        int i16 = 4;
        if ((i13 & 14) == 0) {
            i15 = (((i14 & 1) == 0 && sVar.h(fVar)) ? 4 : 2) | i13;
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
                androidx.lifecycle.l1 v03 = c3.v0(uc0.f.class, a13, V, a13 instanceof androidx.lifecycle.k ? ((androidx.lifecycle.k) a13).getDefaultViewModelCreationExtras() : u6.a.f120754b, sVar);
                sVar.r(false);
                sVar.r(false);
                fVar = (uc0.f) v03;
            }
            sVar.s();
            i2.q1 z13 = bs1.c.z(fVar.f121825e, sVar);
            fVar.i(new uc0.i(new oc0.a(q2.i.c(-1443001954, new androidx.compose.foundation.lazy.layout.v(12, z13, fVar), sVar))));
            gh0.b.d(((uc0.e) z13.getValue()).f121771a, null, sVar, 8, 2);
        }
        i2.f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new yu.c(fVar, i13, i14, i16);
        }
    }

    public static int[] a0(int i13, BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > i13) {
            throw new IllegalArgumentException();
        }
        int[] iArr = new int[(i13 + 31) >> 5];
        int i14 = 0;
        while (bigInteger.signum() != 0) {
            iArr[i14] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
            i14++;
        }
        return iArr;
    }

    public static /* synthetic */ void a1(so2.g0 g0Var) {
        Z0(g0Var, "object");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(uc0.m2 r13, u2.q r14, i2.o r15, int r16, int r17) {
        /*
            r4 = r13
            java.lang.String r0 = "token"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            r0 = r15
            i2.s r0 = (i2.s) r0
            r1 = -1827956271(0xffffffff930b99d1, float:-1.7620104E-27)
            r0.Y(r1)
            r1 = r17 & 1
            if (r1 == 0) goto L16
            r1 = r16 | 6
            goto L28
        L16:
            r1 = r16 & 14
            if (r1 != 0) goto L26
            boolean r1 = r0.h(r13)
            if (r1 == 0) goto L22
            r1 = 4
            goto L23
        L22:
            r1 = 2
        L23:
            r1 = r16 | r1
            goto L28
        L26:
            r1 = r16
        L28:
            r2 = r17 & 2
            if (r2 == 0) goto L30
            r1 = r1 | 48
        L2e:
            r3 = r14
            goto L41
        L30:
            r3 = r16 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L2e
            r3 = r14
            boolean r5 = r0.h(r14)
            if (r5 == 0) goto L3e
            r5 = 32
            goto L40
        L3e:
            r5 = 16
        L40:
            r1 = r1 | r5
        L41:
            r5 = r1 & 91
            r6 = 18
            if (r5 != r6) goto L53
            boolean r5 = r0.z()
            if (r5 != 0) goto L4e
            goto L53
        L4e:
            r0.Q()
            r5 = r3
            goto L79
        L53:
            if (r2 == 0) goto L58
            u2.n r2 = u2.n.f120041b
            goto L59
        L58:
            r2 = r3
        L59:
            int r3 = r4.f121832e
            long r5 = kh2.g0.h(r3, r0)
            xb0.a r3 = new xb0.a
            r7 = 17
            r3.<init>(r13, r7)
            r7 = -1286010115(0xffffffffb3590afd, float:-5.0534243E-8)
            q2.h r9 = q2.i.c(r7, r3, r0)
            r1 = r1 & 112(0x70, float:1.57E-43)
            r11 = r1 | 3072(0xc00, float:4.305E-42)
            r12 = 4
            r8 = 0
            r7 = r2
            r10 = r0
            s(r5, r7, r8, r9, r10, r11, r12)
            r5 = r2
        L79:
            i2.f2 r6 = r0.t()
            if (r6 == 0) goto L8e
            q1.l r7 = new q1.l
            r3 = 19
            r0 = r7
            r1 = r16
            r2 = r17
            r4 = r13
            r0.<init>(r1, r2, r3, r4, r5)
            r6.f71113d = r7
        L8e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kh2.j1.b(uc0.m2, u2.q, i2.o, int, int):void");
    }

    public static xe2.g b0(androidx.activity.o oVar, androidx.lifecycle.p1 p1Var) {
        s8 s8Var = (s8) ((xe2.a) df.j1.b0(xe2.a.class, oVar));
        bf2.c B5 = s8Var.B5();
        m.h hVar = new m.h(s8Var.f114255d, s8Var.f114269e, 0);
        p1Var.getClass();
        return new xe2.g(B5, p1Var, hVar);
    }

    public static final boolean b1() {
        int i13 = at1.d.f20439o;
        return ((oa) ((m60.m0) nl.b.e()).i().f()).f2().b();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(uc0.n2 r30, u2.q r31, i2.o r32, int r33, int r34) {
        /*
            Method dump skipped, instructions count: 347
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kh2.j1.c(uc0.n2, u2.q, i2.o, int, int):void");
    }

    public static final q5.y0 c0(View view) {
        return yn2.q.b(new q5.z0(view, null));
    }

    public static boolean c1(int[] iArr) {
        if (iArr[0] != 1) {
            return false;
        }
        for (int i13 = 1; i13 < 4; i13++) {
            if (iArr[i13] != 0) {
                return false;
            }
        }
        return true;
    }

    public static final Sequence d0(AbstractComposeView abstractComposeView) {
        return yn2.x.e(abstractComposeView.getParent(), q5.a1.f102398a);
    }

    public static boolean d1(int[] iArr, int i13) {
        if (iArr[0] != 1) {
            return false;
        }
        for (int i14 = 1; i14 < i13; i14++) {
            if (iArr[i14] != 0) {
                return false;
            }
        }
        return true;
    }

    public static final JsonEncodingException e(Number value, String output) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(output, "output");
        return new JsonEncodingException("Unexpected special floating-point value " + value + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) j1(-1, output)));
    }

    public static int e0(int[] iArr) {
        return iArr[0] & 1;
    }

    public static final boolean e1(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(str, "<this>");
        int i13 = 0;
        while (true) {
            if (!(i13 < str.length())) {
                return true;
            }
            int codePointAt = str.codePointAt(i13);
            i13 += Character.charCount(codePointAt);
            if (128512 > codePointAt || codePointAt >= 128592) {
                if (127744 > codePointAt || codePointAt >= 128512) {
                    if (128640 > codePointAt || codePointAt >= 128768) {
                        if (9728 > codePointAt || codePointAt >= 9984) {
                            if (9984 > codePointAt || codePointAt >= 10176) {
                                if (65024 > codePointAt || codePointAt >= 65040) {
                                    if (129280 > codePointAt || codePointAt >= 129536) {
                                        if (127462 > codePointAt || codePointAt >= 127488) {
                                            if (codePointAt != 8205 && !Character.isWhitespace(codePointAt)) {
                                                return false;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static u50.f0 f0(int i13, String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(i13);
        SpannableString spannableString = new SpannableString(text);
        spannableString.setSpan(foregroundColorSpan, 0, text.length(), 0);
        return bs1.c.h2(spannableString);
    }

    public static final boolean f1(String str) {
        return !(str == null || str.length() == 0);
    }

    public static final JsonEncodingException g(oo2.g keyDescriptor) {
        Intrinsics.checkNotNullParameter(keyDescriptor, "keyDescriptor");
        return new JsonEncodingException("Value of type '" + keyDescriptor.i() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + keyDescriptor.c() + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }

    public static xe2.g g0(Fragment fragment, androidx.lifecycle.p1 p1Var) {
        s8 s8Var = ((x8) ((xe2.b) df.j1.b0(xe2.b.class, fragment))).f114708b;
        bf2.c B5 = s8Var.B5();
        m.h hVar = new m.h(s8Var.f114255d, s8Var.f114269e, 0);
        p1Var.getClass();
        return new xe2.g(B5, p1Var, hVar);
    }

    public static boolean g1(int[] iArr) {
        for (int i13 = 0; i13 < 4; i13++) {
            if (iArr[i13] != 0) {
                return false;
            }
        }
        return true;
    }

    public static final JsonDecodingException h(int i13, String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (i13 >= 0) {
            message = "Unexpected JSON token at offset " + i13 + ": " + message;
        }
        return new JsonDecodingException(message);
    }

    public static final SpannableStringBuilder h0(dl0.e eVar, Resources res, boolean z13, int i13) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(res, "res");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (z13) {
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(i13);
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) "  ·  ");
            spannableStringBuilder.setSpan(foregroundColorSpan, length, spannableStringBuilder.length(), 17);
        }
        spannableStringBuilder.append((CharSequence) res.getString(eVar.getText()));
        if (!z13) {
            ForegroundColorSpan foregroundColorSpan2 = new ForegroundColorSpan(i13);
            int length2 = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) "  ·  ");
            spannableStringBuilder.setSpan(foregroundColorSpan2, length2, spannableStringBuilder.length(), 17);
        }
        return spannableStringBuilder;
    }

    public static boolean h1(int[] iArr, int i13) {
        for (int i14 = 0; i14 < i13; i14++) {
            if (iArr[i14] != 0) {
                return false;
            }
        }
        return true;
    }

    public static final JsonDecodingException i(int i13, String message, String input) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(input, "input");
        return h(i13, message + "\nJSON input: " + ((Object) j1(i13, input)));
    }

    public static ClassLoader i0() {
        ClassLoader webViewClassLoader;
        if (Build.VERSION.SDK_INT >= 28) {
            webViewClassLoader = WebView.getWebViewClassLoader();
            return webViewClassLoader;
        }
        try {
            Method declaredMethod = WebView.class.getDeclaredMethod("getFactory", new Class[0]);
            declaredMethod.setAccessible(true);
            return declaredMethod.invoke(null, new Object[0]).getClass().getClassLoader();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e13) {
            throw new RuntimeException(e13);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void i1(RecyclerView rv2, AbstractComposeView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(rv2, "rv");
        i2.w b13 = z4.b(rv2);
        if (b13 == null) {
            for (ViewParent parent = rv2.getParent(); b13 == null && (parent instanceof View); parent = parent.getParent()) {
                b13 = z4.b((View) parent);
            }
        }
        ((fc0.d) view).a(b13);
    }

    public static final void j(uc0.r1 r1Var, i2.o oVar, int i13, int i14) {
        int i15;
        i2.s sVar = (i2.s) oVar;
        sVar.Y(-145292419);
        if ((i13 & 14) == 0) {
            i15 = (((i14 & 1) == 0 && sVar.h(r1Var)) ? 4 : 2) | i13;
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
                androidx.lifecycle.l1 v03 = c3.v0(uc0.r1.class, a13, V, a13 instanceof androidx.lifecycle.k ? ((androidx.lifecycle.k) a13).getDefaultViewModelCreationExtras() : u6.a.f120754b, sVar);
                sVar.r(false);
                sVar.r(false);
                r1Var = (uc0.r1) v03;
            }
            sVar.s();
            i2.q1 z13 = bs1.c.z(r1Var.f121825e, sVar);
            r1Var.i(new uc0.i(new oc0.a(q2.i.c(2119147957, new xb0.a(r1Var, 9), sVar))));
            gh0.b.d(((uc0.q1) z13.getValue()).f121852a, null, sVar, 8, 2);
        }
        i2.f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new yu.c(r1Var, i13, i14, 17);
        }
    }

    public static boolean j0(int i13, int[] iArr, int[] iArr2) {
        for (int i14 = i13 - 1; i14 >= 0; i14--) {
            int i15 = iArr[i14] ^ Integer.MIN_VALUE;
            int i16 = Integer.MIN_VALUE ^ iArr2[i14];
            if (i15 < i16) {
                return false;
            }
            if (i15 > i16) {
                return true;
            }
        }
        return true;
    }

    public static final CharSequence j1(int i13, CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() < 200) {
            return charSequence;
        }
        if (i13 == -1) {
            int length = charSequence.length() - 60;
            if (length <= 0) {
                return charSequence;
            }
            return "....." + charSequence.subSequence(length, charSequence.length()).toString();
        }
        int i14 = i13 - 30;
        int i15 = i13 + 30;
        String str = i14 <= 0 ? "" : ".....";
        String str2 = i15 >= charSequence.length() ? "" : ".....";
        StringBuilder i16 = n60.o.i(str);
        if (i14 < 0) {
            i14 = 0;
        }
        int length2 = charSequence.length();
        if (i15 > length2) {
            i15 = length2;
        }
        i16.append(charSequence.subSequence(i14, i15).toString());
        i16.append(str2);
        return i16.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void k(uc0.o2 r13, u2.q r14, i2.o r15, int r16, int r17) {
        /*
            r4 = r13
            java.lang.String r0 = "token"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            r0 = r15
            i2.s r0 = (i2.s) r0
            r1 = 549419089(0x20bf7851, float:3.2436277E-19)
            r0.Y(r1)
            r1 = r17 & 1
            if (r1 == 0) goto L16
            r1 = r16 | 6
            goto L28
        L16:
            r1 = r16 & 14
            if (r1 != 0) goto L26
            boolean r1 = r0.h(r13)
            if (r1 == 0) goto L22
            r1 = 4
            goto L23
        L22:
            r1 = 2
        L23:
            r1 = r16 | r1
            goto L28
        L26:
            r1 = r16
        L28:
            r2 = r17 & 2
            if (r2 == 0) goto L30
            r1 = r1 | 48
        L2e:
            r3 = r14
            goto L41
        L30:
            r3 = r16 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L2e
            r3 = r14
            boolean r5 = r0.h(r14)
            if (r5 == 0) goto L3e
            r5 = 32
            goto L40
        L3e:
            r5 = 16
        L40:
            r1 = r1 | r5
        L41:
            r5 = r1 & 91
            r6 = 18
            if (r5 != r6) goto L53
            boolean r5 = r0.z()
            if (r5 != 0) goto L4e
            goto L53
        L4e:
            r0.Q()
            r5 = r3
            goto L8f
        L53:
            if (r2 == 0) goto L58
            u2.n r2 = u2.n.f120041b
            goto L59
        L58:
            r2 = r3
        L59:
            android.util.TypedValue r3 = new android.util.TypedValue
            r3.<init>()
            i2.w3 r5 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.f17455b
            java.lang.Object r5 = r0.m(r5)
            android.content.Context r5 = (android.content.Context) r5
            android.content.res.Resources r5 = r5.getResources()
            int r7 = r4.f121842d
            r8 = 1
            r5.getValue(r7, r3, r8)
            long r7 = b3.w.f21378b
            float r3 = r3.getFloat()
            xb0.a r5 = new xb0.a
            r5.<init>(r13, r6)
            r6 = -1923583107(0xffffffff8d58737d, float:-6.6699153E-31)
            q2.h r9 = q2.i.c(r6, r5, r0)
            r1 = r1 & 112(0x70, float:1.57E-43)
            r11 = r1 | 3078(0xc06, float:4.313E-42)
            r12 = 0
            r5 = r7
            r7 = r2
            r8 = r3
            r10 = r0
            s(r5, r7, r8, r9, r10, r11, r12)
            r5 = r2
        L8f:
            i2.f2 r6 = r0.t()
            if (r6 == 0) goto La4
            q1.l r7 = new q1.l
            r3 = 21
            r0 = r7
            r1 = r16
            r2 = r17
            r4 = r13
            r0.<init>(r1, r2, r3, r4, r5)
            r6.f71113d = r7
        La4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kh2.j1.k(uc0.o2, u2.q, i2.o, int, int):void");
    }

    public static boolean k0(int[] iArr, int[] iArr2) {
        for (int i13 = 3; i13 >= 0; i13--) {
            int i14 = iArr[i13] ^ Integer.MIN_VALUE;
            int i15 = Integer.MIN_VALUE ^ iArr2[i13];
            if (i14 < i15) {
                return false;
            }
            if (i14 > i15) {
                return true;
            }
        }
        return true;
    }

    public static void k1(int[] iArr, int[] iArr2, int[] iArr3) {
        long j13 = iArr2[0] & 4294967295L;
        int i13 = 1;
        long j14 = iArr2[1] & 4294967295L;
        long j15 = iArr2[2] & 4294967295L;
        long j16 = iArr2[3] & 4294967295L;
        long j17 = iArr[0] & 4294967295L;
        long j18 = j17 * j13;
        iArr3[0] = (int) j18;
        long j19 = (j17 * j14) + (j18 >>> 32);
        iArr3[1] = (int) j19;
        long j23 = (j17 * j15) + (j19 >>> 32);
        iArr3[2] = (int) j23;
        long j24 = (j17 * j16) + (j23 >>> 32);
        iArr3[3] = (int) j24;
        iArr3[4] = (int) (j24 >>> 32);
        for (int i14 = 4; i13 < i14; i14 = 4) {
            long j25 = iArr[i13] & 4294967295L;
            long j26 = (j25 * j13) + (iArr3[i13] & 4294967295L);
            iArr3[i13] = (int) j26;
            int i15 = i13 + 1;
            int i16 = i13;
            long j27 = (j25 * j14) + (iArr3[i15] & 4294967295L) + (j26 >>> 32);
            iArr3[i15] = (int) j27;
            long j28 = (j25 * j15) + (iArr3[r8] & 4294967295L) + (j27 >>> 32);
            iArr3[i16 + 2] = (int) j28;
            long j29 = (j25 * j16) + (iArr3[r5] & 4294967295L) + (j28 >>> 32);
            iArr3[i16 + 3] = (int) j29;
            iArr3[i16 + 4] = (int) (j29 >>> 32);
            i13 = i15;
            j13 = j13;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void l(int r29, s1.o0 r30, u2.q r31, long r32, float r34, float r35, float r36, float r37, i2.o r38, int r39, int r40) {
        /*
            Method dump skipped, instructions count: 721
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kh2.j1.l(int, s1.o0, u2.q, long, float, float, float, float, i2.o, int, int):void");
    }

    public static final void l0(CoroutineContext coroutineContext, Throwable th3) {
        try {
            ao2.h0 h0Var = (ao2.h0) coroutineContext.get(ao2.g0.f20153a);
            if (h0Var != null) {
                h0Var.handleException(coroutineContext, th3);
            } else {
                kg.p.C(coroutineContext, th3);
            }
        } catch (Throwable th4) {
            if (th3 != th4) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th4);
                xk2.f.a(runtimeException, th3);
                th3 = runtimeException;
            }
            kg.p.C(coroutineContext, th3);
        }
    }

    public static a7.n0 l1(int i13, d7.d0 d0Var) {
        int z13;
        d0Var.L(12);
        while (true) {
            int i14 = d0Var.f53807b;
            if (i14 >= i13) {
                return null;
            }
            int k13 = d0Var.k();
            if (d0Var.k() == 1935766900) {
                if (k13 < 16) {
                    return null;
                }
                d0Var.L(4);
                int i15 = -1;
                int i16 = 0;
                for (int i17 = 0; i17 < 2; i17++) {
                    int y13 = d0Var.y();
                    int y14 = d0Var.y();
                    if (y13 == 0) {
                        i15 = y14;
                    } else if (y13 == 1) {
                        i16 = y14;
                    }
                }
                if (i15 == 12) {
                    z13 = RecyclerViewTypes.VIEW_TYPE_ADS_CAROUSEL_PIN_ITEM;
                } else if (i15 == 13) {
                    z13 = RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_GRID_CELL;
                } else {
                    if (i15 == 21 && d0Var.a() >= 8 && d0Var.f53807b + 8 <= i13) {
                        int k14 = d0Var.k();
                        int k15 = d0Var.k();
                        if (k14 >= 12 && k15 == 1936877170) {
                            z13 = d0Var.z();
                        }
                    }
                    z13 = -2147483647;
                }
                if (z13 == -2147483647) {
                    return null;
                }
                return new a7.n0(new e9.d(i16, z13));
            }
            d0Var.K(i14 + k13);
        }
    }

    public static final void m(ga0.i state, u2.q qVar, float f13, Function0 function0, i2.o oVar, int i13, int i14) {
        s3.h hVar;
        Intrinsics.checkNotNullParameter(state, "state");
        i2.s sVar = (i2.s) oVar;
        sVar.Y(1584548412);
        int i15 = i14 & 2;
        u2.n nVar = u2.n.f120041b;
        u2.q qVar2 = i15 != 0 ? nVar : qVar;
        float f14 = (i14 & 4) != 0 ? 0.5625f : f13;
        Function0 function02 = (i14 & 8) != 0 ? ga0.a.f64590i : function0;
        p1.y a13 = p1.x.a(p1.l.f98545c, u2.b.f120025m, sVar, 0);
        int i16 = sVar.P;
        i2.z1 o13 = sVar.o();
        u2.q X = ao2.m0.X(sVar, qVar2);
        s3.k.Qo.getClass();
        s3.i iVar = s3.j.f110798b;
        boolean z13 = sVar.f71265a instanceof i2.f;
        if (!z13) {
            com.bumptech.glide.c.j0();
            throw null;
        }
        sVar.a0();
        if (sVar.O) {
            sVar.n(iVar);
        } else {
            sVar.j0();
        }
        s3.h hVar2 = s3.j.f110801e;
        tb.f.f0(sVar, a13, hVar2);
        s3.h hVar3 = s3.j.f110800d;
        tb.f.f0(sVar, o13, hVar3);
        s3.h hVar4 = s3.j.f110802f;
        if (sVar.O || !Intrinsics.d(sVar.J(), Integer.valueOf(i16))) {
            ep.b.y(i16, sVar, i16, hVar4);
        }
        s3.h hVar5 = s3.j.f110799c;
        tb.f.f0(sVar, X, hVar5);
        u2.q b13 = androidx.compose.foundation.a.b(androidx.compose.foundation.layout.b.d(androidx.compose.foundation.layout.e.b(nVar, 1.0f), f14), b3.w.f21380d, b3.s0.f21349a);
        q3.p0 e13 = p1.q.e(u2.b.f120013a, false);
        int i17 = sVar.P;
        i2.z1 o14 = sVar.o();
        u2.q X2 = ao2.m0.X(sVar, b13);
        if (!z13) {
            com.bumptech.glide.c.j0();
            throw null;
        }
        sVar.a0();
        float f15 = f14;
        if (sVar.O) {
            sVar.n(iVar);
        } else {
            sVar.j0();
        }
        tb.f.f0(sVar, e13, hVar2);
        tb.f.f0(sVar, o14, hVar3);
        if (sVar.O || !Intrinsics.d(sVar.J(), Integer.valueOf(i17))) {
            hVar = hVar4;
            ep.b.y(i17, sVar, i17, hVar);
        } else {
            hVar = hVar4;
        }
        tb.f.f0(sVar, X2, hVar5);
        n.e(state.f64610a, null, sVar, 8, 2);
        sVar.r(true);
        u2.h hVar6 = u2.b.f120023k;
        u2.q n13 = androidx.compose.foundation.layout.b.n(androidx.compose.foundation.layout.e.o(androidx.compose.foundation.layout.e.b(nVar, 1.0f)), com.bumptech.glide.d.A(eo1.c.space_400, sVar));
        p1.e1 a14 = p1.c1.a(p1.l.f98543a, hVar6, sVar, 48);
        int i18 = sVar.P;
        i2.z1 o15 = sVar.o();
        u2.q X3 = ao2.m0.X(sVar, n13);
        if (!z13) {
            com.bumptech.glide.c.j0();
            throw null;
        }
        sVar.a0();
        if (sVar.O) {
            sVar.n(iVar);
        } else {
            sVar.j0();
        }
        tb.f.f0(sVar, a14, hVar2);
        tb.f.f0(sVar, o15, hVar3);
        if (sVar.O || !Intrinsics.d(sVar.J(), Integer.valueOf(i18))) {
            ep.b.y(i18, sVar, i18, hVar);
        }
        tb.f.f0(sVar, X3, hVar5);
        if (1.0f <= 0.0d) {
            throw new IllegalArgumentException(cb.h("invalid weight ", 1.0f, "; must be greater than zero").toString());
        }
        n(state.f64611b, new LayoutWeightElement(ql2.s.c(1.0f, Float.MAX_VALUE), true), sVar, 8, 0);
        om1.c cVar = new om1.c(rm1.q.ELLIPSIS, om1.e.LG, om1.f.TRANSPARENT_DARK_GRAY, null, null, false, 0, 1016);
        sVar.W(1338075009);
        boolean z14 = (((i13 & 7168) ^ 3072) > 2048 && sVar.h(function02)) || (i13 & 3072) == 2048;
        Object J2 = sVar.J();
        if (z14 || J2 == i2.n.f71185a) {
            J2 = new m1.e0(19, function02);
            sVar.g0(J2);
        }
        sVar.r(false);
        ig1.b.b(cVar, null, (Function1) J2, sVar, 8, 2);
        sVar.r(true);
        s0.f(new jm1.b(null, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK), null, sVar, 8, 2);
        sVar.r(true);
        i2.f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new ga0.b(state, qVar2, f15, function02, i13, i14, 0);
        }
    }

    public static final boolean m0(dl1.s sVar) {
        Intrinsics.checkNotNullParameter(sVar, "<this>");
        return f1(sVar.getF39332b());
    }

    public static String m1(long j13) {
        long millis = TimeUnit.MICROSECONDS.toMillis(j13);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long hours = timeUnit.toHours(millis);
        TimeUnit timeUnit2 = TimeUnit.HOURS;
        long minutes = timeUnit.toMinutes(millis - timeUnit2.toMillis(hours));
        long millis2 = millis - timeUnit2.toMillis(hours);
        TimeUnit timeUnit3 = TimeUnit.MINUTES;
        long seconds = timeUnit.toSeconds(millis2 - timeUnit3.toMillis(minutes));
        return String.format(Locale.US, "%02d:%02d:%02d.%03d", Long.valueOf(hours), Long.valueOf(minutes), Long.valueOf(seconds), Long.valueOf(((millis - timeUnit2.toMillis(hours)) - timeUnit3.toMillis(minutes)) - TimeUnit.SECONDS.toMillis(seconds)));
    }

    public static final void n(ia0.b bVar, u2.q qVar, i2.o oVar, int i13, int i14) {
        i2.s sVar = (i2.s) oVar;
        sVar.Y(1389502756);
        u2.q qVar2 = (i14 & 2) != 0 ? u2.n.f120041b : qVar;
        p1.g gVar = p1.l.f98543a;
        p1.e1 a13 = p1.c1.a(p1.l.g(com.bumptech.glide.d.A(eo1.c.space_200, sVar)), u2.b.f120023k, sVar, 48);
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
        kg.p.a(bVar.f71943a, null, null, sVar, 8, 6);
        dl2.b.c(new rn1.a(bVar.f71944b, null, null, kotlin.collections.e0.b(vn1.e.BOLD), vn1.g.BODY_200, 1, null, rn1.b.END, null, null, false, 0, null, null, null, false, null, null, 2096966), null, null, null, sVar, 8, 14);
        sVar.r(true);
        i2.f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new ga0.c(bVar, qVar2, i13, i14, 0);
        }
    }

    public static int n0(int i13, int[] iArr, int[] iArr2) {
        int i14 = 0;
        while (i14 < i13) {
            int i15 = iArr[i14] + 1;
            iArr2[i14] = i15;
            i14++;
            if (i15 != 0) {
                while (i14 < i13) {
                    iArr2[i14] = iArr[i14];
                    i14++;
                }
                return 0;
            }
        }
        return 1;
    }

    public static final String n1(Set set) {
        if (set.isEmpty()) {
            return "";
        }
        Set set2 = set;
        ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(set2, 10));
        Iterator it = set2.iterator();
        while (it.hasNext()) {
            arrayList.add(((ErrorType) it.next()).getDesc());
        }
        Iterator it2 = arrayList.iterator();
        if (!it2.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        Object next = it2.next();
        while (it2.hasNext()) {
            next = ((String) next) + ',' + ((String) it2.next());
        }
        return (String) next;
    }

    public static final void o(u2.q qVar, uc0.w2 w2Var, i2.o oVar, int i13, int i14) {
        u2.q qVar2;
        int i15;
        uc0.w2 w2Var2;
        u2.q qVar3;
        u2.q qVar4;
        uc0.w2 w2Var3;
        i2.s sVar = (i2.s) oVar;
        sVar.Y(-1007169774);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
            qVar2 = qVar;
        } else if ((i13 & 14) == 0) {
            qVar2 = qVar;
            i15 = i13 | (sVar.h(qVar2) ? 4 : 2);
        } else {
            qVar2 = qVar;
            i15 = i13;
        }
        int i17 = i14 & 2;
        if (i17 != 0) {
            i15 |= 16;
        }
        if (i17 == 2 && (i15 & 91) == 18 && sVar.z()) {
            sVar.Q();
            w2Var3 = w2Var;
            qVar4 = qVar2;
        } else {
            sVar.S();
            if ((i13 & 1) == 0 || sVar.y()) {
                u2.q qVar5 = i16 != 0 ? u2.n.f120041b : qVar2;
                if (i17 != 0) {
                    sVar.X(1890788296);
                    androidx.lifecycle.u1 a13 = v6.b.a(sVar);
                    if (a13 == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                    }
                    xe2.g V = p2.V(a13, sVar);
                    sVar.X(1729797275);
                    androidx.lifecycle.l1 v03 = c3.v0(uc0.w2.class, a13, V, a13 instanceof androidx.lifecycle.k ? ((androidx.lifecycle.k) a13).getDefaultViewModelCreationExtras() : u6.a.f120754b, sVar);
                    sVar.r(false);
                    sVar.r(false);
                    qVar3 = qVar5;
                    w2Var2 = (uc0.w2) v03;
                } else {
                    w2Var2 = w2Var;
                    qVar3 = qVar5;
                }
            } else {
                sVar.Q();
                w2Var2 = w2Var;
                qVar3 = qVar2;
            }
            sVar.s();
            i2.q1 z13 = bs1.c.z(w2Var2.f121825e, sVar);
            Object J2 = sVar.J();
            if (J2 == i2.n.f71185a) {
                i2.e0 e0Var = new i2.e0(i2.u.k(kotlin.coroutines.j.f80412a, sVar));
                sVar.g0(e0Var);
                J2 = e0Var;
            }
            w2Var2.i(new uc0.i(new oc0.a(q2.i.c(-1603176630, new androidx.compose.foundation.lazy.layout.v(25, ((i2.e0) J2).f71100a, w2Var2), sVar))));
            p1.y a14 = p1.x.a(p1.l.f98545c, u2.b.f120025m, sVar, 0);
            int i18 = sVar.P;
            i2.z1 o13 = sVar.o();
            u2.q X = ao2.m0.X(sVar, qVar3);
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
            tb.f.f0(sVar, a14, s3.j.f110801e);
            tb.f.f0(sVar, o13, s3.j.f110800d);
            s3.h hVar = s3.j.f110802f;
            if (sVar.O || !Intrinsics.d(sVar.J(), Integer.valueOf(i18))) {
                ep.b.y(i18, sVar, i18, hVar);
            }
            tb.f.f0(sVar, X, s3.j.f110799c);
            g3.e(oc0.q.search_token, new ra0.l0(w2Var2, 15), null, 0.0f, 0.0f, 0.0f, 0.0f, new tc0.c(w2Var2, 24), sVar, 0, RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_FOOTER);
            q((uc0.s2) z13.getValue(), sVar, 0);
            sVar.r(true);
            qVar4 = qVar3;
            w2Var3 = w2Var2;
        }
        i2.f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new q1.l(i13, i14, 22, qVar4, w2Var3);
        }
    }

    public static int o0(int[] iArr) {
        for (int i13 = 0; i13 < 16; i13++) {
            int i14 = iArr[i13] + 1;
            iArr[i13] = i14;
            if (i14 != 0) {
                return 0;
            }
        }
        return 1;
    }

    public static final void o1(TextView textView, int i13) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        textView.setSingleLine(false);
        textView.setMaxLines(i13);
        textView.setEllipsize(TextUtils.TruncateAt.END);
    }

    public static final void p(uc0.q2 state, u2.q qVar, i2.o oVar, int i13, int i14) {
        Intrinsics.checkNotNullParameter(state, "state");
        i2.s sVar = (i2.s) oVar;
        sVar.Y(2114806197);
        u2.q qVar2 = (i14 & 2) != 0 ? u2.n.f120041b : qVar;
        p1.y a13 = p1.x.a(p1.l.f98545c, u2.b.f120025m, sVar, 0);
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
        List list = state.f121854a;
        sVar.W(1781139822);
        boolean h10 = sVar.h(list);
        Object J2 = sVar.J();
        if (h10 || J2 == i2.n.f71185a) {
            List<uc0.v2> list2 = state.f121854a;
            ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(list2, 10));
            for (uc0.v2 v2Var : list2) {
                arrayList.add(Boolean.FALSE);
            }
            s2.t tVar = new s2.t();
            tVar.addAll(arrayList);
            sVar.g0(tVar);
            J2 = tVar;
        }
        sVar.r(false);
        rl2.g0.e(null, null, null, false, null, null, null, false, new t80.r(28, state, (s2.t) J2), sVar, 0, 255);
        sVar.r(true);
        i2.f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new q1.l(i13, i14, 23, state, qVar2);
        }
    }

    public static int p0(int i13, int i14, int[] iArr) {
        while (i14 < i13) {
            int i15 = iArr[i14] + 1;
            iArr[i14] = i15;
            if (i15 != 0) {
                return 0;
            }
            i14++;
        }
        return 1;
    }

    public static final void p1(TextView textView, int i13) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Context context = textView.getContext();
        Object obj = d5.a.f53679a;
        textView.setTextColor(context.getColor(i13));
    }

    public static final void q(uc0.s2 s2Var, i2.o oVar, int i13) {
        int i14;
        i2.s sVar = (i2.s) oVar;
        sVar.Y(1025430764);
        if ((i13 & 14) == 0) {
            i14 = (sVar.h(s2Var) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i14 & 11) == 2 && sVar.z()) {
            sVar.Q();
        } else if (s2Var instanceof uc0.q2) {
            sVar.W(1640744188);
            p((uc0.q2) s2Var, null, sVar, 8, 2);
            sVar.r(false);
        } else if (s2Var instanceof uc0.r2) {
            sVar.W(-676434461);
            sVar.W(1640748284);
            boolean z13 = (i14 & 14) == 4;
            Object J2 = sVar.J();
            if (z13 || J2 == i2.n.f71185a) {
                J2 = new ra0.l0(s2Var, 16);
                sVar.g0(J2);
            }
            sVar.r(false);
            rl2.g0.e(null, null, null, false, null, null, null, false, (Function1) J2, sVar, 0, 255);
            sVar.r(false);
        } else {
            sVar.W(-676245919);
            sVar.r(false);
        }
        i2.f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new tc0.i(s2Var, i13, 3);
        }
    }

    public static int q0(int i13, int i14, int[] iArr) {
        while (i14 < i13) {
            int i15 = iArr[i14] + 1;
            iArr[i14] = i15;
            if (i15 != 0) {
                return 0;
            }
            i14++;
        }
        return 1;
    }

    public static final void q1(TextView textView, int i13) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        textView.setTextSize(0, textView.getContext().getResources().getDimension(i13));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void r(java.lang.String r29, u2.q r30, i2.o r31, int r32, int r33) {
        /*
            r7 = r29
            java.lang.String r0 = "title"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            r4 = r31
            i2.s r4 = (i2.s) r4
            r0 = 2007846622(0x77ad4ede, float:7.030211E33)
            r4.Y(r0)
            r0 = r33 & 1
            if (r0 == 0) goto L18
            r0 = r32 | 6
            goto L2a
        L18:
            r0 = r32 & 14
            if (r0 != 0) goto L28
            boolean r0 = r4.h(r7)
            if (r0 == 0) goto L24
            r0 = 4
            goto L25
        L24:
            r0 = 2
        L25:
            r0 = r32 | r0
            goto L2a
        L28:
            r0 = r32
        L2a:
            r1 = r33 & 2
            if (r1 == 0) goto L33
            r0 = r0 | 48
        L30:
            r2 = r30
            goto L45
        L33:
            r2 = r32 & 112(0x70, float:1.57E-43)
            if (r2 != 0) goto L30
            r2 = r30
            boolean r3 = r4.h(r2)
            if (r3 == 0) goto L42
            r3 = 32
            goto L44
        L42:
            r3 = 16
        L44:
            r0 = r0 | r3
        L45:
            r3 = r0 & 91
            r5 = 18
            if (r3 != r5) goto L58
            boolean r3 = r4.z()
            if (r3 != 0) goto L52
            goto L58
        L52:
            r4.Q()
            r28 = r4
            goto La6
        L58:
            if (r1 == 0) goto L5f
            u2.n r1 = u2.n.f120041b
            r25 = r1
            goto L61
        L5f:
            r25 = r2
        L61:
            g4.l r21 = g4.l.f63472g
            int r1 = eo1.c.font_size_300
            float r1 = com.bumptech.glide.d.A(r1, r4)
            r2 = 4294967296(0x100000000, double:2.121995791E-314)
            long r26 = kh2.w.r0(r2, r1)
            r1 = 196608(0x30000, float:2.75506E-40)
            r2 = r0 & 14
            r1 = r1 | r2
            r0 = r0 & 112(0x70, float:1.57E-43)
            r22 = r1 | r0
            r19 = 0
            r20 = 0
            r2 = 0
            r6 = 0
            r8 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r23 = 0
            r24 = 131028(0x1ffd4, float:1.8361E-40)
            r0 = r29
            r1 = r25
            r28 = r4
            r4 = r26
            r7 = r21
            r21 = r28
            c2.d6.b(r0, r1, r2, r4, r6, r7, r8, r9, r11, r12, r13, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r2 = r25
        La6:
            i2.f2 r6 = r28.t()
            if (r6 == 0) goto Lbb
            tc0.h r7 = new tc0.h
            r5 = 1
            r0 = r7
            r1 = r29
            r3 = r32
            r4 = r33
            r0.<init>(r1, r2, r3, r4, r5)
            r6.f71113d = r7
        Lbb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kh2.j1.r(java.lang.String, u2.q, i2.o, int, int):void");
    }

    public static void r0(zx0.f fVar, r8 r8Var) {
        fVar.f143016s0 = r8Var;
    }

    public static int r1(int i13, int i14, int[] iArr, int[] iArr2) {
        int i15 = 0;
        while (i15 < i13) {
            int i16 = iArr[i15];
            iArr2[i15] = (i14 >>> 31) | (i16 << 1);
            i15++;
            i14 = i16;
        }
        return i14 >>> 31;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0111, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r0.J(), java.lang.Integer.valueOf(r10)) == false) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void s(long r31, u2.q r33, float r34, kotlin.jvm.functions.Function2 r35, i2.o r36, int r37, int r38) {
        /*
            Method dump skipped, instructions count: 565
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kh2.j1.s(long, u2.q, float, kotlin.jvm.functions.Function2, i2.o, int, int):void");
    }

    public static void s0(tt0.l0 l0Var, g70.h hVar) {
        l0Var.f119177m0 = hVar;
    }

    public static int s1(int i13, int[] iArr) {
        int i14 = 0;
        int i15 = 0;
        while (i14 < i13) {
            int i16 = iArr[i14];
            iArr[i14] = (i15 >>> (-2)) | (i16 << 2);
            i14++;
            i15 = i16;
        }
        return i15 >>> (-2);
    }

    public static int t(int i13, String str) {
        return cb.d(str, i13, 31);
    }

    public static void t0(mx.h hVar, z70.m mVar) {
        hVar.f88460e0 = mVar;
    }

    public static int t1(int i13, int[] iArr, int[] iArr2) {
        int i14 = 0;
        int i15 = 0;
        while (i14 < i13) {
            int i16 = iArr[i14];
            iArr2[i14] = (i15 >>> (-3)) | (i16 << 3);
            i14++;
            i15 = i16;
        }
        return i15 >>> (-3);
    }

    public static int u(Context context, int i13) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return (int) TypedValue.applyDimension(1, i13, w(context));
    }

    public static void u0(mx.h hVar, pb0.a aVar) {
        hVar.f88461f0 = aVar;
    }

    public static final void u1(Context context, View.OnClickListener confirmClickListener, View.OnClickListener onClickListener, String title, String subTitle, String confirm, String cancel) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(confirmClickListener, "confirmClickListener");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subTitle, "subTitle");
        Intrinsics.checkNotNullParameter(confirm, "confirm");
        Intrinsics.checkNotNullParameter(cancel, "cancel");
        yb0.n nVar = new yb0.n(context);
        nVar.w(title);
        nVar.u(subTitle);
        nVar.q(confirm);
        nVar.m(cancel);
        nVar.f138513j = confirmClickListener;
        if (onClickListener != null) {
            nVar.f138514k = onClickListener;
        }
        cb.x(nVar, m60.u.f85943a);
    }

    public static Rect v(Context context, Rect rect) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(rect, "rect");
        int i13 = rect.left;
        Intrinsics.checkNotNullParameter(context, "<this>");
        int c13 = ml2.c.c(i13 / w(context).density);
        int i14 = rect.top;
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(context, "<this>");
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "getDisplayMetrics(...)");
        int c14 = ml2.c.c(i14 / displayMetrics.density);
        int i15 = rect.right;
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(context, "<this>");
        DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics2, "getDisplayMetrics(...)");
        int c15 = ml2.c.c(i15 / displayMetrics2.density);
        int i16 = rect.bottom;
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(context, "<this>");
        DisplayMetrics displayMetrics3 = context.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics3, "getDisplayMetrics(...)");
        return new Rect(c13, c14, c15, ml2.c.c(i16 / displayMetrics3.density));
    }

    public static void v0(tt0.l0 l0Var, de0.d dVar) {
        l0Var.f119170f0 = dVar;
    }

    public static final void v1(Context context, View.OnClickListener confirmClickListener, rq.t0 t0Var, int i13, int i14, int i15, int i16) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(confirmClickListener, "confirmClickListener");
        Resources resources = context.getResources();
        String string = resources.getString(i13);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = resources.getString(i14);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        String string3 = resources.getString(i15);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        String string4 = resources.getString(i16);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        u1(context, confirmClickListener, t0Var, string, string2, string3, string4);
    }

    public static DisplayMetrics w(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "getDisplayMetrics(...)");
        return displayMetrics;
    }

    public static void w0(wr0.s sVar, p7 p7Var) {
        sVar.f130914z0 = p7Var;
    }

    public static void w1(int[] iArr, int[] iArr2) {
        long j13 = iArr[0] & 4294967295L;
        int i13 = 8;
        int i14 = 0;
        int i15 = 3;
        while (true) {
            int i16 = i15 - 1;
            long j14 = iArr[i15] & 4294967295L;
            long j15 = j14 * j14;
            iArr2[i13 - 1] = (i14 << 31) | ((int) (j15 >>> 33));
            i13 -= 2;
            iArr2[i13] = (int) (j15 >>> 1);
            i14 = (int) j15;
            if (i16 <= 0) {
                long j16 = j13 * j13;
                long j17 = (j16 >>> 33) | ((i14 << 31) & 4294967295L);
                iArr2[0] = (int) j16;
                long j18 = iArr[1] & 4294967295L;
                long j19 = j17 + (j18 * j13);
                int i17 = (int) j19;
                iArr2[1] = (i17 << 1) | (((int) (j16 >>> 32)) & 1);
                int i18 = i17 >>> 31;
                long j23 = (iArr2[2] & 4294967295L) + (j19 >>> 32);
                long j24 = iArr[2] & 4294967295L;
                long j25 = j23 + (j24 * j13);
                int i19 = (int) j25;
                iArr2[2] = (i19 << 1) | i18;
                long f13 = d7.g.f(j24, j18, j25 >>> 32, iArr2[3] & 4294967295L);
                long j26 = (iArr2[4] & 4294967295L) + (f13 >>> 32);
                long j27 = iArr[3] & 4294967295L;
                long j28 = (iArr2[5] & 4294967295L) + (j26 >>> 32);
                long j29 = j26 & 4294967295L;
                long j33 = (j13 * j27) + (f13 & 4294967295L);
                int i23 = (int) j33;
                iArr2[3] = (i23 << 1) | (i19 >>> 31);
                long f14 = d7.g.f(j27, j18, j33 >>> 32, j29);
                long f15 = d7.g.f(j27, j24, f14 >>> 32, j28 & 4294967295L);
                long j34 = (iArr2[6] & 4294967295L) + (j28 >>> 32) + (f15 >>> 32);
                int i24 = (int) f14;
                iArr2[4] = (i24 << 1) | (i23 >>> 31);
                int i25 = (int) (4294967295L & f15);
                iArr2[5] = (i24 >>> 31) | (i25 << 1);
                int i26 = i25 >>> 31;
                int i27 = (int) j34;
                iArr2[6] = i26 | (i27 << 1);
                iArr2[7] = ((iArr2[7] + ((int) (j34 >>> 32))) << 1) | (i27 >>> 31);
                return;
            }
            i15 = i16;
        }
    }

    public static Pair x(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Window window = activity.getWindow();
        View findViewById = window != null ? window.findViewById(R.id.content) : null;
        View view = findViewById instanceof View ? findViewById : null;
        Pair pair = view != null ? new Pair(Integer.valueOf(view.getTop()), Integer.valueOf(view.getBottom())) : new Pair(0, 0);
        int intValue = ((Number) pair.f80346a).intValue();
        int intValue2 = ((Number) pair.f80347b).intValue();
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(activity, "<this>");
        DisplayMetrics displayMetrics = activity.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "getDisplayMetrics(...)");
        Integer valueOf = Integer.valueOf(ml2.c.c(intValue / displayMetrics.density));
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(activity, "<this>");
        DisplayMetrics displayMetrics2 = activity.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics2, "getDisplayMetrics(...)");
        return new Pair(valueOf, Integer.valueOf(ml2.c.c(intValue2 / displayMetrics2.density)));
    }

    public static void x0(tt0.l0 l0Var, rg0.s sVar) {
        l0Var.f119173i0 = sVar;
    }

    public static int x1(int i13, int[] iArr, int[] iArr2, int[] iArr3) {
        long j13 = 0;
        for (int i14 = 0; i14 < i13; i14++) {
            long j14 = ((iArr[i14] & 4294967295L) - (4294967295L & iArr2[i14])) + j13;
            iArr3[i14] = (int) j14;
            j13 = j14 >> 32;
        }
        return (int) j13;
    }

    public static final void y(int i13, int i14, i2.o oVar, Function0 function0, boolean z13) {
        int i15;
        i2.s sVar;
        i2.s sVar2 = (i2.s) oVar;
        sVar2.Y(1193296134);
        if ((i14 & 14) == 0) {
            i15 = (sVar2.f(i13) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER) == 0) {
            i15 |= sVar2.i(z13) ? 32 : 16;
        }
        if ((i14 & 896) == 0) {
            i15 |= sVar2.j(function0) ? RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER : RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        }
        if ((i15 & 731) == 146 && sVar2.z()) {
            sVar2.Q();
            sVar = sVar2;
        } else {
            u2.n nVar = u2.n.f120041b;
            u2.q b13 = androidx.compose.foundation.a.b(nVar, g0.h(eo1.b.color_background_default, sVar2), b3.s0.f21349a);
            sVar2.W(-669416000);
            Object J2 = sVar2.J();
            if (J2 == i2.n.f71185a) {
                J2 = d7.g.o(sVar2);
            }
            sVar2.r(false);
            u2.q d2 = androidx.compose.foundation.a.d(b13, (o1.l) J2, null, false, null, function0, 28);
            p1.e1 a13 = p1.c1.a(p1.l.f98543a, u2.b.f120023k, sVar2, 48);
            int i16 = sVar2.P;
            i2.z1 o13 = sVar2.o();
            u2.q X = ao2.m0.X(sVar2, d2);
            s3.k.Qo.getClass();
            s3.i iVar = s3.j.f110798b;
            if (!(sVar2.f71265a instanceof i2.f)) {
                com.bumptech.glide.c.j0();
                throw null;
            }
            sVar2.a0();
            if (sVar2.O) {
                sVar2.n(iVar);
            } else {
                sVar2.j0();
            }
            tb.f.f0(sVar2, a13, s3.j.f110801e);
            tb.f.f0(sVar2, o13, s3.j.f110800d);
            s3.h hVar = s3.j.f110802f;
            if (sVar2.O || !Intrinsics.d(sVar2.J(), Integer.valueOf(i16))) {
                ep.b.y(i16, sVar2, i16, hVar);
            }
            tb.f.f0(sVar2, X, s3.j.f110799c);
            d6.b(a1.D0(i13, sVar2), androidx.compose.foundation.layout.b.n(nVar, com.bumptech.glide.d.A(eo1.c.space_400, sVar2)), g0.h(eo1.b.color_text_default, sVar2), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, fc0.c.f61690g, sVar2, 0, 0, 65528);
            if (1.0f <= 0.0d) {
                throw new IllegalArgumentException(cb.h("invalid weight ", 1.0f, "; must be greater than zero").toString());
            }
            androidx.compose.foundation.layout.a.a(new LayoutWeightElement(ql2.s.c(1.0f, Float.MAX_VALUE), true), sVar2);
            sVar = sVar2;
            c2.u2.a(com.bumptech.glide.c.M0(oc0.p.down_arrow, sVar2), a1.D0(oc0.q.search, sVar2), g0.m0(androidx.compose.foundation.layout.b.r(nVar, 0.0f, 0.0f, com.bumptech.glide.d.A(oc0.o.end_space_down_arrow, sVar2), 0.0f, 11), z13 ? 180.0f : 0.0f), g0.h(eo1.b.color_gray_500, sVar2), sVar, 8, 0);
            sVar.r(true);
        }
        i2.f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new e.g(i13, z13, function0, i14);
        }
    }

    public static void y0(mx.h hVar, lh0.l lVar) {
        hVar.f88459d0 = lVar;
    }

    public static int y1(int[] iArr, int[] iArr2, int[] iArr3) {
        long j13 = (iArr[0] & 4294967295L) - (iArr2[0] & 4294967295L);
        iArr3[0] = (int) j13;
        long j14 = ((iArr[1] & 4294967295L) - (iArr2[1] & 4294967295L)) + (j13 >> 32);
        iArr3[1] = (int) j14;
        long j15 = ((iArr[2] & 4294967295L) - (iArr2[2] & 4294967295L)) + (j14 >> 32);
        iArr3[2] = (int) j15;
        long j16 = ((iArr[3] & 4294967295L) - (iArr2[3] & 4294967295L)) + (j15 >> 32);
        iArr3[3] = (int) j16;
        return (int) (j16 >> 32);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0049  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x003e -> B:10:0x0041). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object z(n3.l0 r8, bl2.c r9) {
        /*
            boolean r0 = r9 instanceof l1.d
            if (r0 == 0) goto L13
            r0 = r9
            l1.d r0 = (l1.d) r0
            int r1 = r0.f81321t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f81321t = r1
            goto L18
        L13:
            l1.d r0 = new l1.d
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f81320s
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f81321t
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            n3.l0 r8 = r0.f81319r
            ue.c.H(r9)
            goto L41
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L31:
            ue.c.H(r9)
        L34:
            r0.f81319r = r8
            r0.f81321t = r3
            n3.k r9 = n3.k.Main
            java.lang.Object r9 = r8.a(r9, r0)
            if (r9 != r1) goto L41
            goto L6e
        L41:
            n3.j r9 = (n3.j) r9
            int r2 = r9.f89072c
            r2 = r2 & 66
            if (r2 == 0) goto L34
            java.util.List r9 = r9.f89070a
            int r2 = r9.size()
            r4 = 0
            r5 = r4
        L51:
            if (r5 >= r2) goto L6a
            java.lang.Object r6 = r9.get(r5)
            n3.q r6 = (n3.q) r6
            boolean r7 = r6.m()
            if (r7 != 0) goto L34
            boolean r7 = r6.f89114h
            if (r7 != 0) goto L34
            boolean r6 = r6.f89110d
            if (r6 == 0) goto L34
            int r5 = r5 + 1
            goto L51
        L6a:
            java.lang.Object r1 = r9.get(r4)
        L6e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kh2.j1.z(n3.l0, bl2.c):java.lang.Object");
    }

    public static void z0(ct0.s sVar, b20.c cVar) {
        sVar.M0 = cVar;
    }

    public static void z1(int i13, int i14, int[] iArr) {
        long j13 = (iArr[0] & 4294967295L) - (i14 & 4294967295L);
        iArr[0] = (int) j13;
        long j14 = ((4294967295L & iArr[1]) - 1) + (j13 >> 32);
        iArr[1] = (int) j14;
        if ((j14 >> 32) == 0) {
            return;
        }
        X(i13, 2, iArr);
    }
}
