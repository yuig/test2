package o7;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* loaded from: classes3.dex */
public final class d extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final ContentResolver f93029a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f93030b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f93031c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        this.f93031c = eVar;
        this.f93029a = contentResolver;
        this.f93030b = uri;
    }

    public final void a() {
        this.f93029a.registerContentObserver(this.f93030b, false, this);
    }

    public final void b() {
        this.f93029a.unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z13) {
        e eVar = this.f93031c;
        eVar.a(b.b(eVar.f93033a, eVar.f93041i, eVar.f93040h));
    }
}
