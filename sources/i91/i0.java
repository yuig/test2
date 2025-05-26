package i91;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import androidx.appcompat.widget.c2;
import com.pinterest.activity.sendapin.model.SendableObject;
import com.pinterest.api.model.f30;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import fd1.o0;
import fd1.z0;
import h32.d4;
import h32.f1;
import h32.u0;
import h32.v0;
import java.io.File;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import lh0.v3;
import m60.x0;
import net.quikkly.android.utils.BitmapUtils;
import nx.d1;
import so.e4;
import so.oa;
import so.r8;
import so.s8;
import x02.a2;
import x02.i2;

/* loaded from: classes5.dex */
public final class i0 implements g91.d {

    /* renamed from: a, reason: collision with root package name */
    public final Context f71840a;

    /* renamed from: b, reason: collision with root package name */
    public final SendableObject f71841b;

    /* renamed from: c, reason: collision with root package name */
    public final b f71842c;

    /* renamed from: d, reason: collision with root package name */
    public c0 f71843d;

    /* renamed from: e, reason: collision with root package name */
    public final nx.d0 f71844e;

    /* renamed from: f, reason: collision with root package name */
    public final p32.c f71845f;

    /* renamed from: g, reason: collision with root package name */
    public final so.v f71846g;

    /* renamed from: h, reason: collision with root package name */
    public final n f71847h;

    /* renamed from: i, reason: collision with root package name */
    public final h32.g0 f71848i;

    /* renamed from: j, reason: collision with root package name */
    public final a0 f71849j;

    /* renamed from: k, reason: collision with root package name */
    public final int f71850k;

    /* renamed from: l, reason: collision with root package name */
    public final i2 f71851l;

    /* renamed from: m, reason: collision with root package name */
    public final d1 f71852m;

    /* renamed from: n, reason: collision with root package name */
    public final ll.j f71853n;

    /* renamed from: o, reason: collision with root package name */
    public final x52.n f71854o;

    /* renamed from: p, reason: collision with root package name */
    public final i92.k f71855p;

    /* renamed from: q, reason: collision with root package name */
    public final m60.e f71856q;

    /* renamed from: r, reason: collision with root package name */
    public final z f71857r;

    /* renamed from: s, reason: collision with root package name */
    public final c2 f71858s;

    /* renamed from: t, reason: collision with root package name */
    public final e82.h0 f71859t;

    /* renamed from: u, reason: collision with root package name */
    public final e4 f71860u;

    public i0(Context context, SendableObject sendableObject, nx.d0 d0Var, p32.c cVar, h32.g0 g0Var, a0 a0Var, b bVar, c0 c0Var, int i13, so.v vVar, n nVar, i2 i2Var, d1 d1Var, ll.j jVar, x52.n nVar2, i92.k kVar, z zVar, c2 c2Var, e82.h0 h0Var, m60.e eVar, e4 e4Var) {
        this.f71840a = context;
        this.f71841b = sendableObject;
        this.f71844e = d0Var;
        this.f71845f = cVar;
        this.f71846g = vVar;
        this.f71847h = nVar;
        this.f71848i = g0Var;
        this.f71849j = a0Var;
        this.f71842c = bVar;
        this.f71843d = c0Var;
        this.f71850k = i13;
        this.f71851l = i2Var;
        this.f71852m = d1Var;
        this.f71853n = jVar;
        this.f71854o = nVar2;
        this.f71855p = kVar;
        this.f71856q = eVar;
        this.f71857r = zVar;
        this.f71858s = c2Var;
        this.f71859t = h0Var;
        this.f71860u = e4Var;
    }

