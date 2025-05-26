package x92;

import android.R;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Parcel;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.widget.RemoteViews;
import androidx.appcompat.widget.l0;
import androidx.appcompat.widget.y;
import androidx.constraintlayout.widget.f;
import androidx.lifecycle.l1;
import androidx.lifecycle.p1;
import androidx.lifecycle.r1;
import androidx.lifecycle.t1;
import androidx.recyclerview.widget.c3;
import c5.u;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.google.android.gms.common.api.internal.o;
import com.google.android.gms.internal.recaptcha.q1;
import com.google.android.gms.internal.recaptcha.r;
import com.google.android.gms.recaptcha.RecaptchaAction;
import com.google.android.gms.recaptcha.RecaptchaHandle;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.board.collab.service.BoardActionService;
import com.pinterest.framework.screens.s;
import com.pinterest.framework.screens.w;
import df.j1;
import e0.t;
import e5.n;
import fk2.l;
import fk2.x;
import hs1.q;
import ja.d0;
import ja.i;
import java.lang.reflect.Constructor;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b1;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import o7.j0;
import pc.p0;
import pc.q0;
import pd.g0;
import pk.a0;
import so.r6;
import tb0.p;
import u4.g;
import u4.h;
import u6.e;
import uz1.k;
import uz1.m;
import vb0.j;
import wd.v;
import x02.x0;
import x40.ai;
import x40.fe;
import x40.me;
import x40.t0;

/* loaded from: classes2.dex */
public final class b implements v, zd.a, p5.d, o, kk.o {

    /* renamed from: a */
    public final /* synthetic */ int f134364a;

    /* renamed from: b */
    public Object f134365b;

    /* renamed from: c */
    public Object f134366c;

    /* renamed from: d */
    public Object f134367d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b() {
        this(19);
        this.f134364a = 19;
    }

