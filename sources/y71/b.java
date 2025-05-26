package y71;

import a.cb;
import android.app.Activity;
import android.content.Context;
import android.text.Html;
import android.text.Spanned;
import b60.d;
import c52.e;
import ca1.o;
import com.pinterest.api.model.iz;
import com.pinterest.api.model.lz;
import com.pinterest.api.model.mz;
import com.pinterest.api.model.vs;
import com.pinterest.api.model.wy0;
import com.pinterest.error.NetworkResponseError;
import com.pinterest.feature.search.visual.lens.remoterequest.LensFirstRetrofitPagedRemoteRequest;
import com.pinterest.feature.settings.claimedaccount.handshake.listaccounts.ClaimedAccountItemView;
import com.pinterest.feature.settings.notifications.l0;
import com.pinterest.feature.settings.notifications.m0;
import com.pinterest.feature.settings.notifications.n0;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.navigation.Navigation;
import df.j1;
import dl1.u;
import ea1.k1;
import ea1.l1;
import ea1.v0;
import ea1.z0;
import f0.h;
import ga1.p;
import ja.j0;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import jk2.a1;
import kh2.k3;
import kk2.m;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.collections.q0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import m60.w;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.RequestBody$Companion$toRequestBody$2;
import p91.c0;
import u50.f0;
import u50.h0;
import u50.i0;
import u50.r;
import v.f1;
import va1.j;
import va1.k;
import va1.l;
import va1.m1;
import va1.n;
import w71.f;
import w71.g;
import w71.i;
import wm1.k0;
import wm1.q;
import wm1.y;
import zy.d0;