    @Override // g91.d
    public final void a(final View view, final String str) {
        ig1.b.N0(view);
        final int i13 = 1;
        if (!pk.a0.N(str, "pin_msging") && !pk.a0.N(str, "internal_send") && !pk.a0.N(str, "save_link") && !pk.a0.N(str, "image_search")) {
            e0.t.f56752j = true;
        }
        SendableObject sendableObject = this.f71841b;
        final int i14 = 0;
        if (sendableObject.g()) {
            this.f71851l.P(sendableObject.d()).H(tk2.e.f118017c).A(wj2.c.a()).F(new ak2.e(this) { // from class: i91.d0

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ i0 f71815b;

                {
                    this.f71815b = this;
                }

                @Override // ak2.e
                public final void accept(Object obj) {
                    int i15 = i14;
                    String str2 = str;
                    View view2 = view;
                    i0 i0Var = this.f71815b;
                    switch (i15) {
                        case 0:
                            i0Var.f71841b.f35137k = i0Var.f71852m.b((f30) obj);
                            i0Var.c(view2, str2);
                            break;
                        default:
                            i0Var.c(view2, str2);
                            break;
                    }
                }
            }, new ak2.e(this) { // from class: i91.d0

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ i0 f71815b;

                {
                    this.f71815b = this;
                }

                @Override // ak2.e
                public final void accept(Object obj) {
                    int i15 = i13;
                    String str2 = str;
                    View view2 = view;
                    i0 i0Var = this.f71815b;
                    switch (i15) {
                        case 0:
                            i0Var.f71841b.f35137k = i0Var.f71852m.b((f30) obj);
                            i0Var.c(view2, str2);
                            break;
                        default:
                            i0Var.c(view2, str2);
                            break;
                    }
                }
            }, ck2.i.f27923c, ck2.i.f27924d);
            return;
        }
        if (sendableObject.e()) {
            String d2 = sendableObject.d();
            b bVar = this.f71842c;
            HashMap u03 = kh2.b0.u0(d2, bVar.f71799b, kh2.b0.q0(str));
            c0 c0Var = this.f71843d;
            if (c0Var != null) {
                kh2.j.n(u03, c0Var);
            }
            this.f71844e.t(kh2.b0.l0(d2, u0.EXTERNAL_SHARE_OPTION), null, null, f1.TAP, null, u03, false);
            if (!bVar.f71798a || (!pk.a0.N(str, "instagram_stories") && !pk.a0.N(str, "facebook_stories") && !pk.a0.N(str, "download_idea_pin"))) {
                c(view, str);
                return;
            }
            b(sendableObject, str);
            e0 onPrepared = new e0(str, 0, this);
            x52.n nVar = this.f71854o;
            nVar.getClass();
            Intrinsics.checkNotNullParameter(onPrepared, "onPrepared");
            nVar.f133901k = onPrepared;
            m60.w wVar = nVar.f133893c;
            wVar.h(nVar.f133902l);
            wVar.d(x52.o.f133903a);
            return;
        }
        if (sendableObject.f35129c != 14) {
            c(view, str);
            return;
        }
        if (this.f71843d instanceof x) {
            if (!pk.a0.N("instagram_stories", str)) {
                if (pk.a0.N("download_idea_pin", str)) {
                    kg.t.X0();
                    this.f71844e.H(f1.PIN_OR_SPIN_DOWNLOAD, null, null, null, null, false);
                    return;
                }
                return;
            }
            Uri uri = ((x) this.f71843d).f71910a;
            if (uri != null) {
                Intrinsics.checkNotNullParameter(uri, "uri");
                Context context = this.f71840a;
                Intrinsics.checkNotNullParameter(context, "context");
                i92.k toastUtils = this.f71855p;
                Intrinsics.checkNotNullParameter(toastUtils, "toastUtils");
                m60.e applicationInfoProvider = this.f71856q;
                Intrinsics.checkNotNullParameter(applicationInfoProvider, "applicationInfoProvider");
                String path = uri.getPath();
                if (path != null) {
                    String uri2 = uri.toString();
                    Intrinsics.checkNotNullExpressionValue(uri2, "toString(...)");
                    if (kotlin.text.z.p(uri2, "file:///", false)) {
                        uri = kg.p.B(context, new File(path), applicationInfoProvider);
                    }
                    context.grantUriPermission("com.instagram.android", uri, 1);
                    Intrinsics.f(uri);
                    String string = context.getString(x0.facebook_app_id);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    Intent intent = new Intent("com.instagram.share.ADD_TO_STORY");
                    intent.setFlags(276824065);
                    intent.putExtra("source_application", string);
                    intent.putExtra("android.intent.extra.STREAM", uri);
                    String type = context.getContentResolver().getType(uri);
                    if (type == null) {
                        type = "image/jpeg";
                    }
                    intent.setDataAndType(uri, type);
                    intent.setPackage("com.instagram.android");
                    if (intent.resolveActivity(context.getPackageManager()) != null) {
                        context.startActivity(intent);
                    } else {
                        toastUtils.i(context.getString(x0.generic_error));
                    }
                }
            }
            this.f71844e.H(f1.PIN_OR_SPIN_INSTAGRAM_SHARE, null, null, null, null, false);
        }
    }

