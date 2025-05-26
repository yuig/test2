package c5;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final Context f25836a;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f25840e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f25841f;

    /* renamed from: g, reason: collision with root package name */
    public PendingIntent f25842g;

    /* renamed from: h, reason: collision with root package name */
    public IconCompat f25843h;

    /* renamed from: i, reason: collision with root package name */
    public int f25844i;

    /* renamed from: j, reason: collision with root package name */
    public int f25845j;

    /* renamed from: l, reason: collision with root package name */
    public x f25847l;

    /* renamed from: m, reason: collision with root package name */
    public String f25848m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f25849n;

    /* renamed from: p, reason: collision with root package name */
    public Bundle f25851p;

    /* renamed from: s, reason: collision with root package name */
    public RemoteViews f25854s;

    /* renamed from: t, reason: collision with root package name */
    public RemoteViews f25855t;

    /* renamed from: u, reason: collision with root package name */
    public String f25856u;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f25858w;

    /* renamed from: x, reason: collision with root package name */
    public final Notification f25859x;

    /* renamed from: y, reason: collision with root package name */
    public final ArrayList f25860y;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f25837b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f25838c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f25839d = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public boolean f25846k = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f25850o = false;

    /* renamed from: q, reason: collision with root package name */
    public int f25852q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f25853r = 0;

    /* renamed from: v, reason: collision with root package name */
    public int f25857v = 0;

    public u(Context context, String str) {
        Notification notification = new Notification();
        this.f25859x = notification;
        this.f25836a = context;
        this.f25856u = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.f25845j = 0;
        this.f25860y = new ArrayList();
        this.f25858w = true;
    }

    public static CharSequence c(CharSequence charSequence) {
        return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
    }

    public final void a(int i13, String str, PendingIntent pendingIntent) {
        this.f25837b.add(new o(i13, str, pendingIntent));
    }

    public final Notification b() {
        Bundle bundle;
        z zVar = new z(this);
        u uVar = zVar.f25864c;
        x xVar = uVar.f25847l;
        if (xVar != null) {
            xVar.b(zVar);
        }
        Notification build = zVar.f25863b.build();
        RemoteViews remoteViews = uVar.f25854s;
        if (remoteViews != null) {
            build.contentView = remoteViews;
        }
        if (xVar != null) {
            uVar.f25847l.getClass();
        }
        if (xVar != null && (bundle = build.extras) != null) {
            xVar.a(bundle);
        }
        return build;
    }

    public final void d(boolean z13) {
        k(16, z13);
    }

    public final void e(int i13) {
        this.f25852q = i13;
    }

    public final void f(PendingIntent pendingIntent) {
        this.f25842g = pendingIntent;
    }

    public final void g(CharSequence charSequence) {
        this.f25841f = c(charSequence);
    }

    public final void h(CharSequence charSequence) {
        this.f25840e = c(charSequence);
    }

    public final void i(RemoteViews remoteViews) {
        this.f25855t = remoteViews;
    }

    public final void j(RemoteViews remoteViews) {
        this.f25854s = remoteViews;
    }

    public final void k(int i13, boolean z13) {
        Notification notification = this.f25859x;
        if (z13) {
            notification.flags = i13 | notification.flags;
        } else {
            notification.flags = (~i13) & notification.flags;
        }
    }

    public final void l(String str) {
        this.f25848m = str;
    }

    public final void m() {
        this.f25857v = 2;
    }

    public final void n() {
        this.f25849n = true;
    }

    public final void o(Bitmap bitmap) {
        IconCompat iconCompat;
        if (bitmap == null) {
            iconCompat = null;
        } else {
            if (Build.VERSION.SDK_INT < 27) {
                Resources resources = this.f25836a.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(b5.b.compat_notification_large_icon_max_width);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(b5.b.compat_notification_large_icon_max_height);
                if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                    double min = Math.min(dimensionPixelSize / Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / Math.max(1, bitmap.getHeight()));
                    bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * min), (int) Math.ceil(bitmap.getHeight() * min), true);
                }
            }
            PorterDuff.Mode mode = IconCompat.f17930k;
            bitmap.getClass();
            IconCompat iconCompat2 = new IconCompat(1);
            iconCompat2.f17932b = bitmap;
            iconCompat = iconCompat2;
        }
        this.f25843h = iconCompat;
    }

    public final void p(boolean z13) {
        k(8, z13);
    }

    public final void q(int i13) {
        this.f25845j = i13;
    }

    public final void r(int i13) {
        this.f25859x.icon = i13;
    }

    public final void s(x xVar) {
        if (this.f25847l != xVar) {
            this.f25847l = xVar;
            if (xVar == null || xVar.f25861a == this) {
                return;
            }
            xVar.f25861a = this;
            s(xVar);
        }
    }

    public final void t(CharSequence charSequence) {
        this.f25859x.tickerText = c(charSequence);
    }

    public final void u(long[] jArr) {
        this.f25859x.vibrate = jArr;
    }
}
