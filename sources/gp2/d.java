package gp2;

import android.os.Handler;

/* loaded from: classes4.dex */
public final class d extends h implements c {

    /* renamed from: l, reason: collision with root package name */
    public final Handler f65946l;

    public d(int i13, Handler handler) {
        super(i13, 2, "SingleThreadTaskRunnerImpl");
        this.f65946l = handler;
    }

    @Override // gp2.h
    public final void e() {
        Handler handler = this.f65946l;
        if (handler == null) {
            return;
        }
        handler.post(this.f65954e);
    }
}
