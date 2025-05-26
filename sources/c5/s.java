package c5;

import android.app.Notification;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class s extends x {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f25834b;

    /* renamed from: c, reason: collision with root package name */
    public Object f25835c;

    public s(int i13) {
        this.f25834b = i13;
        if (i13 != 1) {
            return;
        }
        this.f25835c = new ArrayList();
    }

    @Override // c5.x
    public final void a(Bundle bundle) {
        switch (this.f25834b) {
            case 0:
                super.a(bundle);
                break;
            default:
                super.a(bundle);
                break;
        }
    }

    @Override // c5.x
    public final void b(z zVar) {
        Notification.Builder builder = zVar.f25863b;
        switch (this.f25834b) {
            case 0:
                new Notification.BigTextStyle(builder).setBigContentTitle(null).bigText((CharSequence) this.f25835c);
                break;
            default:
                Notification.InboxStyle bigContentTitle = new Notification.InboxStyle(builder).setBigContentTitle(null);
                Iterator it = ((ArrayList) this.f25835c).iterator();
                while (it.hasNext()) {
                    bigContentTitle.addLine((CharSequence) it.next());
                }
                break;
        }
    }

    @Override // c5.x
    public final String c() {
        switch (this.f25834b) {
            case 0:
                return "androidx.core.app.NotificationCompat$BigTextStyle";
            default:
                return "androidx.core.app.NotificationCompat$InboxStyle";
        }
    }

    public final void d(String str) {
        this.f25835c = u.c(str);
    }
}
