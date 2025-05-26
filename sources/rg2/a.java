package rg2;

import java.io.BufferedOutputStream;
import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.zip.GZIPOutputStream;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a extends OutputStream {

    /* renamed from: a, reason: collision with root package name */
    public final OutputStream f108098a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f108099b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f108100c;

    /* renamed from: d, reason: collision with root package name */
    public FilterOutputStream f108101d;

    public a(OutputStream outputStream) {
        Intrinsics.checkNotNullParameter(outputStream, "outputStream");
        this.f108098a = outputStream;
        this.f108099b = new ArrayList();
    }

    public final void a() {
        FilterOutputStream bufferedOutputStream;
        if (this.f108100c) {
            return;
        }
        ArrayList arrayList = this.f108099b;
        boolean isEmpty = arrayList.isEmpty();
        OutputStream outputStream = this.f108098a;
        if (isEmpty || (arrayList.size() >= 2 && ((Number) arrayList.get(0)).byteValue() == 31 && ((Number) arrayList.get(1)).byteValue() == -117)) {
            bufferedOutputStream = outputStream instanceof BufferedOutputStream ? (BufferedOutputStream) outputStream : new BufferedOutputStream(outputStream, 8192);
        } else {
            bufferedOutputStream = new GZIPOutputStream(outputStream instanceof BufferedOutputStream ? (BufferedOutputStream) outputStream : new BufferedOutputStream(outputStream, 8192));
        }
        this.f108101d = bufferedOutputStream;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            byte byteValue = ((Number) it.next()).byteValue();
            FilterOutputStream filterOutputStream = this.f108101d;
            if (filterOutputStream == null) {
                Intrinsics.r("impl");
                throw null;
            }
            filterOutputStream.write(byteValue);
        }
        this.f108100c = true;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a();
        FilterOutputStream filterOutputStream = this.f108101d;
        if (filterOutputStream != null) {
            filterOutputStream.close();
        } else {
            Intrinsics.r("impl");
            throw null;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        a();
        FilterOutputStream filterOutputStream = this.f108101d;
        if (filterOutputStream != null) {
            filterOutputStream.flush();
        } else {
            Intrinsics.r("impl");
            throw null;
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i13) {
        ArrayList arrayList = this.f108099b;
        if (arrayList.size() < 2) {
            arrayList.add(Byte.valueOf((byte) i13));
            return;
        }
        a();
        FilterOutputStream filterOutputStream = this.f108101d;
        if (filterOutputStream != null) {
            filterOutputStream.write(i13);
        } else {
            Intrinsics.r("impl");
            throw null;
        }
    }
}
