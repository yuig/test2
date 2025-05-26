package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.measurement.internal.zzmh;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.shuffles.cutout.editor.ui.select.CropRectContainer;
import com.pinterest.shuffles.cutout.editor.ui.select.MaskedImageView;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class x implements d0, com.google.common.util.concurrent.w, tj.h, q5.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31693a;

    /* renamed from: b, reason: collision with root package name */
    public Object f31694b;

    /* renamed from: c, reason: collision with root package name */
    public Object f31695c;

    public /* synthetic */ x(int i13, Object obj, Object obj2) {
        this.f31693a = i13;
        this.f31694b = obj;
        this.f31695c = obj2;
    }

    public static final fk2.f0 c(x xVar, fk2.h hVar) {
        xVar.getClass();
        fk2.f0 m13 = hVar.q(Boolean.TRUE).m(Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(m13, "onErrorReturnItem(...)");
        return m13;
    }

    @Override // tj.h
    public final int a() {
        return ((ExtendedFloatingActionButton) this.f31695c).B;
    }

    @Override // com.google.android.gms.internal.measurement.d0
    public final m.h b(n nVar) {
        m.h S = ((m.h) this.f31694b).S();
        S.U((String) this.f31695c, nVar);
        return S;
    }

    @Override // tj.h
    public final ViewGroup.LayoutParams d() {
        Object obj = this.f31695c;
        return new ViewGroup.LayoutParams(-1, ((ExtendedFloatingActionButton) obj).H == 0 ? -2 : ((ExtendedFloatingActionButton) obj).H);
    }

    @Override // tj.h
    public final int e() {
        return ((ExtendedFloatingActionButton) this.f31695c).A;
    }

    public final void f(com.pinterest.api.model.v7 v7Var) {
        ((hf0.b) ((hf0.c) this.f31695c)).getClass();
        if (hf0.b.q() || v7Var == null || kh2.w.h0(v7Var)) {
            return;
        }
        lh0.s sVar = (lh0.s) this.f31694b;
        lh0.z3 activate = lh0.z3.DO_NOT_ACTIVATE_EXPERIMENT;
        sVar.getClass();
        Intrinsics.checkNotNullParameter(activate, "activate");
        if (((lh0.g1) sVar.f83471a).g("android_other_board_more_boards_by_the_same_curator", activate) != null) {
            ((lh0.g1) ((lh0.s) this.f31694b).f83471a).c("android_other_board_more_boards_by_the_same_curator");
        }
    }

    public final kk2.t g(String stickerId) {
        Intrinsics.checkNotNullParameter(stickerId, "stickerId");
        cw0.e eVar = cw0.e.STICKERS;
        String uid = com.bumptech.glide.d.Q((b60.b) this.f31695c).getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
        ae0.e eVar2 = (ae0.e) ((ae0.a) this.f31694b);
        eVar2.getClass();
        ja.f0 d2 = ja.f0.d(2, "SELECT EXISTS (SELECT * FROM idea_pin_recently_used_content WHERE content_id = ? AND user_id = ?)");
        d2.c1(1, stickerId);
        d2.c1(2, uid);
        kk2.m mVar = new kk2.m(ja.j0.b(new ae0.d(eVar2, d2, 0)), new lb0.c(18, new j1.p0(stickerId, uid, eVar, this, 16)), 0);
        Intrinsics.checkNotNullExpressionValue(mVar, "flatMap(...)");
        kk2.t r13 = new kk2.m(mVar, new lb0.c(17, new gd0.c(5, this, eVar)), 0).r(tk2.e.f118017c);
        Intrinsics.checkNotNullExpressionValue(r13, "subscribeOn(...)");
        return r13;
    }

    public final void h() {
        ((m.h) this.f31695c).q(new mn.c(this));
    }

    @Override // tj.h
    public final int i() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        Object obj = this.f31695c;
        if (((ExtendedFloatingActionButton) obj).H != -1) {
            return (((ExtendedFloatingActionButton) obj).H == 0 || ((ExtendedFloatingActionButton) obj).H == -2) ? ((tj.h) this.f31694b).i() : ((ExtendedFloatingActionButton) obj).H;
        }
        if (!(((ExtendedFloatingActionButton) obj).getParent() instanceof View)) {
            return ((tj.h) this.f31694b).i();
        }
        View view = (View) ((ExtendedFloatingActionButton) this.f31695c).getParent();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null || layoutParams.height != -2) {
            return (view.getHeight() - ((!(((ExtendedFloatingActionButton) this.f31695c).getLayoutParams() instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) ((ExtendedFloatingActionButton) this.f31695c).getLayoutParams()) == null) ? 0 : marginLayoutParams.topMargin + marginLayoutParams.bottomMargin)) - (view.getPaddingBottom() + view.getPaddingTop());
        }
        return ((tj.h) this.f31694b).i();
    }

    @Override // tj.h
    public final int j() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (!(((ExtendedFloatingActionButton) this.f31695c).getParent() instanceof View)) {
            return ((tj.h) this.f31694b).j();
        }
        View view = (View) ((ExtendedFloatingActionButton) this.f31695c).getParent();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null || layoutParams.width != -2) {
            return (view.getWidth() - ((!(((ExtendedFloatingActionButton) this.f31695c).getLayoutParams() instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) ((ExtendedFloatingActionButton) this.f31695c).getLayoutParams()) == null) ? 0 : marginLayoutParams.leftMargin + marginLayoutParams.rightMargin)) - (view.getPaddingRight() + view.getPaddingLeft());
        }
        return ((tj.h) this.f31694b).j();
    }

    @Override // q5.v
    public final q5.a2 k(View view, q5.a2 a2Var) {
        com.google.android.material.internal.h0 h0Var = (com.google.android.material.internal.h0) this.f31694b;
        l8.p pVar = (l8.p) this.f31695c;
        l8.p pVar2 = new l8.p();
        pVar2.f82075a = pVar.f82075a;
        pVar2.f82076b = pVar.f82076b;
        pVar2.f82077c = pVar.f82077c;
        pVar2.f82078d = pVar.f82078d;
        return h0Var.d(view, a2Var, pVar2);
    }

    public final jl.f l() {
        Object obj = this.f31694b;
        if (((jl.g) obj) == null) {
            throw new GeneralSecurityException("Cannot build without a ecdsa public key");
        }
        ll.j jVar = (ll.j) this.f31695c;
        if (jVar == null) {
            throw new GeneralSecurityException("Cannot build without a private value");
        }
        BigInteger bigInteger = (BigInteger) jVar.f83754b;
        jl.g gVar = (jl.g) obj;
        ECPoint eCPoint = gVar.f76845d;
        jl.a aVar = gVar.f76844c.f76829b;
        BigInteger order = aVar.f76792b.getOrder();
        if (bigInteger.signum() <= 0 || bigInteger.compareTo(order) >= 0) {
            throw new GeneralSecurityException("Invalid private value");
        }
        if (el.f.g(bigInteger, aVar.f76792b).equals(eCPoint)) {
            return new jl.f((jl.g) this.f31694b, (ll.j) this.f31695c);
        }
        throw new GeneralSecurityException("Invalid private value");
    }

    public final void m(int[] iArr, int i13) {
        ym.b bVar;
        ym.b bVar2;
        ym.b bVar3;
        if (i13 == 0) {
            throw new IllegalArgumentException("No error correction bytes");
        }
        int length = iArr.length - i13;
        if (length <= 0) {
            throw new IllegalArgumentException("No data bytes provided");
        }
        int i14 = 0;
        int i15 = 1;
        if (i13 >= ((List) this.f31695c).size()) {
            ym.b bVar4 = (ym.b) ep.b.i((List) this.f31695c, 1);
            int size = ((List) this.f31695c).size();
            while (size <= i13) {
                ym.a aVar = (ym.a) this.f31694b;
                int[] iArr2 = {i15, aVar.f139389a[(size - 1) + aVar.f139394f]};
                if (iArr2[i14] == 0) {
                    int i16 = i15;
                    while (i16 < 2 && iArr2[i16] == 0) {
                        i16++;
                    }
                    if (i16 == 2) {
                        iArr2 = new int[]{i14};
                    } else {
                        int i17 = 2 - i16;
                        int[] iArr3 = new int[i17];
                        System.arraycopy(iArr2, i16, iArr3, i14, i17);
                        iArr2 = iArr3;
                    }
                }
                bVar4.getClass();
                ym.a aVar2 = bVar4.f139395a;
                if (!aVar2.equals(aVar)) {
                    throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
                }
                int[] iArr4 = bVar4.f139396b;
                if (iArr4[i14] == 0 || iArr2[i14] == 0) {
                    bVar4 = aVar2.f139391c;
                } else {
                    int length2 = iArr4.length;
                    int length3 = iArr2.length;
                    int[] iArr5 = new int[(length2 + length3) - i15];
                    int i18 = i14;
                    while (i18 < length2) {
                        int i19 = iArr4[i18];
                        for (int i23 = i14; i23 < length3; i23++) {
                            int i24 = i18 + i23;
                            iArr5[i24] = iArr5[i24] ^ aVar2.a(i19, iArr2[i23]);
                        }
                        i18++;
                        i14 = 0;
                    }
                    bVar4 = new ym.b(aVar2, iArr5);
                }
                ((List) this.f31695c).add(bVar4);
                size++;
                i14 = 0;
                i15 = 1;
            }
        }
        ym.b bVar5 = (ym.b) ((List) this.f31695c).get(i13);
        int[] iArr6 = new int[length];
        System.arraycopy(iArr, 0, iArr6, 0, length);
        ym.a aVar3 = (ym.a) this.f31694b;
        if (length == 0) {
            throw new IllegalArgumentException();
        }
        if (length > 1 && iArr6[0] == 0) {
            int i25 = 1;
            while (i25 < length && iArr6[i25] == 0) {
                i25++;
            }
            if (i25 == length) {
                iArr6 = new int[]{0};
            } else {
                int i26 = length - i25;
                int[] iArr7 = new int[i26];
                System.arraycopy(iArr6, i25, iArr7, 0, i26);
                iArr6 = iArr7;
            }
        }
        if (i13 < 0) {
            throw new IllegalArgumentException();
        }
        int length4 = iArr6.length;
        int[] iArr8 = new int[length4 + i13];
        for (int i27 = 0; i27 < length4; i27++) {
            iArr8[i27] = aVar3.a(iArr6[i27], 1);
        }
        ym.b bVar6 = new ym.b(aVar3, iArr8);
        if (!aVar3.equals(bVar5.f139395a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        int[] iArr9 = bVar5.f139396b;
        if (iArr9[0] == 0) {
            throw new IllegalArgumentException("Divide by 0");
        }
        int i28 = iArr9[(iArr9.length - 1) - bVar5.b()];
        if (i28 == 0) {
            throw new ArithmeticException();
        }
        int i29 = aVar3.f139389a[(aVar3.f139392d - aVar3.f139390b[i28]) - 1];
        ym.b bVar7 = aVar3.f139391c;
        ym.b bVar8 = bVar7;
        while (bVar6.b() >= bVar5.b()) {
            int[] iArr10 = bVar6.f139396b;
            if (iArr10[0] == 0) {
                break;
            }
            int b13 = bVar6.b() - bVar5.b();
            int a13 = aVar3.a(iArr10[(iArr10.length - 1) - bVar6.b()], i29);
            if (b13 < 0) {
                throw new IllegalArgumentException();
            }
            ym.a aVar4 = bVar5.f139395a;
            if (a13 == 0) {
                bVar2 = aVar4.f139391c;
                bVar = bVar5;
            } else {
                int length5 = iArr9.length;
                int[] iArr11 = new int[length5 + b13];
                int i33 = 0;
                while (i33 < length5) {
                    iArr11[i33] = aVar4.a(iArr9[i33], a13);
                    i33++;
                    bVar5 = bVar5;
                }
                bVar = bVar5;
                bVar2 = new ym.b(aVar4, iArr11);
            }
            if (b13 < 0) {
                throw new IllegalArgumentException();
            }
            if (a13 == 0) {
                bVar3 = bVar7;
            } else {
                int[] iArr12 = new int[b13 + 1];
                iArr12[0] = a13;
                bVar3 = new ym.b(aVar3, iArr12);
            }
            bVar8 = bVar8.a(bVar3);
            bVar6 = bVar6.a(bVar2);
            bVar5 = bVar;
        }
        int[] iArr13 = new ym.b[]{bVar8, bVar6}[1].f139396b;
        int length6 = i13 - iArr13.length;
        for (int i34 = 0; i34 < length6; i34++) {
            iArr[length + i34] = 0;
        }
        System.arraycopy(iArr13, 0, iArr, length + length6, iArr13.length);
    }

    public final Pair n() {
        t32.f c13;
        ArrayList arrayList = new ArrayList();
        Iterator it = ((zd1.e0) this.f31695c).f141708c.values().iterator();
        while (it.hasNext()) {
            zd1.h hVar = (zd1.h) CollectionsKt.firstOrNull((ArrayList) it.next());
            if (hVar != null && (c13 = hVar.c()) != null) {
                arrayList.add(c13);
            }
        }
        return new Pair(arrayList.toString(), String.valueOf(((zd1.e0) this.f31695c).f141708c.size()));
    }

    public final h32.i0 o() {
        return (h32.i0) this.f31694b;
    }

    @Override // com.google.common.util.concurrent.w
    public final void onFailure(Throwable th3) {
        ((oi.k5) this.f31695c).p();
        Object obj = this.f31695c;
        ((oi.k5) obj).f94912i = false;
        ((oi.k5) obj).T();
        ((oi.k5) this.f31695c).zzj().f95268f.b(th3, "registerTriggerAsync failed with throwable");
    }

    @Override // com.google.common.util.concurrent.w
    public final void onSuccess(Object obj) {
        ((oi.k5) this.f31695c).p();
        Object obj2 = this.f31695c;
        ((oi.k5) obj2).f94912i = false;
        ((oi.k5) obj2).T();
        oi.y3 zzj = ((oi.k5) this.f31695c).zzj();
        zzj.f95275m.b(((zzmh) this.f31694b).f32034f, "registerTriggerAsync ran. uri");
    }

    public final List p() {
        return (List) this.f31695c;
    }

    public final boolean q() {
        ((hf0.b) ((hf0.c) this.f31695c)).getClass();
        if (hf0.b.q()) {
            return false;
        }
        lh0.s sVar = (lh0.s) this.f31694b;
        lh0.z3 activate = lh0.z3.DO_NOT_ACTIVATE_EXPERIMENT;
        sVar.getClass();
        Intrinsics.checkNotNullParameter("enabled", "group");
        Intrinsics.checkNotNullParameter(activate, "activate");
        if (!((lh0.g1) sVar.f83471a).k("android_other_board_more_boards_by_the_same_curator", "enabled", activate)) {
            lh0.s sVar2 = (lh0.s) this.f31694b;
            sVar2.getClass();
            Intrinsics.checkNotNullParameter("employees", "group");
            Intrinsics.checkNotNullParameter(activate, "activate");
            if (!((lh0.g1) sVar2.f83471a).k("android_other_board_more_boards_by_the_same_curator", "employees", activate)) {
                return false;
            }
        }
        return true;
    }

    public final void r(ge1.a event, ee1.h model) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(model, "model");
        nx.d0 d0Var = (nx.d0) this.f31694b;
        h32.f1 eventType = event.getEventType();
        h32.g0 componentType = event.getComponentType();
        h32.u0 elementType = event.getElementType();
        String str = (String) n().f80347b;
        HashMap hashMap = new HashMap();
        hashMap.put("filter_type", String.valueOf(model.f58799a));
        hashMap.put("applied_filter_options", model.f58801c.toString());
        hashMap.put("applied_filter_count", str);
        d0Var.h0((r18 & 1) != 0 ? h32.f1.TAP : eventType, (r18 & 2) != 0 ? null : elementType, (r18 & 4) != 0 ? null : componentType, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : hashMap, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
    }

    public final ArrayList s(CharSequence charSequence) {
        return new jo.g((e2.u) this.f31695c, (Map) this.f31694b, 2).a(charSequence);
    }

    public final void t(y62.g model) {
        Intrinsics.checkNotNullParameter(model, "model");
        CropRectContainer cropRectContainer = (CropRectContainer) this.f31694b;
        r72.j1 j1Var = model.f137937d;
        float f13 = j1Var.f106506a;
        float f14 = j1Var.f106508c + f13;
        float f15 = j1Var.f106509d;
        float f16 = j1Var.f106507b;
        RectF rect = new RectF(f13, f16, f14, f15 + f16);
        cropRectContainer.getClass();
        Intrinsics.checkNotNullParameter(rect, "rect");
        cropRectContainer.f51976m.set(rect);
        cropRectContainer.d(rect);
        ve.h.Z((MaskedImageView) this.f31695c, model.f137938e, new yv1.i(this, 24));
        MaskedImageView maskedImageView = (MaskedImageView) this.f31695c;
        int i13 = MaskedImageView.f51978g;
        maskedImageView.f2(model.f137939f, false, model.f137940g);
    }

    public final String toString() {
        switch (this.f31693a) {
            case 17:
                StringBuilder sb3 = new StringBuilder("GetFriendsResponse{friends=");
                sb3.append((List) this.f31694b);
                sb3.append(", nextPageRequestToken='");
                return a.a.p(sb3, (String) this.f31695c, "'}");
            case 18:
                return "SendMessageResponse{receiverId='" + ((String) this.f31694b) + "', status='" + ((rn.k) this.f31695c) + "'}";
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:218:0x05c6, code lost:
    
        if ("return".equals(r2.f31412b) != false) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x0949, code lost:
    
        if (((com.google.android.gms.internal.measurement.h) r2).f31412b.equals("break") == false) goto L191;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:421:0x0b1d  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x0b21  */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, m.h] */
    /* JADX WARN: Type inference failed for: r13v102, types: [com.google.android.gms.internal.measurement.n] */
    /* JADX WARN: Type inference failed for: r13v108, types: [com.google.android.gms.internal.measurement.f] */
    /* JADX WARN: Type inference failed for: r13v112, types: [com.google.android.gms.internal.measurement.n] */
    /* JADX WARN: Type inference failed for: r13v18, types: [com.google.android.gms.internal.measurement.g] */
    /* JADX WARN: Type inference failed for: r13v196, types: [com.google.android.gms.internal.measurement.g] */
    /* JADX WARN: Type inference failed for: r13v199, types: [com.google.android.gms.internal.measurement.n] */
    /* JADX WARN: Type inference failed for: r13v210 */
    /* JADX WARN: Type inference failed for: r13v236, types: [com.google.android.gms.internal.measurement.e] */
    /* JADX WARN: Type inference failed for: r13v243, types: [com.google.android.gms.internal.measurement.m] */
    /* JADX WARN: Type inference failed for: r13v247 */
    /* JADX WARN: Type inference failed for: r13v289, types: [com.google.android.gms.internal.measurement.p] */
    /* JADX WARN: Type inference failed for: r13v295 */
    /* JADX WARN: Type inference failed for: r13v296 */
    /* JADX WARN: Type inference failed for: r13v39, types: [com.google.android.gms.internal.measurement.g] */
    /* JADX WARN: Type inference failed for: r13v61, types: [com.google.android.gms.internal.measurement.j, com.google.android.gms.internal.measurement.n, com.google.android.gms.internal.measurement.o] */
    /* JADX WARN: Type inference failed for: r13v73, types: [com.google.android.gms.internal.measurement.h] */
    /* JADX WARN: Type inference failed for: r2v19, types: [com.google.android.gms.internal.measurement.n] */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v46, types: [com.google.android.gms.internal.measurement.h] */
    /* JADX WARN: Type inference failed for: r2v50, types: [com.google.android.gms.internal.measurement.h] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.measurement.n u(m.h r12, com.google.android.gms.internal.measurement.n r13) {
        /*
            Method dump skipped, instructions count: 3468
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.x.u(m.h, com.google.android.gms.internal.measurement.n):com.google.android.gms.internal.measurement.n");
    }

    public final Object v() {
        Cursor query;
        HashMap hashMap;
        q4 q4Var = (q4) this.f31694b;
        String str = (String) this.f31695c;
        ContentResolver contentResolver = ((Context) q4Var.f31594b).getContentResolver();
        Uri uri = i4.f31426a;
        synchronized (i4.class) {
            try {
                if (i4.f31431f == null) {
                    i4.f31430e.set(false);
                    i4.f31431f = new HashMap(16, 1.0f);
                    i4.f31436k = new Object();
                    i4.f31437l = false;
                    contentResolver.registerContentObserver(i4.f31426a, true, new k4(0));
                } else if (i4.f31430e.getAndSet(false)) {
                    i4.f31431f.clear();
                    i4.f31432g.clear();
                    i4.f31433h.clear();
                    i4.f31434i.clear();
                    i4.f31435j.clear();
                    i4.f31436k = new Object();
                    i4.f31437l = false;
                }
                Object obj = i4.f31436k;
                if (i4.f31431f.containsKey(str)) {
                    String str2 = (String) i4.f31431f.get(str);
                    return str2 != null ? str2 : null;
                }
                for (String str3 : i4.f31438m) {
                    if (str.startsWith(str3)) {
                        if (!i4.f31437l) {
                            query = contentResolver.query(i4.f31427b, null, null, i4.f31438m, null);
                            if (query == null) {
                                hashMap = null;
                            } else {
                                hashMap = new HashMap(query.getCount(), 1.0f);
                                while (query.moveToNext()) {
                                    try {
                                        hashMap.put(query.getString(0), query.getString(1));
                                    } finally {
                                    }
                                }
                            }
                            if (hashMap != null) {
                                if (!hashMap.isEmpty()) {
                                    Set keySet = hashMap.keySet();
                                    keySet.removeAll(i4.f31432g.keySet());
                                    keySet.removeAll(i4.f31433h.keySet());
                                    keySet.removeAll(i4.f31434i.keySet());
                                    keySet.removeAll(i4.f31435j.keySet());
                                }
                                if (!hashMap.isEmpty()) {
                                    if (i4.f31431f.isEmpty()) {
                                        i4.f31431f = hashMap;
                                    } else {
                                        i4.f31431f.putAll(hashMap);
                                    }
                                }
                                i4.f31437l = true;
                            }
                            if (i4.f31431f.containsKey(str)) {
                                String str4 = (String) i4.f31431f.get(str);
                                return str4 != null ? str4 : null;
                            }
                        }
                        return null;
                    }
                }
                query = contentResolver.query(i4.f31426a, null, null, new String[]{str}, null);
                if (query == null) {
                    return query != null ? null : null;
                }
                try {
                    if (!query.moveToFirst()) {
                        synchronized (i4.class) {
                            try {
                                if (obj == i4.f31436k) {
                                    i4.f31431f.put(str, null);
                                }
                            } finally {
                            }
                        }
                        return null;
                    }
                    String string = query.getString(1);
                    if (string != null && string.equals(null)) {
                        string = null;
                    }
                    synchronized (i4.class) {
                        try {
                            if (obj == i4.f31436k) {
                                i4.f31431f.put(str, string);
                            }
                        } finally {
                        }
                    }
                    if (string != null) {
                        return string;
                    }
                    return null;
                } finally {
                }
            } finally {
            }
        }
    }

    public final void w(s sVar) {
        Iterator it = sVar.f31656a.iterator();
        while (it.hasNext()) {
            ((Map) this.f31694b).put(((g0) it.next()).toString(), sVar);
        }
    }

    public final mk.c x() {
        Map map = (Map) this.f31694b;
        if (map == null) {
            throw new IllegalStateException("Property \"splitInstallErrorCodeByModule\" has not been set");
        }
        Map unmodifiableMap = Collections.unmodifiableMap(map);
        if (unmodifiableMap == null) {
            throw new NullPointerException("Null splitInstallErrorCodeByModule");
        }
        this.f31694b = unmodifiableMap;
        return new mk.c((Integer) this.f31695c, (Map) this.f31694b);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(a.c cVar) {
        this(14);
        this.f31693a = 14;
    }

    public /* synthetic */ x(Object obj, Object obj2, int i13) {
        this.f31693a = i13;
        this.f31695c = obj;
        this.f31694b = obj2;
    }

    public x(li.b bVar, com.google.android.gms.common.api.internal.j jVar) {
        this.f31693a = 3;
        this.f31695c = bVar;
        this.f31694b = jVar;
    }

    public x(m.h hVar) {
        this.f31693a = 16;
        this.f31695c = hVar;
    }

    public x(bz.g screenTimeSpentMetric) {
        this.f31693a = 22;
        Intrinsics.checkNotNullParameter(screenTimeSpentMetric, "screenTimeSpentMetric");
        h32.i0 i0Var = screenTimeSpentMetric.f24164h;
        Intrinsics.checkNotNullExpressionValue(i0Var, "getLogContext(...)");
        this.f31694b = i0Var;
        ArrayList arrayList = screenTimeSpentMetric.f24179j;
        Intrinsics.checkNotNullExpressionValue(arrayList, "getScreenElementMetrics(...)");
        ArrayList arrayList2 = new ArrayList(kotlin.collections.g0.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((bz.f) it.next()).f24164h);
        }
        this.f31695c = arrayList2;
    }

    public x(CropRectContainer cropRectContainer, MaskedImageView imageView, v90.e0 onEvent) {
        this.f31693a = 29;
        Intrinsics.checkNotNullParameter(cropRectContainer, "cropRectContainer");
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        Intrinsics.checkNotNullParameter(onEvent, "onEvent");
        this.f31694b = cropRectContainer;
        this.f31695c = imageView;
        y62.l listener = new y62.l(onEvent, this);
        Intrinsics.checkNotNullParameter(listener, "listener");
        cropRectContainer.f51973j.add(listener);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public x(int i13) {
        this(12, new gi.m(14), new long[10]);
        this.f31693a = i13;
        if (i13 == 6) {
            this.f31694b = new Rect();
            this.f31695c = new Rect();
            return;
        }
        if (i13 != 9) {
            switch (i13) {
                case 12:
                    break;
                case 13:
                    break;
                case 14:
                    this.f31694b = null;
                    this.f31695c = null;
                    break;
                default:
                    this.f31694b = new HashMap();
                    this.f31695c = new s(6);
                    w(new s(0));
                    w(new s(1));
                    w(new s(2));
                    w(new s(3));
                    w(new s(4));
                    w(new s(5));
                    w(new s(7));
                    break;
            }
        }
    }

    public x(lh0.s experiments, hf0.c deviceInfoProvider) {
        this.f31693a = 25;
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(deviceInfoProvider, "deviceInfoProvider");
        this.f31694b = experiments;
        this.f31695c = deviceInfoProvider;
    }

    public x(ae0.a dao, b60.b activeUserManager) {
        this.f31693a = 24;
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        this.f31694b = dao;
        this.f31695c = activeUserManager;
    }

    public x(nx.d0 pinalytics, zd1.e0 inlineFilterManager) {
        this.f31693a = 27;
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(inlineFilterManager, "inlineFilterManager");
        this.f31694b = pinalytics;
        this.f31695c = inlineFilterManager;
    }

    public x(e2.u uVar, ArrayList arrayList) {
        this.f31693a = 19;
        this.f31695c = uVar;
        LinkedHashMap linkedHashMap = new LinkedHashMap(Collections.unmodifiableMap(uVar.f56906a));
        linkedHashMap.put("user_inputs", new jo.f("user_inputs", arrayList));
        HashMap hashMap = new HashMap();
        for (jo.f fVar : linkedHashMap.values()) {
            hashMap.put(fVar.f77136a, fVar.f77138c);
        }
        this.f31694b = hashMap;
    }

    public x(ym.a aVar) {
        this.f31693a = 15;
        this.f31694b = aVar;
        ArrayList arrayList = new ArrayList();
        this.f31695c = arrayList;
        arrayList.add(new ym.b(aVar, new int[]{1}));
    }

    public x(m60.w eventManager, ax.a adsStlCache) {
        this.f31693a = 21;
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(adsStlCache, "adsStlCache");
        this.f31694b = eventManager;
        this.f31695c = adsStlCache;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(Object obj) {
        this(13);
        this.f31693a = 13;
    }

    public x(Boolean[] imageStateList) {
        this.f31693a = 26;
        Intrinsics.checkNotNullParameter(imageStateList, "imageStateList");
        this.f31694b = imageStateList;
        this.f31695c = a.cb.r("create(...)");
    }

    public x() {
        x xVar = el.a.f59444d;
        this.f31693a = 12;
        this.f31694b = new gi.m((gi.m) xVar.f31694b);
        this.f31695c = Arrays.copyOf((long[]) xVar.f31695c, 10);
    }
}
