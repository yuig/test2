package com.pinterest.activity;

import af2.c;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.d;
import androidx.appcompat.app.n;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.p1;
import androidx.navigation.fragment.NavHostFragment;
import com.pinterest.gestalt.text.GestaltText;
import e0.t;
import g4.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kh2.j1;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.c0;
import kotlin.collections.f0;
import kotlin.collections.k0;
import kotlin.collections.v;
import kotlin.jvm.internal.Intrinsics;
import ms1.b;
import oe0.h;
import pk.a0;
import rs1.a;
import vo.f;
import vo.i;
import ye2.j;
import z9.b0;
import z9.e0;
import z9.k;
import z9.m;
import z9.p;
import z9.x;
import z9.y;
import z9.z;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007B\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/pinterest/activity/NavBaseActivity;", "Landroidx/appcompat/app/n;", "Lrs1/a;", "Lms1/b;", "Loe0/b;", "Lz9/m;", "Lts1/a;", "Lus1/a;", "<init>", "()V", "navPlayground_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class NavBaseActivity extends n implements a, b, oe0.b, m, ts1.a, us1.a, c {

    /* renamed from: a, reason: collision with root package name */
    public j f34806a;

    /* renamed from: b, reason: collision with root package name */
    public volatile ye2.b f34807b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f34808c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public boolean f34809d = false;

    /* renamed from: e, reason: collision with root package name */
    public e0 f34810e;

    /* renamed from: f, reason: collision with root package name */
    public GestaltText f34811f;

    /* renamed from: g, reason: collision with root package name */
    public final int f34812g;

    public NavBaseActivity() {
        addOnContextAvailableListener(new f(this, 1));
        this.f34812g = cu1.a.main_container;
    }

    @Override // c5.h, us1.a
    public final void g() {
    }

    @Override // af2.b
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // us1.a
    public final Activity getContext() {
        return this;
    }

    @Override // androidx.activity.o, androidx.lifecycle.k
    public final p1 getDefaultViewModelProviderFactory() {
        return j1.b0(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // oe0.b
    public final h getVoiceMessageDispatcher() {
        return new i(0);
    }

    @Override // ts1.a
    /* renamed from: h, reason: from getter */
    public final int getF34812g() {
        return this.f34812g;
    }

    @Override // ms1.b
    public final void inflateConfettiContainer() {
    }

    @Override // ms1.b
    public final void inflateEducationContainer() {
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.o, c5.h, android.app.Activity
    public final void onCreate(Bundle bundle) {
        q(bundle);
        setContentView(cu1.b.nav_activity_main_bottom_nav_hide_lego_delayed);
        View findViewById = findViewById(cu1.a.nav_progress);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f34811f = (GestaltText) findViewById;
        Fragment E = getSupportFragmentManager().E(this.f34812g);
        Intrinsics.g(E, "null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment");
        e0 M6 = ((NavHostFragment) E).M6();
        this.f34810e = M6;
        if (M6 == null) {
            Intrinsics.r("navController");
            throw null;
        }
        Intrinsics.checkNotNullParameter(this, "listener");
        M6.f141270q.add(this);
        v vVar = M6.f141260g;
        if (!vVar.isEmpty()) {
            k kVar = (k) vVar.last();
            z zVar = kVar.f141211b;
            kVar.a();
            t(M6, zVar);
        }
    }

    @Override // androidx.appcompat.app.n
    public final boolean onSupportNavigateUp() {
        Intent intent;
        e0 e0Var = this.f34810e;
        if (e0Var == null) {
            Intrinsics.r("navController");
            throw null;
        }
        if (e0Var.h() != 1) {
            return e0Var.p();
        }
        Activity activity = e0Var.f141255b;
        Bundle extras = (activity == null || (intent = activity.getIntent()) == null) ? null : intent.getExtras();
        int i13 = 0;
        if ((extras != null ? extras.getIntArray("android-support-nav:controller:deepLinkIds") : null) == null) {
            z g13 = e0Var.g();
            Intrinsics.f(g13);
            int i14 = g13.f141329h;
            for (b0 b0Var = g13.f141323b; b0Var != null; b0Var = b0Var.f141323b) {
                if (b0Var.f141161l != i14) {
                    Bundle bundle = new Bundle();
                    if (activity != null && activity.getIntent() != null && activity.getIntent().getData() != null) {
                        bundle.putParcelable("android-support-nav:controller:deepLinkIntent", activity.getIntent());
                        b0 b0Var2 = e0Var.f141256c;
                        Intrinsics.f(b0Var2);
                        Intent intent2 = activity.getIntent();
                        Intrinsics.checkNotNullExpressionValue(intent2, "activity!!.intent");
                        y f13 = b0Var2.f(new d(intent2));
                        if ((f13 != null ? f13.f141316b : null) != null) {
                            bundle.putAll(f13.f141315a.c(f13.f141316b));
                        }
                    }
                    androidx.camera.core.impl.j jVar = new androidx.camera.core.impl.j(e0Var);
                    int i15 = b0Var.f141329h;
                    ((List) jVar.f16878e).clear();
                    ((List) jVar.f16878e).add(new x(i15, null));
                    if (((b0) jVar.f16877d) != null) {
                        jVar.s();
                    }
                    jVar.f16879f = bundle;
                    ((Intent) jVar.f16876c).putExtra("android-support-nav:controller:deepLinkExtras", bundle);
                    jVar.f().e();
                    if (activity == null) {
                        return true;
                    }
                    activity.finish();
                    return true;
                }
                i14 = b0Var.f141329h;
            }
        } else if (e0Var.f141259f) {
            Intrinsics.f(activity);
            Intent intent3 = activity.getIntent();
            Bundle extras2 = intent3.getExtras();
            Intrinsics.f(extras2);
            int[] intArray = extras2.getIntArray("android-support-nav:controller:deepLinkIds");
            Intrinsics.f(intArray);
            ArrayList d03 = c0.d0(intArray);
            ArrayList parcelableArrayList = extras2.getParcelableArrayList("android-support-nav:controller:deepLinkArgs");
            int intValue = ((Number) k0.B(d03)).intValue();
            if (parcelableArrayList != null) {
            }
            if (!d03.isEmpty()) {
                z e13 = p.e(e0Var.i(), intValue);
                if (e13 instanceof b0) {
                    int i16 = b0.f141159o;
                    intValue = u.g0((b0) e13).f141329h;
                }
                z g14 = e0Var.g();
                if (g14 != null && intValue == g14.f141329h) {
                    androidx.camera.core.impl.j jVar2 = new androidx.camera.core.impl.j(e0Var);
                    Bundle j13 = t.j(new Pair("android-support-nav:controller:deepLinkIntent", intent3));
                    Bundle bundle2 = extras2.getBundle("android-support-nav:controller:deepLinkExtras");
                    if (bundle2 != null) {
                        j13.putAll(bundle2);
                    }
                    jVar2.f16879f = j13;
                    ((Intent) jVar2.f16876c).putExtra("android-support-nav:controller:deepLinkExtras", j13);
                    Iterator it = d03.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        int i17 = i13 + 1;
                        if (i13 < 0) {
                            f0.p();
                            throw null;
                        }
                        ((List) jVar2.f16878e).add(new x(((Number) next).intValue(), parcelableArrayList != null ? (Bundle) parcelableArrayList.get(i13) : null));
                        if (((b0) jVar2.f16877d) != null) {
                            jVar2.s();
                        }
                        i13 = i17;
                    }
                    jVar2.f().e();
                    activity.finish();
                    return true;
                }
            }
        }
        return false;
    }

    @Override // rs1.a
    public final void onViewTreeReady(View rootView, String invokerTag) {
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(invokerTag, "invokerTag");
    }

    public final void q(Bundle bundle) {
        super.onCreate(bundle);
        if (getApplication() instanceof af2.b) {
            j b13 = componentManager().b();
            this.f34806a = b13;
            if (b13.a()) {
                this.f34806a.f138918a = getDefaultViewModelCreationExtras();
            }
        }
    }

    public final void t(p controller, z destination) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(destination, "destination");
        GestaltText gestaltText = this.f34811f;
        if (gestaltText != null) {
            a0.p(gestaltText, String.valueOf(destination.f141325d));
        } else {
            Intrinsics.r("bottomBar");
            throw null;
        }
    }

    @Override // androidx.appcompat.app.n, androidx.fragment.app.FragmentActivity, android.app.Activity
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public final void onDestroy() {
        super.onDestroy();
        j jVar = this.f34806a;
        if (jVar != null) {
            jVar.f138918a = null;
        }
    }

    @Override // af2.c
    public final ye2.b componentManager() {
        if (this.f34807b == null) {
            synchronized (this.f34808c) {
                try {
                    if (this.f34807b == null) {
                        this.f34807b = new ye2.b(this);
                    }
                } finally {
                }
            }
        }
        return this.f34807b;
    }
}
