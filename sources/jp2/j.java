package jp2;

import android.content.Context;
import java.util.LinkedList;
import java.util.regex.Pattern;
import org.chromium.net.ICronetEngineBuilder;

/* loaded from: classes2.dex */
public abstract class j extends ICronetEngineBuilder {

    /* renamed from: o, reason: collision with root package name */
    public static final Pattern f77336o = Pattern.compile("^[0-9\\.]*$");

    /* renamed from: a, reason: collision with root package name */
    public final Context f77337a;

    /* renamed from: d, reason: collision with root package name */
    public boolean f77340d;

    /* renamed from: e, reason: collision with root package name */
    public String f77341e;

    /* renamed from: f, reason: collision with root package name */
    public String f77342f;

    /* renamed from: j, reason: collision with root package name */
    public g f77346j;

    /* renamed from: k, reason: collision with root package name */
    public long f77347k;

    /* renamed from: l, reason: collision with root package name */
    public String f77348l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f77349m;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedList f77338b = new LinkedList();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedList f77339c = new LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public int f77350n = 20;

    /* renamed from: g, reason: collision with root package name */
    public boolean f77343g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f77344h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f77345i = false;

    public j(Context context) {
        this.f77337a = context.getApplicationContext();
        g fromPublicBuilderCacheMode = g.fromPublicBuilderCacheMode(0);
        if (fromPublicBuilderCacheMode.getType() == 1 && this.f77342f == null) {
            throw new IllegalArgumentException("Storage path must be set");
        }
        this.f77346j = fromPublicBuilderCacheMode;
        this.f77347k = 0L;
        this.f77349m = false;
        this.f77340d = true;
    }

    public final String a() {
        if (!this.f77343g) {
            return "";
        }
        Object obj = c0.f77316a;
        return this.f77337a.getPackageName() + " Cronet/119.0.6045.31";
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final String getDefaultUserAgent() {
        return c0.a(this.f77337a);
    }
}
