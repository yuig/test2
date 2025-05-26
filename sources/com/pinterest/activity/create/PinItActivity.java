package com.pinterest.activity.create;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.w0;
import ck2.i;
import com.pinterest.activity.create.PinItActivity;
import com.pinterest.api.model.PinnableImage;
import com.pinterest.component.modal.ModalContainer;
import com.pinterest.error.ServerError;
import com.pinterest.repository.pinnableimagefeed.PinnableImageFeed;
import com.pinterest.screens.b3;
import g92.g;
import h32.d4;
import h32.f1;
import i92.k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import jp.d;
import kh2.k3;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import lh0.g1;
import lu1.b;
import m60.x0;
import nf0.e;
import np.j;
import np.o;
import np.q;
import np.r;
import nx.j1;
import p1.d1;
import so1.a;
import tb0.h;
import v.u2;
import x02.i2;
import xj2.c;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/pinterest/activity/create/PinItActivity;", "Lnp/j;", "Lnx/j1;", "Lnp/r;", "Lnf0/e;", "<init>", "()V", "g4/u", "pinIt_release"}, k = 1, mv = {1, 9, 0})
@SuppressLint({"GoogleAppIndexingApiWarning"})
/* loaded from: classes.dex */
public final class PinItActivity extends j implements j1, r, e {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f34916p = 0;

    /* renamed from: b, reason: collision with root package name */
    public a f34917b;

    /* renamed from: c, reason: collision with root package name */
    public g1 f34918c;

    /* renamed from: d, reason: collision with root package name */
    public k f34919d;

    /* renamed from: e, reason: collision with root package name */
    public h f34920e;

    /* renamed from: f, reason: collision with root package name */
    public b f34921f;

    /* renamed from: g, reason: collision with root package name */
    public wk2.a f34922g;

    /* renamed from: h, reason: collision with root package name */
    public wk2.a f34923h;

    /* renamed from: i, reason: collision with root package name */
    public wk2.a f34924i;

    /* renamed from: j, reason: collision with root package name */
    public g f34925j;

    /* renamed from: k, reason: collision with root package name */
    public ModalContainer f34926k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f34927l;

    /* renamed from: m, reason: collision with root package name */
    public String f34928m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f34929n;

    /* renamed from: o, reason: collision with root package name */
    public final o f34930o = new o(this);

    public static final void x(PinItActivity pinItActivity, qp.k kVar, vd0.a aVar, ConcurrentHashMap concurrentHashMap, List list, int i13, int i14) {
        pinItActivity.getClass();
        kk2.b bVar = new kk2.b(new u2(list, aVar, concurrentHashMap, pinItActivity), 0);
        Intrinsics.checkNotNullExpressionValue(bVar, "create(...)");
        c o13 = bVar.r(tk2.e.f118017c).l(wj2.c.a()).o(new d(18, new d1(kVar, aVar, list, i13, i14)), new d(19, q.f91711j));
        Intrinsics.checkNotNullExpressionValue(o13, "subscribe(...)");
        pinItActivity.addDisposable(o13);
    }

    public final void A(vd0.a aVar, String str, String str2, qz.d dVar) {
        f1 f1Var;
        vd0.c cVar;
        vd0.c m13;
        HashMap hashMap = new HashMap();
        if (aVar == null || aVar.d() <= 0) {
            f1Var = f1.SAVE_BROWSER_PIN_IMAGES_NOT_FOUND;
        } else {
            hashMap.put("image_count", String.valueOf(aVar.d()));
            f1Var = f1.SAVE_BROWSER_PIN_IMAGES_FOUND;
        }
        f1 f1Var2 = f1Var;
        hashMap.put("total_request_time", str2);
        String z13 = z();
        if (z13 != null) {
            hashMap.put("method", z13);
        }
        if (str != null) {
            hashMap.put("url", str);
            String k03 = df.j1.k0(str);
            Intrinsics.checkNotNullExpressionValue(k03, "getDomainName(...)");
            hashMap.put("domain", k03);
        }
        String str3 = this.f34928m;
        if (str3 != null) {
            hashMap.put("save_session_id", str3);
        }
        if (dVar != null && (cVar = dVar.f105386f) != null && (m13 = cVar.m("objects")) != null && !m13.f()) {
            String dVar2 = dVar.toString();
            Intrinsics.checkNotNullExpressionValue(dVar2, "toString(...)");
            hashMap.put("pin_create_failure_data", dVar2);
        }
        getPinalytics().h0(f1Var2, null, null, null, hashMap, null, null, false);
    }

    public final void B(HashMap hashMap) {
        String uuid = UUID.randomUUID().toString();
        this.f34928m = uuid;
        Intrinsics.f(uuid);
        hashMap.put("save_session_id", uuid);
        getPinalytics().g(f1.OFFSITE_SAVE_ENTER, null, hashMap, false);
    }

