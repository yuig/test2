package com.amazonaws.mobileconnectors.s3.transferutility;

/* loaded from: classes3.dex */
public interface TransferListener {
    void a(TransferState transferState);

    void b(long j13, long j14);

    void c(Exception exc);
}
