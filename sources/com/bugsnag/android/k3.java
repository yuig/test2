package com.bugsnag.android;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.File;

/* loaded from: classes3.dex */
public final class k3 extends id.d {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f29319d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z f29320e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f29321f;

    public /* synthetic */ k3(z zVar, Object obj, int i13) {
        this.f29319d = i13;
        this.f29320e = zVar;
        this.f29321f = obj;
    }

    @Override // id.d
    public final Object c() {
        b4 b4Var;
        SharedPreferences sharedPreferences;
        SharedPreferences.Editor edit;
        SharedPreferences.Editor clear;
        int i13 = this.f29319d;
        Object obj = this.f29321f;
        z zVar = this.f29320e;
        switch (i13) {
            case 0:
                final d4 d4Var = (d4) ((id.d) zVar.f29712g).get();
                a4 a4Var = (a4) obj;
                d4Var.getClass();
                boolean z13 = (a4Var.f29154a == null && a4Var.f29156c == null && a4Var.f29155b == null) ? false : true;
                id.c cVar = d4Var.f29191b;
                if (!z13) {
                    boolean z14 = d4Var.f29190a;
                    if (z14) {
                        id.c cVar2 = d4Var.f29192c;
                        SharedPreferences sharedPreferences2 = ((q2) cVar2.get()).f29425a;
                        if (sharedPreferences2 != null && sharedPreferences2.contains("install.iud")) {
                            q2 q2Var = (q2) cVar2.get();
                            q0 q0Var = (q0) cVar.get();
                            String str = q0Var == null ? null : q0Var.f29420a;
                            SharedPreferences sharedPreferences3 = q2Var.f29425a;
                            a4 a4Var2 = new a4(sharedPreferences3 == null ? null : sharedPreferences3.getString("user.id", str), sharedPreferences3 == null ? null : sharedPreferences3.getString("user.email", null), sharedPreferences3 == null ? null : sharedPreferences3.getString("user.name", null));
                            d4Var.a(a4Var2);
                            a4Var = a4Var2;
                        } else {
                            sp2.i iVar = d4Var.f29194e;
                            if (((File) iVar.f114928b).canRead() && ((File) iVar.f114928b).length() > 0 && z14) {
                                try {
                                    a4Var = (a4) iVar.V(new n0(a4.f29153d, 1));
                                } catch (Exception e13) {
                                    d4Var.f29193d.a("Failed to load user info", e13);
                                }
                            }
                        }
                    }
                    a4Var = null;
                }
                if (a4Var == null || (a4Var.f29154a == null && a4Var.f29156c == null && a4Var.f29155b == null)) {
                    q0 q0Var2 = (q0) cVar.get();
                    b4Var = new b4(new a4(q0Var2 == null ? null : q0Var2.f29420a, null, null));
                } else {
                    b4Var = new b4(a4Var);
                }
                b4Var.addObserver(new hd.m() { // from class: com.bugsnag.android.c4
                    @Override // hd.m
                    public final void onStateChange(j3 j3Var) {
                        if (j3Var instanceof i3) {
                            d4.this.a(((i3) j3Var).f29278a);
                        }
                    }
                });
                q2 q2Var2 = (q2) zVar.f29710e.a();
                if (q2Var2 != null && (sharedPreferences = q2Var2.f29425a) != null && sharedPreferences.contains("install.iud") && sharedPreferences != null && (edit = sharedPreferences.edit()) != null && (clear = edit.clear()) != null) {
                    clear.commit();
                }
                return b4Var;
            default:
                y yVar = zVar.f29710e;
                hd.h hVar = zVar.f29708c;
                return new r0((Context) obj, yVar, hVar, hVar.f68826r);
        }
    }
}
