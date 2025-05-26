package is1;

import android.content.ContentResolver;
import android.content.Context;
import android.os.Handler;
import android.provider.MediaStore;

/* loaded from: classes4.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final String f73654a = "(?i).*" + MediaStore.Images.Media.EXTERNAL_CONTENT_URI.toString() + ".*";

    /* renamed from: b, reason: collision with root package name */
    public final String[] f73655b = {"_display_name", "_data", "date_added"};

    /* renamed from: c, reason: collision with root package name */
    public final String f73656c;

    /* renamed from: d, reason: collision with root package name */
    public ContentResolver f73657d;

    /* renamed from: e, reason: collision with root package name */
    public h6.y f73658e;

    public x(String str) {
        this.f73656c = str;
    }

    public final void a(Context context) {
        this.f73657d = context.getContentResolver();
        h6.y yVar = new h6.y(this, new Handler(), 3);
        this.f73658e = yVar;
        this.f73657d.registerContentObserver(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, true, yVar);
    }

    public final void b() {
        this.f73657d.unregisterContentObserver(this.f73658e);
    }
}