    public final void b(SendableObject sendableObject, final String str) {
        final h32.h0 h0Var = new h32.h0();
        if (sendableObject.g()) {
            final HashMap hashMap = new HashMap();
            hashMap.put("invite_object", String.valueOf(sendableObject.b().value()));
            c0 c0Var = this.f71843d;
            if (c0Var != null) {
                kh2.j.n(hashMap, c0Var);
            }
            this.f71851l.M(sendableObject.d()).h(tk2.e.f118017c).e(wj2.c.a()).f(new hk2.b(new ak2.e() { // from class: i91.g0
                @Override // ak2.e
                public final void accept(Object obj) {
                    i0 i0Var = i0.this;
                    String b13 = i0Var.f71852m.b((f30) obj);
                    v0 v0Var = new v0();
                    v0Var.G = b13;
                    h32.h0 h0Var2 = h0Var;
                    h0Var2.f67045d = i0Var.f71848i;
                    h0Var2.f67047f = (u0) e82.c0.f57822a.get(str);
                    i0Var.f71844e.t(h0Var2.a(), v0Var, null, f1.TAP, i0Var.f71841b.d(), hashMap, false);
                }
            }, new xo.l(28), ck2.i.f27923c));
            return;
        }
        h0Var.f67042a = d4.SEND_SHARE;
        h0Var.f67045d = h32.g0.SEND_SHARE;
        this.f71859t.getClass();
        SendableObject sendableObject2 = this.f71841b;
        h0Var.f67047f = e82.h0.c(sendableObject2, str);
        HashMap hashMap2 = new HashMap();
        c0 c0Var2 = this.f71843d;
        if (c0Var2 != null) {
            kh2.j.n(hashMap2, c0Var2);
        }
        this.f71844e.t(h0Var.a(), null, null, f1.TAP, sendableObject2.d(), hashMap2, false);
    }

