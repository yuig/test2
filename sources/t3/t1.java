package t3;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* loaded from: classes.dex */
public final class t1 implements x3 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f116194a;

    public t1(Context context) {
        this.f116194a = context;
    }

    public final void a(String str) {
        try {
            this.f116194a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        } catch (ActivityNotFoundException e13) {
            throw new IllegalArgumentException(s1.b("Can't open ", str, '.'), e13);
        }
    }
}
