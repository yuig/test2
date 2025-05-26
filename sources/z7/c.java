package z7;

import a7.a0;
import a7.b0;
import a7.c0;
import a7.d0;
import a7.e0;
import a7.i0;
import a7.l0;
import a7.w;
import a7.y;
import a7.z;
import android.net.Uri;
import android.util.SparseArray;
import androidx.media3.exoplayer.offline.DownloadRequest;
import d7.n0;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import pk.v2;

/* loaded from: classes3.dex */
public final class c implements m {

    /* renamed from: c, reason: collision with root package name */
    public static final SparseArray f140905c;

    /* renamed from: a, reason: collision with root package name */
    public final h7.d f140906a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f140907b;

    static {
        SparseArray sparseArray = new SparseArray();
        try {
            sparseArray.put(0, b(r7.b.class));
        } catch (ClassNotFoundException unused) {
        }
        try {
            sparseArray.put(2, b(u7.a.class));
        } catch (ClassNotFoundException unused2) {
        }
        try {
            sparseArray.put(1, b(f8.a.class));
        } catch (ClassNotFoundException unused3) {
        }
        f140905c = sparseArray;
    }

    public c(h7.d dVar, ExecutorService executorService) {
        this.f140906a = dVar;
        executorService.getClass();
        this.f140907b = executorService;
    }

    public static Constructor b(Class cls) {
        try {
            return cls.asSubclass(l.class).getConstructor(i0.class, h7.d.class, Executor.class);
        } catch (NoSuchMethodException e13) {
            throw new IllegalStateException("Downloader constructor missing", e13);
        }
    }

    public final l a(DownloadRequest downloadRequest) {
        b0 b0Var;
        w wVar;
        Constructor constructor;
        d0 d0Var;
        b0 b0Var2;
        w wVar2;
        d0 d0Var2;
        int O = n0.O(downloadRequest.f18830b, downloadRequest.f18831c);
        Executor executor = this.f140907b;
        h7.d dVar = this.f140906a;
        Uri uri = downloadRequest.f18830b;
        if (O != 0 && O != 1 && O != 2) {
            if (O != 4) {
                throw new IllegalArgumentException(a.a.d("Unsupported type: ", O));
            }
            w wVar3 = new w();
            z zVar = new z();
            List emptyList = Collections.emptyList();
            v2 v2Var = v2.f100502e;
            b0 b0Var3 = new b0();
            e0 e0Var = e0.f982d;
            bf.b.t(zVar.f1244b == null || zVar.f1243a != null);
            if (uri != null) {
                wVar2 = wVar3;
                d0Var2 = new d0(uri, null, zVar.f1243a != null ? new a0(zVar) : null, emptyList, downloadRequest.f18834f, v2Var, null, -9223372036854775807L);
                b0Var2 = b0Var3;
            } else {
                b0Var2 = b0Var3;
                wVar2 = wVar3;
                d0Var2 = null;
            }
            return new p(new i0("", new y(wVar2), d0Var2, new c0(b0Var2), l0.I, e0Var), dVar, executor);
        }
        Constructor constructor2 = (Constructor) f140905c.get(O);
        if (constructor2 == null) {
            throw new IllegalStateException(a.a.d("Module missing for content type ", O));
        }
        w wVar4 = new w();
        z zVar2 = new z();
        Collections.emptyList();
        v2 v2Var2 = v2.f100502e;
        b0 b0Var4 = new b0();
        e0 e0Var2 = e0.f982d;
        List list = downloadRequest.f18832d;
        List emptyList2 = (list == null || list.isEmpty()) ? Collections.emptyList() : Collections.unmodifiableList(new ArrayList(list));
        bf.b.t(zVar2.f1244b == null || zVar2.f1243a != null);
        if (uri != null) {
            wVar = wVar4;
            constructor = constructor2;
            d0Var = new d0(uri, null, zVar2.f1243a != null ? new a0(zVar2) : null, emptyList2, downloadRequest.f18834f, v2Var2, null, -9223372036854775807L);
            b0Var = b0Var4;
        } else {
            b0Var = b0Var4;
            wVar = wVar4;
            constructor = constructor2;
            d0Var = null;
        }
        try {
            return (l) constructor.newInstance(new i0("", new y(wVar), d0Var, new c0(b0Var), l0.I, e0Var2), dVar, executor);
        } catch (Exception e13) {
            throw new IllegalStateException(a.a.d("Failed to instantiate downloader for content type ", O), e13);
        }
    }
}
