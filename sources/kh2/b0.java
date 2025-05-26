package kh2;

import a.cb;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.opengl.GLES20;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.SpannableString;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import androidx.compose.foundation.BorderModifierNodeElement;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.pinterest.activity.create.PinItActivity;
import com.pinterest.activity.sendapin.model.SendableObject;
import com.pinterest.api.model.aq0;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.e30;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.lh0;
import com.pinterest.api.model.q11;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.wy0;
import com.pinterest.api.model.wz;
import com.pinterest.api.model.zs;
import com.pinterest.component.avatarpairs.AvatarPairUpdate;
import com.pinterest.feature.core.view.EmptyView;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.minicell.view.PinMiniCellView;
import com.pinterest.feature.todaytab.tab.view.TodayTabCustomCoverModule;
import com.pinterest.feature.todaytab.tab.view.TodayTabHeroModule;
import com.pinterest.feature.todaytab.tab.view.TodayTabSingleCreatorModule;
import com.pinterest.feature.todaytab.tab.view.TodayTabSingleVideoModule;
import com.pinterest.feature.todaytab.tab.view.TodayTabThreePinsCollectionModule;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.gestalt.avatargroup.GestaltAvatarGroup;
import com.pinterest.gestalt.buttonSocial.GestaltButtonSocial;
import com.pinterest.gestalt.headerBar.GestaltHeaderBar;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.popoverMessage.GestaltPopoverMessage;
import com.pinterest.gestalt.tabs.GestaltTabLayout;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import h32.d4;
import i2.v3;
import i2.y3;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.Serializable;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import lh0.l4;
import net.quikkly.android.utils.BitmapUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import s80.b7;
import s80.f4;
import s80.f7;
import s80.w6;
import s80.y6;
import s80.z6;
import so.r8;
import so.tb;
import so.u3;
import so.x3;
import so.z3;

/* loaded from: classes4.dex */
public abstract class b0 {

    /* renamed from: a */
    public static boolean f79438a;

    public static long A(int i13, byte[] bArr) {
        return (((bArr[i13 + 3] & 255) << 24) | (bArr[i13] & 255) | ((bArr[i13 + 1] & 255) << 8) | ((bArr[i13 + 2] & 255) << 16)) & 4294967295L;
    }

    public static void A0(bb1.i iVar, cr1.a aVar) {
        iVar.f22510k0 = aVar;
    }

    public static final boolean A1(f30 f30Var) {
        Boolean Q4 = f30Var.Q4();
        Intrinsics.checkNotNullExpressionValue(Q4, "getIsEligibleForRelatedProducts(...)");
        return (!Q4.booleanValue() || b40.N0(f30Var) || b40.I0(f30Var)) ? false : true;
    }

