package com.airbnb.lottie;

import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import javax.net.ssl.SSLException;
import t3.n1;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements x {
    @Override // com.airbnb.lottie.x
    public final void onResult(Object obj) {
        Throwable th3 = (Throwable) obj;
        c cVar = LottieAnimationView.f28360m;
        n1 n1Var = jc.g.f75394a;
        if (!(th3 instanceof SocketException) && !(th3 instanceof ClosedChannelException) && !(th3 instanceof InterruptedIOException) && !(th3 instanceof ProtocolException) && !(th3 instanceof SSLException) && !(th3 instanceof UnknownHostException) && !(th3 instanceof UnknownServiceException)) {
            throw new IllegalStateException("Unable to parse composition", th3);
        }
        jc.b.d("Unable to load composition.", th3);
    }
}
