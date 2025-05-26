package p7;

import android.os.Handler;
import android.os.Message;
import d7.n0;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class u implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final l8.m f99051a;

    /* renamed from: b, reason: collision with root package name */
    public final g f99052b;

    /* renamed from: f, reason: collision with root package name */
    public q7.c f99056f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f99057g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f99058h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f99059i;

    /* renamed from: e, reason: collision with root package name */
    public final TreeMap f99055e = new TreeMap();

    /* renamed from: d, reason: collision with root package name */
    public final Handler f99054d = n0.n(this);

    /* renamed from: c, reason: collision with root package name */
    public final a9.b f99053c = new a9.b();

    public u(q7.c cVar, g gVar, l8.m mVar) {
        this.f99056f = cVar;
        this.f99052b = gVar;
        this.f99051a = mVar;
    }

    public final t a() {
        return new t(this, this.f99051a);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (this.f99059i) {
            return true;
        }
        if (message.what != 1) {
            return false;
        }
        s sVar = (s) message.obj;
        long j13 = sVar.f99044a;
        TreeMap treeMap = this.f99055e;
        long j14 = sVar.f99045b;
        Long l13 = (Long) treeMap.get(Long.valueOf(j14));
        if (l13 == null) {
            treeMap.put(Long.valueOf(j14), Long.valueOf(j13));
        } else if (l13.longValue() > j13) {
            treeMap.put(Long.valueOf(j14), Long.valueOf(j13));
        }
        return true;
    }
}
