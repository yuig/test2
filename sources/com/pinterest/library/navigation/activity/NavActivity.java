package com.pinterest.library.navigation.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ms1.b;
import oe0.h;
import ss1.a;
import ts1.c;
import ts1.d;
import vo.i;
import z9.b0;
import z9.e0;
import z9.f0;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0001\tB\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/pinterest/library/navigation/activity/NavActivity;", "Landroidx/appcompat/app/n;", "Lrs1/a;", "Lms1/b;", "Loe0/b;", "Lts1/a;", "Lus1/a;", "<init>", "()V", "g4/u", "controller_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class NavActivity extends a implements rs1.a, b, oe0.b, ts1.a, us1.a {

    /* renamed from: e, reason: collision with root package name */
    public final int f49885e = c.nav_host_fragment;

    /* renamed from: f, reason: collision with root package name */
    public e0 f49886f;

    @Override // c5.h, us1.a
    public final void g() {
    }

    @Override // us1.a
    public final Activity getContext() {
        return this;
    }

    @Override // oe0.b
    public final h getVoiceMessageDispatcher() {
        return new i(1);
    }

    @Override // ts1.a
    /* renamed from: h, reason: from getter */
    public final int getF49885e() {
        return this.f49885e;
    }

    @Override // ms1.b
    public final void inflateConfettiContainer() {
    }

    @Override // ms1.b
    public final void inflateEducationContainer() {
    }

    @Override // ss1.a, androidx.fragment.app.FragmentActivity, androidx.activity.o, c5.h, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(d.activity_nav);
        Fragment E = getSupportFragmentManager().E(this.f49885e);
        Intrinsics.g(E, "null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment");
        this.f49886f = ((NavHostFragment) E).M6();
        int intExtra = getIntent().getIntExtra("graph_id", vs1.b.nav_graph);
        e0 e0Var = this.f49886f;
        if (e0Var == null) {
            Intrinsics.r("navController");
            throw null;
        }
        b0 graph = ((f0) e0Var.C.getValue()).b(intExtra);
        if (getIntent().hasExtra("start_id")) {
            graph.v(getIntent().getIntExtra("start_id", graph.f141161l));
        }
        e0 e0Var2 = this.f49886f;
        if (e0Var2 == null) {
            Intrinsics.r("navController");
            throw null;
        }
        Intrinsics.checkNotNullParameter(graph, "graph");
        e0Var2.z(graph, null);
        if (getIntent().hasExtra("action_id")) {
            int intExtra2 = getIntent().getIntExtra("action_id", 0);
            e0 e0Var3 = this.f49886f;
            if (e0Var3 == null) {
                Intrinsics.r("navController");
                throw null;
            }
            if (intExtra2 != e0Var3.i().f141161l) {
                e0 e0Var4 = this.f49886f;
                if (e0Var4 != null) {
                    e0Var4.m(intExtra2, getIntent().getExtras());
                } else {
                    Intrinsics.r("navController");
                    throw null;
                }
            }
        }
    }

    @Override // androidx.activity.o, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        e0 e0Var = this.f49886f;
        if (e0Var != null) {
            e0Var.k(intent);
        } else {
            Intrinsics.r("navController");
            throw null;
        }
    }

    @Override // rs1.a
    public final void onViewTreeReady(View rootView, String invokerTag) {
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(invokerTag, "invokerTag");
    }
}