    public static void B(int i13) {
        if (i13 != 16 && i13 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i13 * 8)));
        }
    }

    public static void B0(q91.d1 d1Var, mr1.a aVar) {
        d1Var.f103091k0 = aVar;
    }

    public static final boolean B1(f30 f30Var) {
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        return (f30Var.n5().booleanValue() || !A1(f30Var) || b40.W0(f30Var)) ? false : true;
    }

    public static void C(long j13, int i13, byte[] bArr) {
        int i14 = 0;
        while (i14 < 4) {
            bArr[i13 + i14] = (byte) (255 & j13);
            i14++;
            j13 >>= 8;
        }
    }

    public static void C0(PinMiniCellView pinMiniCellView, b60.b bVar) {
        pinMiniCellView.f46770p = bVar;
    }

    public static final void C1(Fragment fragment, androidx.lifecycle.r lifecycleState, Function2 collection) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(lifecycleState, "lifecycleState");
        Intrinsics.checkNotNullParameter(collection, "collection");
        androidx.lifecycle.z viewLifecycleOwner = fragment.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        kotlin.jvm.internal.j.z(bf.b.S(viewLifecycleOwner), null, null, new x52.q(fragment, lifecycleState, collection, null), 3);
    }

    public static void D(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr.length != 32) {
            throw new IllegalArgumentException("The key length in bytes must be 32.");
        }
        byte b13 = 0;
        long A = A(0, bArr) & 67108863;
        long A2 = (A(3, bArr) >> 2) & 67108611;
        long A3 = (A(6, bArr) >> 4) & 67092735;
        long A4 = (A(9, bArr) >> 6) & 66076671;
        long A5 = (A(12, bArr) >> 8) & 1048575;
        long j13 = A2 * 5;
        long j14 = A3 * 5;
        long j15 = A4 * 5;
        long j16 = A5 * 5;
        int i13 = 17;
        byte[] bArr4 = new byte[17];
        long j17 = 0;
        int i14 = 0;
        long j18 = 0;
        long j19 = 0;
        long j23 = 0;
        long j24 = 0;
        while (i14 < bArr2.length) {
            int min = Math.min(16, bArr2.length - i14);
            System.arraycopy(bArr2, i14, bArr4, b13, min);
            bArr4[min] = 1;
            if (min != 16) {
                Arrays.fill(bArr4, min + 1, i13, b13);
            }
            long A6 = j24 + (A(b13, bArr4) & 67108863);
            long A7 = j19 + ((A(3, bArr4) >> 2) & 67108863);
            long A8 = j18 + ((A(6, bArr4) >> 4) & 67108863);
            long A9 = j17 + ((A(9, bArr4) >> 6) & 67108863);
            long A10 = j23 + (((A(12, bArr4) >> 8) & 67108863) | (bArr4[16] << 24));
            long j25 = (A10 * j13) + (A9 * j14) + (A8 * j15) + (A7 * j16) + (A6 * A);
            long j26 = (A10 * j14) + (A9 * j15) + (A8 * j16) + (A7 * A) + (A6 * A2);
            long j27 = (A10 * j15) + (A9 * j16) + (A8 * A) + (A7 * A2) + (A6 * A3);
            long j28 = (A10 * j16) + (A9 * A) + (A8 * A2) + (A7 * A3) + (A6 * A4);
            long j29 = A9 * A2;
            long j33 = A10 * A;
            long j34 = j26 + (j25 >> 26);
            long j35 = j27 + (j34 >> 26);
            long j36 = j28 + (j35 >> 26);
            long j37 = j33 + j29 + (A8 * A3) + (A7 * A4) + (A6 * A5) + (j36 >> 26);
            long j38 = j37 >> 26;
            j23 = j37 & 67108863;
            long j39 = (j38 * 5) + (j25 & 67108863);
            long j43 = j39 & 67108863;
            long j44 = (j34 & 67108863) + (j39 >> 26);
            i14 += 16;
            j18 = j35 & 67108863;
            j17 = j36 & 67108863;
            j19 = j44;
            j24 = j43;
            b13 = 0;
            i13 = 17;
        }
        long j45 = j18 + (j19 >> 26);
        long j46 = j45 & 67108863;
        long j47 = j17 + (j45 >> 26);
        long j48 = j47 & 67108863;
        long j49 = j23 + (j47 >> 26);
        long j53 = j49 & 67108863;
        long j54 = ((j49 >> 26) * 5) + j24;
        long j55 = j54 >> 26;
        long j56 = j54 & 67108863;
        long j57 = (j19 & 67108863) + j55;
        long j58 = j56 + 5;
        long j59 = j58 & 67108863;
        long j63 = j57 + (j58 >> 26);
        long j64 = j46 + (j63 >> 26);
        long j65 = j48 + (j64 >> 26);
        long j66 = (j53 + (j65 >> 26)) - 67108864;
        long j67 = j66 >> 63;
        long j68 = ~j67;
        long j69 = (j57 & j67) | (j63 & 67108863 & j68);
        long j73 = (j46 & j67) | (j64 & 67108863 & j68);
        long j74 = (j48 & j67) | (j65 & 67108863 & j68);
        long j75 = ((j56 & j67) | (j59 & j68) | (j69 << 26)) & 4294967295L;
        long j76 = ((j69 >> 6) | (j73 << 20)) & 4294967295L;
        long j77 = ((j73 >> 12) | (j74 << 14)) & 4294967295L;
        long j78 = ((((j66 & j68) | (j53 & j67)) << 8) | (j74 >> 18)) & 4294967295L;
        long A11 = A(16, bArr) + j75;
        long A12 = A(20, bArr) + j76 + (A11 >> 32);
        long A13 = A(24, bArr) + j77 + (A12 >> 32);
        long A14 = (A(28, bArr) + j78 + (A13 >> 32)) & 4294967295L;
        byte[] bArr5 = new byte[16];
        C(A11 & 4294967295L, 0, bArr5);
        C(A12 & 4294967295L, 4, bArr5);
        C(A13 & 4294967295L, 8, bArr5);
        C(A14, 12, bArr5);
        if (!MessageDigest.isEqual(bArr5, bArr3)) {
            throw new GeneralSecurityException("invalid MAC");
        }
    }

    public static void D0(q71.v0 v0Var, vy.m mVar) {
        v0Var.W0 = mVar;
    }

    public static final void D1(Fragment fragment, Function2 collection) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(collection, "collection");
        androidx.lifecycle.z viewLifecycleOwner = fragment.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        kotlin.jvm.internal.j.z(bf.b.S(viewLifecycleOwner), null, null, new wa0.b(fragment, collection, null), 3);
    }

    public static final qa2.n E(Context context, nx.d0 d0Var) {
        y32.f fVar = y32.f.UNKNOWN;
        return new qa2.n(new b20.c(wa2.i.a(new qa2.f(d0Var, fVar, (nr0.b) null, 12).a(new yk1.a(context.getResources(), context.getTheme())).f103320a, false, false, true, true, false, true, false, null, null, null, fVar, 2074607354, -16779266, 1013), 0));
    }

    public static void E0(ly0.d dVar, oc.c cVar) {
        dVar.f85122o0 = cVar;
    }

    public static final ku1.b F(String str) {
        if (!kotlin.text.z.p(str, "pinterest://", false)) {
            str = null;
        }
        if (str == null) {
            return null;
        }
        String substring = str.substring(12);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        if (substring == null) {
            return null;
        }
        if (Intrinsics.d(substring, "settings")) {
            return new ku1.b((ScreenLocation) com.pinterest.screens.w1.M.getValue());
        }
        if (Intrinsics.d(substring, "notifications")) {
            return new ku1.b((ScreenLocation) com.pinterest.screens.w1.E.getValue());
        }
        return null;
    }

    public static void F0(PinItActivity pinItActivity, lu1.b bVar) {
        pinItActivity.f34921f = bVar;
    }

    public static final int F1(int i13, String str) {
        int[] iArr = new int[1];
        int glCreateShader = GLES20.glCreateShader(i13);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        throw new RuntimeException("Could not load shader");
    }

    public static final f30 G(f30 f30Var, v32.c cVar, boolean z13) {
        v32.c O = b40.O(f30Var);
        if (O == cVar) {
            return f30Var;
        }
        e30 R6 = f30Var.R6();
        Intrinsics.checkNotNullExpressionValue(R6, "toBuilder(...)");
        R6.R1(Integer.valueOf(cVar.getValue()));
        Map c63 = f30Var.c6();
        if (c63 == null) {
            c63 = new LinkedHashMap();
        }
        v32.c cVar2 = v32.c.NONE;
        if (cVar != cVar2) {
            String valueOf = String.valueOf(cVar.getValue());
            Integer num = (Integer) c63.get(valueOf);
            c63.put(valueOf, Integer.valueOf((num != null ? num.intValue() : 0) + 1));
            Integer num2 = R6.S2;
            if (num2 == null) {
                num2 = 0;
            }
            R6.t2(Integer.valueOf(Math.max(num2.intValue(), 0) + 1));
        }
        if (O != cVar2) {
            String valueOf2 = String.valueOf(O.getValue());
            Integer num3 = (Integer) c63.get(valueOf2);
            c63.put(valueOf2, Integer.valueOf(Math.max((num3 != null ? num3.intValue() : 1) - 1, 0)));
            Integer num4 = R6.S2;
            if (num4 == null) {
                num4 = 1;
            }
            R6.t2(Integer.valueOf(num4.intValue() - 1));
        }
        R6.S1(c63);
        f30 a13 = R6.a();
        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
        m60.w wVar = m60.u.f85943a;
        String uid = a13.getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
        wVar.d(new ls1.o(uid, b40.e0(a13), b40.P(a13), b40.O(a13), z13));
        return a13;
    }

    public static void G0(q71.v0 v0Var, lh0.o oVar) {
        v0Var.Z0 = oVar;
    }

    public static final void G1(View view) {
        ig1.b.M0(false, view, true, view != null ? view.getContext() : null, false, false, true);
    }

    public static void H(x92.b bVar) {
        bVar.h("pin.images", "236x");
        n60.o.A(bVar, "pin.images", "736x", "pin.id", "pin.tracked_link");
    }

    public static void H0(q71.v0 v0Var, g70.h hVar) {
        v0Var.f102777c1 = hVar;
    }

    public static final ArrayList H1(LinkedHashMap linkedHashMap, Function1 isArgumentMissing) {
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        Intrinsics.checkNotNullParameter(isArgumentMissing, "isArgumentMissing");
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            z9.g gVar = (z9.g) entry.getValue();
            if (gVar != null && !gVar.f141185b && !gVar.f141186c) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        Set keySet = linkedHashMap2.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : keySet) {
            if (((Boolean) isArgumentMissing.invoke((String) obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final void I(x92.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        n00.i.f88778a.a(bVar);
        bVar.e("pin.shopping_rec_disabled");
        pk.a0.b(bVar);
        bVar.e("board.board_order_modified_at");
        n60.o.w(bVar, "board.collaborator_count", "board.pin_count", "board.section_count", "board.collaborated_by_me");
        n60.o.v(bVar, "board.collaborating_users()", "board.followed_by_me", "board.image_cover_hd_url");
        n60.o.A(bVar, "board.images", "236x", "board.has_custom_cover", "board.is_collaborative");
        bVar.e("board.owner()");
        bVar.e("user.verified_identity");
    }

    public static void I0(di1.g gVar, a11.d dVar) {
        gVar.f55067p0 = dVar;
    }

    public static final void I1(k01.a aVar, j01.c modelFactory, ps.c adsPinCloseupModelAllowList) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(modelFactory, "modelFactory");
        Intrinsics.checkNotNullParameter(adsPinCloseupModelAllowList, "adsPinCloseupModelAllowList");
        k01.b closeupItem = new k01.b(modelFactory, adsPinCloseupModelAllowList);
        j01.a aVar2 = (j01.a) aVar;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(closeupItem, "closeupItem");
        aVar2.f73963a.add(closeupItem);
    }

    public static void J(Context context, Throwable th3) {
        try {
            com.bumptech.glide.d.t(context);
        } catch (Exception e13) {
            Log.e("CrashUtils", "Error adding exception to DropBox!", e13);
        }
    }

    public static void J0(PinItActivity pinItActivity, tb0.h hVar) {
        pinItActivity.f34920e = hVar;
    }

    public static Date J1(Parcel parcel) {
        long readLong = parcel.readLong();
        if (readLong != -1) {
            return new Date(readLong);
        }
        return null;
    }

    public static final void K(GestaltToolbarImpl gestaltToolbarImpl, Context context, Function0 onClick) {
        Intrinsics.checkNotNullParameter(gestaltToolbarImpl, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        View inflate = View.inflate(context, com.pinterest.partnerAnalytics.e.filter_icon, null);
        inflate.setOnClickListener(new kq1.a(2, onClick));
        gestaltToolbarImpl.c(inflate);
    }

    public static void K0(jt0.d dVar, nr0.m mVar) {
        dVar.f77578a1 = mVar;
    }

    public static Intent K1(Context context, androidx.appcompat.app.i0 i0Var, IntentFilter intentFilter, int i13) {
        return context.registerReceiver(i0Var, intentFilter, null, null, i13);
    }

    public static final void L(jh1.f fVar, rr1.h resetPasswordData) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Intrinsics.checkNotNullParameter(resetPasswordData, "resetPasswordData");
        Bundle bundle = new Bundle();
        bundle.putSerializable("EXTRA_RESET_PASSWORD_DATA", resetPasswordData);
        fVar.setArguments(bundle);
    }

    public static void L0(jt0.d dVar, lh0.r1 r1Var) {
        dVar.X0 = r1Var;
    }

    public static final void L1(Context context, String textHighlightColorHex, Integer num, TextView textView) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(textHighlightColorHex, "textHighlightColorHex");
        Intrinsics.checkNotNullParameter(textView, "textView");
        int parseColor = Color.parseColor(textHighlightColorHex);
        float f13 = 5;
        float textSize = textView.getTextSize() / f13;
        uf1.b bVar = new uf1.b(context, parseColor, num, textSize, textView.getTextSize() / f13);
        kg.p.Y(textView, textSize);
        CharSequence text = textView.getText();
        SpannableString spannableString = new SpannableString(text);
        spannableString.setSpan(bVar, 0, text.length(), 18);
        textView.setText(spannableString);
    }

    public static final void M(yq1.z zVar, sr1.g pendingSignupData) {
        Intrinsics.checkNotNullParameter(zVar, "<this>");
        Intrinsics.checkNotNullParameter(pendingSignupData, "pendingSignupData");
        Bundle bundle = new Bundle();
        bundle.putSerializable("EXTRA_PENDING_SIGNUP_DATA", pendingSignupData);
        zVar.setArguments(bundle);
    }

    public static void M0(PinItActivity pinItActivity, lh0.g1 g1Var) {
        pinItActivity.f34918c = g1Var;
    }

    public static final void M1(mm1.l lVar, int i13) {
        GestaltIconButton gestaltIconButton;
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        lVar.a8(new pn1.g(i13, 13));
        lVar.Z7(new fx1.d(true, 14));
        View view = lVar.getView();
        if (view == null || (gestaltIconButton = (GestaltIconButton) view.findViewById(hn1.t.sheet_start_button)) == null) {
            return;
        }
        gestaltIconButton.t(x52.r.f133911i);
    }

    public static final void N(GestaltAvatarGroup gestaltAvatarGroup) {
        ec0.c init = ec0.c.f58373l;
        Intrinsics.checkNotNullParameter(gestaltAvatarGroup, "<this>");
        Intrinsics.checkNotNullParameter(init, "init");
        sl1.q qVar = new sl1.q(gestaltAvatarGroup.c());
        init.invoke(qVar);
        gestaltAvatarGroup.a(new ql1.k(qVar, 4));
    }

    public static void N0(PinItActivity pinItActivity, r8 r8Var) {
        pinItActivity.f34923h = r8Var;
    }

    public static final boolean N1(f30 f30Var, wy0 wy0Var) {
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        f42.j jVar = f42.l.Companion;
        Integer P6 = f30Var.P6();
        Intrinsics.checkNotNullExpressionValue(P6, "getVirtualTryOnType(...)");
        int intValue = P6.intValue();
        jVar.getClass();
        return f42.j.a(intValue) != f42.l.NONE && d7.b.i0(wy0Var);
    }

    public static final void O(GestaltButtonSocial gestaltButtonSocial, Function1 init) {
        Intrinsics.checkNotNullParameter(gestaltButtonSocial, "<this>");
        Intrinsics.checkNotNullParameter(init, "init");
        com.google.firebase.messaging.q qVar = gestaltButtonSocial.f49327u;
        am1.h hVar = new am1.h((am1.b) ((u50.o) qVar.f33803a));
        init.invoke(hVar);
        ql1.k nextState = new ql1.k(hVar, 9);
        Intrinsics.checkNotNullParameter(nextState, "nextState");
    }

    public static void O0(yq1.s1 s1Var, il1.a aVar) {
        s1Var.D0 = aVar;
    }

    public static final bq.b O1(int i13, bq.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "default");
        bq.b bVar2 = bq.b.ALPHABETICAL;
        if (i13 != bVar2.ordinal()) {
            bVar2 = bq.b.CUSTOM;
            if (i13 != bVar2.ordinal()) {
                bVar2 = bq.b.MOST_RECENT;
                if (i13 != bVar2.ordinal()) {
                    bVar2 = bq.b.NEWEST;
                    if (i13 != bVar2.ordinal()) {
                        bVar2 = bq.b.OLDEST;
                        if (i13 != bVar2.ordinal()) {
                            return bVar;
                        }
                    }
                }
            }
        }
        return bVar2;
    }

    public static final void P(GestaltPopoverMessage gestaltPopoverMessage, Function1 init) {
        Intrinsics.checkNotNullParameter(gestaltPopoverMessage, "<this>");
        Intrinsics.checkNotNullParameter(init, "init");
        ym1.p pVar = new ym1.p(gestaltPopoverMessage.d0());
        init.invoke(pVar);
        gestaltPopoverMessage.T(new ql1.k(pVar, 28));
    }

    public static void P0(tx0.o oVar, uo.a aVar) {
        oVar.G0 = aVar;
    }

    public static final String P1(aq0 aq0Var) {
        Intrinsics.checkNotNullParameter(aq0Var, "<this>");
        int i13 = bg1.a.f22783a[aq0Var.ordinal()];
        if (i13 == 1) {
            return "left";
        }
        if (i13 == 2) {
            return "center";
        }
        if (i13 == 3) {
            return "right";
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final void Q(GestaltHeaderBar gestaltHeaderBar, t80.r nextState) {
        Intrinsics.checkNotNullParameter(gestaltHeaderBar, "<this>");
        Intrinsics.checkNotNullParameter(nextState, "nextState");
        gestaltHeaderBar.g0(new al1.j(9, nextState));
    }

    public static void Q0(yq1.s1 s1Var, tb tbVar) {
        s1Var.C0 = tbVar;
    }

    public static Bitmap Q1(View view, Integer num, int i13, int i14) {
        Canvas canvas;
        int save;
        Bitmap bitmap = null;
        if ((i14 & 1) != 0) {
            num = null;
        }
        if ((i14 & 2) != 0) {
            i13 = -1;
        }
        Intrinsics.checkNotNullParameter(view, "<this>");
        int min = i13 > 0 ? Math.min(view.getMeasuredHeight(), i13) : view.getMeasuredHeight();
        float measuredHeight = view.getMeasuredHeight() > 0 ? min / view.getMeasuredHeight() : 1.0f;
        try {
            bitmap = Bitmap.createBitmap((int) (view.getMeasuredWidth() * measuredHeight), min, Bitmap.Config.ARGB_8888);
            Intrinsics.f(bitmap);
            canvas = new Canvas(bitmap);
            if (num != null) {
                canvas.drawColor(num.intValue());
            }
            save = canvas.save();
            canvas.scale(measuredHeight, measuredHeight, 0.0f, 0.0f);
        } catch (Exception unused) {
        }
        try {
            view.draw(canvas);
            return bitmap;
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public static final kv0.u R(Context context, f30 pin, boolean z13) {
        String str;
        boolean z14;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pin, "pin");
        Integer u13 = b40.u(pin);
        if (u13 != null) {
            str = u13.intValue() == 0 ? context.getString(m60.x0.free_shipping) : context.getString(m60.x0.free_shipping_with_price, b40.t(pin));
        } else {
            str = null;
        }
        String uid = pin.getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
        String B0 = bs1.c.B0(pin);
        String s03 = df.j1.s0(pin);
        wy0 n13 = b40.n(pin);
        String Z2 = n13 != null ? n13.Z2() : null;
        wz j13 = po1.c.j(pin);
        float W = b40.W(pin);
        Integer V = b40.V(pin);
        kv0.t tVar = new kv0.t(V != null ? V.intValue() : 0, W);
        if (z13) {
            Intrinsics.checkNotNullParameter(pin, "pin");
            if (wz.a.OUT_OF_STOCK == po1.c.a(pin)) {
                z14 = true;
                return new kv0.u(uid, B0, s03, Z2, j13, tVar, str, false, z14, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN, null);
            }
        }
        z14 = false;
        return new kv0.u(uid, B0, s03, Z2, j13, tVar, str, false, z14, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN, null);
    }

    public static void R0(q71.v0 v0Var, lh0.f3 f3Var) {
        v0Var.f102776b1 = f3Var;
    }

    public static Bitmap R1(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List list2 = list;
        Iterator it = list2.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        int measuredWidth = ((View) it.next()).getMeasuredWidth();
        while (it.hasNext()) {
            int measuredWidth2 = ((View) it.next()).getMeasuredWidth();
            if (measuredWidth < measuredWidth2) {
                measuredWidth = measuredWidth2;
            }
        }
        Iterator it2 = list2.iterator();
        if (!it2.hasNext()) {
            throw new NoSuchElementException();
        }
        int measuredHeight = ((View) it2.next()).getMeasuredHeight();
        while (it2.hasNext()) {
            int measuredHeight2 = ((View) it2.next()).getMeasuredHeight();
            if (measuredHeight < measuredHeight2) {
                measuredHeight = measuredHeight2;
            }
        }
        try {
            Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
            Intrinsics.f(createBitmap);
            Canvas canvas = new Canvas(createBitmap);
            Iterator it3 = list2.iterator();
            while (it3.hasNext()) {
                ((View) it3.next()).draw(canvas);
            }
            return createBitmap;
        } catch (Exception unused) {
            return null;
        }
    }

    public static final float S(i2.o oVar) {
        i2.s sVar = (i2.s) oVar;
        sVar.W(2098652844);
        float A = com.bumptech.glide.d.A(eo1.c.rounding_600, sVar);
        sVar.r(false);
        return A;
    }

    public static void S0(di1.g gVar, l4 l4Var) {
        gVar.f55069r0 = l4Var;
    }

    public static final int S1(b22.l lVar, n context) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        return context.V(lVar);
    }

    public static final String T(Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        float max = Math.max(bitmap.getWidth() / 320.0f, bitmap.getHeight() / 320.0f);
        int width = (int) (bitmap.getWidth() / max);
        int height = (int) (bitmap.getHeight() / max);
        if (width <= 0 || height <= 0) {
            throw new IllegalStateException("Invalid bitmap size: Bitmap dimensions must be greater than zero.");
        }
        Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        canvas.drawBitmap(bitmap, new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()), new Rect(0, 0, width, height), paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OUT));
        canvas.drawPaint(paint);
        Intrinsics.checkNotNullParameter(createBitmap, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        createBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        String value = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
        Intrinsics.checkNotNullParameter(value, "value");
        return value;
    }

    public static void T0(tx0.o oVar, r8 r8Var) {
        oVar.I0 = r8Var;
    }

    public static final Path T1(int i13, int i14, String toScaledPath) {
        Intrinsics.checkNotNullParameter(toScaledPath, "$this$toScaledPath");
        Path J2 = k3.J(toScaledPath);
        Intrinsics.checkNotNullExpressionValue(J2, "createPathFromPathData(...)");
        Matrix matrix = new Matrix();
        matrix.postScale(i13, i14);
        J2.transform(matrix);
        return J2;
    }

    public static ek.e U(GestaltTabLayout tabLayout, String tabText, int i13, int i14) {
        if ((i14 & 4) != 0) {
            i13 = 0;
        }
        Intrinsics.checkNotNullParameter(tabLayout, "tabLayout");
        Intrinsics.checkNotNullParameter(tabText, "tabText");
        return df.j1.I(tabLayout, bs1.c.h2(tabText), i13, null, 16);
    }

    public static void U0(tx0.o oVar, x02.w1 w1Var) {
        oVar.H0 = w1Var;
    }

    public static final String U1(r72.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Bitmap W = W(aVar.f106432b, null);
        if (W != null) {
            float width = W.getWidth();
            r72.j1 j1Var = aVar.f106431a;
            float f13 = width / j1Var.f106508c;
            float height = W.getHeight() / j1Var.f106509d;
            String V1 = V1(W, (int) (j1Var.f106506a * f13), (int) (j1Var.f106507b * height), (int) f13, (int) height, 0, false, false, 96);
            r72.g2 g2Var = V1 != null ? new r72.g2(V1) : null;
            String str = g2Var != null ? g2Var.f106488a : null;
            if (str != null) {
                return str;
            }
        }
        int i13 = r72.g2.f106487b;
        return "M0 0H0Z";
    }

    public static ek.e V(GestaltTabLayout tabLayout, u50.k0 tabText, int i13, int i14) {
        if ((i14 & 4) != 0) {
            i13 = 0;
        }
        Intrinsics.checkNotNullParameter(tabLayout, "tabLayout");
        Intrinsics.checkNotNullParameter(tabText, "tabText");
        return df.j1.I(tabLayout, tabText, i13, null, 16);
    }

    public static void V0(tx0.o oVar, w12.b bVar) {
        oVar.F0 = bVar;
    }

    public static String V1(Bitmap bitmap, int i13, int i14, int i15, int i16, int i17, boolean z13, boolean z14, int i18) {
        int i19 = (i18 & 1) != 0 ? 0 : i13;
        int i23 = (i18 & 2) != 0 ? 0 : i14;
        if ((i18 & 4) != 0) {
            i15 = bitmap.getWidth();
        }
        int i24 = i15;
        if ((i18 & 8) != 0) {
            i16 = bitmap.getHeight();
        }
        int i25 = i16;
        if ((i18 & 32) != 0) {
            z13 = false;
        }
        if ((i18 & 64) != 0) {
            z14 = false;
        }
        Intrinsics.checkNotNullParameter(bitmap, "<this>");
        ArrayList j13 = new g01.a(bitmap, new hd2.c(i17, 1.0f, z13, z14)).j();
        if (j13.isEmpty()) {
            return null;
        }
        a72.d init = new a72.d(j13, i19, i23, i24, i25);
        Intrinsics.checkNotNullParameter(init, "init");
        b72.a aVar = new b72.a(new Matrix());
        init.invoke(aVar);
        String value = aVar.f22096b.toString();
        Intrinsics.checkNotNullExpressionValue(value, "toString(...)");
        int i26 = r72.g2.f106487b;
        Intrinsics.checkNotNullParameter(value, "value");
        return value;
    }

    public static final Bitmap W(String mask, n72.m mVar) {
        Object m13;
        Intrinsics.checkNotNullParameter(mask, "mask");
        try {
            xk2.q qVar = xk2.s.f135225b;
            byte[] decode = Base64.decode(mask, 0);
            Intrinsics.checkNotNullExpressionValue(decode, "decode(...)");
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inPreferredConfig = Bitmap.Config.ALPHA_8;
            m13 = BitmapFactory.decodeByteArray(decode, 0, decode.length, options);
        } catch (Throwable th3) {
            xk2.q qVar2 = xk2.s.f135225b;
            m13 = ue.c.m(th3);
        }
        Throwable a13 = xk2.s.a(m13);
        if (a13 != null && mVar != null) {
            mVar.f(a13);
        }
        if (m13 instanceof xk2.r) {
            m13 = null;
        }
        return (Bitmap) m13;
    }

    public static void W0(jt0.d dVar, m60.g0 g0Var) {
        dVar.Z0 = g0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, s3.j2, s3.m] */
    /* JADX WARN: Type inference failed for: r11v0, types: [androidx.compose.foundation.lazy.layout.z0] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13, types: [u2.p] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [u2.p] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [k2.e] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [k2.e] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public static final void W1(s3.j2 j2Var, androidx.compose.foundation.lazy.layout.z0 z0Var) {
        s3.j1 j1Var;
        u2.p pVar = ((u2.p) j2Var).f120042a;
        if (!pVar.f120054m) {
            throw new IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        u2.p pVar2 = pVar.f120046e;
        s3.k0 U0 = com.bumptech.glide.c.U0(j2Var);
        while (U0 != null) {
            if ((U0.f110837y.f110808e.f120045d & 262144) != 0) {
                while (pVar2 != null) {
                    if ((pVar2.f120044c & 262144) != 0) {
                        s3.n nVar = pVar2;
                        ?? r53 = 0;
                        while (nVar != 0) {
                            if (nVar instanceof s3.j2) {
                                s3.j2 j2Var2 = (s3.j2) nVar;
                                if (Intrinsics.d(j2Var.l(), j2Var2.l()) && bs1.c.l(j2Var, j2Var2) && !((Boolean) z0Var.invoke(j2Var2)).booleanValue()) {
                                    return;
                                }
                            } else if ((nVar.f120044c & 262144) != 0 && (nVar instanceof s3.n)) {
                                u2.p pVar3 = nVar.f110843o;
                                int i13 = 0;
                                nVar = nVar;
                                r53 = r53;
                                while (pVar3 != null) {
                                    if ((pVar3.f120044c & 262144) != 0) {
                                        i13++;
                                        r53 = r53;
                                        if (i13 == 1) {
                                            nVar = pVar3;
                                        } else {
                                            if (r53 == 0) {
                                                r53 = new k2.e(new u2.p[16]);
                                            }
                                            if (nVar != 0) {
                                                r53.b(nVar);
                                                nVar = 0;
                                            }
                                            r53.b(pVar3);
                                        }
                                    }
                                    pVar3 = pVar3.f120047f;
                                    nVar = nVar;
                                    r53 = r53;
                                }
                                if (i13 == 1) {
                                }
                            }
                            nVar = com.bumptech.glide.c.g(r53);
                        }
                    }
                    pVar2 = pVar2.f120046e;
                }
            }
            U0 = U0.v();
            pVar2 = (U0 == null || (j1Var = U0.f110837y) == null) ? null : j1Var.f110807d;
        }
    }

    public static final Bitmap X(int i13, int i14, Path path) {
        Intrinsics.checkNotNullParameter(path, "path");
        Bitmap createBitmap = Bitmap.createBitmap(i13, i14, Bitmap.Config.ALPHA_8);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawPath(path, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.XOR));
        canvas.drawPaint(paint);
        return createBitmap;
    }

    public static void X0(jt0.d dVar, xs0.l lVar) {
        dVar.f77579b1 = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, s3.j2] */
    /* JADX WARN: Type inference failed for: r13v0, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r7v10, types: [u2.p] */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [u2.p] */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [k2.e] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [k2.e] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public static final void X1(s3.j2 j2Var, Function1 function1) {
        u2.p pVar = ((u2.p) j2Var).f120042a;
        if (!pVar.f120054m) {
            jk.r.y("visitSubtreeIf called on an unattached node");
            throw null;
        }
        k2.e eVar = new k2.e(new u2.p[16]);
        u2.p pVar2 = pVar.f120047f;
        if (pVar2 == null) {
            com.bumptech.glide.c.e(eVar, pVar);
        } else {
            eVar.b(pVar2);
        }
        while (eVar.m()) {
            u2.p pVar3 = (u2.p) eVar.o(eVar.f78184c - 1);
            if ((pVar3.f120045d & 262144) != 0) {
                for (u2.p pVar4 = pVar3; pVar4 != null; pVar4 = pVar4.f120047f) {
                    if ((pVar4.f120044c & 262144) != 0) {
                        ?? r83 = 0;
                        s3.n nVar = pVar4;
                        while (nVar != 0) {
                            if (nVar instanceof s3.j2) {
                                s3.j2 j2Var2 = (s3.j2) nVar;
                                s3.i2 i2Var = (Intrinsics.d(j2Var.l(), j2Var2.l()) && bs1.c.l(j2Var, j2Var2)) ? (s3.i2) function1.invoke(j2Var2) : s3.i2.ContinueTraversal;
                                if (i2Var == s3.i2.CancelTraversal) {
                                    return;
                                }
                                if (i2Var == s3.i2.SkipSubtreeAndContinueTraversal) {
                                    break;
                                }
                            } else if ((nVar.f120044c & 262144) != 0 && (nVar instanceof s3.n)) {
                                u2.p pVar5 = nVar.f110843o;
                                int i13 = 0;
                                nVar = nVar;
                                r83 = r83;
                                while (pVar5 != null) {
                                    if ((pVar5.f120044c & 262144) != 0) {
                                        i13++;
                                        r83 = r83;
                                        if (i13 == 1) {
                                            nVar = pVar5;
                                        } else {
                                            if (r83 == 0) {
                                                r83 = new k2.e(new u2.p[16]);
                                            }
                                            if (nVar != 0) {
                                                r83.b(nVar);
                                                nVar = 0;
                                            }
                                            r83.b(pVar5);
                                        }
                                    }
                                    pVar5 = pVar5.f120047f;
                                    nVar = nVar;
                                    r83 = r83;
                                }
                                if (i13 == 1) {
                                }
                            }
                            nVar = com.bumptech.glide.c.g(r83);
                        }
                    }
                }
            }
            com.bumptech.glide.c.e(eVar, pVar3);
        }
    }

    public static final Bitmap Y(int i13, int i14, r72.a bitmapMask) {
        Intrinsics.checkNotNullParameter(bitmapMask, "bitmapMask");
        Bitmap W = W(bitmapMask.f106432b, null);
        Bitmap createBitmap = Bitmap.createBitmap(i13, i14, Bitmap.Config.ALPHA_8);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        canvas.drawPaint(paint);
        r72.j1 j1Var = bitmapMask.f106431a;
        float f13 = i13;
        int i15 = (int) (j1Var.f106506a * f13);
        float f14 = i14;
        int i16 = (int) (j1Var.f106507b * f14);
        int i17 = (int) (j1Var.f106508c * f13);
        int i18 = (int) (j1Var.f106509d * f14);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.XOR));
        if (W != null) {
            canvas.drawBitmap(W, (Rect) null, new Rect(i15, i16, i17 + i15, i18 + i16), paint);
        }
        return createBitmap;
    }

    public static void Y0(jt0.d dVar, ni1.d0 d0Var) {
        dVar.f77580c1 = d0Var;
    }

    public static final void Y1(GestaltToolbarImpl gestaltToolbarImpl, String title, String subtitle) {
        Intrinsics.checkNotNullParameter(gestaltToolbarImpl, "<this>");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        if (title.length() > 40) {
            title = bs1.c.q2(40, title);
        }
        if (subtitle.length() > 40) {
            subtitle = bs1.c.q2(40, subtitle);
        }
        gestaltToolbarImpl.b0(title);
        gestaltToolbarImpl.W(subtitle);
    }

    public static final v31.b Z(yk1.v resources, Function0 onCtaTapped) {
        int i13;
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(onCtaTapped, "onCtaTapped");
        Intrinsics.checkNotNullParameter(resources, "<this>");
        g92.d x03 = df.j1.x0(((yk1.a) resources).f139225b);
        Intrinsics.checkNotNullParameter(x03, "<this>");
        g92.d dVar = g92.d.CALICO;
        boolean z13 = x03 == dVar || x03 == g92.d.CALICO_0_0_1_BETA_7;
        if (z13) {
            Integer drawableRes = tm1.d.PIN_BOARD.drawableRes(dVar, tm1.b.SPOT, tm1.a.RATIO_1_1);
            i13 = drawableRes != null ? drawableRes.intValue() : oz1.a.boards_illustration;
        } else {
            i13 = oz1.a.boards_illustration;
        }
        int i14 = i13;
        int i15 = z13 ? eo1.c.space_200 : 0;
        int i16 = z13 ? nz1.f.profile_boards_empty_state_title_default_calico : nz1.f.profile_boards_empty_state_title_default;
        Resources resources2 = ((yk1.a) resources).f139224a;
        return new v31.b(i14, i15, resources2.getString(i16), resources2.getString(z13 ? nz1.f.profile_boards_empty_state_message_default_calico : nz1.f.profile_boards_empty_state_message_default), resources2.getString(nz1.f.profile_boards_empty_state_cta_label_default), onCtaTapped, null, 64);
    }

    public static void Z0(jt0.d dVar, x02.i2 i2Var) {
        dVar.W0 = i2Var;
    }

    public static final void Z1(wa2.i iVar, boolean z13) {
        iVar.A = !z13;
        iVar.C = z13;
        iVar.F = z13;
        iVar.f128765d = z13;
        iVar.f128804x = z13;
    }

    public static final void a(s80.j state, n72.b fontManager, n72.m logger, t62.b rendererUtility, u2.q qVar, float f13, long j13, boolean z13, Function1 function1, Function1 function12, Function1 function13, Function1 function14, i2.o oVar, int i13, int i14, int i15) {
        float f14;
        int i16;
        boolean z14;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(fontManager, "fontManager");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(rendererUtility, "rendererUtility");
        i2.s sVar = (i2.s) oVar;
        sVar.Y(-1713445403);
        int i17 = i15 & 16;
        u2.n nVar = u2.n.f120041b;
        u2.q qVar2 = i17 != 0 ? nVar : qVar;
        if ((i15 & 32) != 0) {
            i16 = i13 & (-458753);
            f14 = S(sVar);
        } else {
            f14 = f13;
            i16 = i13;
        }
        long j14 = (i15 & 64) != 0 ? b3.w.f21382f : j13;
        boolean z15 = (i15 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? false : z13;
        Function1 function15 = (i15 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? s80.h2.f111567i : function1;
        Function1 function16 = (i15 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? s80.i2.f111577i : function12;
        Function1 function17 = (i15 & 1024) != 0 ? s80.j2.f111616i : function13;
        Function1 function18 = (i15 & 2048) != 0 ? s80.k2.f111634i : function14;
        q3.p0 e13 = p1.q.e(u2.b.f120013a, false);
        int i18 = sVar.P;
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
        tb.f.f0(sVar, e13, s3.j.f110801e);
        tb.f.f0(sVar, o13, s3.j.f110800d);
        s3.h hVar = s3.j.f110802f;
        if (sVar.O || !Intrinsics.d(sVar.J(), Integer.valueOf(i18))) {
            ep.b.y(i18, sVar, i18, hVar);
        }
        tb.f.f0(sVar, X, s3.j.f110799c);
        androidx.compose.foundation.layout.c cVar = androidx.compose.foundation.layout.c.f17179a;
        int i19 = (458752 & i16) | 4680 | (3670016 & i16);
        int i23 = i16 >> 3;
        u2.q qVar3 = qVar2;
        l(state, fontManager, logger, rendererUtility, null, f14, j14, function15, function16, function18, sVar, i19 | (29360128 & i23) | (i23 & 234881024) | ((i14 << 24) & 1879048192), 16);
        sVar.W(643345238);
        if (z15) {
            z14 = false;
            p1.q.a(androidx.compose.foundation.a.b(cVar.b(nVar), g0.h(eo1.b.sema_color_background_wash_image_tint, sVar), b3.s0.f21349a), sVar, 0);
        } else {
            z14 = false;
        }
        sVar.r(z14);
        m(state.f111601j, null, function17, sVar, ((i14 << 6) & 896) | 8, 2);
        sVar.r(true);
        i2.f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new s80.l2(state, fontManager, logger, rendererUtility, qVar3, f14, j14, z15, function15, function16, function17, function18, i13, i14, i15);
        }
    }

    public static SafeParcelable a0(Intent intent, String str, Parcelable.Creator creator) {
        byte[] byteArrayExtra = intent.getByteArrayExtra(str);
        if (byteArrayExtra == null) {
            return null;
        }
        com.bumptech.glide.d.t(creator);
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(byteArrayExtra, 0, byteArrayExtra.length);
        obtain.setDataPosition(0);
        SafeParcelable safeParcelable = (SafeParcelable) creator.createFromParcel(obtain);
        obtain.recycle();
        return safeParcelable;
    }

    public static void a1(PinItActivity pinItActivity, bf2.d dVar) {
        pinItActivity.f34924i = dVar;
    }

    public static final void a2(qa2.n nVar, b22.l viewMode, boolean z13) {
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        Intrinsics.checkNotNullParameter(viewMode, "viewMode");
        wa2.i iVar = nVar.f103320a;
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        Intrinsics.checkNotNullParameter(viewMode, "viewMode");
        int i13 = w41.j.f128019a[viewMode.ordinal()];
        if (i13 == 1) {
            iVar.f128797t = true;
            iVar.f128791q = true;
            iVar.f128793r = false;
            iVar.A = false;
            iVar.C = true;
            iVar.F = true;
            iVar.f128765d = false;
            iVar.f128804x = false;
            return;
        }
        if (i13 == 2) {
            iVar.f128797t = z13;
            iVar.f128791q = false;
            iVar.f128793r = false;
            Z1(iVar, true);
            iVar.Y = true;
            return;
        }
        if (i13 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        iVar.f128797t = false;
        iVar.f128791q = false;
        iVar.f128793r = true;
        Z1(iVar, true);
        iVar.Y = true;
    }

    public static final void b(s80.i iVar, long j13, Function1 function1, i2.o oVar, int i13) {
        int i14;
        i2.q1 q1Var;
        boolean z13;
        i2.s sVar = (i2.s) oVar;
        sVar.Y(-719583163);
        if ((i13 & 14) == 0) {
            i14 = (sVar.h(iVar) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER) == 0) {
            i14 |= sVar.g(j13) ? 32 : 16;
        }
        if ((i13 & 896) == 0) {
            i14 |= sVar.j(function1) ? RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER : RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        }
        if ((i14 & 731) == 146 && sVar.z()) {
            sVar.Q();
        } else if (iVar.f111572a) {
            sVar.W(-536850095);
            Object J2 = sVar.J();
            am.d dVar = i2.n.f71185a;
            if (J2 == dVar) {
                J2 = bs1.c.u1(new n4.j(0L), y3.f71400a);
                sVar.g0(J2);
            }
            i2.q1 q1Var2 = (i2.q1) J2;
            sVar.r(false);
            int l03 = (int) ((n4.b) sVar.m(t3.f2.f115983f)).l0(8);
            sVar.W(-536845257);
            boolean z14 = (i14 & 14) == 4;
            Object J3 = sVar.J();
            if (z14 || J3 == dVar) {
                q1Var = q1Var2;
                J3 = new n4.h(d7.b.a((int) iVar.f111573b, (int) iVar.f111574c));
                sVar.g0(J3);
            } else {
                q1Var = q1Var2;
            }
            long j14 = ((n4.h) J3).f89180a;
            sVar.r(false);
            u2.i iVar2 = u2.b.f120013a;
            long a13 = d7.b.a((((int) (j13 >> 32)) + ((int) (j14 >> 32))) - (((int) (((n4.j) q1Var.getValue()).f89186a >> 32)) / 2), ((((int) (j13 & 4294967295L)) + ((int) (j14 & 4294967295L))) - (((int) (((n4.j) q1Var.getValue()).f89186a & 4294967295L)) * 2)) - l03);
            sVar.W(-536833189);
            boolean z15 = (i14 & 896) == 256;
            Object J4 = sVar.J();
            if (z15 || J4 == dVar) {
                z13 = false;
                J4 = jq.b.o(0, function1, sVar);
            } else {
                z13 = false;
            }
            sVar.r(z13);
            q4.l.b(iVar2, a13, (Function0) J4, new q4.z(true, true, true, 8), q2.i.c(-1926807907, new androidx.compose.foundation.lazy.layout.v(8, function1, q1Var), sVar), sVar, 27654, 0);
        }
        i2.f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new s80.n2(iVar, j13, function1, i13);
        }
    }

    public static final void b0() {
        File[] listFiles;
        f79438a = true;
        le.v vVar = le.v.f83104a;
        if (!le.o0.b() || df.j1.O0()) {
            return;
        }
        File y13 = m0.y();
        if (y13 == null) {
            listFiles = new File[0];
        } else {
            listFiles = y13.listFiles(new df.f0(4));
            if (listFiles == null) {
                listFiles = new File[0];
            }
        }
        ArrayList arrayList = new ArrayList();
        int length = listFiles.length;
        int i13 = 0;
        while (i13 < length) {
            File file = listFiles[i13];
            i13++;
            ff.d i03 = g0.i0(file);
            if (i03.a()) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("crash_shield", i03.toString());
                    String str = le.a0.f83002j;
                    String format = String.format("%s/instruments", Arrays.copyOf(new Object[]{le.v.b()}, 1));
                    Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
                    arrayList.add(wc.b.B(null, format, jSONObject, new le.c(i03, 2)));
                } catch (JSONException unused) {
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        le.d0 requests = new le.d0(arrayList);
        String str2 = le.a0.f83002j;
        Intrinsics.checkNotNullParameter(requests, "requests");
        df.k1.c(requests);
        new le.b0(requests).executeOnExecutor(le.v.d(), new Void[0]);
    }

    public static void b1(pe1.d dVar, x3 x3Var) {
        dVar.M1 = x3Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b2(AvatarPairUpdate avatarPairUpdate, List users) {
        Iterable iterable;
        bc0.e eVar;
        Intrinsics.checkNotNullParameter(avatarPairUpdate, "<this>");
        Intrinsics.checkNotNullParameter(users, "users");
        kotlin.collections.q0 q0Var = kotlin.collections.q0.f80391a;
        ArrayList arrayList = new ArrayList();
        Iterator it = users.iterator();
        while (true) {
            if (!it.hasNext()) {
                if (q0Var != null) {
                    iterable = new ArrayList(kotlin.collections.g0.q(q0Var, 10));
                    kotlin.collections.p0.f80390a.getClass();
                } else {
                    iterable = kotlin.collections.q0.f80391a;
                }
                ArrayList avatarDisplays = CollectionsKt.l0(iterable, arrayList);
                avatarPairUpdate.getClass();
                Intrinsics.checkNotNullParameter(avatarDisplays, "avatarDisplays");
                int min = Math.min(3, avatarDisplays.size());
                boolean z13 = min >= 1;
                boolean z14 = 2 <= min && min < 4;
                boolean z15 = min >= 3;
                boolean z16 = min >= 4;
                if (z13) {
                    avatarPairUpdate.f44706i = (bc0.e) avatarDisplays.get(0);
                }
                if (z14) {
                    avatarPairUpdate.f44707j = (bc0.e) avatarDisplays.get(1);
                }
                if (z15) {
                    avatarPairUpdate.f44708k = (bc0.e) avatarDisplays.get(2);
                }
                if (z16) {
                    avatarPairUpdate.f44710m = (bc0.e) avatarDisplays.get(1);
                    avatarPairUpdate.f44709l = (bc0.e) avatarDisplays.get(3);
                }
                avatarPairUpdate.L(bc0.f.Front).H2(new cp.t(z13, 21));
                avatarPairUpdate.L(bc0.f.Back).H2(new cp.t(z14, 22));
                avatarPairUpdate.L(bc0.f.Left).H2(new cp.t(z15, 23));
                avatarPairUpdate.L(bc0.f.Right).H2(new cp.t(z16, 24));
                avatarPairUpdate.L(bc0.f.BackLeft).H2(new cp.t(z16, 25));
                avatarPairUpdate.a0();
                return;
            }
            Object user = it.next();
            if (user != null) {
                Intrinsics.checkNotNullParameter(user, "user");
                if (user instanceof wy0) {
                    wy0 wy0Var = (wy0) user;
                    String s03 = dl2.b.s0(wy0Var);
                    String M0 = dl2.b.M0(wy0Var);
                    int i13 = (dl2.b.W1(wy0Var) || cb.y(wy0Var, "getIsVerifiedMerchant(...)")) ? 1 : 0;
                    int i14 = sm1.b.ic_check_circle_gestalt;
                    Integer valueOf = Integer.valueOf(cb.y(wy0Var, "getIsVerifiedMerchant(...)") ? eo1.b.color_blue_500 : eo1.b.color_themed_base_red_300);
                    String uid = wy0Var.getUid();
                    Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                    Integer q23 = wy0Var.q2();
                    Intrinsics.checkNotNullExpressionValue(q23, "getAvatarColorIndex(...)");
                    eVar = new bc0.e(s03, M0, i13, i14, valueOf, uid, q23.intValue());
                } else {
                    if (!(user instanceof z40.d0)) {
                        throw new IllegalArgumentException(a.a.k("Unsupported type: ", user.getClass().getSimpleName(), " for mapping to AvatarDisplay"));
                    }
                    z40.d0 d0Var = (z40.d0) user;
                    String F = f0.h.F(d0Var);
                    String H = f0.h.H(d0Var);
                    boolean z17 = f0.h.e0(d0Var) || f0.h.f0(d0Var);
                    int i15 = sm1.b.ic_check_circle_gestalt;
                    Integer valueOf2 = Integer.valueOf(f0.h.f0(d0Var) ? eo1.b.color_blue_500 : eo1.b.color_themed_base_red_300);
                    String a13 = d0Var.a();
                    Integer n13 = d0Var.n();
                    eVar = new bc0.e(F, H, z17, i15, valueOf2, a13, n13 != null ? n13.intValue() : 0);
                }
            } else {
                eVar = null;
            }
            if (eVar != null) {
                arrayList.add(eVar);
            }
        }
    }

    public static final void c(q90.b bVar, u2.q qVar, i2.o oVar, int i13, int i14) {
        i2.s sVar = (i2.s) oVar;
        sVar.Y(-891764323);
        u2.q qVar2 = (i14 & 2) != 0 ? u2.n.f120041b : qVar;
        p1.y a13 = p1.x.a(p1.l.f98547e, u2.b.f120025m, sVar, 6);
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
        sVar.W(1277692369);
        u50.i0 i0Var = bVar.f103031a;
        u50.h0 h0Var = u50.h0.f120562a;
        if (!Intrinsics.d(i0Var, h0Var)) {
            dl2.b.c(new rn1.a(bVar.f103031a, null, null, null, vn1.g.UI_400, 0, null, null, null, null, false, 0, null, null, null, false, null, null, 2097134), null, null, null, sVar, 8, 14);
        }
        sVar.r(false);
        if (!Intrinsics.d(bVar.f103032b, h0Var)) {
            dl2.b.c(new rn1.a(bVar.f103032b, null, null, null, vn1.g.BODY_100, 0, null, null, null, null, false, 0, null, null, null, false, null, null, 2097134), null, null, null, sVar, 8, 14);
        }
        sVar.r(true);
        i2.f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new q90.a(bVar, qVar2, i13, i14, 0);
        }
    }

    public static final void c0(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Object parent = view.getParent();
        Intrinsics.g(parent, "null cannot be cast to non-null type android.view.View");
        View view2 = (View) parent;
        view2.post(new dp.a(17, view, view2));
    }

    public static void c1(q71.v0 v0Var, ip1.b bVar) {
        v0Var.X0 = bVar;
    }

    public static final uj2.q c2(x02.i2 i2Var, String pinUid, v32.c reactionType, String str, boolean z13) {
        Intrinsics.checkNotNullParameter(i2Var, "<this>");
        Intrinsics.checkNotNullParameter(pinUid, "pinUid");
        Intrinsics.checkNotNullParameter(reactionType, "reactionType");
        kotlin.jvm.internal.j0 j0Var = new kotlin.jvm.internal.j0();
        v32.c cVar = v32.c.NONE;
        j0Var.f80434a = cVar;
        return i2Var.I(reactionType == cVar ? new x02.h2(pinUid, str) : new x02.g2(pinUid, reactionType.getValue(), str), new s1.w(j0Var, reactionType, z13, 25), new androidx.compose.foundation.lazy.layout.z0(14, j0Var));
    }

    public static final void d(q90.b state, u2.q qVar, i2.o oVar, int i13, int i14) {
        Intrinsics.checkNotNullParameter(state, "state");
        i2.s sVar = (i2.s) oVar;
        sVar.Y(-1841102240);
        int i15 = i14 & 2;
        u2.n nVar = u2.n.f120041b;
        u2.q qVar2 = i15 != 0 ? nVar : qVar;
        state.getClass();
        sVar.W(-1415060111);
        boolean z13 = ((CharSequence) dl2.b.u2(state.f103031a, sVar)).length() == 0 && ((CharSequence) dl2.b.u2(state.f103032b, sVar)).length() == 0;
        sVar.r(false);
        if (!z13) {
            p1.y a13 = p1.x.a(p1.l.f98547e, u2.b.f120025m, sVar, 6);
            int i16 = sVar.P;
            i2.z1 o13 = sVar.o();
            u2.q X = ao2.m0.X(sVar, qVar2);
            s3.k.Qo.getClass();
            s3.i iVar = s3.j.f110798b;
            u50.b0 b0Var = null;
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
            if (sVar.O || !Intrinsics.d(sVar.J(), Integer.valueOf(i16))) {
                ep.b.y(i16, sVar, i16, hVar);
            }
            tb.f.f0(sVar, X, s3.j.f110799c);
            c(state, androidx.compose.foundation.layout.b.n(androidx.compose.foundation.layout.e.b(nVar, 1.0f), com.bumptech.glide.d.A(eo1.c.space_400, sVar)), sVar, 8, 0);
            s0.f(new jm1.b(b0Var, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK), null, sVar, 8, 2);
            sVar.r(true);
        }
        i2.f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new q90.a(state, qVar2, i13, i14, 1);
        }
    }

    public static final boolean d0(int i13, int i14) {
        return i13 == i14;
    }

    public static void d1(ly0.d dVar, so.r0 r0Var) {
        dVar.f85123p0 = r0Var;
    }

    public static final x02.i2 d2(x02.i2 i2Var, String str, n00.c cVar) {
        Intrinsics.checkNotNullParameter(i2Var, "<this>");
        if (Intrinsics.d(str, i2Var.L)) {
            return i2Var;
        }
        b22.i a13 = i2Var.K.a();
        a13.f21300e = str;
        if (cVar != null) {
            Intrinsics.checkNotNullParameter(cVar, "<set-?>");
            a13.f21299d = cVar;
        }
        Unit unit = Unit.f80348a;
        return x02.i2.a0(i2Var, a13, str, 2031613);
    }

    public static final void e(s80.j state, n72.b fontManager, n72.m logger, t62.b rendererUtility, u2.q qVar, Function1 function1, i2.o oVar, int i13, int i14) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(fontManager, "fontManager");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(rendererUtility, "rendererUtility");
        i2.s sVar = (i2.s) oVar;
        sVar.Y(-659925997);
        u2.q qVar2 = (i14 & 16) != 0 ? u2.n.f120041b : qVar;
        Function1 function12 = (i14 & 32) != 0 ? s80.o2.f111736i : function1;
        if (state.f111608q) {
            sVar.W(798867982);
            u2.e(state, fontManager, logger, rendererUtility, qVar2, function12, sVar, (i13 & 57344) | 4680 | (i13 & 458752), 0);
            sVar.r(false);
        } else {
            sVar.W(799134923);
            f(state, fontManager, logger, rendererUtility, qVar2, function12, sVar, (i13 & 57344) | 4680 | (i13 & 458752), 0);
            sVar.r(false);
        }
        i2.f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new s80.p2(state, fontManager, logger, rendererUtility, qVar2, function12, i13, i14, 0);
        }
    }

    public static final void e0(Throwable th3) {
        HashMap hashMap;
        df.v feature;
        if (!f79438a || th3 == null) {
            return;
        }
        HashSet hashSet = new HashSet();
        StackTraceElement[] stackTrace = th3.getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "e.stackTrace");
        for (StackTraceElement stackTraceElement : stackTrace) {
            df.y yVar = df.y.f54881a;
            String className = stackTraceElement.getClassName();
            Intrinsics.checkNotNullExpressionValue(className, "it.className");
            Intrinsics.checkNotNullParameter(className, "className");
            synchronized (df.y.f54881a) {
                hashMap = df.y.f54882b;
                if (hashMap.isEmpty()) {
                    hashMap.put(df.v.AAM, new String[]{"com.facebook.appevents.aam."});
                    hashMap.put(df.v.CodelessEvents, new String[]{"com.facebook.appevents.codeless."});
                    hashMap.put(df.v.CloudBridge, new String[]{"com.facebook.appevents.cloudbridge."});
                    hashMap.put(df.v.ErrorReport, new String[]{"com.facebook.internal.instrument.errorreport."});
                    hashMap.put(df.v.AnrReport, new String[]{"com.facebook.internal.instrument.anrreport."});
                    hashMap.put(df.v.PrivacyProtection, new String[]{"com.facebook.appevents.ml."});
                    hashMap.put(df.v.SuggestedEvents, new String[]{"com.facebook.appevents.suggestedevents."});
                    hashMap.put(df.v.RestrictiveDataFiltering, new String[]{"com.facebook.appevents.restrictivedatafilter.RestrictiveDataManager"});
                    hashMap.put(df.v.IntelligentIntegrity, new String[]{"com.facebook.appevents.integrity.IntegrityManager"});
                    hashMap.put(df.v.EventDeactivation, new String[]{"com.facebook.appevents.eventdeactivation."});
                    hashMap.put(df.v.OnDeviceEventProcessing, new String[]{"com.facebook.appevents.ondeviceprocessing."});
                    hashMap.put(df.v.IapLogging, new String[]{"com.facebook.appevents.iap."});
                    hashMap.put(df.v.Monitoring, new String[]{"com.facebook.internal.logging.monitor"});
                }
            }
            Iterator it = hashMap.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    feature = df.v.Unknown;
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                feature = (df.v) entry.getKey();
                String[] strArr = (String[]) entry.getValue();
                int length = strArr.length;
                int i13 = 0;
                while (i13 < length) {
                    String str = strArr[i13];
                    i13++;
                    if (kotlin.text.z.p(className, str, false)) {
                        break;
                    }
                }
            }
            if (feature != df.v.Unknown) {
                df.y yVar2 = df.y.f54881a;
                Intrinsics.checkNotNullParameter(feature, "feature");
                le.v.a().getSharedPreferences("com.facebook.internal.FEATURE_MANAGER", 0).edit().putString(feature.toKey(), "15.0.2").apply();
                hashSet.add(feature.toString());
            }
        }
        le.v vVar = le.v.f83104a;
        if (le.o0.b() && (!hashSet.isEmpty())) {
            JSONArray features = new JSONArray((Collection) hashSet);
            Intrinsics.checkNotNullParameter(features, "features");
            ff.d dVar = new ff.d();
            dVar.f62093b = ff.b.Analysis;
            Long valueOf = Long.valueOf(System.currentTimeMillis() / 1000);
            dVar.f62098g = valueOf;
            dVar.f62094c = features;
            StringBuffer stringBuffer = new StringBuffer("analysis_log_");
            stringBuffer.append(String.valueOf(valueOf));
            stringBuffer.append(".json");
            String stringBuffer2 = stringBuffer.toString();
            Intrinsics.checkNotNullExpressionValue(stringBuffer2, "StringBuffer()\n            .append(InstrumentUtility.ANALYSIS_REPORT_PREFIX)\n            .append(timestamp.toString())\n            .append(\".json\")\n            .toString()");
            dVar.f62092a = stringBuffer2;
            dVar.b();
        }
    }

    public static void e1(p61.d dVar, so.e3 e3Var) {
        dVar.f98910j0 = e3Var;
    }

    public static void e2(int i13, int i14) {
        String t03;
        if (i13 < 0 || i13 >= i14) {
            if (i13 < 0) {
                t03 = g0.t0("%s (%s) must not be negative", "index", Integer.valueOf(i13));
            } else {
                if (i14 < 0) {
                    throw new IllegalArgumentException(a.a.d("negative size: ", i14));
                }
                t03 = g0.t0("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i13), Integer.valueOf(i14));
            }
            throw new IndexOutOfBoundsException(t03);
        }
    }

    public static final void f(s80.j jVar, n72.b bVar, n72.m mVar, t62.b bVar2, u2.q qVar, Function1 function1, i2.o oVar, int i13, int i14) {
        w80.h1 h1Var;
        Object obj;
        i2.q1 q1Var;
        Object obj2;
        w80.h1 h1Var2;
        boolean z13;
        Object obj3;
        Object obj4;
        i2.s sVar = (i2.s) oVar;
        sVar.Y(-249295873);
        int i15 = i14 & 16;
        u2.n nVar = u2.n.f120041b;
        u2.q qVar2 = i15 != 0 ? nVar : qVar;
        Function1 function12 = (i14 & 32) != 0 ? s80.q2.f111771i : function1;
        FillElement fillElement = androidx.compose.foundation.layout.e.f17184c;
        u2.q b13 = androidx.compose.foundation.a.b(qVar2.j(fillElement), g0.h(eo1.b.color_themed_background_default, sVar), b3.s0.f21349a);
        int i16 = 0;
        q3.p0 e13 = p1.q.e(u2.b.f120013a, false);
        int i17 = sVar.P;
        i2.z1 o13 = sVar.o();
        u2.q X = ao2.m0.X(sVar, b13);
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
        tb.f.f0(sVar, e13, s3.j.f110801e);
        tb.f.f0(sVar, o13, s3.j.f110800d);
        s3.h hVar = s3.j.f110802f;
        if (sVar.O || !Intrinsics.d(sVar.J(), Integer.valueOf(i17))) {
            ep.b.y(i17, sVar, i17, hVar);
        }
        tb.f.f0(sVar, X, s3.j.f110799c);
        androidx.compose.foundation.layout.c cVar = androidx.compose.foundation.layout.c.f17179a;
        n4.b bVar3 = (n4.b) sVar.m(t3.f2.f115983f);
        sVar.W(-1121922327);
        Object J2 = sVar.J();
        am.d dVar = i2.n.f71185a;
        Object obj5 = J2;
        if (J2 == dVar) {
            w80.h1 h1Var3 = new w80.h1();
            sVar.g0(h1Var3);
            obj5 = h1Var3;
        }
        w80.h1 h1Var4 = (w80.h1) obj5;
        Object d2 = jq.b.d(sVar, false, -1121920406);
        y3 y3Var = y3.f71400a;
        Object obj6 = d2;
        if (d2 == dVar) {
            ParcelableSnapshotMutableState u13 = bs1.c.u1(Boolean.FALSE, y3Var);
            sVar.g0(u13);
            obj6 = u13;
        }
        i2.q1 q1Var2 = (i2.q1) obj6;
        Object d13 = jq.b.d(sVar, false, -1121917955);
        Object obj7 = d13;
        if (d13 == dVar) {
            do2.f2 b14 = do2.g2.b(0, 1, co2.a.DROP_OLDEST, 1);
            sVar.g0(b14);
            obj7 = b14;
        }
        do2.x1 x1Var = (do2.x1) obj7;
        sVar.r(false);
        boolean z14 = jVar.f111596e.f111806b || jVar.f111600i.f111833c;
        v3 b15 = j1.i.b(z14 ? 0.8f : 1.0f, null, "Canvas scale animation", sVar, 3072, 22);
        v3 a13 = j1.i.a(z14 ? 2 : 0, null, "Canvas border width animation", sVar, 384, 10);
        sVar.W(-1121895895);
        long h10 = z14 ? g0.h(eo1.b.color_background_dark_opacity_100, sVar) : b3.w.f21389m;
        sVar.r(false);
        v3 a14 = i1.u1.a(h10, null, "Canvas border color animation", sVar, 384, 10);
        float S = S(sVar);
        u2.q j13 = androidx.compose.ui.draw.a.h(androidx.compose.foundation.layout.b.d(androidx.compose.foundation.layout.e.b(nVar, 1.0f), 0.5625f), ((Number) b15.getValue()).floatValue()).j(new BorderModifierNodeElement(((n4.e) a13.getValue()).f89175a, new b3.z0(((b3.w) a14.getValue()).f21392a), v1.i.a(S)));
        sVar.W(-1121875487);
        Object J3 = sVar.J();
        int i18 = 3;
        if (J3 == dVar) {
            h1Var = h1Var4;
            s80.t2 t2Var = new s80.t2(h1Var, i18);
            sVar.g0(t2Var);
            obj = t2Var;
        } else {
            h1Var = h1Var4;
            obj = J3;
        }
        sVar.r(false);
        u2.q g13 = androidx.compose.ui.layout.b.g(j13, (Function1) obj);
        sVar.W(-1121863466);
        int i19 = (i13 & 458752) ^ 196608;
        boolean z15 = (i19 > 131072 && sVar.h(function12)) || (i13 & 196608) == 131072;
        Object J4 = sVar.J();
        if (z15 || J4 == dVar) {
            q1Var = q1Var2;
            s80.r2 r2Var = new s80.r2(function12, q1Var, i16);
            sVar.g0(r2Var);
            obj2 = r2Var;
        } else {
            q1Var = q1Var2;
            obj2 = J4;
        }
        Function1 function13 = (Function1) obj2;
        sVar.r(false);
        sVar.W(-1121855561);
        boolean z16 = (i19 > 131072 && sVar.h(function12)) || (i13 & 196608) == 131072;
        Object J5 = sVar.J();
        Object obj8 = J5;
        if (z16 || J5 == dVar) {
            i1.f1 f1Var = new i1.f1(12, function12);
            sVar.g0(f1Var);
            obj8 = f1Var;
        }
        sVar.r(false);
        Function1 function14 = function12;
        w80.h1 h1Var5 = h1Var;
        u2.q qVar3 = qVar2;
        a(jVar, bVar, mVar, bVar2, g13, S, 0L, false, function13, function14, (Function1) obj8, new s80.s2(x1Var, q1Var, i16), sVar, ((i13 << 12) & 1879048192) | 4680, 0, RecyclerViewTypes.VIEW_TYPE_LENS_DIRECTORY);
        el.a.e(jVar, null, g13, 0.0f, function14, sVar, ((i13 >> 3) & 57344) | 8, 10);
        float A = com.bumptech.glide.d.A(eo1.c.space_200, sVar);
        u2.q r13 = androidx.compose.foundation.layout.b.r(nVar, 0.0f, A, 0.0f, 0.0f, 13);
        sVar.W(-1121826139);
        Object J6 = sVar.J();
        if (J6 == dVar) {
            h1Var2 = h1Var5;
            z13 = false;
            s80.t2 t2Var2 = new s80.t2(h1Var2, false ? 1 : 0);
            sVar.g0(t2Var2);
            obj3 = t2Var2;
        } else {
            h1Var2 = h1Var5;
            z13 = false;
            obj3 = J6;
        }
        sVar.r(z13);
        int i23 = (i13 >> 9) & 896;
        k(jVar, r13, function14, (Function1) obj3, sVar, i23 | 3080, 0);
        sVar.W(-1121819801);
        Object J7 = sVar.J();
        long j14 = 0;
        Object obj9 = J7;
        if (J7 == dVar) {
            ParcelableSnapshotMutableState u14 = bs1.c.u1(new n4.h(j14), y3Var);
            sVar.g0(u14);
            obj9 = u14;
        }
        i2.q1 q1Var3 = (i2.q1) obj9;
        sVar.r(z13);
        a3.d dVar2 = (a3.d) h1Var2.f128300a.getValue();
        sVar.W(-1121815161);
        boolean h13 = sVar.h(bVar3);
        Object J8 = sVar.J();
        Object obj10 = J8;
        if (h13 || J8 == dVar) {
            s80.u2 u2Var = new s80.u2(bVar3, h1Var2, q1Var3, null);
            sVar.g0(u2Var);
            obj10 = u2Var;
        }
        sVar.r(z13);
        i2.u.e(dVar2, (Function2) obj10, sVar);
        u2.i iVar2 = u2.b.f120020h;
        u2.q a15 = cVar.a(nVar, iVar2);
        sVar.W(-1121790117);
        Object J9 = sVar.J();
        Object obj11 = J9;
        if (J9 == dVar) {
            w1.o oVar2 = new w1.o(3, q1Var3);
            sVar.g0(oVar2);
            obj11 = oVar2;
        }
        sVar.r(z13);
        u2.q j15 = androidx.compose.foundation.layout.b.j(a15, (Function1) obj11);
        sVar.W(-1121788180);
        Object J10 = sVar.J();
        if (J10 == dVar) {
            s80.t2 t2Var3 = new s80.t2(h1Var2, 1);
            sVar.g0(t2Var3);
            obj4 = t2Var3;
        } else {
            obj4 = J10;
        }
        sVar.r(z13);
        u2.q g14 = androidx.compose.ui.layout.b.g(j15, (Function1) obj4);
        boolean z17 = !n4.h.a(((n4.h) q1Var3.getValue()).f89180a, 0L);
        sVar.W(-1121780028);
        Object J11 = sVar.J();
        Object obj12 = J11;
        if (J11 == dVar) {
            s80.t2 t2Var4 = new s80.t2(h1Var2, 2);
            sVar.g0(t2Var4);
            obj12 = t2Var4;
        }
        sVar.r(z13);
        int i24 = (i13 >> 6) & 7168;
        h(jVar, z17, g14, function14, (Function1) obj12, sVar, i24 | 24584, 0);
        int i25 = i23 | 8;
        g(jVar, androidx.compose.foundation.layout.b.r(nVar, 0.0f, A, 0.0f, 0.0f, 13), function14, sVar, i25, 0);
        i(jVar.f111596e, cVar.a(nVar, u2.b.f120019g), function14, sVar, i25, 0);
        j(jVar, x1Var, cVar.a(nVar, iVar2), function14, sVar, i24 | 72, 0);
        p(jVar, h1Var2, fillElement, function14, false, sVar, i24 | 440, 16);
        r(jVar.f111599h, fillElement, sVar, 56, 0);
        sVar.r(true);
        i2.f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new s80.p2(jVar, bVar, mVar, bVar2, qVar3, function14, i13, i14, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [u2.p] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [u2.p] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [k2.e] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [k2.e] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public static final s3.j2 f0(s3.m mVar, Object obj) {
        s3.j1 j1Var;
        u2.p pVar = ((u2.p) mVar).f120042a;
        if (!pVar.f120054m) {
            throw new IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        u2.p pVar2 = pVar.f120046e;
        s3.k0 U0 = com.bumptech.glide.c.U0(mVar);
        while (U0 != null) {
            if ((U0.f110837y.f110808e.f120045d & 262144) != 0) {
                while (pVar2 != null) {
                    if ((pVar2.f120044c & 262144) != 0) {
                        s3.n nVar = pVar2;
                        ?? r43 = 0;
                        while (nVar != 0) {
                            if (nVar instanceof s3.j2) {
                                s3.j2 j2Var = (s3.j2) nVar;
                                if (Intrinsics.d(obj, j2Var.l())) {
                                    return j2Var;
                                }
                            } else if ((nVar.f120044c & 262144) != 0 && (nVar instanceof s3.n)) {
                                u2.p pVar3 = nVar.f110843o;
                                int i13 = 0;
                                nVar = nVar;
                                r43 = r43;
                                while (pVar3 != null) {
                                    if ((pVar3.f120044c & 262144) != 0) {
                                        i13++;
                                        r43 = r43;
                                        if (i13 == 1) {
                                            nVar = pVar3;
                                        } else {
                                            if (r43 == 0) {
                                                r43 = new k2.e(new u2.p[16]);
                                            }
                                            if (nVar != 0) {
                                                r43.b(nVar);
                                                nVar = 0;
                                            }
                                            r43.b(pVar3);
                                        }
                                    }
                                    pVar3 = pVar3.f120047f;
                                    nVar = nVar;
                                    r43 = r43;
                                }
                                if (i13 == 1) {
                                }
                            }
                            nVar = com.bumptech.glide.c.g(r43);
                        }
                    }
                    pVar2 = pVar2.f120046e;
                }
            }
            U0 = U0.v();
            pVar2 = (U0 == null || (j1Var = U0.f110837y) == null) ? null : j1Var.f110807d;
        }
        return null;
    }

    public static void f1(bb1.i iVar, uk1.e eVar) {
        iVar.f22509j0 = eVar;
    }

    public static /* synthetic */ boolean f2(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static final void g(s80.j jVar, u2.q qVar, Function1 function1, i2.o oVar, int i13, int i14) {
        i2.s sVar = (i2.s) oVar;
        sVar.Y(181864302);
        if ((i14 & 2) != 0) {
            qVar = u2.n.f120041b;
        }
        if ((i14 & 4) != 0) {
            function1 = s80.v2.f111823i;
        }
        b7.c.c(jVar.f111613v, qVar, androidx.compose.animation.a.c(null, 3), androidx.compose.animation.a.d(null, 3), null, q2.i.c(1826215318, new m1.d0(2, function1), sVar), sVar, (i13 & RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER) | 200064, 16);
        i2.f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new l1.p(i13, i14, 8, jVar, qVar, function1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, s3.j2, s3.m] */
    /* JADX WARN: Type inference failed for: r3v10, types: [u2.p] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [u2.p] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [k2.e] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [k2.e] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public static final s3.j2 g0(s3.j2 j2Var) {
        s3.j1 j1Var;
        u2.p pVar = ((u2.p) j2Var).f120042a;
        if (!pVar.f120054m) {
            throw new IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        u2.p pVar2 = pVar.f120046e;
        s3.k0 U0 = com.bumptech.glide.c.U0(j2Var);
        while (U0 != null) {
            if ((U0.f110837y.f110808e.f120045d & 262144) != 0) {
                while (pVar2 != null) {
                    if ((pVar2.f120044c & 262144) != 0) {
                        s3.n nVar = pVar2;
                        ?? r53 = 0;
                        while (nVar != 0) {
                            if (nVar instanceof s3.j2) {
                                s3.j2 j2Var2 = (s3.j2) nVar;
                                if (Intrinsics.d(j2Var.l(), j2Var2.l()) && bs1.c.l(j2Var, j2Var2)) {
                                    return j2Var2;
                                }
                            } else if ((nVar.f120044c & 262144) != 0 && (nVar instanceof s3.n)) {
                                u2.p pVar3 = nVar.f110843o;
                                int i13 = 0;
                                nVar = nVar;
                                r53 = r53;
                                while (pVar3 != null) {
                                    if ((pVar3.f120044c & 262144) != 0) {
                                        i13++;
                                        r53 = r53;
                                        if (i13 == 1) {
                                            nVar = pVar3;
                                        } else {
                                            if (r53 == 0) {
                                                r53 = new k2.e(new u2.p[16]);
                                            }
                                            if (nVar != 0) {
                                                r53.b(nVar);
                                                nVar = 0;
                                            }
                                            r53.b(pVar3);
                                        }
                                    }
                                    pVar3 = pVar3.f120047f;
                                    nVar = nVar;
                                    r53 = r53;
                                }
                                if (i13 == 1) {
                                }
                            }
                            nVar = com.bumptech.glide.c.g(r53);
                        }
                    }
                    pVar2 = pVar2.f120046e;
                }
            }
            U0 = U0.v();
            pVar2 = (U0 == null || (j1Var = U0.f110837y) == null) ? null : j1Var.f110807d;
        }
        return null;
    }

    public static void g1(di1.g gVar, uk1.e eVar) {
        gVar.f55066o0 = eVar;
    }

    public static void g2(int i13, int i14, int i15) {
        if (i13 < 0 || i14 < i13 || i14 > i15) {
            throw new IndexOutOfBoundsException((i13 < 0 || i13 > i15) ? h2(i13, i15, "start index") : (i14 < 0 || i14 > i15) ? h2(i14, i15, "end index") : g0.t0("end index (%s) must not be less than start index (%s)", Integer.valueOf(i14), Integer.valueOf(i13)));
        }
    }

    public static final void h(s80.j jVar, boolean z13, u2.q qVar, Function1 function1, Function1 function12, i2.o oVar, int i13, int i14) {
        i2.s sVar = (i2.s) oVar;
        sVar.Y(-1267106810);
        u2.q qVar2 = (i14 & 4) != 0 ? u2.n.f120041b : qVar;
        Function1 function13 = (i14 & 8) != 0 ? s80.w2.f111836i : function1;
        Function1 function14 = (i14 & 16) != 0 ? s80.x2.f111845i : function12;
        h.e eVar = new h.e();
        sVar.W(-336182109);
        boolean z14 = (((i13 & 7168) ^ 3072) > 2048 && sVar.h(function13)) || (i13 & 3072) == 2048;
        Object J2 = sVar.J();
        if (z14 || J2 == i2.n.f71185a) {
            J2 = new i1.f1(15, function13);
            sVar.g0(J2);
        }
        sVar.r(false);
        b7.c.c(jVar.f111611t, qVar2, androidx.compose.animation.a.c(null, 3), androidx.compose.animation.a.d(null, 3), null, q2.i.c(-1757147090, new l1.i(2, jVar, function13, function14, gh0.b.o0(eVar, (Function1) J2, sVar), z13), sVar), sVar, ((i13 >> 3) & RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER) | 200064, 16);
        i2.f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new c2.q2(jVar, z13, qVar2, function13, function14, i13, i14);
        }
    }

    public static Object h0(Object obj, Serializable serializable) {
        if (obj != null) {
            return obj;
        }
        if (serializable != null) {
            return serializable;
        }
        throw new NullPointerException("Both parameters are null");
    }

    public static void h1(jt0.d dVar, uk1.e eVar) {
        dVar.Y0 = eVar;
    }

    public static String h2(int i13, int i14, String str) {
        if (i13 < 0) {
            return g0.t0("%s (%s) must not be negative", str, Integer.valueOf(i13));
        }
        if (i14 >= 0) {
            return g0.t0("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i13), Integer.valueOf(i14));
        }
        throw new IllegalArgumentException(a.a.d("negative size: ", i14));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void i(s80.t6 r15, u2.q r16, kotlin.jvm.functions.Function1 r17, i2.o r18, int r19, int r20) {
        /*
            r4 = r15
            r1 = r19
            r0 = r18
            i2.s r0 = (i2.s) r0
            r2 = -1637518194(0xffffffff9e65748e, float:-1.2147262E-20)
            r0.Y(r2)
            r2 = r20 & 1
            if (r2 == 0) goto L14
            r2 = r1 | 6
            goto L24
        L14:
            r2 = r1 & 14
            if (r2 != 0) goto L23
            boolean r2 = r0.h(r15)
            if (r2 == 0) goto L20
            r2 = 4
            goto L21
        L20:
            r2 = 2
        L21:
            r2 = r2 | r1
            goto L24
        L23:
            r2 = r1
        L24:
            r3 = r20 & 2
            if (r3 == 0) goto L2d
            r2 = r2 | 48
        L2a:
            r5 = r16
            goto L3f
        L2d:
            r5 = r1 & 112(0x70, float:1.57E-43)
            if (r5 != 0) goto L2a
            r5 = r16
            boolean r6 = r0.h(r5)
            if (r6 == 0) goto L3c
            r6 = 32
            goto L3e
        L3c:
            r6 = 16
        L3e:
            r2 = r2 | r6
        L3f:
            r6 = r20 & 4
            if (r6 == 0) goto L48
            r2 = r2 | 384(0x180, float:5.38E-43)
        L45:
            r7 = r17
            goto L5a
        L48:
            r7 = r1 & 896(0x380, float:1.256E-42)
            if (r7 != 0) goto L45
            r7 = r17
            boolean r8 = r0.j(r7)
            if (r8 == 0) goto L57
            r8 = 256(0x100, float:3.59E-43)
            goto L59
        L57:
            r8 = 128(0x80, float:1.8E-43)
        L59:
            r2 = r2 | r8
        L5a:
            r8 = r2 & 731(0x2db, float:1.024E-42)
            r9 = 146(0x92, float:2.05E-43)
            if (r8 != r9) goto L6c
            boolean r8 = r0.z()
            if (r8 != 0) goto L67
            goto L6c
        L67:
            r0.Q()
            r6 = r7
            goto La6
        L6c:
            if (r3 == 0) goto L71
            u2.n r3 = u2.n.f120041b
            goto L72
        L71:
            r3 = r5
        L72:
            if (r6 == 0) goto L78
            s80.a3 r5 = s80.a3.f111461i
            r14 = r5
            goto L79
        L78:
            r14 = r7
        L79:
            boolean r5 = r4.f111806b
            r6 = 0
            r7 = 3
            i1.n1 r8 = androidx.compose.animation.a.c(r6, r7)
            i1.o1 r9 = androidx.compose.animation.a.d(r6, r7)
            k1.n1 r6 = new k1.n1
            r7 = 5
            r6.<init>(r7, r15, r14)
            r7 = -1953125194(0xffffffff8b95acb6, float:-5.765258E-32)
            q2.h r10 = q2.i.c(r7, r6, r0)
            r6 = 200064(0x30d80, float:2.8035E-40)
            r2 = r2 & 112(0x70, float:1.57E-43)
            r12 = r2 | r6
            r13 = 16
            r2 = 0
            r6 = r3
            r7 = r8
            r8 = r9
            r9 = r2
            r11 = r0
            b7.c.c(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r5 = r3
            r6 = r14
        La6:
            i2.f2 r7 = r0.t()
            if (r7 == 0) goto Lbb
            l1.p r8 = new l1.p
            r3 = 9
            r0 = r8
            r1 = r19
            r2 = r20
            r4 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.f71113d = r8
        Lbb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kh2.b0.i(s80.t6, u2.q, kotlin.jvm.functions.Function1, i2.o, int, int):void");
    }

    public static void i1(q71.v0 v0Var, uk1.e eVar) {
        v0Var.V0 = eVar;
    }

    public static final void j(s80.j jVar, do2.b2 b2Var, u2.q qVar, Function1 function1, i2.o oVar, int i13, int i14) {
        i2.s sVar = (i2.s) oVar;
        sVar.Y(-513176971);
        if ((i14 & 4) != 0) {
            qVar = u2.n.f120041b;
        }
        int i15 = 1;
        b7.c.c(jVar.f111597f.f128273a != null, qVar, androidx.compose.animation.a.c(null, 3), androidx.compose.animation.a.d(null, 3), null, q2.i.c(-433575603, new c2.c0(jVar, b2Var, function1, i15), sVar), sVar, ((i13 >> 3) & RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER) | 200064, 16);
        i2.f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new l1.r(jVar, b2Var, qVar, function1, i13, i14, 4);
        }
    }

    public static void j1(tx0.o oVar, uk1.e eVar) {
        oVar.J0 = eVar;
    }

    public static final void k(s80.j jVar, u2.q qVar, Function1 function1, Function1 function12, i2.o oVar, int i13, int i14) {
        i2.s sVar = (i2.s) oVar;
        sVar.Y(1527806832);
        if ((i14 & 2) != 0) {
            qVar = u2.n.f120041b;
        }
        if ((i14 & 4) != 0) {
            function1 = s80.b3.f111473i;
        }
        if ((i14 & 8) != 0) {
            function12 = s80.c3.f111480i;
        }
        b7.c.c(jVar.f111610s, qVar, androidx.compose.animation.a.c(null, 3), androidx.compose.animation.a.d(null, 3), null, q2.i.c(-2145849272, new c2.c0(jVar, function1, function12, 2), sVar), sVar, (i13 & RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER) | 200064, 16);
        i2.f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new s80.d3(jVar, qVar, function1, function12, i13, i14, 0);
        }
    }

    public static final HashMap k0(lh0 lh0Var) {
        Intrinsics.checkNotNullParameter(lh0Var, "<this>");
        HashMap hashMap = new HashMap();
        if (lh0Var.i()) {
            hashMap.put("advisory_level", String.valueOf(lh0Var.h().intValue()));
        }
        boolean[] zArr = lh0Var.f39770h;
        if (zArr.length > 5 && zArr[5]) {
            hashMap.put("severity_level", String.valueOf(lh0Var.m().intValue()));
        }
        boolean[] zArr2 = lh0Var.f39770h;
        if (zArr2.length > 1 && zArr2[1]) {
            hashMap.put("advisory_type", String.valueOf(lh0Var.j()));
        }
        boolean[] zArr3 = lh0Var.f39770h;
        if (zArr3.length > 4 && zArr3[4]) {
            hashMap.put("resource_country", String.valueOf(lh0Var.l()));
        }
        return hashMap;
    }

    public static void k1(PinItActivity pinItActivity, r8 r8Var) {
        pinItActivity.f34922g = r8Var;
    }

    public static final void l(s80.j jVar, n72.b bVar, n72.m mVar, t62.b bVar2, u2.q qVar, float f13, long j13, Function1 function1, Function1 function12, Function1 function13, i2.o oVar, int i13, int i14) {
        float f14;
        int i15;
        Function1 function14;
        Function1 function15;
        i2.s sVar = (i2.s) oVar;
        sVar.Y(-324595260);
        u2.q qVar2 = (i14 & 16) != 0 ? u2.n.f120041b : qVar;
        if ((i14 & 32) != 0) {
            i15 = i13 & (-458753);
            f14 = S(sVar);
        } else {
            f14 = f13;
            i15 = i13;
        }
        long j14 = (i14 & 64) != 0 ? b3.w.f21382f : j13;
        Function1 function16 = (i14 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? s80.e3.f111518i : function1;
        Function1 function17 = (i14 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? s80.f3.f111526i : function12;
        Function1 function18 = (i14 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? s80.g3.f111555i : function13;
        float l03 = ((n4.b) sVar.m(t3.f2.f115983f)).l0(f14);
        Object J2 = sVar.J();
        am.d dVar = i2.n.f71185a;
        if (J2 == dVar) {
            i2.e0 e0Var = new i2.e0(i2.u.k(kotlin.coroutines.j.f80412a, sVar));
            sVar.g0(e0Var);
            J2 = e0Var;
        }
        ao2.j0 j0Var = ((i2.e0) J2).f71100a;
        sVar.W(-1896858707);
        Object J3 = sVar.J();
        y3 y3Var = y3.f71400a;
        if (J3 == dVar) {
            J3 = bs1.c.u1(null, y3Var);
            sVar.g0(J3);
        }
        i2.q1 q1Var = (i2.q1) J3;
        Object d2 = jq.b.d(sVar, false, -1896856126);
        if (d2 == dVar) {
            function14 = function17;
            function15 = function18;
            d2 = bs1.c.u1(new n4.h(0L), y3Var);
            sVar.g0(d2);
        } else {
            function14 = function17;
            function15 = function18;
        }
        i2.q1 q1Var2 = (i2.q1) d2;
        Object d13 = jq.b.d(sVar, false, -1896852467);
        if (d13 == dVar) {
            d13 = new w1.o(4, q1Var2);
            sVar.g0(d13);
        }
        sVar.r(false);
        Function1 function19 = function14;
        androidx.compose.ui.viewinterop.a.a(new s80.i3(bVar, mVar, j0Var, bVar2, l03, j14, function16, q1Var, function15), androidx.compose.ui.layout.b.g(qVar2, (Function1) d13), new sv.y(jVar, q1Var, function19, 5), sVar, 0, 0);
        b(jVar.f111607p, ((n4.h) q1Var2.getValue()).f89180a, function19, sVar, (i15 >> 18) & 896);
        i2.f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new s80.j3(jVar, bVar, mVar, bVar2, qVar2, f14, j14, function16, function19, function15, i13, i14);
        }
    }

    public static final h32.i0 l0(String boardId, h32.u0 u0Var) {
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        return new h32.i0(d4.ACTION_SHEET, e0.t.x(((b60.d) com.bumptech.glide.d.E()).f(), boardId), null, h32.g0.SEND_SHARE_MAIN, null, u0Var);
    }

    public static void l1(q71.v0 v0Var, j22.b bVar) {
        v0Var.T0 = bVar;
    }

    public static final void m(w6 w6Var, u2.q qVar, Function1 function1, i2.o oVar, int i13, int i14) {
        i2.s sVar = (i2.s) oVar;
        sVar.Y(-1527601504);
        if ((i14 & 2) != 0) {
            qVar = u2.n.f120041b;
        }
        if ((i14 & 4) != 0) {
            function1 = s80.k3.f111635i;
        }
        b7.c.c(w6Var.f111842c, qVar, androidx.compose.animation.a.c(null, 3), androidx.compose.animation.a.d(null, 3), null, q2.i.c(-1894637368, new k1.n1(6, w6Var, function1), sVar), sVar, (i13 & RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER) | 200064, 16);
        i2.f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new l1.p(i13, i14, 10, w6Var, qVar, function1);
        }
    }

    public static final ArrayList m0(bq.b selectedOption, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, Function1 sortOptionSelectionHandler, Function1 organizeSelectionHandler) {
        ha2.c0 c0Var;
        Intrinsics.checkNotNullParameter(selectedOption, "currentSortOrder");
        Intrinsics.checkNotNullParameter(sortOptionSelectionHandler, "sortOptionSelectionHandler");
        Intrinsics.checkNotNullParameter(organizeSelectionHandler, "organizeSelectionHandler");
        ArrayList arrayList = new ArrayList();
        Intrinsics.checkNotNullParameter(selectedOption, "selectedOption");
        Intrinsics.checkNotNullParameter(sortOptionSelectionHandler, "sortOptionSelectionHandler");
        int i13 = nz1.f.lego_profile_board_sort_by_options_title;
        ha2.x xVar = new ha2.x(i13, Integer.valueOf(i13), null, null, null, 28);
        ha2.c0[] elements = new ha2.c0[5];
        int i14 = nz1.f.lego_profile_board_sort_by_alpha;
        bq.b bVar = bq.b.ALPHABETICAL;
        elements[0] = new ha2.c0(i14, bVar.ordinal(), null, selectedOption == bVar, false, null, null, null, null, null, 4084);
        int i15 = z14 ? nz1.f.lego_profile_board_reorder_sort : nz1.f.lego_profile_board_custom_sort;
        bq.b bVar2 = bq.b.CUSTOM;
        int ordinal = bVar2.ordinal();
        boolean z18 = selectedOption == bVar2;
        ha2.c0 c0Var2 = null;
        elements[1] = new ha2.c0(i15, ordinal, null, z18, false, null, null, z14 ? Integer.valueOf(nz1.f.lego_profile_board_reorder_sort_st) : null, null, null, 3956);
        int i16 = nz1.f.lego_profile_board_sort_by_last_saved;
        bq.b bVar3 = bq.b.MOST_RECENT;
        elements[2] = new ha2.c0(i16, bVar3.ordinal(), null, selectedOption == bVar3, false, null, null, null, null, null, 4084);
        if (z17) {
            int i17 = d70.g.library_board_newest;
            bq.b bVar4 = bq.b.NEWEST;
            c0Var = new ha2.c0(i17, bVar4.ordinal(), null, selectedOption == bVar4, false, null, null, null, null, null, 4084);
        } else {
            c0Var = null;
        }
        elements[3] = c0Var;
        if (z17) {
            int i18 = d70.g.library_board_oldest;
            bq.b bVar5 = bq.b.OLDEST;
            c0Var2 = new ha2.c0(i18, bVar5.ordinal(), null, selectedOption == bVar5, false, null, null, null, null, null, 4084);
        }
        elements[4] = c0Var2;
        Intrinsics.checkNotNullParameter(elements, "elements");
        arrayList.add(new ha2.b0(xVar, kotlin.collections.c0.A(elements), sortOptionSelectionHandler));
        if (z13) {
            if (z15) {
                arrayList.add(u2.P0(nz1.f.lego_profile_organize_profile_header, kotlin.collections.e0.b(a41.q0.AutoSortBoards), organizeSelectionHandler));
            }
            if (z16) {
                arrayList.add(u2.P0(nz1.f.lego_profile_layout_profile_header, kotlin.collections.e0.b(a41.q0.LayoutBoards), organizeSelectionHandler));
            }
        }
        return arrayList;
    }

    public static void m1(q71.v0 v0Var, gp1.l lVar) {
        v0Var.Y0 = lVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void n(k31.e r19, u2.q r20, k31.f r21, i2.o r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kh2.b0.n(k31.e, u2.q, k31.f, i2.o, int, int):void");
    }

    public static final int n0(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        eb.r.f58213a.getClass();
        eb.s it = eb.s.f58214b;
        Intrinsics.checkNotNullParameter(it, "it");
        return it.a(activity).f58211a.c().height();
    }

    public static void n1(q71.v0 v0Var) {
        v0Var.S0 = x92.c.f134368a;
    }

    public static final void o(k31.a state, u2.q qVar, k31.b bVar, i2.o oVar, int i13, int i14) {
        k31.b bVar2;
        int i15;
        Intrinsics.checkNotNullParameter(state, "state");
        i2.s sVar = (i2.s) oVar;
        sVar.Y(1905828431);
        u2.q qVar2 = (i14 & 2) != 0 ? u2.n.f120041b : qVar;
        if ((i14 & 4) != 0) {
            bVar2 = new k31.b();
            i15 = i13 & (-897);
        } else {
            bVar2 = bVar;
            i15 = i13;
        }
        p1.x0 x0Var = bVar2.f78238c;
        p1.g gVar = p1.l.f98543a;
        rl2.g0.g(qVar2, null, x0Var, false, p1.l.g(bVar2.f78237b), u2.b.f120023k, null, false, new y01.p1(state, 15), sVar, ((i15 >> 3) & 14) | 196608, RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_USE_CASE_MODULE_STORY_PIN);
        i2.f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new k31.h(i13, i14, 0, qVar2, state, bVar2);
        }
    }

    public static final int o0(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        eb.r.f58213a.getClass();
        eb.s it = eb.s.f58214b;
        Intrinsics.checkNotNullParameter(it, "it");
        return it.a(activity).f58211a.c().width();
    }

    public static void o1(PinItActivity pinItActivity, vo.u uVar) {
        pinItActivity.f34925j = uVar;
    }

    public static final void p(s80.j state, w80.h1 externalViewsState, u2.q qVar, Function1 function1, boolean z13, i2.o oVar, int i13, int i14) {
        boolean z14;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(externalViewsState, "externalViewsState");
        i2.s sVar = (i2.s) oVar;
        sVar.Y(230816541);
        u2.q qVar2 = (i14 & 4) != 0 ? u2.n.f120041b : qVar;
        Function1 function12 = (i14 & 8) != 0 ? s80.m3.f111676i : function1;
        boolean z15 = true;
        boolean z16 = (i14 & 16) != 0 ? true : z13;
        z6 z6Var = state.f111598g;
        boolean z17 = z6Var.f111881a != b7.None;
        y6 y6Var = z6Var.f111882b;
        boolean z18 = y6Var.f111869j || y6Var.f111870k;
        if (z17 && z18) {
            sVar.W(55311181);
            sVar.W(1525809529);
            int i15 = (i13 & 7168) ^ 3072;
            boolean z19 = (i15 > 2048 && sVar.h(function12)) || (i13 & 3072) == 2048;
            Object J2 = sVar.J();
            am.d dVar = i2.n.f71185a;
            if (z19 || J2 == dVar) {
                J2 = jq.b.o(13, function12, sVar);
            }
            Function0 function0 = (Function0) J2;
            sVar.r(false);
            sVar.W(1525811803);
            if ((i15 <= 2048 || !sVar.h(function12)) && (i13 & 3072) != 2048) {
                z15 = false;
            }
            Object J3 = sVar.J();
            if (z15 || J3 == dVar) {
                J3 = jq.b.o(14, function12, sVar);
            }
            sVar.r(false);
            z14 = z16;
            gh0.b.e(state.f111598g, externalViewsState, function0, (Function0) J3, qVar2, z16, sVar, (i13 & RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER) | 8 | ((i13 << 6) & 57344) | ((i13 << 3) & 458752), 0);
            sVar.r(false);
        } else {
            z14 = z16;
            if (state.f111606o) {
                sVar.W(55730952);
                int i16 = i13 >> 3;
                gh0.b.h(externalViewsState, qVar2, sVar, (i16 & RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER) | (i16 & 14), 0);
                sVar.r(false);
            } else {
                sVar.W(55859726);
                sVar.r(false);
            }
        }
        i2.f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new c2.q2(state, externalViewsState, qVar2, function12, z14, i13, i14);
        }
    }

    public static final Pair p0(qa2.a attributionReason, f30 pin, String str) {
        Pair pair;
        Intrinsics.checkNotNullParameter(attributionReason, "attributionReason");
        Intrinsics.checkNotNullParameter(pin, "pin");
        switch (ij1.n.f72374a[attributionReason.ordinal()]) {
            case 1:
                h32.u0 u0Var = h32.u0.PIN_INTEREST;
                zs t63 = pin.t6();
                String uid = t63 != null ? t63.getUid() : null;
                if (uid == null) {
                    uid = "";
                }
                return new Pair(u0Var, uid);
            case 2:
                if (b40.N(pin) == null) {
                    return null;
                }
                pair = new Pair(h32.u0.PIN_CELL_BUTTON_PROMOTED_PIN_SOURCE, pin.getUid());
                break;
            case 3:
                if (pin.D3() == null) {
                    return null;
                }
                h32.u0 u0Var2 = h32.u0.PIN_BOARD;
                v7 D3 = pin.D3();
                return new Pair(u0Var2, D3 != null ? D3.getUid() : null);
            case 4:
                pair = new Pair(h32.u0.PIN_USER, b40.H(pin));
                break;
            case 5:
                pair = new Pair(h32.u0.PIN_USER, b40.C(pin));
                break;
            case 6:
                pair = new Pair(h32.u0.PIN_BOARD, b40.i(pin));
                break;
            case 7:
                return new Pair(h32.u0.PIN_USER, str);
            case 8:
                return null;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return pair;
    }

    public static void p1(bb1.i iVar, i92.k kVar) {
        iVar.f22511l0 = kVar;
    }

    public static final void q(om0.c0 c0Var, u2.q qVar, om0.f0 f0Var, float f13, i2.o oVar, int i13, int i14) {
        i2.s sVar = (i2.s) oVar;
        sVar.Y(758588984);
        if ((i14 & 2) != 0) {
            qVar = u2.n.f120041b;
        }
        if ((i14 & 4) != 0) {
            f0Var = null;
        }
        if ((i14 & 8) != 0) {
            f13 = 0.6666667f;
        }
        if (f0Var != null) {
            sVar.W(1019077144);
            k3.k(new om0.g0(c0Var.f96471b, c0Var.f96470a), f0Var, qVar, sVar, ((i13 << 3) & 896) | 72, 0);
            sVar.r(false);
        } else {
            sVar.W(1019262493);
            String str = c0Var.f96473d;
            float f14 = om0.h0.f96503a;
            u2.q qVar2 = qVar;
            om0.o0.a(str, qVar2, om0.h0.a(f13, 0, com.bumptech.glide.d.A(eo1.c.rounding_400, sVar), sVar, ((i13 >> 9) & 14) | 1572912, 52), 0.0f, sVar, i13 & RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER, 8);
            sVar.r(false);
        }
        i2.f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new ga0.b(c0Var, qVar, f0Var, f13, i13, i14, 4);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final p32.f q0(String meta) {
        Intrinsics.checkNotNullParameter(meta, "meta");
        switch (meta.hashCode()) {
            case -527074342:
                if (meta.equals("facebook_stories")) {
                    return p32.f.FACEBOOK_STORIES;
                }
                break;
            case -334016988:
                if (meta.equals("download_idea_pin")) {
                    return p32.f.NONE;
                }
                break;
            case 1268202694:
                if (meta.equals("instagram_stories")) {
                    return p32.f.INSTAGRAM_STORY;
                }
                break;
            case 1505434244:
                if (meta.equals("copy_link")) {
                    return p32.f.COPY_LINK;
                }
                break;
        }
        return e82.a0.a(meta);
    }

    public static void q1(PinItActivity pinItActivity, i92.k kVar) {
        pinItActivity.f34919d = kVar;
    }

    public static final void r(f7 state, u2.q qVar, i2.o oVar, int i13, int i14) {
        Intrinsics.checkNotNullParameter(state, "state");
        i2.s sVar = (i2.s) oVar;
        sVar.Y(-2093092515);
        if ((i14 & 2) != 0) {
            qVar = u2.n.f120041b;
        }
        b7.c.c(state.f111539a, qVar, androidx.compose.animation.a.c(null, 3), androidx.compose.animation.a.d(null, 3), null, q2.i.c(-1717126267, new i1.h(state, 7), sVar), sVar, (i13 & RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER) | 200064, 16);
        i2.f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new q1.l(i13, i14, 3, state, qVar);
        }
    }

    public static final r72.z1 r0(ke2.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Object obj = dVar.f79321c.get(Integer.MAX_VALUE);
        if (obj == null) {
            obj = null;
        }
        return (r72.z1) obj;
    }

    public static void r1(di1.g gVar, i92.k kVar) {
        gVar.f55065n0 = kVar;
    }

    public static final void s(om0.t0 t0Var, u2.q qVar, om0.f0 f0Var, float f13, om0.a1 a1Var, i2.o oVar, int i13, int i14) {
        float f14;
        int i15;
        i2.s sVar = (i2.s) oVar;
        sVar.Y(-478285087);
        u2.q qVar2 = (i14 & 2) != 0 ? u2.n.f120041b : qVar;
        om0.f0 f0Var2 = (i14 & 4) != 0 ? null : f0Var;
        if ((i14 & 8) != 0) {
            i15 = i13 & (-7169);
            f14 = com.bumptech.glide.d.A(eo1.c.space_100, sVar);
        } else {
            f14 = f13;
            i15 = i13;
        }
        om0.a1 a1Var2 = (i14 & 16) != 0 ? om0.a1.f96460f : a1Var;
        om0.a1 a1Var3 = a1Var2;
        rl2.g0.g(qVar2, null, androidx.compose.foundation.layout.b.b(com.bumptech.glide.d.A(eo1.c.space_400, sVar), 2), false, p1.l.g(f14), u2.b.f120023k, null, false, new sv.y(t0Var, f0Var2, a1Var2, 26), sVar, ((i15 >> 3) & 14) | 196608, RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_USE_CASE_MODULE_STORY_PIN);
        i2.f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new f4(t0Var, qVar2, f0Var2, f14, a1Var3, i13, i14, 7);
        }
    }

    public static final Integer s0(byte[] nalUnit, int i13, int i14) {
        Intrinsics.checkNotNullParameter(nalUnit, "nalUnit");
        int min = Integer.min(nalUnit.length, i14 + i13);
        int i15 = 16777215;
        while (i15 != 1) {
            if (i13 >= min) {
                return null;
            }
            int i16 = i13 + 1;
            byte b13 = nalUnit[i13];
            xk2.x xVar = xk2.y.f135237b;
            i15 = ((i15 << 8) & 16777215) | (b13 & 255);
            i13 = i16;
        }
        return Integer.valueOf(i13);
    }

    public static void s1(q91.d1 d1Var, i92.k kVar) {
        d1Var.f103092l0 = kVar;
    }

    public static final void t(om0.v0 v0Var, u2.q qVar, om0.f0 f0Var, int i13, float f13, float f14, Function1 function1, i2.o oVar, int i14, int i15) {
        om0.v0 v0Var2;
        Function1 function12;
        i2.s sVar = (i2.s) oVar;
        sVar.Y(1701313304);
        int i16 = i15 & 2;
        u2.n nVar = u2.n.f120041b;
        u2.q qVar2 = i16 != 0 ? nVar : qVar;
        om0.f0 f0Var2 = (i15 & 4) != 0 ? null : f0Var;
        int i17 = (i15 & 8) != 0 ? 3 : i13;
        float A = (i15 & 16) != 0 ? com.bumptech.glide.d.A(eo1.c.space_100, sVar) : f13;
        float f15 = (i15 & 32) != 0 ? 0.6666667f : f14;
        if ((i15 & 64) != 0) {
            function12 = om0.x0.f96615i;
            v0Var2 = v0Var;
        } else {
            v0Var2 = v0Var;
            function12 = function1;
        }
        List list = v0Var2.f96608a;
        int size = ((list.size() + i17) - 1) / i17;
        u2.q p13 = androidx.compose.foundation.layout.b.p(qVar2, A, 0.0f, 2);
        p1.y a13 = p1.x.a(p1.l.g(A), u2.b.f120025m, sVar, 0);
        int i18 = sVar.P;
        i2.z1 o13 = sVar.o();
        u2.q X = ao2.m0.X(sVar, p13);
        s3.k.Qo.getClass();
        s3.i iVar = s3.j.f110798b;
        boolean z13 = sVar.f71265a instanceof i2.f;
        if (!z13) {
            com.bumptech.glide.c.j0();
            throw null;
        }
        sVar.a0();
        u2.q qVar3 = qVar2;
        if (sVar.O) {
            sVar.n(iVar);
        } else {
            sVar.j0();
        }
        tb.f.f0(sVar, a13, s3.j.f110801e);
        tb.f.f0(sVar, o13, s3.j.f110800d);
        s3.h hVar = s3.j.f110802f;
        if (sVar.O || !Intrinsics.d(sVar.J(), Integer.valueOf(i18))) {
            ep.b.y(i18, sVar, i18, hVar);
        }
        tb.f.f0(sVar, X, s3.j.f110799c);
        int i19 = 0;
        while (i19 < size) {
            u2.q b13 = androidx.compose.foundation.layout.e.b(nVar, 1.0f);
            p1.e1 a14 = p1.c1.a(p1.l.g(A), u2.b.f120022j, sVar, 0);
            int i23 = sVar.P;
            i2.z1 o14 = sVar.o();
            u2.q X2 = ao2.m0.X(sVar, b13);
            s3.k.Qo.getClass();
            s3.i iVar2 = s3.j.f110798b;
            if (!z13) {
                com.bumptech.glide.c.j0();
                throw null;
            }
            sVar.a0();
            boolean z14 = z13;
            if (sVar.O) {
                sVar.n(iVar2);
            } else {
                sVar.j0();
            }
            tb.f.f0(sVar, a14, s3.j.f110801e);
            tb.f.f0(sVar, o14, s3.j.f110800d);
            s3.h hVar2 = s3.j.f110802f;
            if (sVar.O || !Intrinsics.d(sVar.J(), Integer.valueOf(i23))) {
                ep.b.y(i23, sVar, i23, hVar2);
            }
            tb.f.f0(sVar, X2, s3.j.f110799c);
            p1.g1 g1Var = p1.g1.f98514a;
            for (int i24 = 0; i24 < i17; i24++) {
                int i25 = (i19 * i17) + i24;
                if (i25 < list.size()) {
                    sVar.W(-1131006966);
                    om0.c0 c0Var = (om0.c0) list.get(i25);
                    q(c0Var, u2.L(g1Var.b(nVar, 1.0f, true), new om0.y0(function12, c0Var, 0), sVar), f0Var2, 0.0f, sVar, 520, 8);
                    sVar.r(false);
                } else {
                    sVar.W(-1130589148);
                    androidx.compose.foundation.layout.a.a(androidx.compose.foundation.layout.b.d(g1Var.b(nVar, 1.0f, true), f15), sVar);
                    sVar.r(false);
                }
            }
            sVar.r(true);
            i19++;
            z13 = z14;
        }
        sVar.r(true);
        i2.f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new om0.z0(v0Var, qVar3, f0Var2, i17, A, f15, function12, i14, i15);
        }
    }

    public static final long t0(x2.b bVar) {
        return com.bumptech.glide.c.d(bVar.f131580a.getX(), bVar.f131580a.getY());
    }

    public static void t1(q71.v0 v0Var, lh0.j3 j3Var) {
        v0Var.f102775a1 = j3Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void u(om0.e1 r23, u2.q r24, om0.f0 r25, om0.w0 r26, i2.o r27, int r28, int r29) {
        /*
            Method dump skipped, instructions count: 375
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kh2.b0.u(om0.e1, u2.q, om0.f0, om0.w0, i2.o, int, int):void");
    }

    public static final HashMap u0(String boardId, String templateId, p32.f fVar) {
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        Intrinsics.checkNotNullParameter(templateId, "templateId");
        HashMap o13 = bs1.c.o(new Pair("board_id", boardId), new Pair("template_id", templateId));
        if (fVar != null) {
            o13.put("invite_channel", String.valueOf(fVar.value()));
        }
        return o13;
    }

    public static void u1(q71.v0 v0Var, x02.l2 l2Var) {
        v0Var.U0 = l2Var;
    }

    public static final void v(om0.c1 state, u2.q qVar, om0.f0 f0Var, om0.s0 s0Var, i2.o oVar, int i13, int i14) {
        u2.q qVar2;
        boolean z13;
        boolean z14;
        Intrinsics.checkNotNullParameter(state, "state");
        i2.s sVar = (i2.s) oVar;
        sVar.Y(-1278996886);
        int i15 = i14 & 2;
        u2.n nVar = u2.n.f120041b;
        u2.q qVar3 = i15 != 0 ? nVar : qVar;
        om0.f0 f0Var2 = (i14 & 4) != 0 ? null : f0Var;
        om0.s0 s0Var2 = (i14 & 8) != 0 ? om0.s0.f96587c : s0Var;
        p1.g gVar = p1.l.f98543a;
        p1.y a13 = p1.x.a(p1.l.g(com.bumptech.glide.d.A(eo1.c.space_100, sVar)), u2.b.f120025m, sVar, 0);
        int i16 = sVar.P;
        i2.z1 o13 = sVar.o();
        u2.q X = ao2.m0.X(sVar, qVar3);
        s3.k.Qo.getClass();
        s3.i iVar = s3.j.f110798b;
        boolean z15 = sVar.f71265a instanceof i2.f;
        if (!z15) {
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
        tb.f.f0(sVar, a13, hVar);
        s3.h hVar2 = s3.j.f110800d;
        tb.f.f0(sVar, o13, hVar2);
        s3.h hVar3 = s3.j.f110802f;
        if (sVar.O || !Intrinsics.d(sVar.J(), Integer.valueOf(i16))) {
            ep.b.y(i16, sVar, i16, hVar3);
        }
        s3.h hVar4 = s3.j.f110799c;
        tb.f.f0(sVar, X, hVar4);
        sVar.W(1844155945);
        if (!kotlin.text.z.j((CharSequence) dl2.b.u2(state.f96475b, sVar))) {
            qVar2 = qVar3;
            u2.q r13 = androidx.compose.foundation.layout.b.r(nVar, com.bumptech.glide.d.A(eo1.c.space_400, sVar), 0.0f, 0.0f, 0.0f, 14);
            p1.e1 a14 = p1.c1.a(p1.l.f98548f, u2.b.f120023k, sVar, 54);
            int i17 = sVar.P;
            i2.z1 o14 = sVar.o();
            u2.q X2 = ao2.m0.X(sVar, r13);
            if (!z15) {
                com.bumptech.glide.c.j0();
                throw null;
            }
            sVar.a0();
            if (sVar.O) {
                sVar.n(iVar);
            } else {
                sVar.j0();
            }
            tb.f.f0(sVar, a14, hVar);
            tb.f.f0(sVar, o14, hVar2);
            if (sVar.O || !Intrinsics.d(sVar.J(), Integer.valueOf(i17))) {
                ep.b.y(i17, sVar, i17, hVar3);
            }
            tb.f.f0(sVar, X2, hVar4);
            rn1.a aVar = new rn1.a(state.f96475b, null, null, null, vn1.g.UI_400, 1, null, rn1.b.END, null, null, false, 0, null, null, null, false, null, null, 2096974);
            if (1.0f <= 0.0d) {
                throw new IllegalArgumentException(cb.h("invalid weight ", 1.0f, "; must be greater than zero").toString());
            }
            dl2.b.c(aVar, new LayoutWeightElement(ql2.s.c(1.0f, Float.MAX_VALUE), true), null, null, sVar, 8, 12);
            om1.c cVar = new om1.c(rm1.q.ARROW_FORWARD, om1.e.MD, om1.f.TRANSPARENT_DARK_GRAY, null, null, false, 0, 1016);
            sVar.W(1144509298);
            boolean z16 = (((i13 & 7168) ^ 3072) > 2048 && sVar.h(s0Var2)) || (i13 & 3072) == 2048;
            Object J2 = sVar.J();
            if (z16 || J2 == i2.n.f71185a) {
                J2 = new kl0.t(s0Var2, 10);
                sVar.g0(J2);
            }
            sVar.r(false);
            ig1.b.b(cVar, null, (Function1) J2, sVar, 8, 2);
            z13 = true;
            sVar.r(true);
        } else {
            qVar2 = qVar3;
            z13 = true;
        }
        sVar.r(false);
        om0.t0 t0Var = state.f96474a;
        if (t0Var.f96597b) {
            z14 = z13;
        } else {
            z14 = z13;
            s(t0Var, null, f0Var2, 0.0f, s0Var2.f96588a, sVar, 520, 10);
        }
        sVar.r(z14);
        i2.f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new l1.r((Object) state, qVar2, (Object) f0Var2, (Object) s0Var2, i13, i14, 20);
        }
    }

    public static final HashMap v0(SendableObject sendableObject, String str) {
        Intrinsics.checkNotNullParameter(sendableObject, "<this>");
        Intrinsics.checkNotNullParameter(sendableObject, "<this>");
        HashMap o13 = bs1.c.o(new Pair("board_id", sendableObject.d()));
        bs1.c.G1("template_id", str, o13);
        return o13;
    }

    public static void v1(di1.g gVar, z3 z3Var) {
        gVar.f55068q0 = z3Var;
    }

    public static final void w(om0.d1 state, u2.q qVar, om0.f0 f0Var, om0.u0 u0Var, i2.o oVar, int i13, int i14) {
        om0.u0 u0Var2;
        boolean z13;
        Intrinsics.checkNotNullParameter(state, "state");
        i2.s sVar = (i2.s) oVar;
        sVar.Y(-1146048880);
        int i15 = i14 & 2;
        u2.n nVar = u2.n.f120041b;
        u2.q qVar2 = i15 != 0 ? nVar : qVar;
        om0.f0 f0Var2 = (i14 & 4) != 0 ? null : f0Var;
        om0.u0 u0Var3 = (i14 & 8) != 0 ? om0.u0.f96603c : u0Var;
        p1.g gVar = p1.l.f98543a;
        p1.y a13 = p1.x.a(p1.l.g(com.bumptech.glide.d.A(eo1.c.space_100, sVar)), u2.b.f120025m, sVar, 0);
        int i16 = sVar.P;
        i2.z1 o13 = sVar.o();
        u2.q X = ao2.m0.X(sVar, qVar2);
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
        tb.f.f0(sVar, a13, hVar);
        s3.h hVar2 = s3.j.f110800d;
        tb.f.f0(sVar, o13, hVar2);
        s3.h hVar3 = s3.j.f110802f;
        if (sVar.O || !Intrinsics.d(sVar.J(), Integer.valueOf(i16))) {
            ep.b.y(i16, sVar, i16, hVar3);
        }
        s3.h hVar4 = s3.j.f110799c;
        tb.f.f0(sVar, X, hVar4);
        sVar.W(-359450789);
        boolean z15 = true;
        if (!kotlin.text.z.j((CharSequence) dl2.b.u2(state.f96480b, sVar))) {
            u2.q p13 = androidx.compose.foundation.layout.b.p(nVar, com.bumptech.glide.d.A(eo1.c.space_400, sVar), 0.0f, 2);
            p1.e1 a14 = p1.c1.a(p1.l.f98548f, u2.b.f120023k, sVar, 54);
            int i17 = sVar.P;
            i2.z1 o14 = sVar.o();
            u2.q X2 = ao2.m0.X(sVar, p13);
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
            tb.f.f0(sVar, a14, hVar);
            tb.f.f0(sVar, o14, hVar2);
            if (sVar.O || !Intrinsics.d(sVar.J(), Integer.valueOf(i17))) {
                ep.b.y(i17, sVar, i17, hVar3);
            }
            tb.f.f0(sVar, X2, hVar4);
            rn1.a aVar = new rn1.a(state.f96480b, null, null, null, vn1.g.UI_400, 1, null, rn1.b.END, null, null, false, 0, null, null, null, false, null, null, 2096974);
            if (1.0f <= 0.0d) {
                throw new IllegalArgumentException(cb.h("invalid weight ", 1.0f, "; must be greater than zero").toString());
            }
            dl2.b.c(aVar, new LayoutWeightElement(ql2.s.c(1.0f, Float.MAX_VALUE), true), null, null, sVar, 8, 12);
            if (!kotlin.text.z.j((CharSequence) dl2.b.u2(state.f96481c, sVar))) {
                yl1.b bVar = new yl1.b(state.f96481c, false, null, null, yl1.d.SECONDARY.getColorPalette(), yl1.c.SMALL, null, null, 0, null, 974);
                sVar.W(1423824097);
                boolean z16 = (((i13 & 7168) ^ 3072) > 2048 && sVar.h(u0Var3)) || (i13 & 3072) == 2048;
                Object J2 = sVar.J();
                if (z16 || J2 == i2.n.f71185a) {
                    J2 = new kl0.t(u0Var3, 11);
                    sVar.g0(J2);
                }
                sVar.r(false);
                rl2.g0.b(bVar, null, (Function1) J2, sVar, 8, 2);
            }
            z15 = true;
            sVar.r(true);
        }
        sVar.r(false);
        om0.v0 v0Var = state.f96479a;
        if (v0Var.f96609b) {
            u0Var2 = u0Var3;
            z13 = z15;
        } else {
            u0Var2 = u0Var3;
            t(v0Var, null, f0Var2, 0, 0.0f, 0.0f, u0Var3.f96604a, sVar, 520, 58);
            z13 = true;
        }
        sVar.r(z13);
        i2.f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new l1.r((Object) state, qVar2, (Object) f0Var2, (Object) u0Var2, i13, i14, 21);
        }
    }

    public static final View w0(Context context, ao2.j0 scope, nx.d0 pinalytics, uj2.q networkStateStream, c42.c cVar) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        switch (cVar == null ? -1 : com.pinterest.feature.todaytab.tab.view.p.f48739a[cVar.ordinal()]) {
            case 1:
                Intrinsics.checkNotNullParameter(context, "context");
                return new TodayTabHeroModule(context, null);
            case 2:
                Intrinsics.checkNotNullParameter(context, "context");
                return new TodayTabThreePinsCollectionModule(context, null);
            case 3:
                return new com.pinterest.feature.todaytab.tab.view.q(context, pinalytics, networkStateStream);
            case 4:
                Intrinsics.checkNotNullParameter(context, "context");
                return new TodayTabSingleVideoModule(context, null);
            case 5:
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(scope, "scope");
                Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
                return new com.pinterest.feature.todaytab.tab.view.o(context, pinalytics, scope);
            case 6:
                return new TodayTabCustomCoverModule(context);
            case 7:
                Intrinsics.checkNotNullParameter(context, "context");
                return new TodayTabSingleCreatorModule(context, null);
            default:
                return new EmptyView(context);
        }
    }

    public static void w1(td1.b bVar, u3 u3Var) {
        bVar.f117460h1 = u3Var;
    }

    public static final void x(uc0.h2 h2Var, i2.o oVar, int i13, int i14) {
        int i15;
        i2.s sVar = (i2.s) oVar;
        sVar.Y(-166727662);
        if ((i13 & 14) == 0) {
            i15 = (((i14 & 1) == 0 && sVar.h(h2Var)) ? 4 : 2) | i13;
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
                androidx.lifecycle.l1 v03 = c3.v0(uc0.h2.class, a13, V, a13 instanceof androidx.lifecycle.k ? ((androidx.lifecycle.k) a13).getDefaultViewModelCreationExtras() : u6.a.f120754b, sVar);
                sVar.r(false);
                sVar.r(false);
                h2Var = (uc0.h2) v03;
            }
            sVar.s();
            i2.q1 z13 = bs1.c.z(h2Var.f121825e, sVar);
            h2Var.i(new uc0.i(new oc0.a(q2.i.c(-762734518, new xb0.a(h2Var, 15), sVar))));
            gh0.b.d(((uc0.g2) z13.getValue()).f121786b, null, sVar, 8, 2);
        }
        i2.f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new yu.c(h2Var, i13, i14, 25);
        }
    }

    public static final vq0.h x0(nr0.t tVar, int i13, uk1.d presenterPinalytics, wa2.i pinFeatureConfig, qa2.n gridFeatureConfig, yk1.v viewResources) {
        Intrinsics.checkNotNullParameter(tVar, "<this>");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(pinFeatureConfig, "pinFeatureConfig");
        Intrinsics.checkNotNullParameter(gridFeatureConfig, "gridFeatureConfig");
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        Object obj = tVar.b(presenterPinalytics, pinFeatureConfig, gridFeatureConfig, viewResources).get(Integer.valueOf(i13));
        Intrinsics.f(obj);
        Object obj2 = ((wk2.a) obj).get();
        Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
        return (vq0.h) obj2;
    }

    public static void x1(p11.c cVar, is1.k0 k0Var) {
        cVar.f98641c0 = k0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void y(int r21, u2.q r22, int r23, kotlin.jvm.functions.Function0 r24, i2.o r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kh2.b0.y(int, u2.q, int, kotlin.jvm.functions.Function0, i2.o, int, int):void");
    }

    public static final v31.b y0(yk1.v resources, Function0 onCtaTapped, Function0 onBind) {
        int i13;
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(onCtaTapped, "onCtaTapped");
        Intrinsics.checkNotNullParameter(onBind, "onBind");
        Intrinsics.checkNotNullParameter(resources, "<this>");
        g92.d x03 = df.j1.x0(((yk1.a) resources).f139225b);
        Intrinsics.checkNotNullParameter(x03, "<this>");
        g92.d dVar = g92.d.CALICO;
        boolean z13 = x03 == dVar || x03 == g92.d.CALICO_0_0_1_BETA_7;
        if (z13) {
            Integer drawableRes = tm1.d.FISH.drawableRes(dVar, tm1.b.SPOT, tm1.a.RATIO_1_1);
            i13 = drawableRes != null ? drawableRes.intValue() : nz1.b.boards_add_collaborators_asset;
        } else {
            i13 = nz1.b.boards_add_collaborators_asset;
        }
        int i14 = i13;
        int i15 = z13 ? eo1.c.space_200 : eo1.c.space_900;
        int i16 = z13 ? nz1.f.profile_boards_empty_state_title_group_filter_calico : nz1.f.profile_boards_empty_state_title_group_filter;
        Resources resources2 = ((yk1.a) resources).f139224a;
        return new v31.b(i14, i15, resources2.getString(i16), resources2.getString(z13 ? nz1.f.profile_boards_empty_state_message_group_filter_calico : nz1.f.profile_boards_empty_state_message_group_filter), resources2.getString(nz1.f.profile_boards_empty_state_cta_label_group_filter), onCtaTapped, onBind);
    }

    public static final u2.q y1(i2.o oVar) {
        i2.s sVar = (i2.s) oVar;
        sVar.W(-863651756);
        u2.q p13 = androidx.compose.foundation.layout.b.p(u2.n.f120041b, com.bumptech.glide.d.A(eo1.c.space_200, sVar), 0.0f, 2);
        sVar.r(false);
        return p13;
    }

    public static final long z(float f13, float f14) {
        return (Float.floatToRawIntBits(f14) & 4294967295L) | (Float.floatToRawIntBits(f13) << 32);
    }

    public static final boolean z0(f30 f30Var) {
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        List Q6 = f30Var.Q6();
        if (Q6 == null) {
            return false;
        }
        Iterator it = Q6.iterator();
        while (it.hasNext()) {
            Boolean p13 = ((q11) it.next()).p();
            Intrinsics.checkNotNullExpressionValue(p13, "getIsStela(...)");
            if (p13.booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public static final boolean z1(Context context, lb0.q prefsManagerPersisted) {
        Intrinsics.checkNotNullParameter(prefsManagerPersisted, "prefsManagerPersisted");
        Intrinsics.checkNotNullParameter(context, "context");
        boolean a13 = ny1.x.f92714f.a(context);
        Activity k03 = bs1.c.k0(context);
        String[] strArr = qy1.d.f105359a;
        Set h10 = prefsManagerPersisted.h("PREF_APP_PERMISSION_REQUESTS", Collections.emptySet());
        return a13 || ((h10 != null && h10.contains("android.permission.READ_CONTACTS")) && !qy1.d.a(k03, "android.permission.READ_CONTACTS"));
    }
}
