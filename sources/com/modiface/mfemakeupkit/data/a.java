package com.modiface.mfemakeupkit.data;

import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;

/* loaded from: classes7.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final Object f34421a = new Object();

    /* renamed from: b, reason: collision with root package name */
    WeakReference<b> f34422b = new WeakReference<>(null);

    /* renamed from: c, reason: collision with root package name */
    WeakReference<b> f34423c = new WeakReference<>(null);

    /* renamed from: d, reason: collision with root package name */
    final d f34424d = new d();

    /* renamed from: e, reason: collision with root package name */
    final d f34425e = new d();

    /* renamed from: f, reason: collision with root package name */
    volatile com.modiface.mfemakeupkit.data.c f34426f;

    /* renamed from: g, reason: collision with root package name */
    volatile com.modiface.mfemakeupkit.data.c f34427g;

    public interface b {
        void applyRender(com.modiface.mfemakeupkit.utils.d dVar);

        void displayRender();
    }

    public enum c {
        ENGINE_1,
        ENGINE_2
    }

    public a() {
        com.modiface.mfemakeupkit.data.c cVar = com.modiface.mfemakeupkit.data.c.READY_FOR_FRAME;
        this.f34426f = cVar;
        this.f34427g = cVar;
    }

    private void a(com.modiface.mfemakeupkit.utils.d dVar) {
        if (dVar == null) {
            return;
        }
        dVar.f34672a.getImage().close();
    }

    private void b() {
        b bVar = this.f34422b.get();
        b bVar2 = this.f34423c.get();
        boolean z13 = true;
        boolean z14 = bVar == null || (this.f34426f == com.modiface.mfemakeupkit.data.c.READY_FOR_FRAME && this.f34425e.f34438b != null);
        if (bVar2 != null && (this.f34427g != com.modiface.mfemakeupkit.data.c.READY_FOR_FRAME || this.f34425e.f34439c == null)) {
            z13 = false;
        }
        if (z14 && z13) {
            if (bVar != null) {
                this.f34426f = com.modiface.mfemakeupkit.data.c.RENDERING_FRAME;
                bVar.applyRender(this.f34425e.f34438b);
            } else {
                a(this.f34425e.f34438b);
                this.f34426f = com.modiface.mfemakeupkit.data.c.RENDER_DONE_SUCCESS;
            }
            if (bVar2 != null) {
                this.f34427g = com.modiface.mfemakeupkit.data.c.RENDERING_FRAME;
                bVar2.applyRender(this.f34425e.f34439c);
            } else {
                a(this.f34425e.f34439c);
                this.f34427g = com.modiface.mfemakeupkit.data.c.RENDER_DONE_SUCCESS;
            }
            this.f34425e.a();
        }
    }

    public void a(@NonNull com.modiface.mfemakeupkit.utils.d dVar, @NonNull c cVar, boolean z13) {
        synchronized (this.f34421a) {
            try {
                b bVar = this.f34422b.get();
                b bVar2 = this.f34423c.get();
                d dVar2 = this.f34424d;
                if (dVar2.f34437a != z13) {
                    a(dVar2.f34438b);
                    a(this.f34424d.f34439c);
                    this.f34424d.a();
                    this.f34424d.f34437a = z13;
                }
                int i13 = com.modiface.mfemakeupkit.data.b.f34431a[cVar.ordinal()];
                if (i13 == 1) {
                    a(this.f34424d.f34438b);
                    this.f34424d.f34438b = dVar;
                } else {
                    if (i13 != 2) {
                        throw new IllegalArgumentException("unknown engine position: " + cVar);
                    }
                    a(this.f34424d.f34439c);
                    this.f34424d.f34439c = dVar;
                }
                if ((bVar == null || this.f34424d.f34438b != null) && (bVar2 == null || this.f34424d.f34439c != null)) {
                    a(this.f34425e.f34438b);
                    d dVar3 = this.f34425e;
                    dVar3.f34438b = this.f34424d.f34438b;
                    a(dVar3.f34439c);
                    d dVar4 = this.f34425e;
                    d dVar5 = this.f34424d;
                    dVar4.f34439c = dVar5.f34439c;
                    dVar5.a();
                }
                b();
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public void a(boolean z13, @NonNull c cVar) {
        synchronized (this.f34421a) {
            try {
                int i13 = com.modiface.mfemakeupkit.data.b.f34431a[cVar.ordinal()];
                if (i13 != 1) {
                    if (i13 == 2 && this.f34427g == com.modiface.mfemakeupkit.data.c.RENDERING_FRAME) {
                        this.f34427g = z13 ? com.modiface.mfemakeupkit.data.c.RENDER_DONE_SUCCESS : com.modiface.mfemakeupkit.data.c.RENDER_DONE_FAILED;
                    }
                } else if (this.f34426f == com.modiface.mfemakeupkit.data.c.RENDERING_FRAME) {
                    this.f34426f = z13 ? com.modiface.mfemakeupkit.data.c.RENDER_DONE_SUCCESS : com.modiface.mfemakeupkit.data.c.RENDER_DONE_FAILED;
                }
                com.modiface.mfemakeupkit.data.c cVar2 = this.f34426f;
                com.modiface.mfemakeupkit.data.c cVar3 = com.modiface.mfemakeupkit.data.c.RENDER_DONE_SUCCESS;
                if (cVar2 == cVar3 && this.f34427g == cVar3) {
                    b bVar = this.f34422b.get();
                    b bVar2 = this.f34423c.get();
                    if (bVar != null) {
                        bVar.displayRender();
                    }
                    if (bVar2 != null) {
                        bVar2.displayRender();
                    }
                }
                com.modiface.mfemakeupkit.data.c cVar4 = this.f34426f;
                com.modiface.mfemakeupkit.data.c cVar5 = com.modiface.mfemakeupkit.data.c.RENDERING_FRAME;
                if (cVar4 != cVar5 && this.f34427g != cVar5) {
                    com.modiface.mfemakeupkit.data.c cVar6 = com.modiface.mfemakeupkit.data.c.READY_FOR_FRAME;
                    this.f34426f = cVar6;
                    this.f34427g = cVar6;
                }
                b();
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public void a() {
        synchronized (this.f34421a) {
            a(this.f34424d.f34438b);
            a(this.f34424d.f34439c);
            a(this.f34425e.f34438b);
            a(this.f34425e.f34439c);
            this.f34424d.a();
            this.f34425e.a();
            com.modiface.mfemakeupkit.data.c cVar = com.modiface.mfemakeupkit.data.c.READY_FOR_FRAME;
            this.f34426f = cVar;
            this.f34427g = cVar;
        }
    }

    @NonNull
    public c a(@NonNull b bVar) {
        synchronized (this.f34421a) {
            try {
                if (this.f34422b.get() == null) {
                    this.f34422b = new WeakReference<>(bVar);
                    return c.ENGINE_1;
                }
                if (this.f34423c.get() == null) {
                    this.f34423c = new WeakReference<>(bVar);
                    return c.ENGINE_2;
                }
                throw new IllegalStateException("Only register up to 2 engines!");
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
