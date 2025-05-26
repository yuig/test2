package c0;

import ads_mobile_sdk.c6;
import ads_mobile_sdk.cs2;
import ads_mobile_sdk.e6;
import ads_mobile_sdk.jw1;
import ads_mobile_sdk.qs2;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.net.NetworkRequest;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.provider.MediaStore;
import android.text.Html;
import android.text.Spanned;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RemoteViews;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.n3;
import c2.m4;
import com.pinterest.api.model.aa;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.ba;
import com.pinterest.api.model.d30;
import com.pinterest.api.model.deserializer.UserDeserializer;
import com.pinterest.api.model.dl0;
import com.pinterest.api.model.e30;
import com.pinterest.api.model.eh;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.fi0;
import com.pinterest.api.model.fs;
import com.pinterest.api.model.g00;
import com.pinterest.api.model.hh;
import com.pinterest.api.model.ih;
import com.pinterest.api.model.jo0;
import com.pinterest.api.model.k01;
import com.pinterest.api.model.mx0;
import com.pinterest.api.model.mz0;
import com.pinterest.api.model.pi;
import com.pinterest.api.model.pu;
import com.pinterest.api.model.px0;
import com.pinterest.api.model.pz0;
import com.pinterest.api.model.qx0;
import com.pinterest.api.model.sg;
import com.pinterest.api.model.sr;
import com.pinterest.api.model.ts0;
import com.pinterest.api.model.tx0;
import com.pinterest.api.model.u7;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.vh;
import com.pinterest.api.model.wy0;
import com.pinterest.api.model.xr;
import com.pinterest.api.model.zs;
import com.pinterest.api.model.zv0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.search.results.view.SearchGridMultiSectionFragment;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.gestalt.callout.GestaltCallout;
import com.pinterest.gestalt.checkbox.GestaltCheckBox;
import com.pinterest.gestalt.searchField.GestaltSearchField;
import com.pinterest.gestalt.switchComponent.GestaltSwitchWithLabel;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.notificationsUtilLibrary.NotifHoldoutKibanaLogger$Log$Payload;
import com.pinterest.screens.u4;
import com.pinterest.ui.imageview.WebImageView;
import io.embrace.android.embracesdk.Severity;
import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import lh0.c4;
import lh0.f3;
import lh0.g3;
import lh0.i3;
import lh0.k2;
import lh0.q3;
import lh0.u2;
import net.quikkly.android.utils.BitmapUtils;
import o82.b3;
import o82.v2;
import so.b2;
import so.e2;
import so.g2;
import so.j2;
import so.l3;
import so.l6;
import so.oa;
import so.s9;
import so.t9;
import x02.c2;
import x02.f2;
import x02.i2;
import x02.o2;
import z32.a3;

/* loaded from: classes2.dex */
public abstract class d {
    public static mf0.f A(String str, String str2, String str3, String str4, s51.d dVar) {
        qk1.b bVar = qk1.b.f104057j;
        mf0.f fVar = new mf0.f();
        fVar.h7(str);
        fVar.d7(str2);
        qk1.a aVar = new qk1.a(dVar, true, fVar, 0);
        fVar.R = str3;
        fVar.S = aVar;
        fVar.m7();
        qk1.a aVar2 = new qk1.a(bVar, true ? 1 : 0, fVar, true ? 1 : 0);
        fVar.T = str4;
        fVar.U = aVar2;
        fVar.l7();
        return fVar;
    }

    public static void A0(cc1.d dVar, oc.c cVar) {
        dVar.A0 = cVar;
    }

    public static void A1(j51.d0 d0Var, uk1.e eVar) {
        d0Var.S0 = eVar;
    }