    public static b M(Context context, AttributeSet attributeSet, int[] iArr) {
        return new b(1, context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static b N(Context context, AttributeSet attributeSet, int[] iArr, int i13, int i14) {
        return new b(1, context, context.obtainStyledAttributes(attributeSet, iArr, i13, i14));
    }

    public static /* synthetic */ s r(b bVar, ViewGroup viewGroup, ml1.d dVar, int i13, boolean z13, int i14) {
        gi2.b bVar2 = w.f49239a;
        if ((i14 & 8) != 0) {
            i13 = 3;
        }
        int i15 = i13;
        if ((i14 & 16) != 0) {
            z13 = false;
        }
        return bVar.q(viewGroup, dVar, bVar2, i15, z13);
    }

    public final Typeface A(int i13, int i14, l0 l0Var) {
        int resourceId = ((TypedArray) this.f134366c).getResourceId(i13, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.f134367d) == null) {
            this.f134367d = new TypedValue();
        }
        Context context = (Context) this.f134365b;
        TypedValue typedValue = (TypedValue) this.f134367d;
        ThreadLocal threadLocal = n.f57243a;
        if (context.isRestricted()) {
            return null;
        }
        return n.b(context, resourceId, typedValue, i14, l0Var, true, false);
    }

    public final int B(int i13, int i14) {
        return ((TypedArray) this.f134366c).getInt(i13, i14);
    }

    public final int C(int i13, int i14) {
        return ((TypedArray) this.f134366c).getResourceId(i13, i14);
    }

    public final String D(int i13) {
        return ((TypedArray) this.f134366c).getString(i13);
    }

    public final CharSequence E(int i13) {
        return ((TypedArray) this.f134366c).getText(i13);
    }

    public final l1 F(String key, rl2.d modelClass) {
        l1 b13;
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(key, "key");
        t1 t1Var = (t1) this.f134365b;
        t1Var.getClass();
        Intrinsics.checkNotNullParameter(key, "key");
        l1 l1Var = (l1) t1Var.f18690a.get(key);
        if (modelClass.b(l1Var)) {
            Object obj = (p1) this.f134366c;
            if (obj instanceof r1) {
                Intrinsics.f(l1Var);
                ((r1) obj).d(l1Var);
            }
            Intrinsics.g(l1Var, "null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.ViewModelProviderImpl.getViewModel");
            return l1Var;
        }
        e extras = new e((u6.c) this.f134367d);
        extras.b(w6.c.f128111a, key);
        p1 factory = (p1) this.f134366c;
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        try {
            try {
                b13 = factory.a(modelClass, extras);
            } catch (AbstractMethodError unused) {
                b13 = factory.b(lb.l0.t0(modelClass));
            }
        } catch (AbstractMethodError unused2) {
            b13 = factory.c(lb.l0.t0(modelClass), extras);
        }
        ((t1) this.f134365b).b(key, b13);
        return b13;
    }

    public final boolean G(int i13) {
        return ((TypedArray) this.f134366c).hasValue(i13);
    }

    public final void H(d... entities) {
        ((d0) this.f134365b).b();
        ((d0) this.f134365b).c();
        try {
            i iVar = (i) this.f134366c;
            iVar.getClass();
            Intrinsics.checkNotNullParameter(entities, "entities");
            oa.i a13 = iVar.a();
            try {
                for (d dVar : entities) {
                    iVar.l(a13, dVar);
                    a13.Q0();
                }
                iVar.j(a13);
                ((d0) this.f134365b).r();
            } catch (Throwable th3) {
                iVar.j(a13);
                throw th3;
            }
        } finally {
            ((d0) this.f134365b).m();
        }
    }

    public final l I(String boardId, String str, List userIds) {
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        Intrinsics.checkNotNullParameter(userIds, "userIds");
        oc.c cVar = (oc.c) this.f134367d;
        if (str == null) {
            str = "";
        }
        l h10 = com.bumptech.glide.d.u0(cVar.a(new me(userIds, boardId, str))).i().h(wj2.c.a());
        Intrinsics.checkNotNullExpressionValue(h10, "observeOn(...)");
        return h10;
    }

    public final l J(List invitedIds, boolean z13, String boardId, String str) {
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        Intrinsics.checkNotNullParameter(invitedIds, "invitedIds");
        if (z13) {
            return com.bumptech.glide.d.u0(((oc.c) this.f134367d).a(new fe(invitedIds, boardId, str != null ? new q0(str) : p0.f99597a))).i().h(wj2.c.a());
        }
        return I(boardId, str, invitedIds);
    }

    public final l K(v7 board) {
        Intrinsics.checkNotNullParameter(board, "board");
        wy0 f13 = ((b60.d) ((b60.b) this.f134366c)).f();
        String uid = f13 != null ? f13.getUid() : null;
        if (uid == null) {
            uid = "";
        }
        return P(uid, board);
    }

    public final boolean L(int i13, h hVar, v4.c cVar) {
        v4.b bVar = (v4.b) this.f134366c;
        g[] gVarArr = hVar.U;
        bVar.f123969a = gVarArr[0];
        bVar.f123970b = gVarArr[1];
        bVar.f123971c = hVar.y();
        ((v4.b) this.f134366c).f123972d = hVar.o();
        v4.b bVar2 = (v4.b) this.f134366c;
        bVar2.f123977i = false;
        bVar2.f123978j = i13;
        g gVar = bVar2.f123969a;
        g gVar2 = g.MATCH_CONSTRAINT;
        boolean z13 = gVar == gVar2;
        boolean z14 = bVar2.f123970b == gVar2;
        boolean z15 = z13 && hVar.Y > 0.0f;
        boolean z16 = z14 && hVar.Y > 0.0f;
        int[] iArr = hVar.f120234t;
        if (z15 && iArr[0] == 4) {
            bVar2.f123969a = g.FIXED;
        }
        if (z16 && iArr[1] == 4) {
            bVar2.f123970b = g.FIXED;
        }
        ((f) cVar).b(hVar, bVar2);
        hVar.b0(((v4.b) this.f134366c).f123973e);
        hVar.W(((v4.b) this.f134366c).f123974f);
        v4.b bVar3 = (v4.b) this.f134366c;
        hVar.E = bVar3.f123976h;
        hVar.R(bVar3.f123975g);
        v4.b bVar4 = (v4.b) this.f134366c;
        bVar4.f123978j = 0;
        return bVar4.f123977i;
    }

    public final void O() {
        ((TypedArray) this.f134366c).recycle();
    }

    public final l P(String uid, v7 board) {
        Intrinsics.checkNotNullParameter(board, "board");
        Intrinsics.checkNotNullParameter(uid, "uid");
        oc.c cVar = (oc.c) this.f134367d;
        String uid2 = board.getUid();
        Intrinsics.checkNotNullExpressionValue(uid2, "getUid(...)");
        l h10 = new x(com.bumptech.glide.d.u0(cVar.a(new ai(uid2, e0.b(uid)))).i(), new x02.e0(17, new ex1.n(this, 29)), ck2.i.f27924d, ck2.i.f27923c).h(wj2.c.a());
        Intrinsics.checkNotNullExpressionValue(h10, "observeOn(...)");
        return h10;
    }

    public final void Q(int i13) {
        if (i13 != 16 && i13 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i13 * 8)));
        }
        this.f134365b = Integer.valueOf(i13);
    }

    public final void R(int i13) {
        if (i13 < 10 || 16 < i13) {
            throw new GeneralSecurityException(a.a.d("Invalid tag size for AesCmacParameters: ", i13));
        }
        this.f134366c = Integer.valueOf(i13);
    }

    public final void S(u4.i iVar, int i13, int i14, int i15) {
        int i16 = iVar.f120203d0;
        int i17 = iVar.f120205e0;
        iVar.f120203d0 = 0;
        iVar.f120205e0 = 0;
        iVar.b0(i14);
        iVar.W(i15);
        if (i16 < 0) {
            iVar.f120203d0 = 0;
        } else {
            iVar.f120203d0 = i16;
        }
        if (i17 < 0) {
            iVar.f120205e0 = 0;
        } else {
            iVar.f120205e0 = i17;
        }
        u4.i iVar2 = (u4.i) this.f134367d;
        iVar2.f120245y0 = i13;
        iVar2.f0();
    }

    public final String T() {
        StringBuilder sb3 = new StringBuilder();
        for (Map.Entry entry : ((Map) this.f134366c).entrySet()) {
            sb3.append((String) entry.getKey());
            sb3.append(".{");
            Iterator it = ((Set) entry.getValue()).iterator();
            while (it.hasNext()) {
                sb3.append((String) it.next());
                sb3.append(",");
            }
            sb3.deleteCharAt(sb3.length() - 1);
            sb3.append("},");
        }
        for (Map.Entry entry2 : ((Map) this.f134365b).entrySet()) {
            sb3.append((String) entry2.getKey());
            sb3.append("[");
            Iterator it2 = ((Set) entry2.getValue()).iterator();
            while (it2.hasNext()) {
                sb3.append((String) it2.next());
                sb3.append(",");
            }
            sb3.deleteCharAt(sb3.length() - 1);
            sb3.append("],");
        }
        Iterator it3 = ((Set) this.f134367d).iterator();
        while (it3.hasNext()) {
            sb3.append((String) it3.next());
            sb3.append(",");
        }
        if (sb3.length() > 0) {
            sb3.deleteCharAt(sb3.length() - 1);
        }
        return sb3.toString();
    }

    public final void U(u4.i iVar) {
        ((ArrayList) this.f134365b).clear();
        int size = iVar.f120284v0.size();
        for (int i13 = 0; i13 < size; i13++) {
            h hVar = (h) iVar.f120284v0.get(i13);
            g[] gVarArr = hVar.U;
            g gVar = gVarArr[0];
            g gVar2 = g.MATCH_CONSTRAINT;
            if (gVar == gVar2 || gVarArr[1] == gVar2) {
                ((ArrayList) this.f134365b).add(hVar);
            }
        }
        iVar.f120244x0.f123981a = true;
    }

    @Override // p5.d
    public final boolean a(Object obj) {
        if (obj instanceof ie.b) {
            ((ie.b) obj).b().f72195a = true;
        }
        switch (((wc.b) ((ie.c) this.f134366c)).f129077a) {
            case 16:
                break;
            default:
                ((List) obj).clear();
                break;
        }
        return ((p5.d) this.f134367d).a(obj);
    }

    @Override // com.google.android.gms.common.api.internal.o
    public final void accept(Object obj, Object obj2) {
        com.google.android.gms.internal.recaptcha.r1 r1Var = (com.google.android.gms.internal.recaptcha.r1) this.f134365b;
        RecaptchaHandle recaptchaHandle = (RecaptchaHandle) this.f134366c;
        RecaptchaAction recaptchaAction = (RecaptchaAction) this.f134367d;
        com.google.android.gms.internal.recaptcha.d dVar = (com.google.android.gms.internal.recaptcha.d) obj;
        r1Var.getClass();
        com.google.android.gms.internal.recaptcha.c cVar = new com.google.android.gms.internal.recaptcha.c((TaskCompletionSource) obj2);
        String str = recaptchaHandle.f32070f;
        SharedPreferences sharedPreferences = r1Var.f31782k.getSharedPreferences("com.google.android.gms.recaptcha.internal.VERIFICATION_HISTORY_FILE_KEY", 0);
        String valueOf = String.valueOf(str);
        String concat = valueOf.length() != 0 ? "verification_history_token_key:".concat(valueOf) : new String("verification_history_token_key:");
        String string = sharedPreferences.contains(concat) ? sharedPreferences.getString(concat, "") : "";
        q1 q1Var = (q1) dVar.getService();
        RecaptchaAction recaptchaAction2 = new RecaptchaAction(recaptchaAction.f32065f, recaptchaAction.f32066g, recaptchaAction.f32067h, string);
        q1Var.getClass();
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.recaptcha.internal.IRecaptchaService");
        int i13 = r.f31780a;
        obtain.writeStrongBinder(cVar);
        obtain.writeInt(1);
        recaptchaHandle.writeToParcel(obtain, 0);
        obtain.writeInt(1);
        recaptchaAction2.writeToParcel(obtain, 0);
        q1Var.j(obtain, 3);
    }

    @Override // p5.d
    public final Object b() {
        Object b13 = ((p5.d) this.f134367d).b();
        if (b13 == null) {
            b13 = ((ie.a) this.f134365b).create();
            if (Log.isLoggable("FactoryPools", 2)) {
                Log.v("FactoryPools", "Created new " + b13.getClass());
            }
        }
        if (b13 instanceof ie.b) {
            ((ie.b) b13).b().f72195a = false;
        }
        return b13;
    }

    @Override // wd.v
    public final Bitmap c(BitmapFactory.Options options) {
        return BitmapFactory.decodeStream(new he.a(he.c.c((ByteBuffer) this.f134365b)), null, options);
    }

    @Override // zd.a
    public final g0 d(g0 g0Var, nd.l lVar) {
        Drawable drawable = (Drawable) g0Var.get();
        if (drawable instanceof BitmapDrawable) {
            return ((zd.a) this.f134366c).d(wd.c.e(((BitmapDrawable) drawable).getBitmap(), (qd.d) this.f134365b), lVar);
        }
        if (drawable instanceof yd.c) {
            return ((zd.a) this.f134367d).d(g0Var, lVar);
        }
        return null;
    }

    public final void e(String str) {
        j.f125466a.R(!str.contains("{"), "The following ApiFieldConstants value should be full and un-abbreviated: ".concat(str), p.PLATFORM, new Object[0]);
        String[] split = str.split("\\.");
        p5.b bVar = (split.length != 2 || a0.s0(split[0]) || a0.s0(split[1])) ? null : new p5.b(split[0], split[1]);
        if (bVar == null) {
            ((Set) this.f134367d).add(str);
            return;
        }
        String str2 = (String) bVar.f98855a;
        String str3 = (String) bVar.f98856b;
        Set set = (Set) ((Map) this.f134366c).get(str2);
        if (set != null) {
            set.add(str3);
            return;
        }
        HashSet hashSet = new HashSet();
        hashSet.add(str3);
        ((Map) this.f134366c).put(str2, hashSet);
    }

    @Override // wd.v
    public final void f() {
    }

    @Override // wd.v
    public final int g() {
        List list = (List) this.f134366c;
        ByteBuffer c13 = he.c.c((ByteBuffer) this.f134365b);
        qd.i iVar = (qd.i) this.f134367d;
        if (c13 == null) {
            return -1;
        }
        int size = list.size();
        for (int i13 = 0; i13 < size; i13++) {
            try {
                int c14 = ((nd.f) list.get(i13)).c(c13, iVar);
                if (c14 != -1) {
                    return c14;
                }
            } finally {
                he.c.c(c13);
            }
        }
        return -1;
    }

    public final void h(String str, String str2) {
        if (((Map) this.f134365b).containsKey(str)) {
            ((Set) ((Map) this.f134365b).get(str)).add(str2);
            return;
        }
        HashSet hashSet = new HashSet();
        hashSet.add(str2);
        ((Map) this.f134365b).put(str, hashSet);
    }

    @Override // wd.v
    public final ImageHeaderParser$ImageType i() {
        return bs1.c.U0((List) this.f134366c, he.c.c((ByteBuffer) this.f134365b));
    }

    public final l j(String boardId, String collaboratorUserId) {
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        Intrinsics.checkNotNullParameter(collaboratorUserId, "collaboratorUserId");
        l h10 = com.bumptech.glide.d.u0(((oc.c) this.f134367d).a(new t0(boardId, collaboratorUserId))).i().h(wj2.c.a());
        Intrinsics.checkNotNullExpressionValue(h10, "observeOn(...)");
        return h10;
    }

    public final PendingIntent k(uz1.c cVar, Context context) {
        if (!(cVar instanceof uz1.b)) {
            if (!(cVar instanceof uz1.a)) {
                throw new NoWhenBranchMatchedException();
            }
            Intent intent = new Intent(context, (Class<?>) BoardActionService.class);
            uz1.a aVar = (uz1.a) cVar;
            Pair[] pairArr = (Pair[]) b1.t(aVar.f123274a).toArray(new Pair[0]);
            intent.putExtras(t.j((Pair[]) Arrays.copyOf(pairArr, pairArr.length)));
            intent.putExtra("ACTION_TYPE", intent.getAction());
            PendingIntent service = PendingIntent.getService(context, aVar.f123275b.hashCode(), intent, 201326592);
            Intrinsics.f(service);
            return service;
        }
        Intent j13 = ((lu1.c) ((lu1.b) this.f134366c)).j(context);
        uz1.b bVar = (uz1.b) cVar;
        Pair[] pairArr2 = (Pair[]) b1.t(bVar.f123277b).toArray(new Pair[0]);
        j13.putExtras(t.j((Pair[]) Arrays.copyOf(pairArr2, pairArr2.length)));
        j13.putExtra("com.pinterest.EXTRA_SOURCE", bVar.f123280e);
        j13.putExtra("com.pinterest.EXTRA_NOTIFICATION_ID", bVar.f123278c);
        String str = bVar.f123276a;
        if (!z.p(str, "http", false)) {
            str = a.a.j("pinterest://", str);
        }
        j13.setData(Uri.parse(str));
        if (Build.VERSION.SDK_INT >= 29) {
            int i13 = uz1.w.f123325a[bVar.f123279d.ordinal()];
            if (i13 == 1) {
                j13.setIdentifier("com.pinterest.EXTRA_FROM_COLLAPSED_NOTIF");
                j13.putExtra("com.pinterest.EXTRA_FROM_COLLAPSED_NOTIF", true);
            } else if (i13 == 2) {
                j13.setIdentifier("com.pinterest.EXTRA_FROM_EXPANDED_NOTIF");
                j13.putExtra("com.pinterest.EXTRA_FROM_EXPANDED_NOTIF", true);
            }
        }
        PendingIntent activity = PendingIntent.getActivity(context, 0, j13, 201326592);
        Intrinsics.f(activity);
        return activity;
    }

    public final RemoteViews l(uz1.j jVar, Context context) {
        RemoteViews remoteViews;
        int i13;
        int i14;
        Resources resources = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        uz1.t tVar = jVar.f123301d;
        List a13 = tVar.a();
        PendingIntent k13 = k(jVar.f123300c, context);
        q qVar = (q) this.f134365b;
        String str = jVar.f123298a;
        String str2 = jVar.f123299b;
        uz1.v data = new uz1.v(context, resources, a13, str, str2, k13, qVar);
        if (tVar instanceof k) {
            Intrinsics.checkNotNullParameter(data, "data");
            RemoteViews remoteViews2 = new RemoteViews(context.getPackageName(), pz1.d.notif_rich_pins_collapsed_bold);
            remoteViews2.setViewVisibility(pz1.c.richNotifTitle, 0);
            remoteViews2.setTextViewText(pz1.c.richNotifTitle, str);
            Bitmap bitmap = (Bitmap) CollectionsKt.firstOrNull(a13);
            if (bitmap != null) {
                remoteViews2.setViewVisibility(pz1.c.richNotifPinLargeIcon, 0);
                remoteViews2.setImageViewBitmap(pz1.c.richNotifPinLargeIcon, bitmap);
            }
            if (Build.VERSION.SDK_INT >= 31) {
                remoteViews2.setBoolean(pz1.c.richNotifPinLargeIcon, "setClipToOutline", true);
            }
            remoteViews2.setOnClickPendingIntent(pz1.c.collapsed_view_root, k13);
            return remoteViews2;
        }
        if (tVar instanceof uz1.n) {
            Intrinsics.checkNotNullParameter(data, "data");
            RemoteViews remoteViews3 = new RemoteViews(context.getPackageName(), pz1.d.collapsed_view_left_image);
            remoteViews3.setViewVisibility(pz1.c.richNotifTitle, 0);
            remoteViews3.setTextViewText(pz1.c.richNotifTitle, str);
            Bitmap bitmap2 = (Bitmap) CollectionsKt.firstOrNull(a13);
            if (bitmap2 != null) {
                remoteViews3.setViewVisibility(pz1.c.richNotifPinLargeIcon, 0);
                remoteViews3.setImageViewBitmap(pz1.c.richNotifPinLargeIcon, bitmap2);
            }
            if (Build.VERSION.SDK_INT >= 31) {
                remoteViews3.setBoolean(pz1.c.richNotifPinLargeIcon, "setClipToOutline", true);
            }
            remoteViews3.setOnClickPendingIntent(pz1.c.collapsed_view_root, k13);
            return remoteViews3;
        }
        if (tVar instanceof uz1.r) {
            Intrinsics.checkNotNullParameter(data, "data");
            HashSet hashSet = tb0.h.f117076w;
            tb0.g.f117075a.h("Inflating notif_rich_single_image_expanded");
            RemoteViews remoteViews4 = new RemoteViews(context.getPackageName(), pz1.d.notif_rich_single_image_expanded_bold);
            remoteViews4.setTextViewText(pz1.c.richNotifTitle, str);
            remoteViews4.setViewVisibility(pz1.c.richNotifTitle, 0);
            remoteViews4.setTextViewText(pz1.c.richNotifTextBody, str2);
            if (!a13.isEmpty()) {
                if (Build.VERSION.SDK_INT >= 31) {
                    remoteViews4.setBoolean(pz1.c.richNotifPinGrid, "setClipToOutline", true);
                }
                remoteViews4.setImageViewBitmap(pz1.c.richNotifSingleImage, (Bitmap) a13.get(0));
                remoteViews4.setViewVisibility(pz1.c.richNotifSingleImage, 0);
            } else {
                remoteViews4.setViewVisibility(pz1.c.richNotifSingleImage, 8);
                kh2.d.O0("ImageUrlFailed", "EmptyUrl");
            }
            remoteViews4.setOnClickPendingIntent(pz1.c.expanded_view_root, k13);
            return remoteViews4;
        }
        if (tVar instanceof uz1.q) {
            return c0.d.v2(data);
        }
        if (tVar instanceof uz1.s) {
            Intrinsics.checkNotNullParameter(data, "data");
            RemoteViews remoteViews5 = new RemoteViews(context.getPackageName(), pz1.d.notif_expanded_six_pin_grid);
            if (a13.size() >= 6) {
                if (Build.VERSION.SDK_INT >= 31) {
                    remoteViews5.setBoolean(pz1.c.richNotifPinGridBackground, "setClipToOutline", true);
                }
                remoteViews5.setImageViewBitmap(pz1.c.richNotifPin0, (Bitmap) a13.get(0));
                remoteViews5.setViewVisibility(pz1.c.richNotifPin0, 0);
                remoteViews5.setImageViewBitmap(pz1.c.richNotifPin1, (Bitmap) a13.get(1));
                remoteViews5.setViewVisibility(pz1.c.richNotifPin1, 0);
                remoteViews5.setImageViewBitmap(pz1.c.richNotifPin2, (Bitmap) a13.get(2));
                remoteViews5.setViewVisibility(pz1.c.richNotifPin2, 0);
                remoteViews5.setImageViewBitmap(pz1.c.richNotifPin3, (Bitmap) a13.get(3));
                remoteViews5.setViewVisibility(pz1.c.richNotifPin3, 0);
                remoteViews5.setImageViewBitmap(pz1.c.richNotifPin4, (Bitmap) a13.get(4));
                remoteViews5.setViewVisibility(pz1.c.richNotifPin4, 0);
                remoteViews5.setImageViewBitmap(pz1.c.richNotifPin5, (Bitmap) a13.get(5));
                remoteViews5.setViewVisibility(pz1.c.richNotifPin5, 0);
            } else {
                remoteViews5.setViewVisibility(pz1.c.richNotifPinGrid, 8);
            }
            if (!z.j(str)) {
                remoteViews5.setTextViewText(pz1.c.richNotifTitle, str);
                remoteViews5.setViewVisibility(pz1.c.richNotifTitle, 0);
            } else {
                remoteViews5.setViewVisibility(pz1.c.richNotifTitle, 8);
            }
            if (true ^ z.j(str2)) {
                remoteViews5.setTextViewText(pz1.c.richNotifTextBody, str2);
                remoteViews5.setViewVisibility(pz1.c.richNotifTextBody, 0);
            } else {
                remoteViews5.setViewVisibility(pz1.c.richNotifTextBody, 8);
            }
            remoteViews5.setOnClickPendingIntent(pz1.c.expanded_view_root, k13);
            return remoteViews5;
        }
        if (tVar instanceof uz1.l) {
            Intrinsics.checkNotNullParameter(data, "data");
            RemoteViews remoteViews6 = new RemoteViews(context.getPackageName(), pz1.d.notif_rich_pins_expanded_bold);
            if (a13.size() >= 4) {
                if (Build.VERSION.SDK_INT >= 31) {
                    remoteViews6.setBoolean(pz1.c.richNotifPinGridBackground, "setClipToOutline", true);
                }
                remoteViews6.setImageViewBitmap(pz1.c.richNotifPin0, (Bitmap) a13.get(0));
                remoteViews6.setViewVisibility(pz1.c.richNotifPin0, 0);
                remoteViews6.setImageViewBitmap(pz1.c.richNotifPin1, (Bitmap) a13.get(1));
                remoteViews6.setViewVisibility(pz1.c.richNotifPin1, 0);
                remoteViews6.setImageViewBitmap(pz1.c.richNotifPin2, (Bitmap) a13.get(2));
                remoteViews6.setViewVisibility(pz1.c.richNotifPin2, 0);
                remoteViews6.setImageViewBitmap(pz1.c.richNotifPin3, (Bitmap) a13.get(3));
                remoteViews6.setViewVisibility(pz1.c.richNotifPin3, 0);
            } else {
                remoteViews6.setViewVisibility(pz1.c.richNotifPinGrid, 8);
            }
            if (!z.j(str)) {
                remoteViews6.setTextViewText(pz1.c.richNotifTitle, str);
                remoteViews6.setViewVisibility(pz1.c.richNotifTitle, 0);
            } else {
                remoteViews6.setViewVisibility(pz1.c.richNotifTitle, 8);
            }
            if (true ^ z.j(str2)) {
                remoteViews6.setTextViewText(pz1.c.richNotifTextBody, str2);
                remoteViews6.setViewVisibility(pz1.c.richNotifTextBody, 0);
            } else {
                remoteViews6.setViewVisibility(pz1.c.richNotifTextBody, 8);
            }
            remoteViews6.setOnClickPendingIntent(pz1.c.expanded_view_root, k13);
            return remoteViews6;
        }
        if (tVar instanceof m) {
            List interestNames = ((m) tVar).f123305b;
            Intrinsics.checkNotNullParameter(data, "data");
            Intrinsics.checkNotNullParameter(interestNames, "interestNames");
            remoteViews = new RemoteViews(context.getPackageName(), pz1.d.notif_rich_interests_expanded_bold);
            if (!z.j(str)) {
                remoteViews.setTextViewText(pz1.c.richNotifTitle, str);
                remoteViews.setViewVisibility(pz1.c.richNotifTitle, 0);
            } else {
                remoteViews.setViewVisibility(pz1.c.richNotifTitle, 8);
            }
            if (!z.j(str2)) {
                remoteViews.setTextViewText(pz1.c.richNotifTextBody, str2);
                remoteViews.setViewVisibility(pz1.c.richNotifTextBody, 0);
                i14 = 8;
            } else {
                i14 = 8;
                remoteViews.setViewVisibility(pz1.c.richNotifTextBody, 8);
            }
            if (a13.size() < 3) {
                remoteViews.setViewVisibility(pz1.c.richNotifInterestGrid, i14);
            } else {
                if (Build.VERSION.SDK_INT >= 31) {
                    remoteViews.setBoolean(pz1.c.richNotifPinGridBackground, "setClipToOutline", true);
                }
                remoteViews.setImageViewBitmap(pz1.c.richNotifImageLeft, (Bitmap) a13.get(0));
                remoteViews.setImageViewBitmap(pz1.c.richNotifImageMid, (Bitmap) a13.get(1));
                remoteViews.setImageViewBitmap(pz1.c.richNotifImageRight, (Bitmap) a13.get(2));
                if (interestNames.size() >= 3) {
                    remoteViews.setTextViewText(pz1.c.richNotifInterestNameLeft, (CharSequence) interestNames.get(0));
                    remoteViews.setTextViewText(pz1.c.richNotifInterestNameMid, (CharSequence) interestNames.get(1));
                    remoteViews.setTextViewText(pz1.c.richNotifInterestNameRight, (CharSequence) interestNames.get(2));
                }
            }
            remoteViews.setOnClickPendingIntent(pz1.c.expanded_view_root, k13);
        } else if (tVar instanceof uz1.o) {
            List pinCountPerBoard = ((uz1.o) tVar).f123308b;
            Intrinsics.checkNotNullParameter(data, "data");
            Intrinsics.checkNotNullParameter(pinCountPerBoard, "pinCountPerBoard");
            remoteViews = new RemoteViews(context.getPackageName(), pz1.d.notif_rich_boards_expanded_bold);
            int i15 = Build.VERSION.SDK_INT;
            if (i15 >= 31) {
                remoteViews.setBoolean(pz1.c.richNotifLeftBoardGrid, "setClipToOutline", true);
                remoteViews.setBoolean(pz1.c.richNotifRightBoardGrid, "setClipToOutline", true);
            }
            if (!z.j(str)) {
                remoteViews.setTextViewText(pz1.c.richNotifTitle, str);
                remoteViews.setViewVisibility(pz1.c.richNotifTitle, 0);
            } else {
                remoteViews.setViewVisibility(pz1.c.richNotifTitle, 8);
            }
            if (!z.j(str2)) {
                remoteViews.setTextViewText(pz1.c.richNotifTextBody, str2);
                remoteViews.setViewVisibility(pz1.c.richNotifTextBody, 0);
            } else {
                remoteViews.setViewVisibility(pz1.c.richNotifTextBody, 8);
            }
            if (a13.size() >= 6) {
                if (i15 >= 31) {
                    remoteViews.setBoolean(pz1.c.richNotifLeftBoardGrid, "setClipToOutline", true);
                    remoteViews.setBoolean(pz1.c.richNotifRightBoardGrid, "setClipToOutline", true);
                }
                remoteViews.setImageViewBitmap(pz1.c.richNotifLeftBoardCover, (Bitmap) a13.get(0));
                remoteViews.setImageViewBitmap(pz1.c.richNotifRightBoardCover, (Bitmap) a13.get(1));
                remoteViews.setImageViewBitmap(pz1.c.richNotifLeftBoardPinUpper, (Bitmap) a13.get(2));
                remoteViews.setImageViewBitmap(pz1.c.richNotifBoardLeftPinLower, (Bitmap) a13.get(3));
                remoteViews.setImageViewBitmap(pz1.c.richNotifRightBoard1PinUpper, (Bitmap) a13.get(4));
                remoteViews.setImageViewBitmap(pz1.c.richNotifRightBoardPinLower, (Bitmap) a13.get(5));
                String str3 = (String) CollectionsKt.U(0, pinCountPerBoard);
                if (str3 != null) {
                    remoteViews.setTextViewText(pz1.c.richNotifBoardLeftPinCount, str3);
                }
                String str4 = (String) CollectionsKt.U(1, pinCountPerBoard);
                if (str4 != null) {
                    remoteViews.setTextViewText(pz1.c.richNotifRightBoardPinCount, str4);
                }
            } else {
                remoteViews.setViewVisibility(pz1.c.richNotifLeftBoardGrid, 8);
                remoteViews.setViewVisibility(pz1.c.richNotifRightBoardGrid, 8);
            }
            remoteViews.setOnClickPendingIntent(pz1.c.expanded_view_root, k13);
        } else {
            if (!(tVar instanceof uz1.p)) {
                throw new NoWhenBranchMatchedException();
            }
            List pinCountPerBoard2 = e0.b(((uz1.p) tVar).f123310b);
            Intrinsics.checkNotNullParameter(data, "data");
            Intrinsics.checkNotNullParameter(pinCountPerBoard2, "pinCountPerBoard");
            remoteViews = new RemoteViews(context.getPackageName(), pz1.d.notif_rich_one_board_expanded_bold);
            if (!z.j(str)) {
                remoteViews.setTextViewText(pz1.c.richNotifTitle, str);
                remoteViews.setViewVisibility(pz1.c.richNotifTitle, 0);
            } else {
                remoteViews.setViewVisibility(pz1.c.richNotifTitle, 8);
            }
            if (!z.j(str2)) {
                remoteViews.setTextViewText(pz1.c.richNotifTextBody, str2);
                remoteViews.setViewVisibility(pz1.c.richNotifTextBody, 0);
                i13 = 8;
            } else {
                i13 = 8;
                remoteViews.setViewVisibility(pz1.c.richNotifTextBody, 8);
            }
            if (a13.size() < 5) {
                remoteViews.setViewVisibility(pz1.c.richNotifOneBoard, i13);
            } else {
                remoteViews.setImageViewBitmap(pz1.c.richNotifBoardCover, (Bitmap) a13.get(0));
                remoteViews.setImageViewBitmap(pz1.c.richNotifLeftUpperPin, (Bitmap) a13.get(1));
                remoteViews.setImageViewBitmap(pz1.c.richNotifLeftLowerPin, (Bitmap) a13.get(2));
                remoteViews.setImageViewBitmap(pz1.c.richNotifRightUpperPin, (Bitmap) a13.get(3));
                remoteViews.setImageViewBitmap(pz1.c.richNotifRightLowerPin, (Bitmap) a13.get(4));
                String str5 = (String) CollectionsKt.U(0, pinCountPerBoard2);
                if (str5 != null) {
                    remoteViews.setTextViewText(pz1.c.richNotifBoardPinCount, str5);
                }
                if (Build.VERSION.SDK_INT >= 31) {
                    remoteViews.setBoolean(pz1.c.richNotifOneBoard, "setClipToOutline", true);
                }
            }
            remoteViews.setOnClickPendingIntent(pz1.c.expanded_view_root, k13);
        }
        return remoteViews;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Notification m(uz1.f fVar, Context context) {
        c5.w wVar;
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        u uVar = new u(context, fVar.f123283c);
        uz1.j jVar = fVar.f123294n;
        if (jVar != null) {
            uVar.f25854s = l(jVar, context);
        }
        uz1.j jVar2 = fVar.f123295o;
        if (jVar2 != null) {
            uVar.f25855t = l(jVar2, context);
        }
        Object obj = d5.a.f53679a;
        uVar.f25852q = context.getColor(fVar.f123284d);
        uVar.f25859x.icon = fVar.f123285e;
        String str = fVar.f123286f;
        if (str != null) {
            Bitmap x13 = kh2.g0.x((q) this.f134365b, str, context.getResources().getDimensionPixelSize(R.dimen.notification_large_icon_width), context.getResources().getDimensionPixelSize(R.dimen.notification_large_icon_height));
            if (x13 != null) {
                uVar.o(x13);
            }
        }
        uVar.p(true);
        uVar.d(true);
        uVar.f25845j = 1;
        uVar.h(fVar.f123287g);
        uVar.f25848m = fVar.f123282b;
        uVar.g(fVar.f123288h);
        uz1.c cVar = fVar.f123289i;
        if (cVar != null) {
            uVar.f25842g = k(cVar, context);
        }
        uz1.i iVar = fVar.f123293m;
        if (iVar instanceof uz1.g) {
            c5.s sVar = new c5.s(0);
            sVar.f25835c = u.c(((uz1.g) iVar).f123296a);
            Intrinsics.checkNotNullExpressionValue(sVar, "bigText(...)");
            wVar = sVar;
        } else {
            if (!(iVar instanceof uz1.h)) {
                throw new NoWhenBranchMatchedException();
            }
            wVar = new c5.w();
        }
        uVar.s(wVar);
        Integer num = fVar.f123290j;
        if (num != null) {
            int intValue = num.intValue();
            int i13 = pz1.b.p_logo;
            String string = context.getString(intValue);
            uz1.c cVar2 = fVar.f123291k;
            uVar.a(i13, string, cVar2 != null ? k(cVar2, context) : null);
        }
        uVar.f25859x.vibrate = CollectionsKt.G0(fVar.f123292l);
        Notification b13 = uVar.b();
        Intrinsics.checkNotNullExpressionValue(b13, "build(...)");
        return b13;
    }

    public final fl.d n() {
        Integer num = (Integer) this.f134365b;
        if (num == null) {
            throw new GeneralSecurityException("key size not set");
        }
        if (((Integer) this.f134366c) == null) {
            throw new GeneralSecurityException("tag size not set");
        }
        if (((fl.c) this.f134367d) != null) {
            return new fl.d(num.intValue(), ((Integer) this.f134366c).intValue(), (fl.c) this.f134367d);
        }
        throw new GeneralSecurityException("variant not set");
    }

    public final fm.b o() {
        String str = ((Long) this.f134366c) == null ? " tokenExpirationTimestamp" : "";
        if (str.isEmpty()) {
            return new fm.b((String) this.f134365b, ((Long) this.f134366c).longValue(), (fm.f) this.f134367d);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public final qg.b p() {
        String str = ((Long) this.f134365b) == null ? " delta" : "";
        if (((Long) this.f134366c) == null) {
            str = str.concat(" maxAllowedDelay");
        }
        if (((Set) this.f134367d) == null) {
            str = a.a.C(str, " flags");
        }
        if (str.isEmpty()) {
            return new qg.b(((Long) this.f134365b).longValue(), ((Long) this.f134366c).longValue(), (Set) this.f134367d);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public final s q(ViewGroup container, ml1.d screenInfo, com.pinterest.framework.screens.v screenNavListener, int i13, boolean z13) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(screenInfo, "screenInfo");
        Intrinsics.checkNotNullParameter(screenNavListener, "screenNavListener");
        return new s(container, screenInfo, screenNavListener, (ml1.p) this.f134365b, (il1.b) this.f134366c, i13, z13, (r6) this.f134367d);
    }

    public final void s() {
        ((d0) this.f134365b).b();
        oa.i a13 = ((c3) this.f134367d).a();
        try {
            ((d0) this.f134365b).c();
            try {
                a13.G();
                ((d0) this.f134365b).r();
            } finally {
                ((d0) this.f134365b).m();
            }
        } finally {
            ((c3) this.f134367d).j(a13);
        }
    }

    public final boolean t(int i13, boolean z13) {
        return ((TypedArray) this.f134366c).getBoolean(i13, z13);
    }

    public final String toString() {
        switch (this.f134364a) {
            case 2:
                String str = "[ ";
                if (((s4.j) this.f134365b) != null) {
                    for (int i13 = 0; i13 < 9; i13++) {
                        str = d7.g.i(n60.o.i(str), ((s4.j) this.f134365b).f111107h[i13], " ");
                    }
                }
                StringBuilder D = ep.b.D(str, "] ");
                D.append((s4.j) this.f134365b);
                return D.toString();
            default:
                return super.toString();
        }
    }

    public final ColorStateList u(int i13) {
        int resourceId;
        ColorStateList b13;
        return (!((TypedArray) this.f134366c).hasValue(i13) || (resourceId = ((TypedArray) this.f134366c).getResourceId(i13, 0)) == 0 || (b13 = d5.a.b((Context) this.f134365b, resourceId)) == null) ? ((TypedArray) this.f134366c).getColorStateList(i13) : b13;
    }

    public final int v(int i13, int i14) {
        return ((TypedArray) this.f134366c).getDimensionPixelOffset(i13, i14);
    }

    public final int w(int i13, int i14) {
        return ((TypedArray) this.f134366c).getDimensionPixelSize(i13, i14);
    }

    public final Drawable x(int i13) {
        int resourceId;
        return (!((TypedArray) this.f134366c).hasValue(i13) || (resourceId = ((TypedArray) this.f134366c).getResourceId(i13, 0)) == 0) ? ((TypedArray) this.f134366c).getDrawable(i13) : com.bumptech.glide.c.I((Context) this.f134365b, resourceId);
    }

    public final Drawable y(int i13) {
        int resourceId;
        Drawable f13;
        if (!((TypedArray) this.f134366c).hasValue(i13) || (resourceId = ((TypedArray) this.f134366c).getResourceId(i13, 0)) == 0) {
            return null;
        }
        y a13 = y.a();
        Context context = (Context) this.f134365b;
        synchronized (a13) {
            f13 = a13.f16736a.f(resourceId, context, true);
        }
        return f13;
    }

    public final q8.s z(Object... objArr) {
        Constructor constructor;
        synchronized (((AtomicBoolean) this.f134366c)) {
            if (((AtomicBoolean) this.f134366c).get()) {
                constructor = (Constructor) this.f134367d;
            } else {
                try {
                    try {
                        constructor = ((c3.e) ((q8.p) this.f134365b)).n();
                    } catch (ClassNotFoundException unused) {
                        ((AtomicBoolean) this.f134366c).set(true);
                        constructor = (Constructor) this.f134367d;
                    }
                } catch (Exception e13) {
                    throw new RuntimeException("Error instantiating extension", e13);
                }
            }
        }
        if (constructor == null) {
            return null;
        }
        try {
            return (q8.s) constructor.newInstance(objArr);
        } catch (Exception e14) {
            throw new IllegalStateException("Unexpected error creating extractor", e14);
        }
    }

    @Override // kk.o
    public final /* bridge */ /* synthetic */ Object zza() {
        return new jk.q(kk.n.a((kk.o) this.f134365b), kk.n.a((kk.o) this.f134366c), kk.n.a((kk.o) this.f134367d));
    }

    public b(int i13) {
        this.f134364a = i13;
        if (i13 == 8) {
            this.f134365b = Collections.emptyList();
            this.f134366c = Collections.emptyList();
        } else if (i13 == 19) {
            this.f134365b = null;
            this.f134366c = null;
            this.f134367d = fl.c.f62507e;
        } else {
            if (i13 != 23) {
                return;
            }
            this.f134365b = new g1.g(0);
            this.f134366c = new g1.g(0);
            this.f134367d = new HashSet();
        }
    }

    public /* synthetic */ b(int i13, Object obj, Object obj2) {
        this.f134364a = i13;
        this.f134365b = obj;
        this.f134366c = obj2;
    }

    public /* synthetic */ b(Object obj, Object obj2, Object obj3, int i13) {
        this.f134364a = i13;
        this.f134365b = obj;
        this.f134366c = obj2;
        this.f134367d = obj3;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(b7.f[] fVarArr) {
        this(fVarArr, new j0(), new b7.i());
        this.f134364a = 6;
    }

    public b(String str, j1 j1Var, com.google.android.gms.common.api.d dVar) {
        this.f134364a = 14;
        this.f134367d = str;
        this.f134365b = j1Var;
        this.f134366c = dVar;
    }

    public b(lb0.q prefsManagerPersisted, m60.e applicationInfo, b60.b activeUserManager) {
        this.f134364a = 24;
        Intrinsics.checkNotNullParameter(prefsManagerPersisted, "prefsManagerPersisted");
        Intrinsics.checkNotNullParameter(applicationInfo, "applicationInfo");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        this.f134365b = prefsManagerPersisted;
        this.f134366c = applicationInfo;
        this.f134367d = activeUserManager;
    }

    public b(rm2.r resolver, fm2.d kotlinClassFinder) {
        this.f134364a = 28;
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(kotlinClassFinder, "kotlinClassFinder");
        this.f134365b = resolver;
        this.f134366c = kotlinClassFinder;
        this.f134367d = new ConcurrentHashMap();
    }

    public b(x0 boardRepository, b60.b activeUserManager, oc.c apolloClient) {
        this.f134364a = 27;
        Intrinsics.checkNotNullParameter(boardRepository, "boardRepository");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(apolloClient, "apolloClient");
        this.f134365b = boardRepository;
        this.f134366c = activeUserManager;
        this.f134367d = apolloClient;
    }

    public b(d0 d0Var) {
        this.f134364a = 0;
        this.f134365b = d0Var;
        this.f134366c = new a(d0Var, 1);
        this.f134367d = new xd0.d(d0Var, 5);
    }

    public b(t1 store, p1 factory, u6.c extras) {
        this.f134364a = 4;
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(extras, "extras");
        this.f134365b = store;
        this.f134366c = factory;
        this.f134367d = extras;
    }

    public b(q imageCache, lu1.b baseActivityHelper, uz1.x notificationUtils) {
        this.f134364a = 26;
        Intrinsics.checkNotNullParameter(imageCache, "imageCache");
        Intrinsics.checkNotNullParameter(baseActivityHelper, "baseActivityHelper");
        Intrinsics.checkNotNullParameter(notificationUtils, "notificationUtils");
        this.f134365b = imageCache;
        this.f134366c = baseActivityHelper;
        this.f134367d = notificationUtils;
    }

    public b(s4.h hVar, s4.h hVar2) {
        this.f134364a = 2;
        this.f134367d = hVar;
        this.f134366c = hVar2;
    }

    public b(u4.i iVar) {
        this.f134364a = 3;
        this.f134365b = new ArrayList();
        this.f134366c = new v4.b();
        this.f134367d = iVar;
    }

    public b(p5.e eVar, ie.a aVar, wc.b bVar) {
        this.f134364a = 11;
        this.f134367d = eVar;
        this.f134365b = aVar;
        this.f134366c = bVar;
    }

    public b(b7.f[] fVarArr, j0 j0Var, b7.i iVar) {
        this.f134364a = 6;
        b7.f[] fVarArr2 = new b7.f[fVarArr.length + 2];
        this.f134365b = fVarArr2;
        System.arraycopy(fVarArr, 0, fVarArr2, 0, fVarArr.length);
        this.f134366c = j0Var;
        this.f134367d = iVar;
        b7.f[] fVarArr3 = (b7.f[]) this.f134365b;
        fVarArr3[fVarArr.length] = j0Var;
        fVarArr3[fVarArr.length + 1] = iVar;
    }

    public b(c3.e eVar) {
        this.f134364a = 7;
        this.f134365b = eVar;
        this.f134366c = new AtomicBoolean(false);
    }

    public b(ml1.p transitionCache, il1.b screenFactory, r6 devLaunchPointFactory) {
        this.f134364a = 25;
        Intrinsics.checkNotNullParameter(transitionCache, "transitionCache");
        Intrinsics.checkNotNullParameter(screenFactory, "screenFactory");
        Intrinsics.checkNotNullParameter(devLaunchPointFactory, "devLaunchPointFactory");
        this.f134365b = transitionCache;
        this.f134366c = screenFactory;
        this.f134367d = devLaunchPointFactory;
    }
}
