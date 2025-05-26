package org.chromium.net;

import java.io.FileDescriptor;
import java.net.Socket;

/* loaded from: classes4.dex */
public final class b extends Socket {
    public b(FileDescriptor fileDescriptor) {
        super(new a(fileDescriptor));
    }
}