/* loaded from: classes5.dex */
public final class b extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f138011i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f138012j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f138013k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i13, Object obj, Object obj2) {
        super(1);
        this.f138011i = i13;
        this.f138012j = obj;
        this.f138013k = obj2;
    }

    public final rn1.a b(rn1.a it) {
        String str;
        CharSequence string;
        i0 i0Var = h0.f120562a;
        int i13 = this.f138011i;
        Object obj = this.f138013k;
        Object obj2 = this.f138012j;
        switch (i13) {
            case 8:
                Intrinsics.checkNotNullParameter(it, "it");
                List b13 = e0.b(vn1.b.START);
                ba1.a aVar = (ba1.a) obj2;
                String str2 = aVar.f22342e;
                i0 i0Var2 = aVar.f22339b;
                String str3 = aVar.f22342e;
                boolean z13 = aVar.f22343f;
                if (str2 != null && !z13) {
                    i0Var = bs1.c.j2(new String[0], e.not_connected);
                } else if (str2 != null) {
                    String string2 = ((ClaimedAccountItemView) obj).getContext().getString(e.connected_to, str3);
                    Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                    i0Var = bs1.c.h2(string2);
                } else if (i0Var2 != null) {
                    i0Var = i0Var2;
                }
                return rn1.a.y(it, i0Var, (str3 == null || z13) ? vn1.c.SUBTLE : vn1.c.ERROR, b13, null, null, 0, (str3 == null && i0Var2 == null) ? fm1.c.GONE : fm1.c.VISIBLE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097080);
            case 9:
                Intrinsics.checkNotNullParameter(it, "it");
                String string3 = ((o) obj2).getString(e.reconnected_connected_to, (String) obj);
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                return rn1.a.y(it, bs1.c.h2(string3), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
            case 12:
                Intrinsics.checkNotNullParameter(it, "it");
                GestaltText gestaltText = (GestaltText) obj2;
                boolean linksClickable = gestaltText.getLinksClickable();
                int i14 = v0.F0;
                Integer valueOf = ea1.i0.f58063a[((v0) obj).a8().ordinal()] == 1 ? Integer.valueOf(e.settings_claimed_accounts_instagram_description) : null;
                if (valueOf != null) {
                    CharSequence a03 = j1.a0(gestaltText.getContext().getString(valueOf.intValue()));
                    Intrinsics.checkNotNullExpressionValue(a03, "fromHtml(...)");
                    Context context = gestaltText.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    i0Var = bs1.c.h2(h.l0(dl2.b.x0(context, vn1.c.ERROR.getColorRes()), a03));
                }
                return rn1.a.y(it, i0Var, null, null, null, null, 0, null, null, null, null, linksClickable, 0, null, null, null, null, null, false, null, null, 2096126);
            case 17:
                Intrinsics.checkNotNullParameter(it, "it");
                String string4 = ((p) obj2).getString(e.connected_to, ((vs) obj).g());
                Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                return rn1.a.y(it, bs1.c.h2(string4), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
            case 19:
                Intrinsics.checkNotNullParameter(it, "it");
                String string5 = ((la1.h) obj2).getContext().getString(b52.c.deactivate_account_footer_message);
                Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
                Object[] objArr = new Object[1];
                wy0 wy0Var = (wy0) obj;
                if (wy0Var == null || (str = wy0Var.N2()) == null) {
                    str = "";
                }
                objArr[0] = str;
                String format = String.format(string5, Arrays.copyOf(objArr, 1));
                Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                Spanned fromHtml = Html.fromHtml(format);
                Intrinsics.checkNotNullExpressionValue(fromHtml, "fromHtml(...)");
                return rn1.a.y(it, bs1.c.h2(fromHtml), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                va1.p pVar = (va1.p) obj2;
                if (pVar instanceof n) {
                    xa1.h hVar = (xa1.h) obj;
                    string = j1.W("%s (%d)", (String) hVar.f134452a.f125490c.getValue(), Integer.valueOf(((Number) hVar.f134452a.f125489b.getValue()).intValue()));
                } else {
                    string = ((pVar instanceof j) || Intrinsics.d(pVar, k.f125198d) || Intrinsics.d(pVar, l.f125203d)) ? Html.fromHtml(((xa1.h) obj).getResources().getString(pVar.f125224b), 0) : ((xa1.h) obj).getResources().getString(pVar.f125224b);
                }
                Intrinsics.f(string);
                Intrinsics.checkNotNullParameter(string, "string");
                return rn1.a.y(it, new f0(string), null, null, null, null, 0, null, null, null, null, true, 0, null, null, null, null, null, false, null, null, 2096126);
        }
    }

    public final uj2.f0 e(Boolean itemExists) {
        int i13 = this.f138011i;
        int i14 = 0;
        int i15 = 1;
        Object obj = this.f138012j;
        Object obj2 = this.f138013k;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(itemExists, "itemExists");
                if (itemExists.booleanValue()) {
                    g gVar = ((c) obj).f138016c;
                    gVar.getClass();
                    return c.d(new fk2.h(new f(gVar, (x71.b) obj2, i15), 2));
                }
                g gVar2 = ((c) obj).f138016c;
                gVar2.getClass();
                return c.d(new fk2.h(new f(gVar2, (x71.b) obj2, i14), 2));
            case 1:
                Intrinsics.checkNotNullParameter(itemExists, "pageExists");
                if (itemExists.booleanValue()) {
                    i iVar = ((c) obj).f138015b;
                    iVar.getClass();
                    return c.d(new fk2.h(new w71.h(iVar, (x71.c) obj2, i15), 2));
                }
                i iVar2 = ((c) obj).f138015b;
                iVar2.getClass();
                return c.d(new fk2.h(new w71.h(iVar2, (x71.c) obj2, i14), 2));
            default:
                Intrinsics.checkNotNullParameter(itemExists, "exists");
                if (!itemExists.booleanValue()) {
                    z71.c cVar = new z71.c(((u) obj2).a(), new z71.e(cb.g("toString(...)"), null, q0.f80391a));
                    d81.c cVar2 = (d81.c) obj;
                    c cVar3 = cVar2.f53995b;
                    wy0 f13 = ((d) cVar2.f53994a).f();
                    String uid = f13 != null ? f13.getUid() : null;
                    if (uid == null) {
                        uid = "";
                    }
                    return cVar3.a(uid, cVar).k(new d51.a(23, new j41.i(cVar, 19)));
                }
                c cVar4 = ((d81.c) obj).f53995b;
                String draftId = ((u) obj2).a();
                cVar4.getClass();
                Intrinsics.checkNotNullParameter(draftId, "draftId");
                w71.d dVar = cVar4.f138014a;
                dVar.getClass();
                ja.f0 d2 = ja.f0.d(1, "SELECT * FROM collage_drafts WHERE id = ?");
                d2.c1(1, draftId);
                m k13 = j0.b(new w71.b(dVar, d2, i15)).k(new d51.a(21, a.f138010i));
                Intrinsics.checkNotNullExpressionValue(k13, "map(...)");
                return k13;
        }
    }

    public final void f(wy0 wy0Var) {
        int i13 = this.f138011i;
        Object obj = this.f138013k;
        Object obj2 = this.f138012j;
        switch (i13) {
            case 4:
                p91.i iVar = (p91.i) obj2;
                if (iVar.f99290e) {
                    iVar.f99287b.m(((yk1.a) iVar.f99289d).f139224a.getString(e.new_country, ((m91.b) obj).f86724d));
                }
                of0.a aVar = new of0.a(null);
                w wVar = iVar.f99288c;
                wVar.d(aVar);
                m91.b bVar = (m91.b) obj;
                String str = bVar.f86724d;
                if (str == null) {
                    str = "";
                }
                String str2 = bVar.f86723c;
                wVar.d(new m91.p(str, str2 != null ? str2 : ""));
                if (iVar.isBound()) {
                    ((q91.m) ((l91.d) iVar.getView())).P7();
                    break;
                }
                break;
            case 22:
                ab1.c listener = (ab1.c) obj2;
                Intrinsics.f(wy0Var);
                listener.f1704d = wy0Var;
                bb1.i iVar2 = (bb1.i) ((ya1.a) obj);
                iVar2.getClass();
                Intrinsics.checkNotNullParameter(listener, "listener");
                iVar2.f22512m0 = listener;
                break;
            default:
                ab1.l listener2 = (ab1.l) obj2;
                Intrinsics.f(wy0Var);
                listener2.f1728d = wy0Var;
                bb1.s sVar = (bb1.s) ((ya1.d) obj);
                sVar.getClass();
                Intrinsics.checkNotNullParameter(listener2, "listener");
                sVar.f22556n0 = listener2;
                break;
        }
    }

    public final void h(Throwable th3) {
        f1 f1Var;
        qz.d M;
        int i13 = this.f138011i;
        Object obj = this.f138013k;
        Object obj2 = this.f138012j;
        switch (i13) {
            case 10:
                e82.f fVar = (e82.f) ((da1.c) obj).f54230c;
                ((r) obj2).a(new ca1.b(fVar.f57841k, fVar.f57842l, fVar.f57843m));
                break;
            case 20:
                ta1.f fVar2 = (ta1.f) obj2;
                ((ua1.d) ((ra1.a) fVar2.getView())).W8(th3 != null ? th3.getMessage() : null);
                fVar2.v3((m1) obj, true);
                break;
            default:
                NetworkResponseError networkResponseError = th3 instanceof NetworkResponseError ? (NetworkResponseError) th3 : null;
                if (networkResponseError != null && (f1Var = networkResponseError.f45043a) != null && (M = k3.M(f1Var)) != null) {
                    r1 = M.f105384d;
                }
                ((ob1.b) obj2).p3((com.pinterest.feature.settings.passcode.c) obj, false, r1);
                break;
        }
    }

    public final void i(vd0.c cVar) {
        int i13 = this.f138011i;
        Object obj = this.f138013k;
        Object obj2 = this.f138012j;
        switch (i13) {
            case 15:
                ((k1) obj).getClass();
                ((r) obj2).a(new ea1.h());
                break;
            case 16:
                ((fa1.n) obj2).f61582c.a(((l1) obj).f58079a);
                break;
            case 17:
            default:
                com.bumptech.glide.d.D0(new File(lb0.g.c("COUNTRIES", true)), cVar.f125623a.toString());
                ((bc1.d) obj2).f22641c.d((Navigation) obj);
                break;
            case 18:
                ((e82.f) ((da1.c) obj2).f54230c).a(((ga1.u) obj).f64654a);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v87, types: [java.lang.Throwable] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String string;
        Date date;
        Iterator it;
        i0 x13;
        boolean z13;
        int i13 = 6;
        int i14 = this.f138011i;
        int i15 = 0;
        Object obj2 = this.f138013k;
        Object obj3 = this.f138012j;
        switch (i14) {
            case 0:
                return e((Boolean) obj);
            case 1:
                return e((Boolean) obj);
            case 2:
                return e((Boolean) obj);
            case 3:
                qz.f0 it2 = (qz.f0) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                x12.a pagedListService = ((LensFirstRetrofitPagedRemoteRequest) obj3).getPagedListService();
                Object obj4 = ((j90.b) obj2).getParams()[0];
                Intrinsics.g(obj4, "null cannot be cast to non-null type kotlin.String");
                String str = (String) obj4;
                it2.getClass();
                MediaType.f95651d.getClass();
                MediaType b13 = MediaType.Companion.b("text/plain");
                ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                for (Map.Entry entry : it2.f105397a.entrySet()) {
                    String str2 = (String) entry.getKey();
                    String str3 = (String) entry.getValue();
                    RequestBody.f95711a.getClass();
                    concurrentHashMap.put(str2, RequestBody.Companion.a(str3, b13));
                }
                for (p5.b bVar : qz.f0.a(it2.f105400d, null)) {
                    RequestBody.Companion companion = RequestBody.f95711a;
                    Object second = bVar.f98856b;
                    Intrinsics.checkNotNullExpressionValue(second, "second");
                    companion.getClass();
                    RequestBody$Companion$toRequestBody$2 a13 = RequestBody.Companion.a((String) second, b13);
                    Object first = bVar.f98855a;
                    Intrinsics.checkNotNullExpressionValue(first, "first");
                    concurrentHashMap.put(first, a13);
                }
                ConcurrentHashMap concurrentHashMap2 = it2.f105398b;
                ArrayList arrayList = new ArrayList(concurrentHashMap2.size());
                for (Map.Entry entry2 : concurrentHashMap2.entrySet()) {
                    String str4 = (String) entry2.getKey();
                    qz.e0 e0Var = (qz.e0) entry2.getValue();
                    byte[] b14 = ap2.e.b(e0Var.f105391a);
                    MediaType.f95651d.getClass();
                    arrayList.add(zh0.d.a(RequestBody.Companion.e(RequestBody.f95711a, b14, MediaType.Companion.b(e0Var.f105392b), 6), str4, "binary", "null"));
                }
                ConcurrentHashMap concurrentHashMap3 = it2.f105399c;
                ArrayList arrayList2 = new ArrayList(concurrentHashMap3.size());
                Iterator it3 = concurrentHashMap3.entrySet().iterator();
                if (!it3.hasNext()) {
                    return pagedListService.a(str, concurrentHashMap, CollectionsKt.l0(arrayList2, arrayList));
                }
                Map.Entry entry3 = (Map.Entry) it3.next();
                ep.b.A(entry3.getValue());
                throw null;
            case 4:
                f((wy0) obj);
                return Unit.f80348a;
            case 5:
                qr1.d authResult = (qr1.d) obj;
                Intrinsics.checkNotNullParameter(authResult, "authResult");
                c0 c0Var = (c0) obj3;
                String str5 = (String) obj2;
                qr1.j jVar = qr1.j.f105010b;
                wy0 f13 = ((d) c0Var.f99263c).f();
                String N2 = f13 != null ? f13.N2() : null;
                nr1.a aVar = new nr1.a(jVar, N2 != null ? N2 : "", str5);
                uk2.f fVar = c0Var.f99275o;
                fVar.getClass();
                a1 a1Var = new a1(fVar);
                Intrinsics.checkNotNullExpressionValue(a1Var, "hide(...)");
                fk2.f0 q13 = new fk2.c(1, c0Var.f99269i.E(aVar, c0Var.f99270j, a1Var), ck2.i.f27926f).q(authResult);
                Intrinsics.checkNotNullExpressionValue(q13, "toSingleDefault(...)");
                return q13;
            case 6:
                rn1.k bind = (rn1.k) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                x91.s sVar = (x91.s) obj3;
                String str6 = ((x91.a) obj2).f134304b;
                int i16 = x91.s.L0;
                sVar.getClass();
                if (str6.length() > 0) {
                    string = sVar.getResources().getString(e.blocked_accounts_page_no_results, str6);
                    Intrinsics.f(string);
                } else {
                    string = sVar.getResources().getString(e.blocked_accounts_page_empty_state);
                    Intrinsics.f(string);
                }
                CharSequence a03 = j1.a0(string);
                Intrinsics.checkNotNullExpressionValue(a03, "fromHtml(...)");
                bind.f(a03);
                return Unit.f80348a;
            case 7:
                Intrinsics.checkNotNullParameter((String) obj, "it");
                int i17 = x91.s.L0;
                ((x91.s) obj3).b9().f134341i.e().a(new x91.b((String) obj2));
                return Unit.f80348a;
            case 8:
                return b((rn1.a) obj);
            case 9:
                return b((rn1.a) obj);
            case 10:
                h((Throwable) obj);
                return Unit.f80348a;
            case 11:
                k0 bind2 = (k0) obj;
                Intrinsics.checkNotNullParameter(bind2, "$this$bind");
                String string2 = (String) obj3;
                Intrinsics.checkNotNullExpressionValue(string2, "$instagramUsername");
                Intrinsics.checkNotNullParameter(string2, "string");
                q middleItem = new q(new f0(string2), null, false, i13);
                bind2.getClass();
                Intrinsics.checkNotNullParameter(middleItem, "middleItem");
                bind2.f130312c = middleItem;
                y startItem = new y(rm1.q.INSTAGRAM);
                Intrinsics.checkNotNullParameter(startItem, "startItem");
                bind2.f130311b = startItem;
                String string3 = ((v0) obj2).getString(e.unclaim);
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                Intrinsics.checkNotNullParameter(string3, "string");
                wm1.e endItem = new wm1.e(new f0(string3), false, null, yl1.i.b(), 22);
                Intrinsics.checkNotNullParameter(endItem, "endItem");
                bind2.f130313d = endItem;
                return Unit.f80348a;
            case 12:
                return b((rn1.a) obj);
            case 13:
                e82.g gVar = (e82.g) obj;
                try {
                    date = new SimpleDateFormat("dd/MM/yyyy").parse("04/12/2024");
                } catch (Exception unused) {
                    date = null;
                }
                r rVar = (r) obj3;
                Intrinsics.f(gVar);
                e82.f fVar2 = ((fa1.n) obj2).f61582c;
                rVar.a(new ea1.s(gVar, fVar2.f57835e, fVar2.f57836f, System.currentTimeMillis(), date != null ? date.getTime() : 0L));
                return Unit.f80348a;
            case 14:
                Activity it4 = (Activity) obj;
                Intrinsics.checkNotNullParameter(it4, "it");
                ((fa1.n) obj3).f61581b.w(it4, ((z0) obj2).f58173a);
                return Unit.f80348a;
            case 15:
                i((vd0.c) obj);
                return Unit.f80348a;
            case 16:
                i((vd0.c) obj);
                return Unit.f80348a;
            case 17:
                return b((rn1.a) obj);
            case 18:
                i((vd0.c) obj);
                return Unit.f80348a;
            case 19:
                return b((rn1.a) obj);
            case 20:
                h((Throwable) obj);
                return Unit.f80348a;
            case 21:
                return b((rn1.a) obj);
            case 22:
                f((wy0) obj);
                return Unit.f80348a;
            case 23:
                f((wy0) obj);
                return Unit.f80348a;
            case 24:
                tt1.a it5 = (tt1.a) obj;
                Intrinsics.checkNotNullParameter(it5, "it");
                Object c13 = it5.c();
                Intrinsics.checkNotNullExpressionValue(c13, "getData(...)");
                ArrayList arrayList3 = new ArrayList();
                ll.j jVar2 = (ll.j) obj3;
                Iterator it6 = ((Iterable) c13).iterator();
                int i18 = 0;
                while (it6.hasNext()) {
                    Object next = it6.next();
                    int i19 = i18 + 1;
                    if (i18 < 0) {
                        ?? r13 = r9;
                        kotlin.collections.f0.p();
                        throw r13;
                    }
                    lz lzVar = (lz) next;
                    if (ll.j.e(jVar2, lzVar.getKey())) {
                        arrayList3.add(m0.f48241a);
                    }
                    arrayList3.add(new l0(lzVar.getLabel()));
                    if (!ll.j.e(jVar2, lzVar.getKey())) {
                        arrayList3.add(n0.f48245a);
                    }
                    String valueOf = String.valueOf(obj2);
                    int i23 = i15;
                    for (Object obj5 : lzVar.getSubcategories()) {
                        int i24 = i23 + 1;
                        if (i23 < 0) {
                            kotlin.collections.f0.p();
                            throw null;
                        }
                        mz mzVar = (mz) obj5;
                        String label = mzVar.getLabel();
                        if (ll.j.e(jVar2, lzVar.getKey())) {
                            int i25 = e52.c.notif_settings_global_permissions_description;
                            it = it6;
                            String[] formatArgs = new String[i15];
                            Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
                            x13 = new u50.k0(i25, new ArrayList(0));
                        } else {
                            it = it6;
                            String channelOptionsLabel = mzVar.getChannelOptionsLabel();
                            x13 = ep.b.x(channelOptionsLabel, "string", channelOptionsLabel);
                        }
                        String description = mzVar.getDescription();
                        List channelOptions = mzVar.getChannelOptions();
                        com.pinterest.feature.settings.notifications.k0 k0Var = new com.pinterest.feature.settings.notifications.k0(label, x13, description, false, ll.j.e(jVar2, lzVar.getKey()), i18 >= ((List) it5.c()).size() + (-2) && i23 == lzVar.getSubcategories().size() - 1, lzVar.getKey(), mzVar.getKey(), "", "", "", "", "", "", channelOptions, null, null, null, null);
                        Iterator it7 = channelOptions.iterator();
                        String str7 = "";
                        String str8 = str7;
                        String str9 = str8;
                        String str10 = str9;
                        String str11 = str10;
                        String str12 = str11;
                        Boolean bool = null;
                        Boolean bool2 = null;
                        Boolean bool3 = null;
                        while (it7.hasNext()) {
                            iz izVar = (iz) it7.next();
                            String str13 = izVar.getCom.appsflyer.AppsFlyerProperties.CHANNEL java.lang.String();
                            tt1.a aVar2 = it5;
                            int hashCode = str13.hashCode();
                            Iterator it8 = it7;
                            if (hashCode != 3377875) {
                                if (hashCode != 3452698) {
                                    if (hashCode == 96619420 && str13.equals("email")) {
                                        Boolean valueOf2 = Boolean.valueOf(izVar.getValue());
                                        str8 = izVar.getCategoryKey();
                                        String subcategoryKey = izVar.getSubcategoryKey();
                                        if (Intrinsics.d(subcategoryKey, "ONLY_REQUIRED")) {
                                            valueOf2 = Boolean.valueOf(!izVar.getValue());
                                        }
                                        bool2 = valueOf2;
                                        str11 = subcategoryKey;
                                    }
                                } else if (str13.equals("push")) {
                                    Boolean valueOf3 = Boolean.valueOf(izVar.getValue());
                                    str7 = izVar.getCategoryKey();
                                    String subcategoryKey2 = izVar.getSubcategoryKey();
                                    if (Intrinsics.d(subcategoryKey2, "NO_PUSH")) {
                                        valueOf3 = Boolean.valueOf(!izVar.getValue());
                                    }
                                    bool = valueOf3;
                                    str10 = subcategoryKey2;
                                }
                            } else if (str13.equals("news")) {
                                Boolean valueOf4 = Boolean.valueOf(izVar.getValue());
                                str12 = izVar.getCategoryKey();
                                String subcategoryKey3 = izVar.getSubcategoryKey();
                                if (Intrinsics.d(subcategoryKey3, "NONE_IN_APP")) {
                                    valueOf4 = Boolean.valueOf(!izVar.getValue());
                                }
                                bool3 = valueOf4;
                                str9 = subcategoryKey3;
                            }
                            it5 = aVar2;
                            it7 = it8;
                        }
                        arrayList3.add(com.pinterest.feature.settings.notifications.k0.b(k0Var, null, Intrinsics.d(k0Var.f48235t, valueOf), str7, str8, str9, str10, str11, str12, null, bool, bool2, bool3, null, 278775));
                        it6 = it;
                        it5 = it5;
                        i23 = i24;
                        i15 = 0;
                    }
                    arrayList3.add(n0.f48245a);
                    it6 = it6;
                    r9 = null;
                    i18 = i19;
                    it5 = it5;
                    i15 = 0;
                }
                return arrayList3;
            case 25:
                tt1.a it9 = (tt1.a) obj;
                Intrinsics.checkNotNullParameter(it9, "it");
                if (!((mz) it9.c()).getChannelOptions().isEmpty()) {
                    return kotlin.jvm.internal.j.z((ao2.j0) obj2, null, null, new eb1.c((com.pinterest.feature.settings.notifications.f0) obj3, it9, null), 3);
                }
                com.pinterest.feature.settings.notifications.f0 f0Var = (com.pinterest.feature.settings.notifications.f0) obj3;
                StringBuilder o13 = cb.o("No options found for ", f0Var.f48187b, "/");
                o13.append(f0Var.f48188c);
                throw new IllegalStateException(o13.toString());
            case 26:
                l82.n buildAndStart = (l82.n) obj;
                Intrinsics.checkNotNullParameter(buildAndStart, "$this$buildAndStart");
                w60.d dVar = (w60.d) obj3;
                buildAndStart.a(dVar, new kp.n(22), dVar.a());
                d0 d0Var = (d0) obj2;
                buildAndStart.a(d0Var, new kp.n(23), d0Var.a());
                return Unit.f80348a;
            case 27:
                h((Throwable) obj);
                return Unit.f80348a;
            case 28:
                i((vd0.c) obj);
                return Unit.f80348a;
            default:
                yl1.b it10 = (yl1.b) obj;
                Intrinsics.checkNotNullParameter(it10, "it");
                String str14 = (String) obj3;
                if (str14.length() <= 500) {
                    int i26 = hc1.i.f68719q0;
                    Navigation navigation = ((hc1.i) obj2).I;
                    r9 = navigation != null ? navigation.v0("about_arg_key") : null;
                    if (!Intrinsics.d(str14, r9 != null ? r9 : "")) {
                        z13 = true;
                        return yl1.b.f(it10, null, z13, null, null, null, null, null, null, 0, null, 1021);
                    }
                }
                z13 = false;
                return yl1.b.f(it10, null, z13, null, null, null, null, null, null, 0, null, 1021);
        }
    }
}
