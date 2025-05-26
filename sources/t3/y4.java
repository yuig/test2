package t3;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class y4 extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ co2.q f116283a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y4(co2.m mVar, Handler handler) {
        super(handler);
        this.f116283a = mVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z13, Uri uri) {
        this.f116283a.g(Unit.f80348a);
    }
}