    public static final void A2(b3 adapter, Set viewTypes, Function1 vmStateToModelConverter, o82.y mvpGridViewsHelper) {
        Intrinsics.checkNotNullParameter(adapter, "<this>");
        Intrinsics.checkNotNullParameter(viewTypes, "viewTypes");
        Intrinsics.checkNotNullParameter(vmStateToModelConverter, "vmStateToModelConverter");
        Intrinsics.checkNotNullParameter(mvpGridViewsHelper, "mvpGridViewsHelper");
        Iterator it = viewTypes.iterator();
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            Intrinsics.checkNotNullParameter(adapter, "<this>");
            Intrinsics.checkNotNullParameter(vmStateToModelConverter, "vmStateToModelConverter");
            Intrinsics.checkNotNullParameter(mvpGridViewsHelper, "mvpGridViewsHelper");
            mvpGridViewsHelper.getClass();
            Intrinsics.checkNotNullParameter(adapter, "adapter");
            Intrinsics.checkNotNullParameter(vmStateToModelConverter, "vmStateToModelConverter");
            LinkedHashMap linkedHashMap = mvpGridViewsHelper.f93755i;
            yq0.a aVar = (yq0.a) linkedHashMap.get(Integer.valueOf(intValue));
            if (aVar == null) {
                aVar = (yq0.a) mvpGridViewsHelper.f93747a.get(Integer.valueOf(intValue));
                if (aVar != null) {
                    aVar.setContext(mvpGridViewsHelper.f93750d);
                    nl1.d dVar = mvpGridViewsHelper.f93751e;
                    aVar.setPinalytics(dVar.s7());
                    aVar.setNetworkStateStream(dVar.p7());
                    aVar.setGridFeatureConfig(mvpGridViewsHelper.f93752f);
                    aVar.setPinGridCellFactory(mvpGridViewsHelper.f93748b);
                    aVar.setUserRepository(mvpGridViewsHelper.f93749c);
                    aVar.setGoToHomefeedListener(new gs1.b());
                    aVar.setTrackingParamAttacher(dVar.z7());
                    androidx.lifecycle.z viewLifecycleOwner = dVar.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    aVar.setScope(bf.b.S(viewLifecycleOwner));
                    linkedHashMap.put(Integer.valueOf(intValue), aVar);
                } else {
                    aVar = null;
                }
            }
            m60.f0 f0Var = vb0.j.f125466a;
            if (aVar == null) {
                f0Var.F(a.a.d("No view creator for view type ", intValue), tb0.p.PLATFORM, new Object[0]);
            } else {
                wk2.a aVar2 = (wk2.a) mvpGridViewsHelper.f93754h.get(Integer.valueOf(intValue));
                vq0.h hVar = aVar2 != null ? (vq0.h) aVar2.get() : null;
                vq0.h hVar2 = hVar instanceof vq0.h ? hVar : null;
                if (hVar2 == null) {
                    f0Var.F(a.a.d("No view binder for view type ", intValue), tb0.p.PLATFORM, new Object[0]);
                } else {
                    adapter.E(intValue, aVar.getCreator(), hVar2, vmStateToModelConverter);
                }
            }
        }
    }

    public static final GestaltText B(Context context, hf0.c deviceInfoProvider, int i13) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(deviceInfoProvider, "deviceInfoProvider");
        GestaltText C = C(context, 0, 0, 0, bs1.c.V(context, eo1.c.lego_spacing_vertical_small), i13, false, 830);
        if (hf0.b.q() && hf0.b.o()) {
            C.setGravity(17);
            ViewGroup.LayoutParams layoutParams = C.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            C.setGravity(1);
            C.setLayoutParams(layoutParams);
        }
        return C;
    }

    public static void B0(j51.d0 d0Var, bq.c cVar) {
        d0Var.f74723c1 = cVar;
    }

    public static void B1(k91.c cVar, uk1.e eVar) {
        cVar.f78809j0 = eVar;
    }

    public static final uj2.b0 B2(i2 i2Var, c2 params, nx.b0 pinAuxHelper) {
        Intrinsics.checkNotNullParameter(i2Var, "<this>");
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(pinAuxHelper, "pinAuxHelper");
        if (params.f131299d.length() == 0) {
            return uj2.b0.g(new IllegalArgumentException("Invalid pin uid"));
        }
        return new kk2.g(new kk2.g(i2Var.k(params).s().k(new b22.f(12, new o2(i2Var, 3))), new x02.e0(23, new o2(i2Var, 4)), 3), new x02.e0(24, new gw1.i(20, pinAuxHelper, params)), 1);
    }

    public static GestaltText C(Context context, int i13, int i14, int i15, int i16, int i17, boolean z13, int i18) {
        if ((i18 & 2) != 0) {
            i13 = -1;
        }
        if ((i18 & 8) != 0) {
            i14 = 8388611;
        }
        if ((i18 & 32) != 0) {
            i15 = 8388611;
        }
        if ((i18 & 64) != 0) {
            i16 = 0;
        }
        if ((i18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0) {
            i17 = 0;
        }
        if ((i18 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0) {
            z13 = false;
        }
        Intrinsics.checkNotNullParameter(context, "context");
        GestaltText gestaltText = new GestaltText(6, context, (AttributeSet) null);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i13, -2);
        layoutParams.topMargin = i16;
        layoutParams.bottomMargin = i17;
        layoutParams.leftMargin = 0;
        layoutParams.rightMargin = 0;
        layoutParams.gravity = i14;
        gestaltText.setLayoutParams(layoutParams);
        gestaltText.setGravity(i15);
        gestaltText.i(new mm1.i(z13, 18));
        return gestaltText;
    }

    public static void C0(x81.f0 f0Var, a11.d dVar) {
        f0Var.T0 = dVar;
    }

    public static void C1(oq1.e eVar, uk1.e eVar2) {
        eVar.f97227j0 = eVar2;
    }

    public static final ArrayList C2(vd0.a aVar) {
        if (aVar == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(aVar, 10));
        Iterator it = aVar.iterator();
        while (it.hasNext()) {
            Object e13 = vd0.c.f125622b.e(((vd0.c) it.next()).f125623a, g00.class);
            Intrinsics.g(e13, "null cannot be cast to non-null type com.pinterest.api.model.Onebarmodule");
            arrayList.add((g00) e13);
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0026, code lost:
    
        if (r1 > r6.getHeight()) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final b3.f0 D(y2.d r22, float r23) {
        /*
            r0 = r22
            r3 = r23
            double r1 = (double) r3
            double r1 = java.lang.Math.ceil(r1)
            float r1 = (float) r1
            int r1 = (int) r1
            int r1 = r1 * 2
            b3.f0 r2 = kg.q.f79377a
            b3.u r4 = kg.q.f79378b
            d3.c r5 = kg.q.f79379c
            if (r2 == 0) goto L2c
            if (r4 == 0) goto L2c
            r6 = r2
            b3.h r6 = (b3.h) r6
            android.graphics.Bitmap r6 = r6.f21320a
            int r7 = r6.getWidth()
            if (r1 > r7) goto L2c
            int r6 = r6.getHeight()
            if (r1 <= r6) goto L29
            goto L2c
        L29:
            r9 = r2
            r10 = r4
            goto L3a
        L2c:
            r2 = 1
            b3.h r2 = androidx.compose.ui.graphics.a.f(r1, r1, r2)
            kg.q.f79377a = r2
            b3.d r4 = androidx.compose.ui.graphics.a.a(r2)
            kg.q.f79378b = r4
            goto L29
        L3a:
            if (r5 != 0) goto L44
            d3.c r1 = new d3.c
            r1.<init>()
            kg.q.f79379c = r1
            goto L45
        L44:
            r1 = r5
        L45:
            y2.a r2 = r0.f136664a
            n4.k r2 = r2.getLayoutDirection()
            r4 = r9
            b3.h r4 = (b3.h) r4
            android.graphics.Bitmap r4 = r4.f21320a
            int r5 = r4.getWidth()
            float r5 = (float) r5
            int r4 = r4.getHeight()
            float r4 = (float) r4
            long r4 = bs1.c.c(r5, r4)
            d3.a r8 = r1.f53651a
            n4.b r7 = r8.f53644a
            n4.k r6 = r8.f53645b
            b3.u r14 = r8.f53646c
            long r12 = r8.f53647d
            r8.f53644a = r0
            r8.f53645b = r2
            r8.f53646c = r10
            r8.f53647d = r4
            r10.j()
            long r4 = b3.w.f21378b
            long r15 = r1.g()
            r17 = 58
            r0 = 0
            r11 = r1
            r18 = r12
            r12 = r4
            r4 = r14
            r14 = r15
            r16 = r0
            d3.h.a0(r11, r12, r14, r16, r17)
            r20 = 4278190080(0xff000000, double:2.113706745E-314)
            long r12 = androidx.compose.ui.graphics.a.d(r20)
            long r14 = bs1.c.c(r3, r3)
            r17 = 120(0x78, float:1.68E-43)
            r16 = 0
            d3.h.a0(r11, r12, r14, r16, r17)
            long r11 = androidx.compose.ui.graphics.a.d(r20)
            long r13 = com.bumptech.glide.c.d(r3, r3)
            r15 = 0
            r16 = 0
            r0 = r1
            r1 = r11
            r3 = r23
            r11 = r4
            r4 = r13
            r12 = r6
            r6 = r15
            r13 = r7
            r7 = r16
            r14 = r8
            r8 = r17
            d3.h.O(r0, r1, r3, r4, r6, r7, r8)
            r10.restore()
            r14.f53644a = r13
            r14.f53645b = r12
            r14.f53646c = r11
            r0 = r18
            r14.f53647d = r0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: c0.d.D(y2.d, float):b3.f0");
    }

    public static void D0(SearchGridMultiSectionFragment searchGridMultiSectionFragment, pb0.a aVar) {
        searchGridMultiSectionFragment.f47709h1 = aVar;
    }

    public static void D1(qa1.e eVar, uk1.e eVar2) {
        eVar.A0 = eVar2;
    }

    public static Bitmap D2(int i13, Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Matrix matrix = new Matrix();
        matrix.setRotate(i13);
        if (width == 0 || height == 0) {
            return null;
        }
        return y(bitmap, width, height, matrix);
    }

    public static final GestaltText E(Context context, boolean z13) {
        Intrinsics.checkNotNullParameter(context, "context");
        return C(context, 0, 1, 17, 0, z13 ? bs1.c.V(context, eo1.c.lego_spacing_vertical_medium) : 0, true, 342);
    }

    public static void E0(j51.d0 d0Var, pb0.a aVar) {
        d0Var.f74724d1 = aVar;
    }

    public static void E1(rx1.d dVar, uk1.e eVar) {
        dVar.f110204w0 = eVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001f, code lost:
    
        if (r2 == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final com.pinterest.api.model.j90 E2(yk1.v r2, boolean r3) {
        /*
            com.pinterest.api.model.g90 r0 = new com.pinterest.api.model.g90
            r1 = 0
            r0.<init>(r1)
            u32.i r1 = u32.i.SAVED
            int r1 = r1.ordinal()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.d(r1)
            if (r2 == 0) goto L21
            int r1 = nz1.f.profile_tab_title_saved
            yk1.a r2 = (yk1.a) r2
            android.content.res.Resources r2 = r2.f139224a
            java.lang.String r2 = r2.getString(r1)
            if (r2 != 0) goto L23
        L21:
            java.lang.String r2 = "Saved"
        L23:
            r0.c(r2)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r3)
            r0.b(r2)
            com.pinterest.api.model.j90 r2 = r0.a()
            java.lang.String r3 = "build(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: c0.d.E2(yk1.v, boolean):com.pinterest.api.model.j90");
    }

    public static ub.g F(int[] capabilities, int[] transports) {
        Intrinsics.checkNotNullParameter(capabilities, "capabilities");
        Intrinsics.checkNotNullParameter(transports, "transports");
        Intrinsics.checkNotNullParameter(capabilities, "capabilities");
        Intrinsics.checkNotNullParameter(transports, "transports");
        NetworkRequest.Builder builder = new NetworkRequest.Builder();
        for (int i13 : capabilities) {
            try {
                builder.addCapability(i13);
            } catch (IllegalArgumentException e13) {
                kb.b0 e14 = kb.b0.e();
                String str = ub.g.f121661b;
                e14.j(ub.g.f121661b, "Ignoring adding capability '" + i13 + '\'', e13);
            }
        }
        for (int i14 : transports) {
            builder.addTransportType(i14);
        }
        NetworkRequest build = builder.build();
        Intrinsics.checkNotNullExpressionValue(build, "networkRequest.build()");
        return new ub.g(build);
    }

    public static void F0(rh1.q0 q0Var) {
        q0Var.getClass();
    }

    public static void F1(x81.f0 f0Var, uk1.e eVar) {
        f0Var.W0 = eVar;
    }

    public static final void F2(ui2.j jVar, xf2.d0 key, String value) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        jVar.f(key.f134855a, value);
    }

    public static final GestaltText G(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return C(context, 0, 0, 0, 0, bs1.c.V(context, eo1.c.space_400), true, 382);
    }

    public static void G0(x81.f0 f0Var, ContextWrapper contextWrapper) {
        f0Var.R0 = contextWrapper;
    }

    public static void G1(j51.d0 d0Var, g2 g2Var) {
        d0Var.R0 = g2Var;
    }

    public static final void G2(wy0 wy0Var, HashMap hashMap) {
        hashMap.put("brand_image_url", dl2.b.s0(wy0Var));
        hashMap.put("brand_name", dl2.b.i1(wy0Var));
        hashMap.put("brand_verification", String.valueOf(dl2.b.W1(wy0Var)));
        hashMap.put("merchant_verification", String.valueOf(wy0Var.O3().booleanValue()));
        hashMap.put("brand_user_id", wy0Var.getUid());
    }

    public static Bundle H(boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, String str) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("com.pinterest.EXTRAS_IS_PINNER_PROFILE", z13);
        bundle.putBoolean("EXTRAS_KEY_USE_RETRIEVAL_DISPLAY", z14);
        bundle.putBoolean("EXTRAS_KEY_USE_PUBLIC_DISPLAY", z15);
        bundle.putBoolean("EXTRAS_KEY_ALLOW_VIEW_TYPE_SWITCHING", z16);
        bundle.putBoolean("EXTRAS_KEY_ALLOW_BOARD_INVITE_DISPLAY", true);
        bundle.putBoolean("EXTRAS_KEY_ALLOW_SEARCH_BAR_DISPLAY", true);
        bundle.putBoolean("EXTRAS_KEY_AUTO_ORG_AT_TOP", z17);
        if (df.j1.U0(str)) {
            bundle.putString("EXTRAS_AUTO_ORG_NAVIGATION_SOURCE", str);
        }
        return bundle;
    }

    public static void H0(g41.p pVar, m60.f0 f0Var) {
        pVar.f63531h0 = f0Var;
    }

    public static void H1(v2 v2Var) {
        v2Var.getClass();
    }

    public static final void H2(ArrayList arrayList, List list, zd1.c0 c0Var, zd1.e0 filterManager, boolean z13) {
        px0 px0Var;
        List m13;
        zd1.w wVar;
        List filterSpecs;
        Object obj;
        Object obj2;
        Intrinsics.checkNotNullParameter(filterManager, "filterManager");
        ArrayList oneBarFilters = new ArrayList();
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                px0 px0Var2 = (px0) it.next();
                if (list != null) {
                    Integer o13 = px0Var2.o();
                    Intrinsics.checkNotNullExpressionValue(o13, "getProductFilterType(...)");
                    int intValue = o13.intValue();
                    Iterator it2 = list.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj2 = null;
                            break;
                        } else {
                            obj2 = it2.next();
                            if (((px0) obj2).o().intValue() == intValue) {
                                break;
                            }
                        }
                    }
                    px0Var = (px0) obj2;
                } else {
                    px0Var = null;
                }
                px0 px0Var3 = px0Var == null ? px0Var2 : px0Var;
                px0Var3.getClass();
                mx0 mx0Var = new mx0(px0Var3, 0);
                Integer num = mx0Var.f40255h;
                int value = t32.f.PRODUCT_PRICE.getValue();
                if (num != null && num.intValue() == value) {
                    mx0Var.b(px0Var2.j());
                    if (px0Var != null) {
                        mx0Var.c(px0Var.m());
                    }
                } else {
                    int value2 = t32.f.PRODUCT_CONTENT_TYPE.getValue();
                    if (num != null && num.intValue() == value2) {
                        mx0Var.b(px0Var2.m());
                        mx0Var.c(px0Var2.m());
                    } else {
                        int value3 = t32.f.PRODUCT_ON_SALE.getValue();
                        if (num == null || num.intValue() != value3) {
                            int value4 = t32.f.PRODUCT_ON_SALE_40PERCENT.getValue();
                            if (num == null || num.intValue() != value4) {
                                int value5 = t32.f.PRODUCT_ON_SALE_60PERCENT.getValue();
                                if (num == null || num.intValue() != value5) {
                                    if (px0Var == null || (m13 = px0Var.m()) == null) {
                                        m13 = px0Var2.m();
                                    }
                                    Intrinsics.f(m13);
                                    mx0Var.b(n2(m13, px0Var2.j()));
                                    mx0Var.c(n2(m13, px0Var2.j()));
                                }
                            }
                        }
                        if (c0Var == null || (filterSpecs = c0Var.getFilterSpecs()) == null) {
                            wVar = null;
                        } else {
                            Iterator it3 = filterSpecs.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    obj = null;
                                    break;
                                }
                                obj = it3.next();
                                Integer productFilterType = ((zd1.w) obj).getProductFilterType();
                                int value6 = t32.f.PRODUCT_ON_SALE.value();
                                if (productFilterType != null && productFilterType.intValue() == value6) {
                                    break;
                                }
                            }
                            wVar = (zd1.w) obj;
                        }
                        boolean z14 = wVar != null;
                        if (px0Var2.o().intValue() == t32.f.PRODUCT_ON_SALE.getValue() && z14) {
                            kotlin.collections.q0 q0Var = kotlin.collections.q0.f80391a;
                            mx0Var.b(n2(q0Var, px0Var2.m()));
                            mx0Var.c(n2(q0Var, px0Var2.m()));
                        }
                    }
                }
                px0 a13 = mx0Var.a();
                Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
                oneBarFilters.add(a13);
            }
        }
        if (!oneBarFilters.isEmpty()) {
            filterManager.getClass();
            Intrinsics.checkNotNullParameter(oneBarFilters, "oneBarFilters");
            Iterator it4 = oneBarFilters.iterator();
            while (it4.hasNext()) {
                px0 px0Var4 = (px0) it4.next();
                String valueOf = String.valueOf(px0Var4.o().intValue());
                filterManager.f141706a.put(valueOf, px0Var4);
                LinkedHashMap linkedHashMap = filterManager.f141708c;
                if ((linkedHashMap.get(valueOf) == null ? px0Var4 : null) != null) {
                    filterManager.f141707b.put(valueOf, ph.a.N(px0Var4));
                }
                if (z13) {
                    boolean[] zArr = px0Var4.f41141j;
                    if (zArr.length > 2 && zArr[2]) {
                        Intrinsics.checkNotNullParameter(px0Var4, "<this>");
                        ArrayList arrayList2 = new ArrayList();
                        t32.d dVar = t32.f.Companion;
                        Integer o14 = px0Var4.o();
                        Intrinsics.checkNotNullExpressionValue(o14, "getProductFilterType(...)");
                        int intValue2 = o14.intValue();
                        dVar.getClass();
                        t32.f a14 = t32.d.a(intValue2);
                        Integer l13 = px0Var4.l();
                        if (l13.intValue() == t32.c.RANGE.getValue()) {
                            ph.a.j(px0Var4, arrayList2);
                        } else if (l13.intValue() == t32.c.MULTI_SELECT.getValue()) {
                            List m14 = px0Var4.m();
                            Intrinsics.checkNotNullExpressionValue(m14, "getFilterOptions(...)");
                            ph.a.i(m14, px0Var4, arrayList2, false);
                        } else if (l13.intValue() == t32.c.SINGLE_SELECT.getValue()) {
                            List m15 = px0Var4.m();
                            Intrinsics.checkNotNullExpressionValue(m15, "getFilterOptions(...)");
                            ph.a.i(m15, px0Var4, arrayList2, a14 == t32.f.PRODUCT_CONTENT_TYPE);
                        }
                        linkedHashMap.put(valueOf, arrayList2);
                    }
                }
            }
        }
    }

    public static final sg I(f30 f30Var, m60.z0 signalType) {
        List Z3;
        List a43;
        List Y3;
        List b43;
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        Intrinsics.checkNotNullParameter(signalType, "signalType");
        int i13 = sa2.a.f112206a[signalType.ordinal()];
        if (i13 == 1) {
            return null;
        }
        if (i13 == 2) {
            if (f30Var.Z3() == null || !(!r5.isEmpty()) || (Z3 = f30Var.Z3()) == null) {
                return null;
            }
            return (sg) Z3.get(0);
        }
        if (i13 == 3) {
            if (f30Var.a4() == null || !(!r5.isEmpty()) || (a43 = f30Var.a4()) == null) {
                return null;
            }
            return (sg) a43.get(0);
        }
        if (i13 == 4) {
            if (f30Var.Y3() == null || !(!r5.isEmpty()) || (Y3 = f30Var.Y3()) == null) {
                return null;
            }
            return (sg) Y3.get(0);
        }
        if (i13 != 5) {
            throw new NoWhenBranchMatchedException();
        }
        if (f30Var.b4() == null || !(!r5.isEmpty()) || (b43 = f30Var.b4()) == null) {
            return null;
        }
        return (sg) b43.get(0);
    }

    public static void I0(j51.d0 d0Var, m60.f0 f0Var) {
        d0Var.X0 = f0Var;
    }

    public static void I1(SearchGridMultiSectionFragment searchGridMultiSectionFragment, l3 l3Var) {
        searchGridMultiSectionFragment.X0 = l3Var;
    }

    public static final boolean I2(f30 f30Var) {
        com.pinterest.api.model.g t33;
        Integer X = (f30Var == null || (t33 = f30Var.t3()) == null) ? null : t33.X();
        return X != null && X.intValue() == h32.n0.NATIVE_BROWSER.getValue();
    }

    public static final NavigationImpl J(zv0 zv0Var, String str) {
        ScreenLocation screenLocation = (ScreenLocation) u4.f51437c.getValue();
        String uid = zv0Var.getUid();
        if (uid == null) {
            uid = "";
        }
        NavigationImpl z03 = Navigation.z0(screenLocation, uid);
        List N = zv0Var.N();
        String str2 = N != null ? (String) N.get(0) : null;
        if (str2 == null) {
            str2 = "";
        }
        z03.m0("com.pinterest.EXTRA_TODAY_ARTICLE_HEADER_IMAGE_URL", str2);
        String V = zv0Var.V();
        if (V == null) {
            V = "";
        }
        z03.m0("com.pinterest.EXTRA_TODAY_ARTICLE_TITLE", V);
        String U = zv0Var.U();
        if (U == null) {
            U = "";
        }
        z03.m0("com.pinterest.EXTRA_TODAY_ARTICLE_SUBTITLE", U);
        String F = zv0Var.F();
        if (F == null) {
            F = "";
        }
        z03.m0("com.pinterest.EXTRA_TODAY_ARTICLE_DESCRIPTION", F);
        Boolean O = zv0Var.O();
        Intrinsics.checkNotNullExpressionValue(O, "getIsFeedSingleColumn(...)");
        z03.Y1("com.pinterest.EXTRA_TODAY_ARTICLE_IS_FEED_SINGLE_COLUMN", O.booleanValue());
        wy0 E = zv0Var.E();
        String uid2 = E != null ? E.getUid() : null;
        z03.m0("com.pinterest.EXTRA_TODAY_ARTICLE_ARTICLE_CREATOR_USER_ID", uid2 != null ? uid2 : "");
        if (str != null) {
            z03.m0("com.pinterest.STRUCTURED_FEED_REQUEST_PARAMS", str);
        }
        Intrinsics.checkNotNullExpressionValue(z03, "apply(...)");
        return z03;
    }

    public static void J0(SearchGridMultiSectionFragment searchGridMultiSectionFragment, lh0.w0 w0Var) {
        searchGridMultiSectionFragment.f47729r1 = w0Var;
    }

    public static void J1(SearchGridMultiSectionFragment searchGridMultiSectionFragment, f3 f3Var) {
        searchGridMultiSectionFragment.T0 = f3Var;
    }

    public static void J2(d7.c0 c0Var) {
        c0Var.o(3);
        c0Var.o(8);
        boolean f13 = c0Var.f();
        boolean f14 = c0Var.f();
        if (f13) {
            c0Var.o(5);
        }
        if (f14) {
            c0Var.o(6);
        }
    }

    public static final uj2.l K(i2 i2Var, f30 pin, String boardId, String str, boolean z13, String websiteUrl, String title, String summary, String pinAltText, boolean z14, boolean z15, String str2, boolean z16, boolean z17) {
        String str3;
        Intrinsics.checkNotNullParameter(i2Var, "<this>");
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        Intrinsics.checkNotNullParameter(websiteUrl, "websiteUrl");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(summary, "summary");
        Intrinsics.checkNotNullParameter(pinAltText, "pinAltText");
        if (websiteUrl.length() == 0) {
            String s53 = pin.s5();
            str3 = s53 == null ? "" : s53;
        } else {
            str3 = websiteUrl;
        }
        String uid = pin.getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
        String str4 = str3;
        f2 f2Var = new f2(uid, boardId, str, z13, str3, title, summary, pinAltText, z14, z15, z17, str2, z16, null, null, null, null, 253952);
        e30 R6 = pin.R6();
        v7 v7Var = (v7) ((x02.x0) ((bf2.b) i2Var.O).get()).O(boardId);
        if (v7Var == null) {
            u7 x03 = v7.x0();
            x03.P(boardId);
            x03.C("");
            v7Var = x03.a();
        }
        R6.l(v7Var);
        if (str != null && !kotlin.text.z.j(str)) {
            ba baVar = (ba) ((x02.z0) ((bf2.b) i2Var.N).get()).O(str);
            if (baVar == null) {
                aa aaVar = new aa(0);
                aaVar.f35671a = str;
                boolean[] zArr = aaVar.f35681k;
                if (zArr.length > 0) {
                    zArr[0] = true;
                }
                baVar = aaVar.a();
            }
            R6.Z1(baVar);
        }
        R6.n1(str4);
        R6.M(summary);
        R6.f37110k = pinAltText;
        boolean[] zArr2 = R6.f37101h3;
        if (zArr2.length > 10) {
            zArr2[10] = true;
        }
        R6.z(Boolean.valueOf(z14));
        R6.O(Boolean.valueOf(z15));
        R6.d2(Boolean.valueOf(z16));
        f30 a13 = R6.a();
        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
        return i2Var.G(f2Var, a13);
    }

    public static void K0(x81.f0 f0Var, nr0.m mVar) {
        f0Var.Z0 = mVar;
    }

    public static void K1(SearchGridMultiSectionFragment searchGridMultiSectionFragment, i3 i3Var) {
        searchGridMultiSectionFragment.f47715k1 = i3Var;
    }

    public static void K2(d7.c0 c0Var) {
        int g13;
        int g14 = c0Var.g(2);
        if (g14 == 0) {
            c0Var.o(6);
            return;
        }
        int y23 = y2(c0Var, 5, 8, 16) + 1;
        if (g14 == 1) {
            c0Var.o(y23 * 7);
            return;
        }
        if (g14 == 2) {
            boolean f13 = c0Var.f();
            int i13 = f13 ? 1 : 5;
            int i14 = f13 ? 7 : 5;
            int i15 = f13 ? 8 : 6;
            int i16 = 0;
            while (i16 < y23) {
                if (c0Var.f()) {
                    c0Var.o(7);
                    g13 = 0;
                } else {
                    if (c0Var.g(2) == 3 && c0Var.g(i14) * i13 != 0) {
                        c0Var.n();
                    }
                    g13 = c0Var.g(i15) * i13;
                    if (g13 != 0 && g13 != 180) {
                        c0Var.n();
                    }
                    c0Var.n();
                }
                if (g13 != 0 && g13 != 180 && c0Var.f()) {
                    i16++;
                }
                i16++;
            }
        }
    }

    public static uj2.l L(i2 i2Var, f30 f30Var, String str, boolean z13, boolean z14, int i13) {
        String str2;
        String i14 = b40.i(f30Var);
        ba j63 = f30Var.j6();
        String uid = j63 != null ? j63.getUid() : null;
        String str3 = (i13 & 16) != 0 ? "" : str;
        String z63 = f30Var.z6();
        String str4 = z63 == null ? "" : z63;
        String c43 = f30Var.c4();
        String str5 = c43 == null ? "" : c43;
        String A3 = f30Var.A3();
        String str6 = A3 == null ? "" : A3;
        List H6 = f30Var.H6();
        if (H6 != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : H6) {
                if (((ts0) obj).i().intValue() != -1) {
                    arrayList.add(obj);
                }
            }
            String k13 = vd0.c.f125622b.k(arrayList);
            Intrinsics.checkNotNullExpressionValue(k13, "toJson(...)");
            str2 = k13;
        } else {
            str2 = null;
        }
        Boolean o63 = f30Var.o6();
        Intrinsics.checkNotNullExpressionValue(o63, "getShoppingRecDisabled(...)");
        boolean booleanValue = o63.booleanValue();
        fi0 r63 = f30Var.r6();
        return K(i2Var, f30Var, i14, uid, false, str3, str4, str5, str6, z13, z14, str2, booleanValue, com.bumptech.glide.d.o0(r63 != null ? r63.L() : null));
    }

    public static void L0(SearchGridMultiSectionFragment searchGridMultiSectionFragment, zf0.f fVar) {
        searchGridMultiSectionFragment.f47703e1 = fVar;
    }

    public static void L1(SearchGridMultiSectionFragment searchGridMultiSectionFragment, l6 l6Var) {
        searchGridMultiSectionFragment.f47727q1 = l6Var;
    }

    public static final nf2.p L2() {
        Intrinsics.checkNotNullParameter("register-services", "name");
        if (Build.VERSION.SDK_INT < 29) {
            return null;
        }
        String C = kotlin.text.e0.C(RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK, "emb-register-services");
        ol2.f.f96454a.getClass();
        int e13 = ol2.f.f96455b.e();
        nf2.p pVar = new nf2.p(C, e13);
        Trace.beginAsyncSection(C, e13);
        return pVar;
    }

    public static int M(Map assets, mm.b builder) {
        int g13;
        Intrinsics.checkNotNullParameter(assets, "assets");
        Intrinsics.checkNotNullParameter(builder, "builder");
        ArrayList arrayList = new ArrayList(assets.size());
        for (Map.Entry entry : assets.entrySet()) {
            int f13 = builder.f((CharSequence) entry.getKey());
            md2.a aVar = (md2.a) entry.getValue();
            int f14 = builder.f(aVar.f86966b);
            int i13 = le2.a.f83130a[aVar.f86965a.ordinal()];
            if (i13 == 1) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                builder.o(1);
                Intrinsics.checkNotNullParameter(builder, "builder");
                Intrinsics.checkNotNullParameter(builder, "builder");
                g13 = builder.g();
            } else {
                if (i13 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                Intrinsics.checkNotNullParameter(builder, "builder");
                builder.o(1);
                Intrinsics.checkNotNullParameter(builder, "builder");
                builder.k(4, 0);
                ByteBuffer byteBuffer = builder.f87553a;
                int i14 = builder.f87554b - 4;
                builder.f87554b = i14;
                byteBuffer.putInt(i14, 1);
                builder.n(0);
                Intrinsics.checkNotNullParameter(builder, "builder");
                g13 = builder.g();
            }
            arrayList.add(Integer.valueOf(ef2.a.e(builder, f13, ef2.a.e(builder, g13, f14))));
        }
        int[] data = CollectionsKt.E0(arrayList);
        Intrinsics.checkNotNullParameter(builder, "builder");
        Intrinsics.checkNotNullParameter(data, "data");
        builder.p(4, data.length, 4);
        for (int length = data.length - 1; -1 < length; length--) {
            builder.c(data[length]);
        }
        int h10 = builder.h();
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.o(1);
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.d(0, h10);
        Intrinsics.checkNotNullParameter(builder, "builder");
        int g14 = builder.g();
        builder.l(g14, 4);
        return g14;
    }

    public static void M0(j51.d0 d0Var, zf0.f fVar) {
        d0Var.V0 = fVar;
    }

    public static void M1(qa1.e eVar, x10.d dVar) {
        eVar.D0 = dVar;
    }

    public static final void M2(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (Build.VERSION.SDK_INT >= 29) {
            Trace.beginSection(kotlin.text.e0.C(RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK, "emb-" + name));
        }
    }

    public static final void N() {
        if (Build.VERSION.SDK_INT >= 29) {
            Trace.endSection();
        }
    }

    public static void N0(v2 v2Var) {
        v2Var.getClass();
    }

    public static void N1(SearchGridMultiSectionFragment searchGridMultiSectionFragment, c4 c4Var) {
        searchGridMultiSectionFragment.U0 = c4Var;
    }

    public static final p41.c N2(yk1.v vVar, int i13, int i14, u32.i iVar, ScreenLocation screenLocation, Bundle bundle) {
        return new p41.c(new p41.b(i13, ((yk1.a) vVar).f139224a.getString(i14), screenLocation, bundle, iVar));
    }

    public static final i2 O(i2 i2Var) {
        Intrinsics.checkNotNullParameter(i2Var, "<this>");
        return W2(i2Var, n00.c.PIN_CLOSEUP_AD_PREVIEW);
    }

    public static void O0(j51.d0 d0Var, g51.f fVar) {
        d0Var.T0 = fVar;
    }

    public static void O1(v2 v2Var, n3 n3Var) {
        v2Var.A0 = n3Var;
    }

    public static final re1.e O2(vh vhVar, Function0 navigator, Function0 renderActionButton) {
        Intrinsics.checkNotNullParameter(vhVar, "<this>");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(renderActionButton, "renderActionButton");
        ih ihVar = vhVar.f42857o;
        if (ihVar == null || ihVar.e() == null) {
            return null;
        }
        String g13 = ihVar.g();
        z32.o c13 = ihVar.c();
        Intrinsics.checkNotNullExpressionValue(c13, "getActionButtonStyle(...)");
        z32.l a13 = ihVar.a();
        Intrinsics.checkNotNullExpressionValue(a13, "getActionButtonLocation(...)");
        return new re1.e(g13, c13, a13, navigator, renderActionButton, ihVar.k(), ihVar.j());
    }

    public static final String P(String str, HashMap itemAuxData) {
        Intrinsics.checkNotNullParameter(itemAuxData, "itemAuxData");
        if (str == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str2 = (String) itemAuxData.get("story_id");
        if (str2 != null) {
        }
        String str3 = (String) itemAuxData.get("story_type");
        if (str3 != null) {
        }
        String str4 = (String) itemAuxData.get("content_ids");
        if (str4 != null) {
            linkedHashMap.put("content_ids", str4);
        }
        Uri parse = Uri.parse(str);
        Uri.Builder buildUpon = parse.buildUpon();
        for (String str5 : linkedHashMap.keySet()) {
            if (parse.getQueryParameter(str5) == null) {
                buildUpon.appendQueryParameter(str5, (String) linkedHashMap.get(str5));
            }
        }
        return buildUpon.build().toString();
    }

    public static void P0(SearchGridMultiSectionFragment searchGridMultiSectionFragment, rg0.s sVar) {
        searchGridMultiSectionFragment.f47702d1 = sVar;
    }

    public static void P1(oq1.e eVar, bf2.d dVar) {
        eVar.f97230m0 = dVar;
    }

    public static byte[] P2(BigInteger bigInteger) {
        if (bigInteger.signum() != -1) {
            return bigInteger.toByteArray();
        }
        throw new IllegalArgumentException("n must not be negative");
    }

    public static BigInteger Q(byte[] bArr) {
        return new BigInteger(1, bArr);
    }

    public static void Q0(j51.d0 d0Var, rg0.s sVar) {
        d0Var.Y0 = sVar;
    }

    public static void Q1(SearchGridMultiSectionFragment searchGridMultiSectionFragment, i92.k kVar) {
        searchGridMultiSectionFragment.f47723o1 = kVar;
    }

    public static byte[] Q2(int i13, BigInteger bigInteger) {
        if (bigInteger.signum() == -1) {
            throw new IllegalArgumentException("integer must be nonnegative");
        }
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray.length == i13) {
            return byteArray;
        }
        int i14 = i13 + 1;
        if (byteArray.length > i14) {
            throw new GeneralSecurityException("integer too large");
        }
        if (byteArray.length == i14) {
            if (byteArray[0] == 0) {
                return Arrays.copyOfRange(byteArray, 1, byteArray.length);
            }
            throw new GeneralSecurityException("integer too large");
        }
        byte[] bArr = new byte[i13];
        System.arraycopy(byteArray, 0, bArr, i13 - byteArray.length, byteArray.length);
        return bArr;
    }

    public static final yl1.b R(String str) {
        if (str == null) {
            return null;
        }
        return new yl1.b(bs1.c.h2(str), false, null, null, yl1.i.b(), null, null, null, 0, null, 1006);
    }

    public static void R0(cc1.d dVar, q3 q3Var) {
        dVar.E0 = q3Var;
    }

    public static void R1(qa1.e eVar, i92.k kVar) {
        eVar.f103205z0 = kVar;
    }

    public static final File R2(Uri uri) {
        if (!Intrinsics.d(uri.getScheme(), "file")) {
            throw new IllegalArgumentException(a.c.g("Uri lacks 'file' scheme: ", uri).toString());
        }
        String path = uri.getPath();
        if (path != null) {
            return new File(path);
        }
        throw new IllegalArgumentException(a.c.g("Uri path is null: ", uri).toString());
    }

    public static final hf0.c S() {
        Context context = kb0.a.f79058b;
        return (hf0.c) ((oa) ((so1.b) ep.b.g(so1.b.class))).f113717h7.get();
    }

    public static void S0(SearchGridMultiSectionFragment searchGridMultiSectionFragment, g3 g3Var) {
        searchGridMultiSectionFragment.R0 = g3Var;
    }

    public static void S1(x81.f0 f0Var, x20.a aVar) {
        f0Var.S0 = aVar;
    }

    public static final String S2(int i13) {
        String hexString = Integer.toHexString(i13);
        Intrinsics.checkNotNullExpressionValue(hexString, "toHexString(...)");
        String substring = hexString.substring(2);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        String upperCase = substring.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        return "#" + upperCase;
    }

    public static final Spanned T(t10.f recipe, Resources resources) {
        CharSequence charSequence;
        Intrinsics.checkNotNullParameter(recipe, "recipe");
        Intrinsics.checkNotNullParameter(resources, "resources");
        StringBuilder sb3 = new StringBuilder();
        for (String str : recipe.f115780l) {
            if (sb3.length() > 0) {
                sb3.append(" &#8226; ");
            }
            sb3.append(str);
        }
        String a13 = is1.r.a(recipe, resources);
        Intrinsics.f(a13);
        if (!kotlin.text.z.j(a13)) {
            if (sb3.length() > 0) {
                sb3.append(" &#8226; ");
            }
            sb3.append(a13);
        }
        int length = sb3.length() - 1;
        if (length >= 0) {
            while (true) {
                int i13 = length - 1;
                if (!Intrinsics.d(String.valueOf(sb3.charAt(length)), " &#8226; ")) {
                    charSequence = sb3.subSequence(0, length + 1);
                    break;
                }
                if (i13 < 0) {
                    break;
                }
                length = i13;
            }
        }
        charSequence = "";
        Spanned fromHtml = Html.fromHtml(charSequence.toString());
        Intrinsics.checkNotNullExpressionValue(fromHtml, "fromHtml(...)");
        return fromHtml;
    }

    public static void T0(j51.d0 d0Var, u2 u2Var) {
        d0Var.Z0 = u2Var;
    }

    public static void T1(qa1.e eVar, UserDeserializer userDeserializer) {
        eVar.E0 = userDeserializer;
    }

    public static final si2.g T2(Severity severity) {
        Intrinsics.checkNotNullParameter(severity, "<this>");
        int i13 = ei2.b.f58967a[severity.ordinal()];
        if (i13 == 1) {
            return si2.g.INFO;
        }
        if (i13 == 2) {
            return si2.g.WARN;
        }
        if (i13 == 3) {
            return si2.g.ERROR;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final String U(xr xrVar, Date date) {
        fs b13 = xrVar.b();
        if ((b13 != null ? b13.r() : null) == null) {
            return null;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(TimeZone.getTimeZone("UTC"));
        Intrinsics.f(date);
        calendar.setTime(date);
        calendar.add(5, -30);
        Date time = calendar.getTime();
        Intrinsics.f(time);
        kw1.b bVar = kw1.b.DATE;
        return a.a.D(kw1.e.b(time, bVar), " - ", kw1.e.b(date, bVar));
    }

    public static void U0(q71.x xVar, f3 f3Var) {
        xVar.B0 = f3Var;
    }

    public static void U1(SearchGridMultiSectionFragment searchGridMultiSectionFragment) {
        searchGridMultiSectionFragment.W0 = ac2.f.f1945a;
    }

    public static final LinkedHashMap U2(qi2.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Set<Map.Entry> entrySet = dVar.a().entrySet();
        int a13 = kotlin.collections.y0.a(kotlin.collections.g0.q(entrySet, 10));
        if (a13 < 16) {
            a13 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(a13);
        for (Map.Entry entry : entrySet) {
            linkedHashMap.put(((ri2.e) entry.getKey()).f108404b.toString(), entry.getValue().toString());
        }
        return linkedHashMap;
    }

    public static final ArrayList V() {
        List j13 = kotlin.collections.f0.j(ww1.c.IMPRESSION, ww1.c.ENGAGEMENT, ww1.c.PIN_CLICK, ww1.c.OUTBOUND_CLICK, ww1.c.SAVE, ww1.c.ENGAGEMENT_RATE, ww1.c.PIN_CLICK_RATE, ww1.c.OUTBOUND_CLICK_RATE, ww1.c.SAVE_RATE, ww1.c.TOTAL_AUDIENCE, ww1.c.ENGAGERS);
        ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(j13, 10));
        Iterator it = j13.iterator();
        while (it.hasNext()) {
            arrayList.add(((ww1.c) it.next()).name());
        }
        return arrayList;
    }

    public static void V0(g41.e eVar, b2 b2Var) {
        eVar.A0 = b2Var;
    }

    public static void V1(SearchGridMultiSectionFragment searchGridMultiSectionFragment, yk1.v vVar) {
        searchGridMultiSectionFragment.f47707g1 = vVar;
    }

    public static float V2(float f13, float f14, float f15, int i13) {
        return i13 > 0 ? (f15 / 2.0f) + f14 : f13;
    }

    public static Bitmap W(Bitmap bitmap) {
        Matrix matrix = new Matrix();
        matrix.preScale(-1.0f, 1.0f);
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width == 0 || height == 0) {
            return null;
        }
        return y(bitmap, width, height, matrix);
    }

    public static void W0(oq1.e eVar, so.s sVar) {
        eVar.f97229l0 = sVar;
    }

    public static void W1(j51.d0 d0Var, yk1.v vVar) {
        d0Var.W0 = vVar;
    }

    public static final i2 W2(i2 i2Var, n00.c cVar) {
        b22.i a13 = i2Var.K.a();
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        a13.f21299d = cVar;
        Unit unit = Unit.f80348a;
        return i2.a0(i2Var, a13, null, 2097149);
    }

    public static final NavigationImpl X(zv0 zv0Var, String str) {
        if (zv0Var == null) {
            return null;
        }
        xk2.v vVar = u4.f51436b;
        ScreenLocation screenLocation = (ScreenLocation) vVar.getValue();
        Integer L = zv0Var.L();
        if (L.intValue() != c42.c.SINGLE_VIDEO.getValue()) {
            if (L.intValue() != c42.c.SINGLE_PIN.getValue()) {
                if (L.intValue() != c42.c.STORY_PIN.getValue()) {
                    return L.intValue() == c42.c.SINGLE_CREATOR.getValue() ? pe.i.x1(null, zv0Var.E(), r41.b.TodayTabNavigation) : J(zv0Var, str);
                }
                f30 G = zv0Var.G();
                return G == null ? J(zv0Var, null) : Navigation.z0((ScreenLocation) vVar.getValue(), G.getUid());
            }
        }
        f30 G2 = zv0Var.G();
        String uid = G2 != null ? G2.getUid() : null;
        if (uid == null) {
            uid = "";
        }
        return Navigation.z0(screenLocation, uid);
    }

    public static void X0(q71.x xVar, nu1.a aVar) {
        xVar.A0 = aVar;
    }

    public static void X1(j51.d0 d0Var, qc2.d dVar) {
        d0Var.f74726f1 = dVar;
    }

    public static final f30 X2(f30 f30Var, wy0 user) {
        wy0 d2;
        wy0 c13;
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        Intrinsics.checkNotNullParameter(user, "user");
        e30 R6 = f30Var.R6();
        Intrinsics.checkNotNullParameter(R6, "<this>");
        Intrinsics.checkNotNullParameter(user, "user");
        wy0 wy0Var = R6.H1;
        if (wy0Var != null && Intrinsics.d(wy0Var.getUid(), user.getUid())) {
            R6.u1(wy0Var.G4(user));
        }
        Intrinsics.checkNotNullParameter(R6, "<this>");
        Intrinsics.checkNotNullParameter(user, "user");
        pz0 pz0Var = R6.C1;
        if (pz0Var != null && (c13 = pz0Var.c()) != null && Intrinsics.d(c13.getUid(), user.getUid())) {
            mz0 mz0Var = new mz0(pz0Var, 0);
            mz0Var.f40268b = c13.G4(user);
            boolean[] zArr = mz0Var.f40269c;
            if (zArr.length > 1) {
                zArr[1] = true;
            }
            R6.p1(mz0Var.a());
        }
        Intrinsics.checkNotNullParameter(R6, "<this>");
        Intrinsics.checkNotNullParameter(user, "user");
        hh hhVar = R6.B1;
        if (hhVar != null && (d2 = hhVar.d()) != null && Intrinsics.d(d2.getUid(), user.getUid())) {
            eh e13 = hhVar.e();
            e13.c(d2.G4(user));
            R6.o1(e13.a());
        }
        Intrinsics.checkNotNullParameter(R6, "<this>");
        Intrinsics.checkNotNullParameter(user, "user");
        wy0 wy0Var2 = R6.O2;
        if (wy0Var2 != null && Intrinsics.d(wy0Var2.getUid(), user.getUid())) {
            R6.p2(wy0Var2.G4(user));
        }
        Intrinsics.checkNotNullParameter(R6, "<this>");
        Intrinsics.checkNotNullParameter(user, "user");
        wy0 wy0Var3 = R6.L1;
        if (Intrinsics.d(wy0Var3 != null ? wy0Var3.getUid() : null, user.getUid())) {
            R6.y1(wy0Var3.G4(user));
        }
        wy0 wy0Var4 = R6.R1;
        if (Intrinsics.d(wy0Var4 != null ? wy0Var4.getUid() : null, user.getUid())) {
            R6.E1(wy0Var4.G4(user));
        }
        f30 a13 = R6.a();
        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
        return a13;
    }

    public static final HashMap Y(ze1.c navParams, ih ihVar, pi piVar, oe1.a aVar, Map map, String str) {
        HashMap hashMap;
        String b13;
        Intrinsics.checkNotNullParameter(navParams, "navParams");
        HashMap hashMap2 = new HashMap();
        hashMap2.put("source_identifier", aVar != null ? aVar.d() : null);
        if (aVar != null && (b13 = aVar.b()) != null) {
            hashMap2.put("shop_source", b13);
        }
        if (piVar != null) {
            z32.y0 a13 = piVar.a();
            if (a13 != null) {
                hashMap2.put("com.pinterest.STRUCTURED_FEED_EXPLORE_ARTICLE_REP_STYLE", String.valueOf(a13.value()));
            }
            a3 c13 = piVar.c();
            if (c13 != null) {
                hashMap2.put("com.pinterest.STRUCTURED_FEED_USER_REP_STYLE", String.valueOf(c13.value()));
            }
        }
        oe1.b bVar = aVar instanceof oe1.b ? (oe1.b) aVar : null;
        if (bVar != null && (hashMap = bVar.f94254a) != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : hashMap.entrySet()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
            hashMap2.putAll(linkedHashMap);
        }
        if (ihVar != null) {
            hashMap2.put("source", navParams.f141808a);
            String str2 = navParams.f141808a;
            if (str2 != null) {
                hashMap2.put("source", str2);
            }
            String str3 = navParams.f141809b;
            if (str3 != null) {
                hashMap2.put("search_query", str3);
            }
            String l13 = ihVar.l();
            if (l13 == null) {
                l13 = "";
            }
            hashMap2.put("com.pinterest.STRUCTURED_FEED_TITLE", l13);
            String s13 = ihVar.s();
            if (s13 != null) {
                hashMap2.put("com.pinterest.STRUCTURED_FEED_REQUEST_PARAMS", s13);
            }
            z32.c2 n13 = ihVar.n();
            if (n13 != null) {
                hashMap2.put("com.pinterest.STRUCTURED_FEED_PINS_DISPLAY", n13.toString());
            }
            Integer v13 = ihVar.v();
            if (v13 != null) {
                hashMap2.put("com.pinterest.STRUCTURED_FEED_VIEW_PARAMETER", String.valueOf(v13.intValue()));
            }
            wy0 h10 = ihVar.h();
            if (h10 != null) {
                G2(h10, hashMap2);
            }
        }
        if (map != null) {
            hashMap2.putAll(map);
        }
        if (str != null) {
            hashMap2.put("com.pinterest.EXTRA_USER_ID", str);
        }
        return hashMap2;
    }

    public static void Y0(qa1.e eVar, mo1.d dVar) {
        eVar.C0 = dVar;
    }

    public static void Y1(cd2.l lVar) {
        lVar.getClass();
    }

    public static final em1.b Z(em1.b currentCheckboxState) {
        Intrinsics.checkNotNullParameter(currentCheckboxState, "currentCheckboxState");
        int i13 = em1.m.f59635a[currentCheckboxState.ordinal()];
        if (i13 != 1 && i13 != 2) {
            if (i13 == 3) {
                return em1.b.UNCHECKED;
            }
            throw new NoWhenBranchMatchedException();
        }
        return em1.b.CHECKED;
    }

    public static void Z0(r02.j jVar, mo1.d dVar) {
        jVar.f105760g0 = dVar;
    }

    public static final boolean Z1(f30 f30Var, es.a adFormats) {
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        return g2(f30Var) || ((es.c) adFormats).U(f30Var);
    }

    public static final void a(ln1.d state, u2.q qVar, i2.o oVar, int i13, int i14) {
        Intrinsics.checkNotNullParameter(state, "state");
        i2.s sVar = (i2.s) oVar;
        sVar.Y(-1222057245);
        if ((i14 & 2) != 0) {
            qVar = u2.n.f120041b;
        }
        androidx.compose.ui.viewinterop.a.a(new m4(((Number) sVar.m(fc0.k.f61712a)).intValue(), state, 22), qVar, new hm1.f(state, 1), sVar, i13 & RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER, 0);
        i2.f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new v31.d(state, qVar, i13, i14, 3);
        }
    }

    public static final int a0(int i13, float f13, int i14) {
        return Math.min(ml2.c.c(i13 * f13), i14);
    }

    public static void a1(SearchGridMultiSectionFragment searchGridMultiSectionFragment, bc2.e eVar) {
        searchGridMultiSectionFragment.f47731s1 = eVar;
    }

    public static final boolean a2(GestaltCheckBox gestaltCheckBox) {
        Intrinsics.checkNotNullParameter(gestaltCheckBox, "<this>");
        em1.b bVar = gestaltCheckBox.a0().f59598a;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        return bVar == em1.b.CHECKED;
    }

    public static final void b(b2.l lVar, u2.e eVar, Function2 function2, i2.o oVar, int i13) {
        int i14;
        i2.s sVar = (i2.s) oVar;
        sVar.Y(476043083);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? sVar.h(lVar) : sVar.j(lVar) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= sVar.h(eVar) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= sVar.j(function2) ? RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER : RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        }
        if ((i14 & RecyclerViewTypes.VIEW_TYPE_SEARCH_PRODUCT_COLLAGE_STORY) == 146 && sVar.z()) {
            sVar.Q();
        } else {
            boolean z13 = false;
            boolean z14 = (i14 & RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER) == 32;
            if ((i14 & 14) == 4 || ((i14 & 8) != 0 && sVar.h(lVar))) {
                z13 = true;
            }
            boolean z15 = z14 | z13;
            Object J2 = sVar.J();
            if (z15 || J2 == i2.n.f71185a) {
                J2 = new b2.j(eVar, lVar);
                sVar.g0(J2);
            }
            q4.l.a((b2.j) J2, null, new q4.z(false, true, true, q4.a0.Inherit, true, false), function2, sVar, ((i14 << 3) & 7168) | 384, 2);
        }
        i2.f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new androidx.compose.foundation.lazy.layout.u0(lVar, eVar, function2, i13, 3);
        }
    }

    public static int b0(float f13, int i13) {
        return a0(i13, f13, hf0.b.f69002b);
    }

    public static void b1(SearchGridMultiSectionFragment searchGridMultiSectionFragment, yk1.j jVar) {
        searchGridMultiSectionFragment.f47705f1 = jVar;
    }

    public static final boolean b2(em1.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        return cVar.f59597c == em1.b.CHECKED;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f6, code lost:
    
        if (r20 == false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00fc, code lost:
    
        if (r20 != false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0105, code lost:
    
        if (r20 == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x010b, code lost:
    
        if (r20 != false) goto L99;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(b2.l r17, boolean r18, m4.h r19, boolean r20, long r21, u2.q r23, i2.o r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 401
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c0.d.c(b2.l, boolean, m4.h, boolean, long, u2.q, i2.o, int, int):void");
    }

    public static Bitmap c0(Bitmap bitmap, float f13, float f14) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Matrix matrix = new Matrix();
        matrix.postScale(f14 / width, f13 / height);
        if (width <= 0 || height <= 0) {
            return null;
        }
        return y(bitmap, width, height, matrix);
    }

    public static void c1(oq1.e eVar, yk1.j jVar) {
        eVar.f97231n0 = jVar;
    }

    public static final boolean c2(f30 f30Var, es.a adFormats) {
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        String h43 = f30Var.h4();
        if (h43 != null) {
            return (ie0.a.f72200e.contains(h43) || kotlin.text.z.h(h43, "pinterdev.com", false)) && !((es.c) adFormats).M(f30Var);
        }
        return false;
    }

    public static final void d(u2.q qVar, Function0 function0, boolean z13, i2.o oVar, int i13) {
        int i14;
        i2.s sVar = (i2.s) oVar;
        sVar.Y(2111672474);
        if ((i13 & 6) == 0) {
            i14 = (sVar.h(qVar) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= sVar.j(function0) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= sVar.i(z13) ? RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER : RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        }
        if ((i14 & RecyclerViewTypes.VIEW_TYPE_SEARCH_PRODUCT_COLLAGE_STORY) == 146 && sVar.z()) {
            sVar.Q();
        } else {
            androidx.compose.foundation.layout.a.a(ao2.m0.p(androidx.compose.foundation.layout.e.k(qVar, b2.d0.f21130a, b2.d0.f21131b), t3.p.f116119m, new f2.u(z13, function0)), sVar);
        }
        i2.f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new b2.f(qVar, function0, z13, i13);
        }
    }

    public static final Pair d0(d30 data, int i13) {
        Intrinsics.checkNotNullParameter(data, "data");
        int f13 = new k6.g(data.e()).f(1, "Orientation");
        Pair pair = (f13 == 6 || f13 == 8) ? new Pair(data.h().f80347b, data.h().f80346a) : data.h();
        return new Pair(Integer.valueOf(i13), Integer.valueOf(ml2.c.b(i13 * ((((Number) pair.f80347b).doubleValue() * 1.0d) / ((Number) pair.f80346a).doubleValue()))));
    }

    public static void d1(SearchGridMultiSectionFragment searchGridMultiSectionFragment, c91.e eVar) {
        searchGridMultiSectionFragment.f47700c1 = eVar;
    }

    public static final boolean d2(dl1.s sVar) {
        Intrinsics.checkNotNullParameter(sVar, "<this>");
        if (sVar instanceof wy0) {
            Boolean R2 = ((wy0) sVar).R2();
            Intrinsics.checkNotNullExpressionValue(R2, "getExplicitlyFollowedByMe(...)");
            return R2.booleanValue();
        }
        if (sVar instanceof v7) {
            Boolean V0 = ((v7) sVar).V0();
            Intrinsics.checkNotNullExpressionValue(V0, "getFollowedByMe(...)");
            return V0.booleanValue();
        }
        if (!(sVar instanceof zs)) {
            return false;
        }
        Boolean C = ((zs) sVar).C();
        Intrinsics.checkNotNullExpressionValue(C, "getIsFollowed(...)");
        return C.booleanValue();
    }

    public static c6 e(nm.u json) {
        Intrinsics.checkNotNullParameter(json, "json");
        try {
            a.i1 i1Var = e6.f4722b;
            Intrinsics.checkNotNullParameter(json, "<this>");
            Intrinsics.checkNotNullParameter("type_num", "key");
            int e13 = json.v("type_num").e();
            i1Var.getClass();
            e6 a13 = a.i1.a(e13);
            Intrinsics.checkNotNullParameter(json, "<this>");
            Intrinsics.checkNotNullParameter("value", "key");
            long l13 = json.v("value").l();
            Intrinsics.checkNotNullParameter(json, "<this>");
            Intrinsics.checkNotNullParameter("precision_num", "key");
            int e14 = json.v("precision_num").e();
            wi.v vVar = e14 != 1 ? e14 != 2 ? e14 != 3 ? wi.v.UNKNOWN : wi.v.PRECISE : wi.v.PUBLISHER_PROVIDED : wi.v.ESTIMATED;
            Intrinsics.checkNotNullParameter(json, "<this>");
            Intrinsics.checkNotNullParameter("currency", "key");
            String p13 = json.v("currency").p();
            Intrinsics.checkNotNullExpressionValue(p13, "getAsString(...)");
            return new c6(a13, l13, vVar, p13);
        } catch (Exception e15) {
            List list = f(e15, e15).f6994p;
            String message = e15.getMessage();
            if (message == null) {
                message = e15.getClass().getName();
            }
            list.add(message);
            return null;
        }
    }

    public static final Pair e0(k01 data, int i13) {
        Intrinsics.checkNotNullParameter(data, "data");
        return new Pair(Integer.valueOf(i13), Integer.valueOf(ml2.c.b(((((Number) data.f39240c.f135235b).intValue() * 1.0d) * i13) / ((Number) data.f39240c.f135234a).intValue())));
    }

    public static void e1(x81.f0 f0Var, c91.e eVar) {
        f0Var.Y0 = eVar;
    }

    public static final boolean e2(n3.q qVar, long j13) {
        long j14 = qVar.f89109c;
        float d2 = a3.c.d(j14);
        float e13 = a3.c.e(j14);
        return d2 < 0.0f || d2 > ((float) ((int) (j13 >> 32))) || e13 < 0.0f || e13 > ((float) ((int) (j13 & 4294967295L)));
    }

    public static jw1 f(Exception t13, Exception exc) {
        Intrinsics.checkNotNullParameter(t13, "t");
        cs2 a13 = qs2.a();
        a13.a(exc);
        return a13.f();
    }

    public static final ArrayList f0(b60.b activeUserManager) {
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        ArrayList l13 = kotlin.collections.f0.l(mw1.j.f88439c);
        if (yb2.a.b(((b60.d) activeUserManager).f())) {
            l13.add(new mw1.i());
        }
        l13.add(new mw1.h());
        l13.add(new mw1.l());
        ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(l13, 10));
        Iterator it = l13.iterator();
        while (it.hasNext()) {
            arrayList.add(((mw1.m) it.next()).f88442a);
        }
        return arrayList;
    }

    public static void f1(SearchGridMultiSectionFragment searchGridMultiSectionFragment, k2 k2Var) {
        searchGridMultiSectionFragment.S0 = k2Var;
    }

    public static final boolean f2(n3.q qVar, long j13, long j14) {
        if (!n3.g0.a(qVar.f89115i, 1)) {
            return e2(qVar, j13);
        }
        long j15 = qVar.f89109c;
        float d2 = a3.c.d(j15);
        float e13 = a3.c.e(j15);
        return d2 < (-a3.f.d(j14)) || d2 > a3.f.d(j14) + ((float) ((int) (j13 >> 32))) || e13 < (-a3.f.b(j14)) || e13 > a3.f.b(j14) + ((float) ((int) (j13 & 4294967295L)));
    }

    public static byte[] g(byte[] bArr) {
        if (bArr.length != 16) {
            throw new IllegalArgumentException("value must be a block.");
        }
        byte[] bArr2 = new byte[16];
        for (int i13 = 0; i13 < 16; i13++) {
            byte b13 = (byte) ((bArr[i13] << 1) & RecyclerViewTypes.VIEW_TYPE_STORY_BLOCK_PATTERN);
            bArr2[i13] = b13;
            if (i13 < 15) {
                bArr2[i13] = (byte) (((byte) ((bArr[i13 + 1] >> 7) & 1)) | b13);
            }
        }
        bArr2[15] = (byte) (((byte) ((bArr[0] >> 7) & RecyclerViewTypes.VIEW_TYPE_FIXED_SIZE_PIN_CELL)) ^ bArr2[15]);
        return bArr2;
    }

    public static final xe1.u g0(vh story, oe1.b loggingData, Function0 boundView) {
        Intrinsics.checkNotNullParameter(story, "story");
        Intrinsics.checkNotNullParameter(loggingData, "loggingData");
        Intrinsics.checkNotNullParameter(boundView, "boundView");
        pi j13 = story.f42858p.j();
        ze1.c navParams = loggingData.f94256c;
        Intrinsics.checkNotNullParameter(navParams, "navParams");
        Intrinsics.checkNotNullParameter(boundView, "boundView");
        n90.i bubbleFeedNavigator = new n90.i(navParams, j13, loggingData, boundView, 1);
        Intrinsics.checkNotNullParameter(loggingData, "loggingData");
        Intrinsics.checkNotNullParameter(bubbleFeedNavigator, "bubbleFeedNavigator");
        i1.v0 v0Var = new i1.v0(loggingData, story, null, bubbleFeedNavigator, 1);
        Intrinsics.checkNotNullParameter(story, "story");
        Intrinsics.checkNotNullParameter(loggingData, "loggingData");
        Intrinsics.checkNotNullParameter(boundView, "boundView");
        ed1.m mVar = new ed1.m(story, loggingData, boundView, 5);
        Intrinsics.checkNotNullParameter(story, "story");
        Intrinsics.checkNotNullParameter(loggingData, "loggingData");
        ic1.c cVar = new ic1.c(15, loggingData, story);
        Intrinsics.checkNotNullParameter(boundView, "boundView");
        return new xe1.u(v0Var, mVar, cVar, new gv0.b(boundView, 25), new com.pinterest.feature.ideaPinCreation.closeup.view.d0(7, boundView), new xe1.b0(loggingData, boundView, 0), new xe1.b0(loggingData, boundView, 1), new px0.g(story, loggingData, boundView, 14));
    }

    public static void g1(SearchGridMultiSectionFragment searchGridMultiSectionFragment, dz0.d dVar) {
        searchGridMultiSectionFragment.f47698b1 = dVar;
    }

    public static final boolean g2(f30 f30Var) {
        if (f30Var == null) {
            return false;
        }
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        return b40.o0(f30Var);
    }

    public static float h(float f13, float f14, int i13) {
        return (Math.max(0, i13 - 1) * f14) + f13;
    }

    public static Uri h0(FragmentActivity fragmentActivity, Bitmap bitmap) {
        String str;
        if (bitmap == null) {
            return null;
        }
        try {
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, new bp2.a());
            str = MediaStore.Images.Media.insertImage(fragmentActivity.getContentResolver(), bitmap, "lensImage_" + System.currentTimeMillis(), (String) null);
        } catch (Exception e13) {
            HashSet hashSet = tb0.h.f117076w;
            tb0.g.f117075a.o("CameraBitmapUtil", e13);
            str = null;
        }
        if (str == null) {
            return null;
        }
        return Uri.parse(str);
    }

    public static void h1(SearchGridMultiSectionFragment searchGridMultiSectionFragment, kv.c cVar) {
        searchGridMultiSectionFragment.f47737v1 = cVar;
    }

    public static final void h2(WebImageView imageView, pu mediaItem, int i13) {
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        Intrinsics.checkNotNullParameter(mediaItem, "mediaItem");
        if (mediaItem instanceof d30) {
            d30 d30Var = (d30) mediaItem;
            if (d30Var.a()) {
                Pair d03 = d0(d30Var, i13);
                int intValue = ((Number) d03.f80346a).intValue();
                int intValue2 = ((Number) d03.f80347b).intValue();
                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                imageView.P0(new File(d30Var.e()), intValue, intValue2);
                return;
            }
            return;
        }
        if (!(mediaItem instanceof k01)) {
            throw new IllegalStateException("MediaItem must be Photo or Video");
        }
        k01 k01Var = (k01) mediaItem;
        if (k01Var.a()) {
            Pair e03 = e0(k01Var, i13);
            int intValue3 = ((Number) e03.f80346a).intValue();
            int intValue4 = ((Number) e03.f80347b).intValue();
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.P0(new File(k01Var.e()), intValue3, intValue4);
        }
    }

    public static float i(float f13, float f14, int i13) {
        return i13 > 0 ? (f14 / 2.0f) + f13 : f13;
    }

    public static final xe1.a0 i0(wy0 user, Function1 navigateToStorefront, Function0 function0) {
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(navigateToStorefront, "navigateToStorefront");
        return new xe1.a0(function0, new ld1.f(3, user), new t90.n(28, navigateToStorefront), 0);
    }

    public static void i1(SearchGridMultiSectionFragment searchGridMultiSectionFragment, m60.g0 g0Var) {
        searchGridMultiSectionFragment.f47696a1 = g0Var;
    }

    public static final void i2(vy.m analyticsApi, String userId, gv1.a notifHoldoutData) {
        Intrinsics.checkNotNullParameter(analyticsApi, "analyticsApi");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(notifHoldoutData, "notifHoldoutData");
        if (ff0.j.a()) {
            return;
        }
        Intrinsics.checkNotNullParameter(userId, "userId");
        gv1.b metadata = new gv1.b(userId, null, 2, null);
        NotifHoldoutKibanaLogger$Log$Payload payload = new NotifHoldoutKibanaLogger$Log$Payload(notifHoldoutData.f66161a, notifHoldoutData.f66162b, notifHoldoutData.f66163c, notifHoldoutData.f66164d);
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        Intrinsics.checkNotNullParameter(payload, "payload");
        gv1.c cVar = new gv1.c("android_notification_holdout_logging", metadata, payload, null, null, 0L, 56, null);
        ms0.b bVar = new ms0.b();
        bVar.b(cVar);
        analyticsApi.i(bVar, ox.a.f97979i);
    }

    public static final void j(GestaltSearchField gestaltSearchField, Function1 init) {
        Intrinsics.checkNotNullParameter(gestaltSearchField, "<this>");
        Intrinsics.checkNotNullParameter(init, "init");
        cn1.n nVar = new cn1.n(gestaltSearchField.G0());
        init.invoke(nVar);
        gestaltSearchField.a0(new an1.i(nVar, 3));
    }

    public static final String j0(String userId, String str) {
        String c13;
        Intrinsics.checkNotNullParameter(userId, "userId");
        return (str == null || (c13 = t3.s1.c("pinterest://merchant_storefront/", userId, "?pin=", str)) == null) ? a.a.k("pinterest://merchant_storefront/", userId, "/") : c13;
    }

    public static void j1(q71.x xVar, ny1.w wVar) {
        xVar.f102781z0 = wVar;
    }

    public static final void j2(nx.d0 d0Var, h32.f1 f1Var, String str, h32.g0 g0Var, h32.u0 u0Var, String str2, HashMap hashMap) {
        h32.v0 v0Var;
        if (str2 != null) {
            v0Var = new h32.v0();
            v0Var.G = str2;
        } else {
            v0Var = null;
        }
        d0Var.h0((r18 & 1) != 0 ? h32.f1.TAP : f1Var, (r18 & 2) != 0 ? null : u0Var, (r18 & 4) != 0 ? null : g0Var, (r18 & 8) != 0 ? null : str, (r18 & 32) != 0 ? null : hashMap, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? v0Var : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
    }

    public static final void k(GestaltSwitchWithLabel gestaltSwitchWithLabel, Function1 init) {
        Intrinsics.checkNotNullParameter(gestaltSwitchWithLabel, "<this>");
        Intrinsics.checkNotNullParameter(init, "init");
        on1.r rVar = new on1.r(gestaltSwitchWithLabel.Z());
        init.invoke(rVar);
        gestaltSwitchWithLabel.T(new an1.i(rVar, 11));
    }

    public static final String k0(View v13, ir.r addMessage) {
        Intrinsics.checkNotNullParameter(v13, "v");
        Intrinsics.checkNotNullParameter(addMessage, "addMessage");
        StringBuilder sb3 = new StringBuilder(BitmapUtils.BITMAP_TO_JPEG_SIZE);
        try {
            try {
                l0(v13, sb3, 0, addMessage);
            } catch (StackOverflowError unused) {
                sb3.append("StackOverFlow with last view, stopping output\n");
            }
        } catch (Throwable unused2) {
        }
        String sb4 = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "toString(...)");
        return sb4;
    }

    public static void k1(x81.f0 f0Var, ny1.w wVar) {
        f0Var.f134194a1 = wVar;
    }

    public static final void l(GestaltCheckBox gestaltCheckBox, Function1 invokeAfterStateMutation) {
        Intrinsics.checkNotNullParameter(gestaltCheckBox, "<this>");
        Intrinsics.checkNotNullParameter(invokeAfterStateMutation, "invokeAfterStateMutation");
        gestaltCheckBox.T(new em1.l(gestaltCheckBox, invokeAfterStateMutation, 0));
    }

    public static final void l0(View view, StringBuilder sb3, int i13, ir.r rVar) {
        String l13;
        String str = (String) rVar.invoke(view);
        if (str != null) {
            sb3.append(str);
        }
        String n13 = kotlin.text.z.n(new String(new char[i13]), "\u0000", "  ");
        try {
            String resourceName = view.getResources() != null ? view.getId() != -1 ? view.getResources().getResourceName(view.getId()) : "no_id" : "no_resources";
            l13 = n13 + " [" + view.getClass().getSimpleName() + "] " + resourceName + " \n";
        } catch (Resources.NotFoundException unused) {
            l13 = a.a.l(n13, " [", view.getClass().getSimpleName(), "] name_not_found\n");
        }
        sb3.append(l13);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i14 = 0; i14 < childCount; i14++) {
                l0(viewGroup.getChildAt(i14), sb3, i13 + 1, rVar);
            }
        }
    }

    public static void l1(j51.d0 d0Var, j2 j2Var) {
        d0Var.f74722b1 = j2Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x0308, code lost:
    
        if (r3 == null) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x037a, code lost:
    
        if (r1 == null) goto L142;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:85:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x022f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final gx1.f l2(com.pinterest.api.model.xr r27, android.content.res.Resources r28, java.lang.String r29) {
        /*
            Method dump skipped, instructions count: 932
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c0.d.l2(com.pinterest.api.model.xr, android.content.res.Resources, java.lang.String):gx1.f");
    }

    public static final boolean m0(wy0 wy0Var) {
        if (wy0Var != null) {
            Intrinsics.checkNotNullParameter(wy0Var, "<this>");
            int intValue = wy0Var.t2().intValue();
            Integer p43 = wy0Var.p4();
            Intrinsics.checkNotNullExpressionValue(p43, "getSecretBoardCount(...)");
            int intValue2 = p43.intValue() + intValue;
            Boolean i33 = wy0Var.i3();
            Intrinsics.checkNotNullExpressionValue(i33, "getHasQuicksaveBoard(...)");
            int i13 = intValue2 - (i33.booleanValue() ? 1 : 0);
            if (i13 >= 0 && i13 > 0) {
                return true;
            }
        }
        return false;
    }

    public static void m1(SearchGridMultiSectionFragment searchGridMultiSectionFragment, i2 i2Var) {
        searchGridMultiSectionFragment.Z0 = i2Var;
    }

    public static final void m2(ViewGroup.MarginLayoutParams lp3, int i13, int i14, int i15, int i16) {
        Intrinsics.checkNotNullParameter(lp3, "lp");
        if (i13 > i15) {
            lp3.setMarginEnd((i13 - i15) * (-1));
        }
        if (i14 > i16) {
            lp3.bottomMargin = (i14 - i16) * (-1);
        }
    }

    public static final fk2.l n(i2 i2Var, List pinIds, String str, String str2, String str3, boolean z13) {
        Intrinsics.checkNotNullParameter(i2Var, "<this>");
        Intrinsics.checkNotNullParameter(pinIds, "pinIds");
        fk2.l h10 = i2Var.P.c(CollectionsKt.Z(pinIds, ",", null, null, 0, null, null, 62), str2, str3, Boolean.valueOf(z13)).e(new m22.e(i2Var, str, pinIds, 1)).l(tk2.e.f118017c).h(wj2.c.a());
        Intrinsics.checkNotNullExpressionValue(h10, "observeOn(...)");
        return h10;
    }

    public static void n0(k91.c cVar, mr1.a aVar) {
        cVar.f78810k0 = aVar;
    }

    public static void n1(j51.d0 d0Var, i2 i2Var) {
        d0Var.U0 = i2Var;
    }

    public static final ArrayList n2(List list, List list2) {
        boolean booleanValue;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            tx0 tx0Var = (tx0) it.next();
            Object obj = null;
            if (list2 != null) {
                Iterator it2 = list2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    if (Intrinsics.d(((tx0) next).u(), tx0Var.u())) {
                        obj = next;
                        break;
                    }
                }
                obj = (tx0) obj;
            }
            qx0 w13 = tx0Var.w();
            if (obj != null) {
                booleanValue = true;
            } else {
                Boolean o13 = tx0Var.o();
                Intrinsics.checkNotNullExpressionValue(o13, "getIsSelected(...)");
                booleanValue = o13.booleanValue();
            }
            w13.c(Boolean.valueOf(booleanValue));
            tx0 a13 = w13.a();
            Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
            arrayList.add(a13);
        }
        if (list2 != null) {
            Iterator it3 = list2.iterator();
            while (it3.hasNext()) {
                tx0 tx0Var2 = (tx0) it3.next();
                if (!arrayList.isEmpty()) {
                    Iterator it4 = arrayList.iterator();
                    while (it4.hasNext()) {
                        if (Intrinsics.d(((tx0) it4.next()).u(), tx0Var2.u())) {
                            break;
                        }
                    }
                }
                qx0 w14 = tx0Var2.w();
                w14.c(Boolean.TRUE);
                tx0 a14 = w14.a();
                Intrinsics.checkNotNullExpressionValue(a14, "build(...)");
                arrayList.add(a14);
            }
        }
        return arrayList;
    }

    public static final fk2.l o(i2 i2Var, String clusterId, String boardId, String deselectedPinIds) {
        Intrinsics.checkNotNullParameter(i2Var, "<this>");
        Intrinsics.checkNotNullParameter(clusterId, "clusterId");
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        Intrinsics.checkNotNullParameter(deselectedPinIds, "deselectedPinIds");
        fk2.l h10 = i2Var.P.b(clusterId, boardId, deselectedPinIds).l(tk2.e.f118017c).h(wj2.c.a());
        Intrinsics.checkNotNullExpressionValue(h10, "observeOn(...)");
        return h10;
    }

    public static void o0(qa1.e eVar, mr1.a aVar) {
        eVar.B0 = aVar;
    }

    public static void o1(oq1.e eVar, i2 i2Var) {
        eVar.f97228k0 = i2Var;
    }

    public static final ArrayList o2(ArrayList arrayList, ArrayList cachedItems) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        Intrinsics.checkNotNullParameter(cachedItems, "cachedItems");
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            fl1.d dVar = (fl1.d) it.next();
            int indexOf = cachedItems.indexOf(dVar);
            if (indexOf >= 0) {
                dVar = (fl1.d) ((fl1.d) cachedItems.get(indexOf)).a((dl1.s) dVar);
            }
            arrayList2.add(dVar);
        }
        return arrayList2;
    }

    public static final float p(f30 pin) {
        Collection values;
        jo0 q13;
        Intrinsics.checkNotNullParameter(pin, "pin");
        dl0 v63 = pin.v6();
        sr srVar = null;
        Double l13 = (v63 == null || (q13 = v63.q()) == null) ? null : q13.l();
        if (l13 != null && !Intrinsics.b(l13, 0.0d)) {
            return (float) l13.doubleValue();
        }
        Map A4 = pin.A4();
        if (A4 != null && (values = A4.values()) != null) {
            srVar = (sr) CollectionsKt.T(values);
        }
        int E0 = bs1.c.E0(srVar);
        int w03 = bs1.c.w0(srVar);
        if (E0 == 0 || w03 == 0) {
            return 0.5625f;
        }
        return (E0 * 1.0f) / w03;
    }

    public static void p0(k91.c cVar, lu1.b bVar) {
        cVar.f78811l0 = bVar;
    }

    public static void p1(x81.f0 f0Var, i2 i2Var) {
        f0Var.U0 = i2Var;
    }

    public static Bitmap p2(Bitmap bitmap, String str) {
        try {
            if (str == null) {
                str = "";
            }
            int f13 = new k6.g(str).f(1, "Orientation");
            int i13 = f13 == 6 ? 90 : f13 == 3 ? RecyclerViewTypes.VIEW_TYPE_BUBBLE_CATEGORY_REP : f13 == 8 ? RecyclerViewTypes.VIEW_TYPE_SHOPPING_FILTER_EMPTY_STATE_EOF : 0;
            return i13 != 0 ? D2(i13, bitmap) : bitmap;
        } catch (IOException e13) {
            HashSet hashSet = tb0.h.f117076w;
            tb0.g.f117075a.o("Failed to get ExifInterface in CameraBitmapUtil", e13);
            return bitmap;
        }
    }

    public static dm1.c q(u50.i0 i0Var, u50.f0 f0Var, u50.i0 i0Var2, u50.i0 i0Var3, dm1.d variant, boolean z13, u50.k0 k0Var, boolean z14, boolean z15, int i13, fm1.c cVar, int i14) {
        yl1.g colorPalette;
        rm1.q qVar;
        rm1.c cVar2;
        boolean z16 = (i14 & 32) != 0 ? true : z13;
        u50.k0 k0Var2 = (i14 & 64) != 0 ? null : k0Var;
        boolean z17 = (i14 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? false : z14;
        int i15 = (i14 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? Integer.MIN_VALUE : i13;
        fm1.c visibility = (i14 & 1024) != 0 ? GestaltCallout.f49347h : cVar;
        Intrinsics.checkNotNullParameter(variant, "variant");
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        u50.h0 h0Var = u50.h0.f120562a;
        u50.i0 i0Var4 = i0Var == null ? h0Var : i0Var;
        int i16 = dm1.r.callout_title;
        rn1.a aVar = new rn1.a(i0Var4, null, null, kotlin.collections.e0.b(vn1.e.BOLD), vn1.g.UI_400, 0, i0Var == null ? fm1.c.GONE : fm1.c.VISIBLE, null, null, null, z17, i16, null, null, null, false, null, fm1.a.YES, 1569702);
        rn1.a aVar2 = new rn1.a(f0Var == null ? h0Var : f0Var, null, null, null, vn1.g.BODY_300, 0, f0Var == null ? fm1.c.GONE : fm1.c.VISIBLE, null, null, null, z15, dm1.r.callout_message, null, null, null, false, null, null, 2093998);
        fm1.c cVar3 = fm1.c.VISIBLE;
        fm1.c cVar4 = cVar3 == null ? fm1.c.GONE : cVar3;
        int i17 = dm1.r.callout_primary_action_button;
        Intrinsics.checkNotNullParameter(variant, "<this>");
        int[] iArr = dm1.o.f55381a;
        switch (iArr[variant.ordinal()]) {
            case 1:
                colorPalette = yl1.d.SECONDARY.getColorPalette();
                break;
            case 2:
                colorPalette = yl1.d.TERTIARY.getColorPalette();
                break;
            case 3:
                colorPalette = yl1.d.TERTIARY.getColorPalette();
                break;
            case 4:
                colorPalette = yl1.d.TERTIARY.getColorPalette();
                break;
            case 5:
                colorPalette = yl1.d.TERTIARY.getColorPalette();
                break;
            case 6:
                colorPalette = yl1.d.TERTIARY.getColorPalette();
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        cm1.d dVar = new cm1.d(new yl1.b(i0Var2, false, cVar4, null, colorPalette, null, null, null, i17, null, 746), new yl1.b(i0Var3 == null ? h0Var : i0Var3, false, (i0Var3 == null || cVar3 == null) ? fm1.c.GONE : cVar3, null, yl1.d.TRANSPARENT.getColorPalette(), null, null, null, dm1.r.callout_secondary_action_button, null, 746), null, null, null, cVar3, dm1.r.callout_button_group, 28);
        om1.c cVar5 = new om1.c(rm1.q.CANCEL, om1.e.SM, om1.f.TRANSPARENT_DARK_GRAY, z16 ? cVar3 : fm1.c.GONE, k0Var2 == null ? h0Var : k0Var2, false, dm1.r.callout_dismiss_icon_button, 736);
        Intrinsics.checkNotNullParameter(variant, "<this>");
        switch (iArr[variant.ordinal()]) {
            case 1:
                qVar = rm1.q.SPARKLE;
                break;
            case 2:
                qVar = rm1.q.WORKFLOW_STATUS_WARNING;
                break;
            case 3:
                qVar = rm1.q.INFO_CIRCLE;
                break;
            case 4:
                qVar = rm1.q.SPARKLE;
                break;
            case 5:
                qVar = rm1.q.WORKFLOW_STATUS_OK;
                break;
            case 6:
                qVar = rm1.q.WORKFLOW_STATUS_PROBLEM;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        rm1.f fVar = new rm1.f(qVar, rm1.i.XL);
        Intrinsics.checkNotNullParameter(variant, "<this>");
        switch (iArr[variant.ordinal()]) {
            case 1:
                cVar2 = rm1.c.WARNING;
                break;
            case 2:
                cVar2 = rm1.c.WARNING;
                break;
            case 3:
                cVar2 = rm1.c.INFO;
                break;
            case 4:
                cVar2 = rm1.c.RECOMMENDATION;
                break;
            case 5:
                cVar2 = rm1.c.SUCCESS;
                break;
            case 6:
                cVar2 = rm1.c.ERROR;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        Intrinsics.checkNotNullParameter(variant, "<this>");
        switch (iArr[variant.ordinal()]) {
            case 1:
                cVar3 = fm1.c.GONE;
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return new dm1.c(aVar, aVar2, dVar, new rm1.d(fVar, cVar2, cVar3, dm1.r.callout_workflow_status_icon, null, 16), cVar5, variant, i15, visibility);
    }

    public static void q0(SearchGridMultiSectionFragment searchGridMultiSectionFragment, es.a aVar) {
        searchGridMultiSectionFragment.f47733t1 = aVar;
    }

    public static void q1(SearchGridMultiSectionFragment searchGridMultiSectionFragment, nx.f0 f0Var) {
        searchGridMultiSectionFragment.Y0 = f0Var;
    }

    public static gr1.e q2(String str, String str2, String str3) {
        return new gr1.e(str, str2, str3);
    }

    public static int r(int i13, boolean z13, int i14, int i15) {
        if ((i15 & 2) != 0) {
            z13 = false;
        }
        if ((i15 & 4) != 0) {
            i14 = z13 ? qb0.b.h() : hf0.b.f69003c - hf0.b.f();
        }
        return Math.min(i13, i14);
    }

    public static void r0(g41.p pVar, e2 e2Var) {
        pVar.f63530g0 = e2Var;
    }

    public static void r1(x81.f0 f0Var, nx.f0 f0Var2) {
        f0Var.V0 = f0Var2;
    }

    public static kr1.d r2(mr1.c cVar, uj2.q qVar, qr1.y yVar, String str, lu1.d dVar, s9 s9Var, t9 t9Var) {
        return new kr1.d(cVar, qVar, yVar, str, dVar, s9Var, t9Var);
    }

    public static final boolean s(n3.q qVar) {
        return !qVar.f89114h && qVar.f89110d;
    }

    public static void s0(SearchGridMultiSectionFragment searchGridMultiSectionFragment, kv.a aVar) {
        searchGridMultiSectionFragment.f47735u1 = aVar;
    }

    public static void s1(SearchGridMultiSectionFragment searchGridMultiSectionFragment, nx.o0 o0Var) {
        searchGridMultiSectionFragment.f47711i1 = o0Var;
    }

    public static final float s2(float f13, int i13, Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return v(((i13 / context.getResources().getDisplayMetrics().density) / 375) * f13, context);
    }

    public static final boolean t(n3.q qVar) {
        return (qVar.m() || !qVar.f89114h || qVar.f89110d) ? false : true;
    }

    public static void t0(SearchGridMultiSectionFragment searchGridMultiSectionFragment, es.h hVar) {
        searchGridMultiSectionFragment.f47739w1 = hVar;
    }

    public static void t1(j51.d0 d0Var, nx.o0 o0Var) {
        d0Var.f74725e1 = o0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void t2(nx.d0 r11, h32.f1 r12, h32.g0 r13, h32.u0 r14, java.util.HashMap r15) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "eventType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r0 = "auxData"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            java.util.HashMap r0 = r11.f()
            if (r0 == 0) goto L22
            java.lang.String r1 = "object_id"
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L20
            goto L22
        L20:
            r5 = r0
            goto L43
        L22:
            java.util.HashMap r0 = r11.f()
            r1 = 0
            if (r0 == 0) goto L32
            java.lang.String r2 = "quiz_id"
            java.lang.Object r0 = r0.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            goto L33
        L32:
            r0 = r1
        L33:
            if (r0 != 0) goto L20
            h32.i0 r0 = r11.p()
            if (r0 == 0) goto L42
            h32.x3 r0 = r0.f67083c
            if (r0 == 0) goto L42
            java.lang.String r0 = r0.f67402f
            goto L20
        L42:
            r5 = r1
        L43:
            java.util.HashMap r0 = r11.f()
            if (r0 != 0) goto L4e
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
        L4e:
            r6 = r0
            r6.putAll(r15)
            java.lang.String r15 = "team"
            java.lang.String r0 = "atg_products"
            r6.put(r15, r0)
            r8 = 0
            r9 = 0
            r7 = 0
            r10 = 464(0x1d0, float:6.5E-43)
            r1 = r11
            r2 = r12
            r3 = r14
            r4 = r13
            nx.d0.D(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c0.d.t2(nx.d0, h32.f1, h32.g0, h32.u0, java.util.HashMap):void");
    }

    public static final boolean u(n3.q qVar) {
        return qVar.f89114h && !qVar.f89110d;
    }

    public static void u0(SearchGridMultiSectionFragment searchGridMultiSectionFragment, lh0.j jVar) {
        searchGridMultiSectionFragment.V0 = jVar;
    }

    public static void u1(SearchGridMultiSectionFragment searchGridMultiSectionFragment) {
        searchGridMultiSectionFragment.getClass();
    }

    public static /* synthetic */ void u2(nx.d0 d0Var, h32.f1 f1Var, h32.g0 g0Var, h32.u0 u0Var, HashMap hashMap, int i13) {
        if ((i13 & 1) != 0) {
            f1Var = h32.f1.TAP;
        }
        if ((i13 & 2) != 0) {
            g0Var = null;
        }
        if ((i13 & 4) != 0) {
            u0Var = null;
        }
        if ((i13 & 8) != 0) {
            hashMap = new HashMap();
        }
        t2(d0Var, f1Var, g0Var, u0Var, hashMap);
    }

    public static final float v(float f13, Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return (context.getResources().getDisplayMetrics().densityDpi / 160) * f13;
    }

    public static void v0(SearchGridMultiSectionFragment searchGridMultiSectionFragment, vy.m mVar) {
        searchGridMultiSectionFragment.f47721n1 = mVar;
    }

    public static void v1(SearchGridMultiSectionFragment searchGridMultiSectionFragment, b20.c cVar) {
        searchGridMultiSectionFragment.f47713j1 = cVar;
    }

    public static final RemoteViews v2(uz1.v data) {
        Intrinsics.checkNotNullParameter(data, "data");
        RemoteViews remoteViews = new RemoteViews(data.f123318a.getPackageName(), pz1.d.notif_expanded_only_pin_grid);
        List list = data.f123320c;
        if (list.size() >= 6) {
            if (Build.VERSION.SDK_INT >= 31) {
                remoteViews.setBoolean(pz1.c.richNotifPinGridBackground, "setClipToOutline", true);
            }
            remoteViews.setImageViewBitmap(pz1.c.richNotifPin0, (Bitmap) list.get(0));
            remoteViews.setImageViewBitmap(pz1.c.richNotifPin1, (Bitmap) list.get(1));
            remoteViews.setImageViewBitmap(pz1.c.richNotifPin2, (Bitmap) list.get(2));
            remoteViews.setImageViewBitmap(pz1.c.richNotifPin3, (Bitmap) list.get(3));
            remoteViews.setImageViewBitmap(pz1.c.richNotifPin4, (Bitmap) list.get(4));
            remoteViews.setImageViewBitmap(pz1.c.richNotifPin5, (Bitmap) list.get(5));
        } else {
            remoteViews.setViewVisibility(pz1.c.richNotifPinGrid, 8);
        }
        remoteViews.setOnClickPendingIntent(pz1.c.expanded_view_root, data.f123323f);
        return remoteViews;
    }

    public static final float w(double d2, float f13) {
        return (float) ((d2 / 100) * f13);
    }

    public static void w0(rx1.d dVar, so.g1 g1Var) {
        dVar.f110206y0 = g1Var;
    }

    public static void w1(SearchGridMultiSectionFragment searchGridMultiSectionFragment, lb0.q qVar) {
        searchGridMultiSectionFragment.f47725p1 = qVar;
    }

    public static final long w2(n3.q qVar, boolean z13) {
        long g13 = a3.c.g(qVar.f89109c, qVar.f89113g);
        if (z13 || !qVar.m()) {
            return g13;
        }
        return 0L;
    }

    public static final int x(double d2, float f13) {
        return ml2.c.b((d2 / 100) * f13);
    }

    public static void x0(x81.f0 f0Var, yk1.a aVar) {
        f0Var.X0 = aVar;
    }

    public static void x1(cc1.d dVar, lb0.r rVar) {
        dVar.F0 = rVar;
    }

    public static final boolean x2(n3.q qVar) {
        return !a3.c.b(w2(qVar, true), 0L);
    }

    public static Bitmap y(Bitmap bitmap, int i13, int i14, Matrix matrix) {
        try {
            return Bitmap.createBitmap(bitmap, 0, 0, i13, i14, matrix, false);
        } catch (IllegalArgumentException e13) {
            HashSet hashSet = tb0.h.f117076w;
            tb0.g.f117075a.o("CameraBitmapUtil", e13);
            return null;
        } catch (OutOfMemoryError e14) {
            HashSet hashSet2 = tb0.h.f117076w;
            tb0.g.f117075a.o("Failed to allocate memory in CameraBitmapUtil", e14);
            return null;
        }
    }

    public static void y0(SearchGridMultiSectionFragment searchGridMultiSectionFragment, cz.e eVar) {
        searchGridMultiSectionFragment.f47719m1 = eVar;
    }

    public static void y1(cc1.d dVar, uk1.e eVar) {
        dVar.f27451z0 = eVar;
    }

    public static int y2(d7.c0 c0Var, int i13, int i14, int i15) {
        bf.b.i(Math.max(Math.max(i13, i14), i15) <= 31);
        int i16 = (1 << i13) - 1;
        int i17 = (1 << i14) - 1;
        kg.a.j(kg.a.j(i16, i17), 1 << i15);
        if (c0Var.b() < i13) {
            return -1;
        }
        int g13 = c0Var.g(i13);
        if (g13 != i16) {
            return g13;
        }
        if (c0Var.b() < i14) {
            return -1;
        }
        int g14 = c0Var.g(i14);
        int i18 = g13 + g14;
        if (g14 != i17) {
            return i18;
        }
        if (c0Var.b() < i15) {
            return -1;
        }
        return i18 + c0Var.g(i15);
    }

    public static GestaltText z(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return C(context, -1, 0, 0, 0, bs1.c.V(context, eo1.c.space_100), true, 380);
    }

    public static void z0(SearchGridMultiSectionFragment searchGridMultiSectionFragment, dz.a aVar) {
        searchGridMultiSectionFragment.f47717l1 = aVar;
    }

    public static void z1(g41.e eVar, uk1.e eVar2) {
        eVar.f63505z0 = eVar2;
    }

    public static void z2(Bitmap bitmap) {
        if (bitmap != null) {
            bitmap.recycle();
        }
        Context context = kb0.a.f79058b;
        ((oa) ((j92.a) ep.b.g(j92.a.class))).E2().h(f80.b.pin_more_save_fail);
    }
}
