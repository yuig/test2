package oa;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.io.Closeable;

/* loaded from: classes.dex */
public interface b extends Closeable {
    void B(String str);

    Cursor G0(h hVar);

    boolean R1();

    Cursor T0(h hVar, CancellationSignal cancellationSignal);

    boolean Z1();

    void c0();

    void e0();

    i i1(String str);

    boolean isOpen();

    void p0();

    void x();
}
