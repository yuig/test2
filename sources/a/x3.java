package a;

import ads_mobile_sdk.gh2;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final /* synthetic */ class x3 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f179a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ gh2 f180b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f181c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f182d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ View f183e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Activity f184f;

    public /* synthetic */ x3(gh2 gh2Var, Context context, String str, View view, Activity activity, int i13) {
        this.f179a = i13;
        this.f180b = gh2Var;
        this.f181c = context;
        this.f182d = str;
        this.f183e = view;
        this.f184f = activity;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i13 = this.f179a;
        String str = this.f182d;
        Context context = this.f181c;
        gh2 gh2Var = this.f180b;
        Activity activity = this.f184f;
        View view = this.f183e;
        switch (i13) {
            case 0:
                return gh2Var.c(context, str, view, activity);
            default:
                return gh2Var.d(context, str, view, activity);
        }
    }
}
