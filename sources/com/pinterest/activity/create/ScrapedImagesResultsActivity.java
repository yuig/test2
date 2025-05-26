package com.pinterest.activity.create;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.u0;
import androidx.fragment.app.w0;
import com.pinterest.component.modal.ModalContainer;
import com.pinterest.repository.pinnableimagefeed.PinnableImageFeed;
import g4.u;
import g92.g;
import h32.d4;
import java.util.ArrayList;
import kh2.c3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import me.o;
import nl1.d;
import np.a;
import np.l;
import np.w;
import nx.j1;
import qp.k;
import yy1.c;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/pinterest/activity/create/ScrapedImagesResultsActivity;", "Lnp/l;", "Lnx/j1;", "Lnp/a;", "<init>", "()V", "pinIt_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class ScrapedImagesResultsActivity extends l implements j1, a {

    /* renamed from: b, reason: collision with root package name */
    public PinnableImageFeed f34936b;

    /* renamed from: c, reason: collision with root package name */
    public String f34937c;

    /* renamed from: d, reason: collision with root package name */
    public d f34938d;

    /* renamed from: e, reason: collision with root package name */
    public String f34939e;

    /* renamed from: f, reason: collision with root package name */
    public String f34940f;

    /* renamed from: g, reason: collision with root package name */
    public ModalContainer f34941g;

    /* renamed from: h, reason: collision with root package name */
    public ModalContainer f34942h;

    /* renamed from: i, reason: collision with root package name */
    public so1.a f34943i;

    /* renamed from: j, reason: collision with root package name */
    public wk2.a f34944j;

    /* renamed from: k, reason: collision with root package name */
    public g f34945k;

    /* renamed from: l, reason: collision with root package name */
    public final w f34946l = new w(this);

    @Override // cp1.p, nx.j1
    public final d4 d() {
        d dVar = this.f34938d;
        if (dVar != null) {
            return dVar.E7();
        }
        return null;
    }

    @Override // cp1.p, cp1.a
    /* renamed from: getActiveFragment, reason: from getter */
    public final d getF34938d() {
        return this.f34938d;
    }

    @Override // cp1.p, uo1.a
    public final so1.a getBaseActivityComponent() {
        so1.a aVar = this.f34943i;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.r("activityComponent");
        throw null;
    }

    @Override // cp1.p
    public final Fragment getFragment() {
        return getSupportFragmentManager().E(c.fragment_wrapper);
    }

    @Override // uk1.c
    /* renamed from: getViewType */
    public final d4 getF72615s0() {
        Bundle extras = getIntent().getExtras();
        return Intrinsics.d(extras != null ? extras.getString("com.pinterest.EXTRA_PIN_CREATE_TYPE") : null, "share_extension_android") ? d4.SHARE_EXTENSION_IMAGE_PICKER : d4.PIN_CREATE_PINMARKLET;
    }

    @Override // androidx.fragment.app.FragmentActivity
    public final void onAttachFragment(Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        super.onAttachFragment(fragment);
        if (this.f34938d == fragment || !(fragment instanceof k)) {
            return;
        }
        this.f34938d = (d) fragment;
    }

    @Override // cp1.p, androidx.activity.o, android.app.Activity
    public final void onBackPressed() {
        w0 fragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(fragmentManager, "getSupportFragmentManager(...)");
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        ArrayList arrayList = fragmentManager.f18452d;
        if (arrayList != null && arrayList.size() > 0) {
            fragmentManager.y(new u0(fragmentManager, null, -1, 0), false);
        } else {
            getEventManager().d(new u());
            finish();
        }
    }

    @Override // cp1.p, cp1.q, androidx.fragment.app.FragmentActivity, androidx.activity.o, c5.h, android.app.Activity
    public final void onCreate(Bundle bundle) {
        inject();
        g gVar = this.f34945k;
        if (gVar == null) {
            Intrinsics.r("themeProvider");
            throw null;
        }
        gVar.b(this);
        super.onCreate(bundle);
        getEventManager().h(this.f34946l);
        setContentView(yy1.d.activity_create_pin_marklet);
        this.f34941g = (ModalContainer) findViewById(c.brio_modal_container);
        this.f34942h = (ModalContainer) findViewById(c.brio_admin_modal_container);
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            finish();
            return;
        }
        this.f34936b = (PinnableImageFeed) extras.getParcelable("com.pinterest.EXTRA_FEED");
        this.f34937c = extras.getString("com.pinterest.EXTRA_URL");
        this.f34939e = extras.getString("com.pinterest.EXTRA_META");
        this.f34940f = extras.getString("com.pinterest.CLOSEUP_PIN_ID");
        this.f34936b = this.f34936b;
        if (bundle == null) {
            String string = extras.getString("com.pinterest.EXTRA_BOARD_ID");
            String string2 = extras.getString("com.pinterest.EXTRA_BOARD_NAME");
            PinnableImageFeed pinnableImageFeed = this.f34936b;
            if (this.f34938d == null) {
                wk2.a aVar = this.f34944j;
                if (aVar == null) {
                    Intrinsics.r("scrapedImagesFragmentProvider");
                    throw null;
                }
                k i03 = c3.i0(aVar, pinnableImageFeed, this.f34937c, this.f34939e, this.f34940f);
                this.f34938d = i03;
                Bundle arguments = i03.getArguments();
                if (arguments != null) {
                    arguments.putString("com.pinterest.EXTRA_BOARD_ID", string);
                }
                if (arguments != null) {
                    arguments.putString("com.pinterest.EXTRA_BOARD_NAME", string2);
                }
                w0 supportFragmentManager = getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                mo1.c.c(supportFragmentManager, c.fragment_wrapper, i03, false, null, 48);
            }
        }
    }

    @Override // cp1.p, cp1.q, androidx.appcompat.app.n, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        getEventManager().j(this.f34946l);
        super.onDestroy();
    }

    @Override // cp1.p
    public final void setupActivityComponent() {
        if (this.f34943i == null) {
            this.f34943i = (so1.a) o.a(this, so1.a.class);
        }
    }
}
