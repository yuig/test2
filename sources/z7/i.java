package z7;

import a.z0;
import ads_mobile_sdk.ci1$$ExternalSyntheticThrowCCEIfNotNull0;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import androidx.media3.exoplayer.scheduler.Requirements;
import d7.n0;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutorService;

/* loaded from: classes3.dex */
public final class i {

    /* renamed from: l, reason: collision with root package name */
    public static final Requirements f140941l = new Requirements(1);

    /* renamed from: a, reason: collision with root package name */
    public final Context f140942a;

    /* renamed from: b, reason: collision with root package name */
    public final g f140943b;

    /* renamed from: c, reason: collision with root package name */
    public final z0 f140944c;

    /* renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArraySet f140945d;

    /* renamed from: e, reason: collision with root package name */
    public int f140946e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f140947f;

    /* renamed from: g, reason: collision with root package name */
    public int f140948g;

    /* renamed from: h, reason: collision with root package name */
    public int f140949h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f140950i;

    /* renamed from: j, reason: collision with root package name */
    public List f140951j;

    /* renamed from: k, reason: collision with root package name */
    public c8.d f140952k;

    /* JADX WARN: Type inference failed for: r10v3, types: [z7.e] */
    public i(Context context, f7.b bVar, h7.a aVar, g7.e eVar, ExecutorService executorService) {
        b bVar2 = new b(bVar);
        h7.d dVar = new h7.d();
        dVar.f67863a = aVar;
        dVar.f67865c = eVar;
        c cVar = new c(dVar, executorService);
        this.f140942a = context.getApplicationContext();
        this.f140948g = 3;
        this.f140947f = true;
        this.f140951j = Collections.emptyList();
        this.f140945d = new CopyOnWriteArraySet();
        Handler o13 = n0.o(new Handler.Callback() { // from class: z7.e
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                i iVar = i.this;
                iVar.getClass();
                int i13 = message.what;
                CopyOnWriteArraySet copyOnWriteArraySet = iVar.f140945d;
                if (i13 == 1) {
                    iVar.f140951j = Collections.unmodifiableList((List) message.obj);
                    boolean c13 = iVar.c();
                    Iterator it = copyOnWriteArraySet.iterator();
                    if (it.hasNext()) {
                        ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(it.next());
                        throw null;
                    }
                    if (c13) {
                        iVar.a();
                    }
                } else if (i13 == 2) {
                    int i14 = message.arg1;
                    int i15 = message.arg2;
                    int i16 = iVar.f140946e - i14;
                    iVar.f140946e = i16;
                    if (i15 == 0 && i16 == 0) {
                        Iterator it2 = copyOnWriteArraySet.iterator();
                        if (it2.hasNext()) {
                            ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(it2.next());
                            throw null;
                        }
                    }
                } else {
                    if (i13 != 3) {
                        throw new IllegalStateException();
                    }
                    f fVar = (f) message.obj;
                    iVar.f140951j = Collections.unmodifiableList(fVar.f140918b);
                    boolean c14 = iVar.c();
                    if (fVar.f140917a) {
                        Iterator it3 = copyOnWriteArraySet.iterator();
                        if (it3.hasNext()) {
                            ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(it3.next());
                            throw null;
                        }
                    } else {
                        Iterator it4 = copyOnWriteArraySet.iterator();
                        if (it4.hasNext()) {
                            ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(it4.next());
                            throw null;
                        }
                    }
                    if (c14) {
                        iVar.a();
                    }
                }
                return true;
            }
        });
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:DownloadManager");
        handlerThread.start();
        g gVar = new g(handlerThread, bVar2, cVar, o13, this.f140948g, this.f140947f);
        this.f140943b = gVar;
        z0 z0Var = new z0(this, 28);
        this.f140944c = z0Var;
        c8.d dVar2 = new c8.d(context, z0Var, f140941l);
        this.f140952k = dVar2;
        int b13 = dVar2.b();
        this.f140949h = b13;
        this.f140946e = 1;
        gVar.obtainMessage(1, b13, 0).sendToTarget();
    }

    public final void a() {
        Iterator it = this.f140945d.iterator();
        if (it.hasNext()) {
            ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(it.next());
            throw null;
        }
    }

    public final void b(c8.d dVar, int i13) {
        Object obj = dVar.f26944d;
        if (this.f140949h != i13) {
            this.f140949h = i13;
            this.f140946e++;
            this.f140943b.obtainMessage(3, i13, 0).sendToTarget();
        }
        boolean c13 = c();
        Iterator it = this.f140945d.iterator();
        if (it.hasNext()) {
            ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(it.next());
            throw null;
        }
        if (c13) {
            a();
        }
    }

    public final boolean c() {
        boolean z13;
        if (!this.f140947f && this.f140949h != 0) {
            for (int i13 = 0; i13 < this.f140951j.size(); i13++) {
                if (((d) this.f140951j.get(i13)).f140909b == 0) {
                    z13 = true;
                    break;
                }
            }
        }
        z13 = false;
        boolean z14 = this.f140950i != z13;
        this.f140950i = z13;
        return z14;
    }
}
