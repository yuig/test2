package com.amazonaws.auth;

import com.amazonaws.Request;

/* loaded from: classes3.dex */
public class NoOpSigner implements Signer {
    @Override // com.amazonaws.auth.Signer
    public void sign(Request<?> request, AWSCredentials aWSCredentials) {
    }
}
