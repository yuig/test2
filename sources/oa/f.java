package oa;

import java.io.Closeable;

/* loaded from: classes.dex */
public interface f extends Closeable {
    b getWritableDatabase();

    void setWriteAheadLoggingEnabled(boolean z13);
}