    public final void C(PinnableImage pinnableImage, String str) {
        Object obj = (l11.r) getFragmentFactory().e(b3.a());
        l11.j jVar = (l11.j) obj;
        Intrinsics.checkNotNullParameter(pinnableImage, "pinnableImage");
        jVar.f81423b1 = e0.b(pinnableImage);
        jVar.f81429h1 = str;
        Bundle bundle = new Bundle();
        String str2 = this.f34928m;
        if (str2 != null) {
            bundle.putString("com.pinterest.EXTRA_SESSION_ID", str2);
        }
        jVar.Y8(bundle);
        w0 supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        mo1.c.b(supportFragmentManager, yy1.c.fragment_wrapper, (nl1.d) obj, false, mo1.a.MODAL, "");
    }

    @Override // cp1.p, uo1.a
    public final a getBaseActivityComponent() {
        a aVar = this.f34917b;
        Intrinsics.f(aVar);
        return aVar;
    }

    @Override // cp1.p
    public final Fragment getFragment() {
        return getSupportFragmentManager().E(yy1.c.fragment_wrapper);
    }

    @Override // uk1.c
    /* renamed from: getViewType */
    public final d4 getK0() {
        return Intrinsics.d("share_extension_android", z()) ? d4.SHARE_EXTENSION : d4.PIN_CREATE;
    }

    @Override // cp1.p, cp1.q, androidx.fragment.app.FragmentActivity, androidx.activity.o, c5.h, android.app.Activity
    public final void onCreate(Bundle bundle) {
        inject();
        g gVar = this.f34925j;
        if (gVar == null) {
            Intrinsics.r("themeProvider");
            throw null;
        }
        gVar.b(this);
        super.onCreate(bundle);
        ensureResources(1);
    }

