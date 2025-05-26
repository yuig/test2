package y92;

import android.os.Handler;
import android.os.Message;
import android.view.MotionEvent;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f138285a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, Handler handler) {
        super(handler.getLooper());
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f138285a = cVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        int i13 = msg.what;
        c cVar = this.f138285a;
        if (i13 == 1) {
            b bVar = cVar.f138286a;
            MotionEvent e13 = cVar.f138297l;
            bVar.getClass();
            Intrinsics.checkNotNullParameter(e13, "e");
            return;
        }
        if (i13 == 2) {
            cVar.f138291f.removeMessages(3);
            cVar.f138294i = true;
            cVar.f138286a.c(cVar.f138297l);
        } else {
            if (i13 != 3) {
                throw new RuntimeException("Unknown message " + msg);
            }
            b bVar2 = cVar.f138292g;
            if (bVar2 == null || cVar.f138293h) {
                return;
            }
            bVar2.g(cVar.f138297l);
        }
    }
}
