package m60;

import java.util.TimerTask;

/* loaded from: classes.dex */
public final class c extends TimerTask {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f85888a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f85889b;

    public /* synthetic */ c(Object obj, int i13) {
        this.f85888a = i13;
        this.f85889b = obj;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        int i13 = this.f85888a;
        Object obj = this.f85889b;
        switch (i13) {
            case 0:
                ((d) obj).f85891a = b.BACKGROUND;
                break;
            default:
                vy.m mVar = (vy.m) ((m0) obj).f85932J.getValue();
                mVar.getClass();
                mVar.f(vy.m.e(), false);
                break;
        }
    }
}
