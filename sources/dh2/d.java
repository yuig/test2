package dh2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.RejectedExecutionException;
import jg2.h;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.i1;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lh2.g;
import sw0.u;
import t3.t0;
import xk2.k;
import xk2.m;
import xk2.v;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final ki2.e f55021a;

    /* renamed from: b, reason: collision with root package name */
    public final lh2.b f55022b;

    /* renamed from: c, reason: collision with root package name */
    public final int f55023c;

    /* renamed from: d, reason: collision with root package name */
    public final v f55024d;

    /* renamed from: e, reason: collision with root package name */
    public final v f55025e;

    public d(k outputDir, ki2.e worker, lh2.b logger, int i13) {
        Intrinsics.checkNotNullParameter(outputDir, "outputDir");
        Intrinsics.checkNotNullParameter(worker, "worker");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f55021a = worker;
        this.f55022b = logger;
        this.f55023c = i13;
        this.f55024d = m.b(new s52.m(outputDir, 8));
        this.f55025e = m.b(new nd2.a(this, 23));
    }

    public final void a(yg2.d metadata, Function0 callback) {
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        Intrinsics.checkNotNullParameter(callback, "callback");
        h hVar = new h(this, metadata, callback, 3);
        try {
            this.f55021a.a(new p4.a(13, hVar), metadata);
        } catch (RejectedExecutionException unused) {
            hVar.invoke();
        }
    }

    public final BufferedInputStream b(yg2.d metadata) {
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        try {
            InputStream fileInputStream = new FileInputStream(new File((File) this.f55024d.getValue(), metadata.f139037g));
            return fileInputStream instanceof BufferedInputStream ? (BufferedInputStream) fileInputStream : new BufferedInputStream(fileInputStream, 8192);
        } catch (Throwable th3) {
            ((lh2.e) this.f55022b).b(g.PAYLOAD_STORAGE_FAIL, th3);
            return null;
        }
    }

    public final void c(yg2.d dVar) {
        try {
            if (new File((File) this.f55024d.getValue(), dVar.f139037g).delete()) {
                ((CopyOnWriteArraySet) this.f55025e.getValue()).remove(dVar);
            }
        } catch (Throwable th3) {
            if (th3 instanceof FileNotFoundException) {
                return;
            }
            ((lh2.e) this.f55022b).b(g.PAYLOAD_STORAGE_FAIL, th3);
        }
    }

    public final void d(yg2.d dVar, Function1 function1) {
        v vVar = this.f55025e;
        int size = ((CopyOnWriteArraySet) vVar.getValue()).size();
        int i13 = this.f55023c;
        if (size >= i13) {
            LinkedHashSet j13 = i1.j((CopyOnWriteArraySet) vVar.getValue(), dVar);
            int size2 = j13.size() - i13;
            if (size2 >= 0) {
                List y03 = CollectionsKt.y0(CollectionsKt.x0(j13, new t0(new u(20), 5)), size2);
                Iterator it = y03.iterator();
                while (it.hasNext()) {
                    c((yg2.d) it.next());
                }
                ((lh2.e) this.f55022b).b(g.PAYLOAD_STORAGE_FAIL, new RuntimeException("Pruned payload storage"));
                if (y03.contains(dVar)) {
                    return;
                }
            }
        }
        String str = dVar.f139037g;
        File tmpFile = File.createTempFile(str, ".tmp");
        Intrinsics.checkNotNullExpressionValue(tmpFile, "tmpFile");
        OutputStream fileOutputStream = new FileOutputStream(tmpFile);
        BufferedOutputStream bufferedOutputStream = fileOutputStream instanceof BufferedOutputStream ? (BufferedOutputStream) fileOutputStream : new BufferedOutputStream(fileOutputStream, 8192);
        try {
            function1.invoke(bufferedOutputStream);
            Unit unit = Unit.f80348a;
            dl2.b.J(bufferedOutputStream, null);
            File file = new File((File) this.f55024d.getValue(), str);
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            if (tmpFile.renameTo(file)) {
                ((CopyOnWriteArraySet) vVar.getValue()).add(dVar);
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                dl2.b.J(bufferedOutputStream, th3);
                throw th4;
            }
        }
    }
}
