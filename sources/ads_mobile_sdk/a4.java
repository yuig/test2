package ads_mobile_sdk;

import a.f2;
import android.app.Activity;
import android.content.Context;
import android.view.View;

/* loaded from: classes2.dex */
public final class a4 implements com.google.common.util.concurrent.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f2231a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f2232b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f2233c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Activity f2234d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b4 f2235e;

    public a4(b4 b4Var, Context context, String str, View view, Activity activity) {
        this.f2235e = b4Var;
        this.f2231a = context;
        this.f2232b = str;
        this.f2233c = view;
        this.f2234d = activity;
    }

    @Override // com.google.common.util.concurrent.m
    public final com.google.common.util.concurrent.c0 apply(Object obj) {
        ol2 ol2Var = this.f2235e.f2701b;
        return ((f2) ol2Var.f9364f.get()).b(this.f2231a, this.f2232b, this.f2233c, this.f2234d);
    }
}
