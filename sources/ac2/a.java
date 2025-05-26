package ac2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class a extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1932a;

    /* renamed from: b, reason: collision with root package name */
    public final IntentFilter f1933b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f1934c;

    public a(b bVar) {
        this.f1934c = bVar;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.media.VOLUME_CHANGED_ACTION");
        intentFilter.addAction("android.media.RINGER_MODE_CHANGED");
        this.f1933b = intentFilter;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Bundle extras;
        if (intent == null || (extras = intent.getExtras()) == null) {
            return;
        }
        boolean d2 = Intrinsics.d(intent.getAction(), "android.media.VOLUME_CHANGED_ACTION");
        b bVar = this.f1934c;
        if (!d2) {
            if (Intrinsics.d(intent.getAction(), "android.media.RINGER_MODE_CHANGED")) {
                if (kotlin.collections.f0.j(0, 1).contains(Integer.valueOf(extras.getInt("android.media.EXTRA_RINGER_MODE", -1)))) {
                    bVar.f1939e = 0;
                    Iterator it = bVar.f1937c.iterator();
                    while (it.hasNext()) {
                        ((j) it.next()).a(bVar.c());
                    }
                    return;
                }
                return;
            }
            return;
        }
        int i13 = extras.getInt("android.media.EXTRA_VOLUME_STREAM_VALUE", bVar.c());
        int i14 = extras.getInt("android.media.EXTRA_VOLUME_STREAM_TYPE", -1);
        if (i13 != bVar.c()) {
            if (i14 == 3 || i14 == 2) {
                bVar.f1939e = i13;
                Iterator it2 = bVar.f1937c.iterator();
                while (it2.hasNext()) {
                    ((j) it2.next()).a(bVar.c());
                }
            }
        }
    }
}
