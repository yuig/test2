package com.pinterest.feature.mediagallery;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.Fragment;
import ck2.i;
import com.pinterest.component.alert.AlertContainer;
import com.pinterest.component.modal.ModalContainer;
import com.pinterest.design.brio.widget.progress.PinterestLoadingLayout;
import ct1.c;
import ct1.e;
import ek2.j;
import g92.g;
import h32.d4;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import lu1.d;
import m60.u;
import me.o;
import pk.a0;
import pw0.a;
import pw0.b;
import pw0.f;
import so.oa;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/pinterest/feature/mediagallery/MediaGalleryActivity;", "Lpw0/b;", "Lpw0/a;", "<init>", "()V", "vt1/a", "mediaGallery_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class MediaGalleryActivity extends b implements a {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f46708o = 0;

    /* renamed from: b, reason: collision with root package name */
    public ModalContainer f46709b;

    /* renamed from: c, reason: collision with root package name */
    public ModalContainer f46710c;

    /* renamed from: d, reason: collision with root package name */
    public AlertContainer f46711d;

    /* renamed from: e, reason: collision with root package name */
    public PinterestLoadingLayout f46712e;

    /* renamed from: f, reason: collision with root package name */
    public j f46713f;

    /* renamed from: g, reason: collision with root package name */
    public so1.a f46714g;

    /* renamed from: i, reason: collision with root package name */
    public Bundle f46716i;

    /* renamed from: j, reason: collision with root package name */
    public wk2.a f46717j;

    /* renamed from: k, reason: collision with root package name */
    public d f46718k;

    /* renamed from: l, reason: collision with root package name */
    public g f46719l;

    /* renamed from: h, reason: collision with root package name */
    public String f46715h = "";

    /* renamed from: m, reason: collision with root package name */
    public final d4 f46720m = d4.CAMERA;

    /* renamed from: n, reason: collision with root package name */
    public final f f46721n = new f(this);

    @Override // cp1.p, cp1.a
    /* renamed from: getActiveFragment */
    public final nl1.d getF34938d() {
        Fragment E = getSupportFragmentManager().E(ct1.b.fragment_wrapper);
        if (E instanceof nl1.d) {
            return (nl1.d) E;
        }
        return null;
    }

    @Override // cp1.p, uo1.a
    public final so1.a getBaseActivityComponent() {
        so1.a aVar = this.f46714g;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.r("activityComponent");
        throw null;
    }

    @Override // cp1.p
    public final Fragment getFragment() {
        return getSupportFragmentManager().E(ct1.b.fragment_wrapper);
    }

    @Override // uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF46720m() {
        return this.f46720m;
    }

    @Override // cp1.p, androidx.fragment.app.FragmentActivity, androidx.activity.o, android.app.Activity
    public final void onActivityResult(int i13, int i14, Intent intent) {
        super.onActivityResult(i13, i14, intent);
        if (i14 == 0) {
            return;
        }
        Bundle bundle = this.f46716i;
        if (bundle != null && intent != null) {
            intent.putExtra("com.pinterest.EXTRA_MEDIA_GALLERY_EXTRA_BUNDLE", bundle);
        }
        if (i13 == 201) {
            setResult(i14, intent);
            finish();
            return;
        }
        if (i13 != 268 || intent == null) {
            return;
        }
        try {
            Uri parse = Uri.parse(intent.getStringExtra("com.pinterest.EXTRA_CREATE_MEDIA_URI"));
            if (!(Intrinsics.d(this.f46715h, "CommentAddPhoto") ? true : Intrinsics.d(r4, "ProfilePhoto"))) {
                String uri = parse.toString();
                Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
                y(uri);
            } else {
                String path = parse.getPath();
                if (path == null) {
                    path = "";
                }
                x(path);
            }
        } catch (NullPointerException e13) {
            e13.printStackTrace();
            Context context = kb0.a.f79058b;
            ((oa) ((j92.a) ep.b.g(j92.a.class))).E2().b(getResources().getString(e.camera_open_fail));
        }
    }

    @Override // cp1.p, androidx.activity.o, android.app.Activity
    public final void onBackPressed() {
        nl1.d f34938d = getF34938d();
        if (f34938d == null || !f34938d.getF103154e0()) {
            super.onBackPressed();
        }
    }

    @Override // androidx.appcompat.app.n, androidx.activity.o, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        Window window = getWindow();
        if (window != null) {
            a0.j1(window, newConfig);
        }
    }

    @Override // cp1.p, cp1.q, androidx.fragment.app.FragmentActivity, androidx.activity.o, c5.h, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Bundle bundle2;
        inject();
        g gVar = this.f46719l;
        if (gVar == null) {
            Intrinsics.r("themeProvider");
            throw null;
        }
        gVar.b(this);
        getWindow().requestFeature(13);
        Serializable serializableExtra = getIntent().getSerializableExtra("com.pinterest.EXTRA_MEDIA_GALLERY_TRANSITION_TYPE");
        rw0.a aVar = serializableExtra instanceof rw0.a ? (rw0.a) serializableExtra : null;
        if (aVar != null) {
            gh0.b.G(this, aVar);
        }
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            Configuration configuration = getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration, "getConfiguration(...)");
            a0.j1(window, configuration);
        }
        setContentView(c.activity_media_gallery);
        View findViewById = findViewById(ct1.b.activity_wrapper);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        PinterestLoadingLayout pinterestLoadingLayout = (PinterestLoadingLayout) findViewById;
        this.f46712e = pinterestLoadingLayout;
        if (pinterestLoadingLayout == null) {
            Intrinsics.r("loadingView");
            throw null;
        }
        int i13 = 1;
        pinterestLoadingLayout.showLoadingSpinner(true);
        this.f46709b = (ModalContainer) findViewById(ct1.b.brio_modal_container);
        this.f46710c = (ModalContainer) findViewById(ct1.b.brio_admin_modal_container);
        View findViewById2 = findViewById(dq1.c.alert_container);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f46711d = (AlertContainer) findViewById2;
        String stringExtra = getIntent().getStringExtra("com.pinterest.EXTRA_MEDIA_GALLERY_TYPE");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f46715h = stringExtra;
        this.f46716i = getIntent().getBundleExtra("com.pinterest.EXTRA_MEDIA_GALLERY_EXTRA_BUNDLE");
        Intent intent = getIntent();
        if (intent == null || (bundle2 = intent.getExtras()) == null) {
            bundle2 = new Bundle();
        }
        ol1.d dVar = new ol1.d(new uv0.a(5, this, bundle2), 2);
        Intrinsics.checkNotNullExpressionValue(dVar, "create(...)");
        xj2.c F = dVar.H(tk2.e.f118016b).A(wj2.c.a()).F(new gw0.a(8, new pw0.g(this, 0)), new gw0.a(9, new pw0.g(this, i13)), i.f27923c, i.f27924d);
        Intrinsics.checkNotNullExpressionValue(F, "subscribe(...)");
        this.f46713f = (j) F;
    }

    @Override // cp1.p, cp1.q, androidx.appcompat.app.n, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        j jVar = this.f46713f;
        if (jVar == null) {
            Intrinsics.r("disposable");
            throw null;
        }
        bk2.c.dispose(jVar);
        super.onDestroy();
    }

    @Override // cp1.p, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        u.f85943a.j(this.f46721n);
        super.onPause();
    }

    @Override // cp1.p, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        u.f85943a.h(this.f46721n);
    }

    @Override // cp1.p
    public final boolean preActivityBackPress() {
        ModalContainer modalContainer = this.f46709b;
        if (modalContainer == null || !modalContainer.h()) {
            getF34938d();
            return super.preActivityBackPress();
        }
        ModalContainer modalContainer2 = this.f46709b;
        if (modalContainer2 != null) {
            modalContainer2.f(jc0.a.Bottom, true);
        }
        return true;
    }

    @Override // cp1.p
    public final void setupActivityComponent() {
        if (this.f46714g == null) {
            this.f46714g = (so1.a) o.a(this, so1.a.class);
        }
    }

    public final void x(String str) {
        String str2 = this.f46715h;
        if (Intrinsics.d(str2, "CommentAddPhoto")) {
            Intent intent = new Intent();
            intent.putExtra("com.pinterest.EXTRA_PHOTO_PATH", str);
            intent.putExtra("com.pinterest.EXTRA_AGGREGATED_UID", getIntent().getStringExtra("com.pinterest.EXTRA_AGGREGATED_UID"));
            Unit unit = Unit.f80348a;
            setResult(971, intent);
        } else if (Intrinsics.d(str2, "ProfilePhoto")) {
            Intent intent2 = new Intent();
            intent2.putExtra("com.pinterest.EXTRA_PHOTO_PATH", str);
            Unit unit2 = Unit.f80348a;
            setResult(975, intent2);
        }
        finish();
    }

    public final void y(String str) {
        d dVar = this.f46718k;
        if (dVar == null) {
            Intrinsics.r("activityIntentFactory");
            throw null;
        }
        Context applicationContext = getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        Intent b13 = dVar.b(applicationContext, lu1.a.CREATION_ACTIVITY);
        b13.putExtra("com.pinterest.EXTRA_CREATE_MEDIA_URI", str);
        b13.putExtra("com.pinterest.EXTRA_PIN_CREATE_TYPE", "photos");
        startActivityForResult(b13, 201);
    }
}
