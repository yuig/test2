package pd;

import android.os.SystemClock;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public final class k0 implements h, g {

    /* renamed from: a, reason: collision with root package name */
    public final i f99702a;

    /* renamed from: b, reason: collision with root package name */
    public final g f99703b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f99704c;

    /* renamed from: d, reason: collision with root package name */
    public volatile e f99705d;

    /* renamed from: e, reason: collision with root package name */
    public volatile Object f99706e;

    /* renamed from: f, reason: collision with root package name */
    public volatile td.b0 f99707f;

    /* renamed from: g, reason: collision with root package name */
    public volatile f f99708g;

    public k0(i iVar, g gVar) {
        this.f99702a = iVar;
        this.f99703b = gVar;
    }

    @Override // pd.g
    public final void a(nd.h hVar, Exception exc, com.bumptech.glide.load.data.e eVar, nd.a aVar) {
        this.f99703b.a(hVar, exc, eVar, this.f99707f.f117374c.c());
    }

    @Override // pd.h
    public final boolean b() {
        if (this.f99706e != null) {
            Object obj = this.f99706e;
            this.f99706e = null;
            try {
                if (!e(obj)) {
                    return true;
                }
            } catch (IOException e13) {
                if (Log.isLoggable("SourceGenerator", 3)) {
                    Log.d("SourceGenerator", "Failed to properly rewind or write data to cache", e13);
                }
            }
        }
        if (this.f99705d != null && this.f99705d.b()) {
            return true;
        }
        this.f99705d = null;
        this.f99707f = null;
        boolean z13 = false;
        while (!z13 && this.f99704c < this.f99702a.b().size()) {
            ArrayList b13 = this.f99702a.b();
            int i13 = this.f99704c;
            this.f99704c = i13 + 1;
            this.f99707f = (td.b0) b13.get(i13);
            if (this.f99707f != null && (this.f99702a.f99687p.a(this.f99707f.f117374c.c()) || this.f99702a.c(this.f99707f.f117374c.a()) != null)) {
                td.b0 b0Var = this.f99707f;
                com.bumptech.glide.load.data.e eVar = this.f99707f.f117374c;
                com.bumptech.glide.h hVar = this.f99702a.f99686o;
                tb.e eVar2 = new tb.e();
                eVar2.f116964b = this;
                eVar2.f116963a = b0Var;
                eVar.e(hVar, eVar2);
                z13 = true;
            }
        }
        return z13;
    }

    @Override // pd.g
    public final void c(nd.h hVar, Object obj, com.bumptech.glide.load.data.e eVar, nd.a aVar, nd.h hVar2) {
        this.f99703b.c(hVar, obj, eVar, this.f99707f.f117374c.c(), hVar);
    }

    @Override // pd.h
    public final void cancel() {
        td.b0 b0Var = this.f99707f;
        if (b0Var != null) {
            b0Var.f117374c.cancel();
        }
    }

    @Override // pd.g
    public final void d() {
        throw new UnsupportedOperationException();
    }

    public final boolean e(Object obj) {
        int i13 = he.i.f68949b;
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        boolean z13 = false;
        try {
            com.bumptech.glide.load.data.g f13 = this.f99702a.f99674c.a().f(obj);
            Object c13 = f13.c();
            nd.d f14 = this.f99702a.f(c13);
            l lVar = new l(f14, c13, this.f99702a.f99680i);
            nd.h hVar = this.f99707f.f117372a;
            i iVar = this.f99702a;
            f fVar = new f(hVar, iVar.f99685n);
            rd.c a13 = iVar.f99679h.a();
            a13.g(fVar, lVar);
            if (Log.isLoggable("SourceGenerator", 2)) {
                Log.v("SourceGenerator", "Finished encoding source to cache, key: " + fVar + ", data: " + obj + ", encoder: " + f14 + ", duration: " + he.i.a(elapsedRealtimeNanos));
            }
            if (a13.l(fVar) != null) {
                this.f99708g = fVar;
                this.f99705d = new e(Collections.singletonList(this.f99707f.f117372a), this.f99702a, this);
                this.f99707f.f117374c.b();
                return true;
            }
            if (Log.isLoggable("SourceGenerator", 3)) {
                Log.d("SourceGenerator", "Attempt to write: " + this.f99708g + ", data: " + obj + " to the disk cache failed, maybe the disk cache is disabled? Trying to decode the data directly...");
            }
            try {
                this.f99703b.c(this.f99707f.f117372a, f13.c(), this.f99707f.f117374c, this.f99707f.f117374c.c(), this.f99707f.f117372a);
                return false;
            } catch (Throwable th3) {
                th = th3;
                z13 = true;
                if (!z13) {
                    this.f99707f.f117374c.b();
                }
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }
}
