package ads_mobile_sdk;

import a.v2;
import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class h90 extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final Context f5891a;

    /* renamed from: b, reason: collision with root package name */
    public final AudioManager f5892b;

    /* renamed from: c, reason: collision with root package name */
    public final a.l1 f5893c;

    /* renamed from: d, reason: collision with root package name */
    public final v2 f5894d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReference f5895e;

    public h90(Handler handler, Context context, a.l1 l1Var, fs1 fs1Var) {
        super(handler);
        this.f5895e = new AtomicReference(Float.valueOf(-1.0f));
        this.f5891a = context;
        this.f5892b = (AudioManager) context.getSystemService("audio");
        this.f5893c = l1Var;
        this.f5894d = fs1Var;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z13) {
        new Thread(new g90(this)).start();
    }
}
