package k1;

import android.content.Context;
import android.graphics.Rect;
import android.media.MediaCodec;
import android.os.Bundle;
import android.util.Log;
import android.view.Surface;
import androidx.fragment.app.Fragment;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.LegacyYouTubePlayerView;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.WebViewYouTubePlayer;
import com.pinterest.activity.pin.view.unifiedcomments.CommentPreviewView;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.k8;
import com.pinterest.api.model.uo;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.wy0;
import com.pinterest.design.brio.widget.voice.toast.PinterestToastContainer;
import com.pinterest.feature.board.collab.service.BoardActionService;
import com.pinterest.feature.comment.reactions.view.CommentReactionIndicator;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.gestalt.toast.GestaltToast;
import com.pinterest.navigation.Navigation;
import i2.v3;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import so.ba;
import so.oa;
import t3.x3;

/* loaded from: classes2.dex */
public final class q extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f77977i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f77978j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f77979k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f77980l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(cn0.i iVar, kotlin.jvm.internal.j0 j0Var, kotlin.jvm.internal.j0 j0Var2) {
        super(0);
        this.f77977i = 23;
        this.f77979k = iVar;
        this.f77978j = j0Var;
        this.f77980l = j0Var2;
    }

    public final uj2.l b() {
        int i13 = this.f77977i;
        Object obj = this.f77980l;
        Object obj2 = this.f77979k;
        Object obj3 = this.f77978j;
        switch (i13) {
            case 8:
                x92.b bVar = ((xo.i) obj3).f135517g;
                String uid = ((v7) obj2).getUid();
                Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                String uid2 = ((wy0) obj).getUid();
                Intrinsics.checkNotNullExpressionValue(uid2, "getUid(...)");
                uj2.l o13 = bVar.j(uid, uid2).o();
                Intrinsics.checkNotNullExpressionValue(o13, "toMaybe(...)");
                return o13;
            default:
                x92.b bVar2 = ((xo.i) obj3).f135517g;
                String uid3 = ((v7) obj2).getUid();
                Intrinsics.checkNotNullExpressionValue(uid3, "getUid(...)");
                String uid4 = ((wy0) obj).getUid();
                Intrinsics.checkNotNullExpressionValue(uid4, "getUid(...)");
                uj2.l o14 = bVar2.j(uid3, uid4).o();
                Intrinsics.checkNotNullExpressionValue(o14, "toMaybe(...)");
                return o14;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f77977i;
        int i14 = 1;
        Object obj = this.f77980l;
        Object obj2 = this.f77979k;
        Object obj3 = this.f77978j;
        switch (i13) {
            case 0:
                m166invoke();
                return Unit.f80348a;
            case 1:
                q1.i iVar = (q1.i) ((v3) obj3).getValue();
                q1.h0 h0Var = (q1.h0) obj2;
                return new q1.m(h0Var, iVar, (q1.d) obj, new androidx.compose.foundation.lazy.layout.x0((IntRange) h0Var.f101911d.f102039e.getValue(), iVar));
            case 2:
                return new s1.a0((kl2.m) ((v3) obj3).getValue(), (Function1) ((v3) obj2).getValue(), ((Number) ((Function0) obj).invoke()).intValue());
            case 3:
                t1.k kVar = (t1.k) obj3;
                a3.d M0 = t1.k.M0(kVar, (q3.x) obj2, (Function0) obj);
                if (M0 == null) {
                    return null;
                }
                m1.o oVar = (m1.o) kVar.f115761n;
                if (true ^ n4.j.a(oVar.f85486v, 0L)) {
                    return M0.h(oVar.Q0(oVar.f85486v, M0) ^ (-9223372034707292160L));
                }
                throw new IllegalStateException("Expected BringIntoViewRequester to not be used before parents are placed.".toString());
            case 4:
                m166invoke();
                return Unit.f80348a;
            case 5:
                m166invoke();
                return Unit.f80348a;
            case 6:
                m166invoke();
                return Unit.f80348a;
            case 7:
                m166invoke();
                return Unit.f80348a;
            case 8:
                return b();
            case 9:
                return b();
            case 10:
                return new bq0.d((String) obj3, (no1.e) obj2, (q12.b) obj);
            case 11:
                m166invoke();
                return Unit.f80348a;
            case 12:
                m166invoke();
                return Unit.f80348a;
            case 13:
                m166invoke();
                return Unit.f80348a;
            case 14:
                m166invoke();
                return Unit.f80348a;
            case 15:
                m166invoke();
                return Unit.f80348a;
            case 16:
                m166invoke();
                return Unit.f80348a;
            case 17:
                m166invoke();
                return Unit.f80348a;
            case 18:
                m166invoke();
                return Unit.f80348a;
            case 19:
                m166invoke();
                return Unit.f80348a;
            case 20:
                m166invoke();
                return Unit.f80348a;
            case 21:
                nx.d0 d0Var = (nx.d0) obj;
                return ((ba) ((ni1.d0) obj3)).a(((ol0.i) obj2).f96388p, new sp.e(d0Var, i14), new sp.f(d0Var, i14));
            case 22:
                m166invoke();
                return Unit.f80348a;
            case 23:
                m166invoke();
                return Unit.f80348a;
            case 24:
                wn0.j jVar = (wn0.j) obj3;
                nx.d0 s73 = jVar.s7();
                return new qa2.p0((Context) obj2, true, s73.getUniqueScreenKey(), ((yq0.z) obj).f139760f, s73, m60.f0.i0(jVar.W8().f103320a));
            case 25:
                zp0.f fVar = (zp0.f) obj2;
                uk1.d c13 = uk1.e.c((uk1.e) obj3, fVar);
                uj2.q qVar = fVar.f142616j;
                if (qVar != null) {
                    return new xp0.d(c13, qVar, fVar, fVar.f142620n, new vt1.a(), false, null, RecyclerViewTypes.VIEW_TYPE_LENS_DIRECTORY);
                }
                Intrinsics.r("networkStateStream");
                throw null;
            case 26:
                m166invoke();
                return Unit.f80348a;
            case 27:
                m166invoke();
                return Unit.f80348a;
            case 28:
                m166invoke();
                return Unit.f80348a;
            default:
                m166invoke();
                return Unit.f80348a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(Object obj, Object obj2, Object obj3, int i13) {
        super(0);
        this.f77977i = i13;
        this.f77978j = obj;
        this.f77979k = obj2;
        this.f77980l = obj3;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m166invoke() {
        int i13 = this.f77977i;
        int i14 = 2;
        int i15 = 0;
        Object obj = this.f77978j;
        Object obj2 = this.f77980l;
        Object obj3 = this.f77979k;
        switch (i13) {
            case 0:
                d3.e eVar = (d3.e) obj2;
                s3.m0 m0Var = (s3.m0) eVar;
                ((kotlin.jvm.internal.j0) obj).f80434a = ((r) obj3).f77985q.a(m0Var.f110840a.g(), m0Var.getLayoutDirection(), eVar);
                return;
            case 1:
            case 2:
            case 3:
            case 8:
            case 9:
            case 10:
            case 21:
            case 24:
            case 25:
            default:
                gd0.g gVar = (gd0.g) obj;
                ((nx.d0) gVar.f64818m).Z(h32.u0.STORY_PIN_MULTI_DRAFTS_EDIT_BUTTON, (HashMap) obj3);
                mu0.j jVar = (mu0.j) gVar.f64817l;
                String value = ((uo) obj2).f42598a;
                jVar.getClass();
                Intrinsics.checkNotNullParameter(value, "draftId");
                ag1.b bVar = jVar.f88311h;
                bVar.getClass();
                Intrinsics.checkNotNullParameter(value, "value");
                bVar.f15136i = value;
                jVar.addDisposable(jVar.f88310g.b(value).r(tk2.e.f118017c).l(wj2.c.a()).o(new au0.h(27, new mu0.d(jVar, i14)), new au0.h(28, mu0.e.f88292m)));
                return;
            case 4:
                b4.n nVar = (b4.n) ((b4.e) obj3).f21542a;
                x3 x3Var = (x3) obj2;
                ((w1.v2) obj).getClass();
                if (nVar instanceof b4.m) {
                    nVar.getClass();
                    try {
                        ((t3.t1) x3Var).a(((b4.m) nVar).f21613a);
                        return;
                    } catch (IllegalArgumentException unused) {
                        return;
                    }
                } else {
                    if (nVar instanceof b4.l) {
                        nVar.getClass();
                        return;
                    }
                    return;
                }
            case 5:
                s3.q0 q0Var = (s3.q0) obj;
                s3.v0 v0Var = q0Var.f110896y;
                v0Var.f110976j = 0;
                k2.e y13 = v0Var.f110967a.y();
                int i16 = y13.f78184c;
                if (i16 > 0) {
                    Object[] objArr = y13.f78182a;
                    int i17 = 0;
                    do {
                        s3.q0 q0Var2 = ((s3.k0) objArr[i17]).f110838z.f110985s;
                        Intrinsics.f(q0Var2);
                        q0Var2.f110878g = q0Var2.f110879h;
                        q0Var2.f110879h = Integer.MAX_VALUE;
                        if (q0Var2.f110880i == s3.i0.InLayoutBlock) {
                            q0Var2.f110880i = s3.i0.NotUsed;
                        }
                        i17++;
                    } while (i17 < i16);
                }
                q0Var.Z(s3.e.f110766k);
                s3.a1 a1Var = q0Var.F().M;
                if (a1Var != null) {
                    boolean z13 = a1Var.f111014h;
                    List o13 = ((s3.v0) obj2).f110967a.o();
                    int size = o13.size();
                    for (int i18 = 0; i18 < size; i18++) {
                        s3.a1 V0 = ((s3.k0) o13.get(i18)).f110837y.f110806c.V0();
                        if (V0 != null) {
                            V0.f111014h = z13;
                        }
                    }
                }
                ((s3.a1) obj3).E0().d();
                if (q0Var.F().M != null) {
                    List o14 = ((s3.v0) obj2).f110967a.o();
                    int size2 = o14.size();
                    for (int i19 = 0; i19 < size2; i19++) {
                        s3.a1 V02 = ((s3.k0) o14.get(i19)).f110837y.f110806c.V0();
                        if (V02 != null) {
                            V02.f111014h = false;
                        }
                    }
                }
                k2.e y14 = q0Var.f110896y.f110967a.y();
                int i23 = y14.f78184c;
                if (i23 > 0) {
                    Object[] objArr2 = y14.f78182a;
                    do {
                        s3.q0 q0Var3 = ((s3.k0) objArr2[i15]).f110838z.f110985s;
                        Intrinsics.f(q0Var3);
                        int i24 = q0Var3.f110878g;
                        int i25 = q0Var3.f110879h;
                        if (i24 != i25 && i25 == Integer.MAX_VALUE) {
                            q0Var3.F0();
                        }
                        i15++;
                    } while (i15 < i23);
                }
                q0Var.Z(s3.e.f110767l);
                return;
            case 6:
                z9.l lVar = (z9.l) obj3;
                Fragment fragment = (Fragment) obj2;
                for (z9.k kVar : (Iterable) lVar.f141228f.f55726a.getValue()) {
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentNavigator", "Marking transition complete for entry " + kVar + " due to fragment " + fragment + " viewmodel being cleared");
                    }
                    lVar.b(kVar);
                }
                return;
            case 7:
                WebViewYouTubePlayer webViewYouTubePlayer = ((LegacyYouTubePlayerView) obj).f34777a;
                z3.m initListener = new z3.m((mo.b) obj2, 8);
                no.b bVar2 = (no.b) obj3;
                webViewYouTubePlayer.getClass();
                Intrinsics.checkNotNullParameter(initListener, "initListener");
                webViewYouTubePlayer.f34785a = initListener;
                if (bVar2 == null) {
                    bVar2 = no.b.f91652b;
                }
                webViewYouTubePlayer.getSettings().setJavaScriptEnabled(true);
                webViewYouTubePlayer.getSettings().setMediaPlaybackRequiresUserGesture(false);
                webViewYouTubePlayer.getSettings().setCacheMode(-1);
                webViewYouTubePlayer.addJavascriptInterface(new lo.i(webViewYouTubePlayer), "YouTubePlayerBridge");
                InputStream inputStream = webViewYouTubePlayer.getResources().openRawResource(ko.c.ayp_youtube_player);
                Intrinsics.checkNotNullExpressionValue(inputStream, "resources.openRawResourc…R.raw.ayp_youtube_player)");
                Intrinsics.checkNotNullParameter(inputStream, "inputStream");
                try {
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "utf-8"));
                        StringBuilder sb3 = new StringBuilder();
                        for (String readLine = bufferedReader.readLine(); readLine != null; readLine = bufferedReader.readLine()) {
                            sb3.append(readLine);
                            sb3.append("\n");
                        }
                        String sb4 = sb3.toString();
                        Intrinsics.checkNotNullExpressionValue(sb4, "sb.toString()");
                        inputStream.close();
                        String n13 = kotlin.text.z.n(sb4, "<<injectedPlayerVars>>", bVar2.toString());
                        String string = bVar2.f91653a.getString("origin");
                        Intrinsics.checkNotNullExpressionValue(string, "playerOptions.getString(Builder.ORIGIN)");
                        webViewYouTubePlayer.loadDataWithBaseURL(string, n13, "text/html", "utf-8", null);
                        webViewYouTubePlayer.setWebChromeClient(new po.e());
                        return;
                    } catch (Exception unused2) {
                        throw new RuntimeException("Can't parse HTML file.");
                    }
                } catch (Throwable th3) {
                    inputStream.close();
                    throw th3;
                }
            case 11:
                CommentPreviewView commentPreviewView = (CommentPreviewView) obj;
                rp0.d dVar = (rp0.d) obj3;
                Rect L = ((CommentReactionIndicator) obj2).L();
                int i26 = CommentPreviewView.f35094u;
                commentPreviewView.getClass();
                if (dVar instanceof rp0.b) {
                    m60.w wVar = commentPreviewView.f35095d;
                    if (wVar != null) {
                        wVar.d(new pg0.k0(((rp0.b) dVar).f109053a, cb0.b.reaction_indicator_icons, L));
                        return;
                    } else {
                        Intrinsics.r("eventManager");
                        throw null;
                    }
                }
                if (dVar instanceof rp0.c) {
                    m60.w wVar2 = commentPreviewView.f35095d;
                    if (wVar2 != null) {
                        wVar2.d(new pg0.l0(((rp0.c) dVar).f109054a, cb0.b.reaction_indicator_icons, L));
                        return;
                    } else {
                        Intrinsics.r("eventManager");
                        throw null;
                    }
                }
                return;
            case 12:
                ((lr.r) obj).f84540e.invoke();
                ((PinterestToastContainer) obj3).f((GestaltToast) obj2);
                return;
            case 13:
                lr.g gVar2 = (lr.g) obj;
                ((androidx.appcompat.widget.c2) gVar2.f84515h).q(y32.f.SHARE_UPSELL.value(), (f30) gVar2.f84512e);
                ((PinterestToastContainer) obj3).f((GestaltToast) obj2);
                return;
            case 14:
                ((Function0) ((up.b) obj).f122935f).invoke();
                ((PinterestToastContainer) obj3).f((GestaltToast) obj2);
                return;
            case 15:
                String str = (String) obj;
                if (str == null || str.length() == 0) {
                    return;
                }
                Set set = dy.e.f56537b;
                String lowerCase = str.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                if (set.contains(lowerCase)) {
                    String value2 = (String) obj2;
                    Bundle bundle = new Bundle();
                    Intrinsics.checkNotNullParameter("event_type", "key");
                    Intrinsics.checkNotNullParameter("new", "value");
                    bundle.putString("event_type", "new");
                    Intrinsics.f(value2);
                    Intrinsics.checkNotNullParameter("app_version", "key");
                    Intrinsics.checkNotNullParameter(value2, "value");
                    bundle.putString("app_version", value2);
                    com.google.android.gms.internal.measurement.d1 d1Var = ((FirebaseAnalytics) obj3).f33719a;
                    d1Var.getClass();
                    d1Var.b(new com.google.android.gms.internal.measurement.n1(d1Var, null, "neworrez", bundle, false));
                    return;
                }
                return;
            case 16:
                kg.t.L0(new nx.a0(), ((ta0.h) obj).f116881e, null, null, null, 28);
                ((PinterestToastContainer) obj3).f((GestaltToast) obj2);
                return;
            case 17:
                kotlin.jvm.internal.j.z((ao2.j0) obj, null, null, new tc0.a((do2.j) obj3, (tc0.m0) obj2, null), 3);
                return;
            case 18:
                ((Function0) obj).invoke();
                ((i2.q1) obj3).setValue(Boolean.TRUE);
                ((i2.q1) obj2).setValue(Boolean.FALSE);
                return;
            case 19:
                xh0.d dVar2 = (xh0.d) obj;
                xh0.b bVar3 = (xh0.b) obj3;
                sh0.b bVar4 = (sh0.b) obj2;
                List list = dVar2.f134966e;
                ArrayList arrayList = new ArrayList();
                for (Object obj4 : list) {
                    if (((sh0.b) obj4).f112920c) {
                        arrayList.add(obj4);
                    }
                }
                bVar3.a();
                bVar4.f112921d = bVar3.f134961u;
                if (!dVar2.f134967f && !bVar4.f112920c) {
                    if (!arrayList.isEmpty()) {
                        List<sh0.b> list2 = dVar2.f134966e;
                        ArrayList arrayList2 = new ArrayList(kotlin.collections.g0.q(list2, 10));
                        for (sh0.b bVar5 : list2) {
                            if (bVar5.f112920c) {
                                bVar5.f112921d = false;
                            }
                            arrayList2.add(bVar5);
                        }
                        dVar2.f134966e = arrayList2;
                    }
                } else {
                    List<sh0.b> list3 = dVar2.f134966e;
                    ArrayList arrayList3 = new ArrayList(kotlin.collections.g0.q(list3, 10));
                    for (sh0.b bVar6 : list3) {
                        bVar6.f112921d = false;
                        if (Intrinsics.d(bVar6.f112918a, bVar4.f112918a)) {
                            bVar6.f112921d = bVar3.f134961u;
                        }
                        arrayList3.add(bVar6);
                    }
                    dVar2.f134966e = arrayList3;
                }
                dVar2.h();
                List list4 = dVar2.f134966e;
                ArrayList arrayList4 = new ArrayList();
                for (Object obj5 : list4) {
                    if (((sh0.b) obj5).f112921d) {
                        arrayList4.add(obj5);
                    }
                }
                dVar2.f134968g.invoke(Boolean.valueOf(!arrayList4.isEmpty()));
                return;
            case 20:
                String str2 = (String) obj3;
                ij0.a aVar = (ij0.a) obj2;
                BoardActionService.a aVar2 = ((BoardActionService) obj).f45115a;
                if (aVar2 != null) {
                    ((e12.d) ((oa) aVar2).V3.get()).h(str2, "board.name,board.image_thumbnail_url").r(tk2.e.f118017c).l(wj2.c.a()).p(aVar);
                    return;
                } else {
                    Intrinsics.r("dependencies");
                    throw null;
                }
            case 22:
                v7 mergedBoard = (v7) obj3;
                v7 destinationBoard = (v7) obj2;
                em0.d dVar3 = (em0.d) ((com.pinterest.feature.board.organize.c) ((dm0.d) obj).getView());
                dVar3.getClass();
                Intrinsics.checkNotNullParameter(mergedBoard, "mergedBoard");
                Intrinsics.checkNotNullParameter(destinationBoard, "destinationBoard");
                m60.w f73 = dVar3.f7();
                nx.d0 s73 = dVar3.s7();
                g70.h hVar = dVar3.D0;
                if (hVar != null) {
                    f73.d(new i92.i(new lr.g(s73, mergedBoard, destinationBoard, hVar)));
                    dVar3.Y6(em0.c.f59585j);
                    return;
                } else {
                    Intrinsics.r("boardNavigator");
                    throw null;
                }
            case 23:
                cn0.i iVar = (cn0.i) obj3;
                MediaCodec mediaCodec = iVar.f28076i;
                if (mediaCodec != null) {
                    mediaCodec.stop();
                    iVar.f28078k.f20164c.execute(new nt.c2((kotlin.jvm.internal.j0) obj2, 19));
                    ((Surface) ((kotlin.jvm.internal.j0) obj).f80434a).release();
                    return;
                }
                Intrinsics.r("encoder");
                throw null;
            case 26:
                ((PinterestToastContainer) obj).f((GestaltToast) obj3);
                ((jq0.a) obj2).f77458f.invoke();
                return;
            case 27:
                ((ls0.d) obj).f84623a.d(Navigation.z0((ScreenLocation) obj3, (String) obj2));
                return;
            case 28:
                kt0.e0 e0Var = (kt0.e0) obj;
                List boardInvites = (List) obj3;
                Intrinsics.checkNotNullExpressionValue(boardInvites, "$boardInvites");
                List conversations = (List) obj2;
                Intrinsics.checkNotNullExpressionValue(conversations, "$conversations");
                e0Var.getClass();
                wy0 f13 = ((b60.d) com.bumptech.glide.d.E()).f();
                if (f13 == null) {
                    return;
                }
                lr.d0.f84486g.getClass();
                z40.n d2 = com.google.android.gms.common.api.d.d(f13, conversations);
                z40.h d13 = d2 != null ? d2.d() : null;
                boolean z14 = lr.f.f84504g;
                k8 c13 = com.facebook.login.z.c(boardInvites);
                if ((d13 != null ? d13.d() : null) != null && c13 != null) {
                    Date d14 = d13.d();
                    Intrinsics.f(d14);
                    if (d14.compareTo(c13.createdAt) > 0) {
                        e0Var.B3(conversations);
                        return;
                    }
                }
                e0Var.z3(boardInvites);
                return;
        }
    }
}
