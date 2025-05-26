package jk;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes3.dex */
public final class j extends k {

    /* renamed from: d */
    public final /* synthetic */ int f76343d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(l lVar, TaskCompletionSource taskCompletionSource, int i13) {
        super(lVar, taskCompletionSource);
        this.f76343d = i13;
    }

    public final void D(Bundle bundle) {
        int i13 = this.f76343d;
        l lVar = this.f76345c;
        TaskCompletionSource taskCompletionSource = this.f76344b;
        switch (i13) {
            case 0:
                lVar.f76349b.c(taskCompletionSource);
                l.f76346c.g("onDeferredUninstall", new Object[0]);
                taskCompletionSource.trySetResult(null);
                break;
            default:
                lVar.f76349b.c(taskCompletionSource);
                l.f76346c.g("onDeferredUninstall", new Object[0]);
                break;
        }
    }

    public final void E(int i13, Bundle bundle) {
        int i14 = this.f76343d;
        l lVar = this.f76345c;
        TaskCompletionSource taskCompletionSource = this.f76344b;
        switch (i14) {
            case 1:
                lVar.f76349b.c(taskCompletionSource);
                l.f76346c.g("onStartInstall(%d)", Integer.valueOf(i13));
                taskCompletionSource.trySetResult(Integer.valueOf(i13));
                break;
            default:
                lVar.f76349b.c(taskCompletionSource);
                l.f76346c.g("onStartInstall(%d)", Integer.valueOf(i13));
                break;
        }
    }
}
