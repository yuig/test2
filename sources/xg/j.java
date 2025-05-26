package xg;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes3.dex */
public final /* synthetic */ class j implements d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f134922a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f134923b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Bundle f134924c;

    public /* synthetic */ j(e eVar, Bundle bundle, int i13) {
        this.f134922a = i13;
        this.f134923b = eVar;
        this.f134924c = bundle;
    }

    @Override // xg.d
    public final void n(wg.c cVar, TaskCompletionSource taskCompletionSource) {
        int i13 = this.f134922a;
        Bundle bundle = this.f134924c;
        e eVar = this.f134923b;
        switch (i13) {
            case 0:
                cVar.l(bundle, new m(eVar, taskCompletionSource));
                break;
            default:
                cVar.v(bundle, new n(eVar, taskCompletionSource));
                break;
        }
    }
}
