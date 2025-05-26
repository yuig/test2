package jh;

import android.app.Activity;
import android.content.Intent;

/* loaded from: classes3.dex */
public final class q extends s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Intent f76190a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Activity f76191b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f76192c;

    public q(Activity activity, Intent intent, int i13) {
        this.f76190a = intent;
        this.f76191b = activity;
        this.f76192c = i13;
    }

    @Override // jh.s
    public final void a() {
        Intent intent = this.f76190a;
        if (intent != null) {
            this.f76191b.startActivityForResult(intent, this.f76192c);
        }
    }
}