    @Override // cp1.p, cp1.q, androidx.appcompat.app.n, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        getEventManager().j(this.f34930o);
        this.f34927l = true;
        super.onDestroy();
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0197  */
    @Override // cp1.p, at1.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onResourcesReady(int r19) {
        /*
            Method dump skipped, instructions count: 549
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.activity.create.PinItActivity.onResourcesReady(int):void");
    }

    @Override // cp1.p, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (this.f34929n) {
            k kVar = this.f34919d;
            if (kVar == null) {
                Intrinsics.r("toastUtils");
                throw null;
            }
            kVar.h(x0.offsite_saving_invalid_url);
            finish();
        }
    }

    @Override // cp1.p, androidx.appcompat.app.n, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStart() {
        super.onStart();
        getNavigationManager().i();
    }

    @Override // androidx.appcompat.app.n, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStop() {
        getNavigationManager().j();
        super.onStop();
    }

    @Override // cp1.p
    public final void setupActivityComponent() {
        if (this.f34917b == null) {
            this.f34917b = (a) me.o.a(this, a.class);
        }
    }

    public final void y(final String str, String str2, String str3) {
        Bundle a13 = n60.o.a("com.pinterest.EXTRA_URL", str);
        String str4 = this.f34928m;
        if (str4 != null) {
            a13.putString("com.pinterest.EXTRA_SESSION_ID", str4);
        }
        String z13 = z();
        if (z13 != null) {
            a13.putString("create_type", z13);
        }
        wk2.a aVar = this.f34922g;
        if (aVar == null) {
            Intrinsics.r("scrapedImagesFragmentProvider");
            throw null;
        }
        qp.k kVar = (qp.k) aVar.get();
        kVar.setArguments(a13);
        w0 supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        mo1.c.b(supportFragmentManager, yy1.c.fragment_wrapper, kVar, false, mo1.a.NONE, "");
        final ArrayList arrayList = new ArrayList();
        if (str2 != null) {
            wk2.a aVar2 = this.f34924i;
            if (aVar2 == null) {
                Intrinsics.r("pinRepositoryProvider");
                throw null;
            }
            jk2.e0 M = ((i2) aVar2.get()).M(str2);
            hk2.b bVar = new hk2.b(new d(16, new w1.g(arrayList, 7)), new d(17, q.f91712k), i.f27923c);
            M.f(bVar);
            Intrinsics.checkNotNullExpressionValue(bVar, "subscribe(...)");
            addDisposable(bVar);
        }
        HashMap hashMap = new HashMap();
        String z14 = z();
        if (z14 != null) {
            hashMap.put("method", z14);
        }
        hashMap.put("url", str);
        String k03 = df.j1.k0(str);
        Intrinsics.checkNotNullExpressionValue(k03, "getDomainName(...)");
        hashMap.put("domain", k03);
        String str5 = this.f34928m;
        if (str5 != null) {
            hashMap.put("save_session_id", str5);
        }
        getPinalytics().g(f1.SAVE_BROWSER_PIN_IMAGES_REQUESTED, null, hashMap, false);
        final long currentTimeMillis = System.currentTimeMillis();
        ak2.e eVar = new ak2.e() { // from class: np.m
            @Override // ak2.e
            public final void accept(Object obj) {
                vd0.a aVar3;
                PinItActivity pinItActivity;
                int i13;
                int i14;
                Integer num;
                vd0.c pinterestJsonObject = (vd0.c) obj;
                int i15 = PinItActivity.f34916p;
                PinItActivity this$0 = PinItActivity.this;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                String sourceUrl = str;
                Intrinsics.checkNotNullParameter(sourceUrl, "$sourceUrl");
                List pinnableImageList = arrayList;
                Intrinsics.checkNotNullParameter(pinnableImageList, "$pinnableImageList");
                Intrinsics.checkNotNullParameter(pinterestJsonObject, "pinterestJsonObject");
                nl1.d f34938d = this$0.getF34938d();
                Intrinsics.g(f34938d, "null cannot be cast to non-null type com.pinterest.activity.create.fragment.ScrapedImagesFragment");
                qp.k kVar2 = (qp.k) f34938d;
                Object obj2 = ((bf2.b) this$0.getImageCache()).get();
                Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
                hs1.q qVar = (hs1.q) obj2;
                String valueOf = String.valueOf(System.currentTimeMillis() - currentTimeMillis);
                vd0.c m13 = pinterestJsonObject.m("data");
                Intrinsics.f(m13);
                vd0.a k13 = m13.k("images");
                Intrinsics.checkNotNullExpressionValue(k13, "optJsonArray(...)");
                PinnableImageFeed pinnableImageFeed = new PinnableImageFeed();
                pinnableImageFeed.H(pinnableImageList);
                kVar2.f8(pinnableImageFeed, k13.d() + pinnableImageList.size());
                Integer num2 = null;
                this$0.A(k13, sourceUrl, valueOf, null);
                ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                h0 h0Var = new h0();
                h0 h0Var2 = new h0();
                int d2 = k13.d();
                int i16 = 0;
                while (i16 < d2) {
                    String l13 = k13.l(i16);
                    try {
                        Intrinsics.f(l13);
                        pinItActivity = this$0;
                        vd0.a aVar4 = k13;
                        i13 = i16;
                        i14 = d2;
                        aVar3 = k13;
                        num = num2;
                        try {
                            ((hs1.m) qVar).k(l13, new p(this$0, h0Var2, sourceUrl, l13, concurrentHashMap, aVar4, kVar2, pinnableImageList, h0Var), num, num);
                        } catch (Exception unused) {
                        }
                    } catch (Exception unused2) {
                        aVar3 = k13;
                        pinItActivity = this$0;
                        i13 = i16;
                        i14 = d2;
                        num = num2;
                    }
                    i16 = i13 + 1;
                    this$0 = pinItActivity;
                    num2 = num;
                    d2 = i14;
                    k13 = aVar3;
                }
            }
        };
        ak2.e eVar2 = new ak2.e() { // from class: np.n
            @Override // ak2.e
            public final void accept(Object obj) {
                v.f1 f1Var;
                Throwable throwable = (Throwable) obj;
                int i13 = PinItActivity.f34916p;
                PinItActivity this$0 = PinItActivity.this;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                String sourceUrl = str;
                Intrinsics.checkNotNullParameter(sourceUrl, "$sourceUrl");
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                qz.d M2 = (!(throwable instanceof ServerError) || (f1Var = ((ServerError) throwable).f45043a) == null) ? null : k3.M(f1Var);
                if (M2 != null) {
                    this$0.getClass();
                    if (f0.j(4907, 2427, 2426).contains(Integer.valueOf(M2.f105387g))) {
                        String b13 = ((ServerError) throwable).b();
                        i92.k kVar2 = this$0.f34919d;
                        if (kVar2 == null) {
                            Intrinsics.r("toastUtils");
                            throw null;
                        }
                        kVar2.i(b13);
                        this$0.getClass();
                        this$0.A(null, sourceUrl, String.valueOf(System.currentTimeMillis() - currentTimeMillis), M2);
                        throwable.getMessage();
                        this$0.finish();
                    }
                }
                i92.k kVar3 = this$0.f34919d;
                if (kVar3 == null) {
                    Intrinsics.r("toastUtils");
                    throw null;
                }
                kVar3.h(yy1.e.encountered_error);
                this$0.getClass();
                this$0.A(null, sourceUrl, String.valueOf(System.currentTimeMillis() - currentTimeMillis), M2);
                throwable.getMessage();
                this$0.finish();
            }
        };
        wk2.a aVar3 = this.f34923h;
        if (aVar3 != null) {
            addDisposable(((fw0.b) aVar3.get()).prepare(str, str3, z()).execute(eVar, eVar2));
        } else {
            Intrinsics.r("findImagesRetrofitRemoteRequestProvider");
            throw null;
        }
    }

    public final String z() {
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            return extras.getString("com.pinterest.EXTRA_PIN_CREATE_TYPE");
        }
        return null;
    }
}
