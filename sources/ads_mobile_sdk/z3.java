package ads_mobile_sdk;

import a.f2;
import android.app.Activity;
import android.content.Context;
import android.view.View;

/* loaded from: classes2.dex */
public final class z3 implements com.google.common.util.concurrent.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f14541a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f14542b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f14543c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Activity f14544d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b4 f14545e;

    public z3(b4 b4Var, Context context, String str, View view, Activity activity) {
        this.f14545e = b4Var;
        this.f14541a = context;
        this.f14542b = str;
        this.f14543c = view;
        this.f14544d = activity;
    }

    @Override // com.google.common.util.concurrent.m
    public final com.google.common.util.concurrent.c0 apply(Object obj) {
        ol2 ol2Var = this.f14545e.f2701b;
        return ((f2) ol2Var.f9364f.get()).a(this.f14541a, this.f14542b, this.f14543c, this.f14544d);
    }
}
