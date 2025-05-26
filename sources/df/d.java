package df;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* loaded from: classes.dex */
public final class d extends BroadcastReceiver {

    /* renamed from: b, reason: collision with root package name */
    public static d f54740b;

    /* renamed from: a, reason: collision with root package name */
    public final Context f54741a;

    public d(Context context) {
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
        this.f54741a = applicationContext;
    }

    public static final /* synthetic */ d a() {
        if (p001if.a.b(d.class)) {
            return null;
        }
        try {
            return f54740b;
        } catch (Throwable th3) {
            p001if.a.a(d.class, th3);
            return null;
        }
    }

    public final void finalize() {
        if (p001if.a.b(this)) {
            return;
        }
        try {
            if (p001if.a.b(this)) {
                return;
            }
            try {
                z6.c a13 = z6.c.a(this.f54741a);
                Intrinsics.checkNotNullExpressionValue(a13, "getInstance(applicationContext)");
                a13.d(this);
            } catch (Throwable th3) {
                p001if.a.a(this, th3);
            }
        } catch (Throwable th4) {
            p001if.a.a(this, th4);
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (p001if.a.b(this)) {
            return;
        }
        try {
            me.r rVar = new me.r(context);
            Set<String> set = null;
            String n13 = Intrinsics.n(intent == null ? null : intent.getStringExtra("event_name"), "bf_");
            Bundle bundleExtra = intent == null ? null : intent.getBundleExtra("event_args");
            Bundle bundle = new Bundle();
            if (bundleExtra != null) {
                set = bundleExtra.keySet();
            }
            if (set != null) {
                for (String key : set) {
                    Intrinsics.checkNotNullExpressionValue(key, "key");
                    bundle.putString(new Regex("[ -]*$").replace(new Regex("^[ -]*").replace(new Regex("[^0-9a-zA-Z _-]").replace(key, "-"), ""), ""), (String) bundleExtra.get(key));
                }
            }
            rVar.b(n13, bundle);
        } catch (Throwable th3) {
            p001if.a.a(this, th3);
        }
    }
}
