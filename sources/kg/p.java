package kg;

import a.cb;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Path;
import android.graphics.RectF;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.widget.r2;
import androidx.core.content.FileProvider;
import ao2.h0;
import ao2.m0;
import b3.s0;
import com.pinterest.activity.conversation.notifsupsell.view.NotifsOptInUpsellBannerView;
import com.pinterest.activity.sendapin.model.SendableObject;
import com.pinterest.api.model.f30;
import com.pinterest.component.modal.BaseModalViewWrapper;
import com.pinterest.design.widget.RoundedCornersLayout;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.sendshare.view.ContactSearchAndSelectModalView;
import com.pinterest.following.view.lego.CreatorFollowButton;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.searchField.GestaltSearchField;
import com.pinterest.gestalt.selectList.GestaltSelectList;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.grid.LegoPinGridCellImpl;
import df.j1;
import h32.d4;
import h32.f1;
import h32.u0;
import i2.f2;
import i2.q1;
import i2.z1;
import io.embrace.android.embracesdk.spans.ErrorCode;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import jc0.v;
import k1.n1;
import kh2.k3;
import kh2.p2;
import kotlin.collections.CollectionsKt;
import kotlin.collections.f0;
import kotlin.collections.q0;
import kotlin.collections.z0;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.z;
import kotlinx.coroutines.internal.DiagnosticCoroutineContextException;
import kotlinx.coroutines.internal.ExceptionSuccessfullyProcessed;
import m60.w;
import m60.x0;
import net.quikkly.android.utils.BitmapUtils;
import nm.u;
import nx.d0;
import p1.c1;
import p1.e1;
import pk.a0;
import q3.p0;
import qf1.y;
import r72.i0;
import r72.j0;
import r72.k0;
import r72.l0;
import rq.n3;
import so.oa;
import ua2.g1;
import ua2.w0;
import w80.i1;
import w90.g0;
import x02.i2;
import xf2.c0;
import yn2.x;