    public final void c(View view, String str) {
        j0 j0Var = (j0) me.o.a(bs1.c.m0(view), j0.class);
        boolean N = pk.a0.N(str, "pincode");
        SendableObject sendableObject = this.f71841b;
        if (N) {
            this.f71853n.z(sendableObject);
            return;
        }
        boolean N2 = pk.a0.N(str, "copy_link");
        p32.c cVar = this.f71845f;
        Context context = this.f71840a;
        if (N2) {
            m60.u.f85943a.d(new e82.r());
            ig1.b.w(context, sendableObject, cVar, this.f71846g);
            if (sendableObject.g()) {
                b(sendableObject, str);
                return;
            }
            return;
        }
        boolean N3 = pk.a0.N(str, "internal_send");
        a2 a2Var = ck2.i.f27924d;
        ck2.c cVar2 = ck2.i.f27923c;
        if (N3) {
            i2 i2Var = (i2) ((s8) j0Var).f114255d.F3.get();
            xo.a aVar = new xo.a(this, 16);
            m60.u.f85943a.d(new jc0.s());
            i2Var.P(sendableObject.d()).F(aVar, new h0(0), cVar2, a2Var);
            return;
        }
        if (pk.a0.N(str, "save_link")) {
            e0.t.f56754l = true;
            s8 s8Var = (s8) j0Var;
            i2 i2Var2 = (i2) s8Var.f114255d.F3.get();
            xo.a aVar2 = new xo.a(s8Var, 17);
            m60.u.f85943a.d(new jc0.s());
            i2Var2.P(sendableObject.d()).F(aVar2, new h0(0), cVar2, a2Var);
            return;
        }
        boolean h10 = sendableObject.h();
        n nVar = this.f71847h;
        if (h10 && pk.a0.N(str, "download_idea_pin")) {
            String pinId = sendableObject.d();
            nVar.getClass();
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(pinId, "pinId");
            nVar.c(context, new j(nVar, context, pinId, 0));
            return;
        }
        if (sendableObject.h() && pk.a0.N(str, "instagram_stories")) {
            String pinId2 = sendableObject.d();
            nVar.getClass();
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(pinId2, "pinId");
            nVar.c(context, new j(nVar, context, pinId2, 2));
            return;
        }
        if (sendableObject.h() && pk.a0.N(str, "facebook_stories")) {
            String pinId3 = sendableObject.d();
            nVar.getClass();
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(pinId3, "pinId");
            nVar.c(context, new j(nVar, context, pinId3, 1));
            return;
        }
        int i13 = 29;
        if (!(sendableObject.f35129c == 0 && sendableObject.f35136j) || !pk.a0.N(str, "instagram_stories")) {
            if (!pk.a0.N(str, "pin_msging")) {
                if (!pk.a0.N(str, "image_search")) {
                    this.f71859t.m(context, sendableObject, str, cVar);
                    b(sendableObject, str);
                    this.f71857r.a(str);
                    return;
                } else {
                    i2 i2Var3 = (i2) ((s8) j0Var).f114255d.F3.get();
                    xo.l lVar = new xo.l(27);
                    m60.u.f85943a.d(new jc0.s());
                    i2Var3.P(sendableObject.d()).F(new xo.a(lVar, 18), new xo.l(i13), cVar2, a2Var);
                    return;
                }
            }
            a0 sendShareState = this.f71849j;
            if (sendShareState == null) {
                return;
            }
            sendShareState.f71796b = true;
            m60.w wVar = m60.u.f85943a;
            p32.c inviteCategory = p32.c.MESSAGE;
            z0 viewOptions = z0.CONTACT_LIST_ONLY;
            fd1.f1 upsellTypes = fd1.f1.NONE;
            SendableObject sendableObject2 = this.f71841b;
            Intrinsics.checkNotNullParameter(sendableObject2, "sendableObject");
            Intrinsics.checkNotNullParameter(inviteCategory, "inviteCategory");
            Intrinsics.checkNotNullParameter(viewOptions, "viewOptions");
            Intrinsics.checkNotNullParameter(upsellTypes, "upsellTypes");
            Intrinsics.checkNotNullParameter(sendShareState, "sendShareState");
            e82.h0 socialUtils = this.f71859t;
            Intrinsics.checkNotNullParameter(socialUtils, "socialUtils");
            wVar.d(new jc0.v(new o0(sendableObject2, this.f71850k, inviteCategory, false, false, viewOptions, true, upsellTypes, false, sendShareState, false, null, socialUtils, 7168)));
            return;
        }
        String pinUid = sendableObject.d();
        f0 saveSuccessListener = new f0(this, 0);
        r8 r8Var = this.f71860u.f113399a;
        i2 pinRepository = (i2) r8Var.f114090a.F3.get();
        oa oaVar = r8Var.f114090a;
        l20.b imageDownloadService = a02.e.C2(oaVar.f3(), (rz.c) oaVar.f114011y1.get());
        ny1.w permissionsManager = r8Var.f114091b.A5();
        i92.k toastUtils = (i92.k) oaVar.f113921t1.get();
        m60.e applicationInfoProvider = (m60.e) oaVar.f113920t0.get();
        v3 experiments = new v3((lh0.z0) oaVar.D0.get());
        Intrinsics.checkNotNullParameter(pinUid, "pinUid");
        Intrinsics.checkNotNullParameter(saveSuccessListener, "saveSuccessListener");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(imageDownloadService, "imageDownloadService");
        Intrinsics.checkNotNullParameter(permissionsManager, "permissionsManager");
        Intrinsics.checkNotNullParameter(toastUtils, "toastUtils");
        Intrinsics.checkNotNullParameter(applicationInfoProvider, "applicationInfoProvider");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        android.support.v4.media.a aVar3 = new android.support.v4.media.a();
        aVar3.f15837a = pinUid;
        aVar3.f15838b = saveSuccessListener;
        aVar3.f15839c = pinRepository;
        aVar3.f15840d = imageDownloadService;
        aVar3.f15841e = permissionsManager;
        aVar3.f15842f = toastUtils;
        aVar3.f15843g = applicationInfoProvider;
        aVar3.f15844h = experiments;
        Intrinsics.checkNotNullParameter(context, "context");
        if (Build.VERSION.SDK_INT >= 34) {
            aVar3.f(context);
        } else {
            ((ny1.w) aVar3.f15841e).c(bs1.c.k0(context), ny1.e.f92665f, (r23 & 4) != 0 ? "" : null, null, (r23 & 16) != 0 ? ny1.o.f92679j : null, ny1.q.f92690k, ny1.t.f92699j, (r23 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? ny1.t.f92700k : new h81.b(aVar3, 3), (r23 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? ny1.t.f92701l : null, (r23 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? ny1.t.f92702m : null, (r23 & 1024) != 0 ? ny1.t.f92703n : new b01.c(i13, aVar3, context));
        }
    }
}
