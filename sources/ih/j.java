package ih;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* loaded from: classes3.dex */
public final class j extends bi.f {

    /* renamed from: a, reason: collision with root package name */
    public final Context f72271a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f72272b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(c cVar, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper(), 0);
        this.f72272b = cVar;
        this.f72271a = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i13 = message.what;
        if (i13 != 1) {
            Log.w("GoogleApiAvailability", "Don't know how to handle this message: " + i13);
            return;
        }
        int i14 = d.f72258a;
        c cVar = this.f72272b;
        Context context = this.f72271a;
        int c13 = cVar.c(context, i14);
        if (cVar.h(c13)) {
            Intent a13 = cVar.a(c13, context, "n");
            cVar.k(context, c13, a13 == null ? null : PendingIntent.getActivity(context, 0, a13, 201326592));
        }
    }
}