/* loaded from: classes3.dex */
public abstract class p {
    public static final StackTraceElement A(dl2.a continuation) {
        int i13;
        String str;
        Intrinsics.checkNotNullParameter(continuation, "<this>");
        dl2.f fVar = (dl2.f) continuation.getClass().getAnnotation(dl2.f.class);
        String str2 = null;
        if (fVar == null) {
            return null;
        }
        int v13 = fVar.v();
        if (v13 > 1) {
            throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + v13 + ". Please update the Kotlin standard library.").toString());
        }
        try {
            Field declaredField = continuation.getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(continuation);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            i13 = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            i13 = -1;
        }
        int i14 = i13 >= 0 ? fVar.l()[i13] : -1;
        dl2.g.f55297a.getClass();
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        r2 r2Var = dl2.g.f55299c;
        r2 r2Var2 = dl2.g.f55298b;
        if (r2Var == null) {
            try {
                r2 r2Var3 = new r2(Class.class.getDeclaredMethod("getModule", new Class[0]), continuation.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), continuation.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", new Class[0]));
                dl2.g.f55299c = r2Var3;
                r2Var = r2Var3;
            } catch (Exception unused2) {
                dl2.g.f55299c = r2Var2;
                r2Var = r2Var2;
            }
        }
        if (r2Var != r2Var2) {
            Method method = r2Var.f16677a;
            Object invoke = method != null ? method.invoke(continuation.getClass(), new Object[0]) : null;
            if (invoke != null) {
                Method method2 = r2Var.f16678b;
                Object invoke2 = method2 != null ? method2.invoke(invoke, new Object[0]) : null;
                if (invoke2 != null) {
                    Method method3 = r2Var.f16679c;
                    Object invoke3 = method3 != null ? method3.invoke(invoke2, new Object[0]) : null;
                    if (invoke3 instanceof String) {
                        str2 = (String) invoke3;
                    }
                }
            }
        }
        if (str2 == null) {
            str = fVar.c();
        } else {
            str = str2 + '/' + fVar.c();
        }
        return new StackTraceElement(str, fVar.m(), fVar.f(), i14);
    }

    public static Uri B(Context context, File file, m60.e eVar) {
        ((m60.d) eVar).f85896f.getClass();
        return FileProvider.c(0, context, "com.pinterest.provider").c(file);
    }

    public static final void C(CoroutineContext coroutineContext, Throwable th3) {
        Throwable runtimeException;
        Iterator it = ho2.d.f69752a.iterator();
        while (it.hasNext()) {
            try {
                ((h0) it.next()).handleException(coroutineContext, th3);
            } catch (ExceptionSuccessfullyProcessed unused) {
                return;
            } catch (Throwable th4) {
                if (th3 == th4) {
                    runtimeException = th3;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th4);
                    xk2.f.a(runtimeException, th3);
                }
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, runtimeException);
            }
        }
        try {
            xk2.f.a(th3, new DiagnosticCoroutineContextException(coroutineContext));
        } catch (Throwable unused2) {
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th3);
    }

    public static void D(long[] jArr, long[] jArr2) {
        long j13 = jArr[0];
        long j14 = jArr[1];
        long j15 = jArr[2];
        long j16 = jArr[3];
        jArr2[0] = j13 & 562949953421311L;
        jArr2[1] = ((j13 >>> 49) ^ (j14 << 15)) & 562949953421311L;
        jArr2[2] = ((j14 >>> 34) ^ (j15 << 30)) & 562949953421311L;
        jArr2[3] = (j15 >>> 19) ^ (j16 << 45);
    }

    public static void E(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[4];
        long[] jArr5 = new long[4];
        D(jArr, jArr4);
        D(jArr2, jArr5);
        F(jArr4[0], jArr5[0], jArr3, 0);
        F(jArr4[1], jArr5[1], jArr3, 1);
        F(jArr4[2], jArr5[2], jArr3, 2);
        F(jArr4[3], jArr5[3], jArr3, 3);
        for (int i13 = 5; i13 > 0; i13--) {
            jArr3[i13] = jArr3[i13] ^ jArr3[i13 - 1];
        }
        F(jArr4[0] ^ jArr4[1], jArr5[0] ^ jArr5[1], jArr3, 1);
        F(jArr4[2] ^ jArr4[3], jArr5[2] ^ jArr5[3], jArr3, 3);
        for (int i14 = 7; i14 > 1; i14--) {
            jArr3[i14] = jArr3[i14] ^ jArr3[i14 - 2];
        }
        long j13 = jArr4[0] ^ jArr4[2];
        long j14 = jArr4[1] ^ jArr4[3];
        long j15 = jArr5[0] ^ jArr5[2];
        long j16 = jArr5[1] ^ jArr5[3];
        F(j13 ^ j14, j15 ^ j16, jArr3, 3);
        long[] jArr6 = new long[3];
        F(j13, j15, jArr6, 0);
        F(j14, j16, jArr6, 1);
        long j17 = jArr6[0];
        long j18 = jArr6[1];
        long j19 = jArr6[2];
        long j23 = jArr3[2] ^ j17;
        jArr3[2] = j23;
        long j24 = jArr3[3] ^ (j17 ^ j18);
        jArr3[3] = j24;
        long j25 = jArr3[4] ^ (j19 ^ j18);
        jArr3[4] = j25;
        long j26 = jArr3[5] ^ j19;
        jArr3[5] = j26;
        long j27 = jArr3[0];
        long j28 = jArr3[1];
        long j29 = jArr3[6];
        long j33 = jArr3[7];
        jArr3[0] = j27 ^ (j28 << 49);
        jArr3[1] = (j28 >>> 15) ^ (j23 << 34);
        jArr3[2] = (j23 >>> 30) ^ (j24 << 19);
        jArr3[3] = ((j24 >>> 45) ^ (j25 << 4)) ^ (j26 << 53);
        jArr3[4] = ((j25 >>> 60) ^ (j29 << 38)) ^ (j26 >>> 11);
        jArr3[5] = (j29 >>> 26) ^ (j33 << 23);
        jArr3[6] = j33 >>> 41;
        jArr3[7] = 0;
    }

    public static void F(long j13, long j14, long[] jArr, int i13) {
        long j15 = j14 << 1;
        long j16 = j15 ^ j14;
        long j17 = j14 << 2;
        long j18 = j16 << 1;
        long[] jArr2 = {0, j14, j15, j16, j17, j17 ^ j14, j18, j18 ^ j14};
        int i14 = (int) j13;
        long j19 = (jArr2[(i14 >>> 3) & 7] << 3) ^ jArr2[i14 & 7];
        long j23 = 0;
        int i15 = 36;
        do {
            int i16 = (int) (j13 >>> i15);
            long j24 = (((jArr2[i16 & 7] ^ (jArr2[(i16 >>> 3) & 7] << 3)) ^ (jArr2[(i16 >>> 6) & 7] << 6)) ^ (jArr2[(i16 >>> 9) & 7] << 9)) ^ (jArr2[(i16 >>> 12) & 7] << 12);
            j19 ^= j24 << i15;
            j23 ^= j24 >>> (-i15);
            i15 -= 15;
        } while (i15 > 0);
        jArr[i13] = jArr[i13] ^ (562949953421311L & j19);
        int i17 = i13 + 1;
        jArr[i17] = jArr[i17] ^ ((j19 >>> 49) ^ (j23 << 15));
    }

    public static void G(long[] jArr, long[] jArr2) {
        p2.e0(0, jArr[0], jArr2);
        p2.e0(2, jArr[1], jArr2);
        p2.e0(4, jArr[2], jArr2);
        jArr2[6] = jArr[3] & 1;
    }

    public static final boolean H(g0 g0Var, String group) {
        Intrinsics.checkNotNullParameter(g0Var, "<this>");
        Intrinsics.checkNotNullParameter(group, "group");
        String str = (String) g0Var.f128542g.get("android_curation_collages_overflow_add_to_collage");
        if (str != null) {
            return z.i(str, group, true);
        }
        return false;
    }

    public static void I(u51.i iVar, a12.d dVar) {
        iVar.B0 = dVar;
    }

    public static void J(u51.i iVar, a11.d dVar) {
        iVar.f120629z0 = dVar;
    }

    public static void K(u51.i iVar, i2 i2Var) {
        iVar.C0 = i2Var;
    }

    public static void L(u51.i iVar, uk1.e eVar) {
        iVar.A0 = eVar;
    }

    public static void M(u51.i iVar, i92.k kVar) {
        iVar.D0 = kVar;
    }

    public static void N(CreatorFollowButton creatorFollowButton, nk1.l lVar) {
        creatorFollowButton.f49054k = lVar;
    }

    public static final boolean O(ov1.e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        return f0.j(ov1.e.SINGLE_SELECTABLE_ONLY, ov1.e.SINGLE_DESELECTABLE).contains(eVar);
    }

    public static final void P(Context context, TextView textView, String str, String str2) {
        String str3;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(textView, "textView");
        if (str != null) {
            str3 = str.toLowerCase();
            Intrinsics.checkNotNullExpressionValue(str3, "toLowerCase(...)");
        } else {
            str3 = null;
        }
        if (Intrinsics.d(str3, "#ffffff") && str2 == null) {
            textView.setShadowLayer(c0.d.v(3.0f, context), 0.0f, 0.0f, dl2.b.x0(context, eo1.a.color_background_dark_opacity_300));
        }
    }

    public static void Q(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[8];
        E(jArr, jArr2, jArr4);
        V(jArr4, jArr3);
    }

    public static ContactSearchAndSelectModalView R(Context context, SendableObject sendableObject, BaseModalViewWrapper modalViewWrapper, g91.c contactType, boolean z13, int i13, int i14) {
        int i15;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sendableObject, "sendableObject");
        Intrinsics.checkNotNullParameter(modalViewWrapper, "modalViewWrapper");
        Intrinsics.checkNotNullParameter(contactType, "contactType");
        int i16 = 0;
        ContactSearchAndSelectModalView contactSearchAndSelectModalView = new ContactSearchAndSelectModalView(context, null, 0);
        contactSearchAndSelectModalView.f48085y = z13;
        contactSearchAndSelectModalView.f48071k = sendableObject;
        contactSearchAndSelectModalView.f48072l = modalViewWrapper;
        contactSearchAndSelectModalView.f48073m = contactType;
        if (z13) {
            View.inflate(contactSearchAndSelectModalView.getContext(), a62.d.view_lego_sharesheet_contact_search_send_inline, contactSearchAndSelectModalView);
            contactSearchAndSelectModalView.f48077q = (GestaltIconButton) contactSearchAndSelectModalView.findViewById(a62.c.dismiss_button);
            contactSearchAndSelectModalView.f48078r = (GestaltIconButton) contactSearchAndSelectModalView.findViewById(a62.c.modal_header_dismiss_bt);
            contactSearchAndSelectModalView.f48079s = (LinearLayout) contactSearchAndSelectModalView.findViewById(a62.c.internal_send_header);
            contactSearchAndSelectModalView.f48080t = (GestaltText) contactSearchAndSelectModalView.findViewById(a62.c.send_on_pinterest_title);
            contactSearchAndSelectModalView.f48081u = (NotifsOptInUpsellBannerView) contactSearchAndSelectModalView.findViewById(a62.c.notifs_optin_upsell_container);
        } else {
            View.inflate(contactSearchAndSelectModalView.getContext(), a62.d.view_contact_search_select, contactSearchAndSelectModalView);
        }
        contactSearchAndSelectModalView.setOrientation(1);
        View findViewById = contactSearchAndSelectModalView.findViewById(a62.c.search_et);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        contactSearchAndSelectModalView.f48075o = (GestaltSearchField) findViewById;
        View findViewById2 = contactSearchAndSelectModalView.findViewById(a62.c.list_view);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        contactSearchAndSelectModalView.f48076p = (ListView) findViewById2;
        GestaltSearchField gestaltSearchField = contactSearchAndSelectModalView.f48075o;
        if (gestaltSearchField == null) {
            Intrinsics.r("searchEt");
            throw null;
        }
        gestaltSearchField.g0(new j91.f(contactSearchAndSelectModalView, i16));
        Context context2 = contactSearchAndSelectModalView.getContext();
        ap.o oVar = contactSearchAndSelectModalView.f48067g;
        if (oVar == null) {
            Intrinsics.r("uploadContactsUtil");
            throw null;
        }
        g91.c cVar = contactSearchAndSelectModalView.f48073m;
        if (cVar == null) {
            Intrinsics.r("contactType");
            throw null;
        }
        SendableObject sendableObject2 = contactSearchAndSelectModalView.f48071k;
        if (sendableObject2 == null) {
            Intrinsics.r("sendableObject");
            throw null;
        }
        dr.k kVar = new dr.k(context2, oVar, cVar, true, i13, i14, true, z13, sendableObject2.d(), true);
        contactSearchAndSelectModalView.f48074n = kVar;
        kVar.f56208w = 25;
        g91.c cVar2 = contactSearchAndSelectModalView.f48073m;
        if (cVar2 == null) {
            Intrinsics.r("contactType");
            throw null;
        }
        g91.c cVar3 = g91.c.COLLABORATOR;
        if (cVar2 == cVar3) {
            qz.f0 f0Var = new qz.f0();
            SendableObject sendableObject3 = contactSearchAndSelectModalView.f48071k;
            if (sendableObject3 == null) {
                Intrinsics.r("sendableObject");
                throw null;
            }
            String d2 = sendableObject3.d();
            Intrinsics.checkNotNullExpressionValue(d2, "getUid(...)");
            f0Var.e("board", d2);
            dr.k kVar2 = contactSearchAndSelectModalView.f48074n;
            if (kVar2 == null) {
                Intrinsics.r("adapter");
                throw null;
            }
            kVar2.f56211z = f0Var;
        }
        if (contactSearchAndSelectModalView.f48085y) {
            dr.k kVar3 = contactSearchAndSelectModalView.f48074n;
            if (kVar3 == null) {
                Intrinsics.r("adapter");
                throw null;
            }
            kVar3.f56209x = vc0.c.sharesheet_list_cell_person_lego_inline_send;
            GestaltText gestaltText = contactSearchAndSelectModalView.f48080t;
            if (gestaltText != null) {
                gestaltText.i(j91.i.f75126l);
            }
            i15 = 1;
            contactSearchAndSelectModalView.i(true);
            GestaltText gestaltText2 = contactSearchAndSelectModalView.f48080t;
            if (gestaltText2 != null) {
                gestaltText2.i(j91.i.f75127m);
            }
            GestaltIconButton gestaltIconButton = contactSearchAndSelectModalView.f48078r;
            if (gestaltIconButton != null) {
                com.bumptech.glide.c.u1(gestaltIconButton);
            }
            GestaltIconButton gestaltIconButton2 = contactSearchAndSelectModalView.f48078r;
            if (gestaltIconButton2 != null) {
                gestaltIconButton2.u(new n3(11));
            }
            g91.c cVar4 = contactSearchAndSelectModalView.f48073m;
            if (cVar4 == null) {
                Intrinsics.r("contactType");
                throw null;
            }
            if (cVar4 == cVar3) {
                bs1.c.R1(contactSearchAndSelectModalView.f48079s, false);
                GestaltText gestaltText3 = contactSearchAndSelectModalView.f48080t;
                if (gestaltText3 != null) {
                    a0.o(gestaltText3, x0.send_invite, new Object[0]);
                }
            }
        } else {
            i15 = 1;
            dr.k kVar4 = contactSearchAndSelectModalView.f48074n;
            if (kVar4 == null) {
                Intrinsics.r("adapter");
                throw null;
            }
            kVar4.f56209x = w42.b.list_cell_person_brio_elevated;
            ListView listView = contactSearchAndSelectModalView.f48076p;
            if (listView == null) {
                Intrinsics.r("listView");
                throw null;
            }
            listView.setOnItemClickListener(contactSearchAndSelectModalView.E);
        }
        GestaltIconButton gestaltIconButton3 = contactSearchAndSelectModalView.f48077q;
        if (gestaltIconButton3 != null) {
            gestaltIconButton3.u(new j91.f(contactSearchAndSelectModalView, i15));
        }
        ListView listView2 = contactSearchAndSelectModalView.f48076p;
        if (listView2 == null) {
            Intrinsics.r("listView");
            throw null;
        }
        dr.k kVar5 = contactSearchAndSelectModalView.f48074n;
        if (kVar5 == null) {
            Intrinsics.r("adapter");
            throw null;
        }
        listView2.setAdapter((ListAdapter) kVar5);
        dr.k kVar6 = contactSearchAndSelectModalView.f48074n;
        if (kVar6 != null) {
            kVar6.h();
            return contactSearchAndSelectModalView;
        }
        Intrinsics.r("adapter");
        throw null;
    }

    public static final void S(d0 pinalytics, w eventManager, de1.t productFilterModalContainer) {
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(productFilterModalContainer, "productFilterModalContainer");
        pinalytics.X(u0.FILTER_BUTTON);
        eventManager.d(new v(productFilterModalContainer, false, 0L, 30));
    }

    public static final HashMap T(int i13, String str, String str2) {
        HashMap x13 = a.a.x("pin_id", str, "source", "product_tag");
        if (str2 != null) {
        }
        u uVar = new u();
        uVar.u("product_pin_id", str);
        uVar.s(Integer.valueOf(i13), "STORY_PIN_PAGE_INDEX");
        x13.put("commerce_data", uVar.toString());
        return x13;
    }

    public static boolean U(ei2.v vVar, String str, long j13, long j14, oi2.b bVar, c0 c0Var, boolean z13, Map map, List list, ErrorCode errorCode, int i13) {
        return vVar.g(str, j13, j14, oi2.a.NONE, (i13 & 16) != 0 ? null : bVar, (i13 & 32) != 0 ? xf2.c.f134850d : c0Var, (i13 & 64) != 0, (i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? false : z13, (i13 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? z0.d() : map, (i13 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? q0.f80391a : list, (i13 & 1024) != 0 ? null : errorCode);
    }

    public static void V(long[] jArr, long[] jArr2) {
        long j13 = jArr[0];
        long j14 = jArr[1];
        long j15 = jArr[2];
        long j16 = jArr[3];
        long j17 = jArr[4];
        long j18 = jArr[5];
        long j19 = jArr[6];
        long j23 = j17 ^ (j19 >>> 50);
        long j24 = (j16 ^ ((j19 >>> 1) ^ (j19 << 14))) ^ (j18 >>> 50);
        long j25 = j13 ^ (j23 << 63);
        long j26 = (j14 ^ (j18 << 63)) ^ ((j23 >>> 1) ^ (j23 << 14));
        long j27 = ((j15 ^ (j19 << 63)) ^ ((j18 >>> 1) ^ (j18 << 14))) ^ (j23 >>> 50);
        long j28 = j24 >>> 1;
        jArr2[0] = (j25 ^ j28) ^ (j28 << 15);
        jArr2[1] = (j24 >>> 50) ^ j26;
        jArr2[2] = j27;
        jArr2[3] = 1 & j24;
    }

    public static void W() {
        r61.b.f106334d = UUID.randomUUID().toString();
    }

    public static final Collection X(Collection collection, Function1 descriptorByHandle) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(descriptorByHandle, "descriptorByHandle");
        if (collection.size() <= 1) {
            return collection;
        }
        LinkedList linkedList = new LinkedList(collection);
        wn2.i iVar = new wn2.i();
        while (!linkedList.isEmpty()) {
            Object S = CollectionsKt.S(linkedList);
            wn2.i iVar2 = new wn2.i();
            ArrayList h10 = bn2.o.h(S, linkedList, descriptorByHandle, new cd2.n(iVar2, 13));
            Intrinsics.checkNotNullExpressionValue(h10, "extractMembersOverridableInBothWays(...)");
            if (h10.size() == 1 && iVar2.isEmpty()) {
                Object r03 = CollectionsKt.r0(h10);
                Intrinsics.checkNotNullExpressionValue(r03, "single(...)");
                iVar.add(r03);
            } else {
                Object u13 = bn2.o.u(h10, descriptorByHandle);
                Intrinsics.checkNotNullExpressionValue(u13, "selectMostSpecificMember(...)");
                am2.b bVar = (am2.b) descriptorByHandle.invoke(u13);
                Iterator it = h10.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    Intrinsics.f(next);
                    if (!bn2.o.m(bVar, (am2.b) descriptorByHandle.invoke(next))) {
                        iVar2.add(next);
                    }
                }
                if (!iVar2.isEmpty()) {
                    iVar.addAll(iVar2);
                }
                iVar.add(u13);
            }
        }
        return iVar;
    }

    public static final void Y(TextView view, float f13) {
        Intrinsics.checkNotNullParameter(view, "view");
        int i13 = ((int) f13) * 2;
        view.setShadowLayer(f13, 0.0f, 0.0f, 0);
        view.setPaddingRelative(i13, 0, i13, 0);
    }

    public static final void Z(g1 trackingDataProvider, boolean z13, String str, ta2.a aVar, View view) {
        Intrinsics.checkNotNullParameter(trackingDataProvider, "trackingDataProvider");
        LegoPinGridCellImpl legoPinGridCellImpl = (LegoPinGridCellImpl) trackingDataProvider;
        f30 f30Var = legoPinGridCellImpl.C0;
        Intrinsics.f(f30Var);
        d0 d0Var = legoPinGridCellImpl.W1;
        String uniqueScreenKey = d0Var.getUniqueScreenKey();
        d0Var.b0(u0.OVERFLOW_BUTTON, h32.g0.FLOWED_PIN, f30Var.getUid(), false);
        Context context = kb0.a.f79058b;
        gs0.k w23 = ((oa) ((w0) j1.b0(w0.class, m60.f0.W()))).w2();
        nl1.d coreFragment = legoPinGridCellImpl.getCoreFragment();
        if (legoPinGridCellImpl.f52433l1 == null) {
            Intrinsics.r("baseGridActionUtils");
            throw null;
        }
        jo1.a a13 = jo1.c.a(coreFragment);
        nl1.d coreFragment2 = legoPinGridCellImpl.getCoreFragment();
        boolean H7 = coreFragment2 != null ? coreFragment2.H7() : false;
        nl1.d coreFragment3 = legoPinGridCellImpl.getCoreFragment();
        gs0.k.a(w23, f30Var, a13, false, false, null, uniqueScreenKey, H7, null, coreFragment3 != null ? coreFragment3.getK0() : null, z13, null, null, false, null, null, str, false, (aVar != null ? aVar.D() : null) == ta2.b.HAIR_PATTERN, (aVar != null ? aVar.D() : null) == ta2.b.SKIN_TONE, (aVar != null ? aVar.D() : null) == ta2.b.BODY_TYPE, aVar != null ? aVar.t6() : null, view, false, 4291736).showFeedBack();
    }

    public static final void a(rl1.q state, u2.q qVar, gm1.a aVar, i2.o oVar, int i13, int i14) {
        Intrinsics.checkNotNullParameter(state, "state");
        i2.s sVar = (i2.s) oVar;
        sVar.Y(1424891603);
        if ((i14 & 2) != 0) {
            qVar = u2.n.f120041b;
        }
        if ((i14 & 4) != 0) {
            aVar = null;
        }
        androidx.compose.ui.viewinterop.a.a(new hm1.b(((Number) sVar.m(fc0.k.f61712a)).intValue(), aVar, 0), qVar, new com.pinterest.framework.screens.q(15, state, aVar), sVar, i13 & RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER, 0);
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new k31.h(i13, i14, 6, qVar, state, aVar);
        }
    }

    public static void a0(int i13, long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[8];
        G(jArr, jArr3);
        V(jArr3, jArr2);
        while (true) {
            i13--;
            if (i13 <= 0) {
                return;
            }
            G(jArr2, jArr3);
            V(jArr3, jArr2);
        }
    }

    public static final void b(v21.c0 viewModel, u2.q qVar, i2.o oVar, int i13, int i14) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        i2.s sVar = (i2.s) oVar;
        sVar.Y(2086301422);
        if ((i14 & 2) != 0) {
            qVar = u2.n.f120041b;
        }
        q1 y13 = bs1.c.y(viewModel.f123871f.d(), new v21.c(null, 63), null, sVar, 72, 2);
        l82.c e13 = viewModel.f123871f.e();
        u2.q j13 = qVar.j(androidx.compose.foundation.layout.e.f17184c);
        fc0.g gVar = (fc0.g) ((fc0.f) sVar.m(fc0.h.f61707g));
        int i15 = gVar.f61695a;
        androidx.compose.foundation.layout.b.a(androidx.compose.foundation.a.b(j13, gVar.f61696b, s0.f21349a), null, false, q2.i.c(-518210236, new n1(13, e13, y13), sVar), sVar, 3072, 6);
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new q1.l(i13, i14, 28, viewModel, qVar);
        }
    }

    public static ei2.q b0(ei2.v vVar, String name, oi2.a autoTerminationMode, oi2.b bVar, Long l13, c0 type, boolean z13, boolean z14) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(autoTerminationMode, "autoTerminationMode");
        Intrinsics.checkNotNullParameter(type, "type");
        ei2.q c13 = vVar.c(type, autoTerminationMode, bVar, name, z13, z14);
        if (c13 == null || !((ei2.k) c13).r(l13)) {
            return null;
        }
        return c13;
    }

    public static final void c(List list, u2.q qVar, i2.o oVar, int i13, int i14) {
        i2.s sVar = (i2.s) oVar;
        sVar.Y(789344936);
        if ((i14 & 2) != 0) {
            qVar = u2.n.f120041b;
        }
        androidx.compose.foundation.layout.b.a(qVar, null, false, q2.i.c(-1914443266, new i1.h(list, 17), sVar), sVar, ((i13 >> 3) & 14) | 3072, 6);
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new tc0.z(list, qVar, i13, i14, 2);
        }
    }

    public static /* synthetic */ ei2.q c0(ei2.v vVar, String str, oi2.a aVar, oi2.b bVar, Long l13, c0 c0Var, int i13) {
        if ((i13 & 2) != 0) {
            aVar = oi2.a.NONE;
        }
        oi2.a aVar2 = aVar;
        if ((i13 & 4) != 0) {
            bVar = null;
        }
        oi2.b bVar2 = bVar;
        if ((i13 & 16) != 0) {
            c0Var = xf2.c.f134850d;
        }
        return vVar.h(str, aVar2, bVar2, l13, c0Var, (i13 & 32) != 0, false);
    }

    public static final void d(u2.q qVar, i2.o oVar, int i13, int i14) {
        u2.q qVar2;
        int i15;
        i2.s sVar;
        i2.s sVar2 = (i2.s) oVar;
        sVar2.Y(-1058703118);
        int i16 = i14 & 1;
        int i17 = 4;
        if (i16 != 0) {
            i15 = i13 | 6;
            qVar2 = qVar;
        } else if ((i13 & 14) == 0) {
            qVar2 = qVar;
            i15 = (sVar2.h(qVar2) ? 4 : 2) | i13;
        } else {
            qVar2 = qVar;
            i15 = i13;
        }
        if ((i15 & 11) == 2 && sVar2.z()) {
            sVar2.Q();
            sVar = sVar2;
        } else {
            u2.q qVar3 = i16 != 0 ? u2.n.f120041b : qVar2;
            ac.p p03 = gh0.b.p0(new ac.q(db0.e.pin_or_spin_lottie_confetti), null, sVar2, 62);
            ac.b f13 = e0.t.f((com.airbnb.lottie.h) p03.getValue(), 1, sVar2, 958);
            com.airbnb.lottie.h hVar = (com.airbnb.lottie.h) p03.getValue();
            sVar2.W(1677429798);
            boolean h10 = sVar2.h(f13);
            Object J2 = sVar2.J();
            if (h10 || J2 == i2.n.f71185a) {
                J2 = new i1(f13, i17);
                sVar2.g0(J2);
            }
            sVar2.r(false);
            sVar = sVar2;
            ph.a.a(hVar, (Function0) J2, d7.b.I0(qVar3, 5.0f), false, false, false, null, false, null, q3.m.f102246a, false, false, null, null, false, sVar, 8, 6, 64504);
            qVar2 = qVar3;
        }
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new w1.c(qVar2, i13, i14, 7);
        }
    }

    public static final y d0(u0 u0Var, Function1 function1) {
        return new y(f1.TAP, u0Var, new r1.k(3, function1));
    }

    public static final void e(String str, u2.q qVar, i2.o oVar, int i13, int i14) {
        int i15;
        u2.q qVar2;
        i2.s sVar = (i2.s) oVar;
        sVar.Y(-1169202810);
        if ((i14 & 1) != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 14) == 0) {
            i15 = (sVar.h(str) ? 4 : 2) | i13;
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
            qVar2 = qVar;
        } else {
            u2.q qVar3 = i16 != 0 ? u2.n.f120041b : qVar;
            dl2.b.h(str, qVar3, null, null, sVar, (i15 & 14) | (i15 & RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER), 12);
            qVar2 = qVar3;
        }
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new tc0.h(str, qVar2, i13, i14, 2);
        }
    }

    public static final LinkedHashMap e0(Map map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getValue() != null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    public static final void f(u50.r rVar, u2.q qVar, i2.o oVar, int i13, int i14) {
        i2.s sVar = (i2.s) oVar;
        sVar.Y(641015194);
        int i15 = i14 & 2;
        u2.n nVar = u2.n.f120041b;
        u2.q qVar2 = i15 != 0 ? nVar : qVar;
        u2.q p13 = androidx.compose.foundation.layout.b.p(androidx.compose.foundation.layout.e.d(androidx.compose.foundation.layout.e.b(qVar2, 1.0f), com.bumptech.glide.d.A(db0.a.toolbar_min_height, sVar), Float.NaN), 0.0f, com.bumptech.glide.d.A(db0.a.reward_page_medium_paddings, sVar), 1);
        p0 e13 = p1.q.e(u2.b.f120017e, false);
        int i16 = sVar.P;
        z1 o13 = sVar.o();
        u2.q X = m0.X(sVar, p13);
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
        s3.h hVar = s3.j.f110801e;
        tb.f.f0(sVar, e13, hVar);
        s3.h hVar2 = s3.j.f110800d;
        tb.f.f0(sVar, o13, hVar2);
        s3.h hVar3 = s3.j.f110802f;
        if (sVar.O || !Intrinsics.d(sVar.J(), Integer.valueOf(i16))) {
            ep.b.y(i16, sVar, i16, hVar3);
        }
        s3.h hVar4 = s3.j.f110799c;
        tb.f.f0(sVar, X, hVar4);
        u2.q b13 = androidx.compose.foundation.layout.e.b(nVar, 1.0f);
        e1 a13 = c1.a(p1.l.f98543a, u2.b.f120023k, sVar, 48);
        int i17 = sVar.P;
        z1 o14 = sVar.o();
        u2.q X2 = m0.X(sVar, b13);
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
        tb.f.f0(sVar, a13, hVar);
        tb.f.f0(sVar, o14, hVar2);
        if (sVar.O || !Intrinsics.d(sVar.J(), Integer.valueOf(i17))) {
            ep.b.y(i17, sVar, i17, hVar3);
        }
        tb.f.f0(sVar, X2, hVar4);
        ig1.b.b(new om1.c(rm1.q.CANCEL, om1.e.MD, om1.f.TRANSPARENT_DARK_GRAY, null, null, false, 0, 1016), androidx.compose.foundation.layout.b.p(nVar, com.bumptech.glide.d.A(db0.a.reward_page_medium_paddings, sVar), 0.0f, 2), new p70.a(rVar, 16), sVar, 8, 0);
        sVar.r(true);
        sVar.r(true);
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new u21.r(rVar, qVar2, i13, i14, 1);
        }
    }

    public static final void f0() {
        throw new UnsupportedOperationException();
    }

    public static final View g(View view) {
        if (!hf0.b.q()) {
            return view;
        }
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Intrinsics.checkNotNullParameter(context, "context");
        RoundedCornersLayout roundedCornersLayout = new RoundedCornersLayout(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(roundedCornersLayout.getResources().getDimensionPixelOffset(nz1.a.business_profile_tablet_cover_media_width), roundedCornersLayout.getResources().getDimensionPixelOffset(nz1.a.business_profile_tablet_cover_media_height));
        layoutParams.gravity = 81;
        com.bumptech.glide.c.a1(layoutParams, 0, roundedCornersLayout.getResources().getDimensionPixelOffset(nz1.a.business_profile_tablet_cover_media_margin_top), 0, 0);
        int i13 = eo1.b.color_themed_background_default;
        Object obj = d5.a.f53679a;
        roundedCornersLayout.a(context.getColor(i13));
        roundedCornersLayout.setLayoutParams(layoutParams);
        int dimensionPixelOffset = roundedCornersLayout.getResources().getDimensionPixelOffset(nz1.a.business_profile_tablet_cover_media_corner_radius);
        roundedCornersLayout.g(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
        roundedCornersLayout.addView(view);
        return roundedCornersLayout;
    }

    public static final j0 h(k0 k0Var, String str) {
        r72.g gVar = k0Var.f106518f;
        if (!Intrinsics.d(gVar.f106503a, str)) {
            gVar = null;
        }
        if (gVar != null) {
            return gVar;
        }
        i0 i0Var = k0Var.f106519g;
        if (!Intrinsics.d(i0Var.f106503a, str)) {
            i0Var = null;
        }
        if (i0Var != null) {
            return i0Var;
        }
        r72.n nVar = k0Var.f106520h;
        if (!Intrinsics.d(nVar.f106503a, str)) {
            nVar = null;
        }
        if (nVar != null) {
            return nVar;
        }
        r72.s sVar = k0Var.f106521i;
        return Intrinsics.d(sVar.a(), str) ? sVar : null;
    }

    public static final void i(LinkedHashMap linkedHashMap, String str, Function1 function1) {
        l0 l0Var = new l0(str);
        Object obj = linkedHashMap.get(l0Var);
        if (obj == null) {
            obj = new LinkedHashMap();
            linkedHashMap.put(l0Var, obj);
        }
        function1.invoke(obj);
    }

    public static void j(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
        jArr3[5] = jArr[5] ^ jArr2[5];
        jArr3[6] = jArr2[6] ^ jArr[6];
    }

    public static void k(vf2.b bVar, xf2.q0 schemaType, si2.g severity, String message, boolean z13, Long l13, int i13) {
        if ((i13 & 8) != 0) {
            z13 = false;
        }
        boolean z14 = (i13 & 16) != 0;
        String str = null;
        if ((i13 & 32) != 0) {
            l13 = null;
        }
        bVar.getClass();
        Intrinsics.checkNotNullParameter(schemaType, "schemaType");
        Intrinsics.checkNotNullParameter(severity, "severity");
        Intrinsics.checkNotNullParameter(message, "message");
        si2.c builder = bVar.f125776a.a().t(message).H(severity).r(vf2.a.f125775a[severity.ordinal()] == 1 ? "WARNING" : severity.name()).x(l13 != null ? l13.longValue() : bVar.f125779d.now(), TimeUnit.MILLISECONDS);
        builder.o(tj2.d.f117929a, kh2.d.x());
        if (z14) {
            ai2.a aVar = ((ai2.c) bVar.f125777b).f15252d;
            if (aVar != null) {
                Intrinsics.checkNotNullExpressionValue(builder, "builder");
                ri2.e attributeKey = tj2.f.f117934a;
                Intrinsics.checkNotNullExpressionValue(attributeKey, "SESSION_ID");
                String value = aVar.f15247a;
                Set set = ei2.d.f58969a;
                Intrinsics.checkNotNullParameter(builder, "<this>");
                Intrinsics.checkNotNullParameter(attributeKey, "attributeKey");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!o.D(value)) {
                    builder.o(attributeKey, value);
                }
                str = aVar.f15248b ? "foreground" : "background";
            }
            ri2.e eVar = sh2.h.f112957f.f134856b;
            if (str == null) {
                str = ((bi2.e) bVar.f125778c).f22899g ? "background" : "foreground";
            }
            builder.o(eVar, str);
        }
        if (z13) {
            Intrinsics.checkNotNullExpressionValue(builder, "builder");
            xf2.k0 fixedAttribute = xf2.k0.f134870a;
            Set set2 = ei2.d.f58969a;
            Intrinsics.checkNotNullParameter(builder, "<this>");
            Intrinsics.checkNotNullParameter(fixedAttribute, "fixedAttribute");
            builder.o(fixedAttribute.getKey().f134856b, fixedAttribute.getValue());
        }
        Intrinsics.checkNotNullExpressionValue(builder, "builder");
        c0 fixedAttribute2 = schemaType.f134889a;
        Set set3 = ei2.d.f58969a;
        Intrinsics.checkNotNullParameter(builder, "<this>");
        Intrinsics.checkNotNullParameter(fixedAttribute2, "fixedAttribute");
        builder.o(fixedAttribute2.getKey().f134856b, fixedAttribute2.getValue());
        for (Map.Entry entry : z0.j(schemaType.a(), schemaType.f134891c).entrySet()) {
            builder.o(ri2.e.a(qi2.c.STRING, (String) entry.getKey()), entry.getValue());
        }
        builder.n();
    }

    public static final ro2.l l(po2.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        ro2.l lVar = cVar instanceof ro2.l ? (ro2.l) cVar : null;
        if (lVar != null) {
            return lVar;
        }
        throw new IllegalStateException(cb.n(kotlin.jvm.internal.k0.f80436a, cVar.getClass(), new StringBuilder("This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got ")));
    }

    public static final ro2.t m(po2.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        ro2.t tVar = dVar instanceof ro2.t ? (ro2.t) dVar : null;
        if (tVar != null) {
            return tVar;
        }
        throw new IllegalStateException(cb.n(kotlin.jvm.internal.k0.f80436a, dVar.getClass(), new StringBuilder("This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got ")));
    }

    public static final void n(GestaltSelectList gestaltSelectList, Function1 init) {
        Intrinsics.checkNotNullParameter(gestaltSelectList, "<this>");
        Intrinsics.checkNotNullParameter(init, "init");
        com.google.firebase.messaging.q qVar = gestaltSelectList.f49559a;
        fn1.o oVar = new fn1.o((fn1.b) ((u50.o) qVar.f33803a));
        init.invoke(oVar);
        an1.i nextState = new an1.i(oVar, 7);
        Intrinsics.checkNotNullParameter(nextState, "nextState");
    }

    public static v61.a o(String str, String str2) {
        List V;
        String str3;
        int parseInt = (str == null || (V = StringsKt.V(str, new char[]{':'})) == null || (str3 = (String) CollectionsKt.U(1, V)) == null) ? v61.a.f124201i.f124212e : Integer.parseInt(str3);
        v61.a q13 = q(parseInt);
        if (str2 == null || str2.length() == 0) {
            str2 = q13.f124213f;
        }
        String str4 = str2;
        int i13 = q13.f124208a;
        String upperCase = str4.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        return new v61.a(i13, q13.f124209b, q13.f124210c, parseInt, upperCase, str4, 0, RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER);
    }

    public static v61.a p(String apiTerm) {
        Intrinsics.checkNotNullParameter(apiTerm, "apiTerm");
        String str = (String) CollectionsKt.U(1, StringsKt.V(apiTerm, new char[]{':'}));
        if (str == null) {
            return v61.a.f124201i;
        }
        v61.a aVar = v61.a.f124201i;
        return q(Integer.parseInt(str));
    }

    public static v61.a q(int i13) {
        v61.a aVar = v61.a.f124201i;
        List j13 = f0.j(aVar, v61.a.f124202j, v61.a.f124203k, v61.a.f124204l, v61.a.f124205m, v61.a.f124206n, v61.a.f124207o);
        return (i13 < 0 || i13 >= j13.size()) ? aVar : (v61.a) j13.get(i13);
    }

    public static final z9.p r(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        z9.p pVar = (z9.p) yn2.c0.l(yn2.c0.q(x.e(view, z9.b.f141155s), z9.b.f141156t));
        if (pVar != null) {
            return pVar;
        }
        throw new IllegalStateException("View " + view + " does not have a NavController set");
    }

    public static final void s(SpannableStringBuilder strBuilder, Context context, Integer num, d0 pinalytics) {
        int color;
        Intrinsics.checkNotNullParameter(strBuilder, "strBuilder");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        String spanString = strBuilder.toString();
        Intrinsics.checkNotNullExpressionValue(spanString, "toString(...)");
        Intrinsics.checkNotNullParameter(spanString, "spanString");
        ArrayList arrayList = new ArrayList();
        Matcher matcher = com.pinterest.ui.text.e.f52660a.matcher(spanString);
        while (matcher.find()) {
            arrayList.add(new com.pinterest.ui.text.d(matcher.start(), matcher.end()));
        }
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                com.pinterest.ui.text.d dVar = (com.pinterest.ui.text.d) it.next();
                if (num != null) {
                    color = num.intValue();
                } else {
                    int i13 = eo1.b.color_themed_text_default;
                    Object obj = d5.a.f53679a;
                    color = context.getColor(i13);
                }
                strBuilder.setSpan(new com.pinterest.ui.text.c(color, h32.g0.PIN_STORY_PIN_PAGE, u0.PIN_STORY_PIN_HASHTAG, pinalytics), dVar.f52658a, dVar.f52659b, 33);
            }
        }
    }

    public static i91.b t() {
        return i91.b.f71797d;
    }

    public static lh0.a0 u() {
        if (lh0.a0.f83292b == null) {
            lh0.a0.f83293c.invoke();
            lh0.c cVar = lh0.c.f83308l;
            Intrinsics.checkNotNullParameter(cVar, "<set-?>");
            lh0.a0.f83293c = cVar;
        }
        lh0.a0 a0Var = lh0.a0.f83292b;
        if (a0Var != null) {
            return a0Var;
        }
        Intrinsics.r("INSTANCE");
        throw null;
    }

    public static final r72.j1 v(String maskBounds) {
        Intrinsics.checkNotNullParameter(maskBounds, "$this$maskBounds");
        Path J2 = k3.J(maskBounds);
        RectF rectF = new RectF();
        J2.computeBounds(rectF, true);
        return new r72.j1(rectF.left, rectF.top, rectF.width(), rectF.height());
    }

    public static final de1.t w(de1.c cVar, zd1.o filterManager, nx.f0 pinalyticsFactory, d4 viewType, uj2.q networkStateStream, Resources resources, Resources.Theme theme, String str) {
        Intrinsics.checkNotNullParameter(filterManager, "filterManager");
        Intrinsics.checkNotNullParameter(pinalyticsFactory, "pinalyticsFactory");
        Intrinsics.checkNotNullParameter(viewType, "viewType");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(theme, "theme");
        Intrinsics.checkNotNullParameter(pinalyticsFactory, "pinalyticsFactory");
        Intrinsics.checkNotNullParameter(viewType, "viewType");
        de1.t listener = new de1.t(cVar, new n70.o(pinalyticsFactory, viewType), networkStateStream, "", new yk1.a(resources, theme), false, str, 160);
        zd1.p source = zd1.p.PRODUCT_FILTER_SOURCE_VIRTUAL_TRY_ON;
        Intrinsics.checkNotNullParameter(source, "source");
        listener.f54657m = source;
        filterManager.getClass();
        Intrinsics.checkNotNullParameter(listener, "listener");
        filterManager.f141742f = listener;
        return listener;
    }

    public static final String y(ArrayList standardListFilters) {
        Intrinsics.checkNotNullParameter(standardListFilters, "standardListFilters");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : standardListFilters) {
            zd1.v vVar = (zd1.v) obj;
            if (Intrinsics.d(vVar.f141772g, "brand_name_filters") && vVar.f141771f) {
                arrayList2.add(obj);
            }
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((zd1.v) it.next()).f141769d));
        }
        return CollectionsKt.Z(arrayList, null, null, null, 0, null, null, 63);
    }

    public static final String z(ArrayList standardListFilters) {
        Intrinsics.checkNotNullParameter(standardListFilters, "standardListFilters");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : standardListFilters) {
            zd1.v vVar = (zd1.v) obj;
            if (Intrinsics.d(vVar.f141772g, "price_bucket_filters") && vVar.f141771f) {
                arrayList2.add(obj);
            }
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((zd1.v) it.next()).f141769d));
        }
        return CollectionsKt.Z(arrayList, null, null, null, 0, null, null, 63);
    }
}
