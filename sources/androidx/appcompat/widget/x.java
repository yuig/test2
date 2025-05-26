package androidx.appcompat.widget;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.URLSpan;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.View;
import com.google.android.gms.internal.measurement.q4;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.pinterest.gestalt.text.GestaltText;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import kg.n;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import vq1.e;
import vq1.f;
import vq1.g;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public Object f16708a;

    /* renamed from: b, reason: collision with root package name */
    public Object f16709b;

    /* renamed from: c, reason: collision with root package name */
    public Object f16710c;

    /* renamed from: d, reason: collision with root package name */
    public Object f16711d;

    /* renamed from: e, reason: collision with root package name */
    public Object f16712e;

    /* renamed from: f, reason: collision with root package name */
    public Object f16713f;

    public /* synthetic */ x(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        this.f16708a = obj;
        this.f16709b = obj2;
        this.f16710c = obj3;
        this.f16711d = obj4;
        this.f16712e = obj5;
        this.f16713f = obj6;
    }

    public static void B(Drawable drawable, int i13, PorterDuff.Mode mode) {
        Drawable mutate = drawable.mutate();
        if (mode == null) {
            mode = y.f16734b;
        }
        mutate.setColorFilter(y.c(i13, mode));
    }

    public static void a(x this$0, String url) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(url, "url");
        ((nx.d0) this$0.f16708a).X(h32.u0.TOS_BUTTON);
        ((vy.m) this$0.f16710c).a("tos_button_click");
        ((vq1.e) ((vq1.f) ((xk2.k) this$0.f16713f).getValue())).a(url);
    }

    public static h7.s b(DataInputStream dataInputStream) {
        int readInt = dataInputStream.readInt();
        HashMap hashMap = new HashMap();
        for (int i13 = 0; i13 < readInt; i13++) {
            String readUTF = dataInputStream.readUTF();
            int readInt2 = dataInputStream.readInt();
            if (readInt2 < 0) {
                throw new IOException(a.a.d("Invalid value size: ", readInt2));
            }
            int min = Math.min(readInt2, 10485760);
            byte[] bArr = d7.n0.f53868c;
            int i14 = 0;
            while (i14 != readInt2) {
                int i15 = i14 + min;
                bArr = Arrays.copyOf(bArr, i15);
                dataInputStream.readFully(bArr, i14, min);
                min = Math.min(readInt2 - i15, 10485760);
                i14 = i15;
            }
            hashMap.put(readUTF, bArr);
        }
        return new h7.s(hashMap);
    }

    public static void c(h7.s sVar, DataOutputStream dataOutputStream) {
        Set<Map.Entry> entrySet = sVar.f67929b.entrySet();
        dataOutputStream.writeInt(entrySet.size());
        for (Map.Entry entry : entrySet) {
            dataOutputStream.writeUTF((String) entry.getKey());
            byte[] bArr = (byte[]) entry.getValue();
            dataOutputStream.writeInt(bArr.length);
            dataOutputStream.write(bArr);
        }
    }

    public static boolean d(int[] iArr, int i13) {
        for (int i14 : iArr) {
            if (i14 == i13) {
                return true;
            }
        }
        return false;
    }

    public static ColorStateList f(Context context, int i13) {
        int c13 = x2.c(context, i.a.colorControlHighlight);
        return new ColorStateList(new int[][]{x2.f16728b, x2.f16730d, x2.f16729c, x2.f16732f}, new int[]{x2.b(context, i.a.colorButtonNormal), f5.c.g(c13, i13), f5.c.g(c13, i13), i13});
    }

    public static ColorStateList g(Context context) {
        return f(context, x2.c(context, i.a.colorAccent));
    }

    public static ColorStateList h(Context context) {
        return f(context, x2.c(context, i.a.colorButtonNormal));
    }

    public static ColorStateList i(Context context) {
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList d2 = x2.d(context, i.a.colorSwitchThumbNormal);
        if (d2 == null || !d2.isStateful()) {
            iArr[0] = x2.f16728b;
            iArr2[0] = x2.b(context, i.a.colorSwitchThumbNormal);
            iArr[1] = x2.f16731e;
            iArr2[1] = x2.c(context, i.a.colorControlActivated);
            iArr[2] = x2.f16732f;
            iArr2[2] = x2.c(context, i.a.colorSwitchThumbNormal);
        } else {
            int[] iArr3 = x2.f16728b;
            iArr[0] = iArr3;
            iArr2[0] = d2.getColorForState(iArr3, 0);
            iArr[1] = x2.f16731e;
            iArr2[1] = x2.c(context, i.a.colorControlActivated);
            iArr[2] = x2.f16732f;
            iArr2[2] = d2.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    public static LayerDrawable n(e2 e2Var, Context context, int i13) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i13);
        Drawable g13 = e2Var.g(context, i.e.abc_star_black_48dp);
        Drawable g14 = e2Var.g(context, i.e.abc_star_half_black_48dp);
        if ((g13 instanceof BitmapDrawable) && g13.getIntrinsicWidth() == dimensionPixelSize && g13.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) g13;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            g13.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            g13.draw(canvas);
            bitmapDrawable = new BitmapDrawable(createBitmap);
            bitmapDrawable2 = new BitmapDrawable(createBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((g14 instanceof BitmapDrawable) && g14.getIntrinsicWidth() == dimensionPixelSize && g14.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) g14;
        } else {
            Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap2);
            g14.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            g14.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(createBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, R.id.background);
        layerDrawable.setId(1, R.id.secondaryProgress);
        layerDrawable.setId(2, R.id.progress);
        return layerDrawable;
    }

    public final void A(int i13) {
        if (i13 < 12 || i13 > 16) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; IV size must be between 12 and 16 bytes", Integer.valueOf(i13)));
        }
        this.f16710c = Integer.valueOf(i13);
    }

    public final void C(int i13) {
        if (i13 < 10) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", Integer.valueOf(i13)));
        }
        this.f16711d = Integer.valueOf(i13);
    }

    public final Task D(String str, String str2, Bundle bundle) {
        int i13;
        int i14;
        PackageInfo packageInfo;
        try {
            y(str, str2, bundle);
            hh.a aVar = (hh.a) this.f16710c;
            j6.b bVar = aVar.f69096c;
            synchronized (bVar) {
                if (bVar.f74793a == 0) {
                    try {
                        packageInfo = ph.b.a((Context) bVar.f74795c).d(0, "com.google.android.gms");
                    } catch (PackageManager.NameNotFoundException e13) {
                        String valueOf = String.valueOf(e13);
                        StringBuilder sb3 = new StringBuilder(valueOf.length() + 23);
                        sb3.append("Failed to find package ");
                        sb3.append(valueOf);
                        Log.w("Metadata", sb3.toString());
                        packageInfo = null;
                    }
                    if (packageInfo != null) {
                        bVar.f74793a = packageInfo.versionCode;
                    }
                }
                i13 = bVar.f74793a;
            }
            if (i13 < 12000000) {
                return aVar.f69096c.e() != 0 ? aVar.a(bundle).continueWithTask(hh.o.f69132a, new q4(26, aVar, bundle)) : Tasks.forException(new IOException("MISSING_INSTANCEID_SERVICE"));
            }
            hh.k b13 = hh.k.b(aVar.f69095b);
            synchronized (b13) {
                i14 = b13.f69123a;
                b13.f69123a = i14 + 1;
            }
            return b13.c(new hh.j(i14, 1, bundle)).continueWith(hh.o.f69132a, hh.l.f69127a);
        } catch (InterruptedException | ExecutionException e14) {
            return Tasks.forException(e14);
        }
    }

    public final void E() {
        ((h7.q) this.f16712e).c((HashMap) this.f16708a);
        int size = ((SparseBooleanArray) this.f16710c).size();
        for (int i13 = 0; i13 < size; i13++) {
            ((SparseArray) this.f16709b).remove(((SparseBooleanArray) this.f16710c).keyAt(i13));
        }
        ((SparseBooleanArray) this.f16710c).clear();
        ((SparseBooleanArray) this.f16711d).clear();
    }

    public final vk.l e() {
        if (((Integer) this.f16708a) == null) {
            throw new GeneralSecurityException("AES key size is not set");
        }
        if (((Integer) this.f16709b) == null) {
            throw new GeneralSecurityException("HMAC key size is not set");
        }
        if (((Integer) this.f16710c) == null) {
            throw new GeneralSecurityException("iv size is not set");
        }
        Integer num = (Integer) this.f16711d;
        if (num == null) {
            throw new GeneralSecurityException("tag size is not set");
        }
        if (((vk.j) this.f16712e) == null) {
            throw new GeneralSecurityException("hash type is not set");
        }
        if (((vk.k) this.f16713f) == null) {
            throw new GeneralSecurityException("variant is not set");
        }
        int intValue = num.intValue();
        vk.j jVar = (vk.j) this.f16712e;
        if (jVar == vk.j.f125965b) {
            if (intValue > 20) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num));
            }
        } else if (jVar == vk.j.f125966c) {
            if (intValue > 28) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num));
            }
        } else if (jVar == vk.j.f125967d) {
            if (intValue > 32) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num));
            }
        } else if (jVar == vk.j.f125968e) {
            if (intValue > 48) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num));
            }
        } else {
            if (jVar != vk.j.f125969f) {
                throw new GeneralSecurityException("unknown hash type; must be SHA1, SHA224, SHA256, SHA384 or SHA512");
            }
            if (intValue > 64) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num));
            }
        }
        return new vk.l(((Integer) this.f16708a).intValue(), ((Integer) this.f16709b).intValue(), ((Integer) this.f16710c).intValue(), ((Integer) this.f16711d).intValue(), (vk.k) this.f16713f, (vk.j) this.f16712e);
    }

    public final Task j(Task task) {
        return task.continueWith(new o.a(8), new com.google.firebase.messaging.a0(this, 12));
    }

    public final void k() {
        String userId = (String) this.f16713f;
        oc.c apolloClient = (oc.c) this.f16710c;
        q12.b conversationService = (q12.b) this.f16709b;
        fv1.b notificationCount = (fv1.b) this.f16712e;
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(apolloClient, "apolloClient");
        Intrinsics.checkNotNullParameter(conversationService, "conversationService");
        Intrinsics.checkNotNullParameter(notificationCount, "notificationCount");
        ((e82.n) this.f16708a).getClass();
        e82.n.a(userId, apolloClient, conversationService, notificationCount);
    }

    public final h7.n l(String str) {
        return (h7.n) ((HashMap) this.f16708a).get(str);
    }

    public final h7.n m(String str) {
        h7.n nVar = (h7.n) ((HashMap) this.f16708a).get(str);
        if (nVar != null) {
            return nVar;
        }
        SparseArray sparseArray = (SparseArray) this.f16709b;
        int size = sparseArray.size();
        int i13 = 0;
        int keyAt = size == 0 ? 0 : sparseArray.keyAt(size - 1) + 1;
        if (keyAt < 0) {
            while (i13 < size && i13 == sparseArray.keyAt(i13)) {
                i13++;
            }
            keyAt = i13;
        }
        h7.n nVar2 = new h7.n(keyAt, str, h7.s.f67927c);
        ((HashMap) this.f16708a).put(str, nVar2);
        ((SparseArray) this.f16709b).put(keyAt, str);
        ((SparseBooleanArray) this.f16711d).put(keyAt, true);
        ((h7.q) this.f16712e).f(nVar2);
        return nVar2;
    }

    public final ColorStateList o(Context context, int i13) {
        if (i13 == i.e.abc_edit_text_material) {
            return d5.a.b(context, i.c.abc_tint_edittext);
        }
        if (i13 == i.e.abc_switch_track_mtrl_alpha) {
            return d5.a.b(context, i.c.abc_tint_switch_track);
        }
        if (i13 == i.e.abc_switch_thumb_material) {
            return i(context);
        }
        if (i13 == i.e.abc_btn_default_mtrl_shape) {
            return h(context);
        }
        if (i13 == i.e.abc_btn_borderless_material) {
            return f(context, 0);
        }
        if (i13 == i.e.abc_btn_colored_material) {
            return g(context);
        }
        if (i13 == i.e.abc_spinner_mtrl_am_alpha || i13 == i.e.abc_spinner_textfield_background_material) {
            return d5.a.b(context, i.c.abc_tint_spinner);
        }
        if (d((int[]) this.f16709b, i13)) {
            return x2.d(context, i.a.colorControlNormal);
        }
        if (d((int[]) this.f16712e, i13)) {
            return d5.a.b(context, i.c.abc_tint_default);
        }
        if (d((int[]) this.f16713f, i13)) {
            return d5.a.b(context, i.c.abc_tint_btn_checkable);
        }
        if (i13 == i.e.abc_seekbar_thumb_material) {
            return d5.a.b(context, i.c.abc_tint_seek_thumb);
        }
        return null;
    }

    public final void p(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        e82.j jVar = (e82.j) this.f16708a;
        nx.d0 pinalytics = (nx.d0) this.f16712e;
        m60.w eventManager = (m60.w) this.f16713f;
        i92.k toastUtils = (i92.k) this.f16710c;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(toastUtils, "toastUtils");
        if (uri.getHost() != null) {
            String host = uri.getHost();
            Intrinsics.f(host);
            if (StringsKt.E(host, "pinterest.com", false) && Intrinsics.d("etsy", uri.getQueryParameter("auth"))) {
                String queryParameter = uri.getQueryParameter("oauth_token");
                if (queryParameter == null) {
                    queryParameter = "";
                }
                String str = jVar.f57880f;
                String queryParameter2 = uri.getQueryParameter("oauth_verifier");
                jVar.f57879e.a(queryParameter, str, queryParameter2 != null ? queryParameter2 : "").e().l(wj2.c.a()).r(tk2.e.f118017c).o(new or1.j(26, new et1.t0(pinalytics, jVar, eventManager, toastUtils, 2)), new or1.j(27, new e82.h(eventManager, 1)));
            }
        }
    }

    public final void q(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        e82.p pVar = (e82.p) this.f16709b;
        nx.d0 pinalytics = (nx.d0) this.f16712e;
        m60.w eventManager = (m60.w) this.f16713f;
        pVar.getClass();
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        if (uri.getHost() != null) {
            String host = uri.getHost();
            Intrinsics.f(host);
            int i13 = 0;
            if (StringsKt.E(host, "pinterest.com", false) && "/connect/instagram/".equals(uri.getPath()) && uri.getQueryParameter("code") != null) {
                eventManager.d(new e82.y());
                pVar.f57890b.c(e82.p.a(uri), n00.b.a(n00.c.INSTAGRAM_CONNECT)).r(tk2.e.f118017c).l(wj2.c.a()).o(new e82.o(i13, new gw1.i(26, eventManager, pinalytics)), new e82.o(1, new e82.h(eventManager, 3)));
            }
        }
    }

    public final void r(GestaltText termsAndPrivacyTv, vq1.h tosType, boolean z13) {
        String str;
        String string;
        ListIterator listIterator;
        Intrinsics.checkNotNullParameter(termsAndPrivacyTv, "termsAndPrivacyTv");
        Intrinsics.checkNotNullParameter(tosType, "tosType");
        String terms = ((androidx.appcompat.app.n) this.f16709b).getString(tosType.getTosStringRes());
        Intrinsics.checkNotNullExpressionValue(terms, "getString(...)");
        String policy = ((androidx.appcompat.app.n) this.f16709b).getString(yr1.c.signup_wall_privacy_policy);
        Intrinsics.checkNotNullExpressionValue(policy, "getString(...)");
        String noticeAtCollection = ((androidx.appcompat.app.n) this.f16709b).getString(yr1.c.unauth_landing_notice_at_collection);
        Intrinsics.checkNotNullExpressionValue(noticeAtCollection, "getString(...)");
        String deleteYourAccount = ((androidx.appcompat.app.n) this.f16709b).getString(yr1.c.unauth_landing_delete_your_account);
        Intrinsics.checkNotNullExpressionValue(deleteYourAccount, "getString(...)");
        String personalizedAds = ((androidx.appcompat.app.n) this.f16709b).getString(yr1.c.unauth_landing_personalized_ads);
        Intrinsics.checkNotNullExpressionValue(personalizedAds, "getString(...)");
        Intrinsics.checkNotNullParameter(terms, "terms");
        Intrinsics.checkNotNullParameter(policy, "policy");
        Intrinsics.checkNotNullParameter(noticeAtCollection, "noticeAtCollection");
        Intrinsics.checkNotNullParameter(deleteYourAccount, "deleteYourAccount");
        Intrinsics.checkNotNullParameter(personalizedAds, "personalizedAds");
        if (((fr1.c) this.f16711d).d(t92.c.US_FL_SIGNUP_CONSENT)) {
            str = "noticeAtCollection";
            string = ((androidx.appcompat.app.n) this.f16709b).getString(z13 ? yr1.c.unauth_landing_privacy_tos_florida : yr1.c.account_conversion_privacy_tos_florida, terms, policy, noticeAtCollection, deleteYourAccount);
        } else {
            str = "noticeAtCollection";
            if (((fr1.c) this.f16711d).d(t92.c.IT_SIGNUP_CONSENT)) {
                string = ((androidx.appcompat.app.n) this.f16709b).getString(z13 ? yr1.c.unauth_landing_privacy_tos_italy : yr1.c.account_conversion_privacy_tos_italy, terms, policy, personalizedAds, noticeAtCollection);
            } else {
                string = ((androidx.appcompat.app.n) this.f16709b).getString(z13 ? yr1.c.unauth_landing_privacy_tos : yr1.c.account_conversion_privacy_tos, terms, policy, noticeAtCollection);
            }
        }
        Intrinsics.f(string);
        yk2.b bVar = new yk2.b();
        String string2 = ((androidx.appcompat.app.n) this.f16709b).getString(tosType.getTosStringRes());
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        String string3 = ((androidx.appcompat.app.n) this.f16709b).getString(tosType.getTosLinkRes());
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        bVar.add(new vq1.g(string2, string3, new vq1.e(this, 0)));
        String string4 = ((androidx.appcompat.app.n) this.f16709b).getString(yr1.c.url_privacy_policy);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        bVar.add(new vq1.g(policy, string4, (vq1.f) ((xk2.k) this.f16713f).getValue()));
        String string5 = ((androidx.appcompat.app.n) this.f16709b).getString(yr1.c.url_notice_at_collection);
        Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
        bVar.add(new vq1.g(noticeAtCollection, string5, (vq1.f) ((xk2.k) this.f16713f).getValue()));
        String string6 = ((androidx.appcompat.app.n) this.f16709b).getString(yr1.c.url_account_deletion_article);
        Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
        bVar.add(new vq1.g(deleteYourAccount, string6, (vq1.f) ((xk2.k) this.f16713f).getValue()));
        String string7 = ((androidx.appcompat.app.n) this.f16709b).getString(yr1.c.url_privacy_policy);
        Intrinsics.checkNotNullExpressionValue(string7, "getString(...)");
        bVar.add(new vq1.g(personalizedAds, string7, (vq1.f) ((xk2.k) this.f16713f).getValue()));
        yk2.b a13 = kotlin.collections.e0.a(bVar);
        SpannableStringBuilder decoratedTerms = new SpannableStringBuilder(string);
        ListIterator listIterator2 = a13.listIterator(0);
        while (true) {
            s2.y yVar = (s2.y) listIterator2;
            if (!yVar.hasNext()) {
                break;
            }
            final vq1.g gVar = (vq1.g) yVar.next();
            gVar.getClass();
            Intrinsics.checkNotNullParameter(decoratedTerms, "original");
            String str2 = gVar.f126443a;
            if (StringsKt.E(decoratedTerms, str2, false)) {
                int L = StringsKt.L(decoratedTerms, str2, 0, false, 6);
                int length = str2.length() + L;
                listIterator = listIterator2;
                final String str3 = gVar.f126444b;
                decoratedTerms.setSpan(new URLSpan(str3) { // from class: com.pinterest.identity.TermsAndPrivacyHelper$TOSLinkDecorator$applyDecoration$1
                    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
                    public final void onClick(View widget) {
                        n.a(widget);
                        Intrinsics.checkNotNullParameter(widget, "widget");
                        f fVar = g.this.f126445c;
                        String url = getURL();
                        Intrinsics.checkNotNullExpressionValue(url, "getURL(...)");
                        ((e) fVar).a(url);
                    }
                }, L, length, 0);
            } else {
                listIterator = listIterator2;
            }
            listIterator2 = listIterator;
        }
        termsAndPrivacyTv.i(new hk1.t(decoratedTerms, 17));
        Intrinsics.checkNotNullParameter(tosType, "tosType");
        Intrinsics.checkNotNullParameter(termsAndPrivacyTv, "termsAndPrivacyTv");
        Intrinsics.checkNotNullParameter(terms, "terms");
        Intrinsics.checkNotNullParameter(policy, "policy");
        Intrinsics.checkNotNullParameter(noticeAtCollection, str);
        Intrinsics.checkNotNullParameter(deleteYourAccount, "deleteYourAccount");
        Intrinsics.checkNotNullParameter(decoratedTerms, "decoratedTerms");
        Intrinsics.checkNotNullParameter(personalizedAds, "personalizedAds");
        String string8 = ((androidx.appcompat.app.n) this.f16709b).getString(tosType.getTosAccessibilityRes());
        Intrinsics.checkNotNullExpressionValue(string8, "getString(...)");
        String string9 = ((androidx.appcompat.app.n) this.f16709b).getString(yr1.c.accessibility_signup_wall_privacy_policy);
        Intrinsics.checkNotNullExpressionValue(string9, "getString(...)");
        String string10 = ((androidx.appcompat.app.n) this.f16709b).getString(yr1.c.accessibility_unauth_landing_notice_at_collection);
        Intrinsics.checkNotNullExpressionValue(string10, "getString(...)");
        String string11 = ((androidx.appcompat.app.n) this.f16709b).getString(yr1.c.accessibility_unauth_landing_delete_your_account);
        Intrinsics.checkNotNullExpressionValue(string11, "getString(...)");
        String string12 = ((androidx.appcompat.app.n) this.f16709b).getString(yr1.c.accessibility_unauth_landing_personalized_ads);
        Intrinsics.checkNotNullExpressionValue(string12, "getString(...)");
        if (((fr1.c) this.f16711d).d(t92.c.US_FL_SIGNUP_CONSENT)) {
            q5.v0.o(termsAndPrivacyTv, new ko1.b(termsAndPrivacyTv, kotlin.collections.f0.j(terms, policy, noticeAtCollection, deleteYourAccount), kotlin.collections.f0.j(string8, string9, string10, string11), decoratedTerms));
        } else if (((fr1.c) this.f16711d).d(t92.c.IT_SIGNUP_CONSENT)) {
            q5.v0.o(termsAndPrivacyTv, new ko1.b(termsAndPrivacyTv, kotlin.collections.f0.j(terms, policy, personalizedAds, noticeAtCollection), kotlin.collections.f0.j(string8, string9, string12, string10), decoratedTerms));
        } else {
            q5.v0.o(termsAndPrivacyTv, new ko1.b(termsAndPrivacyTv, kotlin.collections.f0.j(terms, policy, noticeAtCollection), kotlin.collections.f0.j(string8, string9, string10), decoratedTerms));
        }
    }

    public final void s(long j13) {
        h7.q qVar;
        ((h7.q) this.f16712e).d(j13);
        h7.q qVar2 = (h7.q) this.f16713f;
        if (qVar2 != null) {
            qVar2.d(j13);
        }
        if (((h7.q) this.f16712e).b() || (qVar = (h7.q) this.f16713f) == null || !qVar.b()) {
            ((h7.q) this.f16712e).g((HashMap) this.f16708a, (SparseArray) this.f16709b);
        } else {
            ((h7.q) this.f16713f).g((HashMap) this.f16708a, (SparseArray) this.f16709b);
            ((h7.q) this.f16712e).e((HashMap) this.f16708a);
        }
        h7.q qVar3 = (h7.q) this.f16713f;
        if (qVar3 != null) {
            qVar3.h();
            this.f16713f = null;
        }
    }

    public final void t(String str) {
        h7.n nVar = (h7.n) ((HashMap) this.f16708a).get(str);
        if (nVar != null && nVar.f67912c.isEmpty() && nVar.f67913d.isEmpty()) {
            ((HashMap) this.f16708a).remove(str);
            SparseBooleanArray sparseBooleanArray = (SparseBooleanArray) this.f16711d;
            int i13 = nVar.f67910a;
            boolean z13 = sparseBooleanArray.get(i13);
            ((h7.q) this.f16712e).a(nVar, z13);
            if (z13) {
                ((SparseArray) this.f16709b).remove(i13);
                ((SparseBooleanArray) this.f16711d).delete(i13);
            } else {
                ((SparseArray) this.f16709b).put(i13, null);
                ((SparseBooleanArray) this.f16710c).put(i13, true);
            }
        }
    }

    public final void u() {
        String[] strArr = {"utm_source", "utm_medium", "utm_campaign", "amp_client_id", "app_upsell_type"};
        for (int i13 = 0; i13 < 5; i13++) {
            String str = strArr[i13];
            Object obj = this.f16712e;
            if (((nm.u) obj) != null && ((nm.u) obj).v(str) != null) {
                ((HashMap) this.f16709b).put(str, ((nm.u) this.f16712e).v(str).p());
            }
        }
        Object obj2 = this.f16712e;
        if (((nm.u) obj2) == null || ((nm.u) obj2).v("install_id") == null) {
            return;
        }
        ((HashMap) this.f16709b).put("mweb_unauth_id", ((nm.u) this.f16712e).v("install_id").p());
    }

    public final void v(String str) {
        if (str != null) {
            ((vy.m) this.f16711d).k("DL_".concat(str), new HashMap());
        }
    }

    public final void w(Activity activity, e82.w network) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(network, "network");
        int i13 = e82.b0.f57820a[network.ordinal()];
        if (i13 == 1) {
            lb2.q qVar = (lb2.q) this.f16711d;
            lr1.h hVar = lr1.h.FacebookLoginMethod;
            Intrinsics.checkNotNullParameter(activity, "activity");
            qVar.f(hVar, new mr1.b(activity)).o(new e82.b(8, new gw1.i(27, this, activity)), new e82.b(9, e82.i.f57870m));
            return;
        }
        if (i13 != 2) {
            if (i13 != 3) {
                network.toString();
                return;
            }
            e82.p pVar = (e82.p) this.f16709b;
            pVar.getClass();
            Intrinsics.checkNotNullParameter(activity, "activity");
            Uri build = Uri.parse("https://api.instagram.com/oauth/authorize/?").buildUpon().appendQueryParameter("client_id", "883512507085515").appendQueryParameter("scope", "instagram_business_basic").appendQueryParameter("redirect_uri", "https://pinterest.com/connect/instagram/").appendQueryParameter("response_type", "code").build();
            Intrinsics.f(build);
            ((lu1.c) pVar.f57889a).s(activity, build, null);
            return;
        }
        e82.j jVar = (e82.j) this.f16708a;
        m60.w eventManager = (m60.w) this.f16713f;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        jVar.f57876b.f131564a.h().l(wj2.c.a()).r(tk2.e.f118017c).o(new e82.b(5, new gw1.i(25, jVar, activity)), new e82.b(6, new e82.h(eventManager, 0)));
    }

    public final void x(int i13) {
        if (i13 != 16 && i13 != 24 && i13 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i13)));
        }
        this.f16708a = Integer.valueOf(i13);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00fc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0141 A[ADDED_TO_REGION, ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void y(java.lang.String r4, java.lang.String r5, android.os.Bundle r6) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.x.y(java.lang.String, java.lang.String, android.os.Bundle):void");
    }

    public final void z(int i13) {
        if (i13 < 16) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; HMAC key must be at least 16 bytes", Integer.valueOf(i13)));
        }
        this.f16709b = Integer.valueOf(i13);
    }

    public x(int i13) {
        if (i13 != 3) {
            this.f16708a = new int[]{i.e.abc_textfield_search_default_mtrl_alpha, i.e.abc_textfield_default_mtrl_alpha, i.e.abc_ab_share_pack_mtrl_alpha};
            this.f16709b = new int[]{i.e.abc_ic_commit_search_api_mtrl_alpha, i.e.abc_seekbar_tick_mark_material, i.e.abc_ic_menu_share_mtrl_alpha, i.e.abc_ic_menu_copy_mtrl_am_alpha, i.e.abc_ic_menu_cut_mtrl_alpha, i.e.abc_ic_menu_selectall_mtrl_alpha, i.e.abc_ic_menu_paste_mtrl_am_alpha};
            this.f16710c = new int[]{i.e.abc_textfield_activated_mtrl_alpha, i.e.abc_textfield_search_activated_mtrl_alpha, i.e.abc_cab_background_top_mtrl_alpha, i.e.abc_text_cursor_material, i.e.abc_text_select_handle_left_mtrl, i.e.abc_text_select_handle_middle_mtrl, i.e.abc_text_select_handle_right_mtrl};
            this.f16711d = new int[]{i.e.abc_popup_background_mtrl_mult, i.e.abc_cab_background_internal_bg, i.e.abc_menu_hardkey_panel_mtrl_mult};
            this.f16712e = new int[]{i.e.abc_tab_indicator_material, i.e.abc_textfield_search_material};
            this.f16713f = new int[]{i.e.abc_btn_check_material, i.e.abc_btn_radio_material, i.e.abc_btn_check_material_anim, i.e.abc_btn_radio_material_anim};
            return;
        }
        this.f16708a = null;
        this.f16709b = null;
        this.f16710c = null;
        this.f16711d = null;
        this.f16712e = null;
        this.f16713f = vk.k.f125975d;
    }
}
