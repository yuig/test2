package com.pinterest.componentBrowser;

import android.os.Bundle;
import androidx.compose.foundation.lazy.layout.u0;
import androidx.compose.foundation.lazy.layout.v;
import bf.b;
import c2.y3;
import i1.h;
import i2.f2;
import i2.o;
import i2.s;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j;
import oc0.e;
import oc0.f;
import oc0.i;
import oc0.r;
import vo.g;
import z9.e0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/pinterest/componentBrowser/ComponentBrowserActivity;", "Landroidx/appcompat/app/n;", "<init>", "()V", "componentBrowser_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class ComponentBrowserActivity extends g {

    /* renamed from: f, reason: collision with root package name */
    public i f44772f;

    /* renamed from: g, reason: collision with root package name */
    public g92.g f44773g;

    /* renamed from: h, reason: collision with root package name */
    public e0 f44774h;

    public ComponentBrowserActivity() {
        super(2);
    }

    public static final void q(ComponentBrowserActivity componentBrowserActivity, e0 e0Var, r rVar, o oVar, int i13) {
        componentBrowserActivity.getClass();
        s sVar = (s) oVar;
        sVar.Y(484235415);
        y3.a(null, null, rVar.a().a(), q2.i.c(-1594645103, new v(10, e0Var, rVar), sVar), null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, q2.i.c(1028465817, new h(e0Var, 12), sVar), sVar, 3072, 12582912, 131059);
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new u0(componentBrowserActivity, e0Var, rVar, i13, 7);
        }
    }

    @Override // vo.g, androidx.fragment.app.FragmentActivity, androidx.activity.o, c5.h, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        g92.g gVar = this.f44773g;
        if (gVar == null) {
            Intrinsics.r("themeProvider");
            throw null;
        }
        gVar.b(this);
        j.z(b.S(this), null, null, new e(this, null), 3);
        f fVar = new f(this, 1);
        Object obj = q2.i.f102113a;
        e.i.a(this, new q2.h(fVar, true, 1840403862));
    }

    public final e0 t() {
        e0 e0Var = this.f44774h;
        if (e0Var != null) {
            return e0Var;
        }
        Intrinsics.r("navController");
        throw null;
    }
}
