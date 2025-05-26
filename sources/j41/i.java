package j41;

import a.cb;
import android.os.Environment;
import android.text.Html;
import android.text.Spannable;
import android.text.Spanned;
import c61.m1;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.tg0;
import com.pinterest.api.model.vh;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.settings.account.view.AccountConversionView;
import df.j1;
import f31.a0;
import h32.a4;
import h32.d4;
import i51.b0;
import java.io.File;
import java.util.HashSet;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import kotlin.ranges.IntRange;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.z;
import o71.u;
import q5.w0;
import t3.s1;
import u50.f0;
import w41.r1;
import y01.o1;
import yn2.c0;
import zp.u0;
import zy.d0;

/* loaded from: classes5.dex */
public final class i extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f74659i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f74660j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(Object obj, int i13) {
        super(1);
        this.f74659i = i13;
        this.f74660j = obj;
    }

    public final bm1.m b(bm1.m it) {
        int i13 = this.f74659i;
        Object obj = this.f74660j;
        switch (i13) {
            case 14:
                Intrinsics.checkNotNullParameter(it, "it");
                return bm1.m.e(it, null, null, (bm1.l) obj, false, null, 0, null, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_CAROUSEL);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return bm1.m.e(it, null, null, ((g71.b) obj).f63885a, false, null, 0, null, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_CAROUSEL);
        }
    }

    public final rn1.a e(rn1.a it) {
        int i13 = this.f74659i;
        Object obj = this.f74660j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.h2((Spannable) obj), null, null, null, null, 0, null, null, null, null, true, 0, null, null, null, null, null, false, null, null, 2096126);
            case 3:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.h2(((w41.h) obj).f128009a), null, null, null, null, 0, d7.b.Z(!z.j(r3.f128009a)), null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
            case 10:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, null, null, 0, d7.b.Z(((tg0) obj).f42209c), null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097087);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                Spanned string = Html.fromHtml(((AccountConversionView) obj).getContext().getString(c52.e.convert_business_account_terms_of_service), 0);
                Intrinsics.checkNotNullExpressionValue(string, "fromHtml(...)");
                Intrinsics.checkNotNullParameter(string, "string");
                return rn1.a.y(it, new f0(string), null, null, null, null, 0, null, null, null, null, true, 0, null, null, null, null, null, false, null, null, 2096126);
        }
    }

    public final void f(f30 pinDeleted) {
        List list;
        String str;
        int i13 = this.f74659i;
        Object obj = this.f74660j;
        switch (i13) {
            case 17:
                Intrinsics.checkNotNullParameter(pinDeleted, "pinDeleted");
                o71.z zVar = (o71.z) obj;
                vh vhVar = zVar.f93417d;
                if (vhVar != null && (list = vhVar.f42865w) != null) {
                    w0 K = CollectionsKt.K(list);
                    Intrinsics.checkNotNullParameter(K, "<this>");
                    IndexedValue indexedValue = (IndexedValue) c0.l(c0.j(c0.j(new yn2.n(K, 0), u.f93378k), new u0(10, pinDeleted)));
                    if (indexedValue != null) {
                        list.remove(indexedValue.f80349a);
                        zVar.r3();
                        break;
                    }
                }
                break;
            default:
                i91.h hVar = (i91.h) obj;
                Intrinsics.f(pinDeleted);
                Intrinsics.checkNotNullParameter(pinDeleted, "pin");
                String s03 = j1.s0(pinDeleted);
                if (s03 == null && (s03 = pinDeleted.z6()) == null) {
                    s03 = pinDeleted.getUid();
                    Intrinsics.checkNotNullExpressionValue(s03, "getUid(...)");
                }
                wy0 n13 = b40.n(pinDeleted);
                if (n13 == null || (str = dl2.b.i1(n13)) == null) {
                    str = "";
                }
                String replace = new Regex("[^a-zA-Z0-9_]+").replace(s1.c("Pinterest-", str, "-", s03), "-");
                if (new File(a.a.l(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getPath(), "/", replace, ".mp4")).exists()) {
                    replace = a.a.C(replace, StringsKt.Y(cb.g("toString(...)"), new IntRange(0, 4, 1)));
                }
                hVar.f71837d = a.a.C(replace, ".mp4");
                break;
        }
    }

    public final void h(Throwable error) {
        int i13 = this.f74659i;
        Object obj = this.f74660j;
        switch (i13) {
            case 23:
                HashSet hashSet = tb0.h.f117076w;
                tb0.g.f117075a.q(error, "Failed to download image", tb0.p.SHARING);
                ((i92.k) ((android.support.v4.media.a) obj).f15842f).h(a62.e.export_failed);
                break;
            default:
                Intrinsics.checkNotNullParameter(error, "error");
                ig1.b.n(error, w42.c.send_pin_server_error, (dr.i) obj);
                break;
        }
    }

    public final void i(l82.n start) {
        int i13 = this.f74659i;
        int i14 = 1;
        int i15 = 0;
        int i16 = 2;
        Object obj = this.f74660j;
        switch (i13) {
            case 4:
                Intrinsics.checkNotNullParameter(start, "$this$start");
                w41.s1 s1Var = (w41.s1) obj;
                d0 d0Var = s1Var.f128078d;
                start.a(d0Var, new r1(6), d0Var.a());
                a0 a0Var = s1Var.f128079e;
                start.a(a0Var, new r1(i15), a0Var.a());
                k51.u uVar = s1Var.f128080f;
                start.a(uVar, new r1(i14), uVar.a());
                v41.h hVar = s1Var.f128081g;
                start.a(hVar, new r1(3), hVar.a());
                v41.g gVar = s1Var.f128082h;
                start.a(gVar, new r1(4), gVar.a());
                v41.e eVar = s1Var.f128083i;
                start.a(eVar, new r1(5), eVar.a());
                mb0.a aVar = (mb0.a) s1Var.f128085k.f63225b;
                start.a(aVar, new r1(i16), aVar.a());
                break;
            case 9:
                Intrinsics.checkNotNullParameter(start, "$this$start");
                b0 b0Var = (b0) obj;
                d0 d0Var2 = b0Var.f71576c;
                start.a(d0Var2, new o1(25), d0Var2.a());
                i51.c0 c0Var = b0Var.f71577d;
                start.a(c0Var, new o1(24), c0Var.a());
                break;
            case 12:
                Intrinsics.checkNotNullParameter(start, "$this$buildAndStart");
                m1 m1Var = (m1) obj;
                m1Var.f26622k.h(m1Var.f26624m);
                mb0.a aVar2 = (mb0.a) m1Var.f26625n.f63225b;
                start.a(aVar2, new o1(26), aVar2.a());
                d0 d0Var3 = m1Var.f26616e;
                start.a(d0Var3, new o1(27), d0Var3.a());
                w60.d dVar = m1Var.f26617f;
                start.a(dVar, new o1(28), dVar.a());
                mb0.a aVar3 = m1Var.f26618g;
                start.a(aVar3, new o1(29), aVar3.a());
                nu.b bVar = m1Var.f26619h;
                start.a(bVar, new kp.n(0), bVar.a());
                sy.a a13 = m1Var.f26620i.a(s92.i.SEARCH_TAB_RENDER, s92.l.USER_NAVIGATION, d4.SEARCH, a4.SEARCH_TAB, false);
                start.a(a13, new kp.n(1), a13.a());
                mb0.a aVar4 = m1Var.f26621j;
                start.a(aVar4, new kp.n(2), aVar4.a());
                break;
            default:
                Intrinsics.checkNotNullParameter(start, "$this$start");
                l82.n.b(start, ((n91.c0) obj).f90036c);
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:91:0x0237, code lost:
    
        if (r8.b(r7) == true) goto L72;
     */
    /* JADX WARN: Removed duplicated region for block: B:74:0x023c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01dc A[SYNTHETIC] */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke(java.lang.Object r29) {
        /*
            Method dump skipped, instructions count: 850
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j41.i.invoke(java.lang.Object):java.lang.Object");
    }
}
