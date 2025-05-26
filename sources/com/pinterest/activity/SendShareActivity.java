package com.pinterest.activity;

import android.os.Bundle;
import androidx.appcompat.widget.c2;
import androidx.fragment.app.Fragment;
import com.pinterest.component.modal.ModalContainer;
import g92.g;
import h32.d4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import me.o;
import n52.b;
import so1.a;
import vo.h;
import vo.t;
import y32.f;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/pinterest/activity/SendShareActivity;", "Lvo/h;", "<init>", "()V", "share_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class SendShareActivity extends h {

    /* renamed from: b, reason: collision with root package name */
    public a f34834b;

    /* renamed from: c, reason: collision with root package name */
    public g f34835c;

    /* renamed from: d, reason: collision with root package name */
    public c2 f34836d;

    /* renamed from: e, reason: collision with root package name */
    public ModalContainer f34837e;

    /* renamed from: f, reason: collision with root package name */
    public ModalContainer f34838f;

    /* renamed from: g, reason: collision with root package name */
    public final d4 f34839g = d4.SEND_SHARE;

    /* renamed from: h, reason: collision with root package name */
    public final t f34840h = new t(this);

    @Override // cp1.p, uo1.a
    public final a getBaseActivityComponent() {
        a aVar = this.f34834b;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.r("activityComponent");
        throw null;
    }

    @Override // cp1.p
    public final Fragment getFragment() {
        return null;
    }

    @Override // uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF34839g() {
        return this.f34839g;
    }

    @Override // cp1.p, cp1.q, androidx.fragment.app.FragmentActivity, androidx.activity.o, c5.h, android.app.Activity
    public final void onCreate(Bundle bundle) {
        inject();
        g gVar = this.f34835c;
        if (gVar == null) {
            Intrinsics.r("themeProvider");
            throw null;
        }
        gVar.b(this);
        super.onCreate(bundle);
        setContentView(b.activity_send_share);
        this.f34837e = (ModalContainer) findViewById(n52.a.brio_modal_container);
        this.f34838f = (ModalContainer) findViewById(n52.a.brio_admin_modal_container);
        Bundle extras = getIntent().getExtras();
        String string = extras != null ? extras.getString("com.pinterest.EXTRA_PIN_ID") : null;
        getEventManager().h(this.f34840h);
        if (string != null) {
            c2 c2Var = this.f34836d;
            if (c2Var != null) {
                c2Var.s(string, 0, f.INAPP_BROWSER.getValue(), null);
            } else {
                Intrinsics.r("sharesheetUtils");
                throw null;
            }
        }
    }

    @Override // cp1.p, cp1.q, androidx.appcompat.app.n, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        getEventManager().j(this.f34840h);
    }

    @Override // cp1.p
    public final void setupActivityComponent() {
        if (this.f34834b == null) {
            this.f34834b = (a) o.a(this, a.class);
        }
    }
}
