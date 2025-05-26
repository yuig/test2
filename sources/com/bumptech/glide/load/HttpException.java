package com.bumptech.glide.load;

import java.io.IOException;

/* loaded from: classes3.dex */
public final class HttpException extends IOException {
    public HttpException(String str, int i13) {
        this(i13, str, null);
    }

    public HttpException(int i13, String str, IOException iOException) {
        super(str + ", status code: " + i13, iOException);
    }
}
